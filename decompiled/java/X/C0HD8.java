package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HD8, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HD8 extends LinearLayout {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public C0HD9 LLILLL;
    public C1339460kxc LLILZ;

    public final void setOnNoteClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.a9(this.LLILLJJLI, onClickListener);
    }

    public final void setRepostStatus(C0HD9 c0hd9) {
        String string;
        boolean z;
        boolean z2;
        int i = 8;
        if (c0hd9 == null) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        int visibility2 = getVisibility();
        boolean z3 = false;
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
        boolean z4 = c0hd9.LIZ;
        if (z4 && c0hd9.LJ) {
            string = getContext().getString(2131846389);
        } else if (c0hd9.LIZIZ > 1) {
            string = getContext().getString(2131846386, Integer.valueOf(c0hd9.LIZIZ));
        } else if (z4) {
            string = getContext().getString(2131846388);
        } else {
            String strLIZIZ = c0hd9.LIZLLL;
            if (strLIZIZ == null) {
                strLIZIZ = "";
            }
            if (strLIZIZ.length() != 0 && strLIZIZ.codePointCount(0, strLIZIZ.length()) > 12) {
                int iOffsetByCodePoints = strLIZIZ.offsetByCodePoints(0, 12);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ.substring(0, iOffsetByCodePoints));
                sbLIZ.append("...");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            string = getContext().getString(2131846387, strLIZIZ);
        }
        this.LL.setText(string);
        if (C1360460lVU.LIZIZ.LIZ() && c0hd9.LIZ && !c0hd9.LJ) {
            z = true;
        } else {
            z = false;
        }
        TuxIconView tuxIconView = this.LLILLJJLI;
        if (z) {
            i = 0;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
        TuxIconView tuxIconView2 = this.LLILLJJLI;
        if (z && !c0hd9.LJI) {
            z2 = true;
        } else {
            z2 = false;
        }
        tuxIconView2.setClickable(z2);
        TuxIconView tuxIconView3 = this.LLILLJJLI;
        if (z && !c0hd9.LJI) {
            z3 = true;
        }
        tuxIconView3.setFocusable(z3);
    }

    public C0HD8(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        setOrientation(0);
        setGravity(16);
        setClickable(false);
        setFocusable(false);
        setMinimumHeight(C0HD5.LIZLLL(this, 20));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.zeo);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setTuxFont(72);
        tuxTextView.setMinHeight(C0HD5.LIZLLL(tuxTextView, 20));
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(17);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C0HD5.LIZIZ(tuxTextView, Float.valueOf(4.0f)));
        tuxTextView.setBackground(c384050F3z.LIZ(context));
        int iLIZLLL = C0HD5.LIZLLL(tuxTextView, 6);
        int iLIZLLL2 = C0HD5.LIZLLL(tuxTextView, 2);
        tuxTextView.setPadding(iLIZLLL, iLIZLLL2, iLIZLLL, iLIZLLL2);
        this.LL = tuxTextView;
        addView(tuxTextView);
        int iLIZLLL3 = C0HD5.LIZLLL(this, 14);
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setId(R.id.lcp);
        tuxIconView.setIconRes(R.raw.icon_pen_fill);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
        tuxIconView.setTintColor(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iLIZLLL3, iLIZLLL3);
        layoutParams.setMarginStart(C0HD5.LIZLLL(tuxIconView, 4));
        layoutParams.width = C0HD5.LIZLLL(tuxIconView, 20);
        layoutParams.height = C0HD5.LIZLLL(tuxIconView, 20);
        C786410Ut5.M6(tuxIconView, layoutParams);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z2.LIZJ = Float.valueOf(C0HD5.LIZIZ(tuxIconView, Float.valueOf(4.0f)));
        tuxIconView.setBackground(c384050F3z2.LIZ(context));
        int iLIZLLL4 = C0HD5.LIZLLL(tuxIconView, 3);
        int iLIZLLL5 = C0HD5.LIZLLL(tuxIconView, 3);
        tuxIconView.setPadding(iLIZLLL4, iLIZLLL5, iLIZLLL4, iLIZLLL5);
        this.LLILLJJLI = tuxIconView;
        addView(tuxIconView);
    }
}
