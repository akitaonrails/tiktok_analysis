package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.minis.feed.instantplay.api.PreviewDirectFeedCardResponse;

/* JADX INFO: renamed from: X.0cJU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1007060cJU {
    @InterfaceC1501240pAY("/tiktok/minis/feed_card/direct_card_showed")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK("dedup_id") String str, @InterfaceC1501100pAK("client_key") String str2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/minis/feed_card/preview_direct_feed_card")
    @InterfaceC1485505rh
    Object LIZIZ(@InterfaceC1501100pAK("token") String str, @InterfaceC1501100pAK("content_id") String str2, @InterfaceC1501100pAK("client_key") String str3, InterfaceC1364105Vn<? super PreviewDirectFeedCardResponse> interfaceC1364105Vn);
}
