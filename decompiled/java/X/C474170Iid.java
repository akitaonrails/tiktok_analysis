package X;

import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import java.util.Map;

/* JADX INFO: renamed from: X.0Iid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C474170Iid {
    public static final String LIZJ() {
        return ((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1() ? "program_live" : ((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).On1() ? "live_house" : "normal";
    }

    public static final void LIZ(Map map) {
        map.put("live_lineup_type", LIZJ());
    }

    public static final void LIZIZ(C474500IjA c474500IjA) {
        c474500IjA.LJJII(LIZJ(), "live_lineup_type");
    }
}
