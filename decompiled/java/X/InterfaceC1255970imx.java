package X;

import com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteContentResponse;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;

/* JADX INFO: renamed from: X.0imx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public interface InterfaceC1255970imx {
    @InterfaceC1501200pAU("/aweme/v1/aweme/listcollection/")
    C11NZ<AllFavoriteContentResponse> LIZ(@InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i);

    @InterfaceC1501200pAU("/aweme/v1/aweme/post/")
    C11NZ<FeedItemList> LIZIZ(@InterfaceC1501120pAM("source") int i, @InterfaceC1501120pAM("user_avatar_shrink") String str, @InterfaceC1501120pAM("video_cover_shrink") String str2, @InterfaceC1501120pAM("filter_private") int i2, @InterfaceC1501120pAM("max_cursor") long j, @InterfaceC1501120pAM("sec_user_id") String str3, @InterfaceC1501120pAM("count") int i3, @InterfaceC1501120pAM("screen_reader_enable") Boolean bool);

    @InterfaceC1501200pAU("/aweme/v1/aweme/favorite/")
    C11NZ<FeedItemList> LIZJ(@InterfaceC1501120pAM("invalid_item_count") int i, @InterfaceC1501120pAM("is_hiding_invalid_item") int i2, @InterfaceC1501120pAM("max_cursor") long j, @InterfaceC1501120pAM("sec_user_id") String str, @InterfaceC1501120pAM("count") int i3);

    @InterfaceC1501200pAU("/aweme/v1/music/aweme/")
    C11NZ<MusicAwemeList> LIZLLL(@InterfaceC1501120pAM("music_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("type") int i2);
}
