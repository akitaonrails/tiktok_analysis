package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.duet.model.DuetAwemeList;
import com.ss.android.ugc.aweme.duet.model.DuetDetailModel;

/* JADX INFO: renamed from: X.0Ozq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC637720Ozq {
    @InterfaceC1501200pAU("/aweme/v1/anchor/aweme/")
    ListenableFuture<DuetAwemeList> LIZ(@InterfaceC1501120pAM("anchor_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") long j2, @InterfaceC1501120pAM("top_item_ids") String str2, @InterfaceC1501120pAM("anchor_type") int i);

    @InterfaceC1501200pAU("/tiktok/v1/duet/detail/")
    ListenableFuture<DuetDetailModel> LIZIZ(@InterfaceC1501120pAM("origin_item_id") String str);
}
