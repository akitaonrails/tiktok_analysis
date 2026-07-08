package X;

import com.ss.android.ugc.aweme.publicgroup.data.model.GetGroupListRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.GetGroupListResponse;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntranceCheckRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupEntranceCheckResponse;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListRequest;
import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse;

/* JADX INFO: renamed from: X.0i5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1229280i5u {
    public static final C1229910i6v LIZ = C1229910i6v.LIZ;

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/get_group_list")
    Object LIZ(@C040I GetGroupListRequest getGroupListRequest, InterfaceC1364105Vn<? super GetGroupListResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/invite/list")
    Object LIZIZ(@C040I GroupInviteListRequest groupInviteListRequest, InterfaceC1364105Vn<? super GroupInviteListResponse> interfaceC1364105Vn);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501240pAY("/tiktok/v1/im/group/entrance_check")
    Object LIZJ(@C040I GroupEntranceCheckRequest groupEntranceCheckRequest, InterfaceC1364105Vn<? super GroupEntranceCheckResponse> interfaceC1364105Vn);
}
