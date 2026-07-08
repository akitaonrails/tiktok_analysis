package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I1C, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I1C extends C0I1F {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0I1C) && Intrinsics.LJFF(this.LIZ, ((C0I1C) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionSpanDeleted(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I1C(String str) {
        this.LIZ = str;
    }
}
