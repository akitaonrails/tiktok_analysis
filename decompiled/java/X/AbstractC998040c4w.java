package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC998040c4w<S, T> {
    public final InterfaceC998030c4v<S, T> LIZ;
    public T LIZIZ;
    public T LIZJ;

    public abstract void LIZIZ(T t, T t2);

    public final void LIZJ() {
        T t = this.LIZJ;
        T tApply = this.LIZ.apply(this.LIZIZ);
        if (Intrinsics.LJFF(tApply, t)) {
            return;
        }
        this.LIZJ = tApply;
        LIZIZ(t, tApply);
    }

    public final void LIZ(AbstractC986700bme abstractC986700bme) {
        if (!this.LIZ.LIZ(abstractC986700bme)) {
            return;
        }
        LIZJ();
    }

    public final void LIZLLL(T t) {
        if (Intrinsics.LJFF(t, this.LIZIZ)) {
            return;
        }
        this.LIZIZ = t;
        LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC998040c4w(Object obj, InterfaceC998030c4v interfaceC998030c4v) {
        this.LIZ = interfaceC998030c4v;
        this.LIZIZ = obj;
        this.LIZJ = obj;
    }
}
