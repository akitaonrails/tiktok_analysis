package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989660brQ<T> extends AbstractC989680brS<T> {
    public final T LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C989660brQ) && Intrinsics.LJFF(this.LIZIZ, ((C989660brQ) obj).LIZIZ);
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
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989660brQ(T t) {
        this.LIZIZ = t;
    }
}
