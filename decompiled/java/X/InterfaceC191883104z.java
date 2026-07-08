package X;

import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.restriction.RestrictionResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.data.base.PrivacyUpdateCommonResponse;
import java.util.Map;

/* JADX INFO: renamed from: X.104z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC191883104z {
    public static final C191878104u LIZ = C191878104u.LIZ;

    @InterfaceC1501240pAY
    @InterfaceC1485505rh
    C11NZ<PrivacyUpdateCommonResponse> LIZ(@InterfaceC1501100pAK("record_name") String str, @InterfaceC1501100pAK("record_value") int i, @InterfaceC1501190pAT Map<String, String> map, @InterfaceC1485705rj String str2);

    @InterfaceC1501200pAU
    C11NZ<RestrictionResponse> LIZIZ(@InterfaceC1485705rj String str);

    @InterfaceC1501240pAY
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZJ(@InterfaceC1501100pAK("record_name") String str, @InterfaceC1485705rj String str2);
}
