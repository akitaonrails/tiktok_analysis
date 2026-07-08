package X;

import com.tiktok.ttm.ttmparam.ITTMParamData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wgx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829850Wgx extends ITTMParamData {
    public final Double LIZIZ;
    public final Integer LIZJ;
    public final C829840Wgw LIZLLL;

    public C829850Wgx() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C829850Wgx)) {
            return false;
        }
        C829850Wgx c829850Wgx = (C829850Wgx) obj;
        return Intrinsics.LJFF(this.LIZIZ, c829850Wgx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c829850Wgx.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c829850Wgx.LIZLLL);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final Object getInputData() {
        return this;
    }

    public final int hashCode() {
        Double d = this.LIZIZ;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Integer num = this.LIZJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C829840Wgw c829840Wgw = this.LIZLLL;
        return iHashCode2 + (c829840Wgw != null ? c829840Wgw.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationLayerPortrait(affinityScore=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", affinityRank=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", basicConvInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final ITTMParamData getObjectItem(String str) {
        if (Intrinsics.LJFF(str, "basicConvInfo")) {
            return this.LIZLLL;
        }
        return null;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final double getDoubleValue(String str, int i) {
        Double d;
        if (!Intrinsics.LJFF(str, "affinityScore") || (d = this.LIZIZ) == null) {
            return -1.0d;
        }
        return d.doubleValue();
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final long getIntValue(String str, int i) {
        Integer num;
        if (!Intrinsics.LJFF(str, "affinityRank") || (num = this.LIZJ) == null) {
            return -1L;
        }
        return num.intValue();
    }

    public C829850Wgx(Double d, Integer num, C829840Wgw c829840Wgw) {
        this.LIZIZ = d;
        this.LIZJ = num;
        this.LIZLLL = c829840Wgw;
    }
}
