package androidx.lifecycle;

import X.C01GW;
import X.C197066128i;
import X.C2097608Jq;
import X.C452501pT;
import X.C786410Ut5;
import X.C799520VXy;
import X.InterfaceC197061128d;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleSupport;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public final class SavedStateHandlesProvider implements InterfaceC197061128d {
    public boolean restored;
    public Bundle restoredState;
    public final C197066128i savedStateRegistry;
    public final C01GW viewModel$delegate;

    private final SavedStateHandlesVM getViewModel() {
        return (SavedStateHandlesVM) this.viewModel$delegate.getValue();
    }

    public final void performRestore() {
        if (this.restored) {
            return;
        }
        Bundle bundleLIZ = this.savedStateRegistry.LIZ("androidx.lifecycle.internal.SavedStateHandlesProvider");
        C2097608Jq.LJ();
        Pair[] pairArr = new Pair[0];
        Bundle bundleLIZ2 = C799520VXy.LIZ((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(bundleLIZ2, bundle);
        }
        if (bundleLIZ != null) {
            C786410Ut5.LJJIIJZLJL(bundleLIZ2, bundleLIZ);
        }
        this.restoredState = bundleLIZ2;
        this.restored = true;
        getViewModel();
    }

    @Override // X.InterfaceC197061128d
    public Bundle saveState() {
        C2097608Jq.LJ();
        Pair[] pairArr = new Pair[0];
        Bundle bundleLIZ = C799520VXy.LIZ((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundle = this.restoredState;
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(bundleLIZ, bundle);
        }
        for (Map.Entry<String, SavedStateHandle> entry : getViewModel().getHandles().entrySet()) {
            String key = entry.getKey();
            Bundle bundleSaveState = entry.getValue().savedStateProvider().saveState();
            if (!bundleSaveState.isEmpty()) {
                C786410Ut5.LJJIIZI(bundleLIZ, bundleSaveState, key);
            }
        }
        this.restored = false;
        return bundleLIZ;
    }

    public final Bundle consumeRestoredStateForKey(String str) {
        performRestore();
        Bundle bundle = this.restoredState;
        if (bundle == null || (!bundle.containsKey(str))) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            C2097608Jq.LJ();
            Pair[] pairArr = new Pair[0];
            bundle2 = C799520VXy.LIZ((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        bundle.remove(str);
        if (bundle.isEmpty()) {
            this.restoredState = null;
        }
        return bundle2;
    }

    public SavedStateHandlesProvider(C197066128i c197066128i, final ViewModelStoreOwner viewModelStoreOwner) {
        this.savedStateRegistry = c197066128i;
        this.viewModel$delegate = C452501pT.LIZIZ(new Function0() { // from class: X.128c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SavedStateHandleSupport.getSavedStateHandlesVM(viewModelStoreOwner);
            }
        });
    }
}
