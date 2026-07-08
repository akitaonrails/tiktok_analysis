package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C047800Fg implements InterfaceC1329505If {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final Map<String, Object> LIZLLL;

    public C047800Fg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C047800Fg)) {
            return false;
        }
        C047800Fg c047800Fg = (C047800Fg) obj;
        return Intrinsics.LJFF(this.LIZ, c047800Fg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c047800Fg.LIZIZ) && this.LIZJ == c047800Fg.LIZJ && Intrinsics.LJFF(this.LIZLLL, c047800Fg.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        Map<String, Object> map = this.LIZLLL;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMediaVideoPreloadResource(resourceId=");
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

    public C047800Fg(String str, Map map) {
        this.LIZ = str;
        this.LIZIZ = "media_video";
        this.LIZJ = 0;
        this.LIZLLL = map;
    }
}
