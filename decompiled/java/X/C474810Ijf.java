package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ijf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474810Ijf extends SimpleEventListener {
    public final DataChannel LIZ;
    public int LIZIZ;
    public final int LIZJ = 50;

    public static String LJIIIIZZ(int i) {
        return i >= 0 ? i < 51 ? "0~50" : 51 <= i ? i < 101 ? "51~100" : 101 <= i ? i < 151 ? "101~150" : i < 201 ? "151~200" : ">200" : ">200" : ">200" : ">200";
    }

    public C474810Ijf(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onPreDispatchMessage(IMessage iMessage) throws JSONException {
        Object obj;
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        if (i < this.LIZJ) {
            return;
        }
        this.LIZIZ = 0;
        C474820Ijg c474820Ijg = (C474820Ijg) this.LIZ.gg0(C1112640f3m.class);
        if (c474820Ijg == null) {
            return;
        }
        int i2 = c474820Ijg.LIZ;
        int i3 = c474820Ijg.LIZIZ;
        int i4 = c474820Ijg.LIZJ;
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).addNpthTag("live_biz_queue_size_message", LJIIIIZZ(i2));
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).addNpthTag("live_biz_queue_size_gift", LJIIIIZZ(i4));
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).addNpthTag("live_biz_queue_size_publicscreen", LJIIIIZZ(i3));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Update LiveBizQueueSize as NPTH tag: live_message_queue_size: ");
        sbLIZ.append(i2);
        sbLIZ.append(", live_publicscreen_rv_size: ");
        sbLIZ.append(i3);
        sbLIZ.append(", live_gift_outer_queue_size: ");
        sbLIZ.append(i4);
        C20441214yg.LJIIIZ("MessageUpdateNpthTagEventListener", C2188811AlT.LIZIZ(sbLIZ));
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        boolean zLJFF = Intrinsics.LJFF(strValueOf, obj);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_anchor", zLJFF);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("queue_size_message", i2);
        jSONObject2.put("queue_size_gift", i4);
        jSONObject2.put("queue_size_publicscreen", i3);
        C1CC2.LJ("ttlive_livesdk_biz_queue_size", jSONObject, jSONObject2, new JSONObject());
        super.onPreDispatchMessage(iMessage);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.SimpleEventListener, com.ss.ugc.live.sdk.message.interfaces.EventListener
    public final void onEnqueueMessage(List<IMessage> list, List<IMessage> list2) {
        int size;
        DataChannel dataChannel = this.LIZ;
        C474820Ijg c474820Ijg = (C474820Ijg) dataChannel.gg0(C1112640f3m.class);
        if (c474820Ijg != null) {
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            c474820Ijg.LIZ = size;
        } else {
            c474820Ijg = null;
        }
        dataChannel.SX0(C1112640f3m.class, c474820Ijg);
    }
}
