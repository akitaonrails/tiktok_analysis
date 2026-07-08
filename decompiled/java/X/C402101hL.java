package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01hL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C402101hL<T> extends AbstractC401801hI<T> {
    public final List<T> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C402101hL)) {
            return false;
        }
        C402101hL c402101hL = (C402101hL) obj;
        return Intrinsics.LJFF(this.LIZ, c402101hL.LIZ) && this.LIZIZ == c402101hL.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveEffectFirstPanelList(effectList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isTrendingPanel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C402101hL(List<? extends T> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
