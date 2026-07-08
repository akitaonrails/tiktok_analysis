package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20142413ra {
    public final C20142013rW LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20142413ra) && Intrinsics.LJFF(this.LIZ, ((C20142413ra) obj).LIZ);
    }

    public final int hashCode() {
        C20142013rW c20142013rW = this.LIZ;
        if (c20142013rW == null) {
            return 0;
        }
        return c20142013rW.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseAssetSlot(asset=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20142413ra(C20142013rW c20142013rW) {
        this.LIZ = c20142013rW;
    }
}
