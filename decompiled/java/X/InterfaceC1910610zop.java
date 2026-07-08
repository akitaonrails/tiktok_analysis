package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.donation.DonateResponse;

/* JADX INFO: renamed from: X.0zop, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1910610zop {
    @InterfaceC1501200pAU("/aweme/v1/donate/item/")
    ListenableFuture<DonateResponse> LIZ(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("cursor") Integer num, @InterfaceC1501120pAM("ngo_id") Integer num2, @InterfaceC1501120pAM("sec_uid") String str2, @InterfaceC1501120pAM("item_id") Long l, @InterfaceC1501120pAM("item_type") Integer num3, @InterfaceC1501120pAM("extra") String str3, @InterfaceC1501120pAM("should_fetch_top_donor") boolean z);

    @InterfaceC1501200pAU("/tiktok/v1/donation/panel/get/")
    ListenableFuture<DonateResponse> LIZIZ(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("cursor") Integer num, @InterfaceC1501120pAM("organization_id") String str2, @InterfaceC1501120pAM("sec_uid") String str3, @InterfaceC1501120pAM("item_id") Long l, @InterfaceC1501120pAM("item_type") Integer num2, @InterfaceC1501120pAM("extra") String str4, @InterfaceC1501120pAM("should_fetch_top_donor") boolean z);
}
