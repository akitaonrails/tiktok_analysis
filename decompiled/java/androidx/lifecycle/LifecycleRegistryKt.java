package androidx.lifecycle;

import X.C2188811AlT;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes8.dex */
public final class LifecycleRegistryKt {
    public static final void checkLifecycleStateTransition(LifecycleOwner lifecycleOwner, Lifecycle.State state, Lifecycle.State state2) {
        androidx_lifecycle_LifecycleRegistryKt_com_ss_android_ugc_aweme_utils_LifecycleStateCheckLancet_checkLifecycleStateTransition(lifecycleOwner, state, state2);
    }

    public static final void androidx_lifecycle_LifecycleRegistryKt__checkLifecycleStateTransition$___twin___(LifecycleOwner lifecycleOwner, Lifecycle.State state, Lifecycle.State state2) {
        if (state == Lifecycle.State.INITIALIZED && state2 == Lifecycle.State.DESTROYED) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("State must be at least '");
            sbLIZ.append(Lifecycle.State.CREATED);
            sbLIZ.append("' to be moved to '");
            sbLIZ.append(state2);
            sbLIZ.append("' in component ");
            sbLIZ.append(lifecycleOwner);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
        Lifecycle.State state3 = Lifecycle.State.DESTROYED;
        if (state == state3 && state != state2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("State is '");
            sbLIZ2.append(state3);
            sbLIZ2.append("' and cannot be moved to `");
            sbLIZ2.append(state2);
            sbLIZ2.append("` in component ");
            sbLIZ2.append(lifecycleOwner);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            strLIZIZ2.toString();
            throw new IllegalStateException(strLIZIZ2);
        }
    }

    public static void androidx_lifecycle_LifecycleRegistryKt_com_ss_android_ugc_aweme_utils_LifecycleStateCheckLancet_checkLifecycleStateTransition(LifecycleOwner lifecycleOwner, Lifecycle.State state, Lifecycle.State state2) {
        if (state == Lifecycle.State.INITIALIZED && state2 == Lifecycle.State.DESTROYED) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("State must be at least CREATED to move to ");
            sbLIZ.append(state2);
            sbLIZ.append(", but was ");
            sbLIZ.append(state);
            sbLIZ.append(" in component ");
            sbLIZ.append(lifecycleOwner);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
