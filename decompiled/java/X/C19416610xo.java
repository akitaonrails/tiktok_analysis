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
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterEntranceWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;
import qo2.w;

/* JADX INFO: renamed from: X.10xo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19416610xo extends C12O8 {
    public final C1868480yis LJ;
    public final C16FV LJFF;
    public final ViewGroup LJI;
    public final TextView LJII;
    public final LiveIconView LJIIIIZZ;
    public final TextView LJIIIZ;
    public final C01GW LJIIJ;
    public final ARunnableS129S0100000_29 LJIIJJI;

    @Override // X.C12O8
    public final int LJIIIZ() {
        return 141;
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
        TextView textView = this.LJII;
        if (textView != null) {
            textView.setScrollX(0);
        }
        System.currentTimeMillis();
        C786410Ut5.Pd(ObjectAnimator.ofFloat(this.LJI, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f));
        C473410IhP.LIZJ(this.LJIIJJI, 10000L);
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJI;
    }

    public C19416610xo(View view) {
        super(C12OE.SLR_DIAMONDS, 6, 0);
        this.LJ = null;
        this.LJIIJ = C292401Bi.LIZ(AFwS218S0000000_29.get$arr$(412));
        this.LJFF = (C16FV) view.findViewById(R.id.bnu);
        this.LJI = (ViewGroup) view.findViewById(R.id.vlk);
        this.LJII = (TextView) view.findViewById(R.id.vln);
        this.LJIIIIZZ = (LiveIconView) view.findViewById(R.id.vll);
        this.LJIIIZ = (TextView) view.findViewById(R.id.vlm);
        view.findViewById(R.id.tk9);
        this.LJIIJJI = new ARunnableS129S0100000_29(this, 192);
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        C473410IhP.LJ(this.LJIIJJI);
        LJIJJ(false);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator((InterpolatorC2268801DrC) this.LJIIJ.getValue());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 52));
        valueAnimatorOfFloat.addListener(new AAListenerS276S0200000_29(this, c12ob, 12));
        valueAnimatorOfFloat.start();
    }

    @Override // X.C12O8
    public final void LJIILLIIL(C19MB c19mb) {
        String str;
        String str2;
        String str3;
        ViewTreeObserver viewTreeObserver;
        View view;
        C1868490yit c1868490yit;
        C1868490yit c1868490yit2;
        C1868490yit c1868490yit3;
        C1868480yis c1868480yis = this.LJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_manager_cues_msg_show");
        c474500IjALIZ.LJJII("playbook", "msg_type");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
        String str4 = null;
        if (c1868480yis != null && (c1868490yit3 = c1868480yis.LJI) != null) {
            str = c1868490yit3.LIZ;
        } else {
            str = null;
        }
        c474500IjALIZ.LJJII(str, "playbook_id");
        if (c1868480yis != null && (c1868490yit2 = c1868480yis.LJI) != null) {
            str2 = c1868490yit2.LIZIZ;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "play_id");
        if (c1868480yis != null && (c1868490yit = c1868480yis.LJI) != null) {
            str3 = c1868490yit.LIZJ;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "feature_name");
        if (c1868480yis != null) {
            str4 = c1868480yis.LJFF;
        }
        c474500IjALIZ.LJJII(str4, "show_text");
        c474500IjALIZ.LIZ();
        TextView textView = this.LJII;
        if (textView != null) {
            textView.setScrollX(0);
        }
        TextView textView2 = this.LJII;
        if (textView2 != null) {
            textView2.setText(C497740JfY.LJIJI(2131856129));
        }
        TextView textView3 = this.LJIIIZ;
        if (textView3 != null) {
            textView3.setText(C497740JfY.LJIJI(2131856128));
        }
        LiveIconView liveIconView = this.LJIIIIZZ;
        if (liveIconView != null) {
            C500260Jjc.LLFFF(liveIconView);
        }
        C1143680frq.LJ(this.LJIIIIZZ, "tiktok_live_broadcast_demand_13", "ttlive_slr_diamonds.png", ImageView.ScaleType.CENTER_CROP);
        c19mb.LJIIL(R.id.vlk, (int) C497740JfY.LIZIZ(64.0f));
        LJIJJ(true);
        LiveCenterEntranceWidget liveCenterEntranceWidgetLJI = LJI();
        if (liveCenterEntranceWidgetLJI != null && (view = liveCenterEntranceWidgetLJI.getView()) != null) {
            view.requestLayout();
        }
        ViewGroup viewGroup = this.LJI;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            C12YW c12yw = new C12YW(this, 15);
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
}
