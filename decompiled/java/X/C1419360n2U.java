package X;

import com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n2U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419360n2U extends RuntimeException {
    public final NLEModelResponse LL;
    public final String LLILLJJLI;

    public C1419360n2U() {
        this((NLEModelResponse) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1419360n2U)) {
            return false;
        }
        C1419360n2U c1419360n2U = (C1419360n2U) obj;
        return Intrinsics.LJFF(this.LL, c1419360n2U.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1419360n2U.LLILLJJLI);
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

    public /* synthetic */ C1419360n2U(NLEModelResponse nLEModelResponse, int i) {
        this((i & 1) != 0 ? null : nLEModelResponse, (String) null);
    }

    public C1419360n2U(NLEModelResponse nLEModelResponse, String str) {
        this.LL = nLEModelResponse;
        this.LLILLJJLI = str;
    }
}
