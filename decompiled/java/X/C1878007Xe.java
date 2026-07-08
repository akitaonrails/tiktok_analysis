package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07Xe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1878007Xe extends AbstractC1878107Xf {
    public static final C1878007Xe LIZ = new C1878007Xe();

    @Override // X.InterfaceC1878707Xl
    public final String getName() {
        return "applog_event_happen";
    }

    @Override // X.AbstractC1878107Xf
    public final List<EnumC1980607pM> LIZJ() {
        return Collections.singletonList(EnumC1980607pM.EQUAL);
    }

    @Override // X.AbstractC1878107Xf
    public final boolean LIZIZ(EnumC1980607pM enumC1980607pM, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        for (Pair pair : (ArrayList) C07UJ.LIZ(str)) {
            boolean z = false;
            for (C07UL c07ul : (ArrayList) C07UJ.LIZIZ) {
                if (Intrinsics.LJFF(pair.getFirst(), c07ul.LIZ)) {
                    if (C123100dR.LIZ((String) pair.getSecond())) {
                        Iterator it2 = a0.LJJLIIIJILLIZJL((CharSequence) pair.getSecond(), new String[]{"&"}, 0, 6).iterator();
                        boolean z2 = true;
                        while (true) {
                            if (it2.hasNext()) {
                                String str2 = (String) it2.next();
                                String str3 = "";
                                if (a0.LJJIIZI(str2, ">=", false)) {
                                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{">="}, 0, 6);
                                    Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL);
                                    if (objLJJJLZIJ == null) {
                                        objLJJJLZIJ = "";
                                    }
                                    String str4 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL);
                                    String str5 = str3;
                                    if (str4 != null) {
                                        str5 = str4;
                                    }
                                    Map<String, String> map = c07ul.LIZIZ;
                                    if (map == null) {
                                        continue;
                                    } else if (map.containsKey(objLJJJLZIJ)) {
                                        try {
                                            String str6 = c07ul.LIZIZ.get(objLJJJLZIJ);
                                            if (str6 != null) {
                                                i = CastIntegerProtector.parseInt(str6);
                                            } else {
                                                i = 0;
                                            }
                                            if (i >= CastIntegerProtector.parseInt(str5)) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append(pair);
                                                sbLIZ.append(' ');
                                                sbLIZ.append(str2);
                                                sbLIZ.append(" param correct, passed");
                                                C2188811AlT.LIZIZ(sbLIZ);
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                    }
                                } else if (a0.LJJIIZI(str2, "<=", false)) {
                                    List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(str2, new String[]{"<="}, 0, 6);
                                    Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL2);
                                    if (objLJJJLZIJ2 == null) {
                                        objLJJJLZIJ2 = "";
                                    }
                                    String str7 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL2);
                                    String str8 = str3;
                                    if (str7 != null) {
                                        str8 = str7;
                                    }
                                    Map<String, String> map2 = c07ul.LIZIZ;
                                    if (map2 == null) {
                                        continue;
                                    } else if (map2.containsKey(objLJJJLZIJ2)) {
                                        try {
                                            String str9 = c07ul.LIZIZ.get(objLJJJLZIJ2);
                                            if (str9 != null) {
                                                i2 = CastIntegerProtector.parseInt(str9);
                                            } else {
                                                i2 = 0;
                                            }
                                            if (i2 <= CastIntegerProtector.parseInt(str8)) {
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append(pair);
                                                sbLIZ2.append(' ');
                                                sbLIZ2.append(str2);
                                                sbLIZ2.append(" param correct, passed");
                                                C2188811AlT.LIZIZ(sbLIZ2);
                                            }
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                        }
                                    }
                                } else if (a0.LJJIIZI(str2, ">", false)) {
                                    List listLJJLIIIJILLIZJL3 = a0.LJJLIIIJILLIZJL(str2, new String[]{">"}, 0, 6);
                                    Object objLJJJLZIJ3 = C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL3);
                                    if (objLJJJLZIJ3 == null) {
                                        objLJJJLZIJ3 = "";
                                    }
                                    String str10 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL3);
                                    String str11 = str3;
                                    if (str10 != null) {
                                        str11 = str10;
                                    }
                                    Map<String, String> map3 = c07ul.LIZIZ;
                                    if (map3 == null) {
                                        continue;
                                    } else if (map3.containsKey(objLJJJLZIJ3)) {
                                        try {
                                            String str12 = c07ul.LIZIZ.get(objLJJJLZIJ3);
                                            if (str12 != null) {
                                                i3 = CastIntegerProtector.parseInt(str12);
                                            } else {
                                                i3 = 0;
                                            }
                                            if (i3 > CastIntegerProtector.parseInt(str11)) {
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append(pair);
                                                sbLIZ3.append(' ');
                                                sbLIZ3.append(str2);
                                                sbLIZ3.append(" param correct, passed");
                                                C2188811AlT.LIZIZ(sbLIZ3);
                                            }
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                        }
                                    }
                                } else if (a0.LJJIIZI(str2, "<", false)) {
                                    List listLJJLIIIJILLIZJL4 = a0.LJJLIIIJILLIZJL(str2, new String[]{"<"}, 0, 6);
                                    Object objLJJJLZIJ4 = C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL4);
                                    if (objLJJJLZIJ4 == null) {
                                        objLJJJLZIJ4 = "";
                                    }
                                    String str13 = (String) C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL4);
                                    String str14 = str3;
                                    if (str13 != null) {
                                        str14 = str13;
                                    }
                                    Map<String, String> map4 = c07ul.LIZIZ;
                                    if (map4 == null) {
                                        continue;
                                    } else if (map4.containsKey(objLJJJLZIJ4)) {
                                        try {
                                            String str15 = c07ul.LIZIZ.get(objLJJJLZIJ4);
                                            if (str15 != null) {
                                                i4 = CastIntegerProtector.parseInt(str15);
                                            } else {
                                                i4 = 0;
                                            }
                                            if (i4 < CastIntegerProtector.parseInt(str14)) {
                                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                                sbLIZ4.append(pair);
                                                sbLIZ4.append(' ');
                                                sbLIZ4.append(str2);
                                                sbLIZ4.append(" param correct, passed");
                                                C2188811AlT.LIZIZ(sbLIZ4);
                                            }
                                        } catch (Throwable th4) {
                                            TryCatchGuardChecker.doCheck(th4);
                                        }
                                    }
                                } else if (a0.LJJIIZI(str2, "==", false)) {
                                    List listLJJLIIIJILLIZJL5 = a0.LJJLIIIJILLIZJL(str2, new String[]{"=="}, 0, 6);
                                    Object objLJJJLZIJ5 = C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL5);
                                    if (objLJJJLZIJ5 == null) {
                                        objLJJJLZIJ5 = "";
                                    }
                                    Object objLJJJLZIJ6 = C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL5);
                                    Object obj = str3;
                                    if (objLJJJLZIJ6 != null) {
                                        obj = objLJJJLZIJ6;
                                    }
                                    Map<String, String> map5 = c07ul.LIZIZ;
                                    if (map5 == null) {
                                        continue;
                                    } else {
                                        if (!map5.containsKey(objLJJJLZIJ5) || !Intrinsics.LJFF(obj, c07ul.LIZIZ.get(objLJJJLZIJ5))) {
                                            break;
                                        }
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append(pair);
                                        sbLIZ5.append(' ');
                                        sbLIZ5.append(str2);
                                        sbLIZ5.append(" param correct, passed");
                                        C2188811AlT.LIZIZ(sbLIZ5);
                                    }
                                } else if (a0.LJJIIZI(str2, "!=", false)) {
                                    List listLJJLIIIJILLIZJL6 = a0.LJJLIIIJILLIZJL(str2, new String[]{"!="}, 0, 6);
                                    Object objLJJJLZIJ7 = C13LP.LJJJLZIJ(0, listLJJLIIIJILLIZJL6);
                                    if (objLJJJLZIJ7 == null) {
                                        objLJJJLZIJ7 = "";
                                    }
                                    Object objLJJJLZIJ8 = C13LP.LJJJLZIJ(1, listLJJLIIIJILLIZJL6);
                                    Object obj2 = str3;
                                    if (objLJJJLZIJ8 != null) {
                                        obj2 = objLJJJLZIJ8;
                                    }
                                    Map<String, String> map6 = c07ul.LIZIZ;
                                    if (map6 == null) {
                                        continue;
                                    } else {
                                        if (!map6.containsKey(objLJJJLZIJ7) || Intrinsics.LJFF(obj2, c07ul.LIZIZ.get(objLJJJLZIJ7))) {
                                            break;
                                        }
                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                        sbLIZ6.append(pair);
                                        sbLIZ6.append(' ');
                                        sbLIZ6.append(str2);
                                        sbLIZ6.append(" param correct, passed");
                                        C2188811AlT.LIZIZ(sbLIZ6);
                                    }
                                } else {
                                    z2 = false;
                                }
                            } else if (z2) {
                            }
                        }
                    }
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
