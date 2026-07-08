package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friendstab.mute.MutePostsResponse;

/* JADX INFO: renamed from: X.0mLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1392930mLr {
    @InterfaceC1501200pAU("/aweme/v1/hide/close/")
    ListenableFuture<BaseResponse> LIZ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("source") String str2, @InterfaceC1501120pAM("hide_types") String str3);

    @InterfaceC1501200pAU("/aweme/v1/hide/open/")
    ListenableFuture<MutePostsResponse> LIZIZ(@InterfaceC1501120pAM("user_id") String str, @InterfaceC1501120pAM("source") String str2, @InterfaceC1501120pAM("hide_types") String str3);
}
