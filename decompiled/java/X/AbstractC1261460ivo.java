package X;

import X.InterfaceC1262230ix3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ivo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1261460ivo<T extends InterfaceC1262230ix3> {
    public final T LIZ;
    public final int LIZIZ;

    public final int hashCode() {
        return this.LIZIZ + this.LIZ.getElementId().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC1261460ivo)) {
            return false;
        }
        AbstractC1261460ivo abstractC1261460ivo = (AbstractC1261460ivo) obj;
        if (abstractC1261460ivo.LIZIZ != this.LIZIZ || !Intrinsics.LJFF(this.LIZ.getElementId(), abstractC1261460ivo.LIZ.getElementId())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1261460ivo(InterfaceC1262230ix3 interfaceC1262230ix3, int i) {
        this.LIZ = interfaceC1262230ix3;
        this.LIZIZ = i;
    }
}
