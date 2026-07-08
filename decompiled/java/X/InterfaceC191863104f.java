package X;

import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.usersettings.BatchUpdatePrivacySettings;
import com.ss.android.ugc.tiktok.tpsc.privacy.account.usersettings.PrivacyUserSettingsResponse;
import com.ss.android.ugc.tiktok.tpsc.privacy.data.base.PrivacyUpdateCommonResponse;

/* JADX INFO: renamed from: X.104f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC191863104f {
    public static final C191864104g LIZ = C191864104g.LIZ;

    @InterfaceC1501240pAY
    @InterfaceC1485505rh
    C11NZ<PrivacyUpdateCommonResponse> LIZ(@InterfaceC1501100pAK("field") String str, @InterfaceC1501100pAK("value") int i, @InterfaceC1485705rj String str2);

    @InterfaceC1501240pAY
    @InterfaceC1485505rh
    C11NZ<BaseResponse> LIZIZ(@InterfaceC1501100pAK("field") String str, @InterfaceC1501100pAK("value") int i, @InterfaceC1485705rj String str2);

    @InterfaceC1501240pAY
    @InterfaceC1485505rh
    C11NZ<PrivacyUpdateCommonResponse> LIZJ(@InterfaceC1501100pAK("field") String str, @InterfaceC1501100pAK("value") int i, @InterfaceC1501100pAK("confirmed") int i2, @InterfaceC1485705rj String str2);

    @InterfaceC1501240pAY
    C11NZ<PrivacyUpdateCommonResponse> LIZLLL(@C040I BatchUpdatePrivacySettings batchUpdatePrivacySettings, @InterfaceC1485705rj String str);

    @InterfaceC1501200pAU
    C11NZ<PrivacyUserSettingsResponse> LJ(@InterfaceC1485705rj String str);
}
