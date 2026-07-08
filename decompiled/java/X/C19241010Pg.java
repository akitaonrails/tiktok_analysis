package X;

import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PreLoginConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Pg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19241010Pg extends C10P5<C1869020yjk> {
    public static boolean LJI;
    public C11JF LJFF;

    @Override // X.C10P5
    public final void LJ() {
        C11JF c11jf = this.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJFF = null;
        super.LJ();
    }

    public final boolean LJI() {
        C10PK c10pk = (C10PK) this.LIZ.LIZIZ(C10PK.class);
        if (c10pk != null) {
            c10pk.D92();
        }
        C1911410zq7.LIZ("canSkip", String.valueOf(LJII()));
        if (LJII() == EnumC19242110Pr.SKIPABLE.getValue() || LJII() == EnumC19242110Pr.SKIPABLE_AGEGATE_CONSENT.getValue() || LJII() == EnumC19242110Pr.SKIPABLE_CONSENT.getValue()) {
            C1911410zq7.LIZ("canSkip", "can show skip");
            return true;
        }
        String storeRegionUpperCase = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase();
        C19315910hZ.LIZ.getClass();
        if (C19315910hZ.LJIIJ.contains(storeRegionUpperCase)) {
            C1911410zq7.LIZ("canSkip", "5region");
            return false;
        }
        C1911410zq7.LIZ("canSkip", "default");
        return false;
    }

    public static int LJII() {
        IPluginService.PluginData next;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        Iterator<IPluginService.PluginData> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginListPluginData().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.id == EnumC19241510Pl.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                break;
            }
        }
        IPluginService.PluginData pluginData = next;
        if (pluginData == null || (pluginDataWrapper = pluginData.configData) == null || (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) == null) {
            return 0;
        }
        return personalizedNUJV2Data.smartLoginType;
    }

    @Override // X.C10P7
    public final C10NW type() {
        return C10NW.JOURNEY_LOGIN_ID;
    }

    public C19241010Pg(C1912470zrp c1912470zrp, C10P6 c10p6) {
        super(c1912470zrp, c10p6);
    }

    @Override // X.C10P5, X.C10P7
    public final void LIZLLL(C1912470zrp c1912470zrp, C1869040yjm c1869040yjm, Function1 function1) {
        Boolean boolValueOf;
        Boolean bool;
        C1912950zsb c1912950zsb;
        final boolean z;
        IPluginService.PluginData next;
        IPluginService.PluginDataWrapper pluginDataWrapper;
        PersonalizedNUJV2Data personalizedNUJV2Data;
        PreLoginConfig preLoginConfig;
        Integer num;
        C1869020yjk c1869020yjk = (C1869020yjk) c1869040yjm;
        super.LIZLLL(c1912470zrp, c1869020yjk, function1);
        if (LJI()) {
            if (LJII() == EnumC19242110Pr.SKIPABLE_AGEGATE_CONSENT.getValue()) {
                C10OB.LIZ.getClass();
                C10OB.LIZIZ("agegate_consentbox_skipable");
            } else {
                C10OB.LIZ.getClass();
                C10OB.LIZIZ("only_consentbox_skipable");
            }
        } else {
            C10OB.LIZ.getClass();
            C10OB.LIZIZ("forced_login");
        }
        C10OB.LIZ.getClass();
        C10OB.LIZ();
        C1912950zsb c1912950zsb2 = null;
        if (c1869020yjk != null) {
            boolValueOf = Boolean.valueOf(c1869020yjk.LIZIZ);
        } else {
            boolValueOf = null;
        }
        C10PK c10pk = (C10PK) this.LIZ.LIZIZ(C10PK.class);
        if (c10pk != null) {
            c10pk.qU();
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasMultipleSmartLockAccount:");
        sbLIZ.append(bool);
        sbLIZ.append(",shouldTrySmartLock:");
        sbLIZ.append(boolValueOf);
        C1911410zq7.LIZ("LoginComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).LIZIZ()) {
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LIZJ().showFTCCreateAccountView(c1912470zrp.LIZ.LIZIZ(), true);
            return;
        }
        C1912930zsZ c1912930zsZ = C1912930zsZ.LIZ;
        C10NW c10nw = C10NW.JOURNEY_LOGIN_ID;
        c1912930zsZ.getClass();
        C1912940zsa c1912940zsaLIZ = C1912930zsZ.LIZ(c10nw);
        if (c1912940zsaLIZ != null) {
            c1912950zsb = c1912940zsaLIZ.LIZJ;
        } else {
            c1912950zsb = null;
        }
        C1912930zsZ.LIZJ(c1912950zsb);
        Boolean bool2 = Boolean.TRUE;
        final int iIntValue = 0;
        if (Intrinsics.LJFF(boolValueOf, bool2) && Intrinsics.LJFF(bool, bool2)) {
            z = true;
        } else {
            z = false;
        }
        final boolean zLJI = LJI();
        if (LJI()) {
            Iterator<IPluginService.PluginData> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginListPluginData().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.id == EnumC19241510Pl.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            IPluginService.PluginData pluginData = next;
            if (pluginData != null && (pluginDataWrapper = pluginData.configData) != null && (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) != null && (preLoginConfig = personalizedNUJV2Data.preLoginConfig) != null && (num = preLoginConfig.loginSignupPanelSkipStyle) != null) {
                iIntValue = num.intValue();
            }
        }
        C1911410zq7.LIZ("LoginComponent", "showMandatoryLoginPage");
        final IMandatoryLoginService iMandatoryLoginService = (IMandatoryLoginService) ServiceManager.get().getService(IMandatoryLoginService.class);
        C587550N2r.LIZIZ(new Runnable() { // from class: X.10Ph
            public final void LIZ() {
                List<IPluginService.PluginData> currentPluginListPluginData;
                IPluginService.PluginData next2;
                IPluginService.PluginDataWrapper pluginDataWrapper2;
                PersonalizedNUJV2Data personalizedNUJV2Data2;
                PreLoginConfig preLoginConfig2;
                Integer num2;
                C1911410zq7.LIZJ("LoginComponent", "showMandatoryLoginPage run...");
                Bundle loginActivityBundle = iMandatoryLoginService.getLoginActivityBundle();
                loginActivityBundle.putBoolean("is_from_new_user_journey", true);
                loginActivityBundle.putBoolean("is_skippable_dialog", zLJI);
                loginActivityBundle.putBoolean("is_express_login", z);
                loginActivityBundle.putInt("skip_style", iIntValue);
                this.getClass();
                int iIntValue2 = 0;
                IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
                if (iPluginService != null && (currentPluginListPluginData = iPluginService.getCurrentPluginListPluginData()) != null) {
                    Iterator<IPluginService.PluginData> it3 = currentPluginListPluginData.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        } else {
                            next2 = it3.next();
                            if (next2.id == EnumC19241510Pl.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                                break;
                            }
                        }
                    }
                    IPluginService.PluginData pluginData2 = next2;
                    if (pluginData2 != null && (pluginDataWrapper2 = pluginData2.configData) != null && (personalizedNUJV2Data2 = pluginDataWrapper2.personalizedNUJV2Data) != null && (preLoginConfig2 = personalizedNUJV2Data2.preLoginConfig) != null && (num2 = preLoginConfig2.loginSignupPanelType) != null) {
                        iIntValue2 = num2.intValue();
                    }
                }
                if (iIntValue2 == 1) {
                    loginActivityBundle.putBoolean("show_login_page_first", false);
                } else if (iIntValue2 == 2) {
                    loginActivityBundle.putBoolean("show_login_page_first", true);
                }
                C19233810Mm.LIZ.getClass();
                if (Intrinsics.LJFF(((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF(), "revamp_skip")) {
                    loginActivityBundle.putBoolean("is_disable_animation", true);
                    loginActivityBundle.putBoolean("is_disable_ocl_loading", true);
                }
                Keva keva = C10Q2.LIZ;
                keva.storeLong("mandatory_login_shown_millis", System.currentTimeMillis());
                keva.storeInt("mandatory_login_status", 1);
                C19EG c19egLIZIZ = this.LIZ.LIZ.LIZIZ();
                if (c19egLIZIZ.isFinishing() || c19egLIZIZ.isDestroyed()) {
                    C1911410zq7.LIZLLL("LoginComponent", "showMandatoryLoginPage but activity is not active");
                    return;
                }
                C0XQS c0xqs = new C0XQS();
                c0xqs.LIZ = c19egLIZIZ;
                c0xqs.LIZIZ = "cold_launch";
                c0xqs.LIZJ = "welcome_screen";
                if (z) {
                    c0xqs.LIZIZ = "click_login";
                }
                c0xqs.LIZLLL = loginActivityBundle;
                c0xqs.LJ = new C19334710kb(iMandatoryLoginService, this, 5);
                ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LIZJ().showLoginAndRegisterView(new C0XQT(c0xqs));
                C2211631BhB.LJIILL("b4905", null);
                C1848530yCh.LIZIZ("nuj_login", AFwS248S0000000_14.get$arr$(526), 62);
                C19241010Pg.LJI = true;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NewLoginComponent@ac04.showMandatoryLoginPage$showMandatoryLoginPageRunnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NewLoginComponent@ac04.showMandatoryLoginPage$showMandatoryLoginPageRunnable$1");
            }
        });
        C1912930zsZ c1912930zsZ2 = C1912930zsZ.LIZ;
        C10NW c10nw2 = C10NW.JOURNEY_LOGIN_ID;
        c1912930zsZ2.getClass();
        C1912940zsa c1912940zsaLIZ2 = C1912930zsZ.LIZ(c10nw2);
        if (c1912940zsaLIZ2 != null) {
            c1912950zsb2 = c1912940zsaLIZ2.LIZJ;
        }
        C1912930zsZ.LIZIZ(c1912950zsb2);
    }
}
