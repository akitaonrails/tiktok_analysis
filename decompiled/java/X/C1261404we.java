package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04we, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1261404we extends AbstractC1262404wo {
    public final String LIZIZ;
    public final boolean LIZJ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1261404we) && Intrinsics.LJFF(this.LIZIZ, ((C1261404we) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Equals(value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1262404wo
    public final boolean LIZ() {
        return this.LIZJ;
    }

    public C1261404we(String str) {
        this.LIZIZ = str;
    }
}
