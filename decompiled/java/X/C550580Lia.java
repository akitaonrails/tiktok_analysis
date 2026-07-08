package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lia, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550580Lia<T> {
    public final CreativeInfo LIZ;
    public final String LIZIZ;
    public final T LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C550580Lia)) {
            return false;
        }
        C550580Lia c550580Lia = (C550580Lia) obj;
        return Intrinsics.LJFF(this.LIZ, c550580Lia.LIZ) && Intrinsics.LJFF(this.LIZIZ, c550580Lia.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c550580Lia.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        T t = this.LIZJ;
        return iHashCode2 + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationInput(creativeInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", customTraceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", businessExtra=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C550580Lia(CreativeInfo creativeInfo, String str, T t) {
        this.LIZ = creativeInfo;
        this.LIZIZ = str;
        this.LIZJ = t;
    }
}
