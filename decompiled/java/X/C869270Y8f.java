package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869270Y8f {
    public final C0YEM LIZ;
    public final InterfaceC864790XwD LIZIZ;
    public final C0Y5R LIZJ;

    public static String LJFF() {
        StringBuilder sb = new StringBuilder("create table if not exists conversation_core (");
        for (EnumC869330Y8l enumC869330Y8l : EnumC869330Y8l.values()) {
            sb.append(enumC869330Y8l.key);
            sb.append(" ");
            sb.append(enumC869330Y8l.type);
            sb.append(",");
        }
        String string = sb.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string.substring(0, string.length() - 1));
        sbLIZ.append(");");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C869270Y8f(C0YEM c0yem) {
        this.LIZ = c0yem;
        this.LIZIZ = c0yem.LJIIZILJ();
        this.LIZJ = c0yem.LJIIZILJ().LIZIZ();
    }

    public static C0Y8Y LIZIZ(InterfaceC869470Y8z interfaceC869470Y8z) {
        List<String> listAsList;
        C0Y8Y c0y8y = new C0Y8Y();
        c0y8y.setConversationId(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_ID.key)));
        c0y8y.setVersion(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_VERSION.key)));
        c0y8y.setName(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_NAME.key)));
        c0y8y.setIcon(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_ICON.key)));
        c0y8y.setDesc(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_DESC.key)));
        c0y8y.setNotice(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_NOTICE.key)));
        c0y8y.setCreator(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_CREATOR_ID.key)));
        c0y8y.setOwner(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_OWNER_ID.key)));
        c0y8y.setSecOwner(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_SEC_OWNER.key)));
        c0y8y.setFirstMessageTimestamp(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_FIRST_MESSAGE_TIMESTAMP.key)));
        c0y8y.setSilent(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_SILENT.key)));
        c0y8y.setSilentNormalOnly(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_SILENT_NORMAL_ONLY.key)));
        c0y8y.setMode(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_MODE.key)));
        c0y8y.setExtStr(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_EXT.key)));
        c0y8y.setBizCorePersistentExtraRaw(C870740YDw.LIZIZ(interfaceC869470Y8z.getBlob(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_BIZ_CORE_PERSISTENT_EXTRA.key))));
        String string = interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_MEMBER_REGIONS.key));
        if (string != null && !string.isEmpty()) {
            listAsList = Arrays.asList(string.split(","));
        } else {
            listAsList = null;
        }
        c0y8y.setMemberRegions(listAsList);
        return c0y8y;
    }

    public final void LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C870430YCr proxy = this.LIZJ.getProxy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC869330Y8l.COLUMN_ID.key);
        sbLIZ.append("=?");
        proxy.LIZIZ("conversation_core", C2188811AlT.LIZIZ(sbLIZ), new String[]{str});
    }

    public final C0Y8Y LJ(String str) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        c0y8yLIZIZ = null;
        c0y8yLIZIZ = null;
        c0y8yLIZIZ = null;
        C0Y8Y c0y8yLIZIZ = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            C870430YCr proxy = this.LIZJ.getProxy();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select * from conversation_core where ");
            sbLIZ.append(EnumC869330Y8l.COLUMN_ID.key);
            sbLIZ.append("=?");
            interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getConversationCoreInfo", new String[]{str});
            if (interfaceC869470Y8zLJIIJJI != null) {
                try {
                    try {
                        if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                            c0y8yLIZIZ = LIZIZ(interfaceC869470Y8zLJIIJJI);
                        }
                    } catch (Exception e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZ.LIZLLL().LJIIIZ("IMConversationCoreDao get ", e);
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
        return c0y8yLIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI(X.C0Y8Y r12) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869270Y8f.LJI(X.0Y8Y):boolean");
    }

    public static void LIZ(InterfaceC869960YAw interfaceC869960YAw, C0Y8Y c0y8y) {
        if (interfaceC869960YAw != null && c0y8y != null) {
            interfaceC869960YAw.LJJIIZ();
            int iOrdinal = EnumC869330Y8l.COLUMN_ID.ordinal() + 1;
            String conversationId = c0y8y.getConversationId();
            String strJoin = "";
            if (conversationId == null) {
                conversationId = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal, conversationId);
            interfaceC869960YAw.LJIJ(EnumC869330Y8l.COLUMN_VERSION.ordinal() + 1, c0y8y.getVersion());
            int iOrdinal2 = EnumC869330Y8l.COLUMN_NAME.ordinal() + 1;
            String name = c0y8y.getName();
            if (name == null) {
                name = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal2, name);
            int iOrdinal3 = EnumC869330Y8l.COLUMN_ICON.ordinal() + 1;
            String icon = c0y8y.getIcon();
            if (icon == null) {
                icon = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal3, icon);
            int iOrdinal4 = EnumC869330Y8l.COLUMN_DESC.ordinal() + 1;
            String desc = c0y8y.getDesc();
            if (desc == null) {
                desc = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal4, desc);
            int iOrdinal5 = EnumC869330Y8l.COLUMN_NOTICE.ordinal() + 1;
            String notice = c0y8y.getNotice();
            if (notice == null) {
                notice = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal5, notice);
            interfaceC869960YAw.LJIJ(EnumC869330Y8l.COLUMN_CREATOR_ID.ordinal() + 1, c0y8y.getCreator());
            interfaceC869960YAw.LJIJ(EnumC869330Y8l.COLUMN_OWNER_ID.ordinal() + 1, c0y8y.getOwner());
            int iOrdinal6 = EnumC869330Y8l.COLUMN_SEC_OWNER.ordinal() + 1;
            String secOwner = c0y8y.getSecOwner();
            if (secOwner == null) {
                secOwner = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal6, secOwner);
            interfaceC869960YAw.LJIJ(EnumC869330Y8l.COLUMN_FIRST_MESSAGE_TIMESTAMP.ordinal() + 1, c0y8y.getFirstMessageTimestamp());
            interfaceC869960YAw.LJIJ(EnumC869330Y8l.COLUMN_SILENT.ordinal() + 1, c0y8y.getSilent());
            interfaceC869960YAw.LJIJ(EnumC869330Y8l.COLUMN_SILENT_NORMAL_ONLY.ordinal() + 1, c0y8y.getSilentNormalOnly());
            interfaceC869960YAw.LJIJ(EnumC869330Y8l.COLUMN_MODE.ordinal() + 1, c0y8y.getMode());
            int iOrdinal7 = EnumC869330Y8l.COLUMN_EXT.ordinal() + 1;
            String extStr = c0y8y.getExtStr();
            if (extStr == null) {
                extStr = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal7, extStr);
            int iOrdinal8 = EnumC869330Y8l.COLUMN_BIZ_CORE_PERSISTENT_EXTRA.ordinal() + 1;
            ByteString bizCorePersistentExtraRaw = c0y8y.getBizCorePersistentExtraRaw();
            if (bizCorePersistentExtraRaw == null) {
                bizCorePersistentExtraRaw = ByteString.EMPTY;
            }
            interfaceC869960YAw.LJJIIJZLJL(iOrdinal8, bizCorePersistentExtraRaw.toByteArray());
            int iOrdinal9 = EnumC869330Y8l.COLUMN_MEMBER_REGIONS.ordinal() + 1;
            List<String> memberRegions = c0y8y.getMemberRegions();
            if (memberRegions != null && !memberRegions.isEmpty()) {
                strJoin = TextUtils.join(",", memberRegions);
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal9, strJoin);
        }
    }

    public static void LIZJ(InterfaceC869470Y8z interfaceC869470Y8z, Map map, boolean z, boolean z2) {
        List<String> listAsList;
        if (interfaceC869470Y8z == null) {
            return;
        }
        int columnIndex = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_ID.key);
        int columnIndex2 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_VERSION.key);
        int columnIndex3 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_NAME.key);
        int columnIndex4 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_ICON.key);
        int columnIndex5 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_DESC.key);
        int columnIndex6 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_NOTICE.key);
        int columnIndex7 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_CREATOR_ID.key);
        int columnIndex8 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_OWNER_ID.key);
        int columnIndex9 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_SEC_OWNER.key);
        int columnIndex10 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_FIRST_MESSAGE_TIMESTAMP.key);
        int columnIndex11 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_SILENT.key);
        int columnIndex12 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_SILENT_NORMAL_ONLY.key);
        int columnIndex13 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_MODE.key);
        int columnIndex14 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_EXT.key);
        int columnIndex15 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_BIZ_CORE_PERSISTENT_EXTRA.key);
        int columnIndex16 = interfaceC869470Y8z.getColumnIndex(EnumC869330Y8l.COLUMN_MEMBER_REGIONS.key);
        while (interfaceC869470Y8z.moveToNext()) {
            C0Y8Y c0y8y = new C0Y8Y();
            String string = interfaceC869470Y8z.getString(columnIndex);
            c0y8y.setConversationId(string);
            c0y8y.setVersion(interfaceC869470Y8z.getLong(columnIndex2));
            c0y8y.setName(interfaceC869470Y8z.getString(columnIndex3));
            c0y8y.setIcon(interfaceC869470Y8z.getString(columnIndex4));
            c0y8y.setDesc(interfaceC869470Y8z.getString(columnIndex5));
            c0y8y.setNotice(interfaceC869470Y8z.getString(columnIndex6));
            c0y8y.setCreator(interfaceC869470Y8z.getLong(columnIndex7));
            c0y8y.setOwner(interfaceC869470Y8z.getLong(columnIndex8));
            c0y8y.setSecOwner(interfaceC869470Y8z.getString(columnIndex9));
            c0y8y.setFirstMessageTimestamp(interfaceC869470Y8z.getLong(columnIndex10));
            c0y8y.setSilent(interfaceC869470Y8z.getInt(columnIndex11));
            c0y8y.setSilentNormalOnly(interfaceC869470Y8z.getInt(columnIndex12));
            c0y8y.setMode(interfaceC869470Y8z.getInt(columnIndex13));
            if (z && z2) {
                c0y8y.optSetExtStr(interfaceC869470Y8z.getString(columnIndex14));
            } else {
                c0y8y.setExtStr(interfaceC869470Y8z.getString(columnIndex14));
            }
            c0y8y.setBizCorePersistentExtraRaw(C870740YDw.LIZIZ(interfaceC869470Y8z.getBlob(columnIndex15)));
            String string2 = interfaceC869470Y8z.getString(columnIndex16);
            if (string2 != null && !string2.isEmpty()) {
                listAsList = Arrays.asList(string2.split(","));
            } else {
                listAsList = null;
            }
            c0y8y.setMemberRegions(listAsList);
            ((HashMap) map).put(string, c0y8y);
        }
    }
}
