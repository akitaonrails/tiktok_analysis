package X;

import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.bytedance.android.btm.impl.setting.PreModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.18EC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(PageInfo pageInfo, int i, JSONArray jSONArray) {
        if (pageInfo.getStep() == 1) {
            FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
            featureModelLIZJ.getClass();
            ArrayList arrayListLIZ = C1972007ny.LIZ(featureModelLIZJ, featureModelLIZJ.brokenLinkBtmList, String.class, "broken_link_btm_list");
            featureModelLIZJ.brokenLinkBtmList = arrayListLIZ;
            if (C13LP.LJJJJ(pageInfo.getPageBtm(), arrayListLIZ)) {
                C18CE.LJI(2107, pageInfo, null, null, new C21253618Fi(jSONArray, i), null, 188);
            }
        }
    }

    public static void LIZIZ(PageInfo pageInfo, int i, JSONArray jSONArray) {
        String str;
        long jLongValue;
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        ArrayList<PreModel> arrayListLIZ = C1972007ny.LIZ(featureModelLIZJ, featureModelLIZJ.incorrectBtmPre, PreModel.class, "incorrect_btm_pre");
        featureModelLIZJ.incorrectBtmPre = arrayListLIZ;
        for (PreModel preModel : arrayListLIZ) {
            if (Intrinsics.LJFF(preModel.LIZ(), pageInfo.getPageBtm())) {
                Regex regex = C18C3.LIZ;
                String strLJII = C18C3.LJII(pageInfo.getBtmPre());
                if (strLJII != null) {
                    Iterator<String> it2 = preModel.LIZIZ().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (a0.LJJIIZI(strLJII, it2.next(), false)) {
                            C21246818Cs c21246818CsLJFF = C21248618Dk.LIZ.LJFF(pageInfo.getBtmPre());
                            if (c21246818CsLJFF != null) {
                                str = c21246818CsLJFF.LIZ;
                            } else {
                                str = null;
                            }
                            C21241518Ar chainRecorderExp = BtmServiceImpl.INSTANCE.getChainRecorderExp();
                            chainRecorderExp.getClass();
                            if (str != null && str.length() != 0) {
                                Long l = chainRecorderExp.LJI.get(str);
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                            } else {
                                jLongValue = -1;
                            }
                            C18CE.LJI(2503, pageInfo, null, null, new C21253718Fj(i, jSONArray, jLongValue), new C21255118Fx(jLongValue), 60);
                        }
                    }
                }
            }
        }
    }

    public static void LIZJ(PageInfo pageInfo, int i, JSONArray jSONArray) {
        FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
        featureModelLIZJ.getClass();
        ArrayList<PreModel> arrayListLIZ = C1972007ny.LIZ(featureModelLIZJ, featureModelLIZJ.preCDNonNull, PreModel.class, "pre_cd_non_null");
        featureModelLIZJ.preCDNonNull = arrayListLIZ;
        for (PreModel preModel : arrayListLIZ) {
            if (Intrinsics.LJFF(preModel.LIZ(), pageInfo.getPageBtm())) {
                List<String> listLIZIZ = preModel.LIZIZ();
                Regex regex = C18C3.LIZ;
                String strLIZJ = C18C3.LIZJ(pageInfo.getBtmPre());
                if (strLIZJ != null) {
                    Iterator<String> it2 = listLIZIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (a0.LJJIIZI(it2.next(), strLIZJ, false)) {
                            String btmPre = pageInfo.getBtmPre();
                            if (btmPre != null && a0.LJJIIZI(btmPre, "c0.d0.", false)) {
                                C18CE.LJI(2012, pageInfo, null, null, new C21253818Fk(jSONArray, i), null, 188);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void LIZLLL(PageInfo pageInfo, int i, JSONArray jSONArray, int i2) {
        if (i != 0 && jSONArray != null && i2 > 0) {
            FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
            featureModelLIZJ.getClass();
            ArrayList arrayListLIZ = C1972007ny.LIZ(featureModelLIZJ, featureModelLIZJ.noUnknownPrePage, String.class, "page_need_check_previous_unknown");
            featureModelLIZJ.noUnknownPrePage = arrayListLIZ;
            String pageBtm = pageInfo.getPageBtm();
            if (pageBtm == null) {
                pageBtm = "";
            }
            if (arrayListLIZ.contains(pageBtm)) {
                C18CE.LJI(2008, pageInfo, null, null, new C21255218Fy(jSONArray), null, 188);
            }
            int i3 = 0;
            do {
                String strOptString = jSONArray.optString(i3);
                FeatureModel featureModelLIZJ2 = C18CS.LIZ.LIZJ();
                featureModelLIZJ2.getClass();
                ArrayList arrayListLIZ2 = C1972007ny.LIZ(featureModelLIZJ2, featureModelLIZJ2.noUnknownClass, String.class, "prefix_need_check_unknown");
                featureModelLIZJ2.noUnknownClass = arrayListLIZ2;
                Iterator it2 = arrayListLIZ2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (a0.LJJIIZI(strOptString, (String) it2.next(), false)) {
                        C18CE.LJI(2007, pageInfo, null, null, new C18GK(strOptString), null, 188);
                        break;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
    }
}
