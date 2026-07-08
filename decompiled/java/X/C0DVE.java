package X;

import Y.ARunnableS15S0101000_4;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.List;

/* JADX INFO: renamed from: X.0DVE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DVE {
    public static final void LIZ(List list, int i, RecyclerView recyclerView) {
        if (recyclerView != null && !list.isEmpty() && i >= 0 && i < list.size()) {
            HandlerHook.viewPostDelay(recyclerView, new ARunnableS15S0101000_4(i, recyclerView, 2), 300L);
        }
    }
}
