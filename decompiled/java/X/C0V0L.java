package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V0L, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V0L extends C0V0J {
    public final String LIZ = "TapRecord";
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0V0L)) {
            return false;
        }
        C0V0L c0v0l = (C0V0L) obj;
        return Intrinsics.LJFF(this.LIZ, c0v0l.LIZ) && this.LIZIZ == c0v0l.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartRecordButton(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPhotoMode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0V0L(boolean z) {
        this.LIZIZ = z;
    }
}
