package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.publicgroup.data.model.GetGroupListRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.GetGroupListResponse;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListTabsRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListTabsResponse;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInvitePopupResponse;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinRequestV2;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupJoinResponseV2;
import com.ss.android.ugc.aweme.publicgroup.data.model.SetGroupStatusRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.UpdateOnboardingCardRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.UpdateShowGroupListRequest;

/* JADX INFO: renamed from: X.0i7J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1230150i7J {
    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/get_group_list")
    Object LIZ(@C040I GetGroupListRequest getGroupListRequest, InterfaceC1364105Vn<? super GetGroupListResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/invite/list")
    Object LIZIZ(@C040I GroupInviteListRequest groupInviteListRequest, InterfaceC1364105Vn<? super GroupInviteListResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/update/show_group_list")
    Object LIZJ(@C040I UpdateShowGroupListRequest updateShowGroupListRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/update/onboarding_card")
    Object LIZLLL(@C040I UpdateOnboardingCardRequest updateOnboardingCardRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/update/group_show_status")
    Object LJ(@C040I SetGroupStatusRequest setGroupStatusRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/invite/list/tabs")
    Object LJFF(@C040I GroupInviteListTabsRequest groupInviteListTabsRequest, InterfaceC1364105Vn<? super GroupInviteListTabsResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v2/im/group/join")
    Object LJI(@C040I GroupJoinRequestV2 groupJoinRequestV2, InterfaceC1364105Vn<? super GroupJoinResponseV2> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/invite/popup")
    Object LJII(@C040I GroupInvitePopupRequest groupInvitePopupRequest, InterfaceC1364105Vn<? super GroupInvitePopupResponse> interfaceC1364105Vn);
}
