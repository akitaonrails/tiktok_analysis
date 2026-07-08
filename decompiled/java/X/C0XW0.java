package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ILoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XW0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.network.errorhandler.AccountPassportResultHandler$handleLoginSuccess$4", f = "AccountPassportResultHandler.kt", l = {}, m = "invokeSuspend")
public final class C0XW0 extends C09AX implements Function2<C0XVI, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XW0(Activity activity, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0XW0 c0xw0 = new C0XW0(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
        c0xw0.LL = obj;
        return c0xw0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ILoginService iLoginService;
        C1C7U.LIZ("AccountPassportResultHandler@2671.handleLoginSuccess$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0XVC.LIZIZ("CustomizedHook", null, (C0XVI) this.LL);
        if (!this.LLILLJJLI && (iLoginService = (ILoginService) PluggableExtentionKt.pluggableSpi$default(ILoginService.class, false, false, false, 14, null)) != null && iLoginService.needRedirectToMainAfterLogin()) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILLL, "aweme://main");
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", C1593730rZj.LIZIZ.LJFF());
            smartRouteBuildRoute.addFlags(67108864);
            smartRouteBuildRoute.addFlags(268435456);
            smartRouteBuildRoute.open();
        }
        if (C0XQ5.LJFF()) {
            C0XQ5.LJIIJJI(19, 1, "");
        }
        C1238280iKQ.LIZIZ(9);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AccountPassportResultHandler@2671.handleLoginSuccess$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0XVI c0xvi, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0xvi, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
