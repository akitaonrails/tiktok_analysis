package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0EYG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EYG {
    public static final C0EYG LIZ = new C0EYG();

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (C1403850mdT.LIZ(videoPublishEditModel)) {
            if (C1403850mdT.LJIIJJI(videoPublishEditModel)) {
                if (videoPublishEditModel.getEditorProModel().isAdvancedEditDraft()) {
                    if (!videoPublishEditModel.getEditorProModel().getHasAudioInAdvanceEdit()) {
                    }
                    return true;
                }
                if (videoPublishEditModel.getVoiceVolume() > 0.0f) {
                    return true;
                }
            }
            if (videoPublishEditModel.hasRecord() || C366800EZq.LIZ(videoPublishEditModel, null)) {
                return true;
            }
        }
        return false;
    }
}
