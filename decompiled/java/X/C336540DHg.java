package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336540DHg {
    public static final int LIZ = C341940Daq.LIZ(24.0d);

    public static final void LIZ(C336550DHh c336550DHh, int i, Function1<? super Integer, Unit> function1) {
        View view;
        if (c336550DHh != null && (view = c336550DHh.LIZ) != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                int i2 = LIZ;
                layoutParams.height = Math.max(i, i2);
                function1.invoke(Integer.valueOf(Math.max(i, i2)));
            } else {
                layoutParams = null;
            }
            C786410Ut5.W5(view, layoutParams);
        }
    }
}
