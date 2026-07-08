package X;

import X.AbstractC521080Kc6;

/* JADX INFO: renamed from: X.0Jgp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC498530Jgp<T extends AbstractC521080Kc6> {
    public T LIZ;

    public abstract int LIZLLL();

    public abstract T LJ();

    public final T LIZJ() {
        if (this.LIZ == null) {
            this.LIZ = (T) LJ();
        }
        T t = this.LIZ;
        if (t == null) {
            return null;
        }
        return t;
    }
}
