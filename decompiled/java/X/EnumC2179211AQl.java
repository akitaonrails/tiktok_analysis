package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.1AQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC2179211AQl {
    AFD(LivePreCreateNextRoomPlayer.ENABLE),
    LOCAL_FILE(2000),
    PRELOAD_CACHE(LSPassThroughRecordSizeConfig.DEFAULT),
    VIDEO_MODEL(500),
    PLAY_URL(0),
    INIT(-1);

    public final int LL;

    public static EnumC2179211AQl valueOf(String str) {
        return (EnumC2179211AQl) C08FF.LIZ(EnumC2179211AQl.class, str);
    }

    EnumC2179211AQl(int i) {
        this.LL = i;
    }
}
