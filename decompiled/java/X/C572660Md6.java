package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;

/* JADX INFO: renamed from: X.0Md6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572660Md6 {
    public final String LIZ;
    public final boolean LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadRecoverModel(draftPrimaryKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needOperateStoryPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C572660Md6(BaseShortVideoContext baseShortVideoContext) {
        boolean z;
        VideoPublishEditModelKt videoPublishEditModelKt;
        String draftPrimaryKey = baseShortVideoContext.getDraftPrimaryKey();
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext) != null && videoPublishEditModelKt.getTtStoryUploadModel() != null) {
            z = true;
        } else {
            z = false;
        }
        this(draftPrimaryKey, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C572660Md6(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String draftPrimaryKey = videoPublishEditModel.getDraftPrimaryKey();
        if (videoPublishEditModel.getTtStoryUploadModel() != null) {
            z = true;
        } else {
            z = false;
        }
        this(draftPrimaryKey, z);
    }

    public C572660Md6(AwemeDraft awemeDraft) {
        this(awemeDraft.LIZJ(), awemeDraft.LJIILL());
    }

    public C572660Md6(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
