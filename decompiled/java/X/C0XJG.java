package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.text.Regex;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0XJG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XJG {
    public static final Regex LIZ = new Regex("([^\\[\\]]+)(\\[[0-9]+\\])?");

    public static List LIZJ(String str) {
        List listLJJLIIIJ = a0.LJJLIIIJ(str, new char[]{'.'}, false, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJ.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(C09RB.LJJII(C09RB.LJIILJJIL(Regex.findAll$default(LIZ, (String) it2.next(), 0, 2, null), AFwS247S0000000_13.get$arr$(0))), arrayList);
        }
        return arrayList;
    }

    public static void LJFF(List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        if (!(C13LP.LJJJJZI(list) instanceof C0XJI)) {
            int size = arrayList.size() - 1;
            for (int i = 0; i < size; i++) {
                if ((ListProtector.get(list, i) instanceof C0XJI) && (ListProtector.get(list, i + 1) instanceof C0XJI)) {
                    throw new IllegalArgumentException("Cannot have consecutive array indices in path");
                }
            }
            return;
        }
        throw new IllegalArgumentException("Path cannot start with an array index");
    }

    public static String LIZ(int i, List list) {
        return C13LP.LJJLIIIJ(((ArrayList) list).subList(0, i + 1), e3.d, null, null, 0, null, AFwS247S0000000_13.get$arr$(1), 30);
    }

    public static Object LIZIZ(String str, Map map) {
        Object obj;
        if (!a0.LJJJIL(str)) {
            List listLIZJ = LIZJ(str);
            ArrayList arrayList = (ArrayList) listLIZJ;
            if (!arrayList.isEmpty()) {
                LJFF(listLIZJ);
                int size = arrayList.size();
                int i = 0;
                Object obj2 = map;
                while (i < size) {
                    C0XJJ c0xjj = (C0XJJ) ListProtector.get(listLIZJ, i);
                    if (c0xjj instanceof C0XJH) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Cannot traverse into non-Map at '");
                        sbLIZ.append(LIZ(i, listLIZJ));
                        sbLIZ.append('\'');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        boolean z = obj2 instanceof Map;
                        Object obj3 = obj2;
                        if (!z) {
                            obj3 = null;
                        }
                        Map map2 = (Map) obj3;
                        if (map2 != null) {
                            obj = map2.get(((C0XJH) c0xjj).LIZ);
                            if (obj == null) {
                            }
                        } else {
                            throw new IllegalArgumentException(strLIZIZ);
                        }
                    } else if (c0xjj instanceof C0XJI) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Cannot index into non-list at '");
                        sbLIZ2.append(LIZ(i, listLIZJ));
                        sbLIZ2.append('\'');
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        boolean z2 = obj2 instanceof List;
                        Object obj4 = obj2;
                        if (!z2) {
                            obj4 = null;
                        }
                        List list = (List) obj4;
                        if (list != null) {
                            C0XJI c0xji = (C0XJI) c0xjj;
                            int i2 = c0xji.LIZ;
                            if (i2 >= 0 && i2 < list.size()) {
                                obj = ListProtector.get(list, c0xji.LIZ);
                                if (obj == null) {
                                    return null;
                                }
                            } else {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Index ");
                                sbLIZ3.append(c0xji.LIZ);
                                sbLIZ3.append(" out of bounds for list of size ");
                                sbLIZ3.append(list.size());
                                sbLIZ3.append(" at '");
                                sbLIZ3.append(LIZ(i, listLIZJ));
                                sbLIZ3.append('\'');
                                throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ3));
                            }
                        } else {
                            throw new IllegalArgumentException(strLIZIZ2);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                    i++;
                    obj2 = obj;
                }
                return obj2;
            }
        }
        return null;
    }

    public static void LIZLLL(List list, Map map) {
        int size;
        Map map2;
        List list2;
        Map map3;
        if (list.isEmpty()) {
            return;
        }
        int size2 = list.size() - 1;
        Object objLJJJLZIJ = map;
        int i = 0;
        while (true) {
            List list3 = null;
            if (i < size2) {
                C0XJJ c0xjj = (C0XJJ) ListProtector.get(list, i);
                if (c0xjj instanceof C0XJH) {
                    if (C19719512Dh.LJII(objLJJJLZIJ) && (map3 = (Map) objLJJJLZIJ) != null) {
                        objLJJJLZIJ = map3.get(((C0XJH) c0xjj).LIZ);
                    } else {
                        return;
                    }
                } else if (c0xjj instanceof C0XJI) {
                    if (C19719512Dh.LJI(objLJJJLZIJ) && (list2 = (List) objLJJJLZIJ) != null) {
                        objLJJJLZIJ = C13LP.LJJJLZIJ(((C0XJI) c0xjj).LIZ, list2);
                    } else {
                        return;
                    }
                } else {
                    throw new C1954807lC();
                }
                if (objLJJJLZIJ != null) {
                    i++;
                } else {
                    return;
                }
            } else {
                C0XJJ c0xjj2 = (C0XJJ) C13LP.LJJLIIIJJI(list);
                if (c0xjj2 instanceof C0XJH) {
                    if (C19719512Dh.LJII(objLJJJLZIJ) && (map2 = (Map) objLJJJLZIJ) != null) {
                        map2.remove(((C0XJH) c0xjj2).LIZ);
                        if (map2.isEmpty() && list.size() > 1) {
                            LIZLLL(C13LP.LJJJJJ(1, list), map);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (c0xjj2 instanceof C0XJI) {
                    if (C19719512Dh.LJI(objLJJJLZIJ) && (list3 = (List) objLJJJLZIJ) != null) {
                        size = list3.size();
                    } else {
                        size = 0;
                    }
                    int i2 = ((C0XJI) c0xjj2).LIZ;
                    if (i2 < 0 || i2 >= size || list3 == null) {
                        return;
                    }
                    ListProtector.remove(list3, i2);
                    if (!list3.isEmpty() || list.size() <= 1) {
                        return;
                    }
                    LIZLLL(C13LP.LJJJJJ(1, list), map);
                    return;
                }
                throw new C1954807lC();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(java.lang.Object r13, java.lang.String r14, java.util.Map r15) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XJG.LJ(java.lang.Object, java.lang.String, java.util.Map):boolean");
    }
}
