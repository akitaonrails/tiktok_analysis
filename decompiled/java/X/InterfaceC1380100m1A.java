package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.setting.model.CommonResponse;
import com.ss.android.ugc.aweme.setting.model.RestrictInfoResponse;

/* JADX INFO: renamed from: X.0m1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1380100m1A {
    @InterfaceC1501240pAY("/aweme/v1/item/restrict/")
    @InterfaceC1485505rh
    ListenableFuture<CommonResponse> LIZ(@InterfaceC1501100pAK("target_iid") String str);

    @InterfaceC1501200pAU("/aweme/v1/item/restrict/info/")
    ListenableFuture<RestrictInfoResponse> LIZIZ(@InterfaceC1501120pAM("target_iid") String str);
}
