package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0GzC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C433480GzC extends FrameLayout {
    public final Context LL;
    public int LLILLJJLI;
    public C433500GzE LLILLL;
    public LinearLayout LLILZ;
    public final List<C0GS0> LLILZIL;
    public Function1<? super Integer, Unit> LLILZLL;

    public final void setColorChangeListener(Function1<? super Integer, Unit> function1) {
        this.LLILZLL = function1;
    }

    public C433480GzC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = context;
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(28.0d)));
        this.LLILZIL = new ArrayList();
        this.LLILZLL = new C433520GzG();
        this.LLILLL = new C433500GzE(context, null);
        this.LLILZ = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C433500GzE c433500GzE = this.LLILLL;
        if (c433500GzE != null) {
            c433500GzE.addView(this.LLILZ, layoutParams);
        }
        C433500GzE c433500GzE2 = this.LLILLL;
        if (c433500GzE2 != null) {
            c433500GzE2.setHorizontalScrollBarEnabled(false);
        }
        addView(this.LLILLL, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLJJLI = getMeasuredHeight();
    }
}
