package X;

import android.app.Activity;
import com.bytedance.router.SmartRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08W8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.manager.EcUgRedirectSEOSchemaManager$handleRedirectShopSchema$2$1", f = "EcUgRedirectSEOSchemaManager.kt", l = {}, m = "invokeSuspend")
public final class C08W8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08W8(Activity activity, String str, InterfaceC1364105Vn<? super C08W8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08W8(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcUgRedirectSEOSchemaManager@ea12.handleRedirectShopSchema$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2082708Dx c2082708Dx = C2082708Dx.LIZ;
        Activity activity = this.LL;
        c2082708Dx.getClass();
        SmartRouter.buildRoute(C2082708Dx.LIZIZ(activity), this.LLILLJJLI).open();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcUgRedirectSEOSchemaManager@ea12.handleRedirectShopSchema$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
