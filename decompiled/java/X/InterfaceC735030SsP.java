package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0SsP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC735030SsP {
    @InterfaceC1501240pAY("/aweme/v1/mask/cancel/")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZ(@InterfaceC1501100pAK("aweme_id") String str, @InterfaceC1501100pAK("mask_type") Integer num, @InterfaceC1501100pAK(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) Integer num2);
}
