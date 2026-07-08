package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZRR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZRR {
    public final C21416018rW LIZ;
    public final EnumC901300ZXk LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZRR)) {
            return false;
        }
        C0ZRR c0zrr = (C0ZRR) obj;
        return Intrinsics.LJFF(this.LIZ, c0zrr.LIZ) && this.LIZIZ == c0zrr.LIZIZ;
    }

    public final int hashCode() {
        C21416018rW c21416018rW = this.LIZ;
        return ((c21416018rW == null ? 0 : c21416018rW.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectableTextTarget(view=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", longPressPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZRR(C21416018rW c21416018rW, EnumC901300ZXk enumC901300ZXk) {
        this.LIZ = c21416018rW;
        this.LIZIZ = enumC901300ZXk;
    }
}
