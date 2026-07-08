package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00EK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00EK {
    public final List<C535190Kyr> LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00EK)) {
            return false;
        }
        C00EK c00ek = (C00EK) obj;
        return Intrinsics.LJFF(this.LIZ, c00ek.LIZ) && this.LIZIZ == c00ek.LIZIZ && this.LIZJ == c00ek.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiPortraitAlbumPage(items=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00EK(List<C535190Kyr> list, boolean z, long j) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = j;
    }
}
