package Y;

import X.C0GY9;
import X.C0NEY;
import X.C0WZX;
import X.C0X35;
import X.C0XGR;
import X.C10RP;
import X.C114F;
import X.C1150504el;
import X.C1389890mGx;
import X.C1701330uNH;
import X.C1898700zVc;
import X.C1911410zq7;
import X.C1912460zro;
import X.C1912590zs1;
import X.C19248710Sf;
import X.C19254610Um;
import X.C19271010aK;
import X.C19303510fZ;
import X.C19303810fc;
import X.C19304910fn;
import X.C19305010fo;
import X.C19EG;
import X.C1C7U;
import X.C20296414bK;
import X.C20684815ws;
import X.C2204931BRj;
import X.C2204961BRm;
import X.C786410Ut5;
import X.EnumC191814102i;
import X.ViewOnClickListenerC1898570zVP;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.touchpoint.api.model.TimerPendant;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.caremode.topguide.CreatorCareModePopView;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS47S0110000_28 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$1() {
        TimerPendant timerPendant;
        C1898700zVc c1898700zVc = (C1898700zVc) this.l0;
        c1898700zVc.LLJLLL = true;
        if (this.z1 && c1898700zVc.getShapeBubbleView() != null) {
            C1898700zVc c1898700zVc2 = (C1898700zVc) this.l0;
            if (!c1898700zVc2.LLJLL) {
                c1898700zVc2.getShapeBubbleView().LJ(new AwS572S0100000_28((C1898700zVc) this.l0, 1055));
            }
        }
        C1898700zVc c1898700zVc3 = (C1898700zVc) this.l0;
        if (c1898700zVc3.LLJZ || ((timerPendant = c1898700zVc3.LLJZIJLIL) != null && Intrinsics.LJFF(timerPendant.canBeClosed, Boolean.TRUE))) {
            ImageView timerCloseView = c1898700zVc3.getTimerCloseView();
            C786410Ut5.LJZI(0, timerCloseView);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(timerCloseView, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.15f, 1.0f, 0.29f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(timerCloseView, "scaleX", 0.0f, 1.0f);
            objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(timerCloseView, "scaleY", 0.0f, 1.0f);
            objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSet.setDuration(350L);
            animatorSet.start();
        }
    }

    public final void LIZ$0() {
        Intent className;
        Intent intent;
        C1150504el.LIZ().LJI("cold_boot_start_to_preload_main", false);
        if (this.z1 || C1912590zs1.LIZ) {
            return;
        }
        Activity activity = (Activity) this.l0;
        if (activity == null || (intent = activity.getIntent()) == null || !intent.getBooleanExtra("redirected_from_deeplink", false)) {
            C1912590zs1.LIZ = true;
            C1912460zro c1912460zro = C1912460zro.LIZ;
            Activity activity2 = (Activity) this.l0;
            c1912460zro.getClass();
            if (activity2 != null) {
                try {
                    Intent intent2 = activity2.getIntent();
                    if (intent2 != null) {
                        className = intent2.setClassName(activity2, C19248710Sf.LIZIZ.getSplashActivityClass().getName());
                        if (className != null) {
                            Intent flags = className.setFlags(268435456);
                            if (flags != null) {
                                flags.addFlags(67108864);
                            }
                            className.putExtra("reorder_new_journey_front", true);
                            className.putExtra("from_new_user_journey", true);
                            className.putExtra("pre_mainactivity_first_enter", true);
                        }
                    } else {
                        className = null;
                    }
                    if (activity2 != null) {
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity2, className, "Context_startActivity_1");
                        C1701330uNH.LIZ(className, activity2);
                        C2204961BRm.LJIILLIIL(activity2, className, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOCndo3A2SvpG2/ayDLWUDgaBucWozM9xi9BYXkNrzjK", null));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Error starting Main";
                    }
                    C1911410zq7.LIZIZ("NewUserLaunchActivity", message);
                    return;
                }
            }
            C0NEY.LIZ(1, "is_preload_main");
            C1911410zq7.LIZ("NewUserLaunchActivity", "preStartMainActivity2");
            C0X35.LIZ("cold_boot_new_user_pre_main", false);
        }
    }

    public static final void run$0(ARunnableS47S0110000_28 aRunnableS47S0110000_28) {
        int i;
        C19271010aK c19271010aK = (C19271010aK) aRunnableS47S0110000_28.l0;
        boolean z = aRunnableS47S0110000_28.z1;
        c19271010aK.getClass();
        C1C7U.LIZ("QRCodeScanPresenter@e78f.onScanFailed$1L");
        BaseActivity baseActivity = c19271010aK.LIZ;
        if (baseActivity != null && !baseActivity.isDestroyed()) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19271010aK.LIZ);
            if (z) {
                c19271010aK.LJII.getClass();
                i = 2131836217;
            } else {
                i = 2131838801;
            }
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
            C1C7U.LIZIZ("QRCodeScanPresenter@e78f.onScanFailed$1L");
            return;
        }
        C1C7U.LIZIZ("QRCodeScanPresenter@e78f.onScanFailed$1L");
    }

    public static final void run$1(ARunnableS47S0110000_28 aRunnableS47S0110000_28) {
        AuthorizeActivity authorizeActivity = (AuthorizeActivity) aRunnableS47S0110000_28.l0;
        boolean z = aRunnableS47S0110000_28.z1;
        String str = AuthorizeActivity._pnsPageId;
        authorizeActivity.getClass();
        C1C7U.LIZ("AuthorizeActivity@bcc6.failed$1L");
        if (!authorizeActivity.isDestroyed()) {
            EnumC191814102i enumC191814102iLIZ = ComplianceServiceProvider.LIZLLL().LIZ();
            IGuestModeService iGuestModeService = (IGuestModeService) ServiceManager.get().getService(IGuestModeService.class);
            C19254610Um.LIZIZ.LJIIJJI().LIZJ();
            boolean zLIZ = C10RP.LIZ("3p_sign_up");
            if (ComplianceServiceProvider.LIZLLL().LJI() && !iGuestModeService.isGuestMode() && !zLIZ) {
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZ(enumC191814102iLIZ.getValue(), "register_age_gate_action");
                c0xgr.LIZ(1, "show");
                c0xgr.LIZ(0, "is_guest_mode");
                C20684815ws.LJIILLIIL("tns_third_party_not_registered_age_gate_action", c0xgr.LIZ);
                C19303510fZ c19303510fZ = new C19303510fZ();
                AuthResult authResult = authorizeActivity.LLILZIL;
                c19303510fZ.LIZ(authorizeActivity, authResult, new C19303810fc(authResult, authorizeActivity), Boolean.valueOf(z), authorizeActivity.Nn(), AuthorizeActivity.LLLLLZL(authorizeActivity.getIntent()));
            } else {
                C0XGR c0xgr2 = new C0XGR();
                c0xgr2.LIZ(enumC191814102iLIZ.getValue(), "register_age_gate_action");
                c0xgr2.LIZ(0, "show");
                c0xgr2.LIZ(iGuestModeService.isGuestMode() ? 1 : 0, "is_guest_mode");
                c0xgr2.LIZ(zLIZ ? 1 : 0, "not_show_in_pnuj_3_party");
                C20684815ws.LJIILLIIL("tns_third_party_not_registered_age_gate_action", c0xgr2.LIZ);
                if (ComplianceServiceProvider.LJJII().LIZJ()) {
                    C19304910fn c19304910fn = new C19304910fn();
                    AuthResult authResult2 = authorizeActivity.LLILZIL;
                    c19304910fn.LIZ(authorizeActivity, authResult2, new C19305010fo(authResult2, authorizeActivity), authorizeActivity.Nn());
                } else {
                    authorizeActivity.LLLLZLLIL(authorizeActivity.LLILZIL, false);
                }
            }
        }
        C1C7U.LIZIZ("AuthorizeActivity@bcc6.failed$1L");
    }

    public static final void run$2(ARunnableS47S0110000_28 aRunnableS47S0110000_28) {
        C2204931BRj c2204931BRj = (C2204931BRj) aRunnableS47S0110000_28.l0;
        boolean z = aRunnableS47S0110000_28.z1;
        c2204931BRj.getClass();
        C1C7U.LIZ("AuthorizeProcessor@b443.failed$1L");
        if (!c2204931BRj.LIZLLL()) {
            EnumC191814102i enumC191814102iLIZ = ComplianceServiceProvider.LIZLLL().LIZ();
            IGuestModeService iGuestModeService = (IGuestModeService) PluggableExtentionKt.pluggableSpi(IGuestModeService.class);
            C19254610Um.LIZIZ.LJIIJJI().LIZJ();
            boolean zLIZ = C10RP.LIZ("3p_sign_up");
            if (ComplianceServiceProvider.LIZLLL().LJI() && !iGuestModeService.isGuestMode() && !zLIZ) {
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZ(enumC191814102iLIZ.getValue(), "register_age_gate_action");
                c0xgr.LIZ(1, "show");
                c0xgr.LIZ(0, "is_guest_mode");
                C20684815ws.LJIILLIIL("tns_third_party_not_registered_age_gate_action", c0xgr.LIZ);
                C19303510fZ c19303510fZ = new C19303510fZ();
                C19EG fragmentActivity = c2204931BRj.LLJJJJJIL.getFragmentActivity();
                AuthResult authResult = c2204931BRj.LLILZIL;
                c19303510fZ.LIZ(fragmentActivity, authResult, new C19303810fc(authResult, c2204931BRj), Boolean.valueOf(z), c2204931BRj.Nn(), C2204931BRj.LIZ(c2204931BRj.LLJJJJJIL.getParameter()));
            } else {
                C0XGR c0xgr2 = new C0XGR();
                c0xgr2.LIZ(enumC191814102iLIZ.getValue(), "register_age_gate_action");
                c0xgr2.LIZ(0, "show");
                c0xgr2.LIZ(iGuestModeService.isGuestMode() ? 1 : 0, "is_guest_mode");
                c0xgr2.LIZ(zLIZ ? 1 : 0, "not_show_in_pnuj_3_party");
                C20684815ws.LJIILLIIL("tns_third_party_not_registered_age_gate_action", c0xgr2.LIZ);
                if (ComplianceServiceProvider.LJJII().LIZJ()) {
                    C19304910fn c19304910fn = new C19304910fn();
                    C19EG fragmentActivity2 = c2204931BRj.LLJJJJJIL.getFragmentActivity();
                    AuthResult authResult2 = c2204931BRj.LLILZIL;
                    c19304910fn.LIZ(fragmentActivity2, authResult2, new C19305010fo(authResult2, c2204931BRj), c2204931BRj.Nn());
                } else {
                    c2204931BRj.LJIIIZ(c2204931BRj.LLILZIL, false);
                }
            }
        }
        C1C7U.LIZIZ("AuthorizeProcessor@b443.failed$1L");
    }

    public static final void run$3(ARunnableS47S0110000_28 aRunnableS47S0110000_28) {
        boolean zLIZ;
        C1C7U.LIZ("TextTemplateScene@17d3.showOrHideAnimation$1");
        try {
            ((C114F) aRunnableS47S0110000_28.l0).LLLLLLIL(aRunnableS47S0110000_28.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TextTemplateScene@17d3.showOrHideAnimation$1");
    }

    public static final void run$4(ARunnableS47S0110000_28 aRunnableS47S0110000_28) {
        boolean zLIZ;
        C1C7U.LIZ("NaviGLSurfaceView@4c6c.setCameraHW$1");
        try {
            ((C20296414bK) aRunnableS47S0110000_28.l0).setCameraHW(aRunnableS47S0110000_28.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NaviGLSurfaceView@4c6c.setCameraHW$1");
    }

    public static final void run$5(ARunnableS47S0110000_28 aRunnableS47S0110000_28) {
        boolean zLIZ;
        C1C7U.LIZ("CreatorCareModePopView@9ba6.closeRunnable$1");
        try {
            if (!aRunnableS47S0110000_28.z1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                CreatorCareModePopView creatorCareModePopView = (CreatorCareModePopView) aRunnableS47S0110000_28.l0;
                if (jCurrentTimeMillis >= creatorCareModePopView.LLILZIL && creatorCareModePopView.isShowing()) {
                    creatorCareModePopView.dismiss();
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreatorCareModePopView@9ba6.closeRunnable$1");
    }

    public static final void run$6(ARunnableS47S0110000_28 aRunnableS47S0110000_28) {
        boolean zLIZ;
        C1C7U.LIZ("PrestartMain@9924.preStartMainActivity$1");
        try {
            aRunnableS47S0110000_28.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PrestartMain@9924.preStartMainActivity$1");
    }

    public static final void run$7(ARunnableS47S0110000_28 aRunnableS47S0110000_28) {
        C1C7U.LIZ("InAppPushView@147e.createCloseRunnable$1");
        if (!aRunnableS47S0110000_28.z1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ViewOnClickListenerC1898570zVP viewOnClickListenerC1898570zVP = (ViewOnClickListenerC1898570zVP) aRunnableS47S0110000_28.l0;
            if (jCurrentTimeMillis >= viewOnClickListenerC1898570zVP.LLILZIL && viewOnClickListenerC1898570zVP.isShowing()) {
                ((ViewOnClickListenerC1898570zVP) aRunnableS47S0110000_28.l0).LJJIIJZLJL(false);
            }
        }
        C1C7U.LIZIZ("InAppPushView@147e.createCloseRunnable$1");
    }

    public static final void run$8(ARunnableS47S0110000_28 aRunnableS47S0110000_28) {
        boolean zLIZ;
        C1C7U.LIZ("SpecActView@2335.showShapeBubbleView$1");
        try {
            aRunnableS47S0110000_28.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpecActView@2335.showShapeBubbleView$1");
    }

    public ARunnableS47S0110000_28(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public ARunnableS47S0110000_28(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
