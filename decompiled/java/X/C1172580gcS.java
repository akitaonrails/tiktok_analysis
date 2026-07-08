package X;

/* JADX INFO: renamed from: X.0gcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172580gcS {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "private";
            }
            if (num.intValue() == 3) {
                return "public";
            }
            if (num.intValue() == 5) {
                return "share_with_friend";
            }
            return "";
        }
        return "";
    }

    public static void LIZIZ(String str, Throwable th) {
        C23112093u c23112093u;
        C1494690ozz c1494690ozz;
        String strValueOf;
        String str2 = null;
        if (th instanceof C0XIR) {
            c23112093u = (C23112093u) th;
        } else {
            c23112093u = null;
        }
        if (th instanceof C1494690ozz) {
            c1494690ozz = (C1494690ozz) th;
        } else {
            c1494690ozz = null;
        }
        if (c23112093u != null) {
            strValueOf = String.valueOf(c23112093u.getErrorCode());
            str2 = "api";
        } else {
            strValueOf = null;
        }
        if (c1494690ozz != null) {
            strValueOf = String.valueOf(c1494690ozz.getCronetInternalErrorCode());
            str2 = "net";
        }
        C1172590gcT c1172590gcT = new C1172590gcT();
        c1172590gcT.LIZLLL = str;
        c1172590gcT.LJIILLIIL = strValueOf;
        c1172590gcT.LJIIZILJ = str2;
        c1172590gcT.LJIILJJIL();
    }
}
