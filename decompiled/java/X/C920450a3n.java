package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multilive_biz.BizChangeLayoutParams;

/* JADX INFO: renamed from: X.0a3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C920450a3n {
    public final int LIZ;
    public final String LIZIZ;
    public final BizChangeLayoutParams LIZJ;
    public final Map<String, String> LIZLLL;

    public C920450a3n() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C920450a3n)) {
            return false;
        }
        C920450a3n c920450a3n = (C920450a3n) obj;
        return this.LIZ == c920450a3n.LIZ && Intrinsics.LJFF(this.LIZIZ, c920450a3n.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c920450a3n.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c920450a3n.LIZLLL);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        BizChangeLayoutParams bizChangeLayoutParams = this.LIZJ;
        int iHashCode2 = (iHashCode + (bizChangeLayoutParams == null ? 0 : bizChangeLayoutParams.hashCode())) * 31;
        Map<String, String> map = this.LIZLLL;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeMaxPositionParam(maxPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", layoutId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bizChangeLayoutParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", customData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C920450a3n(int i, String str, BizChangeLayoutParams bizChangeLayoutParams) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = bizChangeLayoutParams;
        this.LIZLLL = null;
    }
}
