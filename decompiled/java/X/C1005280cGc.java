package X;

import com.ss.android.ugc.aweme.commercialize.model.JumpData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005280cGc implements InterfaceC1891350zJl {
    public final String LL;
    public final JumpData LLILLJJLI;
    public final C1009340cNA LLILLL;
    public final InterfaceC1014270cV7 LLILZ;
    public final InterfaceC1007930cKt LLILZIL;

    public C1005280cGc() {
        this(null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1005280cGc)) {
            return false;
        }
        C1005280cGc c1005280cGc = (C1005280cGc) obj;
        return Intrinsics.LJFF(this.LL, c1005280cGc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1005280cGc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1005280cGc.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1005280cGc.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1005280cGc.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        JumpData jumpData = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (jumpData == null ? 0 : jumpData.hashCode())) * 31;
        C1009340cNA c1009340cNA = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c1009340cNA == null ? 0 : c1009340cNA.hashCode())) * 31;
        InterfaceC1014270cV7 interfaceC1014270cV7 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (interfaceC1014270cV7 == null ? 0 : interfaceC1014270cV7.hashCode())) * 31;
        InterfaceC1007930cKt interfaceC1007930cKt = this.LLILZIL;
        return iHashCode4 + (interfaceC1007930cKt != null ? interfaceC1007930cKt.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewMoreItemInfo(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", jumpData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", anoleADModel=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", anoleDelegate=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", hostAnoleComponent=");
        sbLIZ.append(this.LLILZIL);
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

    public C1005280cGc(String str, JumpData jumpData, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, InterfaceC1007930cKt interfaceC1007930cKt) {
        this.LL = str;
        this.LLILLJJLI = jumpData;
        this.LLILLL = c1009340cNA;
        this.LLILZ = interfaceC1014270cV7;
        this.LLILZIL = interfaceC1007930cKt;
    }
}
