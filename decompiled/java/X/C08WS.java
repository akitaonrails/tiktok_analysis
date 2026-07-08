package X;

import android.app.Activity;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.IMallLandingPerfTracker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08WS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.manager.EcUgRedirectSEOSchemaManager$handleRedirectSEOSchema$1$1", f = "EcUgRedirectSEOSchemaManager.kt", l = {}, m = "invokeSuspend")
public final class C08WS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Activity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08WS(Activity activity, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08WS(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcUgRedirectSEOSchemaManager@ea12.handleRedirectSEOSchema$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMallLandingPerfTracker iMallLandingPerfTracker = (IMallLandingPerfTracker) PluggableExtentionKt.pluggableSpi$default(IMallLandingPerfTracker.class, false, false, false, 14, null);
        if (iMallLandingPerfTracker != null) {
            iMallLandingPerfTracker.LIZJ(this.LL);
        }
        C2082708Dx c2082708Dx = C2082708Dx.LIZ;
        Activity activity = this.LLILLJJLI;
        c2082708Dx.getClass();
        SmartRouter.buildRoute(C2082708Dx.LIZIZ(activity), this.LL).open();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcUgRedirectSEOSchemaManager@ea12.handleRedirectSEOSchema$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
