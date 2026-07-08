package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.common.experiment.IMImageCacheSizeSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0gIC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160020gIC extends C09AY implements Function0<IMImageCacheSizeSetting.IMImageCacheSizeConfig> {
    public C1160020gIC() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.common.experiment.IMImageCacheSizeSetting$IMImageCacheSizeConfig, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMImageCacheSizeSetting.IMImageCacheSizeConfig invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        IMImageCacheSizeSetting.IMImageCacheSizeConfig iMImageCacheSizeConfig = IMImageCacheSizeSetting.LIZIZ;
        ?? LJIIIIZZ = settingsManagerLIZLLL.LJIIIIZZ("im_image_cache_size_setting", IMImageCacheSizeSetting.IMImageCacheSizeConfig.class, iMImageCacheSizeConfig);
        if (LJIIIIZZ != 0) {
            return LJIIIIZZ;
        }
        IMImageCacheSizeSetting.LIZ.getClass();
        return iMImageCacheSizeConfig;
    }
}
