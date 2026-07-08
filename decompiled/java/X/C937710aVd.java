package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937710aVd extends AbstractC937680aVa {
    public final C941240abK LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C937710aVd)) {
            return false;
        }
        C937710aVd c937710aVd = (C937710aVd) obj;
        return Intrinsics.LJFF(this.LIZ, c937710aVd.LIZ) && this.LIZIZ == c937710aVd.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickPlayToolItem(item=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C937710aVd(C941240abK c941240abK, int i) {
        this.LIZ = c941240abK;
        this.LIZIZ = i;
    }
}
