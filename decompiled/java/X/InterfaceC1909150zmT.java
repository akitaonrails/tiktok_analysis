package X;

import com.ss.android.ugc.aweme.notification.bean.BioMentionListResponse;
import com.ss.android.ugc.aweme.notification.bean.EffectUseListResponse;
import com.ss.android.ugc.aweme.notification.bean.FavoriteListResponse;
import com.ss.android.ugc.aweme.notification.bean.LikeListResponse;
import com.ss.android.ugc.aweme.notification.bean.SocialAvatarLikeListResponse;
import com.ss.android.ugc.aweme.notification.bean.TranslationLikeListResponse;

/* JADX INFO: renamed from: X.0zmT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1909150zmT {
    @InterfaceC1501200pAU("/tiktok/v1/social_avatar/like/list")
    C11NZ<SocialAvatarLikeListResponse> LIZ(@InterfaceC1501120pAM("avatar_id") long j, @InterfaceC1501120pAM("offset") long j2, @InterfaceC1501120pAM("checksum") String str);

    @InterfaceC1501200pAU("/aweme/v1/user/bio/mention/")
    C11NZ<BioMentionListResponse> LIZIZ();

    @InterfaceC1501200pAU("/aweme/v1/aweme/collecteduser/")
    C15O7<FavoriteListResponse> LIZJ(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("scenario") int i2);

    @InterfaceC1501200pAU("/tiktok/cla/translation_like/list/v1/")
    C15O7<TranslationLikeListResponse> LIZLLL(@InterfaceC1501120pAM("subtitle_id") String str, @InterfaceC1501120pAM("item_id") String str2, @InterfaceC1501120pAM("offset") long j, @InterfaceC1501120pAM("max_cursor") long j2);

    @InterfaceC1501200pAU("/tiktok/v1/effect/api/ttapp/ame/notifications")
    C11NZ<EffectUseListResponse> LJ(@InterfaceC1501120pAM("effect_id") String str, @InterfaceC1501120pAM("max_cursor") long j, @InterfaceC1501120pAM("min_cursor") long j2, @InterfaceC1501120pAM("count") int i);

    @InterfaceC1501200pAU("/aweme/v1/digg/list/")
    C15O7<LikeListResponse> LJFF(@InterfaceC1501120pAM("max_cursor") long j, @InterfaceC1501120pAM("min_cursor") long j2, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("is_new") boolean z, @InterfaceC1501120pAM("digg_type") int i2, @InterfaceC1501120pAM("ref_id") String str, @InterfaceC1501120pAM("user_type") int i3, @InterfaceC1501120pAM("sec_user_ids") String str2);
}
