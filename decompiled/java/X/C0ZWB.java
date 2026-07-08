package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZWB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZWB {
    public final int LIZ;
    public final int LIZIZ;
    public final C0ZW3 LIZJ;
    public final List<InterfaceC900840ZVq> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZWB)) {
            return false;
        }
        C0ZWB c0zwb = (C0ZWB) obj;
        return this.LIZ == c0zwb.LIZ && this.LIZIZ == c0zwb.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0zwb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0zwb.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Data(widthPx=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", heightPx=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mediaImageUIState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", imageOverlay=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0ZWB(int i, int i2, C0ZW3 c0zw3, List<? extends InterfaceC900840ZVq> list) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = c0zw3;
        this.LIZLLL = list;
    }
}
