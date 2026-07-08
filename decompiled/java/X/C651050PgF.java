package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651050PgF extends AbstractC651060PgG {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C651050PgF) && Intrinsics.LJFF(this.LIZ, ((C651050PgF) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimingSuffix(suffix=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C651050PgF(String str) {
        this.LIZ = str;
    }
}
