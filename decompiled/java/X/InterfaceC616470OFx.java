package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.favorites.bean.StickerList;
import com.ss.android.ugc.aweme.favorites.model.CollectedCommentList;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;

/* JADX INFO: renamed from: X.0OFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC616470OFx {
    @InterfaceC1501200pAU("/aweme/v1/music/collect/")
    C15O7<CollectMusicResponse> LIZ(@InterfaceC1501120pAM("music_id") String str, @InterfaceC1501120pAM("action") int i);

    @InterfaceC1501240pAY("/tiktok/comment/collect/v1/")
    C15O7<BaseResponse> LIZIZ(@InterfaceC1501120pAM("comment_id") String str, @InterfaceC1501120pAM("action") int i);

    @InterfaceC1501200pAU("/aweme/v1/challenge/collect/")
    C15O7<BaseResponse> LIZJ(@InterfaceC1501120pAM("ch_id") String str, @InterfaceC1501120pAM("action") int i);

    @InterfaceC1501200pAU("/aweme/v2/shop/seeding/collect/")
    C15O7<BaseResponse> LIZLLL(@InterfaceC1501120pAM("seed_id") String str, @InterfaceC1501120pAM("operate_type") int i);

    @InterfaceC1501200pAU("/aweme/v1/mix/collect/")
    C15O7<BaseResponse> LJ(@InterfaceC1501120pAM("mix_id") String str, @InterfaceC1501120pAM("action") int i);

    @InterfaceC1501200pAU("/aweme/v1/aweme/collect/")
    C15O7<BaseResponse> LJFF(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("action") int i, @InterfaceC1501120pAM("collect_privacy_setting") int i2);

    @InterfaceC1501200pAU("/aweme/v1/sticker/listcollection/")
    C15O7<StickerList> LJI(@InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2);

    @InterfaceC1501200pAU("/tiktok/comment/listcollection/v1/")
    C15O7<CollectedCommentList> LJII(@InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2);

    @InterfaceC1501240pAY("/tiktok/v1/forum/question/collect/")
    C15O7<BaseResponse> LJIIIIZZ(@InterfaceC1501120pAM("question_id") long j, @InterfaceC1501120pAM("action") int i);
}
