package X;

import android.content.ContentValues;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS64S1000000_13;

/* JADX INFO: renamed from: X.0YAV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAV implements InterfaceC865750Xxl {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final C0YEM LL;

    public final InterfaceC864790XwD LJ() {
        return this.LL.LJIIZILJ();
    }

    public final C0Y5R LIZLLL() {
        return LJ().LIZIZ();
    }

    public C0YAV(C0YEM c0yem) {
        this.LL = c0yem;
    }

    public final boolean LIZIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.LL.LIZLLL().LJIIIIZZ("IMConversationKvDao", "delete invalid: convId is empty", null);
            return false;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C0YAW.COLUMN_CONV_ID.getKey());
            sbLIZ.append("=?");
            boolean zLIZIZ = LIZLLL().getProxy().LIZIZ("conversation_kv", C2188811AlT.LIZIZ(sbLIZ), new String[]{str});
            if (!zLIZIZ) {
                C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("delete failed:");
                sbLIZ2.append(str);
                c868780Y6iLIZLLL.LJIIIIZZ("IMConversationKvDao", C2188811AlT.LIZIZ(sbLIZ2), null);
            }
            return zLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.LIZLLL().LJIIIZ("IMConversationKvDao", e);
            LJ().LJFF().getEventTracker().LJ(e);
            return false;
        }
    }

    public final boolean LIZJ(String[] strArr) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C0YAW.COLUMN_CONV_ID.getKey());
            sbLIZ.append("=?");
            boolean zLIZIZ = LIZLLL().getProxy().LIZIZ("conversation_kv", C2188811AlT.LIZIZ(sbLIZ), strArr);
            if (!zLIZIZ) {
                C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("delete failed:");
                sbLIZ2.append(strArr);
                c868780Y6iLIZLLL.LJIIIIZZ("IMConversationKvDao", C2188811AlT.LIZIZ(sbLIZ2), null);
                return zLIZIZ;
            }
            return zLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.LIZLLL().LJIIIZ("IMConversationKvDao", e);
            LJ().LJFF().getEventTracker().LJ(e);
            return false;
        }
    }

    @Override // X.InterfaceC865750Xxl
    public final boolean LLJL(Map<String, ? extends Map<String, String>> map) {
        if (map.isEmpty()) {
            return false;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                String str = (String) entry.getKey();
                Map map2 = (Map) entry.getValue();
                ArrayList arrayList2 = new ArrayList(map2.size());
                for (Map.Entry entry2 : map2.entrySet()) {
                    arrayList2.add(new C443120HZe(str, (String) entry2.getKey(), (String) entry2.getValue()));
                }
                C19719612Di.LJJI(arrayList2, arrayList);
            }
            boolean z = true;
            if (arrayList.isEmpty()) {
                return true;
            }
            for (List list : C13LP.LJJJIL(arrayList, 500)) {
                String strLJJJ = C13LQ.LJJJ(C0YAW.values(), null, null, null, AFwS248S0000000_14.get$arr$(413), 31);
                String strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, AFwS247S0000000_13.get$arr$(43), 31);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("insert or replace into conversation_kv (");
                sbLIZ.append(strLJJJ);
                sbLIZ.append(") values ");
                sbLIZ.append(strLJJLIIIJ);
                sbLIZ.append(';');
                if (!LIZLLL().getProxy().LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "batchUpdateMultiple")) {
                    z = false;
                }
            }
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL.LIZLLL().LJIIIIZZ("IMConversationKvDao", "batchUpdateMultiple", e);
            LJ().LJFF().getEventTracker().LIZLLL("IMConversationKvDao batchUpdateMultiple", e);
            return false;
        }
    }

    public final boolean LIZ(String str, String str2) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && str2 != null && str2.length() != 0) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delete from conversation_kv where ");
                sbLIZ.append(C0YAW.COLUMN_CONV_ID.getKey());
                sbLIZ.append("=\"");
                sbLIZ.append(str);
                sbLIZ.append("\" AND ");
                sbLIZ.append(C0YAW.COLUMN_KEY.getKey());
                sbLIZ.append("=\"");
                sbLIZ.append(str2);
                sbLIZ.append('\"');
                boolean zLIZLLL = LIZLLL().getProxy().LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "deleteMsgKv");
                if (!zLIZLLL) {
                    C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("delete failed:");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(str2);
                    c868780Y6iLIZLLL.LJIIIIZZ("IMConversationKvDao", C2188811AlT.LIZIZ(sbLIZ2), null);
                }
                return zLIZLLL;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LL.LIZLLL().LJIIIZ("IMConversationKvDao", e);
                LJ().LJFF().getEventTracker().LJ(e);
                return false;
            }
        }
        C868780Y6i c868780Y6iLIZLLL2 = this.LL.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("delete invalid:");
        sbLIZ3.append(str);
        sbLIZ3.append(", ");
        sbLIZ3.append(str2);
        c868780Y6iLIZLLL2.LJIIIIZZ("IMConversationKvDao", C2188811AlT.LIZIZ(sbLIZ3), null);
        return false;
    }

    @Override // X.InterfaceC865750Xxl
    public final String LJFF(String str, String str2) {
        boolean z;
        boolean z2;
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        if (!z) {
            if (str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("select value from conversation_kv where ");
                    sbLIZ.append(C0YAW.COLUMN_CONV_ID.getKey());
                    sbLIZ.append("=? AND ");
                    sbLIZ.append(C0YAW.COLUMN_KEY.getKey());
                    sbLIZ.append("=?");
                    interfaceC869470Y8zLJIIJJI = LIZLLL().getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getConversationKv", new String[]{str, str2});
                    if (interfaceC869470Y8zLJIIJJI != null) {
                        try {
                            try {
                                if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                                    String string = interfaceC869470Y8zLJIIJJI.getString(interfaceC869470Y8zLJIIJJI.getColumnIndex(C0YAW.COLUMN_VALUE.getKey()));
                                    LIZLLL().LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                    return string;
                                }
                            } catch (Exception e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                                this.LL.LIZLLL().LJIIIIZZ("IMConversationKvDao", "get", e);
                                LJ().LJFF().getEventTracker().LIZLLL("IMConversationKvDao get", e);
                            }
                        } catch (Throwable th) {
                            th = th;
                            interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    LIZLLL().LIZ().LIZ(interfaceC869470Y8z);
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    interfaceC869470Y8zLJIIJJI = null;
                } catch (Throwable th3) {
                    th = th3;
                    while (true) {
                        TryCatchGuardChecker.doCheck(th);
                        LIZLLL().LIZ().LIZ(interfaceC869470Y8z);
                        throw th;
                    }
                }
                LIZLLL().LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // X.InterfaceC865750Xxl
    public final Map<String, Map<String, String>> LLIL(List<String> list, List<String> list2) throws Throwable {
        C0Y5R c0y5rLIZLLL;
        List<String> list3 = list;
        if (!list3.isEmpty() && !list2.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C0YAV c0yav = list3;
            for (List list4 : C13LP.LJJJIL(list3, Math.max(1, 500 - list2.size()))) {
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
                try {
                    try {
                        c0yav = this;
                        String strLJJLIIIJ = C13LP.LJJLIIIJ(list4, ",", null, null, 0, null, AFwS248S0000000_14.get$arr$(411), 30);
                        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(list2, ",", null, null, 0, null, AFwS248S0000000_14.get$arr$(412), 30);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SELECT ");
                        C0YAW c0yaw = C0YAW.COLUMN_CONV_ID;
                        sbLIZ.append(c0yaw.getKey());
                        sbLIZ.append(", ");
                        C0YAW c0yaw2 = C0YAW.COLUMN_KEY;
                        sbLIZ.append(c0yaw2.getKey());
                        sbLIZ.append(", ");
                        sbLIZ.append(C0YAW.COLUMN_VALUE.getKey());
                        sbLIZ.append(" FROM conversation_kv WHERE ");
                        sbLIZ.append(c0yaw.getKey());
                        sbLIZ.append(" IN (");
                        sbLIZ.append(strLJJLIIIJ);
                        sbLIZ.append(") AND ");
                        sbLIZ.append(c0yaw2.getKey());
                        sbLIZ.append(" IN (");
                        sbLIZ.append(strLJJLIIIJ2);
                        sbLIZ.append(')');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        String[] strArr = new String[list4.size() + list2.size()];
                        int i = 0;
                        int i2 = 0;
                        for (Object obj : list4) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                strArr[i2] = (String) obj;
                                i2 = i3;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        for (String str : list2) {
                            int i4 = i + 1;
                            if (i >= 0) {
                                strArr[list4.size() + i] = str;
                                i = i4;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        interfaceC869470Y8zLJIIJJI = c0yav.LIZLLL().getProxy().LJIIJJI(strLIZIZ, "batchGetConversationKv", strArr);
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                String string = interfaceC869470Y8zLJIIJJI.getString(interfaceC869470Y8zLJIIJJI.getColumnIndex(C0YAW.COLUMN_CONV_ID.getKey()));
                                String string2 = interfaceC869470Y8zLJIIJJI.getString(interfaceC869470Y8zLJIIJJI.getColumnIndex(C0YAW.COLUMN_KEY.getKey()));
                                String string3 = interfaceC869470Y8zLJIIJJI.getString(interfaceC869470Y8zLJIIJJI.getColumnIndex(C0YAW.COLUMN_VALUE.getKey()));
                                if (string != null && string2 != null && string3 != null) {
                                    Object linkedHashMap2 = linkedHashMap.get(string);
                                    if (linkedHashMap2 == null) {
                                        linkedHashMap2 = new LinkedHashMap();
                                        linkedHashMap.put(string, linkedHashMap2);
                                    }
                                    ((Map) linkedHashMap2).put(string2, string3);
                                }
                            }
                        }
                        c0y5rLIZLLL = c0yav.LIZLLL();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        try {
                            c0yav.LL.LIZLLL().LJIIIIZZ("IMConversationKvDao", "batchGet", e);
                            c0yav.LJ().LJFF().getEventTracker().LIZLLL("IMConversationKvDao batchGet", e);
                            c0y5rLIZLLL = c0yav.LIZLLL();
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    c0yav.LIZLLL().LIZ().LIZ(null);
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    c0y5rLIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    c0yav = c0yav;
                } catch (Throwable th3) {
                    th = th3;
                    while (true) {
                        TryCatchGuardChecker.doCheck(th);
                        c0yav.LIZLLL().LIZ().LIZ(null);
                        throw th;
                    }
                }
            }
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC865750Xxl
    public final boolean LLLIIIIL(String str, Map<String, String> map) {
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateKv kvMap = ");
        sbLIZ.append(map);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMConversationKvDao", C2188811AlT.LIZIZ(sbLIZ), 4);
        String strLJJJ = C13LQ.LJJJ(C0YAW.values(), null, null, null, AFwS248S0000000_14.get$arr$(416), 31);
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C2097808Js.LJIL(map), null, null, null, 0, null, new AwS64S1000000_13(str, 2), 31);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("insert or replace into conversation_kv (");
        sbLIZ2.append(strLJJJ);
        sbLIZ2.append(") values ");
        sbLIZ2.append(strLJJLIIIJ);
        sbLIZ2.append(';');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        C868780Y6i c868780Y6iLIZLLL2 = this.LL.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateKv sql = ");
        sbLIZ3.append(strLIZIZ);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "IMConversationKvDao", C2188811AlT.LIZIZ(sbLIZ3), 4);
        try {
            return LIZLLL().getProxy().LIZLLL(strLIZIZ, "batchUpdate");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJ().LJFF().getEventTracker().LJ(e);
            return false;
        }
    }

    @Override // X.InterfaceC865750Xxl
    public final boolean LLFZ(String str, String str2, String str3) {
        boolean z;
        if (str == null || str2 == null) {
            return false;
        }
        if (str3 != null && str3.length() != 0) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && str2.length() != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0YAW.COLUMN_CONV_ID.getKey(), str);
                contentValues.put(C0YAW.COLUMN_KEY.getKey(), str2);
                contentValues.put(C0YAW.COLUMN_VALUE.getKey(), str3);
                long jLJIIL = LIZLLL().getProxy().LJIIL("conversation_kv", contentValues);
                if (jLJIIL < 0) {
                    C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("insertOrUpdate failed, cid:");
                    sbLIZ.append(str);
                    sbLIZ.append(", key:");
                    sbLIZ.append(str2);
                    sbLIZ.append(", value:");
                    sbLIZ.append(str3);
                    sbLIZ.append(", result:");
                    sbLIZ.append(jLJIIL);
                    c868780Y6iLIZLLL.LJIIIIZZ("IMConversationKvDao", C2188811AlT.LIZIZ(sbLIZ), null);
                } else if (jLJIIL > 0) {
                    return true;
                }
                return false;
            }
            C868780Y6i c868780Y6iLIZLLL2 = this.LL.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("insertOrUpdate params invalid, cid:");
            sbLIZ2.append(str);
            sbLIZ2.append(", key:");
            sbLIZ2.append(str2);
            c868780Y6iLIZLLL2.LJIIIIZZ("IMConversationKvDao", C2188811AlT.LIZIZ(sbLIZ2), null);
            return false;
        }
        return LIZ(str, str2);
    }
}
