package X;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d77, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037830d77 extends C09AY implements Function0<C1016540cYm> {
    public C1037830d77() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0cYm] */
    @Override // kotlin.jvm.functions.Function0
    public final C1016540cYm invoke() {
        return new InterfaceC1017210cZr() { // from class: X.0cYm
            public final Map<String, C1017520caM> LL = new LinkedHashMap();

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
            public final void Yi0(int i, List<? extends Aweme> list) {
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
            public final void z82(String str, String str2, InterfaceC1041500dD2 interfaceC1041500dD2, SparkContext sparkContext) {
            }

            @Override // X.InterfaceC1017210cZr
            public final void a01() {
                ((LinkedHashMap) this.LL).clear();
            }

            @Override // X.InterfaceC1017210cZr
            public final C1017520caM SW0(String str) {
                return (C1017520caM) ((LinkedHashMap) this.LL).get(str);
            }

            @Override // X.InterfaceC1037760d70
            public final void TQ1(Aweme aweme) {
                this.LL.remove(AwemeExtKt.getAwemeRawAdIdStr(aweme));
            }

            @Override // X.InterfaceC1017210cZr
            public final void aR1(String str, C1017520caM c1017520caM) {
                this.LL.put(str, c1017520caM);
            }

            @Override // X.InterfaceC1017210cZr
            public final void rL0(String str, C1017520caM c1017520caM) {
                this.LL.put(str, c1017520caM);
            }
        };
    }
}
