package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ril, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599330ril {
    public static final C1599330ril LIZ = new C1599330ril();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(543));
    public static final C823170WQx<String> LIZJ = new C823170WQx<>();
    public static final C823170WQx<String> LIZLLL = new C823170WQx<>();
    public static final boolean LJ;
    public static final boolean LJFF;

    static {
        C1599350rin.LIZ.getClass();
        LJ = C1599350rin.LIZ().exitFc.enable;
        LJFF = C1599350rin.LIZ().adjustPriorityFc.enable;
    }

    public static Keva LIZIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static long LIZ(String str) {
        if (!LJ) {
            return 0L;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return kevaLIZIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static long LIZJ(String str) {
        if (!LJFF) {
            return 0L;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("special_");
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(str);
        return kevaLIZIZ.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
    }

    public static boolean LIZLLL(String str) {
        if (!LJ || str == null) {
            return false;
        }
        long jLIZ = LIZ(str);
        C1599350rin.LIZ.getClass();
        if (jLIZ < C1599350rin.LIZ().exitFc.displayLimit) {
            return false;
        }
        return true;
    }

    public static void LJ(String str, String str2) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        String string = "";
        if (LJ) {
            String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Keva kevaLIZIZ = LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(curUserId2);
            sbLIZ.append('_');
            sbLIZ.append(str);
            string = kevaLIZIZ.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        }
        if (!Intrinsics.LJFF(string, str2)) {
            if (!a0.LJJJIL(string)) {
                Keva kevaLIZIZ2 = LIZIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(curUserId);
                sbLIZ2.append('_');
                sbLIZ2.append(string);
                kevaLIZIZ2.erase(C2188811AlT.LIZIZ(sbLIZ2));
                Keva kevaLIZIZ3 = LIZIZ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("special_");
                sbLIZ3.append(curUserId);
                sbLIZ3.append('_');
                sbLIZ3.append(string);
                kevaLIZIZ3.erase(C2188811AlT.LIZIZ(sbLIZ3));
            }
            Keva kevaLIZIZ4 = LIZIZ();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(curUserId);
            sbLIZ4.append('_');
            sbLIZ4.append(str);
            kevaLIZIZ4.storeString(C2188811AlT.LIZIZ(sbLIZ4), str2);
        }
    }
}
