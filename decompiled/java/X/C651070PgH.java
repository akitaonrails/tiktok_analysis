package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651070PgH extends AbstractC651060PgG {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C651070PgH) && Intrinsics.LJFF(this.LIZ, ((C651070PgH) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProcessorName(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C651070PgH(String str) {
        this.LIZ = str;
    }
}
