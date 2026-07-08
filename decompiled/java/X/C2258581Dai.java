package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.relation.model.FriendsListResponse;
import com.ss.android.ugc.aweme.relation.model.FriendsNewPostsItemResponse;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;

/* JADX INFO: renamed from: X.1Dai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2258581Dai implements InterfaceC2258561Dag {
    public static final C2258581Dai LIZIZ = new C2258581Dai();
    public final /* synthetic */ InterfaceC2258561Dag LIZ = (InterfaceC2258561Dag) C2208608l2.LIZIZ.create(InterfaceC2258561Dag.class);

    @Override // X.InterfaceC2258561Dag
    @InterfaceC1501200pAU("tiktok/user/relation/unread_items/v1")
    public final Object LIZ(@InterfaceC1501120pAM("to_user_id") String str, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("page_token") String str2, InterfaceC1364105Vn<? super FriendsNewPostsItemResponse> interfaceC1364105Vn) {
        return this.LIZ.LIZ(str, i, str2, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC2258561Dag
    @InterfaceC1501240pAY("/aweme/v1/search/user/sug/")
    @InterfaceC1485505rh
    public final Object LIZIZ(@InterfaceC1501100pAK("keyword") String str, @InterfaceC1501100pAK("count") long j, @InterfaceC1501100pAK("source") String str2, @InterfaceC1501100pAK("mention_type") long j2, InterfaceC1364105Vn<? super SearchUserSugResponse> interfaceC1364105Vn) {
        return this.LIZ.LIZIZ(str, j, str2, j2, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC2258561Dag
    @InterfaceC1501200pAU("/tiktok/user/relation/mutual_friends/list/v1")
    public final Object LIZJ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("sec_user_id") String str, @InterfaceC1501120pAM("page_token") String str2, InterfaceC1364105Vn<? super FriendsListResponse> interfaceC1364105Vn) {
        return this.LIZ.LIZJ(i, i2, str, str2, interfaceC1364105Vn);
    }
}
