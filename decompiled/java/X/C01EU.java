package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.GuestSettingApi;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlowDistributeStateSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.01EU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01EU {
    public static volatile boolean LIZ;

    public static Object LIZ(InterfaceC1364105Vn interfaceC1364105Vn) {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("channel_id", C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ()));
        linkedHashMap.put("room_id", room.getIdStr());
        linkedHashMap.put("live_id", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId()));
        linkedHashMap.put("flow_distribute", String.valueOf(MultiGuestFlowDistributeStateSetting.INSTANCE.getValue()));
        linkedHashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        C480460Ism.LIZ().getClass();
        return ((GuestSettingApi) C480460Ism.LIZLLL(GuestSettingApi.class)).updateGuestSettingUseMap(linkedHashMap, interfaceC1364105Vn);
    }
}
