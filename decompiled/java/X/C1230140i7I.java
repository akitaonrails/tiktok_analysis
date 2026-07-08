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

/* JADX INFO: renamed from: X.0i7I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230140i7I implements InterfaceC1230150i7J {
    public static final C1230140i7I LIZ = new C1230140i7I();
    public static final InterfaceC1230150i7J LIZIZ = (InterfaceC1230150i7J) ((C1566106Bf) C0I0B.LJFF.LIZLLL()).LIZIZ(InterfaceC1230150i7J.class);

    @Override // X.InterfaceC1230150i7J
    public final Object LIZ(GetGroupListRequest getGroupListRequest, InterfaceC1364105Vn<? super GetGroupListResponse> interfaceC1364105Vn) {
        return LIZIZ.LIZ(getGroupListRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1230150i7J
    public final Object LIZIZ(GroupInviteListRequest groupInviteListRequest, InterfaceC1364105Vn<? super GroupInviteListResponse> interfaceC1364105Vn) {
        return LIZIZ.LIZIZ(groupInviteListRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1230150i7J
    public final Object LIZJ(UpdateShowGroupListRequest updateShowGroupListRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return LIZIZ.LIZJ(updateShowGroupListRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1230150i7J
    public final Object LIZLLL(UpdateOnboardingCardRequest updateOnboardingCardRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return LIZIZ.LIZLLL(updateOnboardingCardRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1230150i7J
    public final Object LJ(SetGroupStatusRequest setGroupStatusRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return LIZIZ.LJ(setGroupStatusRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1230150i7J
    public final Object LJFF(GroupInviteListTabsRequest groupInviteListTabsRequest, InterfaceC1364105Vn<? super GroupInviteListTabsResponse> interfaceC1364105Vn) {
        return LIZIZ.LJFF(groupInviteListTabsRequest, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1230150i7J
    public final Object LJI(GroupJoinRequestV2 groupJoinRequestV2, InterfaceC1364105Vn<? super GroupJoinResponseV2> interfaceC1364105Vn) {
        return LIZIZ.LJI(groupJoinRequestV2, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC1230150i7J
    public final Object LJII(GroupInvitePopupRequest groupInvitePopupRequest, InterfaceC1364105Vn<? super GroupInvitePopupResponse> interfaceC1364105Vn) {
        return LIZIZ.LJII(groupInvitePopupRequest, interfaceC1364105Vn);
    }
}
