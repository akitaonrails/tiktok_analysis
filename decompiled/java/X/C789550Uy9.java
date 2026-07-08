package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uy9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789550Uy9 extends AbstractC789580UyC {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C789550Uy9)) {
            return false;
        }
        C789550Uy9 c789550Uy9 = (C789550Uy9) obj;
        return Intrinsics.LJFF(this.LIZ, c789550Uy9.LIZ) && this.LIZIZ == c789550Uy9.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadMoreEffect(enterMethod=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shouldAutoSelectFirstEffect=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C789550Uy9(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
