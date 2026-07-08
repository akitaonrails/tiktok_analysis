package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617230OIv implements InterfaceC1891350zJl {
    public final Long LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final C0OJ0 LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C617230OIv)) {
            return false;
        }
        C617230OIv c617230OIv = (C617230OIv) obj;
        return Intrinsics.LJFF(this.LL, c617230OIv.LL) && this.LLILLJJLI == c617230OIv.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c617230OIv.LLILLL) && Intrinsics.LJFF(this.LLILZ, c617230OIv.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        Long l = this.LL;
        int iHashCode = (((l == null ? 0 : l.hashCode()) * 31) + this.LLILLJJLI) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C0OJ0 c0oj0 = this.LLILZ;
        return iHashCode2 + (c0oj0 != null ? c0oj0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinFunctionEditItem(editQuota=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", entranceId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", entranceKey=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", uiConfig=");
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

    public C617230OIv(Long l, int i, String str, C0OJ0 c0oj0) {
        this.LL = l;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = c0oj0;
    }
}
