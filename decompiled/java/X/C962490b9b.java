package X;

import Y.ACListenerS118S0200000_15;
import Y.ALAdapterS11S0100000_15;
import Y.AUListenerS222S0200000_15;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multihost.biz.quickcohost.event.QuickCoHostCountDownEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0b9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962490b9b extends ConstraintLayout {
    public C961150b7R LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public C962470b9Z LLIZ;
    public AnimatorSet LLIZLLLIL;
    public AnimatorSet LLJ;
    public DataChannel LLJI;
    public volatile int LLJIJIL;

    private final ViewGroup getDisconnectView() {
        return (ViewGroup) this.LLILZIL.getValue();
    }

    private final ViewGroup getExtensionView() {
        return (ViewGroup) this.LLILZLL.getValue();
    }

    private final C16FV getSplitLine() {
        return (C16FV) this.LLILZ.getValue();
    }

    private final C16F5 getTitleTextView() {
        return (C16F5) this.LLILLJJLI.getValue();
    }

    public final ViewGroup getExtendTitleContainer() {
        return (ViewGroup) this.LLILLL.getValue();
    }

    public final C961150b7R getCurrentHeadViewConfig() {
        return this.LL;
    }

    public final int getInviteListScrollState() {
        return this.LLJIJIL;
    }

    public C962490b9b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void e0(C961150b7R c961150b7R, String str) {
        int i;
        int i2;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applyMultiHostInviteListHeadViewConfig source = ");
        sbLIZ.append(str);
        sbLIZ.append(" config = ");
        sbLIZ.append(c961150b7R);
        C20441214yg.LIZIZ("MultiHostInviteListHeaderView", C2188811AlT.LIZIZ(sbLIZ));
        if (c961150b7R != null) {
            this.LLJI = c961150b7R.LIZ;
            if (c961150b7R.LIZIZ) {
                C500260Jjc.LLFFF(getTitleTextView());
            } else {
                C500260Jjc.LJIILIIL(getTitleTextView());
            }
            C500260Jjc.LJIILIIL(getSplitLine());
            View view = c961150b7R.LIZJ;
            ViewGroup disconnectView = getDisconnectView();
            if (view == null) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LJLZ(i, disconnectView);
            C786410Ut5.LJJJJI(disconnectView);
            if (view != null) {
                View rootView = disconnectView.getRootView();
                if (rootView != null && (viewGroup2 = (ViewGroup) rootView.findViewById(R.id.tmo)) != null) {
                    C786410Ut5.LJLZ(0, viewGroup2);
                }
                disconnectView.addView(view);
            }
            View view2 = c961150b7R.LIZLLL;
            ViewGroup extensionView = getExtensionView();
            if (view2 == null) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            C786410Ut5.LJLZ(i2, extensionView);
            C786410Ut5.LJJJJI(extensionView);
            if (view2 != null) {
                View rootView2 = extensionView.getRootView();
                if (rootView2 != null && (viewGroup = (ViewGroup) rootView2.findViewById(R.id.tmo)) != null) {
                    C786410Ut5.LJLZ(0, viewGroup);
                }
                extensionView.addView(view2);
            }
            View rootView3 = getRootView();
            if (rootView3 != null && (viewFindViewById2 = rootView3.findViewById(R.id.tmo)) != null) {
                DataChannel dataChannel = this.LLJI;
                if (InterfaceC960800b6s.LLLLLJLJLL.LIZIZ().intValue() > 5) {
                    C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                    C785230UrB c785230UrB = new C785230UrB(viewFindViewById2);
                    c785230UrB.LJFF = 48;
                    c785230UrB.LIZLLL(2131851719);
                    c785230UrB.LJIILL = new InterfaceC254600ye() { // from class: X.0b9c
                        @Override // X.InterfaceC254600ye
                        public final void onShow() {
                            InterfaceC960800b6s.LLLLLJLJLL.LJFF(-1);
                        }
                    };
                    c785230UrB.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
                    c785230UrB.LJIIIZ = true;
                    c1113800f5e.LJ(new C785270UrF(c785230UrB), EnumC1120860fH2.COHOST_SETTINGS_BUBBLE, dataChannel);
                }
            }
            if (c961150b7R.LJ && this.LLIZ == null) {
                View rootView4 = getRootView();
                if (rootView4 != null) {
                    viewFindViewById = rootView4.findViewById(R.id.mr1);
                } else {
                    viewFindViewById = null;
                }
                C962470b9Z c962470b9Z = (C962470b9Z) C962250b9D.LJIIIIZZ(viewFindViewById);
                if (c962470b9Z != null) {
                    this.LLIZ = c962470b9Z;
                    int visibility = c962470b9Z.getVisibility();
                    c962470b9Z.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c962470b9Z);
                    DataChannel dataChannel2 = this.LLJI;
                    c962470b9Z.LL = dataChannel2;
                    if (dataChannel2 != null) {
                        dataChannel2.CQ2(QuickCoHostCountDownEvent.class, c962470b9Z, new AwS594S0100000_15(c962470b9Z, 860));
                    }
                }
            }
            Function0<Unit> function0 = c961150b7R.LJFF;
            C786410Ut5.K7(getExtendTitleContainer(), new ACListenerS118S0200000_15(c961150b7R.LJI, this, 47));
            C962470b9Z c962470b9Z2 = this.LLIZ;
            if (c962470b9Z2 != null) {
                C786410Ut5.s8(c962470b9Z2, new ACListenerS118S0200000_15(function0, this, 48));
            }
            if (c961150b7R.LJII) {
                C500260Jjc.LLFFF(this.LLIZ);
            } else {
                C500260Jjc.LJIILIIL(this.LLIZ);
            }
            if (c961150b7R.LJIIIIZZ) {
                C500260Jjc.LLFFF(getExtendTitleContainer());
            } else {
                C500260Jjc.LJIILIIL(getExtendTitleContainer());
            }
            int i3 = c961150b7R.LJIIIZ;
            if (i3 != this.LLJIJIL) {
                this.LLJIJIL = i3;
                if (i3 == EnumC961950b8j.INVITE_LIST_SCROLL_UP_STATE_COMPRESS.getState()) {
                    AnimatorSet animatorSet3 = this.LLIZLLLIL;
                    if ((animatorSet3 != null && animatorSet3.isRunning()) || ((animatorSet2 = this.LLJ) != null && animatorSet2.isRunning())) {
                        C20441214yg.LIZIZ("MultiHostInviteListHeaderView", "updateTitleManagePanelByScrollState to compress title return ");
                    } else {
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getExtendTitleContainer(), (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
                        objectAnimatorOfFloat.setDuration(80L);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLIZ, (Property<C962470b9Z, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat2.addListener(new ALAdapterS11S0100000_15(this, 10));
                        objectAnimatorOfFloat2.setDuration(200L);
                        objectAnimatorOfFloat2.setInterpolator(new InterpolatorC1121730fIR(0.26f, 1.0f, 0.48f));
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-8.0f, 0.0f);
                        valueAnimatorOfFloat.addUpdateListener(new AUListenerS222S0200000_15(this, valueAnimatorOfFloat, 5));
                        valueAnimatorOfFloat.setDuration(200L);
                        valueAnimatorOfFloat.setInterpolator(new InterpolatorC1121730fIR(0.26f, 1.0f, 0.48f));
                        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat2.setDuration(20L);
                        valueAnimatorOfFloat2.addListener(new ALAdapterS11S0100000_15(this, 13));
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        animatorSet4.play(objectAnimatorOfFloat2).after(objectAnimatorOfFloat);
                        animatorSet4.play(objectAnimatorOfFloat2).with(valueAnimatorOfFloat);
                        animatorSet4.play(valueAnimatorOfFloat2).after(objectAnimatorOfFloat2);
                        animatorSet4.start();
                        this.LLJ = animatorSet4;
                    }
                } else if (i3 == EnumC961950b8j.INVITE_LIST_SCROLL_DOWN_STATE.getState()) {
                    AnimatorSet animatorSet5 = this.LLIZLLLIL;
                    if ((animatorSet5 != null && animatorSet5.isRunning()) || ((animatorSet = this.LLJ) != null && animatorSet.isRunning())) {
                        C20441214yg.LIZIZ("MultiHostInviteListHeaderView", "updateTitleManagePanelByScrollState to extend title return ");
                    } else {
                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(getExtendTitleContainer(), (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f);
                        objectAnimatorOfFloat3.setDuration(80L);
                        objectAnimatorOfFloat3.addListener(new ALAdapterS11S0100000_15(this, 11));
                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLIZ, (Property<C962470b9Z, Float>) View.ALPHA, 1.0f, 0.0f);
                        objectAnimatorOfFloat4.setDuration(200L);
                        objectAnimatorOfFloat4.setInterpolator(new InterpolatorC1121730fIR(0.26f, 1.0f, 0.48f));
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(8.0f, 0.0f);
                        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS222S0200000_15(this, valueAnimatorOfFloat3, 6));
                        valueAnimatorOfFloat3.setDuration(200L);
                        valueAnimatorOfFloat3.setInterpolator(new InterpolatorC1121730fIR(0.26f, 1.0f, 0.48f));
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat4.setDuration(20L);
                        valueAnimatorOfFloat4.addListener(new ALAdapterS11S0100000_15(this, 12));
                        AnimatorSet animatorSet6 = new AnimatorSet();
                        animatorSet6.play(objectAnimatorOfFloat3).after(objectAnimatorOfFloat4);
                        animatorSet6.play(objectAnimatorOfFloat4).with(valueAnimatorOfFloat3);
                        animatorSet6.play(valueAnimatorOfFloat4).after(objectAnimatorOfFloat3);
                        animatorSet6.start();
                        this.LLIZLLLIL = animatorSet6;
                    }
                }
            }
            this.LL = c961150b7R;
        }
    }

    public C962490b9b(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h9_, this, true);
        View viewFindViewById = findViewById(R.id.mrv);
        if (viewFindViewById != null) {
            if (C1152520g66.LIZ()) {
                i2 = R.drawable.dob;
            } else {
                i2 = R.drawable.duy;
            }
            viewFindViewById.setBackgroundResource(i2);
        }
        this.LLILLJJLI = C1935407i4.LIZ(new AwS559S0100000_15(this, 524));
        this.LLILLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 521));
        this.LLILZ = C1935407i4.LIZ(new AwS559S0100000_15(this, 523));
        this.LLILZIL = C1935407i4.LIZ(new AwS559S0100000_15(this, 520));
        this.LLILZLL = C1935407i4.LIZ(new AwS559S0100000_15(this, 522));
    }
}
