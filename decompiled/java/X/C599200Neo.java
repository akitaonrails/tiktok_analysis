package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Neo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C599200Neo implements InterfaceC599270Nev {
    public final String LIZ;
    public final Map<String, Object> LIZIZ;
    public final Map<String, Object> LIZJ;
    public final Map<String, Object> LIZLLL;
    public long LJ;

    public C599200Neo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C599200Neo)) {
            return false;
        }
        C599200Neo c599200Neo = (C599200Neo) obj;
        return Intrinsics.LJFF(this.LIZ, c599200Neo.LIZ) && Intrinsics.LJFF(this.LIZIZ, c599200Neo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c599200Neo.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c599200Neo.LIZLLL) && this.LJ == c599200Neo.LJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Map<String, Object> map = this.LIZIZ;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Object> map3 = this.LIZLLL;
        return ((iHashCode3 + (map3 != null ? map3.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultPdpModuleEvent(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", perfParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", startTimestamp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC599270Nev
    public final JSONObject LJLIIIL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> data = getData();
        if (data != null) {
            linkedHashMap.putAll(data);
        }
        Map<String, Object> extras = getExtras();
        if (extras != null) {
            linkedHashMap.putAll(extras);
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

    @Override // X.InterfaceC599270Nev
    public final long LIZ() {
        return this.LJ;
    }

    public final Map<String, Object> LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC599270Nev
    public final Map<String, Object> getData() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC599270Nev
    public final Map<String, Object> getExtras() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC599270Nev
    public final String getName() {
        return this.LIZ;
    }

    @Override // X.InterfaceC599270Nev
    public final EnumC599500NfI getType() {
        return EnumC599500NfI.EVENT;
    }

    public C599200Neo(String str, Map map, Map map2, Map map3, int i) {
        long j;
        map = (i & 2) != 0 ? null : map;
        map2 = (i & 4) != 0 ? null : map2;
        map3 = (i & 8) != 0 ? null : map3;
        if ((i & 16) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        this.LIZ = str;
        this.LIZIZ = map;
        this.LIZJ = map2;
        this.LIZLLL = map3;
        this.LJ = j;
    }
}
