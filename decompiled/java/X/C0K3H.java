package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import webcast.api.pgc_sub.PGCPostDetailResponse;

/* JADX INFO: renamed from: X.0K3H, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K3H implements C0K3Y {
    public final C0K3S LIZ;

    public C0K3H(C0K3S c0k3s) {
        this.LIZ = c0k3s;
    }

    public final void LIZIZ(String str) {
        SpacePost spacePost;
        User user;
        String str2;
        C0K3S c0k3s = this.LIZ;
        if (c0k3s != null && (spacePost = c0k3s.LLILLL) != null) {
            boolean z = c0k3s.LLJJIII;
            PGCPostDetailResponse.ResponseData responseData = c0k3s.LLJJIJIIJIL;
            if (responseData != null && (user = responseData.anchorInfo) != null) {
                long id = user.getId();
                C511970K5z c511970K5z = new C511970K5z("livesdk_anchor_subscription_space_post_content_click");
                c511970K5z.LIZIZ(Long.valueOf(spacePost.postId), "post_id");
                if (spacePost.pollInfo != null) {
                    str2 = "vote";
                } else if (spacePost.subOnlyVideosBriefInfo != null) {
                    str2 = "video";
                } else {
                    str2 = "topic";
                }
                c511970K5z.LIZIZ(str2, "post_type");
                c511970K5z.LIZIZ(str, "click_type");
                c511970K5z.LIZIZ(Integer.valueOf(!z ? 1 : 0), "is_user");
                c511970K5z.LIZIZ(Long.valueOf(id), "anchor_id");
                c511970K5z.LIZIZ(this.LIZ.LLILLJJLI, "space_show_entrance");
                c511970K5z.LIZLLL();
            }
        }
    }

    @Override // X.C0K3Y
    public final void LIZ(SpacePost spacePost, String str) {
        LIZIZ("enter_homepage");
    }
}
