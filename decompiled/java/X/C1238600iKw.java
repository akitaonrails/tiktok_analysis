package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;

/* JADX INFO: renamed from: X.0iKw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238600iKw {
    public final I18nSettingManageMyAccountActivity LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public C1238600iKw(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        Boolean boolLJIILIIL;
        Boolean boolLJJIIJ;
        Boolean boolLJIJJ;
        Boolean boolLJFF;
        this.LIZ = i18nSettingManageMyAccountActivity;
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        boolean zBooleanValue4 = false;
        if (iAccountUserService != null && (boolLJFF = iAccountUserService.LJFF()) != null) {
            zBooleanValue = boolLJFF.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LIZIZ = zBooleanValue;
        IAccountUserService iAccountUserService2 = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if (iAccountUserService2 != null && (boolLJIJJ = iAccountUserService2.LJIJJ()) != null) {
            zBooleanValue2 = boolLJIJJ.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        this.LIZJ = zBooleanValue2;
        IAccountUserService iAccountUserService3 = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if (iAccountUserService3 != null && (boolLJJIIJ = iAccountUserService3.LJJIIJ()) != null) {
            zBooleanValue3 = boolLJJIIJ.booleanValue();
        } else {
            zBooleanValue3 = false;
        }
        this.LIZLLL = zBooleanValue3;
        IAccountUserService iAccountUserService4 = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        if (iAccountUserService4 != null && (boolLJIILIIL = iAccountUserService4.LJIILIIL()) != null) {
            zBooleanValue4 = boolLJIILIIL.booleanValue();
        }
        this.LJ = zBooleanValue4;
    }
}
