package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C762690Tvv extends AbstractC762710Tvx {
    public final long LIZ;
    public final C763160Twg LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C762690Tvv)) {
            return false;
        }
        C762690Tvv c762690Tvv = (C762690Tvv) obj;
        return this.LIZ == c762690Tvv.LIZ && Intrinsics.LJFF(this.LIZIZ, c762690Tvv.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchSongListSuccess(albumId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", songList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C762690Tvv(long j, C763160Twg c763160Twg) {
        this.LIZ = j;
        this.LIZIZ = c763160Twg;
    }
}
