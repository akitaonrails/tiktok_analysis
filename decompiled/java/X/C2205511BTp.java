package X;

import X.C1BU1;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: X.1BTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205511BTp<T extends C1BU1> extends AbstractC2205581BTw<T> implements C1BU7<T> {
    public final InterfaceC2205541BTs<T> LIZIZ;
    public final InterfaceC1206010hUN<T> LIZJ;

    @Override // X.C1BU7
    public final void LIZJ() {
    }

    @Override // X.C1BU7
    public final void LJFF() {
    }

    @Override // X.InterfaceC2205541BTs
    public final void LIZIZ() {
        this.LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC2205541BTs
    public final int LJ() {
        return this.LIZIZ.LJ();
    }

    @Override // X.InterfaceC2205541BTs
    public final Collection<T> getItems() {
        return this.LIZIZ.getItems();
    }

    @Override // X.InterfaceC2205541BTs
    public final boolean LIZLLL(Collection<? extends T> collection) {
        return this.LIZIZ.LIZLLL(collection);
    }

    @Override // X.InterfaceC2205541BTs
    public final Set<InterfaceC1177120gjm<T>> LJI(float f) {
        Set<? extends InterfaceC1177120gjm<T>> setLJI = this.LIZIZ.LJI(f);
        if (setLJI != null) {
            return this.LIZJ.LIZ(setLJI);
        }
        return null;
    }

    public C2205511BTp(C1BU7 c1bu7, InterfaceC1206010hUN interfaceC1206010hUN) {
        this.LIZIZ = c1bu7;
        this.LIZJ = interfaceC1206010hUN;
    }

    @Override // X.InterfaceC2205541BTs
    public final boolean LIZ(T t, T t2) {
        return this.LIZIZ.LIZ(t, t2);
    }
}
