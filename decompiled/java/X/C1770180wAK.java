package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.model.EcSearchGrowthInfo;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoEntranceConfig;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoEntranceRes;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideAfterWatchWord;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideConfigData;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideRequestParams;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.WithoutCartSearchStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feedbar.EcSearchFeedBarAbility;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.passive.feedbar.ability.FeedBarSearchAbility;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wAK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770180wAK {
    public static String LIZIZ;
    public static final C1770180wAK LIZ = new C1770180wAK();
    public static final Map<String, Integer> LIZJ = new LinkedHashMap();

    public static boolean LJII() {
        if (C343780Ddo.LIZIZ()) {
            C1585070rLl c1585070rLl = C1585070rLl.LIZ;
            EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.MALL;
            c1585070rLl.getClass();
            return C1585070rLl.LJFF(enumC1584360rKc, null);
        }
        C0CXC.LIZ.getClass();
        if (C0CXC.LIZ() > 0) {
            return C0CXC.LIZ() == 2;
        }
        C0CUY.LIZ.getClass();
        return C0CUY.LIZ() == 2;
    }

    public static String LIZ(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        return BtmSDK.INSTANCE.createJumpSourceBtmToken("c6053.d842854", PageFinder.via(fragment), null);
    }

    public static C1740600vOc LJFF(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        C21244318Bt c21244318Bt = new C21244318Bt();
        c21244318Bt.LIZ = "c6053.d842854";
        c21244318Bt.LIZIZ = PageFinder.via(fragment);
        c21244318Bt.LIZJ = null;
        return new C1740600vOc(c21244318Bt, null);
    }

    public static EcSearchFeedVideoEntranceConfig LJIIIIZZ(String str) {
        Type type;
        List<EcSearchFeedVideoEntranceRes> list;
        EcSearchFeedVideoEntranceRes ecSearchFeedVideoEntranceRes;
        try {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(EcSearchFeedVideoGuideConfigData.class));
                } else {
                    type = new TypeToken<EcSearchFeedVideoGuideConfigData>() { // from class: X.0wAM
                    }.getType();
                }
                Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str, type);
                if (!(objLJIIIIZZ instanceof EcSearchFeedVideoGuideConfigData)) {
                    objLJIIIIZZ = null;
                }
                EcSearchFeedVideoGuideConfigData ecSearchFeedVideoGuideConfigData = (EcSearchFeedVideoGuideConfigData) objLJIIIIZZ;
                if (ecSearchFeedVideoGuideConfigData != null && (list = ecSearchFeedVideoGuideConfigData.entranceResources) != null && (ecSearchFeedVideoEntranceRes = (EcSearchFeedVideoEntranceRes) C13LP.LJJJLL(list)) != null) {
                    return ecSearchFeedVideoEntranceRes.config;
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIZ(X.C1770220wAO r5) {
        /*
            com.google.gson.p r1 = new com.google.gson.p
            r1.<init>()
            java.lang.String r0 = r5.LIZJ
            com.google.gson.k r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.parse(r1, r0)
            r4 = 0
            if (r0 == 0) goto L19
            com.google.gson.n r1 = r0.LJIILIIL()
            java.lang.String r0 = "diversion_target_resources"
            com.google.gson.k r5 = r1.LJJIIZ(r0)
            goto L1a
        L19:
            r5 = r4
        L1a:
            com.google.gson.Gson r3 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L62
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L62
            r0.getClass()     // Catch: com.google.gson.s -> L62
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L62
            if (r0 == 0) goto L2f
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L62
            r0 = 1
            if (r1 != r0) goto L2f
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L33
            goto L3d
        L33:
            X.0wAL r0 = new X.0wAL     // Catch: com.google.gson.s -> L62
            r0.<init>()     // Catch: com.google.gson.s -> L62
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L62
            goto L56
        L3d:
            java.lang.Class<java.util.List> r2 = java.util.List.class
            X.13JX r1 = kotlin.reflect.KTypeProjection.LIZJ     // Catch: com.google.gson.s -> L62
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetRes> r0 = com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetRes.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L62
            r1.getClass()     // Catch: com.google.gson.s -> L62
            kotlin.reflect.KTypeProjection r0 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> L62
            X.13JW r0 = X.C13LE.LJFF(r2, r0)     // Catch: com.google.gson.s -> L62
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L62
        L56:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r3, r5, r0)     // Catch: com.google.gson.s -> L62
            boolean r0 = r1 instanceof java.util.List     // Catch: com.google.gson.s -> L62
            if (r0 != 0) goto L5f
            r1 = r4
        L5f:
            java.util.List r1 = (java.util.List) r1     // Catch: com.google.gson.s -> L62
            goto L67
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = r4
        L67:
            if (r1 != 0) goto L6b
            X.13BV r1 = X.C13BV.INSTANCE
        L6b:
            java.util.Iterator r3 = r1.iterator()
        L6f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetRes r0 = (com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetRes) r0
            java.lang.String r1 = r0.name
            X.0vGW r0 = X.EnumC1735580vGW.MALL_SPARKVIEW
            java.lang.String r0 = r0.getValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6f
        L8a:
            com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetRes r2 = (com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetRes) r2
            if (r2 == 0) goto L94
            com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetResCfg r0 = r2.config
            if (r0 == 0) goto L94
            java.lang.String r4 = r0.schema
        L94:
            return r4
        L95:
            r2 = r4
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1770180wAK.LJIIIZ(X.0wAO):java.lang.String");
    }

    public static boolean LJIIJJI(C1770220wAO c1770220wAO) {
        Integer num;
        WithoutCartSearchStruct withoutCartSearchStructLIZ = c1770220wAO.LIZIZ.LIZ();
        if (withoutCartSearchStructLIZ != null && (num = withoutCartSearchStructLIZ.routeScene) != null && num.intValue() != 0 && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZIZ(X.C1770220wAO r14, com.ss.android.ugc.aweme.feed.model.Aweme r15) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1770180wAK.LIZIZ(X.0wAO, com.ss.android.ugc.aweme.feed.model.Aweme):kotlin.Pair");
    }

    public static String LIZJ(C1565830qqj c1565830qqj, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1565830qqj.LIZ);
        sbLIZ.append('-');
        sbLIZ.append(c1565830qqj.LIZIZ);
        sbLIZ.append('-');
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(X.C1770220wAO r10, com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1770180wAK.LIZLLL(X.0wAO, com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public static int LJIIJ(C1770180wAK c1770180wAK, Aweme aweme) {
        Object c098200Yq;
        String aid;
        String str;
        int iIntValue;
        c1770180wAK.getClass();
        Object obj = null;
        if (aweme == null) {
            return 0;
        }
        try {
            aid = aweme.getAid();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (aid == null || aid.length() == 0) {
            return 0;
        }
        Map<String, Integer> map = LIZJ;
        Integer num = (Integer) ((LinkedHashMap) map).get(aid);
        if (num != null) {
            return num.intValue();
        }
        EcSearchGrowthInfo ecSearchGrowthInfo = aweme.getEcSearchGrowthInfo();
        if (ecSearchGrowthInfo != null) {
            str = ecSearchGrowthInfo.videoSearchRecInfo;
        } else {
            str = null;
        }
        JSONObject jSONObjectLIZIZ = C1976407og.LIZIZ(str);
        if (jSONObjectLIZIZ != null) {
            iIntValue = jSONObjectLIZIZ.optInt("sale_intent", 0);
        } else {
            iIntValue = 0;
        }
        if (C1770330wAZ.LJI && jSONObjectLIZIZ != null) {
            Integer numValueOf = Integer.valueOf(jSONObjectLIZIZ.optInt("dev_sale_intent", Integer.MIN_VALUE));
            if (numValueOf.intValue() != Integer.MIN_VALUE) {
                iIntValue = numValueOf.intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("step: obtainDevSaleIntent, aid: ");
                sbLIZ.append(aid);
                sbLIZ.append(", devSaleIntent: ");
                sbLIZ.append(iIntValue);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        if (map.size() > 30) {
            ((LinkedHashMap) map).clear();
        }
        map.put(aid, Integer.valueOf(iIntValue));
        c098200Yq = Integer.valueOf(iIntValue);
        C189200o6.m2constructorimpl(c098200Yq);
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Integer num2 = (Integer) obj;
        if (num2 == null) {
            return 0;
        }
        return num2.intValue();
    }

    public static List LJI(Aweme aweme, FeedBarSearchAbility feedBarSearchAbility, EcSearchFeedBarAbility ecSearchFeedBarAbility) {
        String str;
        C0QE4 c0qe4Og0;
        ArrayList arrayList = new ArrayList();
        if (feedBarSearchAbility == null || (c0qe4Og0 = feedBarSearchAbility.Og0()) == null || !Intrinsics.LJFF(aweme.getAid(), c0qe4Og0.LIZJ) || c0qe4Og0.LIZ.length() <= 0 || (str = c0qe4Og0.LIZ) == null) {
            if (ecSearchFeedBarAbility != null) {
                ecSearchFeedBarAbility.Zx1();
            }
            str = null;
        }
        if (C123100dR.LIZ(str) && str != null) {
            arrayList.add(new EcSearchFeedVideoGuideAfterWatchWord("feed_bar", str));
        }
        String str2 = LIZIZ;
        if (C123100dR.LIZ(str2) && str2 != null) {
            arrayList.add(new EcSearchFeedVideoGuideAfterWatchWord("comment_top", str2));
        }
        return arrayList;
    }

    public static EcSearchFeedVideoGuideRequestParams LJ(Aweme aweme, String str, C1770380wAe c1770380wAe, List list, int i, int i2, float f, String str2) {
        String str3;
        String aid = aweme.getAid();
        String str4 = "";
        if (aid == null) {
            aid = "";
        }
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        if (authorUid == null) {
            authorUid = "";
        }
        Integer numValueOf = Integer.valueOf(LJII() ? 1 : 0);
        List listSingletonList = Collections.singletonList(Integer.valueOf(c1770380wAe.LIZIZ));
        C2232408os c2232408os = C341050DYp.LIZ;
        String strLIZ = C341050DYp.LIZ(null);
        List<String> listLLLLLLLZIL = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLLLLLLZIL(20);
        Integer numValueOf2 = Integer.valueOf(i);
        EcSearchGrowthInfo ecSearchGrowthInfo = aweme.getEcSearchGrowthInfo();
        if (ecSearchGrowthInfo != null && (str3 = ecSearchGrowthInfo.videoSearchRecInfo) != null) {
            str4 = str3;
        }
        return new EcSearchFeedVideoGuideRequestParams(1, aid, authorUid, numValueOf, listSingletonList, strLIZ, listLLLLLLLZIL, list, str, numValueOf2, str4, String.valueOf(i2), String.valueOf(((int) (100 * f)) / 100.0f), str2, null, 0, 0, null, null, null, null);
    }
}
