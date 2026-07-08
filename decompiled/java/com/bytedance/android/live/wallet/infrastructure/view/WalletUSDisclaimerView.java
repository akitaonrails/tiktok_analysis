package com.bytedance.android.live.wallet.infrastructure.view;

import X.AnimationAnimationListenerC1864600ycc;
import X.C0U3S;
import X.C1568640qvG;
import X.C1954807lC;
import X.C20736316Cj;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520010KaN;
import X.C786410Ut5;
import X.EnumC1568630qvF;
import X.ViewOnLayoutChangeListenerC1864650ych;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS127S0100000_27;
import android.animation.LayoutTransition;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRoomRechargeAgreementConfigSetting;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class WalletUSDisclaimerView {
    public final Context LIZ;
    public final EnumC1568630qvF LIZIZ;
    public final LiveRechargeAgreementConfig LIZJ;
    public boolean LIZLLL;
    public final View LJ;
    public final LiveIconView LJFF;
    public final TextView LJI;
    public final int LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;

    public final void LIZ() {
        Lifecycle lifecycle;
        ARunnableS127S0100000_27 aRunnableS127S0100000_27 = new ARunnableS127S0100000_27(this, 4);
        WalletUSDisclaimerView$applyLayoutTransition$observer$1 walletUSDisclaimerView$applyLayoutTransition$observer$1 = new WalletUSDisclaimerView$applyLayoutTransition$observer$1(aRunnableS127S0100000_27, this);
        if (C520010KaN.LJJII(this.LJI, false) != null) {
            LifecycleOwner lifecycleOwnerLJJII = C520010KaN.LJJII(this.LJI, false);
            if (lifecycleOwnerLJJII != null && (lifecycle = lifecycleOwnerLJJII.getLifecycle()) != null) {
                lifecycle.addObserver(walletUSDisclaimerView$applyLayoutTransition$observer$1);
            }
        } else {
            HandlerHook.viewPostDelay(this.LJI, aRunnableS127S0100000_27, this.LJIIIIZZ);
        }
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(this.LJIIIZ);
        layoutTransition.enableTransitionType(0);
        ViewGroup viewGroup = (ViewGroup) this.LJ.findViewById(R.id.wallet_us_disclaimer_view);
        if (viewGroup != null) {
            viewGroup.setLayoutTransition(layoutTransition);
        }
    }

    public final void LIZIZ() {
        int i;
        int i2 = C1568640qvG.LIZ[this.LIZIZ.ordinal()];
        if (i2 == 1 || i2 == 2) {
            i = 2131856871;
        } else {
            if (i2 != 3) {
                throw new C1954807lC();
            }
            i = 2131856872;
        }
        String strLJIJI = C497740JfY.LJIJI(i);
        String strLJIJI2 = C497740JfY.LJIJI(2131842653);
        String strJ4 = C786410Ut5.j4(strLJIJI, Arrays.copyOf(new Object[]{strLJIJI2}, 1));
        if (!this.LIZLLL) {
            this.LJI.setMovementMethod(null);
            this.LJI.setText(strJ4);
            return;
        }
        SpannableString spannableString = new SpannableString(strJ4);
        try {
            C786410Ut5.p2(spannableString, new C0U3S(this.LIZJ.agreementForGlobal, this.LIZ), a0.LJJJ(strJ4, strLJIJI2, 0, false, 6), a0.LJJJ(strJ4, strLJIJI2, 0, false, 6) + strLJIJI2.length(), 17);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LJI.setText(spannableString);
        this.LJI.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView = this.LJI;
        if (!textView.isLaidOut() || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1864650ych(this, 0));
        } else if (this.LJI.getLineCount() <= 2) {
            C786410Ut5.LLJJIJIL(this.LJFF, 8);
        } else {
            LIZ();
        }
    }

    public final void LIZJ() {
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.LIZ, R.anim.k4);
        animationLoadAnimation.setAnimationListener(new AnimationAnimationListenerC1864600ycc(this, 0));
        LIZIZ();
        this.LJFF.setAnimation(animationLoadAnimation);
        this.LJI.setMaxLines(this.LJII);
        this.LJI.setEllipsize(TextUtils.TruncateAt.END);
        this.LJFF.startAnimation(animationLoadAnimation);
    }

    public WalletUSDisclaimerView(Context context, EnumC1568630qvF enumC1568630qvF, ViewGroup viewGroup) {
        this.LIZ = context;
        this.LIZIZ = enumC1568630qvF;
        LiveRoomRechargeAgreementConfigSetting liveRoomRechargeAgreementConfigSetting = LiveRoomRechargeAgreementConfigSetting.INSTANCE;
        LiveRechargeAgreementConfig value = liveRoomRechargeAgreementConfigSetting.getValue();
        this.LIZJ = value == null ? liveRoomRechargeAgreementConfigSetting.getDEFAULT() : value;
        this.LIZLLL = true;
        this.LJII = 2;
        this.LJIIIIZZ = 2500L;
        this.LJIIIZ = 500L;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gd0, viewGroup, true);
        this.LJ = viewTd;
        TextView textView = (TextView) viewTd.findViewById(R.id.us_disclaimer_view_agreement);
        this.LJI = textView;
        LiveIconView liveIconView = (LiveIconView) viewTd.findViewById(R.id.us_disclaimer_view_btn);
        this.LJFF = liveIconView;
        LIZIZ();
        textView.setHighlightColor(C20736316Cj.LIZIZ(R.attr.exe, context));
        if (C497740JfY.LJJ()) {
            textView.setGravity(5);
        }
        C786410Ut5.g8(liveIconView, new ACListenerS161S0100000_27(this, 156));
        if (C497740JfY.LJJ()) {
            C500260Jjc.LJLJJL(0, liveIconView);
        }
    }
}
