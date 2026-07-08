package X;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dAD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recording.js.RecordingJsHandler$onPageStart$1$1", f = "RecordingJsHandler.kt", l = {}, m = "invokeSuspend")
public final class C1039750dAD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WebView LL;
    public final /* synthetic */ C1035880d3y LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1039750dAD(WebView webView, C1035880d3y c1035880d3y, String str, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC497601wk interfaceC497601wk) {
        super(2, interfaceC1364105Vn);
        this.LL = webView;
        this.LLILLJJLI = c1035880d3y;
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1039750dAD(this.LL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordingJsHandler@c4f4.onPageStart$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1042450dEZ c1042450dEZ = C1042450dEZ.LIZ;
        WebView webView = this.LL;
        C1035880d3y c1035880d3y = this.LLILLJJLI;
        InterfaceC497601wk interfaceC497601wk = this.LLILLL;
        String str = this.LLILZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fallback_");
        c1042450dEZ.getClass();
        sbLIZ.append(C1042260dEG.LIZ().jsInjectTimeFallback);
        C1042450dEZ.LIZJ(webView, c1035880d3y, interfaceC497601wk, str, C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordingJsHandler@c4f4.onPageStart$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
