package X;

import com.bytedance.android.livesdk.model.message.DelayParam;
import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS7S1401000_32;
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

/* JADX INFO: renamed from: X.17ua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.message.UsPinMessageHandler$popCard$1", f = "UsPinMessageHandler.kt", l = {92}, m = "invokeSuspend")
public final class C21180217ua extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C21180317ub LLILLL;
    public final /* synthetic */ OecLiveShoppingMessageV2 LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ C1563990qnl LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21180217ua(C013C c013c, C21180317ub c21180317ub, OecLiveShoppingMessageV2 oecLiveShoppingMessageV2, long j, C1563990qnl c1563990qnl, InterfaceC1364105Vn<? super C21180217ua> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = c21180317ub;
        this.LLILZ = oecLiveShoppingMessageV2;
        this.LLILZIL = j;
        this.LLILZLL = c1563990qnl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21180217ua(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        final PopCardInfo popCardInfo;
        String strValueOf;
        Long lValueOf;
        DispersionInfo dispersionInfoLIZIZ;
        Long lValueOf2;
        List<AtomAction> list;
        int i;
        AtomAction next;
        Long lLJFF;
        C1C7U.LIZ("UsPinMessageHandler@b90c.popCard$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.element && !C294670Bgn.LIZ()) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(400L, this) == objLJFF) {
                    C1C7U.LIZIZ("UsPinMessageHandler@b90c.popCard$1");
                    return objLJFF;
                }
            }
        }
        C110400bO.LIZ.getClass();
        long jLJ = C110400bO.LJ();
        ECommerceMessage eCommerceMessage = this.LLILLL.LIZ;
        if (eCommerceMessage != null) {
            C110400bO.LIZ(eCommerceMessage, C2286608xc.LJFF(this.LLILZIL), C2286608xc.LJFF(jLJ));
        }
        Map<Long, EcomLiveElementActions> map = this.LLILZ.actions;
        this.LLILLL.getClass();
        EcomLiveElementActions ecomLiveElementActions = map.get(C2286608xc.LJFF(1L));
        if (ecomLiveElementActions != null && (list = ecomLiveElementActions.atomActions) != null) {
            Iterator<AtomAction> it2 = list.iterator();
            while (true) {
                i = 0;
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
                C21180317ub c21180317ub = this.LLILLL;
                ReqItem reqItem = atomAction.requestItem;
                if (reqItem != null) {
                    Room room = c21180317ub.LIZIZ.LIZ.LLJILLL;
                    if (room != null) {
                        lLJFF = C2286608xc.LJFF(room.getId());
                    } else {
                        lLJFF = null;
                    }
                    String strValueOf2 = String.valueOf(lLJFF);
                    DispersionParam dispersionParam = reqItem.dispersionParam;
                    if (dispersionParam != null) {
                        DispersionInfo dispersionInfo = new DispersionInfo();
                        switch (reqItem.scene) {
                            case 1001:
                                i = 1;
                                break;
                            case 1002:
                                i = 3;
                                break;
                            case 1003:
                                i = 6;
                                break;
                        }
                        dispersionInfo.dispersionPath = i;
                        DelayParam delayParam = new DelayParam();
                        delayParam.minDelayMs = dispersionParam.minDelayMs;
                        delayParam.maxDelayMs = dispersionParam.maxDelayMs;
                        dispersionInfo.delayParam = delayParam;
                        C598410NdX.LJI(strValueOf2, Collections.singletonList(dispersionInfo));
                    }
                }
            }
        }
        OecLiveShoppingMessageV2 oecLiveShoppingMessageV2 = this.LLILZ;
        CommerceInfo commerceInfo = oecLiveShoppingMessageV2.commerceInfo;
        if (commerceInfo != null && (popCardInfo = commerceInfo.popCardInfo) != null) {
            C21180317ub c21180317ub2 = this.LLILLL;
            long j = this.LLILZIL;
            final C1563990qnl c1563990qnl = this.LLILZLL;
            C21180517ud c21180517ud = c21180317ub2.LIZJ;
            final AbstractC21196817xG abstractC21196817xG = c21180317ub2.LIZIZ;
            final ECommerceMessage eCommerceMessage2 = c21180317ub2.LIZ;
            C110400bO c110400bO = C110400bO.LIZ;
            Long lLJFF2 = C2286608xc.LJFF(j);
            Integer numLJ = C2286608xc.LJ(1001);
            C319201Lq.LIZ.getClass();
            Long lLIZ = C319201Lq.LIZ();
            c110400bO.getClass();
            final JSONObject jSONObjectLIZJ = C110400bO.LIZJ(oecLiveShoppingMessageV2, lLJFF2, numLJ, lLIZ);
            int i3 = c21180317ub2.LIZLLL;
            final Map<String, String> map2 = c21180317ub2.LJ;
            final Function1<String, Unit> function1 = c21180317ub2.LJI;
            final InterfaceC1685430txd<PopProductResp, Boolean, Boolean, ECommerceMessage, Boolean, JSONObject, Unit> interfaceC1685430txd = c21180317ub2.LJIIIIZZ;
            final Function1<Boolean, Unit> function12 = c21180317ub2.LJIIIZ;
            final Function0<Boolean> function0 = c21180317ub2.LJIIJ;
            c21180517ud.getClass();
            if (eCommerceMessage2 != null) {
                C110400bO.LIZLLL(eCommerceMessage2);
            }
            final long jLJ2 = C110400bO.LJ();
            C21192417wY.LIZIZ(EnumC21192517wZ.POP_REQUEST_SEND, c1563990qnl, C2097608Jq.LJ());
            if (C0C01.LIZ()) {
                strValueOf = String.valueOf(popCardInfo.popCardId);
            } else {
                strValueOf = null;
            }
            AbstractC21194117wp abstractC21194117wp = abstractC21196817xG.LIZ;
            if (abstractC21194117wp.LLLFZ) {
                dispersionInfoLIZIZ = null;
            } else {
                Room room2 = abstractC21194117wp.LLJILLL;
                if (room2 != null) {
                    lValueOf = Long.valueOf(room2.getId());
                } else {
                    lValueOf = null;
                }
                dispersionInfoLIZIZ = C598410NdX.LIZIZ(1, String.valueOf(lValueOf));
            }
            Room room3 = abstractC21196817xG.LIZ.LLJILLL;
            if (room3 != null) {
                lValueOf2 = Long.valueOf(room3.getId());
            } else {
                lValueOf2 = null;
            }
            C598360NdS.LJFF(String.valueOf(lValueOf2), 1, false, dispersionInfoLIZIZ, new AwS7S1401000_32(abstractC21196817xG, popCardInfo, strValueOf, i3, eCommerceMessage2, c1563990qnl, 0), new InterfaceC594300NSq<BaseResponse<PopProductResp>>() { // from class: X.17uM
                public final /* synthetic */ String LLIZ = "message_request";
                public final /* synthetic */ boolean LLIZLLLIL = false;
                public final /* synthetic */ boolean LLJILLL = false;

                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<BaseResponse<PopProductResp>> c0x9s, Throwable th) {
                    Long lValueOf3;
                    boolean z;
                    Long lValueOf4;
                    long jCurrentTimeMillis = System.currentTimeMillis() - jLJ2;
                    String strLJJIJ = AbstractC21194117wp.LJJIJ();
                    Room room4 = abstractC21196817xG.LIZ.LLJILLL;
                    if (room4 != null) {
                        lValueOf3 = Long.valueOf(room4.getId());
                    } else {
                        lValueOf3 = null;
                    }
                    String strValueOf3 = String.valueOf(lValueOf3);
                    String message = th.getMessage();
                    if (eCommerceMessage2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C21198317xV.LIZLLL(strLJJIJ, strValueOf3, false, jCurrentTimeMillis, -7, message, z, abstractC21196817xG.LIZ.LJJIJIIJIL(), false, false, this.LLIZ, this.LLIZLLLIL, map2, Integer.valueOf(popCardInfo.popCardType));
                    Room room5 = abstractC21196817xG.LIZ.LLJILLL;
                    if (room5 != null) {
                        lValueOf4 = Long.valueOf(room5.getId());
                    } else {
                        lValueOf4 = null;
                    }
                    C21197617xO.LIZJ(String.valueOf(lValueOf4), th.getMessage(), false, false);
                    C21192417wY.LIZIZ(EnumC21192517wZ.POP_REQUEST_FAIL, c1563990qnl, C2097608Jq.LJ());
                }

                /* JADX WARN: Removed duplicated region for block: B:30:0x00fa  */
                @Override // X.InterfaceC594300NSq
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onResponse(X.C0X9S<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp>> r29, X.C0X52<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp>> r30) throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 550
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C21178817uM.onResponse(X.0X9S, X.0X52):void");
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UsPinMessageHandler@b90c.popCard$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
