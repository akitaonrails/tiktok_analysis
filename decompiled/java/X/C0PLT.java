package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: renamed from: X.0PLT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0PLT extends BaseResponse implements C0X12 {
    public String requestId;

    public Aweme getAweme() {
        return null;
    }

    public List<Comment> getCommentList() {
        return null;
    }

    public abstract int getFeedType();

    public List<User> getLikeList() {
        return null;
    }

    public boolean needUpdateComment() {
        return false;
    }

    public void setAweme(Aweme aweme) {
    }

    public void setCommentList(List<Comment> list) {
    }

    public abstract void setFeedType(int i);

    public String getAwemeAuthorId() {
        if (getAweme() != null) {
            return AwemeExtKt.getAuthorUid(getAweme());
        }
        return null;
    }

    @Override // X.C0X12
    public String getRequestId() {
        return this.requestId;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.requestId = str;
    }
}
