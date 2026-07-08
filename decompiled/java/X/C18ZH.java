package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18ZH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18ZH implements InterfaceC719640SKs {
    public final C19EG LL;
    public final AbstractC1664490tPr<?, ?> LLILLJJLI;
    public final View LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 842));

    @Override // X.InterfaceC719640SKs
    public final boolean PO1() {
        return false;
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC719640SKs
    public final Context Mk2() {
        return this.LLILLL.getContext();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILLJJLI.getLifecycle();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1558360qeg.LJ(this.LLILLL, null);
    }

    @Override // X.InterfaceC719640SKs
    public final LifecycleOwner E82() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC719640SKs
    public final View LJJIJL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC719640SKs
    public final C19EG getActivity() {
        return this.LL;
    }

    public C18ZH(C19EG c19eg, AbstractC1664490tPr abstractC1664490tPr, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LL = c19eg;
        this.LLILLJJLI = abstractC1664490tPr;
        this.LLILLL = viewOnAttachStateChangeListenerC20604515jv;
    }
}
