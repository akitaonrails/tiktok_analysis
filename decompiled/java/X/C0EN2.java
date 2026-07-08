package X;

import android.os.Build;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0EN2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EN2 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.getEditorProModel().getFromEditorProEntranceInAlbum()) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        if (videoPublishEditModel.creativeModel.nowsShootModel == null || ((Boolean) C301770BsF.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }
}
