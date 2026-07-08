package X;

import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastSpeedTestPreRequestSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import webcast.api.creator.PreScheduleStream;

/* JADX INFO: renamed from: X.0CtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327950CtN {
    public static final Map<Long, C328040CtW> LJII = new LinkedHashMap();
    public AnonymousClass0957<C328040CtW> LIZ;
    public C328040CtW LIZIZ;
    public final C1DEV LIZJ = C2191201ApK.LIZ();
    public long LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;

    public static PreScheduleStream LIZIZ() {
        C20441214yg.LIZIZ("PreScheduleRequest", "getFileCacheData");
        return (PreScheduleStream) C2355009Kq.LJIILIIL(-1, PreScheduleStream.class, "live_pre_schedule_stream_response");
    }

    public static C328040CtW LIZJ() {
        C20441214yg.LIZIZ("PreScheduleRequest", "getMemoryCacheData");
        long curUserId = ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId();
        return (C328040CtW) ((LinkedHashMap) LJII).get(Long.valueOf(curUserId));
    }

    public final void LIZ() {
        if (this.LJ) {
            AnonymousClass0957<C328040CtW> anonymousClass0957 = this.LIZ;
            if (C500260Jjc.LJJJI(anonymousClass0957 != null ? Boolean.valueOf(anonymousClass0957.isCompleted()) : null)) {
                C20441214yg.LIZIZ("speed_test", "pre request complete");
                AnonymousClass0957<C328040CtW> anonymousClass09572 = this.LIZ;
                if ((anonymousClass09572 != null ? anonymousClass09572.LIZLLL() : null) == null) {
                    C20441214yg.LIZIZ("speed_test", "pre request fail");
                    this.LJI = true;
                    this.LJ = false;
                } else {
                    boolean z = ((double) (System.currentTimeMillis() - this.LIZLLL)) > (BroadcastSpeedTestPreRequestSetting.INSTANCE.availableDuration() * ((double) 60)) * ((double) LSPassThroughRecordSizeConfig.DEFAULT);
                    this.LJFF = z;
                    if (z) {
                        C20441214yg.LIZIZ("speed_test", "pre request expire");
                        this.LJ = false;
                    }
                }
            }
        }
    }
}
