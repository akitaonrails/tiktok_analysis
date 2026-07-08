package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Wy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1877407Wy {
    public static final /* synthetic */ int LIZIZ = 0;
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1877407Wy) && Intrinsics.LJFF(this.LIZ, ((C1877407Wy) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContentFingerprint(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1877407Wy(String str) {
        this.LIZ = str;
    }
}
