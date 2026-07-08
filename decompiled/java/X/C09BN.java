package X;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.09BN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09BN implements ViewTreeObserver.OnGlobalLayoutListener {
    public final View LL;
    public final Function2<Boolean, Integer, Unit> LLILLJJLI;
    public final Rect LLILLL = new Rect();
    public boolean LLILZ;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iApplyDimension = (int) TypedValue.applyDimension(1, 148.0f, this.LL.getResources().getDisplayMetrics());
        this.LL.getWindowVisibleDisplayFrame(this.LLILLL);
        int height = this.LL.getRootView().getHeight();
        Rect rect = this.LLILLL;
        boolean z = height - (rect.bottom - rect.top) >= iApplyDimension;
        if (z == this.LLILZ) {
            return;
        }
        this.LLILZ = z;
        this.LLILLJJLI.invoke(Boolean.valueOf(z), Integer.valueOf(this.LLILLL.bottom));
    }

    public C09BN(View view, AwS643S0100000_29 awS643S0100000_29) {
        this.LL = view;
        this.LLILLJJLI = awS643S0100000_29;
        C786410Ut5.x3(view.getViewTreeObserver(), this);
    }
}
