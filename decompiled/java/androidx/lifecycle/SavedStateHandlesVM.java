package androidx.lifecycle;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public final class SavedStateHandlesVM extends ViewModel {
    public final Map<String, SavedStateHandle> handles = new LinkedHashMap();

    public final Map<String, SavedStateHandle> getHandles() {
        return this.handles;
    }
}
