package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.config.SearchValidMusicHistoryConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QPP, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QPP extends C09AY implements Function0<SearchValidMusicHistoryConfig> {
    public C0QPP() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SearchValidMusicHistoryConfig invoke() {
        try {
            SearchValidMusicHistoryConfig searchValidMusicHistoryConfig = (SearchValidMusicHistoryConfig) C0C64.LJIILLIIL().LJJII(SearchValidMusicHistoryConfig.class, C0QPQ.LIZIZ, "search_valid_music_history_config", true);
            return searchValidMusicHistoryConfig == null ? new SearchValidMusicHistoryConfig() : searchValidMusicHistoryConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0QPQ.LIZ.getClass();
            return C0QPQ.LIZIZ;
        }
    }
}
