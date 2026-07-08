package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import webcast.api.sub.PostDetailResponse;

/* JADX INFO: renamed from: X.0Jr5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504890Jr5 implements InterfaceC502750Jnd {
    public final C504880Jr4 LIZ;

    public C504890Jr5(C504880Jr4 c504880Jr4) {
        this.LIZ = c504880Jr4;
    }

    public final void LIZIZ(String str) {
        SpacePost spacePost;
        User user;
        String str2;
        C504880Jr4 c504880Jr4 = this.LIZ;
        if (c504880Jr4 != null && (spacePost = c504880Jr4.LLILLL) != null) {
            boolean z = c504880Jr4.LLJJIII;
            PostDetailResponse.ResponseData responseData = c504880Jr4.LLJJIJIIJIL;
            if (responseData != null && (user = responseData.anchorInfo) != null) {
                long id = user.getId();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_space_post_content_click");
                c474500IjALIZ.LJJII(Long.valueOf(spacePost.postId), "post_id");
                if (spacePost.pollInfo != null) {
                    str2 = "vote";
                } else if (spacePost.subOnlyVideosBriefInfo != null) {
                    str2 = "video";
                } else {
                    str2 = "topic";
                }
                c474500IjALIZ.LJJII(str2, "post_type");
                c474500IjALIZ.LJJII(str, "click_type");
                c474500IjALIZ.LJJII(Integer.valueOf(!z ? 1 : 0), "is_user");
                c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
                c474500IjALIZ.LJJII(this.LIZ.LL, "space_show_entrance");
                c474500IjALIZ.LIZ();
            }
        }
    }

    @Override // X.InterfaceC502750Jnd
    public final void LIZ(SpacePost spacePost, String str) {
        LIZIZ("enter_homepage");
    }
}
