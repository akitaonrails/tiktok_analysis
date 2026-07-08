package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RJ0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RJ0 implements View.OnLayoutChangeListener {
    public final View LL;
    public final Function0<Unit> LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    public C0RJ0(View view, C0RJ1 c0rj1) {
        this.LL = view;
        this.LLILLJJLI = c0rj1;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (!this.LLILLL) {
            return;
        }
        int visibility = this.LL.getVisibility();
        int height = this.LL.getHeight();
        boolean z = false;
        if (visibility == 0 && height > 0) {
            z = true;
        }
        if (z != this.LLILZ) {
            this.LLILLJJLI.invoke();
            this.LLILZ = z;
        }
    }
}
