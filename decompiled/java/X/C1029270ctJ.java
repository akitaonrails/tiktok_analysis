package X;

import android.content.Context;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* JADX INFO: renamed from: X.0ctJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029270ctJ {
    public static final C1029270ctJ LIZ = new C1029270ctJ();

    public static int LIZ(boolean z, boolean z2) {
        if (z) {
            return z2 ? 0 : 1;
        }
        return 2;
    }

    public static void LJFF(InterfaceC1029340ctQ interfaceC1029340ctQ) {
        C15O7.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL).LIZLLL(new C1077460e92(interfaceC1029340ctQ, 3));
    }

    public static void LJI(InterfaceC1029340ctQ interfaceC1029340ctQ) {
        C15O7.LJIIIIZZ(((long) ((Number) AnonymousClass0757.LIZ.getValue()).intValue()) * 1000).LIZLLL(new C1077460e92(interfaceC1029340ctQ, 4));
    }

    public static void LIZLLL(final String str, final String str2, final boolean z) {
        final AwemeRawAd awemeRawAd = C1027910cr7.LIZ;
        if (awemeRawAd == null) {
            return;
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "open_url_app", awemeRawAd);
        c1022820ciuLIZLLL.LIZIZ(str2, "app_url");
        c1022820ciuLIZLLL.LIZIZ(str, "enter_from");
        c1022820ciuLIZLLL.LJII();
        LJFF(new InterfaceC1029340ctQ() { // from class: X.0ctK
            public final /* synthetic */ String LIZ = "draw_ad";

            @Override // X.InterfaceC1029340ctQ
            public final void LIZ(boolean z2) {
                if (z2) {
                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL(this.LIZ, "deeplink_success", awemeRawAd);
                    c1022820ciuLIZLLL2.LIZIZ(str2, "app_url");
                    c1022820ciuLIZLLL2.LIZIZ(str, "enter_from");
                    c1022820ciuLIZLLL2.LJII();
                    return;
                }
                C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL(this.LIZ, "deeplink_failed", awemeRawAd);
                c1022820ciuLIZLLL3.LIZIZ(str2, "app_url");
                c1022820ciuLIZLLL3.LIZIZ(Integer.valueOf(z ? 1 : 0), "fail_reason");
                c1022820ciuLIZLLL3.LIZIZ(str, "enter_from");
                c1022820ciuLIZLLL3.LJII();
            }
        });
    }

    public static void LJ(Context context, String str, AwemeRawAd awemeRawAd) {
        if (context != null && awemeRawAd != null) {
            C1001140c9w c1001140c9w = new C1001140c9w();
            c1001140c9w.LIZ = awemeRawAd;
            c1001140c9w.LIZJ = false;
            C994130byd.LIZ("landing_ad", str, c1001140c9w.LIZ(), awemeRawAd);
            C2184171Adz.LIZLLL("landing_ad", str, awemeRawAd).LJIIIIZZ();
        }
    }

    public static void LIZIZ(final InterfaceC1029330ctP interfaceC1029330ctP, final String str, final boolean z, final int i, Boolean bool, boolean z2) {
        if (interfaceC1029330ctP != null) {
            interfaceC1029330ctP.LJJJJIZL(str, z, bool);
        }
        if (!z2) {
            LJFF(new InterfaceC1029340ctQ() { // from class: X.0ctO
                @Override // X.InterfaceC1029340ctQ
                public final void LIZ(boolean z3) {
                    InterfaceC1029330ctP interfaceC1029330ctP2 = interfaceC1029330ctP;
                    if (interfaceC1029330ctP2 != null) {
                        interfaceC1029330ctP2.LJI(i, str, z3, z);
                    }
                }
            });
            final AwemeRawAd awemeRawAd = C1027910cr7.LIZ;
            if (awemeRawAd == null) {
                return;
            }
            LJI(new InterfaceC1029340ctQ() { // from class: X.0ctM
                @Override // X.InterfaceC1029340ctQ
                public final void LIZ(boolean z3) {
                    if (z3) {
                        C1029270ctJ c1029270ctJ = C1029270ctJ.LIZ;
                        C844470XAv.LIZ.getClass();
                        Context contextLIZ = C844470XAv.LIZ();
                        AwemeRawAd awemeRawAd2 = awemeRawAd;
                        c1029270ctJ.getClass();
                        C1029270ctJ.LJ(contextLIZ, "deeplink_opened", awemeRawAd2);
                    }
                }
            });
        }
    }
}
