package X;

import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeMsgResponse;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: renamed from: X.0sDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1618650sDv {
    public static final C1618640sDu LIZ = C1618640sDu.LIZ;

    @InterfaceC1501200pAU("/safe_info/user/message/notice/")
    AbstractC19484711Kz<SafeInfoNoticeMsgResponse> LIZ(@InterfaceC1501120pAM("adolescent_model") boolean z);

    @InterfaceC1501240pAY("/safe_info/user/confirm/notice/")
    @InterfaceC1485505rh
    AbstractC19484711Kz<BaseResponse> LIZIZ(@InterfaceC1501100pAK("notice_id") String str, @InterfaceC1501100pAK("notice_type") String str2);
}
