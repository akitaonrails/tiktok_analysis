package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.poi.experiment.LSFeedCardInsetConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0TXY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TXY {
    public static final C0TXY LIZ = new C0TXY();
    public static long LIZIZ = SystemClock.elapsedRealtime();
    public static final Map<String, Long> LIZJ = new LinkedHashMap();
    public static final List<String> LIZLLL = Collections.synchronizedList(new ArrayList());
    public static final HashSet<String> LJ = C093Y.LIZJ("video_play", "livesdk_live_show");
    public static final C01GW LJFF = C452501pT.LIZIZ(new C20549615b4());
    public static final C01GW LJI = C452501pT.LIZIZ(new C748370TXf());
    public static long LJII;
    public static boolean LJIIIIZZ;

    static {
        if (!((List) r1.getValue()).isEmpty()) {
            LJFF(Long.valueOf(System.currentTimeMillis()));
            C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.0TXb
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LSFeedCardSignalManager@7e30.ignore$1");
                    if (((C606810Nr5) obj).LIZIZ) {
                        C0TXY.LJIIIIZZ = true;
                        C0TXY.LJII = (C0TXY.LJII + SystemClock.elapsedRealtime()) - C0TXY.LIZIZ;
                    } else {
                        C0TXY.LJIIIIZZ = false;
                        C0TXY.LIZIZ = SystemClock.elapsedRealtime();
                    }
                    C1C7U.LIZIZ("LSFeedCardSignalManager@7e30.ignore$1");
                }
            });
        }
    }

    public static Keva LIZJ() {
        return (Keva) LJI.getValue();
    }

    public static int LJFF(Long l) {
        long jLongValue;
        List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(LIZJ().getString(C748320TXa.LJIIL.LIZ, ""), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (String str : listLJJLIIIJILLIZJL) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
            if (lLJIILIIL != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            if (jCurrentTimeMillis - jLongValue < 86400000) {
                arrayList.add(str);
            }
        }
        if (l != null) {
            arrayList.add(l.toString());
        }
        LIZJ().storeString(C748320TXa.LJIIL.LIZ, TextUtils.join(",", arrayList));
        return arrayList.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    public static void LJI(C748360TXe c748360TXe) {
        ?? arrayList;
        if (!c748360TXe.LIZIZ && !c748360TXe.LIZJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("uid");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            sbLIZ.append('_');
            sbLIZ.append(c748360TXe.LIZ);
            arrayList = Collections.singletonList(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            arrayList = new ArrayList();
            for (LSFeedCardInsetConfig.LSCardConfig lSCardConfig : (List) LJFF.getValue()) {
                if (c748360TXe.LIZJ) {
                    List<String> list = lSCardConfig.subCardType;
                    if (list != null) {
                        for (String str : list) {
                            C0TXY c0txy = LIZ;
                            Integer num = lSCardConfig.cardType;
                            c0txy.getClass();
                            String strLIZ = LIZ(c748360TXe, num, str);
                            if (strLIZ != null) {
                                arrayList.add(strLIZ);
                            }
                        }
                    }
                } else {
                    C0TXY c0txy2 = LIZ;
                    Integer num2 = lSCardConfig.cardType;
                    c0txy2.getClass();
                    String strLIZ2 = LIZ(c748360TXe, num2, null);
                    if (strLIZ2 != null) {
                        arrayList.add(strLIZ2);
                    }
                }
            }
        }
        for (String str2 : arrayList) {
            int i = C748340TXc.LIZ[c748360TXe.LIZLLL.ordinal()];
            long jLongValue = 0;
            if (i != 1) {
                if (i == 2) {
                    LIZ.getClass();
                    LIZJ().storeLong(str2, LIZJ().getLong(str2, 0L) + 1);
                } else {
                    throw new C1954807lC();
                }
            } else {
                Map<String, Long> map = LIZJ;
                Long l = (Long) ((LinkedHashMap) map).get(str2);
                if (l != null) {
                    jLongValue = l.longValue();
                }
                map.put(str2, Long.valueOf(jLongValue + 1));
            }
        }
    }

    public static boolean LJIIIIZZ(String str) {
        List<String> list = LIZLLL;
        if (list.contains(str)) {
            return false;
        }
        list.add(str);
        if (list.size() > 200) {
            ListProtector.remove(list, 0);
            return true;
        }
        return true;
    }

    public static JSONObject LIZIZ(int i, List list) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_local_service", 1);
        C0TXY c0txy = LIZ;
        C748360TXe c748360TXe = C748320TXa.LJI;
        Integer numValueOf = Integer.valueOf(i);
        c0txy.getClass();
        jSONObject.put(c748360TXe.LIZ, LIZLLL(c748360TXe, numValueOf, null));
        C748360TXe c748360TXe2 = C748320TXa.LJII;
        jSONObject.put(c748360TXe2.LIZ, LIZLLL(c748360TXe2, Integer.valueOf(i), null));
        C748360TXe c748360TXe3 = C748320TXa.LIZ;
        jSONObject.put(c748360TXe3.LIZ, LIZLLL(c748360TXe3, Integer.valueOf(i), null));
        C748360TXe c748360TXe4 = C748320TXa.LIZIZ;
        jSONObject.put(c748360TXe4.LIZ, LIZLLL(c748360TXe4, Integer.valueOf(i), null));
        C748360TXe c748360TXe5 = C748320TXa.LIZJ;
        jSONObject.put(c748360TXe5.LIZ, LIZLLL(c748360TXe5, Integer.valueOf(i), null));
        C748360TXe c748360TXe6 = C748320TXa.LIZLLL;
        jSONObject.put(c748360TXe6.LIZ, LIZLLL(c748360TXe6, Integer.valueOf(i), null));
        C748360TXe c748360TXe7 = C748320TXa.LJ;
        jSONObject.put(c748360TXe7.LIZ, LIZLLL(c748360TXe7, Integer.valueOf(i), null));
        C748360TXe c748360TXe8 = C748320TXa.LJIILIIL;
        jSONObject.put(c748360TXe8.LIZ, LIZLLL(c748360TXe8, Integer.valueOf(i), null));
        String str = C748320TXa.LJFF.LIZ;
        boolean z = LJIIIIZZ;
        long jElapsedRealtime = LJII;
        if (!z) {
            jElapsedRealtime = (jElapsedRealtime + SystemClock.elapsedRealtime()) - LIZIZ;
        }
        jSONObject.put(str, jElapsedRealtime);
        jSONObject.put(C748320TXa.LJIIL.LIZ, LJFF(null));
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("card_subtype", str2);
                C748360TXe c748360TXe9 = C748320TXa.LJIIIIZZ;
                String str3 = c748360TXe9.LIZ;
                C0TXY c0txy2 = LIZ;
                Integer numValueOf2 = Integer.valueOf(i);
                c0txy2.getClass();
                jSONObject2.put(str3, LIZLLL(c748360TXe9, numValueOf2, str2));
                C748360TXe c748360TXe10 = C748320TXa.LJIIIZ;
                jSONObject2.put(c748360TXe10.LIZ, LIZLLL(c748360TXe10, Integer.valueOf(i), str2));
                arrayList.add(jSONObject2);
            }
            jSONObject.put("feed_ls_card_subtype_info", new JSONArray((Collection) arrayList));
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                String str4 = (String) it3.next();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("card_subtype", str4);
                C748360TXe c748360TXe11 = C748320TXa.LJIIJ;
                String str5 = c748360TXe11.LIZ;
                C0TXY c0txy3 = LIZ;
                Integer numValueOf3 = Integer.valueOf(i);
                c0txy3.getClass();
                jSONObject3.put(str5, LIZLLL(c748360TXe11, numValueOf3, str4));
                C748360TXe c748360TXe12 = C748320TXa.LJIIJJI;
                jSONObject3.put(c748360TXe12.LIZ, LIZLLL(c748360TXe12, Integer.valueOf(i), str4));
                arrayList2.add(jSONObject3);
            }
            jSONObject.put("feed_ls_card_dislike_record", new JSONArray((Collection) arrayList2));
        }
        return jSONObject;
    }

    public static String LIZ(C748360TXe c748360TXe, Integer num, String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (c748360TXe.LIZJ && C123100dR.LIZ(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("uid");
            sbLIZ.append(curUserId);
            sbLIZ.append("_cd");
            sbLIZ.append(num);
            sbLIZ.append("_scd");
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(c748360TXe.LIZ);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (c748360TXe.LIZIZ) {
            if (num != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("uid");
                sbLIZ2.append(curUserId);
                sbLIZ2.append("_cd");
                sbLIZ2.append(num);
                sbLIZ2.append('_');
                sbLIZ2.append(c748360TXe.LIZ);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            return null;
        }
        if (!c748360TXe.LIZJ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("uid");
            sbLIZ3.append(curUserId);
            sbLIZ3.append('_');
            sbLIZ3.append(c748360TXe.LIZ);
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        return null;
    }

    public static long LIZLLL(C748360TXe c748360TXe, Integer num, String str) {
        Long l;
        String strLIZ = LIZ(c748360TXe, num, str);
        if (strLIZ == null) {
            return 0L;
        }
        int i = C748340TXc.LIZ[c748360TXe.LIZLLL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (!LIZJ().contains(strLIZ)) {
                    return 0L;
                }
                return LIZJ().getLong(strLIZ, 0L);
            }
            throw new C1954807lC();
        }
        Map<String, Long> map = LIZJ;
        if (!map.containsKey(strLIZ) || (l = (Long) ((LinkedHashMap) map).get(strLIZ)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public static void LJII(C748360TXe c748360TXe, Integer num, String str) {
        String strLIZ = LIZ(c748360TXe, num, str);
        if (strLIZ == null) {
            return;
        }
        int i = C748340TXc.LIZ[c748360TXe.LIZLLL.ordinal()];
        long jLongValue = 0;
        if (i != 1) {
            if (i == 2) {
                LIZJ().storeLong(strLIZ, LIZJ().getLong(strLIZ, 0L) + 1);
                return;
            }
            throw new C1954807lC();
        }
        Map<String, Long> map = LIZJ;
        Long l = (Long) ((LinkedHashMap) map).get(strLIZ);
        if (l != null) {
            jLongValue = l.longValue();
        }
        map.put(strLIZ, Long.valueOf(jLongValue + 1));
    }

    public static void LJIIIZ(C748360TXe c748360TXe, Integer num, String str) {
        String strLIZ = LIZ(c748360TXe, num, str);
        if (strLIZ == null) {
            return;
        }
        int i = C748340TXc.LIZ[c748360TXe.LIZLLL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LIZJ().storeLong(strLIZ, 0L);
                return;
            }
            throw new C1954807lC();
        }
        LIZJ.put(strLIZ, 0L);
    }

    public static void LJIIJ(C748360TXe c748360TXe, long j, Integer num, String str) {
        String strLIZ = LIZ(c748360TXe, num, str);
        if (strLIZ == null) {
            return;
        }
        int i = C748340TXc.LIZ[c748360TXe.LIZLLL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LIZJ().storeLong(strLIZ, j);
                return;
            }
            throw new C1954807lC();
        }
        LIZJ.put(strLIZ, Long.valueOf(j));
    }
}
