package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.service.ecom.ab.SearchClassReflectPreloadConfig;

/* JADX INFO: renamed from: X.0BYS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BYS {
    public static final SearchClassReflectPreloadConfig LIZ;
    public static final SearchClassReflectPreloadConfig LIZIZ;

    static {
        SearchClassReflectPreloadConfig searchClassReflectPreloadConfig;
        SearchClassReflectPreloadConfig searchClassReflectPreloadConfig2 = new SearchClassReflectPreloadConfig(0L, "");
        LIZ = searchClassReflectPreloadConfig2;
        try {
            searchClassReflectPreloadConfig = (SearchClassReflectPreloadConfig) C0C64.LJIILLIIL().LJJII(SearchClassReflectPreloadConfig.class, searchClassReflectPreloadConfig2, "search_reflect_class_preload_opt", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            searchClassReflectPreloadConfig = LIZ;
        }
        LIZIZ = searchClassReflectPreloadConfig;
    }
}
