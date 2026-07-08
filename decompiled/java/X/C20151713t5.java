package X;

import Y.ARunnableS130S0100000_30;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13t5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20151713t5 {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(231));

    public final HashMap<C20152313tB, Set<C20151613t4>> LIZIZ() {
        return (HashMap) this.LIZ.getValue();
    }

    public final C20152313tB LIZJ(String str) {
        for (C20152313tB c20152313tB : LIZIZ().keySet()) {
            if (Intrinsics.LJFF(str, c20152313tB.LJFF)) {
                return c20152313tB;
            }
        }
        return null;
    }

    public final C20152313tB LIZLLL(String str) {
        for (C20152313tB c20152313tB : LIZIZ().keySet()) {
            if (Intrinsics.LJFF(str, c20152313tB.LJI)) {
                return c20152313tB;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(C20152313tB c20152313tB, InterfaceC20153313tL interfaceC20153313tL, AbstractRunnableC20150813sw<?> abstractRunnableC20150813sw, String str, boolean z) {
        if (LIZIZ().containsKey(c20152313tB)) {
            Set<C20151613t4> set = LIZIZ().get(c20152313tB);
            Object obj = null;
            if (set != null) {
                Iterator<T> it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((C20151613t4) next).LIZ(interfaceC20153313tL.getClass(), str)) {
                        obj = next;
                        break;
                    }
                }
                C20151613t4 c20151613t4 = (C20151613t4) obj;
                if (c20151613t4 == null) {
                    if (set != null) {
                        C20151613t4 c20151613t42 = new C20151613t4(interfaceC20153313tL.getClass(), str);
                        c20151613t42.LIZ = abstractRunnableC20150813sw;
                        set.add(c20151613t42);
                    }
                } else {
                    new AwS574S0100000_30((AbstractRunnableC20150813sw) abstractRunnableC20150813sw, 322);
                    C20152913tH.LIZLLL.getClass();
                    C20153113tJ.LIZ();
                    c20151613t4.LIZ = abstractRunnableC20150813sw;
                }
            }
        } else {
            HashMap<C20152313tB, Set<C20151613t4>> mapLIZIZ = LIZIZ();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            new C20151613t4(interfaceC20153313tL.getClass(), str);
            mapLIZIZ.put(c20152313tB, linkedHashSet);
        }
        if (z) {
            abstractRunnableC20150813sw.run();
        } else {
            C20152413tC.LIZ.LIZLLL.invoke().execute(new ARunnableS130S0100000_30(abstractRunnableC20150813sw, 31));
        }
    }
}
