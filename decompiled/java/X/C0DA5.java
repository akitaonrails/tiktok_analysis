package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DA5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DA5 extends AbstractC334720DAg {
    public final String LIZ;

    public C0DA5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DA5) && Intrinsics.LJFF(this.LIZ, ((C0DA5) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Enabled(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DA5(int i) {
        this(C0D9L.LIZ(2131857526));
    }

    public C0DA5(String str) {
        this.LIZ = str;
    }
}
