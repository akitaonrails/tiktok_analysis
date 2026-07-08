package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18V1, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18V1 extends C0H94 {
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final C909930Zmp LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18V1)) {
            return false;
        }
        C18V1 c18v1 = (C18V1) obj;
        return Intrinsics.LJFF(this.LL, c18v1.LL) && this.LLILLJJLI == c18v1.LLILLJJLI && this.LLILLL == c18v1.LLILLL && this.LLILZ == c18v1.LLILZ && this.LLILZIL == c18v1.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c18v1.LLILZLL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31;
        C909930Zmp c909930Zmp = this.LLILZLL;
        return iHashCode + (c909930Zmp == null ? 0 : c909930Zmp.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGeneratingItem(uuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fromProgress=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", toProgress=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", beginTime=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0H94, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C18V1) || !Intrinsics.LJFF(interfaceC1891350zJl, this)) {
            return false;
        }
        C18V1 c18v1 = (C18V1) interfaceC1891350zJl;
        if (this.LLILLJJLI != c18v1.LLILLJJLI || this.LLILLL != c18v1.LLILLL || this.LLILZ != c18v1.LLILZ || this.LLILZIL != c18v1.LLILZIL) {
            return false;
        }
        return true;
    }

    public C18V1(String str, int i, int i2, long j, long j2, C909930Zmp c909930Zmp) {
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = c909930Zmp;
    }
}
