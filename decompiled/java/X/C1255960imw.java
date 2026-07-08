package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.favorites.business.collection.AllFavoriteContentResponse;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;

/* JADX INFO: renamed from: X.0imw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1255960imw implements InterfaceC1255970imx {
    public static final C1255960imw LIZIZ = new C1255960imw();
    public final /* synthetic */ InterfaceC1255970imx LIZ = (InterfaceC1255970imx) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(InterfaceC1255970imx.class);

    @Override // X.InterfaceC1255970imx
    @InterfaceC1501200pAU("/aweme/v1/aweme/listcollection/")
    public final C11NZ<AllFavoriteContentResponse> LIZ(@InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i) {
        return this.LIZ.LIZ(j, i);
    }

    @Override // X.InterfaceC1255970imx
    @InterfaceC1501200pAU("/aweme/v1/aweme/post/")
    public final C11NZ<FeedItemList> LIZIZ(@InterfaceC1501120pAM("source") int i, @InterfaceC1501120pAM("user_avatar_shrink") String str, @InterfaceC1501120pAM("video_cover_shrink") String str2, @InterfaceC1501120pAM("filter_private") int i2, @InterfaceC1501120pAM("max_cursor") long j, @InterfaceC1501120pAM("sec_user_id") String str3, @InterfaceC1501120pAM("count") int i3, @InterfaceC1501120pAM("screen_reader_enable") Boolean bool) {
        return this.LIZ.LIZIZ(i, str, str2, i2, j, str3, i3, bool);
    }

    @Override // X.InterfaceC1255970imx
    @InterfaceC1501200pAU("/aweme/v1/aweme/favorite/")
    public final C11NZ<FeedItemList> LIZJ(@InterfaceC1501120pAM("invalid_item_count") int i, @InterfaceC1501120pAM("is_hiding_invalid_item") int i2, @InterfaceC1501120pAM("max_cursor") long j, @InterfaceC1501120pAM("sec_user_id") String str, @InterfaceC1501120pAM("count") int i3) {
        return this.LIZ.LIZJ(i, i2, j, str, i3);
    }

    @Override // X.InterfaceC1255970imx
    @InterfaceC1501200pAU("/aweme/v1/music/aweme/")
    public final C11NZ<MusicAwemeList> LIZLLL(@InterfaceC1501120pAM("music_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("type") int i2) {
        return this.LIZ.LIZLLL(str, j, i, i2);
    }
}
