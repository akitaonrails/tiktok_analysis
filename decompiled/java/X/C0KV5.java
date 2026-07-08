package X;

import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KV5, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KV5 extends C0KV6 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object obj;
        C474500IjA c474500IjALIZ;
        String str;
        String json;
        Boolean bool;
        C0KV7 c0kv7 = (C0KV7) xBaseParamModel;
        String eventName = c0kv7.getEventName();
        if (eventName == null) {
            C2382909Vj.LIZ(completionBlock, 0, "event name is null", null, 4);
            return;
        }
        Map<String, Object> config = c0kv7.getConfig();
        if (config != null) {
            obj = config.get("disable_livesdk");
        } else {
            obj = null;
        }
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null && bool.booleanValue()) {
            c474500IjALIZ = C0IJT.LIZJ(eventName);
        } else {
            c474500IjALIZ = C0IJT.LIZ(eventName);
        }
        Map<String, Object> params = c0kv7.getParams();
        if (params != null) {
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!(value instanceof Map) && !(value instanceof List)) {
                    json = value.toString();
                } else {
                    json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, value);
                }
                c474500IjALIZ.LJJII(json, key);
            }
        }
        if (Intrinsics.LJFF("livesdk_report_success", eventName) || Intrinsics.LJFF("report_success", eventName)) {
            ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
            c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
            c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
            c474500IjALIZ.LJJIIZI(C475750IlB.LIZ());
            C924810aAp c924810aApLJ = C924810aAp.LJ();
            if (c924810aApLJ != null && c924810aApLJ.LJJII > 0) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str, "is_guest_connection");
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            c474500IjALIZ.LJJIIZI((Map) dataChannelGlobal.gg0(C930590aK9.class));
            dataChannelGlobal.JQ2(C930590aK9.class, null);
        }
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJJ();
        c474500IjALIZ.LIZ();
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0KV8.class, null), "");
    }
}
