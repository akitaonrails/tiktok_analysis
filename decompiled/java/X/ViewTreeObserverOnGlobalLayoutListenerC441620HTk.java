package X;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC441620HTk implements ViewTreeObserver.OnGlobalLayoutListener {
    public int LL = -1;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ Function0<C0P0T> LLILLL;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        C0P0T c0p0tInvoke;
        int[] iArr = new int[2];
        this.LLILLJJLI.getLocationOnScreen(iArr);
        int i = iArr[1];
        int i2 = this.LL;
        boolean z = (i2 == -1 || i2 == i) ? false : true;
        this.LL = i;
        if (!z || (c0p0tInvoke = this.LLILLL.invoke()) == null) {
            return;
        }
        c0p0tInvoke.LJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewTreeObserverOnGlobalLayoutListenerC441620HTk(View view, Function0<? extends C0P0T> function0) {
        this.LLILLJJLI = view;
        this.LLILLL = function0;
    }
}
