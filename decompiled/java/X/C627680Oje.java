package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Oje, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C627680Oje implements InterfaceC2753014t {
    public final C629490OmZ LLILLJJLI;
    public float LL = 0.0f;
    public boolean LLILLL = false;
    public final String LLILZ = "flexible_state";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C627680Oje)) {
            return false;
        }
        C627680Oje c627680Oje = (C627680Oje) obj;
        return Float.compare(this.LL, c627680Oje.LL) == 0 && Intrinsics.LJFF(this.LLILLJJLI, c627680Oje.LLILLJJLI) && this.LLILLL == c627680Oje.LLILLL && Intrinsics.LJFF(this.LLILZ, c627680Oje.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FlexiblePanelScrollOffset(scrollOffsetPercentage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", animParams=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", animStateChange=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public C627680Oje(C629490OmZ c629490OmZ) {
        this.LLILLJJLI = c629490OmZ;
    }
}
