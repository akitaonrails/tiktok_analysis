package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverBackData;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0nKK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430420nKK {
    public static final ChooseCoverBackData LIZ(Intent intent) {
        if (intent != null) {
            return (ChooseCoverBackData) intent.getParcelableExtra("KEY_COVER_CHOOSE_RESULT_NEW");
        }
        return null;
    }

    public static final VideoPublishEditModel LIZIZ(Intent intent) {
        VideoPublishEditModel videoPublishEditModel;
        Serializable serializableExtra = intent.getSerializableExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL");
        if (!(serializableExtra instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) serializableExtra) == null) {
            return null;
        }
        videoPublishEditModel.creativeModel = C0MUK.LIZIZ(intent);
        videoPublishEditModel.refreshOldFieldIfNeeded();
        return videoPublishEditModel;
    }

    public static final VideoPublishEditModel LIZJ(Intent intent) {
        VideoPublishEditModel videoPublishEditModel;
        if (intent == null) {
            return null;
        }
        Serializable serializableExtra = intent.getSerializableExtra("KEY_VIDEO_COVER_CHOOSE_RESULT");
        if (!(serializableExtra instanceof VideoPublishEditModel) || (videoPublishEditModel = (VideoPublishEditModel) serializableExtra) == null) {
            return null;
        }
        videoPublishEditModel.creativeModel = C0MUK.LIZIZ(intent);
        videoPublishEditModel.refreshOldFieldIfNeeded();
        return videoPublishEditModel;
    }
}
