package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vfz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1751370vfz implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Boolean LLILZ;
    public final String LLILZIL;
    public final Long LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1751370vfz)) {
            return false;
        }
        C1751370vfz c1751370vfz = (C1751370vfz) obj;
        return Intrinsics.LJFF(this.LL, c1751370vfz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1751370vfz.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1751370vfz.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1751370vfz.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1751370vfz.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1751370vfz.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.LLILZLL;
        return iHashCode5 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorItemDataItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", linkSchema=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", needBool=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", lastMessage=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", lastMessageTime=");
        sbLIZ.append(this.LLILZLL);
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

    public C1751370vfz(Boolean bool, Long l, String str, String str2, String str3, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = bool;
        this.LLILZIL = str4;
        this.LLILZLL = l;
    }
}
