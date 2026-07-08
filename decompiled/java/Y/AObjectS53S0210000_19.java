package Y;

import X.C0TTZ;
import X.C1389890mGx;
import X.C19292910dr;
import X.C19319810iC;
import android.view.View;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AObjectS53S0210000_19 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS53S0210000_19 aObjectS53S0210000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS53S0210000_19.l0;
        boolean z = aObjectS53S0210000_19.z2;
        View view = (View) aObjectS53S0210000_19.l1;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        if (((Boolean) obj).booleanValue()) {
            C0TTZ c0ttz = C0TTZ.LIZ;
            C19292910dr c19292910dr = i18nSettingManageMyAccountActivity.LLJLL;
            C19319810iC c19319810iC = i18nSettingManageMyAccountActivity.LLJLLIL;
            c0ttz.getClass();
            C19319810iC c19319810iCLIZLLL = C0TTZ.LIZLLL(c19292910dr, c19319810iC, z);
            i18nSettingManageMyAccountActivity.LLJLLIL = c19319810iCLIZLLL;
            i18nSettingManageMyAccountActivity.LLJLLL.LJFF(c19319810iCLIZLLL.LLJJIJIL);
            return null;
        }
        C0TTZ c0ttz2 = C0TTZ.LIZ;
        C19292910dr c19292910dr2 = i18nSettingManageMyAccountActivity.LLJLL;
        C19319810iC c19319810iC2 = i18nSettingManageMyAccountActivity.LLJLLIL;
        c0ttz2.getClass();
        i18nSettingManageMyAccountActivity.LLJLLIL = C0TTZ.LJ(c19292910dr2, c19319810iC2, false, true, false);
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIIZ(2131848597);
        c1389890mGx.LJIIJJI();
        return null;
    }

    public static final Object invoke$1(AObjectS53S0210000_19 aObjectS53S0210000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aObjectS53S0210000_19.l0;
        boolean z = aObjectS53S0210000_19.z2;
        View view = (View) aObjectS53S0210000_19.l1;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        if (((Boolean) obj).booleanValue()) {
            C0TTZ c0ttz = C0TTZ.LIZ;
            C19292910dr c19292910dr = i18nSettingManageMyAccountActivity.LLJZ;
            C19319810iC c19319810iC = i18nSettingManageMyAccountActivity.LLJZIJLIL;
            c0ttz.getClass();
            C19319810iC c19319810iCLIZLLL = C0TTZ.LIZLLL(c19292910dr, c19319810iC, z);
            i18nSettingManageMyAccountActivity.LLJZIJLIL = c19319810iCLIZLLL;
            i18nSettingManageMyAccountActivity.LLL.LJFF(c19319810iCLIZLLL.LLJJIJIL);
            C19292910dr c19292910dr2 = i18nSettingManageMyAccountActivity.LLJZ;
            Boolean bool = Boolean.FALSE;
            c19292910dr2.LIZ(bool, Boolean.valueOf(!i18nSettingManageMyAccountActivity.LLJZIJLIL.LLJJIJIL));
            i18nSettingManageMyAccountActivity.LLL.LIZ(bool, Boolean.valueOf(i18nSettingManageMyAccountActivity.LLJZIJLIL.LLJJIJIL));
            return null;
        }
        C0TTZ c0ttz2 = C0TTZ.LIZ;
        C19292910dr c19292910dr3 = i18nSettingManageMyAccountActivity.LLJZ;
        C19319810iC c19319810iC2 = i18nSettingManageMyAccountActivity.LLJZIJLIL;
        c0ttz2.getClass();
        i18nSettingManageMyAccountActivity.LLJZIJLIL = C0TTZ.LJ(c19292910dr3, c19319810iC2, false, false, z);
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIIZ(2131848597);
        c1389890mGx.LJIIJJI();
        return null;
    }

    public AObjectS53S0210000_19(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, boolean z, View view, int i) {
        this.$t = i;
        this.l0 = i18nSettingManageMyAccountActivity;
        this.z2 = z;
        this.l1 = view;
    }
}
