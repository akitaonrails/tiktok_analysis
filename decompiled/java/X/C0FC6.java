package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FC6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FC6 extends C0FC7 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0FC6) && Intrinsics.LJFF(this.LIZ, ((C0FC6) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TitleItem(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0FC6(String str) {
        this.LIZ = str;
    }
}
