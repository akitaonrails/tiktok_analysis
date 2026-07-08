package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NCM, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCM {
    public final C0N0Y LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NCM)) {
            return false;
        }
        C0NCM c0ncm = (C0NCM) obj;
        return Intrinsics.LJFF(this.LIZ, c0ncm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ncm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ncm.LIZJ) && this.LIZLLL == c0ncm.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3PlaybackHandoffState(playerManager=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentAid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentOuterAnchorKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isPlaying=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NCM(C0N0Y c0n0y, String str, String str2, boolean z) {
        this.LIZ = c0n0y;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
    }
}
