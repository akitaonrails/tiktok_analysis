package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Grb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428770Grb extends ConstraintLayout {
    public TuxTextView LL;
    public View LLILLJJLI;
    public TuxTextView LLILLL;
    public C1295960jpS LLILZ;
    public C1295960jpS LLILZIL;
    public final int LLILZLL;
    public final long LLIZ;
    public SpannableStringBuilder LLIZLLLIL;

    public final View getAnchorView() {
        return this.LLILLL;
    }

    public final void setAddNameClickListener(View.OnClickListener onClickListener) {
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, onClickListener);
        }
    }

    public final void setAddNameText(String str) {
        if (u.LJJIIJZLJL(str, "+", false)) {
            str = a0.LJLIIIL(str.substring(1)).toString();
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_plus_fill;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, getContext());
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder("  ").append((CharSequence) str);
        C786410Ut5.q2(spannableStringBuilderAppend, c419890GdHLIZIZ, 0, 1, 17);
        TuxTextView tuxTextView = this.LL;
        if (tuxTextView != null) {
            tuxTextView.setText(spannableStringBuilderAppend);
        }
    }

    public final void setBadge(int i) {
        SpannableStringBuilder spannableStringBuilder;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setBadge, count: ");
        sbLIZ.append(i);
        C1720106oR.LJI("AddNameView", C2188811AlT.LIZIZ(sbLIZ));
        if (i > 0) {
            String strValueOf = String.valueOf(i);
            C419890GdH c419890GdHLIZIZ = C419880GdG.LIZIZ(getContext(), i, this.LLILLL, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            spannableStringBuilder = new SpannableStringBuilder(strValueOf);
            C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, 0, strValueOf.length(), 17);
        } else {
            spannableStringBuilder = this.LLIZLLLIL;
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(spannableStringBuilder);
        }
    }

    public final void setPlusViewVisible(boolean z) {
        int i;
        TuxTextView tuxTextView;
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, i);
        }
        View view = this.LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(i, view);
        }
        TuxTextView tuxTextView3 = this.LL;
        if (tuxTextView3 != null) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZLL + 12)));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZLL)));
            if (!z) {
                i2 = this.LLILZLL + 12;
            }
            tuxTextView3.setPaddingRelative(iLIZIZ, iLIZIZ2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LLILZLL))));
        }
        if (!z && (tuxTextView = this.LL) != null) {
            int i3 = this.LLILZLL;
            e0(tuxTextView, 200, 200, 200, 200, i3, i3, i3, i3);
        }
    }

    public final void setVBadge(int i) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        boolean z = false;
        tuxIconDrawableLIZ.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        if (getLayoutDirection() == 1) {
            z = true;
        }
        if (z) {
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setCompoundDrawables(null, null, tuxIconDrawableLIZ, null);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setCompoundDrawables(tuxIconDrawableLIZ, null, null, null);
    }

    public C428770Grb(Context context, C428780Grc c428780Grc) {
        int i;
        int i2;
        int i3;
        super(context);
        this.LLILZLL = 5;
        this.LLIZ = 400L;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.s17);
        tuxTextView.setGravity(8388627);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setMaxLines(1);
        tuxTextView.setTuxFont(62);
        tuxTextView.setMinTextSizePx(C814420VxA.LIZIZ(C418440Gaw.LJ(13)));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        if (c428780Grc.LIZ) {
            i = 5;
        } else {
            i = 0;
        }
        int i4 = 0;
        e0(tuxTextView, 200, 200, 0, 0, i, 5, 0, 5);
        if (c428780Grc.LIZ) {
            i2 = 5;
        } else {
            i2 = 0;
        }
        tuxTextView.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2 + 12))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
        this.LL = tuxTextView;
        C19ME c19me = new C19ME(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)));
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        c19me.bottomToBottom = 0;
        c19me.endToStart = R.id.s0f;
        c19me.horizontalChainStyle = 2;
        c19me.horizontalBias = 0.0f;
        c19me.constrainedWidth = true;
        addView(tuxTextView, c19me);
        View view = new View(context);
        view.setId(R.id.s0e);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a02);
        view.setBackground(c384050F3z.LIZ(context));
        C786410Ut5.LJLLLLLL(0, view);
        this.LLILLJJLI = view;
        C19ME c19me2 = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(12.5d))));
        c19me2.topToTop = 0;
        c19me2.bottomToBottom = 0;
        c19me2.startToStart = R.id.s0f;
        addView(view, c19me2);
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, i4);
        tuxTextView2.setId(R.id.s0f);
        tuxTextView2.setGravity(8388627);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setTuxFont(72);
        tuxTextView2.setMinTextSizePx(C814420VxA.LIZIZ(C418440Gaw.LJ(12)));
        e0(tuxTextView2, 0, 0, 200, 200, 0, 5, 5, 5);
        tuxTextView2.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) 8) + 0.5d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
        C786410Ut5.LLLLZLL(tuxTextView2, 0);
        this.LLILLL = tuxTextView2;
        C19ME c19me3 = new C19ME(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38)));
        c19me3.topToTop = 0;
        c19me3.bottomToBottom = 0;
        c19me3.startToEnd = R.id.s17;
        c19me3.endToEnd = 0;
        addView(tuxTextView2, c19me3);
        if (C960203pA.LIZIZ(context)) {
            i3 = R.raw.tux_lottie_common_infrastructure_addname_star_dark;
        } else {
            i3 = R.raw.tux_lottie_common_infrastructure_addname_star_light;
        }
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        c1295960jpS.setId(R.id.s0d);
        c1295960jpS.setRepeatCount(0);
        c1295960jpS.setRepeatMode(1);
        c1295960jpS.setAnimation(i3);
        C786410Ut5.LLD(8, c1295960jpS);
        this.LLILZ = c1295960jpS;
        C19ME c19me4 = new C19ME(-2, -2);
        c19me4.startToStart = R.id.s17;
        c19me4.bottomToBottom = R.id.s17;
        c19me4.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        addView(c1295960jpS, c19me4);
        C1295960jpS c1295960jpS2 = new C1295960jpS(context);
        c1295960jpS2.setId(R.id.s0g);
        c1295960jpS2.setRepeatCount(0);
        c1295960jpS2.setRepeatMode(1);
        c1295960jpS2.setAnimation(i3);
        C786410Ut5.Wb(c1295960jpS2, -1.0f);
        C786410Ut5.vc(c1295960jpS2, -1.0f);
        C786410Ut5.LLD(8, c1295960jpS2);
        this.LLILZIL = c1295960jpS2;
        C19ME c19me5 = new C19ME(-2, -2);
        c19me5.topToTop = R.id.s17;
        c19me5.endToEnd = R.id.s17;
        c19me5.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), 0);
        addView(c1295960jpS2, c19me5);
    }

    public static void e0(TuxTextView tuxTextView, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        if (tuxTextView.getLayoutDirection() != 1 && !C426750GoL.LIZLLL(tuxTextView.getContext())) {
            i9 = i5;
            i5 = i7;
        } else {
            i9 = i7;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
        c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i4)));
        tuxTextView.setBackground(new InsetDrawable(c384050F3z.LIZ(tuxTextView.getContext()), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i9))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i6))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i5))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i8)))));
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.o_);
        c384050F3z2.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        c384050F3z2.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
        c384050F3z2.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
        c384050F3z2.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i4)));
        InsetDrawable insetDrawable = new InsetDrawable(c384050F3z2.LIZ(tuxTextView.getContext()), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i9))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i6))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i5))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i8))));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, insetDrawable);
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        tuxTextView.setForeground(stateListDrawable);
    }
}
