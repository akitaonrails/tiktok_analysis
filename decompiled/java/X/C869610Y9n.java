package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS127S1100000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Y9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869610Y9n {
    public static final C869610Y9n LIZ = new C869610Y9n();

    public static C0Y99 LIZJ(C869710Y9x c869710Y9x) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        List<C869690Y9v> list = c869710Y9x.LIZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<C869690Y9v> it2 = list.iterator();
            while (it2.hasNext()) {
                if (LJIIJJI(it2.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        List<C869690Y9v> list2 = c869710Y9x.LIZ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<C869690Y9v> it3 = list2.iterator();
        while (it3.hasNext()) {
            C873950YQf c873950YQf = it3.next().LJIIIIZZ;
            if (c873950YQf != null) {
                arrayList2.add(c873950YQf);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(new C873940YQe((C873950YQf) it4.next(), 1));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("select count(*) from conversation_list");
        LIZ(sb, z, arrayList3);
        LIZIZ(sb, c869710Y9x, arrayList);
        return new C0Y99(LJIIIIZZ(sb.toString()) + ';', (String[]) arrayList.toArray(new String[0]));
    }

    public static C0Y99 LIZLLL(C869710Y9x c869710Y9x) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        List<C869690Y9v> list = c869710Y9x.LIZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<C869690Y9v> it2 = list.iterator();
            while (it2.hasNext()) {
                if (LJIIJJI(it2.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        List<C869690Y9v> list2 = c869710Y9x.LIZ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<C869690Y9v> it3 = list2.iterator();
        while (it3.hasNext()) {
            C873950YQf c873950YQf = it3.next().LJIIIIZZ;
            if (c873950YQf != null) {
                arrayList2.add(c873950YQf);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(new C873940YQe((C873950YQf) it4.next(), 1));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("select conversation_list." + EnumC869310Y8j.COLUMN_ID.key + ", conversation_list." + EnumC869310Y8j.COLUMN_SHORT_ID.key);
        sb.append(" from conversation_list");
        LIZ(sb, z, arrayList3);
        LIZIZ(sb, c869710Y9x, arrayList);
        sb.append(" order by " + c869710Y9x.LIZIZ.getColumn() + ' ' + c869710Y9x.LIZIZ.getDirection());
        int i = c869710Y9x.LIZJ;
        if (i != -1) {
            arrayList.add(String.valueOf(i));
            sb.append(" limit ?");
        }
        return new C0Y99(LJIIIIZZ(sb.toString()) + ';', (String[]) arrayList.toArray(new String[0]));
    }

    public static C0Y99 LJ(C869710Y9x c869710Y9x) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        List<C869690Y9v> list = c869710Y9x.LIZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<C869690Y9v> it2 = list.iterator();
            while (it2.hasNext()) {
                if (LJIIJJI(it2.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        List<C869690Y9v> list2 = c869710Y9x.LIZ;
        ArrayList arrayList2 = new ArrayList();
        Iterator<C869690Y9v> it3 = list2.iterator();
        while (it3.hasNext()) {
            C873950YQf c873950YQf = it3.next().LJIIIIZZ;
            if (c873950YQf != null) {
                arrayList2.add(c873950YQf);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(new C873940YQe((C873950YQf) it4.next(), 1));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("select conversation_list.*");
        if (z) {
            sb.append(", conversation_setting.*");
            C0Y91.LIZ.getClass();
            sb.append(", conversation_list." + EnumC869310Y8j.COLUMN_ID.key + " as conversation_id_alias");
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            String strLIZLLL = ((C0YB2) it5.next()).LIZLLL();
            if (strLIZLLL.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(", ");
                sbLIZ.append(strLIZLLL);
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        sb.append(" from conversation_list");
        LIZ(sb, z, arrayList3);
        LIZIZ(sb, c869710Y9x, arrayList);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" order by ");
        sbLIZ2.append(c869710Y9x.LIZIZ.getColumn());
        sbLIZ2.append(' ');
        sbLIZ2.append(c869710Y9x.LIZIZ.getDirection());
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        int i = c869710Y9x.LIZJ;
        if (i != -1) {
            arrayList.add(String.valueOf(i));
            sb.append(" limit ?");
        }
        String string = sb.toString();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(LJIIIIZZ(string));
        sbLIZ3.append(';');
        return new C0Y99(C2188811AlT.LIZIZ(sbLIZ3), (String[]) arrayList.toArray(new String[0]));
    }

    public static String LJI(String str) {
        return u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(str, "\\", "\\\\", false), "%", "\\%", false), "_", "\\_", false);
    }

    public static String LJIIIIZZ(String str) {
        return a0.LJLIIIL(new Regex("\\s+").replace(str, " ")).toString();
    }

    public static final String LJIIIZ(String str) {
        return LJIIIIZZ(new Regex(C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI("select", "left", "where", "from", "order by", "limit", "and", ";"), "|", null, null, 0, null, new C0YB0(), 30)).replace(str, "\n$0"));
    }

    public static final boolean LJIIJ(C869710Y9x c869710Y9x) {
        List<C869690Y9v> list = c869710Y9x.LIZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<C869690Y9v> it2 = list.iterator();
        while (it2.hasNext()) {
            if (LJIIJJI(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIJJI(C869690Y9v c869690Y9v) {
        if (c869690Y9v.LIZJ.LIZ() || c869690Y9v.LIZLLL.LIZ() || c869690Y9v.LJFF.LIZ != C0Y95.ALL) {
            return true;
        }
        return false;
    }

    public static final String LJFF(C0Y93 c0y93, int i) {
        ArrayList<C0YB2> arrayList = new ArrayList();
        arrayList.add(c0y93.LIZ);
        C869320Y8k c869320Y8k = c0y93.LIZIZ;
        if (c869320Y8k != null) {
            arrayList.add(c869320Y8k);
        }
        C873940YQe c873940YQe = c0y93.LIZJ;
        if (c873940YQe != null) {
            arrayList.add(c873940YQe);
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (C0YB2 c0yb2 : arrayList) {
            c0yb2.getClass();
            arrayList2.add(new C0YBE(c0yb2.LIZLLL(), c0yb2.LIZ(), c0yb2.LJ(), c0yb2.LIZJ(), c0yb2.LIZIZ()));
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C0YBE) it2.next()).LIZ);
        }
        String strLJII = LJII(", ", arrayList3);
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((C0YBE) it3.next()).LIZIZ);
        }
        String strLJII2 = LJII(" ", arrayList4);
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((C0YBE) it4.next()).LIZJ);
        }
        String strLJII3 = LJII(" and ", arrayList5);
        List listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0YAT
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C20085613iQ.LIZIZ(Integer.valueOf(((C0YBE) t).LJ), Integer.valueOf(((C0YBE) t2).LJ));
            }
        }, arrayList2);
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
        Iterator it5 = listLJLLLL.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((C0YBE) it5.next()).LIZLLL);
        }
        String strLJII4 = LJII(", ", arrayList6);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(" select ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (strLJII != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(' ');
            sbLIZ2.append(strLJII);
            sbLIZ2.append(' ');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        String strLIZIZ2 = strLIZIZ + " from conversation_list ";
        if (strLJII2 != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ2);
            sbLIZ3.append(' ');
            sbLIZ3.append(strLJII2);
            sbLIZ3.append(' ');
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (strLJII3 != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ2);
            sbLIZ4.append(" where ");
            sbLIZ4.append(strLJII3);
            sbLIZ4.append(' ');
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
        }
        if (strLJII4 != null) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(strLIZIZ2);
            sbLIZ5.append(" order by ");
            sbLIZ5.append(strLJII4);
            sbLIZ5.append(' ');
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
        }
        if (i >= 0) {
            strLIZIZ2 = strLIZIZ2 + " limit " + i;
        }
        return LJIIIIZZ(strLIZIZ2) + ';';
    }

    public static String LJII(CharSequence charSequence, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return C13LP.LJJLIIIJ(arrayList, charSequence, null, null, 0, null, null, 62);
    }

    public static void LIZ(StringBuilder sb, boolean z, List list) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" left join conversation_setting on conversation_list.");
            sbLIZ.append(EnumC869310Y8j.COLUMN_ID.key);
            sbLIZ.append(" = conversation_setting.");
            sbLIZ.append(EnumC869340Y8m.COLUMN_ID.key);
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            String strLIZ = ((C0YB2) it2.next()).LIZ();
            if (strLIZ.length() > 0) {
                sb.append(strLIZ);
            }
        }
    }

    public static void LIZIZ(StringBuilder sb, C869710Y9x c869710Y9x, List list) {
        String strLIZIZ;
        String strLJJLIIIJ;
        boolean z;
        String strLJJLIIIJ2;
        String strLIZIZ2;
        String strLIZIZ3;
        String strLIZIZ4;
        String strLIZIZ5;
        ArrayList arrayList = new ArrayList();
        List<C869690Y9v> list2 = c869710Y9x.LIZ;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (C869690Y9v c869690Y9v : list2) {
            ArrayList arrayList3 = new ArrayList();
            String strLIZLLL = C1269504xx.LIZLLL(EnumC869310Y8j.COLUMN_ID.key, c869690Y9v.LIZ, list);
            if (strLIZLLL != null) {
                arrayList3.add(strLIZLLL);
            }
            String strLIZIZ6 = C1269504xx.LIZIZ(EnumC869310Y8j.COLUMN_SHORT_ID.key, c869690Y9v.LIZIZ, list);
            if (strLIZIZ6 != null) {
                arrayList3.add(strLIZIZ6);
            }
            C0YB8 c0yb8 = c869690Y9v.LIZJ;
            String str = EnumC869340Y8m.COLUMN_CATEGORY.key;
            C0YZX c0yzx = C0YZX.PRIMARY;
            int value = c0yzx.getValue();
            if (!(c0yb8 instanceof C0YBZ)) {
                if (c0yb8 instanceof C0YB9) {
                    C0YZX c0yzx2 = ((C0YB9) c0yb8).LIZIZ;
                    if (c0yzx2 == c0yzx) {
                        ArrayList arrayList4 = (ArrayList) list;
                        arrayList4.add(String.valueOf(value));
                        arrayList4.add(CardStruct.IStatusCode.DEFAULT);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('(');
                        sbLIZ.append(str);
                        sbLIZ.append(" = ? or ");
                        sbLIZ.append(str);
                        sbLIZ.append(" = ? or ");
                        sbLIZ.append(str);
                        sbLIZ.append(" is null)");
                        strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        ((ArrayList) list).add(String.valueOf(c0yzx2.getValue()));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str);
                        sbLIZ2.append(" = ?");
                        strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    if (strLIZIZ5 != null) {
                        arrayList3.add(strLIZIZ5);
                    }
                } else {
                    if (!(c0yb8 instanceof C222200tQ)) {
                        if (c0yb8 instanceof C222300tR) {
                            c0yb8.getClass();
                            new ArrayList(C15438062q.LJIJJ(null, 10));
                            throw null;
                        }
                        throw new C1954807lC();
                    }
                    c0yb8.getClass();
                    new ArrayList(C15438062q.LJIJJ(null, 10));
                    throw null;
                }
            }
            C1908707dl c1908707dl = c869690Y9v.LIZLLL;
            if (c1908707dl.LIZ()) {
                String str2 = EnumC869340Y8m.COLUMN_CONVERSATION_TAGS.key;
                ArrayList arrayList5 = new ArrayList();
                for (String str3 : c1908707dl.LIZ) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append('%');
                    sbLIZ3.append(LJI(str3));
                    sbLIZ3.append('%');
                    ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ3));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str2);
                    sbLIZ4.append(" like ? ESCAPE '\\'");
                    arrayList5.add(C2188811AlT.LIZIZ(sbLIZ4));
                }
                if (!c1908707dl.LIZIZ.isEmpty()) {
                    String strLJJLIIIJ3 = C13LP.LJJLIIIJ(c1908707dl.LIZIZ, " or ", null, null, 0, null, new AwS127S1100000_13(list, (List<String>) str2, (String) 3), 30);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append('(');
                    sbLIZ5.append(strLJJLIIIJ3);
                    sbLIZ5.append(')');
                    arrayList5.add(C2188811AlT.LIZIZ(sbLIZ5));
                }
                for (String str4 : c1908707dl.LIZJ) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append('%');
                    sbLIZ6.append(LJI(str4));
                    sbLIZ6.append('%');
                    ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ6));
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append('(');
                    sbLIZ7.append(str2);
                    sbLIZ7.append(" not like ? ESCAPE '\\' or ");
                    sbLIZ7.append(str2);
                    sbLIZ7.append(" is null)");
                    arrayList5.add(C2188811AlT.LIZIZ(sbLIZ7));
                }
                String strLJJLIIIJ4 = C13LP.LJJLIIIJ(arrayList5, " and ", null, null, 0, null, null, 62);
                if (strLJJLIIIJ4 != null) {
                    arrayList3.add(strLJJLIIIJ4);
                }
            }
            C0Y97 c0y97 = c869690Y9v.LJ.LIZ;
            if (c0y97 != C0Y97.ALL) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String str5 = EnumC869310Y8j.COLUMN_UNREAD_COUNT.key;
                int i = C0Y96.LIZ[c0y97.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append(str5);
                        sbLIZ8.append(" = 0");
                        strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ8);
                    }
                } else {
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append(str5);
                    sbLIZ9.append(" > 0");
                    strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ9);
                }
                if (strLIZIZ4 != null) {
                    arrayList3.add(strLIZIZ4);
                }
            }
            C0Y95 c0y95 = c869690Y9v.LJFF.LIZ;
            if (c0y95 != C0Y95.ALL) {
                String str6 = EnumC869340Y8m.COLUMN_MUTE.key;
                int i2 = C0Y96.LIZIZ[c0y95.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        ((ArrayList) list).add(CardStruct.IStatusCode.DEFAULT);
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append(str6);
                        sbLIZ10.append(" = ?");
                        strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ10);
                    }
                } else {
                    ((ArrayList) list).add("1");
                    StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                    sbLIZ11.append(str6);
                    sbLIZ11.append(" = ?");
                    strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ11);
                }
                if (strLIZIZ3 != null) {
                    arrayList3.add(strLIZIZ3);
                }
            }
            C0YBA c0yba = c869690Y9v.LJI;
            String str7 = EnumC869310Y8j.COLUMN_CONVERSATION_TYPE.key;
            if (!(c0yba instanceof C870000YBa)) {
                if (c0yba instanceof C0YBB) {
                    ((ArrayList) list).add(String.valueOf(((C0YBB) c0yba).LIZIZ.getValue()));
                    StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                    sbLIZ12.append(str7);
                    sbLIZ12.append(" = ?");
                    String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ12);
                    if (strLIZIZ7 != null) {
                        arrayList3.add(strLIZIZ7);
                    }
                } else {
                    if (!(c0yba instanceof C222400tS)) {
                        if (c0yba instanceof C222500tT) {
                            c0yba.getClass();
                            throw null;
                        }
                        throw new C1954807lC();
                    }
                    c0yba.getClass();
                    throw null;
                }
            }
            C0Y98 c0y98 = c869690Y9v.LJII.LIZ;
            if (c0y98 != C0Y98.ALL) {
                String str8 = EnumC869310Y8j.COLUMN_MIN_INDEX.key;
                String str9 = EnumC869310Y8j.COLUMN_LAST_MSG_INDEX.key;
                int i3 = C0Y96.LIZJ[c0y98.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                        sbLIZ13.append(str9);
                        sbLIZ13.append(" > 0");
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ13);
                    }
                } else {
                    StringBuilder sbLIZ14 = C2188811AlT.LIZ();
                    sbLIZ14.append(str8);
                    sbLIZ14.append(" > 0 and ");
                    sbLIZ14.append(str9);
                    sbLIZ14.append(" <= 0");
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ14);
                }
                if (strLIZIZ2 != null) {
                    arrayList3.add(strLIZIZ2);
                }
            }
            C873950YQf c873950YQf = c869690Y9v.LJIIIIZZ;
            if (c873950YQf != null) {
                String string = a0.LJLIIIL(new C873940YQe(c873950YQf, 1).LJ()).toString();
                if (string.length() > 0) {
                    arrayList3.add(string);
                }
            }
            if (arrayList3.isEmpty()) {
                strLJJLIIIJ2 = "";
            } else {
                strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList3, " and ", null, null, 0, null, null, 62);
                if (c869690Y9v.LJIIIZ) {
                    StringBuilder sbLIZ15 = C2188811AlT.LIZ();
                    sbLIZ15.append("NOT (");
                    sbLIZ15.append(strLJJLIIIJ2);
                    sbLIZ15.append(')');
                    strLJJLIIIJ2 = C2188811AlT.LIZIZ(sbLIZ15);
                }
            }
            arrayList2.add(strLJJLIIIJ2);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((String) obj).length() > 0) {
                arrayList6.add(obj);
            }
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() == 1) {
                strLJJLIIIJ = (String) C13LP.LJJJJZI(arrayList6);
            } else {
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList6, " or ", null, null, 0, null, AnonymousClass0207.get$arr$(81), 30);
            }
            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
            sbLIZ16.append('(');
            sbLIZ16.append(strLJJLIIIJ);
            sbLIZ16.append(')');
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ16));
        }
        if (!c869710Y9x.LJ) {
            ((ArrayList) list).add(CardStruct.IStatusCode.DEFAULT);
            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
            sbLIZ17.append(EnumC869310Y8j.COLUMN_STRANGER.key);
            sbLIZ17.append(" = ?");
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ17));
        }
        if (c869710Y9x.LIZLLL != Long.MAX_VALUE) {
            String column = c869710Y9x.LIZIZ.getColumn();
            ((ArrayList) list).add(String.valueOf(c869710Y9x.LIZLLL));
            if (Intrinsics.LJFF(c869710Y9x.LIZIZ.getDirection(), "DESC")) {
                StringBuilder sbLIZ18 = C2188811AlT.LIZ();
                sbLIZ18.append(column);
                sbLIZ18.append(" < ?");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ18);
            } else {
                StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                sbLIZ19.append(column);
                sbLIZ19.append(" > ?");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ19);
            }
            arrayList.add(strLIZIZ);
        }
        String strLJJLIIIJ5 = C13LP.LJJLIIIJ(arrayList, " and ", null, null, 0, null, null, 62);
        if (strLJJLIIIJ5.length() > 0) {
            StringBuilder sbLIZ20 = C2188811AlT.LIZ();
            sbLIZ20.append(" where ");
            sbLIZ20.append(strLJJLIIIJ5);
            sb.append(C2188811AlT.LIZIZ(sbLIZ20));
        }
    }
}
