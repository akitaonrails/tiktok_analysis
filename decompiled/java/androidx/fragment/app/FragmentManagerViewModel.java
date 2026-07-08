package androidx.fragment.app;

import X.C20153513tN;
import androidx.fragment.app.FragmentManagerViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes31.dex */
public final class FragmentManagerViewModel extends ViewModel {
    public static final C20153513tN LLIZ = new ViewModelProvider.Factory() { // from class: X.13tN
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
            return new FragmentManagerViewModel(true);
        }
    };
    public final boolean LLILZ;
    public final HashMap<String, Fragment> LL = new HashMap<>();
    public final HashMap<String, FragmentManagerViewModel> LLILLJJLI = new HashMap<>();
    public final HashMap<String, ViewModelStore> LLILLL = new HashMap<>();
    public boolean LLILZIL = false;
    public boolean LLILZLL = false;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLILZIL = true;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it2 = this.LL.values().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it3 = this.LLILLJJLI.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it4 = this.LLILLL.keySet().iterator();
        while (it4.hasNext()) {
            sb.append(it4.next());
            if (it4.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public FragmentManagerViewModel(boolean z) {
        this.LLILZ = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FragmentManagerViewModel.class != obj.getClass()) {
            return false;
        }
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
        if (this.LL.equals(fragmentManagerViewModel.LL) && this.LLILLJJLI.equals(fragmentManagerViewModel.LLILLJJLI) && this.LLILLL.equals(fragmentManagerViewModel.LLILLL)) {
            return true;
        }
        return false;
    }

    public final void wQ2(Fragment fragment) {
        if (this.LLILZLL) {
            return;
        }
        this.LL.remove(fragment.mWho);
    }

    public final void vQ2(String str, boolean z) {
        FragmentManagerViewModel fragmentManagerViewModel = this.LLILLJJLI.get(str);
        if (fragmentManagerViewModel != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(fragmentManagerViewModel.LLILLJJLI.keySet());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    fragmentManagerViewModel.vQ2((String) it2.next(), true);
                }
            }
            fragmentManagerViewModel.LLILZIL = true;
            this.LLILLJJLI.remove(str);
        }
        ViewModelStore viewModelStore = this.LLILLL.get(str);
        if (viewModelStore != null) {
            viewModelStore.clear();
            this.LLILLL.remove(str);
        }
    }
}
