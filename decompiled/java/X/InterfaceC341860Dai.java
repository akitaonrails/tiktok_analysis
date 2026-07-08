package X;

import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.BatchFollowResponse;

/* JADX INFO: renamed from: X.0Dai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC341860Dai {
    @InterfaceC1501240pAY("/aweme/v1/commit/follow/batchuser/")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK("sec_user_ids") String str, @InterfaceC1501100pAK("type") Integer num, @InterfaceC1501100pAK("user_ids") String str2, @InterfaceC1501100pAK("action_time") Long l, @InterfaceC1501100pAK("is_network_available") Boolean bool, InterfaceC1364105Vn<? super BatchFollowResponse> interfaceC1364105Vn);
}
