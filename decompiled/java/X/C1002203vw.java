package X;

import androidx.lifecycle.ViewModel;

/* JADX INFO: renamed from: X.03vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C1002203vw<VM extends ViewModel> implements InterfaceC1025703zj<VM> {
    public VM LL;

    public final VM LIZ() {
        VM vm = this.LL;
        if (vm != null) {
            return vm;
        }
        return null;
    }

    @Override // X.InterfaceC1025703zj
    public final void Tc1(Object obj) {
        this.LL = (VM) obj;
    }
}
