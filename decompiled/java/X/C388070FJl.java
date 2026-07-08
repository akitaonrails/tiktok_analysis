package X;

import Y.ACListenerS140S0100000_5;
import Y.ALAdapterS2S0100000_5;
import Y.ATListenerS439S0100000_5;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388070FJl extends AbstractC388060FJk {
    public final boolean LLILZLL;
    public final LifecycleOwner LLIZ;
    public final TuxIconView LLIZLLLIL;
    public final C1295960jpS LLJ;
    public C388080FJm LLJI;

    @Override // X.AbstractC388060FJk
    public final C388080FJm L5() {
        return this.LLJI;
    }

    @Override // X.AbstractC388060FJk
    public final void I5(C388080FJm c388080FJm) {
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        this.LLJI = c388080FJm;
        if (this.LLILZLL) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (C387980FJc.LIZ(this.itemView.getContext())) {
                i4 = AbstractC388060FJk.LLILLL;
            } else {
                i4 = AbstractC388060FJk.LLILZ;
            }
            layoutParams.height = i4;
        }
        if (C387980FJc.LIZ(this.itemView.getContext())) {
            ViewGroup.LayoutParams layoutParams2 = this.LLIZLLLIL.getLayoutParams();
            int i5 = AbstractC388060FJk.LLILZIL;
            layoutParams2.height = i5;
            this.LLIZLLLIL.getLayoutParams().width = i5;
            ViewGroup.LayoutParams layoutParams3 = this.LLJ.getLayoutParams();
            if (c388080FJm.LIZ() == 6) {
                i2 = c388080FJm.LJI;
            } else {
                i2 = i5;
            }
            layoutParams3.height = i2;
            ViewGroup.LayoutParams layoutParams4 = this.LLJ.getLayoutParams();
            if (c388080FJm.LIZ() == 6) {
                i5 = c388080FJm.LJFF;
            }
            layoutParams4.width = i5;
            if (c388080FJm.LIZ() == 6) {
                ViewGroup.LayoutParams layoutParams5 = this.LLJ.getLayoutParams();
                if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                    i3 = marginLayoutParams.topMargin;
                } else {
                    i3 = 0;
                }
                C426750GoL.LJIIIZ(this.LLJ, null, Integer.valueOf(i3 - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, null, false, 29);
            }
        }
        C337180DJs.LIZ(this.LLJ);
        C337180DJs.LIZJ(this.LLIZLLLIL);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LJ = Integer.valueOf(this.LLJI.LIZJ);
        C388080FJm c388080FJm2 = this.LLJI;
        if (c388080FJm2.LJII) {
            i = c388080FJm2.LIZLLL;
        } else {
            i = c388080FJm2.LIZIZ;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LIZIZ = c388080FJm2.LJFF;
        c419910GdJ.LIZJ = c388080FJm2.LJI;
        if (c388080FJm2.LIZIZ == R.raw.icon_color_text_transparent) {
            c419910GdJ.LJ = null;
        }
        if (!c388080FJm2.LJ) {
            C786410Ut5.x5(this.LLIZLLLIL, 0.4f);
        } else {
            C786410Ut5.x5(this.LLIZLLLIL, 1.0f);
        }
        this.LLIZLLLIL.setTuxIcon(c419910GdJ);
        this.itemView.setOnTouchListener(new ATListenerS439S0100000_5(this, 10));
        C786410Ut5.I7(new ACListenerS140S0100000_5(this, 162), this.itemView);
        if (!C388010FJf.LIZ() && this.LLJI.LIZ() == 5 && this.LLJI.LJIIIIZZ) {
            C786410Ut5.x3(this.LLIZLLLIL.getViewTreeObserver(), new C0FX0(this, 3));
        }
        if (c388080FJm.LIZ() == 6 && c388080FJm.LJIIIZ != 0 && c388080FJm.LJ) {
            C337180DJs.LIZ(this.LLIZLLLIL);
            C337180DJs.LIZJ(this.LLJ);
            this.LLJ.setAnimation(c388080FJm.LJIIIZ);
            this.LLJ.setRepeatCount(1);
            this.LLJ.setRepeatMode(1);
            this.LLJ.removeAllAnimatorListeners();
            this.LLJ.addAnimatorListener(new ALAdapterS2S0100000_5(this, 38));
            C01GW c01gw = C388090FJn.LIZ;
            if (!((Keva) c01gw.getValue()).getBoolean("text_template_keva_v8_icon_gradient", false)) {
                this.LLJ.playAnimation();
                ((Keva) c01gw.getValue()).storeBoolean("text_template_keva_v8_icon_gradient", true);
            }
        }
    }

    public C388070FJl(FrameLayout frameLayout, boolean z, InterfaceC388110FJp interfaceC388110FJp, LifecycleOwner lifecycleOwner) {
        super(frameLayout, interfaceC388110FJp);
        this.LLILZLL = z;
        this.LLIZ = lifecycleOwner;
        this.LLIZLLLIL = (TuxIconView) frameLayout.findViewById(R.id.ip0);
        this.LLJ = (C1295960jpS) frameLayout.findViewById(R.id.om1);
        this.LLJI = new C388080FJm(0, 0, 0, false, 0, 0, 0, 2047);
        new SafeHandler(lifecycleOwner);
    }
}
