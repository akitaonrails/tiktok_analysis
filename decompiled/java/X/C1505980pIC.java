package X;

import com.ss.android.ugc.aweme.ecommerce.network.ECNetworkScoreConfigModel;

/* JADX INFO: renamed from: X.0pIC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505980pIC {
    public final ECNetworkScoreConfigModel.Aggregation LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1505980pIC)) {
            return false;
        }
        C1505980pIC c1505980pIC = (C1505980pIC) obj;
        return this.LIZ == c1505980pIC.LIZ && this.LIZIZ == c1505980pIC.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MetricValue(aggregation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1505980pIC(ECNetworkScoreConfigModel.Aggregation aggregation, long j) {
        this.LIZ = aggregation;
        this.LIZIZ = j;
    }
}
