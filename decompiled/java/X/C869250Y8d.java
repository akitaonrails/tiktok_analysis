package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869250Y8d {
    public final C0YEM LIZ;
    public final InterfaceC864790XwD LIZIZ;
    public final C0Y5R LIZJ;

    public static String LJFF() {
        StringBuilder sb = new StringBuilder("create table if not exists conversation_setting (");
        for (EnumC869340Y8m enumC869340Y8m : EnumC869340Y8m.values()) {
            sb.append(enumC869340Y8m.key);
            sb.append(" ");
            sb.append(enumC869340Y8m.type);
            sb.append(",");
        }
        String string = sb.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string.substring(0, string.length() - 1));
        sbLIZ.append(");");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C869250Y8d(C0YEM c0yem) {
        this.LIZ = c0yem;
        this.LIZIZ = c0yem.LJIIZILJ();
        this.LIZJ = c0yem.LJIIZILJ().LIZIZ();
    }

    public final void LIZLLL(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C870430YCr proxy = this.LIZJ.getProxy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC869340Y8m.COLUMN_ID.key);
        sbLIZ.append("=?");
        proxy.LIZIZ("conversation_setting", C2188811AlT.LIZIZ(sbLIZ), new String[]{str});
    }

    public final C0Y8W LJ(String str) throws Throwable {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI;
        InterfaceC869470Y8z interfaceC869470Y8z = null;
        c0y8wLIZIZ = null;
        c0y8wLIZIZ = null;
        c0y8wLIZIZ = null;
        C0Y8W c0y8wLIZIZ = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select * from conversation_setting where ");
                sbLIZ.append(EnumC869340Y8m.COLUMN_ID.key);
                sbLIZ.append("=?");
                interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getConversationSettingInfo", new String[]{str});
            } catch (Exception e) {
                e = e;
                interfaceC869470Y8zLJIIJJI = null;
            } catch (Throwable th) {
                th = th;
            }
            if (interfaceC869470Y8zLJIIJJI != null) {
                try {
                    if (interfaceC869470Y8zLJIIJJI.moveToFirst()) {
                        c0y8wLIZIZ = LIZIZ(interfaceC869470Y8zLJIIJJI, new C869370Y8p(interfaceC869470Y8zLJIIJJI), false, false);
                    }
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZ.LIZLLL().LJIIIZ("IMConversationSettingDao get ", e);
                    this.LIZIZ.LJFF().getEventTracker().LJ(e);
                }
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return c0y8wLIZIZ;
        } catch (Throwable th2) {
            th = th2;
            interfaceC869470Y8z = interfaceC869470Y8zLJIIJJI;
        }
        while (true) {
            try {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8z);
                throw th;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final boolean LJII(C0Y8W c0y8w) {
        boolean z = false;
        if (c0y8w == null || TextUtils.isEmpty(c0y8w.getConversationId())) {
            return false;
        }
        Boolean boolValueOf = Boolean.FALSE;
        InterfaceC869960YAw interfaceC869960YAwLIZ = null;
        try {
            try {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb.append(" replace into conversation_setting(");
                for (EnumC869340Y8m enumC869340Y8m : EnumC869340Y8m.values()) {
                    sb.append(enumC869340Y8m.key);
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
                LIZ(interfaceC869960YAwLIZ, c0y8w);
                if (interfaceC869960YAwLIZ.LJIIL() > 0) {
                    z = true;
                }
                boolValueOf = Boolean.valueOf(z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMConversationSettingDao insertOrUpdate", e);
                this.LIZIZ.LJFF().getEventTracker().LJ(e);
            }
            this.LIZJ.LIZ().LIZIZ(interfaceC869960YAwLIZ);
            return boolValueOf.booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZIZ(interfaceC869960YAwLIZ);
            throw th;
        }
    }

    public static void LIZ(InterfaceC869960YAw interfaceC869960YAw, C0Y8W c0y8w) {
        if (interfaceC869960YAw != null && c0y8w != null) {
            interfaceC869960YAw.LJJIIZ();
            int iOrdinal = EnumC869340Y8m.COLUMN_ID.ordinal() + 1;
            String conversationId = c0y8w.getConversationId();
            String str = "";
            if (conversationId == null) {
                conversationId = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal, conversationId);
            interfaceC869960YAw.LJIJ(EnumC869340Y8m.COLUMN_VERSION.ordinal() + 1, c0y8w.getVersion());
            interfaceC869960YAw.LJIJ(EnumC869340Y8m.COLUMN_STICK_TOP.ordinal() + 1, c0y8w.getStickTop());
            interfaceC869960YAw.LJIJ(EnumC869340Y8m.COLUMN_MUTE.ordinal() + 1, c0y8w.getMute());
            int iOrdinal2 = EnumC869340Y8m.COLUMN_EXT.ordinal() + 1;
            String extStr = c0y8w.getExtStr();
            if (extStr == null) {
                extStr = "";
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal2, extStr);
            interfaceC869960YAw.LJIJ(EnumC869340Y8m.COLUMN_FAVORITE.ordinal() + 1, c0y8w.getFavor());
            interfaceC869960YAw.LJIJ(EnumC869340Y8m.COLUMN_SET_TOP_TIME.ordinal() + 1, c0y8w.getSetTopTime());
            interfaceC869960YAw.LJIJ(EnumC869340Y8m.COLUMN_SET_FAVORITE_TIME.ordinal() + 1, c0y8w.getSetFavoriteTime());
            interfaceC869960YAw.LJIJ(EnumC869340Y8m.COLUMN_CATEGORY.ordinal() + 1, c0y8w.getCategory());
            int iOrdinal3 = EnumC869340Y8m.COLUMN_CONVERSATION_TAGS.ordinal() + 1;
            String conversationTagsStr = c0y8w.getConversationTagsStr();
            if (conversationTagsStr != null) {
                str = conversationTagsStr;
            }
            interfaceC869960YAw.LJIILIIL(iOrdinal3, str);
            int iOrdinal4 = EnumC869340Y8m.COLUMN_BIZ_SETTING_PERSISTENT_EXTRA.ordinal() + 1;
            ByteString bizSettingPersistentExtraRaw = c0y8w.getBizSettingPersistentExtraRaw();
            if (bizSettingPersistentExtraRaw == null) {
                bizSettingPersistentExtraRaw = ByteString.EMPTY;
            }
            interfaceC869960YAw.LJJIIJZLJL(iOrdinal4, bizSettingPersistentExtraRaw.toByteArray());
        }
    }

    public static C0Y8W LIZIZ(InterfaceC869470Y8z interfaceC869470Y8z, C869370Y8p c869370Y8p, boolean z, boolean z2) {
        if (interfaceC869470Y8z != null && c869370Y8p != null) {
            C0Y8W c0y8w = new C0Y8W();
            c0y8w.setConversationId(interfaceC869470Y8z.getString(c869370Y8p.LIZ));
            c0y8w.setVersion(interfaceC869470Y8z.getLong(c869370Y8p.LIZIZ));
            c0y8w.setStickTop(interfaceC869470Y8z.getInt(c869370Y8p.LIZJ));
            c0y8w.setMute(interfaceC869470Y8z.getInt(c869370Y8p.LIZLLL));
            if (z && z2) {
                c0y8w.optSetExtStr(interfaceC869470Y8z.getString(c869370Y8p.LJ));
            } else {
                c0y8w.setExtStr(interfaceC869470Y8z.getString(c869370Y8p.LJ));
            }
            c0y8w.setFavor(interfaceC869470Y8z.getInt(c869370Y8p.LJFF));
            c0y8w.setSetTopTime(interfaceC869470Y8z.getInt(c869370Y8p.LJI));
            c0y8w.setSetFavoriteTime(interfaceC869470Y8z.getInt(c869370Y8p.LJII));
            c0y8w.setCategory(interfaceC869470Y8z.getInt(c869370Y8p.LJIIIIZZ));
            c0y8w.setConversationTagsStr(interfaceC869470Y8z.getString(c869370Y8p.LJIIIZ));
            c0y8w.setBizSettingPersistentExtraRaw(C870740YDw.LIZIZ(interfaceC869470Y8z.getBlob(c869370Y8p.LJIIJ)));
            return c0y8w;
        }
        return null;
    }

    public final Map<String, C0Y8W> LJI(List<String> list, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() <= 0) {
            return null;
        }
        HashMap map = new HashMap();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select * from conversation_setting where ");
        sbLIZ.append(EnumC869340Y8m.COLUMN_ID.key);
        sbLIZ.append(" in (");
        StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == arrayList.size() - 1) {
                sb.append("'");
                sb.append((String) ListProtector.get(list, i));
                sb.append("')");
                try {
                    try {
                        interfaceC869470Y8zLJIIJJI = this.LIZJ.getProxy().LJIIJJI(sb.toString(), "getConversationSettingInfoMap", null);
                        LIZJ(interfaceC869470Y8zLJIIJJI, map, z, z2, z3);
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LIZ.LIZLLL().LJIIIZ("IMConversationSettingDao getSettingInfoMap ", e);
                    this.LIZIZ.LJFF().getEventTracker().LJ(e);
                }
                this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            } else {
                sb.append("'");
                sb.append((String) ListProtector.get(list, i));
                sb.append("',");
            }
        }
        return map;
    }

    public static void LIZJ(InterfaceC869470Y8z interfaceC869470Y8z, Map map, boolean z, boolean z2, boolean z3) {
        if (interfaceC869470Y8z == null) {
            return;
        }
        if (z2 && z3) {
            int columnIndex = interfaceC869470Y8z.getColumnIndex(EnumC869340Y8m.COLUMN_ID.key);
            int columnIndex2 = interfaceC869470Y8z.getColumnIndex(EnumC869340Y8m.COLUMN_VERSION.key);
            int columnIndex3 = interfaceC869470Y8z.getColumnIndex(EnumC869340Y8m.COLUMN_STICK_TOP.key);
            int columnIndex4 = interfaceC869470Y8z.getColumnIndex(EnumC869340Y8m.COLUMN_MUTE.key);
            int columnIndex5 = interfaceC869470Y8z.getColumnIndex(EnumC869340Y8m.COLUMN_EXT.key);
            int columnIndex6 = interfaceC869470Y8z.getColumnIndex(EnumC869340Y8m.COLUMN_FAVORITE.key);
            int columnIndex7 = interfaceC869470Y8z.getColumnIndex(EnumC869340Y8m.COLUMN_SET_TOP_TIME.key);
            int columnIndex8 = interfaceC869470Y8z.getColumnIndex(EnumC869340Y8m.COLUMN_SET_FAVORITE_TIME.key);
            int columnIndex9 = interfaceC869470Y8z.getColumnIndex(EnumC869340Y8m.COLUMN_CATEGORY.key);
            int columnIndex10 = interfaceC869470Y8z.getColumnIndex(EnumC869340Y8m.COLUMN_CONVERSATION_TAGS.key);
            int columnIndex11 = interfaceC869470Y8z.getColumnIndex(EnumC869340Y8m.COLUMN_BIZ_SETTING_PERSISTENT_EXTRA.key);
            while (interfaceC869470Y8z.moveToNext()) {
                C0Y8W c0y8w = new C0Y8W();
                c0y8w.setConversationId(interfaceC869470Y8z.getString(columnIndex));
                c0y8w.setVersion(interfaceC869470Y8z.getLong(columnIndex2));
                c0y8w.setStickTop(interfaceC869470Y8z.getInt(columnIndex3));
                c0y8w.setMute(interfaceC869470Y8z.getInt(columnIndex4));
                if (z) {
                    c0y8w.optSetExtStr(interfaceC869470Y8z.getString(columnIndex5));
                } else {
                    c0y8w.setExtStr(interfaceC869470Y8z.getString(columnIndex5));
                }
                c0y8w.setFavor(interfaceC869470Y8z.getInt(columnIndex6));
                c0y8w.setSetTopTime(interfaceC869470Y8z.getInt(columnIndex7));
                c0y8w.setSetFavoriteTime(interfaceC869470Y8z.getInt(columnIndex8));
                c0y8w.setCategory(interfaceC869470Y8z.getInt(columnIndex9));
                c0y8w.setConversationTagsStr(interfaceC869470Y8z.getString(columnIndex10));
                c0y8w.setBizSettingPersistentExtraRaw(C870740YDw.LIZIZ(interfaceC869470Y8z.getBlob(columnIndex11)));
                ((HashMap) map).put(c0y8w.getConversationId(), c0y8w);
            }
            return;
        }
        while (interfaceC869470Y8z.moveToNext()) {
            C0Y8W c0y8wLIZIZ = LIZIZ(interfaceC869470Y8z, new C869370Y8p(interfaceC869470Y8z), z, z3);
            if (c0y8wLIZIZ != null) {
                ((HashMap) map).put(c0y8wLIZIZ.getConversationId(), c0y8wLIZIZ);
            }
        }
    }
}
