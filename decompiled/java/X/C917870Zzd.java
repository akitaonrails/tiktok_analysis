package X;

import Y.ARunnableS115S0100000_15;
import Y.AfS137S0000000_15;
import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Zzd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917870Zzd {
    public static void LIZ(ARunnableS115S0100000_15 aRunnableS115S0100000_15) {
        String secUid;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return;
        }
        long id = room.getId();
        if (room.getOwner() != null) {
            secUid = room.getOwner().getSecUid();
        } else {
            secUid = "";
        }
        HashMap map = new HashMap();
        map.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        C480460Ism.LIZ().getClass();
        ((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).getAnchorLinkMicUserSetting(id, secUid, map).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(aRunnableS115S0100000_15, 172), new AfS137S0000000_15(2));
    }
}
