package Y;

import X.C064E;
import X.C0PEM;
import X.C0R1H;
import X.C0XIR;
import X.C13071059p;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1733010vCN;
import X.C19EG;
import X.C1C7U;
import X.C1DFH;
import X.C2107308Nj;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C785410UrT;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.popup.popuphelper.PasskeyPopUpHelper;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.FollowTaskService;
import com.ss.android.ugc.aweme.series.common.serviceimpl.PaidContentFeedService;
import com.ss.android.ugc.aweme.skylight.SkylightCellLongClickAbilityImpl;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.cd.ProfileNavbarSettingProtocol;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ARunnableS35S0300000_2 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        DialogC1389620mGW dialogC1389620mGW = ((C064E) this.l0).LIZ;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        PasskeyPopUpHelper passkeyPopUpHelper = (PasskeyPopUpHelper) this.l1;
        Activity activity = (Activity) this.l2;
        passkeyPopUpHelper.getClass();
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIJ(activity.getString(2131839117));
        c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
        c1389890mGx.LJII(R.attr.a0i);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
    }

    public final void LIZ$1() {
        View view = (View) this.l0;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((View) this.l0, "alpha", view != null ? view.getAlpha() : 0.0f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) this.l1;
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.addListener(new AAListenerS315S0100000_2((Animator.AnimatorListener) this.l2, 0));
        objectAnimatorOfFloat.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void LIZ$2() {
        C0XIR c0xir;
        FollowTaskService followTaskService = (FollowTaskService) this.l0;
        View view = (View) this.l1;
        Exception exc = (Exception) this.l2;
        followTaskService.getClass();
        Throwable cause = exc != null ? exc.getCause() : null;
        if ((cause instanceof C0XIR) && (c0xir = (C0XIR) cause) != null && followTaskService.LIZ.contains(Integer.valueOf(c0xir.getErrorCode()))) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIJ(c0xir.getErrorMsg());
            c1389890mGx.LJIIJJI();
        } else {
            C1389890mGx c1389890mGx2 = new C1389890mGx(view);
            c1389890mGx2.LJIIIZ(2131835818);
            c1389890mGx2.LJIIJJI();
        }
    }

    public final void LIZ$3() {
        int iLIZJ = ((C1733010vCN) this.l0).LIZJ((View) this.l1);
        int iLIZJ2 = ((C1733010vCN) this.l0).LIZJ((View) this.l2);
        if (iLIZJ2 <= 0 || iLIZJ <= 0 || iLIZJ2 == iLIZJ) {
            return;
        }
        View view = (View) this.l2;
        if (view != null) {
            ((C1733010vCN) this.l0).getClass();
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(iLIZJ, iLIZJ2);
            valueAnimatorOfInt.setDuration(300L);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("height1:");
            sbLIZ.append(iLIZJ);
            sbLIZ.append(", height2:");
            sbLIZ.append(iLIZJ2);
            C2188811AlT.LIZIZ(sbLIZ);
            int i2 = view.getLayoutParams().height;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("originHeight:");
            sbLIZ2.append(i2);
            C2188811AlT.LIZIZ(sbLIZ2);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS253S0100000_2(view, 41));
            valueAnimatorOfInt.addListener(new AAListenerS258S0200000_2(view, view, 1));
            valueAnimatorOfInt.start();
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("nextHeight: ");
        sbLIZ3.append(iLIZJ2);
        sbLIZ3.append(", lastHeight: ");
        sbLIZ3.append(iLIZJ);
        sbLIZ3.append(", nextView: ");
        sbLIZ3.append((View) this.l2);
        C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static final void run$0(ARunnableS35S0300000_2 aRunnableS35S0300000_2) {
        boolean zLIZ;
        C1C7U.LIZ("ECAsyncInflaterV2$Companion@cded.createAsyncInflater$1");
        try {
            ComponentCallbacks2 componentCallbacks2 = (Activity) aRunnableS35S0300000_2.l0;
            if (componentCallbacks2 instanceof C19EG) {
                C0R1H.LIZIZ((LifecycleOwner) componentCallbacks2, (LifecycleObserver) ((C259800zU) aRunnableS35S0300000_2.l1).element);
            } else {
                ((Lifecycle) aRunnableS35S0300000_2.l2).addObserver((LifecycleObserver) ((C259800zU) aRunnableS35S0300000_2.l1).element);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECAsyncInflaterV2$Companion@cded.createAsyncInflater$1");
    }

    public static final void run$1(ARunnableS35S0300000_2 aRunnableS35S0300000_2) {
        boolean zLIZ;
        C1C7U.LIZ("PaidContentFeedService@96e3.setTagsFittingWidth$1");
        try {
            ((PaidContentFeedService) aRunnableS35S0300000_2.l0).LJ((TuxTextView) aRunnableS35S0300000_2.l1, (List) aRunnableS35S0300000_2.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PaidContentFeedService@96e3.setTagsFittingWidth$1");
    }

    public static final void run$10(ARunnableS35S0300000_2 aRunnableS35S0300000_2) {
        float alpha;
        View view = (View) aRunnableS35S0300000_2.l0;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) aRunnableS35S0300000_2.l1;
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aRunnableS35S0300000_2.l2;
        C1C7U.LIZ("PlayerUIUtil@6f14.hideViewWithAnimation$1L");
        if (view != null) {
            alpha = view.getAlpha();
        } else {
            alpha = 0.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", alpha, 0.0f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        objectAnimatorOfFloat.addListener(new AAListenerS315S0100000_2(animatorListener, 3));
        objectAnimatorOfFloat.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        C1C7U.LIZIZ("PlayerUIUtil@6f14.hideViewWithAnimation$1L");
    }

    public static final void run$11(ARunnableS35S0300000_2 aRunnableS35S0300000_2) {
        float alpha;
        View view = (View) aRunnableS35S0300000_2.l0;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = (ValueAnimator.AnimatorUpdateListener) aRunnableS35S0300000_2.l1;
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) aRunnableS35S0300000_2.l2;
        C1C7U.LIZ("PlayerUIUtil@6f14.showViewWithAnimation$1L");
        if (view != null) {
            alpha = view.getAlpha();
        } else {
            alpha = 0.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", alpha, 1.0f);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        objectAnimatorOfFloat.addListener(new AAListenerS315S0100000_2(animatorListener, 4));
        objectAnimatorOfFloat.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        C1C7U.LIZIZ("PlayerUIUtil@6f14.showViewWithAnimation$1L");
    }

    public static final void run$2(ARunnableS35S0300000_2 aRunnableS35S0300000_2) {
        boolean zLIZ;
        C1C7U.LIZ("SkylightCellLongClickAbilityImpl@c97d.tryAddStory$4$1");
        try {
            SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl = (SkylightCellLongClickAbilityImpl) aRunnableS35S0300000_2.l0;
            Activity activityLIZ = C1388190mED.LIZ(((View) aRunnableS35S0300000_2.l1).getContext());
            Map map = (Map) aRunnableS35S0300000_2.l2;
            skylightCellLongClickAbilityImpl.getClass();
            SkylightCellLongClickAbilityImpl.LIZ(activityLIZ, map);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SkylightCellLongClickAbilityImpl@c97d.tryAddStory$4$1");
    }

    public static final void run$3(ARunnableS35S0300000_2 aRunnableS35S0300000_2) {
        boolean zLIZ;
        C1C7U.LIZ("PasskeyPopUpHelper@8fbf.tryShowPopUp$1$onSuccess$1");
        try {
            aRunnableS35S0300000_2.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PasskeyPopUpHelper@8fbf.tryShowPopUp$1$onSuccess$1");
    }

    public static final void run$4(ARunnableS35S0300000_2 aRunnableS35S0300000_2) {
        boolean zLIZ;
        C1C7U.LIZ("LiveReplayPlayerUIUtil@2b13.showViewWithAnimation$1");
        try {
            aRunnableS35S0300000_2.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveReplayPlayerUIUtil@2b13.showViewWithAnimation$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a A[Catch: all -> 0x0029, CancellationException -> 0x002e, TryCatch #1 {CancellationException -> 0x002e, blocks: (B:5:0x0013, B:8:0x001a, B:10:0x0022), top: B:23:0x0013, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$5(Y.ARunnableS35S0300000_2 r4) {
        /*
            java.lang.String r3 = "SeaPdpFypAnchorBatchPreload@3a9.batchPreload$imagePrefetchTask$1"
            X.C1C7U.LIZ(r3)
            java.lang.Object r0 = r4.l0     // Catch: java.lang.Throwable -> L33
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r4.l1     // Catch: java.lang.Throwable -> L33
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L33
            java.lang.Object r1 = r4.l2     // Catch: java.lang.Throwable -> L33
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.preload.SeaPdpFypAnchorBatchPreload r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.preload.SeaPdpFypAnchorBatchPreload) r1     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L1a
            boolean r0 = r0.isAttachedToWindow()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2e
            if (r0 != 0) goto L1a
            goto L3e
        L1a:
            java.lang.Object r0 = X.C13LP.LJJJLL(r2)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2e
            if (r0 == 0) goto L3e
            r1.getClass()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2e
            com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.preload.SeaPdpFypAnchorBatchPreload.LJ(r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2e
            goto L3e
        L29:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L33
            goto L3e
        L2e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L33
            throw r0     // Catch: java.lang.Throwable -> L33
        L33:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = X.C2179971ATj.LIZ(r1)
            if (r0 != 0) goto L3e
            throw r1
        L3e:
            X.C1C7U.LIZIZ(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS35S0300000_2.run$5(Y.ARunnableS35S0300000_2):void");
    }

    public static final void run$6(ARunnableS35S0300000_2 aRunnableS35S0300000_2) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileNavbarSettingProtocol@e8db.menuPopShow$1$4");
        try {
            ProfileNavbarSettingProtocol profileNavbarSettingProtocol = (ProfileNavbarSettingProtocol) aRunnableS35S0300000_2.l0;
            View view = (View) aRunnableS35S0300000_2.l1;
            TuxTextView tuxTextView = (TuxTextView) aRunnableS35S0300000_2.l2;
            profileNavbarSettingProtocol.getClass();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C13071059p(profileNavbarSettingProtocol, tuxTextView, view, null), 3);
            ((ProfileNavbarSettingProtocol) aRunnableS35S0300000_2.l0).LLLJ = false;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileNavbarSettingProtocol@e8db.menuPopShow$1$4");
    }

    public static final void run$7(ARunnableS35S0300000_2 aRunnableS35S0300000_2) {
        boolean zLIZ;
        C1C7U.LIZ("FollowTaskService@5212.run$1$1$onFollowFailed$1");
        try {
            aRunnableS35S0300000_2.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FollowTaskService@5212.run$1$1$onFollowFailed$1");
    }

    public static final void run$8(ARunnableS35S0300000_2 aRunnableS35S0300000_2) {
        boolean zLIZ;
        C1C7U.LIZ("ECBillboardContentView@5ff7.tryAnimate$1$1");
        try {
            aRunnableS35S0300000_2.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECBillboardContentView@5ff7.tryAnimate$1$1");
    }

    public static final void run$9(ARunnableS35S0300000_2 aRunnableS35S0300000_2) {
        boolean zLIZ;
        C1C7U.LIZ("ECBillboardContentView@5ff7.tryAnimate$1");
        try {
            View view = (View) aRunnableS35S0300000_2.l0;
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS35S0300000_2((View) aRunnableS35S0300000_2.l2, view, (C1733010vCN) aRunnableS35S0300000_2.l1, 8));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECBillboardContentView@5ff7.tryAnimate$1");
    }

    public ARunnableS35S0300000_2(ConstraintLayout constraintLayout, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener, int i) {
        this.$t = i;
        if (4 - i != 0) {
            this.l0 = constraintLayout;
            this.l1 = animatorUpdateListener;
            this.l2 = animatorListener;
        } else {
            this.l0 = constraintLayout;
            this.l1 = animatorUpdateListener;
            this.l2 = animatorListener;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS35S0300000_2(android.view.View r2, android.view.View r3, X.C1733010vCN r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 8 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r2
            r0.l2 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS35S0300000_2.<init>(android.view.View, android.view.View, X.0vCN, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS35S0300000_2(Object obj, Activity activity, C259800zU<ECAsyncInflaterV2> c259800zU, Lifecycle lifecycle) {
        this.$t = lifecycle;
        this.l0 = obj;
        this.l1 = activity;
        this.l2 = c259800zU;
    }
}
