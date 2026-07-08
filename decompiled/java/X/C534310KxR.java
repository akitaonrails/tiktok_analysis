package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoMemoryState;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoPreviewMode;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;

/* JADX INFO: renamed from: X.0KxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534310KxR {
    public static final LivePhotoPreviewMode LIZ(LivePhotoModel livePhotoModel, LivePhotoInfo livePhotoInfo) {
        String livePhotoPreviewMode;
        LivePhotoPreviewMode livePhotoPreviewModeValueOf;
        LivePhotoMemoryState livePhotoMemoryState;
        LivePhotoPreviewMode livePhotoPreviewMode2;
        if (livePhotoModel != null && (livePhotoMemoryState = livePhotoModel.memoryState) != null && livePhotoMemoryState.memoryEnabled && !livePhotoMemoryState.switchedInEditor && !livePhotoMemoryState.switchedInAlbum) {
            if (livePhotoModel == null || (livePhotoPreviewMode2 = livePhotoModel.previewMode) == null) {
                return LivePhotoPreviewMode.LIVE_PHOTO;
            }
            return livePhotoPreviewMode2;
        }
        if (livePhotoInfo != null && (livePhotoPreviewMode = livePhotoInfo.getLivePhotoPreviewMode()) != null) {
            try {
                livePhotoPreviewModeValueOf = LivePhotoPreviewMode.valueOf(livePhotoPreviewMode);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                livePhotoPreviewModeValueOf = LivePhotoPreviewMode.LIVE_PHOTO;
            }
            if (livePhotoPreviewModeValueOf != null) {
                return livePhotoPreviewModeValueOf;
            }
        }
        return LivePhotoPreviewMode.LIVE_PHOTO;
    }
}
