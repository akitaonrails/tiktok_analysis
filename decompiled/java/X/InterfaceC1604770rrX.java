package X;

import com.ss.android.ugc.aweme.avatar.repo.bean.GroupRelatedInfoRequest;
import com.ss.android.ugc.aweme.model.GroupRelatedInfoResponse;
import com.ss.android.ugc.aweme.model.StoryStatusResponse;

/* JADX INFO: renamed from: X.0rrX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1604770rrX {
    public static final C328940Cuy LIZ = C328940Cuy.LIZ;

    @InterfaceC1501240pAY("/tiktok/v1/story/group_related_info")
    Object LIZ(@C040I GroupRelatedInfoRequest groupRelatedInfoRequest, InterfaceC1364105Vn<? super GroupRelatedInfoResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/v1/story/user_related_info")
    Object LIZIZ(@InterfaceC1501120pAM("author_ids") String str, @InterfaceC1501120pAM("need_check_content_filter") boolean z, @InterfaceC1501120pAM("need_user_domain_status_filter") boolean z2, @InterfaceC1501120pAM("caller_scene") String str2, @InterfaceC1501120pAM("client_control_params") String str3, InterfaceC1364105Vn<? super StoryStatusResponse> interfaceC1364105Vn);
}
