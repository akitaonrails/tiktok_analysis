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
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.android.livesdk.broadcast.LiveCenterCueEvent;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterECSuggestionSetting;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.model.message.AnchorReminderWordInfoMsg;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.10xl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19416310xl extends C12O8 {
    public AnchorReminderWordInfoMsg LJ;
    public final C16FV LJFF;
    public final ViewGroup LJI;
    public final TextView LJII;
    public final TextView LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public final C01GW LJIIJJI;
    public final ARunnableS129S0100000_29 LJIIL;
    public int LJIILIIL;
    public final ARunnableS129S0100000_29 LJIILJJIL;

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
        this.LJIIJ = System.currentTimeMillis();
        if (LiveCenterECSuggestionSetting.INSTANCE.isEnabled()) {
            String str = this.LJ.suggestionId;
            if (str.length() > 0 && !Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01UL(str, null), 2);
            }
        }
        C473410IhP.LJ(this.LJIILJJIL);
        this.LJIILIIL = 10;
        TextView textView = this.LJIIIIZZ;
        if (textView != null) {
            textView.setText(u.LJJIFFI(this.LJ.content, "{countdown}", String.valueOf(10), false));
        }
        C473410IhP.LIZJ(this.LJIILJJIL, 1000L);
        C786410Ut5.Pd(ObjectAnimator.ofFloat(this.LJI, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(j));
        C473410IhP.LIZJ(this.LJIIL, 10000L);
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJI;
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        long j;
        C473410IhP.LJ(this.LJIILJJIL);
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
            if (this.LJIIJ != 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIJ;
            }
            C12OY.LJIIL(dataChannelLJ, str, type, jCurrentTimeMillis, this.LJ.suggestionTemplateId, "ec_live_copilot", false, 192);
        }
        C473410IhP.LJ(this.LJIIL);
        DataChannel dataChannelLJ2 = LJ();
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.LC0(LiveCenterCueEvent.class, Float.valueOf(0.0f));
        }
        LJIJJ(false);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.setInterpolator((InterpolatorC2268801DrC) this.LJIIJJI.getValue());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 47));
        valueAnimatorOfFloat.addListener(new AAListenerS276S0200000_29(this, c12ob, 6));
        valueAnimatorOfFloat.start();
    }

    @Override // X.C12O8
    public final void LJIILL(C12O8 c12o8) {
        C19416310xl c19416310xl;
        if ((c12o8 instanceof C19416310xl) && (c19416310xl = (C19416310xl) c12o8) != null) {
            LJIJJLI(c19416310xl.LJ);
        }
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
        C473410IhP.LJ(this.LJIILJJIL);
        this.LJIILIIL = 10;
        TextView textView3 = this.LJIIIIZZ;
        if (textView3 != null) {
            textView3.setText(u.LJJIFFI(this.LJ.content, "{countdown}", String.valueOf(10), false));
        }
        C473410IhP.LIZJ(this.LJIILJJIL, 1000L);
        c19mb.LJIIL(R.id.ghk, (int) C497740JfY.LIZIZ(64.0f));
        LJIJJ(true);
        LiveCenterEntranceWidget liveCenterEntranceWidgetLJI = LJI();
        if (liveCenterEntranceWidgetLJI != null && (view = liveCenterEntranceWidgetLJI.getView()) != null) {
            view.requestLayout();
        }
        ViewGroup viewGroup = this.LJI;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            C12YW c12yw = new C12YW(this, 12);
            viewTreeObserver.addOnGlobalLayoutListener(c12yw);
            C2187701Ajg.LIZ(viewTreeObserver, c12yw, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    @Override // X.C12O8
    public final boolean LJIJ(C12O8 c12o8) {
        if (!(c12o8 instanceof C12O7) && !(c12o8 instanceof C19416410xm) && !(c12o8 instanceof C19416310xl)) {
            return false;
        }
        return true;
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

    public final void LJIJJLI(AnchorReminderWordInfoMsg anchorReminderWordInfoMsg) {
        String str;
        this.LJ = anchorReminderWordInfoMsg;
        TextView textView = this.LJII;
        if (textView != null) {
            Text text = anchorReminderWordInfoMsg.title;
            if (text == null || (str = text.defaultPattern) == null) {
                str = "";
            }
            textView.setText(C1133830fbx.LJIILIIL(text, str).toString());
        }
        TextView textView2 = this.LJIIIIZZ;
        if (textView2 != null) {
            textView2.setText(this.LJ.content);
        }
        C473410IhP.LJ(this.LJIIL);
        C473410IhP.LIZJ(this.LJIIL, 10000L);
    }

    public C19416310xl(View view, AnchorReminderWordInfoMsg anchorReminderWordInfoMsg) {
        super(C12OE.EC_SUGGEST, 8, 0);
        this.LJ = anchorReminderWordInfoMsg;
        this.LJIIJJI = C292401Bi.LIZ(AFwS218S0000000_29.get$arr$(409));
        this.LJFF = (C16FV) view.findViewById(R.id.bnu);
        this.LJI = (ViewGroup) view.findViewById(R.id.ghk);
        this.LJII = (TextView) view.findViewById(R.id.ghm);
        this.LJIIIIZZ = (TextView) view.findViewById(R.id.ghl);
        view.findViewById(R.id.tk9);
        this.LJIIL = new ARunnableS129S0100000_29(this, 186);
        this.LJIILJJIL = new ARunnableS129S0100000_29(this, 185);
    }
}
