package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365940EWi {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        return videoPublishEditModel.getEditorProModel().getFromEditorProEntranceInAlbum();
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (TextUtils.equals(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "new_edit") && TextUtils.equals(videoPublishEditModel.creativeModel.editorProAIGCInfoModel.editorTabAlbumAICreate.fromEditorTabAICreate, "ai_create")) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (!Intrinsics.LJFF(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "new_edit") && !Intrinsics.LJFF(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "captions") && !Intrinsics.LJFF(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "cutout") && !Intrinsics.LJFF(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "add_draft") && !Intrinsics.LJFF(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "ai_video")) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (Intrinsics.LJFF(videoPublishEditModel.getEditorProModel().getOpenEditToolType(), "ai_video") && C0EN1.LIZ()) {
            return false;
        }
        if ((!LIZJ(videoPublishEditModel) || LIZIZ(videoPublishEditModel)) && !LIZ(videoPublishEditModel) && !C1416310mxZ.LJJJJIZL(videoPublishEditModel)) {
            return false;
        }
        return true;
    }
}
