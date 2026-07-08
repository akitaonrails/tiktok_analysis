package X;

import Y.AObjectS80S0201000_9;
import com.ss.android.ugc.aweme.commercialize.measurement.exposure.ExposureMeasurementConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dL0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046440dL0 extends C09AY implements Function0<C587260N1o> {
    public C1046440dL0() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0N1o] */
    @Override // kotlin.jvm.functions.Function0
    public final C587260N1o invoke() {
        return new InterfaceC581520MrO() { // from class: X.0N1o
            public final C603820NmG<C587310N1t, C587280N1q> LIZ = new C603820NmG<>(10);

            @Override // X.InterfaceC581520MrO
            public final void LIZ(Aweme aweme, String str, AObjectS80S0201000_9 aObjectS80S0201000_9) {
                String str2;
                C587310N1t c587310N1tLIZ;
                if (str == null) {
                    str2 = "undefined";
                } else {
                    str2 = str;
                }
                C01GW c01gw = C587330N1v.LIZIZ;
                if ((((ExposureMeasurementConfig) c01gw.getValue()).exposureAll || ((ExposureMeasurementConfig) c01gw.getValue()).exposureEventTypes.contains(str2)) && (c587310N1tLIZ = C587320N1u.LIZ(aweme)) != null) {
                    C603820NmG<C587310N1t, C587280N1q> c603820NmG = this.LIZ;
                    C587280N1q c587280N1qLIZJ = c603820NmG.LIZJ(c587310N1tLIZ);
                    if (c587280N1qLIZJ == null) {
                        c587280N1qLIZJ = new C587280N1q();
                        c603820NmG.LIZLLL(c587310N1tLIZ, c587280N1qLIZJ);
                    }
                    if (!(c587280N1qLIZJ.LIZ instanceof C587290N1r)) {
                        if (str == null) {
                            str = "undefined";
                        }
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        if (awemeRawAd != null) {
                            awemeRawAd.addReusableExtraParam("expose_from", "page_select");
                            awemeRawAd.addReusableExtraParam("expose_page", str);
                        }
                        aObjectS80S0201000_9.invoke(aweme);
                    }
                    c587280N1qLIZJ.LIZ = C587300N1s.LIZ;
                }
            }

            @Override // X.InterfaceC581520MrO
            public final void LIZJ(Aweme aweme, String str, C582140MsO c582140MsO) {
                C587290N1r c587290N1r = C587290N1r.LIZ;
                C587310N1t c587310N1tLIZ = C587320N1u.LIZ(aweme);
                if (c587310N1tLIZ != null) {
                    C603820NmG<C587310N1t, C587280N1q> c603820NmG = this.LIZ;
                    C587280N1q c587280N1qLIZJ = c603820NmG.LIZJ(c587310N1tLIZ);
                    if (c587280N1qLIZJ == null) {
                        c587280N1qLIZJ = new C587280N1q();
                        c603820NmG.LIZLLL(c587310N1tLIZ, c587280N1qLIZJ);
                    }
                    c587280N1qLIZJ.LIZ = c587290N1r;
                    if (str == null) {
                        str = "undefined";
                    }
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        awemeRawAd.addReusableExtraParam("expose_from", "page_scroll");
                        awemeRawAd.addReusableExtraParam("expose_page", str);
                    }
                    c582140MsO.invoke(aweme);
                }
            }

            @Override // X.InterfaceC581520MrO
            public final void LIZIZ(Aweme aweme, String str, InterfaceC587270N1p interfaceC587270N1p, Function1<? super Aweme, Unit> function1) {
                if (aweme == null) {
                    return;
                }
                String value = interfaceC587270N1p.getValue();
                if (str == null) {
                    str = "undefined";
                }
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    awemeRawAd.addReusableExtraParam("expose_from", value);
                    awemeRawAd.addReusableExtraParam("expose_page", str);
                }
                function1.invoke(aweme);
            }
        };
    }
}
