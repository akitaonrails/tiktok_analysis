package X;

import com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n2V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419370n2V extends RuntimeException {
    public final NLEModelResponse LL;
    public final String LLILLJJLI;

    public C1419370n2V() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1419370n2V)) {
            return false;
        }
        C1419370n2V c1419370n2V = (C1419370n2V) obj;
        return Intrinsics.LJFF(this.LL, c1419370n2V.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1419370n2V.LLILLJJLI);
    }

    public final int hashCode() {
        NLEModelResponse nLEModelResponse = this.LL;
        int iHashCode = (nLEModelResponse == null ? 0 : nLEModelResponse.hashCode()) * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NLEModelException(response=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", nleConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1419370n2V(NLEModelResponse nLEModelResponse, String str, int i) {
        nLEModelResponse = (i & 1) != 0 ? null : nLEModelResponse;
        str = (i & 2) != 0 ? null : str;
        this.LL = nLEModelResponse;
        this.LLILLJJLI = str;
    }
}
