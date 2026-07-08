package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Ya9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876590Ya9 {
    public static boolean LIZJ;
    public static final C876590Ya9 LIZ = new C876590Ya9();
    public static final ConcurrentHashMap<String, Pair<EnumC871430YGn, C0YUD>> LIZIZ = new ConcurrentHashMap<>();
    public static final C1DEV LIZLLL = C2191201ApK.LIZ();

    public static void LIZJ() {
        C876610YaB c876610YaB;
        if (LIZJ) {
            return;
        }
        C876470YZx.LIZ().LJIIIZ(new C0YG2() { // from class: X.0YaA
            @Override // X.C0YG2
            public final void I02(List<String> list) {
            }

            @Override // X.C0YG2
            public final void xf0(C876610YaB c876610YaB2) {
                C876590Ya9.LIZ.getClass();
                C876590Ya9.LIZLLL(c876610YaB2);
            }
        });
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
        if (abstractC883730YlfLJ != null && (c876610YaB = abstractC883730YlfLJ.LJI) != null) {
            LIZ.getClass();
            LIZLLL(c876610YaB);
        }
        LIZJ = true;
    }

    public static void LIZ(boolean z) {
        if (!z) {
            Iterator<T> it2 = LIZIZ.values().iterator();
            while (it2.hasNext()) {
                ((C0YUD) ((Pair) it2.next()).getSecond()).LIZJ();
            }
        }
        LIZIZ.clear();
    }

    public static C0YUD LIZIZ(EnumC871430YGn enumC871430YGn) {
        String curUserId;
        EnumC871430YGn first;
        if (enumC871430YGn == EnumC871430YGn.ALL_RISKY || (curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId()) == null) {
            return null;
        }
        Pair<EnumC871430YGn, C0YUD> pair = LIZIZ.get(curUserId);
        if (pair != null) {
            first = pair.getFirst();
        } else {
            first = null;
        }
        if (first != enumC871430YGn) {
            return null;
        }
        return pair.getSecond();
    }

    public static void LIZLLL(C876610YaB c876610YaB) {
        EnumC871430YGn enumC871430YGn;
        int size;
        String curUserId;
        EnumC871430YGn first;
        if (C1336205Ku.LIZ(false).getImPrivacySettings().LJIJJLI(true)) {
            enumC871430YGn = EnumC871430YGn.STRANGER_NOT_RISKY;
        } else {
            enumC871430YGn = EnumC871430YGn.ALL_STRANGER;
        }
        if (enumC871430YGn == EnumC871430YGn.STRANGER_NOT_RISKY) {
            size = c876610YaB.LIZJ();
        } else {
            C07WK c07wk = c876610YaB.LIZ.get(EnumC871430YGn.ALL_STRANGER);
            if (c07wk == null) {
                return;
            } else {
                size = c07wk.LIZJ.size();
            }
        }
        if (size > 0 && (curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId()) != null) {
            Pair<EnumC871430YGn, C0YUD> pair = LIZIZ.get(curUserId);
            if (pair != null) {
                first = pair.getFirst();
            } else {
                first = null;
            }
            if (first != enumC871430YGn) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0YT1(curUserId, enumC871430YGn, null), 3);
            }
        }
    }
}
