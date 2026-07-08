package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.UrlStruct;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869660Y9s {
    public final C0YEM LIZ;
    public final InterfaceC864790XwD LIZIZ;
    public final C0Y5R LIZJ;

    public static String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select p.*, m.");
        sbLIZ.append(EnumC869640Y9q.COLUMN_SERVER_ID.key);
        sbLIZ.append(" from ");
        sbLIZ.append("msg_property_new");
        sbLIZ.append(" p left join ");
        sbLIZ.append("msg");
        sbLIZ.append(" m on p.");
        sbLIZ.append(EnumC869700Y9w.COLUMN_MSG_UUID.key);
        sbLIZ.append("=m.");
        sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
        sbLIZ.append(" where p.");
        sbLIZ.append(EnumC869700Y9w.COLUMN_STATUS.key);
        sbLIZ.append(" in (");
        sbLIZ.append(5);
        sbLIZ.append(",");
        sbLIZ.append(3);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC869700Y9w.COLUMN_MSG_UUID.key);
        sbLIZ.append("=? and ");
        sbLIZ.append(EnumC869700Y9w.COLUMN_KEY.key);
        sbLIZ.append("=? and ");
        sbLIZ.append(EnumC869700Y9w.COLUMN_IDEMPOTENT_ID.key);
        sbLIZ.append("=?");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C869660Y9s(C0YEM c0yem) {
        this.LIZ = c0yem;
        this.LIZIZ = c0yem.LJIIZILJ();
        this.LIZJ = c0yem.LJIIZILJ().LIZIZ();
    }

    public static C0YA1 LIZIZ(InterfaceC869470Y8z interfaceC869470Y8z) {
        C0YA1 c0ya1 = new C0YA1();
        c0ya1.msgUuid = interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_MSG_UUID.key));
        c0ya1.conversationId = interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_CONVERSATION_ID.key));
        c0ya1.uid = Long.valueOf(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_SENDER.key)));
        c0ya1.sec_uid = interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_SENDER_SEC.key));
        c0ya1.setCreateTime(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_CREATE_TIME_V2.key)), interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_CREATE_TIME.key)));
        c0ya1.idempotent_id = interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_IDEMPOTENT_ID.key));
        c0ya1.key = interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_KEY.key));
        c0ya1.value = interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_VALUE.key));
        c0ya1.version = interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_VERSION.key));
        c0ya1.status = interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_STATUS.key));
        c0ya1.deleted = interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_DELETED.key));
        c0ya1.setBizExtra(C870740YDw.LIZIZ(interfaceC869470Y8z.getBlob(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_BIZ_EXTRA.key))));
        try {
            c0ya1.url = (UrlStruct) C09EF.LIZ.LJII(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_URL.key)), UrlStruct.class);
            return c0ya1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c0ya1.url = null;
            return c0ya1;
        }
    }

    public static List LIZJ(InterfaceC869470Y8z interfaceC869470Y8z) {
        ArrayList arrayList = new ArrayList();
        if (interfaceC869470Y8z == null) {
            return arrayList;
        }
        int columnIndex = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_MSG_UUID.key);
        int columnIndex2 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_CONVERSATION_ID.key);
        int columnIndex3 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_SENDER.key);
        int columnIndex4 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_SENDER_SEC.key);
        int columnIndex5 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_CREATE_TIME.key);
        int columnIndex6 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_CREATE_TIME_V2.key);
        int columnIndex7 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_IDEMPOTENT_ID.key);
        int columnIndex8 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_KEY.key);
        int columnIndex9 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_VALUE.key);
        int columnIndex10 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_VERSION.key);
        int columnIndex11 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_STATUS.key);
        int columnIndex12 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_DELETED.key);
        int columnIndex13 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_URL.key);
        int columnIndex14 = interfaceC869470Y8z.getColumnIndex(EnumC869700Y9w.COLUMN_BIZ_EXTRA.key);
        while (interfaceC869470Y8z.moveToNext()) {
            C0YA1 c0ya1 = new C0YA1();
            c0ya1.msgUuid = interfaceC869470Y8z.getString(columnIndex);
            c0ya1.conversationId = interfaceC869470Y8z.getString(columnIndex2);
            c0ya1.uid = Long.valueOf(interfaceC869470Y8z.getLong(columnIndex3));
            c0ya1.sec_uid = interfaceC869470Y8z.getString(columnIndex4);
            c0ya1.setCreateTime(interfaceC869470Y8z.getLong(columnIndex6), interfaceC869470Y8z.getLong(columnIndex5));
            c0ya1.idempotent_id = interfaceC869470Y8z.getString(columnIndex7);
            c0ya1.key = interfaceC869470Y8z.getString(columnIndex8);
            c0ya1.value = interfaceC869470Y8z.getString(columnIndex9);
            c0ya1.version = interfaceC869470Y8z.getLong(columnIndex10);
            c0ya1.status = interfaceC869470Y8z.getInt(columnIndex11);
            c0ya1.deleted = interfaceC869470Y8z.getInt(columnIndex12);
            c0ya1.setBizExtra(C870740YDw.LIZIZ(interfaceC869470Y8z.getBlob(columnIndex14)));
            try {
                c0ya1.url = (UrlStruct) C09EF.LIZ.LJII(interfaceC869470Y8z.getString(columnIndex13), UrlStruct.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c0ya1.url = null;
            }
            arrayList.add(c0ya1);
        }
        return arrayList;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00bd -> B:29:0x00b7). Please report as a decompilation issue!!! */
    public final Collection<C0YA6> LIZLLL(String str) {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        collectionValues = null;
        collectionValues = null;
        Collection<C0YA6> collectionValues = null;
        try {
            interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(str, "collectResendProperties", null);
            if (interfaceC869470Y8zLJIIJJI != null) {
                try {
                    try {
                        HashMap map = new HashMap();
                        while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                            long j = interfaceC869470Y8zLJIIJJI.getLong(interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869640Y9q.COLUMN_SERVER_ID.key));
                            if (j > 0) {
                                C0YA1 c0ya1LIZIZ = LIZIZ(interfaceC869470Y8zLJIIJJI);
                                if (!TextUtils.isEmpty(c0ya1LIZIZ.msgUuid)) {
                                    C0YA6 c0ya6 = (C0YA6) map.get(c0ya1LIZIZ.msgUuid);
                                    if (c0ya6 == null) {
                                        C0Y8T c0y8tLJIL = this.LIZIZ.LIZLLL().LIZ().LJIL(c0ya1LIZIZ.conversationId);
                                        if (c0y8tLJIL != null) {
                                            c0ya6 = new C0YA6();
                                            c0ya6.setClientMessageId(c0ya1LIZIZ.msgUuid);
                                            c0ya6.setServerMessageId(j);
                                            c0ya6.setConversationId(c0y8tLJIL.getConversationId());
                                            c0ya6.setConversationShortId(c0y8tLJIL.getConversationShortId());
                                            c0ya6.setConversationType(c0y8tLJIL.getConversationType());
                                            c0ya6.setInboxType(c0y8tLJIL.getInboxType());
                                            map.put(c0ya1LIZIZ.msgUuid, c0ya6);
                                        }
                                    }
                                    c0ya6.addPropertyContent(c0ya1LIZIZ);
                                }
                            }
                        }
                        collectionValues = map.values();
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMMsgPropertyDao collectResendProperties", e);
                        this.LIZIZ.LJFF().getEventTracker().LJ(e);
                    }
                } catch (Throwable th) {
                    th = th;
                    interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC869470Y8zLJIIJJI = interfaceC869470Y8z;
                        interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZJ.LIZ().LIZ(interfaceC869470Y8z);
                        throw th;
                    }
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8z);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            interfaceC869470Y8zLJIIJJI = null;
        } catch (Throwable th3) {
            th = th3;
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8z);
            throw th;
        }
        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
        return collectionValues;
    }

    public final C0YA1 LJFF(String str) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select * from msg_property_new where ");
            sbLIZ.append(EnumC869700Y9w.COLUMN_CONVERSATION_ID.key);
            sbLIZ.append("=? and ");
            sbLIZ.append(EnumC869700Y9w.COLUMN_SENDER.key);
            sbLIZ.append("!=? order by ");
            sbLIZ.append(EnumC869700Y9w.COLUMN_CREATE_TIME_V2.key);
            sbLIZ.append(" desc, ");
            sbLIZ.append(EnumC869700Y9w.COLUMN_CREATE_TIME.key);
            sbLIZ.append(" desc limit 1");
            interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getLastMessageProperty", new String[]{String.valueOf(str), String.valueOf(this.LIZ.getUid())});
            if (interfaceC869470Y8zLJIIJJI != null) {
                try {
                    try {
                        if (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                            C0YA1 c0ya1LIZIZ = LIZIZ(interfaceC869470Y8zLJIIJJI);
                            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "IMMsgPropertyDao getLastMessageProperty");
                            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            return c0ya1LIZIZ;
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMMsgPropertyDao getLastMessageProperty", e);
                        this.LIZIZ.LJFF().getEventTracker().LIZLLL("getLastMessageProperty", e);
                    }
                } catch (Throwable th) {
                    th = th;
                    interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            this.LIZJ.LIZ().LIZ(interfaceC869470Y8z);
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
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8z);
                throw th;
            }
        }
        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00b5: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777397), block:B:28:0x00b5 */
    public final Map<String, List<C0YA1>> LJI(String str) {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC869470Y8z interfaceC869470Y8z2 = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select * from msg_property_new where ");
                sbLIZ.append(EnumC869700Y9w.COLUMN_MSG_UUID.key);
                sbLIZ.append("=? order by ");
                sbLIZ.append(EnumC869700Y9w.COLUMN_CREATE_TIME.key);
                sbLIZ.append(" asc");
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMessagePropertiesMap", new String[]{str});
                HashMap map = null;
                while (interfaceC869470Y8zLJIIJJI != null) {
                    try {
                        if (!interfaceC869470Y8zLJIIJJI.moveToNext()) {
                            break;
                        }
                        C0YA1 c0ya1LIZIZ = LIZIZ(interfaceC869470Y8zLJIIJJI);
                        if (c0ya1LIZIZ.deleted != 1) {
                            if (map == null) {
                                map = new HashMap();
                            }
                            List arrayList = (List) map.get(c0ya1LIZIZ.key);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                map.put(c0ya1LIZIZ.key, arrayList);
                            }
                            arrayList.add(c0ya1LIZIZ);
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMMsgPropertyDao getMessageProperties", e);
                        this.LIZIZ.LJFF().getEventTracker().LJ(e);
                        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        return null;
                    }
                }
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMessageProperties");
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return map;
            } catch (Throwable th) {
                th = th;
                interfaceC869470Y8z2 = interfaceC869470Y8z;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZJ.LIZ().LIZ(interfaceC869470Y8z2);
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
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8z2);
                throw th;
            }
        }
    }

    public final void LJIIIZ(C869590Y9l c869590Y9l) {
        List<C0YA1> value;
        if (c869590Y9l != null && !TextUtils.isEmpty(c869590Y9l.getUuid())) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean zLJIIIZ = this.LIZJ.getProxy().LJIIIZ();
            if (!zLJIIIZ) {
                this.LIZJ.getProxy().LJIILIIL("IMMsgPropertyDao.updateMessageProperty");
            }
            InterfaceC869960YAw interfaceC869960YAwLIZ = null;
            try {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("delete from msg_property_new where ");
                    sbLIZ.append(EnumC869700Y9w.COLUMN_MSG_UUID.key);
                    sbLIZ.append("='");
                    sbLIZ.append(c869590Y9l.getUuid());
                    sbLIZ.append("' and ");
                    EnumC869700Y9w enumC869700Y9w = EnumC869700Y9w.COLUMN_STATUS;
                    sbLIZ.append(enumC869700Y9w.key);
                    sbLIZ.append("<>");
                    sbLIZ.append(1);
                    sbLIZ.append(" and ");
                    sbLIZ.append(enumC869700Y9w.key);
                    sbLIZ.append("<>");
                    sbLIZ.append(4);
                    sbLIZ.append(" and ");
                    sbLIZ.append(enumC869700Y9w.key);
                    sbLIZ.append("<>");
                    sbLIZ.append(5);
                    sbLIZ.append(" and ");
                    sbLIZ.append(enumC869700Y9w.key);
                    sbLIZ.append("<>");
                    sbLIZ.append(3);
                    this.LIZJ.getProxy().LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "deleteMsgProperty");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("insert or ignore into msg_property_new values(");
                    C869650Y9r c869650Y9rLIZ = this.LIZJ.LIZ();
                    int length = EnumC869700Y9w.values().length;
                    c869650Y9rLIZ.getClass();
                    sbLIZ2.append(C869650Y9r.LJ(length));
                    sbLIZ2.append(")");
                    interfaceC869960YAwLIZ = this.LIZJ.getProxy().LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    Map<String, List<C0YA1>> propertyItemListMap = c869590Y9l.getPropertyItemListMap();
                    if (propertyItemListMap != null && !propertyItemListMap.isEmpty()) {
                        for (Map.Entry<String, List<C0YA1>> entry : propertyItemListMap.entrySet()) {
                            String key = entry.getKey();
                            if (key != null && (value = entry.getValue()) != null) {
                                for (C0YA1 c0ya1 : value) {
                                    if (c0ya1 != null) {
                                        c0ya1.msgUuid = c869590Y9l.getUuid();
                                        c0ya1.conversationId = c869590Y9l.getConversationId();
                                        c0ya1.key = key;
                                        this.LIZ.LJIIIZ().getClass();
                                        LIZ(interfaceC869960YAwLIZ, c0ya1);
                                        interfaceC869960YAwLIZ.LJIL();
                                    }
                                }
                            }
                        }
                    }
                    c869590Y9l.setPropertyItemListMap(LJI(c869590Y9l.getUuid()));
                    if (!zLJIIIZ) {
                        this.LIZJ.getProxy().LIZJ("IMMsgPropertyDao.updateMessageProperty", true);
                    }
                    this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateMessageProperty");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZ.LIZLLL().LJIIIZ("IMMsgPropertyDao updateMessageProperty", e);
                    this.LIZIZ.LJFF().getEventTracker().LJ(e);
                    if (!zLJIIIZ) {
                        this.LIZJ.getProxy().LIZJ("IMMsgPropertyDao.updateMessageProperty", false);
                    }
                }
                this.LIZJ.LIZ().LIZIZ(interfaceC869960YAwLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                throw th;
            }
        }
    }

    public static void LIZ(InterfaceC869960YAw interfaceC869960YAw, C0YA1 c0ya1) {
        if (interfaceC869960YAw != null && !TextUtils.isEmpty(c0ya1.msgUuid)) {
            int iOrdinal = EnumC869700Y9w.COLUMN_MSG_UUID.ordinal() + 1;
            String str = c0ya1.msgUuid;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal, str);
            int iOrdinal2 = EnumC869700Y9w.COLUMN_CONVERSATION_ID.ordinal() + 1;
            String str3 = c0ya1.conversationId;
            if (str3 == null) {
                str3 = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal2, str3);
            int iOrdinal3 = EnumC869700Y9w.COLUMN_KEY.ordinal() + 1;
            String str4 = c0ya1.key;
            if (str4 == null) {
                str4 = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal3, str4);
            int iOrdinal4 = EnumC869700Y9w.COLUMN_IDEMPOTENT_ID.ordinal() + 1;
            String str5 = c0ya1.idempotent_id;
            if (str5 == null) {
                str5 = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal4, str5);
            interfaceC869960YAw.LJIJ(EnumC869700Y9w.COLUMN_SENDER.ordinal() + 1, c0ya1.uid.longValue());
            int iOrdinal5 = EnumC869700Y9w.COLUMN_SENDER_SEC.ordinal() + 1;
            String str6 = c0ya1.sec_uid;
            if (str6 == null) {
                str6 = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal5, str6);
            interfaceC869960YAw.LJIJ(EnumC869700Y9w.COLUMN_CREATE_TIME.ordinal() + 1, c0ya1.getCreateTimeSeconds());
            int iOrdinal6 = EnumC869700Y9w.COLUMN_VALUE.ordinal() + 1;
            String str7 = c0ya1.value;
            if (str7 != null) {
                str2 = str7;
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal6, str2);
            interfaceC869960YAw.LJIJ(EnumC869700Y9w.COLUMN_DELETED.ordinal() + 1, c0ya1.deleted);
            interfaceC869960YAw.LJIJ(EnumC869700Y9w.COLUMN_VERSION.ordinal() + 1, c0ya1.version);
            interfaceC869960YAw.LJIJ(EnumC869700Y9w.COLUMN_STATUS.ordinal() + 1, c0ya1.status);
            interfaceC869960YAw.LJIJ(EnumC869700Y9w.COLUMN_CREATE_TIME_V2.ordinal() + 1, c0ya1.createTimeMicros);
            int iOrdinal7 = EnumC869700Y9w.COLUMN_BIZ_EXTRA.ordinal() + 1;
            ByteString bizExtra = c0ya1.getBizExtra();
            if (bizExtra == null) {
                bizExtra = ByteString.EMPTY;
            }
            interfaceC869960YAw.LJJIIJZLJL(iOrdinal7, bizExtra.toByteArray());
            UrlStruct urlStruct = c0ya1.url;
            if (urlStruct != null) {
                interfaceC869960YAw.LJIILIIL(EnumC869700Y9w.COLUMN_URL.ordinal() + 1, GsonProtectorUtils.toJson(C09EF.LIZ, urlStruct));
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0076: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:50331766), block:B:22:0x0076 */
    public final C0YA1 LJII(String str, String str2, String str3) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8z;
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select * from msg_property_new where ");
                sbLIZ.append(LJIIIIZZ());
                interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMessageProperty", new String[]{str, str2, str3});
                if (interfaceC869470Y8zLJIIJJI != null) {
                    try {
                        if (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                            C0YA1 c0ya1LIZIZ = LIZIZ(interfaceC869470Y8zLJIIJJI);
                            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            return c0ya1LIZIZ;
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMMsgPropertyDao getMessageProperty", e);
                        this.LIZIZ.LJFF().getEventTracker().LJ(e);
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
                        this.LIZJ.LIZ().LIZ(interfaceC869470Y8z2);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return null;
        } catch (Throwable th3) {
            th = th3;
            interfaceC869470Y8z2 = interfaceC869470Y8z;
        }
    }
}
