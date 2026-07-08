package X;

import com.ss.android.ugc.aweme.ecommerce.network.ECNetworkScoreConfigModel;

/* JADX INFO: renamed from: X.0opV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488190opV {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1488190opV)) {
            return false;
        }
        C1488190opV c1488190opV = (C1488190opV) obj;
        return this.LIZ == c1488190opV.LIZ && this.LIZIZ == c1488190opV.LIZIZ && this.LIZJ == c1488190opV.LIZJ && this.LIZLLL == c1488190opV.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Stats(count=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sum=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mean=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", p50=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long LIZ(ECNetworkScoreConfigModel.Aggregation aggregation) {
        int i = C1488200opW.LIZ[aggregation.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.LIZLLL;
            }
            throw new C1954807lC();
        }
        return this.LIZJ;
    }

    public C1488190opV(int i, long j, long j2, long j3) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
    }
}
