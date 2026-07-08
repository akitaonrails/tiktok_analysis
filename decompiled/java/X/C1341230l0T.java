package X;

import android.net.Uri;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l0T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341230l0T extends AbstractC1341280l0Y {
    public final Uri LIZ;
    public final Size LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1341230l0T)) {
            return false;
        }
        C1341230l0T c1341230l0T = (C1341230l0T) obj;
        return Intrinsics.LJFF(this.LIZ, c1341230l0T.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1341230l0T.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Edited(fileUri=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originalSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1341280l0Y
    public final Size LIZ() {
        return this.LIZIZ;
    }

    public C1341230l0T(Uri uri, Size size) {
        this.LIZ = uri;
        this.LIZIZ = size;
    }
}
