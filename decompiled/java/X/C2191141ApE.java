package X;

import com.ss.android.ugc.aweme.preload.experiment.PhotoSpeedConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ApE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191141ApE extends C09AY implements Function0<PhotoSpeedConfig> {
    public C2191141ApE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.preload.experiment.PhotoSpeedConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PhotoSpeedConfig invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PhotoSpeedConfig photoSpeedConfig = C2191131ApD.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(PhotoSpeedConfig.class, photoSpeedConfig, "measure_download_image_speed_config", true);
        return LJJII != 0 ? LJJII : photoSpeedConfig;
    }
}
