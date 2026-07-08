package X;

import java.util.HashSet;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0QPK, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QPK {
    public static final C0QPK LIZ = new C0QPK();
    public static final C0QF6 LIZIZ = C0QPJ.LJIJI(null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1635));

    public static Map LIZ() {
        return (Map) LIZJ.getValue();
    }

    public static void LIZIZ(C0QPK c0qpk, String str, String str2, long j, boolean z, int i) {
        boolean z2;
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c0qpk.getClass();
        if (C0QPQ.LIZIZ()) {
            C0QPL c0qpl = (C0QPL) LIZ().get(str);
            if (c0qpl == null) {
                c0qpl = new C0QPL(null, false, 63);
            }
            if (c0qpl.LJFF) {
                C0QPQ.LIZ.getClass();
                if (C0QPQ.LIZ().markInvalidMusicByOriginSound == 1) {
                    return;
                }
            }
            if (c0qpl.LJ) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateRecord curPlayCount is ");
            sbLIZ.append(c0qpl.LIZIZ.size());
            sbLIZ.append(", curPlayTime is ");
            sbLIZ.append(c0qpl.LIZJ);
            sbLIZ.append(", curHasShoot is ");
            sbLIZ.append(c0qpl.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
            HashSet hashSet = new HashSet();
            hashSet.addAll(c0qpl.LIZIZ);
            if (str2.length() > 0 && !hashSet.contains(str2)) {
                hashSet.add(str2);
            }
            int size = hashSet.size();
            long j2 = c0qpl.LIZJ + j;
            boolean z3 = c0qpl.LIZLLL;
            if (!z3 && z) {
                z3 = true;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateRecord newPlayCount is ");
            sbLIZ2.append(size);
            sbLIZ2.append(", newPlayTime is ");
            sbLIZ2.append(j2);
            sbLIZ2.append(", newHasShoot is ");
            sbLIZ2.append(z3);
            C2188811AlT.LIZIZ(sbLIZ2);
            C0QPQ.LIZ.getClass();
            if (C0QPQ.LIZ().markValidMusicByShoot == 1 && z3) {
                LIZIZ.LIZJ(str);
            } else if (C0QPQ.LIZ().markValidMusicByVideoTime == 1 && j2 >= ((long) C0QPQ.LIZ().musicDetailVideoPlayTimeLimit) * 1000) {
                LIZIZ.LIZJ(str);
            } else if (C0QPQ.LIZ().markValidMusicByVideoCount == 1 && size >= C0QPQ.LIZ().musicDetailVideoPlayCountLimit) {
                LIZIZ.LIZJ(str);
            } else {
                z2 = false;
                LIZ().put(str, new C0QPL(c0qpl.LIZ, hashSet, j2, z3, z2, c0qpl.LJFF));
            }
            z2 = true;
            LIZ().put(str, new C0QPL(c0qpl.LIZ, hashSet, j2, z3, z2, c0qpl.LJFF));
        }
    }
}
