package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.ext.EcDrawEntity;
import com.bytedance.android.livesdk.model.message.ext.EcDrawMessage;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Me, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onMessage$10", f = "ECDuringLiveBroadcasterWidget.kt", l = {}, m = "invokeSuspend")
public final class C320601Me extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMessage LL;
    public final /* synthetic */ C180M LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320601Me(C180M c180m, IMessage iMessage, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMessage;
        this.LLILLJJLI = c180m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320601Me(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$10");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EcDrawEntity ecDrawEntity = ((EcDrawMessage) this.LL).entity;
        if (ecDrawEntity != null) {
            IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("draw_type", ecDrawEntity.type);
            jSONObject.put("sub_type", ecDrawEntity.subType);
            jSONObject.put("activity_id", ecDrawEntity.activityId);
            ImageModel imageModel = ecDrawEntity.incentiveImage;
            if (imageModel != null) {
                jSONObject.put("incentive_image", C13LP.LJJJLL(imageModel.getUrls()));
                jSONObject.put("incentive_record_id", ecDrawEntity.incentiveRecordId);
            }
            iEventCenter.LIZ("live_ec_lucky_draw_result", C786410Ut5.J3(jSONObject));
        }
        C180M c180m = this.LLILLJJLI;
        C23250099c.LIZLLL(c180m.LLJJI, null, null, new C1730590v8T(c180m, this.LL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.onMessage$10");
        return unit;
    }
}
