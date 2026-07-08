package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M8R, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M8R extends C0M8P {
    public final int LIZIZ;
    public final C1683130ttv LIZJ;

    public C0M8R() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0M8R)) {
            return false;
        }
        C0M8R c0m8r = (C0M8R) obj;
        return this.LIZIZ == c0m8r.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0m8r.LIZJ);
    }

    public final int hashCode() {
        int i = this.LIZIZ * 31;
        C1683130ttv c1683130ttv = this.LIZJ;
        return i + (c1683130ttv == null ? 0 : c1683130ttv.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowPreview(at=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clickBounds=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0M8R(int i, int i2) {
        this((i2 & 1) != 0 ? -1 : i, (C1683130ttv) null);
    }

    public C0M8R(int i, C1683130ttv c1683130ttv) {
        super(false);
        this.LIZIZ = i;
        this.LIZJ = c1683130ttv;
    }
}
