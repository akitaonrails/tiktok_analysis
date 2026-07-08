package X;

import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;

/* JADX INFO: renamed from: X.0MMM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MMM extends C0MML {

    @C040H
    public final CommentVideoModel LLILZIL;

    public final CommentVideoModel getCommentInfo() {
        return this.LLILZIL;
    }

    public C0MMM(CommentVideoModel commentVideoModel, VideoShareInfoStruct videoShareInfoStruct, MentionStruct mentionStruct, boolean z, boolean z2) {
        super(videoShareInfoStruct, mentionStruct, z, z2);
        this.LLILZIL = commentVideoModel;
    }
}
