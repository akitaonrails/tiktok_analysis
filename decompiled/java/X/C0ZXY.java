package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZXY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZXY implements C0ZXL {
    public final int LIZ;
    public final C422360GhG LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZXY)) {
            return false;
        }
        C0ZXY c0zxy = (C0ZXY) obj;
        return this.LIZ == c0zxy.LIZ && Intrinsics.LJFF(this.LIZIZ, c0zxy.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Solid(colorInt=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", style=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZXL
    public final int LIZ(Context context) {
        return this.LIZ;
    }

    public C0ZXY(int i, C422360GhG c422360GhG) {
        this.LIZ = i;
        this.LIZIZ = c422360GhG;
    }
}
