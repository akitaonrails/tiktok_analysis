package X;

import Y.AObserverS230S0100000_28;
import Y.AObserverS236S0100000_34;
import android.text.SpannableString;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.IPopSuiteManagerService;
import com.ss.android.ugc.aweme.account.api.AccountLookupPopupConfig;
import com.ss.android.ugc.aweme.account.api.FoundAccountForLogin;
import com.ss.android.ugc.aweme.account.experiment.DeprecationEnhancementExperiment;
import com.ss.android.ugc.aweme.account.experiment.ThirdPartyDeprecationExperiment5;
import com.ss.android.ugc.aweme.account.login.auth.Failed3PServiceViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.settings.AltLoginForFailed3pFreqSettings$AltLoginForFailed3pFreqModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS183S1100000_34;
import kotlin.jvm.internal.AwS70S1300000_34;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BV2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BV2 {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public final BaseActivity LIZ;
    public final C1BV9 LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Failed3PServiceViewModel LIZLLL;
    public EnumC852660Xce LJ;
    public EnumC852660Xce LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;
    public View LJIILIIL;
    public final IBindService LJIILJJIL;
    public boolean LJIILL;
    public long LJIILLIIL;

    public final void LIZJ() {
        C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
        c1389890mGx.LJIIIZ(2131846735);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
        String str = this.LJI;
        String str2 = this.LIZIZ.LLILZ;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("login_panel_type", str2);
        c0xgr.LIZLLL("platform", str);
        C20684815ws.LJIILLIIL("login_error_toast_shown", c0xgr.LIZ);
    }

    public final void LIZIZ(String str) {
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", this.LIZIZ.LL);
        c0xgr.LIZLLL("enter_method", this.LIZIZ.LLILLJJLI);
        c0xgr.LIZLLL("page", "failed_3p_login");
        c0xgr.LIZLLL("type", str);
        C20684815ws.LJIILLIIL("click_learn_more", c0xgr.LIZ);
    }

    public final SpannableString LIZ(boolean z, TuxTextView tuxTextView, String str) {
        String str2;
        if (z) {
            str2 = "email";
        } else {
            str2 = "phone";
        }
        tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        return C1239020iLc.LIZIZ(this.LIZ, str, 41, new AwS183S1100000_34(this, str2, 1), 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.18ap] */
    public final void LIZLLL(long j, String str, boolean z) {
        EnumC1222190huT enumC1222190huT;
        String str2;
        int i;
        AltLoginForFailed3pFreqSettings$AltLoginForFailed3pFreqModel altLoginForFailed3pFreqSettings$AltLoginForFailed3pFreqModel;
        this.LJI = str;
        if (!ThirdPartyDeprecationExperiment5.LJFF(str)) {
            Failed3PServiceViewModel failed3PServiceViewModel = this.LIZLLL;
            failed3PServiceViewModel.getClass();
            C19315910hZ.LIZ.getClass();
            if (C13LP.LJJJJ(C19315910hZ.LIZJ, C19315910hZ.LJI)) {
                altLoginForFailed3pFreqSettings$AltLoginForFailed3pFreqModel = new AltLoginForFailed3pFreqSettings$AltLoginForFailed3pFreqModel(15, Integer.MAX_VALUE);
            } else {
                altLoginForFailed3pFreqSettings$AltLoginForFailed3pFreqModel = new AltLoginForFailed3pFreqSettings$AltLoginForFailed3pFreqModel(7, Integer.MAX_VALUE);
            }
            C443120HZe<Boolean, C21312318an, String> c443120HZeIsFreqControlSatisfied = ((IPopSuiteManagerService) ServiceManager.get().getService(IPopSuiteManagerService.class)).isFreqControlSatisfied("", new IPopSuiteManagerService.PopupFreqControlObject(altLoginForFailed3pFreqSettings$AltLoginForFailed3pFreqModel.interval, 23, 1, Integer.MAX_VALUE, Integer.MAX_VALUE, altLoginForFailed3pFreqSettings$AltLoginForFailed3pFreqModel.maxCount), "alt_login_scene_cache_key", new Object() { // from class: X.18ap
            });
            boolean zBooleanValue = c443120HZeIsFreqControlSatisfied.getFirst().booleanValue();
            C21312318an second = c443120HZeIsFreqControlSatisfied.getSecond();
            String third = c443120HZeIsFreqControlSatisfied.getThird();
            failed3PServiceViewModel.LLJILLL = second;
            failed3PServiceViewModel.LLJILJILJ = third;
            if (!zBooleanValue) {
                LIZJ();
                return;
            }
        }
        this.LJIILLIIL = j;
        this.LJIILL = z;
        C1239360iMA c1239360iMA = C1239360iMA.LIZ;
        C1BV9 c1bv9 = this.LIZIZ;
        String str3 = c1bv9.LL;
        String str4 = c1bv9.LLILLJJLI;
        String str5 = this.LJI;
        if (z) {
            enumC1222190huT = EnumC1222190huT.CANCEL;
        } else {
            enumC1222190huT = EnumC1222190huT.FAIL;
        }
        c1239360iMA.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str3);
        c0xgr.LIZLLL("enter_method", str4);
        c0xgr.LIZLLL("platform", str5);
        c0xgr.LIZLLL("matching_reason", enumC1222190huT.getReason());
        c0xgr.LIZIZ(j, "duration");
        C20684815ws.LJIILLIIL("account_mapping_request", c0xgr.LIZ);
        ThirdPartyDeprecationExperiment5 thirdPartyDeprecationExperiment5 = ThirdPartyDeprecationExperiment5.LIZ;
        String str6 = this.LJI;
        thirdPartyDeprecationExperiment5.getClass();
        if (ThirdPartyDeprecationExperiment5.LIZ(ThirdPartyDeprecationExperiment5.GuidanceActions.FAILED_3P_TO_1P, str6)) {
            str2 = "3p_outage";
        } else {
            str2 = "failed_3p";
        }
        DeprecationEnhancementExperiment.LIZ.getClass();
        if (DeprecationEnhancementExperiment.LIZJ(str)) {
            i = 9;
        } else {
            i = 8;
        }
        Failed3PServiceViewModel failed3PServiceViewModel2 = this.LIZLLL;
        failed3PServiceViewModel2.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(failed3PServiceViewModel2), null, null, new C2207208ko(i, str2, str, failed3PServiceViewModel2, null), 3);
    }

    public final void LJ(FoundAccountForLogin foundAccountForLogin, String str, AccountLookupPopupConfig accountLookupPopupConfig) {
        LIZJ();
        if (Intrinsics.LJFF(this.LJIIIZ, "verified_1p")) {
            DeprecationEnhancementExperiment deprecationEnhancementExperiment = DeprecationEnhancementExperiment.LIZ;
            String str2 = this.LJI;
            deprecationEnhancementExperiment.getClass();
            if (!DeprecationEnhancementExperiment.LIZJ(str2)) {
                Failed3PServiceViewModel failed3PServiceViewModel = this.LIZLLL;
                C1BV9 c1bv9 = this.LIZIZ;
                failed3PServiceViewModel.vQ2(c1bv9.LL, c1bv9.LLILLJJLI, foundAccountForLogin.email, this.LJII, this.LJ.getValue(), false, str, this.LIZIZ.LLILZ);
                return;
            }
        }
        final BaseActivity baseActivity = this.LIZ;
        final AwS70S1300000_34 awS70S1300000_34 = new AwS70S1300000_34(this, foundAccountForLogin, str, accountLookupPopupConfig, 3);
        PopupManager.LJIJI(new C10GR(baseActivity, awS70S1300000_34) { // from class: X.0TMx
            public final C19EG LL;
            public final Function1<C20656615sK, Unit> LLILLJJLI;

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return 204;
            }

            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                C19EG c19eg = this.LL;
                return new C688120Qyw(c19eg, c19eg, null);
            }

            {
                this.LL = baseActivity;
                this.LLILLJJLI = awS70S1300000_34;
            }

            @Override // X.InterfaceC20659015si
            public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                this.LLILLJJLI.invoke(c20656615sK);
            }
        }, true);
    }

    public C1BV2(BaseActivity baseActivity, InterfaceC21505419Ee interfaceC21505419Ee, C1BV9 c1bv9, Function0<Unit> function0) {
        this.LIZ = baseActivity;
        this.LIZIZ = c1bv9;
        this.LIZJ = function0;
        Failed3PServiceViewModel failed3PServiceViewModel = new Failed3PServiceViewModel();
        this.LIZLLL = failed3PServiceViewModel;
        EnumC852660Xce enumC852660Xce = EnumC852660Xce.NONE;
        this.LJ = enumC852660Xce;
        this.LJFF = enumC852660Xce;
        this.LJI = "";
        this.LJII = "";
        this.LJIIIIZZ = "";
        this.LJIIIZ = "";
        this.LJIIJ = "";
        this.LJIIJJI = "";
        this.LJIILJJIL = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJII();
        MutableLiveData mutableLiveData = failed3PServiceViewModel.LLILLJJLI;
        BaseActivity baseActivity2 = this.LIZ;
        final C19F0 c19f0RegisterForActivityResult = interfaceC21505419Ee.registerForActivityResult(new C21505619Eg(), new C168Q() { // from class: X.1BKZ
            @Override // X.C168Q
            public final void LIZ(Object obj) {
                if (((ActivityResult) obj).resultCode == -1) {
                    this.LIZ.LIZJ.invoke();
                }
            }
        });
        mutableLiveData.observe(baseActivity2, new Observer() { // from class: X.1BV3
            /* JADX WARN: Removed duplicated region for block: B:52:0x00df A[PHI: r5
              0x00df: PHI (r5v14 java.lang.String) = (r5v11 java.lang.String), (r5v15 java.lang.String) binds: [B:65:0x0129, B:51:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:67:0x012c A[PHI: r5
              0x012c: PHI (r5v12 java.lang.String) = (r5v11 java.lang.String), (r5v14 java.lang.String), (r5v14 java.lang.String) binds: [B:65:0x0129, B:53:0x00e1, B:55:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // androidx.lifecycle.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(java.lang.Object r24) {
                /*
                    Method dump skipped, instruction units count: 676
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1BV3.onChanged(java.lang.Object):void");
            }
        });
        failed3PServiceViewModel.LLILZ.observe(this.LIZ, new AObserverS230S0100000_28(this, 109));
        failed3PServiceViewModel.LLILZLL.observe(this.LIZ, new AObserverS230S0100000_28(this, 110));
        failed3PServiceViewModel.LLIZLLLIL.observe(this.LIZ, new AObserverS236S0100000_34(this, 30));
        failed3PServiceViewModel.LLJILJIL.observe(this.LIZ, new AObserverS236S0100000_34(this, 31));
        failed3PServiceViewModel.LLJI.observe(this.LIZ, new AObserverS230S0100000_28(this, 111));
    }
}
