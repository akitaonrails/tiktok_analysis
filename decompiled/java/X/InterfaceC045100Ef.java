package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sticker.api.model.PopularStickerListResponse;
import com.ss.android.ugc.aweme.im.sticker.api.model.SaveVideoStickerResponse;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetDetailListResponse;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetListResponse;
import com.ss.android.ugc.aweme.im.sticker.api.model.TypingRecommendationBlocklistResponse;
import com.ss.android.ugc.aweme.im.sticker.api.model.Video2StickerFavoriteVideoResponse;
import com.ss.android.ugc.aweme.im.sticker.api.model.Video2StickerLikedVideoResponse;
import com.ss.android.ugc.aweme.im.sticker.api.model.Video2StickerPostedVideoResponse;
import com.ss.android.ugc.aweme.im.sticker.api.model.Video2StickerSceneResponse;
import com.ss.android.ugc.aweme.im.sticker.impl.replytosticker.model.IMStickerSearchSimilarResponse;

/* JADX INFO: renamed from: X.00Ef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC045100Ef {
    @InterfaceC1501200pAU("im/sticker/typing_recommendation/blacklist/")
    Object LIZ(InterfaceC1364105Vn<? super TypingRecommendationBlocklistResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/video2sticker/favorite_video_view/")
    Object LIZIZ(@InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") long j2, InterfaceC1364105Vn<? super Video2StickerFavoriteVideoResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/sticker/set/list/")
    Object LIZJ(@InterfaceC1501120pAM("target_user_id") Long l, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") long j2, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i, @InterfaceC1501120pAM("source") String str, InterfaceC1364105Vn<? super StickerSetListResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/sticker/set/list/added/update/")
    Object LIZLLL(@InterfaceC1501120pAM("sticker_set_ids") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/video2sticker/create/")
    Object LJ(@InterfaceC1501120pAM("store_toggle") boolean z, @InterfaceC1501120pAM("origin_video_id") long j, @InterfaceC1501120pAM("origin_video_sec_user_id") String str, @InterfaceC1501120pAM("sticker_type") int i, @InterfaceC1501120pAM("static_uri") String str2, @InterfaceC1501120pAM("animated_uri") String str3, @InterfaceC1501120pAM("width") long j2, @InterfaceC1501120pAM("height") long j3, @InterfaceC1501120pAM("labels") String str4, @InterfaceC1501120pAM("source") String str5, InterfaceC1364105Vn<? super SaveVideoStickerResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/video2sticker/rank/list/")
    Object LJFF(@InterfaceC1501120pAM("rank_type") int i, @InterfaceC1501120pAM("count") long j, @InterfaceC1501120pAM("cursor") long j2, InterfaceC1364105Vn<? super Video2StickerSceneResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/sticker/popular/list")
    Object LJI(@InterfaceC1501120pAM("source") int i, InterfaceC1364105Vn<? super PopularStickerListResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/video2sticker/published_video_view/")
    Object LJII(@InterfaceC1501120pAM("min_create_time") long j, @InterfaceC1501120pAM("max_create_time") long j2, @InterfaceC1501120pAM("count") long j3, InterfaceC1364105Vn<? super Video2StickerPostedVideoResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/video2sticker/liked_video_view/")
    Object LJIIIIZZ(@InterfaceC1501120pAM("min_cursor") long j, @InterfaceC1501120pAM("max_cursor") long j2, @InterfaceC1501120pAM("count") long j3, InterfaceC1364105Vn<? super Video2StickerLikedVideoResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/video2sticker/notification/list/")
    Object LJIIIZ(@InterfaceC1501120pAM("sec_user_id") String str, @InterfaceC1501120pAM("range_start_time") long j, @InterfaceC1501120pAM("cursor") long j2, @InterfaceC1501120pAM("count") int i, InterfaceC1364105Vn<? super Video2StickerSceneResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/sticker/set/details/")
    Object LJIIJ(@InterfaceC1501120pAM("sticker_set_ids") String str, @InterfaceC1501120pAM("source") String str2, InterfaceC1364105Vn<? super StickerSetDetailListResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/video2sticker/update/")
    Object LJIIJJI(@InterfaceC1501120pAM("video_sticker_id") long j, @InterfaceC1501120pAM("action_enum") int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("im/sticker/set/list/added/add/")
    Object LJIIL(@InterfaceC1501120pAM("sticker_set_id") long j, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/sticker/suggestion/")
    Object LJIILIIL(@InterfaceC1501120pAM("source") int i, @InterfaceC1501120pAM("sticker_id") String str, @InterfaceC1501120pAM("sticker_set_id") Long l, InterfaceC1364105Vn<? super IMStickerSearchSimilarResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("im/video2sticker/profile/list/")
    Object LJIILJJIL(@InterfaceC1501120pAM("sec_user_id") String str, @InterfaceC1501120pAM("count") long j, @InterfaceC1501120pAM("cursor") long j2, InterfaceC1364105Vn<? super Video2StickerSceneResponse> interfaceC1364105Vn);
}
