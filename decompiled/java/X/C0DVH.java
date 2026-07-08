package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DVH, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DVH<T> extends C0DVK<T> {
    public final T LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DVH) && Intrinsics.LJFF(this.LIZIZ, ((C0DVH) obj).LIZIZ);
    }

    public final int hashCode() {
        T t = this.LIZIZ;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0DVK
    public final T LIZ() {
        return this.LIZIZ;
    }

    public C0DVH(T t) {
        super(t);
        this.LIZIZ = t;
    }
}
