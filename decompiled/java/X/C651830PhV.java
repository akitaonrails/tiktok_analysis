package X;

import android.view.View;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.lynx.tasm.LynxView;
import j27.s;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0PhV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651830PhV {
    public static int LIZ;
    public static int LIZIZ;
    public static final ConcurrentHashMap<String, Integer> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, String> LIZLLL = new ConcurrentHashMap<>();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(404));

    public static boolean LJ(int i) {
        return i > 83886080 && i < 100663296;
    }

    public static int LIZ(String str) {
        Integer num;
        C651880Pha c651880Pha = new C651880Pha(str);
        if (C651840PhW.LIZ(str)) {
            ConcurrentHashMap<String, Integer> concurrentHashMap = LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c651880Pha.LIZIZ());
            sbLIZ.append(c651880Pha.LIZ());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Integer numValueOf = concurrentHashMap.get(strLIZIZ);
            if (numValueOf == null) {
                int i = LIZIZ + 1;
                LIZIZ = i;
                numValueOf = Integer.valueOf(i + 117440512);
                Integer numPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZIZ, numValueOf);
                if (numPutIfAbsent != null) {
                    numValueOf = numPutIfAbsent;
                }
            }
            num = numValueOf;
            LIZLLL.put(num, str);
        } else {
            ConcurrentHashMap<String, Integer> concurrentHashMap2 = LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c651880Pha.LIZIZ());
            sbLIZ2.append(c651880Pha.LIZ());
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            Integer numValueOf2 = concurrentHashMap2.get(strLIZIZ2);
            if (numValueOf2 == null) {
                int i2 = LIZ + 1;
                LIZ = i2;
                numValueOf2 = Integer.valueOf(i2 + 83886080);
                Integer numPutIfAbsent2 = concurrentHashMap2.putIfAbsent(strLIZIZ2, numValueOf2);
                if (numPutIfAbsent2 != null) {
                    numValueOf2 = numPutIfAbsent2;
                }
            }
            num = numValueOf2;
            LIZLLL.put(num, str);
        }
        if (num != null) {
            return num.intValue();
        }
        return 17;
    }

    public static s LIZLLL(String str) {
        View viewE1;
        LynxView lynxView;
        C1529870puj.LIZ.getClass();
        InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str);
        if (interfaceC1541990qEHLJFF != null) {
            viewE1 = interfaceC1541990qEHLJFF.e1();
        } else {
            viewE1 = null;
        }
        if (!(viewE1 instanceof LynxView) || (lynxView = (LynxView) viewE1) == null) {
            return null;
        }
        return lynxView.getLynxContext();
    }

    public static Boolean LJFF(String str) {
        if (Intrinsics.LJFF(C649470Pdh.LJIIIZ(str, "card_auto_play_manager"), "1")) {
            return Boolean.TRUE;
        }
        return null;
    }

    public static boolean LJI(Integer num) {
        if (num == null || num.intValue() <= 117440512 || num.intValue() >= 134217728) {
            return false;
        }
        return true;
    }

    public static List LIZIZ(n nVar, String str) throws Exception {
        boolean z;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJLIIIL(str).toString(), new String[]{"/"}, 0, 6);
        ArrayList<String> arrayList = new ArrayList();
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (true) {
            boolean z2 = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((String) next).length() <= 0) {
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            String strLIZIZ = "";
            try {
                int i = 0;
                k kVar = nVar;
                for (String str2 : arrayList) {
                    int i2 = i + 1;
                    if (strLIZIZ.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        strLIZIZ = str2;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append('/');
                        sbLIZ.append(str2);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (kVar instanceof n) {
                        k kVarLJJIIZ = ((n) kVar).LJJIIZ(str2);
                        if (kVarLJJIIZ != null && !(kVarLJJIIZ instanceof m)) {
                            if (kVarLJJIIZ instanceof h) {
                                return LJII((h) kVarLJJIIZ, strLIZIZ);
                            }
                            if (i != arrayList.size() - 1) {
                                i = i2;
                                kVar = kVarLJJIIZ;
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Path '");
                                sbLIZ2.append(str);
                                sbLIZ2.append("' does not point to a JsonArray, found ");
                                sbLIZ2.append(kVarLJJIIZ.getClass().getSimpleName());
                                sbLIZ2.append(" instead");
                                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                            }
                        } else {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Path not found: key '");
                            sbLIZ3.append(str2);
                            sbLIZ3.append("' does not exist at path '");
                            sbLIZ3.append(strLIZIZ);
                            sbLIZ3.append('\'');
                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Cannot traverse path at '");
                        sbLIZ4.append(strLIZIZ);
                        sbLIZ4.append("': current node is not a JsonObject but ");
                        sbLIZ4.append(kVar.getClass().getSimpleName());
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("No JsonArray found along the path '");
                sbLIZ5.append(str);
                sbLIZ5.append('\'');
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ5));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!(e instanceof IllegalStateException) && !(e instanceof IllegalArgumentException)) {
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Unexpected error while parsing aweme list at path '");
                    sbLIZ6.append("");
                    sbLIZ6.append("': ");
                    sbLIZ6.append(e.getMessage());
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ6), e);
                }
                throw e;
            }
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("Invalid path: '");
        sbLIZ7.append(str);
        sbLIZ7.append("' results in no valid segments");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ7));
    }

    public static List LJII(h hVar, String str) {
        try {
            if (hVar.size() == 0) {
                return C13BV.INSTANCE;
            }
            Type type = new TypeToken<ArrayList<Map<?, ?>>>() { // from class: X.0Phb
            }.getType();
            C1227904rF.LIZ.getClass();
            return (ArrayList) C1227904rF.LIZLLL().LIZLLL(hVar, type);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot parse JsonArray at path '");
            sbLIZ.append(str);
            sbLIZ.append("' to List<Map>: ");
            sbLIZ.append(e.getMessage());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static String LIZJ(String str, String str2, int i) {
        Pair pair;
        if ((i & 4) != 0) {
            str2 = "_";
        }
        String str3 = "";
        if (!a0.LJJJIL(str)) {
            try {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LJ.getValue();
                Object objPutIfAbsent = concurrentHashMap.get(str);
                if (objPutIfAbsent == null) {
                    if (u.LJJIIJZLJL(str, "https://", false)) {
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, 0, 6);
                        if (listLJJLIIIJILLIZJL.size() >= 2) {
                            pair = new Pair(listLJJLIIIJILLIZJL.get(listLJJLIIIJILLIZJL.size() - 3), listLJJLIIIJILLIZJL.get(listLJJLIIIJILLIZJL.size() - 2));
                        } else {
                            pair = new Pair("", "");
                        }
                    } else {
                        C651880Pha c651880Pha = new C651880Pha(str);
                        pair = new Pair(c651880Pha.LIZIZ(), c651880Pha.LIZ());
                    }
                    String str4 = (String) pair.getFirst();
                    String str5 = (String) pair.getSecond();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str4);
                    sbLIZ.append(str2);
                    sbLIZ.append(str5);
                    C651910Phd c651910Phd = new C651910Phd(C2188811AlT.LIZIZ(sbLIZ), str5);
                    objPutIfAbsent = concurrentHashMap.putIfAbsent(str, c651910Phd);
                    if (objPutIfAbsent == null) {
                        objPutIfAbsent = c651910Phd;
                    }
                }
                str3 = ((C651910Phd) objPutIfAbsent).LIZ;
                return str3;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return str3;
    }

    public static void LJIIIIZZ(String str, n nVar, List list) throws Exception {
        String str2;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(a0.LJLIIIL(str).toString(), new String[]{"/"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            String strLIZIZ = "";
            try {
                int size = arrayList.size() - 1;
                for (int i = 0; i < size; i++) {
                    String str3 = (String) arrayList.get(i);
                    if (strLIZIZ.length() == 0) {
                        strLIZIZ = str3;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append('/');
                        sbLIZ.append(str3);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    k kVarLJJIIZ = nVar.LJJIIZ(str3);
                    if (kVarLJJIIZ != null && !(kVarLJJIIZ instanceof m)) {
                        if (kVarLJJIIZ instanceof n) {
                            nVar = (n) kVarLJJIIZ;
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Cannot traverse path at '");
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append("': expected JsonObject but found ");
                            sbLIZ2.append(kVarLJJIIZ.getClass().getSimpleName());
                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Path not found: key '");
                        sbLIZ3.append(str3);
                        sbLIZ3.append("' does not exist at path '");
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append("'. Set createIfNotExists=true to create missing nodes.");
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                }
                String str4 = (String) C13LP.LJJLIIIJJI(arrayList);
                if (strLIZIZ.length() == 0) {
                    str2 = str4;
                } else {
                    str2 = strLIZIZ + '/' + str4;
                }
                LJIIIZ(str4, str2, nVar, list);
                list.size();
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!(e instanceof IllegalStateException) && !(e instanceof IllegalArgumentException)) {
                    throw new IllegalStateException("Unexpected error while setting aweme list at path '': " + e.getMessage(), e);
                }
                throw e;
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Invalid path: '");
        sbLIZ4.append(str);
        sbLIZ4.append("' results in no valid segments");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ4));
    }

    public static void LJIIIZ(String str, String str2, n nVar, List list) {
        k kVarLJJIIZ = nVar.LJJIIZ(str);
        if (kVarLJJIIZ != null && !(kVarLJJIIZ instanceof m)) {
            if (kVarLJJIIZ instanceof h) {
                C1227904rF.LIZ.getClass();
                nVar.LJJIFFI(str, GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), list));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Replaced existing JsonArray at path: ");
                sbLIZ.append(str2);
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Cannot set array at path '");
            sbLIZ2.append(str2);
            sbLIZ2.append("': existing node is ");
            sbLIZ2.append(kVarLJJIIZ.getClass().getSimpleName());
            sbLIZ2.append(", not JsonArray");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Target path '");
        sbLIZ3.append(str2);
        sbLIZ3.append("' does not exist. ");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
