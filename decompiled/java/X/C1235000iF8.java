package X;

import Y.AObjectS362S0100000_19;
import android.app.Dialog;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iF8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235000iF8 extends C1235030iFB {
    public final /* synthetic */ C1397620mTQ LIZ;
    public final /* synthetic */ Dialog LIZIZ;
    public final /* synthetic */ I18nSettingManageMyAccountActivity LIZJ;

    @Override // X.C1235030iFB
    public final void LIZ() {
        C786410Ut5.LIZIZ(this.LIZIZ);
    }

    @Override // X.C1235030iFB
    public final void LIZJ(VerificationResponse verificationResponse) {
        StringBuilder sb = new StringBuilder(this.LIZJ.getString(2131857880));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n");
        String bindPhone = this.LIZJ.LL.getBindPhone();
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZLLL(bindPhone);
        sbLIZ.append((Object) c1360520lVa.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.LIZJ;
        C1397580mTM c1397580mTM = new C1397580mTM(i18nSettingManageMyAccountActivity);
        c1397580mTM.LJI(i18nSettingManageMyAccountActivity.getString(2131857882, strLIZIZ));
        c1397580mTM.LIZIZ(sb.toString());
        c1397580mTM.LJIIL = this.LIZ;
        c1397580mTM.LJIIIZ = new C340190DVh(R.raw.icon_phone, 0, this.LIZJ, Integer.valueOf(R.attr.a1h));
        c1397580mTM.LJIIIIZZ = false;
        c1397580mTM.LIZLLL(new AObjectS362S0100000_19(this, 3));
        c1397580mTM.LJII = true;
        if (verificationResponse.shouldShowChangeMobileDialog()) {
            TuxTextView tuxTextView = new TuxTextView(this.LIZJ);
            tuxTextView.setText(this.LIZJ.getString(2131857881));
            tuxTextView.setTuxFont(41);
            tuxTextView.setTextColorRes(R.attr.a1j);
            tuxTextView.setGravity(17);
            c1397580mTM.LJIIJJI = new C1054540dY4(tuxTextView);
        }
        new C1397510mTF(c1397580mTM).LIZLLL();
        this.LIZJ.LLZZ(true);
    }

    public C1235000iF8(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, C1397620mTQ c1397620mTQ, DialogC1237620iJM dialogC1237620iJM) {
        this.LIZJ = i18nSettingManageMyAccountActivity;
        this.LIZ = c1397620mTQ;
        this.LIZIZ = dialogC1237620iJM;
    }
}
