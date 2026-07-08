package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Y8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869280Y8g {
    public final C0YEM LIZ;
    public final InterfaceC864790XwD LIZIZ;
    public final C0Y5R LIZJ;

    public static String LIZLLL() {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS mention(");
        for (EnumC869390Y8r enumC869390Y8r : EnumC869390Y8r.values()) {
            sb.append(enumC869390Y8r.key);
            sb.append(" ");
            sb.append(enumC869390Y8r.type);
            sb.append(",");
        }
        String string = sb.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string.substring(0, string.length() - 1));
        sbLIZ.append(");");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C869280Y8g(C0YEM c0yem) {
        this.LIZ = c0yem;
        this.LIZIZ = c0yem.LJIIZILJ();
        this.LIZJ = c0yem.LJIIZILJ().LIZIZ();
    }

    public final boolean LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C870430YCr proxy = this.LIZJ.getProxy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC869390Y8r.COLUMN_UUID.key);
        sbLIZ.append("=?");
        return proxy.LIZIZ("mention", C2188811AlT.LIZIZ(sbLIZ), new String[]{str});
    }

    public final void LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C870430YCr proxy = this.LIZJ.getProxy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC869390Y8r.COLUMN_CONVERSATION_ID.key);
        sbLIZ.append("=?");
        proxy.LIZIZ("mention", C2188811AlT.LIZIZ(sbLIZ), new String[]{str});
    }

    public final void LJFF(C869590Y9l c869590Y9l) {
        List<Long> mentionIds;
        if (!c869590Y9l.isSelf(this.LIZ.getUid()) && (mentionIds = c869590Y9l.getMentionIds()) != null && !mentionIds.isEmpty()) {
            if (!mentionIds.contains(Long.valueOf(this.LIZ.getUid())) && !mentionIds.contains(0L)) {
                return;
            }
            Boolean boolValueOf = Boolean.FALSE;
            InterfaceC869960YAw interfaceC869960YAwLIZ = null;
            try {
                try {
                    this.LIZ.LJIIIZ().getClass();
                    StringBuilder sb = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    sb.append(" replace into mention(");
                    boolean z = false;
                    for (EnumC869390Y8r enumC869390Y8r : EnumC869390Y8r.values()) {
                        sb.append(enumC869390Y8r.key);
                        sb.append(",");
                        sb2.append("?,");
                    }
                    String string = sb.toString();
                    String string2 = sb2.toString();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(string.substring(0, string.length() - 1));
                    sbLIZ.append(") values (");
                    sbLIZ.append(string2.substring(0, string2.length() - 1));
                    sbLIZ.append(");");
                    interfaceC869960YAwLIZ = this.LIZJ.getProxy().LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    LIZ(interfaceC869960YAwLIZ, c869590Y9l, mentionIds);
                    if (interfaceC869960YAwLIZ.LJIIL() > 0) {
                        z = true;
                    }
                    boolValueOf = Boolean.valueOf(z);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZ.LIZLLL().LJIIIZ("IMMentionDao upsert", e);
                    this.LIZIZ.LJFF().getEventTracker().LJ(e);
                }
                this.LIZJ.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                boolValueOf.booleanValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.LIZ().LIZIZ(interfaceC869960YAwLIZ);
                throw th;
            }
        }
    }

    public final List LJ(long j, String str) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select * from mention where ");
        sbLIZ.append(EnumC869390Y8r.COLUMN_CONVERSATION_ID.key);
        sbLIZ.append("=? order by ");
        sbLIZ.append(EnumC869390Y8r.COLUMN_CREATED_TIME.key);
        sbLIZ.append(" desc");
        try {
            interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getUnreadSelfMentionedMsg", new String[]{str});
            while (interfaceC869470Y8zLJIIJJI != null) {
                try {
                    try {
                        if (!interfaceC869470Y8zLJIIJJI.moveToNext()) {
                            break;
                        }
                        if (C870740YDw.LJII(String.valueOf(this.LIZ.getUid()), interfaceC869470Y8zLJIIJJI.getString(interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869390Y8r.COLUMN_IDS_STR.key)))) {
                            arrayList.add(interfaceC869470Y8zLJIIJJI.getString(interfaceC869470Y8zLJIIJJI.getColumnIndex(EnumC869390Y8r.COLUMN_UUID.key)));
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMMentionDao getMentionMsg", e);
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
        if (arrayList.isEmpty()) {
            return null;
        }
        List listLJJJJIZL = this.LIZJ.LIZIZ().LJI().LJJJJIZL(j, arrayList);
        this.LIZ.LJIIZILJ().LJFF().LIZIZ().LIZ(jCurrentTimeMillis, "getUnreadSelfMentionedMsg");
        return listLJJJJIZL;
    }

    public static void LIZ(InterfaceC869960YAw interfaceC869960YAw, C869590Y9l c869590Y9l, List list) {
        if (interfaceC869960YAw != null && c869590Y9l != null) {
            int iOrdinal = EnumC869390Y8r.COLUMN_UUID.ordinal() + 1;
            String uuid = c869590Y9l.getUuid();
            String str = "";
            if (uuid == null) {
                uuid = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal, uuid);
            int iOrdinal2 = EnumC869390Y8r.COLUMN_CONVERSATION_ID.ordinal() + 1;
            String conversationId = c869590Y9l.getConversationId();
            if (conversationId != null) {
                str = conversationId;
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal2, str);
            interfaceC869960YAw.LJIILIIL(EnumC869390Y8r.COLUMN_IDS_STR.ordinal() + 1, C870740YDw.LJIIIIZZ(",", list));
            interfaceC869960YAw.LJIJ(EnumC869390Y8r.COLUMN_SENDER_ID.ordinal() + 1, c869590Y9l.getSender());
            interfaceC869960YAw.LJIJ(EnumC869390Y8r.COLUMN_CREATED_TIME.ordinal() + 1, c869590Y9l.getCreatedAt());
        }
    }
}
