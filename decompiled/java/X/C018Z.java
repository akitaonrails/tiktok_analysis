package X;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ranges.IntRange;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.018Z, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C018Z {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        List listLJFF = null;
        if (z) {
            return null;
        }
        try {
            listLJFF = LJFF(str);
            return listLJFF;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getCampaignGiftList error, ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("ViewerWishesSettingsWebHelper", C2188811AlT.LIZIZ(sbLIZ));
            return listLJFF;
        }
    }

    public static JavaOnlyMap LIZIZ(ImageModel imageModel) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("uri", imageModel.getUri());
        javaOnlyMap.put("url_list", imageModel.getUrls());
        javaOnlyMap.put("image_type", Integer.valueOf(imageModel.getImageType()));
        return javaOnlyMap;
    }

    public static void LIZLLL(Context context) {
        C760370TsB c760370TsBLIZ = C0KYL.LIZ("aweme://roma_redirect/?spark_page=viewer_wishes_faq");
        c760370TsBLIZ.LJIIIIZZ("bottom");
        String string = c760370TsBLIZ.LIZ().toString();
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (iHybridContainerService != null) {
            iHybridContainerService.YC1(context, string, AnonymousClass0207.get$arr$(139));
        }
    }

    public static List LJFF(String str) {
        String string = a0.LJLIIIL(str).toString();
        if (u.LJJIIJZLJL(string, e3.e, false) && u.LJIIZILJ(string, e3.f, false)) {
            JSONArray jSONArray = new JSONArray(string);
            IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, jSONArray.length());
            ArrayList arrayList = new ArrayList();
            C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
            while (it2.LLILLL) {
                String strOptString = jSONArray.optString(it2.nextInt());
                if (strOptString != null && (!a0.LJJJIL(strOptString))) {
                    arrayList.add(strOptString);
                }
            }
            return arrayList;
        }
        return C09RB.LJJII(C09RB.LJIIIZ(new C08LY(new C1939607ik(a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6)), AnonymousClass0207.get$arr$(140)), AnonymousClass0207.get$arr$(141)));
    }

    public static void LIZJ(Context context, String str) {
        C760370TsB c760370TsBLIZJ = C0KYL.LIZJ(str);
        c760370TsBLIZJ.LJJ((int) C497740JfY.LJJI(C465640INu.LIZIZ(context)), EnumC760350Ts9.DP);
        c760370TsBLIZJ.LJIIIZ((int) (100 * 0.73f), EnumC760350Ts9.PERCENT);
        c760370TsBLIZJ.LJIIIIZZ("bottom");
        String string = c760370TsBLIZJ.LIZ().toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Compliance Url = ");
        sbLIZ.append(string);
        C20441214yg.LIZIZ("ViewerWishesSettingsWebHelper", C2188811AlT.LIZIZ(sbLIZ));
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (iHybridContainerService != null) {
            iHybridContainerService.YC1(context, string, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static SparkContext LJ(Context context, String str, String str2, String str3, boolean z, String str4, List list, List list2, List list3, List list4, long j, String str5, boolean z2, long j2, long j3, String str6, String str7, boolean z3, boolean z4, long j4, long j5, long j6, long j7, List list5, String str8, String str9, List list6, int i) {
        ?? LJ;
        ArrayList arrayList;
        List<Integer> list7;
        String str10 = str8;
        List list8 = list5;
        long j8 = j7;
        long j9 = j5;
        long j10 = j4;
        boolean z5 = z3;
        String str11 = str7;
        String str12 = str6;
        long j11 = j3;
        List list9 = list6;
        long j12 = j;
        boolean z6 = z4;
        long j13 = j2;
        long j14 = j6;
        boolean z7 = z;
        if ((i & 16) != 0) {
            z7 = false;
        }
        if ((i & 1024) != 0) {
            j12 = 0;
        }
        if ((i & 8192) != 0) {
            j13 = 0;
        }
        if ((i & 16384) != 0) {
            j11 = 0;
        }
        String str13 = "";
        if ((32768 & i) != 0) {
            str12 = "";
        }
        if ((65536 & i) != 0) {
            str11 = "";
        }
        if ((131072 & i) != 0) {
            z5 = false;
        }
        if ((262144 & i) != 0) {
            z6 = false;
        }
        if ((524288 & i) != 0) {
            j10 = 0;
        }
        if ((1048576 & i) != 0) {
            j9 = 0;
        }
        if ((2097152 & i) != 0) {
            j14 = 0;
        }
        if ((4194304 & i) != 0) {
            j8 = 0;
        }
        if ((8388608 & i) != 0) {
            list8 = null;
        }
        if ((16777216 & i) != 0) {
            str10 = "";
        }
        if ((33554432 & i) == 0) {
            str13 = str9;
        }
        if ((i & 67108864) != 0) {
            list9 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("modifyGiftId = ");
        sbLIZ.append(j11);
        sbLIZ.append(", giftList = ");
        sbLIZ.append(list);
        sbLIZ.append(", currentWishGiftIds = ");
        sbLIZ.append(list4);
        sbLIZ.append(", campaignGiftList = ");
        sbLIZ.append(list9);
        sbLIZ.append(", campaignName =");
        sbLIZ.append(str10);
        C20441214yg.LIZIZ("ViewerWishesSettingsWebHelper", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Gift gift = (Gift) it2.next();
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                javaOnlyMap.put("name", gift.name);
                ImageModel imageModel = gift.image;
                if (imageModel != null) {
                    javaOnlyMap.put("image", LIZIZ(imageModel));
                }
                ImageModel imageModel2 = gift.icon;
                if (imageModel2 != null) {
                    javaOnlyMap.put("icon", LIZIZ(imageModel2));
                }
                ImageModel imageModel3 = gift.previewImage;
                if (imageModel3 != null) {
                    javaOnlyMap.put("preview_image", LIZIZ(imageModel3));
                }
                javaOnlyMap.put("describe", gift.describe);
                javaOnlyMap.put(FollowStatusChangeMethod.PARAM_UID, Long.valueOf(gift.id));
                javaOnlyMap.put("type", Integer.valueOf(gift.type));
                javaOnlyMap.put("diamond_count", Integer.valueOf(gift.diamondCount));
                javaOnlyMap.put("is_displayed_on_panel", Boolean.valueOf(gift.isDisplayedOnPanel));
                arrayList2.add(javaOnlyMap);
            }
        }
        if (list != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LJ = new LinkedHashMap(iLIZIZ);
            for (Object obj : list) {
                LJ.put(String.valueOf(((Gift) obj).id), obj);
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        if (list9 != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list9) {
                Gift gift2 = (Gift) LJ.get(obj2);
                if (gift2 == null || (list7 = gift2.giftVerticalScenarios) == null || !list7.contains(8)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        return ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, str, new C2839018b(str2, str3, str4, z7, j13, j11, str11, z5, z6, j12, j14, j8, j10, j9, str5, z2, str12, str10, str13, arrayList2, arrayList, list2, list3, list4, list8));
    }
}
