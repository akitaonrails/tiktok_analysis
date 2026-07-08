package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Glc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425060Glc extends FrameLayout {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final LinearLayout LLILLL;
    public final FrameLayout LLILZ;
    public int LLILZIL;

    public final void LIZ() {
        C786410Ut5.W4(this.LLILLL, 0.0f);
        C786410Ut5.x5(this.LL, 0.0f);
        C786410Ut5.B5(this.LLILLJJLI, 0.0f);
        C786410Ut5.Fb(this.LL, getTargetChevronRotation());
        C786410Ut5.U4(this.LLILZ, 1.0f);
        C786410Ut5.Pb(this.LLILZ, 1.0f);
        C786410Ut5.qc(this.LLILZ, 1.0f);
    }

    private final float getTargetChevronRotation() {
        return C426750GoL.LIZLLL(getContext()) ? 90.0f : -90.0f;
    }

    public C425060Glc(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        C786410Ut5.W4(linearLayout, 0.0f);
        this.LLILLL = linearLayout;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZ = R.raw.icon_chevron_up;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        tuxIconView.setTuxIcon(c419910GdJ);
        C786410Ut5.x5(tuxIconView, 0.0f);
        this.LL = tuxIconView;
        linearLayout.addView(tuxIconView, new LinearLayout.LayoutParams(-2, -2));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(context.getString(2131822547));
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.a1k);
        tuxTextView.setGravity(17);
        C786410Ut5.B5(tuxTextView, 0.0f);
        this.LLILLJJLI = tuxTextView;
        linearLayout.addView(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        addView(linearLayout, layoutParams);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.U4(frameLayout, 0.0f);
        C786410Ut5.Pb(frameLayout, 0.625f);
        C786410Ut5.qc(frameLayout, 0.625f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(C1857690yRT.LJIIJ(R.attr.a00));
        frameLayout.setBackground(gradientDrawable);
        this.LLILZ = frameLayout;
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ2.LIZ = R.raw.icon_chevron_left_ltr;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a0o);
        tuxIconView2.setTuxIcon(c419910GdJ2);
        frameLayout.addView(tuxIconView2, new FrameLayout.LayoutParams(-2, -2, 17));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ, 49);
        layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        addView(frameLayout, layoutParams2);
    }

    public final void LIZIZ(float f) {
        if (f < 30.0f) {
            C786410Ut5.W4(this.LLILLL, 0.0f);
            C786410Ut5.x5(this.LL, 0.0f);
            C786410Ut5.B5(this.LLILLJJLI, 0.0f);
            C786410Ut5.Fb(this.LL, 0.0f);
            C786410Ut5.U4(this.LLILZ, 0.0f);
            C786410Ut5.Pb(this.LLILZ, 0.625f);
            C786410Ut5.qc(this.LLILZ, 0.625f);
            return;
        }
        if (f < 60.0f) {
            float fLIZLLL = C13LZ.LIZLLL((f - 30.0f) / 30.0f, 0.0f, 1.0f);
            C786410Ut5.W4(this.LLILLL, 1.0f);
            C786410Ut5.x5(this.LL, fLIZLLL);
            C786410Ut5.B5(this.LLILLJJLI, fLIZLLL);
            C786410Ut5.Fb(this.LL, 0.0f);
            C786410Ut5.U4(this.LLILZ, 0.0f);
            C786410Ut5.Pb(this.LLILZ, 0.625f);
            C786410Ut5.qc(this.LLILZ, 0.625f);
            return;
        }
        if (f < 90.0f) {
            float fLIZLLL2 = C13LZ.LIZLLL((f - 60.0f) / 30.0f, 0.0f, 1.0f);
            float fLIZLLL3 = C13LZ.LIZLLL((fLIZLLL2 - 0.8888889f) / 0.111111104f, 0.0f, 1.0f);
            float fLIZLLL4 = C13LZ.LIZLLL((f - 86.666664f) / 3.3333359f, 0.0f, 1.0f);
            C786410Ut5.W4(this.LLILLL, 1.0f);
            float f2 = 1.0f - fLIZLLL3;
            C786410Ut5.x5(this.LL, f2);
            C786410Ut5.B5(this.LLILLJJLI, f2);
            C786410Ut5.Fb(this.LL, getTargetChevronRotation() * fLIZLLL2);
            C786410Ut5.U4(this.LLILZ, fLIZLLL4);
            float f3 = (fLIZLLL4 * 0.375f) + 0.625f;
            C786410Ut5.Pb(this.LLILZ, f3);
            C786410Ut5.qc(this.LLILZ, f3);
            return;
        }
        LIZ();
    }

    public final void setContentTopOffset(int i) {
        if (i < 0) {
            i = 0;
        }
        if (this.LLILZIL == i) {
            return;
        }
        this.LLILZIL = i;
        float f = i;
        C786410Ut5.hd(this.LLILLL, f);
        C786410Ut5.fd(this.LLILZ, f);
    }
}
