package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: renamed from: X.0DaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341730DaV {
    public static final void LJ(TextView textView, int i) {
        textView.setTextColor(C446980Hfs.LIZ(textView.getContext(), R.color.bq));
        textView.setHintTextColor(C446980Hfs.LIZ(textView.getContext(), R.color.bu));
        textView.setTextSize(2, 14.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(i);
    }

    public static RecyclerView.LayoutParams LIZLLL(int i, int i2, int i3, Integer num, Integer num2, int i4) {
        int iIntValue;
        if ((i4 & 2) != 0) {
            i = -1;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        if ((i4 & 16) != 0) {
            num = null;
        }
        if ((i4 & 128) != 0) {
            num2 = null;
        }
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, i);
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = i2;
        }
        layoutParams.setMargins(i3, i2, i3, iIntValue);
        if (num != null) {
            layoutParams.setMarginStart(num.intValue());
        }
        return layoutParams;
    }

    public static FrameLayout.LayoutParams LIZ(int i, int i2, int i3, int i4, Integer num, Integer num2, Integer num3, int i5) {
        int iIntValue;
        if ((i5 & 1) != 0) {
            i = -1;
        }
        if ((i5 & 2) != 0) {
            i2 = -1;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        if ((i5 & 32) != 0) {
            num = null;
        }
        if ((i5 & 128) != 0) {
            num2 = null;
        }
        if ((i5 & 256) != 0) {
            num3 = null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = i3;
        }
        layoutParams.setMargins(i4, i3, i4, iIntValue);
        if (num != null) {
            layoutParams.setMarginEnd(num.intValue());
        }
        if (num3 != null) {
            layoutParams.gravity = num3.intValue();
        }
        return layoutParams;
    }

    public static C19ME LIZJ(int i, int i2, int i3, int i4, Integer num, Integer num2, Function1 function1, int i5) {
        if ((i5 & 1) != 0) {
            i = -1;
        }
        if ((i5 & 2) != 0) {
            i2 = -1;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        if ((i5 & 16) != 0) {
            num = null;
        }
        if ((i5 & 32) != 0) {
            num2 = null;
        }
        if ((i5 & 256) != 0) {
            function1 = AFwS232S0000000_4.get$arr$(8);
        }
        C19ME c19me = new C19ME(i, i2);
        c19me.setMargins(i4, i3, i4, i3);
        if (num != null) {
            c19me.setMarginStart(num.intValue());
        }
        if (num2 != null) {
            c19me.setMarginEnd(num2.intValue());
        }
        function1.invoke(c19me);
        return c19me;
    }

    public static LinearLayout.LayoutParams LIZIZ(int i, int i2, int i3, int i4, Integer num, Integer num2, Integer num3, Integer num4, Float f, Integer num5, int i5) {
        int iIntValue;
        if ((i5 & 1) != 0) {
            i = -2;
        }
        if ((i5 & 2) != 0) {
            i2 = -1;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        if ((i5 & 16) != 0) {
            num = null;
        }
        if ((i5 & 32) != 0) {
            num2 = null;
        }
        if ((i5 & 64) != 0) {
            num3 = null;
        }
        if ((i5 & 128) != 0) {
            num4 = null;
        }
        if ((i5 & 256) != 0) {
            f = null;
        }
        if ((i5 & 512) != 0) {
            num5 = null;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        if (num3 != null) {
            iIntValue = num3.intValue();
        } else {
            iIntValue = i3;
        }
        if (num4 != null) {
            i3 = num4.intValue();
        }
        layoutParams.setMargins(i4, iIntValue, i4, i3);
        if (num != null) {
            layoutParams.setMarginStart(num.intValue());
        }
        if (num2 != null) {
            layoutParams.setMarginEnd(num2.intValue());
        }
        if (f != null) {
            layoutParams.weight = f.floatValue();
        }
        if (num5 != null) {
            layoutParams.gravity = num5.intValue();
        }
        return layoutParams;
    }
}
