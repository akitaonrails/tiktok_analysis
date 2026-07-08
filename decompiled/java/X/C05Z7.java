package X;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Z7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05Z7<T> implements C0HOM<T> {
    public final T LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C05Z7) && Intrinsics.LJFF(this.LIZIZ, ((C05Z7) obj).LIZIZ);
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
        sbLIZ.append("MissingSelfie(data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0HOM
    public final C0HOM<? extends List<T>> LIZ() {
        return new C05Z7(Collections.singletonList(this.LIZIZ));
    }

    public C05Z7(T t) {
        this.LIZIZ = t;
    }
}
