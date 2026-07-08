package X;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wD9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1771930wD9 extends FrameLayout {
    public Function0<Unit> LL;

    public C1771930wD9(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Integer num;
        Function0<Unit> function0;
        super.onConfigurationChanged(configuration);
        if (C1771910wD7.LIZJ() == 1 && (num = C1771910wD7.LIZIZ().enableOrientation) != null && num.intValue() == 1 && (function0 = this.LL) != null) {
            function0.invoke();
        }
    }

    public final void setBlock(Function0<Unit> function0) {
        this.LL = function0;
    }

    public C1771930wD9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
