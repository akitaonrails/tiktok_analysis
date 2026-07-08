package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0moE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService$openFeedbackPage$1$1", f = "ScreenShotFeedbackService.kt", l = {}, m = "invokeSuspend")
public final class C1410520moE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ScreenShotFeedbackService LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C0XI4 LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410520moE(ScreenShotFeedbackService screenShotFeedbackService, Context context, C0XI4 c0xi4, boolean z, InterfaceC1364105Vn<? super C1410520moE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = screenShotFeedbackService;
        this.LLILLJJLI = context;
        this.LLILLL = c0xi4;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410520moE(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScreenShotFeedbackService@5b9a.openFeedbackPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.safelyDismissDialogIfNeed();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILLJJLI, "aweme://webview");
        smartRouteBuildRoute.withParam(UriProtector.parse(u.LJJIFFI(this.LLILLL.LJFF(), "+", "%20", false)));
        smartRouteBuildRoute.withParam("hide_nav_bar", true);
        if (this.LLILZ) {
            smartRouteBuildRoute.withParam("use_spark", true);
        }
        smartRouteBuildRoute.open();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScreenShotFeedbackService@5b9a.openFeedbackPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
