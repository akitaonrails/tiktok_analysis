package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.002g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0140002g implements InterfaceC0141002h {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0140002g)) {
            return false;
        }
        C0140002g c0140002g = (C0140002g) obj;
        return Intrinsics.LJFF(this.LIZ, c0140002g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0140002g.LIZIZ) && this.LIZJ == c0140002g.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StickerLottieGuideData(hint=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lottieAssetsPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", durationInMillis=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0140002g(String str, String str2, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
    }
}
