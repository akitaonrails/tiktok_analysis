package X;

import Y.ARunnableS107S0100000_7;
import com.bytedance.android.livesdkapi.business.IAdLiveHelperService;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS193S0000000_7;
import webcast.api.feed.PseudoAdData;

/* JADX INFO: renamed from: X.0IVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C467670IVp {
    public final EnterRoomConfig LIZ;
    public final BPEAHandler LIZIZ = new BPEAHandler(C783270Uo1.LIZ());
    public final ARunnableS107S0100000_7 LIZJ = new ARunnableS107S0100000_7(this, 189);
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(272));
    public boolean LJ;

    public C467670IVp(EnterRoomConfig enterRoomConfig) {
        this.LIZ = enterRoomConfig;
    }

    public final void LIZ(String str, PseudoAdData pseudoAdData) {
        String string;
        EnterRoomConfig.RoomsData roomsData;
        Long l = pseudoAdData.creativeId;
        if (l != null && (string = l.toString()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("refer", "live_roi2_pseudo_ads");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            EnterRoomConfig enterRoomConfig = this.LIZ;
            if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                linkedHashMap2.put("room_id", Long.valueOf(roomsData.roomId));
            }
            C0IXW c0ixw = C0IXW.LIZ;
            ((IAdLiveHelperService) C1161920gLG.LIZJ(IAdLiveHelperService.class)).oF1(str, string, pseudoAdData.logExtra, linkedHashMap, linkedHashMap2);
        }
    }
}
