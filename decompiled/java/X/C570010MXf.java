package X;

import Y.ACListenerS75S0300000_8;
import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0MXf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570010MXf implements InterfaceC1340660kzY, InterfaceC1391650mJn {
    public final Context LIZ;
    public final View LIZIZ;
    public final List<C570020MXg> LIZJ;
    public final InterfaceC570030MXh LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final float LJI;
    public final LinearLayout LJII;
    public C0P0T LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public final void LIZIZ() {
        C0P0T c0p0t = this.LJIIIIZZ;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public final boolean LIZJ() {
        C0P0T c0p0t = this.LJIIIIZZ;
        if (c0p0t != null) {
            return c0p0t.isShowing();
        }
        return false;
    }

    public final void LIZLLL() {
        C1391550mJd c1391550mJd = new C1391550mJd(this.LIZ);
        c1391550mJd.LLILLJJLI.LIZIZ = this.LIZIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LJIIIIZZ = iLIZIZ;
        c1391600mJi.LJIIZILJ = this.LJII;
        c1391600mJi.LJIIL = false;
        Integer numLIZJ = C1308910kAL.LIZJ(this.LJ, this.LIZ);
        c1391550mJd.LJI(numLIZJ != null ? numLIZJ.intValue() : 0);
        c1391550mJd.LJIIIZ(true, null);
        c1391550mJd.LLILLJJLI.LJII = -1001L;
        C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
        this.LJIIIIZZ = c0p0tLIZIZ;
        c0p0tLIZIZ.LJIJ(this);
        C0P0T c0p0t = this.LJIIIIZZ;
        if (c0p0t != null) {
            c0p0t.LJIIIZ(this);
        }
        C0P0T c0p0t2 = this.LJIIIIZZ;
        if (c0p0t2 != null) {
            c0p0t2.show();
        }
    }

    @Override // X.InterfaceC1391650mJn
    public final void onShow() {
        InterfaceC570030MXh interfaceC570030MXh = this.LIZLLL;
        if (interfaceC570030MXh != null) {
            interfaceC570030MXh.onShow();
        }
    }

    @Override // X.InterfaceC1340660kzY
    public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
        if (this.LJIIIZ) {
            this.LJIIIZ = false;
            return;
        }
        InterfaceC570030MXh interfaceC570030MXh = this.LIZLLL;
        if (interfaceC570030MXh != null) {
            interfaceC570030MXh.onCancel();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C570010MXf(Context context, View view, List list, InterfaceC570030MXh interfaceC570030MXh, int i) {
        int i2;
        float f;
        if ((i & 16) != 0) {
            i2 = R.attr.a1d;
        } else {
            i2 = 0;
        }
        int i3 = (i & 32) != 0 ? R.attr.a02 : 0;
        if ((i & 64) != 0) {
            f = 0.4f;
        } else {
            f = 0.0f;
        }
        this(context, view, list, interfaceC570030MXh, i2, i3, f);
    }

    public C570010MXf(Context context, View view, List<C570020MXg> list, InterfaceC570030MXh interfaceC570030MXh, int i, int i2, float f) {
        int iIntValue;
        LinearLayout linearLayout;
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = list;
        this.LIZLLL = interfaceC570030MXh;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = f;
        this.LJIIJ = true;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        C786410Ut5.d6(linearLayout2, layoutParams);
        linearLayout2.setOrientation(1);
        float f2 = 156.0f;
        linearLayout2.setMinimumWidth((int) C11VU.LIZIZ(156.0f, context));
        int i3 = 16;
        linearLayout2.setGravity(16);
        this.LJII = linearLayout2;
        C238400w2 c238400w2 = new C238400w2();
        int i4 = 0;
        for (C570020MXg c570020MXg : list) {
            i4++;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) C11VU.LIZIZ(44.0f, this.LIZ));
            LinearLayout linearLayout3 = new LinearLayout(this.LIZ);
            C786410Ut5.d6(linearLayout3, layoutParams2);
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(i3);
            linearLayout3.setMinimumWidth((int) C11VU.LIZIZ(f2, linearLayout3.getContext()));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.setMarginStart((int) C11VU.LIZIZ(8.0f, this.LIZ));
            layoutParams3.setMarginEnd((int) C11VU.LIZIZ(12.0f, this.LIZ));
            TuxTextView tuxTextView = new TuxTextView(this.LIZ, null, 6, 0);
            tuxTextView.setTextColorRes(c570020MXg.LIZJ);
            tuxTextView.setTuxFont(102);
            tuxTextView.setMinimumWidth((int) C11VU.LIZIZ(104.0f, tuxTextView.getContext()));
            tuxTextView.setMaxWidth((int) C11VU.LIZIZ(198.0f, tuxTextView.getContext()));
            tuxTextView.setMaxLines(1);
            tuxTextView.setGravity(i3);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
            tuxTextView.setText(tuxTextView.getContext().getString(c570020MXg.LIZIZ));
            tuxTextView.measure((int) C11VU.LIZIZ(198.0f, tuxTextView.getContext()), View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
            tuxTextView.layout(0, 0, tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight());
            Layout layout = tuxTextView.getLayout();
            if (layout != null && layout.getEllipsisCount(tuxTextView.getLineCount() - 1) > 0) {
                tuxTextView.setTuxFont(62);
            }
            C786410Ut5.R6(tuxTextView, layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) C11VU.LIZIZ(20.0f, this.LIZ), (int) C11VU.LIZIZ(20.0f, this.LIZ));
            if (C11VU.LJFF(this.LIZ)) {
                layoutParams4.setMarginEnd((int) C11VU.LIZIZ(12.0f, this.LIZ));
            } else {
                layoutParams4.setMarginStart((int) C11VU.LIZIZ(12.0f, this.LIZ));
            }
            View view2 = c570020MXg.LJFF;
            View view3 = view2;
            if (view2 == null) {
                TuxIconView tuxIconView = new TuxIconView(this.LIZ, null, 0, 6, null);
                tuxIconView.setIconRes(c570020MXg.LIZ);
                tuxIconView.setTintColorRes(c570020MXg.LIZLLL);
                view3 = tuxIconView;
            }
            C786410Ut5.W5(view3, layoutParams4);
            view3.setLayoutDirection(0);
            linearLayout3.addView(view3, 0);
            linearLayout3.addView(tuxTextView, 1);
            linearLayout3.setClickable(true);
            C786410Ut5.R7(linearLayout3, new ACListenerS75S0300000_8(c238400w2, this, c570020MXg, 3));
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, (int) C11VU.LIZIZ(0.5f, this.LIZ));
            View view4 = new View(this.LIZ);
            C786410Ut5.W5(view4, layoutParams5);
            Integer numLIZJ = C1308910kAL.LIZJ(this.LJFF, this.LIZ);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            view4.setBackgroundColor(iIntValue);
            C786410Ut5.T4(view4, this.LJI);
            LinearLayout linearLayout4 = this.LJII;
            if (linearLayout4 != null) {
                linearLayout4.addView(linearLayout3);
            }
            if (i4 != this.LIZJ.size() && (linearLayout = this.LJII) != null) {
                linearLayout.addView(view4);
            }
            i3 = 16;
            f2 = 156.0f;
        }
    }
}
