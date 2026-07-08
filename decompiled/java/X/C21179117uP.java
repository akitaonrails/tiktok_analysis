package X;

import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.api.EcMessageApi;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS7S1401000_32;
import org.json.JSONObject;
import webcast.data.oec_msg.PopCardInfo;
import webcast.data.oec_msg.VoucherItem;

/* JADX INFO: renamed from: X.17uP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21179117uP {
    public final InterfaceC497601wk LIZ;

    public C21179117uP(C054G c054g) {
        this.LIZ = c054g;
    }

    public static void LIZIZ(final AbstractC21196217xA abstractC21196217xA, final ECommerceMessage eCommerceMessage, final JSONObject jSONObject, final PopCardInfo popCardInfo, VoucherItem voucherItem, int i, final boolean z, final boolean z2, final String str, final Map map, final Function1 function1, final InterfaceC1685430txd interfaceC1685430txd, final Function1 function12, final Function0 function0) {
        String strValueOf;
        Long lValueOf;
        DispersionInfo dispersionInfoLIZIZ;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        Long lValueOf2 = null;
        if (C0C01.LIZ()) {
            strValueOf = String.valueOf(popCardInfo.popCardId);
        } else {
            strValueOf = null;
        }
        AbstractC21194217wq abstractC21194217wq = abstractC21196217xA.LIZ;
        if (abstractC21194217wq.LLLII) {
            dispersionInfoLIZIZ = null;
        } else {
            Room room = abstractC21194217wq.LLJILLL;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            dispersionInfoLIZIZ = C598410NdX.LIZIZ(1, String.valueOf(lValueOf));
        }
        Room room2 = abstractC21196217xA.LIZ.LLJILLL;
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getId());
        }
        C598360NdS.LJFF(String.valueOf(lValueOf2), 1, false, dispersionInfoLIZIZ, new AwS7S1401000_32(abstractC21196217xA, popCardInfo, strValueOf, voucherItem, i, eCommerceMessage, 1), new InterfaceC594300NSq<BaseResponse<PopProductResp>>() { // from class: X.17uN
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<BaseResponse<PopProductResp>> c0x9s, Throwable th) {
                Long lValueOf3;
                boolean z3;
                Long lValueOf4;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String strLJJIJ = AbstractC21194217wq.LJJIJ();
                Room room3 = abstractC21196217xA.LIZ.LLJILLL;
                if (room3 != null) {
                    lValueOf3 = Long.valueOf(room3.getId());
                } else {
                    lValueOf3 = null;
                }
                String strValueOf2 = String.valueOf(lValueOf3);
                String message = th.getMessage();
                if (eCommerceMessage != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C21198417xW.LIZLLL(strLJJIJ, strValueOf2, false, jCurrentTimeMillis2, -7, message, z3, abstractC21196217xA.LIZ.LJJIJIL(), false, false, str, z2, map, Integer.valueOf(popCardInfo.popCardType));
                Room room4 = abstractC21196217xA.LIZ.LLJILLL;
                if (room4 != null) {
                    lValueOf4 = Long.valueOf(room4.getId());
                } else {
                    lValueOf4 = null;
                }
                C21197617xO.LIZJ(String.valueOf(lValueOf4), th.getMessage(), false, false);
            }

            /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
            @Override // X.InterfaceC594300NSq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onResponse(X.C0X9S<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp>> r29, X.C0X52<com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse<com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp>> r30) throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 394
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21178917uN.onResponse(X.0X9S, X.0X52):void");
            }
        });
    }

    public final void LIZ(AbstractC21196217xA abstractC21196217xA, ECommerceMessage eCommerceMessage, JSONObject jSONObject, PopCardInfo popCardInfo, VoucherItem voucherItem, int i, boolean z, boolean z2, String str, Map<String, String> map, Function1<? super String, Unit> function1, InterfaceC1685430txd<? super PopProductResp, ? super String, ? super Boolean, ? super Boolean, ? super ECommerceMessage, ? super Boolean, Unit> interfaceC1685430txd, Function1<? super Boolean, Unit> function12, Function0<Boolean> function0) {
        Long lValueOf;
        String string;
        if (eCommerceMessage != null) {
            C110600bQ.LIZ.getClass();
            C110600bQ.LIZLLL(eCommerceMessage);
        }
        if (popCardInfo.popCardType == 3 && voucherItem != null && voucherItem.taskId > 0 && !abstractC21196217xA.LIZ.LLLII) {
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            C0NSX c0nsx = EcMessageApi.LIZ;
            Room room = abstractC21196217xA.LIZ.LLJILLL;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            if (voucherItem == null || (string = Long.valueOf(voucherItem.taskId).toString()) == null) {
                string = "";
            }
            C0NSX.LIZIZ(c0nsx, strValueOf, currentUserID, string, 0L, new C21179017uO(this, abstractC21196217xA, eCommerceMessage, jSONObject, popCardInfo, voucherItem, i, z, z2, str, map, function1, interfaceC1685430txd, function12, function0), 8);
            return;
        }
        LIZIZ(abstractC21196217xA, eCommerceMessage, jSONObject, popCardInfo, voucherItem, i, z, z2, str, map, function1, interfaceC1685430txd, function12, function0);
    }
}
