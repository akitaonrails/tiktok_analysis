package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IhS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473440IhS {
    public final String LIZ;
    public final EnumC1093260eYW LIZIZ;
    public final Map<String, Object> LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C473440IhS)) {
            return false;
        }
        C473440IhS c473440IhS = (C473440IhS) obj;
        return Intrinsics.LJFF(this.LIZ, c473440IhS.LIZ) && this.LIZIZ == c473440IhS.LIZIZ && Intrinsics.LJFF(this.LIZJ, c473440IhS.LIZJ) && this.LIZLLL == c473440IhS.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrategyEvent(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timeStamp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Map<String, Object> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("live_event_key", this.LIZ);
        EnumC1093260eYW enumC1093260eYW = this.LIZIZ;
        linkedHashMap.put("source", enumC1093260eYW != null ? enumC1093260eYW.name() : null);
        linkedHashMap.put("live_timestamp", Long.valueOf(this.LIZLLL));
        linkedHashMap.putAll(this.LIZJ);
        return linkedHashMap;
    }

    public /* synthetic */ C473440IhS(String str, EnumC1093260eYW enumC1093260eYW, Map map) {
        this(str, enumC1093260eYW, map, System.currentTimeMillis());
    }

    public C473440IhS(String str, EnumC1093260eYW enumC1093260eYW, Map<String, Object> map, long j) {
        this.LIZ = str;
        this.LIZIZ = enumC1093260eYW;
        this.LIZJ = map;
        this.LIZLLL = j;
        this.LJ = str;
    }
}
