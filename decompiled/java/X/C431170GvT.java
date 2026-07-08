package X;

import android.content.Context;
import android.text.Layout;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431170GvT {
    public static int LIZLLL(TextView textView) {
        int compoundDrawablePadding = 0;
        if (textView.getCompoundDrawables()[0] != null) {
            compoundDrawablePadding = textView.getCompoundDrawablePadding() + textView.getCompoundDrawables()[0].getIntrinsicWidth();
        }
        return compoundDrawablePadding + textView.getPaddingLeft();
    }

    public static int LJ(TextView textView) {
        int intrinsicHeight;
        if (textView.getCompoundDrawables()[1] != null) {
            intrinsicHeight = textView.getCompoundDrawables()[1].getIntrinsicHeight() + textView.getCompoundDrawablePadding();
        } else {
            intrinsicHeight = 0;
        }
        return intrinsicHeight + textView.getPaddingTop();
    }

    public static int LIZ(float f, Context context) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int LIZIZ(Layout layout, int i, int i2) {
        if (layout != null) {
            try {
                int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(i2), i);
                if (((int) layout.getPrimaryHorizontal(iU3)) > i) {
                    return layout.getOffsetToLeftOf(iU3);
                }
                return iU3;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int LIZJ(TextView textView, int i, int i2) {
        Layout layout;
        int iLIZLLL = i - LIZLLL(textView);
        int iLJ = i2 - LJ(textView);
        if (textView instanceof InterfaceC431030GvF) {
            layout = ((InterfaceC431030GvF) textView).LJIIIIZZ();
        } else {
            layout = textView.getLayout();
        }
        return LIZIZ(layout, iLIZLLL, iLJ);
    }
}
