package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989560brG<T> extends AbstractC991610buZ {
    public final String LIZ;
    public final T LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C989560brG)) {
            return false;
        }
        C989560brG c989560brG = (C989560brG) obj;
        return Intrinsics.LJFF(this.LIZ, c989560brG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c989560brG.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        T t = this.LIZIZ;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendMessageToComponent(componentType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C989560brG(String str, C1003870cEL c1003870cEL) {
        this.LIZ = str;
        this.LIZIZ = c1003870cEL;
    }
}
