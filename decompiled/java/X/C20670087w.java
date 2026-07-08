package X;

import com.bytedance.effectcreatormobile.infrastructure.utils.StateViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.087w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20670087w<T> extends WeakReference<T> {
    public final /* synthetic */ StateViewModel LIZ;

    @Override // java.lang.ref.Reference
    public final T get() {
        T t = (T) super.get();
        if (t == null) {
            return null;
        }
        StateViewModel stateViewModel = this.LIZ;
        if (!((ArrayList) stateViewModel.LL).contains(t)) {
            return null;
        }
        ((ArrayList) stateViewModel.LL).remove(t);
        return t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20670087w(StateViewModel stateViewModel, T t) {
        super(t);
        this.LIZ = stateViewModel;
    }
}
