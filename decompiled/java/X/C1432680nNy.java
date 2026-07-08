package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;

/* JADX INFO: renamed from: X.0nNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432680nNy {
    public static final C1432680nNy LIZ = new C1432680nNy();
    public static int LIZIZ = -1;

    public static final boolean LIZIZ(Object obj) {
        List<String> pipResourcePaths;
        List<EditVideoSegment> videoBgSegments;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("close_vframe_upload", 0) != 0 || !(obj instanceof VideoPublishEditModel)) {
            return false;
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            if (!videoPublishEditModel.hasImageStickers()) {
                return false;
            }
            return true;
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            return true;
        }
        if ((videoPublishEditModel.getEditorProModel().isAdvancedEditDraft() && (((pipResourcePaths = videoPublishEditModel.getEditorProModel().getPipResourcePaths()) != null && !pipResourcePaths.isEmpty()) || ((videoBgSegments = videoPublishEditModel.getEditorProModel().getVideoBgSegments()) != null && !videoBgSegments.isEmpty()))) || videoPublishEditModel.isMvThemeVideoType() || videoPublishEditModel.isCutSameVideoType() || C1444940nhk.LJII(videoPublishEditModel.getCanvasVideoData()) || videoPublishEditModel.isCurrentAutoCutMode() || videoPublishEditModel.creativeModel.inlineCaptionModel != null) {
            return true;
        }
        return videoPublishEditModel.shouldUploadExtractFrames();
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0292, code lost:
    
        if (X.C0MUK.LIZLLL(r1) != false) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC1432780nO8 LIZ(X.C1432620nNs r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1432680nNy.LIZ(X.0nNs, java.lang.Object):X.0nO8");
    }
}
