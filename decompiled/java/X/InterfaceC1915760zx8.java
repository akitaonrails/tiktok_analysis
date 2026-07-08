package X;

import com.ss.android.ugc.aweme.pns.consent.core.network.BaseResponse;
import com.ss.android.ugc.aweme.pns.consent.core.network.FetchConsentResponse;

/* JADX INFO: renamed from: X.0zx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1915760zx8 {
    @InterfaceC1501240pAY("/consent/api/record/create/v2")
    @InterfaceC1485505rh
    C15O7<BaseResponse> LIZ(@InterfaceC1501100pAK("records") String str, @InterfaceC1501100pAK("sdk_version") String str2, @InterfaceC1501100pAK("sdk_name") String str3);

    @InterfaceC1501240pAY("/consent/api/combine/list/v3")
    C15O7<FetchConsentResponse> LIZIZ(@InterfaceC1501120pAM("sdk_version") String str, @InterfaceC1501120pAM("sdk_name") String str2);
}
