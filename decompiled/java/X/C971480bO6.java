package X;

import Y.ACListenerS53S0101000_15;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bO6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971480bO6 extends AbstractC960470b6L<C971410bNz> {
    public final Function1<Integer, Unit> LL;

    /* JADX WARN: Multi-variable type inference failed */
    public C971480bO6(View view, Function1<? super Integer, Unit> function1) {
        super(view);
        this.LL = function1;
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        int i2;
        int i3;
        C971410bNz c971410bNz = (C971410bNz) obj;
        View viewFindViewById = this.itemView.findViewById(R.id.e8r);
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(c971410bNz.LIZ);
            if (c971410bNz.LIZ == -1) {
                gradientDrawable.setStroke(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C497740JfY.LIZLLL(R.attr.es4, viewFindViewById.getContext()));
            }
            viewFindViewById.setBackground(gradientDrawable);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            boolean z = c971410bNz.LIZIZ;
            List<Integer> list = C971490bO7.LIZ;
            if (z) {
                i2 = C971490bO7.LIZJ;
            } else {
                i2 = C971490bO7.LIZIZ;
            }
            layoutParams.width = i2;
            if (z) {
                i3 = C971490bO7.LIZJ;
            } else {
                i3 = C971490bO7.LIZIZ;
            }
            layoutParams.height = i3;
            C786410Ut5.W5(viewFindViewById, layoutParams);
        }
        C786410Ut5.I7(new ACListenerS53S0101000_15(i, this, 6), this.itemView);
    }
}
