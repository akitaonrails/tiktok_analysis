package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.api.AnchorSearchResponse;
import com.ss.android.ugc.aweme.api.resp.AnchorSelectionResponse;
import com.ss.android.ugc.aweme.api.resp.SubsAnchorConsumptionResponse;

/* JADX INFO: renamed from: X.118O, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface C118O {
    @InterfaceC1501200pAU("/aweme/v1/anchor/search/")
    ListenableFuture<AnchorSearchResponse> LIZ(@InterfaceC1501120pAM("type") int i, @InterfaceC1501120pAM("keyword") String str, @InterfaceC1501120pAM("page") int i2, @InterfaceC1501120pAM("page_size") int i3);

    @InterfaceC1501200pAU("/aweme/v1/anchor/selection/")
    ListenableFuture<AnchorSelectionResponse> LIZIZ(@InterfaceC1501120pAM("type") int i, @InterfaceC1501120pAM("tab_id") int i2, @InterfaceC1501120pAM("page") int i3, @InterfaceC1501120pAM("page_size") int i4);

    @InterfaceC1501200pAU("/tiktok/v1/m10n/subscription/anchor_consumption/")
    C15O7<SubsAnchorConsumptionResponse> LIZJ(@InterfaceC1501120pAM("creator_id") String str, @InterfaceC1501120pAM("user_id") String str2, @InterfaceC1501120pAM("anchor_id") String str3, @InterfaceC1501120pAM("item_id") String str4);

    @InterfaceC1501240pAY("/aweme/v1/anchor/history/delete/")
    @InterfaceC1485505rh
    C15O7<C0220005i> LIZLLL(@InterfaceC1501100pAK("type") int i, @InterfaceC1501100pAK("ids") String str, @InterfaceC1501100pAK("clear_all") boolean z);
}
