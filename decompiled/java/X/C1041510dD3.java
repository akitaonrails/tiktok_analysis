package X;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dD3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041510dD3 implements InterfaceC1013890cUV {
    public final C01GW LL = C452501pT.LIZIZ(new C1037890d7D());
    public boolean LLILLJJLI;

    @Override // X.InterfaceC1037760d70
    public final void Fd1(SparkContext sparkContext) {
    }

    @Override // X.InterfaceC1037760d70
    public final void Ox0(JSONObject jSONObject, SparkContext sparkContext) {
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

    public final InterfaceC1013940cUa LIZ() {
        return (InterfaceC1013940cUa) this.LL.getValue();
    }

    @Override // X.InterfaceC1013890cUV
    public final void Lg0(SparkContext sparkContext) {
        LIZJ(sparkContext, new AwS417S0200000_16(this, sparkContext, 101));
    }

    @Override // X.InterfaceC1013890cUV
    public final void TT(SparkContext sparkContext) {
        LIZJ(sparkContext, new AwS417S0200000_16(this, sparkContext, 99));
    }

    @Override // X.InterfaceC1013890cUV
    public final void Wf1(SparkContext sparkContext) {
        LIZJ(sparkContext, new AwS417S0200000_16(this, sparkContext, 100));
    }

    @Override // X.InterfaceC1013890cUV
    public final void dH2(SparkContext sparkContext) {
        LIZJ(sparkContext, new AwS417S0200000_16(this, sparkContext, 98));
    }

    public static void LIZJ(SparkContext sparkContext, Function0 function0) {
        C1035880d3y c1035880d3y;
        if (sparkContext != null && (c1035880d3y = (C1035880d3y) sparkContext.LJFF(C1035880d3y.class)) != null && c1035880d3y.isPlayableUrl()) {
            function0.invoke();
        }
    }

    public final void LIZIZ(SparkContext sparkContext, boolean z) {
        C1013990cUf c1013990cUf;
        if (sparkContext == null || (c1013990cUf = (C1013990cUf) sparkContext.LJFF(C1013990cUf.class)) == null) {
            c1013990cUf = new C1013990cUf(0);
            if (sparkContext != null) {
                sparkContext.LJJ(C1013990cUf.class, c1013990cUf);
            }
        }
        c1013990cUf.LIZ = z;
        boolean z2 = !z;
        c1013990cUf.LIZIZ = z2;
        if (sparkContext != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z);
            sparkContext.LJJIIJZLJL(jSONObject, "viewableChange");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("endcard_mute", z2);
            sparkContext.LJJIIJZLJL(jSONObject2, "volumeChange");
        }
        LIZ().LJIIJ(z);
    }

    @Override // X.InterfaceC1037760d70
    public final void Ou(SparkContext sparkContext, Context context) {
        LIZJ(sparkContext, new AwS560S0100000_16(this, 900));
    }

    @Override // X.InterfaceC1037760d70
    public final void cT(C1035880d3y c1035880d3y, WebView webView, SparkContext sparkContext) {
        LIZJ(sparkContext, new AwS260S0300000_16(this, c1035880d3y, webView, sparkContext, 30));
    }

    @Override // X.InterfaceC1037760d70
    public final void hv(SparkContext sparkContext, int i, String str) {
        LIZJ(sparkContext, new C1041520dD4(this, sparkContext, i, str));
    }
}
