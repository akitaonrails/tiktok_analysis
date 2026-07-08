package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: renamed from: X.0OC2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public interface C0OC2 {
    @InterfaceC1501200pAU("aweme/v1/spotpoint/set/hitrank/")
    ListenableFuture<BaseResponse> LIZ(@InterfaceC1501120pAM("to_userid") String str, @InterfaceC1501120pAM("rank_type") int i, @InterfaceC1501120pAM("action_type") int i2, @InterfaceC1501120pAM("hashtag_names") List<String> list, @InterfaceC1501120pAM("sec_to_userid") String str2);
}
