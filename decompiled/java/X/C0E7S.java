package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E7S, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E7S {
    public NLEModel LIZ;
    public final C350090Dnz LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C350100Do0 LJ;
    public final C0E7P LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0E7S)) {
            return false;
        }
        C0E7S c0e7s = (C0E7S) obj;
        return Intrinsics.LJFF(this.LIZ, c0e7s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0e7s.LIZIZ) && this.LIZJ == c0e7s.LIZJ && this.LIZLLL == c0e7s.LIZLLL && Intrinsics.LJFF(this.LJ, c0e7s.LJ) && Intrinsics.LJFF(this.LJFF, c0e7s.LJFF);
    }

    public final int hashCode() {
        NLEModel nLEModel = this.LIZ;
        return ((((((((((nLEModel == null ? 0 : nLEModel.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackNLEData(curNLEModelStage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxTimeState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trackPanelMuteState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trackPanelMuteEnableState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mainTrackData=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", subTrackData=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0E7S(NLEModel nLEModel, C350090Dnz c350090Dnz, boolean z, boolean z2, C350100Do0 c350100Do0, C0E7P c0e7p) {
        this.LIZ = nLEModel;
        this.LIZIZ = c350090Dnz;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = c350100Do0;
        this.LJFF = c0e7p;
    }

    public static C0E7S LIZ(C0E7S c0e7s, C350090Dnz c350090Dnz, boolean z, boolean z2, C350100Do0 c350100Do0, C0E7P c0e7p, int i) {
        NLEModel nLEModel;
        C0E7P c0e7p2 = c0e7p;
        C350100Do0 c350100Do02 = c350100Do0;
        boolean z3 = z2;
        boolean z4 = z;
        C350090Dnz c350090Dnz2 = c350090Dnz;
        if ((i & 1) != 0) {
            nLEModel = c0e7s.LIZ;
        } else {
            nLEModel = null;
        }
        if ((i & 2) != 0) {
            c350090Dnz2 = c0e7s.LIZIZ;
        }
        if ((i & 4) != 0) {
            z4 = c0e7s.LIZJ;
        }
        if ((i & 8) != 0) {
            z3 = c0e7s.LIZLLL;
        }
        if ((i & 16) != 0) {
            c350100Do02 = c0e7s.LJ;
        }
        if ((i & 32) != 0) {
            c0e7p2 = c0e7s.LJFF;
        }
        c0e7s.getClass();
        return new C0E7S(nLEModel, c350090Dnz2, z4, z3, c350100Do02, c0e7p2);
    }
}
