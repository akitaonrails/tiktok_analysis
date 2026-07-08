package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0miA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406760miA extends AbstractC1406770miB {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1406760miA) && Intrinsics.LJFF(this.LIZ, ((C1406760miA) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PropSearchCancel(panelUnfold=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1406760miA(String str) {
        this.LIZ = str;
    }
}
