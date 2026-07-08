package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Fe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C047600Fe implements InterfaceC1329505If {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final Map<String, Object> LIZLLL;

    public C047600Fe() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C047600Fe)) {
            return false;
        }
        C047600Fe c047600Fe = (C047600Fe) obj;
        return Intrinsics.LJFF(this.LIZ, c047600Fe.LIZ) && Intrinsics.LJFF(this.LIZIZ, c047600Fe.LIZIZ) && this.LIZJ == c047600Fe.LIZJ && Intrinsics.LJFF(this.LIZLLL, c047600Fe.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        Map<String, Object> map = this.LIZLLL;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMUserPreloadResource(resourceId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resourceType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", metadata=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1329505If
    public final Map<String, Object> LJJIFFI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1329505If
    public final String getResourceId() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1329505If
    public final String getResourceType() {
        return this.LIZIZ;
    }

    public C047600Fe(String str, Map map) {
        this.LIZ = str;
        this.LIZIZ = "user";
        this.LIZJ = 0;
        this.LIZLLL = map;
    }
}
