package X;

import Y.ACListenerS110S0200000_6;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gm1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425310Gm1 extends FrameLayout {
    public final C425320Gm2 LL;

    public C425310Gm1(Context context) {
        super(context, null, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aff, this, false);
        addView(viewTd);
        int i = R.id.clj;
        TextView textView = (TextView) C1616006Uk.LIZ(R.id.clj, viewTd);
        if (textView != null) {
            i = R.id.ni7;
            LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.ni7, viewTd);
            if (linearLayout != null) {
                this.LL = new C425320Gm2((FrameLayout) viewTd, textView, linearLayout);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }

    public final void setRetryAction(Function1<? super View, Unit> function1) {
        TextView textView = this.LL.LLILLJJLI;
        C786410Ut5.I7(new ACListenerS110S0200000_6(textView, function1, 59), textView);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = (int) ((((double) getMeasuredHeight()) * 0.4d) - ((double) C1287910jcT.LIZ(114)));
        int measuredHeight2 = (int) ((((double) getMeasuredHeight()) * 0.7d) + ((double) C1287910jcT.LIZ(42)));
        if (((int) this.LL.LLILLL.getTranslationY()) != measuredHeight) {
            C786410Ut5.hd(this.LL.LLILLL, measuredHeight);
        }
        if (((int) this.LL.LLILLJJLI.getTranslationY()) != measuredHeight2) {
            C786410Ut5.cd(measuredHeight2, this.LL.LLILLJJLI);
        }
    }
}
