package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0goZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180090goZ {
    public static final /* synthetic */ int LIZIZ = 0;
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1180090goZ) && Intrinsics.LJFF(this.LIZ, ((C1180090goZ) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComponentType(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1180090goZ(String str) {
        this.LIZ = str;
    }
}
