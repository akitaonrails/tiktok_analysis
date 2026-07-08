package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691950RCf extends AbstractC691970RCh {
    public final C0R73 LIZIZ;
    public final C0R73 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C691950RCf)) {
            return false;
        }
        C691950RCf c691950RCf = (C691950RCf) obj;
        return Intrinsics.LJFF(this.LIZIZ, c691950RCf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c691950RCf.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarginChanged(lastNode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", curNode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C691950RCf(C0R73 c0r73, C0R73 c0r732) {
        super("MARGIN_CHANGE");
        this.LIZIZ = c0r73;
        this.LIZJ = c0r732;
    }
}
