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
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;
import webcast.data.RealtimeLiveCenterWhiteBoxPreviewIM;

/* JADX INFO: renamed from: X.10xj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19416110xj extends C12O8 {
    public final RealtimeLiveCenterWhiteBoxPreviewIM LJ;
    public final C16FV LJFF;
    public final ViewGroup LJI;
    public final TextView LJII;
    public boolean LJIIIIZZ;
    public final C12YW LJIIIZ;
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
        ViewTreeObserver viewTreeObserver;
        ViewGroup viewGroup = this.LJI;
        if (viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null) {
            return;
        }
        C12YW c12yw = this.LJIIIZ;
        viewTreeObserver.removeOnGlobalLayoutListener(c12yw);
        C2187701Ajg.LIZIZ(viewTreeObserver, c12yw, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // X.C12O8
    public final void LJIILJJIL() {
        long j = LiveHostAutoAdaptiveParams.disableLiveCenterAnim() ? 0L : 300L;
        this.LJIIL = System.currentTimeMillis();
        C786410Ut5.Pd(ObjectAnimator.ofFloat(this.LJI, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(j));
        C473410IhP.LIZJ(this.LJIIJJI, 10000L);
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJI;
    }

    @Override // X.C12O8
    public final Map<String, String> LJIIJ(String str) {
        return C2097908Jt.LIZJ(new Pair("preview_viewer_cnt", String.valueOf(this.LJ.viewer)));
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
        if (!this.LJIIIIZZ) {
            this.LJIIIIZZ = true;
            DataChannel dataChannelLJ = LJ();
            String type = C128V.SUB_TYPE_DISAPPEAR.getType();
            if (this.LJIIL != 0) {
                jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIL;
            }
            C12OY.LJIIL(dataChannelLJ, CardStruct.IStatusCode.DEFAULT, type, jCurrentTimeMillis, "", null, false, 224);
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
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 51));
        valueAnimatorOfFloat.addListener(new AAListenerS276S0200000_29(this, c12ob, 11));
        valueAnimatorOfFloat.start();
    }

    @Override // X.C12O8
    public final void LJIILLIIL(C19MB c19mb) {
        ViewTreeObserver viewTreeObserver;
        View view;
        TextView textView = this.LJII;
        if (textView != null) {
            textView.setText(this.LJ.bigCardText);
        }
        c19mb.LJIIL(R.id.rsn, (int) C497740JfY.LIZIZ(64.0f));
        LJIJJ(true);
        LiveCenterEntranceWidget liveCenterEntranceWidgetLJI = LJI();
        if (liveCenterEntranceWidgetLJI != null && (view = liveCenterEntranceWidgetLJI.getView()) != null) {
            view.requestLayout();
        }
        ViewGroup viewGroup = this.LJI;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            C12YW c12yw = this.LJIIIZ;
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

    public C19416110xj(View view, RealtimeLiveCenterWhiteBoxPreviewIM realtimeLiveCenterWhiteBoxPreviewIM) {
        super(C12OE.PREVIEW_WATCH_XL, 6, 0);
        this.LJ = realtimeLiveCenterWhiteBoxPreviewIM;
        this.LJIIIZ = new C12YW(this, 14);
        this.LJIIJ = C292401Bi.LIZ(AFwS218S0000000_29.get$arr$(411));
        this.LJFF = (C16FV) view.findViewById(R.id.bnu);
        this.LJI = (ViewGroup) view.findViewById(R.id.rsn);
        this.LJII = (TextView) view.findViewById(R.id.rsl);
        view.findViewById(R.id.tk9);
        this.LJIIJJI = new ARunnableS129S0100000_29(this, 189);
    }
}
