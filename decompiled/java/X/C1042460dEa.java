package X;

import android.webkit.WebView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recording.js.RecordingJsHandler$injectRulesJs$1", f = "RecordingJsHandler.kt", l = {200, 206}, m = "invokeSuspend")
public final class C1042460dEa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1035880d3y LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ WebView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042460dEa(long j, WebView webView, C1035880d3y c1035880d3y, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1035880d3y;
        this.LLILZ = j;
        this.LLILZIL = webView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLJJLI;
        return new C1042460dEa(this.LLILZ, this.LLILZIL, this.LLILLL, str, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String webUrl;
        Object objLIZIZ = obj;
        C1C7U.LIZ("RecordingJsHandler@c4f4.injectRulesJs$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RecordingJsHandler@c4f4.injectRulesJs$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZIZ);
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            C1042450dEZ c1042450dEZ = C1042450dEZ.LIZ;
            String str = this.LLILLJJLI;
            AwemeRawAd awemeRawAd = this.LLILLL.getAwemeRawAd();
            if (awemeRawAd == null || (webUrl = awemeRawAd.getWebUrl()) == null) {
                webUrl = "";
            }
            this.LL = 1;
            objLIZIZ = c1042450dEZ.LIZIZ(str, webUrl, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("RecordingJsHandler@c4f4.injectRulesJs$1");
                return objLJFF;
            }
        }
        if (!((Boolean) objLIZIZ).booleanValue()) {
            C1042450dEZ c1042450dEZ2 = C1042450dEZ.LIZ;
            C1035880d3y c1035880d3y = this.LLILLL;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZ;
            c1042450dEZ2.getClass();
            C1042450dEZ.LJ(false, c1035880d3y, false, "network-error", "pack", jCurrentTimeMillis, null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("RecordingJsHandler@c4f4.injectRulesJs$1");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1042470dEb c1042470dEb = new C1042470dEb(this.LLILZ, this.LLILZIL, this.LLILLL, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1042470dEb) == objLJFF) {
            C1C7U.LIZIZ("RecordingJsHandler@c4f4.injectRulesJs$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("RecordingJsHandler@c4f4.injectRulesJs$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
