package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MXG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MXG {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(583));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(584));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(582));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(585));

    public static Keva LIZJ() {
        return (Keva) LIZLLL.getValue();
    }

    public static int LIZ(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        return ((Keva) LIZJ.getValue()).getInt(LJFF(str), 0);
    }

    public static String LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("msgUUID");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(int i, String str) {
        if (str != null && str.length() != 0) {
            ((Keva) LIZJ.getValue()).storeInt(LJFF(str), i);
        }
    }

    public static int LIZIZ(String str, String str2, int i) {
        boolean z;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return LIZJ().getInt(LJFF(str), -1);
        }
        if (str2 == null || str2.length() == 0) {
            return -1;
        }
        return LIZJ().getInt(LJFF(str2), -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(int r2, java.lang.String r3, java.lang.String r4) {
        /*
            if (r3 == 0) goto L3b
            int r0 = r3.length()
            if (r0 == 0) goto L29
            if (r4 == 0) goto L27
            int r0 = r4.length()
            if (r0 == 0) goto L27
            com.bytedance.keva.Keva r1 = LIZJ()
            java.lang.String r0 = LJFF(r3)
            r1.storeInt(r0, r2)
            com.bytedance.keva.Keva r1 = LIZJ()
            java.lang.String r0 = LJFF(r4)
            r1.storeInt(r0, r2)
            return
        L27:
            if (r3 == 0) goto L3b
        L29:
            int r0 = r3.length()
            if (r0 == 0) goto L3b
            com.bytedance.keva.Keva r1 = LIZJ()
            java.lang.String r0 = LJFF(r3)
            r1.storeInt(r0, r2)
            return
        L3b:
            if (r4 == 0) goto L4e
            int r0 = r4.length()
            if (r0 == 0) goto L4e
            com.bytedance.keva.Keva r1 = LIZJ()
            java.lang.String r0 = LJFF(r4)
            r1.storeInt(r0, r2)
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MXG.LJ(int, java.lang.String, java.lang.String):void");
    }
}
