package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691960RCg extends AbstractC691970RCh {
    public final C0R73 LIZIZ;
    public final C0R73 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C691960RCg)) {
            return false;
        }
        C691960RCg c691960RCg = (C691960RCg) obj;
        return Intrinsics.LJFF(this.LIZIZ, c691960RCg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c691960RCg.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SizeChanged(lastNode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", curNode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C691960RCg(C0R73 c0r73, C0R73 c0r732) {
        super("SIZE_CHANGE");
        this.LIZIZ = c0r73;
        this.LIZJ = c0r732;
    }
}
