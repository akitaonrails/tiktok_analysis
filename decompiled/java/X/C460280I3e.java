package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460280I3e implements InterfaceC460300I3g {
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;

    public C460280I3e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C460280I3e)) {
            return false;
        }
        C460280I3e c460280I3e = (C460280I3e) obj;
        return this.LIZIZ == c460280I3e.LIZIZ && this.LIZJ == c460280I3e.LIZJ && Intrinsics.LJFF(this.LIZLLL, c460280I3e.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrPlurals(txtRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", displayCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C460280I3e(long j, String str) {
        this.LIZIZ = 2131755704;
        this.LIZJ = j;
        this.LIZLLL = str;
    }
}
