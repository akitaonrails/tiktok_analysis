package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SLv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719930SLv {
    public String LIZ;
    public long LIZIZ;
    public final Map<Integer, C719970SLz> LIZJ;

    public C719930SLv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C719930SLv)) {
            return false;
        }
        C719930SLv c719930SLv = (C719930SLv) obj;
        return Intrinsics.LJFF(this.LIZ, c719930SLv.LIZ) && this.LIZIZ == c719930SLv.LIZIZ && Intrinsics.LJFF(this.LIZJ, c719930SLv.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicStickerState(dataAwemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dataVersion=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", positions=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C719930SLv(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = null;
        this.LIZIZ = 0L;
        this.LIZJ = linkedHashMap;
    }
}
