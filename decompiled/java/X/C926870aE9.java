package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.recordv2.PlayRecordConfigSettingV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.recordv2.PlayRecordManagerV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aE9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926870aE9 {
    public static void LIZ(Room room, DataChannel dataChannel) {
        InterfaceC927070aET interfaceC927070aET;
        if (!PlayRecordConfigSettingV2.INSTANCE.enable()) {
            return;
        }
        C1AZW.LJIIJ(12, C01EI.LIZ(110, "PlayRecordManagerV2"), "PlayRecordManagerV2 create", null, null);
        C948450amx c948450amx = C948450amx.LIZIZ;
        c948450amx.LJFF(new PlayRecordManagerV2(room, dataChannel), "PLAY_RECORD_MANAGER_V2");
        Object objLJIIIZ = c948450amx.LJIIIZ("PLAY_RECORD_MANAGER_V2");
        if ((objLJIIIZ instanceof InterfaceC927070aET) && (interfaceC927070aET = (InterfaceC927070aET) objLJIIIZ) != null) {
            interfaceC927070aET.onCreate();
        }
    }
}
