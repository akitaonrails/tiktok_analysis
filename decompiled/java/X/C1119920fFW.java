package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.util.SparseIntArray;
import android.widget.TextView;
import com.bytedance.android.live.design.text.LiveTypefaceSpan;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0fFW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119920fFW {
    public static final SparseIntArray LIZ;
    public static final SparseIntArray LIZIZ;
    public static final SparseIntArray LIZJ;
    public static final Map<String, Typeface> LIZLLL;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LIZ = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        LIZIZ = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        LIZJ = sparseIntArray3;
        LIZLLL = new HashMap(2);
        sparseIntArray.put(0, R.style.r_);
        sparseIntArray.put(1, R.style.qv);
        sparseIntArray.put(2, R.style.qy);
        sparseIntArray.put(3, R.style.r1);
        sparseIntArray.put(4, R.style.r7);
        sparseIntArray.put(5, R.style.rc);
        sparseIntArray.put(6, R.style.r4);
        sparseIntArray.put(7, R.style.rf);
        sparseIntArray.put(8, R.style.ri);
        sparseIntArray.put(9, R.style.rl);
        sparseIntArray.put(10, R.style.ro);
        sparseIntArray.put(11, R.style.rr);
        sparseIntArray2.put(0, R.dimen.b1c);
        sparseIntArray2.put(1, R.dimen.b18);
        sparseIntArray2.put(2, R.dimen.b19);
        sparseIntArray2.put(3, R.dimen.b1_);
        sparseIntArray2.put(4, R.dimen.b1b);
        sparseIntArray2.put(5, R.dimen.f619b1d);
        sparseIntArray2.put(6, R.dimen.b1a);
        sparseIntArray2.put(7, R.dimen.b1e);
        sparseIntArray2.put(8, R.dimen.b1f);
        sparseIntArray2.put(9, R.dimen.b1g);
        sparseIntArray2.put(10, R.dimen.b1h);
        sparseIntArray2.put(11, R.dimen.b1i);
        sparseIntArray3.put(0, R.dimen.b11);
        sparseIntArray3.put(1, R.dimen.b0w);
        sparseIntArray3.put(2, R.dimen.b0x);
        sparseIntArray3.put(3, R.dimen.b0y);
        sparseIntArray3.put(4, R.dimen.b10);
        sparseIntArray3.put(5, R.dimen.b12);
        sparseIntArray3.put(6, R.dimen.b0z);
        sparseIntArray3.put(7, R.dimen.b13);
        sparseIntArray3.put(8, R.dimen.b14);
        sparseIntArray3.put(9, R.dimen.b15);
        sparseIntArray3.put(10, R.dimen.b16);
        sparseIntArray3.put(11, R.dimen.b17);
    }

    public static Typeface LIZ(int i) {
        return C1697580uHE.LIZ(i, 30, 1, Float.valueOf(16.0f));
    }

    public static Typeface LIZIZ(int i, int i2) {
        return C1697580uHE.LIZIZ(0.0f, i, 17.0f, 0.0f, Float.valueOf(16.0f), 0.0f, i2, null, 128);
    }

    public static void LJI(int i, TextView textView) {
        if (textView != null) {
            textView.setTypeface(LIZJ(textView.getTextSize(), i, textView.getContext()));
        }
    }

    public static Typeface LIZJ(float f, int i, Context context) {
        int i2;
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (i == 700) {
            i2 = 2;
        } else if (i == 500) {
            i2 = 7;
        } else {
            i2 = 1;
        }
        c1119850fFP.getClass();
        return C1119850fFP.LJIILL(f, i2, context, false);
    }

    public static void LJFF(TextView textView, int i, int i2) {
        if (textView != null) {
            Typeface typeface = textView.getTypeface();
            textView.setTextAppearance(LIZ.get(i));
            textView.setTypeface(typeface);
            C21382118m3.LJFF(textView, textView.getContext().getResources().getDimensionPixelSize(LIZJ.get(i)));
        }
        LJI(i2, textView);
    }

    public static void LJII(Context context, Paint paint, int i) {
        paint.setTypeface(LIZJ(paint.getTextSize(), i, context));
    }

    public static void LIZLLL(Context context, Paint paint, int i, int i2) {
        if (context != null && paint != null) {
            C011Z.LIZ.getClass();
            paint.setTextSize(r2.LJIIJJI(context.getResources().getDimensionPixelSize(LIZIZ.get(i))));
            paint.setTypeface(LIZJ(paint.getTextSize(), i2, context));
        }
    }

    public static void LJIIIIZZ(Spannable spannable, int i, int i2, int i3, int i4) {
        if (spannable != null) {
            int i5 = 400;
            if (i4 == 400 || i4 == 500 || i4 == 700) {
                i5 = i4;
            }
            Typeface typefaceLIZ = C1697580uHE.LIZ(i5, 17.0f, 0.0f, Float.valueOf(16.0f));
            boolean z = true;
            if (i4 != 700) {
                z = false;
            }
            C786410Ut5.o2(spannable, new LiveTypefaceSpan(typefaceLIZ, z), i, i2, i3);
        }
    }

    public static void LJIIIZ(Context context, Spannable spannable, int i, int i2, int i3, int i4) {
        if (context != null && spannable != null) {
            C011Z.LIZ.getClass();
            C786410Ut5.o2(spannable, new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(LIZIZ.get(i4))), i, i2, i3);
        }
    }

    public static void LJ(Context context, Spannable spannable, int i, int i2, int i3, int i4, int i5) {
        LJIIIZ(context, spannable, i, i2, i3, i4);
        LJIIIIZZ(spannable, i, i2, i3, i5);
    }
}
