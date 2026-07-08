package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dt8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353280Dt8 {
    public final boolean LIZ;
    public final List<C352950Dsb> LIZIZ;
    public final C375830EoP<List<Integer>> LIZJ;
    public final NLETrackSlot LIZLLL;

    public C353280Dt8() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C353280Dt8)) {
            return false;
        }
        C353280Dt8 c353280Dt8 = (C353280Dt8) obj;
        return this.LIZ == c353280Dt8.LIZ && Intrinsics.LJFF(this.LIZIZ, c353280Dt8.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c353280Dt8.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c353280Dt8.LIZLLL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        C375830EoP<List<Integer>> c375830EoP = this.LIZJ;
        int iHashCode = (iZ2 + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        NLETrackSlot nLETrackSlot = this.LIZLLL;
        return iHashCode + (nLETrackSlot != null ? nLETrackSlot.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FreeLayerPanelSceneState(show=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", curShowItemList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", updateItemIconEvent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", curSelectSlot=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C353280Dt8(NLETrackSlot nLETrackSlot, int i) {
        C13BV c13bv;
        if ((i & 2) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(false, c13bv, null, (i & 8) != 0 ? null : nLETrackSlot);
    }

    public C353280Dt8(boolean z, List<C352950Dsb> list, C375830EoP<List<Integer>> c375830EoP, NLETrackSlot nLETrackSlot) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = c375830EoP;
        this.LIZLLL = nLETrackSlot;
    }

    public static C353280Dt8 LIZ(C353280Dt8 c353280Dt8, List list, C375830EoP c375830EoP, NLETrackSlot nLETrackSlot, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = c353280Dt8.LIZ;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            list = c353280Dt8.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP = c353280Dt8.LIZJ;
        }
        if ((i & 8) != 0) {
            nLETrackSlot = c353280Dt8.LIZLLL;
        }
        c353280Dt8.getClass();
        return new C353280Dt8(z, list, c375830EoP, nLETrackSlot);
    }
}
