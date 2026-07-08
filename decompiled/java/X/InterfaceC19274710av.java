package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.promote.PromoteProgramResponse;

/* JADX INFO: renamed from: X.10av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC19274710av {
    @InterfaceC1501200pAU("/aweme/v1/creatorlicense/confirm/")
    ListenableFuture<PromoteProgramResponse> LIZ(@InterfaceC1501120pAM("license_version") String str);

    @InterfaceC1501200pAU("/aweme/v1/creatorlicense/cancel/")
    ListenableFuture<BaseResponse> LIZIZ();
}
