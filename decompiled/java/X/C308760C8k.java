package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.coldcache.exp.CommonCacheSelectUrlConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308760C8k extends C09AY implements Function0<CommonCacheSelectUrlConfig> {
    public C308760C8k() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final CommonCacheSelectUrlConfig invoke() {
        CommonCacheSelectUrlConfig commonCacheSelectUrlConfig;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            CommonCacheSelectUrlConfig commonCacheSelectUrlConfig2 = C2280811EPf.LIZIZ;
            CommonCacheSelectUrlConfig commonCacheSelectUrlConfig3 = (CommonCacheSelectUrlConfig) c0c64LJIILLIIL.LJJIIJ(true, "common_cache_select_url_setting", 31744, CommonCacheSelectUrlConfig.class, commonCacheSelectUrlConfig2, 2);
            CommonCacheSelectUrlConfig commonCacheSelectUrlConfig4 = commonCacheSelectUrlConfig2;
            if (commonCacheSelectUrlConfig3 != null) {
                commonCacheSelectUrlConfig4 = commonCacheSelectUrlConfig3;
            }
            C189200o6.m2constructorimpl(commonCacheSelectUrlConfig4);
            commonCacheSelectUrlConfig = commonCacheSelectUrlConfig4;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            commonCacheSelectUrlConfig = c098200Yq;
        }
        return C189200o6.m5exceptionOrNullimpl(commonCacheSelectUrlConfig) != null ? C2280811EPf.LIZIZ : commonCacheSelectUrlConfig;
    }
}
