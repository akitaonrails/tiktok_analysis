package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0inq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256520inq implements InterfaceC1606880ruw {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1256520inq)) {
            return false;
        }
        C1256520inq c1256520inq = (C1256520inq) obj;
        return this.LL == c1256520inq.LL && this.LLILLJJLI == c1256520inq.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1256520inq.LLILLL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        String str = this.LLILLL;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarPersonState(hasBadge=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hasOverlay=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", frameUrl=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1606880ruw
    public final String getString() {
        return this.LLILZ;
    }

    public C1256520inq(boolean z, boolean z2, String str) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("P-");
        sbLIZ.append(z);
        sbLIZ.append('-');
        sbLIZ.append(z2);
        sbLIZ.append('-');
        sbLIZ.append(str);
        this.LLILZ = C2188811AlT.LIZIZ(sbLIZ);
    }
}
