package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0bDD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964730bDD implements InterfaceC964720bDC {
    public final CopyOnWriteArrayList<InterfaceC964720bDC> LL = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC964720bDC
    public final void LJJJJLI(long j) {
        Iterator<InterfaceC964720bDC> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJJLI(j);
        }
    }

    @Override // X.InterfaceC964720bDC
    public final void LLIIZ(long j) {
        Iterator<InterfaceC964720bDC> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LLIIZ(j);
        }
    }

    @Override // X.InterfaceC964720bDC
    public final void LLIZ(long j) {
        Iterator<InterfaceC964720bDC> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LLIZ(j);
        }
    }

    @Override // X.InterfaceC964720bDC
    public final void LLLLLL(long j) {
        Iterator<InterfaceC964720bDC> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLLL(j);
        }
    }

    @Override // X.InterfaceC964720bDC
    public final void LLILII(long j, long j2) {
        Iterator<InterfaceC964720bDC> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LLILII(j, j2);
        }
    }

    @Override // X.InterfaceC964720bDC
    public final void LLLLLLLLLL(long j, long j2) {
        Iterator<InterfaceC964720bDC> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLLLLLLL(j, j2);
        }
    }
}
