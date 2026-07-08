package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406260mhM implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Object LLILZ;
    public boolean LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406260mhM)) {
            return false;
        }
        C1406260mhM c1406260mhM = (C1406260mhM) obj;
        return Intrinsics.LJFF(this.LL, c1406260mhM.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1406260mhM.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1406260mhM.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1406260mhM.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        Object obj = this.LLILZ;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleSelectionItem(id=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", subtitle=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1406260mhM LIZ(C1406260mhM c1406260mhM) {
        return new C1406260mhM(c1406260mhM.LL, c1406260mhM.LLILLJJLI, c1406260mhM.LLILLL, c1406260mhM.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1406260mhM)) {
            return false;
        }
        C1406260mhM c1406260mhM = (C1406260mhM) interfaceC1891350zJl;
        if (c1406260mhM.LLILZIL != this.LLILZIL || !Intrinsics.LJFF(c1406260mhM.LLILLJJLI, this.LLILLJJLI) || !Intrinsics.LJFF(c1406260mhM.LLILLL, this.LLILLL)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1406260mhM)) {
            return false;
        }
        return Intrinsics.LJFF(((C1406260mhM) interfaceC1891350zJl).LL, this.LL);
    }

    public C1406260mhM(String str, String str2, String str3, Object obj) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = obj;
    }
}
