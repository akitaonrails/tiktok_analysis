package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VMb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796430VMb {
    public final long LIZ = 0;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final Map<String, Object> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C796430VMb)) {
            return false;
        }
        C796430VMb c796430VMb = (C796430VMb) obj;
        return this.LIZ == c796430VMb.LIZ && Intrinsics.LJFF(this.LIZIZ, c796430VMb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c796430VMb.LIZJ) && this.LIZLLL == c796430VMb.LIZLLL && this.LJ == c796430VMb.LJ && Intrinsics.LJFF(this.LJFF, c796430VMb.LJFF);
    }

    public final int hashCode() {
        return (((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveTTMStrategyContext(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", strategy=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", engineType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sceneType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C796430VMb(int i, int i2, String str, String str2, Map map) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = map;
    }
}
