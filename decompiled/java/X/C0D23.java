package X;

import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D23, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D23 extends AbstractC332980D3o {
    public final PdpSupplementData LL;

    public C0D23() {
        this(null);
    }

    public final C0D23 copy(PdpSupplementData pdpSupplementData) {
        return new C0D23(pdpSupplementData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0D23) && Intrinsics.LJFF(this.LL, ((C0D23) obj).LL);
    }

    public int hashCode() {
        PdpSupplementData pdpSupplementData = this.LL;
        if (pdpSupplementData == null) {
            return 0;
        }
        return pdpSupplementData.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loading(supplementData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PdpSupplementData getSupplementData() {
        return this.LL;
    }

    public C0D23(PdpSupplementData pdpSupplementData) {
        this.LL = pdpSupplementData;
    }
}
