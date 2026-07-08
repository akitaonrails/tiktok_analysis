package X;

import Y.AComparatorS35S0000000_16;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020820cfg implements InterfaceC1015560cXC {
    public static final ConcurrentHashMap<String, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Map<Integer, Map<Integer, C1020870cfl>>> LIZJ = new ConcurrentHashMap<>();
    public C1015550cXB LIZ;

    @Override // X.InterfaceC1015560cXC
    public final boolean LJII() {
        return true;
    }

    public final Map<Integer, Map<Integer, C1020870cfl>> LJIJJ() {
        String strLJIILIIL;
        Map<Integer, Map<Integer, C1020870cfl>> mapPutIfAbsent;
        C1015550cXB c1015550cXB = this.LIZ;
        if (c1015550cXB == null || (strLJIILIIL = LJIILIIL(c1015550cXB)) == null) {
            return new LinkedHashMap();
        }
        ConcurrentHashMap<String, Map<Integer, Map<Integer, C1020870cfl>>> concurrentHashMap = LIZJ;
        Map<Integer, Map<Integer, C1020870cfl>> concurrentHashMap2 = concurrentHashMap.get(strLJIILIIL);
        if (concurrentHashMap2 == null && (mapPutIfAbsent = concurrentHashMap.putIfAbsent(strLJIILIIL, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
            concurrentHashMap2 = mapPutIfAbsent;
        }
        return concurrentHashMap2;
    }

    public final C1020830cfh LJIL() {
        C1015550cXB c1015550cXB = this.LIZ;
        if (c1015550cXB != null) {
            return c1015550cXB.LLJLLIL;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC1015560cXC
    public final void LIZ() {
        Map<Integer, C1020850cfj> map;
        Collection<C1020850cfj> collectionValues;
        Map<Integer, C1020850cfj> map2;
        Collection<C1020850cfj> collectionValues2;
        LJIL().LIZLLL = false;
        LJJI(LJIIZILJ());
        LJIL().LJII = C2097608Jq.LJ();
        C1020860cfk c1020860cfk = LJIL().LJFF;
        if (c1020860cfk != null && (map2 = c1020860cfk.LIZJ) != null && (collectionValues2 = map2.values()) != null) {
            Iterator<T> it2 = collectionValues2.iterator();
            while (it2.hasNext()) {
                ((C1020850cfj) it2.next()).LJFF = null;
            }
        }
        C1020860cfk c1020860cfkLJIILLIIL = LJIILLIIL();
        if (c1020860cfkLJIILLIIL != null && (map = c1020860cfkLJIILLIIL.LIZJ) != null && (collectionValues = map.values()) != null) {
            Iterator<T> it3 = collectionValues.iterator();
            while (it3.hasNext()) {
                ((C1020850cfj) it3.next()).LJFF = null;
            }
        }
        C1015550cXB c1015550cXB = this.LIZ;
        if (c1015550cXB != null) {
            C08JM.LIZ(c1015550cXB.LLLIIL);
        }
    }

    public final C1020860cfk LJIILLIIL() {
        return LJIL().LJI;
    }

    public final int LJIIZILJ() {
        return LJIL().LIZIZ;
    }

    public final Map<String, Boolean> LJIJ() {
        return LJIL().LJIIL;
    }

    public final Map<Integer, C1020860cfk> LJIJI() {
        return LJIL().LJIILJJIL;
    }

    public final Map<Integer, Long> LJIJJLI() {
        return LJIL().LJIILL;
    }

    public static String LJIILIIL(C1015550cXB c1015550cXB) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1015550cXB.LLILLJJLI.LIZ);
        sbLIZ.append(':');
        sbLIZ.append(c1015550cXB.LL.getID());
        sbLIZ.append(':');
        sbLIZ.append(c1015550cXB.LL.type);
        sbLIZ.append(':');
        sbLIZ.append(c1015550cXB.LL.slotID);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1015560cXC
    public final Map<String, Object> LIZLLL(String str) {
        if (Intrinsics.LJFF("realtime_click", "realtime_click")) {
            return LJIL().LJII;
        }
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1015560cXC
    public final void LJFF(C1015550cXB c1015550cXB) {
        JSONObject jSONObjectLJ;
        JSONObject jSONObject;
        AtomicInteger atomicIntegerPutIfAbsent;
        this.LIZ = c1015550cXB;
        JSONObject ugenData = c1015550cXB.LL.getUgenData();
        JSONObject jSONObjectOptJSONObject = null;
        if (ugenData != null) {
            jSONObjectLJ = C1020890cfn.LJ(ugenData);
        } else {
            jSONObjectLJ = null;
        }
        LJIL().LIZ = jSONObjectLJ;
        C1020900cfo.LIZ.getClass();
        String strLIZ = C1020900cfo.LIZ(c1015550cXB);
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = C1020900cfo.LJFF;
        AtomicInteger atomicInteger = concurrentHashMap.get(strLIZ);
        if (atomicInteger == null && (atomicIntegerPutIfAbsent = concurrentHashMap.putIfAbsent(strLIZ, (atomicInteger = new AtomicInteger(0)))) != null) {
            atomicInteger = atomicIntegerPutIfAbsent;
        }
        atomicInteger.incrementAndGet();
        if (LJIL().LIZ == null) {
            return;
        }
        JSONObject ugenData2 = c1015550cXB.LL.getUgenData();
        if (ugenData2 == null || (jSONObject = ugenData2.optJSONObject("carouselUpdateInfo")) == null) {
            jSONObject = new JSONObject();
        }
        C1020860cfk c1020860cfkLJIILJJIL = LJIILJJIL(c1015550cXB, jSONObject, LJIIZILJ(), false, false);
        if (c1020860cfkLJIILJJIL == null) {
            return;
        }
        LJIJI().put(Integer.valueOf(c1020860cfkLJIILJJIL.LIZ.LIZ), c1020860cfkLJIILJJIL);
        LJJIII(c1020860cfkLJIILJJIL);
        LJIL().LJI = null;
        C1020640cfO.LIZ(c1015550cXB, c1020860cfkLJIILJJIL.LIZ.LIZIZ);
        JSONObject ugenData3 = LJIL().LIZ;
        if (ugenData3 != null || (ugenData3 = c1015550cXB.LL.getUgenData()) != null) {
            JSONObject ugenData4 = c1015550cXB.LL.getUgenData();
            if (ugenData4 != null) {
                jSONObjectOptJSONObject = ugenData4.optJSONObject("carouselUpdateInfo");
            }
            C1020900cfo.LIZLLL(c1015550cXB, ugenData3, jSONObjectOptJSONObject, LJIIZILJ());
        }
    }

    @Override // X.InterfaceC1015560cXC
    public final boolean LJI(AnoleComponentModel anoleComponentModel) {
        return Intrinsics.LJFF(anoleComponentModel.type, EnumC1008920cMU.CAROUSEL_MULTI_PICS_UGEN.getType());
    }

    @Override // X.InterfaceC1015560cXC
    public final void LJIIIIZZ(C1015550cXB c1015550cXB) {
        this.LIZ = c1015550cXB;
        LJIL().LIZLLL = true;
        LJIILL(c1015550cXB);
    }

    @Override // X.InterfaceC1015560cXC
    public final void LJIIIZ(C1015550cXB c1015550cXB) {
        String strLJIILIIL = LJIILIIL(c1015550cXB);
        this.LIZ = c1015550cXB;
        LJIL().LIZ = null;
        LJIL().LIZIZ = 0;
        LJIL().LIZJ = false;
        LJIL().LIZLLL = false;
        LJIL().LJ = null;
        LJJIII(null);
        LJIL().LJI = null;
        LJIL().LJII = C2097608Jq.LJ();
        LJIL().LJIIIIZZ = 0L;
        LJIL().LJIIIZ = 0L;
        LJIL().LJIIJ = 0L;
        LJIL().LJIIJJI = null;
        LJIJ().clear();
        LJIL().LJIILIIL.clear();
        LIZJ.remove(strLJIILIIL);
        LJIJI().clear();
        LJIJJLI().clear();
        LJIL().LJIILLIIL.clear();
        LJIL().LJIIZILJ.clear();
        LJIL().LJIJ.clear();
        C08JM.LIZ(c1015550cXB.LLLIIL);
        C1020900cfo.LIZ.getClass();
        String strLIZ = C1020900cfo.LIZ(c1015550cXB);
        ConcurrentHashMap<String, AtomicInteger> concurrentHashMap = C1020900cfo.LJFF;
        AtomicInteger atomicInteger = concurrentHashMap.get(strLIZ);
        if (atomicInteger != null && atomicInteger.decrementAndGet() <= 0) {
            concurrentHashMap.remove(strLIZ);
            C1020900cfo.LIZIZ.remove(strLIZ);
            C1020900cfo.LIZJ.remove(strLIZ);
            C1020900cfo.LIZLLL.remove(strLIZ);
        }
    }

    public final void LJIILL(C1015550cXB c1015550cXB) {
        Map<String, Boolean> mapLJIJ;
        Boolean bool;
        boolean zBooleanValue;
        String str;
        List<String> listLJIIIZ;
        String strOptString;
        List<String> listLJIIIZ2;
        String str2;
        if (LJIL().LIZLLL && LJIL().LIZJ) {
            C1020860cfk c1020860cfkLJIILLIIL = LJIJI().get(Integer.valueOf(LJIIZILJ()));
            if (c1020860cfkLJIILLIIL == null && (c1020860cfkLJIILLIIL = LJIILLIIL()) == null && (c1020860cfkLJIILLIIL = LJIL().LJFF) == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJIL().LJIIJ);
            sbLIZ.append('|');
            sbLIZ.append(c1020860cfkLJIILLIIL.LIZ.LIZ);
            sbLIZ.append('|');
            sbLIZ.append(c1020860cfkLJIILLIIL.LIZ.LIZJ);
            if (LJIL().LJIJ.add(C2188811AlT.LIZIZ(sbLIZ))) {
                JSONObject jSONObject = c1020860cfkLJIILLIIL.LIZ.LIZIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i = 0;
                int iOptInt = jSONObject.optInt("current_index", 0);
                if (iOptInt >= 0) {
                    i = iOptInt;
                }
                linkedHashMap.put("slide_index", Integer.valueOf(i));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image_url_list");
                if (jSONArrayOptJSONArray != null) {
                    listLJIIIZ = C1020890cfn.LJIIIZ(jSONArrayOptJSONArray);
                } else {
                    listLJIIIZ = null;
                }
                linkedHashMap.put("image_url_list", listLJIIIZ);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("current_product");
                if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("product_id")) == null) {
                    strOptString = "";
                }
                linkedHashMap.put("product_id", strOptString);
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("products_id_list");
                if (jSONArrayOptJSONArray2 != null) {
                    listLJIIIZ2 = C1020890cfn.LJIIIZ(jSONArrayOptJSONArray2);
                } else {
                    listLJIIIZ2 = null;
                }
                linkedHashMap.put("products_id_list", listLJIIIZ2);
                linkedHashMap.put("layout_type", Integer.valueOf(jSONObject.optInt("layout_type")));
                if (jSONObject.optBoolean("use_backup_layout")) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_fallback_layout", str2);
                C1015410cWx.LIZIZ(c1015550cXB, "othershow", null, null, null, "photo_collaged_image", linkedHashMap, 14);
            }
            if (!LJIJ().isEmpty()) {
                mapLJIJ = LJIJ();
            } else {
                mapLJIJ = LIZIZ;
            }
            Map<Integer, C1020870cfl> mapLJ = LJIL().LJIILIIL.get(Integer.valueOf(c1020860cfkLJIILLIIL.LIZ.LIZ));
            if (mapLJ == null && (mapLJ = LJIJJ().get(Integer.valueOf(c1020860cfkLJIILLIIL.LIZ.LIZ))) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            for (C1020880cfm c1020880cfm : C13LP.LJLLLL(new AComparatorS35S0000000_16(1), c1020860cfkLJIILLIIL.LIZ.LJI)) {
                Map<Integer, C1020850cfj> map = c1020860cfkLJIILLIIL.LIZJ;
                Integer numValueOf = Integer.valueOf(c1020880cfm.LIZ);
                C1020850cfj c1020850cfj = map.get(numValueOf);
                if (c1020850cfj == null) {
                    c1020850cfj = new C1020850cfj(c1020880cfm.LIZ);
                    map.put(numValueOf, c1020850cfj);
                }
                C1020850cfj c1020850cfj2 = c1020850cfj;
                c1020850cfj2.LIZIZ = c1020880cfm.LIZIZ;
                c1020850cfj2.LIZJ = c1020880cfm.LIZJ;
                C1020870cfl c1020870cfl = mapLJ.get(Integer.valueOf(c1020880cfm.LIZ));
                if (c1020870cfl != null && Intrinsics.LJFF(c1020870cfl.LIZ, c1020880cfm.LIZIZ)) {
                    bool = c1020870cfl.LIZIZ;
                } else {
                    c1020870cfl = null;
                    bool = null;
                }
                Boolean bool2 = mapLJIJ.get(c1020880cfm.LIZIZ);
                Boolean bool3 = c1020850cfj2.LIZLLL;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else if (bool3 != null) {
                    zBooleanValue = bool3.booleanValue();
                }
                Long l = c1020850cfj2.LJFF;
                long j = LJIL().LJIIJ;
                if (l == null || l.longValue() != j) {
                    c1020850cfj2.LJFF = Long.valueOf(LJIL().LJIIJ);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("slide_index", Integer.valueOf(c1020860cfkLJIILLIIL.LIZ.LIZ));
                    linkedHashMap2.put("image_index", Integer.valueOf(c1020880cfm.LIZ));
                    linkedHashMap2.put("image_url", c1020880cfm.LIZIZ);
                    linkedHashMap2.put("product_id", c1020880cfm.LIZJ);
                    c1020850cfj2.LIZLLL = Boolean.valueOf(zBooleanValue);
                    String str3 = "image_load_failed";
                    if (zBooleanValue) {
                        str = null;
                    } else if ((c1020870cfl == null || (str = c1020870cfl.LIZJ) == null) && (str = c1020850cfj2.LJ) == null) {
                        str = "image_load_failed";
                    }
                    c1020850cfj2.LJ = str;
                    if (zBooleanValue) {
                        C1015410cWx.LIZIZ(c1015550cXB, "othershow", null, null, null, "individual_image", linkedHashMap2, 14);
                    } else {
                        if (str != null) {
                            str3 = str;
                        }
                        C1015410cWx.LIZIZ(c1015550cXB, "othershow_fail", str3, null, null, "individual_image", linkedHashMap2, 12);
                    }
                }
            }
        }
    }

    public final void LJJI(int i) {
        long jLongValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = 0;
        if (LJIL().LJIIIZ > 0) {
            long j2 = LJIL().LJIIIIZZ;
            long j3 = jCurrentTimeMillis - LJIL().LJIIIZ;
            if (j3 < 0) {
                j3 = 0;
            }
            LJIL().LJIIIIZZ = j2 + j3;
            LJIL().LJIIIZ = 0L;
        }
        Long l = LJIJJLI().get(Integer.valueOf(i));
        if (l != null) {
            long jLongValue2 = l.longValue();
            Map<Integer, Long> map = LJIL().LJIILLIIL;
            Integer numValueOf = Integer.valueOf(i);
            Long l2 = LJIL().LJIILLIIL.get(Integer.valueOf(i));
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            long j4 = jCurrentTimeMillis - jLongValue2;
            if (j4 >= 0) {
                j = j4;
            }
            map.put(numValueOf, Long.valueOf(jLongValue + j));
            LJIJJLI().remove(Integer.valueOf(i));
        }
    }

    public final void LJJIII(C1020860cfk c1020860cfk) {
        LJIL().LJFF = c1020860cfk;
    }

    public final void LJJIIJ(JSONObject jSONObject) {
        int iLJIIZILJ;
        LJIL().LJ = C1020890cfn.LJ(jSONObject);
        int iLJIIZILJ2 = LJIIZILJ();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("carousel_container_info");
        if (jSONObjectOptJSONObject != null) {
            iLJIIZILJ = jSONObjectOptJSONObject.optInt("current_index", LJIIZILJ());
        } else {
            iLJIIZILJ = LJIIZILJ();
        }
        LJIL().LIZIZ = iLJIIZILJ;
        if (iLJIIZILJ2 != LJIIZILJ()) {
            LJJI(iLJIIZILJ2);
            if (LJIL().LIZJ) {
                int iLJIIZILJ3 = LJIIZILJ();
                long jCurrentTimeMillis = System.currentTimeMillis();
                LJIL().LJIIIZ = jCurrentTimeMillis;
                LJIJJLI().put(Integer.valueOf(iLJIIZILJ3), Long.valueOf(jCurrentTimeMillis));
            }
        }
    }

    @Override // X.InterfaceC1015560cXC
    public final void LIZIZ(C1015550cXB c1015550cXB, C1015960cXq c1015960cXq) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        C1020840cfi c1020840cfi;
        C1020840cfi c1020840cfi2;
        Boolean bool = LJIJ().get(c1015960cXq.LIZ);
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2) && !c1015960cXq.LIZIZ) {
            z = false;
        } else {
            z = true;
        }
        LJIJ().put(c1015960cXq.LIZ, Boolean.valueOf(z));
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LIZIZ;
        String str2 = c1015960cXq.LIZ;
        if (!Intrinsics.LJFF(concurrentHashMap.get(str2), bool2) && !c1015960cXq.LIZIZ) {
            z2 = false;
        } else {
            z2 = true;
        }
        concurrentHashMap.put(str2, Boolean.valueOf(z2));
        C1020920cfq c1020920cfq = c1015960cXq.LIZLLL;
        if (c1020920cfq == null) {
            LJIILL(c1015550cXB);
            return;
        }
        Map<Integer, Map<Integer, C1020870cfl>> map = LJIL().LJIILIIL;
        Integer numValueOf = Integer.valueOf(c1020920cfq.LIZJ);
        Map<Integer, C1020870cfl> linkedHashMap = map.get(numValueOf);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            map.put(numValueOf, linkedHashMap);
        }
        Map<Integer, C1020870cfl> map2 = linkedHashMap;
        Map<Integer, Map<Integer, C1020870cfl>> mapLJIJJ = LJIJJ();
        Integer numValueOf2 = Integer.valueOf(c1020920cfq.LIZJ);
        Map<Integer, C1020870cfl> concurrentHashMap2 = mapLJIJJ.get(numValueOf2);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap<>();
            mapLJIJJ.put(numValueOf2, concurrentHashMap2);
        }
        Map<Integer, C1020870cfl> map3 = concurrentHashMap2;
        Integer numValueOf3 = Integer.valueOf(c1020920cfq.LIZLLL);
        C1020870cfl c1020870cfl = map2.get(numValueOf3);
        if (c1020870cfl == null) {
            c1020870cfl = new C1020870cfl(0);
            map2.put(numValueOf3, c1020870cfl);
        }
        C1020870cfl c1020870cfl2 = c1020870cfl;
        if (!Intrinsics.LJFF(c1020870cfl2.LIZIZ, bool2) && !c1015960cXq.LIZIZ) {
            z3 = false;
        } else {
            z3 = true;
        }
        c1020870cfl2.LIZ = c1020920cfq.LJ;
        c1020870cfl2.LIZIZ = Boolean.valueOf(z3);
        String str3 = null;
        if (z3) {
            str = null;
        } else {
            str = c1015960cXq.LIZJ;
            if (str == null && (str = c1020870cfl2.LIZJ) == null) {
                str = "image_load_failed";
            }
        }
        c1020870cfl2.LIZJ = str;
        map3.put(Integer.valueOf(c1020920cfq.LIZLLL), new C1020870cfl(c1020870cfl2.LIZ, c1020870cfl2.LIZIZ, c1020870cfl2.LIZJ));
        C1020860cfk c1020860cfk = LJIJI().get(Integer.valueOf(c1020920cfq.LIZJ));
        if (c1020860cfk == null) {
            LJIILL(c1015550cXB);
            return;
        }
        Map<Integer, C1020850cfj> map4 = c1020860cfk.LIZJ;
        Integer numValueOf4 = Integer.valueOf(c1020920cfq.LIZLLL);
        C1020850cfj c1020850cfj = map4.get(numValueOf4);
        if (c1020850cfj == null) {
            c1020850cfj = new C1020850cfj(c1020920cfq.LIZLLL);
            map4.put(numValueOf4, c1020850cfj);
        }
        C1020850cfj c1020850cfj2 = c1020850cfj;
        c1020850cfj2.LIZIZ = c1020920cfq.LJ;
        c1020850cfj2.LIZJ = c1020920cfq.LJFF;
        c1020850cfj2.LIZLLL = Boolean.valueOf(z3);
        if (!z3) {
            str3 = c1020870cfl2.LIZJ;
        }
        c1020850cfj2.LJ = str3;
        C1020860cfk c1020860cfk2 = LJIL().LJFF;
        if (c1020860cfk2 != null && (c1020840cfi2 = c1020860cfk2.LIZ) != null && c1020840cfi2.LIZ == c1020920cfq.LIZJ) {
            LJJIII(c1020860cfk);
        }
        C1020860cfk c1020860cfkLJIILLIIL = LJIILLIIL();
        if (c1020860cfkLJIILLIIL != null && (c1020840cfi = c1020860cfkLJIILLIIL.LIZ) != null && c1020840cfi.LIZ == c1020920cfq.LIZJ) {
            LJIL().LJI = c1020860cfk;
        }
        LJIILL(c1015550cXB);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    @Override // X.InterfaceC1015560cXC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C1015550cXB r17, X.C1050000dQk r18) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1020820cfg.LIZJ(X.0cXB, X.0dQk):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1015560cXC
    public final boolean LJ(C1015550cXB c1015550cXB, AbstractC1003980cEW abstractC1003980cEW) throws JSONException {
        int iIntValue;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        C1020840cfi c1020840cfi;
        String str;
        C1020840cfi c1020840cfi2;
        boolean z = false;
        if (!(abstractC1003980cEW instanceof C991240bty)) {
            return false;
        }
        C991240bty c991240bty = (C991240bty) abstractC1003980cEW;
        String strOptString = c991240bty.LIZ.optString("event");
        if (strOptString != null) {
            JSONObject jSONObjectOptJSONObject3 = null;
            switch (strOptString.hashCode()) {
                case -1944186156:
                    if (strOptString.equals("carouselPageReady")) {
                        JSONObject jSONObject = c991240bty.LIZ;
                        LJJIIJ(jSONObject);
                        C1020860cfk c1020860cfkLJIILJJIL = LJIILJJIL(c1015550cXB, jSONObject, LJIIZILJ(), LJIL().LIZJ, false);
                        if (c1020860cfkLJIILJJIL != null) {
                            LJIJI().put(Integer.valueOf(c1020860cfkLJIILJJIL.LIZ.LIZ), c1020860cfkLJIILJJIL);
                            LJJIII(c1020860cfkLJIILJJIL);
                            int i = c1020860cfkLJIILJJIL.LIZ.LIZ;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (LJIL().LJIIIZ == 0) {
                                LJIL().LJIIIZ = jCurrentTimeMillis;
                            }
                            if (!LJIJJLI().containsKey(Integer.valueOf(i))) {
                                LJIJJLI().put(Integer.valueOf(i), Long.valueOf(jCurrentTimeMillis));
                            }
                            LJIIL(c1015550cXB, c1020860cfkLJIILJJIL, "pageReady");
                            LJIILL(c1015550cXB);
                            JSONObject ugenData = LJIL().LIZ;
                            if (ugenData != null || (ugenData = c1015550cXB.LL.getUgenData()) != null) {
                                C1020900cfo c1020900cfo = C1020900cfo.LIZ;
                                JSONObject ugenData2 = c1015550cXB.LL.getUgenData();
                                if (ugenData2 != null) {
                                    jSONObjectOptJSONObject3 = ugenData2.optJSONObject("carouselUpdateInfo");
                                }
                                int iLJIIZILJ = LJIIZILJ();
                                c1020900cfo.getClass();
                                C1020900cfo.LIZLLL(c1015550cXB, ugenData, jSONObjectOptJSONObject3, iLJIIZILJ);
                                return true;
                            }
                            return true;
                        }
                        return true;
                    }
                    break;
                case -704927414:
                    if (strOptString.equals("carouselSelectedPage")) {
                        JSONObject jSONObject2 = c991240bty.LIZ;
                        LJJIIJ(jSONObject2);
                        LJIL().LIZJ = true;
                        LJIL().LJIIJ++;
                        int iLJIIZILJ2 = LJIIZILJ();
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        LJIL().LJIIIZ = jCurrentTimeMillis2;
                        LJIJJLI().put(Integer.valueOf(iLJIIZILJ2), Long.valueOf(jCurrentTimeMillis2));
                        int iLJIIZILJ3 = LJIIZILJ();
                        Map<Integer, Integer> map = LJIL().LJIIZILJ;
                        Integer numValueOf = Integer.valueOf(iLJIIZILJ3);
                        Integer num = LJIL().LJIIZILJ.get(Integer.valueOf(iLJIIZILJ3));
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        map.put(numValueOf, Integer.valueOf(iIntValue + 1));
                        C1020860cfk c1020860cfkLJIILLIIL = LJIILLIIL();
                        if (c1020860cfkLJIILLIIL != null && (c1020840cfi = c1020860cfkLJIILLIIL.LIZ) != null && c1020840cfi.LIZ == LJIIZILJ()) {
                            String str2 = c1020840cfi.LIZJ;
                            C1020860cfk c1020860cfk = LJIJI().get(Integer.valueOf(LJIIZILJ()));
                            if (c1020860cfk != null && (c1020840cfi2 = c1020860cfk.LIZ) != null) {
                                str = c1020840cfi2.LIZJ;
                            } else {
                                str = null;
                            }
                            if (Intrinsics.LJFF(str2, str)) {
                                z = true;
                            }
                        }
                        if (z) {
                            C1020860cfk c1020860cfkLJIILLIIL2 = LJIJI().get(Integer.valueOf(LJIIZILJ()));
                            if (c1020860cfkLJIILLIIL2 != null || (c1020860cfkLJIILLIIL2 = LJIILLIIL()) != null) {
                                JSONObject jSONObject3 = c1020860cfkLJIILLIIL2.LIZ.LIZIZ;
                                jSONObject3.put("carouselSelected", true);
                                JSONObject jSONObjectOptJSONObject4 = jSONObject3.optJSONObject("jigsaw_data");
                                if (jSONObjectOptJSONObject4 != null) {
                                    jSONObjectOptJSONObject4.put("carouselSelected", true);
                                }
                                JSONObject jSONObjectOptJSONObject5 = jSONObject3.optJSONObject("carouselUpdateInfo");
                                if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject5.optJSONObject("carousel_label_info")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("status_info")) != null) {
                                    jSONObjectOptJSONObject2.put("animation", true);
                                }
                                String strLIZ = C1020890cfn.LIZ(c1020860cfkLJIILLIIL2.LIZ.LIZIZ);
                                C1020840cfi c1020840cfiLIZ = C1020840cfi.LIZ(c1020860cfkLJIILLIIL2.LIZ, null, strLIZ, C1020890cfn.LJI(strLIZ, c1020860cfkLJIILLIIL2.LIZ.LIZIZ), 103);
                                C1020860cfk c1020860cfk2 = new C1020860cfk(c1020840cfiLIZ, c1020860cfkLJIILLIIL2.LIZIZ, c1020860cfkLJIILLIIL2.LIZJ);
                                LJIJI().put(Integer.valueOf(c1020840cfiLIZ.LIZ), c1020860cfk2);
                                LJJIII(c1020860cfk2);
                                LJIIJ(c1015550cXB, c1020860cfk2, "selected");
                                LJIILL(c1015550cXB);
                                return true;
                            }
                            return true;
                        }
                        C1020860cfk c1020860cfkLJIILJJIL2 = LJIILJJIL(c1015550cXB, jSONObject2, LJIIZILJ(), true, true);
                        if (c1020860cfkLJIILJJIL2 != null) {
                            LJIJI().put(Integer.valueOf(c1020860cfkLJIILJJIL2.LIZ.LIZ), c1020860cfkLJIILJJIL2);
                            LJJIII(c1020860cfkLJIILJJIL2);
                            LJIIL(c1015550cXB, c1020860cfkLJIILJJIL2, "selected");
                            LJIILL(c1015550cXB);
                            return true;
                        }
                        return true;
                    }
                    break;
                case -648348087:
                    if (strOptString.equals("carouselUpdate")) {
                        JSONObject jSONObject4 = c991240bty.LIZ;
                        LJJIIJ(jSONObject4);
                        C1020860cfk c1020860cfkLJIILJJIL3 = LJIILJJIL(c1015550cXB, jSONObject4, LJIIZILJ(), LJIL().LIZJ, false);
                        if (c1020860cfkLJIILJJIL3 != null) {
                            LJIJI().put(Integer.valueOf(c1020860cfkLJIILJJIL3.LIZ.LIZ), c1020860cfkLJIILJJIL3);
                            LJJIII(c1020860cfkLJIILJJIL3);
                            LJIIL(c1015550cXB, c1020860cfkLJIILJJIL3, "update");
                            LJIILL(c1015550cXB);
                            return true;
                        }
                        return true;
                    }
                    break;
                case 722614883:
                    if (strOptString.equals("carouselUnselectedPage")) {
                        JSONObject jSONObject5 = c991240bty.LIZ;
                        LJJIIJ(jSONObject5);
                        LJJI(LJIIZILJ());
                        LJIL().LIZJ = false;
                        LJIL().LJIIJJI = null;
                        C1020860cfk c1020860cfkLJIILJJIL4 = LJIILJJIL(c1015550cXB, jSONObject5, LJIIZILJ(), false, false);
                        if (c1020860cfkLJIILJJIL4 != null) {
                            LJIJI().put(Integer.valueOf(c1020860cfkLJIILJJIL4.LIZ.LIZ), c1020860cfkLJIILJJIL4);
                            LJJIII(c1020860cfkLJIILJJIL4);
                            return true;
                        }
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public final void LJJ(C1015550cXB c1015550cXB, C1020860cfk c1020860cfk) {
        int length;
        LJIL().LJI = c1020860cfk;
        LJIJI().put(Integer.valueOf(c1020860cfk.LIZ.LIZ), c1020860cfk);
        JSONObject jSONObject = c1020860cfk.LIZ.LIZIZ;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("jump_model");
        if (jSONObjectOptJSONObject != null) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("product_list");
            boolean z = false;
            if (jSONArrayOptJSONArray != null) {
                length = jSONArrayOptJSONArray.length();
            } else {
                length = 0;
            }
            int i = c1020860cfk.LIZ.LIZ;
            if (i < 0) {
                i = 0;
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI(Integer.valueOf(i), jSONObjectOptJSONObject.optString("product_id"), jSONObjectOptJSONObject.optString("web_url"), jSONObjectOptJSONObject.optString("open_url")), "|", null, null, 0, null, null, 62);
            if (!Intrinsics.LJFF(strLJJLIIIJ, LJIL().LJIIJJI)) {
                LJIL().LJIIJJI = strLJJLIIIJ;
                if (length > 0 && i == length - 1) {
                    z = true;
                }
                LJJIFFI(c1015550cXB, jSONObjectOptJSONObject, i, z);
            }
        }
        LJIILL(c1015550cXB);
    }

    public final C1020860cfk LJJII(C1020840cfi c1020840cfi, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap;
        C1020870cfl c1020870cfl;
        Boolean bool;
        Map<Integer, C1020850cfj> map;
        C1020860cfk c1020860cfk = LJIJI().get(Integer.valueOf(c1020840cfi.LIZ));
        if (c1020860cfk != null && (map = c1020860cfk.LIZJ) != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                C1020850cfj c1020850cfj = (C1020850cfj) entry.getValue();
                linkedHashMap2.put(key, new C1020850cfj(c1020850cfj.LIZ, c1020850cfj.LIZIZ, c1020850cfj.LIZJ, c1020850cfj.LIZLLL, c1020850cfj.LJ, c1020850cfj.LJFF));
            }
            linkedHashMap = new LinkedHashMap(linkedHashMap2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        Map<Integer, C1020870cfl> map2 = LJIL().LJIILIIL.get(Integer.valueOf(c1020840cfi.LIZ));
        if (map2 == null) {
            map2 = LJIJJ().get(Integer.valueOf(c1020840cfi.LIZ));
        }
        C1020860cfk c1020860cfk2 = new C1020860cfk(c1020840cfi, jSONObject, linkedHashMap);
        for (C1020880cfm c1020880cfm : c1020840cfi.LJI) {
            Map<Integer, C1020850cfj> map3 = c1020860cfk2.LIZJ;
            Integer numValueOf = Integer.valueOf(c1020880cfm.LIZ);
            C1020850cfj c1020850cfj2 = map3.get(numValueOf);
            if (c1020850cfj2 == null) {
                c1020850cfj2 = new C1020850cfj(c1020880cfm.LIZ);
                map3.put(numValueOf, c1020850cfj2);
            }
            C1020850cfj c1020850cfj3 = c1020850cfj2;
            String str = null;
            if (!Intrinsics.LJFF(c1020850cfj3.LIZIZ, c1020880cfm.LIZIZ)) {
                c1020850cfj3.LJFF = null;
            }
            c1020850cfj3.LIZIZ = c1020880cfm.LIZIZ;
            c1020850cfj3.LIZJ = c1020880cfm.LIZJ;
            if (map2 != null && (c1020870cfl = map2.get(Integer.valueOf(c1020880cfm.LIZ))) != null && Intrinsics.LJFF(c1020870cfl.LIZ, c1020880cfm.LIZIZ)) {
                bool = c1020870cfl.LIZIZ;
            } else {
                c1020870cfl = null;
                bool = null;
            }
            if (bool != null) {
                Boolean bool2 = c1020870cfl.LIZIZ;
                c1020850cfj3.LIZLLL = bool2;
                if (!Intrinsics.LJFF(bool2, Boolean.TRUE) && (str = c1020870cfl.LIZJ) == null) {
                    str = "image_load_failed";
                }
                c1020850cfj3.LJ = str;
            } else if (LJIJ().get(c1020880cfm.LIZIZ) != null) {
                boolean zLJFF = Intrinsics.LJFF(LJIJ().get(c1020880cfm.LIZIZ), Boolean.TRUE);
                c1020850cfj3.LIZLLL = Boolean.valueOf(zLJFF);
                if (!zLJFF) {
                    str = "image_load_failed";
                }
                c1020850cfj3.LJ = str;
            }
        }
        return c1020860cfk2;
    }

    public final void LJIIJ(C1015550cXB c1015550cXB, C1020860cfk c1020860cfk, String str) throws JSONException {
        C19JH<View> c19jh;
        C19JH<T> c19jhLJFF;
        C19JH<View> c19jh2;
        C19JH<T> c19jhLJFF2;
        T t;
        C19JH<View> c19jh3 = c1015550cXB.LLLIILIL;
        if (c19jh3 == null) {
            LJIIJJI(c1015550cXB, c1020860cfk, str);
            return;
        }
        C19JH c19jhLJFF3 = c19jh3.LJFF("product_label_content");
        if (c19jhLJFF3 == null) {
            LJIIJJI(c1015550cXB, c1020860cfk, str);
            return;
        }
        JSONObject jSONObject = c1020860cfk.LIZ.LIZIZ;
        C1020640cfO.LIZ(c1015550cXB, jSONObject);
        if (c1020860cfk.LIZ.LJ && (c19jh2 = c1015550cXB.LLLIILIL) != null && (c19jhLJFF2 = c19jh2.LJFF("product_label_content")) != 0 && (t = c19jhLJFF2.LLILZ) != 0) {
            C786410Ut5.T4(t, 0.0f);
        }
        C1049800dQQ c1049800dQQLJJI = c1015550cXB.LJJI();
        c1049800dQQLJJI.LIZLLL(c19jhLJFF3, jSONObject);
        c1049800dQQLJJI.LIZJ(c19jhLJFF3);
        if (c1020860cfk.LIZ.LJ && (c19jh = c1015550cXB.LLLIILIL) != null && (c19jhLJFF = c19jh.LJFF("product_label_content")) != 0) {
            c19jhLJFF.LJIIL();
            c19jhLJFF.LJIIJJI();
        }
        LJJ(c1015550cXB, c1020860cfk);
    }

    public final void LJIIJJI(final C1015550cXB c1015550cXB, C1020860cfk c1020860cfk, String str) throws JSONException {
        JSONObject jSONObject;
        C19JH<View> c19jh;
        C19JH<T> c19jhLJFF;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        C19JH<T> c19jhLJFF2;
        T t;
        final AwS260S0300000_16 awS260S0300000_16 = new AwS260S0300000_16(this, c1015550cXB, c1020860cfk, str, 20);
        System.currentTimeMillis();
        JSONObject jSONObject4 = c1020860cfk.LIZ.LIZIZ;
        C1020640cfO.LIZ(c1015550cXB, jSONObject4);
        C19JH<View> c19jh2 = c1015550cXB.LLLIILIL;
        if (c19jh2 != null) {
            if (c1020860cfk.LIZ.LJ && (c19jhLJFF2 = c19jh2.LJFF("product_label_content")) != 0 && (t = c19jhLJFF2.LLILZ) != 0) {
                C786410Ut5.T4(t, 0.0f);
            }
            JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject("carouselUpdateInfo");
            if (jSONObjectOptJSONObject != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("jigsaw_data");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObject2 = new JSONObject();
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("jigsaw_layout");
                    if (jSONObjectOptJSONObject3 != null) {
                        jSONObject2.put("jigsaw_layout", jSONObjectOptJSONObject3);
                    }
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("main_container_layout");
                    if (jSONObjectOptJSONObject4 != null) {
                        jSONObject2.put("main_container_layout", jSONObjectOptJSONObject4);
                    }
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject2.optJSONObject("sub_pics_layout");
                    if (jSONObjectOptJSONObject5 != null) {
                        jSONObject2.put("sub_pics_layout", jSONObjectOptJSONObject5);
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("pics_list");
                    if (jSONArrayOptJSONArray != null) {
                        jSONObject2.put("pics_list", jSONArrayOptJSONArray);
                    }
                    JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject2.optJSONObject("product_info");
                    if (jSONObjectOptJSONObject6 != null) {
                        jSONObject2.put("product_info", jSONObjectOptJSONObject6);
                    }
                    jSONObject2.put("use_backup_layout", jSONObjectOptJSONObject2.optBoolean("use_backup_layout", false));
                    jSONObject2.put("use_text_backup", jSONObjectOptJSONObject2.optBoolean("use_text_backup", false));
                    JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject2.optJSONObject("text_contents");
                    if (jSONObjectOptJSONObject7 != null) {
                        jSONObject2.put("text_contents", jSONObjectOptJSONObject7);
                    }
                    jSONObject2.put("carouselSelected", jSONObjectOptJSONObject2.optBoolean("carouselSelected", false));
                    jSONObject2.put("current_index", jSONObjectOptJSONObject2.optInt("current_index", 0));
                } else {
                    jSONObject2 = null;
                }
                JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject.optJSONObject("carousel_label_info");
                if (jSONObjectOptJSONObject8 != null) {
                    jSONObject3 = new JSONObject();
                    JSONObject jSONObjectOptJSONObject9 = jSONObjectOptJSONObject8.optJSONObject("status_info");
                    if (jSONObjectOptJSONObject9 != null) {
                        jSONObject3.put("status_info", jSONObjectOptJSONObject9);
                    }
                    JSONObject jSONObjectOptJSONObject10 = jSONObjectOptJSONObject8.optJSONObject("style_info");
                    if (jSONObjectOptJSONObject10 != null) {
                        jSONObject3.put("style_info", jSONObjectOptJSONObject10);
                    }
                    JSONObject jSONObjectOptJSONObject11 = jSONObjectOptJSONObject8.optJSONObject("product");
                    if (jSONObjectOptJSONObject11 != null) {
                        jSONObject3.put("product", jSONObjectOptJSONObject11);
                    }
                } else {
                    jSONObject3 = null;
                }
                jSONObject = new JSONObject();
                if (jSONObject2 != null) {
                    jSONObject.put("jigsaw_data", jSONObject2);
                }
                if (jSONObject3 != null) {
                    jSONObject.put("carousel_label_info", jSONObject3);
                }
                JSONObject jSONObjectOptJSONObject12 = jSONObjectOptJSONObject.optJSONObject("carousel_track_tags");
                if (jSONObjectOptJSONObject12 != null) {
                    jSONObject.put("carousel_track_tags", jSONObjectOptJSONObject12);
                }
            } else {
                jSONObject = null;
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("layout_type", jSONObject4.optInt("layout_type", 1));
            jSONObject5.put("system", jSONObject4.optString("system", "Android"));
            jSONObject5.put("carouselSelected", jSONObject4.optBoolean("carouselSelected", false));
            jSONObject5.put("current_index", jSONObject4.optInt("current_index", 0));
            if (jSONObject != null) {
                jSONObject5.put("carouselUpdateInfo", jSONObject);
            }
            Iterator it2 = C1697810uHb.LJIIJJI("main_pic", "layout6_main_backup_pic", "sub_pic_0", "sub_text_backup_0", "sub_pic_1", "sub_text_backup_1", "sub_pic_2", "sub_text_backup_2").iterator();
            int i = 0;
            while (it2.hasNext()) {
                C19JH c19jhLJFF3 = c19jh2.LJFF((String) it2.next());
                if (c19jhLJFF3 != null) {
                    i++;
                    C1049800dQQ c1049800dQQLJJI = c1015550cXB.LJJI();
                    c1049800dQQLJJI.LIZLLL(c19jhLJFF3, jSONObject5);
                    c1049800dQQLJJI.LIZJ(c19jhLJFF3);
                }
            }
            if (i == 0) {
                C19JH<View> c19jhLJFF4 = c19jh2.LJFF("jigsaw_container");
                if (c19jhLJFF4 != null) {
                    c19jh2 = c19jhLJFF4;
                }
                C1049800dQQ c1049800dQQLJJI2 = c1015550cXB.LJJI();
                c1049800dQQLJJI2.LIZLLL(c19jh2, jSONObject5);
                c1049800dQQLJJI2.LIZJ(c19jh2);
            }
            if (c1020860cfk.LIZ.LJ && (c19jh = c1015550cXB.LLLIILIL) != null && (c19jhLJFF = c19jh.LJFF("product_label_content")) != 0) {
                c19jhLJFF.LJIIL();
                c19jhLJFF.LJIIJJI();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("applyOneBigThreeSmallSnapshot updateStyle reason=");
            sbLIZ.append(str);
            sbLIZ.append(" slide=");
            sbLIZ.append(c1020860cfk.LIZ.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            awS260S0300000_16.invoke();
            return;
        }
        if (Intrinsics.LJFF(c1015550cXB.LLJLILLLLZIIL, C1014990cWH.LIZ)) {
            c1015550cXB.LJJIII(C1014970cWF.LIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("applyOneBigThreeSmallSnapshot render reason=");
        sbLIZ2.append(str);
        sbLIZ2.append(" slide=");
        sbLIZ2.append(c1020860cfk.LIZ.LIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1015640cXK.LIZ(c1015550cXB, false, jSONObject4, new InterfaceC1015680cXO() { // from class: X.0cX6
            @Override // X.InterfaceC1015680cXO
            public final void LIZ(View view) {
                if (view != null) {
                    C1015550cXB c1015550cXB2 = c1015550cXB;
                    C1014320cVC.LIZLLL(view);
                    ViewGroup viewGroup = c1015550cXB2.LLJJIII;
                    if (viewGroup != null) {
                        C786410Ut5.LJJJJI(viewGroup);
                    }
                    ViewGroup viewGroup2 = c1015550cXB2.LLJJIII;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(view);
                    }
                }
                awS260S0300000_16.invoke();
            }
        });
    }

    public final void LJIIL(C1015550cXB c1015550cXB, C1020860cfk c1020860cfk, String str) throws JSONException {
        C1020840cfi c1020840cfi;
        C1020860cfk c1020860cfkLJIILLIIL = LJIILLIIL();
        String str2 = null;
        if (c1020860cfkLJIILLIIL != null) {
            c1020840cfi = c1020860cfkLJIILLIIL.LIZ;
            if (c1020840cfi != null) {
                str2 = c1020840cfi.LIZJ;
            }
        } else {
            c1020840cfi = null;
        }
        if (Intrinsics.LJFF(str2, c1020860cfk.LIZ.LIZJ)) {
            C1020840cfi c1020840cfi2 = c1020860cfk.LIZ;
            if (!c1020840cfi2.LJ || Intrinsics.LJFF(c1020840cfi.LIZLLL, c1020840cfi2.LIZLLL)) {
                return;
            }
        }
        if (c1020860cfk.LIZ.LIZ != LJIIZILJ()) {
            return;
        }
        if (c1020840cfi != null && Intrinsics.LJFF(c1020840cfi.LIZJ, c1020860cfk.LIZ.LIZJ)) {
            if (c1020860cfk.LIZ.LJ) {
                LJIIJ(c1015550cXB, c1020860cfk, str);
                return;
            }
            return;
        }
        LJIIJJI(c1015550cXB, c1020860cfk, str);
    }

    public static void LJJIFFI(C1015550cXB c1015550cXB, JSONObject jSONObject, int i, boolean z) {
        String strOptString = jSONObject.optString("web_url");
        String strOptString2 = jSONObject.optString("open_url");
        if (a0.LJJJIL(strOptString2)) {
            strOptString2 = null;
        }
        if (a0.LJJJIL(strOptString) && (strOptString2 == null || a0.LJJJIL(strOptString2))) {
            return;
        }
        InterfaceC1014270cV7 interfaceC1014270cV7 = c1015550cXB.LLILLL;
        if (a0.LJJJIL(strOptString)) {
            if (strOptString2 == null) {
                strOptString = "";
            } else {
                strOptString = strOptString2;
            }
        }
        interfaceC1014270cV7.LJIJ(new C989550brF(new C1017230cZt(strOptString, strOptString2, null, C2097608Jq.LJIIIIZZ(new Pair("productId", jSONObject.optString("product_id")), new Pair("productIndex", Integer.valueOf(i)), new Pair("isLastIndex", Boolean.valueOf(z))))), c1015550cXB);
    }

    public final C1020860cfk LJIILJJIL(C1015550cXB c1015550cXB, JSONObject jSONObject, int i, boolean z, boolean z2) {
        JSONObject jSONObjectLJ;
        C1020840cfi c1020840cfiLIZIZ;
        C1020900cfo.LIZ.getClass();
        ConcurrentHashMap<Integer, C1020840cfi> concurrentHashMap = C1020900cfo.LIZIZ.get(C1020900cfo.LIZ(c1015550cXB));
        if (concurrentHashMap != null && (c1020840cfiLIZIZ = concurrentHashMap.get(Integer.valueOf(i))) != null) {
            if (z || z2) {
                c1020840cfiLIZIZ = c1020840cfiLIZIZ.LIZIZ(z, z2);
            }
            return LJJII(c1020840cfiLIZIZ, jSONObject);
        }
        JSONObject jSONObject2 = LJIL().LIZ;
        if (jSONObject2 != null) {
            jSONObjectLJ = C1020890cfn.LJ(jSONObject2);
        } else {
            JSONObject ugenData = c1015550cXB.LL.getUgenData();
            if (ugenData != null) {
                jSONObjectLJ = C1020890cfn.LJ(ugenData);
                LJIL().LIZ = C1020890cfn.LJ(jSONObjectLJ);
            }
            return null;
        }
        if (jSONObjectLJ != null) {
            return LJJII(C1020900cfo.LIZJ(c1015550cXB, jSONObjectLJ, jSONObject, i, z, z2), jSONObject);
        }
        return null;
    }
}
