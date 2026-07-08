package X;

import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import webcast.api.pgc_sub.PGCCommentActionRequest;
import webcast.api.pgc_sub.PGCCommentActionResponse;
import webcast.api.pgc_sub.PGCCommentDeleteResponse;
import webcast.api.pgc_sub.PGCCommentPageResponse;
import webcast.api.pgc_sub.PGCCommentSendReq;
import webcast.api.pgc_sub.PGCCommentSendResp;
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

/* JADX INFO: renamed from: X.0K3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC511350K3p {
    C11NZ<DataResponse<PGCPostActionResponse>> LIZ(PGCPostActionRequest pGCPostActionRequest);

    C11NZ<DataResponse<PGCCommentActionResponse>> LIZIZ(PGCCommentActionRequest pGCCommentActionRequest);

    C11NZ LIZJ(long j, long j2, long j3);

    C11NZ<DataResponse<PGCCommentDeleteResponse>> deleteComment(long j, long j2);

    C11NZ<DataResponse<PostDeleteResponse.ResponseData>> deletePost(long j);

    C11NZ<DataResponse<PGCPostCreateResp.ResponseData>> e(PGCPostCreateReq pGCPostCreateReq);

    C11NZ<DataResponse<PGCCommentPageResponse.ResponseData>> getCommentPages(long j, long j2, String str, int i, long j3);

    C11NZ<DataResponse<PGCPostDetailResponse.ResponseData>> getPostDetail(long j, String str, long j2, int i);

    C11NZ<DataResponse<PGCPostPageResponse.ResponseData>> getPostPage(String str, long j, long j2);

    C11NZ<DataResponse<HomePageResponse.ResponseData>> getSpaceHome(String str);

    C11NZ<DataResponse<PGCSpaceMembersResponse.ResponseData>> getSpaceMembers(String str, long j);

    C11NZ<DataResponse<PGCSettingsResponse.ResponseData>> getSpaceSettings();

    C11NZ<DataResponse<PGCTopicResponse.ResponseData>> getSpaceTopics();

    C11NZ<DataResponse<PGCSpaceActivityListResponse.ResponseData>> getSubSpaceActivityList(String str);

    C11NZ<DataResponse<PGCSpaceJoinResponse>> joinSpace(String str);

    C11NZ<DataResponse<PGCCommentSendResp.ResponseData>> n1(PGCCommentSendReq pGCCommentSendReq);

    C11NZ<DataResponse<PGCPollVoteResponse.ResponseData>> pollVote(long j, long j2, long j3);

    C11NZ<DataResponse<PGCPostPinActionResponse.ResponseData>> postPinAction(long j, int i);

    C11NZ<DataResponse<PGCSpaceQuitResponse>> quitSpace(String str);
}
