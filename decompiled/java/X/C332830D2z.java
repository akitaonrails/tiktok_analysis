package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D2z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332830D2z implements Serializable {
    public final String id;
    public final List<C332800D2w> options;
    public final String type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332830D2z)) {
            return false;
        }
        C332830D2z c332830D2z = (C332830D2z) obj;
        return Intrinsics.LJFF(this.id, c332830D2z.id) && Intrinsics.LJFF(this.type, c332830D2z.type) && Intrinsics.LJFF(this.options, c332830D2z.options);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.options.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpSkuOptionState(id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", options=");
        sbLIZ.append(this.options);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C332830D2z(String str, String str2, List<C332800D2w> list) {
        this.id = str;
        this.type = str2;
        this.options = list;
    }
}
