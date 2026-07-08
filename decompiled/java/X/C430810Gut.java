package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Gut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C430810Gut {
    public final View LIZ;
    public final TextView LIZIZ;
    public final C16FS LIZJ;
    public String LIZLLL = "";

    public final void LIZ(String str, boolean z) {
        int lineEnd;
        int i;
        Drawable drawableLJIIJ;
        if (this.LIZIZ == null || this.LIZ == null || this.LIZJ == null) {
            return;
        }
        int measuredWidth = (((((this.LIZ.getMeasuredWidth() - this.LIZJ.getMeasuredWidth()) - C497740JfY.LJIIIZ(R.dimen.axd)) - C497740JfY.LJIIIZ(R.dimen.axf)) - C497740JfY.LJIIIZ(R.dimen.axe)) - this.LIZIZ.getPaddingLeft()) - this.LIZIZ.getPaddingRight();
        if (measuredWidth <= 0) {
            this.LIZIZ.setText(str);
            return;
        }
        TextPaint paint = this.LIZIZ.getPaint();
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.axg);
        int iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.axb);
        int iMeasureText = measuredWidth - (((iLJIIIZ + iLJIIIZ2) + ((int) (paint.measureText(" ") * 3))) + ((int) paint.measureText("...")));
        if (iMeasureText <= 0) {
            this.LIZIZ.setText(str);
            return;
        }
        int length = str.length();
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), paint, iMeasureText).setMaxLines(2).build();
        if (staticLayoutBuild.getLineCount() <= 1) {
            lineEnd = length;
        } else {
            lineEnd = staticLayoutBuild.getLineEnd(1);
        }
        if (lineEnd <= 0) {
            lineEnd = length;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0.LJLILLLLZI(str.substring(0, lineEnd)).toString());
        if (lineEnd < length) {
            spannableStringBuilder.append((CharSequence) "...");
        }
        spannableStringBuilder.append((CharSequence) " ");
        if (z && (drawableLJIIJ = C497740JfY.LJIIJ(R.drawable.era)) != null) {
            drawableLJIIJ.setBounds(0, 0, iLJIIIZ, iLJIIIZ);
            C416760GVu c416760GVu = new C416760GVu(drawableLJIIJ);
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) " ");
            C786410Ut5.q2(spannableStringBuilder, c416760GVu, length2, length2 + 1, 33);
        }
        spannableStringBuilder.append((CharSequence) " ");
        Context context = this.LIZIZ.getContext();
        if (C497740JfY.LJJ()) {
            i = R.attr.d2z;
        } else {
            i = R.attr.d3b;
        }
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(i, context);
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.euc, this.LIZIZ.getContext()));
            c20743516FdLIZLLL.setBounds(0, 0, iLJIIIZ2, iLJIIIZ2);
            c20743516FdLIZLLL.setBounds(0, 0, iLJIIIZ2, iLJIIIZ2);
            C416760GVu c416760GVu2 = new C416760GVu(c20743516FdLIZLLL);
            int length3 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) " ");
            C786410Ut5.q2(spannableStringBuilder, c416760GVu2, length3, length3 + 1, 33);
        }
        this.LIZIZ.setText(spannableStringBuilder);
    }

    public C430810Gut(View view, TextView textView, C16FS c16fs) {
        this.LIZ = view;
        this.LIZIZ = textView;
        this.LIZJ = c16fs;
    }
}
