package X;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.service.IFeedVideoShrinkService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS417S0200000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d78, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037840d78 extends C09AY implements Function0<C1028460cs0> {
    public C1037840d78() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cs0] */
    @Override // kotlin.jvm.functions.Function0
    public final C1028460cs0 invoke() {
        return new InterfaceC1028490cs3() { // from class: X.0cs0
            public boolean LL;
            public float LLILLJJLI;
            public final C01GW LLILLL = C452501pT.LIZIZ(new C1028470cs1());

            @Override // X.InterfaceC1037760d70
            public final void Fd1(SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1037760d70
            public final void Ou(SparkContext sparkContext, Context context) {
            }

            @Override // X.InterfaceC1037760d70
            public final void TQ1(Aweme aweme) {
            }

            @Override // X.InterfaceC1037760d70
            public final void Yi0(int i, List<? extends Aweme> list) {
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
            public final void r3(Aweme aweme) {
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
            public final void Ox0(JSONObject jSONObject, SparkContext sparkContext) {
                ((IFeedVideoShrinkService) this.LLILLL.getValue()).LLJLLL(jSONObject, sparkContext);
            }

            @Override // X.InterfaceC1028490cs3
            public final void lf2(InterfaceC1041500dD2 interfaceC1041500dD2, Function0<Unit> function0) {
                if (!(interfaceC1041500dD2 instanceof C1035880d3y) || this.LL) {
                    return;
                }
                String strValueOf = String.valueOf(((C1035880d3y) interfaceC1041500dD2).getRealCreativeId());
                C1022670cif.LIZ.getClass();
                C1022670cif.LIZ().LIZ(System.currentTimeMillis(), strValueOf, "page_show_1px");
                function0.invoke();
                this.LL = true;
                this.LLILLJJLI = 1.0f;
            }

            @Override // X.InterfaceC1037760d70
            public final void cT(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
                ((IFeedVideoShrinkService) this.LLILLL.getValue()).LLL();
            }

            @Override // X.InterfaceC1028490cs3
            public final void lS(String str, float f, AwS417S0200000_16 awS417S0200000_16) {
                float f2 = this.LLILLJJLI;
                if (f2 == 0.0f && f > f2 && !this.LL) {
                    C1022670cif.LIZ.getClass();
                    C1022670cif.LIZ().LIZ(System.currentTimeMillis(), str, "slide_1px");
                    awS417S0200000_16.invoke();
                    this.LL = true;
                } else if (f == 0.0f && f < f2) {
                    this.LL = false;
                }
                this.LLILLJJLI = f;
            }

            @Override // X.InterfaceC1037760d70
            public final void z82(String str, String str2, InterfaceC1041500dD2 interfaceC1041500dD2, SparkContext sparkContext) {
                this.LL = false;
                this.LLILLJJLI = 0.0f;
            }
        };
    }
}
