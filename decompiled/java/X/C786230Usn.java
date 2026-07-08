package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.privacy.setting.tpsc.account.ui.privateaccount.QuitBaAccountProcessor;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Usn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786230Usn implements C0XTR {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C0XTR
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                break;
            case 1:
                onResult$1(this, i, i2, obj);
                break;
        }
    }

    public C786230Usn(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onResult$0(C786230Usn c786230Usn, int i, int i2, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) c786230Usn.l0;
        C1397510mTF c1397510mTF = (C1397510mTF) c786230Usn.l1;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        if (i == 14 && i2 == 1) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJI();
            IPrivacyService iPrivacyServiceLJIJJ = ComplianceServiceProvider.LJIJJ();
            if (iPrivacyServiceLJIJJ.LJJIFFI()) {
                iPrivacyServiceLJIJJ.LJJIIJ("switch_pro_account");
            } else {
                iPrivacyServiceLJIJJ.LJJIIJZLJL("switch_pro_account");
                iPrivacyServiceLJIJJ.LJIILJJIL();
            }
            i18nSettingManageMyAccountActivity.i(true);
            C1389890mGx c1389890mGx = new C1389890mGx(i18nSettingManageMyAccountActivity);
            c1389890mGx.LJIIJ(i18nSettingManageMyAccountActivity.getResources().getString(2131849427));
            c1389890mGx.LJIIJJI();
            ((ISettingManagerService) ServiceManager.get().getService(ISettingManagerService.class)).LIZIZ(1);
            C20684815ws.LJIILLIIL("switch_to_personal_account_success", new HashMap());
        } else {
            C1233040iBy c1233040iBy = new C1233040iBy(i18nSettingManageMyAccountActivity);
            c1233040iBy.LIZIZ(2131837963);
            c1233040iBy.LIZLLL();
        }
        if (c1397510mTF != null && c1397510mTF.LJIIIZ()) {
            c1397510mTF.LIZIZ(null);
        }
    }

    public static final void onResult$1(C786230Usn c786230Usn, int i, int i2, Object obj) {
        if (i == 14 && i2 == 1) {
            C191819102n.LIZ.getClass();
            C191819102n.LJ().LJIIJ().LJI();
            ((QuitBaAccountProcessor) c786230Usn.l0).LIZIZ.invoke(2131845252);
            C1440005kM.LIZ(new IEvent() { // from class: X.0859
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        } else {
            ((QuitBaAccountProcessor) c786230Usn.l0).LIZIZ.invoke(2131837963);
        }
        DialogInterface dialogInterface = (DialogInterface) c786230Usn.l1;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
