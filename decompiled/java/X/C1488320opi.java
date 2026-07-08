package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0opi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488320opi {
    public final C1488350opl LIZ;
    public final Map<String, Object> LIZIZ;
    public final InterfaceC1488400opq LIZJ;
    public int LIZLLL;
    public final C1488340opk<Object> LJ = new C1488340opk<>();

    public final void LIZIZ() {
        List<Object> listSubList;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        boolean zIsEmpty = listSubList.isEmpty();
        Double dValueOf = Double.valueOf(Double.NaN);
        if (!zIsEmpty) {
            try {
                dValueOf = Double.valueOf(Math.abs(C1488310oph.LJIJ(listSubList.get(0))));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        listSubList.clear();
        this.LJ.LIZ.add(dValueOf);
    }

    public final void LIZJ() {
        List<Object> listSubList;
        Object obj;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        RandomAccess randomAccess = null;
        if (!listSubList.isEmpty() && (obj = ListProtector.get(listSubList, 0)) != null) {
            List<Object> listSubList2 = listSubList.subList(1, listSubList.size());
            ArrayList arrayList2 = new ArrayList();
            if (obj instanceof List) {
                arrayList2.addAll((Collection) obj);
            } else if (obj instanceof Object[]) {
                arrayList2.addAll(Arrays.asList((Object[]) obj));
            }
            arrayList2.addAll(listSubList2);
            randomAccess = arrayList2;
        }
        listSubList.clear();
        this.LJ.LIZ.add((E) randomAccess);
    }

    public final void LIZLLL() {
        List<Object> listSubList;
        Object objLIZIZ;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        if (listSubList.isEmpty()) {
            objLIZIZ = null;
        } else {
            objLIZIZ = ListProtector.get(listSubList, 0);
            if (objLIZIZ instanceof String) {
                String strTrim = ((String) objLIZIZ).trim();
                if (strTrim.length() == 9 && strTrim.charAt(0) == '#') {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    String strSubstring = strTrim.substring(7, 9);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append('#');
                    sbLIZ2.append(strSubstring);
                    sbLIZ.append(C2188811AlT.LIZIZ(sbLIZ2));
                    sbLIZ.append(strTrim.substring(1, 7));
                    objLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        }
        listSubList.clear();
        this.LJ.LIZ.add(objLIZIZ);
    }

    public final void LJ() {
        List<Object> listSubList;
        String str;
        List listAsList;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        boolean z = false;
        if (listSubList.size() == 3) {
            Object obj = ListProtector.get(listSubList, 1);
            if ((obj instanceof String) && (str = (String) obj) != null) {
                Object obj2 = ListProtector.get(listSubList, 2);
                Object obj3 = ListProtector.get(listSubList, 0);
                if (obj3 instanceof List) {
                    listAsList = (List) obj3;
                } else if (obj3 instanceof Object[]) {
                    listAsList = Arrays.asList((Object[]) obj3);
                }
                if (listAsList != null) {
                    if (listAsList.isEmpty() || listAsList.isEmpty()) {
                        z = true;
                    } else {
                        Iterator it2 = listAsList.iterator();
                        while (it2.hasNext()) {
                            if (!C1903107cr.LIZ(C1903107cr.LIZIZ(it2.next(), str), obj2)) {
                                break;
                            }
                        }
                        z = true;
                    }
                }
            }
        }
        listSubList.clear();
        this.LJ.LIZ.add(Boolean.valueOf(z));
    }

    public final void LJFF() {
        List<Object> listSubList;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        RandomAccess randomAccess = null;
        if (!listSubList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = listSubList.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = ListProtector.get(listSubList, i2);
                if (obj instanceof List) {
                    arrayList2.addAll((Collection) obj);
                } else if (obj instanceof Object[]) {
                    arrayList2.addAll(Arrays.asList((Object[]) obj));
                } else if (obj != null) {
                    arrayList2.add(obj);
                }
                z = true;
            }
            if (z) {
                randomAccess = arrayList2;
            }
        }
        listSubList.clear();
        this.LJ.LIZ.add((E) randomAccess);
    }

    public final void LJI() {
        List<Object> listSubList;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        boolean zLJJIIZI = false;
        if (listSubList.size() == 2) {
            Object obj = ListProtector.get(listSubList, 0);
            Object obj2 = ListProtector.get(listSubList, 1);
            if (obj instanceof List) {
                Iterable iterable = (Iterable) obj;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        if (C1903107cr.LIZ(it2.next(), obj2)) {
                            zLJJIIZI = true;
                            break;
                        }
                    }
                }
            } else if (obj instanceof Object[]) {
                for (Object obj3 : (Object[]) obj) {
                    if (C1903107cr.LIZ(obj3, obj2)) {
                        zLJJIIZI = true;
                        break;
                    }
                }
            } else if (obj instanceof Map) {
                zLJJIIZI = ((Map) obj).containsKey(obj2);
            } else if (obj instanceof String) {
                zLJJIIZI = a0.LJJIIZI((CharSequence) obj, String.valueOf(obj2), false);
            }
        }
        listSubList.clear();
        this.LJ.LIZ.add(Boolean.valueOf(zLJJIIZI));
    }

    public final void LJII() {
        List<Object> listSubList;
        Object c098200Yq;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, listSubList);
        if (objLJJJLZIJ == null) {
            c098200Yq = "null";
        } else {
            try {
                c098200Yq = GsonProtectorUtils.toJson((Gson) C1488360opm.LIZ.getValue(), objLJJJLZIJ);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) {
                c098200Yq = "";
            }
        }
        listSubList.clear();
        this.LJ.LIZ.add(c098200Yq);
    }

    public final void LJIIIIZZ() {
        List<Object> listSubList;
        Object obj;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        RandomAccess randomAccess = null;
        if (!listSubList.isEmpty() && (obj = ListProtector.get(listSubList, 0)) != null) {
            Set setLLIIJI = C13LP.LLIIJI(listSubList.subList(1, listSubList.size()));
            ArrayList arrayList2 = new ArrayList();
            if (obj instanceof List) {
                arrayList2.addAll((Collection) obj);
            } else if (obj instanceof Object[]) {
                arrayList2.addAll(Arrays.asList((Object[]) obj));
            }
            arrayList2.removeAll(setLLIIJI);
            randomAccess = arrayList2;
        }
        listSubList.clear();
        this.LJ.LIZ.add((E) randomAccess);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            r5 = this;
            X.0opl r0 = r5.LIZ
            X.0os1 r2 = r0.LIZ
            int r1 = r5.LIZLLL
            int r0 = r1 + 1
            r5.LIZLLL = r0
            byte r4 = r2.LIZIZ(r1)
            X.0opk<java.lang.Object> r3 = r5.LJ
            if (r4 > 0) goto L51
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L17:
            int r1 = r4.size()
            r0 = 3
            if (r1 != r0) goto L4e
            r2 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            java.lang.String r3 = X.C1904607d6.LIZ(r0)
            r0 = 1
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r0)
            java.lang.String r1 = X.C1904607d6.LIZ(r0)
            r0 = 2
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r0)
            java.lang.String r0 = X.C1904607d6.LIZ(r0)
            if (r3 == 0) goto L4e
            if (r1 == 0) goto L43
            if (r0 == 0) goto L43
            java.lang.String r3 = kotlin.text.u.LJJIFFI(r3, r1, r0, r2)
        L43:
            r4.clear()
            X.0opk<java.lang.Object> r0 = r5.LJ
            java.util.ArrayList<E> r0 = r0.LIZ
            r0.add(r3)
            return
        L4e:
            java.lang.String r3 = ""
            goto L43
        L51:
            java.util.ArrayList<E> r0 = r3.LIZ
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L17
        L5f:
            java.util.ArrayList<E> r0 = r3.LIZ
            int r0 = r0.size()
            if (r4 <= r0) goto L6f
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.ArrayList<E> r0 = r3.LIZ
            r4.<init>(r0)
            goto L17
        L6f:
            java.util.ArrayList<E> r2 = r3.LIZ
            int r1 = r2.size()
            int r1 = r1 - r4
            java.util.ArrayList<E> r0 = r3.LIZ
            int r0 = r0.size()
            java.util.List r4 = r2.subList(r1, r0)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1488320opi.LJIIIZ():void");
    }

    public final void LJIIJ() {
        List<Object> listSubList;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        boolean zIsEmpty = listSubList.isEmpty();
        Object objValueOf = Double.valueOf(Double.NaN);
        if (!zIsEmpty) {
            try {
                objValueOf = Long.valueOf(Math.round(C1488310oph.LJIJ(listSubList.get(0))));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        listSubList.clear();
        this.LJ.LIZ.add(objValueOf);
    }

    public final void LJIIJJI() {
        List<Object> listSubList;
        String str;
        List listAsList;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        boolean z = false;
        if (listSubList.size() == 3) {
            Object obj = ListProtector.get(listSubList, 1);
            if ((obj instanceof String) && (str = (String) obj) != null) {
                Object obj2 = ListProtector.get(listSubList, 2);
                Object obj3 = ListProtector.get(listSubList, 0);
                if (obj3 instanceof List) {
                    listAsList = (List) obj3;
                } else if (obj3 instanceof Object[]) {
                    listAsList = Arrays.asList((Object[]) obj3);
                }
                if (listAsList != null && !listAsList.isEmpty()) {
                    Iterator it2 = listAsList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (C1903107cr.LIZ(C1903107cr.LIZIZ(it2.next(), str), obj2)) {
                            z = true;
                            break;
                        }
                    }
                }
            }
        }
        listSubList.clear();
        this.LJ.LIZ.add(Boolean.valueOf(z));
    }

    public final void LJIIL() {
        List<Object> listSubList;
        List listSingletonList;
        String strLIZ;
        String strLIZ2;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        if (listSubList.size() < 2 || (strLIZ = C1904607d6.LIZ(ListProtector.get(listSubList, 0))) == null || (strLIZ2 = C1904607d6.LIZ(ListProtector.get(listSubList, 1))) == null || strLIZ2.length() == 0) {
            listSingletonList = null;
        } else {
            int iLJJJ = a0.LJJJ(strLIZ, strLIZ2, 0, false, 6);
            listSingletonList = iLJJJ == -1 ? Collections.singletonList(strLIZ) : C1697810uHb.LJIIJJI(strLIZ.substring(0, iLJJJ), strLIZ.substring(iLJJJ + strLIZ2.length()));
        }
        listSubList.clear();
        this.LJ.LIZ.add(listSingletonList);
    }

    public final void LJIILIIL() {
        List<Object> listSubList;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, listSubList);
        String lowerCase = objLJJJLZIJ instanceof String ? ((String) objLJJJLZIJ).toLowerCase(Locale.ROOT) : "";
        listSubList.clear();
        this.LJ.LIZ.add(lowerCase);
    }

    public final void LJIILJJIL() {
        List<Object> listSubList;
        String strLIZ;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, listSubList);
        if (objLJJJLZIJ == null) {
            strLIZ = "null";
        } else {
            strLIZ = C1904607d6.LIZ(objLJJJLZIJ);
            if (strLIZ == null) {
                strLIZ = "";
            }
        }
        listSubList.clear();
        this.LJ.LIZ.add(strLIZ);
    }

    public final void LJIILL() {
        List<Object> listSubList;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, listSubList);
        String upperCase = objLJJJLZIJ instanceof String ? ((String) objLJJJLZIJ).toUpperCase(Locale.ROOT) : "";
        listSubList.clear();
        this.LJ.LIZ.add(upperCase);
    }

    public final void LJIILLIIL() {
        List<Object> listSubList;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        boolean zIsEmpty = listSubList.isEmpty();
        Object objValueOf = Double.valueOf(Double.NaN);
        if (!zIsEmpty) {
            try {
                objValueOf = Long.valueOf((long) C1488310oph.LJIJ(listSubList.get(0)));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        listSubList.clear();
        this.LJ.LIZ.add(objValueOf);
    }

    public final void LJIIZILJ() {
        List<Object> listSubList;
        String string;
        int iValueOf;
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        if (listSubList.size() != 2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("versionCompare needs two params but got ");
            sbLIZ.append(listSubList.size());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        String strLIZ = C1904607d6.LIZ(ListProtector.get(listSubList, 0));
        String string2 = null;
        if (strLIZ != null) {
            StringBuilder sb = new StringBuilder();
            int length = strLIZ.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = strLIZ.charAt(i2);
                if (!C1244080iTm.LJ(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
        } else {
            string = null;
        }
        String strLIZ2 = C1904607d6.LIZ(ListProtector.get(listSubList, 1));
        if (strLIZ2 != null) {
            StringBuilder sb2 = new StringBuilder();
            int length2 = strLIZ2.length();
            for (int i3 = 0; i3 < length2; i3++) {
                char cCharAt2 = strLIZ2.charAt(i3);
                if (!C1244080iTm.LJ(cCharAt2)) {
                    sb2.append(cCharAt2);
                }
            }
            string2 = sb2.toString();
        }
        if (string == null || a0.LJJJIL(string) || string2 == null || a0.LJJJIL(string2)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("params is null Or blank,params:");
            sbLIZ2.append(string);
            sbLIZ2.append(',');
            sbLIZ2.append(string2);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{e3.d}, 0, 6);
        List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(string2, new String[]{e3.d}, 0, 6);
        int iMax = Math.max(listLJJLIIIJILLIZJL.size(), listLJJLIIIJILLIZJL2.size());
        int i4 = 0;
        while (true) {
            if (i4 >= iMax) {
                iValueOf = 0;
                break;
            }
            boolean z = i4 >= 0 && i4 < listLJJLIIIJILLIZJL.size();
            Object obj = CardStruct.IStatusCode.DEFAULT;
            String str = (String) (z ? ListProtector.get(listLJJLIIIJILLIZJL, i4) : CardStruct.IStatusCode.DEFAULT);
            Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(str);
            float fFloatValue = fLJIIIIZZ != null ? fLJIIIIZZ.floatValue() : C1903107cr.LIZJ(str, string, string2);
            if (i4 >= 0 && i4 < listLJJLIIIJILLIZJL2.size()) {
                obj = ListProtector.get(listLJJLIIIJILLIZJL2, i4);
            }
            String str2 = (String) obj;
            Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(str2);
            float fFloatValue2 = fLJIIIIZZ2 != null ? fLJIIIIZZ2.floatValue() : C1903107cr.LIZJ(str2, string, string2);
            if (fFloatValue != fFloatValue2) {
                iValueOf = Integer.valueOf(Float.compare(fFloatValue, fFloatValue2));
                break;
            }
            i4++;
        }
        listSubList.clear();
        this.LJ.LIZ.add(iValueOf);
    }

    public final int LJIJJ() {
        C1489750os1 c1489750os1 = this.LIZ.LIZ;
        int i = this.LIZLLL;
        this.LIZLLL = i + 1;
        byte bLIZIZ = c1489750os1.LIZIZ(i);
        C1489750os1 c1489750os12 = this.LIZ.LIZ;
        int i2 = this.LIZLLL;
        this.LIZLLL = i2 + 1;
        return (bLIZIZ << 8) | (c1489750os12.LIZIZ(i2) & 255);
    }

    public final void LIZ(boolean z) {
        Object obj;
        List<Object> listSubList;
        if (z) {
            obj = ListProtector.get(this.LIZ.LIZIZ, LJIJJ());
        } else {
            C1488350opl c1488350opl = this.LIZ;
            List<Object> list = c1488350opl.LIZIZ;
            C1489750os1 c1489750os1 = c1488350opl.LIZ;
            int i = this.LIZLLL;
            this.LIZLLL = i + 1;
            obj = ListProtector.get(list, c1489750os1.LIZIZ(i));
        }
        InterfaceC332330D1b interfaceC332330D1b = (InterfaceC332330D1b) obj;
        C1489750os1 c1489750os12 = this.LIZ.LIZ;
        int i2 = this.LIZLLL;
        this.LIZLLL = i2 + 1;
        byte bLIZIZ = c1489750os12.LIZIZ(i2);
        C1488340opk<Object> c1488340opk = this.LJ;
        if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
            listSubList = new ArrayList<>();
        } else if (bLIZIZ > c1488340opk.LIZ.size()) {
            listSubList = new ArrayList<>(c1488340opk.LIZ);
        } else {
            ArrayList<Object> arrayList = c1488340opk.LIZ;
            listSubList = arrayList.subList(arrayList.size() - bLIZIZ, c1488340opk.LIZ.size());
        }
        Object objLIZ = interfaceC332330D1b.LIZ(this.LIZJ, listSubList);
        listSubList.clear();
        this.LJ.LIZ.add(objLIZ);
    }

    public final void LJIJ(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        ArrayList<Object> arrayList = this.LJ.LIZ;
        Object obj = ListProtector.get(arrayList, arrayList.size() - 1);
        if (obj != null) {
            if (obj instanceof Map) {
                C1488350opl c1488350opl = this.LIZ;
                List<Object> list = c1488350opl.LIZIZ;
                C1489750os1 c1489750os1 = c1488350opl.LIZ;
                int i2 = this.LIZLLL;
                this.LIZLLL = i2 + 1;
                Object obj2 = ((Map) obj).get(ListProtector.get(list, c1489750os1.LIZIZ(i2)));
                ArrayList<Object> arrayList2 = this.LJ.LIZ;
                ListProtector.set(arrayList2, arrayList2.size() - 1, obj2);
                return;
            }
            if (obj instanceof InterfaceC332330D1b) {
                InterfaceC1488400opq interfaceC1488400opq = this.LIZJ;
                C1488350opl c1488350opl2 = this.LIZ;
                List<Object> list2 = c1488350opl2.LIZIZ;
                C1489750os1 c1489750os12 = c1488350opl2.LIZ;
                int i3 = this.LIZLLL;
                this.LIZLLL = i3 + 1;
                Object objLIZ = ((InterfaceC332330D1b) obj).LIZ(interfaceC1488400opq, Collections.singletonList(ListProtector.get(list2, c1489750os12.LIZIZ(i3))));
                ArrayList<Object> arrayList3 = this.LJ.LIZ;
                ListProtector.set(arrayList3, arrayList3.size() - 1, objLIZ);
                return;
            }
            this.LIZLLL += i;
            ArrayList<Object> arrayList4 = this.LJ.LIZ;
            ListProtector.set(arrayList4, arrayList4.size() - 1, null);
            return;
        }
        this.LIZLLL += i;
    }

    public final void LJIJI(byte b) throws JSONException {
        List<Object> listSubList;
        List<Object> listSubList2;
        List<Object> listSubList3;
        List<Object> listSubList4;
        Map map;
        List<Object> listSubList5;
        String str;
        List<Object> listSubList6;
        List<Object> listSubList7;
        Object objLJJJLZIJ;
        Map map2;
        List<Object> listSubList8;
        List<Object> listSubList9;
        if (b == 0) {
            C1488350opl c1488350opl = this.LIZ;
            List<Object> list = c1488350opl.LIZIZ;
            C1489750os1 c1489750os1 = c1488350opl.LIZ;
            int i = this.LIZLLL;
            this.LIZLLL = i + 1;
            this.LJ.LIZ.add(ListProtector.get(list, c1489750os1.LIZIZ(i)));
            return;
        }
        int i2 = 1;
        if (b == 1) {
            this.LJ.LIZ.add(ListProtector.get(this.LIZ.LIZIZ, LJIJJ()));
            return;
        }
        if (b == 5) {
            this.LJ.LIZ.add(0L);
            return;
        }
        if (b == 2) {
            this.LJ.LIZ.add(Boolean.TRUE);
            return;
        }
        if (b == 3) {
            this.LJ.LIZ.add(Boolean.FALSE);
            return;
        }
        Object objLJ = null;
        if (b == 4) {
            this.LJ.LIZ.add(null);
            return;
        }
        if (b == 13) {
            this.LJ.LIZ.add(this.LIZIZ.get("data"));
            return;
        }
        if (b == 14) {
            this.LJ.LIZ.add(this.LIZIZ.get("item"));
            return;
        }
        if (b == 11) {
            Map<String, Object> map3 = this.LIZIZ;
            C1488350opl c1488350opl2 = this.LIZ;
            List<Object> list2 = c1488350opl2.LIZIZ;
            C1489750os1 c1489750os12 = c1488350opl2.LIZ;
            int i3 = this.LIZLLL;
            this.LIZLLL = i3 + 1;
            this.LJ.LIZ.add(map3.get(ListProtector.get(list2, c1489750os12.LIZIZ(i3))));
            return;
        }
        if (b == 12) {
            this.LJ.LIZ.add(this.LIZIZ.get(ListProtector.get(this.LIZ.LIZIZ, LJIJJ())));
            return;
        }
        int iLIZLLL = 0;
        if (b == 25) {
            LJIJ(false);
            return;
        }
        if (b == 26) {
            LJIJ(true);
            return;
        }
        if (b == 27) {
            LIZ(false);
            return;
        }
        if (b == 28) {
            LIZ(true);
            return;
        }
        if (b == 29) {
            ArrayList<Object> arrayList = this.LJ.LIZ;
            Boolean boolValueOf = Boolean.valueOf(C1903107cr.LJ(ListProtector.get(arrayList, arrayList.size() - 1)));
            ArrayList<Object> arrayList2 = this.LJ.LIZ;
            ListProtector.set(arrayList2, arrayList2.size() - 1, boolValueOf);
            return;
        }
        if (b == 30) {
            C1489750os1 c1489750os13 = this.LIZ.LIZ;
            int i4 = this.LIZLLL;
            this.LIZLLL = i4 + 1;
            byte bLIZIZ = c1489750os13.LIZIZ(i4);
            C1488340opk<Object> c1488340opk = this.LJ;
            if (bLIZIZ <= 0 || c1488340opk.LIZ.isEmpty()) {
                listSubList9 = new ArrayList<>();
            } else if (bLIZIZ > c1488340opk.LIZ.size()) {
                listSubList9 = new ArrayList<>(c1488340opk.LIZ);
            } else {
                ArrayList<Object> arrayList3 = c1488340opk.LIZ;
                listSubList9 = arrayList3.subList(arrayList3.size() - bLIZIZ, c1488340opk.LIZ.size());
            }
            Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(0, listSubList9);
            if (objLJJJLZIJ2 != null) {
                iLIZLLL = C1903107cr.LIZLLL(objLJJJLZIJ2);
            }
            listSubList9.clear();
            this.LJ.LIZ.add(Integer.valueOf(iLIZLLL));
            return;
        }
        if (b == 32) {
            C1489750os1 c1489750os14 = this.LIZ.LIZ;
            int i5 = this.LIZLLL;
            this.LIZLLL = i5 + 1;
            byte bLIZIZ2 = c1489750os14.LIZIZ(i5);
            C1488340opk<Object> c1488340opk2 = this.LJ;
            if (bLIZIZ2 <= 0 || c1488340opk2.LIZ.isEmpty()) {
                listSubList8 = new ArrayList<>();
            } else if (bLIZIZ2 > c1488340opk2.LIZ.size()) {
                listSubList8 = new ArrayList<>(c1488340opk2.LIZ);
            } else {
                ArrayList<Object> arrayList4 = c1488340opk2.LIZ;
                listSubList8 = arrayList4.subList(arrayList4.size() - bLIZIZ2, c1488340opk2.LIZ.size());
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<Object> it2 = listSubList8.iterator();
            while (it2.hasNext()) {
                String strLIZ = C1904607d6.LIZ(it2.next());
                if (strLIZ == null) {
                    strLIZ = "";
                }
                arrayList5.add(strLIZ);
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList5, "", null, null, 0, null, null, 62);
            listSubList8.clear();
            this.LJ.LIZ.add(strLJJLIIIJ);
            return;
        }
        if (b == 31) {
            C1489750os1 c1489750os15 = this.LIZ.LIZ;
            int i6 = this.LIZLLL;
            this.LIZLLL = i6 + 1;
            byte bLIZIZ3 = c1489750os15.LIZIZ(i6);
            C1488340opk<Object> c1488340opk3 = this.LJ;
            if (bLIZIZ3 <= 0 || c1488340opk3.LIZ.isEmpty()) {
                listSubList7 = new ArrayList<>();
            } else if (bLIZIZ3 > c1488340opk3.LIZ.size()) {
                listSubList7 = new ArrayList<>(c1488340opk3.LIZ);
            } else {
                ArrayList<Object> arrayList6 = c1488340opk3.LIZ;
                listSubList7 = arrayList6.subList(arrayList6.size() - bLIZIZ3, c1488340opk3.LIZ.size());
            }
            if (!listSubList7.isEmpty() && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, listSubList7)) != null) {
                int size = listSubList7.size();
                while (true) {
                    if (i2 < size) {
                        Object obj = ListProtector.get(listSubList7, i2);
                        if (obj instanceof String) {
                            if (!(objLJJJLZIJ instanceof Map) || (map2 = (Map) objLJJJLZIJ) == null) {
                                break;
                            }
                            objLJJJLZIJ = map2.get(obj);
                            i2++;
                        } else {
                            if (!(obj instanceof Number)) {
                                break;
                            }
                            int iIntValue = ((Number) obj).intValue();
                            if (objLJJJLZIJ instanceof List) {
                                objLJJJLZIJ = C13LP.LJJJLZIJ(iIntValue, (List) objLJJJLZIJ);
                            } else if (objLJJJLZIJ instanceof Object[]) {
                                objLJJJLZIJ = C13LQ.LJJIIZ(iIntValue, (Object[]) objLJJJLZIJ);
                            } else if (!(objLJJJLZIJ instanceof String)) {
                                break;
                            } else {
                                objLJJJLZIJ = C1904607d6.LIZ(C13LN.LJLLJ(iIntValue, (CharSequence) objLJJJLZIJ));
                            }
                            i2++;
                        }
                    } else {
                        objLJ = objLJJJLZIJ;
                        break;
                    }
                }
            }
            listSubList7.clear();
            this.LJ.LIZ.add(objLJ);
            return;
        }
        if (b == 33) {
            C1489750os1 c1489750os16 = this.LIZ.LIZ;
            int i7 = this.LIZLLL;
            this.LIZLLL = i7 + 1;
            byte bLIZIZ4 = c1489750os16.LIZIZ(i7);
            C1488340opk<Object> c1488340opk4 = this.LJ;
            if (bLIZIZ4 <= 0 || c1488340opk4.LIZ.isEmpty()) {
                listSubList6 = new ArrayList<>();
            } else if (bLIZIZ4 > c1488340opk4.LIZ.size()) {
                listSubList6 = new ArrayList<>(c1488340opk4.LIZ);
            } else {
                ArrayList<Object> arrayList7 = c1488340opk4.LIZ;
                listSubList6 = arrayList7.subList(arrayList7.size() - bLIZIZ4, c1488340opk4.LIZ.size());
            }
            int size2 = listSubList6.size() / 2;
            if (size2 < 1) {
                objLJ = C2097608Jq.LJ();
            } else {
                HashMap map4 = new HashMap();
                while (true) {
                    int i8 = iLIZLLL * 2;
                    Object obj2 = ListProtector.get(listSubList6, i8);
                    if (!(obj2 instanceof String) || obj2 == null) {
                        break;
                    }
                    map4.put(obj2, ListProtector.get(listSubList6, i8 + 1));
                    iLIZLLL++;
                    if (iLIZLLL >= size2) {
                        objLJ = map4;
                        break;
                    }
                }
            }
            listSubList6.clear();
            this.LJ.LIZ.add(objLJ);
            return;
        }
        if (b == 50) {
            C1489750os1 c1489750os17 = this.LIZ.LIZ;
            int i9 = this.LIZLLL;
            this.LIZLLL = i9 + 1;
            byte bLIZIZ5 = c1489750os17.LIZIZ(i9);
            C1488340opk<Object> c1488340opk5 = this.LJ;
            if (bLIZIZ5 <= 0 || c1488340opk5.LIZ.isEmpty()) {
                listSubList5 = new ArrayList<>();
            } else if (bLIZIZ5 > c1488340opk5.LIZ.size()) {
                listSubList5 = new ArrayList<>(c1488340opk5.LIZ);
            } else {
                ArrayList<Object> arrayList8 = c1488340opk5.LIZ;
                listSubList5 = arrayList8.subList(arrayList8.size() - bLIZIZ5, c1488340opk5.LIZ.size());
            }
            Object objLJJJLZIJ3 = C13LP.LJJJLZIJ(0, listSubList5);
            if (!(objLJJJLZIJ3 instanceof String) || (str = (String) objLJJJLZIJ3) == null) {
                str = "{}";
            }
            Map<String, Object> mapLIZJ = C1904607d6.LIZJ(new JSONObject(str));
            listSubList5.clear();
            this.LJ.LIZ.add(mapLIZJ);
            return;
        }
        if (b == 34) {
            C1489750os1 c1489750os18 = this.LIZ.LIZ;
            int i10 = this.LIZLLL;
            this.LIZLLL = i10 + 1;
            byte bLIZIZ6 = c1489750os18.LIZIZ(i10);
            C1488340opk<Object> c1488340opk6 = this.LJ;
            if (bLIZIZ6 <= 0 || c1488340opk6.LIZ.isEmpty()) {
                listSubList4 = new ArrayList<>();
            } else if (bLIZIZ6 > c1488340opk6.LIZ.size()) {
                listSubList4 = new ArrayList<>(c1488340opk6.LIZ);
            } else {
                ArrayList<Object> arrayList9 = c1488340opk6.LIZ;
                listSubList4 = arrayList9.subList(arrayList9.size() - bLIZIZ6, c1488340opk6.LIZ.size());
            }
            HashMap map5 = new HashMap();
            for (Object obj3 : listSubList4) {
                if ((obj3 instanceof Map) && (map = (Map) obj3) != null) {
                    map5.putAll(map);
                }
            }
            listSubList4.clear();
            this.LJ.LIZ.add(map5);
            return;
        }
        if (b == 35) {
            LJIIZILJ();
            return;
        }
        double dLJIJ = Double.NaN;
        if (b == 37) {
            C1489750os1 c1489750os19 = this.LIZ.LIZ;
            int i11 = this.LIZLLL;
            this.LIZLLL = i11 + 1;
            byte bLIZIZ7 = c1489750os19.LIZIZ(i11);
            C1488340opk<Object> c1488340opk7 = this.LJ;
            if (bLIZIZ7 <= 0 || c1488340opk7.LIZ.isEmpty()) {
                listSubList3 = new ArrayList<>();
            } else if (bLIZIZ7 > c1488340opk7.LIZ.size()) {
                listSubList3 = new ArrayList<>(c1488340opk7.LIZ);
            } else {
                ArrayList<Object> arrayList10 = c1488340opk7.LIZ;
                listSubList3 = arrayList10.subList(arrayList10.size() - bLIZIZ7, c1488340opk7.LIZ.size());
            }
            boolean zIsEmpty = listSubList3.isEmpty();
            Double dValueOf = Double.valueOf(Double.NaN);
            if (!zIsEmpty) {
                try {
                    dValueOf = Double.valueOf(Math.floor(C1488310oph.LJIJ(listSubList3.get(0))));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            listSubList3.clear();
            this.LJ.LIZ.add(dValueOf);
            return;
        }
        if (b == 36) {
            C1489750os1 c1489750os110 = this.LIZ.LIZ;
            int i12 = this.LIZLLL;
            this.LIZLLL = i12 + 1;
            byte bLIZIZ8 = c1489750os110.LIZIZ(i12);
            C1488340opk<Object> c1488340opk8 = this.LJ;
            if (bLIZIZ8 <= 0 || c1488340opk8.LIZ.isEmpty()) {
                listSubList2 = new ArrayList<>();
            } else if (bLIZIZ8 > c1488340opk8.LIZ.size()) {
                listSubList2 = new ArrayList<>(c1488340opk8.LIZ);
            } else {
                ArrayList<Object> arrayList11 = c1488340opk8.LIZ;
                listSubList2 = arrayList11.subList(arrayList11.size() - bLIZIZ8, c1488340opk8.LIZ.size());
            }
            boolean zIsEmpty2 = listSubList2.isEmpty();
            Double dValueOf2 = Double.valueOf(Double.NaN);
            if (!zIsEmpty2) {
                try {
                    dValueOf2 = Double.valueOf(Math.ceil(C1488310oph.LJIJ(listSubList2.get(0))));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            listSubList2.clear();
            this.LJ.LIZ.add(dValueOf2);
            return;
        }
        if (b == 38) {
            LJIIJ();
            return;
        }
        if (b == 39) {
            LJIILLIIL();
            return;
        }
        if (b == 40) {
            LIZIZ();
            return;
        }
        if (b == 41) {
            LIZLLL();
            return;
        }
        if (b == 42) {
            LIZJ();
            return;
        }
        if (b == 43) {
            LJFF();
            return;
        }
        if (b == 44) {
            LJI();
            return;
        }
        if (b == 45) {
            LJIILIIL();
            return;
        }
        if (b == 46) {
            LJIILL();
            return;
        }
        if (b == 47) {
            LJIIIZ();
            return;
        }
        if (b == 48) {
            LJIILJJIL();
            return;
        }
        if (b == 51) {
            LJII();
            return;
        }
        if (b == 49) {
            LJIIIIZZ();
            return;
        }
        if (b == 52) {
            LJ();
            return;
        }
        if (b == 53) {
            LJIIJJI();
            return;
        }
        if (b == 54) {
            LJIIL();
            return;
        }
        if (b == 61) {
            ArrayList<Object> arrayList12 = this.LJ.LIZ;
            this.LJ.LIZ.add(C1488310oph.LJIILJJIL(ListProtector.remove(arrayList12, arrayList12.size() - 1)));
            return;
        }
        if (b == 63) {
            ArrayList<Object> arrayList13 = this.LJ.LIZ;
            Object objRemove = ListProtector.remove(arrayList13, arrayList13.size() - 1);
            ArrayList<Object> arrayList14 = this.LJ.LIZ;
            try {
                dLJIJ = C1488310oph.LJIJ(ListProtector.remove(arrayList14, arrayList14.size() - 1)) - C1488310oph.LJIJ(objRemove);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
            this.LJ.LIZ.add(Double.valueOf(dLJIJ));
            return;
        }
        if (b == 62) {
            ArrayList<Object> arrayList15 = this.LJ.LIZ;
            Object objRemove2 = ListProtector.remove(arrayList15, arrayList15.size() - 1);
            ArrayList<Object> arrayList16 = this.LJ.LIZ;
            this.LJ.LIZ.add(C1488310oph.LIZ(ListProtector.remove(arrayList16, arrayList16.size() - 1), objRemove2));
            return;
        }
        if (b == 64) {
            ArrayList<Object> arrayList17 = this.LJ.LIZ;
            Object objRemove3 = ListProtector.remove(arrayList17, arrayList17.size() - 1);
            ArrayList<Object> arrayList18 = this.LJ.LIZ;
            try {
                dLJIJ = C1488310oph.LJIJ(ListProtector.remove(arrayList18, arrayList18.size() - 1)) * C1488310oph.LJIJ(objRemove3);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
            this.LJ.LIZ.add(Double.valueOf(dLJIJ));
            return;
        }
        if (b == 65) {
            ArrayList<Object> arrayList19 = this.LJ.LIZ;
            Object objRemove4 = ListProtector.remove(arrayList19, arrayList19.size() - 1);
            ArrayList<Object> arrayList20 = this.LJ.LIZ;
            this.LJ.LIZ.add(C1488310oph.LIZLLL(ListProtector.remove(arrayList20, arrayList20.size() - 1), objRemove4));
            return;
        }
        if (b == 66) {
            ArrayList<Object> arrayList21 = this.LJ.LIZ;
            Object objRemove5 = ListProtector.remove(arrayList21, arrayList21.size() - 1);
            ArrayList<Object> arrayList22 = this.LJ.LIZ;
            this.LJ.LIZ.add(C1488310oph.LJIILIIL(ListProtector.remove(arrayList22, arrayList22.size() - 1), objRemove5));
            return;
        }
        if (b == 67) {
            ArrayList<Object> arrayList23 = this.LJ.LIZ;
            Object objRemove6 = ListProtector.remove(arrayList23, arrayList23.size() - 1);
            ArrayList<Object> arrayList24 = this.LJ.LIZ;
            this.LJ.LIZ.add(C1488310oph.LJIILL(ListProtector.remove(arrayList24, arrayList24.size() - 1), objRemove6));
            return;
        }
        if (b == 71) {
            ArrayList<Object> arrayList25 = this.LJ.LIZ;
            this.LJ.LIZ.add(Long.valueOf(~C1488310oph.LJIIZILJ(ListProtector.remove(arrayList25, arrayList25.size() - 1))));
            return;
        }
        if (b == 72) {
            ArrayList<Object> arrayList26 = this.LJ.LIZ;
            Object objRemove7 = ListProtector.remove(arrayList26, arrayList26.size() - 1);
            ArrayList<Object> arrayList27 = this.LJ.LIZ;
            this.LJ.LIZ.add(Long.valueOf(C1488310oph.LJIIZILJ(ListProtector.remove(arrayList27, arrayList27.size() - 1)) & C1488310oph.LJIIZILJ(objRemove7)));
            return;
        }
        if (b == 73) {
            ArrayList<Object> arrayList28 = this.LJ.LIZ;
            Object objRemove8 = ListProtector.remove(arrayList28, arrayList28.size() - 1);
            ArrayList<Object> arrayList29 = this.LJ.LIZ;
            this.LJ.LIZ.add(Long.valueOf(C1488310oph.LIZIZ(ListProtector.remove(arrayList29, arrayList29.size() - 1), objRemove8)));
            return;
        }
        if (b == 74) {
            ArrayList<Object> arrayList30 = this.LJ.LIZ;
            Object objRemove9 = ListProtector.remove(arrayList30, arrayList30.size() - 1);
            ArrayList<Object> arrayList31 = this.LJ.LIZ;
            this.LJ.LIZ.add(Long.valueOf(C1488310oph.LIZJ(ListProtector.remove(arrayList31, arrayList31.size() - 1), objRemove9)));
            return;
        }
        if (b == 75) {
            ArrayList<Object> arrayList32 = this.LJ.LIZ;
            this.LJ.LIZ.add(Boolean.valueOf(!C1904607d6.LIZLLL(ListProtector.remove(arrayList32, arrayList32.size() - 1))));
            return;
        }
        if (b == 85) {
            ArrayList<Object> arrayList33 = this.LJ.LIZ;
            Object objRemove10 = ListProtector.remove(arrayList33, arrayList33.size() - 1);
            ArrayList<Object> arrayList34 = this.LJ.LIZ;
            this.LJ.LIZ.add(Boolean.valueOf(C1488310oph.LJIIJJI(ListProtector.remove(arrayList34, arrayList34.size() - 1), objRemove10)));
            return;
        }
        if (b == 86) {
            ArrayList<Object> arrayList35 = this.LJ.LIZ;
            Object objRemove11 = ListProtector.remove(arrayList35, arrayList35.size() - 1);
            ArrayList<Object> arrayList36 = this.LJ.LIZ;
            this.LJ.LIZ.add(Boolean.valueOf(C1488310oph.LJIIL(ListProtector.remove(arrayList36, arrayList36.size() - 1), objRemove11)));
            return;
        }
        if (b == 83) {
            ArrayList<Object> arrayList37 = this.LJ.LIZ;
            Object objRemove12 = ListProtector.remove(arrayList37, arrayList37.size() - 1);
            ArrayList<Object> arrayList38 = this.LJ.LIZ;
            this.LJ.LIZ.add(Boolean.valueOf(C1488310oph.LJII(ListProtector.remove(arrayList38, arrayList38.size() - 1), objRemove12)));
            return;
        }
        if (b == 84) {
            ArrayList<Object> arrayList39 = this.LJ.LIZ;
            Object objRemove13 = ListProtector.remove(arrayList39, arrayList39.size() - 1);
            ArrayList<Object> arrayList40 = this.LJ.LIZ;
            this.LJ.LIZ.add(Boolean.valueOf(C1488310oph.LJIIIIZZ(ListProtector.remove(arrayList40, arrayList40.size() - 1), objRemove13)));
            return;
        }
        if (b == 81) {
            ArrayList<Object> arrayList41 = this.LJ.LIZ;
            Object objRemove14 = ListProtector.remove(arrayList41, arrayList41.size() - 1);
            ArrayList<Object> arrayList42 = this.LJ.LIZ;
            this.LJ.LIZ.add(Boolean.valueOf(C1488310oph.LJI(ListProtector.remove(arrayList42, arrayList42.size() - 1), objRemove14)));
            return;
        }
        if (b == 82) {
            ArrayList<Object> arrayList43 = this.LJ.LIZ;
            Object objRemove15 = ListProtector.remove(arrayList43, arrayList43.size() - 1);
            ArrayList<Object> arrayList44 = this.LJ.LIZ;
            this.LJ.LIZ.add(Boolean.valueOf(!C1488310oph.LJI(ListProtector.remove(arrayList44, arrayList44.size() - 1), objRemove15)));
            return;
        }
        if (b == 91) {
            C1489750os1 c1489750os111 = this.LIZ.LIZ;
            int i13 = this.LIZLLL;
            this.LIZLLL = i13 + 1;
            byte bLIZIZ9 = c1489750os111.LIZIZ(i13);
            C1488340opk<Object> c1488340opk9 = this.LJ;
            if (bLIZIZ9 <= 0 || c1488340opk9.LIZ.isEmpty()) {
                listSubList = new ArrayList<>();
            } else if (bLIZIZ9 > c1488340opk9.LIZ.size()) {
                listSubList = new ArrayList<>(c1488340opk9.LIZ);
            } else {
                ArrayList<Object> arrayList45 = c1488340opk9.LIZ;
                listSubList = arrayList45.subList(arrayList45.size() - bLIZIZ9, c1488340opk9.LIZ.size());
            }
            ArrayList arrayList46 = new ArrayList(listSubList);
            listSubList.clear();
            this.LJ.LIZ.add(arrayList46);
            return;
        }
        if (b == 92) {
            ArrayList<Object> arrayList47 = this.LJ.LIZ;
            Object objRemove16 = ListProtector.remove(arrayList47, arrayList47.size() - 1);
            ArrayList<Object> arrayList48 = this.LJ.LIZ;
            this.LJ.LIZ.add(C1488310oph.LJIIIZ(ListProtector.remove(arrayList48, arrayList48.size() - 1), objRemove16));
            return;
        }
        if (b == 98) {
            this.LIZLLL += LJIJJ();
            return;
        }
        if (b == 96) {
            ArrayList<Object> arrayList49 = this.LJ.LIZ;
            if (C1904607d6.LIZLLL(ListProtector.get(arrayList49, arrayList49.size() - 1))) {
                this.LIZLLL += LJIJJ();
                return;
            } else {
                this.LIZLLL += 2;
                return;
            }
        }
        if (b == 97) {
            ArrayList<Object> arrayList50 = this.LJ.LIZ;
            if (!C1904607d6.LIZLLL(ListProtector.get(arrayList50, arrayList50.size() - 1))) {
                this.LIZLLL += LJIJJ();
                return;
            } else {
                this.LIZLLL += 2;
                return;
            }
        }
        if (b == 99) {
            ArrayList<Object> arrayList51 = this.LJ.LIZ;
            ListProtector.remove(arrayList51, arrayList51.size() - 1);
            return;
        }
        String upperCase = a0.LJJJJJL('0', 2, C19970013Bq.LIZIZ(b)).toUpperCase(Locale.ROOT);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid opcode: ");
        sbLIZ.append((int) b);
        sbLIZ.append(" (0x");
        sbLIZ.append(upperCase);
        sbLIZ.append(')');
        throw new C1488370opn("eval_invalid_opcode", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1488320opi(C1488350opl c1488350opl, Map map, C1488470opx c1488470opx) {
        this.LIZ = c1488350opl;
        this.LIZIZ = map;
        this.LIZJ = c1488470opx;
    }
}
