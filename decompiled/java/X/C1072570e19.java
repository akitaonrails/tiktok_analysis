package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformAccessInfo;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0e19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072570e19 implements InterfaceC1071740dzo {
    public static final C1072570e19 LIZ = new C1072570e19();
    public static final C1DEV LIZIZ = C2191201ApK.LIZ();

    public static Keva LJIIL() {
        return Keva.getRepo("tiktok_ufr_cache:facebook");
    }

    @Override // X.InterfaceC1071740dzo
    public final boolean LJI() {
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        Integer numLIZLLL = c1076010e6h.LJII().LIZLLL();
        if (numLIZLLL != null) {
            int iIntValue = numLIZLLL.intValue();
            SocialPlatformTokenStatus socialPlatformTokenStatus = SocialPlatformTokenStatus.STATUS_VALID;
            if (iIntValue == socialPlatformTokenStatus.getValue()) {
                return false;
            }
            c1076010e6h.LJII().LJIIJJI(socialPlatformTokenStatus);
        }
        return true;
    }

    @Override // X.InterfaceC1071740dzo
    public final boolean LIZIZ() {
        List<SocialPlatformSetting> socialPlatformSettings = C0XQ7.LJFF().getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings == null) {
            return false;
        }
        for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
            if (socialPlatformSetting.getSocialPlatform() == 2) {
                return socialPlatformSetting.getSyncStatus();
            }
        }
        return false;
    }

    @Override // X.InterfaceC1071740dzo
    public final boolean LIZJ() {
        return LIZIZ() && LJ();
    }

    @Override // X.InterfaceC1071740dzo
    public final Integer LIZLLL() {
        List<SocialPlatformSetting> socialPlatformSettings = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getSocialData().getSocialPlatformSettings();
        Integer numLIZIZ = null;
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 2) {
                    ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    numLIZIZ = C1071540dzU.LIZIZ.LJIIJ().LIZIZ(socialPlatformSetting);
                }
            }
        }
        return numLIZIZ;
    }

    @Override // X.InterfaceC1071740dzo
    public final boolean LJ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Integer numLIZLLL = LIZLLL();
        int value = SocialPlatformTokenStatus.STATUS_UNKNOWN.getValue();
        if (numLIZLLL != null && numLIZLLL.intValue() == value) {
            if (LJIIIIZZ(curUserId).length() > 0 && LIZIZ()) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1072500e12(null), 2);
            }
            return LJIIIIZZ(curUserId).length() > 0;
        }
        SocialPlatformTokenStatus socialPlatformTokenStatus = SocialPlatformTokenStatus.STATUS_VALID;
        int value2 = socialPlatformTokenStatus.getValue();
        if (numLIZLLL == null || numLIZLLL.intValue() != value2) {
            int value3 = SocialPlatformTokenStatus.STATUS_INVALID.getValue();
            if (numLIZLLL == null || numLIZLLL.intValue() != value3) {
                return LJIIIIZZ(curUserId).length() > 0;
            }
        }
        return numLIZLLL.intValue() == socialPlatformTokenStatus.getValue();
    }

    @Override // X.InterfaceC1071740dzo
    public final void LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LJIIL().erase(str);
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("expiry_date_in_millis");
        kevaLJIIL.erase(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1071740dzo
    public final void LJFF(boolean z) {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        List<SocialPlatformSetting> socialPlatformSettings = iAccountUserServiceLJFF.getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 2) {
                    socialPlatformSetting.setSyncStatus(z);
                    iAccountUserServiceLJFF.LJIJ();
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // X.InterfaceC1071740dzo
    public final Boolean LJII(String str) {
        boolean z;
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        float fCurrentTimeMillis = System.currentTimeMillis() / 1000.0f;
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("expiry_date_in_millis");
        long j = kevaLJIIL.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
        if (j == -1) {
            return Boolean.FALSE;
        }
        if (fCurrentTimeMillis <= 0.0f) {
            return null;
        }
        if (fCurrentTimeMillis >= j) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    @Override // X.InterfaceC1071740dzo
    public final String LJIIIIZZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        float fCurrentTimeMillis = System.currentTimeMillis() / 1000.0f;
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("expiry_date_in_millis");
        long j = kevaLJIIL.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
        if (fCurrentTimeMillis <= 0.0f || j <= fCurrentTimeMillis) {
            return "";
        }
        return LJIIL().getString(str, "");
    }

    @Override // X.InterfaceC1071740dzo
    public final long LJIIJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("expiry_date_in_millis");
        return kevaLJIIL.getLong(C2188811AlT.LIZIZ(sbLIZ), -1L);
    }

    @Override // X.InterfaceC1071740dzo
    public final void LJIIJJI(SocialPlatformTokenStatus socialPlatformTokenStatus) {
        Integer accessTokenApp;
        Integer accessTokenApp2;
        Integer tokenStatus;
        AbstractC848400XPy abstractC848400XPy = (AbstractC848400XPy) C0XQ7.LJFF();
        List<SocialPlatformSetting> socialPlatformSettings = abstractC848400XPy.getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 2) {
                    List<SocialPlatformAccessInfo> allAccessInfo = socialPlatformSetting.getAllAccessInfo();
                    if (allAccessInfo != null && ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId() != null) {
                        LIZ.getClass();
                        int iIntValue = Integer.valueOf(C1071540dzU.LIZIZ.LJIIJ().LIZ()).intValue();
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[UFRCache] current access region is ");
                        sbLIZ.append(iIntValue);
                        sbLIZ.append(", tokenStatus.value is ");
                        sbLIZ.append(socialPlatformTokenStatus.getValue());
                        C2188811AlT.LIZIZ(sbLIZ);
                        for (SocialPlatformAccessInfo socialPlatformAccessInfo : (ArrayList) C13LP.LJJJJLI(allAccessInfo)) {
                            if (socialPlatformAccessInfo != null && (accessTokenApp = socialPlatformAccessInfo.getAccessTokenApp()) != null && accessTokenApp.intValue() == iIntValue) {
                                socialPlatformAccessInfo.setTokenStatus(Integer.valueOf(socialPlatformTokenStatus.getValue()));
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("[UFRCache] find info to save, info?.accessTokenApp is ");
                                if (socialPlatformAccessInfo != null) {
                                    accessTokenApp2 = socialPlatformAccessInfo.getAccessTokenApp();
                                } else {
                                    accessTokenApp2 = null;
                                }
                                sbLIZ2.append(accessTokenApp2);
                                sbLIZ2.append(", info?.tokenStatus is ");
                                if (socialPlatformAccessInfo != null) {
                                    tokenStatus = socialPlatformAccessInfo.getTokenStatus();
                                } else {
                                    tokenStatus = null;
                                }
                                sbLIZ2.append(tokenStatus);
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        }
                    } else {
                        int i2 = C2187451AjH.LIZ;
                        SocialPlatformAccessInfo accessInfo = socialPlatformSetting.getAccessInfo();
                        if (accessInfo != null) {
                            accessInfo.setTokenStatus(Integer.valueOf(socialPlatformTokenStatus.getValue()));
                        }
                    }
                    abstractC848400XPy.LJIJ();
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // X.InterfaceC1071740dzo
    public final void LJIIIZ(long j, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LJIIL().storeString(str, str2);
        Keva kevaLJIIL = LJIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("expiry_date_in_millis");
        kevaLJIIL.storeLong(C2188811AlT.LIZIZ(sbLIZ), j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
    }
}
