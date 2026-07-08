package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989920brq extends AbstractC989950brt {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C989920brq)) {
            return false;
        }
        C989920brq c989920brq = (C989920brq) obj;
        return Intrinsics.LJFF(this.LIZ, c989920brq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c989920brq.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContainerPrepared(templateName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989920brq(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
