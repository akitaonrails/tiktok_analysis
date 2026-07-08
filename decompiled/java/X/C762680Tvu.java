package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tvu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C762680Tvu extends AbstractC762710Tvx {
    public final C763160Twg LIZ;
    public final int LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C762680Tvu)) {
            return false;
        }
        C762680Tvu c762680Tvu = (C762680Tvu) obj;
        return Intrinsics.LJFF(this.LIZ, c762680Tvu.LIZ) && this.LIZIZ == c762680Tvu.LIZIZ && this.LIZJ == c762680Tvu.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddFavoriteSongs(songList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", addNum=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C762680Tvu(C763160Twg c763160Twg, int i, long j) {
        this.LIZ = c763160Twg;
        this.LIZIZ = i;
        this.LIZJ = j;
    }
}
