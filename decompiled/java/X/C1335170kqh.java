package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.image.experiment.ImageMemoryCacheConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335170kqh extends C09AY implements Function0<ImageMemoryCacheConfig> {
    public C1335170kqh() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ImageMemoryCacheConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            ImageMemoryCacheConfig imageMemoryCacheConfig = C1335160kqg.LIZ;
            ImageMemoryCacheConfig imageMemoryCacheConfig2 = (ImageMemoryCacheConfig) c0c64LJIILLIIL.LJJII(ImageMemoryCacheConfig.class, imageMemoryCacheConfig, "image_max_memory_cache_config", true);
            return imageMemoryCacheConfig2 != null ? imageMemoryCacheConfig2 : imageMemoryCacheConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C1335160kqg.LIZ;
        }
    }
}
