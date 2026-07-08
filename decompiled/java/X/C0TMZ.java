package X;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TMZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TMZ implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.LL.getViewTreeObserver().isAlive()) {
            C786410Ut5.D3(this.LL.getViewTreeObserver(), this);
        }
        this.LLILLJJLI.invoke();
        return true;
    }

    public C0TMZ(RecyclerView recyclerView, Function0 function0) {
        this.LL = recyclerView;
        this.LLILLJJLI = function0;
    }
}
