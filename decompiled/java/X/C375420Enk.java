package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Enk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375420Enk {
    public final C375830EoP<NLEModel> LIZ;
    public final Pair<NLETrack, NLETrackSlot> LIZIZ;
    public final long LIZJ;
    public final Pair<Float, Float> LIZLLL;
    public final List<InterfaceC375350End> LJ;
    public final C375830EoP<Unit> LJFF;
    public final C375830EoP<Boolean> LJI;

    public C375420Enk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C375420Enk)) {
            return false;
        }
        C375420Enk c375420Enk = (C375420Enk) obj;
        return Intrinsics.LJFF(this.LIZ, c375420Enk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c375420Enk.LIZIZ) && this.LIZJ == c375420Enk.LIZJ && Intrinsics.LJFF(this.LIZLLL, c375420Enk.LIZLLL) && Intrinsics.LJFF(this.LJ, c375420Enk.LJ) && Intrinsics.LJFF(this.LJFF, c375420Enk.LJFF) && Intrinsics.LJFF(this.LJI, c375420Enk.LJI);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Pair<NLETrack, NLETrackSlot> pair = this.LIZIZ;
        int iHashCode2 = (((((((iHashCode + (pair == null ? 0 : pair.hashCode())) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        C375830EoP<Unit> c375830EoP = this.LJFF;
        int iHashCode3 = (iHashCode2 + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<Boolean> c375830EoP2 = this.LJI;
        return iHashCode3 + (c375830EoP2 != null ? c375830EoP2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CropPreviewStates(updateNleModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentSelectSlot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentPlayProcess=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", canvasSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", materials=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", notifyInvalidate=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enableTouchEvent=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C375420Enk(int i) {
        this(new C375830EoP(new NLEModel()), null, 0L, new Pair(Float.valueOf(0.0f), Float.valueOf(0.0f)), C13BV.INSTANCE, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C375420Enk(C375830EoP<NLEModel> c375830EoP, Pair<? extends NLETrack, ? extends NLETrackSlot> pair, long j, Pair<Float, Float> pair2, List<? extends InterfaceC375350End> list, C375830EoP<Unit> c375830EoP2, C375830EoP<Boolean> c375830EoP3) {
        this.LIZ = c375830EoP;
        this.LIZIZ = pair;
        this.LIZJ = j;
        this.LIZLLL = pair2;
        this.LJ = list;
        this.LJFF = c375830EoP2;
        this.LJI = c375830EoP3;
    }

    public static C375420Enk LIZ(C375420Enk c375420Enk, C375830EoP c375830EoP, Pair pair, long j, Pair pair2, List list, C375830EoP c375830EoP2, int i) {
        C375830EoP<Unit> c375830EoP3;
        C375830EoP c375830EoP4 = c375830EoP2;
        Pair pair3 = pair2;
        long j2 = j;
        Pair pair4 = pair;
        List list2 = list;
        C375830EoP c375830EoP5 = c375830EoP;
        if ((i & 1) != 0) {
            c375830EoP5 = c375420Enk.LIZ;
        }
        if ((i & 2) != 0) {
            pair4 = c375420Enk.LIZIZ;
        }
        if ((i & 4) != 0) {
            j2 = c375420Enk.LIZJ;
        }
        if ((i & 8) != 0) {
            pair3 = c375420Enk.LIZLLL;
        }
        if ((i & 16) != 0) {
            list2 = c375420Enk.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP3 = c375420Enk.LJFF;
        } else {
            c375830EoP3 = null;
        }
        if ((i & 64) != 0) {
            c375830EoP4 = c375420Enk.LJI;
        }
        c375420Enk.getClass();
        return new C375420Enk(c375830EoP5, pair4, j2, pair3, list2, c375830EoP3, c375830EoP4);
    }
}
