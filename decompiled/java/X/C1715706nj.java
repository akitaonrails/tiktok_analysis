package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06nj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1715706nj {
    public final C06XH LIZ;
    public final boolean LIZIZ;
    public final AbstractC1751306tT LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1715706nj)) {
            return false;
        }
        C1715706nj c1715706nj = (C1715706nj) obj;
        return this.LIZ == c1715706nj.LIZ && this.LIZIZ == c1715706nj.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1715706nj.LIZJ) && this.LIZLLL == c1715706nj.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationQueueBlockConfig(typeWithPriority=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", disableAutoCompletion=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", conflictOption=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ignoreDuplicateTypes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1715706nj(C06XH c06xh) {
        C1751606tW c1751606tW = C1751606tW.LIZ;
        this.LIZ = c06xh;
        this.LIZIZ = false;
        this.LIZJ = c1751606tW;
        this.LIZLLL = true;
    }
}
