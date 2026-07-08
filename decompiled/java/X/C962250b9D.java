package X;

import Y.ACListenerS150S0100000_15;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0b9D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962250b9D {
    public static final int LJ() {
        return C500260Jjc.LJJJI(InterfaceC1104970erP.D2.LIZ()) ? R.layout.gud : R.layout.gua;
    }

    public static final int LJFF() {
        return C500260Jjc.LJJJI(InterfaceC1104970erP.D2.LIZ()) ? R.layout.guc : R.layout.gub;
    }

    public static final float LIZIZ() {
        return C1152520g66.LIZ() ? C497740JfY.LJIIIZ(R.dimen.aln) : C497740JfY.LJIIIZ(R.dimen.t8);
    }

    public static final void LIZJ(AnimatorSet animatorSet) {
        if (animatorSet != null && animatorSet.isStarted()) {
            animatorSet.end();
        }
    }

    public static final void LIZLLL(ValueAnimator valueAnimator) {
        if (valueAnimator.isStarted()) {
            valueAnimator.end();
        }
    }

    public static final List<Long> LJII(DataChannel dataChannel) {
        long j = 0;
        List<Long> listLJIILJJIL = C1697810uHb.LJIILJJIL(0L, 0L, 0L);
        if (dataChannel != null) {
            C945060ahU c945060ahU = (C945060ahU) dataChannel.gg0(C956740b0K.class);
            if (c945060ahU != null && c945060ahU.LIZLLL) {
                C945060ahU c945060ahU2 = (C945060ahU) dataChannel.gg0(C956740b0K.class);
                if (c945060ahU2 != null) {
                    j = c945060ahU2.LIZ;
                }
                ListProtector.set(listLJIILJJIL, 0, Long.valueOf(j));
                return listLJIILJJIL;
            }
            C945060ahU c945060ahU3 = (C945060ahU) dataChannel.gg0(C956740b0K.class);
            if (c945060ahU3 != null && c945060ahU3.LIZIZ) {
                C945060ahU c945060ahU4 = (C945060ahU) dataChannel.gg0(C956740b0K.class);
                if (c945060ahU4 != null) {
                    j = c945060ahU4.LIZ;
                }
                ListProtector.set(listLJIILJJIL, 1, Long.valueOf(j));
                return listLJIILJJIL;
            }
            C945060ahU c945060ahU5 = (C945060ahU) dataChannel.gg0(C956740b0K.class);
            if (c945060ahU5 != null) {
                j = c945060ahU5.LIZ;
            }
        }
        ListProtector.set(listLJIILJJIL, 2, Long.valueOf(j));
        return listLJIILJJIL;
    }

    public static final <IN extends View, OUT extends View> OUT LJIIIIZZ(IN in) {
        if (in == null) {
            return null;
        }
        if (in instanceof ViewStub) {
            in = (OUT) C786410Ut5.LJLLLL((ViewStub) in);
            if (!(in instanceof View)) {
                return null;
            }
        }
        return (OUT) in;
    }

    public static final void LJIIJ(C1295960jpS c1295960jpS) {
        if (c1295960jpS != null) {
            c1295960jpS.removeAllAnimatorListeners();
            c1295960jpS.cancelAnimation();
            c1295960jpS.setFrame(0);
        }
    }

    public static final void LIZ(C962490b9b c962490b9b, boolean z) {
        int i;
        LinearLayout.LayoutParams layoutParams;
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.alo);
        if (z && iLJIIIZ > 0) {
            i = -iLJIIIZ;
        } else {
            i = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = null;
        if (c962490b9b != null) {
            layoutParams2 = c962490b9b.getLayoutParams();
        }
        if (!(layoutParams2 instanceof LinearLayout.LayoutParams) || (layoutParams = (LinearLayout.LayoutParams) layoutParams2) == null || layoutParams.topMargin == i) {
            return;
        }
        layoutParams.topMargin = i;
        C786410Ut5.W5(c962490b9b, layoutParams);
    }

    public static final LiveIconView LJI(Context context, Function0 function0) {
        LiveIconView liveIconView = new LiveIconView(context, null);
        C786410Ut5.w6(liveIconView, new ViewGroup.LayoutParams(C439101nJ.LIZ(24), C439101nJ.LIZ(24)));
        liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.d33, context));
        C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(function0, 201));
        liveIconView.setIconAutoMirrored(true);
        LJIIJJI(2131841176, liveIconView);
        return liveIconView;
    }

    public static final void LJIIJJI(int i, View view) {
        String string = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getString(i);
        if (view != null) {
            q0.LJIJ(view, new C759630Tqz(string));
        }
    }

    public static final <T> T LJIIIZ(T t, T t2, Function0<? extends View> function0, int i, boolean z) {
        View viewFindViewById;
        if (Intrinsics.LJFF(t, t2) && z) {
            View viewInvoke = function0.invoke();
            if (viewInvoke != null) {
                viewFindViewById = viewInvoke.findViewById(i);
            } else {
                viewFindViewById = null;
            }
            return (T) LJIIIIZZ(viewFindViewById);
        }
        return t;
    }
}
