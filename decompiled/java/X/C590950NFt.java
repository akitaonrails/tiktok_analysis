package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS149S0101000_9;

/* JADX INFO: renamed from: X.0NFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590950NFt {
    public static boolean LIZIZ;
    public static List<? extends Aweme> LJFF;
    public static boolean LJI;
    public static InterfaceC590970NFv LJIIL;
    public static final C590950NFt LIZ = new C590950NFt();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final List<Aweme> LJ = Collections.synchronizedList(new ArrayList());
    public static Integer LJII = 1;
    public static final LinkedList<Aweme> LJIIIIZZ = new LinkedList<>();
    public static final LinkedList<Aweme> LJIIIZ = new LinkedList<>();
    public static final Map<Integer, Function0<List<Aweme>>> LJIIJ = new LinkedHashMap();
    public static final List<InterfaceC590960NFu> LJIIJJI = new ArrayList();

    public static List LIZIZ() {
        AtomicBoolean atomicBoolean = LIZJ;
        if (atomicBoolean.get()) {
            return C13BV.INSTANCE;
        }
        atomicBoolean.set(true);
        C259800zU c259800zU = new C259800zU();
        C0VY3.LIZJ(new AwS149S0101000_9(c259800zU, 14));
        atomicBoolean.set(false);
        return (List) c259800zU.element;
    }

    public static boolean LIZLLL(Integer num) {
        int iIntValue;
        int iIntValue2;
        if (num != null && (num.intValue() == 4 || num.intValue() == 5)) {
            C19254610Um c19254610Um = C19254610Um.LIZIZ;
            if (c19254610Um.LIZLLL() && !c19254610Um.LIZJ().LIZ()) {
                return false;
            }
        }
        Integer num2 = LJII;
        if (num2 == null) {
            return true;
        }
        if (num == null) {
            return false;
        }
        int iIntValue3 = num2.intValue();
        C1602860roS.LIZ.getClass();
        Map<Integer, Integer> mapLJIIJ = C19254610Um.LIZIZ.LIZJ().LJIIJ();
        Integer num3 = mapLJIIJ.get(Integer.valueOf(num.intValue()));
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num4 = mapLJIIJ.get(Integer.valueOf(iIntValue3));
        if (num4 != null) {
            iIntValue2 = num4.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (iIntValue <= iIntValue2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ(java.util.List r11, int r12) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C590950NFt.LIZ(java.util.List, int):java.util.List");
    }

    public final void LIZJ(int i, Integer num, List list) {
        InterfaceC590970NFv interfaceC590970NFv;
        if (i != 1 && i != 3) {
            if (i != 4) {
                LJIIIIZZ.addAll(list);
                return;
            } else {
                LJIIIZ.addAll(list);
                return;
            }
        }
        if (list.size() < 2) {
            list.size();
        }
        if (num != null && num.intValue() == 6) {
            LJFF = list;
            if (LIZLLL.get() && !LJI && C19254610Um.LIZIZ.LIZJ().LIZ() && (interfaceC590970NFv = LJIIL) != null) {
                interfaceC590970NFv.Ob(list);
                return;
            }
            return;
        }
        C1832307Fp.LIZ.getClass();
        if (C104100aN.LIZ().LIZJ()) {
            if (LIZLLL(num)) {
                if (LIZLLL.get() && C19254610Um.LIZIZ.LIZJ().LIZ() && num != null && (num.intValue() == 6 || num.intValue() == 4 || num.intValue() == 5)) {
                    InterfaceC590970NFv interfaceC590970NFv2 = LJIIL;
                    if (interfaceC590970NFv2 != null) {
                        interfaceC590970NFv2.Ob(list);
                    }
                } else {
                    List<Aweme> list2 = LJ;
                    if (list2 != null) {
                        list2.clear();
                        list2.addAll(list);
                    }
                }
                LJII = num;
            }
        } else {
            List<Aweme> list3 = LJ;
            if (list3 != null) {
                list3.addAll(list);
            }
        }
        if (!C1832307Fp.LIZJ(false)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                arrayList.addAll(LJIIJJI);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC590960NFu) it2.next()).LIZ();
        }
    }
}
