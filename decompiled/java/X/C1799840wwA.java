package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799840wwA {
    public final boolean LIZ;
    public final EnumC1800020wwS LIZIZ;
    public final long LIZJ;
    public final List<Integer> LIZLLL;
    public final Map<EnumC1799930wwJ, C07Z8> LJ;

    public C1799840wwA() {
        this(false, EnumC1800020wwS.INVISIBLE, TimeUnit.SECONDS.toMillis(90L), C1697810uHb.LJIIJJI(5, 14), C2097608Jq.LJ());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1799840wwA)) {
            return false;
        }
        C1799840wwA c1799840wwA = (C1799840wwA) obj;
        return this.LIZ == c1799840wwA.LIZ && this.LIZIZ == c1799840wwA.LIZIZ && this.LIZJ == c1799840wwA.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1799840wwA.LIZLLL) && Intrinsics.LJFF(this.LJ, c1799840wwA.LJ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MinisRevisitConfig(enable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", entryVariant=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", strongEntryDelayMillis=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", floatingBallExitDaysSequence=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", missions=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1799840wwA(boolean z, EnumC1800020wwS enumC1800020wwS, long j, List<Integer> list, Map<EnumC1799930wwJ, C07Z8> map) {
        this.LIZ = z;
        this.LIZIZ = enumC1800020wwS;
        this.LIZJ = j;
        this.LIZLLL = list;
        this.LJ = map;
    }
}
