package X;

import Y.ACallableS67S1100000_16;
import android.util.Pair;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.settings.LandPageGeckoOptimizeStrategyModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0clQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024380clQ {
    public static final C1024380clQ LIZ = new C1024380clQ();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1037710d6v());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1002560cCE());
    public static final ConcurrentHashMap<String, C1024400clS> LJ = new ConcurrentHashMap<>();
    public static final List<String> LJFF = Collections.synchronizedList(new ArrayList());
    public static final C11PQ<AbstractC1024430clV> LJI;

    static {
        new HashMap();
        LJI = new C11PQ<>();
    }

    public static final void LIZJ() {
        LJI.onNext(C1024420clU.LIZ);
    }

    public static final C19488511Ml LJ() {
        return LJI.LJJIL(new InterfaceC19483011Ki() { // from class: X.0clR
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return !Intrinsics.LJFF(obj, C1024420clU.LIZ);
            }
        }).LJJIFFI();
    }

    public static final void LJIIL() {
        LJI.onNext(C1024440clW.LIZ);
        boolean z = false;
        for (Map.Entry<String, C1024400clS> entry : LJ.entrySet()) {
            AwemeRawAd awemeRawAd = entry.getValue().LIZJ;
            if (awemeRawAd != null) {
                entry.getValue().LIZJ = null;
                if (!z && awemeRawAd.getPreloadWebNew() == 1) {
                    ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).t0(awemeRawAd);
                    z = true;
                }
            }
        }
    }

    public static final boolean LIZLLL(String str) {
        boolean zContains = false;
        if (str == null) {
            return false;
        }
        try {
            zContains = LJFF.contains(str);
            return zContains;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "PreloadAdWebHelper-isResourceReady");
            return zContains;
        }
    }

    public static final void LJI(String str) {
        if (str == null) {
            return;
        }
        LJIIZILJ(str);
        if (((List) LIZJ.getValue()).contains(str)) {
            HashMap map = new HashMap();
            map.put("active_status", 1);
            map.put("channel", str);
            C1024100cky c1024100ckyLIZ = C1024150cl3.LIZ();
            c1024100ckyLIZ.LIZ = "draw_ad";
            c1024100ckyLIZ.LIZIZ = "active_finish";
            c1024100ckyLIZ.LJIIIIZZ();
            c1024100ckyLIZ.LIZ(map);
            c1024100ckyLIZ.LJ();
            c1024100ckyLIZ.LJIIIZ();
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("draw_ad", "active_finish", CardStruct.IStatusCode.DEFAULT, null, null);
            c1022820ciuLJ.LIZJ("debug", "ad_event_type");
            c1022820ciuLJ.LIZJ("card_common", "refer");
            c1022820ciuLJ.LIZ(map);
            c1022820ciuLJ.LJIIIIZZ();
            LJ.remove(str);
        }
    }

    public static final void LJIILL(List<String> list) {
        String strK0;
        if (list != null) {
            for (String str : list) {
                C1024380clQ c1024380clQ = LIZ;
                IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                if (iAdLandPagePreloadService != null) {
                    strK0 = iAdLandPagePreloadService.K0("lynx_feed");
                } else {
                    strK0 = null;
                }
                c1024380clQ.getClass();
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZIZ() != null) {
                    C1041280dCg.LIZIZ(str, strK0, null);
                }
            }
        }
    }

    public static void LJIIZILJ(String str) {
        if (str == null) {
            return;
        }
        try {
            List<String> list = LJFF;
            if (list.contains(str)) {
                return;
            }
            list.add(str);
            if (list.size() > 99) {
                C19719612Di.LJJIIZI(list);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "PreloadAdWebHelper-recordGeckoResReady");
        }
    }

    public static void LIZ(Aweme aweme, List list) {
        List<AnchorCommonStruct> anchors;
        List list2;
        WikipediaExtra wikipediaExtra;
        Integer status;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return;
        }
        ArrayList<AnchorCommonStruct> arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            try {
                wikipediaExtra = (WikipediaExtra) new Gson().LJII(anchorCommonStruct2.getExtra(), WikipediaExtra.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!C123100dR.LIZ(anchorCommonStruct2.getSchema()) || !C123100dR.LIZ(anchorCommonStruct2.getKeyword()) || anchorCommonStruct2.getGeneralType() != 1) {
                }
            }
            if (C123100dR.LIZ(anchorCommonStruct2.getSchema()) && C123100dR.LIZ(anchorCommonStruct2.getKeyword()) && anchorCommonStruct2.getGeneralType() == 1 && (wikipediaExtra == null || (status = wikipediaExtra.getStatus()) == null || status.intValue() != 2)) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (AnchorCommonStruct anchorCommonStruct3 : arrayList) {
            String extra = anchorCommonStruct3.getExtra();
            if (extra != null && extra.length() != 0) {
                k kVar = GsonProtectorUtils.parse(new p(), anchorCommonStruct3.getExtra());
                if (!(kVar instanceof n)) {
                    return;
                }
                n nVarLJIILIIL = kVar.LJIILIIL();
                Boolean bool = (Boolean) GsonProtectorUtils.fromJson(new Gson(), nVarLJIILIIL.LJJIIZ("is_schema_lynx"), new TypeToken<Boolean>() { // from class: X.0clT
                }.getType());
                if (bool != null && bool.booleanValue() && (list2 = (List) GsonProtectorUtils.fromJson(new Gson(), nVarLJIILIIL.LJJIIZ("gecko_channel"), new TypeToken<List<? extends String>>() { // from class: X.04XT
                }.getType())) != null && !list2.isEmpty()) {
                    ((ArrayList) list).addAll(list2);
                }
            }
        }
    }

    public static final int LIZIZ(String str, String str2) {
        String str3;
        String strLJI;
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService == null) {
            return 0;
        }
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZIZ() == null) {
            return 0;
        }
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        if (!C1552050qUV.LIZIZ(iAdLandPagePreloadService.K0(str3), str)) {
            return 0;
        }
        if (C1041070dCL.LIZ() != null) {
            strLJI = C1028210crb.LJI(str, str2);
        } else {
            strLJI = null;
        }
        if (C1040660dBg.LIZ(strLJI) != null) {
            return 2;
        }
        return -2;
    }

    public static final void LJFF(String str, Throwable th) {
        String message;
        if (str != null && ((List) LIZJ.getValue()).contains(str)) {
            HashMap map = new HashMap();
            map.put("active_status", 0);
            map.put("channel", str);
            if (th == null || (message = th.getMessage()) == null) {
                message = "";
            }
            map.put("fail_reason", message);
            C1024100cky c1024100ckyLIZ = C1024150cl3.LIZ();
            c1024100ckyLIZ.LIZ = "draw_ad";
            c1024100ckyLIZ.LIZIZ = "active_finish";
            c1024100ckyLIZ.LJIIIIZZ();
            c1024100ckyLIZ.LIZ(map);
            c1024100ckyLIZ.LJ();
            c1024100ckyLIZ.LJIIIZ();
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("draw_ad", "active_finish", CardStruct.IStatusCode.DEFAULT, null, null);
            c1022820ciuLJ.LIZJ("debug", "ad_event_type");
            c1022820ciuLJ.LIZJ("card_common", "refer");
            c1022820ciuLJ.LIZ(map);
            c1022820ciuLJ.LJIIIIZZ();
            LJ.remove(str);
        }
    }

    public static final void LJIIJ(List<String> list, boolean z) {
        String str;
        C1007810cKh c1007810cKh;
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            C1024400clS c1024400clS = LJ.get(it2.next());
            if (c1024400clS != null && (str = c1024400clS.LIZLLL) != null) {
                Iterator it3 = Collections.singletonList(str).iterator();
                while (it3.hasNext()) {
                    InterfaceC1024320clK interfaceC1024320clK = C1024300clI.LIZJ.get(it3.next());
                    if (interfaceC1024320clK != null) {
                        if (z) {
                            C1042680dEw.LIZ.getClass();
                            c1007810cKh = C1042680dEw.LJII;
                        } else {
                            C1042680dEw.LIZ.getClass();
                            c1007810cKh = C1042680dEw.LJIIIIZZ;
                        }
                        C1024300clI.LJFF(c1007810cKh, interfaceC1024320clK);
                    }
                }
            }
        }
    }

    public static final void LJIIJJI(String str, boolean z) {
        if (str == null) {
            return;
        }
        String str2 = null;
        if (((List) LIZJ.getValue()).contains(str)) {
            C1024400clS c1024400clS = new C1024400clS(0L, str2, 15);
            c1024400clS.LJ = System.currentTimeMillis();
            LJ.put(str, c1024400clS);
            HashMap map = new HashMap();
            c1024400clS.LJFF = z ? 1 : 0;
            map.put("is_diff", Integer.valueOf(z ? 1 : 0));
            map.put("channel", str);
            C1024100cky c1024100ckyLIZ = C1024150cl3.LIZ();
            c1024100ckyLIZ.LIZ = "draw_ad";
            c1024100ckyLIZ.LIZIZ = "download_start";
            c1024100ckyLIZ.LJIIIIZZ();
            c1024100ckyLIZ.LIZ(map);
            c1024100ckyLIZ.LJ();
            c1024100ckyLIZ.LJIIIZ();
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("draw_ad", "download_start", CardStruct.IStatusCode.DEFAULT, null, null);
            c1022820ciuLJ.LIZJ("debug", "ad_event_type");
            c1022820ciuLJ.LIZJ("card_common", "refer");
            c1022820ciuLJ.LIZ(map);
            c1022820ciuLJ.LJIIIIZZ();
            return;
        }
        C1024400clS c1024400clS2 = LJ.get(str);
        if (c1024400clS2 != null) {
            c1024400clS2.LJ = System.currentTimeMillis();
            HashMap map2 = new HashMap();
            c1024400clS2.LJFF = z ? 1 : 0;
            map2.put("is_diff", Integer.valueOf(z ? 1 : 0));
            map2.put("channel_name", str);
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            if (iAdLandPagePreloadService != null) {
                iAdLandPagePreloadService.C0();
                map2.put("landing_type", 2);
            }
            C1024100cky c1024100ckyLIZ2 = C1024150cl3.LIZ();
            c1024100ckyLIZ2.LIZIZ = "ad_landing_channel_download_start";
            c1024100ckyLIZ2.LIZ = "ad_wap_stat";
            c1024100ckyLIZ2.LIZLLL(Long.valueOf(c1024400clS2.LIZ));
            c1024100ckyLIZ2.LJI(c1024400clS2.LIZIZ);
            c1024100ckyLIZ2.LIZ(map2);
            c1024100ckyLIZ2.LJ();
            c1024100ckyLIZ2.LJIIIZ();
            C1022820ciu c1022820ciuLJ2 = C2184171Adz.LJ("ad_wap_stat", "ad_landing_channel_download_start", String.valueOf(c1024400clS2.LIZ), c1024400clS2.LIZIZ, null);
            c1022820ciuLJ2.LIZJ("debug", "ad_event_type");
            c1022820ciuLJ2.LIZ(map2);
            c1022820ciuLJ2.LJIIIIZZ();
        }
    }

    public static final void LJIILJJIL(String str, InterfaceC1665500tRU interfaceC1665500tRU) {
        if (interfaceC1665500tRU != null) {
            C1024380clQ c1024380clQ = LIZ;
            C1024450clX c1024450clX = C1024450clX.LIZ;
            c1024380clQ.getClass();
            LJI.onNext(c1024450clX);
        }
        C15O7.LIZJ(new ACallableS67S1100000_16(interfaceC1665500tRU, str, 1));
    }

    public static final void LJII(List<? extends Pair<String, Long>> list, boolean z, C1551680qTu c1551680qTu) {
        if (list != null && !list.isEmpty()) {
            for (Pair<String, Long> pair : list) {
                C1024400clS c1024400clS = LJ.get(pair.first);
                if (c1024400clS != null) {
                    HashMap map = new HashMap();
                    map.put("channel_name", pair.first);
                    IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                    int i = 2;
                    if (iAdLandPagePreloadService != null) {
                        iAdLandPagePreloadService.C0();
                        map.put("landing_type", 2);
                    }
                    C1024380clQ c1024380clQ = LIZ;
                    long jLongValue = ((Number) pair.second).longValue();
                    c1024380clQ.getClass();
                    if (z) {
                        i = 1;
                    } else if (jLongValue == 0) {
                        i = 0;
                    }
                    map.put("response_status", Integer.valueOf(i));
                    C1024100cky c1024100ckyLIZ = C1024150cl3.LIZ();
                    c1024100ckyLIZ.LIZIZ = "ad_landing_channel_query";
                    c1024100ckyLIZ.LIZ = "ad_wap_stat";
                    c1024100ckyLIZ.LIZLLL(Long.valueOf(c1024400clS.LIZ));
                    c1024100ckyLIZ.LJI(c1024400clS.LIZIZ);
                    c1024100ckyLIZ.LIZ(map);
                    c1024100ckyLIZ.LJ();
                    c1024100ckyLIZ.LJIIIZ();
                    C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("ad_wap_stat", "ad_landing_channel_query", String.valueOf(c1024400clS.LIZ), c1024400clS.LIZIZ, null);
                    c1022820ciuLJ.LIZJ("debug", "ad_event_type");
                    c1022820ciuLJ.LIZ(map);
                    c1022820ciuLJ.LJIIIIZZ();
                    if (c1551680qTu != null) {
                        String str = c1024400clS.LIZLLL;
                        if (((LandPageGeckoOptimizeStrategyModel) C1024360clO.LIZIZ.getValue()).enablePauseAndResumeTask && str != null && str.length() != 0 && C1024300clI.LIZJ.containsKey(str)) {
                            C1024300clI.LIZLLL.put(str, c1551680qTu);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static final void LJIIIZ(long j, long j2, String str) {
        if (str == null) {
            return;
        }
        if (((List) LIZJ.getValue()).contains(str)) {
            ConcurrentHashMap<String, C1024400clS> concurrentHashMap = LJ;
            C1024400clS c1024400clS = concurrentHashMap.get(str);
            if (c1024400clS == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("download_status", 1);
            map.put("is_diff", Integer.valueOf(c1024400clS.LJFF));
            map.put("download_duration", Long.valueOf(System.currentTimeMillis() - c1024400clS.LJ));
            map.put("download_size", Long.valueOf(j2));
            map.put("package_id", Long.valueOf(j));
            map.put("channel", str);
            C1024100cky c1024100ckyLIZ = C1024150cl3.LIZ();
            c1024100ckyLIZ.LIZ = "draw_ad";
            c1024100ckyLIZ.LIZIZ = "download_finish";
            c1024100ckyLIZ.LJIIIIZZ();
            c1024100ckyLIZ.LIZ(map);
            c1024100ckyLIZ.LJ();
            c1024100ckyLIZ.LJIIIZ();
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("draw_ad", "download_finish", CardStruct.IStatusCode.DEFAULT, null, null);
            c1022820ciuLJ.LIZJ("debug", "ad_event_type");
            c1022820ciuLJ.LIZJ("card_common", "refer");
            c1022820ciuLJ.LIZ(map);
            c1022820ciuLJ.LJIIIIZZ();
            concurrentHashMap.remove(str);
            return;
        }
        ConcurrentHashMap<String, C1024400clS> concurrentHashMap2 = LJ;
        C1024400clS c1024400clS2 = concurrentHashMap2.get(str);
        if (c1024400clS2 != null) {
            HashMap map2 = new HashMap();
            map2.put("download_status", 1);
            map2.put("is_diff", Integer.valueOf(c1024400clS2.LJFF));
            map2.put("channel_name", str);
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            if (iAdLandPagePreloadService != null) {
                iAdLandPagePreloadService.C0();
                map2.put("landing_type", 2);
            }
            map2.put("download_duration", Long.valueOf(System.currentTimeMillis() - c1024400clS2.LJ));
            map2.put("download_size", Long.valueOf(j2));
            map2.put("package_id", Long.valueOf(j));
            C1024100cky c1024100ckyLIZ2 = C1024150cl3.LIZ();
            c1024100ckyLIZ2.LIZIZ = "ad_landing_channel_download_finish";
            c1024100ckyLIZ2.LIZ = "ad_wap_stat";
            c1024100ckyLIZ2.LIZLLL(Long.valueOf(c1024400clS2.LIZ));
            c1024100ckyLIZ2.LJI(c1024400clS2.LIZIZ);
            c1024100ckyLIZ2.LJ();
            c1024100ckyLIZ2.LIZ(map2);
            c1024100ckyLIZ2.LJIIIZ();
            C1022820ciu c1022820ciuLJ2 = C2184171Adz.LJ("ad_wap_stat", "ad_landing_channel_download_finish", String.valueOf(c1024400clS2.LIZ), c1024400clS2.LIZIZ, null);
            c1022820ciuLJ2.LIZJ("debug", "ad_event_type");
            c1022820ciuLJ2.LIZ(map2);
            c1022820ciuLJ2.LJIIIIZZ();
            C1024300clI.LJ(c1024400clS2.LIZLLL);
            concurrentHashMap2.remove(str);
        }
    }

    public static final void LJIILIIL(final List<? extends Aweme> list, final String str, final AbstractC1552040qUU abstractC1552040qUU) {
        if (list != null && !list.isEmpty()) {
            C844470XAv.LIZ.getClass();
            C811103Ev.LIZIZ(C844470XAv.LIZ(), "Feed data update");
            C15O7.LIZJ(new Callable() { // from class: X.0cYz
                /* JADX WARN: Removed duplicated region for block: B:134:0x0295  */
                /* JADX WARN: Removed duplicated region for block: B:163:0x0313  */
                /* JADX WARN: Removed duplicated region for block: B:166:0x0321  */
                /* JADX WARN: Removed duplicated region for block: B:169:0x032f  */
                /* JADX WARN: Removed duplicated region for block: B:172:0x0372  */
                /* JADX WARN: Removed duplicated region for block: B:177:0x0390  */
                /* JADX WARN: Removed duplicated region for block: B:180:0x03a8  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x03b7  */
                /* JADX WARN: Removed duplicated region for block: B:197:0x03e0  */
                /* JADX WARN: Removed duplicated region for block: B:199:0x03e5  */
                /* JADX WARN: Removed duplicated region for block: B:207:0x0429  */
                /* JADX WARN: Removed duplicated region for block: B:210:0x0439  */
                /* JADX WARN: Removed duplicated region for block: B:213:0x044b  */
                /* JADX WARN: Removed duplicated region for block: B:229:0x049c  */
                /* JADX WARN: Removed duplicated region for block: B:244:0x04d7  */
                /* JADX WARN: Removed duplicated region for block: B:245:0x04da  */
                /* JADX WARN: Removed duplicated region for block: B:246:0x04dd  */
                /* JADX WARN: Removed duplicated region for block: B:274:0x0551 A[PHI: r16
                  0x0551: PHI (r16v1 java.lang.String) = (r16v0 java.lang.String), (r16v9 java.lang.String) binds: [B:272:0x054d, B:159:0x0303] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:280:0x055d A[PHI: r16 r17 r18 r19
                  0x055d: PHI (r16v3 java.lang.String) = (r16v2 java.lang.String), (r16v7 java.lang.String) binds: [B:278:0x0559, B:165:0x031f] A[DONT_GENERATE, DONT_INLINE]
                  0x055d: PHI (r17v2 java.lang.String) = (r17v1 java.lang.String), (r17v6 java.lang.String) binds: [B:278:0x0559, B:165:0x031f] A[DONT_GENERATE, DONT_INLINE]
                  0x055d: PHI (r18v2 java.lang.String) = (r18v1 java.lang.String), (r18v6 java.lang.String) binds: [B:278:0x0559, B:165:0x031f] A[DONT_GENERATE, DONT_INLINE]
                  0x055d: PHI (r19v1 java.lang.Integer) = (r19v0 java.lang.Integer), (r19v5 java.lang.Integer) binds: [B:278:0x0559, B:165:0x031f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:283:0x0563 A[PHI: r16 r17 r18 r19 r20
                  0x0563: PHI (r16v4 java.lang.String) = (r16v3 java.lang.String), (r16v6 java.lang.String) binds: [B:281:0x055f, B:168:0x032d] A[DONT_GENERATE, DONT_INLINE]
                  0x0563: PHI (r17v3 java.lang.String) = (r17v2 java.lang.String), (r17v5 java.lang.String) binds: [B:281:0x055f, B:168:0x032d] A[DONT_GENERATE, DONT_INLINE]
                  0x0563: PHI (r18v3 java.lang.String) = (r18v2 java.lang.String), (r18v5 java.lang.String) binds: [B:281:0x055f, B:168:0x032d] A[DONT_GENERATE, DONT_INLINE]
                  0x0563: PHI (r19v2 java.lang.Integer) = (r19v1 java.lang.Integer), (r19v4 java.lang.Integer) binds: [B:281:0x055f, B:168:0x032d] A[DONT_GENERATE, DONT_INLINE]
                  0x0563: PHI (r20v1 java.lang.Integer) = (r20v0 java.lang.Integer), (r20v3 java.lang.Integer) binds: [B:281:0x055f, B:168:0x032d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:323:0x0476 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:327:0x0012 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r15v1, types: [X.0cZ6, java.lang.Runnable] */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instruction units count: 1646
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.CallableC1016670cYz.call():java.lang.Object");
                }
            });
            if (((Boolean) C257180A6a.LIZ.getValue()).booleanValue() && list != null) {
                final ArrayList arrayList = new ArrayList(list);
                C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0cle
                    public final void LIZ() {
                        C1024540clg c1024540clg;
                        List<AnchorCommonStruct> anchors;
                        AnchorCommonStruct next;
                        String schema;
                        Aweme next2;
                        AwemeRawAd awemeRawAdLJJIJLIJ;
                        AwemeRawAd awemeRawAdLJJIJLIJ2;
                        String openUrl;
                        AwemeRawAd awemeRawAdLJJIJLIJ3;
                        String minisVideoMainUrl;
                        String openUrl2;
                        AwemeRawAd awemeRawAd;
                        String openUrl3;
                        ArrayList<Aweme> arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList();
                        for (Aweme aweme : arrayList2) {
                            Aweme aweme2 = aweme;
                            if (C1017070cZd.LLIIIJ(aweme2) && aweme2 != null && (awemeRawAd = aweme2.getAwemeRawAd()) != null && (openUrl3 = awemeRawAd.getOpenUrl()) != null && C123100dR.LIZ(openUrl3)) {
                                arrayList3.add(aweme);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = arrayList3.iterator();
                        while (true) {
                            c1024540clg = null;
                            if (!it2.hasNext()) {
                                break;
                            }
                            AwemeRawAd awemeRawAdLJJIJLIJ4 = C1017070cZd.LJJIJLIJ((Aweme) it2.next());
                            if (awemeRawAdLJJIJLIJ4 != null && (openUrl2 = awemeRawAdLJJIJLIJ4.getOpenUrl()) != null) {
                                arrayList4.add(openUrl2);
                            }
                        }
                        if (!(!arrayList4.isEmpty())) {
                            if (C0BVF.LIZ()) {
                                ArrayList<Aweme> arrayList5 = arrayList;
                                ArrayList arrayList6 = new ArrayList();
                                for (Aweme aweme3 : arrayList5) {
                                    if (aweme3 != null && (anchors = aweme3.getAnchors()) != null) {
                                        Iterator<AnchorCommonStruct> it3 = anchors.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                next = it3.next();
                                                if (next.getType() == EnumC1430380nKG.MINIS_ANCHOR.getTYPE()) {
                                                    break;
                                                }
                                            } else {
                                                next = null;
                                                break;
                                            }
                                        }
                                        AnchorCommonStruct anchorCommonStruct = next;
                                        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
                                            arrayList6.add(schema);
                                        }
                                    }
                                }
                                if (((Boolean) C0AN2.LIZ.getValue()).booleanValue()) {
                                    IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
                                    if (iMinisApiService != null) {
                                        iMinisApiService.LJJ(null, EnumC2196771AyJ.ANCHOR, arrayList6);
                                        return;
                                    }
                                    return;
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("minis_preload_");
                                sbLIZ.append(System.currentTimeMillis());
                                C1024300clI.LIZ(C2188811AlT.LIZIZ(sbLIZ), new C1024530clf(null, EnumC2196771AyJ.ANCHOR, arrayList6));
                                return;
                            }
                            return;
                        }
                        if (((Number) C279450AxL.LIZ.getValue()).intValue() > 0) {
                            Iterator<Aweme> it4 = arrayList.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                                Aweme aweme4 = next2;
                                if (C1017070cZd.LLIIIJ(aweme4) && aweme4 != null && (awemeRawAdLJJIJLIJ2 = C1017070cZd.LJJIJLIJ(aweme4)) != null && (openUrl = awemeRawAdLJJIJLIJ2.getOpenUrl()) != null && C123100dR.LIZ(openUrl) && (awemeRawAdLJJIJLIJ3 = C1017070cZd.LJJIJLIJ(aweme4)) != null && (minisVideoMainUrl = awemeRawAdLJJIJLIJ3.getMinisVideoMainUrl()) != null && C123100dR.LIZ(minisVideoMainUrl)) {
                                    break;
                                }
                            }
                            Aweme aweme5 = next2;
                            if (aweme5 != null && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme5)) != null) {
                                String openUrl4 = awemeRawAdLJJIJLIJ.getOpenUrl();
                                String minisVideoMainUrl2 = awemeRawAdLJJIJLIJ.getMinisVideoMainUrl();
                                if (openUrl4 != null && openUrl4.length() != 0 && minisVideoMainUrl2 != null && minisVideoMainUrl2.length() != 0) {
                                    c1024540clg = new C1024540clg(openUrl4, minisVideoMainUrl2);
                                }
                            }
                        }
                        if (!((Boolean) C0AN2.LIZ.getValue()).booleanValue()) {
                            C1024300clI.LIZ("minis_preload_" + System.currentTimeMillis(), new C1024530clf(c1024540clg, EnumC2196771AyJ.ADS, arrayList4));
                        } else {
                            IMinisApiService iMinisApiService2 = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
                            if (iMinisApiService2 != null) {
                                iMinisApiService2.LJJ(c1024540clg, EnumC2196771AyJ.ADS, arrayList4);
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PreloadAdWebHelper@b810.preloadMinis$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PreloadAdWebHelper@b810.preloadMinis$1");
                    }
                });
            }
            IEcUgVSAService iEcUgVSAService = (IEcUgVSAService) PluggableExtentionKt.pluggableSpi$default(IEcUgVSAService.class, false, false, false, 14, null);
            if (iEcUgVSAService != null) {
                iEcUgVSAService.LJI(str, list);
            }
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZIZ() != null) {
                C1041280dCg.LJIIIZ(list);
            }
        }
    }

    public static final void LJIIIIZZ(long j, long j2, String str, Throwable th) {
        String message;
        String message2;
        if (str == null) {
            return;
        }
        String str2 = "";
        if (((List) LIZJ.getValue()).contains(str)) {
            ConcurrentHashMap<String, C1024400clS> concurrentHashMap = LJ;
            C1024400clS c1024400clS = concurrentHashMap.get(str);
            if (c1024400clS == null) {
                return;
            }
            HashMap map = new HashMap();
            map.put("download_status", 0);
            map.put("is_diff", Integer.valueOf(c1024400clS.LJFF));
            map.put("download_duration", Long.valueOf(System.currentTimeMillis() - c1024400clS.LJ));
            map.put("download_size", Long.valueOf(j2));
            map.put("package_id", Long.valueOf(j));
            map.put("channel", str);
            if (th != null && (message2 = th.getMessage()) != null) {
                str2 = message2;
            }
            map.put("fail_reason", str2);
            C1024100cky c1024100ckyLIZ = C1024150cl3.LIZ();
            c1024100ckyLIZ.LIZ = "draw_ad";
            c1024100ckyLIZ.LIZIZ = "download_finish";
            c1024100ckyLIZ.LJIIIIZZ();
            c1024100ckyLIZ.LIZ(map);
            c1024100ckyLIZ.LJ();
            c1024100ckyLIZ.LJIIIZ();
            C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("draw_ad", "download_finish", CardStruct.IStatusCode.DEFAULT, null, null);
            c1022820ciuLJ.LIZJ("debug", "ad_event_type");
            c1022820ciuLJ.LIZJ("card_common", "refer");
            c1022820ciuLJ.LIZ(map);
            c1022820ciuLJ.LJIIIIZZ();
            concurrentHashMap.remove(str);
            return;
        }
        ConcurrentHashMap<String, C1024400clS> concurrentHashMap2 = LJ;
        C1024400clS c1024400clS2 = concurrentHashMap2.get(str);
        if (c1024400clS2 != null) {
            HashMap map2 = new HashMap();
            map2.put("download_status", 0);
            map2.put("is_diff", Integer.valueOf(c1024400clS2.LJFF));
            map2.put("channel_name", str);
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            if (iAdLandPagePreloadService != null) {
                iAdLandPagePreloadService.C0();
                map2.put("landing_type", 2);
            }
            map2.put("download_duration", Long.valueOf(System.currentTimeMillis() - c1024400clS2.LJ));
            map2.put("download_size", Long.valueOf(j2));
            if (th != null && (message = th.getMessage()) != null) {
                str2 = message;
            }
            map2.put("download_fail_reason", str2);
            map2.put("package_id", Long.valueOf(j));
            C1024100cky c1024100ckyLIZ2 = C1024150cl3.LIZ();
            c1024100ckyLIZ2.LIZIZ = "ad_landing_channel_download_finish";
            c1024100ckyLIZ2.LIZ = "ad_wap_stat";
            c1024100ckyLIZ2.LIZLLL(Long.valueOf(c1024400clS2.LIZ));
            c1024100ckyLIZ2.LJI(c1024400clS2.LIZIZ);
            c1024100ckyLIZ2.LIZ(map2);
            c1024100ckyLIZ2.LJ();
            c1024100ckyLIZ2.LJIIIZ();
            C1022820ciu c1022820ciuLJ2 = C2184171Adz.LJ("ad_wap_stat", "ad_landing_channel_download_finish", String.valueOf(c1024400clS2.LIZ), c1024400clS2.LIZIZ, null);
            c1022820ciuLJ2.LIZJ("debug", "ad_event_type");
            c1022820ciuLJ2.LIZ(map2);
            c1022820ciuLJ2.LJIIIIZZ();
            C1024300clI.LJ(c1024400clS2.LIZLLL);
            concurrentHashMap2.remove(str);
        }
    }

    public static final void LJIILLIIL(Integer num, long j, String str, String str2, NativeSiteConfig nativeSiteConfig) {
        List<String> list;
        String strK0;
        String strK02;
        if (num != null) {
            if (num.intValue() == 4) {
                IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                if (iAdLandPagePreloadService != null) {
                    strK02 = iAdLandPagePreloadService.K0("splash");
                } else {
                    strK02 = null;
                }
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZIZ() != null) {
                    C1041280dCg.LIZIZ(str, strK02, null);
                }
                if (str != null) {
                    LJ.put(str, new C1024400clS(j, str2, 12));
                }
                IAdLandPagePreloadService iAdLandPagePreloadService2 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                if (iAdLandPagePreloadService2 != null) {
                    iAdLandPagePreloadService2.J0(Long.valueOf(j), str);
                    return;
                }
                return;
            }
            if (num.intValue() != 9 || nativeSiteConfig == null || (list = nativeSiteConfig.geckoChannel) == null) {
                return;
            }
            for (String str3 : list) {
                C1024380clQ c1024380clQ = LIZ;
                IAdLandPagePreloadService iAdLandPagePreloadService3 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                if (iAdLandPagePreloadService3 != null) {
                    strK0 = iAdLandPagePreloadService3.K0("lynx_feed");
                } else {
                    strK0 = null;
                }
                c1024380clQ.getClass();
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZIZ() != null) {
                    C1041280dCg.LIZIZ(str3, strK0, null);
                }
            }
        }
    }
}
