package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EPf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364090EPf implements InterfaceC361400EEw {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C364090EPf)) {
            return false;
        }
        C364090EPf c364090EPf = (C364090EPf) obj;
        return this.LIZ == c364090EPf.LIZ && this.LIZIZ == c364090EPf.LIZIZ && Intrinsics.LJFF(this.LIZJ, c364090EPf.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconFuncItemConfig(iconRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", colorRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", funcType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C364090EPf(int i, int i2, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
    }
}
