package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0e1F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072630e1F implements InterfaceC1070570dxv {
    public static final C1072630e1F LIZ = new C1072630e1F();

    @Override // X.InterfaceC1070570dxv
    public final boolean LJ() {
        try {
            C844470XAv.LIZ.getClass();
            return C838410Wul.LIZ(C844470XAv.LIZ(), "android.permission.READ_CONTACTS") != -1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // X.InterfaceC1070570dxv
    public final boolean LIZIZ() {
        List<SocialPlatformSetting> socialPlatformSettings = C0XQ7.LJFF().getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings == null) {
            return false;
        }
        for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
            if (socialPlatformSetting.getSocialPlatform() == 1) {
                return socialPlatformSetting.getSyncStatus();
            }
        }
        return false;
    }

    @Override // X.InterfaceC1070570dxv
    public final boolean LIZJ() {
        return LIZIZ() && LJ();
    }

    @Override // X.InterfaceC1070570dxv
    public final void LJFF(boolean z) {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        List<SocialPlatformSetting> socialPlatformSettings = iAccountUserServiceLJFF.getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    socialPlatformSetting.setSyncStatus(z);
                    iAccountUserServiceLJFF.LJIJ();
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
