package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01ha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C403601ha<T> extends AbstractC401801hI<T> {
    public final List<C0U74<T>> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C403601ha)) {
            return false;
        }
        C403601ha c403601ha = (C403601ha) obj;
        return Intrinsics.LJFF(this.LIZ, c403601ha.LIZ) && this.LIZIZ == c403601ha.LIZIZ && this.LIZJ == c403601ha.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveEffectPanelList(effectPanelList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isBeautyFilterData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isCache=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C403601ha(List list, boolean z, int i) {
        this(list, (i & 2) != 0 ? false : z, false);
    }

    public C403601ha(List<C0U74<T>> list, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
