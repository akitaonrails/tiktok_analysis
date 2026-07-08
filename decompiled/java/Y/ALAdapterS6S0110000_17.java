package Y;

import X.C1126380fPw;
import X.C12ES;
import X.C16F5;
import X.C19ME;
import X.C786410Ut5;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;

/* JADX INFO: loaded from: classes18.dex */
public class ALAdapterS6S0110000_17 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                this.z1 = true;
                break;
            case 1:
                this.z1 = true;
                break;
            case 2:
                this.z1 = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            case 2:
                onAnimationStart$2(this, animator);
                break;
            case 3:
                onAnimationStart$3(this, animator);
                break;
            case 4:
                onAnimationStart$4(this, animator);
                break;
            case 5:
                onAnimationStart$5(this, animator);
                break;
            case 6:
                onAnimationStart$6(this, animator);
                break;
            case 7:
                onAnimationStart$7(this, animator);
                break;
            case 8:
                onAnimationStart$8(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public ALAdapterS6S0110000_17(C1126380fPw c1126380fPw, int i) {
        this.$t = i;
        this.l0 = c1126380fPw;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final void onAnimationEnd$0(ALAdapterS6S0110000_17 aLAdapterS6S0110000_17, Animator animator) {
        ?? r0;
        if (!aLAdapterS6S0110000_17.z1 && (r0 = ((C1126380fPw) aLAdapterS6S0110000_17.l0).LJ) != 0) {
            r0.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final void onAnimationEnd$1(ALAdapterS6S0110000_17 aLAdapterS6S0110000_17, Animator animator) {
        ?? r0;
        if (!aLAdapterS6S0110000_17.z1 && (r0 = ((C1126380fPw) aLAdapterS6S0110000_17.l0).LJ) != 0) {
            r0.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final void onAnimationEnd$2(ALAdapterS6S0110000_17 aLAdapterS6S0110000_17, Animator animator) {
        ?? r0;
        if (!aLAdapterS6S0110000_17.z1 && (r0 = ((C1126380fPw) aLAdapterS6S0110000_17.l0).LJ) != 0) {
            r0.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final void onAnimationStart$0(ALAdapterS6S0110000_17 aLAdapterS6S0110000_17, Animator animator) {
        ?? r0 = ((C1126380fPw) aLAdapterS6S0110000_17.l0).LIZLLL;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final void onAnimationStart$1(ALAdapterS6S0110000_17 aLAdapterS6S0110000_17, Animator animator) {
        ?? r0 = ((C1126380fPw) aLAdapterS6S0110000_17.l0).LIZLLL;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final void onAnimationStart$2(ALAdapterS6S0110000_17 aLAdapterS6S0110000_17, Animator animator) {
        ?? r0 = ((C1126380fPw) aLAdapterS6S0110000_17.l0).LIZLLL;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    public static final void onAnimationStart$3(ALAdapterS6S0110000_17 aLAdapterS6S0110000_17, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((View) aLAdapterS6S0110000_17.l0).getLayoutParams();
        if (layoutParams instanceof C19ME) {
            C19ME c19me = (C19ME) layoutParams;
            c19me.startToEnd = -1;
            if (!aLAdapterS6S0110000_17.z1) {
                c19me.endToEnd = 0;
            }
        }
        C786410Ut5.W5((View) aLAdapterS6S0110000_17.l0, layoutParams);
    }

    public static final void onAnimationStart$4(ALAdapterS6S0110000_17 aLAdapterS6S0110000_17, Animator animator) {
        ViewGroup.LayoutParams layoutParams = ((View) aLAdapterS6S0110000_17.l0).getLayoutParams();
        if (layoutParams instanceof C19ME) {
            C19ME c19me = (C19ME) layoutParams;
            c19me.startToEnd = -1;
            if (!aLAdapterS6S0110000_17.z1) {
                c19me.endToEnd = 0;
            }
        }
        C786410Ut5.W5((View) aLAdapterS6S0110000_17.l0, layoutParams);
    }

    public static final void onAnimationStart$5(ALAdapterS6S0110000_17 aLAdapterS6S0110000_17, Animator animator) {
        C16F5 c16f5 = ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL;
        if (c16f5 != null) {
            c16f5.setText(2131852433);
            if (aLAdapterS6S0110000_17.z1) {
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setMarqueeRepeatLimit(1);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setSingleLine(true);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setFocusable(true);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setSelected(true);
            }
        }
        C12ES.LJIILL(0, ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIIL);
    }

    public static final void onAnimationStart$6(ALAdapterS6S0110000_17 aLAdapterS6S0110000_17, Animator animator) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0;
        C16F5 c16f5 = liveRoomUserInfoWidget.LLLIIL;
        if (c16f5 != null) {
            liveRoomUserInfoWidget.getClass();
            c16f5.setText(2131853636);
            if (aLAdapterS6S0110000_17.z1) {
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setEllipsize(null);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setMarqueeRepeatLimit(3);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setSingleLine(false);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setFocusable(false);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setSelected(false);
            }
        }
        C12ES.LJIILL(0, ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIIL);
    }

    public static final void onAnimationStart$7(ALAdapterS6S0110000_17 aLAdapterS6S0110000_17, Animator animator) {
        C16F5 c16f5 = ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL;
        if (c16f5 != null) {
            c16f5.setText(2131852433);
            if (aLAdapterS6S0110000_17.z1) {
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setMarqueeRepeatLimit(1);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setSingleLine(true);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setFocusable(true);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setSelected(true);
            }
        }
        C12ES.LJIILL(0, ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIIL);
    }

    public static final void onAnimationStart$8(ALAdapterS6S0110000_17 aLAdapterS6S0110000_17, Animator animator) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0;
        C16F5 c16f5 = liveRoomUserInfoWidget.LLLIIL;
        if (c16f5 != null) {
            liveRoomUserInfoWidget.getClass();
            c16f5.setText(2131853636);
            if (aLAdapterS6S0110000_17.z1) {
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setEllipsize(null);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setMarqueeRepeatLimit(3);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setSingleLine(false);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setFocusable(false);
                ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIL.setSelected(false);
            }
        }
        C12ES.LJIILL(0, ((LiveRoomUserInfoWidget) aLAdapterS6S0110000_17.l0).LLLIIIL);
    }

    public ALAdapterS6S0110000_17(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
