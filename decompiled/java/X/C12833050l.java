package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.050l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12833050l extends AbstractC12832050k {
    public final String LIZ;
    public final Function1<C12835050n, Boolean> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12833050l)) {
            return false;
        }
        C12833050l c12833050l = (C12833050l) obj;
        return Intrinsics.LJFF(this.LIZ, c12833050l.LIZ) && Intrinsics.LJFF(this.LIZIZ, c12833050l.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Simple(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", updater=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC12832050k
    public final String LIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12833050l(String str, Function1<? super C12835050n, Boolean> function1) {
        this.LIZ = str;
        this.LIZIZ = function1;
    }
}
