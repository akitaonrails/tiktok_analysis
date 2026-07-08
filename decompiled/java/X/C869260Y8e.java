package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y8e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869260Y8e implements C0Y91 {
    public final C0YEM LIZIZ;
    public final InterfaceC864790XwD LIZJ;
    public final C0Y5R LIZLLL;

    public final long LJIJJ() {
        try {
            return this.LIZLLL.getProxy().LJFF();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMConversationDao getConversationCount ");
            sbLIZ.append(e);
            c868780Y6iLIZLLL.LJI(C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ.LJFF().getEventTracker().LJ(e);
            return 0L;
        }
    }

    public final boolean LJJJJIZL() {
        this.LIZIZ.LIZLLL().LJFF("IMConversationDao updateAllConversationReadBadgeToZero");
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC869310Y8j.COLUMN_READ_BADGE_COUNT.key, (Integer) 0);
            contentValues.put(EnumC869310Y8j.COLUMN_BADGE_COUNT.key, (Integer) 0);
            contentValues.put(EnumC869310Y8j.COLUMN_BADGE_VERSION.key, (Integer) 0);
            z = this.LIZLLL.getProxy().LJIILJJIL("conversation_list", contentValues, null, null) > 0;
            this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateConversationRead");
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao updateAllConversationReadBadgeToZero ", e);
            this.LIZJ.LJFF().getEventTracker().LJ(e);
            return z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[Catch: Exception -> 0x0082, all -> 0x00c4, PHI: r12
      0x005f: PHI (r12v10 boolean) = (r12v4 boolean), (r12v5 boolean) binds: [B:6:0x003f, B:14:0x005d] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00c4, blocks: (B:3:0x0015, B:5:0x0032, B:7:0x0041, B:9:0x0047, B:11:0x0055, B:16:0x0070, B:21:0x0086, B:15:0x005f), top: B:29:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJJLL() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869260Y8e.LJJJJLL():boolean");
    }

    public final Map LJIILJJIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select ");
        sbLIZ.append(EnumC869310Y8j.COLUMN_ID.key);
        sbLIZ.append(", ");
        sbLIZ.append(EnumC869310Y8j.COLUMN_CONVERSATION_TYPE.key);
        sbLIZ.append(", ");
        sbLIZ.append(EnumC869310Y8j.COLUMN_SHORT_ID.key);
        sbLIZ.append(", ");
        sbLIZ.append(EnumC869310Y8j.COLUMN_UNREAD_COUNT.key);
        sbLIZ.append(", ");
        EnumC869310Y8j enumC869310Y8j = EnumC869310Y8j.COLUMN_UPDATE_TIME;
        sbLIZ.append(enumC869310Y8j.key);
        sbLIZ.append(", ");
        EnumC869310Y8j enumC869310Y8j2 = EnumC869310Y8j.COLUMN_STRANGER;
        sbLIZ.append(enumC869310Y8j2.key);
        sbLIZ.append(", ");
        sbLIZ.append(EnumC869310Y8j.COLUMN_MIN_INDEX.key);
        sbLIZ.append(", ");
        EnumC869310Y8j enumC869310Y8j3 = EnumC869310Y8j.COLUMN_RISKY;
        sbLIZ.append(enumC869310Y8j3.key);
        sbLIZ.append("  from ");
        sbLIZ.append("conversation_list");
        sbLIZ.append(" where (");
        sbLIZ.append(enumC869310Y8j2.key);
        sbLIZ.append(" = ");
        sbLIZ.append(1);
        sbLIZ.append(" or ");
        sbLIZ.append(enumC869310Y8j3.key);
        sbLIZ.append(" = ");
        sbLIZ.append(1);
        sbLIZ.append(") order by ");
        sbLIZ.append(enumC869310Y8j.key);
        sbLIZ.append(" desc limit ");
        sbLIZ.append(LSPassThroughRecordSizeConfig.DEFAULT);
        return LJIILL(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C869260Y8e(C0YEM c0yem) {
        this.LIZIZ = c0yem;
        this.LIZJ = c0yem.LJIIZILJ();
        this.LIZLLL = c0yem.LJIIZILJ().LIZIZ();
    }

    public final boolean LIZIZ(List<String> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append('\"');
            sb.append(str);
            sb.append("\",");
        }
        String string = sb.toString();
        String strSubstring = string.substring(0, string.length() - 1);
        C870430YCr proxy = this.LIZLLL.getProxy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete from conversation_list where ");
        sbLIZ.append(EnumC869310Y8j.COLUMN_ID.key);
        sbLIZ.append(" in (");
        sbLIZ.append(strSubstring);
        sbLIZ.append(")");
        if (proxy.LIZLLL(C2188811AlT.LIZIZ(sbLIZ), "batchDelete")) {
            String strLJIIIIZZ = C870740YDw.LJIIIIZZ(",", Collections.nCopies(list.size(), "?"));
            String[] strArr = (String[]) list.toArray(new String[0]);
            C870430YCr proxy2 = this.LIZLLL.getProxy();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(EnumC869340Y8m.COLUMN_ID.key);
            sbLIZ2.append(" in (");
            sbLIZ2.append(strLJIIIIZZ);
            sbLIZ2.append(")");
            proxy2.LIZIZ("conversation_setting", C2188811AlT.LIZIZ(sbLIZ2), strArr);
            C870430YCr proxy3 = this.LIZLLL.getProxy();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(EnumC869330Y8l.COLUMN_ID.key);
            sbLIZ3.append(" in (");
            sbLIZ3.append(strLJIIIIZZ);
            sbLIZ3.append(")");
            proxy3.LIZIZ("conversation_core", C2188811AlT.LIZIZ(sbLIZ3), strArr);
            C870430YCr proxy4 = this.LIZLLL.getProxy();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(C0YAD.COLUMN_CONVERSATION_ID.key);
            sbLIZ4.append(" in (");
            sbLIZ4.append(strLJIIIIZZ);
            sbLIZ4.append(")");
            proxy4.LIZIZ("participant", C2188811AlT.LIZIZ(sbLIZ4), strArr);
            if (this.LIZIZ.LJIIIZ().LJJLIIIIJ.LJIIIZ.enableConvKvCache) {
                this.LIZIZ.LJIIZILJ().LIZLLL().LJ().LIZJ(strArr);
            } else {
                this.LIZLLL.LIZIZ().LJIILJJIL().LIZJ(strArr);
            }
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                this.LIZLLL.LIZIZ().LJI().LJIJJLI(it2.next());
            }
        }
        return true;
    }

    public final boolean LIZJ(Map<String, Map<String, String>> map) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update conversation_list set ");
        sbLIZ.append(EnumC869310Y8j.COLUMN_LOCAL_INFO.key);
        sbLIZ.append(" =  case ");
        StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
            if (entry.getKey() != null && !entry.getKey().isEmpty() && entry.getValue() != null) {
                arrayList.add(entry.getKey());
                sb.append(" when ");
                sb.append(EnumC869310Y8j.COLUMN_ID.key);
                sb.append(" = '");
                sb.append(entry.getKey());
                sb.append("' then '");
                sb.append(C0Y8V.LJII(entry.getValue()));
                sb.append("'");
            }
        }
        boolean zLIZLLL = false;
        if (arrayList.isEmpty()) {
            return false;
        }
        sb.append(" end where ");
        sb.append(EnumC869310Y8j.COLUMN_ID.key);
        sb.append(" in (");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                sb.append("'");
                sb.append((String) ListProtector.get(arrayList, i));
                sb.append("'");
            } else {
                sb.append(",'");
                sb.append((String) ListProtector.get(arrayList, i));
                sb.append("'");
            }
        }
        sb.append(")");
        try {
            zLIZLLL = this.LIZLLL.getProxy().LIZLLL(sb.toString(), "batchUpdateLocalExt");
            return zLIZLLL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao batchUpdateLocalExt", e);
            this.LIZJ.LJFF().getEventTracker().LJ(e);
            return zLIZLLL;
        }
    }

    public final ContentValues LJII(C0Y8T c0y8t) {
        ContentValues contentValues = new ContentValues();
        String str = EnumC869310Y8j.COLUMN_ID.key;
        String conversationId = c0y8t.getConversationId();
        String str2 = "";
        if (conversationId == null) {
            conversationId = "";
        }
        contentValues.put(str, conversationId);
        contentValues.put(EnumC869310Y8j.COLUMN_SHORT_ID.key, Long.valueOf(c0y8t.getConversationShortId()));
        contentValues.put(EnumC869310Y8j.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(c0y8t.getLastMessageIndex()));
        String str3 = EnumC869310Y8j.COLUMN_LAST_MSG_UUID.key;
        String lastShowMessageUuid = c0y8t.getLastShowMessageUuid();
        if (lastShowMessageUuid == null) {
            lastShowMessageUuid = "";
        }
        contentValues.put(str3, lastShowMessageUuid);
        contentValues.put(EnumC869310Y8j.COLUMN_UPDATE_TIME.key, Long.valueOf(c0y8t.getUpdatedTime()));
        contentValues.put(EnumC869310Y8j.COLUMN_UNREAD_COUNT.key, Long.valueOf(c0y8t.getUnreadCount()));
        contentValues.put(EnumC869310Y8j.COLUMN_FAKE_UNREAD_COUNT.key, Integer.valueOf(c0y8t.getFakeUnreadCount()));
        contentValues.put(EnumC869310Y8j.COLUMN_CONVERSATION_TYPE.key, Integer.valueOf(c0y8t.getConversationType()));
        contentValues.put(EnumC869310Y8j.COLUMN_DRAFT_TIME.key, Long.valueOf(c0y8t.getDraftTime()));
        String str4 = EnumC869310Y8j.COLUMN_DRAFT_CONTENT.key;
        String draftContent = c0y8t.getDraftContent();
        if (draftContent == null) {
            draftContent = "";
        }
        contentValues.put(str4, draftContent);
        contentValues.put(EnumC869310Y8j.COLUMN_MIN_INDEX.key, Long.valueOf(c0y8t.getMinIndex()));
        String str5 = EnumC869310Y8j.COLUMN_LOCAL_INFO.key;
        String localExtStr = c0y8t.getLocalExtStr();
        if (localExtStr == null) {
            localExtStr = "";
        }
        contentValues.put(str5, localExtStr);
        contentValues.put(EnumC869310Y8j.COLUMN_READ_INDEX.key, Long.valueOf(c0y8t.getReadIndex()));
        contentValues.put(EnumC869310Y8j.COLUMN_INBOX.key, Integer.valueOf(c0y8t.getInboxType()));
        contentValues.put(EnumC869310Y8j.COLUMN_IS_MEMBER.key, Integer.valueOf(c0y8t.isMember() ? 1 : 0));
        contentValues.put(EnumC869310Y8j.COLUMN_HAS_MORE.key, Integer.valueOf(c0y8t.hasMore() ? 1 : 0));
        contentValues.put(EnumC869310Y8j.COLUMN_MEMBER_COUNT.key, Integer.valueOf(c0y8t.getMemberCount()));
        contentValues.put(EnumC869310Y8j.COLUMN_STATUS.key, Integer.valueOf(c0y8t.getStatus()));
        String str6 = EnumC869310Y8j.COLUMN_PARTICIPANT.key;
        String memberStr = c0y8t.getMemberStr();
        if (memberStr != null) {
            str2 = memberStr;
        }
        contentValues.put(str6, str2);
        contentValues.put(EnumC869310Y8j.COLUMN_LAST_MSG_ORDER_INDEX.key, Long.valueOf(c0y8t.getLastMessageOrderIndex()));
        contentValues.put(EnumC869310Y8j.COLUMN_STRANGER.key, Integer.valueOf(c0y8t.isStranger() ? 1 : 0));
        contentValues.put(EnumC869310Y8j.COLUMN_SORT_ORDER.key, Long.valueOf(C0Y2U.LIZLLL(c0y8t, this.LIZIZ)));
        contentValues.put(EnumC869310Y8j.COLUMN_MIN_INDEX_V2.key, Long.valueOf(c0y8t.getMinIndexV2()));
        contentValues.put(EnumC869310Y8j.COLUMN_MAX_INDEX_V2.key, Long.valueOf(c0y8t.getMaxIndexV2()));
        contentValues.put(EnumC869310Y8j.COLUMN_READ_INDEX_V2.key, Long.valueOf(c0y8t.getReadIndexV2()));
        contentValues.put(EnumC869310Y8j.COLUMN_BADGE_COUNT.key, Integer.valueOf(c0y8t.getBadgeCount()));
        contentValues.put(EnumC869310Y8j.COLUMN_READ_BADGE_COUNT.key, Integer.valueOf(c0y8t.getReadBadgeCount()));
        contentValues.put(EnumC869310Y8j.COLUMN_IS_IN_BOX.key, Integer.valueOf(c0y8t.isInBox() ? 1 : 0));
        String str7 = EnumC869310Y8j.COLUMN_BIZ_EXT.key;
        ByteString bizExt = c0y8t.getBizExt();
        if (bizExt == null) {
            bizExt = ByteString.EMPTY;
        }
        contentValues.put(str7, bizExt.toByteArray());
        contentValues.put(EnumC869310Y8j.COLUMN_RISKY.key, Integer.valueOf(c0y8t.isRisky() ? 1 : 0));
        contentValues.put(EnumC869310Y8j.COLUMN_BADGE_VERSION.key, Long.valueOf(c0y8t.getBadgeVersion()));
        contentValues.put(EnumC869310Y8j.COLUMN_CONV_RANK_VERSION.key, Long.valueOf(c0y8t.getConversationRankVersion()));
        return contentValues;
    }

    public final C0Y6Q<Long> LJIIIIZZ(C869710Y9x c869710Y9x) {
        String message;
        C0Y6Q<Long> c0y6qLIZ;
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                C0Y99 c0y99LIZJ = C869610Y9n.LIZJ(c869710Y9x);
                String str = c0y99LIZJ.LIZ;
                String[] strArr = c0y99LIZJ.LIZIZ;
                C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("countConversations sql = ");
                sbLIZ.append(C869610Y9n.LJIIIZ(str));
                sbLIZ.append(", params: ");
                sbLIZ.append(Arrays.toString(strArr));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c868780Y6iLIZLLL.getClass();
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMConversationDao ", strLIZIZ, 4);
                interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(str, "countConversations", strArr);
                if (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToNext()) {
                    c0y6qLIZ = C865670Xxd.LIZJ(Long.valueOf(interfaceC869470Y8zLJIIJJI.getLong(0)));
                } else {
                    c0y6qLIZ = C865670Xxd.LIZ(-1, "countConversations cursor is null or empty");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("countConversations ");
                sbLIZ2.append(e);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c868780Y6iLIZLLL2.getClass();
                c868780Y6iLIZLLL2.LJIIIIZZ("IMConversationDao", strLIZIZ2, null);
                this.LIZJ.LJFF().getEventTracker().LJ(e);
                if (e.getMessage() != null) {
                    message = e.getMessage();
                } else {
                    message = "unknown error";
                }
                c0y6qLIZ = C865670Xxd.LIZ(-1, message);
            }
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return c0y6qLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final boolean LJIIIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao deleteConversation:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        C870430YCr proxy = this.LIZLLL.getProxy();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
        sbLIZ2.append("=?");
        boolean zLIZIZ = proxy.LIZIZ("conversation_list", C2188811AlT.LIZIZ(sbLIZ2), new String[]{str});
        if (zLIZIZ) {
            this.LIZLLL.LIZIZ().LJI().LJIJJLI(str);
            this.LIZLLL.LIZIZ().LIZ().LIZLLL(str);
            this.LIZLLL.LIZIZ().LJIIIIZZ().LIZLLL(str);
            this.LIZLLL.LIZIZ().LJIILIIL().LJIILIIL(str);
            this.LIZIZ.LJIIZILJ().LIZLLL().LJ().LIZIZ(str);
        }
        this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "deleteConversation");
        return zLIZIZ;
    }

    public final C0Y6Q LJIIJ(int i) {
        return LJIIJJI(i, -1, EnumC869410Y8t.NONE_MESSAGE_REQUEST, null, false);
    }

    public final C0Y6Q LJIILIIL(boolean z) {
        EnumC869410Y8t enumC869410Y8t;
        if (z) {
            enumC869410Y8t = EnumC869410Y8t.ALL;
        } else {
            enumC869410Y8t = EnumC869410Y8t.NONE_MESSAGE_REQUEST;
        }
        return LJIIJJI(-1, LSPassThroughRecordSizeConfig.DEFAULT, enumC869410Y8t, null, false);
    }

    public final Map LJIILL(String str) throws Throwable {
        int count;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        boolean z;
        boolean z2;
        long j3;
        long jLIZIZ;
        C869590Y9l c869590Y9lLJJIIJZLJL;
        boolean z3;
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        c868780Y6iLIZLLL.getClass();
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMConversationDao ", "getAllMessageRequestConvs", 4);
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("sql = ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c868780Y6iLIZLLL2.getClass();
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "IMConversationDao ", strLIZIZ, 4);
                interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(str, "getAllMessageRequestConvsInfo", null);
                if (interfaceC869470Y8zLJIIJJI != null) {
                    try {
                        try {
                            count = interfaceC869470Y8zLJIIJJI.getCount();
                            HashMap map2 = new HashMap(count);
                            try {
                                int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869310Y8j.COLUMN_ID.key);
                                int columnIndex2 = interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869310Y8j.COLUMN_CONVERSATION_TYPE.key);
                                int columnIndex3 = interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869310Y8j.COLUMN_SHORT_ID.key);
                                int columnIndex4 = interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869310Y8j.COLUMN_UPDATE_TIME.key);
                                int columnIndex5 = interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869310Y8j.COLUMN_UNREAD_COUNT.key);
                                int columnIndex6 = interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869310Y8j.COLUMN_STRANGER.key);
                                int columnIndex7 = interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869310Y8j.COLUMN_RISKY.key);
                                int columnIndex8 = interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869310Y8j.COLUMN_MIN_INDEX.key);
                                i = 0;
                                i2 = 0;
                                i3 = 0;
                                i4 = 0;
                                while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                                    try {
                                        try {
                                            String string = interfaceC869470Y8zLJIIJJI.getString(columnIndex);
                                            int i5 = interfaceC869470Y8zLJIIJJI.getInt(columnIndex2);
                                            int i6 = interfaceC869470Y8zLJIIJJI.getInt(columnIndex5);
                                            try {
                                                j = interfaceC869470Y8zLJIIJJI.getLong(columnIndex3);
                                                j2 = interfaceC869470Y8zLJIIJJI.getLong(columnIndex4);
                                                if (interfaceC869470Y8zLJIIJJI.getInt(columnIndex6) == 1) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (interfaceC869470Y8zLJIIJJI.getInt(columnIndex7) == 1) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                j3 = interfaceC869470Y8zLJIIJJI.getLong(columnIndex8);
                                                try {
                                                    jLIZIZ = C2124408Ty.LIZIZ(this.LIZIZ.getUid(), string);
                                                    c869590Y9lLJJIIJZLJL = this.LIZLLL.LIZIZ().LJI().LJJIIJZLJL(string);
                                                    sb.append(string);
                                                    sb.append(", ");
                                                } catch (Exception e) {
                                                    e = e;
                                                }
                                            } catch (Exception e2) {
                                                e = e2;
                                            }
                                            try {
                                                try {
                                                    if (!this.LIZIZ.LJIIZILJ().LIZLLL().LJFF().LLJZIJLIL(false, string, c869590Y9lLJJIIJZLJL, j3)) {
                                                        C868780Y6i c868780Y6iLIZLLL3 = this.LIZIZ.LIZLLL();
                                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                        sbLIZ2.append("IMConversationDao getAllMessageRequestConvsInfo, conversation is inconvertibleConv, convId ");
                                                        sbLIZ2.append(string);
                                                        sbLIZ2.append(", lastShowMsg == null ? ");
                                                        if (c869590Y9lLJJIIJZLJL == null) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        sbLIZ2.append(z3);
                                                        sbLIZ2.append(", minIndex:");
                                                        sbLIZ2.append(j3);
                                                        sbLIZ2.append(", uid:");
                                                        sbLIZ2.append(jLIZIZ);
                                                        c868780Y6iLIZLLL3.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                                                        i++;
                                                        sb2.append(string);
                                                        sb2.append(", ");
                                                    } else {
                                                        if (i6 > 0) {
                                                            i2++;
                                                        }
                                                        if (z) {
                                                            i3++;
                                                        }
                                                        if (z2) {
                                                            i4++;
                                                        }
                                                        C869430Y8v c869430Y8v = new C869430Y8v();
                                                        c869430Y8v.LIZ = string;
                                                        c869430Y8v.LIZIZ = j;
                                                        c869430Y8v.LIZJ = i5;
                                                        c869430Y8v.LIZLLL = i6;
                                                        c869430Y8v.LJ = j2;
                                                        c869430Y8v.LJFF = z;
                                                        c869430Y8v.LJII = j3;
                                                        c869430Y8v.LJI = z2;
                                                        map = map2;
                                                        try {
                                                            map2.put(string, c869430Y8v.LIZ());
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            TryCatchGuardChecker.doCheck(e);
                                                            C868780Y6i c868780Y6iLIZLLL4 = this.LIZIZ.LIZLLL();
                                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                            sbLIZ3.append("IMConversationDao getAllMessageRequestConvs ");
                                                            sbLIZ3.append(e);
                                                            c868780Y6iLIZLLL4.LJI(C2188811AlT.LIZIZ(sbLIZ3));
                                                            this.LIZJ.LJFF().getEventTracker().LJ(e);
                                                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                                            return map;
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    while (true) {
                                                        try {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                        }
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                map = map2;
                                                TryCatchGuardChecker.doCheck(e);
                                                C868780Y6i c868780Y6iLIZLLL42 = this.LIZIZ.LIZLLL();
                                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                                sbLIZ32.append("IMConversationDao getAllMessageRequestConvs ");
                                                sbLIZ32.append(e);
                                                c868780Y6iLIZLLL42.LJI(C2188811AlT.LIZIZ(sbLIZ32));
                                                this.LIZJ.LJFF().getEventTracker().LJ(e);
                                                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                                return map;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            while (true) {
                                                TryCatchGuardChecker.doCheck(th);
                                                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                                throw th;
                                            }
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        map = map2;
                                    }
                                }
                                map = map2;
                            } catch (Exception e6) {
                                e = e6;
                                map = map2;
                            }
                        } catch (Exception e7) {
                            e = e7;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    try {
                        C0Y92 c0y92 = this.LIZIZ.LJIIIZ().LJJLIIIIJ.LIZIZ;
                        boolean z4 = c0y92.LIZ;
                        boolean z5 = c0y92.LIZJ;
                        ArrayList<String> arrayList = new ArrayList(map.keySet());
                        Map<String, C0Y8W> mapLJI = this.LIZLLL.LIZIZ().LIZ().LJI(arrayList, z4, z5, false);
                        if (mapLJI != null) {
                            for (String str2 : arrayList) {
                                C0Y8W c0y8w = (C0Y8W) ((HashMap) mapLJI).get(str2);
                                C0Y9G c0y9g = (C0Y9G) map.get(str2);
                                if (c0y9g != null && c0y8w != null && c0y8w.isMute()) {
                                    C869430Y8v c869430Y8v2 = new C869430Y8v();
                                    c869430Y8v2.LIZ = c0y9g.LIZ;
                                    c869430Y8v2.LIZIZ = c0y9g.LIZIZ;
                                    c869430Y8v2.LIZJ = c0y9g.LIZJ;
                                    c869430Y8v2.LIZLLL = c0y9g.LIZLLL;
                                    c869430Y8v2.LJ = c0y9g.LJ;
                                    c869430Y8v2.LJFF = c0y9g.LJFF;
                                    c869430Y8v2.LJI = c0y9g.LJI;
                                    c869430Y8v2.LJIIIZ = c0y9g.LJIIIIZZ;
                                    c869430Y8v2.LJIIIIZZ = true;
                                    map.put(str2, c869430Y8v2.LIZ());
                                }
                            }
                        }
                        C868780Y6i c868780Y6iLIZLLL5 = this.LIZIZ.LIZLLL();
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("IMConversationDao getAllMessageRequestConvsInfo, convs = ");
                        sbLIZ4.append((Object) sb);
                        sbLIZ4.append(", invalidConvs = ");
                        sbLIZ4.append((Object) sb2);
                        c868780Y6iLIZLLL5.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
                        this.LIZIZ.LJIIZILJ().LJFF().LIZ().LJIIIIZZ(count, i, i2, i3, i4);
                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        return map;
                    } catch (Exception e8) {
                        e = e8;
                        TryCatchGuardChecker.doCheck(e);
                        C868780Y6i c868780Y6iLIZLLL422 = this.LIZIZ.LIZLLL();
                        StringBuilder sbLIZ322 = C2188811AlT.LIZ();
                        sbLIZ322.append("IMConversationDao getAllMessageRequestConvs ");
                        sbLIZ322.append(e);
                        c868780Y6iLIZLLL422.LJI(C2188811AlT.LIZIZ(sbLIZ322));
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        return map;
                    } catch (Throwable th5) {
                        th = th5;
                        while (true) {
                            TryCatchGuardChecker.doCheck(th);
                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            throw th;
                        }
                    }
                }
                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return map;
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    public final Map<String, String> LJIIZILJ(List<String> list) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        HashMap map = new HashMap();
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        try {
            String strLJIIIIZZ = C870740YDw.LJIIIIZZ(",", Collections.nCopies(list.size(), "?"));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select ");
            EnumC869310Y8j enumC869310Y8j = EnumC869310Y8j.COLUMN_ID;
            sbLIZ.append(enumC869310Y8j.key);
            sbLIZ.append(",");
            EnumC869310Y8j enumC869310Y8j2 = EnumC869310Y8j.COLUMN_LAST_MSG_UUID;
            sbLIZ.append(enumC869310Y8j2.key);
            sbLIZ.append(" from ");
            sbLIZ.append("conversation_list");
            sbLIZ.append(" where ");
            sbLIZ.append(enumC869310Y8j.key);
            sbLIZ.append(" in (");
            sbLIZ.append(strLJIIIIZZ);
            sbLIZ.append(")");
            interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getConvIdAndLastUuidMapBy", (String[]) list.toArray(new String[0]));
            if (interfaceC869470Y8zLJIIJJI != null) {
                try {
                    try {
                        int columnIndexOrThrow = interfaceC869470Y8zLJIIJJI.getColumnIndexOrThrow(enumC869310Y8j.key);
                        int columnIndexOrThrow2 = interfaceC869470Y8zLJIIJJI.getColumnIndexOrThrow(enumC869310Y8j2.key);
                        while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                            String string = interfaceC869470Y8zLJIIJJI.getString(columnIndexOrThrow);
                            String string2 = interfaceC869470Y8zLJIIJJI.getString(columnIndexOrThrow2);
                            if (string != null) {
                                if (string2 == null) {
                                    string2 = "";
                                }
                                map.put(string, string2);
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao getConvIdAndLastUuidMapBy", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8z);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            }
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return map;
        } catch (Exception e2) {
            e = e2;
            interfaceC869470Y8zLJIIJJI = null;
        } catch (Throwable th3) {
            th = th3;
            while (true) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8z);
                throw th;
            }
        }
    }

    public final List<C0Y8T> LJIJJLI(List<String> list) {
        ArrayList arrayList;
        int size = list.size();
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getConversationListById, size:");
        sbLIZ.append(size);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 999;
            List<String> listSubList = list.subList(i, Math.min(i2, size));
            this.LIZIZ.LIZLLL().LJFF("getConversationListByIdInner");
            InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
            try {
                try {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("select * from conversation_list where ");
                    sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
                    sbLIZ2.append(" in (");
                    StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
                    int i3 = 0;
                    while (i3 < listSubList.size()) {
                        sb.append("?");
                        i3++;
                        if (i3 != listSubList.size()) {
                            sb.append(",");
                        }
                    }
                    sb.append(")");
                    String[] strArr = new String[listSubList.size()];
                    for (int i4 = 0; i4 < listSubList.size(); i4++) {
                        strArr[i4] = listSubList.get(i4);
                    }
                    interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(sb.toString(), "getConversationListByIdInner", strArr);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("getConversationListById ");
                    sbLIZ3.append(e);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    c868780Y6iLIZLLL2.getClass();
                    c868780Y6iLIZLLL2.LJIIIIZZ("IMConversationDao ", strLIZIZ, null);
                    this.LIZJ.LJFF().getEventTracker().LJ(e);
                }
                if (interfaceC869470Y8zLJIIJJI != null) {
                    arrayList = new ArrayList(interfaceC869470Y8zLJIIJJI.getCount());
                    LJ(interfaceC869470Y8zLJIIJJI, arrayList, false, false);
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                } else {
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    arrayList = new ArrayList();
                }
                arrayList2.addAll(arrayList);
                i = i2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZLLL.LIZ().LIZ(null);
                throw th;
            }
        }
        return arrayList2;
    }

    public final long LJJ(String str) {
        long j = -1;
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao getConversationReadIndex, cid:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                C870430YCr proxy = this.LIZLLL.getProxy();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("select ");
                EnumC869310Y8j enumC869310Y8j = EnumC869310Y8j.COLUMN_READ_INDEX;
                sbLIZ2.append(enumC869310Y8j.key);
                sbLIZ2.append(" from ");
                sbLIZ2.append("conversation_list");
                sbLIZ2.append(" where ");
                sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
                sbLIZ2.append("=?");
                interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2), "getConversationReadIndex", new String[]{str});
                if (interfaceC869470Y8zLJIIJJI != null && interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                    j = interfaceC869470Y8zLJIIJJI.getLong(interfaceC869470Y8zLJIIJJI.getColumnIndex(enumC869310Y8j.key));
                }
                this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getConversationReadIndex");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao getConversationReadIndex ", e);
                this.LIZJ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return j;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final Map<String, Long> LJJI(List<String> list) {
        this.LIZIZ.LIZLLL().LJFF("IMConversationDao getConversationIdWithShortId");
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select ");
                EnumC869310Y8j enumC869310Y8j = EnumC869310Y8j.COLUMN_ID;
                sbLIZ.append(enumC869310Y8j.key);
                sbLIZ.append(",");
                EnumC869310Y8j enumC869310Y8j2 = EnumC869310Y8j.COLUMN_SHORT_ID;
                sbLIZ.append(enumC869310Y8j2.key);
                sbLIZ.append(" from ");
                sbLIZ.append("conversation_list");
                sbLIZ.append(" where ");
                sbLIZ.append(enumC869310Y8j.key);
                sbLIZ.append(" in ('");
                sbLIZ.append(C870740YDw.LJIIIIZZ("','", list));
                sbLIZ.append("') ");
                interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getConversationShortIds", null);
                if (interfaceC869470Y8zLJIIJJI != null) {
                    HashMap map = new HashMap(interfaceC869470Y8zLJIIJJI.getCount());
                    int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(enumC869310Y8j.key);
                    int columnIndex2 = interfaceC869470Y8zLJIIJJI.getColumnIndex(enumC869310Y8j2.key);
                    while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                        map.put(interfaceC869470Y8zLJIIJJI.getString(columnIndex), Long.valueOf(interfaceC869470Y8zLJIIJJI.getLong(columnIndex2)));
                    }
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return map;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("IMConversationDao getConversationIdWithShortId ");
                sbLIZ2.append(e);
                c868780Y6iLIZLLL.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZJ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return new HashMap();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final C0Y93 LJJIIZ(boolean z) {
        EnumC869410Y8t enumC869410Y8t;
        ArrayList arrayList = new ArrayList();
        String str = EnumC869310Y8j.COLUMN_SORT_ORDER.key;
        C0VRJ c0vrj = C0VRJ.DESC;
        arrayList.add(new C869450Y8x(str, c0vrj, null));
        arrayList.add(new C869450Y8x(EnumC869310Y8j.COLUMN_SHORT_ID.key, c0vrj, null));
        C0Y97 c0y97 = C0Y97.ALL;
        if (z) {
            enumC869410Y8t = EnumC869410Y8t.ALL;
        } else {
            enumC869410Y8t = EnumC869410Y8t.NONE_MESSAGE_REQUEST;
        }
        C869300Y8i c869300Y8i = new C869300Y8i(c0y97, null, -1L, -1L, arrayList, false, enumC869410Y8t, null, -1L, null, C1177004j2.LIZIZ);
        this.LIZIZ.LJIIIZ().getClass();
        return new C0Y93(c869300Y8i, null, null);
    }

    public final boolean LJJIIZI(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid from conversation_list where ");
                sbLIZ.append(EnumC869310Y8j.COLUMN_ID.key);
                sbLIZ.append("=?");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(" limit 1");
                interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2), "hasLocalConversation", new String[]{str});
                if (interfaceC869470Y8zLJIIJJI.getCount() > 0) {
                    z = true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao hasLocalConversation ", e);
                this.LIZJ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("IMConversationDao hasLocalConversation, cid:");
            sbLIZ3.append(str);
            sbLIZ3.append(", result:");
            sbLIZ3.append(z);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final boolean LJJIJ(long j) {
        boolean z = false;
        if (j <= 0) {
            return false;
        }
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select rowid from conversation_list where ");
                sbLIZ.append(EnumC869310Y8j.COLUMN_SHORT_ID.key);
                sbLIZ.append("=?");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(" limit 1");
                interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2), "hasLocalConversationByShortId", new String[]{String.valueOf(j)});
                if (interfaceC869470Y8zLJIIJJI.getCount() > 0) {
                    z = true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao hasLocalConversation ", e);
                this.LIZJ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("IMConversationDao hasLocalConversation, conShortId:");
            sbLIZ3.append(j);
            sbLIZ3.append(", result:");
            sbLIZ3.append(z);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final boolean LJJIJIIJI(C0Y8T c0y8t) {
        return LJJIJL(0, c0y8t);
    }

    public final boolean LJJIJIIJIL(C0Y8T c0y8t) {
        return LJJIJL(1, c0y8t);
    }

    public final boolean LJJIJIL(C0Y8T c0y8t) {
        return LJJIJL(2, c0y8t);
    }

    public final C0Y6Q<List<C1279304zX>> LJJIL(C869710Y9x c869710Y9x) {
        String message;
        C0Y6Q<List<C1279304zX>> c0y6qLIZ;
        int count;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                C0Y99 c0y99LIZLLL = C869610Y9n.LIZLLL(c869710Y9x);
                String str = c0y99LIZLLL.LIZ;
                String[] strArr = c0y99LIZLLL.LIZIZ;
                C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("queryConversationIds sql = ");
                sbLIZ.append(C869610Y9n.LJIIIZ(str));
                sbLIZ.append(", params: ");
                sbLIZ.append(Arrays.toString(strArr));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c868780Y6iLIZLLL.getClass();
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMConversationDao ", strLIZIZ, 4);
                interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(str, "queryConversationIds", strArr);
                if (interfaceC869470Y8zLJIIJJI != null) {
                    count = interfaceC869470Y8zLJIIJJI.getCount();
                } else {
                    count = 0;
                }
                ArrayList arrayList = new ArrayList(count);
                if (interfaceC869470Y8zLJIIJJI != null) {
                    int columnIndex = interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869310Y8j.COLUMN_ID.key);
                    int columnIndex2 = interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869310Y8j.COLUMN_SHORT_ID.key);
                    while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                        String string = interfaceC869470Y8zLJIIJJI.getString(columnIndex);
                        if (string != null) {
                            arrayList.add(new C1279304zX(string, interfaceC869470Y8zLJIIJJI.getLong(columnIndex2)));
                        }
                    }
                }
                C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("queryConversationIds, size: ");
                sbLIZ2.append(arrayList.size());
                sbLIZ2.append(" duration: ");
                sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c868780Y6iLIZLLL2.getClass();
                C868780Y6i.LJ(c868780Y6iLIZLLL2, "IMConversationDao", strLIZIZ2, 4);
                this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "queryConversationIds");
                c0y6qLIZ = C865670Xxd.LIZJ(arrayList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL3 = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("queryConversationIds ");
                sbLIZ3.append(e);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                c868780Y6iLIZLLL3.getClass();
                c868780Y6iLIZLLL3.LJIIIIZZ("IMConversationDao", strLIZIZ3, null);
                this.LIZJ.LJFF().getEventTracker().LJ(e);
                if (e.getMessage() != null) {
                    message = e.getMessage();
                } else {
                    message = "queryConversationIds failed";
                }
                c0y6qLIZ = C865670Xxd.LIZ(-1, message);
            }
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return c0y6qLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final C0Y6Q<List<C0Y8T>> LJJIZ(C869710Y9x c869710Y9x) {
        String message;
        C0Y6Q<List<C0Y8T>> c0y6qLIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                boolean zLJIIJ = C869610Y9n.LJIIJ(c869710Y9x);
                C0Y99 c0y99LJ = C869610Y9n.LJ(c869710Y9x);
                String str = c0y99LJ.LIZ;
                String[] strArr = c0y99LJ.LIZIZ;
                C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("queryConversations sql = ");
                sbLIZ.append(C869610Y9n.LJIIIZ(str));
                sbLIZ.append(", params: ");
                sbLIZ.append(Arrays.toString(strArr));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c868780Y6iLIZLLL.getClass();
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMConversationDao ", strLIZIZ, 4);
                interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(str, "queryConversations", strArr);
                if (interfaceC869470Y8zLJIIJJI != null) {
                    ArrayList arrayList = new ArrayList(interfaceC869470Y8zLJIIJJI.getCount());
                    LJ(interfaceC869470Y8zLJIIJJI, arrayList, zLJIIJ, false);
                    C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("queryConversations, size: ");
                    sbLIZ2.append(arrayList.size());
                    sbLIZ2.append(" duration: ");
                    sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    c868780Y6iLIZLLL2.getClass();
                    C868780Y6i.LJ(c868780Y6iLIZLLL2, "IMConversationDao", strLIZIZ2, 4);
                    this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "queryConversations");
                    c0y6qLIZ = C865670Xxd.LIZJ(arrayList);
                } else {
                    c0y6qLIZ = C865670Xxd.LIZ(-1, "queryConversations cursor is null");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL3 = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("queryConversations ");
                sbLIZ3.append(e);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                c868780Y6iLIZLLL3.getClass();
                c868780Y6iLIZLLL3.LJIIIIZZ("IMConversationDao", strLIZIZ3, null);
                this.LIZJ.LJFF().getEventTracker().LJ(e);
                if (e.getMessage() != null) {
                    message = e.getMessage();
                } else {
                    message = "unknown error";
                }
                c0y6qLIZ = C865670Xxd.LIZ(-1, message);
            }
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return c0y6qLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final boolean LJJJ(C0Y8T c0y8t) {
        if (c0y8t == null || c0y8t.getSortOrder() == C0Y2U.LIZLLL(c0y8t, this.LIZIZ)) {
            return false;
        }
        return true;
    }

    public final boolean LJJJI(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao resetConversationReadCounters, cid:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC869310Y8j.COLUMN_FAKE_UNREAD_COUNT.key, (Integer) 0);
            contentValues.put(EnumC869310Y8j.COLUMN_UNREAD_COUNT.key, (Integer) 0);
            contentValues.put(EnumC869310Y8j.COLUMN_READ_BADGE_COUNT.key, (Integer) 0);
            contentValues.put(EnumC869310Y8j.COLUMN_BADGE_VERSION.key, (Integer) 0);
            contentValues.put(EnumC869310Y8j.COLUMN_BADGE_COUNT.key, (Integer) 0);
            contentValues.put(EnumC869310Y8j.COLUMN_IS_MEMBER.key, Boolean.FALSE);
            contentValues.put(EnumC869310Y8j.COLUMN_HAS_MORE.key, (Integer) 1);
            C870430YCr proxy = this.LIZLLL.getProxy();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
            sbLIZ2.append("=?");
            if (proxy.LJIILJJIL("conversation_list", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{str}) > 0) {
                z = true;
            }
            this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "resetConversationReadCounters");
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao resetConversationReadCounters ", e);
            this.LIZJ.LJFF().getEventTracker().LJ(e);
            return z;
        }
    }

    public final boolean LJJJIL(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao setConversationNoMore, cid:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            EnumC869310Y8j enumC869310Y8j = EnumC869310Y8j.COLUMN_HAS_MORE;
            contentValues.put(enumC869310Y8j.key, (Integer) 0);
            C870430YCr proxy = this.LIZLLL.getProxy();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
            sbLIZ2.append("=? and ");
            sbLIZ2.append(enumC869310Y8j.key);
            sbLIZ2.append("=?");
            if (proxy.LJIILJJIL("conversation_list", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{str, "1"}) > 0) {
                z = true;
            }
            this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "setConversationNoMore");
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao setConversationNoMore ", e);
            this.LIZJ.LJFF().getEventTracker().LJ(e);
            return z;
        }
    }

    public final boolean LJJJJJ(C0Y8T c0y8t) {
        return LJJJJJL(c0y8t, false);
    }

    @Override // X.C0Y91
    public final boolean LJJJJL(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao dissolveConversation:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        C870430YCr proxy = this.LIZLLL.getProxy();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("update conversation_list set ");
        sbLIZ2.append(EnumC869310Y8j.COLUMN_STATUS.key);
        sbLIZ2.append("=");
        sbLIZ2.append(1);
        sbLIZ2.append(" where ");
        sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
        sbLIZ2.append("=\"");
        sbLIZ2.append(str);
        sbLIZ2.append("\"");
        return proxy.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), "dissolveConversation");
    }

    public final boolean LJJJJLI(C0Y8T c0y8t) {
        boolean z = false;
        if (c0y8t != null && !TextUtils.isEmpty(c0y8t.getConversationId())) {
            String conversationId = c0y8t.getConversationId();
            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMConversationDao updateConversationRead, cid:");
            sbLIZ.append(conversationId);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC869310Y8j.COLUMN_UNREAD_COUNT.key, Long.valueOf(c0y8t.getUnreadCount()));
                contentValues.put(EnumC869310Y8j.COLUMN_FAKE_UNREAD_COUNT.key, Integer.valueOf(c0y8t.getFakeUnreadCount()));
                contentValues.put(EnumC869310Y8j.COLUMN_READ_INDEX.key, Long.valueOf(c0y8t.getReadIndex()));
                contentValues.put(EnumC869310Y8j.COLUMN_READ_INDEX_V2.key, Long.valueOf(c0y8t.getReadIndexV2()));
                contentValues.put(EnumC869310Y8j.COLUMN_READ_BADGE_COUNT.key, Integer.valueOf(c0y8t.getReadBadgeCount()));
                contentValues.put(EnumC869310Y8j.COLUMN_BADGE_VERSION.key, Long.valueOf(c0y8t.getBadgeVersion()));
                C870430YCr proxy = this.LIZLLL.getProxy();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
                sbLIZ2.append("=?");
                if (proxy.LJIILJJIL("conversation_list", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{conversationId}) > 0) {
                    z = true;
                }
                this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateConversationRead");
                return z;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao updateConversationRead ", e);
                this.LIZJ.LJFF().getEventTracker().LJ(e);
            }
        }
        return z;
    }

    public final boolean LJJJJZI(C0Y8T c0y8t) {
        if (c0y8t != null && !TextUtils.isEmpty(c0y8t.getConversationId())) {
            return LJJJJZ(C0Y2U.LIZLLL(c0y8t, this.LIZIZ), c0y8t.getConversationId());
        }
        return false;
    }

    public final boolean LJJJLZIJ(C869590Y9l c869590Y9l) {
        boolean z = false;
        if (!TextUtils.isEmpty(c869590Y9l.getConversationId())) {
            String conversationId = c869590Y9l.getConversationId();
            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMConversationDao updateLastMsgToConversation:");
            sbLIZ.append(conversationId);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC869310Y8j.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(c869590Y9l.getIndex()));
                contentValues.put(EnumC869310Y8j.COLUMN_LAST_MSG_UUID.key, c869590Y9l.getUuid());
                contentValues.put(EnumC869310Y8j.COLUMN_UPDATE_TIME.key, Long.valueOf(c869590Y9l.getCreatedAt()));
                contentValues.put(EnumC869310Y8j.COLUMN_LAST_MSG_ORDER_INDEX.key, Long.valueOf(c869590Y9l.getOrderIndex()));
                C870430YCr proxy = this.LIZLLL.getProxy();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
                sbLIZ2.append("=?");
                if (proxy.LJIILJJIL("conversation_list", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{conversationId}) > 0) {
                    z = true;
                }
                this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateLastMsgToConversation");
                return z;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao updateLastMsgToConversation ", e);
                this.LIZJ.LJFF().getEventTracker().LJ(e);
            }
        }
        return z;
    }

    public final boolean LJJJZ(C869590Y9l c869590Y9l) {
        boolean z = false;
        if (c869590Y9l != null && c869590Y9l.getConversationId() != null && !c869590Y9l.getConversationId().isEmpty()) {
            String conversationId = c869590Y9l.getConversationId();
            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMConversationDao updateLastMsgUuidToConversation:");
            sbLIZ.append(conversationId);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC869310Y8j.COLUMN_LAST_MSG_UUID.key, c869590Y9l.getUuid());
                C870430YCr proxy = this.LIZLLL.getProxy();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
                sbLIZ2.append("=?");
                if (proxy.LJIILJJIL("conversation_list", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{conversationId}) > 0) {
                    z = true;
                }
                this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateLastMsgUuidToConversation");
                return z;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao updateLastMsgUuidToConversation ", e);
                this.LIZJ.LJFF().getEventTracker().LIZLLL("IMConversationDao updateLastMsgUuidToConversation ", e);
            }
        }
        return z;
    }

    @Override // X.C0Y91
    public final C0Y8T LIZ(String str, boolean z) {
        C0Y8T c0y8t;
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        c0y8tLIZLLL = null;
        c0y8tLIZLLL = null;
        C0Y8T c0y8tLIZLLL = null;
        interfaceC869470Y8z = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao getConversation, cid:");
        sbLIZ.append(str);
        sbLIZ.append(", fullInfo:");
        sbLIZ.append(z);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                C870430YCr proxy = this.LIZLLL.getProxy();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("select * from conversation_list where ");
                sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
                sbLIZ2.append("=?");
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2), "getConversation", new String[]{str});
                if (interfaceC869470Y8zLJIIJJI != null) {
                    try {
                        if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                            c0y8tLIZLLL = LIZLLL(interfaceC869470Y8zLJIIJJI, z);
                        }
                    } catch (Exception e) {
                        e = e;
                        c0y8t = c0y8tLIZLLL;
                        interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao getConversation ", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8z);
                        return c0y8t;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8z);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                C870440YCs c870440YCsLIZIZ = this.LIZIZ.LJIIZILJ().LJFF().LIZIZ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getConversation:");
                sbLIZ3.append(z);
                c870440YCsLIZIZ.LIZ(jCurrentTimeMillis, C2188811AlT.LIZIZ(sbLIZ3));
                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return c0y8tLIZLLL;
            } catch (Exception e2) {
                e = e2;
                c0y8t = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final C0Y8T LIZLLL(InterfaceC869470Y8z interfaceC869470Y8z, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C0Y8T c0y8t = new C0Y8T();
        c0y8t.setConversationId(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_ID.key)));
        c0y8t.setConversationShortId(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_SHORT_ID.key)));
        c0y8t.setUpdatedTime(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_UPDATE_TIME.key)));
        c0y8t.setFakeUnreadCount(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_FAKE_UNREAD_COUNT.key)));
        c0y8t.setUnreadCount(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_UNREAD_COUNT.key)));
        c0y8t.setConversationType(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_CONVERSATION_TYPE.key)));
        c0y8t.setDraftTime(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_DRAFT_TIME.key)));
        c0y8t.setDraftContent(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_DRAFT_CONTENT.key)));
        c0y8t.setMinIndex(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_MIN_INDEX.key)));
        c0y8t.setLocalExtStr(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_LOCAL_INFO.key)));
        c0y8t.setReadIndex(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_READ_INDEX.key)));
        c0y8t.setLastMessageIndex(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_LAST_MSG_INDEX.key)));
        c0y8t.setLastShowMessageUuid(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_LAST_MSG_UUID.key)));
        c0y8t.setInboxType(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_INBOX.key)));
        boolean z6 = false;
        if (interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_IS_MEMBER.key)) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        c0y8t.setIsMember(z2);
        if (interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_HAS_MORE.key)) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        c0y8t.setHasMore(z3);
        c0y8t.setMemberCount(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_MEMBER_COUNT.key)));
        c0y8t.setStatus(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_STATUS.key)));
        c0y8t.setMemberStr(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_PARTICIPANT.key)));
        c0y8t.setLastMessageOrderIndex(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_LAST_MSG_ORDER_INDEX.key)));
        if (interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_STRANGER.key)) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        c0y8t.setStranger(z4);
        if (interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_RISKY.key)) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        c0y8t.setRisky(z5);
        c0y8t.setSortOrder(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_SORT_ORDER.key)));
        c0y8t.setMinIndexV2(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_MIN_INDEX_V2.key)));
        c0y8t.setMaxIndexV2(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_MAX_INDEX_V2.key)));
        c0y8t.setReadIndexV2(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_READ_INDEX_V2.key)));
        c0y8t.setReadBadgeCount(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_READ_BADGE_COUNT.key)));
        if (interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_IS_IN_BOX.key)) == 1) {
            z6 = true;
        }
        c0y8t.setInBox(z6);
        c0y8t.setConversationRankVersion(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_CONV_RANK_VERSION.key)));
        c0y8t.setBizExt(C870740YDw.LIZIZ(interfaceC869470Y8z.getBlob(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_BIZ_EXT.key))));
        c0y8t.updateBadgeCount(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_BADGE_COUNT.key)), interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_BADGE_VERSION.key)));
        if (z) {
            c0y8t.setMemberIds(this.LIZLLL.LIZIZ().LJIILIIL().LJI(c0y8t.getConversationId()));
            if (c0y8t.getConversationType() == AbstractC1711506n3.LIZ) {
                c0y8t.setSingleChatMembers(this.LIZLLL.LIZIZ().LJIILIIL().LJIIIIZZ(c0y8t.getConversationId()));
            }
            c0y8t.setLastShowMessage(this.LIZLLL.LIZIZ().LJI().LJJIIJZLJL(c0y8t.getConversationId()));
            c0y8t.setCoreInfo(this.LIZLLL.LIZIZ().LJIIIIZZ().LJ(c0y8t.getConversationId()));
            c0y8t.setSettingInfo(this.LIZLLL.LIZIZ().LIZ().LJ(c0y8t.getConversationId()));
            c0y8t.setUnreadSelfMentionedMessages(this.LIZLLL.LIZIZ().LIZIZ().LJ(Math.max(c0y8t.getMinIndex(), c0y8t.getReadIndex()), c0y8t.getConversationId()));
        }
        return c0y8t;
    }

    public final C0Y6Q<List<C0Y8T>> LJIIL(C873950YQf c873950YQf, boolean z) {
        EnumC869410Y8t enumC869410Y8t;
        if (z) {
            enumC869410Y8t = EnumC869410Y8t.ALL;
        } else {
            enumC869410Y8t = EnumC869410Y8t.NONE_MESSAGE_REQUEST;
        }
        return LJIIJJI(-1, -1, enumC869410Y8t, c873950YQf, true);
    }

    public final C0Y8T LJIJ(long j, boolean z) throws Throwable {
        C0Y8T c0y8t;
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        c0y8tLIZLLL = null;
        c0y8tLIZLLL = null;
        C0Y8T c0y8tLIZLLL = null;
        interfaceC869470Y8z = null;
        if (j <= 0) {
            return null;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao getConversation, conShortid:");
        sbLIZ.append(j);
        sbLIZ.append(", fullInfo:");
        sbLIZ.append(z);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                C870430YCr proxy = this.LIZLLL.getProxy();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("select * from conversation_list where ");
                sbLIZ2.append(EnumC869310Y8j.COLUMN_SHORT_ID.key);
                sbLIZ2.append("=?");
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2), "getConversationByShortId", new String[]{String.valueOf(j)});
                if (interfaceC869470Y8zLJIIJJI != null) {
                    try {
                        if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                            c0y8tLIZLLL = LIZLLL(interfaceC869470Y8zLJIIJJI, z);
                        }
                    } catch (Exception e) {
                        e = e;
                        c0y8t = c0y8tLIZLLL;
                        interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao getConversation ", e);
                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8z);
                        return c0y8t;
                    } catch (Throwable th) {
                        th = th;
                        interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8z);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                }
                C870440YCs c870440YCsLIZIZ = this.LIZIZ.LJIIZILJ().LJFF().LIZIZ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getConversation:");
                sbLIZ3.append(z);
                c870440YCsLIZIZ.LIZ(jCurrentTimeMillis, C2188811AlT.LIZIZ(sbLIZ3));
                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                return c0y8tLIZLLL;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e2) {
            e = e2;
            c0y8t = null;
        }
    }

    public final List<C0Y8T> LJIJI(long j, C869290Y8h c869290Y8h) {
        return LJJII(j, j, -1, c869290Y8h);
    }

    public final C0Y6Q LJIL(int i, boolean z) {
        C0Y6Q c0y6qLIZ;
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao getConversationRange:[");
        sbLIZ.append(0);
        sbLIZ.append(",");
        sbLIZ.append(i);
        sbLIZ.append(")");
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                String strLJFF = C869610Y9n.LJFF(LJJIIZ(z), i);
                C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getConversationRange sql = ");
                sbLIZ2.append(C869610Y9n.LJIIIZ(strLJFF));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c868780Y6iLIZLLL2.getClass();
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "IMConversationDao ", strLIZIZ, 4);
                interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(strLJFF, "getConversationRange", null);
                if (interfaceC869470Y8zLJIIJJI != null) {
                    ArrayList arrayList = new ArrayList(interfaceC869470Y8zLJIIJJI.getCount());
                    if (!this.LIZIZ.LJIIIZ().LJJLIIIIJ.LIZIZ.LJ) {
                        LJ(interfaceC869470Y8zLJIIJJI, arrayList, false, true);
                    } else {
                        while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                            arrayList.add(LIZLLL(interfaceC869470Y8zLJIIJJI, true));
                        }
                    }
                    c0y6qLIZ = C865670Xxd.LIZJ(arrayList);
                } else {
                    c0y6qLIZ = C865670Xxd.LIZ(202, "cursor is null.");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL3 = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("IMConversationDao getConversationRange ");
                sbLIZ3.append(e);
                c868780Y6iLIZLLL3.LJI(C2188811AlT.LIZIZ(sbLIZ3));
                this.LIZJ.LJFF().getEventTracker().LJ(e);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("exception: ");
                sbLIZ4.append(e.getMessage());
                c0y6qLIZ = C865670Xxd.LIZ(201, C2188811AlT.LIZIZ(sbLIZ4));
            }
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return c0y6qLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL.LIZ().LIZ(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair<java.lang.Integer, java.lang.Integer> LJJIIJ(int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869260Y8e.LJJIIJ(int, boolean):android.util.Pair");
    }

    public final boolean LJJIJL(int i, C0Y8T c0y8t) {
        boolean z = false;
        if (c0y8t != null && !TextUtils.isEmpty(c0y8t.getConversationId())) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMConversationDao insertConversation:");
            sbLIZ.append(c0y8t.getConversationId());
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            long jCurrentTimeMillis = System.currentTimeMillis();
            ContentValues contentValuesLJII = LJII(c0y8t);
            if (c0y8t.getCoreInfo() != null) {
                this.LIZLLL.LIZIZ().LJIIIIZZ().LJI(c0y8t.getCoreInfo());
            }
            if (c0y8t.getSettingInfo() != null) {
                this.LIZLLL.LIZIZ().LIZ().LJII(c0y8t.getSettingInfo());
            }
            if (this.LIZLLL.getProxy().LJIIIIZZ("conversation_list", contentValuesLJII, i) >= 0) {
                z = true;
            }
            this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "insertConversation");
        }
        return z;
    }

    public final boolean LJJJJ(long j, String str) {
        if (!TextUtils.isEmpty(str) && j > 0) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMConversationDao setConversationTime, cid:");
            sbLIZ.append(str);
            sbLIZ.append(", updateTime:");
            sbLIZ.append(j);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            C870430YCr proxy = this.LIZLLL.getProxy();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("update conversation_list set ");
            sbLIZ2.append(EnumC869310Y8j.COLUMN_UPDATE_TIME.key);
            sbLIZ2.append("=");
            sbLIZ2.append(j);
            sbLIZ2.append(" where ");
            sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
            sbLIZ2.append("=\"");
            sbLIZ2.append(str);
            sbLIZ2.append("\"");
            return proxy.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), "setConversationTime");
        }
        return false;
    }

    public final boolean LJJJJI(String str, boolean z) {
        boolean z2 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao transferStrangerConversation:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC869310Y8j.COLUMN_STRANGER.key, (Integer) 0);
            if (z) {
                contentValues.put(EnumC869310Y8j.COLUMN_RISKY.key, (Integer) 0);
            }
            contentValues.put(EnumC869310Y8j.COLUMN_HAS_MORE.key, (Integer) 0);
            C870430YCr proxy = this.LIZLLL.getProxy();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
            sbLIZ2.append("=?");
            if (proxy.LJIILJJIL("conversation_list", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{str}) > 0) {
                z2 = true;
            }
            C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("IMConversationDao transferStrangerConversation, result:");
            sbLIZ3.append(z2);
            c868780Y6iLIZLLL2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
            return z2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao transferStrangerConversation ", e);
            this.LIZJ.LJFF().getEventTracker().LJ(e);
            return z2;
        }
    }

    public final boolean LJJJJJL(C0Y8T c0y8t, boolean z) {
        boolean z2 = false;
        if (!TextUtils.isEmpty(c0y8t.getConversationId())) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMConversationDao updateConversation:");
            sbLIZ.append(c0y8t.getConversationId());
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues contentValuesLJII = LJII(c0y8t);
                EnumC869310Y8j enumC869310Y8j = EnumC869310Y8j.COLUMN_ID;
                contentValuesLJII.remove(enumC869310Y8j.key);
                if (c0y8t.getConversationShortId() <= 0) {
                    contentValuesLJII.remove(EnumC869310Y8j.COLUMN_SHORT_ID.key);
                }
                if (!z) {
                    contentValuesLJII.remove(EnumC869310Y8j.COLUMN_STRANGER.key);
                }
                C870430YCr proxy = this.LIZLLL.getProxy();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(enumC869310Y8j.key);
                sbLIZ2.append("=?");
                if (proxy.LJIILJJIL("conversation_list", contentValuesLJII, C2188811AlT.LIZIZ(sbLIZ2), new String[]{c0y8t.getConversationId()}) > 0) {
                    z2 = true;
                }
                if (c0y8t.getCoreInfo() != null) {
                    this.LIZLLL.LIZIZ().LJIIIIZZ().LJI(c0y8t.getCoreInfo());
                }
                if (c0y8t.getSettingInfo() != null) {
                    this.LIZLLL.LIZIZ().LIZ().LJII(c0y8t.getSettingInfo());
                }
                this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateConversation");
                return z2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao updateConversation ", e);
                this.LIZJ.LJFF().getEventTracker().LJ(e);
            }
        }
        return z2;
    }

    public final boolean LJJJJZ(long j, String str) {
        if (str != null && !str.isEmpty()) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMConversationDao setConversationSortOrder");
            sbLIZ.append(str);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            C870430YCr proxy = this.LIZLLL.getProxy();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("update conversation_list set ");
            sbLIZ2.append(EnumC869310Y8j.COLUMN_SORT_ORDER.key);
            sbLIZ2.append("=");
            sbLIZ2.append(j);
            sbLIZ2.append(" where ");
            sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
            sbLIZ2.append("=\"");
            sbLIZ2.append(str);
            sbLIZ2.append("\"");
            return proxy.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), "setConversationSortOrder");
        }
        return false;
    }

    public final boolean LJJL(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao updateLocalExt, cid:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        ContentValues contentValues = new ContentValues();
        contentValues.put(EnumC869310Y8j.COLUMN_LOCAL_INFO.key, C0Y8V.LJII(map));
        C870430YCr proxy = this.LIZLLL.getProxy();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
        sbLIZ2.append("=?");
        if (proxy.LJIILJJIL("conversation_list", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{str}) <= 0) {
            return false;
        }
        return true;
    }

    public final boolean LJJLI(int i, String str) {
        boolean z = false;
        if (!TextUtils.isEmpty(str) && i >= 0) {
            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IMConversationDao updateMemberCount:");
            sbLIZ.append(str);
            c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC869310Y8j.COLUMN_MEMBER_COUNT.key, Integer.valueOf(i));
                C870430YCr proxy = this.LIZLLL.getProxy();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
                sbLIZ2.append("=?");
                if (proxy.LJIILJJIL("conversation_list", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{str}) > 0) {
                    z = true;
                }
                this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateMemberCount");
                return z;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao updateMemberCount ", e);
                this.LIZJ.LJFF().getEventTracker().LJ(e);
            }
        }
        return z;
    }

    public final Map LJIILLIIL(C873950YQf c873950YQf, Set set, EnumC871430YGn enumC871430YGn) {
        return LJIILL(C869610Y9n.LJFF(LJJIIJZLJL(EnumC869400Y8s.ONE_TO_ONE_CHAT.getValue(), EnumC869410Y8t.ONLY_MESSAGE_REQUEST, c873950YQf, set, enumC871430YGn), LSPassThroughRecordSizeConfig.DEFAULT));
    }

    public final List LJJIFFI(long j, int i, C869290Y8h c869290Y8h) {
        return LJJII(j, 1L, i, c869290Y8h);
    }

    public final List<C0Y8T> LJJIII(int i, EnumC871430YGn enumC871430YGn, C869380Y8q c869380Y8q) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        ArrayList arrayList;
        ArrayList arrayList2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0Y97 c0y97 = c869380Y8q.LIZJ;
        long j = c869380Y8q.LJI;
        long j2 = c869380Y8q.LJFF;
        ArrayList arrayList3 = new ArrayList();
        try {
            try {
                try {
                    interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(LJI(j2, j2, i, j, c0y97, enumC871430YGn, c869380Y8q.LIZLLL), "getMessageRequestConvsWithQueryInfo", null);
                    if (interfaceC869470Y8zLJIIJJI != null) {
                        try {
                            try {
                                arrayList = new ArrayList(interfaceC869470Y8zLJIIJJI.getCount());
                            } catch (Throwable th) {
                                th = th;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                        }
                        try {
                            LJ(interfaceC869470Y8zLJIIJJI, arrayList, false, false);
                        } catch (Exception e2) {
                            e = e2;
                            arrayList3 = arrayList;
                            TryCatchGuardChecker.doCheck(e);
                            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("IMConversationDao getMessageRequestConvsWithQueryInfo ");
                            sbLIZ.append(e);
                            c868780Y6iLIZLLL.LJI(C2188811AlT.LIZIZ(sbLIZ));
                            this.LIZJ.LJFF().getEventTracker().LJ(e);
                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            return arrayList3;
                        }
                    } else {
                        arrayList = arrayList3;
                    }
                    try {
                        if (arrayList.size() < i) {
                            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            try {
                                arrayList2 = new ArrayList();
                            } catch (Exception e3) {
                                e = e3;
                            }
                            try {
                                interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(LJI(-1L, Math.max(-1L, j2 - 1), i - arrayList.size(), -1L, c0y97, enumC871430YGn, c869380Y8q.LJ), "getMessageRequestConvsWithQueryInfo", null);
                                if (interfaceC869470Y8zLJIIJJI != null) {
                                    try {
                                        arrayList2 = new ArrayList(interfaceC869470Y8zLJIIJJI.getCount());
                                        LJ(interfaceC869470Y8zLJIIJJI, arrayList2, false, false);
                                    } catch (Exception e4) {
                                        e = e4;
                                        arrayList3 = arrayList;
                                        TryCatchGuardChecker.doCheck(e);
                                        C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("IMConversationDao getMessageRequestConvsWithQueryInfo ");
                                        sbLIZ2.append(e);
                                        c868780Y6iLIZLLL2.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                                        this.LIZJ.LJFF().getEventTracker().LJ(e);
                                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                        return arrayList3;
                                    }
                                }
                                arrayList.addAll(arrayList2);
                            } catch (Exception e5) {
                                e = e5;
                                interfaceC869470Y8zLJIIJJI = null;
                                arrayList3 = arrayList;
                                TryCatchGuardChecker.doCheck(e);
                                C868780Y6i c868780Y6iLIZLLL22 = this.LIZIZ.LIZLLL();
                                StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                                sbLIZ22.append("IMConversationDao getMessageRequestConvsWithQueryInfo ");
                                sbLIZ22.append(e);
                                c868780Y6iLIZLLL22.LJI(C2188811AlT.LIZIZ(sbLIZ22));
                                this.LIZJ.LJFF().getEventTracker().LJ(e);
                                this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                return arrayList3;
                            }
                        }
                        this.LIZIZ.LJIIZILJ().LJFF().LIZ().LJIIIZ(enumC871430YGn, jCurrentTimeMillis, arrayList.size());
                        this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        return arrayList;
                    } catch (Exception e6) {
                        e = e6;
                    }
                } catch (Exception e7) {
                    e = e7;
                    interfaceC869470Y8zLJIIJJI = null;
                    TryCatchGuardChecker.doCheck(e);
                    C868780Y6i c868780Y6iLIZLLL222 = this.LIZIZ.LIZLLL();
                    StringBuilder sbLIZ222 = C2188811AlT.LIZ();
                    sbLIZ222.append("IMConversationDao getMessageRequestConvsWithQueryInfo ");
                    sbLIZ222.append(e);
                    c868780Y6iLIZLLL222.LJI(C2188811AlT.LIZIZ(sbLIZ222));
                    this.LIZJ.LJFF().getEventTracker().LJ(e);
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return arrayList3;
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC869470Y8zLJIIJJI = null;
                while (true) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    throw th;
                }
            }
        } catch (Exception e8) {
            e = e8;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final boolean LJJIJLIJ(long j, long j2, String str) {
        boolean zLJIJJLI = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao markDeleteConversation:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(str)) {
            C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("IMConversationDao updateConversationMinIndex, cid:");
            sbLIZ2.append(str);
            c868780Y6iLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(EnumC869310Y8j.COLUMN_MIN_INDEX.key, Long.valueOf(j));
                contentValues.put(EnumC869310Y8j.COLUMN_MIN_INDEX_V2.key, Long.valueOf(j2));
                contentValues.put(EnumC869310Y8j.COLUMN_LAST_MSG_INDEX.key, (Long) 0L);
                contentValues.put(EnumC869310Y8j.COLUMN_LAST_MSG_UUID.key, "");
                contentValues.put(EnumC869310Y8j.COLUMN_DRAFT_TIME.key, (Integer) 0);
                contentValues.put(EnumC869310Y8j.COLUMN_DRAFT_CONTENT.key, "");
                if (!this.LIZIZ.LJIIIZ().LJJLIIIIJ.LJIJ) {
                    contentValues.put(EnumC869310Y8j.COLUMN_HAS_MORE.key, (Integer) 1);
                }
                C870430YCr proxy = this.LIZLLL.getProxy();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(EnumC869310Y8j.COLUMN_ID.key);
                sbLIZ3.append("=?");
                if (proxy.LJIILJJIL("conversation_list", contentValues, C2188811AlT.LIZIZ(sbLIZ3), new String[]{str}) > 0) {
                    zLJIJJLI = true;
                }
                this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis2, "updateConversationMinIndex");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao updateConvWhenDeleted ", e);
                this.LIZJ.LJFF().getEventTracker().LJ(e);
            }
            if (zLJIJJLI) {
                zLJIJJLI = this.LIZLLL.LIZIZ().LJI().LJIJJLI(str);
                this.LIZLLL.LIZIZ().LIZ().LIZLLL(str);
                this.LIZLLL.LIZIZ().LJIIIIZZ().LIZLLL(str);
                this.LIZLLL.LIZIZ().LJIILIIL().LJIILIIL(str);
                if (this.LIZIZ.LJIIIZ().LJJLIIIIJ.LJIIIZ.enableConvKvCache) {
                    this.LIZIZ.LJIIZILJ().LIZLLL().LJ().LIZIZ(str);
                } else {
                    this.LIZLLL.LIZIZ().LJIILJJIL().LIZIZ(str);
                }
            }
        }
        this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "markDeleteConversation");
        return zLJIJJLI;
    }

    public final boolean LJJJLL(long j, String str, String str2) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao updateDraft, cid:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j < 0) {
            j = 0;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC869310Y8j.COLUMN_DRAFT_TIME.key, Long.valueOf(j));
            String str3 = EnumC869310Y8j.COLUMN_DRAFT_CONTENT.key;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put(str3, str2);
            C870430YCr proxy = this.LIZLLL.getProxy();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
            sbLIZ2.append("=?");
            if (proxy.LJIILJJIL("conversation_list", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{str}) > 0) {
                z = true;
            }
            this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateDraft");
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao updateDraft ", e);
            this.LIZJ.LJFF().getEventTracker().LJ(e);
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v185, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.util.Map] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:224:? -> B:196:0x06ec). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:234:? -> B:202:0x06ff). Please report as a decompilation issue!!! */
    public final void LJ(InterfaceC869470Y8z interfaceC869470Y8z, ArrayList arrayList, boolean z, boolean z2) throws Throwable {
        int columnIndex;
        C869370Y8p c869370Y8p;
        HashMap map;
        HashMap map2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (interfaceC869470Y8z == null) {
            return;
        }
        if (z) {
            columnIndex = interfaceC869470Y8z.getColumnIndex("conversation_id_alias");
        } else {
            columnIndex = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_ID.key);
        }
        int columnIndex2 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_SHORT_ID.key);
        int columnIndex3 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_UPDATE_TIME.key);
        int columnIndex4 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_UNREAD_COUNT.key);
        int columnIndex5 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_FAKE_UNREAD_COUNT.key);
        int columnIndex6 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_CONVERSATION_TYPE.key);
        int columnIndex7 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_DRAFT_TIME.key);
        int columnIndex8 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_DRAFT_CONTENT.key);
        int columnIndex9 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_MIN_INDEX.key);
        int columnIndex10 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_LOCAL_INFO.key);
        int columnIndex11 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_READ_INDEX.key);
        int columnIndex12 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_LAST_MSG_INDEX.key);
        int columnIndex13 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_LAST_MSG_UUID.key);
        int columnIndex14 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_INBOX.key);
        int columnIndex15 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_IS_MEMBER.key);
        int columnIndex16 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_HAS_MORE.key);
        int columnIndex17 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_MEMBER_COUNT.key);
        int columnIndex18 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_STATUS.key);
        int columnIndex19 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_PARTICIPANT.key);
        int columnIndex20 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_LAST_MSG_ORDER_INDEX.key);
        int columnIndex21 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_STRANGER.key);
        int columnIndex22 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_RISKY.key);
        int columnIndex23 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_SORT_ORDER.key);
        int columnIndex24 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_MIN_INDEX_V2.key);
        int columnIndex25 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_MAX_INDEX_V2.key);
        int columnIndex26 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_READ_INDEX_V2.key);
        int columnIndex27 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_BADGE_COUNT.key);
        int columnIndex28 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_READ_BADGE_COUNT.key);
        int columnIndex29 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_IS_IN_BOX.key);
        int columnIndex30 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_BIZ_EXT.key);
        int columnIndex31 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_BADGE_VERSION.key);
        int columnIndex32 = interfaceC869470Y8z.getColumnIndex(EnumC869310Y8j.COLUMN_CONV_RANK_VERSION.key);
        ?? map3 = new HashMap();
        if (z) {
            this.LIZLLL.LIZIZ().LIZ().getClass();
            c869370Y8p = new C869370Y8p(interfaceC869470Y8z);
        } else {
            c869370Y8p = null;
        }
        ArrayList arrayList2 = new ArrayList(interfaceC869470Y8z.getCount());
        ArrayList arrayList3 = new ArrayList();
        HashMap map4 = new HashMap(interfaceC869470Y8z.getCount());
        C0Y92 c0y92 = this.LIZIZ.LJIIIZ().LJJLIIIIJ.LIZIZ;
        boolean z6 = c0y92.LIZ;
        boolean z7 = c0y92.LIZIZ;
        boolean z8 = c0y92.LIZJ;
        boolean z9 = c0y92.LIZLLL;
        while (interfaceC869470Y8z.moveToNext()) {
            C0Y8T c0y8t = new C0Y8T();
            String string = interfaceC869470Y8z.getString(columnIndex);
            c0y8t.setConversationId(string);
            c0y8t.setConversationShortId(interfaceC869470Y8z.getLong(columnIndex2));
            c0y8t.setUpdatedTime(interfaceC869470Y8z.getLong(columnIndex3));
            c0y8t.setFakeUnreadCount(interfaceC869470Y8z.getInt(columnIndex5));
            c0y8t.setUnreadCount(interfaceC869470Y8z.getInt(columnIndex4));
            c0y8t.setConversationType(interfaceC869470Y8z.getInt(columnIndex6));
            c0y8t.setDraftTime(interfaceC869470Y8z.getLong(columnIndex7));
            c0y8t.setDraftContent(interfaceC869470Y8z.getString(columnIndex8));
            c0y8t.setMinIndex(interfaceC869470Y8z.getLong(columnIndex9));
            if (z6 && z2) {
                c0y8t.optSetLocalExtStr(interfaceC869470Y8z.getString(columnIndex10));
            } else {
                try {
                    c0y8t.setLocalExtStr(interfaceC869470Y8z.getString(columnIndex10));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao setLocalExtStr error", th);
                    C870460YCu c870460YCuLIZ = this.LIZIZ.LJIIZILJ().LJFF().LIZ();
                    String string2 = interfaceC869470Y8z.getString(columnIndex10);
                    C0YJ9 c0yj9 = new C0YJ9(c870460YCuLIZ.LIZJ);
                    c0yj9.LIZJ("im_sdk_local_ext_err");
                    c0yj9.LIZ(C870460YCu.LIZ(th), "error_msg");
                    c0yj9.LIZ(C870460YCu.LIZIZ(th), "error_stack");
                    if (string2 == null) {
                        c0yj9.LIZ("none", "local_ext");
                    } else {
                        c0yj9.LIZ(string2, "local_ext");
                    }
                    c0yj9.LJ(1.0f);
                }
            }
            c0y8t.setReadIndex(interfaceC869470Y8z.getLong(columnIndex11));
            c0y8t.setLastMessageIndex(interfaceC869470Y8z.getLong(columnIndex12));
            c0y8t.setLastShowMessageUuid(interfaceC869470Y8z.getString(columnIndex13));
            c0y8t.setInboxType(interfaceC869470Y8z.getInt(columnIndex14));
            if (interfaceC869470Y8z.getInt(columnIndex15) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            c0y8t.setIsMember(z3);
            if (interfaceC869470Y8z.getInt(columnIndex16) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            c0y8t.setHasMore(z4);
            c0y8t.setMemberCount(interfaceC869470Y8z.getInt(columnIndex17));
            c0y8t.setStatus(interfaceC869470Y8z.getInt(columnIndex18));
            if (z6 && z2) {
                c0y8t.optSetMemberStr(interfaceC869470Y8z.getString(columnIndex19));
            } else {
                c0y8t.setMemberStr(interfaceC869470Y8z.getString(columnIndex19));
            }
            c0y8t.setLastMessageOrderIndex(interfaceC869470Y8z.getLong(columnIndex20));
            boolean z10 = true;
            if (interfaceC869470Y8z.getInt(columnIndex21) == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            c0y8t.setStranger(z5);
            if (interfaceC869470Y8z.getInt(columnIndex22) != 1) {
                z10 = false;
            }
            c0y8t.setRisky(z10);
            c0y8t.setSortOrder(interfaceC869470Y8z.getLong(columnIndex23));
            c0y8t.setMinIndexV2(interfaceC869470Y8z.getLong(columnIndex24));
            c0y8t.setMaxIndexV2(interfaceC869470Y8z.getLong(columnIndex25));
            c0y8t.setReadIndexV2(interfaceC869470Y8z.getLong(columnIndex26));
            c0y8t.setReadBadgeCount(interfaceC869470Y8z.getInt(columnIndex28));
            c0y8t.updateBadgeCount(interfaceC869470Y8z.getInt(columnIndex27), interfaceC869470Y8z.getLong(columnIndex31));
            c0y8t.setConversationRankVersion(interfaceC869470Y8z.getLong(columnIndex32));
            boolean z11 = true;
            if (interfaceC869470Y8z.getInt(columnIndex29) != 1) {
                z11 = false;
            }
            c0y8t.setInBox(z11);
            c0y8t.setBizExt(C870740YDw.LIZIZ(interfaceC869470Y8z.getBlob(columnIndex30)));
            if (z) {
                this.LIZLLL.LIZIZ().LIZ().getClass();
                C0Y8W c0y8wLIZIZ = C869250Y8d.LIZIZ(interfaceC869470Y8z, c869370Y8p, z6, z2);
                map3.put(c0y8wLIZIZ.getConversationId(), c0y8wLIZIZ);
            }
            arrayList2.add(string);
            if (c0y8t.getConversationType() == AbstractC1711506n3.LIZ) {
                arrayList3.add(string);
            }
            map4.put(string, Long.valueOf(Math.max(c0y8t.getMinIndex(), c0y8t.getReadIndex())));
            arrayList.add(c0y8t);
        }
        if (!arrayList2.isEmpty()) {
            Map<String, List<Long>> mapLJIIIZ = this.LIZLLL.LIZIZ().LJIILIIL().LJIIIZ(arrayList2);
            Map<String, List<C0YAE>> mapLJ = this.LIZLLL.LIZIZ().LJIILIIL().LJ(arrayList3);
            C869270Y8f c869270Y8fLJIIIIZZ = this.LIZLLL.LIZIZ().LJIIIIZZ();
            c869270Y8fLJIIIIZZ.getClass();
            if (arrayList2.size() <= 0) {
                map = null;
            } else {
                map = new HashMap();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select * from conversation_core where ");
                sbLIZ.append(EnumC869330Y8l.COLUMN_ID.key);
                sbLIZ.append(" in (");
                StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (i == arrayList2.size() - 1) {
                        sb.append("'");
                        sb.append((String) ListProtector.get(arrayList2, i));
                        sb.append("')");
                        try {
                            try {
                                try {
                                    interfaceC869470Y8zLJIIJJI = c869270Y8fLJIIIIZZ.LIZJ.getProxy().LJIIJJI(sb.toString(), "getConversationCoreInfoMap", null);
                                } catch (Exception e) {
                                    e = e;
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            c869270Y8fLJIIIIZZ.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            throw th;
                        }
                        try {
                            try {
                                C869270Y8f.LIZJ(interfaceC869470Y8zLJIIJJI, map, z6, z2);
                            } catch (Exception e3) {
                                e = e3;
                                TryCatchGuardChecker.doCheck(e);
                                c869270Y8fLJIIIIZZ.LIZ.LIZLLL().LJIIIZ("IMConversationCoreDao getCoreInfoMap ", e);
                                c869270Y8fLJIIIIZZ.LIZIZ.LJFF().getEventTracker().LJ(e);
                            }
                            c869270Y8fLJIIIIZZ.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                        } catch (Throwable th3) {
                            th = th3;
                            TryCatchGuardChecker.doCheck(th);
                            c869270Y8fLJIIIIZZ.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                            throw th;
                        }
                    } else {
                        sb.append("'");
                        sb.append((String) ListProtector.get(arrayList2, i));
                        sb.append("',");
                    }
                }
            }
            if (!z) {
                map3 = this.LIZLLL.LIZIZ().LIZ().LJI(arrayList2, z6, z8, z2);
            }
            C869280Y8g c869280Y8gLIZIZ = this.LIZLLL.LIZIZ().LIZIZ();
            c869280Y8gLIZIZ.getClass();
            if (arrayList2.size() <= 0) {
                map2 = null;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                map2 = new HashMap();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("select * from mention where ");
                sbLIZ2.append(EnumC869390Y8r.COLUMN_CONVERSATION_ID.key);
                sbLIZ2.append(" in (");
                StringBuilder sb2 = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI2 = null;
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 == arrayList2.size() - 1) {
                        sb2.append("'");
                        sb2.append((String) ListProtector.get(arrayList2, i2));
                        sb2.append("') order by ");
                        sb2.append(EnumC869390Y8r.COLUMN_CREATED_TIME.key);
                        sb2.append(" desc");
                        try {
                            try {
                                try {
                                    interfaceC869470Y8zLJIIJJI2 = c869280Y8gLIZIZ.LIZJ.getProxy().LJIIJJI(sb2.toString(), "getUnreadSelfMentionedMsgMap", null);
                                    if (interfaceC869470Y8zLJIIJJI2 != null) {
                                        try {
                                            try {
                                                int columnIndex33 = interfaceC869470Y8zLJIIJJI2.getColumnIndex(EnumC869390Y8r.COLUMN_CONVERSATION_ID.key);
                                                int columnIndex34 = interfaceC869470Y8zLJIIJJI2.getColumnIndex(EnumC869390Y8r.COLUMN_IDS_STR.key);
                                                int columnIndex35 = interfaceC869470Y8zLJIIJJI2.getColumnIndex(EnumC869390Y8r.COLUMN_UUID.key);
                                                try {
                                                    HashMap map5 = new HashMap();
                                                    while (interfaceC869470Y8zLJIIJJI2.moveToNext()) {
                                                        try {
                                                            try {
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                TryCatchGuardChecker.doCheck(th);
                                                                c869280Y8gLIZIZ.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI2);
                                                                throw th;
                                                            }
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                        }
                                                        try {
                                                            if (C870740YDw.LJII(String.valueOf(c869280Y8gLIZIZ.LIZ.getUid()), interfaceC869470Y8zLJIIJJI2.getString(columnIndex34))) {
                                                                String string3 = interfaceC869470Y8zLJIIJJI2.getString(columnIndex33);
                                                                List arrayList4 = (List) map5.get(string3);
                                                                if (arrayList4 == null) {
                                                                    arrayList4 = new ArrayList();
                                                                    map5.put(string3, arrayList4);
                                                                }
                                                                arrayList4.add(interfaceC869470Y8zLJIIJJI2.getString(columnIndex35));
                                                            }
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            TryCatchGuardChecker.doCheck(e);
                                                            c869280Y8gLIZIZ.LIZ.LIZLLL().LJIIIZ("IMMentionDao getUnreadSelfMentionedMsgMap", e);
                                                            c869280Y8gLIZIZ.LIZIZ.LJFF().getEventTracker().LJ(e);
                                                            c869280Y8gLIZIZ.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI2);
                                                        }
                                                    }
                                                    try {
                                                        for (Map.Entry entry : map5.entrySet()) {
                                                            try {
                                                                Long l = (Long) map4.get(entry.getKey());
                                                                List arrayList5 = new ArrayList();
                                                                if (l != null) {
                                                                    try {
                                                                        arrayList5 = c869280Y8gLIZIZ.LIZJ.LIZIZ().LJI().LJJJJIZL(l.longValue(), (List) entry.getValue());
                                                                    } catch (Exception e6) {
                                                                        e = e6;
                                                                        TryCatchGuardChecker.doCheck(e);
                                                                        c869280Y8gLIZIZ.LIZ.LIZLLL().LJIIIZ("IMMentionDao getUnreadSelfMentionedMsgMap", e);
                                                                        c869280Y8gLIZIZ.LIZIZ.LJFF().getEventTracker().LJ(e);
                                                                        c869280Y8gLIZIZ.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI2);
                                                                    }
                                                                }
                                                                map2.put((String) entry.getKey(), arrayList5);
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                            }
                                                        }
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                    }
                                                } catch (Exception e9) {
                                                    e = e9;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                TryCatchGuardChecker.doCheck(th);
                                                c869280Y8gLIZIZ.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI2);
                                                throw th;
                                            }
                                        } catch (Exception e10) {
                                            e = e10;
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } catch (Exception e12) {
                            e = e12;
                        }
                        c869280Y8gLIZIZ.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI2);
                    } else {
                        sb2.append("'");
                        sb2.append((String) ListProtector.get(arrayList2, i2));
                        sb2.append("',");
                    }
                }
                c869280Y8gLIZIZ.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getUnreadSelfMentionedMsgMap");
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String lastShowMessageUuid = ((C0Y8T) it2.next()).getLastShowMessageUuid();
                if (lastShowMessageUuid != null && !lastShowMessageUuid.isEmpty()) {
                    arrayList6.add(lastShowMessageUuid);
                }
            }
            List<C869590Y9l> listLJJJJJL = this.LIZLLL.LIZIZ().LJI().LJJJJJL(arrayList6, z6, z9, z2);
            HashMap map6 = new HashMap();
            for (C869590Y9l c869590Y9l : listLJJJJJL) {
                map6.put(c869590Y9l.getConversationId(), c869590Y9l);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C0Y8T c0y8t2 = (C0Y8T) it3.next();
                String conversationId = c0y8t2.getConversationId();
                if (mapLJIIIZ != null && !mapLJIIIZ.isEmpty() && mapLJIIIZ.get(conversationId) != null) {
                    List<Long> list = mapLJIIIZ.get(conversationId);
                    c0y8t2.setMemberIds(list);
                    if (list != null) {
                        c0y8t2.setMemberCount(list.size());
                    }
                }
                if (mapLJ != null && !mapLJ.isEmpty() && c0y8t2.getConversationType() == AbstractC1711506n3.LIZ) {
                    c0y8t2.setSingleChatMembers(mapLJ.get(conversationId));
                }
                if (map6.get(conversationId) != null) {
                    c0y8t2.setLastShowMessage((C869590Y9l) map6.get(conversationId));
                } else if (!z7 || ((c0y8t2.getLastShowMessageUuid() != null && !c0y8t2.getLastShowMessageUuid().isEmpty()) || !z2)) {
                    C869590Y9l c869590Y9lLJJIIJZLJL = this.LIZLLL.LIZIZ().LJI().LJJIIJZLJL(conversationId);
                    LJJJZ(c869590Y9lLJJIIJZLJL);
                    c0y8t2.setLastShowMessage(c869590Y9lLJJIIJZLJL);
                    if (c869590Y9lLJJIIJZLJL != null) {
                        this.LIZIZ.LIZLLL().LJIILL("IMConversationDao  not null last msg from getLastShowMsg");
                    }
                }
                if (map != null && !map.isEmpty()) {
                    c0y8t2.setCoreInfo((C0Y8Y) map.get(conversationId));
                }
                if (map3 != 0 && !map3.isEmpty()) {
                    c0y8t2.setSettingInfo((C0Y8W) map3.get(conversationId));
                }
                if (map2 != null && !map2.isEmpty()) {
                    c0y8t2.setUnreadSelfMentionedMessages((List) map2.get(conversationId));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.0Y9r] */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0Y8e] */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.0Y8e] */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.0Y8e] */
    /* JADX WARN: Type inference failed for: r14v3, types: [X.0Y8e] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [X.0Y8e] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r5v0, types: [long] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.0Y8z] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C0Y8T> LJJII(long r32, long r34, int r36, X.C869290Y8h r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869260Y8e.LJJII(long, long, int, X.0Y8h):java.util.List");
    }

    public static C0Y93 LJJIIJZLJL(int i, EnumC869410Y8t enumC869410Y8t, C873950YQf c873950YQf, Set set, EnumC871430YGn enumC871430YGn) {
        C869320Y8k c869320Y8k;
        ArrayList arrayList = new ArrayList();
        C873940YQe c873940YQe = null;
        arrayList.add(new C869450Y8x(EnumC869310Y8j.COLUMN_UPDATE_TIME.key, C0VRJ.DESC, null));
        C869300Y8i c869300Y8i = new C869300Y8i(C0Y97.ALL, Integer.valueOf(i), -1L, -1L, arrayList, false, enumC869410Y8t, enumC871430YGn, -1L, null, C1177004j2.LIZIZ);
        if (c873950YQf != null) {
            c873940YQe = new C873940YQe(c873950YQf, 1);
        }
        if (set != null && !set.isEmpty()) {
            c869320Y8k = new C869320Y8k(null, set, Collections.emptySet(), C0Y95.ALL);
        } else {
            c869320Y8k = null;
        }
        return new C0Y93(c869300Y8i, c869320Y8k, c873940YQe);
    }

    public final C0Y6Q LJIIJJI(int i, int i2, EnumC869410Y8t enumC869410Y8t, C873950YQf c873950YQf, boolean z) {
        C0Y6Q c0y6qLIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                String strLJFF = C869610Y9n.LJFF(LJJIIJZLJL(i, enumC869410Y8t, c873950YQf, null, null), i2);
                C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("IMConversationDao getAllConversation sql = ");
                sbLIZ.append(C869610Y9n.LJIIIZ(strLJFF));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c868780Y6iLIZLLL.getClass();
                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMConversationDao ", strLIZIZ, 4);
                interfaceC869470Y8zLJIIJJI = this.LIZLLL.getProxy().LJIIJJI(strLJFF, "getAllConversationId", null);
                LJ(interfaceC869470Y8zLJIIJJI, arrayList, false, z);
                this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getAllConversation");
                C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("IMConversationDao getAllConversation, count:");
                sbLIZ2.append(arrayList.size());
                sbLIZ2.append(", cost=");
                sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                c868780Y6iLIZLLL2.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                c0y6qLIZ = C865670Xxd.LIZJ(arrayList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL3 = this.LIZIZ.LIZLLL();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("IMConversationDao getAllConversation ");
                sbLIZ3.append(e);
                c868780Y6iLIZLLL3.LJI(C2188811AlT.LIZIZ(sbLIZ3));
                this.LIZJ.LJFF().getEventTracker().LJ(e);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("exception: ");
                sbLIZ4.append(e.getMessage());
                c0y6qLIZ = C865670Xxd.LIZ(201, C2188811AlT.LIZIZ(sbLIZ4));
            }
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return c0y6qLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final String LJI(long j, long j2, int i, long j3, C0Y97 c0y97, EnumC871430YGn enumC871430YGn, C873950YQf c873950YQf) {
        int i2;
        C873940YQe c873940YQe;
        List<C869450Y8x> list;
        long j4 = j;
        long j5 = j2;
        ArrayList arrayList = new ArrayList();
        if (c873950YQf != null && (list = c873950YQf.LIZIZ) != null && !list.isEmpty()) {
            i2 = 0;
            j4 = -1;
            j5 = -1;
        } else {
            arrayList.add(new C869450Y8x(EnumC869310Y8j.COLUMN_UPDATE_TIME.key, C0VRJ.DESC, null));
            i2 = 1;
            if (c873950YQf == null) {
                c873940YQe = null;
            }
            arrayList.add(new C869450Y8x(EnumC869310Y8j.COLUMN_SHORT_ID.key, C0VRJ.DESC, null));
            String strLJFF = C869610Y9n.LJFF(new C0Y93(new C869300Y8i(c0y97, Integer.valueOf(EnumC869400Y8s.ONE_TO_ONE_CHAT.getValue()), j4, j5, arrayList, false, EnumC869410Y8t.ONLY_MESSAGE_REQUEST, enumC871430YGn, j3, null, C1177004j2.LIZIZ), null, c873940YQe), i);
            C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildQuerySqlForMessageRequest sql = ");
            sbLIZ.append(C869610Y9n.LJIIIZ(strLJFF));
            c868780Y6iLIZLLL.LJIIL("IMConversationDao ", C2188811AlT.LIZIZ(sbLIZ));
            return strLJFF;
        }
        c873940YQe = new C873940YQe(c873950YQf, i2);
        arrayList.add(new C869450Y8x(EnumC869310Y8j.COLUMN_SHORT_ID.key, C0VRJ.DESC, null));
        String strLJFF2 = C869610Y9n.LJFF(new C0Y93(new C869300Y8i(c0y97, Integer.valueOf(EnumC869400Y8s.ONE_TO_ONE_CHAT.getValue()), j4, j5, arrayList, false, EnumC869410Y8t.ONLY_MESSAGE_REQUEST, enumC871430YGn, j3, null, C1177004j2.LIZIZ), null, c873940YQe), i);
        C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("buildQuerySqlForMessageRequest sql = ");
        sbLIZ2.append(C869610Y9n.LJIIIZ(strLJFF2));
        c868780Y6iLIZLLL2.LJIIL("IMConversationDao ", C2188811AlT.LIZIZ(sbLIZ2));
        return strLJFF2;
    }

    public final boolean LJJJLIIL(String str, long j, long j2, String str2, long j3, int i, long j4, long j5, Map<String, String> map) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMConversationDao updateConversationWhenRecvMsgWithLocalExt:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(EnumC869310Y8j.COLUMN_LAST_MSG_INDEX.key, Long.valueOf(j2));
            String str3 = EnumC869310Y8j.COLUMN_LAST_MSG_UUID.key;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put(str3, str2);
            contentValues.put(EnumC869310Y8j.COLUMN_UPDATE_TIME.key, Long.valueOf(j));
            contentValues.put(EnumC869310Y8j.COLUMN_MAX_INDEX_V2.key, Long.valueOf(j3));
            contentValues.put(EnumC869310Y8j.COLUMN_BADGE_COUNT.key, Integer.valueOf(i));
            contentValues.put(EnumC869310Y8j.COLUMN_BADGE_VERSION.key, Long.valueOf(j5));
            contentValues.put(EnumC869310Y8j.COLUMN_UNREAD_COUNT.key, Long.valueOf(j4));
            String strLJII = C0Y8V.LJII(map);
            if (strLJII != null && !strLJII.isEmpty()) {
                contentValues.put(EnumC869310Y8j.COLUMN_LOCAL_INFO.key, strLJII);
            }
            C870430YCr proxy = this.LIZLLL.getProxy();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(EnumC869310Y8j.COLUMN_ID.key);
            sbLIZ2.append("=?");
            if (proxy.LJIILJJIL("conversation_list", contentValues, C2188811AlT.LIZIZ(sbLIZ2), new String[]{str}) > 0) {
                z = true;
            }
            this.LIZIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "updateConversationWhenRecvMsgWithLocalExt");
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LIZLLL().LJIIIZ("IMConversationDao updateConversationWhenRecvMsgWithLocalExt", e);
            this.LIZJ.LJFF().getEventTracker().LJ(e);
            return z;
        }
    }

    public final String LJFF(boolean z, EnumC868530Y5j enumC868530Y5j, Set<String> set, Set<String> set2, boolean z2, C0Y97 c0y97, Integer num, C0Y95 c0y95, long j, long j2, int i, C873950YQf c873950YQf, Integer num2, AbstractC1176904j1 abstractC1176904j1) {
        EnumC869410Y8t enumC869410Y8t;
        C869320Y8k c869320Y8k;
        ArrayList arrayList = new ArrayList();
        if (j != j2) {
            String str = EnumC869310Y8j.COLUMN_SORT_ORDER.key;
            C0VRJ c0vrj = C0VRJ.DESC;
            arrayList.add(new C869450Y8x(str, c0vrj, null));
            arrayList.add(new C869450Y8x(EnumC869310Y8j.COLUMN_SHORT_ID.key, c0vrj, null));
        }
        if (z2) {
            enumC869410Y8t = EnumC869410Y8t.ALL;
        } else {
            enumC869410Y8t = EnumC869410Y8t.NONE_MESSAGE_REQUEST;
        }
        C873940YQe c873940YQe = null;
        C869300Y8i c869300Y8i = new C869300Y8i(c0y97, num, j, j2, arrayList, false, enumC869410Y8t, null, -1L, num2, abstractC1176904j1);
        if (z) {
            c869320Y8k = new C869320Y8k(enumC868530Y5j, set, set2, c0y95);
        } else {
            c869320Y8k = null;
        }
        if (c873950YQf != null) {
            c873940YQe = new C873940YQe(c873950YQf, 1);
        }
        String strLJFF = C869610Y9n.LJFF(new C0Y93(c869300Y8i, c869320Y8k, c873940YQe), i);
        C868780Y6i c868780Y6iLIZLLL = this.LIZIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildQuerySql sql = ");
        sbLIZ.append(C869610Y9n.LJIIIZ(strLJFF));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c868780Y6iLIZLLL.getClass();
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMConversationDao ", strLIZIZ, 4);
        return strLJFF;
    }
}
