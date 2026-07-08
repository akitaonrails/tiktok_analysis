package X;

import Y.ARunnableS15S1100000_10;
import Y.ARunnableS3S1201000_10;
import android.content.Context;
import android.net.Uri;
import android.util.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lynx.core.config.LynxNonFirstScreenPreLayoutConfig;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.LynxSSRInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderCard;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.tiktok.forestx.RequestParamsX;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS126S1200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0PaW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C647500PaW {
    public static final C647500PaW LIZ = new C647500PaW();
    public static final Map<String, Boolean> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair("hitPreload", Boolean.TRUE), new Pair("isReload", Boolean.FALSE));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(405));
    public static final Map<String, Integer> LIZLLL;
    public static C2250481D6o LJ;
    public static final C01GW LJFF;
    public static final C01GW LJI;
    public static final C01GW LJII;
    public static final C01GW LJIIIIZZ;
    public static final C01GW LJIIIZ;
    public static final C01GW LJIIJ;
    public static final ArrayMap<C1537720q7O, AbstractC1542100qES> LJIIJJI;
    public static final C01GW LJIIL;

    static {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("search-video", Integer.valueOf(R.layout.f4p));
        pairArr[1] = new Pair("search-live", Integer.valueOf(R.layout.f4l));
        pairArr[2] = new Pair("search-list", Integer.valueOf(R.layout.f4k));
        pairArr[3] = new Pair("search-markdown", Integer.valueOf(C301250BrP.LIZ() ? R.layout.f4o : C301240BrO.LIZ() ? R.layout.f4n : R.layout.f4m));
        LIZLLL = C2097608Jq.LJIIIIZZ(pairArr);
        LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(407));
        LJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(406));
        LJII = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(410));
        LJIIIIZZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(412));
        LJIIIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(408));
        LJIIJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(411));
        LJIIJJI = new ArrayMap<>();
        LJIIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(409));
    }

    public static void LIZJ() {
        Iterator it2 = ((ConcurrentHashMap) LJIIJ.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            C647140PZw.LIZ.LIZJ(((Number) ((Pair) ((Map.Entry) it2.next()).getValue()).getFirst()).intValue());
        }
        ((ConcurrentHashMap) LJIIJ.getValue()).clear();
    }

    public static ConcurrentHashMap LJII() {
        return (ConcurrentHashMap) LJI.getValue();
    }

    public static ConcurrentHashMap LJIIL() {
        return (ConcurrentHashMap) LJIIIIZZ.getValue();
    }

    public static void LJ(Fragment fragment) {
        C290060BYm.LIZ.getClass();
        if (C290060BYm.LIZ()) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ((ConcurrentHashMap) LJFF.getValue()).remove(Integer.valueOf(fragment.hashCode()));
            if (((Boolean) C1108304Vd.LIZ.getValue()).booleanValue() && concurrentHashMap != null) {
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    C2250481D6o c2250481D6o = LJ;
                    if (c2250481D6o != null) {
                        c2250481D6o.LIZIZ.LIZLLL((String) entry.getKey());
                    }
                }
            }
            if (((ConcurrentHashMap) LJFF.getValue()).size() == 0) {
                C2250481D6o c2250481D6o2 = LJ;
                if (c2250481D6o2 != null) {
                    c2250481D6o2.LIZIZ.LIZJ.evictAll();
                }
                C2250481D6o c2250481D6o3 = LJ;
                if (c2250481D6o3 != null) {
                    c2250481D6o3.LIZ();
                }
                LJ = null;
                LJIIL().clear();
            }
            if (C0BYC.LIZ()) {
                if (concurrentHashMap != null) {
                    Iterator it2 = concurrentHashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        C1537720q7O c1537720q7O = ((C647530PaZ) ((Map.Entry) it2.next()).getValue()).LIZIZ;
                        if (c1537720q7O != null) {
                            c1537720q7O.LLD(true);
                        }
                    }
                    concurrentHashMap.clear();
                }
            } else if (concurrentHashMap != null) {
                Iterator it3 = concurrentHashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    C1537720q7O c1537720q7O2 = ((C647530PaZ) ((Map.Entry) it3.next()).getValue()).LIZIZ;
                    if (c1537720q7O2 != null) {
                        c1537720q7O2.LLD(true);
                    }
                }
                concurrentHashMap.clear();
            }
            LIZJ();
            return;
        }
        C2250481D6o c2250481D6o4 = LJ;
        if (c2250481D6o4 != null) {
            c2250481D6o4.LIZIZ.LIZJ.evictAll();
        }
        C2250481D6o c2250481D6o5 = LJ;
        if (c2250481D6o5 != null) {
            c2250481D6o5.LIZ();
        }
        LJ = null;
        if (C0BYC.LIZ()) {
            Iterator it4 = LJII().entrySet().iterator();
            while (it4.hasNext()) {
                C1537720q7O c1537720q7O3 = ((C647530PaZ) ((Map.Entry) it4.next()).getValue()).LIZIZ;
                if (c1537720q7O3 != null) {
                    c1537720q7O3.LLD(true);
                }
            }
        } else {
            Iterator it5 = LJII().entrySet().iterator();
            while (it5.hasNext()) {
                C1537720q7O c1537720q7O4 = ((C647530PaZ) ((Map.Entry) it5.next()).getValue()).LIZIZ;
                if (c1537720q7O4 != null) {
                    c1537720q7O4.LLD(true);
                }
            }
        }
        LJII().clear();
        LJIIL().clear();
        if (C0BY4.LIZIZ()) {
            try {
                Iterator it6 = ((ConcurrentHashMap) LJII.getValue()).entrySet().iterator();
                while (it6.hasNext()) {
                    C1533900q1E.LIZ((C1533900q1E) ((Map.Entry) it6.next()).getValue(), true, 2);
                }
                ((ConcurrentHashMap) LJII.getValue()).clear();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LIZJ();
    }

    public static ConcurrentHashMap LJIIIIZZ(Fragment fragment) {
        C290060BYm.LIZ.getClass();
        if (C290060BYm.LIZ()) {
            if (fragment != null) {
                LIZ.getClass();
                return (ConcurrentHashMap) ((ConcurrentHashMap) LJFF.getValue()).get(Integer.valueOf(fragment.hashCode()));
            }
            return null;
        }
        return LJII();
    }

    public static C1533900q1E LJIIJJI(String str) {
        return (C1533900q1E) ((ConcurrentHashMap) LJII.getValue()).get(LJIIJ(str, false));
    }

    public static boolean LJIILL(C647530PaZ c647530PaZ) {
        boolean z;
        String str;
        C0PAT.LIZ.getClass();
        if (C0PAT.LJFF().enableSyncRenderWithoutCallback == 1) {
            z = true;
        } else {
            z = false;
        }
        C0PGD c0pgd = null;
        if (!z) {
            if (c647530PaZ != null) {
                str = c647530PaZ.LIZ;
            } else {
                str = null;
            }
            if (!C647620Pai.LIZ(str)) {
                return false;
            }
        }
        if (c647530PaZ != null) {
            c0pgd = c647530PaZ.LJIIJJI;
        }
        if (c0pgd != C0PGD.FIRST_SCREEN) {
            return false;
        }
        return true;
    }

    public static boolean LJIILLIIL(String str) {
        String strLJIIJ = LJIIJ(str, true);
        C639540P6q.LIZ.getClass();
        C01GW c01gw = C639540P6q.LIZJ;
        if (((LynxNonFirstScreenPreLayoutConfig) c01gw.getValue()).nonFirstScreenPreLayoutBlackBundleList.contains(strLJIIJ)) {
            return false;
        }
        if (((LynxNonFirstScreenPreLayoutConfig) c01gw.getValue()).nonFirstScreenPreLayoutBundleList.contains("ALL_CARDS_PAGES")) {
            return true;
        }
        return ((LynxNonFirstScreenPreLayoutConfig) c01gw.getValue()).nonFirstScreenPreLayoutBundleList.contains(strLJIIJ);
    }

    public static boolean LJIIZILJ(String str) {
        String strLJIIJ = LJIIJ(str, true);
        C0PAT c0pat = C0PAT.LIZ;
        c0pat.getClass();
        List list = C0PAT.LJFF().preLayoutAfterRequestBlackBundleList;
        if (!C0PAT.LJI() || list == null) {
            list = C13BV.INSTANCE;
        }
        if (list.contains(strLJIIJ)) {
            return false;
        }
        List list2 = C0PAT.LJFF().preLayoutAfterRequestBundleList;
        c0pat.getClass();
        if (!C0PAT.LJI() || list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        if (list2.contains("ALL_CARDS_PAGES")) {
            return true;
        }
        List list3 = C0PAT.LJFF().preLayoutAfterRequestBundleList;
        c0pat.getClass();
        if (!C0PAT.LJI() || list3 == null) {
            list3 = C13BV.INSTANCE;
        }
        return list3.contains(strLJIIJ);
    }

    public static boolean LJIJ(String str) {
        String strLJIIJ = LJIIJ(str, false);
        C0PAT.LIZ.getClass();
        List<String> listLIZJ = C0PAT.LIZJ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
        for (String str2 : listLIZJ) {
            LIZ.getClass();
            arrayList.add(LJIIJ(str2, false));
        }
        return arrayList.contains(strLJIIJ);
    }

    public static boolean LJIJJ(String str) {
        String strLJIIJ = LJIIJ(str, false);
        C0PAT.LIZ.getClass();
        List<String> listLJ = C0PAT.LJ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
        for (String str2 : listLJ) {
            LIZ.getClass();
            arrayList.add(LJIIJ(str2, false));
        }
        return arrayList.contains(strLJIIJ);
    }

    public static void LJIL(List list) {
        boolean z;
        LynxSSRInfo lynxSSRInfo;
        String str;
        if (!C0BY4.LIZIZ()) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PreRenderCard preRenderCard = (PreRenderCard) it2.next();
            try {
                LynxSSRInfo lynxSSRInfo2 = preRenderCard.lynxSSRInfo;
                if (lynxSSRInfo2 == null || (str = lynxSSRInfo2.extra) == null || !C123100dR.LIZ(str)) {
                    z = false;
                } else {
                    z = true;
                }
                String str2 = null;
                if (z && (C0BY4.LIZ() == 1 || C0BY4.LIZ() == 2)) {
                    C1539410qA7 c1539410qA7 = C1539410qA7.LIZ;
                    LynxSSRInfo lynxSSRInfo3 = preRenderCard.lynxSSRInfo;
                    if (lynxSSRInfo3 != null) {
                        str2 = lynxSSRInfo3.extra;
                    }
                    c1539410qA7.getClass();
                    String str3 = (String) C1539410qA7.LIZJ(str2).get("hydrateUrl");
                    C647500PaW c647500PaW = LIZ;
                    EnumC1533980q1M enumC1533980q1M = EnumC1533980q1M.LYNX_SSR_TEMPLATE;
                    c647500PaW.getClass();
                    LJJIIJZLJL(str3, enumC1533980q1M);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preFetchHydrateUrl: ");
                    sbLIZ.append(str3);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                lynxSSRInfo = preRenderCard.lynxSSRInfo;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (lynxSSRInfo == null || lynxSSRInfo.extra == null) {
                String str4 = preRenderCard.lynxSchema;
                if (str4 != null && C123100dR.LIZ(str4) && C0BY4.LIZ() == 2) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(preRenderCard.lynxSchema), "url");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                    }
                    C647500PaW c647500PaW2 = LIZ;
                    EnumC1533980q1M enumC1533980q1M2 = EnumC1533980q1M.LYNX_TEMPLATE;
                    c647500PaW2.getClass();
                    LJJIIJZLJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, enumC1533980q1M2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("preFetchUrl: ");
                    sbLIZ2.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        }
    }

    public static Map LIZLLL(String str, Map map) {
        Map mapLIZIZ = C647610Pah.LIZIZ(str);
        try {
            if (C647610Pah.LIZIZ(str) != null) {
                C647380PaK.LJIIIIZZ.getClass();
                if (C647380PaK.LJIIJJI(str) && mapLIZIZ != null) {
                    return C649540Pdo.LIZIZ(mapLIZIZ, map);
                }
            }
            return map;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return map;
        }
    }

    public static boolean LJFF(Fragment fragment, String str) {
        String strLJIIJ = LJIIJ(str, false);
        ConcurrentHashMap concurrentHashMapLJIIIIZZ = LJIIIIZZ(fragment);
        if (concurrentHashMapLJIIIIZZ == null || concurrentHashMapLJIIIIZZ.get(strLJIIJ) == null) {
            return false;
        }
        return true;
    }

    public static C647530PaZ LJI(Fragment fragment, String str) {
        int iHashCode;
        C290060BYm.LIZ.getClass();
        if (C290060BYm.LIZ()) {
            LIZ.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LJFF.getValue();
            if (fragment != null) {
                iHashCode = fragment.hashCode();
            } else {
                iHashCode = 0;
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) concurrentHashMap.get(Integer.valueOf(iHashCode));
            if (concurrentHashMap2 != null) {
                return (C647530PaZ) concurrentHashMap2.get(str);
            }
            return null;
        }
        return (C647530PaZ) LJII().get(str);
    }

    public static String LJIIIZ(Fragment fragment, String str) {
        C290060BYm.LIZ.getClass();
        if (C290060BYm.LIZ() && fragment != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(fragment.hashCode());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa A[PHI: r0
      0x00aa: PHI (r0v9 java.lang.String) = (r0v8 java.lang.String), (r0v13 java.lang.String) binds: [B:28:0x00a7, B:23:0x0096] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIJ(java.lang.String r6, boolean r7) {
        /*
            boolean r0 = kotlin.text.a0.LJJJIL(r6)
            java.lang.String r3 = ""
            if (r0 == 0) goto L9
            return r3
        L9:
            java.util.concurrent.ConcurrentHashMap r0 = LJIIL()     // Catch: java.lang.Exception -> Lac
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Exception -> Lac
            X.0Paq r0 = (X.C647700Paq) r0     // Catch: java.lang.Exception -> Lac
            if (r0 != 0) goto L86
            java.lang.String r0 = "https://"
            r2 = 0
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r6, r0, r2)     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto L61
            java.lang.String r0 = "/"
            java.lang.String[] r1 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> Lac
            r0 = 6
            java.util.List r1 = kotlin.text.a0.LJJLIIIJILLIZJL(r6, r1, r2, r0)     // Catch: java.lang.Exception -> Lac
            int r0 = r1.size()     // Catch: java.lang.Exception -> Lac
            int r0 = r0 + (-2)
            java.lang.Object r5 = r1.get(r0)     // Catch: java.lang.Exception -> Lac
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lac
            int r0 = r1.size()     // Catch: java.lang.Exception -> Lac
            int r0 = r0 + (-3)
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lac
        L41:
            java.util.concurrent.ConcurrentHashMap r4 = LJIIL()     // Catch: java.lang.Exception -> Lac
            X.0Paq r2 = new X.0Paq     // Catch: java.lang.Exception -> Lac
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> Lac
            r1.append(r0)     // Catch: java.lang.Exception -> Lac
            r0 = 95
            r1.append(r0)     // Catch: java.lang.Exception -> Lac
            r1.append(r5)     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> Lac
            r2.<init>(r0, r5)     // Catch: java.lang.Exception -> Lac
            r4.put(r6, r2)     // Catch: java.lang.Exception -> Lac
            goto L86
        L61:
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r6)     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = "bundle"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)     // Catch: java.lang.Exception -> Lac
            if (r1 == 0) goto L7b
            X.01GW r0 = X.C647500PaW.LIZJ     // Catch: java.lang.Exception -> Lac
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> Lac
            kotlin.text.Regex r0 = (kotlin.text.Regex) r0     // Catch: java.lang.Exception -> Lac
            java.lang.String r5 = r0.replace(r1, r3)     // Catch: java.lang.Exception -> Lac
            if (r5 != 0) goto L7c
        L7b:
            r5 = r3
        L7c:
            java.lang.String r0 = "channel"
            java.lang.String r0 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r2, r0)     // Catch: java.lang.Exception -> Lac
            if (r0 != 0) goto L41
            r0 = r3
            goto L41
        L86:
            if (r7 == 0) goto L99
            java.util.concurrent.ConcurrentHashMap r0 = LJIIL()     // Catch: java.lang.Exception -> Lac
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Exception -> Lac
            X.0Paq r0 = (X.C647700Paq) r0     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto Lab
            java.lang.String r0 = r0.LIZIZ     // Catch: java.lang.Exception -> Lac
            if (r0 != 0) goto Laa
            return r3
        L99:
            java.util.concurrent.ConcurrentHashMap r0 = LJIIL()     // Catch: java.lang.Exception -> Lac
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Exception -> Lac
            X.0Paq r0 = (X.C647700Paq) r0     // Catch: java.lang.Exception -> Lac
            if (r0 == 0) goto Lab
            java.lang.String r0 = r0.LIZ     // Catch: java.lang.Exception -> Lac
            if (r0 != 0) goto Laa
            return r3
        Laa:
            return r0
        Lab:
            return r3
        Lac:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C647500PaW.LJIIJ(java.lang.String, boolean):java.lang.String");
    }

    public static boolean LJIILJJIL(Integer num, String str) {
        if (num != null && !C1202104n5.LIZ().LJJII(num.intValue(), str)) {
            return false;
        }
        Set<String> setLJIIJJI = C1202104n5.LIZ().LJIIJJI(C0PGI.FETCH, null);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setLJIIJJI, 10));
        for (String str2 : setLJIIJJI) {
            LIZ.getClass();
            arrayList.add(LJIIJ(str2, false));
        }
        return arrayList.contains(LJIIJ(str, false));
    }

    public static boolean LJIJI(Integer num, String str) {
        if (!LJIJ(str) && !LJIIZILJ(str) && !LJIJJ(str) && !LJIILLIIL(str) && !LJIILJJIL(num, str)) {
            return false;
        }
        return true;
    }

    public static void LJJ(Context context, String str) {
        Object c098200Yq;
        try {
            c098200Yq = C21172617tM.LJFF.LIZIZ();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = C823050WQl.LIZLLL();
        }
        ((Executor) c098200Yq).execute(new ARunnableS15S1100000_10(context, str, 2));
    }

    public static void LJJI(SearchMixFeedList searchMixFeedList, Context context) {
        List<SearchMixFeed> list = searchMixFeedList.mItems;
        if (list != null) {
            Iterator<SearchMixFeed> it2 = list.iterator();
            while (it2.hasNext()) {
                DynamicPatch dynamicPatch = it2.next().getDynamicPatch();
                if (dynamicPatch != null) {
                    C647500PaW c647500PaW = LIZ;
                    String str = dynamicPatch.schema;
                    c647500PaW.getClass();
                    LJJ(context, str);
                }
            }
        }
    }

    public static void LJJIIJZLJL(String str, EnumC1533980q1M enumC1533980q1M) {
        Forest forest;
        if (str == null) {
            return;
        }
        if (C1535630q41.LJJIII) {
            C1532680pzG.LIZ.getClass();
            C1532950pzh c1532950pzh = C1532680pzG.LJJ;
            RequestParamsX requestParamsX = new RequestParamsX(enumC1533980q1M, byte[].class);
            requestParamsX.source = "SparkPreLayoutHelper";
            if (enumC1533980q1M == EnumC1533980q1M.LYNX_TEMPLATE) {
                requestParamsX.consumeType = TemplateBundle.class;
            }
            c1532950pzh.LIZJ(str, requestParamsX, null);
            return;
        }
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
        if (iResourceServiceXLIZIZ != null && (forest = iResourceServiceXLIZIZ.getForest()) != null) {
            C1533900q1E c1533900q1E = new C1533900q1E(forest, null, false, 6);
            RequestParams requestParams = new RequestParams(enumC1533980q1M);
            requestParams.loadToMemory = true;
            requestParams.needLocalFile = Boolean.FALSE;
            c1533900q1E.LJFF(str, requestParams, false, null);
            ((ConcurrentHashMap) LJII.getValue()).put(LJIIJ(str, false), c1533900q1E);
        }
    }

    public static void LJJIIZI(Fragment fragment, String str) {
        if (C0PU8.LJ(str)) {
            return;
        }
        String strLJIIJ = LJIIJ(str, true);
        C0PAT.LIZ.getClass();
        if (C0PAT.LIZLLL().contains(strLJIIJ)) {
            return;
        }
        LJJIJ(fragment, LJIIJ(str, false));
    }

    public static void LJJIJ(Fragment fragment, String str) {
        C2250481D6o c2250481D6o = LJ;
        if (c2250481D6o != null) {
            c2250481D6o.LIZIZ.LIZLLL(LJIIIZ(fragment, str));
        }
        ConcurrentHashMap concurrentHashMapLJIIIIZZ = LJIIIIZZ(fragment);
        if (concurrentHashMapLJIIIIZZ != null) {
            concurrentHashMapLJIIIIZZ.remove(str);
        }
    }

    public static void LJJIJIIJI(Fragment fragment, List list) {
        C647530PaZ c647530PaZ;
        C1537720q7O c1537720q7O;
        String str;
        C1537720q7O c1537720q7O2;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            DynamicPatch dynamicPatch = ((SearchMixFeed) it2.next()).getDynamicPatch();
            if (dynamicPatch != null && (str = dynamicPatch.schema) != null) {
                LIZ.getClass();
                C647530PaZ c647530PaZLJI = LJI(fragment, LJIIJ(str, false));
                if (c647530PaZLJI != null && c647530PaZLJI.LIZLLL == C0PGG.PREDICT_DATA) {
                    c647530PaZLJI.LJIIJ = true;
                    if (c647530PaZLJI.LJIIIZ && (c1537720q7O2 = c647530PaZLJI.LIZIZ) != null) {
                        c1537720q7O2.startLynxRuntime();
                    }
                }
            }
        }
        ConcurrentHashMap concurrentHashMapLJIIIIZZ = LJIIIIZZ(fragment);
        ArrayList<String> arrayList = new ArrayList();
        if (concurrentHashMapLJIIIIZZ != null) {
            for (Map.Entry entry : concurrentHashMapLJIIIIZZ.entrySet()) {
                if (((C647530PaZ) entry.getValue()).LIZLLL == C0PGG.PREDICT_DATA && !((C647530PaZ) entry.getValue()).LJIIJ) {
                    arrayList.add(entry.getKey());
                }
            }
        }
        for (String str2 : arrayList) {
            C645760PUo.LIZ.getClass();
            if (!C645760PUo.LIZ().predictUpdateWhenBindTwice && concurrentHashMapLJIIIIZZ != null && (c647530PaZ = (C647530PaZ) concurrentHashMapLJIIIIZZ.get(str2)) != null && (c1537720q7O = c647530PaZ.LIZIZ) != null) {
                c1537720q7O.LLD(true);
            }
            LIZ.getClass();
            LJJIJ(fragment, str2);
            ((Set) C644670PQj.LIZIZ.getValue()).add(str2);
        }
    }

    public static void LIZ(List list, Fragment fragment, boolean z) {
        String str;
        boolean z2;
        String strSubstring;
        String str2;
        String str3;
        Map<Object, ? extends Object> map;
        C19EG c19egLIZIZ;
        HybridSchemaParam hybridSchemaParamLIZJ;
        C1537830q7Z c1537830q7Z;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            PreRenderCard preRenderCard = (PreRenderCard) it2.next();
            String str4 = null;
            c1537720q7O = null;
            c1537720q7O = null;
            C1537720q7O c1537720q7O = null;
            if (C647690Pap.LIZJ() && preRenderCard.lynxSSRInfo != null) {
                C647500PaW c647500PaW = LIZ;
                Context context = fragment.getContext();
                final String str5 = preRenderCard.lynxSchema;
                if (str5 == null) {
                    str5 = "";
                }
                c647500PaW.getClass();
                SAFHelper sAFHelper = SAFHelper.LIZ;
                if (context != null) {
                    c19egLIZIZ = C1388190mED.LIZIZ(context);
                } else {
                    c19egLIZIZ = null;
                }
                sAFHelper.getClass();
                Context contextLJII = SAFHelper.LJII(fragment, c19egLIZIZ);
                if (contextLJII != null) {
                    String strLJIIJ = LJIIJ(str5, false);
                    if (!a0.LJJJIL(strLJIIJ) && !LJFF(fragment, str5)) {
                        C647530PaZ c647530PaZ = new C647530PaZ(strLJIIJ, EnumC647870Pb7.LOADING, C0PGG.SSR_DATA, null, 16352);
                        LIZIZ(fragment, c647530PaZ, strLJIIJ);
                        C1538140q84 c1538140q84 = C1538140q84.LIZ;
                        final SparkContext sparkContext = new SparkContext();
                        if (C07H4.LIZ()) {
                            sparkContext.coroutineScope = null;
                        }
                        if (C0BY4.LIZIZ() && LJIIJJI(str5) != null) {
                            sparkContext.LJJ(C1533900q1E.class, LJIIJJI(str5));
                        }
                        sparkContext.LJJLIIJ(str5);
                        sparkContext.LJJJZ("enable_memory_cache", "1");
                        C1538590q8n c1538590q8n = new C1538590q8n();
                        c1538590q8n.LJII = C287850BPz.LIZ();
                        c1538590q8n.LIZIZ = true;
                        c1538590q8n.LIZ = true;
                        c1538590q8n.LJIIIIZZ = true;
                        c1538590q8n.LJ = true;
                        c1538590q8n.LIZLLL = true;
                        C1538140q84.LIZIZ(c1538140q84, sparkContext, c1538590q8n, 4);
                        InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
                        if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537830q7Z = (C1537830q7Z) interfaceC1531560pxS) != null) {
                            C649540Pdo.LJ(c1537830q7Z, contextLJII);
                            c1537830q7Z.LJJII = AFwS241S0000000_10.get$arr$(419);
                            c1537830q7Z.LJIJJLI = new C1537260q6e() { // from class: X.0Pab
                                @Override // X.C1537260q6e
                                public final void LIZ(Map<String, ? extends Object> map2) {
                                    Map mapLJ;
                                    Object obj = map2.get("clippedData");
                                    List list2 = null;
                                    if (!(obj instanceof Map) || (mapLJ = (Map) obj) == null) {
                                        mapLJ = C2097608Jq.LJ();
                                    }
                                    C647610Pah.LIZJ(str5, mapLJ);
                                    Object obj2 = map2.get("dependentKeys");
                                    if (obj2 instanceof List) {
                                        list2 = (List) obj2;
                                    }
                                    sparkContext.LJJ(C647180Pa0.class, new C647180Pa0(list2));
                                }
                            };
                        }
                        InterfaceC1531560pxS interfaceC1531560pxS2 = sparkContext.hybridParams;
                        if (interfaceC1531560pxS2 != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS2.LIZJ()) != null) {
                            hybridSchemaParamLIZJ.setThreadStrategy(EnumC665490Q8l.MOST_ON_TASM.id());
                            InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, sparkContext, contextLJII, new C0R4T(c647530PaZ, 6));
                            if (interfaceC1541990qEHLIZIZ instanceof C1537720q7O) {
                                c1537720q7O = (C1537720q7O) interfaceC1541990qEHLIZIZ;
                            }
                        }
                        c647530PaZ.LIZIZ = c1537720q7O;
                        c647530PaZ.LIZJ = EnumC647870Pb7.SUCCEED;
                        c647530PaZ.LJFF = EnumC647670Pan.FINISHED;
                        if (c1537720q7O != null) {
                            c1537720q7O.setEnableUIFlush(false);
                        }
                    }
                }
            } else {
                if (C648920Pco.LIZ(preRenderCard) == EnumC648930Pcp.SEARCH_ECOM_PRODUCT_CARD_LYNX && !z) {
                    if (((Number) C0BQ4.LIZ.getValue()).intValue() != 0) {
                        str = (String) C13LP.LJJJLIIL(C1202104n5.LIZ().LJIIJJI(C0PGI.CHUNK_HAS_ECOM_INTENT, null));
                    } else {
                        str = null;
                    }
                } else {
                    str = preRenderCard.lynxSchema;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) C270930Ajb.LIZ.getValue()).booleanValue() && (map = preRenderCard.hotspotCard) != null) {
                    linkedHashMap.put("ai_hotspot_canvas", map);
                }
                if (preRenderCard.type == 200 && C301130BrD.LIZ()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (str != null && (C647630Paj.LJIIIIZZ(str) || z2)) {
                    C647500PaW c647500PaW2 = LIZ;
                    c647500PaW2.getClass();
                    if (!LJFF(fragment, str) && !((ConcurrentHashSet) LJIIL.getValue()).contains(str)) {
                        C01GW c01gw = C373401ci.LIZ;
                        if (((Number) c01gw.getValue()).intValue() == 1 || ((Number) c01gw.getValue()).intValue() == 2) {
                            C1537480q70 c1537480q70 = new C1537480q70();
                            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                            builderBuildUpon.appendQueryParameter("enable_memory_cache", "1");
                            String string = builderBuildUpon.toString();
                            c1537480q70.LJJIIZ(string);
                            c1537480q70.hybridParams = new C1537830q7Z(UriProtector.parse(string), c1537480q70);
                            C649470Pdh.LIZ.getClass();
                            C649470Pdh.LIZ(c1537480q70);
                            C1538140q84.LIZ.getClass();
                            InterfaceC497601wk interfaceC497601wk = c1537480q70.coroutineScope;
                            if (interfaceC497601wk == null) {
                                interfaceC497601wk = C817503Hh.LL;
                            }
                            C23250099c.LIZLLL(interfaceC497601wk, null, null, new C373301ch(str, c1537480q70, null), 3);
                        }
                        String strLJIIJ2 = LJIIJ(str, true);
                        if (((Number) C0BC1.LIZ.getValue()).intValue() == 1) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(C644690PQl.LJFF);
                            sbLIZ.append(',');
                            sbLIZ.append(strLJIIJ2);
                            C644690PQl.LJFF = C2188811AlT.LIZIZ(sbLIZ);
                        }
                        C647630Paj.LIZ.getClass();
                        if (C647630Paj.LJIILIIL()) {
                            List listLIZIZ = C647350PaH.LIZIZ(str);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("cacheData: ");
                            if (listLIZIZ != null && (str3 = (String) ListProtector.get(listLIZIZ, 0)) != null) {
                                strSubstring = str3.substring(0, 100);
                            } else {
                                strSubstring = null;
                            }
                            sbLIZ2.append(strSubstring);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            Context context2 = fragment.getContext();
                            if (listLIZIZ != null) {
                                str4 = (String) C13LP.LJJJLZIJ(0, listLIZIZ);
                                str2 = (String) C13LP.LJJJLZIJ(1, listLIZIZ);
                            } else {
                                str2 = null;
                            }
                            LJJIFFI(c647500PaW2, context2, fragment, str, str4, null, C647630Paj.LIZ(), C0PGG.LOCAL_CACHE_DATA, C0PGD.FIRST_SCREEN, str2, false, 512);
                        } else {
                            LJJIFFI(c647500PaW2, fragment.getContext(), fragment, str, null, linkedHashMap, C647630Paj.LIZ(), C0PGG.EMPTY_DATA, C0PGD.FIRST_SCREEN, null, false, 768);
                        }
                    }
                }
            }
        }
    }

    public static void LIZIZ(Fragment fragment, C647530PaZ c647530PaZ, String str) {
        Object objPutIfAbsent;
        C290060BYm.LIZ.getClass();
        if (C290060BYm.LIZ()) {
            if (fragment != null) {
                LIZ.getClass();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LJFF.getValue();
                Integer numValueOf = Integer.valueOf(fragment.hashCode());
                Object concurrentHashMap2 = concurrentHashMap.get(numValueOf);
                if (concurrentHashMap2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (concurrentHashMap2 = new ConcurrentHashMap(2)))) != null) {
                    concurrentHashMap2 = objPutIfAbsent;
                }
                ((ConcurrentHashMap) concurrentHashMap2).put(str, c647530PaZ);
                return;
            }
            return;
        }
        LJII().put(str, c647530PaZ);
    }

    public static void LJIILIIL(Fragment fragment, C647530PaZ c647530PaZ, String str, String str2) {
        c647530PaZ.LIZJ = EnumC647870Pb7.FAILED;
        C1537720q7O c1537720q7O = c647530PaZ.LIZIZ;
        if (c1537720q7O == null) {
            return;
        }
        if (C0BQ2.LIZ()) {
            AbstractC1542100qES abstractC1542100qES = c647530PaZ.LJ;
            if (abstractC1542100qES != null) {
                abstractC1542100qES.LJLI(c1537720q7O, str, str2);
            }
        } else {
            AbstractC1542100qES abstractC1542100qESRemove = LJIIJJI.remove(c647530PaZ.LIZIZ);
            if (abstractC1542100qESRemove != null) {
                abstractC1542100qESRemove.LJLI(c1537720q7O, str, str2);
            }
        }
        LJJIIZI(fragment, str);
    }

    public static void LJJIIJ(SearchMixFeedList searchMixFeedList, SearchHubEntityCard searchHubEntityCard, Fragment fragment, boolean z) {
        String str;
        DynamicPatch dynamicPatch;
        String str2;
        List<SearchMixFeed> list = searchMixFeedList.mItems;
        if (list != null) {
            int i = 0;
            for (SearchMixFeed searchMixFeed : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    SearchMixFeed searchMixFeed2 = searchMixFeed;
                    DynamicPatch dynamicPatch2 = searchMixFeed2.getDynamicPatch();
                    if (dynamicPatch2 != null && (str2 = dynamicPatch2.schema) != null) {
                        C647630Paj.LIZ.getClass();
                        if (C647630Paj.LJIIJJI(str2) || (C647690Pap.LIZJ() && searchMixFeed2.lynxSSRInfo != null)) {
                            LIZ.getClass();
                            LJJIII(searchMixFeed2, null, i, fragment, z);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (searchHubEntityCard != null && C301130BrD.LIZ()) {
            C647630Paj c647630Paj = C647630Paj.LIZ;
            EntityCardTitle entityCardTitle = searchHubEntityCard.topCardInfo;
            if (entityCardTitle == null || (dynamicPatch = entityCardTitle.dynamicPatch) == null || (str = dynamicPatch.schema) == null) {
                str = "";
            }
            c647630Paj.getClass();
            if (C647630Paj.LJIIJJI(str)) {
                LJJIII(null, searchHubEntityCard, -1, fragment, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.lynx.tasm.TemplateData LJIJJLI(X.C1537480q70 r7, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r8, int r9, org.json.JSONArray r10, org.json.JSONArray r11) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C647500PaW.LJIJJLI(X.0q70, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed, int, org.json.JSONArray, org.json.JSONArray):com.lynx.tasm.TemplateData");
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [T, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, X.0PQm] */
    public static void LJJIII(final SearchMixFeed searchMixFeed, final SearchHubEntityCard searchHubEntityCard, final int i, Fragment fragment, final boolean z) {
        EntityCardTitle entityCardTitle;
        DynamicPatch dynamicPatch;
        String str;
        final C647530PaZ c647530PaZ;
        C0PGG c0pgg;
        List<Map<?, ?>> awemeMultiTabListRaw;
        List<Map<?, ?>> awemeListRaw;
        if (searchMixFeed != null) {
            DynamicPatch dynamicPatch2 = searchMixFeed.getDynamicPatch();
            if (dynamicPatch2 != null) {
                str = dynamicPatch2.schema;
            } else {
                return;
            }
        } else if (searchHubEntityCard != null && (entityCardTitle = searchHubEntityCard.topCardInfo) != null && (dynamicPatch = entityCardTitle.dynamicPatch) != null) {
            str = dynamicPatch.schema;
        } else {
            return;
        }
        if (str != null) {
            LIZ.getClass();
            String strLJIIJ = LJIIJ(str, false);
            ConcurrentHashMap concurrentHashMapLJIIIIZZ = LJIIIIZZ(fragment);
            if (concurrentHashMapLJIIIIZZ == null || (c647530PaZ = (C647530PaZ) concurrentHashMapLJIIIIZZ.get(strLJIIJ)) == null || c647530PaZ.LIZIZ == null) {
                return;
            }
            if (!C649610Pdv.LIZJ() && c647530PaZ.LJFF != EnumC647670Pan.FINISHED) {
                return;
            }
            if ((!z || !c647530PaZ.LJII) && (c0pgg = c647530PaZ.LIZLLL) != C0PGG.PREDICT_DATA) {
                if (c0pgg == C0PGG.SSR_DATA) {
                    if (searchMixFeed == null) {
                        return;
                    }
                    ARunnableS3S1201000_10 aRunnableS3S1201000_10 = new ARunnableS3S1201000_10(c647530PaZ, searchMixFeed, i, str, 0);
                    C647690Pap.LIZ.getClass();
                    if (C647690Pap.LIZ()) {
                        C086F c086f = C086F.LIZ;
                        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(aRunnableS3S1201000_10, 960);
                        c086f.getClass();
                        C086F.LJI(awS554S0100000_10);
                        return;
                    }
                    aRunnableS3S1201000_10.run();
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                final C259800zU c259800zU = new C259800zU();
                final C259800zU c259800zU2 = new C259800zU();
                C647630Paj.LIZ.getClass();
                if (C647630Paj.LJ() && searchMixFeed != null) {
                    DynamicPatch dynamicPatch3 = searchMixFeed.getDynamicPatch();
                    if (dynamicPatch3 != null && (awemeListRaw = dynamicPatch3.getAwemeListRaw()) != null) {
                        c259800zU.element = new JSONArray((Collection) awemeListRaw);
                    }
                    DynamicPatch dynamicPatch4 = searchMixFeed.getDynamicPatch();
                    if (dynamicPatch4 != null && (awemeMultiTabListRaw = dynamicPatch4.getAwemeMultiTabListRaw()) != null) {
                        c259800zU2.element = new JSONArray((Collection) awemeMultiTabListRaw);
                    }
                }
                C259800zU c259800zU3 = new C259800zU();
                c259800zU3.element = new Runnable() { // from class: X.0PQm
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("SparkLitePreLayoutHelper@fd49.preUpdateLynxData$1$1$updateRunnable$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("SparkLitePreLayoutHelper@fd49.preUpdateLynxData$1$1$updateRunnable$1");
                    }

                    public final void LIZ() {
                        TemplateData templateDataLJIJJLI;
                        String rawData;
                        DynamicPatch dynamicPatch5;
                        try {
                            C644690PQl.LJIIIIZZ = System.currentTimeMillis();
                            SearchHubEntityCard searchHubEntityCard2 = searchHubEntityCard;
                            if (searchHubEntityCard2 != null) {
                                C647500PaW.LIZ.getClass();
                                EntityCardTitle entityCardTitle2 = searchHubEntityCard2.topCardInfo;
                                if (entityCardTitle2 == null || (dynamicPatch5 = entityCardTitle2.dynamicPatch) == null || (rawData = dynamicPatch5.getRawData()) == null) {
                                    rawData = "";
                                }
                                templateDataLJIJJLI = TemplateData.LJIIIIZZ(rawData);
                                templateDataLJIJJLI.LJIILIIL("universalRank", 0);
                                templateDataLJIJJLI.LJIILIIL("isEmptyData", Boolean.FALSE);
                            } else {
                                if (searchMixFeed == null) {
                                    return;
                                }
                                C647500PaW c647500PaW = C647500PaW.LIZ;
                                C1537720q7O c1537720q7O = c647530PaZ.LIZIZ;
                                C1537480q70 hybridContext = c1537720q7O != null ? c1537720q7O.getHybridContext() : null;
                                SearchMixFeed searchMixFeed2 = searchMixFeed;
                                int i2 = i;
                                JSONArray jSONArray = c259800zU.element;
                                JSONArray jSONArray2 = c259800zU2.element;
                                c647500PaW.getClass();
                                templateDataLJIJJLI = C647500PaW.LJIJJLI(hybridContext, searchMixFeed2, i2, jSONArray, jSONArray2);
                            }
                            C1537720q7O c1537720q7O2 = c647530PaZ.LIZIZ;
                            if (c1537720q7O2 != null) {
                                c1537720q7O2.updateData(templateDataLJIJJLI);
                            }
                            C647630Paj.LIZ.getClass();
                            if (C647630Paj.LJIIIZ()) {
                                c647530PaZ.LJIIIIZZ = templateDataLJIJJLI;
                            }
                            if (z) {
                                c647530PaZ.LJII = true;
                            }
                            C644690PQl.LJIIIZ = System.currentTimeMillis();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                };
                if (C647630Paj.LJIIL()) {
                    C086F c086f2 = C086F.LIZ;
                    AwS554S0100000_10 awS554S0100000_102 = new AwS554S0100000_10(c259800zU3, (C259800zU<Runnable>) 961);
                    c086f2.getClass();
                    C086F.LJI(awS554S0100000_102);
                } else {
                    ((Runnable) c259800zU3.element).run();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preUpdateLynxData ");
                sbLIZ.append(c647530PaZ.LIZ);
                sbLIZ.append(" duration ");
                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public static void LJJIIZ(C1537720q7O c1537720q7O, Fragment fragment, String str, boolean z, boolean z2) {
        c1537720q7O.processRender();
        if (!z2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c1537720q7O.syncFlush();
            C644690PQl.LJIIL = System.currentTimeMillis() - jCurrentTimeMillis;
        }
        C644690PQl.LJIILIIL = z2;
        C649470Pdh.LIZ.getClass();
        C649470Pdh.LJJIIJZLJL(c1537720q7O, "preLayout");
        if (!z) {
            LJJIIZI(fragment, str);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Paf] */
    public static void LJJII(final Context context, final LifecycleCoroutineScope lifecycleCoroutineScope, final Fragment fragment, final String str, final String str2, final Map map, final C0PGG c0pgg, final C0PGD c0pgd, final String str3) {
        if (context == null || C649470Pdh.LJJIFFI()) {
            return;
        }
        C290060BYm.LIZ.getClass();
        if (C290060BYm.LIZ() && fragment == null) {
            return;
        }
        final String strLJIIJ = LJIIJ(str, false);
        if (a0.LJJJIL(strLJIIJ) || LJFF(fragment, str)) {
            return;
        }
        ?? r3 = new Runnable() { // from class: X.0Paf
            public final void LIZ() {
                HybridSchemaParam hybridSchemaParamLIZJ;
                C1537830q7Z c1537830q7Z;
                final C647530PaZ c647530PaZ = new C647530PaZ(strLJIIJ, EnumC647870Pb7.LOADING, c0pgg, c0pgd, 14304);
                C647500PaW c647500PaW = C647500PaW.LIZ;
                String str4 = strLJIIJ;
                Fragment fragment2 = fragment;
                c647500PaW.getClass();
                C647500PaW.LIZIZ(fragment2, c647530PaZ, str4);
                if (C647500PaW.LJ == null) {
                    C647500PaW.LJ = ((Boolean) C1108304Vd.LIZ.getValue()).booleanValue() ? new C2250481D6o(C786410Ut5.N3(context)) : new C2250481D6o(context);
                }
                C1538140q84 c1538140q84 = C1538140q84.LIZ;
                final SparkContext sparkContext = new SparkContext();
                LifecycleCoroutineScope lifecycleCoroutineScope2 = lifecycleCoroutineScope;
                String str5 = str;
                if (C07H4.LIZ()) {
                    sparkContext.coroutineScope = lifecycleCoroutineScope2;
                }
                if (C0BY4.LIZIZ() && C647500PaW.LJIIJJI(str5) != null) {
                    sparkContext.LJJ(C1533900q1E.class, C647500PaW.LJIIJJI(str5));
                }
                sparkContext.LJJLIIJ(str5);
                sparkContext.LJJJZ("enable_memory_cache", "1");
                C1538590q8n c1538590q8n = new C1538590q8n();
                c1538590q8n.LJII = C287850BPz.LIZ();
                c1538590q8n.LIZIZ = true;
                c1538590q8n.LIZ = true;
                c1538590q8n.LJIIIIZZ = true;
                c1538590q8n.LJ = true;
                c1538590q8n.LIZLLL = true;
                C1538140q84.LIZIZ(c1538140q84, sparkContext, c1538590q8n, 4);
                final String str6 = str;
                final Fragment fragment3 = fragment;
                sparkContext.LJJ(AbstractC1538740q92.class, new AbstractC1538740q92() { // from class: X.0Pao
                    @Override // X.AbstractC1537870q7d
                    public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                        if (c647530PaZ.LJFF != EnumC647670Pan.FAILED) {
                            c647530PaZ.LJFF = EnumC647670Pan.FINISHED;
                        }
                    }

                    @Override // X.AbstractC1537870q7d
                    public final void LJJZZIII(InterfaceC1541990qEH interfaceC1541990qEH, String str7) {
                        c647530PaZ.LJFF = EnumC647670Pan.FAILED;
                        C0CNO.LIZLLL(0L, new AwS126S1200000_10(fragment3, c647530PaZ, str6, 0));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                });
                InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
                C1537720q7O c1537720q7O = null;
                if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537830q7Z = (C1537830q7Z) interfaceC1531560pxS) != null) {
                    final String str7 = str;
                    Context context2 = context;
                    c1537830q7Z.LJIJJ = (TemplateData) new C647520PaY(str2, map, c0pgg, str7, sparkContext, str3).invoke();
                    C649540Pdo.LJ(c1537830q7Z, context2);
                    if (C287820BPw.LIZ()) {
                        c1537830q7Z.LJJI = true;
                    }
                    c1537830q7Z.LJJII = AFwS241S0000000_10.get$arr$(418);
                    if (C20039613b0.LIZ(str7)) {
                        c1537830q7Z.LJJIZ = true;
                        HybridSchemaParam hybridSchemaParam = c1537830q7Z.LJJIIJ;
                        if (hybridSchemaParam != null) {
                            hybridSchemaParam.setEnableExtraInfo(1);
                        }
                    }
                    c1537830q7Z.LJIJJLI = new C1537260q6e() { // from class: X.0Pae
                        @Override // X.C1537260q6e
                        public final void LIZ(Map<String, ? extends Object> map2) {
                            Map mapLJ;
                            List list;
                            List list2;
                            Object obj = map2.get("clippedData");
                            if (!(obj instanceof Map) || (mapLJ = (Map) obj) == null) {
                                mapLJ = C2097608Jq.LJ();
                            }
                            C647610Pah.LIZJ(str7, mapLJ);
                            Object obj2 = map2.get("dependentKeys");
                            if (obj2 instanceof List) {
                                list = (List) obj2;
                            } else {
                                list = null;
                            }
                            sparkContext.LJJ(C647180Pa0.class, new C647180Pa0(list));
                            if (C20039613b0.LIZ(str7)) {
                                Object obj3 = map2.get("awemeDependentKeys");
                                if ((obj3 instanceof List) && (list2 = (List) obj3) != null) {
                                    sparkContext.LJJ(C647430PaP.class, new C647430PaP(list2));
                                }
                            }
                        }
                    };
                }
                C1AGP.LIZ.getClass();
                C1AGP.LIZJ(sparkContext, "general_search");
                if (C301140BrE.LIZ()) {
                    C690340R6a.LIZ();
                }
                C649470Pdh.LIZ.getClass();
                C649470Pdh.LIZ(sparkContext);
                InterfaceC1531560pxS interfaceC1531560pxS2 = sparkContext.hybridParams;
                if (interfaceC1531560pxS2 != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS2.LIZJ()) != null) {
                    Context context3 = context;
                    hybridSchemaParamLIZJ.setThreadStrategy(EnumC665490Q8l.MOST_ON_TASM.id());
                    InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, sparkContext, context3, new C0R4T(c647530PaZ, 5));
                    if (interfaceC1541990qEHLIZIZ instanceof C1537720q7O) {
                        c1537720q7O = (C1537720q7O) interfaceC1541990qEHLIZIZ;
                    }
                }
                c647530PaZ.LIZIZ = c1537720q7O;
                if (c1537720q7O != null) {
                    final String str8 = str;
                    String str9 = strLJIIJ;
                    final Fragment fragment4 = fragment;
                    C649100Pd6 c649100Pd6 = C649100Pd6.LIZ;
                    AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(c1537720q7O, 959);
                    c649100Pd6.getClass();
                    c1537720q7O.addLynxViewClient(C649100Pd6.LIZJ(str8, awS554S0100000_10, true));
                    System.currentTimeMillis();
                    C2250481D6o c2250481D6o = C647500PaW.LJ;
                    if (c2250481D6o != null) {
                        c2250481D6o.LIZIZ(C647500PaW.LJIIIZ(fragment4, str9), c1537720q7O, true ^ C647500PaW.LJIILL(c647530PaZ), new InterfaceC2250511D6r<C1537720q7O>() { // from class: X.0Pag
                            @Override // X.InterfaceC2250511D6r
                            public final void LIZ(C0Q8K c0q8k, LynxError lynxError) {
                                Integer numValueOf;
                                String strLIZJ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onPreLayoutError: errorCode = ");
                                String strLIZJ2 = null;
                                if (lynxError != null) {
                                    numValueOf = Integer.valueOf(lynxError.LIZIZ());
                                } else {
                                    numValueOf = null;
                                }
                                sbLIZ.append(numValueOf);
                                sbLIZ.append(", errorMsg = ");
                                if (lynxError != null) {
                                    strLIZJ = lynxError.LIZJ();
                                } else {
                                    strLIZJ = null;
                                }
                                sbLIZ.append(strLIZJ);
                                C2188811AlT.LIZIZ(sbLIZ);
                                C647530PaZ c647530PaZ2 = c647530PaZ;
                                if (c647530PaZ2 == null) {
                                    return;
                                }
                                C647500PaW c647500PaW2 = C647500PaW.LIZ;
                                Fragment fragment5 = fragment4;
                                String str10 = str8;
                                if (lynxError != null) {
                                    strLIZJ2 = lynxError.LIZJ();
                                }
                                c647500PaW2.getClass();
                                C647500PaW.LJIILIIL(fragment5, c647530PaZ2, str10, strLIZJ2);
                            }

                            @Override // X.InterfaceC2250511D6r
                            public final void LIZIZ(InterfaceC647710Par interfaceC647710Par, String str10) {
                                C1537720q7O c1537720q7O2 = (C1537720q7O) interfaceC647710Par;
                                C647530PaZ c647530PaZ2 = c647530PaZ;
                                c647530PaZ2.LIZJ = EnumC647870Pb7.SUCCEED;
                                if (!c647530PaZ2.LJI) {
                                    c647530PaZ.LIZIZ = c1537720q7O2;
                                    if (C0BQ2.LIZ()) {
                                        C647530PaZ c647530PaZ3 = c647530PaZ;
                                        AbstractC1542100qES abstractC1542100qES = c647530PaZ3.LJ;
                                        if (abstractC1542100qES != null) {
                                            abstractC1542100qES.LJLIIIL(c647530PaZ3.LIZIZ);
                                            return;
                                        }
                                        return;
                                    }
                                    C647500PaW c647500PaW2 = C647500PaW.LIZ;
                                    C1537720q7O c1537720q7O3 = c647530PaZ.LIZIZ;
                                    c647500PaW2.getClass();
                                    AbstractC1542100qES abstractC1542100qESRemove = C647500PaW.LJIIJJI.remove(c1537720q7O3);
                                    if (abstractC1542100qESRemove == null) {
                                        return;
                                    }
                                    abstractC1542100qESRemove.LJLIIIL(c647530PaZ.LIZIZ);
                                }
                            }
                        });
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SparkLitePreLayoutHelper@fd49.preLayoutInternal$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SparkLitePreLayoutHelper@fd49.preLayoutInternal$runnable$1");
            }
        };
        C0PAT.LIZ.getClass();
        if (C0PAT.LIZ(str)) {
            C086F c086f = C086F.LIZ;
            AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10((RunnableC647590Paf) r3, 958);
            c086f.getClass();
            C086F.LJI(awS554S0100000_10);
            return;
        }
        r3.run();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, android.content.Context] */
    public static void LJJIFFI(C647500PaW c647500PaW, Context context, Fragment fragment, String str, String str2, Map map, boolean z, C0PGG c0pgg, C0PGD c0pgd, String str3, boolean z2, int i) {
        C19EG c19egLIZIZ;
        LifecycleCoroutineScope lifecycleScope;
        boolean z3;
        boolean z4;
        Map map2;
        C0PGG c0pgg2 = c0pgg;
        String str4 = str3;
        C0PGD c0pgd2 = c0pgd;
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 128) != 0) {
            c0pgd2 = C0PGD.FIRST_SCREEN;
        }
        String str5 = "";
        if ((i & 256) != 0) {
            str4 = "";
        }
        if ((i & 512) != 0) {
            z2 = false;
        }
        c647500PaW.getClass();
        if (!C651850PhX.LIZIZ(str) && !C651840PhW.LIZ(str)) {
            C644690PQl.LIZ = System.currentTimeMillis();
            C259800zU c259800zU = new C259800zU();
            SAFHelper sAFHelper = SAFHelper.LIZ;
            if (context != null) {
                c19egLIZIZ = C1388190mED.LIZIZ(context);
            } else {
                c19egLIZIZ = null;
            }
            sAFHelper.getClass();
            c259800zU.element = SAFHelper.LJII(fragment, c19egLIZIZ);
            if (str2 == null) {
                c0pgg2 = C0PGG.EMPTY_DATA;
            }
            C259800zU c259800zU2 = new C259800zU();
            c259800zU2.element = str;
            if (z2) {
                c259800zU2.element = u.LJJIFFI(str, "parallel_fetch_resource=1", "parallel_fetch_resource=0", false);
            }
            if (((Boolean) C270790AjN.LIZ.getValue()).booleanValue()) {
                String str6 = (String) c259800zU2.element;
                Map<String, Object> mapLIZ = C649800PeE.LIZ();
                boolean zLIZ = C284200BBy.LIZ();
                T string = str6;
                if ((!mapLIZ.isEmpty()) || zLIZ) {
                    int iLJJJ = a0.LJJJ(str6, "__schema_processed__", 0, false, 6);
                    string = str6;
                    if (iLJJJ == -1) {
                        Uri uri = UriProtector.parse(str6);
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel");
                        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                            str5 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                        }
                        string = str6;
                        if (C293060BeC.LIZ(str5)) {
                            Uri.Builder builderBuildUpon = uri.buildUpon();
                            if (!mapLIZ.isEmpty()) {
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "disable_default_params");
                                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2) == 1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                Object obj = mapLIZ.get("search_general");
                                if (obj instanceof Map) {
                                    map2 = (Map) obj;
                                } else {
                                    map2 = null;
                                }
                                if (!z4 && map2 != null) {
                                    for (Map.Entry entry : map2.entrySet()) {
                                        String strValueOf = String.valueOf(entry.getKey());
                                        String strValueOf2 = String.valueOf(entry.getValue());
                                        if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, strValueOf) == null) {
                                            builderBuildUpon.appendQueryParameter(strValueOf, strValueOf2);
                                        }
                                    }
                                }
                            }
                            if (zLIZ) {
                                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "disable_biz_container");
                                String strLJ = C649470Pdh.LJ(str6);
                                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3) == 1) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if ((C0CCG.LIZ().contains(strLJ) || C284200BBy.LIZ()) && !z3 && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "target_handler") == null) {
                                    builderBuildUpon.appendQueryParameter("target_handler", "search_general");
                                }
                            }
                            builderBuildUpon.appendQueryParameter("__schema_processed__", "1");
                            string = builderBuildUpon.toString();
                        }
                    }
                }
                c259800zU2.element = string;
            }
            if (fragment != null) {
                lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment);
            } else {
                lifecycleScope = null;
            }
            if (z) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZ, null, new C0PBE(c259800zU, lifecycleScope, fragment, c259800zU2, str2, map, c0pgg2, c0pgd2, str4, null), 2);
            } else {
                LJJII((Context) c259800zU.element, lifecycleScope, fragment, (String) c259800zU2.element, str2, map, c0pgg2, c0pgd2, str4);
            }
        }
    }
}
