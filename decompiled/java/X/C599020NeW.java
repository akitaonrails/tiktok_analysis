package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599020NeW implements InterfaceC598890NeJ {
    public final String LIZ;
    public final Map<String, Object> LIZIZ;
    public final Map<String, Object> LIZJ;
    public long LIZLLL;

    public C599020NeW() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C599020NeW)) {
            return false;
        }
        C599020NeW c599020NeW = (C599020NeW) obj;
        return Intrinsics.LJFF(this.LIZ, c599020NeW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c599020NeW.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c599020NeW.LIZJ) && this.LIZLLL == c599020NeW.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Map<String, Object> map = this.LIZIZ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.LIZJ;
        return ((iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultContentModuleEvent(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", startTimestamp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC598890NeJ
    public final JSONObject LJLIIIL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> mapLIZJ = LIZJ();
        if (mapLIZJ != null) {
            linkedHashMap.putAll(mapLIZJ);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z = true;
            if (!linkedHashMap.isEmpty()) {
                jSONObject.put("params", new JSONObject(linkedHashMap));
            }
            if (LIZIZ() == null || !(!r0.isEmpty())) {
                z = false;
            }
            if (!z) {
                return jSONObject;
            }
            jSONObject.put("perfParams", new JSONObject(LIZIZ()));
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    @Override // X.InterfaceC598890NeJ
    public final long LIZ() {
        return this.LIZLLL;
    }

    public final Map<String, Object> LIZIZ() {
        return this.LIZJ;
    }

    public final Map<String, Object> LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC598890NeJ
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC598890NeJ
    public final EnumC599530NfL getType() {
        return EnumC599530NfL.EVENT;
    }

    public C599020NeW(String str, Map map, Map map2, int i) {
        long j;
        map = (i & 2) != 0 ? null : map;
        map2 = (i & 4) != 0 ? null : map2;
        if ((i & 8) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        this.LIZ = str;
        this.LIZIZ = map;
        this.LIZJ = map2;
        this.LIZLLL = j;
    }
}
