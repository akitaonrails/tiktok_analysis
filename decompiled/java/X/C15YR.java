package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: renamed from: X.15YR, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public interface C15YR {
    @InterfaceC1501240pAY("/tiktok/v1/guardian/platform/engagement/count/permission")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZ(@InterfaceC1501120pAM("engagement_count_action") int i, @InterfaceC1501120pAM("engagement_count_action_source") int i2, @InterfaceC1501100pAK("engagement_count_action") int i3, @InterfaceC1501100pAK("engagement_count_action_source") int i4, @InterfaceC1501120pAM("engagement_count_action") String str, @InterfaceC1501120pAM("engagement_count_action_source") String str2, @InterfaceC1501100pAK("engagement_count_action") String str3, @InterfaceC1501100pAK("engagement_count_action_source") String str4);

    @InterfaceC1501240pAY("/aweme/v2/guardian/platform/verify/password/")
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZIZ(@InterfaceC1501100pAK("pass_code") String str);
}
