package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DOt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338490DOt extends C09AY implements Function0<ViewModelStore> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ ViewModelStoreOwner LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C338490DOt(ViewModelStoreOwner viewModelStoreOwner, boolean z) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = viewModelStoreOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStore invoke() {
        return this.LL ? ((Fragment) this.LLILLJJLI).requireActivity().getViewModelStore() : this.LLILLJJLI.getViewModelStore();
    }
}
