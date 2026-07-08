package X;

import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onMessage$3", f = "ECDuringLiveBroadcasterWidget.kt", l = {568}, m = "invokeSuspend")
public final class C502301xV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AtmosphereTagInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C502301xV(AtmosphereTagInfo atmosphereTagInfo, InterfaceC1364105Vn<? super C502301xV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = atmosphereTagInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C502301xV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$3");
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
            C502201xU c502201xU = new C502201xU(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c2126408Us, c502201xU);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$3");
                return objLJFF;
            }
        }
        String str = (String) obj;
        if (str != null) {
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_author_hot_sale_event", str);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
