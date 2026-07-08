package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ty8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764060Ty8 extends AbstractC764660Tz6 {
    public final C0U22 LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C764060Ty8)) {
            return false;
        }
        C764060Ty8 c764060Ty8 = (C764060Ty8) obj;
        return Intrinsics.LJFF(this.LIZ, c764060Ty8.LIZ) && this.LIZIZ == c764060Ty8.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotifyCurPlayingSong(songInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isCurrentSinger=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764060Ty8(C0U22 c0u22, boolean z) {
        this.LIZ = c0u22;
        this.LIZIZ = z;
    }
}
