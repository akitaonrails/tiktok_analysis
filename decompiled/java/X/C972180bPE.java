package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bPE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972180bPE {
    public static final void LIZ(C429470Gsj c429470Gsj, boolean z) {
        ViewGroup.LayoutParams layoutParams = c429470Gsj.getLayoutParams();
        if (layoutParams != null) {
            C19ME c19me = (C19ME) layoutParams;
            if (z) {
                c19me.endToStart = R.id.zq0;
                c19me.endToEnd = -1;
                c19me.horizontalWeight = 1.0f;
            } else {
                c19me.endToStart = -1;
                c19me.endToEnd = 0;
                c19me.horizontalWeight = -1.0f;
            }
            C786410Ut5.W5(c429470Gsj, c19me);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }
}
