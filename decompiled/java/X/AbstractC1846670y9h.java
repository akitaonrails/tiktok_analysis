package X;

import X.C1119420fEi;

/* JADX INFO: renamed from: X.0y9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1846670y9h<T extends C1119420fEi> implements InterfaceC1846720y9m<T> {
    public final C1091250eVH LIZ;
    public T LIZIZ;
    public boolean LIZJ;

    public abstract void LIZLLL(T t);

    public abstract void LJ(T t);

    @Override // X.InterfaceC1846720y9m
    public void onDestroy() {
    }

    public AbstractC1846670y9h(C1091250eVH c1091250eVH) {
        this.LIZ = c1091250eVH;
    }

    @Override // X.InterfaceC1846720y9m
    public final void LIZIZ(T t) {
        if (this.LIZJ) {
            this.LIZIZ = t;
        } else if (this.LIZIZ == null) {
            LIZLLL(t);
        } else {
            LJ(t);
        }
    }

    public final void LIZJ(boolean z) {
        this.LIZJ = z;
        if (!z) {
            T t = this.LIZIZ;
            if (t != null) {
                LIZLLL(t);
            }
            if (this.LIZ.getEnableFixedSize()) {
                this.LIZ.LLJ.run();
            }
        }
    }
}
