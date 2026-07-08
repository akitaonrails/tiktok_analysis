package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.AccessTokenApp;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformAccessInfo;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0e1A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072580e1A implements InterfaceC1070470dxl {
    public static final C1072580e1A LIZ = new C1072580e1A();

    @Override // X.InterfaceC1070470dxl
    public final boolean LIZIZ() {
        List<SocialPlatformSetting> socialPlatformSettings = C0XQ7.LJFF().getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings == null) {
            return false;
        }
        for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
            if (socialPlatformSetting.getSocialPlatform() == 6) {
                return socialPlatformSetting.getSyncStatus();
            }
        }
        return false;
    }

    @Override // X.InterfaceC1070470dxl
    public final Integer LIZLLL() {
        List<SocialPlatformSetting> socialPlatformSettings = C0XQ7.LJFF().getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings == null) {
            return null;
        }
        while (true) {
            Integer tokenStatus = null;
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 6) {
                    List<SocialPlatformAccessInfo> allAccessInfo = socialPlatformSetting.getAllAccessInfo();
                    boolean z = false;
                    if (allAccessInfo != null) {
                        for (SocialPlatformAccessInfo socialPlatformAccessInfo : C13LP.LJJJJLI(allAccessInfo)) {
                            int i = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[MLBBAuthCache] MLBB getTokenStatus for each allAccessInfo, it.accessTokenApp is ");
                            sbLIZ.append(socialPlatformAccessInfo.getAccessTokenApp());
                            sbLIZ.append(", it.tokenStatus is ");
                            sbLIZ.append(socialPlatformAccessInfo.getTokenStatus());
                            C2188811AlT.LIZIZ(sbLIZ);
                            Integer accessTokenApp = socialPlatformAccessInfo.getAccessTokenApp();
                            int value = AccessTokenApp.ACCESS_TOKEN_APP_UNKNOWN.getValue();
                            if (accessTokenApp == null || accessTokenApp.intValue() != value) {
                                tokenStatus = socialPlatformAccessInfo.getTokenStatus();
                                z = true;
                            }
                        }
                        if (z) {
                            continue;
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[MLBBAuthCache] MLBB getTokenStatus not able to read allAccessInfo, read accessInfo as ");
                    SocialPlatformAccessInfo accessInfo = socialPlatformSetting.getAccessInfo();
                    sbLIZ2.append(accessInfo != null ? accessInfo.getTokenStatus() : null);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    SocialPlatformAccessInfo accessInfo2 = socialPlatformSetting.getAccessInfo();
                    if (accessInfo2 != null) {
                        tokenStatus = accessInfo2.getTokenStatus();
                    }
                }
            }
            return tokenStatus;
        }
    }

    @Override // X.InterfaceC1070470dxl
    public final boolean LJ() {
        Integer numLIZLLL = LIZLLL();
        return numLIZLLL != null && numLIZLLL.intValue() == SocialPlatformTokenStatus.STATUS_VALID.getValue() && LIZIZ();
    }

    @Override // X.InterfaceC1070470dxl
    public final void LJFF(boolean z) {
        SocialPlatformSetting next;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        List<SocialPlatformSetting> socialPlatformSettings = iAccountUserServiceLJFF.getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            Iterator<SocialPlatformSetting> it2 = socialPlatformSettings.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getSocialPlatform() == 6) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SocialPlatformSetting socialPlatformSetting = next;
            if (socialPlatformSetting != null) {
                socialPlatformSetting.setSyncStatus(z);
                iAccountUserServiceLJFF.LJIJ();
            }
        }
    }
}
