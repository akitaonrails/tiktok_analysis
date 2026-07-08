package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DVI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DVI<T> extends C0DVK<T> {
    public final T LIZIZ;

    public C0DVI() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DVI) && Intrinsics.LJFF(this.LIZIZ, ((C0DVI) obj).LIZIZ);
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
        sbLIZ.append("Loading(value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DVI(T t) {
        super(t);
        this.LIZIZ = t;
    }
}
