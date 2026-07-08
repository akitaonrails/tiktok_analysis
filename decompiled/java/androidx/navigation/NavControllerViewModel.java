package androidx.navigation;

import X.C1845230y7N;
import X.InterfaceC197063128f;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavControllerViewModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class NavControllerViewModel extends ViewModel implements InterfaceC197063128f {
    public static final C1845230y7N LLILLJJLI = new ViewModelProvider.Factory() { // from class: X.0y7N
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
            return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
            return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends ViewModel> T create(Class<T> cls) {
            return new NavControllerViewModel();
        }
    };
    public final Map<String, ViewModelStore> LL = new LinkedHashMap();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        Iterator it2 = ((LinkedHashMap) this.LL).values().iterator();
        while (it2.hasNext()) {
            ((ViewModelStore) it2.next()).clear();
        }
        ((LinkedHashMap) this.LL).clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it2 = ((LinkedHashMap) this.LL).keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // X.InterfaceC197063128f
    public final ViewModelStore Vs2(String str) {
        ViewModelStore viewModelStore = (ViewModelStore) ((LinkedHashMap) this.LL).get(str);
        if (viewModelStore == null) {
            ViewModelStore viewModelStore2 = new ViewModelStore();
            this.LL.put(str, viewModelStore2);
            return viewModelStore2;
        }
        return viewModelStore;
    }
}
