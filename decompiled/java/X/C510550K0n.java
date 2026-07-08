package X;

import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0K0n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510550K0n extends ConstraintLayout {
    public final C417410GYh LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final ImageView LLILZ;
    public final FrameLayout LLILZIL;

    public C510550K0n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final FrameLayout getExtraBottomContainer() {
        return this.LLILZIL;
    }

    public final C417410GYh getIcon() {
        return this.LL;
    }

    public final ImageView getIconArrow() {
        return this.LLILZ;
    }

    public final TextView getSubtitle() {
        return this.LLILLL;
    }

    public final TextView getTitle() {
        return this.LLILLJJLI;
    }

    public final void setUIData(C510630K0v c510630K0v) {
        C19ME c19me;
        this.LLILLJJLI.setText(c510630K0v.LIZJ);
        this.LLILLJJLI.setMovementMethod(LinkMovementMethod.getInstance());
        if (c510630K0v.LIZLLL.length() == 0) {
            C0K0R.LIZ(this.LLILLL);
            ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
            C19ME c19me2 = null;
            if (layoutParams instanceof C19ME) {
                c19me = (C19ME) layoutParams;
                if (c19me != null) {
                    c19me.bottomToBottom = R.id.jxe;
                }
            } else {
                c19me = null;
            }
            C786410Ut5.g6(this.LLILLJJLI, c19me);
            ViewGroup.LayoutParams layoutParams2 = this.LLILZIL.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (c19me2 = (C19ME) layoutParams2) != null) {
                c19me2.topToBottom = R.id.title;
            }
            C786410Ut5.a6(this.LLILZIL, c19me2);
        } else {
            C0K0R.LIZJ(this.LLILLL);
            this.LLILLL.setText(c510630K0v.LIZLLL);
        }
        if (c510630K0v instanceof C510540K0m) {
            C511420K3w.LJIIJ.getClass();
            C511420K3w c511420K3w = new C511420K3w();
            c511420K3w.LIZ = ((C510540K0m) c510630K0v).LJI;
            c511420K3w.LIZ(this.LL);
        } else if (c510630K0v instanceof C510560K0o) {
            C510560K0o c510560K0o = (C510560K0o) c510630K0v;
            if (c510560K0o.LJII.length() > 0) {
                C511430K3x c511430K3x = C511430K3x.LIZ;
                C417410GYh c417410GYh = this.LL;
                String str = c510560K0o.LJII;
                c511430K3x.getClass();
                C511430K3x.LIZLLL(c417410GYh, "tiktok_live_broadcast_demand_5", str);
            } else if (c510560K0o.LIZ() != null) {
                C511420K3w.LJIIJ.getClass();
                C511420K3w c511420K3w2 = new C511420K3w();
                c511420K3w2.LIZ = c510560K0o.LIZ();
                c511420K3w2.LIZ(this.LL);
            } else {
                C0K0R.LIZ(this.LL);
                TextView textView = this.LLILLJJLI;
                ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams.setMarginStart(0);
                    C786410Ut5.W5(textView, marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
        if (c510630K0v.LJ != null) {
            C0K0R.LIZJ(this.LLILZ);
            View.OnClickListener aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(c510630K0v, 148);
            if (C1848410yCV.LIZ) {
                aCListenerS142S0100000_7 = new f(aCListenerS142S0100000_7);
            }
            a aVar = new a(aCListenerS142S0100000_7);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(aVar);
            return;
        }
        C0K0R.LIZ(this.LLILZ);
    }

    public C510550K0n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ffz, this, true);
        this.LL = (C417410GYh) findViewById(R.id.jxe);
        this.LLILLJJLI = (TextView) findViewById(R.id.title);
        this.LLILLL = (TextView) findViewById(R.id.wlq);
        this.LLILZ = (ImageView) findViewById(R.id.b8y);
        this.LLILZIL = (FrameLayout) findViewById(R.id.hil);
    }

    public /* synthetic */ C510550K0n(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
