package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E3P, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E3P {
    public NLETrackSlot LIZ;
    public float LIZIZ;
    public final C375830EoP<Unit> LIZJ;

    public C0E3P() {
        this(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0E3P)) {
            return false;
        }
        C0E3P c0e3p = (C0E3P) obj;
        return Intrinsics.LJFF(this.LIZ, c0e3p.LIZ) && Float.compare(this.LIZIZ, c0e3p.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c0e3p.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SoundAdjustStates(bindBgmSlot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", videoCursorProgress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stopScroll=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        NLETrackSlot nLETrackSlot = this.LIZ;
        int iHashCode = (((nLETrackSlot == null ? 0 : nLETrackSlot.hashCode()) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31;
        C375830EoP<Unit> c375830EoP = this.LIZJ;
        return iHashCode + (c375830EoP != null ? c375830EoP.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0E3P(int i) {
        float f;
        if ((i & 2) != 0) {
            f = -1.0f;
        } else {
            f = 0.0f;
        }
        this(null, f, null);
    }

    public C0E3P(NLETrackSlot nLETrackSlot, float f, C375830EoP<Unit> c375830EoP) {
        this.LIZ = nLETrackSlot;
        this.LIZIZ = f;
        this.LIZJ = c375830EoP;
    }

    public static C0E3P LIZ(C0E3P c0e3p, NLETrackSlot nLETrackSlot, float f, C375830EoP c375830EoP, int i) {
        if ((i & 1) != 0) {
            nLETrackSlot = c0e3p.LIZ;
        }
        if ((i & 2) != 0) {
            f = c0e3p.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP = c0e3p.LIZJ;
        }
        c0e3p.getClass();
        return new C0E3P(nLETrackSlot, f, c375830EoP);
    }
}
