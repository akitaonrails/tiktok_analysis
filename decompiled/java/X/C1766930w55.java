package X;

import com.bytedance.analytics.util.BtmPageSourceConfigModel;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0w55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766930w55 {
    public static final C1766930w55 LIZ = new C1766930w55();

    public static List LIZ(List list) {
        BcmParams bcmParams;
        BcmParams bcmParams2;
        BcmParams bcmParams3;
        BcmParams bcmParamsCopy;
        BcmParams bcmParamsCopy2;
        BcmParams bcmParamsCopy3;
        List<String> value;
        String str;
        ArrayList<C1766940w56> arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1766940w56 c1766940w56 = (C1766940w56) it2.next();
            String str2 = c1766940w56.LIZ;
            String strLJJIFFI = c1766940w56.LIZIZ;
            if (strLJJIFFI != null && strLJJIFFI.length() != 0) {
                Iterator<Map.Entry<String, String>> it3 = ((BtmPageSourceConfigModel) C1767020w5E.LIZIZ.getValue()).pageBtmMap.entrySet().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Map.Entry<String, String> next = it3.next();
                        if (a0.LJJIIZI(strLJJIFFI, next.getKey(), false)) {
                            strLJJIFFI = u.LJJIFFI(strLJJIFFI, next.getKey(), next.getValue(), false);
                            break;
                        }
                    }
                }
            }
            C1766940w56 c1766940w562 = new C1766940w56(str2, strLJJIFFI, c1766940w56.LIZJ, c1766940w56.LIZLLL, c1766940w56.LJ, c1766940w56.LJFF, c1766940w56.LJI, c1766940w56.LJII);
            c1766940w562.LJIIIZ = c1766940w56.LJIIIZ;
            arrayList.add(c1766940w562);
        }
        Map<String, ? extends List<String>> map = C1767060w5I.LJII.getValue().mergeSearchConfig;
        if (!map.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (C1766940w56 c1766940w563 : arrayList) {
                C1766940w56 c1766940w564 = (C1766940w56) C13LP.LJJLIIIJL(arrayList2);
                if (c1766940w564 != null && (str = c1766940w564.LIZIZ) != null && str.length() != 0) {
                    for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
                        if (a0.LJJIIZI(str, entry.getKey(), false)) {
                            value = entry.getValue();
                            break;
                        }
                    }
                    value = null;
                } else {
                    value = null;
                }
                List<String> list2 = value;
                if (list2 != null && !list2.isEmpty()) {
                    for (String str3 : list2) {
                        String str4 = c1766940w563.LIZIZ;
                        if (str4 == null || !a0.LJJIIZI(str4, str3, false)) {
                        }
                    }
                }
                arrayList2.add(c1766940w563);
            }
            arrayList = arrayList2;
        }
        List<String> list3 = C1767060w5I.LJII.getValue().deletePages;
        if (!list3.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            loop5: while (true) {
                final C1766990w5B c1766990w5B = null;
                for (C1766940w56 c1766940w565 : arrayList) {
                    if (!list3.isEmpty()) {
                        for (String str5 : list3) {
                            String str6 = c1766940w565.LIZIZ;
                            if (str6 != null && a0.LJJIIZI(str6, str5, false)) {
                                C1766990w5B c1766990w5B2 = c1766940w565.LJIIIZ;
                                if (c1766990w5B2 != null) {
                                    c1766990w5B = new C1766990w5B();
                                    BcmParams bcmParams4 = c1766990w5B2.LIZ;
                                    if (bcmParams4 != null) {
                                        bcmParamsCopy = bcmParams4.copy();
                                    } else {
                                        bcmParamsCopy = null;
                                    }
                                    c1766990w5B.LIZ = bcmParamsCopy;
                                    BcmParams bcmParams5 = c1766990w5B2.LIZIZ;
                                    if (bcmParams5 != null) {
                                        bcmParamsCopy2 = bcmParams5.copy();
                                    } else {
                                        bcmParamsCopy2 = null;
                                    }
                                    c1766990w5B.LIZIZ = bcmParamsCopy2;
                                    BcmParams bcmParams6 = c1766990w5B2.LIZJ;
                                    if (bcmParams6 != null) {
                                        bcmParamsCopy3 = bcmParams6.copy();
                                    } else {
                                        bcmParamsCopy3 = null;
                                    }
                                    c1766990w5B.LIZJ = bcmParamsCopy3;
                                }
                            }
                        }
                    }
                    if (c1766990w5B != null) {
                        C1766990w5B c1766990w5B3 = c1766940w565.LJIIIZ;
                        C2217391BqT c2217391BqT = new C2217391BqT(c1766990w5B) { // from class: X.0w5C
                            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
                            public final Object get() {
                                return ((C1766990w5B) this.receiver).LIZ;
                            }

                            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
                            public final void set(Object obj) {
                                ((C1766990w5B) this.receiver).LIZ = (BcmParams) obj;
                            }
                        };
                        if (c1766990w5B3 != null) {
                            bcmParams = c1766990w5B3.LIZ;
                        } else {
                            bcmParams = null;
                        }
                        C1766990w5B.LIZ(c2217391BqT, bcmParams);
                        C2217391BqT c2217391BqT2 = new C2217391BqT(c1766990w5B) { // from class: X.0vP1
                            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
                            public final Object get() {
                                return ((C1766990w5B) this.receiver).LIZIZ;
                            }

                            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
                            public final void set(Object obj) {
                                ((C1766990w5B) this.receiver).LIZIZ = (BcmParams) obj;
                            }
                        };
                        if (c1766990w5B3 != null) {
                            bcmParams2 = c1766990w5B3.LIZIZ;
                        } else {
                            bcmParams2 = null;
                        }
                        C1766990w5B.LIZ(c2217391BqT2, bcmParams2);
                        C2217391BqT c2217391BqT3 = new C2217391BqT(c1766990w5B) { // from class: X.0w5D
                            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
                            public final Object get() {
                                return ((C1766990w5B) this.receiver).LIZJ;
                            }

                            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
                            public final void set(Object obj) {
                                ((C1766990w5B) this.receiver).LIZJ = (BcmParams) obj;
                            }
                        };
                        if (c1766990w5B3 != null) {
                            bcmParams3 = c1766990w5B3.LIZJ;
                        } else {
                            bcmParams3 = null;
                        }
                        C1766990w5B.LIZ(c2217391BqT3, bcmParams3);
                    } else {
                        c1766990w5B = c1766940w565.LJIIIZ;
                    }
                    c1766940w565.LJIIIZ = c1766990w5B;
                    arrayList3.add(c1766940w565);
                }
                break loop5;
            }
            arrayList = arrayList3;
        }
        int i = 0;
        for (C1766940w56 c1766940w566 : arrayList) {
            List<String> list4 = ((BtmPageSourceConfigModel) C1767020w5E.LIZIZ.getValue()).cutChainPageBtmList;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                for (String str7 : list4) {
                    String str8 = c1766940w566.LIZIZ;
                    if (str8 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str7);
                        sbLIZ.append('.');
                        if (a0.LJJIIZI(str8, C2188811AlT.LIZIZ(sbLIZ), false)) {
                            if (i != -1) {
                                return arrayList.subList(0, i + 1);
                            }
                            return arrayList;
                        }
                    }
                }
            }
            i++;
        }
        return arrayList;
    }

    public static Pair LIZIZ(String str, PageFinder pageFinder) {
        C18C6 bcmChainByFinder;
        new C18C6();
        if (str != null && str.length() > 0) {
            bcmChainByFinder = BtmSDK.INSTANCE.getBcmChainByToken(str, C1767060w5I.LJII.getValue().chainLength, false);
        } else {
            bcmChainByFinder = BtmSDK.INSTANCE.getBcmChainByFinder(pageFinder, C1767060w5I.LJII.getValue().chainLength, false);
        }
        C18C6 c18c6 = new C18C6();
        C1766930w55 c1766930w55 = LIZ;
        List<C1766940w56> list = bcmChainByFinder.LIZ;
        c1766930w55.getClass();
        c18c6.LIZ = LIZ(list);
        return new Pair(bcmChainByFinder, c18c6);
    }

    public static JSONArray LIZJ(PageFinder pageFinder, boolean z, String str) throws JSONException {
        List<C1766940w56> listLIZ = BtmSDK.INSTANCE.getBcmChainByFinder(pageFinder, 20, false).LIZ;
        if (z) {
            listLIZ = LIZ(listLIZ);
        }
        Collections.reverse(listLIZ);
        JSONArray jSONArray = new JSONArray();
        String str2 = null;
        for (C1766940w56 c1766940w56 : listLIZ) {
            String str3 = c1766940w56.LIZIZ;
            if (str3 != null) {
                String str4 = (String) ListProtector.get(a0.LJJLIIIJILLIZJL(str3, new String[]{"_"}, 0, 6), 0);
                C1766930w55 c1766930w55 = LIZ;
                C1766990w5B c1766990w5B = c1766940w56.LJIIIZ;
                c1766930w55.getClass();
                C1767040w5G c1767040w5GLIZLLL = LIZLLL(str4, str2, c1766990w5B);
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("page_code", c1767040w5GLIZLLL.LIZIZ);
                jSONObject.putOpt("data", c1767040w5GLIZLLL.LIZJ);
                jSONObject.putOpt("btm_pre", c1767040w5GLIZLLL.LIZLLL);
                jSONArray.put(jSONObject);
                str2 = str3;
            }
        }
        if (str != null) {
            C017Z.LIZ.getClass();
            String strLIZ = C017Z.LIZ(str);
            JSONObject jSONObject2 = new JSONObject();
            if (strLIZ == null) {
                strLIZ = "";
            }
            jSONObject2.put("page_code", strLIZ);
            jSONObject2.put("data", new JSONObject());
            if (str2 == null) {
                str2 = "";
            }
            jSONObject2.put("btm_pre", str2);
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }

    public static C1767040w5G LIZLLL(String str, String str2, C1766990w5B c1766990w5B) throws JSONException {
        boolean z;
        Boolean bool;
        BcmParams bcmParams;
        List<String> list = C1767060w5I.LJII.getValue().deleteVideoPageConfig;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                if (a0.LJJIIZI(str, it2.next(), false)) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        BcmParams bcmParams2 = null;
        if (z) {
            bool = Boolean.FALSE;
        } else {
            List<String> list2 = C1767060w5I.LJII.getValue().needAddVideoPageConfig;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                bool = null;
            } else {
                Iterator<String> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (a0.LJJIIZI(str, it3.next(), false)) {
                        bool = Boolean.TRUE;
                        break;
                    }
                }
                bool = null;
            }
        }
        String str3 = null;
        for (String str4 : a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6)) {
            if (u.LJJIIJZLJL(str4, "b", false)) {
                str3 = str4;
            }
        }
        if (str3 == null) {
            str3 = "";
        }
        BcmParams bcmParams3 = new BcmParams();
        if (c1766990w5B != null) {
            bcmParams = c1766990w5B.LIZ;
        } else {
            bcmParams = null;
        }
        bcmParams3.merge(bcmParams);
        if (c1766990w5B != null) {
            bcmParams2 = c1766990w5B.LIZIZ;
        }
        bcmParams3.merge(bcmParams2);
        JSONObject jSONObject = bcmParams3.toJSONObject();
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            jSONObject.put("ec_is_video_page", "1");
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            jSONObject.remove("ec_is_video_page");
        }
        if (str2 == null) {
            str2 = "";
        }
        return new C1767040w5G(str, str3, str2, jSONObject);
    }
}
