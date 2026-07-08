package X;

import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import kotlin.jvm.internal.AwS109S0201000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.1033, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AnonymousClass1033 extends C191981108t {
    public final C01GW LLJILJIL;

    public abstract String LJJIIJ();

    public AnonymousClass1033(C191848103q c191848103q, C107O c107o) {
        super(c191848103q, c107o);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(c191848103q, 1031));
    }

    @Override // X.AbstractC191963108b
    public boolean LJIL(int i, View view) {
        String userId;
        if (i != 1) {
            return false;
        }
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService == null || (userId = iPrivacySettingsDepService.getUserId()) == null) {
            userId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("has_show_dialog_for_sug_");
        sbLIZ.append(userId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (((Keva) this.LLJILJIL.getValue()).getBoolean(strLIZIZ, false)) {
            return false;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(this.LLJ.LIZ);
        c1397580mTM.LJFF(2131844911);
        c1397580mTM.LIZ(2131844910);
        C985403tE.LIZ(c1397580mTM, new AwS109S0201000_28(this, view, i, 14));
        new C1397510mTF(c1397580mTM).LIZLLL();
        ((Keva) this.LLJILJIL.getValue()).storeBoolean(strLIZIZ, true);
        C1076800e7y c1076800e7y = C1076800e7y.LIZ;
        String strLJJIIJ = LJJIIJ();
        c1076800e7y.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("account_type", strLJJIIJ);
        C20684815ws.LJIILLIIL("account_auth_pop_up", c2344009Gk.LIZ);
        return true;
    }

    @Override // X.C191981108t
    public final void LJJIFFI(int i, View view) {
        String str;
        super.LJJIFFI(i, view);
        C1076800e7y c1076800e7y = C1076800e7y.LIZ;
        String strLJJIIJ = LJJIIJ();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        c1076800e7y.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("account_type", strLJJIIJ);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c2344009Gk.LJIIIIZZ("to_status", str);
        C20684815ws.LJIILLIIL("account_auth_switch", c2344009Gk.LIZ);
    }
}
