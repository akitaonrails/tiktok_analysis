package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0M4D, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M4D {
    public static final List<String> LJIIIIZZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LJIIIZ());
        arrayList.add("CHECK_POINT");
        arrayList.add("SaveLocalDraftID");
        return arrayList;
    }

    public static final List<String> LJIIIZ() {
        ArrayList arrayList = new ArrayList();
        List<String> listLJJJJIZL = C0CHQ.LIZ().getPublishService().LJJJJIZL();
        ArrayList arrayList2 = new ArrayList();
        for (String str : listLJJJJIZL) {
            if (str.length() > 0) {
                arrayList2.add(str);
            }
        }
        arrayList.addAll(arrayList2);
        C0CHQ.LIZ().getPublishService().LJJJJI();
        Set<String> setLIZIZ = C0MY9.LIZIZ();
        ArrayList arrayList3 = new ArrayList();
        for (String str2 : setLIZIZ) {
            if (str2.length() > 0) {
                arrayList3.add(str2);
            }
        }
        if (!arrayList3.isEmpty()) {
            arrayList.addAll(arrayList3);
        }
        String str3 = C1443030nef.LJII().LJII;
        if (str3 == null) {
            str3 = "";
        }
        if (str3.length() > 0) {
            arrayList.add(str3);
        }
        return arrayList;
    }

    public static final String LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) 86400000);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("((is_published is null or is_published = 0 or (is_published = 1 and published_time > ");
        sbLIZ.append(jCurrentTimeMillis);
        sbLIZ.append(")) and visible_to_user = 1)");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final EnumC562200M3e LJ() {
        return C562270M3l.LJIIIZ() ? EnumC562200M3e.LAST_SAVE_TIME : EnumC562200M3e.FIRST_SAVE_TIME;
    }

    public static final String LJIIJJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is_published = 1 and published_time > ");
        sbLIZ.append(System.currentTimeMillis() - ((long) 86400000));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZIZ(C0M4F c0m4f) {
        List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(C0M4I.DEFAULT.getValue()), Integer.valueOf(C0M4I.STORY_LIGHTENING.getValue()), Integer.valueOf(C0M4I.PHOTO_MODE.getValue()), Integer.valueOf(C0M4I.TTN.getValue()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if ((((Number) obj).intValue() & c0m4f.getValue()) != 0) {
                arrayList.add(obj);
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("format_type IN (");
        sbLIZ.append(strLJJLIIIJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZJ(C0M4E c0m4e) {
        String str;
        if (c0m4e.LJ == EnumC562220M3g.POSTED) {
            List<String> listLJI = LJI(c0m4e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("select * from local_draft");
            sbLIZ.append(LJII(c0m4e, listLJI));
            sbLIZ.append(" order by published_time desc ");
            sbLIZ.append(LJFF(c0m4e));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        EnumC562200M3e enumC562200M3e = c0m4e.LIZ;
        int[] iArr = C562210M3f.LIZJ;
        int i = iArr[enumC562200M3e.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new C1954807lC();
        }
        List<String> listLJI2 = LJI(c0m4e);
        int i2 = iArr[c0m4e.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str = "time";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "save_time";
            }
        } else {
            str = "free_up_space";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("select * from local_draft");
        sbLIZ2.append(LJII(c0m4e, listLJI2));
        sbLIZ2.append(" order by ");
        sbLIZ2.append(str);
        sbLIZ2.append(" desc ");
        sbLIZ2.append(LJFF(c0m4e));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final String LJFF(C0M4E c0m4e) {
        C0M4N c0m4n = c0m4e.LIZIZ;
        if (c0m4n != null) {
            int i = c0m4n.LIZJ;
            if (i <= 0) {
                i = c0m4n.LIZ * c0m4n.LIZIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" limit ");
            sbLIZ.append(c0m4n.LIZIZ);
            sbLIZ.append(" offset ");
            sbLIZ.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return "";
    }

    public static final List<String> LJI(C0M4E c0m4e) {
        String strLIZ;
        String strLIZIZ;
        Map<EnumC561380M0a, C0M0Y> map;
        String str;
        List<String> list;
        String str2;
        int i = C562210M3f.LIZ[c0m4e.LJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        strLIZ = "visible_to_user = 0";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    strLIZ = LJIIJJI();
                }
            } else {
                strLIZ = "((is_published = 0 or is_published is null) and visible_to_user = 1)";
            }
        } else {
            strLIZ = LIZ();
        }
        String strLIZIZ2 = LIZIZ(c0m4e.LJFF);
        C562260M3k c562260M3k = c0m4e.LJI;
        String strLIZIZ3 = null;
        if (c562260M3k != null && (list = c562260M3k.LIZIZ) != null && !list.isEmpty()) {
            int i2 = C562210M3f.LIZLLL[c562260M3k.LIZ.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    str2 = "creative_model";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str2 = "sticker_id";
            }
            if (C562210M3f.LJ[c562260M3k.LIZJ.ordinal()] == 1) {
                ArrayList<String> arrayList = new ArrayList();
                EnumC562230M3h enumC562230M3h = c562260M3k.LIZ;
                if (enumC562230M3h == EnumC562230M3h.MUSIC) {
                    for (String str3 : list) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("%\"music_business_model\":%\"id\":");
                        sbLIZ.append(str3);
                        sbLIZ.append('%');
                        arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("%\"music_business_model\":%\"id\":\"");
                        sbLIZ2.append(str3);
                        sbLIZ2.append("\"%");
                        arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else if (enumC562230M3h == EnumC562230M3h.EFFECT) {
                    for (String str4 : list) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append('%');
                        sbLIZ3.append(str4);
                        sbLIZ3.append('%');
                        arrayList.add(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str5 : arrayList) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str2);
                    sbLIZ4.append(' ');
                    sbLIZ4.append("like");
                    sbLIZ4.append(" '");
                    sbLIZ4.append(str5);
                    sbLIZ4.append('\'');
                    arrayList2.add(C2188811AlT.LIZIZ(sbLIZ4));
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append('(');
                sbLIZ5.append(C13LP.LJJLIIIJ(arrayList2, " OR ", null, null, 0, null, null, 62));
                sbLIZ5.append(')');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
            } else {
                throw new C1954807lC();
            }
        } else {
            strLIZIZ = null;
        }
        C0M0Z c0m0z = c0m4e.LJII;
        if (c0m0z != null && (map = c0m0z.LIZ) != null && !map.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry<EnumC561380M0a, C0M0Y> entry : map.entrySet()) {
                int i3 = C562210M3f.LJFF[entry.getKey().ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        str = "with_template";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str = "with_effect";
                }
                if (C562210M3f.LJI[entry.getValue().ordinal()] == 1) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(str);
                    sbLIZ6.append(' ');
                    sbLIZ6.append("!= 0");
                    arrayList3.add(C2188811AlT.LIZIZ(sbLIZ6));
                } else {
                    throw new C1954807lC();
                }
            }
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append('(');
            sbLIZ7.append(C13LP.LJJLIIIJ(arrayList3, " AND ", null, null, 0, null, null, 62));
            sbLIZ7.append(')');
            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ7);
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(strLIZ, strLIZIZ2);
        if (C123100dR.LIZ(strLIZIZ)) {
            listLJIILJJIL.add(strLIZIZ);
        }
        if (C123100dR.LIZ(strLIZIZ3)) {
            listLJIILJJIL.add(strLIZIZ3);
        }
        Long l = c0m4e.LJIIIZ;
        if (l != null) {
            long jLongValue = l.longValue();
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("save_time < ");
            sbLIZ8.append(jLongValue);
            listLJIILJJIL.add(C2188811AlT.LIZIZ(sbLIZ8));
        }
        return C13LP.LLIIII(listLJIILJJIL);
    }

    public static final String LJIIJ(List<String> list) {
        boolean z = true;
        String strLIZIZ = e3.h;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(',');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append('\'');
            sbLIZ2.append(str);
            sbLIZ2.append('\'');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(')');
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static final String LIZLLL(C0M4E c0m4e, List<String> list) {
        ArrayList arrayList = new ArrayList(LJI(c0m4e));
        if (list != null && (!list.isEmpty())) {
            String strLJJLIIIJ = C13LP.LJJLIIIJ(list, ", ", null, null, 0, null, AnonymousClass0207.get$arr$(151), 30);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("video_path NOT IN (");
            sbLIZ.append(strLJJLIIIJ);
            sbLIZ.append(')');
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("select video_path, free_up_space from local_draft");
        sbLIZ2.append(LJII(c0m4e, arrayList));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static final String LJII(C0M4E c0m4e, List<String> list) {
        String strLJJLIIIJ;
        String strLIZIZ;
        String strLIZIZ2 = "";
        if (!(!list.isEmpty())) {
            strLJJLIIIJ = "";
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, " and ", null, null, 0, null, null, 62);
        }
        if (strLJJLIIIJ.length() == 0) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" and ");
            sbLIZ.append(strLJJLIIIJ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        if (strLJJLIIIJ.length() != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" where ");
            sbLIZ2.append(strLJJLIIIJ);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        String strLJIIJ = LJIIJ(c0m4e.LIZJ);
        if (c0m4e.LIZJ.isEmpty() && c0m4e.LIZLLL) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(" where user_id = '");
            sbLIZ3.append(C0CHQ.LIZ().getAccountService().getCurrentUserID());
            sbLIZ3.append('\'');
            sbLIZ3.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        if ((!c0m4e.LIZJ.isEmpty()) && !c0m4e.LIZLLL) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(" where video_path not in ");
            sbLIZ4.append(strLJIIJ);
            sbLIZ4.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        if ((true ^ c0m4e.LIZJ.isEmpty()) && c0m4e.LIZLLL) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(" where user_id = '");
            sbLIZ5.append(C0CHQ.LIZ().getAccountService().getCurrentUserID());
            sbLIZ5.append("' and video_path not in ");
            sbLIZ5.append(strLJIIJ);
            sbLIZ5.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ5);
        }
        c0m4e.LIZJ.isEmpty();
        return strLIZIZ2;
    }
}
