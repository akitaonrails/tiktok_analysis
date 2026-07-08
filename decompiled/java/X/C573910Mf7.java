package X;

import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Mf7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573910Mf7 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        AISelfModel aISelfModel = videoPublishEditModel.creativeModel.aiSelfModel;
        if (!aISelfModel.isUltraFastStyleGeneration && !aISelfModel.isUltraFastModelCreation) {
            return false;
        }
        return true;
    }
}
