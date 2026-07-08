package X;

import com.bytedance.android.livesdk.model.message.DelayParam;
import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.oec_msg.AtomAction;
import webcast.data.oec_msg.CommerceInfo;
import webcast.data.oec_msg.DispersionParam;
import webcast.data.oec_msg.EcomLiveElementActions;
import webcast.data.oec_msg.OecLiveShoppingMessageV2;
import webcast.data.oec_msg.PopCardInfo;
import webcast.data.oec_msg.ReqItem;
import webcast.data.oec_msg.VoucherItem;

/* JADX INFO: renamed from: X.17uZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.framework.message.PinMessageHandler$popCard$1", f = "PinMessageHandler.kt", l = {83}, m = "invokeSuspend")
public final class C21180117uZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C21180017uY LLILLL;
    public final /* synthetic */ OecLiveShoppingMessageV2 LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21180117uZ(C013C c013c, C21180017uY c21180017uY, OecLiveShoppingMessageV2 oecLiveShoppingMessageV2, long j, InterfaceC1364105Vn<? super C21180117uZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = c21180017uY;
        this.LLILZ = oecLiveShoppingMessageV2;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21180117uZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        JSONObject jSONObjectLIZJ;
        PopCardInfo popCardInfo;
        List<AtomAction> list;
        AtomAction next;
        Long lLJFF;
        C1C7U.LIZ("PinMessageHandler@de97.popCard$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.element && !C294670Bgn.LIZ()) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(400L, this) == objLJFF) {
                    C1C7U.LIZIZ("PinMessageHandler@de97.popCard$1");
                    return objLJFF;
                }
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ECommerceMessage eCommerceMessage = this.LLILLL.LIZ;
        if (eCommerceMessage != null) {
            long j = this.LLILZIL;
            C110600bQ c110600bQ = C110600bQ.LIZ;
            Long lLJFF2 = C2286608xc.LJFF(j);
            Long lLJFF3 = C2286608xc.LJFF(jCurrentTimeMillis);
            c110600bQ.getClass();
            C110600bQ.LIZ(eCommerceMessage, lLJFF2, lLJFF3);
        }
        Map<Long, EcomLiveElementActions> map = this.LLILZ.actions;
        this.LLILLL.getClass();
        EcomLiveElementActions ecomLiveElementActions = map.get(C2286608xc.LJFF(1L));
        VoucherItem voucherItem = null;
        if (ecomLiveElementActions != null && (list = ecomLiveElementActions.atomActions) != null) {
            Iterator<AtomAction> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.type == 1001) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AtomAction atomAction = next;
            if (atomAction != null) {
                C21180017uY c21180017uY = this.LLILLL;
                ReqItem reqItem = atomAction.requestItem;
                if (reqItem != null) {
                    Room room = c21180017uY.LIZIZ.LIZ.LLJILLL;
                    if (room != null) {
                        lLJFF = C2286608xc.LJFF(room.getId());
                    } else {
                        lLJFF = null;
                    }
                    String strValueOf = String.valueOf(lLJFF);
                    DispersionParam dispersionParam = reqItem.dispersionParam;
                    if (dispersionParam != null) {
                        DispersionInfo dispersionInfo = new DispersionInfo();
                        switch (reqItem.scene) {
                            case 1001:
                                break;
                            case 1002:
                                i2 = 3;
                                break;
                            case 1003:
                                i2 = 6;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                        dispersionInfo.dispersionPath = i2;
                        DelayParam delayParam = new DelayParam();
                        delayParam.minDelayMs = dispersionParam.minDelayMs;
                        delayParam.maxDelayMs = dispersionParam.maxDelayMs;
                        dispersionInfo.delayParam = delayParam;
                        C598410NdX.LJI(strValueOf, Collections.singletonList(dispersionInfo));
                    }
                }
            }
        }
        C21193917wn c21193917wn = C21193917wn.LIZ;
        PopupCardVO popupCardVO = this.LLILLL.LIZIZ.LIZ.LJJIJIIJI().LL;
        c21193917wn.getClass();
        if (C21193917wn.LJFF(popupCardVO)) {
            C110600bQ c110600bQ2 = C110600bQ.LIZ;
            OecLiveShoppingMessageV2 oecLiveShoppingMessageV2 = this.LLILZ;
            Long lLJFF4 = C2286608xc.LJFF(this.LLILZIL);
            Integer numLJ = C2286608xc.LJ(1001);
            c110600bQ2.getClass();
            jSONObjectLIZJ = C110600bQ.LIZJ(oecLiveShoppingMessageV2, lLJFF4, numLJ, C110600bQ.LJ());
        } else {
            jSONObjectLIZJ = null;
        }
        CommerceInfo commerceInfo = this.LLILZ.commerceInfo;
        if (commerceInfo != null && (popCardInfo = commerceInfo.popCardInfo) != null) {
            C21180017uY c21180017uY2 = this.LLILLL;
            C21179117uP c21179117uP = c21180017uY2.LIZJ;
            AbstractC21196217xA abstractC21196217xA = c21180017uY2.LIZIZ;
            ECommerceMessage eCommerceMessage2 = c21180017uY2.LIZ;
            Map<Long, VoucherItem> map2 = commerceInfo.voucherInfo;
            if (map2 != null) {
                voucherItem = map2.get(C2286608xc.LJFF(popCardInfo.popCardId));
            }
            c21179117uP.LIZ(abstractC21196217xA, eCommerceMessage2, jSONObjectLIZJ, popCardInfo, voucherItem, c21180017uY2.LIZLLL, false, false, "message_request", c21180017uY2.LJ, c21180017uY2.LJI, c21180017uY2.LJIIIIZZ, c21180017uY2.LJIIIZ, c21180017uY2.LJIIJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PinMessageHandler@de97.popCard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
