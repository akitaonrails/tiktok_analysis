package X;

import com.ss.android.ugc.aweme.pns.agegate.network.AgeGateResponse;
import com.ss.android.ugc.aweme.pns.agegate.network.BaseResponse;
import com.ss.android.ugc.aweme.pns.agegate.network.DoBResponse;

/* JADX INFO: renamed from: X.10WC, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public interface C10WC {
    @InterfaceC1501240pAY("/aweme/v3/verification/age/")
    @InterfaceC1485505rh
    C15O7<AgeGateResponse> LIZ(@InterfaceC1501120pAM("birthday") String str, @InterfaceC1501120pAM("update_birthdate_type") int i, @InterfaceC1501120pAM("session_registered") int i2, @InterfaceC1501120pAM("is_guest") boolean z, @InterfaceC1501120pAM("birthday_confidence") int i3, @InterfaceC1501120pAM("submit_type") Integer num, @InterfaceC1501100pAK("age_range_source") String str2, @InterfaceC1501100pAK("third_party_lower_bound") Integer num2, @InterfaceC1501100pAK("third_party_upper_bound") Integer num3);

    @InterfaceC1501200pAU("/tiktok/v1/calculate/age/")
    C15O7<DoBResponse> LIZIZ(@InterfaceC1501120pAM("birthday") String str, @InterfaceC1501120pAM("update_birthdate_type") int i, @InterfaceC1501120pAM("session_register_type") int i2, @InterfaceC1501120pAM("is_guest") boolean z, @InterfaceC1501120pAM("submit_type") Integer num);

    @InterfaceC1501200pAU("/tiktok/age/confirmation/get/v2/")
    C15O7<BaseResponse> LIZJ(@InterfaceC1501120pAM("birthday") String str, @InterfaceC1501120pAM("update_birthdate_type") int i, @InterfaceC1501120pAM("session_register_type") int i2);
}
