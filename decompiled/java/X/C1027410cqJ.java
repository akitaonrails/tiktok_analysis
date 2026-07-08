package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027410cqJ {
    public static final /* synthetic */ int LIZ = 0;

    public static final C1027380cqG LIZ(final Context context, final C1027480cqQ c1027480cqQ) {
        C1027490cqR c1027490cqR = new C1027490cqR();
        c1027490cqR.LIZ.LIZJ = c1027480cqQ;
        c1027490cqR.LIZIZ(context);
        C1027460cqO c1027460cqO = C1027460cqO.LIZIZ;
        c1027490cqR.LIZ(c1027460cqO.LJIILIIL(null));
        c1027490cqR.LIZ(new C1027270cq5());
        c1027490cqR.LIZ(c1027460cqO.LJIIJJI(null));
        c1027490cqR.LIZ(c1027460cqO.LJ(null));
        c1027490cqR.LIZ(c1027460cqO.LJIIIIZZ(null));
        c1027490cqR.LIZ(new C1027400cqI());
        c1027490cqR.LIZ(new C1027260cq4());
        c1027490cqR.LIZ(new C1027250cq3() { // from class: X.0cqN
            @Override // X.C1027250cq3, X.InterfaceC1027390cqH
            public final boolean LIZ() {
                String str = c1027480cqQ.LIZJ.LIZ;
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                String scheme = UriProtector.parse(str).getScheme();
                String lowerCase = scheme != null ? scheme.toLowerCase(Locale.getDefault()) : null;
                if (TextUtils.isEmpty(lowerCase) || !Intrinsics.LJFF("market", lowerCase)) {
                    return super.LIZ();
                }
                return false;
            }

            @Override // X.AbstractC1027370cqF
            public final void LJFF(boolean z, C1027480cqQ c1027480cqQ2) {
                if (z) {
                    C1027460cqO c1027460cqO2 = C1027460cqO.LIZIZ;
                    String strValueOf = String.valueOf(c1027480cqQ2.LIZ.LIZJ);
                    C1027780cqu c1027780cqu = c1027480cqQ2.LIZ;
                    c1027460cqO2.LJIIL(strValueOf, c1027780cqu.LIZLLL, String.valueOf(c1027780cqu.LJ), c1027480cqQ2.LIZJ.LIZ, context);
                    String str = c1027480cqQ2.LJ.LIZ;
                    String strValueOf2 = String.valueOf(c1027480cqQ2.LIZ.LIZJ);
                    C1027780cqu c1027780cqu2 = c1027480cqQ2.LIZ;
                    C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(str, "open_url_app", strValueOf2, c1027780cqu2.LIZLLL, String.valueOf(c1027780cqu2.LJ));
                    c1022820ciuLJ.LIZJ(c1027480cqQ2.LJ.LIZIZ, "refer");
                    c1022820ciuLJ.LIZIZ(c1027480cqQ2.LIZJ.LIZ, "app_url");
                    c1022820ciuLJ.LIZIZ(c1027480cqQ2.LJ.LIZIZ, "enter_from");
                    c1022820ciuLJ.LJIIIIZZ();
                    c1027460cqO2.pendingDeepLinkLog(new AwS382S0200000_16(context, c1027480cqQ2, 124));
                    c1027460cqO2.LJIILJJIL(new AwS595S0100000_16(c1027480cqQ2, 468));
                }
            }
        });
        return c1027490cqR.LIZ;
    }

    public static final C1027380cqG LIZJ(Context context, C1027480cqQ c1027480cqQ) {
        C1027490cqR c1027490cqR = new C1027490cqR();
        c1027490cqR.LIZ.LIZJ = c1027480cqQ;
        c1027490cqR.LIZIZ(context);
        c1027490cqR.LIZ(new C1027260cq4());
        c1027490cqR.LIZ(new C1027250cq3());
        c1027490cqR.LIZ(new C1027470cqP());
        c1027490cqR.LIZ(C1027460cqO.LIZIZ.LJIIIIZZ(null));
        return c1027490cqR.LIZ;
    }

    public static final C1027380cqG LIZLLL(final Context context, final C1027480cqQ c1027480cqQ) {
        C1027490cqR c1027490cqR = new C1027490cqR();
        c1027490cqR.LIZ.LIZJ = c1027480cqQ;
        c1027490cqR.LIZIZ(context);
        c1027490cqR.LIZ(new C1027260cq4());
        c1027490cqR.LIZ(new C1027250cq3() { // from class: X.0cq9
            @Override // X.C1027250cq3, X.InterfaceC1027390cqH
            public final boolean LIZ() {
                String str = c1027480cqQ.LIZJ.LIZ;
                if (TextUtils.isEmpty(str)) {
                    return false;
                }
                String scheme = UriProtector.parse(str).getScheme();
                String lowerCase = scheme != null ? scheme.toLowerCase(Locale.getDefault()) : null;
                if (!TextUtils.isEmpty(lowerCase) && Intrinsics.LJFF("market", lowerCase)) {
                    return false;
                }
                if (lowerCase != null && !C1022030chd.LJIJ(lowerCase) && !Intrinsics.LJFF(lowerCase, "aweme")) {
                    C1027480cqQ c1027480cqQ2 = c1027480cqQ;
                    AwemeRawAd awemeRawAd = c1027480cqQ2.LIZ.LIZ;
                    if (awemeRawAd != null) {
                        new C1024820cm8(awemeRawAd).LJJIJ(LSPassThroughRecordSizeConfig.DEFAULT, str, "draw_ad", c1027480cqQ2.LJ.LIZIZ, true);
                    }
                }
                return super.LIZ();
            }

            @Override // X.AbstractC1027370cqF
            public final void LJFF(boolean z, C1027480cqQ c1027480cqQ2) {
                C1027410cqJ.LJ(context, z, c1027480cqQ2);
            }
        });
        c1027490cqR.LIZ(new C1027470cqP());
        c1027490cqR.LIZ(C1027460cqO.LIZIZ.LJIIIIZZ(new AwS595S0100000_16(c1027480cqQ, 469)));
        return c1027490cqR.LIZ;
    }

    public static void LJFF(boolean z, C1027480cqQ c1027480cqQ) {
        if (z) {
            String str = c1027480cqQ.LJ.LIZ;
            String strValueOf = String.valueOf(c1027480cqQ.LIZ.LIZJ);
            C1027780cqu c1027780cqu = c1027480cqQ.LIZ;
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(str, "open_url_h5", strValueOf, c1027780cqu.LIZLLL, String.valueOf(c1027780cqu.LJ));
            c1022820ciuLJ.LIZJ(c1027480cqQ.LJ.LIZIZ, "refer");
            c1022820ciuLJ.LJIIIIZZ();
        }
    }

    public static final C1027380cqG LIZIZ(Context context, C1027480cqQ c1027480cqQ, final AwS595S0100000_16 awS595S0100000_16) {
        C1027490cqR c1027490cqR = new C1027490cqR();
        c1027490cqR.LIZ.LIZJ = c1027480cqQ;
        c1027490cqR.LIZIZ(context);
        C1027460cqO c1027460cqO = C1027460cqO.LIZIZ;
        c1027490cqR.LIZ(c1027460cqO.LJFF(null));
        c1027490cqR.LIZ(c1027460cqO.LJIILIIL(null));
        c1027490cqR.LIZ(new C1027270cq5());
        c1027490cqR.LIZ(c1027460cqO.LJIIJJI(awS595S0100000_16));
        c1027490cqR.LIZ(c1027460cqO.LJ(awS595S0100000_16));
        c1027490cqR.LIZ(c1027460cqO.LJIIIIZZ(awS595S0100000_16));
        c1027490cqR.LIZ(new C1027260cq4() { // from class: X.0cqS
            @Override // X.AbstractC1027370cqF
            public final void LJFF(boolean z, C1027480cqQ c1027480cqQ2) {
                Function1<Boolean, Unit> function1 = awS595S0100000_16;
                if (function1 != null) {
                    function1.invoke(Boolean.valueOf(z));
                }
            }
        });
        return c1027490cqR.LIZ;
    }

    public static void LJ(Context context, boolean z, C1027480cqQ c1027480cqQ) {
        if (z) {
            C1027460cqO c1027460cqO = C1027460cqO.LIZIZ;
            String strValueOf = String.valueOf(c1027480cqQ.LIZ.LIZJ);
            C1027780cqu c1027780cqu = c1027480cqQ.LIZ;
            c1027460cqO.LJIIL(strValueOf, c1027780cqu.LIZLLL, String.valueOf(c1027780cqu.LJ), c1027480cqQ.LIZJ.LIZ, context);
            String str = c1027480cqQ.LJ.LIZ;
            String strValueOf2 = String.valueOf(c1027480cqQ.LIZ.LIZJ);
            C1027780cqu c1027780cqu2 = c1027480cqQ.LIZ;
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ(str, "open_url_app", strValueOf2, c1027780cqu2.LIZLLL, String.valueOf(c1027780cqu2.LJ));
            c1022820ciuLJ.LIZJ(c1027480cqQ.LJ.LIZIZ, "refer");
            c1022820ciuLJ.LIZIZ(c1027480cqQ.LIZJ.LIZ, "app_url");
            c1022820ciuLJ.LIZIZ(c1027480cqQ.LJ.LIZIZ, "enter_from");
            c1022820ciuLJ.LJIIIIZZ();
            c1027460cqO.pendingDeepLinkLog(new AwS382S0200000_16(context, c1027480cqQ, 125));
            c1027460cqO.LJIILJJIL(new AwS595S0100000_16(c1027480cqQ, 470));
        }
    }
}
