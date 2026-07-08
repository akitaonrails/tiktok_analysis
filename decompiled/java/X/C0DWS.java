package X;

import android.content.Context;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DWS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public class C0DWS extends AbstractC1585810rMx {
    public final Function0<Unit> LL;
    public final Function0<Unit> LLILLJJLI;
    public final int LLILLL;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.LLILLJJLI.invoke();
        }
    }

    public C0DWS(Context context, Function0<Unit> function0, Function0<Unit> function02) {
        int scaledTouchSlop;
        this.LL = function0;
        this.LLILLJJLI = function02;
        if (context != null) {
            scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        } else {
            scaledTouchSlop = 0;
        }
        this.LLILLL = scaledTouchSlop;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        int iAbs = Math.abs(i2);
        if (recyclerView.getScrollState() == 1 && iAbs < this.LLILLL) {
            this.LLILLJJLI.invoke();
            return;
        }
        if (recyclerView.getScrollState() == 1 && iAbs >= this.LLILLL) {
            this.LL.invoke();
        } else {
            if (recyclerView.getScrollState() != 2) {
                return;
            }
            this.LL.invoke();
        }
    }
}
