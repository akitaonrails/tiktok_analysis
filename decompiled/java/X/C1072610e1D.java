package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0e1D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072610e1D implements InterfaceC1070470dxl {
    public static final C1072610e1D LIZ = new C1072610e1D();

    @Override // X.InterfaceC1070470dxl
    public final Integer LIZLLL() {
        return Integer.valueOf(SocialPlatformTokenStatus.STATUS_VALID.getValue());
    }

    @Override // X.InterfaceC1070470dxl
    public final boolean LIZIZ() {
        SocialPlatformSetting next;
        List<SocialPlatformSetting> socialPlatformSettings = C0XQ7.LJFF().getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings == null) {
            return false;
        }
        Iterator<SocialPlatformSetting> it2 = socialPlatformSettings.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.getSocialPlatform() == 1) {
                break;
            }
        }
        SocialPlatformSetting socialPlatformSetting = next;
        if (socialPlatformSetting != null) {
            return socialPlatformSetting.getEmailAdsDisclosure();
        }
        return false;
    }

    @Override // X.InterfaceC1070470dxl
    public final boolean LJ() {
        return C0XQ7.LJFF().LIZLLL() && LIZIZ();
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
                    if (next.getSocialPlatform() == 1) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SocialPlatformSetting socialPlatformSetting = next;
            if (socialPlatformSetting != null) {
                socialPlatformSetting.setEmailAdsDisclosure(z);
                iAccountUserServiceLJFF.LJIJ();
            }
        }
    }
}
