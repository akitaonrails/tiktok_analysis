package X;

import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gV7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1168030gV7 implements InterfaceC1891350zJl {
    public final MixListResponse LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1168030gV7)) {
            return false;
        }
        C1168030gV7 c1168030gV7 = (C1168030gV7) obj;
        return Intrinsics.LJFF(this.LL, c1168030gV7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1168030gV7.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1168030gV7.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1168030gV7.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        MixListResponse mixListResponse = this.LL;
        int iHashCode = (mixListResponse == null ? 0 : mixListResponse.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayListShowAllItem(mixListResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", secUid=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1168030gV7(MixListResponse mixListResponse, String str, String str2, String str3) {
        this.LL = mixListResponse;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }
}
