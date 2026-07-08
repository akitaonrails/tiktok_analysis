package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0qCZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540930qCZ {
    public final boolean LIZ;
    public final String LIZIZ;
    public final C1535940q4W LIZJ;
    public final InterfaceC1541060qCm LIZLLL;
    public final C1541070qCn<?, ?> LJ;
    public WeakReference<C1540860qCS> LJFF;
    public String LJI;
    public final AtomicBoolean LJII;
    public volatile C1535940q4W LJIIIIZZ;
    public C1541020qCi LJIIIZ;
    public volatile C1540930qCZ LJIIJ;
    public volatile C1540930qCZ LJIIJJI;

    public final C1540860qCS LIZ() {
        WeakReference<C1540860qCS> weakReference = this.LJFF;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode() + this.LIZLLL.getClass().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1540930qCZ) || obj == this.LJIIJJI) {
            return false;
        }
        if (obj != this && obj != this.LJIIJ) {
            C1540930qCZ c1540930qCZ = (C1540930qCZ) obj;
            C1535940q4W c1535940q4W = c1540930qCZ.LIZJ;
            if (c1535940q4W == null && (c1535940q4W = this.LIZJ) == null) {
                return false;
            }
            if (!c1535940q4W.LIZ && LIZ() != c1540930qCZ.LIZ()) {
                return false;
            }
            C1535940q4W c1535940q4WLIZ = this.LIZLLL.LIZ(c1540930qCZ.LIZLLL, new C1535940q4W(c1535940q4W.LIZ, c1535940q4W.LIZIZ, c1535940q4W.LIZJ, c1535940q4W.LIZLLL, c1535940q4W.LJ, c1535940q4W.LJFF));
            if (c1535940q4WLIZ == null) {
                this.LJIIJJI = c1540930qCZ;
                c1540930qCZ.LJIIJJI = this;
                return false;
            }
            this.LJIIJ = c1540930qCZ;
            c1540930qCZ.LJIIJ = this;
            this.LJIIIIZZ = c1535940q4WLIZ;
            c1540930qCZ.LJIIIIZZ = c1535940q4WLIZ;
        }
        return true;
    }

    public C1540930qCZ(boolean z, String str, C1535940q4W c1535940q4W, InterfaceC1541060qCm interfaceC1541060qCm, C1541070qCn<?, ?> c1541070qCn) {
        EnumC1533170q03 enumC1533170q03;
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = c1535940q4W;
        this.LIZLLL = interfaceC1541060qCm;
        this.LJ = c1541070qCn;
        AtomicBoolean atomicBoolean = null;
        if (z && !c1541070qCn.LJI) {
            if (c1535940q4W != null) {
                enumC1533170q03 = c1535940q4W.LJ;
            } else {
                enumC1533170q03 = null;
            }
            if (enumC1533170q03 == EnumC1533170q03.ONLY_ONCE) {
                atomicBoolean = new AtomicBoolean(false);
            }
        }
        this.LJII = atomicBoolean;
    }
}
