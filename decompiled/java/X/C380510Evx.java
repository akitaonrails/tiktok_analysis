package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Evx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380510Evx {
    public final Function0<Unit> LIZ;
    public final Function1<C379430EuD, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C380510Evx)) {
            return false;
        }
        C380510Evx c380510Evx = (C380510Evx) obj;
        return Intrinsics.LJFF(this.LIZ, c380510Evx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c380510Evx.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCPromptRephraserActions(hidePanel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectOption=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C380510Evx(C380540Ew0 c380540Ew0, C380530Evz c380530Evz) {
        this.LIZ = c380540Ew0;
        this.LIZIZ = c380530Evz;
    }
}
