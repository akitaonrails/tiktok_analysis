package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YOm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873500YOm {
    public final C0YHT LIZ;
    public final List<AbstractC873650YPb> LIZIZ;
    public final Function2<C0Y8T, C869590Y9l, Unit> LIZJ;
    public final C0YOY LIZLLL;
    public final C0Y3I LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C873500YOm)) {
            return false;
        }
        C873500YOm c873500YOm = (C873500YOm) obj;
        return Intrinsics.LJFF(this.LIZ, c873500YOm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c873500YOm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c873500YOm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c873500YOm.LIZLLL) && Intrinsics.LJFF(this.LJ, c873500YOm.LJ) && this.LJFF == c873500YOm.LJFF;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        List<AbstractC873650YPb> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Function2<C0Y8T, C869590Y9l, Unit> function2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (function2 == null ? 0 : function2.hashCode())) * 31;
        C0YOY c0yoy = this.LIZLLL;
        return ((((iHashCode3 + (c0yoy != null ? c0yoy.hashCode() : 0)) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaMsgInput(msgProvider=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extraStepsBeforeSending=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", addMessageCallback=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sendMessageEventListener=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", tracer=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", disableAutoResend=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C873500YOm(C0YHT c0yht, List list, C0YOY c0yoy, C0Y3I c0y3i, boolean z, int i) {
        this(c0yht, (List<? extends AbstractC873650YPb>) ((i & 2) != 0 ? null : list), (Function2<? super C0Y8T, ? super C869590Y9l, Unit>) null, (i & 8) != 0 ? null : c0yoy, c0y3i, (i & 32) != 0 ? false : z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C873500YOm(C0YHT c0yht, List<? extends AbstractC873650YPb> list, Function2<? super C0Y8T, ? super C869590Y9l, Unit> function2, C0YOY c0yoy, C0Y3I c0y3i, boolean z) {
        this.LIZ = c0yht;
        this.LIZIZ = list;
        this.LIZJ = function2;
        this.LIZLLL = c0yoy;
        this.LJ = c0y3i;
        this.LJFF = z;
    }
}
