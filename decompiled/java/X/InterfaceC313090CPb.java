package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupResponse;

/* JADX INFO: renamed from: X.0CPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC313090CPb {
    @InterfaceC1501200pAU("/aweme/v1/user/popup/")
    ListenableFuture<PopupResponse> LIZ(@InterfaceC1501120pAM("post_video_status") String str);
}
