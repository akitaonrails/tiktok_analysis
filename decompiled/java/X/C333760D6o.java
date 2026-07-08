package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333760D6o extends AbstractC333830D6v {
    public final List<AbstractC333850D6x> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C333760D6o)) {
            return false;
        }
        C333760D6o c333760D6o = (C333760D6o) obj;
        return Intrinsics.LJFF(this.LIZ, c333760D6o.LIZ) && this.LIZIZ == c333760D6o.LIZIZ && this.LIZJ == c333760D6o.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Content(items=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasAnyLocalData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", canShowEmpty=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C333760D6o(List<? extends AbstractC333850D6x> list, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
