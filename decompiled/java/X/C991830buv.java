package X;

import Y.ARunnableS49S0300000_16;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0buv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991830buv {
    public static final void LIZ(RecyclerView recyclerView, Function0<Unit> function0) {
        if (recyclerView.isComputingLayout()) {
            HandlerHook.viewPost(recyclerView, new ARunnableS49S0300000_16(recyclerView, recyclerView, function0, 19));
        } else {
            function0.invoke();
        }
    }
}
