package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UIv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770110UIv {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C770110UIv)) {
            return false;
        }
        C770110UIv c770110UIv = (C770110UIv) obj;
        return this.LIZ == c770110UIv.LIZ && this.LIZIZ == c770110UIv.LIZIZ && this.LIZJ == c770110UIv.LIZJ && Intrinsics.LJFF(this.LIZLLL, c770110UIv.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LetsDanceEffectMsg(msgType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", arg1=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", arg2=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", arg3=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C770110UIv(int i, int i2, int i3, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = str;
    }
}
