package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970000bLi extends AbstractC960440b6I<C970010bLj> {
    public final TextView LL;

    public C970000bLi(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.xir);
    }

    public final void L5(C970010bLj c970010bLj) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String strLJIJJ;
        ViewGroup.LayoutParams layoutParams = this.LL.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i = c970010bLj.LIZ;
        if (i != 0) {
            if (i == 1) {
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                }
                if (C934890aR5.LIZ()) {
                    this.LL.setText(C497740JfY.LJIJI(2131854236));
                } else {
                    this.LL.setText(C497740JfY.LJIJI(2131854976));
                }
            }
        } else {
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            TextView textView = this.LL;
            int i2 = c970010bLj.LIZIZ;
            if (i2 <= 0) {
                strLJIJJ = C497740JfY.LJIJI(2131854942);
            } else {
                strLJIJJ = C497740JfY.LJIJJ(2131854981, Integer.valueOf(i2));
            }
            textView.setText(strLJIJJ);
        }
        C786410Ut5.g6(this.LL, marginLayoutParams);
    }

    @Override // X.AbstractC960440b6I
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C970010bLj) obj);
    }
}
