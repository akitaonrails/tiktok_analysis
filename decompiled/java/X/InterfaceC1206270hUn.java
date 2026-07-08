package X;

import com.ss.android.ugc.aweme.favorites.business.FavoriteCountResponse;

/* JADX INFO: renamed from: X.0hUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC1206270hUn {
    public static final C1206280hUo LIZ = C1206280hUo.LIZ;

    @InterfaceC1501200pAU("/aweme/v1/user/collect/count/")
    C11NZ<FavoriteCountResponse> LIZ(@InterfaceC1501120pAM("effect_channel") String str, @InterfaceC1501120pAM("music_scene") String str2);

    @InterfaceC1501200pAU("/aweme/v1/user/collect/count/other/")
    C11NZ<FavoriteCountResponse> LIZIZ(@InterfaceC1501120pAM("to_uid") String str);
}
