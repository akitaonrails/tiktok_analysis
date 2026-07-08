package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Evv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380490Evv {
    public final boolean LIZ;
    public final List<C379430EuD> LIZIZ;
    public final EnumC379360Eu6 LIZJ;

    public C380490Evv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C380490Evv)) {
            return false;
        }
        C380490Evv c380490Evv = (C380490Evv) obj;
        return this.LIZ == c380490Evv.LIZ && Intrinsics.LJFF(this.LIZIZ, c380490Evv.LIZIZ) && this.LIZJ == c380490Evv.LIZJ;
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        EnumC379360Eu6 enumC379360Eu6 = this.LIZJ;
        return iZ2 + (enumC379360Eu6 == null ? 0 : enumC379360Eu6.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCPromptRephraserState(showPanel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", options=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", selectedOptionKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C380490Evv(int i) {
        this(false, C13BV.INSTANCE, EnumC379360Eu6.CREATIVE);
    }

    public C380490Evv(boolean z, List<C379430EuD> list, EnumC379360Eu6 enumC379360Eu6) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = enumC379360Eu6;
    }

    public static C380490Evv LIZ(C380490Evv c380490Evv, List list, EnumC379360Eu6 enumC379360Eu6, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = c380490Evv.LIZ;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            list = c380490Evv.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC379360Eu6 = c380490Evv.LIZJ;
        }
        c380490Evv.getClass();
        return new C380490Evv(z, list, enumC379360Eu6);
    }
}
