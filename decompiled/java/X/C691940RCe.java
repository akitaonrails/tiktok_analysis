package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691940RCe extends AbstractC691970RCh {
    public final C0R73 LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C691940RCe)) {
            return false;
        }
        C691940RCe c691940RCe = (C691940RCe) obj;
        return Intrinsics.LJFF(this.LIZIZ, c691940RCe.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c691940RCe.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NodeRemoved(node=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", parentId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C691940RCe(C0R73 c0r73, String str) {
        super("GONE");
        this.LIZIZ = c0r73;
        this.LIZJ = str;
    }
}
