package X;

import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import kotlin.jvm.internal.AFwS252S0000000_16;

/* JADX INFO: renamed from: X.0dEU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1042400dEU {
    public static void LIZIZ(String str, String str2, String str3, C1042410dEV c1042410dEV, C1042420dEW c1042420dEW) {
        String str4 = str;
        C1042900dFI c1042900dFI = C1042900dFI.LIZ;
        String str5 = c1042410dEV.LIZ;
        String str6 = c1042410dEV.LIZJ;
        String str7 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (str2 != null) {
            str7 = str2;
        }
        C2283708x9.LIZ(new RunnableC1042850dFD(new C1042860dFE(str5, str6, str4, str7, c1042410dEV.LIZIZ, c1042410dEV.LJII, c1042410dEV.LJ, String.valueOf(c1042410dEV.LJIIJ), c1042410dEV.LJI, str3), c1042420dEW));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0dEW] */
    public static void LIZ(final String str, String str2, final String str3, int i, long j, final C1042410dEV c1042410dEV) {
        String str4;
        String str5 = c1042410dEV.LIZIZ;
        String str6 = c1042410dEV.LIZLLL;
        if (str2 == null) {
            str4 = "";
        } else {
            str4 = str2;
        }
        new AdWebEventLogger(c1042410dEV.LJFF).logAd(C1E1Z.LIZ, c1042410dEV.LJFF.getAwemeRawAd(), new C1052820dVI(i, str4, j, str5));
        final String strLIZLLL = C1035990d49.LIZLLL(c1042410dEV.LJIIIIZZ, c1042410dEV.LJFF, AFwS252S0000000_16.get$arr$(358));
        ?? r7 = new InterfaceC1042870dFF() { // from class: X.0dEW
            @Override // X.InterfaceC1042870dFF
            public final void LIZ(String str7, boolean z, C1042940dFM c1042940dFM) {
                if (!c1042940dFM.LIZ) {
                    C1042400dEU.LIZIZ(str, str3, strLIZLLL, c1042410dEV, null);
                }
            }
        };
        long jMax = -1;
        if (c1042410dEV.LJFF.getPageStartTime() != 0) {
            jMax = Math.max(System.currentTimeMillis() - c1042410dEV.LJFF.getPageStartTime(), -1L);
        }
        LIZIZ(str, str3, strLIZLLL, c1042410dEV, r7);
        new AdWebEventLogger(c1042410dEV.LJFF).logAd(C2274571E1f.LIZ, c1042410dEV.LJFF.getAwemeRawAd(), new C1058300de8(str, str3, str2, c1042410dEV, str5, str6, jMax));
    }
}
