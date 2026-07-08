package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EComSearchStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643110PKj implements InterfaceC655050Pmh {
    public final EComSearchStruct LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C643110PKj)) {
            return false;
        }
        C643110PKj c643110PKj = (C643110PKj) obj;
        return Intrinsics.LJFF(this.LL, c643110PKj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c643110PKj.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c643110PKj.LLILLL) && Intrinsics.LJFF(this.LLILZ, c643110PKj.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        EComSearchStruct eComSearchStruct = this.LL;
        int iHashCode = (eComSearchStruct == null ? 0 : eComSearchStruct.hashCode()) * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LLILZ;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcSearchProductCardRenderData(productStruct=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cardTitle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", docId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", rank=");
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

    public C643110PKj(EComSearchStruct eComSearchStruct, String str, String str2, Integer num) {
        this.LL = eComSearchStruct;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = num;
    }
}
