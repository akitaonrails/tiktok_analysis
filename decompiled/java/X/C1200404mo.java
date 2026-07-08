package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1200404mo {
    public final Map<String, String> LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1200404mo)) {
            return false;
        }
        C1200404mo c1200404mo = (C1200404mo) obj;
        return Intrinsics.LJFF(this.LIZ, c1200404mo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1200404mo.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RankableUnit(rankingInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originalObject=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1200404mo(C1240530iO3 c1240530iO3, Map map) {
        this.LIZ = map;
        this.LIZIZ = c1240530iO3;
    }
}
