package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.IPrivacyService;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;

/* JADX INFO: renamed from: X.10Ic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19222410Ic {
    public final CommonSettingItemStatus LIZ;
    public boolean LIZIZ;

    public C19222410Ic(CommonSettingItemStatus commonSettingItemStatus) {
        this.LIZ = commonSettingItemStatus;
    }

    public final void LIZ(C19222610Ie c19222610Ie) {
        int i;
        boolean z;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, c19222610Ie.LIZ);
        boolean z2 = false;
        if (privacySettingsRestrictionItemLJIIIZ != null) {
            i = privacySettingsRestrictionItemLJIIIZ.showType;
        } else {
            i = 0;
        }
        boolean zLIZJ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ();
        if (c19222610Ie.LIZIZ && i != 2) {
            this.LIZ._visibility.setValue(0);
            if ((!zLIZJ || c19222610Ie.LJ == 0) && i != 1 && ((!c19222610Ie.LJIIJJI || c19222610Ie.LJFF == 0) && !C1443970ngB.LIZJ(c19222610Ie.LIZLLL) && !c19222610Ie.LJIIIIZZ && !c19222610Ie.LJII)) {
                z = false;
            } else {
                z = true;
            }
            this.LIZIZ = z;
            if (z) {
                this.LIZ._alpha.setValue(Float.valueOf(0.4f));
                this.LIZ._isDisabled = this.LIZIZ;
            } else {
                this.LIZ._alpha.setValue(Float.valueOf(1.0f));
            }
            MutableLiveData<Boolean> mutableLiveData = this.LIZ._checked;
            if (c19222610Ie.LIZJ && !this.LIZIZ) {
                z2 = true;
            }
            mutableLiveData.setValue(Boolean.valueOf(z2));
            if (c19222610Ie.LJIIL) {
                this.LIZ._alpha.setValue(Float.valueOf(0.4f));
                CommonSettingItemStatus commonSettingItemStatus = this.LIZ;
                commonSettingItemStatus._isDisabled = true;
                commonSettingItemStatus._checked.setValue(Boolean.FALSE);
            }
            this.LIZ.setOnClickListener(new C19222510Id(this, c19222610Ie, i, zLIZJ, privacySettingsRestrictionItemLJIIIZ));
            return;
        }
        this.LIZ._visibility.setValue(8);
    }
}
