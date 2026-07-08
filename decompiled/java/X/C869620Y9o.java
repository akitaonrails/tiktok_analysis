package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Y9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869620Y9o implements InterfaceC870590YDh {
    public static final /* synthetic */ int LLILZ = 0;
    public final C0YEM LL;
    public final InterfaceC864790XwD LLILLJJLI;
    public final C0Y5R LLILLL;

    public C869620Y9o(C0YEM c0yem) {
        this.LL = c0yem;
        this.LLILLJJLI = c0yem.LJIIZILJ();
        this.LLILLL = c0yem.LJIIZILJ().LIZIZ();
    }

    public final List<Pair<String, String>> LIZJ(String str) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        arrayList = null;
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select * from message_kv where ");
            sbLIZ.append(EnumC869730Y9z.COLUMN_KEY.getKey());
            sbLIZ.append("=?");
            interfaceC869470Y8zLJIIJJI = this.LLILLL.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMsgKv", new String[]{str});
            try {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToNext()) {
                        arrayList2.add(new Pair(interfaceC869470Y8zLJIIJJI.getString(interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869730Y9z.COLUMN_MSG_ID.getKey())), interfaceC869470Y8zLJIIJJI.getString(interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869730Y9z.COLUMN_VALUE.getKey()))));
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList = arrayList2;
                    }
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    this.LL.LIZLLL().LJIIIZ("IMMsgKvDao: getAllByKey", e);
                    this.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                }
            } catch (Throwable th) {
                th = th;
                interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        this.LLILLL.LIZ().LIZ(interfaceC869470Y8z);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
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
                this.LLILLL.LIZ().LIZ(interfaceC869470Y8z);
                throw th;
            }
        }
        this.LLILLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
        return arrayList;
    }

    @Override // X.InterfaceC870590YDh
    public final boolean LJJZZI(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty("a:group_important_type")) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(EnumC869730Y9z.COLUMN_CONVERSATION_ID.getKey());
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869730Y9z.COLUMN_KEY.getKey());
                sbLIZ.append("=?");
                boolean zLIZIZ = this.LLILLL.getProxy().LIZIZ("message_kv", C2188811AlT.LIZIZ(sbLIZ), new String[]{str, "a:group_important_type"});
                if (!zLIZIZ) {
                    C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("deleteByConversationIdAndKey failed for conversationId: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", key: ");
                    sbLIZ2.append("a:group_important_type");
                    c868780Y6iLIZLLL.LJIIIIZZ("IMMsgKvDao: deleteByConversationIdAndKey", C2188811AlT.LIZIZ(sbLIZ2), null);
                    return zLIZIZ;
                }
                C868780Y6i c868780Y6iLIZLLL2 = this.LL.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("deleteByConversationIdAndKey success for conversationId: ");
                sbLIZ3.append(str);
                sbLIZ3.append(", key: ");
                sbLIZ3.append("a:group_important_type");
                C868780Y6i.LJ(c868780Y6iLIZLLL2, "IMMsgKvDao: deleteByConversationIdAndKey", C2188811AlT.LIZIZ(sbLIZ3), 4);
                return zLIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL3 = this.LL.LIZLLL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("deleteByConversationIdAndKey exception for conversationId: ");
                sbLIZ4.append(str);
                sbLIZ4.append(", key: ");
                sbLIZ4.append("a:group_important_type");
                c868780Y6iLIZLLL3.LJIIIIZZ("IMMsgKvDao: deleteByConversationIdAndKey", C2188811AlT.LIZIZ(sbLIZ4), e);
                this.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                return false;
            }
        }
        C868780Y6i c868780Y6iLIZLLL4 = this.LL.LIZLLL();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("deleteByConversationIdAndKey invalid conversationId: ");
        sbLIZ5.append(str);
        sbLIZ5.append(", key: ");
        sbLIZ5.append("a:group_important_type");
        c868780Y6iLIZLLL4.LJIIIIZZ("IMMsgKvDao: deleteByConversationIdAndKey", C2188811AlT.LIZIZ(sbLIZ5), null);
        return false;
    }

    @Override // X.InterfaceC870590YDh
    public final List LLILZ(String str) {
        if (!TextUtils.isEmpty("a:group_important_type") && !TextUtils.isEmpty(str)) {
            ArrayList arrayList = new ArrayList();
            InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
            try {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SELECT ");
                    EnumC869730Y9z enumC869730Y9z = EnumC869730Y9z.COLUMN_MSG_ID;
                    sbLIZ.append(enumC869730Y9z.getKey());
                    sbLIZ.append(" FROM message_kv WHERE ");
                    sbLIZ.append(EnumC869730Y9z.COLUMN_KEY.getKey());
                    sbLIZ.append("=?  AND ");
                    sbLIZ.append(EnumC869730Y9z.COLUMN_CONVERSATION_ID.getKey());
                    sbLIZ.append("=?  AND ((");
                    EnumC869730Y9z enumC869730Y9z2 = EnumC869730Y9z.COLUMN_VALUE;
                    sbLIZ.append(enumC869730Y9z2.getKey());
                    sbLIZ.append(" IS NOT NULL AND ");
                    sbLIZ.append(enumC869730Y9z2.getKey());
                    sbLIZ.append(" != '') OR ");
                    sbLIZ.append(EnumC869730Y9z.COLUMN_NUM_VALUE.getKey());
                    sbLIZ.append(" IS NOT NULL)");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getUuidListByKeyAndConversationId sql: ");
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(", key: ");
                    sbLIZ2.append("a:group_important_type");
                    sbLIZ2.append(", conversationId: ");
                    sbLIZ2.append(str);
                    C868780Y6i.LJ(c868780Y6iLIZLLL, "IMMsgKvDao: getUuidListByKeyAndConversationId", C2188811AlT.LIZIZ(sbLIZ2), 4);
                    interfaceC869470Y8zLJIIJJI = this.LLILLL.getProxy().LJIIJJI(strLIZIZ, "getUuidListByKeyAndConversationId", new String[]{"a:group_important_type", str});
                    if (interfaceC869470Y8zLJIIJJI != null) {
                        int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(enumC869730Y9z.getKey());
                        while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                            String string = interfaceC869470Y8zLJIIJJI.getString(columnIndex);
                            if (!TextUtils.isEmpty(string) && !arrayList.contains(string)) {
                                arrayList.add(string);
                            }
                        }
                    }
                    C868780Y6i.LJ(this.LL.LIZLLL(), "IMMsgKvDao: getUuidListByKeyAndConversationId", "getUuidListByKeyAndConversationId success, uuidList size: " + arrayList.size() + " for key: a:group_important_type, conversationId: " + str, 4);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LL.LIZLLL().LJIIIZ("IMMsgKvDao getUuidListByKeyAndConversationId", e);
                    this.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                }
                this.LLILLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return arrayList;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLILLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                throw th;
            }
        }
        return new ArrayList();
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00a5: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777381), block:B:23:0x00a5 */
    @Override // X.InterfaceC870590YDh
    public final byte[] LLJ(String str) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8z;
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z2 = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                if (!TextUtils.isEmpty("im_streaming_data")) {
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("select ");
                        EnumC869730Y9z enumC869730Y9z = EnumC869730Y9z.COLUMN_BINARY_VALUE;
                        sbLIZ.append(enumC869730Y9z.getKey());
                        sbLIZ.append(" from message_kv where ");
                        sbLIZ.append(EnumC869730Y9z.COLUMN_MSG_ID.getKey());
                        sbLIZ.append("=? AND ");
                        sbLIZ.append(EnumC869730Y9z.COLUMN_KEY.getKey());
                        sbLIZ.append("=?");
                        interfaceC869470Y8zLJIIJJI = this.LLILLL.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMsgKvBinary", new String[]{str, "im_streaming_data"});
                        if (interfaceC869470Y8zLJIIJJI != null) {
                            try {
                                if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                                    byte[] blob = interfaceC869470Y8zLJIIJJI.getBlob(interfaceC869470Y8zLJIIJJI.getColumnIndex(enumC869730Y9z.getKey()));
                                    this.LLILLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                    return blob;
                                }
                            } catch (Exception e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                                this.LL.LIZLLL().LJIIIZ("IMMsgKvDao: getBinaryValue", e);
                                this.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        interfaceC869470Y8zLJIIJJI = null;
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                this.LLILLL.LIZ().LIZ(interfaceC869470Y8z2);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    this.LLILLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC869470Y8z2 = interfaceC869470Y8z;
            }
        }
        return null;
    }

    @Override // X.InterfaceC870590YDh
    public final String LJFF(String str, String str2) {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select value from message_kv where ");
            sbLIZ.append(EnumC869730Y9z.COLUMN_MSG_ID.getKey());
            sbLIZ.append("=? AND ");
            sbLIZ.append(EnumC869730Y9z.COLUMN_KEY.getKey());
            sbLIZ.append("=?");
            interfaceC869470Y8zLJIIJJI = this.LLILLL.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMsgKv", new String[]{str, str2});
            if (interfaceC869470Y8zLJIIJJI != null) {
                try {
                    try {
                        if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                            String string = interfaceC869470Y8zLJIIJJI.getString(interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869730Y9z.COLUMN_VALUE.getKey()));
                            this.LLILLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            return string;
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LL.LIZLLL().LJIIIZ("IMMsgKvDao: get", e);
                        this.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                    }
                } catch (Throwable th) {
                    th = th;
                    interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            this.LLILLL.LIZ().LIZ(interfaceC869470Y8z);
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
                this.LLILLL.LIZ().LIZ(interfaceC869470Y8z);
                throw th;
            }
        }
        this.LLILLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
        return null;
    }

    @Override // X.InterfaceC870590YDh
    public final boolean LLJJIJI(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(EnumC869730Y9z.COLUMN_MSG_ID.getKey());
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869730Y9z.COLUMN_KEY.getKey());
                sbLIZ.append("=?");
                boolean zLIZIZ = this.LLILLL.getProxy().LIZIZ("message_kv", C2188811AlT.LIZIZ(sbLIZ), new String[]{str, str2});
                if (!zLIZIZ) {
                    C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("IMMsgKvDao: delete failed:");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(str2);
                    c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), null);
                }
                return zLIZIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL2 = this.LL.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("delete exception, uuid:");
                sbLIZ3.append(str);
                sbLIZ3.append(", key:");
                sbLIZ3.append(str2);
                c868780Y6iLIZLLL2.LJIIIIZZ("IMMsgKvDao: delete", C2188811AlT.LIZIZ(sbLIZ3), e);
                this.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                return false;
            }
        }
        C868780Y6i c868780Y6iLIZLLL3 = this.LL.LIZLLL();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("delete invalid:");
        sbLIZ4.append(str);
        sbLIZ4.append(", ");
        sbLIZ4.append(str2);
        c868780Y6iLIZLLL3.LJIIIIZZ("IMMsgKvDao", C2188811AlT.LIZIZ(sbLIZ4), null);
        return false;
    }

    public final void LIZ(String str, String str2, Map map) {
        boolean z;
        boolean zLIZIZ;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !map.isEmpty()) {
            List<? extends Map.Entry<String, String>> listLLIIII = C13LP.LLIIII(map.entrySet());
            C870430YCr proxy = this.LLILLL.getProxy();
            boolean zLJIIIZ = proxy.LJIIIZ();
            if (!zLJIIIZ) {
                proxy.LJIILIIL("batchInsertOrUpdate");
            }
            if (!zLJIIIZ && proxy.LJIIIZ()) {
                z = true;
            } else {
                z = false;
            }
            try {
                try {
                    zLIZIZ = LIZIZ(str, str2, listLLIIII);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LL.LIZLLL().LJIIIZ("IMMsgKvDao: batchInsertOrUpdate failed", e);
                    this.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                    zLIZIZ = false;
                }
                if (z) {
                    proxy.LIZJ("batchInsertOrUpdate", zLIZIZ);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                if (z) {
                    proxy.LIZJ("batchInsertOrUpdate", false);
                }
                throw e2;
            }
        }
    }

    public final boolean LIZIZ(String str, String str2, List<? extends Map.Entry<String, String>> list) throws Throwable {
        InterfaceC869960YAw interfaceC869960YAwLIZ;
        InterfaceC869960YAw interfaceC869960YAw;
        int i;
        int i2;
        long jLJIL;
        int i3 = 1;
        if (list.isEmpty()) {
            return true;
        }
        InterfaceC869960YAw interfaceC869960YAw2 = null;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UPDATE message_kv SET ");
            sbLIZ.append(EnumC869730Y9z.COLUMN_VALUE.getKey());
            sbLIZ.append("=?, ");
            sbLIZ.append(EnumC869730Y9z.COLUMN_NUM_VALUE.getKey());
            sbLIZ.append("=NULL, ");
            sbLIZ.append(EnumC869730Y9z.COLUMN_CONVERSATION_ID.getKey());
            sbLIZ.append("=? WHERE ");
            sbLIZ.append(EnumC869730Y9z.COLUMN_MSG_ID.getKey());
            sbLIZ.append("=? AND ");
            sbLIZ.append(EnumC869730Y9z.COLUMN_KEY.getKey());
            sbLIZ.append("=?");
            interfaceC869960YAwLIZ = this.LLILLL.getProxy().LIZ(C2188811AlT.LIZIZ(sbLIZ));
            try {
                try {
                    if (interfaceC869960YAwLIZ == null) {
                        this.LL.LIZLLL().LJIIIZ("IMMsgKvDao: batchInsertOrUpdateTextEntries failed to compile update statement", null);
                        this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                        this.LLILLL.LIZ().getClass();
                        return false;
                    }
                    ArrayList<Map.Entry> arrayList = new ArrayList();
                    Iterator<? extends Map.Entry<String, String>> it2 = list.iterator();
                    boolean z = true;
                    while (true) {
                        i = 4;
                        i2 = 2;
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry<String, String> next = it2.next();
                        try {
                            interfaceC869960YAwLIZ.LJJIIZ();
                            interfaceC869960YAwLIZ.LJIILIIL(1, next.getValue());
                            interfaceC869960YAwLIZ.LJIILIIL(2, str2);
                            interfaceC869960YAwLIZ.LJIILIIL(3, str);
                            interfaceC869960YAwLIZ.LJIILIIL(4, next.getKey());
                            if (interfaceC869960YAwLIZ.LJIIL() == 0) {
                                arrayList.add(next);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("IMMsgKvDao: batchInsertOrUpdateTextEntries update failed for key: ");
                            sbLIZ2.append(next.getKey());
                            c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), e);
                            z = false;
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("INSERT INTO message_kv (");
                        sbLIZ3.append(EnumC869730Y9z.COLUMN_MSG_ID.getKey());
                        sbLIZ3.append(", ");
                        sbLIZ3.append(EnumC869730Y9z.COLUMN_KEY.getKey());
                        sbLIZ3.append(", ");
                        sbLIZ3.append(EnumC869730Y9z.COLUMN_VALUE.getKey());
                        sbLIZ3.append(", ");
                        sbLIZ3.append(EnumC869730Y9z.COLUMN_CONVERSATION_ID.getKey());
                        sbLIZ3.append(") VALUES (?, ?, ?, ?)");
                        InterfaceC869960YAw interfaceC869960YAwLIZ2 = this.LLILLL.getProxy().LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                        try {
                            try {
                                if (interfaceC869960YAwLIZ2 == null) {
                                    try {
                                        this.LL.LIZLLL().LJIIIZ("IMMsgKvDao: batchInsertOrUpdateTextEntries failed to compile insert statement", null);
                                        this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                                        this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ2);
                                        return false;
                                    } catch (Exception e2) {
                                        e = e2;
                                        interfaceC869960YAw2 = interfaceC869960YAwLIZ2;
                                        interfaceC869960YAw = interfaceC869960YAw2;
                                        interfaceC869960YAw2 = interfaceC869960YAwLIZ;
                                        try {
                                            TryCatchGuardChecker.doCheck(e);
                                            C868780Y6i c868780Y6iLIZLLL2 = this.LL.LIZLLL();
                                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                            sbLIZ4.append("IMMsgKvDao: batchInsertOrUpdateTextEntries exception, entryCount=");
                                            sbLIZ4.append(list.size());
                                            c868780Y6iLIZLLL2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4), e);
                                            this.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                                            this.LLILLL.LIZ().LIZIZ(interfaceC869960YAw2);
                                            this.LLILLL.LIZ().LIZIZ(interfaceC869960YAw);
                                            return false;
                                        } catch (Throwable th) {
                                            th = th;
                                            interfaceC869960YAwLIZ = interfaceC869960YAw2;
                                            interfaceC869960YAw2 = interfaceC869960YAw;
                                            while (true) {
                                                try {
                                                    TryCatchGuardChecker.doCheck(th);
                                                    this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                                                    this.LLILLL.LIZ().LIZIZ(interfaceC869960YAw2);
                                                    throw th;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    for (Map.Entry entry : arrayList) {
                                        try {
                                            interfaceC869960YAwLIZ2.LJJIIZ();
                                            interfaceC869960YAwLIZ2.LJIILIIL(i3, str);
                                            interfaceC869960YAwLIZ2.LJIILIIL(i2, (String) entry.getKey());
                                            interfaceC869960YAwLIZ2.LJIILIIL(3, (String) entry.getValue());
                                            interfaceC869960YAwLIZ2.LJIILIIL(i, str2);
                                            jLJIL = interfaceC869960YAwLIZ2.LJIL();
                                        } catch (Exception e3) {
                                            TryCatchGuardChecker.doCheck(e3);
                                            C868780Y6i c868780Y6iLIZLLL3 = this.LL.LIZLLL();
                                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                            sbLIZ5.append("IMMsgKvDao: batchInsertOrUpdateTextEntries insert failed for key: ");
                                            sbLIZ5.append((String) entry.getKey());
                                            c868780Y6iLIZLLL3.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ5), e3);
                                        }
                                        if (jLJIL < 0) {
                                            C868780Y6i c868780Y6iLIZLLL4 = this.LL.LIZLLL();
                                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                            sbLIZ6.append("IMMsgKvDao: batchInsertOrUpdateTextEntries insert failed for key: ");
                                            sbLIZ6.append((String) entry.getKey());
                                            sbLIZ6.append(", result: ");
                                            sbLIZ6.append(jLJIL);
                                            c868780Y6iLIZLLL4.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ6), null);
                                            z = false;
                                            i3 = 1;
                                            i = 4;
                                            i2 = 2;
                                        } else {
                                            i = 4;
                                            i2 = 2;
                                        }
                                    }
                                    interfaceC869960YAw2 = interfaceC869960YAwLIZ2;
                                }
                            } catch (Exception e4) {
                                e = e4;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            interfaceC869960YAw2 = interfaceC869960YAwLIZ2;
                            while (true) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                                this.LLILLL.LIZ().LIZIZ(interfaceC869960YAw2);
                                throw th;
                            }
                        }
                    }
                    this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                    this.LLILLL.LIZ().LIZIZ(interfaceC869960YAw2);
                    return z;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Exception e6) {
            e = e6;
            interfaceC869960YAw = null;
        } catch (Throwable th5) {
            th = th5;
            interfaceC869960YAwLIZ = null;
        }
    }

    @Override // X.InterfaceC870590YDh
    public final boolean LJJLIIIIJ(String str, String str2, byte[] bArr) throws Throwable {
        InterfaceC869960YAw interfaceC869960YAwLIZ;
        boolean z;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty("im_streaming_data")) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UPDATE message_kv SET ");
                EnumC869730Y9z enumC869730Y9z = EnumC869730Y9z.COLUMN_BINARY_VALUE;
                sbLIZ.append(enumC869730Y9z.getKey());
                sbLIZ.append("=?, ");
                EnumC869730Y9z enumC869730Y9z2 = EnumC869730Y9z.COLUMN_CONVERSATION_ID;
                sbLIZ.append(enumC869730Y9z2.getKey());
                sbLIZ.append("=? WHERE ");
                EnumC869730Y9z enumC869730Y9z3 = EnumC869730Y9z.COLUMN_MSG_ID;
                sbLIZ.append(enumC869730Y9z3.getKey());
                sbLIZ.append("=? AND ");
                EnumC869730Y9z enumC869730Y9z4 = EnumC869730Y9z.COLUMN_KEY;
                sbLIZ.append(enumC869730Y9z4.getKey());
                sbLIZ.append("=?");
                interfaceC869960YAwLIZ = this.LLILLL.getProxy().LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (interfaceC869960YAwLIZ != null) {
                    try {
                        interfaceC869960YAwLIZ.LJJIIJZLJL(1, bArr);
                        interfaceC869960YAwLIZ.LJIILIIL(2, str2);
                        interfaceC869960YAwLIZ.LJIILIIL(3, str);
                        interfaceC869960YAwLIZ.LJIILIIL(4, "im_streaming_data");
                        if (interfaceC869960YAwLIZ.LJIIL() > 0) {
                            this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                            return true;
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            TryCatchGuardChecker.doCheck(e);
                            C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("IMMsgKvDao: insertOrUpdateBinaryValue exception, uuid:");
                            sbLIZ2.append(str);
                            sbLIZ2.append(", key:");
                            sbLIZ2.append("im_streaming_data");
                            c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), e);
                            this.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                            this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            TryCatchGuardChecker.doCheck(th);
                            this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                            throw th;
                        }
                    }
                }
                this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("INSERT INTO message_kv (");
                sbLIZ3.append(enumC869730Y9z3.getKey());
                sbLIZ3.append(", ");
                sbLIZ3.append(enumC869730Y9z4.getKey());
                sbLIZ3.append(", ");
                sbLIZ3.append(enumC869730Y9z.getKey());
                sbLIZ3.append(", ");
                sbLIZ3.append(enumC869730Y9z2.getKey());
                sbLIZ3.append(") VALUES (?, ?, ?, ?)");
                interfaceC869960YAwLIZ = this.LLILLL.getProxy().LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                try {
                    if (interfaceC869960YAwLIZ == null) {
                        this.LL.LIZLLL().LJIIIZ("IMMsgKvDao: insertOrUpdateBinaryValue failed to compile insert statement", null);
                        this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                        return false;
                    }
                    interfaceC869960YAwLIZ.LJIILIIL(1, str);
                    interfaceC869960YAwLIZ.LJIILIIL(2, "im_streaming_data");
                    interfaceC869960YAwLIZ.LJJIIJZLJL(3, bArr);
                    interfaceC869960YAwLIZ.LJIILIIL(4, str2);
                    long jLJIL = interfaceC869960YAwLIZ.LJIL();
                    if (jLJIL < 0) {
                        C868780Y6i c868780Y6iLIZLLL2 = this.LL.LIZLLL();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("IMMsgKvDao: insertOrUpdateBinaryValue insert failed, uuid:");
                        sbLIZ4.append(str);
                        sbLIZ4.append(", key:");
                        sbLIZ4.append("im_streaming_data");
                        sbLIZ4.append(", result:");
                        sbLIZ4.append(jLJIL);
                        c868780Y6iLIZLLL2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4), null);
                        z = false;
                    } else {
                        z = true;
                    }
                    this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                    return z;
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    C868780Y6i c868780Y6iLIZLLL3 = this.LL.LIZLLL();
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append("IMMsgKvDao: insertOrUpdateBinaryValue exception, uuid:");
                    sbLIZ22.append(str);
                    sbLIZ22.append(", key:");
                    sbLIZ22.append("im_streaming_data");
                    c868780Y6iLIZLLL3.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ22), e);
                    this.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                    this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                    return false;
                } catch (Throwable th4) {
                    th = th4;
                    while (true) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                interfaceC869960YAwLIZ = null;
            } catch (Throwable th5) {
                th = th5;
                interfaceC869960YAwLIZ = null;
            }
        } else {
            C868780Y6i c868780Y6iLIZLLL4 = this.LL.LIZLLL();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("IMMsgKvDao: insertOrUpdateBinaryValue params invalid, uuid:");
            sbLIZ5.append(str);
            sbLIZ5.append(", conversationId:");
            sbLIZ5.append(str2);
            sbLIZ5.append(", key:");
            sbLIZ5.append("im_streaming_data");
            c868780Y6iLIZLLL4.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ5), null);
            return false;
        }
    }

    @Override // X.InterfaceC870590YDh
    public final boolean LLII(String str, String str2, String str3, String str4) {
        InterfaceC869960YAw interfaceC869960YAwLIZ;
        boolean z;
        if (TextUtils.isEmpty(str4)) {
            return LLJJIJI(str, str3);
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UPDATE message_kv SET ");
                EnumC869730Y9z enumC869730Y9z = EnumC869730Y9z.COLUMN_VALUE;
                sbLIZ.append(enumC869730Y9z.getKey());
                sbLIZ.append("=?, ");
                sbLIZ.append(EnumC869730Y9z.COLUMN_NUM_VALUE.getKey());
                sbLIZ.append("=NULL, ");
                EnumC869730Y9z enumC869730Y9z2 = EnumC869730Y9z.COLUMN_CONVERSATION_ID;
                sbLIZ.append(enumC869730Y9z2.getKey());
                sbLIZ.append("=? WHERE ");
                EnumC869730Y9z enumC869730Y9z3 = EnumC869730Y9z.COLUMN_MSG_ID;
                sbLIZ.append(enumC869730Y9z3.getKey());
                sbLIZ.append("=? AND ");
                EnumC869730Y9z enumC869730Y9z4 = EnumC869730Y9z.COLUMN_KEY;
                sbLIZ.append(enumC869730Y9z4.getKey());
                sbLIZ.append("=?");
                interfaceC869960YAwLIZ = this.LLILLL.getProxy().LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (interfaceC869960YAwLIZ != null) {
                    try {
                        interfaceC869960YAwLIZ.LJIILIIL(1, str4);
                        interfaceC869960YAwLIZ.LJIILIIL(2, str2);
                        interfaceC869960YAwLIZ.LJIILIIL(3, str);
                        interfaceC869960YAwLIZ.LJIILIIL(4, str3);
                        if (interfaceC869960YAwLIZ.LJIIL() > 0) {
                            this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                            return true;
                        }
                    } catch (Exception e) {
                        e = e;
                        try {
                            TryCatchGuardChecker.doCheck(e);
                            C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("IMMsgKvDao: insertOrUpdate exception, uuid:");
                            sbLIZ2.append(str);
                            sbLIZ2.append(", key:");
                            sbLIZ2.append(str3);
                            c868780Y6iLIZLLL.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), e);
                            this.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                            this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            TryCatchGuardChecker.doCheck(th);
                            this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                            throw th;
                        }
                    }
                }
                this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("INSERT INTO message_kv (");
                sbLIZ3.append(enumC869730Y9z3.getKey());
                sbLIZ3.append(", ");
                sbLIZ3.append(enumC869730Y9z4.getKey());
                sbLIZ3.append(", ");
                sbLIZ3.append(enumC869730Y9z.getKey());
                sbLIZ3.append(", ");
                sbLIZ3.append(enumC869730Y9z2.getKey());
                sbLIZ3.append(") VALUES (?, ?, ?, ?)");
                interfaceC869960YAwLIZ = this.LLILLL.getProxy().LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                try {
                    if (interfaceC869960YAwLIZ == null) {
                        this.LL.LIZLLL().LJIIIZ("IMMsgKvDao: insertOrUpdate failed to compile insert statement", null);
                        this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                        return false;
                    }
                    interfaceC869960YAwLIZ.LJIILIIL(1, str);
                    interfaceC869960YAwLIZ.LJIILIIL(2, str3);
                    interfaceC869960YAwLIZ.LJIILIIL(3, str4);
                    interfaceC869960YAwLIZ.LJIILIIL(4, str2);
                    long jLJIL = interfaceC869960YAwLIZ.LJIL();
                    if (jLJIL < 0) {
                        C868780Y6i c868780Y6iLIZLLL2 = this.LL.LIZLLL();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("IMMsgKvDao: insertOrUpdate insert failed, uuid:");
                        sbLIZ4.append(str);
                        sbLIZ4.append(", key:");
                        sbLIZ4.append(str3);
                        sbLIZ4.append(", result:");
                        sbLIZ4.append(jLJIL);
                        c868780Y6iLIZLLL2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ4), null);
                        z = false;
                    } else {
                        z = true;
                    }
                    this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                    return z;
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    C868780Y6i c868780Y6iLIZLLL3 = this.LL.LIZLLL();
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append("IMMsgKvDao: insertOrUpdate exception, uuid:");
                    sbLIZ22.append(str);
                    sbLIZ22.append(", key:");
                    sbLIZ22.append(str3);
                    c868780Y6iLIZLLL3.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ22), e);
                    this.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                    this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                    return false;
                } catch (Throwable th4) {
                    th = th4;
                    while (true) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LLILLL.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                        throw th;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                interfaceC869960YAwLIZ = null;
            } catch (Throwable th5) {
                th = th5;
                interfaceC869960YAwLIZ = null;
            }
        } else {
            C868780Y6i c868780Y6iLIZLLL4 = this.LL.LIZLLL();
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("IMMsgKvDao: insertOrUpdate params invalid, uuid:");
            sbLIZ5.append(str);
            sbLIZ5.append(", conversationId:");
            sbLIZ5.append(str2);
            sbLIZ5.append(", key:");
            sbLIZ5.append(str3);
            c868780Y6iLIZLLL4.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ5), null);
            return false;
        }
    }
}
