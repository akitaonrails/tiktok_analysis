package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.webkit.WebView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.ad.preload.prewarm.LandPageWarmExperiment;
import com.ss.android.ugc.aweme.ad.preload.prewarm.LandPageWarmV2Experiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cm6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024800cm6 extends C09AY implements Function0<C1024770cm3> {
    public C1024800cm6() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cm3] */
    @Override // kotlin.jvm.functions.Function0
    public final C1024770cm3 invoke() {
        return new InterfaceC1037760d70() { // from class: X.0cm3
            @Override // X.InterfaceC1037760d70
            public final void Fd1(SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void Ou(SparkContext sparkContext, Context context) {
            }

            @Override // X.InterfaceC1037760d70
            public final void Ox0(JSONObject jSONObject, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void cT(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void gz1(C0SCL c0scl, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void hv(SparkContext sparkContext, int i, String str) {
            }

            @Override // X.InterfaceC1037910d7F
            public final void initialize() {
            }

            @Override // X.InterfaceC1037760d70
            public final void mf1(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void tU(C1035880d3y c1035880d3y, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void vE0(String str, InterfaceC1041500dD2 interfaceC1041500dD2, boolean z, AwemeRawAd awemeRawAd, String str2, String str3, String str4) {
            }

            @Override // X.InterfaceC1037760d70
            public final void wK1(SparkContext sparkContext, String str) {
            }

            @Override // X.InterfaceC1037760d70
            public final void z82(String str, String str2, InterfaceC1041500dD2 interfaceC1041500dD2, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void TQ1(Aweme aweme) {
                C2487409ou.LIZJ(new ARunnableS116S0100000_16(aweme, 21));
            }

            @Override // X.InterfaceC1037760d70
            public final void r3(final Aweme aweme) {
                C2487409ou.LIZJ(new Runnable(this) { // from class: X.0cm4
                    public final void LIZ() {
                        C1037010d5n.LIZ.getClass();
                        if (C1037010d5n.LJFF()) {
                            BPEAHandler bPEAHandler = C1037010d5n.LJII;
                            RunnableC1016910cZN runnableC1016910cZN = C1037010d5n.LJIIIIZZ;
                            bPEAHandler.removeCallbacks(runnableC1016910cZN);
                            if (LandPageWarmExperiment.LIZ() > 0) {
                                bPEAHandler.removeCallbacks(C1037010d5n.LJIIIZ);
                            }
                            C1037010d5n.LJIIJ = true;
                            C1037010d5n.LJIIJJI = C1017070cZd.LJJIJLIJ(aweme) != null;
                            C786410Ut5.LJLIIL(((Number) LandPageWarmV2Experiment.LJ.getValue()).longValue(), bPEAHandler, runnableC1016910cZN);
                            if (LandPageWarmExperiment.LIZ() <= 0 || !C1037010d5n.LJIIJJI) {
                                return;
                            }
                            C786410Ut5.LJLIIL(LandPageWarmExperiment.LIZ(), bPEAHandler, C1037010d5n.LJIIIZ);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LandPagePreWarmHandler@d096.iadCommonModule$2$1$onViewHolderSelected$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LandPagePreWarmHandler@d096.iadCommonModule$2$1$onViewHolderSelected$1");
                    }
                });
            }

            @Override // X.InterfaceC1037760d70
            public final void Yi0(final int i, final List<? extends Aweme> list) {
                C2487409ou.LIZJ(new Runnable(this) { // from class: X.0cm5
                    public final void LIZ() {
                        C1037010d5n.LIZ.getClass();
                        if (!C1037010d5n.LJFF() || LandPageWarmV2Experiment.LIZ().minAwemeCountBeforeAd <= 0) {
                            return;
                        }
                        Aweme aweme = (Aweme) C13LP.LJJJLZIJ(i, list);
                        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
                            C1037010d5n.LJIILJJIL = false;
                            return;
                        }
                        int i2 = i;
                        int i3 = i2 + 1;
                        int iMin = Math.min(i2 + LandPageWarmV2Experiment.LIZ().minAwemeCountBeforeAd, list.size() - 1);
                        if (i3 <= iMin) {
                            while (true) {
                                Aweme aweme2 = (Aweme) C13LP.LJJJLZIJ(i3, list);
                                if (aweme2 != null) {
                                    if (!AwemeExtKt.isAdTraffic(aweme2)) {
                                        if (i3 == iMin) {
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    } else {
                                        C1037010d5n.LJIILJJIL = true;
                                        return;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        C1037010d5n.LJIILJJIL = false;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LandPagePreWarmHandler@d096.iadCommonModule$2$1$onAwemeListChange$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LandPagePreWarmHandler@d096.iadCommonModule$2$1$onAwemeListChange$1");
                    }
                });
            }
        };
    }
}
