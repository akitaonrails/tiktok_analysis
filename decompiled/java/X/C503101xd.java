package X;

import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.shoppingbag.ECAudienceShopBagIconWidget$onMessage$4", f = "ECAudienceShopBagIconWidget.kt", l = {1134}, m = "invokeSuspend")
public final class C503101xd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AtmosphereTagInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C503101xd(AtmosphereTagInfo atmosphereTagInfo, InterfaceC1364105Vn<? super C503101xd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = atmosphereTagInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C503101xd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        IEventCenter iEventCenter;
        C1C7U.LIZ("ECAudienceShopBagIconWidget@216e.onMessage$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2126408Us c2126408Us = C2126308Ur.LIZIZ;
            C503001xc c503001xc = new C503001xc(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c2126408Us, c503001xc);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ECAudienceShopBagIconWidget@216e.onMessage$4");
                return objLJFF;
            }
        }
        String str = (String) obj;
        if (str != null && (iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null)) != null) {
            iEventCenter.LIZ("ec_audience_hot_sale_event", str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECAudienceShopBagIconWidget@216e.onMessage$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
