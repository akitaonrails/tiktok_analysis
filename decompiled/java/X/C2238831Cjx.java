package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Cjx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238831Cjx {
    public static final C2238881Ck2<?> LIZ(Class<?> cls) {
        C2238881Ck2<?> c2238881Ck2Remove;
        LinkedList linkedList;
        String str;
        C1576580r84<?> c1576580r84;
        LinkedList linkedList2;
        String str2;
        C1576580r84<?> c1576580r842;
        HashMap<String, C2238881Ck2<?>> map = C2238841Cjy.LIZ;
        synchronized (map) {
            try {
                c2238881Ck2Remove = map.remove(cls.getName());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c2238881Ck2Remove == null) {
            return null;
        }
        long jIncrementAndGet = C2238841Cjy.LIZIZ.incrementAndGet();
        if (c2238881Ck2Remove.LJ == EnumC725160ScU.SUCCESS) {
            C2238871Ck1 c2238871Ck1 = C2238871Ck1.LIZ;
            c2238871Ck1.getClass();
            if (C2206191BWf.LIZIZ != null && c2238881Ck2Remove.LJI != null) {
                try {
                    linkedList2 = (LinkedList) C2238871Ck1.LJ.getValue();
                    str2 = (String) c2238881Ck2Remove.LJIIIIZZ.getValue();
                    c1576580r842 = c2238881Ck2Remove.LJI;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
                if (c1576580r842 != null) {
                    C189200o6.m2constructorimpl(Boolean.valueOf(linkedList2.add(new C2238941Ck8(str2, c1576580r842, jIncrementAndGet))));
                    c2238871Ck1.LIZ();
                    return c2238881Ck2Remove;
                }
                "Require scene is not null but null.".toString();
                throw new IllegalArgumentException("Require scene is not null but null.");
            }
            return c2238881Ck2Remove;
        }
        C2238871Ck1 c2238871Ck12 = C2238871Ck1.LIZ;
        c2238871Ck12.getClass();
        if (C2206191BWf.LIZIZ != null && c2238881Ck2Remove.LJI != null) {
            try {
                linkedList = (LinkedList) C2238871Ck1.LJFF.getValue();
                str = (String) c2238881Ck2Remove.LJIIIIZZ.getValue();
                c1576580r84 = c2238881Ck2Remove.LJI;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C189200o6.m2constructorimpl(new C098200Yq(th3));
            }
            if (c1576580r84 != null) {
                C189200o6.m2constructorimpl(Boolean.valueOf(linkedList.add(new C2238941Ck8(str, c1576580r84, jIncrementAndGet))));
                c2238871Ck12.LIZ();
            } else {
                "Require scene is not null but null.".toString();
                throw new IllegalArgumentException("Require scene is not null but null.");
            }
        }
        LIZIZ(c2238881Ck2Remove);
        return null;
    }

    public static final void LIZIZ(C2238881Ck2<?> c2238881Ck2) {
        LinkedList<C1581210rFX> linkedList = C2238821Cjw.LIZJ;
        synchronized (linkedList) {
            try {
                Iterator<C1581210rFX> it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().LLILLJJLI, c2238881Ck2)) {
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C2238841Cjy.LIZ(c2238881Ck2);
    }

    public static final void LIZJ(C1576580r84<?> c1576580r84, List<? extends Class<?>> list) {
        LinkedList<C1581210rFX> linkedList = C2238821Cjw.LIZJ;
        synchronized (linkedList) {
            try {
                ArrayList arrayList = new ArrayList();
                for (C1581210rFX c1581210rFX : linkedList) {
                    C1581210rFX c1581210rFX2 = c1581210rFX;
                    if (Intrinsics.LJFF(c1581210rFX2.LL, c1576580r84) && (list == null || list.contains(c1581210rFX2.LLILLJJLI.LIZ))) {
                        arrayList.add(c1581210rFX);
                    }
                }
                linkedList.removeAll(C13LP.LLIIJI(arrayList));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C2238841Cjy.LIZIZ(c1576580r84, list);
    }
}
