package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CbW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C316880CbW<T> extends AbstractC316870CbV<T> {
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C316880CbW) && Intrinsics.LJFF(this.LIZIZ, ((C316880CbW) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cancelled(reason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C316880CbW(String str) {
        this.LIZIZ = str;
    }
}
