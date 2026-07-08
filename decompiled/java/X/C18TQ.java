package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18TQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18TQ implements C18TR {
    public final C909930Zmp LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18TQ) && Intrinsics.LJFF(this.LIZ, ((C18TQ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwaitingGeneration(generateInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C18TR
    public final C909930Zmp LIZ() {
        return C18TI.LIZ(this);
    }

    public C18TQ(C909930Zmp c909930Zmp) {
        this.LIZ = c909930Zmp;
    }
}
