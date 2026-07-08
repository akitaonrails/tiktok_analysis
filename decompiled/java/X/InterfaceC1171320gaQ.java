package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteContentResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionAllFavoritesResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetailResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionListResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionNameCheckResponse;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionRecommendResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0gaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC1171320gaQ {
    public static final C1171380gaW LIZ = C1171380gaW.LIZ;

    @InterfaceC1501200pAU("/tiktok/collection/item_archive/list/v1")
    C11NZ<CollectionListResponse> LIZ(@InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("uid") String str, @InterfaceC1501120pAM("sec_uid") String str2, @InterfaceC1501120pAM("exclude_id") String str3, @InterfaceC1501120pAM("collaborative_uids") String str4, @InterfaceC1501120pAM("need_collaborative_user_struct") boolean z, @InterfaceC1501120pAM("is_ls_content") Boolean bool);

    @InterfaceC1501200pAU("/tiktok/collection/item_archive/overall/detail/v1")
    C11NZ<CollectionAllFavoritesResponse> LIZIZ(@InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i);

    @InterfaceC1501200pAU("/tiktok/ls/collection/recommend_name/v1")
    C11NZ<CollectionRecommendResponse> LIZJ(@InterfaceC1501120pAM("item_id") String str);

    @InterfaceC1501200pAU("/tiktok/collection/item_archive/item/candidate/list/v1")
    C11NZ<CollectionContentResponse> LIZLLL(@InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("pull_type") int i2);

    @InterfaceC1501200pAU("/tiktok/collection/item_archive/detail/v1")
    C11NZ<CollectionDetailResponse> LJ(@InterfaceC1501120pAM("item_archive_id") String str);

    @InterfaceC1501200pAU("/tiktok/collection/item_archive/item/list/v1")
    C11NZ<CollectionContentResponse> LJFF(@InterfaceC1501120pAM("item_archive_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("pull_type") int i2);

    @InterfaceC1501240pAY("/tiktok/collection/item_archive/manage/v1")
    @InterfaceC1485505rh
    C11NZ<CollectionManageResponse> LJI(@InterfaceC1501100pAK("operation") int i, @InterfaceC1501100pAK("item_archive_id") String str, @InterfaceC1501100pAK("item_archive_name") String str2, @InterfaceC1501100pAK("item_archive_id_from") String str3, @InterfaceC1501100pAK("item_archive_id_to") String str4, @InterfaceC1501100pAK("add_ids") String str5, @InterfaceC1501100pAK("remove_ids") String str6, @InterfaceC1501100pAK("move_ids") String str7, @InterfaceC1501100pAK(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) Integer num, @InterfaceC1501100pAK("collaborative_uids") String str8, @InterfaceC1501100pAK("biz_type") Integer num2, @InterfaceC1501100pAK("is_immediate_add_after_create") Integer num3);

    @InterfaceC1501200pAU("/tiktok/collection/item_archive/item/list/v1")
    C0X9S<CollectionContentResponse> LJII(@InterfaceC1501120pAM("item_archive_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("pull_type") int i2);

    @InterfaceC1501200pAU("/tiktok/collection/item_archive/check/v1")
    C11NZ<CollectionNameCheckResponse> LJIIIIZZ(@InterfaceC1501120pAM("check_type") int i, @InterfaceC1501120pAM("name") String str);

    @InterfaceC1501200pAU("/aweme/v1/aweme/listcollection/")
    C11NZ<AllFavoriteContentResponse> LJIIIZ(@InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i);

    @InterfaceC1501200pAU("/aweme/v1/aweme/collect/")
    C11NZ<BaseResponse> LJIIJ(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("action") int i);
}
