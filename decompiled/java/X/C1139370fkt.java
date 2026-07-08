package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fkt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139370fkt {
    public long LIZ = 0;
    public String LIZIZ = "";
    public String LIZJ = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1139370fkt)) {
            return false;
        }
        C1139370fkt c1139370fkt = (C1139370fkt) obj;
        return this.LIZ == c1139370fkt.LIZ && Intrinsics.LJFF(this.LIZIZ, c1139370fkt.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1139370fkt.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopGifterContext(diamondTotal=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", nickname=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", avatarUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
