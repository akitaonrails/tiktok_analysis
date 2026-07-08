package X;

import com.ss.android.ugc.aweme.feed.module.FollowingInterestFeedResponse;

/* JADX INFO: renamed from: X.0QST, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public interface C0QST {
    public static final C0QSW LIZ = C0QSW.LIZ;

    @InterfaceC1501200pAU("/aweme/v1/following/interest/feed/")
    C11NZ<FollowingInterestFeedResponse> LIZ(@InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("following_uid") String str, @InterfaceC1501120pAM("refresh_type") int i3, @InterfaceC1501120pAM("sky_light_type") int i4, @InterfaceC1501120pAM("is_blue_user") boolean z);
}
