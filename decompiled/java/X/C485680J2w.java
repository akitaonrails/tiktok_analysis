package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0J2w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C485680J2w extends LinearLayout {
    public Function0<Unit> LL;

    @Override // android.view.View
    public final boolean performClick() {
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        return super.performClick();
    }

    public final Function0<Unit> getOnBeforeClick() {
        return this.LL;
    }

    public final void setOnBeforeClick(Function0<Unit> function0) {
        this.LL = function0;
    }

    public C485680J2w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
