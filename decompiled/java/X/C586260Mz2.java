package X;

import com.ss.android.ugc.aweme.ab.ResumeFeedConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586260Mz2 extends C09AY implements Function0<ResumeFeedConfig> {
    public C586260Mz2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ab.ResumeFeedConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ResumeFeedConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ResumeFeedConfig resumeFeedConfig = C586250Mz1.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(ResumeFeedConfig.class, resumeFeedConfig, "live_preview_resume_play_when_sync_stop", true);
        return LJJII != 0 ? LJJII : resumeFeedConfig;
    }
}
