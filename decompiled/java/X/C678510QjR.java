package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678510QjR {
    public final HashMap<String, ArrayList<AbstractC677840QiM>> LIZ = new HashMap<>();
    public final ArrayList<InterfaceC678570QjX> LIZIZ;

    public C678510QjR() {
        ArrayList<InterfaceC678570QjX> arrayList = new ArrayList<>();
        this.LIZIZ = arrayList;
        arrayList.add(new InterfaceC678570QjX() { // from class: X.0QjV
            public final ArrayList<String> LIZ = C1697810uHb.LJ("search_result_show", "tiktokec_product_show", "ecom_search_id_stay_time", "play_time");
            public String LIZIZ;
            public String LIZJ;

            @Override // X.InterfaceC678570QjX
            public final String LIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC678570QjX
            public final String getErrorMsg() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC678570QjX
            public final boolean LIZIZ(String str, JSONObject jSONObject) {
                return this.LIZ.contains(str);
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC678570QjX
            public final boolean LIZJ(String str, JSONObject jSONObject) {
                String strOptString;
                String strOptString2;
                String strOptString3;
                String strOptString4;
                Long lValueOf;
                boolean z;
                String strOptString5 = null;
                Long lValueOf2 = null;
                String strOptString6 = null;
                switch (str.hashCode()) {
                    case -1945219564:
                        if (!str.equals("tiktokec_product_show")) {
                            return true;
                        }
                        break;
                    case -1877516040:
                        if (str.equals("play_time")) {
                            if (jSONObject != null) {
                                strOptString3 = jSONObject.optString("search_id");
                                strOptString4 = jSONObject.optString("search_result_id");
                                lValueOf = Long.valueOf(jSONObject.optLong("duration"));
                                lValueOf2 = Long.valueOf(jSONObject.optLong("staytime"));
                            } else {
                                strOptString3 = null;
                                strOptString4 = null;
                                lValueOf = null;
                            }
                            this.LIZJ = "";
                            if (strOptString3 != null && strOptString3.length() != 0) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(this.LIZJ);
                                sbLIZ.append("search_id: ");
                                sbLIZ.append(strOptString3);
                                sbLIZ.append(" Algorithm parameter verification fails. The value cannot be empty. Please check\n");
                                this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
                            }
                            if (strOptString4 == null || strOptString4.length() == 0) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append(this.LIZJ);
                                sbLIZ2.append("search_result_id: ");
                                sbLIZ2.append(strOptString4);
                                sbLIZ2.append(" Algorithm parameter verification fails. The value cannot be empty. Please check\n");
                                this.LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
                            }
                            if (lValueOf == null || lValueOf.longValue() <= 0) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append(this.LIZJ);
                                sbLIZ3.append("duration: ");
                                sbLIZ3.append(lValueOf);
                                sbLIZ3.append(" Algorithm parameter verification fails. The value cannot be empty. Please check\n");
                                this.LIZJ = C2188811AlT.LIZIZ(sbLIZ3);
                            }
                            if (lValueOf2 == null || lValueOf2.longValue() <= 0) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append(this.LIZJ);
                                sbLIZ4.append("staytime: ");
                                sbLIZ4.append(lValueOf2);
                                sbLIZ4.append(" Algorithm parameter verification fails. The value cannot be empty. Please check\n");
                                this.LIZJ = C2188811AlT.LIZIZ(sbLIZ4);
                            }
                            this.LIZIZ = str;
                            String str2 = this.LIZJ;
                            if (str2 != null && str2.length() != 0) {
                                return false;
                            }
                            return true;
                        }
                        return true;
                    case -1787830840:
                        if (!str.equals("search_result_show")) {
                            return true;
                        }
                        break;
                    case 1096142403:
                        if (str.equals("ecom_search_id_stay_time")) {
                            if (jSONObject != null && (strOptString6 = jSONObject.optString("search_id")) != null && strOptString6.length() != 0) {
                                return true;
                            }
                            this.LIZIZ = str;
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("search_id: ");
                            sbLIZ5.append(strOptString6);
                            sbLIZ5.append("\n Algorithm parameter verification fails. The value cannot be empty. Please check");
                            this.LIZJ = C2188811AlT.LIZIZ(sbLIZ5);
                            return false;
                        }
                        return true;
                    default:
                        return true;
                }
                if (jSONObject != null) {
                    strOptString = jSONObject.optString("search_id");
                    strOptString2 = jSONObject.optString("search_result_id");
                    strOptString5 = jSONObject.optString("enter_from");
                } else {
                    strOptString = null;
                    strOptString2 = null;
                }
                if (strOptString != null && strOptString.length() != 0 && strOptString2 != null && strOptString2.length() != 0 && strOptString5 != null && strOptString5.length() != 0) {
                    return true;
                }
                this.LIZIZ = str;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("search_id: ");
                sbLIZ6.append(strOptString);
                sbLIZ6.append("\nsearch_result_id: ");
                sbLIZ6.append(strOptString2);
                sbLIZ6.append("\nenter_from: ");
                sbLIZ6.append(strOptString5);
                sbLIZ6.append("\n The parameter value cannot be empty. Please check");
                this.LIZJ = C2188811AlT.LIZIZ(sbLIZ6);
                return false;
            }
        });
        arrayList.add(new InterfaceC678570QjX() { // from class: X.0QjU
            public String LIZIZ;
            public String LIZJ;
            public final ArrayList<String> LIZ = C1697810uHb.LJ("search_result_show", "tiktokec_product_show");
            public final Map<String, Integer> LIZLLL = new LinkedHashMap();

            @Override // X.InterfaceC678570QjX
            public final String LIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC678570QjX
            public final String getErrorMsg() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC678570QjX
            public final boolean LIZIZ(String str, JSONObject jSONObject) {
                return this.LIZ.contains(str);
            }

            @Override // X.InterfaceC678570QjX
            public final boolean LIZJ(String str, JSONObject jSONObject) {
                String strOptString;
                int iIntValue;
                String strOptString2 = null;
                if (jSONObject != null) {
                    strOptString = jSONObject.optString("search_id");
                    strOptString2 = jSONObject.optString("search_result_id");
                } else {
                    strOptString = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strOptString);
                sbLIZ.append('-');
                sbLIZ.append(strOptString2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                Map<String, Integer> map = this.LIZLLL;
                Integer num = (Integer) ((LinkedHashMap) map).get(strLIZIZ);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                map.put(strLIZIZ, Integer.valueOf(iIntValue));
                Integer num2 = (Integer) ((LinkedHashMap) this.LIZLLL).get(strLIZIZ);
                if (num2 == null || num2.intValue() <= 1) {
                    return true;
                }
                this.LIZIZ = str;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Repeat reporting search_id: ");
                sbLIZ2.append(strOptString);
                sbLIZ2.append("\nsearch_result_id: ");
                sbLIZ2.append(strOptString2);
                sbLIZ2.append("\n Parameter error, please check");
                this.LIZJ = C2188811AlT.LIZIZ(sbLIZ2);
                return false;
            }
        });
        arrayList.add(new InterfaceC678570QjX(this) { // from class: X.0QjT
            public final C678510QjR LIZ;
            public final ArrayList<String> LIZIZ = C1697810uHb.LJ("search_result_show", "search_result_click", "tiktokec_product_show", "tiktokec_product_click");
            public final ArrayList<String> LIZJ = C1697810uHb.LJ("mt_goods", "recommendation_card");
            public String LIZLLL;
            public String LJ;

            @Override // X.InterfaceC678570QjX
            public final String LIZ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC678570QjX
            public final String getErrorMsg() {
                return this.LJ;
            }

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC678570QjX
            public final boolean LIZIZ(String str, JSONObject jSONObject) {
                String strOptString;
                if (this.LIZIZ.contains(str)) {
                    ArrayList<String> arrayList2 = this.LIZJ;
                    if (jSONObject != null) {
                        strOptString = jSONObject.optString("token_type");
                    } else {
                        strOptString = null;
                    }
                    if (C13LP.LJJJJ(strOptString, arrayList2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC678570QjX
            public final boolean LIZJ(String str, JSONObject jSONObject) {
                String strOptString;
                String strOptString2;
                ArrayList<AbstractC677840QiM> arrayList2;
                String strLIZJ;
                k kVar;
                n nVarLIZ;
                String strOptString3 = null;
                if (jSONObject != null) {
                    strOptString = jSONObject.optString("search_id");
                } else {
                    strOptString = null;
                }
                if (jSONObject != null) {
                    strOptString2 = jSONObject.optString("search_result_id");
                } else {
                    strOptString2 = null;
                }
                HashMap<String, ArrayList<AbstractC677840QiM>> map = this.LIZ.LIZ;
                if (map != null && (arrayList2 = map.get(strOptString)) != null) {
                    Iterator<AbstractC677840QiM> it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        AbstractC677840QiM next = it2.next();
                        AbstractC677870QiP abstractC677870QiP = next.LL;
                        if (abstractC677870QiP != null && (kVar = abstractC677870QiP.LJFF) != null && (nVarLIZ = C678560QjW.LIZ(kVar.LJIILIIL(), "raw_data")) != null) {
                            strLIZJ = C678560QjW.LIZJ(nVarLIZ, "search_result_id");
                        } else {
                            strLIZJ = null;
                        }
                        if (Intrinsics.LJFF(strLIZJ, strOptString2)) {
                            if (next != null) {
                                return true;
                            }
                        }
                    }
                }
                if (jSONObject != null) {
                    strOptString3 = jSONObject.optString("token_type");
                }
                this.LIZLLL = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tokenType:");
                sbLIZ.append(strOptString3);
                sbLIZ.append("\nsearch_id: ");
                sbLIZ.append(strOptString);
                sbLIZ.append("\nsearch_result_id: ");
                sbLIZ.append(strOptString2);
                sbLIZ.append("\n Please check params~");
                this.LJ = C2188811AlT.LIZIZ(sbLIZ);
                return false;
            }
        });
        arrayList.add(new InterfaceC678570QjX(this) { // from class: X.0QjS
            public final C678510QjR LIZ;
            public final ArrayList<String> LIZIZ = C1697810uHb.LJ("search_result_show", "search_result_click", "tiktokec_product_show", "tiktokec_product_click");
            public final ArrayList<String> LIZJ = C1697810uHb.LJ("shop_card", "showcase_card");
            public String LIZLLL;
            public String LJ;

            @Override // X.InterfaceC678570QjX
            public final String LIZ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC678570QjX
            public final String getErrorMsg() {
                return this.LJ;
            }

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC678570QjX
            public final boolean LIZIZ(String str, JSONObject jSONObject) {
                String strOptString;
                if (this.LIZIZ.contains(str)) {
                    ArrayList<String> arrayList2 = this.LIZJ;
                    if (jSONObject != null) {
                        strOptString = jSONObject.optString("rd_click_origin_type");
                    } else {
                        strOptString = null;
                    }
                    if (C13LP.LJJJJ(strOptString, arrayList2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC678570QjX
            public final boolean LIZJ(String str, JSONObject jSONObject) {
                String strOptString;
                String strOptString2;
                String strOptString3;
                ArrayList<AbstractC677840QiM> arrayList2;
                k kVar;
                n nVarLIZ;
                k kVarLJJIIJZLJL;
                k kVar2;
                n nVarLIZ2;
                k kVarLJJIIJZLJL2;
                String strOptString4 = null;
                if (jSONObject != null) {
                    strOptString = jSONObject.optString("search_id");
                    strOptString2 = jSONObject.optString("search_result_id");
                    strOptString3 = jSONObject.optString("rd_click_origin_type");
                } else {
                    strOptString = null;
                    strOptString2 = null;
                    strOptString3 = null;
                }
                HashMap<String, ArrayList<AbstractC677840QiM>> map = this.LIZ.LIZ;
                if (map != null && (arrayList2 = map.get(strOptString)) != null) {
                    Iterator<AbstractC677840QiM> it2 = arrayList2.iterator();
                    if (it2.hasNext()) {
                        AbstractC677840QiM next = it2.next();
                        if (Intrinsics.LJFF(strOptString3, "shop_card")) {
                            AbstractC677870QiP abstractC677870QiP = next.LL;
                            if (abstractC677870QiP != null && (kVar2 = abstractC677870QiP.LJFF) != null && (nVarLIZ2 = C678560QjW.LIZ(kVar2.LJIILIIL(), "raw_data")) != null) {
                                try {
                                    h hVarLJJIIZI = nVarLIZ2.LJJIIZI("e_com_shop_card_items");
                                    if (hVarLJJIIZI != null && (kVarLJJIIJZLJL2 = hVarLJJIIZI.LJJIIJZLJL(0)) != null) {
                                        strOptString4 = C678560QjW.LIZJ(kVarLJJIIJZLJL2.LJIILIIL(), "shop_id");
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            return Intrinsics.LJFF(strOptString4, strOptString2);
                        }
                        if (!Intrinsics.LJFF(strOptString3, "showcase_card")) {
                            return false;
                        }
                        AbstractC677870QiP abstractC677870QiP2 = next.LL;
                        if (abstractC677870QiP2 != null && (kVar = abstractC677870QiP2.LJFF) != null && (nVarLIZ = C678560QjW.LIZ(kVar.LJIILIIL(), "raw_data")) != null) {
                            try {
                                h hVarLJJIIZI2 = nVarLIZ.LJJIIZI("e_com_shop_card_items");
                                if (hVarLJJIIZI2 != null && (kVarLJJIIJZLJL = hVarLJJIIZI2.LJJIIJZLJL(0)) != null) {
                                    strOptString4 = C678560QjW.LIZJ(kVarLJJIIJZLJL.LJIILIIL(), "author_id_string");
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        return Intrinsics.LJFF(strOptString4, strOptString2);
                    }
                }
                if (jSONObject != null) {
                    strOptString4 = jSONObject.optString("token_type");
                }
                this.LIZLLL = str;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AddressingCard verification tokenType:");
                sbLIZ.append(strOptString4);
                sbLIZ.append("\nsearch_id: ");
                sbLIZ.append(strOptString);
                sbLIZ.append("\nsearch_result_id: ");
                sbLIZ.append(strOptString2);
                sbLIZ.append("\n Parameter error, please check");
                this.LJ = C2188811AlT.LIZIZ(sbLIZ);
                return false;
            }
        });
    }

    public final void LIZJ(List<? extends AbstractC677840QiM> list) {
        C677890QiR c677890QiR;
        n nVar;
        String strLIZJ;
        try {
            if (!list.isEmpty() && (c677890QiR = list.get(0).LLILLL) != null && (nVar = c677890QiR.LIZIZ) != null && (strLIZJ = C678560QjW.LIZJ(nVar, "search_id")) != null && strLIZJ.length() > 0) {
                this.LIZ.put(strLIZJ, (ArrayList) list);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZ(String str, List<? extends AbstractC677840QiM> list) {
        n nVar;
        String strLIZJ;
        ArrayList<AbstractC677840QiM> arrayList;
        try {
            if (list.isEmpty()) {
                return;
            }
            if (str != null && str.length() > 0) {
                ArrayList<AbstractC677840QiM> arrayList2 = this.LIZ.get(str);
                if (arrayList2 != null) {
                    arrayList2.addAll((ArrayList) list);
                    return;
                }
                return;
            }
            C677890QiR c677890QiR = list.get(0).LLILLL;
            if (c677890QiR != null && (nVar = c677890QiR.LIZIZ) != null && (strLIZJ = C678560QjW.LIZJ(nVar, "search_id")) != null && strLIZJ.length() > 0 && (arrayList = this.LIZ.get(strLIZJ)) != null) {
                arrayList.addAll((ArrayList) list);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        Object objOpt;
        if (jSONObject != null) {
            objOpt = jSONObject.opt("rd_mixed_page");
        } else {
            objOpt = null;
        }
        if (!Intrinsics.LJFF(objOpt, "1")) {
            return;
        }
        for (InterfaceC678570QjX interfaceC678570QjX : this.LIZIZ) {
            if (interfaceC678570QjX.LIZIZ(str, jSONObject) && !interfaceC678570QjX.LIZJ(str, jSONObject)) {
                C305190Bxl.LIZ(new AwS554S0100000_10(interfaceC678570QjX, 1033));
            }
        }
    }
}
