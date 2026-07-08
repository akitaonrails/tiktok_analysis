package X;

import com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07MA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07MA extends C09AY implements Function0<PlayeAbBufferConfigData> {
    public C07MA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.player.ab.abs.buffer.PlayeAbBufferConfigData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PlayeAbBufferConfigData invoke() {
        ?? LJJII = C0C64.LJIILLIIL().LJJII(PlayeAbBufferConfigData.class, null, "player_buffer_config_data", true);
        return LJJII == 0 ? new PlayeAbBufferConfigData() : LJJII;
    }
}
