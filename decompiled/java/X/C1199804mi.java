package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04mi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1199804mi {
    public final Map<String, Object> LIZ;
    public final String LIZIZ = "streamContainerFrame";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1199804mi)) {
            return false;
        }
        C1199804mi c1199804mi = (C1199804mi) obj;
        return Intrinsics.LJFF(this.LIZ, c1199804mi.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1199804mi.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LynxUpdateDataEvent(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", processorName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1199804mi(Map map) {
        this.LIZ = map;
    }
}
