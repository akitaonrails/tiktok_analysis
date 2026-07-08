package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.notification.followrequest.model.ApproveResponse;
import com.ss.android.ugc.aweme.notification.followrequest.model.RejectResponse;

/* JADX INFO: renamed from: X.0OeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC624520OeY {
    @InterfaceC1501240pAY("/aweme/v1/commit/follow/request/approve/")
    @InterfaceC1485505rh
    ListenableFuture<ApproveResponse> LIZ(@InterfaceC1501100pAK("from_user_id") String str, @InterfaceC1501100pAK("approve_from") int i);

    @InterfaceC1501240pAY("/aweme/v1/commit/follow/request/reject/")
    @InterfaceC1485505rh
    ListenableFuture<RejectResponse> rejectRequest(@InterfaceC1501100pAK("from_user_id") String str);
}
