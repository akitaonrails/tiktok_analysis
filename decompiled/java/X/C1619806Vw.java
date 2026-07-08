package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Vw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1619806Vw {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1619806Vw)) {
            return false;
        }
        C1619806Vw c1619806Vw = (C1619806Vw) obj;
        return Intrinsics.LJFF(this.LIZ, c1619806Vw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1619806Vw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1619806Vw.LIZJ) && this.LIZLLL == c1619806Vw.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingRefresh(unlockBubbleId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mediaSource=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", markedAtMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1619806Vw(String str, String str2, String str3, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = j;
    }
}
