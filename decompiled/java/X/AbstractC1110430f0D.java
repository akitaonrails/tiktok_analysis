package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0f0D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1110430f0D<T, M> {
    public final WeakReference<T> LIZ;
    public final EnumC1110450f0F LIZIZ;
    public final List<M> LIZJ;
    public final LifecycleOwner LIZLLL;

    public abstract boolean LIZ(HashMap<String, EmoteModel> map);

    public final void LIZIZ(HashMap<String, EmoteModel> map, Function0<Unit> function0, Function0<Unit> function02) {
        LifecycleOwner lifecycleOwner = this.LIZLLL;
        if (lifecycleOwner != null && lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        if (LIZ(map)) {
            function0.invoke();
        } else {
            function02.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1110430f0D(WeakReference<T> weakReference, EnumC1110450f0F enumC1110450f0F, List<? extends M> list, LifecycleOwner lifecycleOwner) {
        this.LIZ = weakReference;
        this.LIZIZ = enumC1110450f0F;
        this.LIZJ = list;
        this.LIZLLL = lifecycleOwner;
    }
}
