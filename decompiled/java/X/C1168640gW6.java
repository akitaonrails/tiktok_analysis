package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gW6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1168640gW6 extends C1168650gW7 {
    public final String LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    public C1168640gW6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1168640gW6)) {
            return false;
        }
        C1168640gW6 c1168640gW6 = (C1168640gW6) obj;
        return Intrinsics.LJFF(this.LLILLL, c1168640gW6.LLILLL) && this.LLILZ == c1168640gW6.LLILZ && this.LLILZIL == c1168640gW6.LLILZIL;
    }

    public final int hashCode() {
        return (((this.LLILLL.hashCode() * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultMixListItem(mixId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", select=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isNameValid=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1168650gW7
    public final boolean LIZ() {
        return this.LLILZ;
    }

    public C1168640gW6(int i) {
        super(0);
        this.LLILLL = "";
        this.LLILZ = false;
        this.LLILZIL = true;
    }

    @Override // X.C1168650gW7
    public final void LIZIZ(boolean z) {
        this.LLILZ = z;
    }
}
