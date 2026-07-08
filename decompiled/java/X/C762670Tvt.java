package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C762670Tvt extends AbstractC762710Tvx {
    public final long LIZ;
    public final C763160Twg LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C762670Tvt)) {
            return false;
        }
        C762670Tvt c762670Tvt = (C762670Tvt) obj;
        return this.LIZ == c762670Tvt.LIZ && Intrinsics.LJFF(this.LIZIZ, c762670Tvt.LIZIZ) && this.LIZJ == c762670Tvt.LIZJ && this.LIZLLL == c762670Tvt.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddSongs(albumId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", songList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startPosition=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", addNum=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C762670Tvt(long j, C763160Twg c763160Twg, int i, long j2) {
        this.LIZ = j;
        this.LIZIZ = c763160Twg;
        this.LIZJ = i;
        this.LIZLLL = j2;
    }
}
