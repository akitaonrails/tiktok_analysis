package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157090gDT implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;

    public C1157090gDT() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157090gDT)) {
            return false;
        }
        C1157090gDT c1157090gDT = (C1157090gDT) obj;
        return Intrinsics.LJFF(this.LL, c1157090gDT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1157090gDT.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiAlbumMixPageListCellData(tabCode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.LLILLJJLI);
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

    public C1157090gDT(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
