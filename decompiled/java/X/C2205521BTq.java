package X;

import X.C1BU1;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: X.1BTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2205521BTq<T extends C1BU1> extends AbstractC2205581BTw<T> implements C1BU7<T> {
    public final InterfaceC2205541BTs<T> LIZIZ;

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

    public C2205521BTq(C2205491BTn c2205491BTn) {
        this.LIZIZ = c2205491BTn;
    }

    @Override // X.InterfaceC2205541BTs
    public final boolean LIZLLL(Collection<T> collection) {
        return this.LIZIZ.LIZLLL(collection);
    }

    @Override // X.InterfaceC2205541BTs
    public final Set<? extends InterfaceC1177120gjm<T>> LJI(float f) {
        return this.LIZIZ.LJI(f);
    }

    @Override // X.InterfaceC2205541BTs
    public final boolean LIZ(T t, T t2) {
        return this.LIZIZ.LIZ(t, t2);
    }
}
