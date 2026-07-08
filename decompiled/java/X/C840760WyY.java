package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@InterfaceC1294060jmO
public final class C840760WyY implements InterfaceC823460WSa {
    public final C840710WyT LIZ;
    public final List<Uri> LIZIZ;
    public final Map<Uri, Set<String>> LIZJ;
    public final Throwable LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final boolean LJI;
    public transient Object LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C840760WyY)) {
            return false;
        }
        C840760WyY c840760WyY = (C840760WyY) obj;
        return Intrinsics.LJFF(this.LIZ, c840760WyY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c840760WyY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c840760WyY.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c840760WyY.LIZLLL) && this.LJ == c840760WyY.LJ && this.LJFF == c840760WyY.LJFF && this.LJI == c840760WyY.LJI && Intrinsics.LJFF(this.LJII, c840760WyY.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Throwable th = this.LIZLLL;
        int iHashCode2 = (iHashCode + (th == null ? 0 : th.hashCode())) * 31;
        boolean z = this.LJ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = (iHashCode2 + r0) * 31;
        boolean z2 = this.LJFF;
        ?? r02 = z2;
        if (z2) {
            r02 = 1;
        }
        int i2 = (((i + r02) * 31) + (this.LJI ? 1 : 0)) * 31;
        Object obj = this.LJII;
        return i2 + (obj != null ? obj.hashCode() : 0);
    }

    public C840760WyY() {
        C840710WyT c840710WyT = new C840710WyT(0);
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = c840710WyT;
        this.LIZIZ = arrayList;
        this.LIZJ = linkedHashMap;
        this.LIZLLL = null;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = false;
        this.LJII = null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkStackEvent(id=");
        sbLIZ.append(this.LIZ.LIZ.LIZ);
        sbLIZ.append(", isReport=");
        sbLIZ.append(this.LIZ.LJJIFFI.LIZIZ);
        sbLIZ.append(", reportParams=");
        sbLIZ.append(this.LIZ.LJIJJLI);
        sbLIZ.append(", uris=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", uriScenes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isCollectInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isCollectStack=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isFrequencyCollectStack=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC823460WSa
    public final C840710WyT LIZ() {
        return this.LIZ;
    }
}
