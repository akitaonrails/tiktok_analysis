package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368240EcA {
    public final ViewGroup LIZ;
    public ImageView LIZIZ;
    public final TuxIconDrawable LIZJ;
    public final TuxIconDrawable LIZLLL;
    public final C01GW LJ;
    public TextView LJFF;
    public TextView LJI;
    public TextView LJII;
    public TextView LJIIIIZZ;
    public final LinearLayout LJIIIZ;
    public final float LJIIJ;
    public final Typeface LJIIJJI;
    public final int LJIIL;
    public final C01GW LJIILIIL;
    public final RelativeLayout.LayoutParams LJIILJJIL;
    public final ViewGroup.MarginLayoutParams LJIILL;
    public final ViewGroup.MarginLayoutParams LJIILLIIL;
    public final ViewGroup.MarginLayoutParams LJIIZILJ;
    public final LinearLayout.LayoutParams LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public final int LJIJJLI;
    public final C01GW LJIL;

    public final Drawable LIZ() {
        Typeface typeface = C368130Ebz.LIZ;
        Context context = this.LIZ.getContext();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(C293820BfQ.LIZ() ? R.attr.zc : R.attr.e5);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
        return c384050F3z.LIZ(context);
    }

    public final void LIZIZ() {
        TextView textView = this.LJFF;
        if (textView != null) {
            this.LJIILJJIL.width = this.LJIJJ;
            C786410Ut5.LJJL(textView, this.LJIIIZ);
            LIZLLL();
        }
    }

    public final boolean LIZJ() {
        return ((Boolean) this.LJIL.getValue()).booleanValue();
    }

    public final void LIZLLL() {
        C354270Duj.LIZ(0L, new AwS549S0100000_5(this, 1220));
    }

    public final void LJ() {
        if (this.LJFF == null) {
            TextView textView = new TextView(this.LIZ.getContext());
            this.LJFF = textView;
            textView.setTextColor(textView.getResources().getColor(R.color.bd));
            textView.setBackground(LIZ());
            textView.setTextSize(1, this.LJIIJ);
            textView.setGravity(17);
            C369030EdR.LIZJ(textView, C0FU0.LIZ(4.0f), 0, C0FU0.LIZ(4.0f), 0);
            textView.setCompoundDrawablePadding(C0FU0.LIZ(2.0f));
            textView.setMaxLines(1);
            textView.setTypeface(this.LJIIJJI);
            textView.requestLayout();
        }
        TextView textView2 = this.LJFF;
        if (textView2 != null) {
            this.LJIILJJIL.width = this.LJIJJ;
            C786410Ut5.LJJL(textView2, this.LJIIIZ);
            ImageView imageView = this.LIZIZ;
            this.LJIIIZ.addView(textView2, imageView != null ? this.LJIIIZ.indexOfChild(imageView) : this.LJIIIZ.getChildCount(), this.LJIIZILJ);
            LIZLLL();
        }
    }

    public final void LJFF(String str) {
        Context context;
        TextView textView;
        LJ();
        if (!TextUtils.isEmpty(str) && (textView = this.LJFF) != null) {
            textView.setText(str);
        }
        TuxIconDrawable tuxIconDrawable = this.LIZLLL;
        if (tuxIconDrawable != null) {
            TextView textView2 = this.LJFF;
            if (textView2 != null) {
                textView2.setCompoundDrawablePadding(this.LJIIL);
            }
            TextView textView3 = this.LJFF;
            if (textView3 != null) {
                context = textView3.getContext();
            } else {
                context = null;
            }
            if (C423170GiZ.LIZ(context)) {
                TextView textView4 = this.LJFF;
                if (textView4 != null) {
                    textView4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawable, (Drawable) null);
                    return;
                }
                return;
            }
            TextView textView5 = this.LJFF;
            if (textView5 == null) {
                return;
            }
            textView5.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public C368240EcA(ViewGroup viewGroup, ViewGroup viewGroup2) {
        int iLIZ;
        int iLIZ2;
        int iLIZ3;
        int iLIZ4;
        this.LIZ = viewGroup;
        this.LJ = C452501pT.LIZIZ(new AwS549S0100000_5(viewGroup, 1221));
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        this.LJIIIZ = linearLayout;
        this.LJIIJJI = C368130Ebz.LIZ;
        this.LJIIL = C0FU0.LIZ(2.0f);
        this.LJIILIIL = C452501pT.LIZIZ(new AwS549S0100000_5(viewGroup, 1219));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        this.LJIILJJIL = layoutParams;
        this.LJIILL = new ViewGroup.MarginLayoutParams(C0FU0.LIZ(20.0f), C0FU0.LIZ(18.0f));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(10);
        this.LJIILLIIL = marginLayoutParams;
        this.LJIIZILJ = new ViewGroup.MarginLayoutParams(-2, -2);
        this.LJIJ = new LinearLayout.LayoutParams(-2, -2);
        this.LJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(334));
        linearLayout.setOrientation(0);
        if (LIZJ()) {
            iLIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        } else {
            iLIZ = C0FU0.LIZ(7.0f);
        }
        layoutParams.topMargin = iLIZ;
        layoutParams.addRule(18, viewGroup2.getId());
        C786410Ut5.d6(this.LJIIIZ, this.LJIILJJIL);
        int childCount = viewGroup.getChildCount();
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                break;
            }
            View view = (View) c09re.next();
            if (view instanceof C368290EcF) {
                childCount = viewGroup.indexOfChild(view);
            }
        }
        viewGroup.addView(this.LJIIIZ, childCount - 1, this.LJIILJJIL);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = this.LJIIZILJ;
        if (LIZJ()) {
            iLIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        } else {
            iLIZ2 = C0FU0.LIZ(4.0f);
        }
        marginLayoutParams2.setMarginStart(iLIZ2);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = this.LJIILL;
        if (LIZJ()) {
            iLIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        } else {
            iLIZ3 = C0FU0.LIZ(4.0f);
        }
        marginLayoutParams3.setMarginStart(iLIZ3);
        LinearLayout.LayoutParams layoutParams2 = this.LJIJ;
        if (LIZJ()) {
            iLIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        } else {
            iLIZ4 = C0FU0.LIZ(4.0f);
        }
        layoutParams2.setMarginStart(iLIZ4);
        int iLIZ5 = C0FU0.LIZ(C368130Ebz.LIZIZ);
        this.LJIJJLI = iLIZ5;
        this.LJIJ.height = iLIZ5;
        this.LJIILL.height = iLIZ5;
        this.LJIIZILJ.height = iLIZ5;
        this.LJIIJ = 12.0f;
        TuxIconDrawable tuxIconDrawableLJFF = C368130Ebz.LJFF(R.raw.icon_speaker_x_mark_fill_ltr, R.attr.ee, viewGroup.getContext());
        tuxIconDrawableLJFF.LJII(C390810FTz.LIZ(12.0f));
        tuxIconDrawableLJFF.LJ(C390810FTz.LIZ(12.0f));
        this.LIZJ = tuxIconDrawableLJFF;
        TuxIconDrawable tuxIconDrawableLJFF2 = C368130Ebz.LJFF(R.raw.icon_speed_meter_fill, R.attr.ee, viewGroup.getContext());
        tuxIconDrawableLJFF2.LJII(C390810FTz.LIZ(12.0f));
        tuxIconDrawableLJFF2.LJ(C390810FTz.LIZ(12.0f));
        this.LIZLLL = tuxIconDrawableLJFF2;
    }
}
