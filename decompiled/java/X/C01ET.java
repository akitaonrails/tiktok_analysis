package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.GuestSettingApi;
import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateGuestSettingResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.01ET, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01ET implements InterfaceC736910SvR<C01ES> {
    public final C01ER LL = new C01ES() { // from class: X.01ER
        @Override // X.C01ES
        public final Object getState(InterfaceC1364105Vn<? super C926820aE4<GetGuestSettingResponse.ResponseData>> interfaceC1364105Vn) {
            C480460Ism.LIZ().getClass();
            return ((GuestSettingApi) C480460Ism.LIZLLL(GuestSettingApi.class)).getState(interfaceC1364105Vn);
        }

        @Override // X.C01ES
        public final Object s0(int i, InterfaceC1364105Vn<? super C926820aE4<UpdateGuestSettingResponse.ResponseData>> interfaceC1364105Vn) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("channel_id", C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ()));
            linkedHashMap.put("room_id", room.getIdStr());
            linkedHashMap.put("live_id", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId()));
            linkedHashMap.put("flow_distribute", String.valueOf(i));
            linkedHashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            C480460Ism.LIZ().getClass();
            return ((GuestSettingApi) C480460Ism.LIZLLL(GuestSettingApi.class)).updateGuestSettingUseMap(linkedHashMap, interfaceC1364105Vn);
        }
    };

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LL;
    }
}
