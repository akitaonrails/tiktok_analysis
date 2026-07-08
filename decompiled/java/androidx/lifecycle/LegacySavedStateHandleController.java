package androidx.lifecycle;

import X.C128Y;
import X.C128Z;
import X.C197066128i;
import X.C2188811AlT;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;

/* JADX INFO: loaded from: classes30.dex */
public final class LegacySavedStateHandleController {
    public static final LegacySavedStateHandleController INSTANCE = new LegacySavedStateHandleController();

    public static final class OnRecreation implements C128Z {
        @Override // X.C128Z
        public void onRecreated(C128Y c128y) {
            if (c128y instanceof ViewModelStoreOwner) {
                ViewModelStore viewModelStore = ((ViewModelStoreOwner) c128y).getViewModelStore();
                C197066128i savedStateRegistry = c128y.getSavedStateRegistry();
                Iterator it2 = viewModelStore.keys().iterator();
                while (it2.hasNext()) {
                    ViewModel viewModel = viewModelStore.get((String) it2.next());
                    if (viewModel != null) {
                        LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, c128y.getLifecycle());
                    }
                }
                if (!viewModelStore.keys().isEmpty()) {
                    savedStateRegistry.LIZLLL(OnRecreation.class);
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
            sbLIZ.append(c128y);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
    }

    private final void tryToAddRecreator(final C197066128i c197066128i, final Lifecycle lifecycle) {
        Lifecycle.State currentState = lifecycle.getCurrentState();
        if (currentState != Lifecycle.State.INITIALIZED && !currentState.isAtLeast(Lifecycle.State.STARTED)) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController.tryToAddRecreator.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.removeObserver(this);
                        c197066128i.LIZLLL(OnRecreation.class);
                    }
                }
            });
        } else {
            c197066128i.LIZLLL(OnRecreation.class);
        }
    }

    public static final void attachHandleIfNeeded(ViewModel viewModel, C197066128i c197066128i, Lifecycle lifecycle) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.isAttached()) {
            savedStateHandleController.attachToLifecycle(c197066128i, lifecycle);
            INSTANCE.tryToAddRecreator(c197066128i, lifecycle);
        }
    }

    public static final SavedStateHandleController create(C197066128i c197066128i, Lifecycle lifecycle, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, SavedStateHandle.Companion.createHandle(c197066128i.LIZ(str), bundle));
        savedStateHandleController.attachToLifecycle(c197066128i, lifecycle);
        INSTANCE.tryToAddRecreator(c197066128i, lifecycle);
        return savedStateHandleController;
    }
}
