package X;

import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;

/* JADX INFO: renamed from: X.0OE5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0OE5 {
    @InterfaceC1501200pAU("/tiktok/user/pinned_pgc_music/list/v1/")
    Object LIZIZ(@InterfaceC1501120pAM("sec_user_id") String str, InterfaceC1364105Vn<? super PinnedMusicList> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/aweme/v1/original/music/list/")
    Object LIZJ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("sec_user_id") String str2, @InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, InterfaceC1364105Vn<? super OriginalMusicList> interfaceC1364105Vn);
}
