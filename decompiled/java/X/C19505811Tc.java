package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.following.model.FollowerItemList;
import com.ss.android.ugc.aweme.profile.api.FollowRelationApi;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;

/* JADX INFO: renamed from: X.11Tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19505811Tc implements FollowRelationApi {
    public static final C19505811Tc LIZJ = new C19505811Tc();
    public final /* synthetic */ FollowRelationApi LIZIZ = (FollowRelationApi) C2208908l5.LIZIZ.create(FollowRelationApi.class);

    @Override // com.ss.android.ugc.aweme.profile.api.FollowRelationApi
    @InterfaceC1501200pAU("/aweme/v1/user/following/list/")
    public final C11NZ<FollowingItemList> LIZ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("sec_user_id") String str2, @InterfaceC1501120pAM("max_time") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("offset") int i2, @InterfaceC1501120pAM("source_type") int i3, @InterfaceC1501120pAM("address_book_access") int i4, @InterfaceC1501120pAM("page_token") String str3, @InterfaceC1501120pAM("live_sort_by") int i5, @InterfaceC1501120pAM("experiment_config") String str4) {
        return this.LIZIZ.LIZ(str, str2, j, i, i2, i3, i4, str3, i5, str4);
    }

    @Override // com.ss.android.ugc.aweme.profile.api.FollowRelationApi
    @InterfaceC1501200pAU("/aweme/v1/user/follower/list/")
    public final C11NZ<FollowerItemList> LIZIZ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("sec_user_id") String str2, @InterfaceC1501120pAM("max_time") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("offset") int i2, @InterfaceC1501120pAM("source_type") int i3, @InterfaceC1501120pAM("address_book_access") int i4, @InterfaceC1501120pAM("page_token") String str3, @InterfaceC1501120pAM("target_user_ids") String str4) {
        return this.LIZIZ.LIZIZ(str, str2, j, i, i2, i3, i4, str3, str4);
    }

    @Override // com.ss.android.ugc.aweme.profile.api.FollowRelationApi
    @InterfaceC1501240pAY("/aweme/v2/follow/feed/visit_report")
    public final Object LIZJ(@InterfaceC1501120pAM("to_user_id") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) String str2, @InterfaceC1501120pAM("extra") String str3, InterfaceC1364105Vn<? super FollowRelationApi.FollowingMarkReadResponse> interfaceC1364105Vn) {
        return this.LIZIZ.LIZJ(str, str2, str3, interfaceC1364105Vn);
    }
}
