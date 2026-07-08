package X;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05Ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1372405Ys<T> implements C0HOM<T> {
    public final T LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1372405Ys) && Intrinsics.LJFF(this.LIZIZ, ((C1372405Ys) obj).LIZIZ);
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
        sbLIZ.append("Created(data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0HOM
    public final C0HOM<? extends List<T>> LIZ() {
        return new C1372405Ys(Collections.singletonList(this.LIZIZ));
    }

    public C1372405Ys(T t) {
        this.LIZIZ = t;
    }
}
