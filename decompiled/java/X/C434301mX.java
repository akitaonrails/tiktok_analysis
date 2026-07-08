package X;

import android.app.Activity;
import com.bytedance.android.livesdk.model.message.ext.EcTaskRefreshCouponListEntity;
import com.bytedance.android.livesdk.model.message.ext.EcTaskRefreshCouponListMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01mX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onMessage$2", f = "ECDuringLiveBroadcasterWidget.kt", l = {}, m = "invokeSuspend")
public final class C434301mX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMessage LL;
    public final /* synthetic */ C180M LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C434301mX(C180M c180m, IMessage iMessage, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMessage;
        this.LLILLJJLI = c180m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C434301mX(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZ;
        C1C7U.LIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EcTaskRefreshCouponListEntity ecTaskRefreshCouponListEntity = ((EcTaskRefreshCouponListMessage) this.LL).entity;
        if (ecTaskRefreshCouponListEntity != null && (activityLIZ = C1388190mED.LIZ(this.LLILLJJLI.LLILZ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(ecTaskRefreshCouponListEntity.toastMsg);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
