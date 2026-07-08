package X;

import androidx.lifecycle.Observer;

/* JADX INFO: renamed from: X.13sW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20148213sW<D> implements Observer<D> {
    public final InterfaceC20148313sX<D> LL;
    public boolean LLILLJJLI;

    public final String toString() {
        return this.LL.toString();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(D d) {
        this.LL.LIZ(d);
        this.LLILLJJLI = true;
    }

    public C20148213sW(C20147913sT<D> c20147913sT, InterfaceC20148313sX<D> interfaceC20148313sX) {
        this.LL = interfaceC20148313sX;
    }
}
