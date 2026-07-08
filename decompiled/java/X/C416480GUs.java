package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0GUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416480GUs {
    public static final void LIZ(View view, Integer num, Integer num2) {
        boolean z;
        int iIntValue;
        int iIntValue2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (num != null && layoutParams.width != (iIntValue2 = num.intValue())) {
            layoutParams.width = iIntValue2;
            z = true;
        } else {
            z = false;
        }
        if (num2 != null && layoutParams.height != (iIntValue = num2.intValue())) {
            layoutParams.height = iIntValue;
        } else if (!z) {
            return;
        }
        C786410Ut5.W5(view, layoutParams);
    }
}
