package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Yvo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C890020Yvo extends LinearLayout implements InterfaceC422160Ggw {
    public C889910Yvd LL;
    public final C0GRW LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public ViewTreeObserverOnScrollChangedListenerC890030Yvp LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;

    public float getExposureRatioThreshold() {
        return 0.3f;
    }

    public final C889910Yvd getTab$awemenotice_release() {
        return this.LL;
    }

    public final void LIZ(boolean z) {
        Pair pair;
        if (z && this.LL.LIZ != FilterTabType.REQUEST) {
            pair = new Pair(Integer.valueOf(this.LLIZ), Integer.valueOf(this.LLJ));
        } else {
            pair = new Pair(Integer.valueOf(this.LLILZLL), Integer.valueOf(this.LLIZLLLIL));
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        this.LLILLL.setTextColor(iIntValue);
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(iIntValue);
        }
        int iLIZ = C1527905yX.LIZ(this.LL.LJFF) + C1527905yX.LIZ(this.LL.LJI);
        if (iLIZ > 0) {
            C0GRW c0grw = this.LLILLJJLI;
            if (c0grw != null) {
                C786410Ut5.LJLLLLLL(0, c0grw);
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView2);
            }
            TuxTextView tuxTextView3 = this.LLILZ;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(C1618770sE7.LJIIIZ(iLIZ));
            }
        } else {
            C0GRW c0grw2 = this.LLILLJJLI;
            if (c0grw2 != null) {
                C786410Ut5.LJLLLLLL(8, c0grw2);
            }
            TuxTextView tuxTextView4 = this.LLILZ;
            if (tuxTextView4 != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextView4);
            }
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(iIntValue2);
        setBackground(gradientDrawable);
    }

    public final void setTab$awemenotice_release(C889910Yvd c889910Yvd) {
        this.LL = c889910Yvd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.0GRW, android.view.View, java.lang.Object] */
    public C890020Yvo(final Context context, C889910Yvd c889910Yvd) {
        super(context);
        this.LL = c889910Yvd;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -1));
        tuxTextView.setText(this.LL.LIZIZ);
        tuxTextView.setTuxFont(62);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(1);
        this.LLILLL = tuxTextView;
        this.LLILZLL = C1618770sE7.LIZ(R.attr.a1h);
        this.LLIZ = C1618770sE7.LIZ(R.attr.j1);
        this.LLIZLLLIL = C1618770sE7.LIZ(R.attr.br);
        this.LLJ = C1618770sE7.LIZ(R.attr.j0);
        setOrientation(0);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C426750GoL.LJIIL(this, Integer.valueOf(iLIZIZ), 0, Integer.valueOf(iLIZIZ), 0, 16);
        if (this.LL.LIZJ) {
            ?? r10 = new View(context) { // from class: X.0GRW
                public final Paint LL;

                {
                    Paint paint = new Paint();
                    this.LL = paint;
                    paint.setColor(C1618770sE7.LIZ(R.attr.a04));
                    paint.setStyle(Paint.Style.FILL);
                }

                @Override // android.view.View
                public final void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    canvas.drawCircle(getWidth() / 2, getHeight() / 2, C418440Gaw.LIZIZ(3), this.LL);
                }

                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    setMeasuredDimension(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
                }
            };
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r10);
            r10.setLayoutParams(layoutParams2);
            int visibility = r10.getVisibility();
            r10.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, r10);
            this.LLILLJJLI = r10;
            addView(r10);
        }
        addView(tuxTextView);
        if (this.LL.LIZLLL) {
            TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
            layoutParams3.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C786410Ut5.R6(tuxTextView2, layoutParams3);
            tuxTextView2.setTuxFont(62);
            tuxTextView2.setGravity(17);
            tuxTextView2.setMaxLines(1);
            this.LLILZ = tuxTextView2;
            addView(tuxTextView2);
        }
        if (this.LL.LJ) {
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            layoutParams4.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            C786410Ut5.M6(tuxIconView, layoutParams4);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_right_ltr;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            tuxIconView.setTuxIcon(c419910GdJ);
            addView(tuxIconView);
        }
        LIZ(false);
    }
}
