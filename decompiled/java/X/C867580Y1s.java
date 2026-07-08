package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867580Y1s extends C0Y7K {
    public final Integer LJ;

    public C867580Y1s() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C867580Y1s) && Intrinsics.LJFF(this.LJ, ((C867580Y1s) obj).LJ);
    }

    public final int hashCode() {
        Integer num = this.LJ;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(subMessageType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0Y7K
    public final Integer LIZ() {
        return this.LJ;
    }

    public C867580Y1s(Integer num) {
        super(null, num, null, 0);
        this.LJ = num;
    }
}
