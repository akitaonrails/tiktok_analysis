package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332730D2p implements Serializable {
    public final C332710D2n entryContext;
    public final C332690D2l identity;
    public final Map<String, String> passThrough;
    public final PdpSupplementData preRenderData;
    public final String sellerProfileId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332730D2p)) {
            return false;
        }
        C332730D2p c332730D2p = (C332730D2p) obj;
        return Intrinsics.LJFF(this.identity, c332730D2p.identity) && Intrinsics.LJFF(this.preRenderData, c332730D2p.preRenderData) && Intrinsics.LJFF(this.sellerProfileId, c332730D2p.sellerProfileId) && Intrinsics.LJFF(this.passThrough, c332730D2p.passThrough) && Intrinsics.LJFF(this.entryContext, c332730D2p.entryContext);
    }

    public int hashCode() {
        int iHashCode = this.identity.hashCode() * 31;
        PdpSupplementData pdpSupplementData = this.preRenderData;
        int iHashCode2 = (iHashCode + (pdpSupplementData == null ? 0 : pdpSupplementData.hashCode())) * 31;
        String str = this.sellerProfileId;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.passThrough.hashCode()) * 31) + this.entryContext.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpLaunchArgs(identity=");
        sbLIZ.append(this.identity);
        sbLIZ.append(", preRenderData=");
        sbLIZ.append(this.preRenderData);
        sbLIZ.append(", sellerProfileId=");
        sbLIZ.append(this.sellerProfileId);
        sbLIZ.append(", passThrough=");
        sbLIZ.append(this.passThrough);
        sbLIZ.append(", entryContext=");
        sbLIZ.append(this.entryContext);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C332730D2p(C332690D2l c332690D2l, PdpSupplementData pdpSupplementData, String str, Map<String, String> map, C332710D2n c332710D2n) {
        this.identity = c332690D2l;
        this.preRenderData = pdpSupplementData;
        this.sellerProfileId = str;
        this.passThrough = map;
        this.entryContext = c332710D2n;
    }
}
