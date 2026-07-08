package X;

import Y.AAListenerS276S0200000_29;
import Y.ARunnableS129S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.broadcast.LiveCenterCueEvent;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10xk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19416210xk extends C12O8 {
    public final C0IQ1 LJ;
    public final C16FV LJFF;
    public final ConstraintLayout LJI;
    public final C16F5 LJII;
    public final C16F5 LJIIIIZZ;
    public final ARunnableS129S0100000_29 LJIIIZ;
    public long LJIIJ;
    public C12YW LJIIJJI;

    @Override // X.C12O8
    public final int LJIIJJI() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // X.C12O8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19416210xk.LJIILJJIL():void");
    }

    @Override // X.C12O8
    public final void LJIIZILJ() {
        C473410IhP.LJ(this.LJIIIZ);
        LJIJJ();
        LJIJJLI();
    }

    public final void LJIJJ() {
        ConstraintLayout constraintLayout = this.LJI;
        ViewTreeObserver viewTreeObserver = constraintLayout != null ? constraintLayout.getViewTreeObserver() : null;
        C12YW c12yw = this.LJIIJJI;
        if (viewTreeObserver != null && viewTreeObserver.isAlive() && c12yw != null) {
            C786410Ut5.C3(viewTreeObserver, c12yw);
        }
        this.LJIIJJI = null;
    }

    public final void LJIJJLI() {
        ConstraintLayout constraintLayout = this.LJI;
        if (constraintLayout != null) {
            C786410Ut5.c5(constraintLayout, 0.0f);
        }
        ConstraintLayout constraintLayout2 = this.LJI;
        if (constraintLayout2 != null) {
            C786410Ut5.Y7(constraintLayout2, null);
        }
        this.LJIIJ = 0L;
        C16F5 c16f5 = this.LJII;
        if (c16f5 != null) {
            c16f5.setText("");
        }
        C16F5 c16f52 = this.LJIIIIZZ;
        if (c16f52 != null) {
            c16f52.setText("");
        }
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJI;
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        long j;
        float alpha;
        C473410IhP.LJ(this.LJIIIZ);
        LJIJJ();
        if (LiveHostAutoAdaptiveParams.disableLiveCenterAnim()) {
            j = 0;
        } else {
            j = 150;
        }
        DataChannel dataChannelLJ = LJ();
        if (dataChannelLJ != null) {
            dataChannelLJ.LC0(LiveCenterCueEvent.class, Float.valueOf(0.0f));
        }
        LJIL(false);
        float[] fArr = new float[2];
        ConstraintLayout constraintLayout = this.LJI;
        if (constraintLayout != null) {
            alpha = constraintLayout.getAlpha();
        } else {
            alpha = 1.0f;
        }
        fArr[0] = alpha;
        fArr[1] = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 61));
        valueAnimatorOfFloat.addListener(new AAListenerS276S0200000_29(this, c12ob, 13));
        valueAnimatorOfFloat.start();
    }

    @Override // X.C12O8
    public final void LJIILLIIL(C19MB c19mb) {
        ViewTreeObserver viewTreeObserver;
        View view;
        String string;
        super.LJIILLIIL(c19mb);
        C16F5 c16f5 = this.LJII;
        String string2 = null;
        if (c16f5 != null) {
            Context context = c16f5.getContext();
            if (context != null) {
                C0IQ1 c0iq1 = this.LJ;
                string = context.getString(C466210IPz.LIZ(c0iq1, Integer.valueOf(c0iq1.LIZJ)).LIZ);
            } else {
                string = null;
            }
            c16f5.setText(string);
        }
        C16F5 c16f52 = this.LJIIIIZZ;
        if (c16f52 != null) {
            Context context2 = c16f52.getContext();
            if (context2 != null) {
                C0IQ1 c0iq12 = this.LJ;
                string2 = context2.getString(C466210IPz.LIZ(c0iq12, Integer.valueOf(c0iq12.LIZJ)).LIZIZ);
            }
            c16f52.setText(string2);
        }
        c19mb.LJIIL(R.id.w15, (int) C497740JfY.LIZIZ(64.0f));
        LJIL(true);
        LiveCenterEntranceWidget liveCenterEntranceWidgetLJI = LJI();
        if (liveCenterEntranceWidgetLJI != null && (view = liveCenterEntranceWidgetLJI.getView()) != null) {
            view.requestLayout();
        }
        LJIJJ();
        this.LJIIJJI = new C12YW(this, 11);
        ConstraintLayout constraintLayout = this.LJI;
        if (constraintLayout != null && (viewTreeObserver = constraintLayout.getViewTreeObserver()) != null) {
            C12YW c12yw = this.LJIIJJI;
            viewTreeObserver.addOnGlobalLayoutListener(c12yw);
            C2187701Ajg.LIZ(viewTreeObserver, c12yw, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    @Override // X.C12O8
    public final boolean LJIJ(C12O8 c12o8) {
        return c12o8 instanceof C12O7;
    }

    public final void LJIL(boolean z) {
        Context context;
        Drawable drawableLIZIZ;
        C16FV c16fv = this.LJFF;
        if (c16fv != null && (context = c16fv.getContext()) != null) {
            boolean zLJJ = C497740JfY.LJJ();
            if (z) {
                if (zLJJ) {
                    drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.ene);
                } else {
                    drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.end);
                }
            } else if (zLJJ) {
                drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.enq);
            } else {
                drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.enm);
            }
            C16FV c16fv2 = this.LJFF;
            if (c16fv2 != null) {
                c16fv2.setBackground(drawableLIZIZ);
            }
        }
    }

    public C19416210xk(View view, C0IQ1 c0iq1) {
        super(C12OE.STATUS_DEGRADE_NOTIFY, 6, 0);
        this.LJ = c0iq1;
        this.LJFF = (C16FV) view.findViewById(R.id.bnu);
        this.LJI = (ConstraintLayout) view.findViewById(R.id.w15);
        this.LJII = (C16F5) view.findViewById(R.id.w17);
        this.LJIIIIZZ = (C16F5) view.findViewById(R.id.w16);
        this.LJIIIZ = new ARunnableS129S0100000_29(this, 182);
    }
}
