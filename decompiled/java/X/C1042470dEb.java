package X;

import android.webkit.WebView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dEb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recording.js.RecordingJsHandler$injectRulesJs$1$1", f = "RecordingJsHandler.kt", l = {}, m = "invokeSuspend")
public final class C1042470dEb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ WebView LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C1035880d3y LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042470dEb(long j, WebView webView, C1035880d3y c1035880d3y, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = webView;
        this.LLILLL = j;
        this.LLILZ = c1035880d3y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LL;
        return new C1042470dEb(this.LLILLL, this.LLILLJJLI, this.LLILZ, str, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordingJsHandler@c4f4.injectRulesJs$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map<String, Object> mapLIZ = C1042450dEZ.LIZIZ.LIZ(this.LL);
        if (mapLIZ != null) {
            WebView webView = this.LLILLJJLI;
            long j = this.LLILLL;
            C1035880d3y c1035880d3y = this.LLILZ;
            Object obj2 = mapLIZ.get("fail_reason");
            if (obj2 == null) {
                obj2 = "";
            }
            String string = obj2.toString();
            C1042450dEZ.LIZ.getClass();
            C1042450dEZ.LIZ(mapLIZ, webView, false, j, c1035880d3y, string);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordingJsHandler@c4f4.injectRulesJs$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
