package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867630Y1x extends C0Y7K {
    public final Integer LJ;

    public C867630Y1x() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C867630Y1x) && Intrinsics.LJFF(this.LJ, ((C867630Y1x) obj).LJ);
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
        sbLIZ.append("Pending(subMessageType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0Y7K
    public final Integer LIZ() {
        return this.LJ;
    }

    public C867630Y1x(Integer num) {
        super(null, num, null, -1);
        this.LJ = num;
    }
}
