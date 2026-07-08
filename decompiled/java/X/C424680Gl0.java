package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424680Gl0 implements InterfaceC424690Gl1 {
    public final FrameLayout LIZ;
    public final View LIZIZ;
    public final View LIZJ;

    @Override // X.InterfaceC424690Gl1
    public final void LJJ(boolean z) {
        int i;
        int i2;
        int childCount = this.LIZ.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.LIZ.getChildAt(i3);
            if (childAt == this.LIZIZ) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LJLLLLLL(i2, childAt);
            } else {
                if (!z) {
                    i = 0;
                } else {
                    i = 4;
                }
                C786410Ut5.LJLLLLLL(i, childAt);
            }
        }
    }

    public C424680Gl0(FrameLayout frameLayout, Function1<? super ViewGroup, ? extends Pair<? extends View, ? extends View>> function1) {
        Pair<? extends View, ? extends View> pair;
        this.LIZ = frameLayout;
        if (function1 == null || (pair = function1.invoke(frameLayout)) == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(frameLayout.getContext(), null);
            appCompatTextView.setText(R.string.jb4);
            appCompatTextView.setTextColor(-1);
            appCompatTextView.setGravity(17);
            pair = new Pair<>(appCompatTextView, appCompatTextView);
        }
        frameLayout.addView((View) pair.getFirst(), -1, -1);
        View view = (View) pair.getFirst();
        View view2 = (View) pair.getSecond();
        this.LIZIZ = view;
        this.LIZJ = view2;
    }
}
