package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Egm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371100Egm {
    public final long LIZ;
    public final long LIZIZ;
    public final NLETrackSlot LIZJ;
    public final C375830EoP<Unit> LIZLLL;

    public C371100Egm() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C371100Egm)) {
            return false;
        }
        C371100Egm c371100Egm = (C371100Egm) obj;
        return this.LIZ == c371100Egm.LIZ && this.LIZIZ == c371100Egm.LIZIZ && Intrinsics.LJFF(this.LIZJ, c371100Egm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c371100Egm.LIZLLL);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        NLETrackSlot nLETrackSlot = this.LIZJ;
        int iHashCode = (iY2 + (nLETrackSlot == null ? 0 : nLETrackSlot.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP = this.LIZLLL;
        return iHashCode + (c375830EoP != null ? c375830EoP.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CropTrackStates(currentPlayTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalPlayTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nleTrackSlot=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", invalidateTrack=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C371100Egm(int i) {
        this(0L, 0L, null, null);
    }

    public C371100Egm(long j, long j2, NLETrackSlot nLETrackSlot, C375830EoP<Unit> c375830EoP) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = nLETrackSlot;
        this.LIZLLL = c375830EoP;
    }

    public static C371100Egm LIZ(C371100Egm c371100Egm, long j, long j2, NLETrackSlot nLETrackSlot, C375830EoP c375830EoP, int i) {
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        long j3 = j2;
        C375830EoP c375830EoP2 = c375830EoP;
        long j4 = j;
        if ((i & 1) != 0) {
            j4 = c371100Egm.LIZ;
        }
        if ((i & 2) != 0) {
            j3 = c371100Egm.LIZIZ;
        }
        if ((i & 4) != 0) {
            nLETrackSlot2 = c371100Egm.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP2 = c371100Egm.LIZLLL;
        }
        c371100Egm.getClass();
        return new C371100Egm(j4, j3, nLETrackSlot2, c375830EoP2);
    }
}
