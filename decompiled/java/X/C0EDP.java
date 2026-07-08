package X;

import Y.ARunnableS105S0100000_5;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EDP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EDP extends AbstractC1585810rMx {
    public RecyclerView LL;
    public Function1<? super SparseArray<View>, Unit> LLILLJJLI;
    public final ARunnableS105S0100000_5 LLILLL = new ARunnableS105S0100000_5(this, 122);
    public final HashSet<Integer> LLILZ = new HashSet<>();

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            HandlerHook.viewRemoveCallbacks(recyclerView, this.LLILLL);
            HandlerHook.viewPost(recyclerView, this.LLILLL);
        }
    }
}
