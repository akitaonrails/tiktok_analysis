package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18TO, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18TO<T> implements C18TR<T> {
    public final T LIZ;
    public final C909930Zmp LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18TO)) {
            return false;
        }
        C18TO c18to = (C18TO) obj;
        return Intrinsics.LJFF(this.LIZ, c18to.LIZ) && Intrinsics.LJFF(this.LIZIZ, c18to.LIZIZ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", generateInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C18TR
    public final C909930Zmp LIZ() {
        return C18TI.LIZ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C18TO(C869590Y9l c869590Y9l, C909930Zmp c909930Zmp) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = c909930Zmp;
    }
}
