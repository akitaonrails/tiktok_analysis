package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3L, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3L implements Serializable {
    public final C0D31 aboutProductState;
    public final String description;
    public final List<C0281007r> keySellingPoints;

    public final C0D3L copy(String str, List<C0281007r> list, C0D31 c0d31) {
        return new C0D3L(str, list, c0d31);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D3L)) {
            return false;
        }
        C0D3L c0d3l = (C0D3L) obj;
        return Intrinsics.LJFF(this.description, c0d3l.description) && Intrinsics.LJFF(this.keySellingPoints, c0d3l.keySellingPoints) && Intrinsics.LJFF(this.aboutProductState, c0d3l.aboutProductState);
    }

    public int hashCode() {
        String str = this.description;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.keySellingPoints.hashCode()) * 31) + this.aboutProductState.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpDescriptionState(description=");
        sbLIZ.append(this.description);
        sbLIZ.append(", keySellingPoints=");
        sbLIZ.append(this.keySellingPoints);
        sbLIZ.append(", aboutProductState=");
        sbLIZ.append(this.aboutProductState);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D3L(String str, List<C0281007r> list, C0D31 c0d31) {
        this.description = str;
        this.keySellingPoints = list;
        this.aboutProductState = c0d31;
    }
}
