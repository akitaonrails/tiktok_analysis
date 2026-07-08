package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;

/* JADX INFO: renamed from: X.1165, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public interface AnonymousClass1165 {
    @InterfaceC1501200pAU("/aweme/v1/commerce/challenge/detail/")
    ListenableFuture<ChallengeDetail> LIZ(@InterfaceC1501120pAM("ch_id") String str, @InterfaceC1501120pAM("hashtag_name") String str2, @InterfaceC1501120pAM("query_type") int i, @InterfaceC1501120pAM("click_reason") int i2);

    @InterfaceC1501200pAU("/aweme/v1/challenge/detail/")
    ListenableFuture<ChallengeDetail> LIZIZ(@InterfaceC1501120pAM("ch_id") String str, @InterfaceC1501120pAM("hashtag_name") String str2, @InterfaceC1501120pAM("query_type") int i, @InterfaceC1501120pAM("click_reason") int i2);
}
