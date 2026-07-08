package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Y9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869600Y9m {
    public static C0Y99 LIZJ(C0Y9U c0y9u) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        List<C869670Y9t> list = c0y9u.LIZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<C869670Y9t> it2 = list.iterator();
            while (it2.hasNext()) {
                z = true;
                if (!Intrinsics.LJFF(it2.next().LJIILJJIL.LIZ, "\u0000__UNSET_KEY__\u0000")) {
                    break;
                }
            }
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(");
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("DISTINCT msg.");
            sbLIZ.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            sb.append("*");
        }
        sb.append(") FROM msg");
        LIZIZ(sb, c0y9u.LIZ, arrayList, LIZ(sb, c0y9u.LIZ, arrayList, z));
        return new C0Y99(sb.toString(), (String[]) arrayList.toArray(new String[0]));
    }

    public static C0Y99 LIZLLL(C0Y9U c0y9u) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        List<C869670Y9t> list = c0y9u.LIZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<C869670Y9t> it2 = list.iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.LJFF(it2.next().LJIILJJIL.LIZ, "\u0000__UNSET_KEY__\u0000")) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        if (z) {
            sb.append("DISTINCT msg.rowid, msg.*");
        } else {
            sb.append("rowid, *");
        }
        sb.append(" FROM msg");
        LIZIZ(sb, c0y9u.LIZ, arrayList, LIZ(sb, c0y9u.LIZ, arrayList, z));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ORDER BY ");
        sbLIZ.append(c0y9u.LIZIZ.getColumn());
        sbLIZ.append(' ');
        sbLIZ.append(c0y9u.LIZIZ.getDirection());
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        int i = c0y9u.LIZJ;
        if (i != -1) {
            arrayList.add(String.valueOf(i));
            sb.append(" LIMIT ?");
        }
        return new C0Y99(sb.toString(), (String[]) arrayList.toArray(new String[0]));
    }

    public static String LJ(String str) {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("SELECT", "LEFT JOIN", "WHERE", "FROM", "ORDER BY", "LIMIT", "AND", "OR", ";");
        String string = a0.LJLIIIL(new Regex("[ \t]+").replace(str, " ")).toString();
        for (String str2 : listLJIIJJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('\n');
            sbLIZ.append(str2);
            string = u.LJJIFFI(string, str2, C2188811AlT.LIZIZ(sbLIZ), true);
        }
        return string;
    }

    public static Map LIZ(StringBuilder sb, List list, List list2, boolean z) {
        Pair pair;
        if (!z) {
            return C2097608Jq.LJ();
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C869670Y9t) it2.next()).LJIILJJIL);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Intrinsics.LJFF(((C0YAF) obj).LIZ, "\u0000__UNSET_KEY__\u0000")) {
                arrayList2.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (hashSet.add(((C0YAF) obj2).LIZ)) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            pair = new Pair("", C2097608Jq.LJ());
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            for (Object obj3 : arrayList3) {
                int i2 = i + 1;
                if (i >= 0) {
                    C0YAF c0yaf = (C0YAF) obj3;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("kv_");
                    sbLIZ.append(i);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    linkedHashMap.put(c0yaf.LIZ, strLIZIZ);
                    ((ArrayList) list2).add(c0yaf.LIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(" LEFT JOIN message_kv AS ");
                    sbLIZ2.append(strLIZIZ);
                    sb2.append(C2188811AlT.LIZIZ(sbLIZ2));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(" ON msg.");
                    sbLIZ3.append(EnumC869640Y9q.COLUMN_MSG_ID.key);
                    sb2.append(C2188811AlT.LIZIZ(sbLIZ3));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(" = ");
                    sbLIZ4.append(strLIZIZ);
                    sbLIZ4.append('.');
                    sbLIZ4.append(EnumC869730Y9z.COLUMN_MSG_ID.getKey());
                    sb2.append(C2188811AlT.LIZIZ(sbLIZ4));
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(" AND ");
                    sbLIZ5.append(strLIZIZ);
                    sbLIZ5.append('.');
                    sbLIZ5.append(EnumC869730Y9z.COLUMN_KEY.getKey());
                    sbLIZ5.append(" = ?");
                    sb2.append(C2188811AlT.LIZIZ(sbLIZ5));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            pair = new Pair(sb2.toString(), linkedHashMap);
        }
        String str = (String) pair.getFirst();
        Map map = (Map) pair.getSecond();
        sb.append(str);
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x072f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.StringBuilder r32, java.util.List r33, java.util.List r34, java.util.Map r35) {
        /*
            Method dump skipped, instruction units count: 1913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C869600Y9m.LIZIZ(java.lang.StringBuilder, java.util.List, java.util.List, java.util.Map):void");
    }
}
