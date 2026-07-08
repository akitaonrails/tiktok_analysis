package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OwP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635590OwP implements InterfaceC1891350zJl {
    public final Integer LL;
    public final Integer LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Boolean LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C635590OwP)) {
            return false;
        }
        C635590OwP c635590OwP = (C635590OwP) obj;
        return Intrinsics.LJFF(this.LL, c635590OwP.LL) && Intrinsics.LJFF(this.LLILLJJLI, c635590OwP.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c635590OwP.LLILLL) && Intrinsics.LJFF(this.LLILZ, c635590OwP.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c635590OwP.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c635590OwP.LLILZLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Integer num = this.LL;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LLILZLL;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeSettingsItem(group=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", label=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", subscribeDesc=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", unsubscribeDesc=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isUnsubscribe=");
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

    public C635590OwP(Integer num, String str, Integer num2, String str2, String str3, Boolean bool) {
        this.LL = num;
        this.LLILLJJLI = num2;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = bool;
    }
}
