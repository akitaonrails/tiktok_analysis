package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Us0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785740Us0 {
    public static final /* synthetic */ int LIZ = 0;

    public static View LIZ(Context context, C1749280vcc c1749280vcc, EnumC993050bwt enumC993050bwt, Integer num, Integer num2) {
        int i;
        TuxSkeletonLayout tuxSkeletonLayout;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int[] iArr = C785750Us1.LIZ;
        int i3 = iArr[enumC993050bwt.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                i = R.layout.ekz;
            } else {
                throw new C1954807lC();
            }
        } else {
            i = R.layout.el0;
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), i, c1749280vcc, false);
        if (viewTd == null) {
            return null;
        }
        if ((!(viewTd instanceof TuxSkeletonLayout) || (tuxSkeletonLayout = (TuxSkeletonLayout) viewTd) == null) && (tuxSkeletonLayout = (TuxSkeletonLayout) viewTd.findViewById(R.id.vew)) == null) {
            return null;
        }
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.vf2);
        if (tuxTextView != null) {
            if (num2 != null) {
                tuxTextView.setText(num2.intValue());
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            } else {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
        }
        int i4 = iArr[enumC993050bwt.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                i2 = R.layout.el2;
            } else {
                throw new C1954807lC();
            }
        } else {
            i2 = R.layout.el1;
        }
        tuxSkeletonLayout.setPreviewItemRes(i2);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(800L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(2);
        valueAnimator.setIntValues(tuxSkeletonLayout.getPlaceholderColor(), tuxSkeletonLayout.getPulsingColor());
        valueAnimator.setEvaluator(new ArgbEvaluator());
        tuxSkeletonLayout.setAnimator(valueAnimator);
        if (num != null) {
            int iIntValue = num.intValue();
            ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = iIntValue;
                C786410Ut5.W5(viewTd, marginLayoutParams);
            }
        }
        return viewTd;
    }
}
