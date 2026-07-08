package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556670qbx implements InterfaceC0148002o {
    public int LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public C1556670qbx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556670qbx)) {
            return false;
        }
        C1556670qbx c1556670qbx = (C1556670qbx) obj;
        return this.LL == c1556670qbx.LL && Intrinsics.LJFF(this.LLILLJJLI, c1556670qbx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1556670qbx.LLILLL);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILLL;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InnerPushBottomState(bottomType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bottomBtnText=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bottomSchemaUrl=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1556670qbx(int i) {
        this(0, null, null);
    }

    public C1556670qbx(int i, String str, String str2) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
