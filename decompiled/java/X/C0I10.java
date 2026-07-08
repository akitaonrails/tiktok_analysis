package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I10, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I10 {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I10)) {
            return false;
        }
        C0I10 c0i10 = (C0I10) obj;
        return Intrinsics.LJFF(this.LIZ, c0i10.LIZ) && this.LIZIZ == c0i10.LIZIZ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionPanelUpdateResult(searchKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hidePanel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I10(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
