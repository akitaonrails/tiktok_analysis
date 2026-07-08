package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387960mDq extends RecyclerView.ViewHolder {
    public final int LL;
    public final Function2<Integer, C1387990mDt, Unit> LLILLJJLI;
    public final boolean LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;

    public final void L5(C1387990mDt c1387990mDt) {
        C1387970mDr c1387970mDr;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c1387990mDt.LIZ.title);
        TuxTextView tuxTextView = this.LLILZ;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        if (tuxTextView.getWidth() == 0) {
            c1387970mDr = new C1387970mDr(spannableStringBuilder, true, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        } else {
            DynamicLayout dynamicLayout = new DynamicLayout(spannableStringBuilder.toString(), tuxTextView.getPaint(), tuxTextView.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            if (dynamicLayout.getLineCount() < tuxTextView.getMaxLines()) {
                float fMeasureText = tuxTextView.getPaint().measureText(spannableStringBuilder, dynamicLayout.getLineStart(dynamicLayout.getLineCount() - 1), spannableStringBuilder.length());
                if (tuxTextView.getWidth() - fMeasureText >= iLIZIZ2) {
                    c1387970mDr = new C1387970mDr(spannableStringBuilder, true, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                } else {
                    if (tuxTextView.getWidth() - fMeasureText >= iLIZIZ2 - iLIZIZ) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    c1387970mDr = new C1387970mDr(spannableStringBuilder, false, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                }
            } else if (dynamicLayout.getLineCount() == tuxTextView.getMaxLines()) {
                if (tuxTextView.getWidth() - tuxTextView.getPaint().measureText(spannableStringBuilder, dynamicLayout.getLineStart(tuxTextView.getMaxLines() - 1), spannableStringBuilder.length()) >= iLIZIZ2) {
                    c1387970mDr = new C1387970mDr(spannableStringBuilder, true, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                } else {
                    Pair pairI5 = I5(tuxTextView, spannableStringBuilder, iLIZIZ2, dynamicLayout);
                    c1387970mDr = new C1387970mDr((SpannableStringBuilder) pairI5.getFirst(), true, ((Number) pairI5.getSecond()).floatValue());
                }
            } else {
                Pair pairI52 = I5(tuxTextView, spannableStringBuilder, iLIZIZ2, dynamicLayout);
                c1387970mDr = new C1387970mDr((SpannableStringBuilder) pairI52.getFirst(), true, ((Number) pairI52.getSecond()).floatValue());
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = c1387970mDr.LIZ;
        if (Intrinsics.LJFF(c1387990mDt.LIZ.isHot(), Boolean.TRUE)) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_fire_3_fill;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1r);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
            tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
            C419890GdH c419890GdH = new C419890GdH(tuxIconDrawableLIZ, 2);
            boolean zLIZLLL = C426750GoL.LIZLLL(this.itemView.getContext());
            if (!c1387970mDr.LIZIZ) {
                iLIZIZ = 0;
            }
            c419890GdH.LIZIZ(iLIZIZ, 0, zLIZLLL);
            spannableStringBuilder2.append((CharSequence) " ");
            C786410Ut5.q2(spannableStringBuilder2, c419890GdH, spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 17);
        }
        this.LLILZ.LJJJJI(C418440Gaw.LJFF(c1387970mDr.LIZJ, r2.getContext()));
        this.LLILZ.setText(SpannableString.valueOf(spannableStringBuilder2));
    }

    public static Pair I5(TuxTextView tuxTextView, SpannableStringBuilder spannableStringBuilder, int i, DynamicLayout dynamicLayout) {
        DynamicLayout dynamicLayout2 = dynamicLayout;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        while (iLIZIZ2 > iLIZIZ) {
            iLIZIZ2--;
            TextPaint textPaint = new TextPaint();
            textPaint.set(tuxTextView.getPaint());
            float f = iLIZIZ2;
            textPaint.setTextSize(f);
            dynamicLayout2 = new DynamicLayout(spannableStringBuilder.toString(), textPaint, tuxTextView.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            if (dynamicLayout2.getLineCount() <= tuxTextView.getMaxLines() && dynamicLayout2.getLineCount() == tuxTextView.getMaxLines()) {
                if (tuxTextView.getWidth() - textPaint.measureText(spannableStringBuilder, dynamicLayout2.getLineStart(tuxTextView.getMaxLines() - 1), spannableStringBuilder.length()) >= i) {
                    return new Pair(spannableStringBuilder, Float.valueOf(f));
                }
            }
        }
        float width = tuxTextView.getWidth() - (tuxTextView.getPaint().measureText("...") + i);
        int lineStart = dynamicLayout2.getLineStart(tuxTextView.getMaxLines() - 1);
        int i2 = lineStart;
        while (i2 < spannableStringBuilder.length() && '\n' != spannableStringBuilder.charAt(i2)) {
            int i3 = i2 + 1;
            if (tuxTextView.getPaint().measureText(spannableStringBuilder, lineStart, i3) > width) {
                break;
            }
            i2 = i3;
        }
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZ.append(spannableStringBuilder.subSequence(0, i2));
        c1360520lVa.LJI("...");
        return new Pair(new SpannableStringBuilder(c1360520lVa.LIZ), Float.valueOf(iLIZIZ2));
    }

    public C1387960mDq(int i, int i2, View view, Function2 function2, boolean z) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        DrawableContainer drawableContainer;
        super(view);
        this.LL = i;
        this.LLILLJJLI = function2;
        this.LLILLL = z;
        view.setBackgroundResource(i2);
        Drawable background = view.getBackground();
        Drawable.ConstantState constantState = null;
        if ((background instanceof StateListDrawable) && (drawableContainer = (DrawableContainer) background) != null) {
            constantState = drawableContainer.getConstantState();
        }
        if ((constantState instanceof DrawableContainer.DrawableContainerState) && (drawableContainerState = (DrawableContainer.DrawableContainerState) constantState) != null) {
            C089E c089e = new C089E(drawableContainerState.getChildren());
            while (c089e.hasNext()) {
                Drawable drawable = (Drawable) c089e.next();
                if (drawable instanceof GradientDrawable) {
                    ((GradientDrawable) drawable).setCornerRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                }
            }
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.q0f);
        Integer numLIZJ = C1308910kAL.LIZJ(this.LL, tuxTextView.getContext());
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        this.LLILZ = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.q0e);
        Integer numLIZJ2 = C1308910kAL.LIZJ(this.LL, tuxTextView2.getContext());
        if (numLIZJ2 != null) {
            tuxTextView2.setTextColor(numLIZJ2.intValue());
        }
        this.LLILZIL = tuxTextView2;
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.q0d);
    }
}
