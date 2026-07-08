package X;

import android.webkit.WebView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Qp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.web.webcallback.AdWebViewBusinessHandler$handleOnPageStarted$1", f = "AdWebViewBusinessHandler.kt", l = {}, m = "invokeSuspend")
public final class C1351305Qp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1039720dAA LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ WebView LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1351305Qp(C1039720dAA c1039720dAA, int i, WebView webView, String str, String str2, InterfaceC1364105Vn<? super C1351305Qp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1039720dAA;
        this.LLILLJJLI = i;
        this.LLILLL = webView;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1351305Qp(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdWebViewBusinessHandler@8b50.handleOnPageStarted$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.LIZLLL(this.LLILZ, this.LLILZIL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdWebViewBusinessHandler@8b50.handleOnPageStarted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
