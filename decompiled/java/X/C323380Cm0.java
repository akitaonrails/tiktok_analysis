package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323380Cm0<T> extends AbstractC316870CbV<T> {
    public final T LIZIZ;
    public final T LIZJ;
    public final List<InterfaceC1891350zJl> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C323380Cm0)) {
            return false;
        }
        C323380Cm0 c323380Cm0 = (C323380Cm0) obj;
        return Intrinsics.LJFF(this.LIZIZ, c323380Cm0.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c323380Cm0.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c323380Cm0.LIZLLL);
    }

    public final int hashCode() {
        T t = this.LIZIZ;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.LIZJ;
        return ((iHashCode + (t2 != null ? t2.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(prev=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", next=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C323380Cm0(T t, T t2, List<? extends InterfaceC1891350zJl> list) {
        this.LIZIZ = t;
        this.LIZJ = t2;
        this.LIZLLL = list;
    }
}
