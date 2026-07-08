package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Yel, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879450Yel {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        return ((Keva) C879460Yem.LIZ.getValue()).getBoolean(videoPublishEditModel.getCreationId(), true);
    }

    public static final void LIZJ(VideoPublishEditModel videoPublishEditModel) {
        ((Keva) C879460Yem.LIZJ.getValue()).storeBoolean(C1429680nJ8.LIZJ(videoPublishEditModel.creativeModel.musicBuzModel), false);
    }

    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        ((Keva) C879460Yem.LIZIZ.getValue()).storeBoolean(videoPublishEditModel.getCreationId(), z);
    }

    public static final void LIZLLL(VideoPublishEditModel videoPublishEditModel, boolean z) {
        ((Keva) C879460Yem.LIZ.getValue()).storeBoolean(videoPublishEditModel.getCreationId(), z);
    }
}
