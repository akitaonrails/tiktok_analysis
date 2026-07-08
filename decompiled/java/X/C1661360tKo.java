package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAVTransformModelService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.0tKo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661360tKo {
    public static final MusicModel LIZ(AVMusic aVMusic) {
        IAVTransformModelService iAVTransformModelServiceAVTransformModelService;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (iAVTransformModelServiceAVTransformModelService = iExternalService.aVTransformModelService()) != null) {
            return iAVTransformModelServiceAVTransformModelService.transformAVMusic(aVMusic);
        }
        return null;
    }
}
