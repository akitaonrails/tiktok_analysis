package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.122I, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C122I {
    public static final List<C122I> LJIIJJI = new ArrayList();
    public final View LIZ;
    public final C122M LIZIZ;
    public C1DRG LIZJ;
    public boolean LIZLLL;
    public C0P0T LJ;
    public final Context LJFF;
    public final C391040FUw LJI = C391040FUw.LIZ;
    public final BPEAHandler LJII = new BPEAHandler();
    public EnumC1235690iGF LJIIIIZZ = EnumC1235690iGF.TOP;
    public int LJIIIZ = 1;
    public boolean LJIIJ;

    public boolean LIZ(C451220Hmi c451220Hmi) {
        return false;
    }

    public abstract View LJFF();

    public final View LIZJ() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) C11VU.LIZIZ(0.5f, this.LJFF));
        View view = new View(this.LJFF);
        layoutParams.leftMargin = (int) C11VU.LIZIZ(12.0f, this.LJFF);
        layoutParams.rightMargin = (int) C11VU.LIZIZ(12.0f, this.LJFF);
        C786410Ut5.W5(view, layoutParams);
        view.setBackgroundColor(C960203pA.LIZ(R.attr.ee, this.LJFF));
        C786410Ut5.T4(view, 0.2f);
        return view;
    }

    public final LinearLayout LIZLLL() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.LJFF);
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setMinimumWidth((int) C11VU.LIZIZ(104.0f, this.LJFF));
        linearLayout.setGravity(16);
        this.LJIIJ = false;
        return linearLayout;
    }

    public final void LJ() {
        C0P0T c0p0t = this.LJ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public final boolean LJII() {
        this.LJII.removeCallbacksAndMessages(null);
        C0P0T c0p0t = this.LJ;
        if (c0p0t == null || !c0p0t.isShowing()) {
            this.LJ = null;
            return false;
        }
        C0P0T c0p0t2 = this.LJ;
        if (c0p0t2 != null) {
            c0p0t2.dismiss();
        }
        this.LJ = null;
        return true;
    }

    public C122I(View view, C122J c122j) {
        this.LIZ = view;
        this.LIZIZ = c122j;
        this.LJFF = view.getContext();
    }

    public final LinearLayout LIZIZ(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C11VU.LIZIZ(44.0f, this.LJFF));
        LinearLayout linearLayout = new LinearLayout(this.LJFF);
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setMinimumWidth((int) C11VU.LIZIZ(104.0f, this.LJFF));
        AttributeSet attributeSet = null;
        TuxTextView tuxTextView = new TuxTextView(this.LJFF, attributeSet, 6, 0);
        tuxTextView.setTextColor(C960203pA.LIZ(R.attr.ee, this.LJFF));
        tuxTextView.setTuxFont(102);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.LJFF.getString(i2));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart((int) C11VU.LIZIZ(4.0f, this.LJFF));
        layoutParams2.setMarginEnd((int) C11VU.LIZIZ(12.0f, this.LJFF));
        C786410Ut5.R6(tuxTextView, layoutParams2);
        C418740GbQ c418740GbQ = new C418740GbQ(this.LJFF, null);
        c418740GbQ.setImageResource(i);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        if (C11VU.LJFF(this.LJFF)) {
            layoutParams3.setMarginEnd((int) C11VU.LIZIZ(12.0f, this.LJFF));
        } else {
            layoutParams3.setMarginStart((int) C11VU.LIZIZ(12.0f, this.LJFF));
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c418740GbQ);
        c418740GbQ.setLayoutParams(layoutParams3);
        linearLayout.addView(c418740GbQ, 0);
        linearLayout.addView(tuxTextView, 1);
        c418740GbQ.setLayoutDirection(0);
        return linearLayout;
    }

    public final boolean LJIIIIZZ(PointF pointF, boolean z) throws Throwable {
        float fLIZIZ = C11VU.LIZIZ(41.0f, this.LJFF);
        float fLIZIZ2 = (fLIZIZ * this.LJIIIZ) + C11VU.LIZIZ(12.0f, this.LJFF) + C11VU.LIZIZ(60.0f, this.LJFF);
        Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(C786410Ut5.N3(this.LJFF), "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VFnDi0Ssylrp7CItzMd1efxlyvVZbw==", null));
        int width = displayLLILZIL.getWidth();
        int height = displayLLILZIL.getHeight();
        if (z) {
            float f = pointF.x;
            if (f >= 0.0f && pointF.y >= fLIZIZ2 && f <= width) {
                return false;
            }
            return true;
        }
        float f2 = pointF.x;
        if (f2 >= 0.0f && f2 <= width && pointF.y <= height - fLIZIZ2) {
            return false;
        }
        return true;
    }

    public static PointF LJI(RectF rectF, float f, boolean z) {
        PointF pointF = new PointF();
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        float[] fArr = {f2, f3, f4, f3, f2, f5, f4, f5};
        Matrix matrix = new Matrix();
        float f6 = fArr[2];
        float f7 = fArr[0];
        float f8 = ((f6 - f7) / 2.0f) + f7;
        float f9 = fArr[5];
        float f10 = fArr[3];
        matrix.postRotate(f, f8, ((f9 - f10) / 2.0f) + f10);
        matrix.mapPoints(fArr);
        float f11 = fArr[1] + fArr[3];
        float f12 = fArr[5] + fArr[7];
        if (f11 < f12 && !z) {
            pointF.set((fArr[0] + fArr[2]) / 2.0f, f11 / 2.0f);
            return pointF;
        }
        pointF.set((fArr[4] + fArr[6]) / 2.0f, f12 / 2.0f);
        return pointF;
    }

    public void LJIIIZ(RectF rectF, int i, int i2, float f, boolean z, C123U c123u) {
        C1462310o9l c1462310o9l;
        int i3 = 0;
        PointF pointFLJI = LJI(rectF, f, false);
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
        this.LJIIIIZZ = enumC1235690iGF;
        if (LJIIIIZZ(pointFLJI, true)) {
            pointFLJI = LJI(rectF, f, true);
            this.LJIIIIZZ = EnumC1235690iGF.BOTTOM;
            if (LJIIIIZZ(pointFLJI, false)) {
                pointFLJI.x = i;
                pointFLJI.y = i2;
                this.LJIIIIZZ = enumC1235690iGF;
            }
        }
        float f2 = pointFLJI.y;
        C1DRG c1drg = this.LIZJ;
        if (c1drg != null && (c1462310o9l = (C1462310o9l) c1drg.LJIIL(null, C1462310o9l.class)) != null) {
            i3 = c1462310o9l.LIZ;
        }
        pointFLJI.y = f2 + i3;
        if (LIZ(new C451220Hmi(this.LJFF))) {
            C450860Hm8 c450860Hm8 = new C450860Hm8(this.LJFF);
            c450860Hm8.LJI(C960203pA.LIZ(R.attr.uj, this.LJFF));
            c450860Hm8.LLILLJJLI.LIZLLL = this.LJIIIIZZ;
            c450860Hm8.LJIIJ(new AwS608S0100000_29(this, 681));
            c450860Hm8.LLILLJJLI.LJFF = 4;
            c450860Hm8.LIZ((int) pointFLJI.x, (int) pointFLJI.y);
            c450860Hm8.LLILLJJLI.LJII = -1001L;
            c450860Hm8.LJ(new AwS430S0200000_29(c123u, this, 102));
            C0P0T c0p0tLIZIZ = c450860Hm8.LIZIZ();
            this.LJ = c0p0tLIZIZ;
            c0p0tLIZIZ.show();
            return;
        }
        C1391550mJd c1391550mJd = new C1391550mJd(this.LJFF);
        c1391550mJd.LJI(C960203pA.LIZ(R.attr.uj, this.LJFF));
        c1391550mJd.LLILLJJLI.LJFF = 4;
        c1391550mJd.LIZ((int) pointFLJI.x, (int) pointFLJI.y);
        c1391550mJd.LLILLJJLI.LIZLLL = this.LJIIIIZZ;
        c1391550mJd.LLILLJJLI.LJIIZILJ = LJFF();
        c1391550mJd.LJIIIZ(true, null);
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LJIJJ = true;
        c1391600mJi.LJII = -1001L;
        c1391550mJd.LJ(new AwS430S0200000_29(c123u, this, 103));
        C0P0T c0p0tLIZIZ2 = c1391550mJd.LIZIZ();
        this.LJ = c0p0tLIZIZ2;
        c0p0tLIZIZ2.show();
    }
}
