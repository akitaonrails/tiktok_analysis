package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C047900Fh implements InterfaceC1329505If {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final Map<String, Object> LIZLLL;

    public C047900Fh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C047900Fh)) {
            return false;
        }
        C047900Fh c047900Fh = (C047900Fh) obj;
        return Intrinsics.LJFF(this.LIZ, c047900Fh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c047900Fh.LIZIZ) && this.LIZJ == c047900Fh.LIZJ && Intrinsics.LJFF(this.LIZLLL, c047900Fh.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        Map<String, Object> map = this.LIZLLL;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMVoicePreloadResource(resourceId=");
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

    public C047900Fh(String str, Map map) {
        this.LIZ = str;
        this.LIZIZ = "voice";
        this.LIZJ = 0;
        this.LIZLLL = map;
    }
}
