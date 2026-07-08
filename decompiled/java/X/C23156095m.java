package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.095m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23156095m extends C096H {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23156095m)) {
            return false;
        }
        C23156095m c23156095m = (C23156095m) obj;
        return Intrinsics.LJFF(this.LIZ, c23156095m.LIZ) && Intrinsics.LJFF(this.LIZIZ, c23156095m.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnAigtResponse(response=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C23156095m(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
