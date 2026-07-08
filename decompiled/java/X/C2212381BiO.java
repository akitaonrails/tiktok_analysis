package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.1BiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212381BiO {
    public static void LIZIZ(String str) {
        LIZ(0L, str);
    }

    public static void LIZLLL(String str) {
        LIZJ(0L, str, null);
    }

    public static void LJFF(String str) {
        LJ(0L, str);
    }

    public static void LJII(String str) {
        if (C2212231Bi9.LJII() != null) {
            StringBuilder sb = new StringBuilder();
            LJI(sb, 0L, str, null);
            C2212231Bi9.LJII().LIZLLL(sb.toString());
        }
    }

    public static void LIZ(long j, String str) {
        if (C2212231Bi9.LJII() != null) {
            StringBuilder sb = new StringBuilder();
            LJI(sb, j, str, null);
            C2212231Bi9.LJII().LIZ(sb.toString());
        }
    }

    public static void LJ(long j, String str) {
        if (C2212231Bi9.LJII() != null) {
            StringBuilder sb = new StringBuilder();
            LJI(sb, j, str, null);
            C2212231Bi9.LJII().LIZJ(sb.toString());
        }
    }

    public static void LIZJ(long j, String str, Throwable th) {
        if (C2212231Bi9.LJII() != null) {
            StringBuilder sb = new StringBuilder();
            LJI(sb, j, str, th);
            C2212231Bi9.LJII().LIZIZ(sb.toString());
        }
    }

    public static void LJI(StringBuilder sb, long j, String str, Throwable th) {
        sb.append("[BDASplash]");
        if (j > 0) {
            sb.append(", ");
            sb.append("SplashAdId");
            sb.append("= ");
            sb.append(j);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(", message: ");
            sb.append(str);
        }
        if (th != null) {
            sb.append(", tr: ");
            sb.append(th.getMessage());
        }
    }
}
