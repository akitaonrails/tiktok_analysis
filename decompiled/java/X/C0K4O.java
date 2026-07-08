package X;

import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import webcast.api.pgc_sub.PGCCommentActionRequest;
import webcast.api.pgc_sub.PGCCommentActionResponse;
import webcast.api.pgc_sub.PGCCommentDeleteResponse;
import webcast.api.pgc_sub.PGCCommentPageResponse;
import webcast.api.pgc_sub.PGCCommentSendReq;
import webcast.api.pgc_sub.PGCCommentSendResp;
import webcast.api.pgc_sub.PGCPollUserListResponse;
import webcast.api.pgc_sub.PGCPollVoteResponse;
import webcast.api.pgc_sub.PGCPostActionRequest;
import webcast.api.pgc_sub.PGCPostActionResponse;
import webcast.api.pgc_sub.PGCPostCreateReq;
import webcast.api.pgc_sub.PGCPostCreateResp;
import webcast.api.pgc_sub.PGCPostDetailResponse;
import webcast.api.pgc_sub.PGCPostPageResponse;
import webcast.api.pgc_sub.PGCPostPinActionResponse;
import webcast.api.pgc_sub.PGCSettingsResponse;
import webcast.api.pgc_sub.PGCSpaceActivityListResponse;
import webcast.api.pgc_sub.PGCSpaceJoinResponse;
import webcast.api.pgc_sub.PGCSpaceMembersResponse;
import webcast.api.pgc_sub.PGCSpaceQuitResponse;
import webcast.api.pgc_sub.PGCTopicResponse;
import webcast.api.sub.HomePageResponse;
import webcast.api.sub.PostDeleteResponse;

/* JADX INFO: renamed from: X.0K4O, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public interface C0K4O {
    @InterfaceC1501240pAY("/tiktok/sub/space/post/action/")
    C11NZ<DataResponse<PGCPostActionResponse>> LIZ(@C040I PGCPostActionRequest pGCPostActionRequest);

    @InterfaceC1501240pAY("/tiktok/sub/space/comment/action/")
    C11NZ<DataResponse<PGCCommentActionResponse>> LIZIZ(@C040I PGCCommentActionRequest pGCCommentActionRequest);

    @InterfaceC1501240pAY("/tiktok/sub/space/comment/delete/")
    @InterfaceC1485505rh
    C11NZ<DataResponse<PGCCommentDeleteResponse>> deleteComment(@InterfaceC1501100pAK("post_id") long j, @InterfaceC1501100pAK("comment_id") long j2);

    @InterfaceC1501240pAY("/tiktok/sub/space/post/delete/")
    @InterfaceC1485505rh
    C11NZ<DataResponse<PostDeleteResponse.ResponseData>> deletePost(@InterfaceC1501100pAK("post_id") long j);

    @InterfaceC1501240pAY("/tiktok/sub/space/post/create/")
    C11NZ<DataResponse<PGCPostCreateResp.ResponseData>> e(@C040I PGCPostCreateReq pGCPostCreateReq);

    @InterfaceC1501200pAU("/tiktok/sub/space/comment/page/")
    C11NZ<DataResponse<PGCCommentPageResponse.ResponseData>> getCommentPages(@InterfaceC1501120pAM("post_id") long j, @InterfaceC1501120pAM("offset") long j2, @InterfaceC1501120pAM("sec_anchor_id") String str, @InterfaceC1501120pAM("comment_type") int i, @InterfaceC1501120pAM("comment_id") long j3);

    @InterfaceC1501200pAU("/tiktok/sub/space/poll/user_list/")
    C11NZ<DataResponse<PGCPollUserListResponse.ResponseData>> getPollUserList(@InterfaceC1501120pAM("post_id") long j, @InterfaceC1501120pAM("poll_id") long j2, @InterfaceC1501120pAM("option_id") long j3, @InterfaceC1501120pAM("offset") long j4);

    @InterfaceC1501200pAU("/tiktok/sub/space/post/detail/")
    C11NZ<DataResponse<PGCPostDetailResponse.ResponseData>> getPostDetail(@InterfaceC1501120pAM("post_id") long j, @InterfaceC1501120pAM("sec_anchor_id") String str, @InterfaceC1501120pAM("comment_id") long j2, @InterfaceC1501120pAM("comment_type") int i);

    @InterfaceC1501200pAU("/tiktok/sub/space/post/page/")
    C11NZ<DataResponse<PGCPostPageResponse.ResponseData>> getPostPage(@InterfaceC1501120pAM("sec_anchor_id") String str, @InterfaceC1501120pAM("offset") long j, @InterfaceC1501120pAM("last_active_time_sec") long j2);

    @InterfaceC1501200pAU("/tiktok/sub/space/homepage/")
    C11NZ<DataResponse<HomePageResponse.ResponseData>> getSpaceHome(@InterfaceC1501120pAM("sec_anchor_id") String str);

    @InterfaceC1501200pAU("/tiktok/sub/space/members/")
    C11NZ<DataResponse<PGCSpaceMembersResponse.ResponseData>> getSpaceMembers(@InterfaceC1501120pAM("sec_anchor_id") String str, @InterfaceC1501120pAM("offset") long j);

    @InterfaceC1501200pAU("/tiktok/sub/space/settings/")
    C11NZ<DataResponse<PGCSettingsResponse.ResponseData>> getSpaceSettings();

    @InterfaceC1501200pAU("/tiktok/sub/space/topics/")
    C11NZ<DataResponse<PGCTopicResponse.ResponseData>> getSpaceTopics();

    @InterfaceC1501200pAU("/tiktok/sub/space/activity/list/")
    C11NZ<DataResponse<PGCSpaceActivityListResponse.ResponseData>> getSubSpaceActivityList(@InterfaceC1501120pAM("sec_anchor_id") String str);

    @InterfaceC1501240pAY("/tiktok/sub/space/join/")
    @InterfaceC1485505rh
    C11NZ<DataResponse<PGCSpaceJoinResponse>> joinSpace(@InterfaceC1501100pAK("sec_anchor_id") String str);

    @InterfaceC1501240pAY("/tiktok/sub/space/comment/send/")
    C11NZ<DataResponse<PGCCommentSendResp.ResponseData>> n1(@C040I PGCCommentSendReq pGCCommentSendReq);

    @InterfaceC1501240pAY("/tiktok/sub/space/poll/vote/")
    @InterfaceC1485505rh
    C11NZ<DataResponse<PGCPollVoteResponse.ResponseData>> pollVote(@InterfaceC1501100pAK("post_id") long j, @InterfaceC1501100pAK("poll_id") long j2, @InterfaceC1501100pAK("option_id") long j3);

    @InterfaceC1501240pAY("/tiktok/sub/space/post/pin_action/")
    @InterfaceC1485505rh
    C11NZ<DataResponse<PGCPostPinActionResponse.ResponseData>> postPinAction(@InterfaceC1501100pAK("post_id") long j, @InterfaceC1501100pAK("action_type") int i);

    @InterfaceC1501240pAY("/tiktok/sub/space/quit/")
    @InterfaceC1485505rh
    C11NZ<DataResponse<PGCSpaceQuitResponse>> quitSpace(@InterfaceC1501100pAK("sec_anchor_id") String str);
}
