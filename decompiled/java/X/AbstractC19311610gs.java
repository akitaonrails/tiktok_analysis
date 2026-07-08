package X;

import Y.ACListenerS162S0100000_28;
import Y.ACListenerS89S1100000_28;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.IUnifiedAccountSdkConfigService;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.10gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC19311610gs implements InterfaceC19312510h1 {
    public final BaseActivity LIZ;
    public final InterfaceC19315610hW LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 1086));

    public abstract Bundle LJIILJJIL();

    @Override // X.InterfaceC19312510h1
    public final void LJIIIIZZ() {
        C849700XUy c849700XUy = C849700XUy.LIZ;
        WeakReference weakReference = new WeakReference(this.LIZ);
        String enterMethod = LJIILIIL().getEnterMethod();
        c849700XUy.getClass();
        if (C849700XUy.LIZ(enterMethod, weakReference) && Intrinsics.LJFF("US", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).getStoreRegionUpperCase())) {
            C849690XUx.LIZ(LJIILIIL().getEnterFrom(), LJIILIIL().getEnterMethod());
            ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi$default(ICredentialManagerService.class, false, false, false, 14, null);
            if (iCredentialManagerService != null) {
                iCredentialManagerService.LJIL(this.LIZ, C05X2.GOOGLE_ONETAP, new C1BV9(LJIILIIL().getEnterFrom(), LJIILIIL().getEnterMethod(), "auto_pop", "google_onetap", "", LJIILJJIL()), null);
            }
        }
    }

    public final SignupViewModel LJIILIIL() {
        return (SignupViewModel) this.LIZJ.getValue();
    }

    public final boolean LJIILL() {
        FragmentManager supportFragmentManager;
        BaseActivity baseActivity = this.LIZ;
        if (!(baseActivity instanceof C19EG)) {
            baseActivity = null;
        }
        return (baseActivity == null || (supportFragmentManager = baseActivity.getSupportFragmentManager()) == null || supportFragmentManager.LJJLIIIIJ() <= 0) ? false : true;
    }

    @Override // X.InterfaceC19312510h1
    public final void LIZJ() {
        if (LJIILIIL().IQ2()) {
            return;
        }
        ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) ServiceManager.get().getService(ICredentialManagerService.class);
        iCredentialManagerService.LJIL(this.LIZ, iCredentialManagerService.LJIIJ() ? C05X2.PASSKEY_AND_GOOGLE_ONETAP : C05X2.PASSKEY, new C1BV9(LJIILIIL().getEnterFrom(), LJIILIIL().getEnterMethod(), "click_login", iCredentialManagerService.LJIIJ() ? "passkey_google_onetap" : "passkey_login", "", LJIILJJIL()), null);
    }

    public final void LJIJJLI() {
        TuxIconView tuxIconView;
        TuxIconView tuxIconView2;
        TuxIconView tuxIconView3;
        TuxIconView tuxIconView4;
        boolean zQQ2 = LJIILIIL().QQ2();
        Integer numValueOf = Integer.valueOf(R.attr.a1h);
        if (zQQ2) {
            if (LJIILIIL().NQ2() && !((Boolean) LJIILIIL().LLLILZ.getValue()).booleanValue()) {
                LJIJJ(LJIILIIL().HQ2().LIZJ);
                if (((Number) LJIILIIL().LLLIZZ.getValue()).intValue() == 1 || ((Number) LJIILIIL().LLLIZZ.getValue()).intValue() == 0) {
                    C786410Ut5.LLLLZLL(LJIILIIL().HQ2().LJ, 0);
                }
                if (LJIILIIL().PQ2()) {
                    LJIILIIL().HQ2().LJ.setTextColorRes(R.attr.a1h);
                }
                C786410Ut5.h9(LJIILIIL().HQ2().LJ, new ACListenerS162S0100000_28(this, 200));
                return;
            }
            if (C294020Bfk.LIZ() && LJIILL()) {
                TuxIconView tuxIconView5 = LJIILIIL().HQ2().LIZJ;
                C786410Ut5.a9(tuxIconView5, new ACListenerS162S0100000_28(this, 201));
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
                c419910GdJ.LJ = numValueOf;
                tuxIconView5.setTuxIcon(c419910GdJ);
                C786410Ut5.LLLLLLZZ(tuxIconView5, 0);
                LJIJJ(LJIILIIL().HQ2().LIZLLL);
                return;
            }
            TuxIconView tuxIconView6 = LJIILIIL().HQ2().LIZLLL;
            C786410Ut5.a9(tuxIconView6, new ACListenerS162S0100000_28(this, 202));
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_x_mark;
            c419910GdJ2.LJ = numValueOf;
            tuxIconView6.setTuxIcon(c419910GdJ2);
            C786410Ut5.LLLLLLZZ(tuxIconView6, 0);
            tuxIconView6.setContentDescription(tuxIconView6.getContext().getString(2131824445));
            LJIJJ(LJIILIIL().HQ2().LIZJ);
            return;
        }
        C19313410hA c19313410hAHQ2 = LJIILIIL().HQ2();
        if (c19313410hAHQ2 != null && (tuxIconView4 = c19313410hAHQ2.LIZLLL) != null) {
            LJIJJ(tuxIconView4);
        }
        if (C294020Bfk.LIZ() && LJIILL()) {
            C19313410hA c19313410hAHQ22 = LJIILIIL().HQ2();
            if (c19313410hAHQ22 == null || (tuxIconView3 = c19313410hAHQ22.LIZJ) == null) {
                return;
            }
            C786410Ut5.a9(tuxIconView3, new ACListenerS162S0100000_28(this, 198));
            C419910GdJ c419910GdJ3 = new C419910GdJ();
            c419910GdJ3.LIZ = R.raw.icon_chevron_left_offset_ltr;
            c419910GdJ3.LJ = numValueOf;
            tuxIconView3.setTuxIcon(c419910GdJ3);
            C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            return;
        }
        IOneClickLoginService iOneClickLoginService = (IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class);
        if (LJI() || !iOneClickLoginService.LJIIJ(null)) {
            C19313410hA c19313410hAHQ23 = LJIILIIL().HQ2();
            if (c19313410hAHQ23 == null || (tuxIconView = c19313410hAHQ23.LIZJ) == null) {
                return;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            return;
        }
        C19313410hA c19313410hAHQ24 = LJIILIIL().HQ2();
        if (c19313410hAHQ24 == null || (tuxIconView2 = c19313410hAHQ24.LIZJ) == null) {
            return;
        }
        C786410Ut5.a9(tuxIconView2, new ACListenerS162S0100000_28(this, 199));
        C419910GdJ c419910GdJ4 = new C419910GdJ();
        c419910GdJ4.LIZ = R.raw.icon_chevron_left_offset_ltr;
        c419910GdJ4.LJ = numValueOf;
        tuxIconView2.setTuxIcon(c419910GdJ4);
        C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
    }

    @Override // X.InterfaceC19312510h1
    public void LJIIJ(Bundle bundle) {
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).tryInit();
        this.LIZ.activityConfiguration(new AwS607S0100000_28(this, 387));
        LJIJJLI();
    }

    public final void LJIIL(Bundle bundle) {
        bundle.putBoolean("is_from_new_user_journey", LJIILIIL().NQ2());
        bundle.putBoolean("age_gate_block", ((Boolean) LJIILIIL().LLLJ.getValue()).booleanValue());
        bundle.putBoolean("is_fullscreen", LJIILIIL().OQ2());
        bundle.putBoolean("is_expandable_dialog", LJIILIIL().MQ2());
        C786410Ut5.LJJJI("enter_from", LJIILIIL().getEnterFrom(), bundle);
        C786410Ut5.LJJJI("channel", (String) LJIILIIL().LLJJIJI.getValue(), bundle);
        C786410Ut5.LJJJI("enter_method", LJIILIIL().getEnterMethod(), bundle);
        C786410Ut5.LJJJI("enter_type", LJIILIIL().yQ2(), bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILLIIL(String str) {
        boolean z;
        String strYQ2;
        int i;
        if (LJIILIIL().yQ2().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            strYQ2 = LJIILIIL().yQ2();
        } else if (Intrinsics.LJFF(str, "signup")) {
            strYQ2 = "click_sign_up";
        } else if (Intrinsics.LJFF(str, "login")) {
            strYQ2 = "click_login";
        } else {
            strYQ2 = "oneclick_login";
        }
        int iHashCode = str.hashCode();
        String str2 = "";
        if (iHashCode != -1350107752) {
            if (iHashCode != -902467304) {
                if (iHashCode == 103149417 && str.equals("login")) {
                    C852170Xbr c852170Xbr = C852170Xbr.LIZ;
                    Bundle bundleZQ2 = LJIILIIL().zQ2();
                    c852170Xbr.getClass();
                    Map mapLJI = C852170Xbr.LJI(bundleZQ2);
                    if (mapLJI == null) {
                        mapLJI = new LinkedHashMap();
                    }
                    if (!TextUtils.isEmpty((String) LJIILIIL().LLJJI.getValue())) {
                        mapLJI.put("force_login_trigger", LJIILIIL().LLJJI.getValue());
                    }
                    mapLJI.put("is_skippable", Integer.valueOf(LJIILIIL().QQ2() ? 1 : 0));
                    C786410Ut5.LJJJI("enter_type", strYQ2, LJIILIIL().GQ2());
                    String enterFrom = LJIILIIL().getEnterFrom();
                    String enterMethod = LJIILIIL().getEnterMethod();
                    String string = LJIILIIL().zQ2().getString("channel");
                    if (string == null) {
                        string = "";
                    }
                    List<? extends C1687890u1b> list = LJIILIIL().LLILZLL;
                    int size = LJIILIIL().LLILZLL.size() - 1;
                    String str3 = (String) LJIILIIL().LLJJIJIIJIL.getValue();
                    String str4 = (String) LJIILIIL().LLJJIJIL.getValue();
                    String strBQ2 = LJIILIIL().BQ2();
                    Bundle bundleZQ22 = LJIILIIL().zQ2();
                    boolean zOQ2 = LJIILIIL().OQ2();
                    String str5 = (String) LJIILIIL().LLJJJ.getValue();
                    if (str5 != null) {
                        str2 = str5;
                    }
                    LJIIZILJ(enterFrom, enterMethod, strYQ2, string, mapLJI, list, size, str3, str4, strBQ2, bundleZQ22, zOQ2, str2);
                    return;
                }
                return;
            }
            if (!str.equals("signup")) {
                return;
            }
            C852170Xbr c852170Xbr2 = C852170Xbr.LIZ;
            Bundle bundleGQ2 = LJIILIIL().GQ2();
            c852170Xbr2.getClass();
            Map mapLJI2 = C852170Xbr.LJI(bundleGQ2);
            if (mapLJI2 == null) {
                mapLJI2 = new LinkedHashMap();
            }
            if (!TextUtils.isEmpty((String) LJIILIIL().LLJJI.getValue())) {
                mapLJI2.put("force_login_trigger", LJIILIIL().LLJJI.getValue());
            }
            mapLJI2.put("is_skippable", Integer.valueOf(LJIILIIL().QQ2() ? 1 : 0));
            C786410Ut5.LJJJI("enter_type", strYQ2, LJIILIIL().GQ2());
            String enterFrom2 = LJIILIIL().getEnterFrom();
            String enterMethod2 = LJIILIIL().getEnterMethod();
            String string2 = LJIILIIL().GQ2().getString("channel");
            if (string2 == null) {
                string2 = "";
            }
            List<? extends C1687890u1b> list2 = LJIILIIL().LLIZ;
            int iLIZ = LIZ(true);
            String str6 = (String) LJIILIIL().LLJJIJIIJIL.getValue();
            String str7 = (String) LJIILIIL().LLJJIJIL.getValue();
            String strBQ22 = LJIILIIL().BQ2();
            Bundle bundleGQ22 = LJIILIIL().GQ2();
            boolean zOQ22 = LJIILIIL().OQ2();
            String str8 = (String) LJIILIIL().LLJJJ.getValue();
            if (str8 != null) {
                str2 = str8;
            }
            LJIIZILJ(enterFrom2, enterMethod2, strYQ2, string2, mapLJI2, list2, iLIZ, str6, str7, strBQ22, bundleGQ22, zOQ22, str2);
            return;
        }
        if (!str.equals("the_one")) {
            return;
        }
        Bundle bundle = new Bundle((Bundle) LJIILIIL().LLLI.getValue());
        C786410Ut5.LJJJI("enter_method", LJIILIIL().getEnterMethod(), bundle);
        C852170Xbr.LIZ.getClass();
        Map mapLJI3 = C852170Xbr.LJI(bundle);
        if (mapLJI3 == null) {
            mapLJI3 = new LinkedHashMap();
        }
        ArrayList arrayList = new ArrayList(((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LJIIIZ(null));
        mapLJI3.put("acct_shown", Integer.valueOf(arrayList.size()));
        C0XUD.LIZ.getClass();
        mapLJI3.put("acct_shown_ocl", Integer.valueOf(C0XUD.LJIIIZ));
        mapLJI3.put("acct_shown_hist", Integer.valueOf(C0XUD.LJIIIIZZ));
        HashSet hashSet = new HashSet();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            try {
                hashSet.add(C849680XUw.LJFF((BaseLoginMethod) ListProtector.get(arrayList, i2)));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C0XGR c0xgr = new C0XGR();
        String string3 = bundle.getString("enter_method", "");
        if (string3 == null) {
            string3 = "";
        }
        bundle.getString("enter_from", "");
        for (EnumC1239210iLv enumC1239210iLv : EnumC1239210iLv.values()) {
            String lowerCase = enumC1239210iLv.name().toLowerCase(Locale.ENGLISH);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(lowerCase);
            sbLIZ.append("_is_show");
            c0xgr.LIZ(hashSet.contains(lowerCase) ? 1 : 0, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (!hashSet.contains("email") && !hashSet.contains("sms_verification") && !hashSet.contains("sms_verification") && !hashSet.contains("phone") && !hashSet.contains("handle")) {
            i = 0;
        } else {
            i = 1;
        }
        c0xgr.LIZ(i, "phone_email_show");
        c0xgr.LIZJ("enter_method", string3);
        String string4 = bundle.getString("enter_from", "");
        if (string4 == null) {
            string4 = "";
        }
        c0xgr.LIZJ("enter_from", string4);
        c0xgr.LIZJ("enter_type", "click_login");
        String string5 = bundle.getString("login_panel_type", "");
        if (string5 == null) {
            string5 = "";
        }
        c0xgr.LIZJ("login_panel_type", string5);
        String string6 = bundle.getString("channel", "");
        if (string6 != null) {
            str2 = string6;
        }
        c0xgr.LIZJ("channel", str2);
        c0xgr.LIZ(-1, "is_from_express_login");
        c0xgr.LIZ(0, "is_express_login");
        c0xgr.LIZJ("prev_login_platform", (String) ((IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class)).getPlatform().getValue());
        c0xgr.LIZ(((IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class)).LIZIZ(), "encouraged_platform");
        if (((IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class)).LJ()) {
            c0xgr.LIZ(((IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class)).LJIIIZ(), "is_plugin_did_ab_recv");
        }
        if (PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null) != null) {
            c0xgr.LIZ(C19254610Um.LIZIZ.LJJIL().LIZJ(string3) ? 1 : 0, "is_forced_login_copywrite_show");
        }
        C852170Xbr.LIZJ(c0xgr, mapLJI3);
        C852170Xbr.LIZ(c0xgr);
        C20684815ws.LJIILLIIL("login_notify", c0xgr.LIZ);
        C793770VBv.LJII("login_notify", null, null, null);
    }

    public final void LJIJ(String str) {
        if (!LJI()) {
            return;
        }
        View viewFindViewById = this.LIZ.findViewById(R.id.xs6);
        int size = ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LJIIIZ(null).size();
        if (viewFindViewById != null && viewFindViewById.getVisibility() == 0) {
            C0XWJ.LIZ.getClass();
            C0XWJ.LJIIJ(size, str, null, null);
        } else {
            C0XWJ.LIZ.getClass();
            C0XWJ.LJIIJJI(size, null, null, str, null, null);
        }
    }

    public final void LJIJJ(TuxIconView tuxIconView) {
        String str;
        C1868550yiz unifiedLoginPanelConfig;
        C1868540yiy c1868540yiy;
        if (C294020Bfk.LIZ()) {
            IUnifiedAccountSdkConfigService iUnifiedAccountSdkConfigService = (IUnifiedAccountSdkConfigService) PluggableExtentionKt.pluggableSpi$default(IUnifiedAccountSdkConfigService.class, false, false, false, 14, null);
            if (iUnifiedAccountSdkConfigService == null || (unifiedLoginPanelConfig = iUnifiedAccountSdkConfigService.getUnifiedLoginPanelConfig(this.LIZ)) == null || (c1868540yiy = unifiedLoginPanelConfig.LIZ) == null || (str = c1868540yiy.LIZIZ) == null) {
                str = "";
            }
            if (str.length() == 0) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                return;
            }
            C786410Ut5.a9(tuxIconView, new ACListenerS89S1100000_28(this, str, 8));
        } else {
            C786410Ut5.a9(tuxIconView, new ACListenerS162S0100000_28(this, 197));
        }
        tuxIconView.setIconRes(R.raw.icon_question_mark_circle_ltr);
        tuxIconView.setTintColorRes(R.attr.a1h);
        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        tuxIconView.setContentDescription(tuxIconView.getContext().getString(2131823339));
    }

    public AbstractC19311610gs(BaseActivity baseActivity, InterfaceC19315610hW interfaceC19315610hW) {
        this.LIZ = baseActivity;
        this.LIZIZ = interfaceC19315610hW;
    }

    public final void LJIJI(String str, boolean z) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", LJIILIIL().getEnterMethod());
        c0xgr.LIZLLL("enter_from", LJIILIIL().getEnterFrom());
        c0xgr.LIZLLL("exit_method", str);
        c0xgr.LIZLLL("group_id", (String) LJIILIIL().LLJJIJIIJIL.getValue());
        c0xgr.LIZLLL("login_panel_type", LJIILIIL().BQ2());
        c0xgr.LIZIZ(LJIILIIL().AQ2(), "duration");
        if (Intrinsics.LJFF(LJIILIIL().getEnterFrom(), "age_gate_page")) {
            c0xgr.LIZJ("exit_to", "back_to_age_gate");
        }
        C20684815ws.LJIILLIIL("close_login_notify", c0xgr.LIZ);
        LJIJ("click_close");
        if (LJIILIIL().OQ2()) {
            C0XGR c0xgr2 = new C0XGR();
            c0xgr2.LIZLLL("enter_method", LJIILIIL().getEnterMethod());
            c0xgr2.LIZLLL("enter_from", LJIILIIL().getEnterFrom());
            c0xgr2.LIZLLL("exit_method", "skip");
            C20684815ws.LJIILLIIL("exit_cold_launch_login_notify", c0xgr2.LIZ);
        }
        if (z) {
            return;
        }
        this.LIZIZ.LLJJJJLIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIZILJ(String str, String str2, String str3, String str4, Map map, List list, int i, String str5, String str6, String str7, Bundle bundle, boolean z, String str8) {
        int i2;
        String strName;
        String str9;
        int i3;
        AccountUserService accountUserServiceLJIIJ;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("enter_from", str);
        int i4 = 1;
        c0xgr.LIZ(1, "_perf_monitor");
        c0xgr.LIZLLL("channel", str4);
        c0xgr.LIZLLL("enter_type", str3);
        c0xgr.LIZJ("login_panel_type", str7);
        C852170Xbr.LIZ.getClass();
        C852170Xbr.LIZJ(c0xgr, map);
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 <= i) {
                c0xgr.LIZ(1, ((C1687890u1b) ListProtector.get(list, i5)).LJ);
            } else {
                c0xgr.LIZ(0, ((C1687890u1b) ListProtector.get(list, i5)).LJ);
            }
        }
        BaseLoginMethod baseLoginMethodLJFF = C0XUE.LIZ.LJFF();
        c0xgr.LIZ(bundle.getInt("login_last_time"), "login_last_time");
        c0xgr.LIZLLL("nonpersonalized_mode_is_show", CardStruct.IStatusCode.DEFAULT);
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null && accountUserServiceLJIIJ.isLogin()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c0xgr.LIZ(i2, "is_login");
        c0xgr.LIZJ("group_id", str5);
        c0xgr.LIZJ("author_id", str6);
        if (baseLoginMethodLJFF instanceof TPLoginMethod) {
            strName = ((TPLoginMethod) baseLoginMethodLJFF).getPlatform();
        } else {
            strName = baseLoginMethodLJFF.getLoginMethodName().name();
        }
        c0xgr.LIZJ("previous_login_method", strName);
        IPrevLoginPlatformService iPrevLoginPlatformService = (IPrevLoginPlatformService) PluggableExtentionKt.pluggableSpi$default(IPrevLoginPlatformService.class, false, false, false, 14, null);
        if (iPrevLoginPlatformService != null) {
            c0xgr.LIZJ("prev_login_platform", (String) iPrevLoginPlatformService.getPlatform().getValue());
            c0xgr.LIZ(iPrevLoginPlatformService.LIZIZ(), "encouraged_platform");
            if (iPrevLoginPlatformService.LJ()) {
                c0xgr.LIZ(iPrevLoginPlatformService.LJIIIZ(), "is_plugin_did_ab_recv");
            }
        }
        c0xgr.LIZ(C19241810Po.LIZ(), "is_in_personalized_nuj");
        if (z) {
            str9 = "full_screen";
        } else {
            str9 = "cover";
        }
        c0xgr.LIZJ("show_type", str9);
        c0xgr.LIZJ("sdk_name", bundle.getString("sdk_name", ""));
        c0xgr.LIZJ("sdk_version", bundle.getString("sdk_version", ""));
        c0xgr.LIZJ("proactive_design_type", str8);
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().LIZ() == 1) {
            i3 = 3;
        } else {
            i3 = 1;
        }
        c0xgr.LIZ(i3, "pad_interface_orientation");
        C852170Xbr.LIZ(c0xgr);
        if (PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null) == null || !C19254610Um.LIZIZ.LJJIL().LIZJ(str2)) {
            i4 = 0;
        }
        c0xgr.LIZ(i4, "is_forced_login_copywrite_show");
        C852170Xbr.LIZ.getClass();
        C852170Xbr.LIZLLL(c0xgr, bundle);
        C20684815ws.LJIILLIIL("login_notify", c0xgr.LIZ);
        C793770VBv.LJII("login_notify", null, null, null);
    }
}
