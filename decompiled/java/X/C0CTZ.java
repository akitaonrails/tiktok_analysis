package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.popupclean.FCPPopupEnableRule;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CTZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CTZ extends C09AY implements Function0<FCPPopupEnableRule> {
    public C0CTZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final FCPPopupEnableRule invoke() {
        C314140CTc.LIZ.getClass();
        try {
            FCPPopupEnableRule fCPPopupEnableRule = (FCPPopupEnableRule) SettingsManager.LIZLLL().LJIIIIZZ("fcp_popup_enable_rules", FCPPopupEnableRule.class, null);
            if (fCPPopupEnableRule == null) {
                fCPPopupEnableRule = null;
            } else {
                fCPPopupEnableRule.setConfigType(EnumC314120CTa.COMMON);
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0CTY(fCPPopupEnableRule, null), 3);
            if (fCPPopupEnableRule != null && fCPPopupEnableRule.popups != null) {
                return fCPPopupEnableRule;
            }
            String string = C314140CTc.LIZIZ.getString("new_fcp_popup_rules", "");
            if (C1533950q1J.LJ(string)) {
                C1227904rF.LIZ.getClass();
                FCPPopupEnableRule fCPPopupEnableRule2 = (FCPPopupEnableRule) GsonProtectorUtils.fromJson(C1227904rF.LIZLLL(), string, FCPPopupEnableRule.class);
                if (fCPPopupEnableRule2 != null) {
                    fCPPopupEnableRule2.setConfigType(EnumC314120CTa.LOCAL_STORAGE);
                    if (fCPPopupEnableRule2.popups != null) {
                        return fCPPopupEnableRule2;
                    }
                }
            }
            C1227904rF.LIZ.getClass();
            FCPPopupEnableRule fCPPopupEnableRule3 = (FCPPopupEnableRule) GsonProtectorUtils.fromJson(C1227904rF.LIZLLL(), "{}", FCPPopupEnableRule.class);
            fCPPopupEnableRule3.setConfigType(EnumC314120CTa.LOCAL_CODE);
            return fCPPopupEnableRule3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C20651915rZ.LIZIZ("get fcp popup config failed, e: " + e);
            C805380Via.LIZJ(e, "popup_enable_settings");
            return new FCPPopupEnableRule(C13BV.INSTANCE);
        }
    }
}
