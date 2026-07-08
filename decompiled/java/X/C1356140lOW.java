package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: renamed from: X.0lOW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356140lOW {
    public static final C1356140lOW LIZ = new C1356140lOW();

    public static void LIZ(Activity activity, Aweme aweme, String str, EnumC1341630l17 enumC1341630l17, EnumC1356100lOS enumC1356100lOS, String str2, Map map, String str3) {
        String str4;
        String str5;
        if (activity == null || aweme == null) {
            return;
        }
        Map<String, String> mapFetchSearchParams = C1ER1.LIZIZ.fetchSearchParams(str3, "");
        String str6 = null;
        if (mapFetchSearchParams != null) {
            str4 = mapFetchSearchParams.get("search_keyword");
        } else {
            str4 = null;
        }
        if (mapFetchSearchParams != null) {
            str6 = mapFetchSearchParams.get("search_id");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = C1341010l07.LIZ[enumC1341630l17.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (str == null) {
                    str = AwemeExtKt.getAuthorUid(aweme);
                }
                linkedHashMap.put("user_id", str);
            } else {
                throw new C1954807lC();
            }
        } else {
            linkedHashMap.put("group_id", aweme.getAid());
            if (str4 != null && str4.length() != 0) {
                linkedHashMap.put("search_keyword", str4);
            }
            if (str6 != null && str6.length() != 0) {
                linkedHashMap.put("search_id", str6);
            }
        }
        Uri.Builder builderScheme = new Uri.Builder().scheme(C1065200dpG.LIZ().lemon8Schema);
        int i2 = C1341020l08.LIZ[enumC1341630l17.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str5 = "user_profile";
            } else {
                throw new C1954807lC();
            }
        } else {
            str5 = "article_detail_page";
        }
        Uri.Builder builderAuthority = builderScheme.authority(str5);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            builderAuthority.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderAuthority.build().toString();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("pid", str2);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("enter_page_id", aweme.getAid());
        linkedHashMap3.put("pid", str2);
        linkedHashMap3.put("enter_position", enumC1356100lOS.getValue());
        if (str4 != null && str4.length() != 0) {
            linkedHashMap3.put("query", str4);
        }
        if (str6 != null && str6.length() != 0) {
            linkedHashMap3.put("search_id", str6);
        }
        LIZ.getClass();
        linkedHashMap3.putAll(C2097608Jq.LJIIJ(new Pair("traffic_type", "tiktok_search_inapp_native"), new Pair("media_source", "tiktok_search_inapp_native"), new Pair("enter_page_type", "gallery")));
        linkedHashMap3.putAll(map);
        linkedHashMap2.put("amp_extra", C1741890vQh.LJIIIIZZ(linkedHashMap3));
        Uri.Builder builderAuthority2 = new Uri.Builder().scheme("aweme").authority(C1065200dpG.LIZ().lemon8SchemaIntro);
        builderAuthority2.appendQueryParameter("schema", string);
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            builderAuthority2.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        SmartRouter.buildRoute(activity, builderAuthority2.build().toString()).open();
    }

    public static void LIZIZ(C1356140lOW c1356140lOW, Activity activity, Aweme aweme, String str, EnumC1341630l17 enumC1341630l17, EnumC1356100lOS enumC1356100lOS, Map map, int i) {
        String str2;
        LinkedHashMap linkedHashMap;
        String string;
        String string2;
        C1397630mTR c1397630mTR;
        List<C1397650mTT> list;
        C1397650mTT c1397650mTT;
        Map linkedHashMap2 = map;
        String str3 = str;
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str2 = "tiktok_search_inapp_native";
        } else {
            str2 = null;
        }
        if ((i & 64) != 0) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = null;
        }
        if ((i & 128) != 0) {
            linkedHashMap2 = new LinkedHashMap();
        }
        c1356140lOW.getClass();
        if (activity != null && aweme != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJII = false;
            int[] iArr = C1356110lOT.LIZ;
            String str4 = "";
            switch (iArr[enumC1356100lOS.ordinal()]) {
                case 1:
                    string = activity.getString(2131850827);
                    break;
                case 2:
                    string = activity.getString(2131850822);
                    break;
                case 3:
                case 4:
                    string = activity.getString(2131850818);
                    break;
                case 5:
                    string = activity.getString(2131850829);
                    break;
                case 6:
                    Object[] objArr = new Object[1];
                    Object obj = linkedHashMap2.get("user_name");
                    if (obj == null) {
                        obj = "";
                    }
                    objArr[0] = obj;
                    string = activity.getString(2131850825, objArr);
                    break;
                case 7:
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    Object[] objArr2 = new Object[1];
                    Object obj2 = linkedHashMap2.get("user_name");
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    objArr2[0] = obj2;
                    string = activity.getString(2131850816, objArr2);
                    break;
                default:
                    string = "";
                    break;
            }
            c1397580mTM.LJI(string);
            switch (iArr[enumC1356100lOS.ordinal()]) {
                case 1:
                    string2 = activity.getString(2131850826);
                    break;
                case 2:
                    string2 = activity.getString(2131850821);
                    break;
                case 3:
                case 4:
                    string2 = activity.getString(2131850817);
                    break;
                case 5:
                    string2 = activity.getString(2131850828);
                    break;
                case 6:
                    Object[] objArr3 = new Object[1];
                    Object obj3 = linkedHashMap2.get("user_name");
                    if (obj3 == null) {
                        obj3 = "";
                    }
                    objArr3[0] = obj3;
                    string2 = activity.getString(2131850824, objArr3);
                    break;
                case 7:
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    string2 = activity.getString(2131850815);
                    break;
                default:
                    string2 = "";
                    break;
            }
            c1397580mTM.LIZIZ(string2);
            C1238130iKB.LIZ(c1397580mTM, new C1356180lOa(c1397580mTM, activity, aweme, str3, enumC1341630l17, enumC1356100lOS, str2, linkedHashMap, linkedHashMap2));
            C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
            AbstractC1391450mJT abstractC1391450mJTLJII = c1397510mTF.LJII();
            if ((abstractC1391450mJTLJII instanceof C1397630mTR) && (c1397630mTR = (C1397630mTR) abstractC1391450mJTLJII) != null && (list = c1397630mTR.LJ) != null && (c1397650mTT = (C1397650mTT) ListProtector.get(list, 0)) != null) {
                c1397650mTT.LIZ(AFwS228S0000000_1.get$arr$(758));
            }
            c1397510mTF.LIZLLL();
            C1356160lOY c1356160lOY = C1356160lOY.LIZ;
            String str5 = (String) linkedHashMap2.get("enter_from");
            if (str5 == null) {
                str5 = "";
            }
            String value = enumC1356100lOS.getValue();
            c1356160lOY.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1355960lOE.LIZLLL(c2344009Gk, aweme);
            C1355960lOE.LIZ(c2344009Gk, aweme);
            c2344009Gk.LJFF("enter_from", str5);
            c2344009Gk.LJFF("enter_method", value);
            C641850PFn.LIZ(c2344009Gk, C1ER1.LIZIZ.fetchSearchParams(str5, ""));
            C20684815ws.LJIILLIIL("lemon8_download_popup_show", c2344009Gk.LIZ);
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            String value2 = enumC1356100lOS.getValue();
            String str6 = (String) linkedHashMap2.get("comment_id");
            if (str6 != null) {
                str4 = str6;
            }
            C1356160lOY.LJ(c1356160lOY, aid, "lemon8_detail_popup", value2, str4, 5);
        }
    }
}
