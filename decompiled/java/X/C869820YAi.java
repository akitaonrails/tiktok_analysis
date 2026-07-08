package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS248S0000000_14;

/* JADX INFO: renamed from: X.0YAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869820YAi implements InterfaceC869790YAf {
    public final C0YEM LIZIZ;
    public final C0Y5R LIZJ;

    public C869820YAi(C0YEM c0yem) {
        this.LIZIZ = c0yem;
        this.LIZJ = c0yem.LJIIZILJ().LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Map<java.lang.String, java.lang.Long>] */
    @Override // X.InterfaceC869790YAf
    public final Map<String, Long> LIZ(List<String> list) {
        if (list.isEmpty()) {
            return C2097608Jq.LJ();
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS248S0000000_14.get$arr$(407), 30);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n            SELECT ");
        EnumC869810YAh enumC869810YAh = EnumC869810YAh.COLUMN_MSG_UUID;
        sbLIZ.append(enumC869810YAh.getKey());
        sbLIZ.append(", ");
        EnumC869810YAh enumC869810YAh2 = EnumC869810YAh.COLUMN_REGION_ID;
        sbLIZ.append(enumC869810YAh2.getKey());
        sbLIZ.append("\n            FROM msg_metadata\n            WHERE ");
        sbLIZ.append(enumC869810YAh.getKey());
        sbLIZ.append(" IN (");
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(")\n        ");
        String strLIZJ = C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        String[] strArr = (String[]) list.toArray(new String[0]);
        ?? linkedHashMap = new LinkedHashMap();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(strLIZJ, "getMsgIdToRegionIdMap", strArr);
                if (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                    int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(enumC869810YAh.getKey());
                    int columnIndex2 = interfaceC869470Y8zLJIIJJI.getColumnIndex(enumC869810YAh2.getKey());
                    do {
                        linkedHashMap.put(interfaceC869470Y8zLJIIJJI.getString(columnIndex), Long.valueOf(interfaceC869470Y8zLJIIJJI.getLong(columnIndex2)));
                    } while (interfaceC869470Y8zLJIIJJI.moveToNext());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIIZZ("DefaultIMMsgMetadataDao", "getMsgIdToRegionIdMap, failed", e);
                this.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LJ(e);
                linkedHashMap = C2097608Jq.LJ();
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final boolean LIZJ(String str) {
        String[] strArr = {str};
        C870430YCr proxy = this.LIZJ.getProxy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC869810YAh.COLUMN_CONV_ID.getKey());
        sbLIZ.append(" = ?");
        return proxy.LIZIZ("msg_metadata", C2188811AlT.LIZIZ(sbLIZ), strArr);
    }

    @Override // X.InterfaceC869790YAf
    public final boolean LIZIZ(long j, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\n                INSERT OR REPLACE INTO msg_metadata \n                (\n                    ");
        sbLIZ.append(EnumC869810YAh.COLUMN_MSG_UUID.getKey());
        sbLIZ.append(",\n                    ");
        sbLIZ.append(EnumC869810YAh.COLUMN_CONV_ID.getKey());
        sbLIZ.append(",\n                    ");
        sbLIZ.append(EnumC869810YAh.COLUMN_REGION_ID.getKey());
        sbLIZ.append("\n                 )\n                 VALUES (?, ?, ?)\n            ");
        InterfaceC869960YAw interfaceC869960YAwLIZ = this.LIZJ.getProxy().LIZ(C09AZ.LIZJ(C2188811AlT.LIZIZ(sbLIZ)));
        boolean z = false;
        if (interfaceC869960YAwLIZ == null) {
            return false;
        }
        try {
            try {
                interfaceC869960YAwLIZ.LJIILIIL(1, str);
                interfaceC869960YAwLIZ.LJIILIIL(2, str2);
                interfaceC869960YAwLIZ.LJIJ(3, j);
                if (interfaceC869960YAwLIZ.LJIL() > 0) {
                    z = true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIIZZ("DefaultIMMsgMetadataDao", "updateRegionId, failed", e);
                this.LIZIZ.LJIIZILJ().LJFF().getEventTracker().LJ(e);
            }
            interfaceC869960YAwLIZ.close();
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            interfaceC869960YAwLIZ.close();
            throw th;
        }
    }
}
