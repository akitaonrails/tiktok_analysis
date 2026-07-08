package X;

import com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayerAbBufferConfigDataForLongVideo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07MD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07MD extends C09AY implements Function0<PlayerAbBufferConfigDataForLongVideo> {
    public C07MD() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayerAbBufferConfigDataForLongVideo, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PlayerAbBufferConfigDataForLongVideo invoke() {
        ?? LJJII = C0C64.LJIILLIIL().LJJII(PlayerAbBufferConfigDataForLongVideo.class, null, "player_buffer_config_data_for_long_video", true);
        return LJJII == 0 ? new PlayerAbBufferConfigDataForLongVideo() : LJJII;
    }
}
