package androidx.lifecycle;

import X.C2188811AlT;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes4.dex */
public final class SavedStateHandleAttacher implements LifecycleEventObserver {
    public final SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        this.provider = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            this.provider.performRestore();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Next event must be ON_CREATE, it was ");
        sbLIZ.append(event);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }
}
