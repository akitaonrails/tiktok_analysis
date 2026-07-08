package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ew8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380620Ew8 {
    public final Function1<C380190EvR, Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function1<Integer, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C380620Ew8)) {
            return false;
        }
        C380620Ew8 c380620Ew8 = (C380620Ew8) obj;
        return Intrinsics.LJFF(this.LIZ, c380620Ew8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c380620Ew8.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c380620Ew8.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCModelSelectActions(selectModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hidePanel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", switchTab=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C380620Ew8(C380630Ew9 c380630Ew9, C380610Ew7 c380610Ew7, C380600Ew6 c380600Ew6) {
        this.LIZ = c380610Ew7;
        this.LIZIZ = c380630Ew9;
        this.LIZJ = c380600Ew6;
    }
}
