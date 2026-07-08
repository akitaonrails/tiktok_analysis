package X;

import com.ss.android.ugc.aweme.ab.LiveEntranceAnimConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599670rjJ extends C09AY implements Function0<LiveEntranceAnimConfig> {
    public C1599670rjJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ab.LiveEntranceAnimConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ LiveEntranceAnimConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LiveEntranceAnimConfig liveEntranceAnimConfig = C1599660rjI.LIZIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(LiveEntranceAnimConfig.class, liveEntranceAnimConfig, "live_entrance_stop_anim_when_scroll", true);
        if (LJJII != 0) {
            return LJJII;
        }
        C1599660rjI.LIZ.getClass();
        return liveEntranceAnimConfig;
    }
}
