package X;

import android.content.Context;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsEcom;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v8V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$prepareToShow$4", f = "ECDuringLiveBroadcasterWidget.kt", l = {313}, m = "invokeSuspend")
public final class C1730610v8V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C180M LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730610v8V(C180M c180m, InterfaceC1364105Vn<? super C1730610v8V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c180m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1730610v8V(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String idStr;
        InterfaceC1730620v8W interfaceC1730620v8WF3;
        C1C7U.LIZ("ECDuringLiveBroadcasterWidget@b309.prepareToShow$4");
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
            C180M c180m = this.LLILLJJLI;
            C1729300v6O c1729300v6O = c180m.LLJJ;
            if (c1729300v6O != null) {
                Context context = c180m.LLILZ;
                Room room = c180m.LLJJJJ;
                if (room == null || (idStr = room.getIdStr()) == null) {
                    idStr = CardStruct.IStatusCode.DEFAULT;
                }
                String strLJJI = this.LLILLJJLI.LJJI();
                this.LL = 1;
                Object objLJI = C23250099c.LJI(this, C2126308Ur.LIZ, new C1729100v64(c1729300v6O, strLJJI, System.currentTimeMillis(), idStr, context, null));
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.prepareToShow$4");
                    return objLJFF;
                }
            }
        }
        new Object() { // from class: X.0v8X
        }.getClass();
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC1730620v8WF3 = iLiveOuterService.f3()) != null) {
            interfaceC1730620v8WF3.LIZ(82, new InterfaceC969820bLQ() { // from class: X.001O
                @Override // X.InterfaceC969820bLQ
                public final void LIZ(String str) {
                }

                @Override // X.InterfaceC969820bLQ
                public final void LIZJ(String str) {
                }

                @Override // X.InterfaceC969820bLQ
                public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
                    CapsuleBizParamsEcom capsuleBizParamsEcom;
                    CapsuleBizParamsEcom.EventTracking eventTracking;
                    CapsuleBizParams capsuleBizParams = capsuleMessage.bizParams;
                    if (capsuleBizParams != null && (capsuleBizParamsEcom = capsuleBizParams.ecom) != null && (eventTracking = capsuleBizParamsEcom.eventTracking) != null) {
                        String str = eventTracking.ecomRecommId;
                        if (str != null) {
                            map.put("ec_recomm_id", str);
                        }
                        String str2 = eventTracking.ecomRecommTrigger;
                        if (str2 != null) {
                            map.put("ec_recomm_trigger", str2);
                        }
                    }
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.prepareToShow$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
