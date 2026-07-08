package X;

import Y.AComparatorS22S0000000_3;
import android.util.Printer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08Ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2101008Ky {
    public static boolean LIZIZ;
    public static Printer LIZJ;
    public static C08L0 LIZLLL;
    public static String LJ;
    public static boolean LJFF;
    public static long LJIIIIZZ;
    public static C2100808Kw LIZ = new C2100808Kw(0);
    public static String LJI = "normal";
    public static final List<C2100408Ks> LJII = new ArrayList();
    public static String LJIIIZ = "";
    public static final CopyOnWriteArrayList<InterfaceC2100608Ku> LJIIJ = new CopyOnWriteArrayList<>();

    public static void LIZ() {
        final String str = LJ;
        if (str == null) {
            return;
        }
        List<C2100408Ks> list = LJII;
        final List listLLIIII = C13LP.LLIIII(list);
        final String str2 = LJI;
        final List listLLIIII2 = C13LP.LLIIII(LJIIJ);
        LJ = null;
        LJFF = false;
        LJI = "normal";
        ((ArrayList) list).clear();
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.08Kq
            public final void LIZ() {
                C2100308Kr c2100308Kr;
                int i;
                char c;
                double d;
                double d2;
                String str3 = str;
                String str4 = str2;
                List<C2100408Ks> list2 = listLLIIII;
                int i2 = C2101008Ky.LIZ.LIZIZ;
                if (list2.isEmpty()) {
                    C13BV c13bv = C13BV.INSTANCE;
                    c2100308Kr = new C2100308Kr(str3, str4, 0L, 0L, 0L, 0, c13bv, c13bv, 0, 0L, c13bv, c13bv);
                    i = 100;
                    c = 0;
                } else {
                    long j = 1000000;
                    long j2 = (((C2100408Ks) C13LP.LJJLIIIJJI(list2)).LIZIZ - ((C2100408Ks) C13LP.LJJJJZI(list2)).LIZ) / j;
                    Iterator<C2100408Ks> it2 = list2.iterator();
                    long jLIZ = 0;
                    while (it2.hasNext()) {
                        jLIZ += it2.next().LIZ();
                    }
                    int size = list2.size();
                    long j3 = 0;
                    for (int i3 = 1; i3 < size; i3++) {
                        long j4 = ((C2100408Ks) ListProtector.get(list2, i3)).LIZ - ((C2100408Ks) ListProtector.get(list2, i3 - 1)).LIZIZ;
                        if (j4 > 0) {
                            j3 += j4;
                        }
                    }
                    long j5 = j3 / j;
                    ArrayList arrayList = new ArrayList();
                    for (C2100408Ks c2100408Ks : list2) {
                        if (c2100408Ks.LIZLLL != null) {
                            arrayList.add(c2100408Ks);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (C2100408Ks c2100408Ks2 : list2) {
                        if (c2100408Ks2.LIZLLL == null) {
                            arrayList2.add(c2100408Ks2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C2100408Ks c2100408Ks3 = (C2100408Ks) it3.next();
                        String str5 = c2100408Ks3.LIZLLL;
                        arrayList3.add(new C1969707nb(c2100408Ks3.LIZ(), str5 != null ? str5 : "", j2 > 0 ? (c2100408Ks3.LIZ() / j2) * ((double) 100) : 0.0d));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : arrayList2) {
                        String strLIZIZ = ((C2100408Ks) obj).LIZJ;
                        int iLJJIZ = a0.LJJIZ(strLIZIZ, '}', 0, false, 6);
                        if (iLJJIZ >= 0) {
                            String string = a0.LJLJJL(strLIZIZ.substring(iLJJIZ + 1)).toString();
                            int iLJJJJ = a0.LJJJJ(string, ':', 0, 6);
                            String string2 = iLJJJJ > 0 ? a0.LJLIIIL(string.substring(0, iLJJJJ)).toString() : a0.LJLIIIL(string).toString();
                            if (Intrinsics.LJFF(string2, "null") || string2.length() <= 0) {
                                int iLJJIZ2 = a0.LJJIZ(strLIZIZ, '(', 0, false, 6);
                                int iLJJIZ3 = a0.LJJIZ(strLIZIZ, ')', iLJJIZ2, false, 4);
                                if (iLJJIZ2 >= 0 && iLJJIZ3 > iLJJIZ2) {
                                    strLIZIZ = strLIZIZ.substring(iLJJIZ2 + 1, iLJJIZ3);
                                }
                                String string3 = iLJJJJ >= 0 ? a0.LJLIIIL(string.substring(iLJJJJ + 1)).toString() : "";
                                if (string3.length() > 0) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(strLIZIZ);
                                    sbLIZ.append(':');
                                    sbLIZ.append(string3);
                                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                }
                            } else {
                                int iLJJJJ2 = a0.LJJJJ(string2, '@', 0, 6);
                                if (iLJJJJ2 > 0) {
                                    string2 = string2.substring(0, iLJJJJ2);
                                }
                                strLIZIZ = string2;
                            }
                        }
                        Object arrayList4 = linkedHashMap.get(strLIZIZ);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            linkedHashMap.put(strLIZIZ, arrayList4);
                        }
                        ((List) arrayList4).add(obj);
                    }
                    ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str6 = (String) entry.getKey();
                        List list3 = (List) entry.getValue();
                        Iterator it4 = list3.iterator();
                        long jLIZ2 = 0;
                        while (it4.hasNext()) {
                            jLIZ2 += ((C2100408Ks) it4.next()).LIZ();
                        }
                        arrayList5.add(new C1969607na(jLIZ2, str6, list3.size(), j2 > 0 ? (jLIZ2 / j2) * ((double) 100) : 0.0d));
                    }
                    List listLJLLLL = C13LP.LJLLLL(new AComparatorS22S0000000_3(30), arrayList5);
                    Iterator it5 = arrayList2.iterator();
                    long jLIZ3 = 0;
                    while (it5.hasNext()) {
                        jLIZ3 += ((C2100408Ks) it5.next()).LIZ();
                    }
                    List<C2100408Ks> listLL = C13LP.LL(C13LP.LJLLLL(new AComparatorS22S0000000_3(31), arrayList2), i2);
                    ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
                    for (C2100408Ks c2100408Ks4 : listLL) {
                        arrayList6.add(new C2100508Kt(c2100408Ks4.LIZ(), c2100408Ks4.LIZJ, c2100408Ks4.LJ));
                    }
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        if (((C2100408Ks) obj2).LIZ() >= 32) {
                            arrayList7.add(obj2);
                        }
                    }
                    List<C2100408Ks> listLJLLLL2 = C13LP.LJLLLL(new AComparatorS22S0000000_3(32), arrayList7);
                    ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(listLJLLLL2, 10));
                    for (C2100408Ks c2100408Ks5 : listLJLLLL2) {
                        arrayList8.add(new C2100508Kt(c2100408Ks5.LIZ(), c2100408Ks5.LIZJ, c2100408Ks5.LJ));
                    }
                    i = 100;
                    c = 0;
                    c2100308Kr = new C2100308Kr(str3, str4, j2, jLIZ, j5, list2.size(), arrayList3, listLJLLLL, arrayList2.size(), jLIZ3, arrayList6, arrayList8);
                }
                if (C2101008Ky.LIZ.LIZJ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("====== MainLoopMonitor Report: ");
                    sbLIZ2.append(c2100308Kr.LIZ);
                    sbLIZ2.append(" [");
                    sbLIZ2.append(c2100308Kr.LIZIZ);
                    sbLIZ2.append("] ======");
                    C2188811AlT.LIZIZ(sbLIZ2);
                    double d3 = c2100308Kr.LIZJ;
                    if (d3 > 0.0d) {
                        d = (c2100308Kr.LIZLLL / d3) * ((double) i);
                        d2 = (c2100308Kr.LJ / d3) * ((double) i);
                    } else {
                        d = 0.0d;
                        d2 = 0.0d;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Total: ");
                    sbLIZ3.append(c2100308Kr.LIZJ);
                    sbLIZ3.append("ms | Busy: ");
                    sbLIZ3.append(c2100308Kr.LIZLLL);
                    sbLIZ3.append("ms (%5.1f%%) | Idle: ");
                    sbLIZ3.append(c2100308Kr.LJ);
                    sbLIZ3.append("ms (%5.1f%%) | Messages: ");
                    sbLIZ3.append(c2100308Kr.LJFF);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                    Object[] objArr = new Object[2];
                    objArr[c] = Double.valueOf(d);
                    objArr[1] = Double.valueOf(d2);
                    C786410Ut5.j4(strLIZIZ2, Arrays.copyOf(objArr, 2));
                    for (C1969707nb c1969707nb : c2100308Kr.LJI) {
                        Object[] objArr2 = new Object[3];
                        objArr2[c] = c1969707nb.LIZ;
                        objArr2[1] = Long.valueOf(c1969707nb.LIZIZ);
                        objArr2[2] = Double.valueOf(c1969707nb.LIZJ);
                        C786410Ut5.j4("  %-24s: %5dms (%5.1f%%)", Arrays.copyOf(objArr2, 3));
                    }
                    if (c2100308Kr.LJIIIIZZ > 0) {
                        long j6 = c2100308Kr.LIZJ;
                        double d4 = j6 > 0 ? (c2100308Kr.LJIIIZ / j6) * ((double) i) : 0.0d;
                        Object[] objArr3 = new Object[3];
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("other(");
                        sbLIZ4.append(c2100308Kr.LJIIIIZZ);
                        sbLIZ4.append(" msgs)");
                        objArr3[c] = C2188811AlT.LIZIZ(sbLIZ4);
                        objArr3[1] = Long.valueOf(c2100308Kr.LJIIIZ);
                        objArr3[2] = Double.valueOf(d4);
                        C786410Ut5.j4("  %-24s: %5dms (%5.1f%%)", Arrays.copyOf(objArr3, 3));
                    }
                    if (!c2100308Kr.LJII.isEmpty()) {
                        List<C1969607na> list4 = c2100308Kr.LJII;
                        ArrayList<C1969607na> arrayList9 = new ArrayList();
                        for (C1969607na c1969607na : list4) {
                            if (c1969607na.LIZLLL >= 1.0d) {
                                arrayList9.add(c1969607na);
                            }
                        }
                        List<C1969607na> list5 = c2100308Kr.LJII;
                        ArrayList arrayList10 = new ArrayList();
                        for (C1969607na c1969607na2 : list5) {
                            if (c1969607na2.LIZLLL < 1.0d) {
                                arrayList10.add(c1969607na2);
                            }
                        }
                        for (C1969607na c1969607na3 : arrayList9) {
                            Object[] objArr4 = new Object[4];
                            objArr4[c] = c1969607na3.LIZ;
                            objArr4[1] = Long.valueOf(c1969607na3.LIZJ);
                            objArr4[2] = Integer.valueOf(c1969607na3.LIZIZ);
                            objArr4[3] = Double.valueOf(c1969607na3.LIZLLL);
                            C786410Ut5.j4("  %-30s: %5dms x%-4d (%5.1f%%)", Arrays.copyOf(objArr4, 4));
                        }
                        if (!arrayList10.isEmpty()) {
                            Iterator it6 = arrayList10.iterator();
                            long j7 = 0;
                            while (it6.hasNext()) {
                                j7 += ((C1969607na) it6.next()).LIZJ;
                            }
                            Iterator it7 = arrayList10.iterator();
                            int i4 = 0;
                            while (it7.hasNext()) {
                                i4 += ((C1969607na) it7.next()).LIZIZ;
                            }
                            long j8 = c2100308Kr.LIZJ;
                            double d5 = j8 > 0 ? ((double) i) * (j7 / j8) : 0.0d;
                            Object[] objArr5 = new Object[4];
                            objArr5[c] = "others(" + arrayList10.size() + " groups)";
                            objArr5[1] = Long.valueOf(j7);
                            objArr5[2] = Integer.valueOf(i4);
                            objArr5[3] = Double.valueOf(d5);
                            C786410Ut5.j4("  %-30s: %5dms x%-4d (%5.1f%%)", Arrays.copyOf(objArr5, 4));
                        }
                    }
                    if (!c2100308Kr.LJIIJ.isEmpty()) {
                        c2100308Kr.LJIIJ.size();
                        int i5 = 0;
                        for (C2100508Kt c2100508Kt : c2100308Kr.LJIIJ) {
                            i5++;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("  #");
                            sbLIZ5.append(i5);
                            sbLIZ5.append(": ");
                            sbLIZ5.append(c2100508Kt.LIZ);
                            sbLIZ5.append("ms | ");
                            sbLIZ5.append(c2100508Kt.LIZIZ);
                            C2188811AlT.LIZIZ(sbLIZ5);
                            if (c2100508Kt.LIZJ != null) {
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("    at ");
                                sbLIZ6.append(c2100508Kt.LIZJ);
                                C2188811AlT.LIZIZ(sbLIZ6);
                            }
                        }
                    }
                }
                Iterator<InterfaceC2100608Ku> it8 = listLLIIII2.iterator();
                while (it8.hasNext()) {
                    try {
                        it8.next().LIZ(c2100308Kr);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MainLoopMonitor@c4ad.finalizeSession$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MainLoopMonitor@c4ad.finalizeSession$1");
            }
        });
    }
}
