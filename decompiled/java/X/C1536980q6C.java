package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0q6C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536980q6C implements InterfaceC1535230q3N, InterfaceC1532560pz4 {
    @Override // X.InterfaceC1535230q3N
    public final void LIZ() {
    }

    @Override // X.InterfaceC1532560pz4
    public final void LIZIZ(C1532310pyf c1532310pyf) {
    }

    public static List LJ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int i = C1154730g9f.LIZ[((EnumC1154720g9e) it2.next()).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        arrayList.add("cdn");
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    arrayList.add("builtin");
                }
            } else {
                arrayList.add("gecko");
            }
        }
        return arrayList;
    }

    public static List LJFF(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            int i = C1154730g9f.LIZ[((EnumC1154720g9e) it2.next()).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        arrayList.add("cdn");
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    arrayList.add("assets");
                }
            } else {
                arrayList.add("gecko");
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1535230q3N
    public final void LIZJ(C1533490q0Z c1533490q0Z) {
        List<String> listLJ;
        C21322218cO.LIZ.getClass();
        C1533510q0b c1533510q0b = c1533490q0Z.LJJJJLI;
        String str = c1533510q0b.LIZJ;
        C1154740g9g c1154740g9g = C21322018cM.LJI.getValue().get(c1533510q0b.LIZIZ);
        if (c1154740g9g != null) {
            List<EnumC1154720g9e> list = c1154740g9g.LIZ;
            Map<String, List<EnumC1154720g9e>> map = c1154740g9g.LIZIZ;
            List<EnumC1154720g9e> list2 = null;
            if (map != null) {
                list2 = map.get(str);
            }
            if (list2 != null && !list2.isEmpty()) {
                listLJ = LJ(list2);
            } else if (list == null || list.isEmpty()) {
                return;
            } else {
                listLJ = LJ(list);
            }
            if (listLJ != null && !listLJ.isEmpty()) {
                c1533490q0Z.LJJJLL = listLJ;
            }
        }
    }

    @Override // X.InterfaceC1532560pz4
    public final void LIZLLL(C1532710pzJ c1532710pzJ) {
        String str;
        List<String> listLJFF;
        String str2;
        C21322218cO.LIZ.getClass();
        C1529350ptt c1529350ptt = c1532710pzJ.LJJIIJ;
        List<EnumC1154720g9e> list = null;
        if (c1529350ptt != null) {
            str = c1529350ptt.LIZJ;
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        if (c1529350ptt != null && (str2 = c1529350ptt.LIZIZ) != null) {
            str3 = str2;
        }
        C1154740g9g c1154740g9g = C21322018cM.LJI.getValue().get(str3);
        if (c1154740g9g != null) {
            List<EnumC1154720g9e> list2 = c1154740g9g.LIZ;
            Map<String, List<EnumC1154720g9e>> map = c1154740g9g.LIZIZ;
            if (map != null) {
                list = map.get(str);
            }
            if (list != null && !list.isEmpty()) {
                listLJFF = LJFF(list);
            } else if (list2 == null || list2.isEmpty()) {
                return;
            } else {
                listLJFF = LJFF(list2);
            }
            if (listLJFF != null && !listLJFF.isEmpty()) {
                c1532710pzJ.LJJIIZ = listLJFF;
            }
        }
    }
}
