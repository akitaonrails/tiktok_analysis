package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2182708gr extends AnonymousClass0943 {
    public final String LIZ;

    public C2182708gr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2182708gr) && Intrinsics.LJFF(this.LIZ, ((C2182708gr) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Hidden(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2182708gr(int i) {
        this("");
    }

    public C2182708gr(String str) {
        this.LIZ = str;
    }
}
