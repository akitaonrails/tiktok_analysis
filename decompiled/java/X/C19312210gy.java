package X;

import Y.ARunnableS128S0100000_28;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19312210gy extends AbstractC19313910hF {
    public final /* synthetic */ I18nSignUpActivity LIZ;
    public final /* synthetic */ ViewPagerBottomSheetBehavior<View> LIZIZ;

    public C19312210gy(ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior, I18nSignUpActivity i18nSignUpActivity) {
        this.LIZ = i18nSignUpActivity;
        this.LIZIZ = viewPagerBottomSheetBehavior;
    }

    public final void LIZ(int i, View view) {
        if (i == 5) {
            I18nSignUpActivity i18nSignUpActivity = this.LIZ;
            if (i18nSignUpActivity.LLJJIJIL) {
                i18nSignUpActivity.LLJJIJIL = false;
            } else {
                C19313310h9.LIZ.getClass();
                if (C19313310h9.LIZ(i18nSignUpActivity)) {
                    HandlerHook.viewPost(view, new ARunnableS128S0100000_28((ViewPagerBottomSheetBehavior) this.LIZIZ, 126));
                    return;
                }
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("enter_method", this.LIZ.LLLLZLLLI().getEnterMethod());
                c0xgr.LIZLLL("enter_from", this.LIZ.LLLLZLLLI().getEnterFrom());
                c0xgr.LIZLLL("login_panel_type", this.LIZ.LLLLZLLLI().BQ2());
                c0xgr.LIZLLL("group_id", (String) this.LIZ.LLLLZLLLI().LLJJIJIIJIL.getValue());
                c0xgr.LIZLLL("exit_method", "slide");
                c0xgr.LIZIZ(this.LIZ.LLLLZLLLI().AQ2(), "duration");
                if (Intrinsics.LJFF(this.LIZ.LLLLZLLLI().getEnterFrom(), "age_gate_page")) {
                    c0xgr.LIZJ("exit_to", "back_to_age_gate");
                }
                C20684815ws.LJIILLIIL("close_login_notify", c0xgr.LIZ);
            }
            this.LIZ.getWindow().setDimAmount(0.0f);
            this.LIZ.finish();
        }
    }
}
