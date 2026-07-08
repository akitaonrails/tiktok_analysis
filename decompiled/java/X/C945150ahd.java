package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ahd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C945150ahd {
    public final long LIZ;
    public final EnumC945310aht LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C945150ahd)) {
            return false;
        }
        C945150ahd c945150ahd = (C945150ahd) obj;
        return this.LIZ == c945150ahd.LIZ && this.LIZIZ == c945150ahd.LIZIZ && Intrinsics.LJFF(this.LIZJ, c945150ahd.LIZJ) && this.LIZLLL == c945150ahd.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutManagerKey(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pageType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", liveType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isRoomOwner=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C945150ahd(long j, EnumC945310aht enumC945310aht, String str) {
        this.LIZ = j;
        this.LIZIZ = enumC945310aht;
        this.LIZJ = str;
    }
}
