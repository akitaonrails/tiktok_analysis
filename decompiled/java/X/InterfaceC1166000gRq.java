package X;

import com.ss.android.ugc.aweme.rss.api.models.GetRssFeedResponse;
import com.ss.android.ugc.aweme.rss.api.models.GetRssUserResponse;
import com.ss.android.ugc.aweme.rss.api.models.UpdateRssResponse;

/* JADX INFO: renamed from: X.0gRq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC1166000gRq {
    public static final C1166010gRr LIZ = C1166010gRr.LIZ;

    @InterfaceC1485505rh
    @InterfaceC1501250pAZ("/tiktok/v1/rss")
    Object LIZ(@InterfaceC1501100pAK("url") String str, InterfaceC1364105Vn<? super UpdateRssResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/v1/rss/feed")
    Object LIZIZ(@InterfaceC1501120pAM("rss_feed_url") String str, @InterfaceC1501120pAM("page_size") Integer num, @InterfaceC1501120pAM("page_token") String str2, InterfaceC1364105Vn<? super GetRssFeedResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/tiktok/v1/rss/user")
    Object LIZJ(InterfaceC1364105Vn<? super GetRssUserResponse> interfaceC1364105Vn);
}
