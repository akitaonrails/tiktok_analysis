package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.image.experiment.BigImgMemoryCacheConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335150kqf extends C09AY implements Function0<BigImgMemoryCacheConfig> {
    public C1335150kqf() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final BigImgMemoryCacheConfig invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            BigImgMemoryCacheConfig bigImgMemoryCacheConfig = C1335140kqe.LIZ;
            BigImgMemoryCacheConfig bigImgMemoryCacheConfig2 = (BigImgMemoryCacheConfig) c0c64LJIILLIIL.LJJII(BigImgMemoryCacheConfig.class, bigImgMemoryCacheConfig, "big_image_memory_cache", true);
            return bigImgMemoryCacheConfig2 != null ? bigImgMemoryCacheConfig2 : bigImgMemoryCacheConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C1335140kqe.LIZ;
        }
    }
}
