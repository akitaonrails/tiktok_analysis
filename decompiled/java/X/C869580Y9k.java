package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import okio.ByteString;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Y9k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869580Y9k implements InterfaceC869780YAe {
    public final C0YEM LIZ;
    public final InterfaceC864790XwD LIZIZ;
    public final C0Y5R LIZJ;

    public final long LJJIJL() {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select ");
                EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_INNER_INDEX;
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append(" from ");
                sbLIZ.append("msg");
                sbLIZ.append(" order by ");
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append(" desc limit 1");
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMaxIndexRegardlessConversation", null);
                if (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                    long j = interfaceC869470Y8zLJIIJJI.getLong(interfaceC869470Y8zLJIIJJI.getColumnIndex(enumC869640Y9q.key));
                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return j;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getMaxIndexRegardlessConversation", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return 0L;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final boolean LJJJZ() {
        return this.LIZ.LJIIIZ().LJJLIIIIJ.LJJJ;
    }

    public static String LJJIII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CREATE INDEX IF NOT EXISTS MSG_CONV_ID_ORDER_INDEX_CREATE_TIME ON msg(");
        sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
        sbLIZ.append(" , ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_ORDER_INDEX.key);
        sbLIZ.append(" desc , ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
        sbLIZ.append(" desc )");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C869580Y9k(C0YEM c0yem) {
        this.LIZ = c0yem;
        this.LIZIZ = c0yem.LJIIZILJ();
        this.LIZJ = c0yem.LJIIZILJ().LIZIZ();
    }

    public static ContentValues LJIIL(C869590Y9l c869590Y9l) {
        int iIntValue;
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC869640Y9q.COLUMN_MSG_ID.key, c869590Y9l.getUuid());
        contentValues.put(EnumC869640Y9q.COLUMN_SERVER_ID.key, Long.valueOf(c869590Y9l.getMsgId()));
        contentValues.put(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key, c869590Y9l.getConversationId());
        contentValues.put(EnumC869640Y9q.COLUMN_CONVERSATION_SHORT_ID.key, Long.valueOf(c869590Y9l.getConversationShortId()));
        contentValues.put(EnumC869640Y9q.COLUMN_CONVERSATION_TYPE.key, Integer.valueOf(c869590Y9l.getConversationType()));
        contentValues.put(EnumC869640Y9q.COLUMN_MSG_TYPE.key, Integer.valueOf(c869590Y9l.getMsgType()));
        contentValues.put(EnumC869640Y9q.COLUMN_INNER_INDEX.key, Long.valueOf(c869590Y9l.getIndex()));
        contentValues.put(EnumC869640Y9q.COLUMN_ORDER_INDEX.key, Long.valueOf(c869590Y9l.getOrderIndex()));
        contentValues.put(EnumC869640Y9q.COLUMN_STATUS.key, Integer.valueOf(c869590Y9l.getMsgStatus()));
        contentValues.put(EnumC869640Y9q.COLUMN_NET_STATUS.key, Integer.valueOf(c869590Y9l.getSvrStatus()));
        contentValues.put(EnumC869640Y9q.COLUMN_VERSION.key, Long.valueOf(c869590Y9l.getVersion()));
        contentValues.put(EnumC869640Y9q.COLUMN_DELETED.key, Integer.valueOf(c869590Y9l.getDeleted()));
        contentValues.put(EnumC869640Y9q.COLUMN_CREATE_TIME.key, Long.valueOf(c869590Y9l.getCreatedAt()));
        contentValues.put(EnumC869640Y9q.COLUMN_LOCAL_CREATE_TIME.key, Long.valueOf(c869590Y9l.getLocalCreatedAt()));
        contentValues.put(EnumC869640Y9q.COLUMN_SENDER.key, Long.valueOf(c869590Y9l.getSender()));
        contentValues.put(EnumC869640Y9q.COLUMN_CONTENT.key, c869590Y9l.getContent());
        String str = EnumC869640Y9q.COLUMN_CONTENT_PB.key;
        ByteString contentPB = c869590Y9l.getContentPB();
        if (contentPB == null) {
            contentPB = ByteString.EMPTY;
        }
        contentValues.put(str, contentPB.toByteArray());
        contentValues.put(EnumC869640Y9q.COLUMN_SCENE.key, c869590Y9l.getScene());
        contentValues.put(EnumC869640Y9q.COLUMN_EXT.key, c869590Y9l.getExtStr());
        contentValues.put(EnumC869640Y9q.COLUMN_LOCAL_INFO.key, c869590Y9l.getLocalExtStr());
        contentValues.put(EnumC869640Y9q.COLUMN_READ_STATUS.key, Integer.valueOf(c869590Y9l.getReadStatus()));
        contentValues.put(EnumC869640Y9q.COLUMN_SEC_SENDER.key, c869590Y9l.getSecSender());
        contentValues.put(EnumC869640Y9q.COLUMN_PROPERTY_LIST.key, "");
        contentValues.put(EnumC869640Y9q.COLUMN_INDEX_IN_CONVERSATION_V2.key, Long.valueOf(c869590Y9l.getIndexInConversationV2()));
        contentValues.put(EnumC869640Y9q.COLUMN_TABLE_FLAG.key, Long.valueOf(c869590Y9l.getTableFlag()));
        contentValues.put(EnumC869640Y9q.COLUMN_CONV_RANK_UPDATE_RULE.key, Integer.valueOf(c869590Y9l.getConvRankUpdateRule()));
        contentValues.put(EnumC869640Y9q.COLUMN_TTL.key, Long.valueOf(c869590Y9l.getTtl()));
        contentValues.put(EnumC869640Y9q.COLUMN_PREV_INDEX.key, Long.valueOf(c869590Y9l.getPrevIndex()));
        String str2 = EnumC869640Y9q.COLUMN_BIZ_PERSISTENT_EXTRA.key;
        ByteString persistentExtra = c869590Y9l.getPersistentExtra();
        if (persistentExtra == null) {
            persistentExtra = ByteString.EMPTY;
        }
        contentValues.put(str2, persistentExtra.toByteArray());
        contentValues.put(EnumC869640Y9q.COLUMN_SOURCE_VREGION.key, c869590Y9l.getSourceVregion());
        Integer sourceAppId = c869590Y9l.getSourceAppId();
        String str3 = EnumC869640Y9q.COLUMN_SOURCE_APP_ID.key;
        if (sourceAppId != null) {
            iIntValue = sourceAppId.intValue();
        } else {
            iIntValue = 0;
        }
        contentValues.put(str3, Integer.valueOf(iIntValue));
        return contentValues;
    }

    public static void LJIILJJIL(C869590Y9l c869590Y9l) {
        long j;
        if (c869590Y9l == null) {
            return;
        }
        if (c869590Y9l.getAttachments() != null && !c869590Y9l.getAttachments().isEmpty()) {
            j = 1;
        } else {
            j = 0;
        }
        if (c869590Y9l.getPropertyItemListMap() != null && !c869590Y9l.getPropertyItemListMap().isEmpty()) {
            j |= 2;
        }
        c869590Y9l.setTableFlag(j);
    }

    public static String LJJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select rowid,* from msg where ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
        sbLIZ.append("=?");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(" AND ");
        EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_INNER_INDEX;
        sbLIZ2.append(enumC869640Y9q.key);
        sbLIZ2.append(">=?");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append(" AND ");
        sbLIZ3.append(enumC869640Y9q.key);
        sbLIZ3.append("<=?");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        if (i > 0) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ3);
            sbLIZ4.append(" limit ");
            sbLIZ4.append(i);
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        return strLIZIZ3;
    }

    public static String LJJIJLIJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select rowid,* from msg where ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
        sbLIZ.append("=? AND ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
        sbLIZ.append("=? AND ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
        sbLIZ.append("=?");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(" AND ");
        EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_ORDER_INDEX;
        sbLIZ2.append(enumC869640Y9q.key);
        sbLIZ2.append(">=?");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append(" AND ");
        sbLIZ3.append(enumC869640Y9q.key);
        sbLIZ3.append("<=?");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ3);
        sbLIZ4.append(" order by ");
        sbLIZ4.append(enumC869640Y9q.key);
        sbLIZ4.append(" desc, ");
        sbLIZ4.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
        sbLIZ4.append(" desc");
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
        if (i > 0) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ4);
            sbLIZ5.append(" limit ");
            sbLIZ5.append(i);
            return C2188811AlT.LIZIZ(sbLIZ5);
        }
        return strLIZIZ4;
    }

    public final List<C869590Y9l> LJFF(List<C869590Y9l> list) {
        C869590Y9l c869590Y9lLJJJI;
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMsgDao batchUpdateMessageContentPb, size:");
        sbLIZ.append(list.size());
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        try {
            for (C869590Y9l c869590Y9l : list) {
                if (c869590Y9l.getUuid() != null && (c869590Y9lLJJJI = LJJJI(c869590Y9l.getUuid())) != null && !c869590Y9lLJJJI.invalid()) {
                    ContentValues contentValues = new ContentValues();
                    if (!LJJJZ()) {
                        Map<String, String> localExt = c869590Y9lLJJJI.getLocalExt();
                        localExt.putAll(c869590Y9l.getLocalExt());
                        String strLIZ = C09EF.LIZ(localExt);
                        String str = EnumC869640Y9q.COLUMN_LOCAL_INFO.key;
                        if (strLIZ == null) {
                            strLIZ = "";
                        }
                        contentValues.put(str, strLIZ);
                    }
                    String str2 = EnumC869640Y9q.COLUMN_CONTENT_PB.key;
                    ByteString contentPB = c869590Y9l.getContentPB();
                    if (contentPB == null) {
                        contentPB = ByteString.EMPTY;
                    }
                    contentValues.put(str2, contentPB.toByteArray());
                    contentValues.put(EnumC869640Y9q.COLUMN_TTL.key, Long.valueOf(c869590Y9l.getTtl()));
                    C870430YCr proxy = this.LIZJ.getProxy();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
                    sbLIZ2.append("=?");
                    if (proxy.LJIILJJIL("msg", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{c869590Y9lLJJJI.getUuid()}) > 0) {
                        c869590Y9lLJJJI.setContentPB(c869590Y9l.getContentPB());
                        if (LJJJZ()) {
                            c869590Y9lLJJJI.setTtl(c869590Y9l.getTtl());
                        }
                        arrayList.add(c869590Y9lLJJJI);
                    }
                }
            }
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "batchUpdateMessageContentPb");
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIZ("IMMsgDao batchUpdateMessageContentPb", e);
            this.LIZIZ.LJFF().getEventTracker().LIZLLL("IMMsgDao batchUpdateMessageContentPb", e);
            return arrayList;
        }
    }

    public final List<C869590Y9l> LJI(Map<String, Map<String, String>> map) throws Throwable {
        if (map != null && !map.isEmpty()) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMMsgDao batchUpdateMessageLocalExt, size:");
            sbLIZ.append(map.size());
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ.getProxy().LJIILIIL("IMMsgDao batchUpdateMessageLocalExt");
            ArrayList arrayList = new ArrayList();
            try {
                for (String str : map.keySet()) {
                    C869590Y9l c869590Y9lLJJJI = LJJJI(str);
                    if (c869590Y9lLJJJI != null && !c869590Y9lLJJJI.invalid()) {
                        Map<String, String> localExt = c869590Y9lLJJJI.getLocalExt();
                        localExt.putAll(map.get(str));
                        String strLIZ = C09EF.LIZ(localExt);
                        ContentValues contentValues = new ContentValues();
                        String str2 = EnumC869640Y9q.COLUMN_LOCAL_INFO.key;
                        if (strLIZ == null) {
                            strLIZ = "";
                        }
                        contentValues.put(str2, strLIZ);
                        C870430YCr proxy = this.LIZJ.getProxy();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
                        sbLIZ2.append("=?");
                        if (proxy.LJIILJJIL("msg", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{c869590Y9lLJJJI.getUuid()}) > 0) {
                            arrayList.add(c869590Y9lLJJJI);
                        }
                    }
                }
                this.LIZJ.getProxy().LIZJ("IMMsgDao batchUpdateMessageLocalExt", true);
                return arrayList;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZJ.getProxy().LIZJ("IMMsgDao batchUpdateMessageLocalExt", false);
                this.LIZIZ.LJFF().getEventTracker().LIZLLL("IMMsgDao batchUpdateMessageLocalExt", e);
                return arrayList;
            }
        }
        return new ArrayList();
    }

    public final C869590Y9l LJIIIZ(InterfaceC869470Y8z interfaceC869470Y8z) {
        C869590Y9l c869590Y9l = new C869590Y9l();
        c869590Y9l.setRowId(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex("rowid")));
        c869590Y9l.setUuid(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_MSG_ID.key)));
        c869590Y9l.setMsgId(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_SERVER_ID.key)));
        c869590Y9l.setConversationId(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key)));
        c869590Y9l.setConversationShortId(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_CONVERSATION_SHORT_ID.key)));
        c869590Y9l.setConversationType(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_CONVERSATION_TYPE.key)));
        c869590Y9l.setMsgType(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_MSG_TYPE.key)));
        c869590Y9l.setIndex(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_INNER_INDEX.key)));
        c869590Y9l.setOrderIndex(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_ORDER_INDEX.key)));
        c869590Y9l.setMsgStatus(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_STATUS.key)));
        c869590Y9l.setSvrStatus(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_NET_STATUS.key)));
        c869590Y9l.setVersion(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_VERSION.key)));
        c869590Y9l.setDeleted(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_DELETED.key)));
        c869590Y9l.setCreatedAt(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_CREATE_TIME.key)));
        c869590Y9l.setLocalCreatedAt(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_LOCAL_CREATE_TIME.key)));
        c869590Y9l.setSender(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_SENDER.key)));
        c869590Y9l.setContent(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_CONTENT.key)));
        c869590Y9l.setContentPB(C870740YDw.LIZIZ(interfaceC869470Y8z.getBlob(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_CONTENT_PB.key))));
        c869590Y9l.setScene(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_SCENE.key)));
        c869590Y9l.setExtStr(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_EXT.key)));
        c869590Y9l.setLocalExtStr(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_LOCAL_INFO.key)));
        c869590Y9l.setReadStatus(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_READ_STATUS.key)));
        c869590Y9l.setSecSender(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_SEC_SENDER.key)));
        c869590Y9l.setIndexInConversationV2(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_INDEX_IN_CONVERSATION_V2.key)));
        c869590Y9l.setConvRankUpdateRule(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_CONV_RANK_UPDATE_RULE.key)));
        c869590Y9l.setTtl(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_TTL.key)));
        c869590Y9l.setPrevIndex(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_PREV_INDEX.key)));
        c869590Y9l.setPersistentExtra(C870740YDw.LIZIZ(interfaceC869470Y8z.getBlob(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_BIZ_PERSISTENT_EXTRA.key))));
        c869590Y9l.setSourceVregion(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_SOURCE_VREGION.key)));
        int columnIndex = interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_SOURCE_APP_ID.key);
        Integer numValueOf = null;
        if (columnIndex >= 0) {
            long j = interfaceC869470Y8z.getLong(columnIndex);
            if (j > 0) {
                numValueOf = Integer.valueOf((int) j);
            }
            c869590Y9l.setSourceAppId(numValueOf);
        } else {
            c869590Y9l.setSourceAppId(null);
        }
        long j2 = interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869640Y9q.COLUMN_TABLE_FLAG.key));
        if ((j2 & 1) == 1) {
            c869590Y9l.setAttachments(this.LIZJ.LIZIZ().LJII().LJ(c869590Y9l.getUuid()));
        }
        if ((j2 & 2) == 2) {
            C869660Y9s c869660Y9sLJIIJ = this.LIZJ.LIZIZ().LJIIJ();
            c869660Y9sLJIIJ.getClass();
            c869590Y9l.setPropertyItemListMap(c869660Y9sLJIIJ.LJI(c869590Y9l.getUuid()));
        }
        if (c869590Y9l.getRefMsgId() > 0) {
            C869620Y9o c869620Y9oLIZJ = this.LIZJ.LIZIZ().LIZJ();
            String uuid = c869590Y9l.getUuid();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ref_");
            sbLIZ.append(c869590Y9l.getRefMsgId());
            c869590Y9l.setRefMsg((ReferenceInfo) GsonProtectorUtils.fromJson(C09EF.LIZ, c869620Y9oLIZJ.LJFF(uuid, C2188811AlT.LIZIZ(sbLIZ)), ReferenceInfo.class));
        }
        return c869590Y9l;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x00dd
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void LJIILIIL(X.C869590Y9l r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869580Y9k.LJIILIIL(X.0Y9l):void");
    }

    public final C0Y6Q<Long> LJIILLIIL(C0Y9U c0y9u) {
        String message;
        C0Y6Q<Long> c0y6qLIZ;
        long j = 0;
        if (c0y9u != null && !c0y9u.LIZ.isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
            try {
                try {
                    C0Y99 c0y99LIZJ = C869600Y9m.LIZJ(c0y9u);
                    String str = c0y99LIZJ.LIZ;
                    String[] strArr = c0y99LIZJ.LIZIZ;
                    C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SQL: ");
                    sbLIZ.append(C869600Y9m.LJ(str));
                    sbLIZ.append(", params: ");
                    sbLIZ.append(Arrays.toString(strArr));
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c868780Y6iLIZLLL.getClass();
                    C868780Y6i.LJ(c868780Y6iLIZLLL, "IMMsgDao countMessages", strLIZIZ, 4);
                    interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(str, "countMessages", strArr);
                    if (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                        j = interfaceC869470Y8zLJIIJJI.getLong(0);
                    }
                    this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "countMessages");
                    C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Counted ");
                    sbLIZ2.append(j);
                    sbLIZ2.append(" messages");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c868780Y6iLIZLLL2.getClass();
                    C868780Y6i.LJ(c868780Y6iLIZLLL2, "IMMsgDao countMessages", strLIZIZ2, 4);
                    c0y6qLIZ = C865670Xxd.LIZJ(Long.valueOf(j));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZ.LIZLLL().LJIIIZ("IMMsgDao countMessages", e);
                    this.LIZIZ.LJFF().getEventTracker().LIZLLL("countMessages", e);
                    if (e.getMessage() != null) {
                        message = e.getMessage();
                    } else {
                        message = "countMessages failed";
                    }
                    c0y6qLIZ = C865670Xxd.LIZ(-1, message);
                }
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return c0y6qLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                throw th;
            }
        }
        return C865670Xxd.LIZJ(0L);
    }

    public final boolean LJIIZILJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C870430YCr proxy = this.LIZJ.getProxy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update msg set ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
        sbLIZ.append("=");
        sbLIZ.append(1);
        sbLIZ.append(" where ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
        sbLIZ.append("=\"");
        sbLIZ.append(str);
        sbLIZ.append("\"");
        boolean zLIZLLL = proxy.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "deleteMsg");
        if (zLIZLLL) {
            this.LIZJ.LIZIZ().LIZIZ().LIZIZ(str);
            C869620Y9o c869620Y9oLIZJ = this.LIZJ.LIZIZ().LIZJ();
            c869620Y9oLIZJ.getClass();
            if (TextUtils.isEmpty(str)) {
                C868780Y6i c868780Y6iLIZLLL = c869620Y9oLIZJ.LL.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("deleteByUuid invalid uuid: ");
                sbLIZ2.append(str);
                c868780Y6iLIZLLL.LJIIIIZZ("IMMsgKvDao: deleteByUuid", C2188811AlT.LIZIZ(sbLIZ2), null);
            } else {
                try {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(EnumC869730Y9z.COLUMN_MSG_ID.getKey());
                    sbLIZ3.append("=?");
                    if (!c869620Y9oLIZJ.LLILLL.getProxy().LIZIZ("message_kv", C2188811AlT.LIZIZ(sbLIZ3), new String[]{str})) {
                        C868780Y6i c868780Y6iLIZLLL2 = c869620Y9oLIZJ.LL.LIZLLL();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("deleteByUuid failed for uuid: ");
                        sbLIZ4.append(str);
                        c868780Y6iLIZLLL2.LJIIIIZZ("IMMsgKvDao: deleteByUuid", C2188811AlT.LIZIZ(sbLIZ4), null);
                    } else {
                        C868780Y6i c868780Y6iLIZLLL3 = c869620Y9oLIZJ.LL.LIZLLL();
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("deleteByUuid success for uuid: ");
                        sbLIZ5.append(str);
                        C868780Y6i.LJ(c868780Y6iLIZLLL3, "IMMsgKvDao: deleteByUuid", C2188811AlT.LIZIZ(sbLIZ5), 4);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C868780Y6i c868780Y6iLIZLLL4 = c869620Y9oLIZJ.LL.LIZLLL();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("deleteByUuid exception for uuid: ");
                    sbLIZ6.append(str);
                    c868780Y6iLIZLLL4.LJIIIIZZ("IMMsgKvDao: deleteByUuid", C2188811AlT.LIZIZ(sbLIZ6), e);
                    c869620Y9oLIZJ.LLILLJJLI.LJFF().getEventTracker().LJ(e);
                }
            }
        }
        C868780Y6i c868780Y6iLIZLLL5 = this.LIZ.LIZLLL();
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("IMMsgDao deleteMsg, uuid:");
        sbLIZ7.append(str);
        sbLIZ7.append(", result:");
        sbLIZ7.append(zLIZLLL);
        c868780Y6iLIZLLL5.LJFF(C2188811AlT.LIZIZ(sbLIZ7));
        return zLIZLLL;
    }

    public final boolean LJIJJLI(String str) {
        boolean zLIZIZ;
        if (LJJIIJ(str) != 0) {
            this.LIZ.LIZLLL().LIZIZ("IMMsgDao  delete all messages");
            C870430YCr proxy = this.LIZJ.getProxy();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
            sbLIZ.append("=?");
            zLIZIZ = proxy.LIZIZ("msg", C2188811AlT.LIZIZ(sbLIZ), new String[]{str});
            if (zLIZIZ) {
            }
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IMMsgDao forceDeleteAllMsg, cid:");
            sbLIZ2.append(str);
            sbLIZ2.append(", result:");
            sbLIZ2.append(zLIZIZ);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            return zLIZIZ;
        }
        this.LIZ.LIZLLL().LIZIZ("IMMsgDao  no msg found in conv");
        zLIZIZ = true;
        this.LIZJ.LIZIZ().LIZIZ().LIZJ(str);
        C869620Y9o c869620Y9oLIZJ = this.LIZJ.LIZIZ().LIZJ();
        c869620Y9oLIZJ.getClass();
        if (TextUtils.isEmpty(str)) {
            C868780Y6i c868780Y6iLIZLLL2 = c869620Y9oLIZJ.LL.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("deleteByConversationId invalid conversationId: ");
            sbLIZ3.append(str);
            c868780Y6iLIZLLL2.LJIIIIZZ("IMMsgKvDao: deleteByConversationId", C2188811AlT.LIZIZ(sbLIZ3), null);
        } else {
            try {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(EnumC869730Y9z.COLUMN_CONVERSATION_ID.getKey());
                sbLIZ4.append("=?");
                if (!c869620Y9oLIZJ.LLILLL.getProxy().LIZIZ("message_kv", C2188811AlT.LIZIZ(sbLIZ4), new String[]{str})) {
                    C868780Y6i c868780Y6iLIZLLL3 = c869620Y9oLIZJ.LL.LIZLLL();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("deleteByConversationId failed for conversationId: ");
                    sbLIZ5.append(str);
                    c868780Y6iLIZLLL3.LJIIIIZZ("IMMsgKvDao: deleteByConversationId", C2188811AlT.LIZIZ(sbLIZ5), null);
                } else {
                    C868780Y6i c868780Y6iLIZLLL4 = c869620Y9oLIZJ.LL.LIZLLL();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("deleteByConversationId success for conversationId: ");
                    sbLIZ6.append(str);
                    C868780Y6i.LJ(c868780Y6iLIZLLL4, "IMMsgKvDao: deleteByConversationId", C2188811AlT.LIZIZ(sbLIZ6), 4);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL5 = c869620Y9oLIZJ.LL.LIZLLL();
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("deleteByConversationId exception for conversationId: ");
                sbLIZ7.append(str);
                c868780Y6iLIZLLL5.LJIIIIZZ("IMMsgKvDao: deleteByConversationId", C2188811AlT.LIZIZ(sbLIZ7), e);
                c869620Y9oLIZJ.LLILLJJLI.LJFF().getEventTracker().LJ(e);
            }
        }
        C869660Y9s c869660Y9sLJIIJ = this.LIZJ.LIZIZ().LJIIJ();
        c869660Y9sLJIIJ.getClass();
        if (!TextUtils.isEmpty(str)) {
            C870430YCr proxy2 = c869660Y9sLJIIJ.LIZJ.getProxy();
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(EnumC869700Y9w.COLUMN_CONVERSATION_ID.key);
            sbLIZ8.append("=?");
            proxy2.LIZIZ("msg_property_new", C2188811AlT.LIZIZ(sbLIZ8), new String[]{str});
        }
        this.LIZJ.LIZIZ().LJFF().LIZJ(str);
        this.LIZJ.LIZIZ().LIZLLL().LJ(str);
        C868780Y6i c868780Y6iLIZLLL6 = this.LIZ.LIZLLL();
        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
        sbLIZ22.append("IMMsgDao forceDeleteAllMsg, cid:");
        sbLIZ22.append(str);
        sbLIZ22.append(", result:");
        sbLIZ22.append(zLIZIZ);
        c868780Y6iLIZLLL6.LJFF(C2188811AlT.LIZIZ(sbLIZ22));
        return zLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.0Y6i] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final long LJJIFFI(String str) {
        ?? r4;
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        ?? LIZLLL = 0;
        LIZLLL = 0;
        try {
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select ");
                EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_INNER_INDEX;
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append(" from ");
                sbLIZ.append("msg");
                sbLIZ.append(" where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append(">? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
                sbLIZ.append("=? order by ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_ORDER_INDEX.key);
                sbLIZ.append(" asc, ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
                sbLIZ.append(" asc limit 1");
                LIZLLL = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getFirstShowMsgIndex", new String[]{str, String.valueOf(10000000), String.valueOf(0), String.valueOf(0)});
                boolean zMoveToFirst = LIZLLL.moveToFirst();
                r4 = LIZLLL;
                if (zMoveToFirst) {
                    j = LIZLLL.getLong(LIZLLL.getColumnIndex(enumC869640Y9q.key));
                    r4 = LIZLLL;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getFirstShowMsgIndex", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
                r4 = LIZLLL;
            }
            this.LIZJ.LIZ().LIZ(r4);
            LIZLLL = this.LIZ.LIZLLL();
            LIZLLL.LJFF("IMMsgDao getFirstShowMsgIndex, cid:" + str + ", index:" + j);
            return j;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(LIZLLL);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.0Y6i] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final long LJJII(String str) {
        ?? r4;
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        ?? LIZLLL = 0;
        LIZLLL = 0;
        try {
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select * from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append("=? and ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_SERVER_ID.key);
                sbLIZ.append(">? order by ");
                EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_INNER_INDEX;
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append(" desc limit 1");
                LIZLLL = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getLargestMsgIndexWithValidMsgId", new String[]{str, CardStruct.IStatusCode.DEFAULT});
                r4 = LIZLLL;
                if (LIZLLL != 0) {
                    boolean zMoveToFirst = LIZLLL.moveToFirst();
                    r4 = LIZLLL;
                    if (zMoveToFirst) {
                        j = LIZLLL.getLong(LIZLLL.getColumnIndex(enumC869640Y9q.key));
                        r4 = LIZLLL;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getLastMsgIndex", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
                r4 = LIZLLL;
            }
            this.LIZJ.LIZ().LIZ(r4);
            LIZLLL = this.LIZ.LIZLLL();
            LIZLLL.LJFF("IMMsgDao getLastMsgIndex, cid:" + str + ", index:" + j);
            return j;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(LIZLLL);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.0Y6i] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final long LJJIIJ(String str) {
        ?? r4;
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        ?? LIZLLL = 0;
        LIZLLL = 0;
        try {
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select * from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append("=? order by ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_ORDER_INDEX.key);
                sbLIZ.append(" desc, ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
                sbLIZ.append(" desc limit 1");
                LIZLLL = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getLastMsgIndex", new String[]{str});
                r4 = LIZLLL;
                if (LIZLLL != 0) {
                    boolean zMoveToFirst = LIZLLL.moveToFirst();
                    r4 = LIZLLL;
                    if (zMoveToFirst) {
                        j = LIZLLL.getLong(LIZLLL.getColumnIndex(EnumC869640Y9q.COLUMN_INNER_INDEX.key));
                        r4 = LIZLLL;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getLastMsgIndex", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
                r4 = LIZLLL;
            }
            this.LIZJ.LIZ().LIZ(r4);
            LIZLLL = this.LIZ.LIZLLL();
            LIZLLL.LJFF("IMMsgDao getLastMsgIndex, cid:" + str + ", index:" + j);
            return j;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(LIZLLL);
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0065: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777317), block:B:23:0x0065 */
    public final C869590Y9l LJJIIJZLJL(String str) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJJLIIJ;
        InterfaceC869470Y8z interfaceC869470Y8z;
        InterfaceC869470Y8z interfaceC869470Y8z2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                interfaceC869470Y8zLJJLIIJ = LJJLIIJ(str);
                if (interfaceC869470Y8zLJJLIIJ != null) {
                    try {
                        if (interfaceC869470Y8zLJJLIIJ.moveToFirst()) {
                            C869590Y9l c869590Y9lLJIIIZ = LJIIIZ(interfaceC869470Y8zLJJLIIJ);
                            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getLastShowMsg");
                            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJJLIIJ);
                            return c869590Y9lLJIIIZ;
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getLastShowMsg", e);
                        this.LIZIZ.LJFF().getEventTracker().LJ(e);
                    }
                }
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
            interfaceC869470Y8zLJJLIIJ = null;
        } catch (Throwable th3) {
            th = th3;
            while (true) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8z2);
                throw th;
            }
        }
        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJJLIIJ);
        return null;
    }

    public final long LJJIJ(String str) {
        long j = 0;
        InterfaceC869470Y8z interfaceC869470Y8zLJJIIZI = null;
        try {
            try {
                interfaceC869470Y8zLJJIIZI = LJJIIZI(str, null, false);
                if (interfaceC869470Y8zLJJIIZI != null && interfaceC869470Y8zLJJIIZI.moveToFirst()) {
                    j = interfaceC869470Y8zLJJIIZI.getLong(interfaceC869470Y8zLJJIIZI.getColumnIndex(EnumC869640Y9q.COLUMN_INNER_INDEX.key));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao ", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJJIIZI);
            return j;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJJIIZI);
            throw th;
        }
    }

    public final long LJJIJIIJI(List<Integer> list) {
        ArrayList arrayList;
        StringBuilder sb = new StringBuilder(e3.h);
        int i = 0;
        while (true) {
            arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                break;
            }
            sb.append('?');
            if (i != arrayList.size() - 1) {
                sb.append(',');
            }
            i++;
        }
        sb.append(')');
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select ");
        EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_CREATE_TIME;
        sbLIZ.append(enumC869640Y9q.key);
        sbLIZ.append(" from ");
        sbLIZ.append("msg");
        sbLIZ.append(" where ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_TYPE.key);
        sbLIZ.append(" in ");
        sbLIZ.append((Object) sb);
        sbLIZ.append(" and ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
        sbLIZ.append("=? and ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
        sbLIZ.append("=? order by ");
        sbLIZ.append(enumC869640Y9q.key);
        sbLIZ.append(" desc limit 1");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                String[] strArr = new String[arrayList.size() + 2];
                Iterator it2 = arrayList.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    strArr[i2] = String.valueOf((Integer) it2.next());
                    i2++;
                }
                strArr[i2] = String.valueOf(0);
                strArr[i2 + 1] = String.valueOf(0);
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(strLIZIZ, "getLatestCreateTime", strArr);
                if (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                    long j = interfaceC869470Y8zLJIIJJI.getLong(interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869640Y9q.COLUMN_CREATE_TIME.key));
                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return j;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao ", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return 0L;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.0Y6i] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final long LJJIJIIJIL(String str) {
        ?? r4;
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        ?? LIZLLL = 0;
        LIZLLL = 0;
        try {
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select ");
                EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_INNER_INDEX;
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append(" from ");
                sbLIZ.append("msg");
                sbLIZ.append(" where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append(">? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_STATUS.key);
                sbLIZ.append("!=");
                sbLIZ.append(6);
                sbLIZ.append(" order by ");
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append(" asc, ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
                sbLIZ.append(" asc limit 1");
                LIZLLL = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getLegalOldestIndex", new String[]{str, String.valueOf(10000000)});
                boolean zMoveToFirst = LIZLLL.moveToFirst();
                r4 = LIZLLL;
                if (zMoveToFirst) {
                    j = LIZLLL.getLong(LIZLLL.getColumnIndex(enumC869640Y9q.key));
                    r4 = LIZLLL;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getLegalOldestIndex", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
                r4 = LIZLLL;
            }
            this.LIZJ.LIZ().LIZ(r4);
            LIZLLL = this.LIZ.LIZLLL();
            LIZLLL.LJFF("IMMsgDao getLegalOldestIndex, cid:" + str + ", index:" + j);
            return j;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(LIZLLL);
            throw th;
        }
    }

    public final List<C869590Y9l> LJJIL(List<Long> list) {
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid,* from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_SERVER_ID.key);
                sbLIZ.append(" in ('");
                sbLIZ.append(C870740YDw.LJIIIIZZ("','", list));
                sbLIZ.append("') ");
                interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMessagesByIds", null);
                LJIIJ(interfaceC869470Y8zLJIIJJI, arrayList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getMsgIdWithContentBy", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final List<C869590Y9l> LJJIZ(List<Long> list) {
        if (list != null && !list.isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
            try {
                try {
                    C870430YCr proxy = this.LIZJ.getProxy();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SELECT rowid,* FROM msg WHERE ");
                    sbLIZ.append(EnumC869640Y9q.COLUMN_SERVER_ID.key);
                    sbLIZ.append(" in ('");
                    sbLIZ.append(C870740YDw.LJIIIIZZ("','", list));
                    sbLIZ.append("') ");
                    interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMessagesByMessageId", null);
                    LJIIJ(interfaceC869470Y8zLJIIJJI, arrayList);
                    this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMessagesByMessageId");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZIZ.LJFF().getEventTracker().LJ(e);
                }
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return arrayList;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                throw th;
            }
        }
        return Collections.emptyList();
    }

    public final C869590Y9l LJJJ(long j) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        try {
            C870430YCr proxy = this.LIZJ.getProxy();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select rowid,* from msg where ");
            sbLIZ.append(EnumC869640Y9q.COLUMN_SERVER_ID.key);
            sbLIZ.append("=?");
            interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMsg", new String[]{String.valueOf(j)});
            if (interfaceC869470Y8zLJIIJJI != null) {
                try {
                    try {
                        if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                            C869590Y9l c869590Y9lLJIIIZ = LJIIIZ(interfaceC869470Y8zLJIIJJI);
                            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMsg");
                            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            return c869590Y9lLJIIIZ;
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getMsg", e);
                        this.LIZIZ.LJFF().getEventTracker().LJ(e);
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

    public final C869590Y9l LJJJI(String str) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C870430YCr proxy = this.LIZJ.getProxy();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select rowid,* from msg where ");
            sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
            sbLIZ.append("=?");
            interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMsg", new String[]{str});
            if (interfaceC869470Y8zLJIIJJI != null) {
                try {
                    try {
                        if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                            C869590Y9l c869590Y9lLJIIIZ = LJIIIZ(interfaceC869470Y8zLJIIJJI);
                            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMsg");
                            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            return c869590Y9lLJIIIZ;
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getMsg", e);
                        this.LIZIZ.LJFF().getEventTracker().LJ(e);
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

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a3 -> B:21:0x009d). Please report as a decompilation issue!!! */
    public final List<Long> LJJJJI(List<Long> list) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        try {
            ArrayList arrayList = new ArrayList();
            C870430YCr proxy = this.LIZJ.getProxy();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select ");
            EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_SERVER_ID;
            sbLIZ.append(enumC869640Y9q.key);
            sbLIZ.append(" from ");
            sbLIZ.append("msg");
            sbLIZ.append(" where ");
            sbLIZ.append(enumC869640Y9q.key);
            sbLIZ.append(" in ('");
            sbLIZ.append(C870740YDw.LJIIIIZZ("','", list));
            sbLIZ.append("') ");
            interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMsgIdListBy", null);
            if (interfaceC869470Y8zLJIIJJI != null) {
                try {
                    try {
                        int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(enumC869640Y9q.key);
                        while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                            arrayList.add(Long.valueOf(interfaceC869470Y8zLJIIJJI.getLong(columnIndex)));
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getMsgIdListBy", e);
                        this.LIZIZ.LJFF().getEventTracker().LJ(e);
                        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        return null;
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
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return arrayList;
        } catch (Exception e2) {
            e = e2;
            interfaceC869470Y8zLJIIJJI = null;
        } catch (Throwable th3) {
            th = th3;
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8z);
            throw th;
        }
    }

    public final long LJJJJJ(String str) {
        long j = -1;
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
                sbLIZ.append("=?");
                interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getRowid", new String[]{str});
                if (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                    j = interfaceC869470Y8zLJIIJJI.getLong(interfaceC869470Y8zLJIIJJI.getColumnIndex("rowid"));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getRowid", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return j;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final List<C869590Y9l> LJJJJL(long j) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMsgDao retryUnSendMsg, user_id:");
        sbLIZ.append(j);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SELECT rowid,* FROM msg WHERE ");
        sbLIZ2.append(EnumC869640Y9q.COLUMN_STATUS.key);
        sbLIZ2.append("=");
        sbLIZ2.append(1);
        sbLIZ2.append(" AND ");
        sbLIZ2.append(EnumC869640Y9q.COLUMN_DELETED.key);
        sbLIZ2.append("=");
        sbLIZ2.append(0);
        sbLIZ2.append(" AND ");
        sbLIZ2.append(EnumC869640Y9q.COLUMN_SENDER.key);
        sbLIZ2.append("=?");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(strLIZIZ, "getUnSendMessages", new String[]{String.valueOf(j)});
                if (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                    do {
                        arrayList.add(LJIIIZ(interfaceC869470Y8zLJIIJJI));
                    } while (interfaceC869470Y8zLJIIJJI.moveToNext());
                    C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("IMMsgDao retryUnSendMsg: # of unsent messages ");
                    sbLIZ3.append(arrayList.size());
                    c868780Y6iLIZLLL2.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
                if (interfaceC869470Y8zLJIIJJI != null) {
                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                }
                return arrayList;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao retryUnSendMsg", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
                if (interfaceC869470Y8zLJIIJJI != null) {
                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                }
                return arrayList;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (interfaceC869470Y8zLJIIJJI != null) {
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0071: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:16777329), block:B:36:0x0072 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean LJJJJZ(java.lang.String r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L9:
            r3 = 0
            X.0Y5R r0 = r6.LIZJ     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            X.0YCr r5 = r0.getProxy()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r0 = "select rowid from msg where "
            r1.append(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            X.0Y9q r0 = X.EnumC869640Y9q.COLUMN_MSG_ID     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r0 = r0.key     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            r1.append(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r0 = "=?"
            r1.append(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            r2 = 1
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            r0 = 0
            r1[r0] = r7     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            java.lang.String r0 = "hasLocalMsg"
            X.0Y8z r4 = r5.LJIIJJI(r4, r0, r1)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L49
            if (r4 == 0) goto L38
            goto L3a
        L38:
            r2 = 0
            goto L40
        L3a:
            int r0 = r4.getCount()     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L70
            if (r0 <= 0) goto L38
        L40:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L45 java.lang.Throwable -> L70
            goto L66
        L45:
            r2 = move-exception
            goto L4b
        L47:
            r1 = move-exception
            goto L72
        L49:
            r2 = move-exception
            r4 = r3
        L4b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L70
            X.0YEM r0 = r6.LIZ     // Catch: java.lang.Throwable -> L70
            X.0Y6i r1 = r0.LIZLLL()     // Catch: java.lang.Throwable -> L70
            java.lang.String r0 = "IMMsgDao hasLocalMsg"
            r1.LJIIIZ(r0, r2)     // Catch: java.lang.Throwable -> L70
            X.0XwD r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> L70
            X.0Y8y r0 = r0.LJFF()     // Catch: java.lang.Throwable -> L70
            X.0YLL r0 = r0.getEventTracker()     // Catch: java.lang.Throwable -> L70
            r0.LJ(r2)     // Catch: java.lang.Throwable -> L70
        L66:
            X.0Y5R r0 = r6.LIZJ
            X.0Y9r r0 = r0.LIZ()
            r0.LIZ(r4)
            return r3
        L70:
            r1 = move-exception
        L71:
            r3 = r4
        L72:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L76
            goto L79
        L76:
            r1 = move-exception
            r4 = r3
            goto L71
        L79:
            X.0Y5R r0 = r6.LIZJ
            X.0Y9r r0 = r0.LIZ()
            r0.LIZ(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869580Y9k.LJJJJZ(java.lang.String):java.lang.Boolean");
    }

    public final boolean LJJJLZIJ(C869590Y9l c869590Y9l) {
        boolean zLIZ = false;
        if (c869590Y9l != null && !c869590Y9l.invalid()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            LJIILJJIL(c869590Y9l);
            long jLJIIIIZZ = this.LIZJ.getProxy().LJIIIIZZ("msg", LJIIL(c869590Y9l), 0);
            c869590Y9l.setRowId(jLJIIIIZZ);
            this.LIZJ.LIZIZ().LIZIZ().LJFF(c869590Y9l);
            if (jLJIIIIZZ >= 0) {
                zLIZ = true;
            }
            if (!zLIZ) {
                this.LIZIZ.LJFF().getEventTracker().LIZLLL("insertMessage", null);
            }
            Map<String, List<C0YA1>> propertyItemListMap = c869590Y9l.getPropertyItemListMap();
            if (propertyItemListMap != null && !propertyItemListMap.isEmpty()) {
                this.LIZJ.LIZIZ().LJIIJ().LJIIIZ(c869590Y9l);
            }
            if (zLIZ && c869590Y9l.getAttachments() != null && !(zLIZ = this.LIZJ.LIZIZ().LJII().LIZ(c869590Y9l.getAttachments()))) {
                this.LIZIZ.LJFF().getEventTracker().LIZLLL("insertMessage attachment", null);
            }
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "insertMessage");
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMMsgDao insertMessage, svrId:");
            sbLIZ.append(c869590Y9l.getMsgId());
            sbLIZ.append(", uuid:");
            sbLIZ.append(c869590Y9l.getUuid());
            sbLIZ.append(", result:");
            sbLIZ.append(zLIZ);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        }
        return zLIZ;
    }

    public final boolean LJJL(long j) {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_SERVER_ID.key);
                sbLIZ.append("=?");
                interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "isMsgSaved", new String[]{String.valueOf(j)});
                if (interfaceC869470Y8zLJIIJJI != null) {
                    if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        return true;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao isMsgSaved", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final boolean LJJLIIIIJ(List<String> list) {
        ArrayList<String> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            sb.append('\"');
            sb.append(str);
            sb.append("\",");
        }
        String string = sb.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update msg set ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_READ_STATUS.key);
        sbLIZ.append("=");
        sbLIZ.append(1);
        sbLIZ.append(" where ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
        sbLIZ.append(" in (");
        sbLIZ.append(string.substring(0, string.length() - 1));
        sbLIZ.append(")");
        return this.LIZJ.getProxy().LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "markLocalMsgRead");
    }

    public final boolean LJJLIIIJILLIZJL(long j) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMsgDao markUnSendFail, user_id:");
        sbLIZ.append(j);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("update msg set ");
        EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_STATUS;
        sbLIZ2.append(enumC869640Y9q.key);
        sbLIZ2.append("=");
        sbLIZ2.append(3);
        sbLIZ2.append(" where ");
        sbLIZ2.append(EnumC869640Y9q.COLUMN_SENDER.key);
        sbLIZ2.append("='");
        sbLIZ2.append(j);
        sbLIZ2.append("' AND ");
        sbLIZ2.append(enumC869640Y9q.key);
        sbLIZ2.append("<'");
        sbLIZ2.append(2);
        sbLIZ2.append("'");
        return this.LIZJ.getProxy().LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), "markUnSendFail");
    }

    public final InterfaceC869470Y8z LJJLIIJ(String str) {
        String[] strArr = {str, String.valueOf(0), String.valueOf(0)};
        C870430YCr proxy = this.LIZJ.getProxy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select ");
        sbLIZ.append("rowid,*");
        sbLIZ.append(" from ");
        sbLIZ.append("msg");
        sbLIZ.append(" where ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
        sbLIZ.append("=? AND ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
        sbLIZ.append("=? AND ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
        sbLIZ.append("=? order by ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_ORDER_INDEX.key);
        sbLIZ.append(" desc, ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
        sbLIZ.append(" desc limit 1");
        return proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "queryForLastShowMsgCursor", strArr);
    }

    public final C0Y6Q<List<C869590Y9l>> LJJLIL(C0Y9U c0y9u) {
        String message;
        C0Y6Q<List<C869590Y9l>> c0y6qLIZ;
        if (c0y9u.LIZ.isEmpty()) {
            return C865670Xxd.LIZJ(Collections.emptyList());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                C0Y99 c0y99LIZLLL = C869600Y9m.LIZLLL(c0y9u);
                String str = c0y99LIZLLL.LIZ;
                String[] strArr = c0y99LIZLLL.LIZIZ;
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SQL: ");
                sbLIZ.append(C869600Y9m.LJ(str));
                sbLIZ.append(", params: ");
                sbLIZ.append(Arrays.toString(strArr));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c868780Y6iLIZLLL.getClass();
                C868780Y6i.LJ(c868780Y6iLIZLLL, "IMMsgDao queryMessages", strLIZIZ, 4);
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(str, "queryMessages", strArr);
                ArrayList arrayList = new ArrayList();
                LJIIJ(interfaceC869470Y8zLJIIJJI, arrayList);
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "queryMessages");
                C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Returned ");
                sbLIZ2.append(arrayList.size());
                sbLIZ2.append(" messages");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c868780Y6iLIZLLL2.getClass();
                C868780Y6i.LJ(c868780Y6iLIZLLL2, "IMMsgDao queryMessages", strLIZIZ2, 4);
                c0y6qLIZ = C865670Xxd.LIZJ(arrayList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao queryMessages", e);
                this.LIZIZ.LJFF().getEventTracker().LIZLLL("queryMessages", e);
                if (e.getMessage() != null) {
                    message = e.getMessage();
                } else {
                    message = "queryMessages failed";
                }
                c0y6qLIZ = C865670Xxd.LIZ(-1, message);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return c0y6qLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final String LJJZZIII(String str) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C870430YCr proxy = this.LIZJ.getProxy();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select ");
            sbLIZ.append(EnumC869640Y9q.COLUMN_LOCAL_INFO.key);
            sbLIZ.append(" from ");
            sbLIZ.append("msg");
            sbLIZ.append(" where ");
            sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
            sbLIZ.append("=?");
            interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "readLocalExtStrFromDb", new String[]{str});
            if (interfaceC869470Y8zLJIIJJI != null) {
                try {
                    try {
                        if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                            String string = interfaceC869470Y8zLJIIJJI.getString(0);
                            if (string == null) {
                                string = "";
                            }
                            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            return string;
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMMsgDao readLocalExtStrFromDb", e);
                        this.LIZIZ.LJFF().getEventTracker().LJ(e);
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

    public final void LJL(C869590Y9l c869590Y9l) throws Throwable {
        Map<String, String> mapLIZIZ;
        String strLJJZZIII = LJJZZIII(c869590Y9l.getUuid());
        if (strLJJZZIII == null) {
            return;
        }
        if (strLJJZZIII.isEmpty() || (mapLIZIZ = C09EF.LIZIZ(strLJJZZIII)) == null) {
            mapLIZIZ = new HashMap<>();
        }
        c869590Y9l.setLocalExt(mapLIZIZ);
    }

    public final boolean LJLI(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC869640Y9q.COLUMN_DELETED.key, (Integer) 0);
            C870430YCr proxy = this.LIZJ.getProxy();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
            sbLIZ.append("=?");
            boolean z = true;
            if (proxy.LJIILJJIL("msg", contentValues, C2188811AlT.LIZIZ(sbLIZ), new String[]{str}) > 0) {
                this.LIZJ.LIZIZ().LIZJ().LLJJIJI(str, "local_delete_time");
                this.LIZJ.LIZIZ().LIZJ().LLJJIJI(str, "local_delete_is_local");
            } else {
                z = false;
            }
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IMMsgDao undoMarkMsgAsDeleted, uuid:");
            sbLIZ2.append(str);
            sbLIZ2.append(", result:");
            sbLIZ2.append(z);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIZ("IMMsgDao undoMarkMsgAsDeleted", e);
            this.LIZ.LJIIZILJ().LJFF().getEventTracker().LJ(e);
            return false;
        }
    }

    public final boolean LJLILLLLZI(C869590Y9l c869590Y9l) {
        return LJIJI(c869590Y9l, C0YAZ.WRITE_WHOLE, null, null, true, true);
    }

    public final boolean LJLJJL(C869590Y9l c869590Y9l) {
        boolean z = false;
        if (!c869590Y9l.invalid()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues contentValues = new ContentValues();
                String str = EnumC869640Y9q.COLUMN_CONTENT_PB.key;
                ByteString contentPB = c869590Y9l.getContentPB();
                if (contentPB == null) {
                    contentPB = ByteString.EMPTY;
                }
                contentValues.put(str, contentPB.toByteArray());
                String str2 = EnumC869640Y9q.COLUMN_EXT.key;
                String extStr = c869590Y9l.getExtStr();
                if (extStr == null) {
                    extStr = "";
                }
                contentValues.put(str2, extStr);
                contentValues.put(EnumC869640Y9q.COLUMN_TTL.key, Long.valueOf(c869590Y9l.getTtl()));
                contentValues.put(EnumC869640Y9q.COLUMN_CONTENT.key, c869590Y9l.getContent());
                contentValues.put(EnumC869640Y9q.COLUMN_SCENE.key, c869590Y9l.getScene());
                String str3 = EnumC869640Y9q.COLUMN_BIZ_PERSISTENT_EXTRA.key;
                ByteString persistentExtra = c869590Y9l.getPersistentExtra();
                if (persistentExtra == null) {
                    persistentExtra = ByteString.EMPTY;
                }
                contentValues.put(str3, persistentExtra.toByteArray());
                if (this.LIZ.LJIIIZ().LJJLIIIIJ.LJJIIJZLJL) {
                    contentValues.put(EnumC869640Y9q.COLUMN_MSG_TYPE.key, Integer.valueOf(c869590Y9l.getMsgType()));
                }
                LJIILJJIL(c869590Y9l);
                contentValues.put(EnumC869640Y9q.COLUMN_TABLE_FLAG.key, Long.valueOf(c869590Y9l.getTableFlag()));
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
                sbLIZ.append("=?");
                if (proxy.LJIILJJIL("msg", contentValues, C2188811AlT.LIZIZ(sbLIZ), new String[]{c869590Y9l.getUuid()}) > 0) {
                    z = true;
                }
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateMessagePbAndExt");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao updateMessagePbAndExt", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IMMsgDao updateMessagePbAndExt end, svrId:");
            sbLIZ2.append(c869590Y9l.getMsgId());
            sbLIZ2.append(", uuid:");
            sbLIZ2.append(c869590Y9l.getUuid());
            sbLIZ2.append(", result:");
            sbLIZ2.append(z);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        }
        return z;
    }

    public final boolean LJLJL(C869590Y9l c869590Y9l) {
        C0YAZ c0yaz;
        if (LJJJZ()) {
            c0yaz = C0YAZ.SKIP;
        } else {
            c0yaz = C0YAZ.WRITE_WHOLE;
        }
        return LJIJI(c869590Y9l, c0yaz, null, null, true, true);
    }

    public final boolean LJLJLLL(C869590Y9l c869590Y9l) {
        ContentValues contentValuesLJIIL = LJIIL(c869590Y9l);
        EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_MSG_ID;
        contentValuesLJIIL.remove(enumC869640Y9q.key);
        contentValuesLJIIL.remove(EnumC869640Y9q.COLUMN_LOCAL_INFO.key);
        C870430YCr proxy = this.LIZJ.getProxy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC869640Y9q.key);
        sbLIZ.append("=?");
        if (proxy.LJIILJJIL("msg", contentValuesLJIIL, C2188811AlT.LIZIZ(sbLIZ), new String[]{c869590Y9l.getUuid()}) > 0) {
            return true;
        }
        return false;
    }

    public final boolean LJLL(String str) {
        long j;
        if (!((ArrayList) this.LIZJ.LIZIZ().LJII().LJ(str)).isEmpty()) {
            j = 1;
        } else {
            j = 0;
        }
        Map<String, List<C0YA1>> mapLJI = this.LIZJ.LIZIZ().LJIIJ().LJI(str);
        if (mapLJI != null && !mapLJI.isEmpty()) {
            j |= 2;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC869640Y9q.COLUMN_TABLE_FLAG.key, Long.valueOf(j));
            C870430YCr proxy = this.LIZJ.getProxy();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
            sbLIZ.append("=?");
            if (proxy.LJIILJJIL("msg", contentValues, C2188811AlT.LIZIZ(sbLIZ), new String[]{str}) < 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIZ("IMMsgDao updateTableFlag", e);
            this.LIZIZ.LJFF().getEventTracker().LJ(e);
            return false;
        }
    }

    public final boolean LJLLI(Set<String> set) {
        int iMin;
        int i = this.LIZ.LJIIIZ().LJJLIIIIJ.LJJIJ.updateMessageBatchSize;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (set.isEmpty()) {
            return false;
        }
        try {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            for (String str : set) {
                if (i2 > 0) {
                    sb.append(",");
                }
                sb.append("'");
                sb.append(str);
                sb.append("'");
                i2++;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" AND ");
            sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
            sbLIZ.append(" IN (");
            sbLIZ.append((Object) sb);
            sbLIZ.append(")");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SELECT COUNT(*) FROM msg WHERE ");
            sbLIZ2.append(EnumC869640Y9q.COLUMN_STATUS.key);
            sbLIZ2.append(" = ");
            sbLIZ2.append(6);
            sbLIZ2.append(strLIZIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
            try {
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(strLIZIZ2, "updateTemporaryReceivedMessagesToNormal_count", null);
                if (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                    iMin = interfaceC869470Y8zLJIIJJI.getInt(0);
                } else {
                    iMin = 0;
                }
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                if (iMin == 0) {
                    this.LIZ.LIZLLL().LJFF("IMMsgDao updateTemporaryReceivedMessagesToNormal, no temporary messages found");
                    this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateTemporaryReceivedMessagesToNormal");
                    return false;
                }
                int i3 = this.LIZ.LJIIIZ().LJJLIIIIJ.LJJIJ.updateMessageMaxMessageCount;
                if (i3 > 0) {
                    iMin = Math.min(iMin, i3);
                }
                int i4 = ((iMin + i) - 1) / i;
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("IMMsgDao updateTemporaryReceivedMessagesToNormal, found ");
                sbLIZ3.append(iMin);
                sbLIZ3.append(" messages to update, will execute ");
                sbLIZ3.append(i4);
                sbLIZ3.append(" batch rounds with batch size ");
                sbLIZ3.append(i);
                c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
                int iMin2 = 0;
                for (int i5 = 0; i5 < i4; i5++) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("UPDATE msg SET ");
                    EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_STATUS;
                    sbLIZ4.append(enumC869640Y9q.key);
                    sbLIZ4.append(" = ");
                    sbLIZ4.append(5);
                    sbLIZ4.append(", ");
                    sbLIZ4.append(EnumC869640Y9q.COLUMN_ORDER_INDEX.key);
                    sbLIZ4.append(" = ");
                    sbLIZ4.append(EnumC869640Y9q.COLUMN_INNER_INDEX.key);
                    sbLIZ4.append(" * ");
                    sbLIZ4.append(1000L);
                    sbLIZ4.append(" WHERE rowid IN (   SELECT rowid FROM ");
                    sbLIZ4.append("msg");
                    sbLIZ4.append("   WHERE ");
                    sbLIZ4.append(enumC869640Y9q.key);
                    sbLIZ4.append(" = ");
                    sbLIZ4.append(6);
                    sbLIZ4.append(strLIZIZ);
                    sbLIZ4.append("   ORDER BY rowid DESC   LIMIT ");
                    sbLIZ4.append(i);
                    sbLIZ4.append(")");
                    this.LIZJ.getProxy().LIZLLL(C2188811AlT.LIZIZ(sbLIZ4), "updateTemporaryReceivedMessagesToNormal");
                    iMin2 += Math.min(i, iMin - (i5 * i));
                }
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateTemporaryReceivedMessagesToNormal");
                C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("IMMsgDao updateTemporaryReceivedMessagesToNormal, conversationIds:");
                sbLIZ5.append(set.size());
                sbLIZ5.append(", batchSize:");
                sbLIZ5.append(i);
                sbLIZ5.append(", totalUpdated:");
                sbLIZ5.append(iMin2);
                c868780Y6iLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ5));
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIZ("IMMsgDao updateTemporaryReceivedMessagesToNormal", e);
            this.LIZIZ.LJFF().getEventTracker().LIZLLL("updateTemporaryReceivedMessagesToNormal", e);
            return false;
        }
    }

    public static void LJII(InterfaceC869960YAw interfaceC869960YAw, C869590Y9l c869590Y9l) {
        long jLongValue;
        if (c869590Y9l != null) {
            int iOrdinal = EnumC869640Y9q.COLUMN_MSG_ID.ordinal() + 1;
            String uuid = c869590Y9l.getUuid();
            String str = "";
            if (uuid == null) {
                uuid = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal, uuid);
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_SERVER_ID.ordinal() + 1, c869590Y9l.getMsgId());
            int iOrdinal2 = EnumC869640Y9q.COLUMN_CONVERSATION_ID.ordinal() + 1;
            String conversationId = c869590Y9l.getConversationId();
            if (conversationId == null) {
                conversationId = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal2, conversationId);
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_CONVERSATION_SHORT_ID.ordinal() + 1, c869590Y9l.getConversationShortId());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_CONVERSATION_TYPE.ordinal() + 1, c869590Y9l.getConversationType());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_MSG_TYPE.ordinal() + 1, c869590Y9l.getMsgType());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_INNER_INDEX.ordinal() + 1, c869590Y9l.getIndex());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_ORDER_INDEX.ordinal() + 1, c869590Y9l.getOrderIndex());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_STATUS.ordinal() + 1, c869590Y9l.getMsgStatus());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_NET_STATUS.ordinal() + 1, c869590Y9l.getSvrStatus());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_VERSION.ordinal() + 1, c869590Y9l.getVersion());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_DELETED.ordinal() + 1, c869590Y9l.getDeleted());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_CREATE_TIME.ordinal() + 1, c869590Y9l.getCreatedAt());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_LOCAL_CREATE_TIME.ordinal() + 1, c869590Y9l.getLocalCreatedAt());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_SENDER.ordinal() + 1, c869590Y9l.getSender());
            int iOrdinal3 = EnumC869640Y9q.COLUMN_CONTENT.ordinal() + 1;
            String content = c869590Y9l.getContent();
            if (content == null) {
                content = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal3, content);
            int iOrdinal4 = EnumC869640Y9q.COLUMN_CONTENT_PB.ordinal() + 1;
            ByteString contentPB = c869590Y9l.getContentPB();
            if (contentPB == null) {
                contentPB = ByteString.EMPTY;
            }
            interfaceC869960YAw.LJJIIJZLJL(iOrdinal4, contentPB.toByteArray());
            int iOrdinal5 = EnumC869640Y9q.COLUMN_SCENE.ordinal() + 1;
            String scene = c869590Y9l.getScene();
            if (scene == null) {
                scene = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal5, scene);
            int iOrdinal6 = EnumC869640Y9q.COLUMN_EXT.ordinal() + 1;
            String extStr = c869590Y9l.getExtStr();
            if (extStr == null) {
                extStr = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal6, extStr);
            int iOrdinal7 = EnumC869640Y9q.COLUMN_LOCAL_INFO.ordinal() + 1;
            String localExtStr = c869590Y9l.getLocalExtStr();
            if (localExtStr == null) {
                localExtStr = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal7, localExtStr);
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_READ_STATUS.ordinal() + 1, c869590Y9l.getReadStatus());
            interfaceC869960YAw.LJIILIIL(EnumC869640Y9q.COLUMN_SEC_SENDER.ordinal() + 1, c869590Y9l.getSecSender());
            interfaceC869960YAw.LJIILIIL(EnumC869640Y9q.COLUMN_PROPERTY_LIST.ordinal() + 1, "");
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_INDEX_IN_CONVERSATION_V2.ordinal() + 1, c869590Y9l.getIndexInConversationV2());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_TABLE_FLAG.ordinal() + 1, c869590Y9l.getTableFlag());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_CONV_RANK_UPDATE_RULE.ordinal() + 1, c869590Y9l.getConvRankUpdateRule());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_TTL.ordinal() + 1, c869590Y9l.getTtl());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_PREV_INDEX.ordinal() + 1, c869590Y9l.getPrevIndex());
            int iOrdinal8 = EnumC869640Y9q.COLUMN_BIZ_PERSISTENT_EXTRA.ordinal() + 1;
            ByteString persistentExtra = c869590Y9l.getPersistentExtra();
            if (persistentExtra == null) {
                persistentExtra = ByteString.EMPTY;
            }
            interfaceC869960YAw.LJJIIJZLJL(iOrdinal8, persistentExtra.toByteArray());
            int iOrdinal9 = EnumC869640Y9q.COLUMN_SOURCE_VREGION.ordinal() + 1;
            String sourceVregion = c869590Y9l.getSourceVregion();
            if (sourceVregion != null) {
                str = sourceVregion;
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal9, str);
            Integer sourceAppId = c869590Y9l.getSourceAppId();
            int iOrdinal10 = EnumC869640Y9q.COLUMN_SOURCE_APP_ID.ordinal() + 1;
            if (sourceAppId != null) {
                jLongValue = sourceAppId.longValue();
            } else {
                jLongValue = 0;
            }
            interfaceC869960YAw.LJIJ(iOrdinal10, jLongValue);
        }
    }

    public static void LJIIIIZZ(InterfaceC869960YAw interfaceC869960YAw, C869590Y9l c869590Y9l) {
        long jLongValue;
        if (c869590Y9l != null) {
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_SERVER_ID.ordinal(), c869590Y9l.getMsgId());
            int iOrdinal = EnumC869640Y9q.COLUMN_CONVERSATION_ID.ordinal();
            String conversationId = c869590Y9l.getConversationId();
            String str = "";
            if (conversationId == null) {
                conversationId = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal, conversationId);
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_CONVERSATION_SHORT_ID.ordinal(), c869590Y9l.getConversationShortId());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_CONVERSATION_TYPE.ordinal(), c869590Y9l.getConversationType());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_MSG_TYPE.ordinal(), c869590Y9l.getMsgType());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_INNER_INDEX.ordinal(), c869590Y9l.getIndex());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_ORDER_INDEX.ordinal(), c869590Y9l.getOrderIndex());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_STATUS.ordinal(), c869590Y9l.getMsgStatus());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_NET_STATUS.ordinal(), c869590Y9l.getSvrStatus());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_VERSION.ordinal(), c869590Y9l.getVersion());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_DELETED.ordinal(), c869590Y9l.getDeleted());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_CREATE_TIME.ordinal(), c869590Y9l.getCreatedAt());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_LOCAL_CREATE_TIME.ordinal(), c869590Y9l.getLocalCreatedAt());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_SENDER.ordinal(), c869590Y9l.getSender());
            int iOrdinal2 = EnumC869640Y9q.COLUMN_CONTENT.ordinal();
            String content = c869590Y9l.getContent();
            if (content == null) {
                content = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal2, content);
            int iOrdinal3 = EnumC869640Y9q.COLUMN_CONTENT_PB.ordinal();
            ByteString contentPB = c869590Y9l.getContentPB();
            if (contentPB == null) {
                contentPB = ByteString.EMPTY;
            }
            interfaceC869960YAw.LJJIIJZLJL(iOrdinal3, contentPB.toByteArray());
            int iOrdinal4 = EnumC869640Y9q.COLUMN_SCENE.ordinal();
            String scene = c869590Y9l.getScene();
            if (scene == null) {
                scene = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal4, scene);
            int iOrdinal5 = EnumC869640Y9q.COLUMN_EXT.ordinal();
            String extStr = c869590Y9l.getExtStr();
            if (extStr == null) {
                extStr = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal5, extStr);
            int iOrdinal6 = EnumC869640Y9q.COLUMN_LOCAL_INFO.ordinal();
            String localExtStr = c869590Y9l.getLocalExtStr();
            if (localExtStr == null) {
                localExtStr = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal6, localExtStr);
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_READ_STATUS.ordinal(), c869590Y9l.getReadStatus());
            interfaceC869960YAw.LJIILIIL(EnumC869640Y9q.COLUMN_SEC_SENDER.ordinal(), c869590Y9l.getSecSender());
            interfaceC869960YAw.LJIILIIL(EnumC869640Y9q.COLUMN_PROPERTY_LIST.ordinal(), "");
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_INDEX_IN_CONVERSATION_V2.ordinal(), c869590Y9l.getIndexInConversationV2());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_TABLE_FLAG.ordinal(), c869590Y9l.getTableFlag());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_CONV_RANK_UPDATE_RULE.ordinal(), c869590Y9l.getConvRankUpdateRule());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_TTL.ordinal(), c869590Y9l.getTtl());
            interfaceC869960YAw.LJIJ(EnumC869640Y9q.COLUMN_PREV_INDEX.ordinal(), c869590Y9l.getPrevIndex());
            int iOrdinal7 = EnumC869640Y9q.COLUMN_BIZ_PERSISTENT_EXTRA.ordinal();
            ByteString persistentExtra = c869590Y9l.getPersistentExtra();
            if (persistentExtra == null) {
                persistentExtra = ByteString.EMPTY;
            }
            interfaceC869960YAw.LJJIIJZLJL(iOrdinal7, persistentExtra.toByteArray());
            int iOrdinal8 = EnumC869640Y9q.COLUMN_SOURCE_VREGION.ordinal();
            String sourceVregion = c869590Y9l.getSourceVregion();
            if (sourceVregion != null) {
                str = sourceVregion;
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal8, str);
            Integer sourceAppId = c869590Y9l.getSourceAppId();
            int iOrdinal9 = EnumC869640Y9q.COLUMN_SOURCE_APP_ID.ordinal();
            if (sourceAppId != null) {
                jLongValue = sourceAppId.longValue();
            } else {
                jLongValue = 0;
            }
            interfaceC869960YAw.LJIJ(iOrdinal9, jLongValue);
        }
    }

    public static Object LJJI(C869590Y9l c869590Y9l, String str) {
        if (str.equals(EnumC869640Y9q.COLUMN_SERVER_ID.key)) {
            return Long.valueOf(c869590Y9l.getMsgId());
        }
        if (str.equals(EnumC869640Y9q.COLUMN_STATUS.key)) {
            return Integer.valueOf(c869590Y9l.getMsgStatus());
        }
        if (str.equals(EnumC869640Y9q.COLUMN_LOCAL_INFO.key)) {
            return c869590Y9l.getLocalExtStr();
        }
        if (str.equals(EnumC869640Y9q.COLUMN_CONTENT.key)) {
            return c869590Y9l.getContent();
        }
        return null;
    }

    public static String LJJJJLL(long j, String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (j > 0) {
            sb.append(" update msg set ");
            for (EnumC869640Y9q enumC869640Y9q : EnumC869640Y9q.values()) {
                if (!"msg_uuid".equals(enumC869640Y9q.key)) {
                    sb.append(enumC869640Y9q.key);
                    sb.append("=?,");
                }
            }
            String string = sb.toString();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string.substring(0, string.length() - 1));
            sbLIZ.append(" where msg_uuid='");
            if (str == null) {
                str = "";
            }
            sbLIZ.append(str);
            sbLIZ.append("'");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        sb.append(" insert into msg(");
        for (EnumC869640Y9q enumC869640Y9q2 : EnumC869640Y9q.values()) {
            sb.append(enumC869640Y9q2.key);
            sb.append(",");
            sb2.append("?,");
        }
        String string2 = sb.toString();
        String string3 = sb2.toString();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(string2.substring(0, string2.length() - 1));
        sbLIZ2.append(") values (");
        sbLIZ2.append(string3.substring(0, string3.length() - 1));
        sbLIZ2.append(");");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.InterfaceC869780YAe
    public final long LIZIZ(long j, String str) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMsgDao getOrderIndex, convId:");
        sbLIZ.append(str);
        sbLIZ.append(", mgsIndex:");
        sbLIZ.append(j);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("select ");
                EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_ORDER_INDEX;
                sbLIZ2.append(enumC869640Y9q.key);
                sbLIZ2.append(" from ");
                sbLIZ2.append("msg");
                sbLIZ2.append(" where ");
                sbLIZ2.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ2.append("=? AND ");
                sbLIZ2.append(EnumC869640Y9q.COLUMN_DELETED.key);
                sbLIZ2.append("=? AND ");
                sbLIZ2.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
                sbLIZ2.append("=? AND ");
                sbLIZ2.append(EnumC869640Y9q.COLUMN_INNER_INDEX.key);
                sbLIZ2.append("=? order by ");
                sbLIZ2.append(enumC869640Y9q.key);
                sbLIZ2.append(" desc, ");
                sbLIZ2.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
                sbLIZ2.append(" desc limit 1");
                interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2), "getOrderIndex", new String[]{str, String.valueOf(0), String.valueOf(0), String.valueOf(j)});
                if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                    long j2 = interfaceC869470Y8zLJIIJJI.getLong(interfaceC869470Y8zLJIIJJI.getColumnIndex(enumC869640Y9q.key));
                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return j2;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getOrderIndex", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return 0L;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final void LJIIJ(InterfaceC869470Y8z interfaceC869470Y8z, List<C869590Y9l> list) throws Throwable {
        LJIIJJI(interfaceC869470Y8z, list, true, false, false, false);
    }

    public final long LJIILL(long j, String str) {
        String str2;
        long count;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        boolean z = this.LIZ.LJIILL().LIZ.LIZLLL.invoke().enableCountSqlRewrite;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        if (!z) {
            str2 = "select * from ";
        } else {
            str2 = "select COUNT(1) from ";
        }
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append("msg");
                sbLIZ.append(" where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_INNER_INDEX.key);
                sbLIZ.append(">? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_READ_STATUS.key);
                sbLIZ.append("=?");
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "computeUnreadMsgCount", new String[]{str, String.valueOf(0), String.valueOf(j), String.valueOf(0), String.valueOf(0)});
                if (z) {
                    if (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                        count = interfaceC869470Y8zLJIIJJI.getLong(0);
                    } else {
                        count = 0;
                    }
                } else {
                    count = interfaceC869470Y8zLJIIJJI.getCount();
                }
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "computeUnreadMsgCount");
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return count;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJI("IMMsgDao computeUnreadMsgCount error");
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("IMMsgDao computeUnreadMsgCount:0, cid:");
                sbLIZ2.append(str);
                c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                return 0L;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final void LJIJJ(C869590Y9l c869590Y9l, String str) {
        HashMap map = new HashMap();
        ReferenceInfo referenceInfo = c869590Y9l.getReferenceInfo();
        if (referenceInfo != null) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("converted msg ref info: ");
            sbLIZ.append(referenceInfo.referenced_message_id);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c868780Y6iLIZLLL.getClass();
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMMsgDao ", strLIZIZ, 4);
            try {
                String strLJIILL = C09EF.LIZ.LJIILL(referenceInfo);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ref_");
                sbLIZ2.append(referenceInfo.referenced_message_id);
                map.put(C2188811AlT.LIZIZ(sbLIZ2), strLJIILL);
                this.LIZJ.LIZIZ().LIZJ().LIZ(c869590Y9l.getUuid(), c869590Y9l.getConversationId(), map);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LJIIZILJ().LJFF().getEventTracker().LIZLLL("IMMsgDao ", e);
            }
        }
        this.LIZ.LJIIZILJ().getMessage().LIZJ().LIZ(c869590Y9l.getUuid(), c869590Y9l.getConversationId(), str);
    }

    public final boolean LJIL(long j, String str) {
        C870430YCr proxy = this.LIZJ.getProxy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
        sbLIZ.append("=? AND ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_ORDER_INDEX.key);
        sbLIZ.append("<=?");
        boolean zLIZIZ = proxy.LIZIZ("msg", C2188811AlT.LIZIZ(sbLIZ), new String[]{str, String.valueOf(1000 * j)});
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("IMMsgDao forceDeleteMsgByMinIndex, cid:");
        sbLIZ2.append(str);
        sbLIZ2.append(", minIndex:");
        sbLIZ2.append(j);
        sbLIZ2.append(", ret:");
        sbLIZ2.append(zLIZIZ);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
        C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("IMMsgDao forceDeleteMsgByMinIndex, cid:");
        sbLIZ3.append(str);
        sbLIZ3.append(", result:");
        sbLIZ3.append(zLIZIZ);
        c868780Y6iLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
        return zLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7, types: [X.0Y9k] */
    public final List LJJIJIL(long j, List list) throws Throwable {
        ArrayList arrayList;
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        StringBuilder sb = new StringBuilder(e3.h);
        int i = 0;
        while (true) {
            arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                break;
            }
            sb.append('?');
            if (i != arrayList.size() - 1) {
                sb.append(',');
            }
            i++;
        }
        sb.append(')');
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select rowid, * from msg where ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_TYPE.key);
        sbLIZ.append(" in ");
        sbLIZ.append((Object) sb);
        sbLIZ.append(" and ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
        sbLIZ.append("=? and ");
        EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_CREATE_TIME;
        sbLIZ.append(enumC869640Y9q.key);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("<=?");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append(" order by ");
        sbLIZ3.append(enumC869640Y9q.key);
        sbLIZ3.append(" desc limit ?");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        String[] strArr = new String[arrayList.size() + 3];
        C869580Y9k it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            strArr[i2] = String.valueOf(it2.next());
            i2++;
        }
        int i3 = i2 + 1;
        strArr[i2] = String.valueOf(0);
        strArr[i3] = String.valueOf(j);
        strArr[i3 + 1] = String.valueOf(250L);
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        try {
            try {
                it2 = this;
                interfaceC869470Y8zLJIIJJI = it2.LIZJ.getProxy().LJIIJJI(strLIZIZ3, "getLimitMessageListByOldestCreateTime", strArr);
                try {
                    ArrayList arrayList2 = new ArrayList();
                    it2.LJIIJJI(interfaceC869470Y8zLJIIJJI, arrayList2, false, false, false, false);
                    it2.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return arrayList2;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    it2.LIZ.LIZLLL().LJIIIZ("IMMsgDao ", e);
                    it2.LIZIZ.LJFF().getEventTracker().LJ(e);
                    it2.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                interfaceC869470Y8z = null;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        it2.LIZJ.LIZ().LIZ(interfaceC869470Y8z);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        interfaceC869470Y8z = interfaceC869470Y8z;
                    }
                    interfaceC869470Y8z = interfaceC869470Y8z;
                }
            }
        } catch (Exception e2) {
            e = e2;
            interfaceC869470Y8zLJIIJJI = null;
        } catch (Throwable th3) {
            th = th3;
            while (true) {
                TryCatchGuardChecker.doCheck(th);
                it2.LIZJ.LIZ().LIZ(interfaceC869470Y8z);
                throw th;
                interfaceC869470Y8z = interfaceC869470Y8z;
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00b5: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:33554613), block:B:22:0x00b5 */
    public final C869590Y9l LJJJIL(long j, String str) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z;
        InterfaceC869470Y8z interfaceC869470Y8z2 = null;
        if (j <= 0) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid,* from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_INNER_INDEX.key);
                sbLIZ.append("=? and ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append(" =?  and ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_SERVER_ID.key);
                sbLIZ.append(" >0 ");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(j);
                sbLIZ2.append("");
                interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(strLIZIZ, "getMsgByIndex", new String[]{C2188811AlT.LIZIZ(sbLIZ2), str});
                try {
                    if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                        C869590Y9l c869590Y9lLJIIIZ = LJIIIZ(interfaceC869470Y8zLJIIJJI);
                        this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMsg");
                        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        return c869590Y9lLJIIIZ;
                    }
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getMsg", e);
                    this.LIZIZ.LJFF().getEventTracker().LJ(e);
                }
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
        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0096: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:33554582), block:B:20:0x0096 */
    public final C869590Y9l LJJJJ(long j, String str) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC869470Y8z interfaceC869470Y8z2 = null;
        try {
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid,* from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_SERVER_ID.key);
                sbLIZ.append("=? or ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
                sbLIZ.append("=?");
                interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMsgByServerOrLocalId", new String[]{String.valueOf(j), str});
                if (interfaceC869470Y8zLJIIJJI != null) {
                    try {
                        if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                            C869590Y9l c869590Y9lLJIIIZ = LJIIIZ(interfaceC869470Y8zLJIIJJI);
                            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMsgByServerOrLocalId");
                            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            return c869590Y9lLJIIIZ;
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getMsgByServerOrLocalId", e);
                        this.LIZIZ.LJFF().getEventTracker().LJ(e);
                    }
                }
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
        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
        return null;
    }

    public final List LJJJJIZL(long j, List list) {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid,* from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
                sbLIZ.append(" in ('");
                sbLIZ.append(C870740YDw.LJIIIIZZ("','", list));
                sbLIZ.append("')  AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_INNER_INDEX.key);
                sbLIZ.append(">? order by ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_ORDER_INDEX.key);
                sbLIZ.append(" desc, ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
                sbLIZ.append(" desc");
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getMsgList", new String[]{String.valueOf(0), String.valueOf(0), String.valueOf(j)});
                if (list.size() < 999) {
                    LJIIJ(interfaceC869470Y8zLJIIJJI, arrayList);
                } else {
                    while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                        arrayList.add(LJIIIZ(interfaceC869470Y8zLJIIJJI));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getMsgList", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(null);
            throw th;
        }
    }

    public final List LJJJJLI(long j, String str) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMsgDao getUnSendMessagesByConversation, conversationId:");
        sbLIZ.append(str);
        sbLIZ.append(", senderId:");
        sbLIZ.append(j);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SELECT rowid,* FROM msg WHERE ");
        sbLIZ2.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
        sbLIZ2.append("=? AND ");
        sbLIZ2.append(EnumC869640Y9q.COLUMN_SENDER.key);
        sbLIZ2.append("=? AND (");
        EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_STATUS;
        sbLIZ2.append(enumC869640Y9q.key);
        sbLIZ2.append("=");
        sbLIZ2.append(1);
        sbLIZ2.append(" OR ");
        sbLIZ2.append(enumC869640Y9q.key);
        sbLIZ2.append("=");
        sbLIZ2.append(3);
        sbLIZ2.append(") AND ");
        sbLIZ2.append(EnumC869640Y9q.COLUMN_DELETED.key);
        sbLIZ2.append("=");
        sbLIZ2.append(0);
        sbLIZ2.append(" ORDER BY ");
        sbLIZ2.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
        sbLIZ2.append(" ASC");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(strLIZIZ, "getUnSendMessagesByConversation", new String[]{str, String.valueOf(j)});
                if (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                    do {
                        arrayList.add(LJIIIZ(interfaceC869470Y8zLJIIJJI));
                    } while (interfaceC869470Y8zLJIIJJI.moveToNext());
                    C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("IMMsgDao getUnSendMessagesByConversation: # of unsent messages ");
                    sbLIZ3.append(arrayList.size());
                    c868780Y6iLIZLLL2.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
                if (interfaceC869470Y8zLJIIJJI != null) {
                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                }
                return arrayList;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao getUnSendMessagesByConversation", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
                if (interfaceC869470Y8zLJIIJJI != null) {
                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                }
                return arrayList;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (interfaceC869470Y8zLJIIJJI != null) {
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            }
            throw th;
        }
    }

    public final boolean LJJLI(long j, String str) {
        ContentValues contentValues = new ContentValues();
        EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_READ_STATUS;
        contentValues.put(enumC869640Y9q.key, (Integer) 1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
        sbLIZ.append("=? AND ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_INNER_INDEX.key);
        sbLIZ.append("<? AND ");
        sbLIZ.append(enumC869640Y9q.key);
        sbLIZ.append("=?");
        if (this.LIZJ.getProxy().LJIILJJIL("msg", contentValues, C2188811AlT.LIZIZ(sbLIZ), new String[]{str, String.valueOf(j), String.valueOf(0)}) > 0) {
            return true;
        }
        return false;
    }

    public final boolean LJJLIIIJJI(long j, List<Integer> list) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMsgDao markUnSendFail with msgType filter, user_id:");
        sbLIZ.append(j);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        if (list == null || list.isEmpty()) {
            return false;
        }
        StringBuilder sb = new StringBuilder(e3.h);
        for (int i = 0; i < list.size(); i++) {
            sb.append(ListProtector.get(list, i));
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("update msg set ");
        EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_STATUS;
        sbLIZ2.append(enumC869640Y9q.key);
        sbLIZ2.append("=");
        sbLIZ2.append(3);
        sbLIZ2.append(" where ");
        sbLIZ2.append(EnumC869640Y9q.COLUMN_SENDER.key);
        sbLIZ2.append("='");
        sbLIZ2.append(j);
        sbLIZ2.append("' AND ");
        sbLIZ2.append(enumC869640Y9q.key);
        sbLIZ2.append("<'");
        sbLIZ2.append(2);
        sbLIZ2.append("' AND ");
        sbLIZ2.append(EnumC869640Y9q.COLUMN_MSG_TYPE.key);
        sbLIZ2.append(" IN ");
        sbLIZ2.append((Object) sb);
        return this.LIZJ.getProxy().LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), "markUnSendFail with msgType filter");
    }

    public final boolean LJJLIIIJLJLI(C869590Y9l c869590Y9l, List list) {
        return LJIJ(c869590Y9l, list, C0YAZ.SKIP, null, null);
    }

    public final void LJLIIIL(C869590Y9l c869590Y9l, boolean z) {
        this.LIZJ.LIZIZ().LIZIZ().LJFF(c869590Y9l);
        if (z) {
            this.LIZJ.LIZIZ().LJIIJ().LJIIIZ(c869590Y9l);
        }
    }

    public final boolean LJLIL(String str, Map<String, String> map) {
        C869590Y9l c869590Y9lLJJJI;
        if (TextUtils.isEmpty(str) || (c869590Y9lLJJJI = LJJJI(str)) == null || c869590Y9lLJJJI.invalid()) {
            return false;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMsgDao updateMessageExt, uuid:");
        sbLIZ.append(c869590Y9lLJJJI.getUuid());
        sbLIZ.append(", ext:");
        sbLIZ.append(c869590Y9lLJJJI.getExtStr());
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        ContentValues contentValues = new ContentValues();
        String str2 = EnumC869640Y9q.COLUMN_EXT.key;
        String strLIZ = C09EF.LIZ(map);
        if (strLIZ == null) {
            strLIZ = "";
        }
        contentValues.put(str2, strLIZ);
        C870430YCr proxy = this.LIZJ.getProxy();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
        sbLIZ2.append("=?");
        if (proxy.LJIILJJIL("msg", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{c869590Y9lLJJJI.getUuid()}) < 0) {
            return false;
        }
        return true;
    }

    public final C869590Y9l LJLJI(String str, Map<String, String> map) {
        C869590Y9l c869590Y9lLJJJI;
        if (TextUtils.isEmpty(str) || (c869590Y9lLJJJI = LJJJI(str)) == null || c869590Y9lLJJJI.invalid()) {
            return null;
        }
        return LJLJJI(c869590Y9lLJJJI, map);
    }

    public final C869590Y9l LJLJJI(C869590Y9l c869590Y9l, Map<String, String> map) {
        String strLIZ = C09EF.LIZ(map);
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMsgDao updateMessageLocalExt, uuid:");
        sbLIZ.append(c869590Y9l.getUuid());
        sbLIZ.append(", localExtStr:");
        sbLIZ.append(strLIZ);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        ContentValues contentValues = new ContentValues();
        String str = EnumC869640Y9q.COLUMN_LOCAL_INFO.key;
        if (strLIZ == null) {
            strLIZ = "";
        }
        contentValues.put(str, strLIZ);
        C870430YCr proxy = this.LIZJ.getProxy();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
        sbLIZ2.append("=?");
        if (proxy.LJIILJJIL("msg", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{c869590Y9l.getUuid()}) <= 0) {
            return null;
        }
        c869590Y9l.setLocalExt(map);
        return c869590Y9l;
    }

    public final boolean LJLJJLL(int i, String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC869640Y9q.COLUMN_STATUS.key, Integer.valueOf(i));
            C870430YCr proxy = this.LIZJ.getProxy();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
            sbLIZ.append("=?");
            int iLJIILJJIL = proxy.LJIILJJIL("msg", contentValues, C2188811AlT.LIZIZ(sbLIZ), new String[]{str});
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateMessageStatus");
            if (iLJIILJJIL > 0) {
                z = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIZ("IMMsgDao updateMessageStatus", e);
            this.LIZIZ.LJFF().getEventTracker().LJ(e);
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("IMMsgDao updateMessageStatus end uuid:");
        sbLIZ2.append(str);
        sbLIZ2.append(", result:");
        sbLIZ2.append(z);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        return z;
    }

    public final boolean LJLJLJ(long j, String str) {
        if (!TextUtils.isEmpty(str) && j > 0) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMMsgDao updateMsgVersion, uuid:");
            sbLIZ.append(str);
            sbLIZ.append(", version:");
            sbLIZ.append(j);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            C870430YCr proxy = this.LIZJ.getProxy();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("update msg set ");
            sbLIZ2.append(EnumC869640Y9q.COLUMN_VERSION.key);
            sbLIZ2.append("=");
            sbLIZ2.append(j);
            sbLIZ2.append(" where ");
            sbLIZ2.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
            sbLIZ2.append("='");
            sbLIZ2.append(str);
            sbLIZ2.append("'");
            return proxy.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), "updateMsgVersion");
        }
        return false;
    }

    public static void LJJLIIIJLLLLLLLZ(ContentValues contentValues, String str, Object obj) {
        if (obj == null) {
            contentValues.putNull(str);
            return;
        }
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            contentValues.put(str, (Integer) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (obj instanceof ByteString) {
                contentValues.put(str, ((ByteString) obj).toByteArray());
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unsupported type for column: ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0065: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:50331749), block:B:23:0x0065 */
    public final C869590Y9l LJJIIZ(String str, List list, boolean z) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJJIIZI;
        InterfaceC869470Y8z interfaceC869470Y8z;
        InterfaceC869470Y8z interfaceC869470Y8z2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                interfaceC869470Y8zLJJIIZI = LJJIIZI(str, list, z);
                if (interfaceC869470Y8zLJJIIZI != null) {
                    try {
                        if (interfaceC869470Y8zLJJIIZI.moveToFirst()) {
                            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getLastShowMsg");
                            C869590Y9l c869590Y9lLJIIIZ = LJIIIZ(interfaceC869470Y8zLJJIIZI);
                            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJJIIZI);
                            return c869590Y9lLJIIIZ;
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMMsgDao ", e);
                        this.LIZIZ.LJFF().getEventTracker().LJ(e);
                    }
                }
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
            interfaceC869470Y8zLJJIIZI = null;
        } catch (Throwable th3) {
            th = th3;
            while (true) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8z2);
                throw th;
            }
        }
        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJJIIZI);
        return null;
    }

    public final InterfaceC869470Y8z LJJIIZI(String str, List list, boolean z) {
        String[] strArr;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select rowid, * from msg where ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
        sbLIZ.append("=? AND ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
        sbLIZ.append("=? AND ");
        sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
        sbLIZ.append("=?");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (list != null && !((ArrayList) list).isEmpty()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" AND ");
            sbLIZ2.append(EnumC869640Y9q.COLUMN_MSG_TYPE.key);
            sbLIZ2.append(" NOT IN (");
            sbLIZ2.append(C870740YDw.LJIIIIZZ(",", list));
            sbLIZ2.append(")");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        long uid = this.LIZ.getUid();
        if (z) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(" AND ");
            sbLIZ3.append(EnumC869640Y9q.COLUMN_SENDER.key);
            sbLIZ3.append(" = ?");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append(" order by ");
        sbLIZ4.append(EnumC869640Y9q.COLUMN_ORDER_INDEX.key);
        sbLIZ4.append(" desc, ");
        sbLIZ4.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
        sbLIZ4.append(" desc limit 1");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("getLastShowMsgCursor => ");
        sbLIZ5.append(strLIZIZ2);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ5);
        c868780Y6iLIZLLL.getClass();
        C868780Y6i.LJ(c868780Y6iLIZLLL, "IMMsgDao ", strLIZIZ3, 4);
        if (!z) {
            strArr = new String[]{str, String.valueOf(0), String.valueOf(0)};
        } else {
            strArr = new String[]{str, String.valueOf(0), String.valueOf(0), String.valueOf(uid)};
        }
        return this.LIZJ.getProxy().LJIIJJI(strLIZIZ2, "getLastShowMsgCursor", strArr);
    }

    public final C0Y6Q LJJJJZI(int i, long j, String str) {
        return LJJJLL(j, i, str, null);
    }

    public final C0Y6Q LJJJLIIL(int i, String str, int[] iArr) {
        return LJJJLL(0L, i, str, iArr);
    }

    public final boolean LJJLIIIJJIZ(C869590Y9l c869590Y9l, Map<String, String> map, Set<String> set) throws Throwable {
        Map<String, String> mapLIZIZ;
        String strLJJZZIII = LJJZZIII(c869590Y9l.getUuid());
        if (strLJJZZIII == null) {
            return false;
        }
        HashMap map2 = new HashMap();
        if (!strLJJZZIII.isEmpty() && (mapLIZIZ = C09EF.LIZIZ(strLJJZZIII)) != null) {
            map2.putAll(mapLIZIZ);
        }
        if (set != null) {
            Iterator<String> it2 = set.iterator();
            while (it2.hasNext()) {
                map2.remove(it2.next());
            }
        }
        if (map != null) {
            map2.putAll(map);
        }
        Map<String, String> localExt = c869590Y9l.getLocalExt();
        if (localExt == null) {
            c869590Y9l.setLocalExt(map2);
            return true;
        }
        localExt.clear();
        localExt.putAll(map2);
        return true;
    }

    public final C0Y6Q LJJLJLI(int i, long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return C865670Xxd.LIZ(101, "empty conv id");
        }
        if (i <= 0) {
            i = 20;
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid,* from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
                sbLIZ.append("=? AND ");
                EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_ORDER_INDEX;
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append(">=?");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(" order by ");
                sbLIZ2.append(enumC869640Y9q.key);
                sbLIZ2.append(" asc, ");
                sbLIZ2.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
                sbLIZ2.append(" asc limit ");
                sbLIZ2.append(i);
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2), "queryNewerMessageListByOrderIndex", new String[]{str, String.valueOf(0), String.valueOf(0), String.valueOf(j)});
                LJIIJ(interfaceC869470Y8zLJIIJJI, arrayList);
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("IMMsgDao queryNewerMessageListByOrderIndex, cid:");
                sbLIZ3.append(str);
                sbLIZ3.append(", startOrderIndex:");
                sbLIZ3.append(j);
                sbLIZ3.append(", limit:");
                sbLIZ3.append(i);
                sbLIZ3.append(", count:");
                sbLIZ3.append(arrayList.size());
                c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
                return C865670Xxd.LIZJ(arrayList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao queryNewerMessageListByOrderIndex", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("exception: ");
                sbLIZ4.append(e.getMessage());
                C0Y6Q c0y6qLIZ = C865670Xxd.LIZ(201, C2188811AlT.LIZIZ(sbLIZ4));
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return c0y6qLIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final List LJJZZI(int i, long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                int i2 = i / 2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid,* from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
                sbLIZ.append("=? AND ");
                EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_INNER_INDEX;
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append(">=? AND ");
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append("<=?");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(" AND ");
                sbLIZ2.append(enumC869640Y9q.key);
                sbLIZ2.append(">? order by ");
                EnumC869640Y9q enumC869640Y9q2 = EnumC869640Y9q.COLUMN_ORDER_INDEX;
                sbLIZ2.append(enumC869640Y9q2.key);
                sbLIZ2.append(" asc, ");
                EnumC869640Y9q enumC869640Y9q3 = EnumC869640Y9q.COLUMN_CREATE_TIME;
                sbLIZ2.append(enumC869640Y9q3.key);
                sbLIZ2.append(" asc limit ");
                sbLIZ2.append(i2);
                LJIIJ(this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2), "queryTargetMessageList", new String[]{str, String.valueOf(0), String.valueOf(0), String.valueOf(Long.MIN_VALUE), String.valueOf(Long.MAX_VALUE), String.valueOf(j)}), arrayList);
                Collections.reverse(arrayList);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(" AND ");
                sbLIZ3.append(enumC869640Y9q.key);
                sbLIZ3.append("<=? order by ");
                sbLIZ3.append(enumC869640Y9q2.key);
                sbLIZ3.append(" desc, ");
                sbLIZ3.append(enumC869640Y9q3.key);
                sbLIZ3.append(" desc limit ");
                sbLIZ3.append(i2);
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3), "queryTargetMessageList", new String[]{str, String.valueOf(0), String.valueOf(0), String.valueOf(Long.MIN_VALUE), String.valueOf(Long.MAX_VALUE), String.valueOf(j)});
                LJIIJ(interfaceC869470Y8zLJIIJJI, arrayList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao queryTargetMessageList", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            this.LIZ.LIZLLL().LJFF("IMMsgDao queryTargetMessageList, cid:" + str + ", startIndex:" + j + ", count:" + arrayList.size());
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final boolean LJLIIL(C869590Y9l c869590Y9l, boolean z, boolean z2) {
        C0YAZ c0yaz;
        if (LJJJZ()) {
            c0yaz = C0YAZ.SKIP;
        } else {
            c0yaz = C0YAZ.WRITE_WHOLE;
        }
        return LJIJI(c869590Y9l, c0yaz, null, null, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v10, types: [long] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // X.InterfaceC869780YAe
    public final List LIZJ(long j, String str, int i, long j2) throws Throwable {
        long j3;
        long jIsEmpty = TextUtils.isEmpty(str);
        if (jIsEmpty != 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                jIsEmpty = j2;
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(LJJ(i), "queryTargetMessageList", new String[]{str, String.valueOf(j), String.valueOf((long) jIsEmpty)});
                j3 = jIsEmpty;
                if (interfaceC869470Y8zLJIIJJI != null) {
                    try {
                        try {
                            LJIIJJI(interfaceC869470Y8zLJIIJJI, arrayList, false, false, false, false);
                            j3 = jIsEmpty;
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            this.LIZ.LIZLLL().LJIIIZ("IMMsgDao queryAllMessageListInRange error: ", e);
                            this.LIZIZ.LJFF().getEventTracker().LJ(e);
                            j3 = jIsEmpty;
                            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("IMMsgDao queryAllMessageListInRange, cid:");
                            sbLIZ.append(str);
                            sbLIZ.append(", minIndex:");
                            sbLIZ.append(j);
                            sbLIZ.append(", maxIndex:");
                            sbLIZ.append(j3);
                            sbLIZ.append(", limit:");
                            sbLIZ.append(i);
                            sbLIZ.append(", count:");
                            sbLIZ.append(arrayList.size());
                            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                            return arrayList;
                        }
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
        C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("IMMsgDao queryAllMessageListInRange, cid:");
        sbLIZ2.append(str);
        sbLIZ2.append(", minIndex:");
        sbLIZ2.append(j);
        sbLIZ2.append(", maxIndex:");
        sbLIZ2.append(j3);
        sbLIZ2.append(", limit:");
        sbLIZ2.append(i);
        sbLIZ2.append(", count:");
        sbLIZ2.append(arrayList.size());
        c868780Y6iLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v10, types: [long] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // X.InterfaceC869780YAe
    public final List LIZLLL(long j, String str, int i, long j2) throws Throwable {
        long j3;
        long jIsEmpty = TextUtils.isEmpty(str);
        if (jIsEmpty != 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                jIsEmpty = j2;
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(LJJIJLIJ(i), "queryMessageListInRangeByOrderIndex", new String[]{String.valueOf(0), String.valueOf(0), str, String.valueOf(j), String.valueOf((long) jIsEmpty)});
                j3 = jIsEmpty;
                if (interfaceC869470Y8zLJIIJJI != null) {
                    try {
                        try {
                            LJIIJJI(interfaceC869470Y8zLJIIJJI, arrayList, false, false, false, false);
                            j3 = jIsEmpty;
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            this.LIZ.LIZLLL().LJIIIZ("IMMsgDao queryMessageListInRangeByOrderIndex error: ", e);
                            this.LIZIZ.LJFF().getEventTracker().LJ(e);
                            j3 = jIsEmpty;
                            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("IMMsgDao queryMessageListInRangeByOrderIndex, cid:");
                            sbLIZ.append(str);
                            sbLIZ.append(", minIndex:");
                            sbLIZ.append(j);
                            sbLIZ.append(", maxIndex:");
                            sbLIZ.append(j3);
                            sbLIZ.append(", limit:");
                            sbLIZ.append(i);
                            sbLIZ.append(", count:");
                            sbLIZ.append(arrayList.size());
                            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                            return arrayList;
                        }
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
        C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("IMMsgDao queryMessageListInRangeByOrderIndex, cid:");
        sbLIZ2.append(str);
        sbLIZ2.append(", minIndex:");
        sbLIZ2.append(j);
        sbLIZ2.append(", maxIndex:");
        sbLIZ2.append(j3);
        sbLIZ2.append(", limit:");
        sbLIZ2.append(i);
        sbLIZ2.append(", count:");
        sbLIZ2.append(arrayList.size());
        c868780Y6iLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
        return arrayList;
    }

    public final C043700Dr LJ(String str, List list, Map map, Map map2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean zLJLIIL;
        ArrayList<Pair> arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            C13BV c13bv = C13BV.INSTANCE;
            return new C043700Dr(c13bv, c13bv);
        }
        if (LJJJZ()) {
            z = true;
        } else {
            z = false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMsgDao batchInsertOrUpdate, size:");
        sbLIZ.append(arrayList.size());
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        try {
            this.LIZJ.getProxy().LJIILIIL("batchInsertOrUpdate");
            for (Pair pair : arrayList) {
                if (pair != null && !((C869590Y9l) pair.getFirst()).invalid()) {
                    if (pair.getSecond() == null) {
                        zLJLIIL = LJJJLZIJ((C869590Y9l) pair.getFirst());
                    } else {
                        if (((C869590Y9l) pair.getFirst()).getAttachments() != null && !((C869590Y9l) pair.getFirst()).getAttachments().isEmpty()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (((C869590Y9l) pair.getFirst()).getPropertyItemListMap() == ((C869590Y9l) pair.getSecond()).getPropertyItemListMap()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z) {
                            String uuid = ((C869590Y9l) pair.getFirst()).getUuid();
                            zLJLIIL = LIZ((C869590Y9l) pair.getFirst(), (Map) ((HashMap) map).get(uuid), (Set) ((HashMap) map2).get(uuid), z3, z2);
                        } else {
                            zLJLIIL = LJLIIL((C869590Y9l) pair.getFirst(), z3, z2);
                        }
                    }
                    if (zLJLIIL) {
                        try {
                            arrayList2.add(pair);
                            LJIJJ((C869590Y9l) pair.getFirst(), str);
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            this.LIZJ.getProxy().LIZJ("batchInsertOrUpdate", false);
                            arrayList3.addAll(list);
                            arrayList2.clear();
                            C868780Y6i c868780Y6iLIZLLL2 = this.LIZ.LIZLLL();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("IMMsgDao batchInsertOrUpdate transaction failed: ");
                            sbLIZ2.append(e.getMessage());
                            c868780Y6iLIZLLL2.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2), e);
                            this.LIZIZ.LJFF().getEventTracker().LIZLLL("batchInsertOrUpdate", e);
                            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "batchInsertOrUpdate");
                            C043700Dr c043700Dr = new C043700Dr(arrayList2, arrayList3);
                            C868780Y6i c868780Y6iLIZLLL3 = this.LIZ.LIZLLL();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("IMMsgDao insertMessages, size:");
                            sbLIZ3.append(arrayList.size());
                            sbLIZ3.append(", success:");
                            sbLIZ3.append(arrayList2.size());
                            sbLIZ3.append(", failures:");
                            sbLIZ3.append(arrayList3.size());
                            c868780Y6iLIZLLL3.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
                            return c043700Dr;
                        }
                    } else {
                        arrayList3.add(pair);
                    }
                } else {
                    arrayList3.add(pair);
                }
            }
            this.LIZJ.getProxy().LIZJ("batchInsertOrUpdate", true);
        } catch (Exception e2) {
            e = e2;
        }
        this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "batchInsertOrUpdate");
        C043700Dr c043700Dr2 = new C043700Dr(arrayList2, arrayList3);
        C868780Y6i c868780Y6iLIZLLL32 = this.LIZ.LIZLLL();
        StringBuilder sbLIZ32 = C2188811AlT.LIZ();
        sbLIZ32.append("IMMsgDao insertMessages, size:");
        sbLIZ32.append(arrayList.size());
        sbLIZ32.append(", success:");
        sbLIZ32.append(arrayList2.size());
        sbLIZ32.append(", failures:");
        sbLIZ32.append(arrayList3.size());
        c868780Y6iLIZLLL32.LJFF(C2188811AlT.LIZIZ(sbLIZ32));
        return c043700Dr2;
    }

    public final List<C869590Y9l> LJJJJJL(List<String> list, boolean z, boolean z2, boolean z3) throws Throwable {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return Collections.emptyList();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid,* from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
                sbLIZ.append(" in ('");
                sbLIZ.append(C870740YDw.LJIIIIZZ("','", list));
                sbLIZ.append("')  AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
                sbLIZ.append("=?");
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getShowMsgListByUuid", new String[]{String.valueOf(0), String.valueOf(0)});
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            if (arrayList.size() < 999) {
                LJIIJJI(interfaceC869470Y8zLJIIJJI, arrayList2, true, z, z2, z3);
            } else {
                while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                    arrayList2.add(LJIIIZ(interfaceC869470Y8zLJIIJJI));
                }
            }
            this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getMsgListByUuid");
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return arrayList2;
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LJFF().getEventTracker().LJ(e);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return arrayList2;
        } catch (Throwable th2) {
            th = th2;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
    }

    public final C0Y6Q LJJJLL(long j, int i, String str, int[] iArr) {
        int i2 = i;
        if (TextUtils.isEmpty(str)) {
            return C865670Xxd.LIZ(101, "empty conv id");
        }
        if (i2 <= 0) {
            i2 = 20;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid,* from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_INNER_INDEX.key);
                sbLIZ.append(" >?");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (iArr != null && iArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e3.h);
                    for (int i3 = 0; i3 < iArr.length; i3++) {
                        sb.append(iArr[i3]);
                        if (i3 < iArr.length - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append(")");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(" AND ");
                    sbLIZ2.append(EnumC869640Y9q.COLUMN_MSG_TYPE.key);
                    sbLIZ2.append(" IN ");
                    sbLIZ2.append(sb.toString());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(" order by ");
                sbLIZ3.append(EnumC869640Y9q.COLUMN_ORDER_INDEX.key);
                sbLIZ3.append(" desc, ");
                sbLIZ3.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
                sbLIZ3.append(" desc limit ");
                sbLIZ3.append(i2);
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3), "initMessageList", new String[]{str, String.valueOf(0), String.valueOf(0), String.valueOf(j)});
                LJIIJ(interfaceC869470Y8zLJIIJJI, arrayList);
                this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "initMessageList");
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("IMMsgDao initMessageList, cid:");
                sbLIZ4.append(str);
                sbLIZ4.append(", limit:");
                sbLIZ4.append(i2);
                sbLIZ4.append(", count:");
                sbLIZ4.append(arrayList.size());
                c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ4));
                return C865670Xxd.LIZJ(arrayList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao initMessageList", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("exception: ");
                sbLIZ5.append(e.getMessage());
                C0Y6Q c0y6qLIZ = C865670Xxd.LIZ(201, C2188811AlT.LIZIZ(sbLIZ5));
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return c0y6qLIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final boolean LJJLIIIJ(long j, String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            ContentValues contentValues = new ContentValues();
            boolean z2 = true;
            contentValues.put(EnumC869640Y9q.COLUMN_DELETED.key, (Integer) 1);
            C870430YCr proxy = this.LIZJ.getProxy();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
            sbLIZ.append("=?");
            if (proxy.LJIILJJIL("msg", contentValues, C2188811AlT.LIZIZ(sbLIZ), new String[]{str}) > 0) {
                this.LIZJ.LIZIZ().LIZJ().LLII(str, str2, "local_delete_time", String.valueOf(j));
                if (z) {
                    this.LIZJ.LIZIZ().LIZJ().LLII(str, str2, "local_delete_is_local", "1");
                }
            } else {
                z2 = false;
            }
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IMMsgDao markMsgAsDeleted, uuid:");
            sbLIZ2.append(str);
            sbLIZ2.append(", isLocal:");
            sbLIZ2.append(z);
            sbLIZ2.append(", result:");
            sbLIZ2.append(z2);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            return z2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LIZLLL().LJIIIZ("IMMsgDao markMsgAsDeleted", e);
            this.LIZ.LJIIZILJ().LJFF().getEventTracker().LJ(e);
            return false;
        }
    }

    public final boolean LJJLIIIJL(C869590Y9l c869590Y9l, List list, Map map, Set set) {
        boolean z;
        C0YAZ c0yaz;
        Set set2 = set;
        Map map2 = map;
        if ((map2 != null && !map2.isEmpty()) || (set2 != null && !set2.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        if (LJJJZ()) {
            if (z) {
                c0yaz = C0YAZ.WRITE_DIFF;
            } else {
                c0yaz = C0YAZ.SKIP;
            }
        } else {
            c0yaz = C0YAZ.WRITE_WHOLE;
        }
        if (!z) {
            map2 = null;
            set2 = null;
        }
        return LJIJ(c869590Y9l, list, c0yaz, map2, set2);
    }

    public final C0Y6Q LJJLJ(String str, long j, int i, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return C865670Xxd.LIZ(101, "empty conv id");
        }
        if (i <= 0) {
            i = 20;
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid,* from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
                sbLIZ.append("=?");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(" AND ");
                EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_INNER_INDEX;
                sbLIZ2.append(enumC869640Y9q.key);
                sbLIZ2.append(">?");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ2);
                sbLIZ3.append(" AND ");
                sbLIZ3.append(enumC869640Y9q.key);
                sbLIZ3.append("<=?");
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                if (iArr != null && iArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e3.h);
                    for (int i2 = 0; i2 < iArr.length; i2++) {
                        sb.append(iArr[i2]);
                        if (i2 < iArr.length - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append(")");
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(strLIZIZ3);
                    sbLIZ4.append(" AND ");
                    sbLIZ4.append(EnumC869640Y9q.COLUMN_MSG_TYPE.key);
                    sbLIZ4.append(" IN ");
                    sbLIZ4.append(sb.toString());
                    strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ3);
                sbLIZ5.append(" order by ");
                sbLIZ5.append(EnumC869640Y9q.COLUMN_ORDER_INDEX.key);
                sbLIZ5.append(" asc, ");
                sbLIZ5.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
                sbLIZ5.append(" asc");
                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ5);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(strLIZIZ4);
                sbLIZ6.append(" limit ");
                sbLIZ6.append(i);
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ6), "queryTargetMessageList", new String[]{str, String.valueOf(0), String.valueOf(0), String.valueOf(j), String.valueOf(Long.MAX_VALUE)});
                LJIIJ(interfaceC869470Y8zLJIIJJI, arrayList);
                Collections.reverse(arrayList);
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("IMMsgDao queryNewerMessageList, cid:");
                sbLIZ7.append(str);
                sbLIZ7.append(", startIndex:");
                sbLIZ7.append(j);
                sbLIZ7.append(", limit:");
                sbLIZ7.append(i);
                sbLIZ7.append(", count:");
                sbLIZ7.append(arrayList.size());
                c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ7));
                return C865670Xxd.LIZJ(arrayList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao queryNewerMessageList", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("exception: ");
                sbLIZ8.append(e.getMessage());
                C0Y6Q c0y6qLIZ = C865670Xxd.LIZ(201, C2188811AlT.LIZIZ(sbLIZ8));
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return c0y6qLIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final List LJJLL(String str, long j, int i, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i <= 0) {
            i = 20;
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid,* from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
                sbLIZ.append("=? AND ");
                EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_INNER_INDEX;
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append("<? AND ");
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append(">=?");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (iArr != null && iArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e3.h);
                    for (int i2 = 0; i2 < iArr.length; i2++) {
                        sb.append(iArr[i2]);
                        if (i2 < iArr.length - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append(")");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(" AND ");
                    sbLIZ2.append(EnumC869640Y9q.COLUMN_MSG_TYPE.key);
                    sbLIZ2.append(" IN ");
                    sbLIZ2.append(sb.toString());
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(" order by ");
                sbLIZ3.append(EnumC869640Y9q.COLUMN_ORDER_INDEX.key);
                sbLIZ3.append(" desc, ");
                sbLIZ3.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
                sbLIZ3.append(" desc limit ");
                sbLIZ3.append(i);
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3), "queryTargetMessageList", new String[]{str, String.valueOf(0), String.valueOf(0), String.valueOf(j), String.valueOf(Long.MIN_VALUE)});
                LJIIJ(interfaceC869470Y8zLJIIJJI, arrayList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao queryOlderMessageList", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("IMMsgDao queryOlderMessageList, cid:");
            sbLIZ4.append(str);
            sbLIZ4.append(", index:");
            sbLIZ4.append(j);
            sbLIZ4.append(", minIndex:");
            sbLIZ4.append(Long.MIN_VALUE);
            sbLIZ4.append(", limit:");
            sbLIZ4.append(i);
            sbLIZ4.append(", count:");
            sbLIZ4.append(arrayList.size());
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ4));
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final List LJJZ(int i, long j, long j2, String str) {
        String[] strArr;
        int i2 = i;
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i2 <= 0) {
            i2 = 20;
        }
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid,* from msg where ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_CONVERSATION_ID.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_DELETED.key);
                sbLIZ.append("=? AND ");
                sbLIZ.append(EnumC869640Y9q.COLUMN_NET_STATUS.key);
                sbLIZ.append("=? AND ");
                EnumC869640Y9q enumC869640Y9q = EnumC869640Y9q.COLUMN_ORDER_INDEX;
                sbLIZ.append(enumC869640Y9q.key);
                sbLIZ.append("<?");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (j2 > 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZIZ);
                    sbLIZ2.append(" AND ");
                    sbLIZ2.append(enumC869640Y9q.key);
                    sbLIZ2.append(">=?");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    strArr = new String[]{str, String.valueOf(0), String.valueOf(0), String.valueOf(j), String.valueOf(j2)};
                } else {
                    strArr = new String[]{str, String.valueOf(0), String.valueOf(0), String.valueOf(j)};
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(" order by ");
                sbLIZ3.append(enumC869640Y9q.key);
                sbLIZ3.append(" desc, ");
                sbLIZ3.append(EnumC869640Y9q.COLUMN_CREATE_TIME.key);
                sbLIZ3.append(" desc limit ");
                sbLIZ3.append(i2);
                interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3), "queryOlderMessageListByOrderIndex", strArr);
                LJIIJ(interfaceC869470Y8zLJIIJJI, arrayList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMMsgDao queryOlderMessageListByOrderIndex", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            C868780Y6i c868780Y6iLIZLLL = this.LIZ.LIZLLL();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("IMMsgDao queryOlderMessageListByOrderIndex, cid:");
            sbLIZ4.append(str);
            sbLIZ4.append(", orderIndex:");
            sbLIZ4.append(j);
            sbLIZ4.append(", minOrderIndex:");
            sbLIZ4.append(j2);
            sbLIZ4.append(", limit:");
            sbLIZ4.append(i2);
            sbLIZ4.append(", count:");
            sbLIZ4.append(arrayList.size());
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ4));
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    @Override // X.InterfaceC869780YAe
    public final boolean LIZ(C869590Y9l c869590Y9l, Map<String, String> map, Set<String> set, boolean z, boolean z2) {
        boolean z3;
        C0YAZ c0yaz;
        Set<String> set2 = set;
        Map<String, String> map2 = map;
        if ((map2 != null && !map2.isEmpty()) || (set2 != null && !set2.isEmpty())) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (LJJJZ()) {
            if (z3) {
                c0yaz = C0YAZ.WRITE_DIFF;
            } else {
                c0yaz = C0YAZ.SKIP;
            }
        } else {
            c0yaz = C0YAZ.WRITE_WHOLE;
        }
        if (!z3) {
            map2 = null;
            set2 = null;
        }
        return LJIJI(c869590Y9l, c0yaz, map2, set2, z, z2);
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0182: MOVE (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r13 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:83886466), block:B:66:0x0182 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:14:0x0036, B:16:0x003c, B:18:0x0046, B:19:0x004a, B:21:0x004e, B:23:0x0058, B:31:0x0097, B:32:0x00a0, B:34:0x00a6, B:36:0x00ae, B:39:0x00b9, B:41:0x00c3, B:42:0x00ca, B:45:0x00f5, B:47:0x00f9, B:53:0x0105, B:52:0x0102, B:58:0x011d, B:60:0x013a), top: B:74:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJ(X.C869590Y9l r15, java.util.List r16, X.C0YAZ r17, java.util.Map r18, java.util.Set r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869580Y9k.LJIJ(X.0Y9l, java.util.List, X.0YAZ, java.util.Map, java.util.Set):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0695 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0426  */
    /* JADX WARN: Type inference failed for: r0v115, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r0v122, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r0v144, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r0v169, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r2v16, types: [X.0Y9l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18, types: [long] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v7, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(X.InterfaceC869470Y8z r51, java.util.List<X.C869590Y9l> r52, boolean r53, boolean r54, boolean r55, boolean r56) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869580Y9k.LJIIJJI(X.0Y8z, java.util.List, boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        if (r0 > 0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081 A[Catch: Exception -> 0x00f8, all -> 0x0159, TryCatch #0 {Exception -> 0x00f8, blocks: (B:8:0x0028, B:9:0x0031, B:11:0x0038, B:15:0x0045, B:21:0x0052, B:25:0x0071, B:29:0x007a, B:32:0x0081, B:36:0x0099, B:39:0x00a3), top: B:69:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9 A[Catch: Exception -> 0x00f6, all -> 0x0159, TryCatch #1 {all -> 0x0159, blocks: (B:8:0x0028, B:9:0x0031, B:11:0x0038, B:15:0x0045, B:21:0x0052, B:25:0x0071, B:29:0x007a, B:42:0x00b2, B:44:0x00b9, B:48:0x00c1, B:50:0x00c7, B:58:0x00fa, B:60:0x010a, B:61:0x0113, B:51:0x00d9, B:53:0x00ec, B:32:0x0081, B:36:0x0099, B:39:0x00a3), top: B:70:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec A[Catch: Exception -> 0x00f6, all -> 0x0159, TRY_LEAVE, TryCatch #1 {all -> 0x0159, blocks: (B:8:0x0028, B:9:0x0031, B:11:0x0038, B:15:0x0045, B:21:0x0052, B:25:0x0071, B:29:0x007a, B:42:0x00b2, B:44:0x00b9, B:48:0x00c1, B:50:0x00c7, B:58:0x00fa, B:60:0x010a, B:61:0x0113, B:51:0x00d9, B:53:0x00ec, B:32:0x0081, B:36:0x0099, B:39:0x00a3), top: B:70:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010a A[Catch: all -> 0x0159, TryCatch #1 {all -> 0x0159, blocks: (B:8:0x0028, B:9:0x0031, B:11:0x0038, B:15:0x0045, B:21:0x0052, B:25:0x0071, B:29:0x007a, B:42:0x00b2, B:44:0x00b9, B:48:0x00c1, B:50:0x00c7, B:58:0x00fa, B:60:0x010a, B:61:0x0113, B:51:0x00d9, B:53:0x00ec, B:32:0x0081, B:36:0x0099, B:39:0x00a3), top: B:70:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJI(X.C869590Y9l r20, X.C0YAZ r21, java.util.Map<java.lang.String, java.lang.String> r22, java.util.Set<java.lang.String> r23, boolean r24, boolean r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869580Y9k.LJIJI(X.0Y9l, X.0YAZ, java.util.Map, java.util.Set, boolean, boolean):boolean");
    }
}
