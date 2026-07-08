package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NnD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604410NnD<T> extends AbstractC604420NnE<T> {
    public final T LIZJ;

    public C604410NnD() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C604410NnD) && Intrinsics.LJFF(this.LIZJ, ((C604410NnD) obj).LIZJ);
    }

    public final int hashCode() {
        T t = this.LIZJ;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C604410NnD(T t) {
        super(t, true);
        this.LIZJ = t;
    }
}
