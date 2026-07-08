package X;

import com.ss.android.ugc.aweme.experiment.ImagePreloadConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SPS, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SPS extends C09AY implements Function0<ImagePreloadConfig> {
    public C0SPS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.experiment.ImagePreloadConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ImagePreloadConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ImagePreloadConfig imagePreloadConfig = C0SPR.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(ImagePreloadConfig.class, imagePreloadConfig, "photomode_image_preload_config", true);
        return LJJII != 0 ? LJJII : imagePreloadConfig;
    }
}
