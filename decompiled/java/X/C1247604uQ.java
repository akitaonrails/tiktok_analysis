package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04uQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1247604uQ extends AbstractC1247804uS {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1247604uQ) && Intrinsics.LJFF(this.LIZ, ((C1247604uQ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    @Override // X.AbstractC1247804uS
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Control(apiId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1247604uQ(String str) {
        this.LIZ = str;
    }
}
