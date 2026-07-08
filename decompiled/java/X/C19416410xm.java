package X;

import Y.AAListenerS276S0200000_29;
import Y.ARunnableS129S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.android.livesdk.broadcast.LiveCenterCueEvent;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.model.message.AnchorReminderWordInfoMsg;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19416410xm extends C12O8 {
    public AnchorReminderWordInfoMsg LJ;
    public final C16FV LJFF;
    public final ViewGroup LJI;
    public final TextView LJII;
    public final TextView LJIIIIZZ;
    public boolean LJIIIZ;
    public final C01GW LJIIJ;
    public final ARunnableS129S0100000_29 LJIIJJI;
    public long LJIIL;

    @Override // X.C12O8
    public final int LJII() {
        return 37;
    }

    @Override // X.C12O8
    public final int LJIIIZ() {
        return 72;
    }

    @Override // X.C12O8
    public final int LJIIJJI() {
        return 1;
    }

    @Override // X.C12O8
    public final void LJIIZILJ() {
    }

    @Override // X.C12O8
    public final void LJIILJJIL() {
        long j = LiveHostAutoAdaptiveParams.disableLiveCenterAnim() ? 0L : 300L;
        this.LJIIL = System.currentTimeMillis();
        String str = this.LJ.suggestionId;
        if ((str.length() > 0) && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01UM(str, null), 2);
        }
        C786410Ut5.Pd(ObjectAnimator.ofFloat(this.LJI, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(j));
        C473410IhP.LIZJ(this.LJIIJJI, 10000L);
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJI;
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        long j;
        long jCurrentTimeMillis = 0;
        if (LiveHostAutoAdaptiveParams.disableLiveCenterAnim()) {
            j = 0;
        } else {
            j = 150;
        }
        if (!this.LJIIIZ) {
            this.LJIIIZ = true;
            DataChannel dataChannelLJ = LJ();
            String str = this.LJ.messageKey;
            String type = C128V.SUB_TYPE_DISAPPEAR.getType();
            if (this.LJIIL != 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIL;
            }
            C12OY.LJIIL(dataChannelLJ, str, type, jCurrentTimeMillis, this.LJ.suggestionTemplateId, null, false, 224);
        }
        C473410IhP.LJ(this.LJIIJJI);
        DataChannel dataChannelLJ2 = LJ();
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.LC0(LiveCenterCueEvent.class, Float.valueOf(0.0f));
        }
        LJIJJ(false);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator((InterpolatorC2268801DrC) this.LJIIJ.getValue());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 50));
        valueAnimatorOfFloat.addListener(new AAListenerS276S0200000_29(this, c12ob, 9));
        valueAnimatorOfFloat.start();
    }

    @Override // X.C12O8
    public final void LJIILLIIL(C19MB c19mb) {
        ViewTreeObserver viewTreeObserver;
        View view;
        String str;
        TextView textView = this.LJII;
        if (textView != null) {
            Text text = this.LJ.title;
            if (text == null || (str = text.defaultPattern) == null) {
                str = "";
            }
            textView.setText(C1133830fbx.LJIILIIL(text, str).toString());
        }
        TextView textView2 = this.LJIIIIZZ;
        if (textView2 != null) {
            textView2.setText(this.LJ.content);
        }
        c19mb.LJIIL(R.id.fap, (int) C497740JfY.LIZIZ(64.0f));
        LJIJJ(true);
        LiveCenterEntranceWidget liveCenterEntranceWidgetLJI = LJI();
        if (liveCenterEntranceWidgetLJI != null && (view = liveCenterEntranceWidgetLJI.getView()) != null) {
            view.requestLayout();
        }
        ViewGroup viewGroup = this.LJI;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            C12YW c12yw = new C12YW(this, 13);
            viewTreeObserver.addOnGlobalLayoutListener(c12yw);
            C2187701Ajg.LIZ(viewTreeObserver, c12yw, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    @Override // X.C12O8
    public final boolean LJIJ(C12O8 c12o8) {
        return c12o8 instanceof C12O7;
    }

    public final void LJIJJ(boolean z) {
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

    public C19416410xm(View view, AnchorReminderWordInfoMsg anchorReminderWordInfoMsg) {
        ViewGroup viewGroup;
        super(C12OE.ANCHOR_CUE, 8, 0);
        this.LJ = anchorReminderWordInfoMsg;
        this.LJIIJ = C292401Bi.LIZ(AFwS218S0000000_29.get$arr$(410));
        this.LJFF = (C16FV) view.findViewById(R.id.bnu);
        View viewFindViewById = view.findViewById(R.id.fap);
        viewFindViewById = viewFindViewById instanceof ViewStub ? C786410Ut5.LJLLLL((ViewStub) viewFindViewById) : viewFindViewById;
        if (viewFindViewById instanceof ViewGroup) {
            viewGroup = (ViewGroup) viewFindViewById;
        } else {
            viewGroup = null;
        }
        this.LJI = viewGroup;
        this.LJII = (TextView) view.findViewById(R.id.far);
        this.LJIIIIZZ = (TextView) view.findViewById(R.id.faq);
        view.findViewById(R.id.tk9);
        this.LJIIJJI = new ARunnableS129S0100000_29(this, 187);
    }
}
