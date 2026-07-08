package X;

import Y.AObjectS56S0000000_3;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.SelfDataManager;
import com.bytedance.nita.memory.MemoryManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.ml.api.BertTokenizerService;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.settings.ForestMemoryStrategy;
import com.ss.android.ugc.aweme.settings.SparkLynxTemplateBundleCacheConfigModel;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0qRV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550190qRV {
    public static final C1550200qRW LIZ = new InterfaceC2188711AlJ() { // from class: X.0qRW
        @Override // X.InterfaceC2188711AlJ
        public final void LIZ(C1768270w7F c1768270w7F) {
            boolean z;
            C1499790p8D c1499790p8D;
            C09QO c09qo;
            if (c1768270w7F.LIZLLL < 9 && c1768270w7F.LIZIZ != C09QO.LOW_PHYSICAL_MEM) {
                z = false;
            } else {
                z = true;
            }
            System.currentTimeMillis();
            if (((Boolean) C0AMA.LIZ.getValue()).booleanValue() && (c09qo = c1768270w7F.LIZIZ) != null && c09qo != C09QO.LOW_BIZ_MANUAL && !z) {
                return;
            }
            try {
                if (((Boolean) C0AH1.LIZ.getValue()).booleanValue()) {
                    C1329320khG.LIZ(0.5d);
                    C0QD7.LIZ.LIZIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (C0C64.LJIILLIIL().LJIIL(1.0d, 31744, "default_download_cache_clean_percentage", true) > 0.0d) {
                try {
                    C844470XAv.LIZ.getClass();
                    Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C844470XAv.LIZ()).clearMemoryCacheData(C0C64.LJIILLIIL().LJIIL(1.0d, 31744, "default_download_cache_clean_percentage", true));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            C01GW c01gw = C04WS.LIZ;
            if ((((Number) c01gw.getValue()).intValue() == 1 && c1768270w7F.LIZIZ == C09QO.LOW_PHYSICAL_MEM) || ((Number) c01gw.getValue()).intValue() == 2) {
                try {
                    ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLILIL();
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
            }
            BertTokenizerService bertTokenizerService = (BertTokenizerService) PluggableExtentionKt.pluggableSpi(BertTokenizerService.class);
            if (bertTokenizerService != null) {
                bertTokenizerService.LJII();
            }
            try {
                C1550190qRV.LIZJ();
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
            try {
                if (C09QO.LOW_JAVA_MEM == c1768270w7F.LIZIZ) {
                    int i = C1550210qRX.LIZ;
                }
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
            }
            try {
                C1550190qRV.LIZIZ();
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
            }
            try {
                if (((Boolean) C17999073d.LIZIZ.getValue()).booleanValue()) {
                    MemoryManager.LLJIJIL.getClass();
                    MemoryManager.LLILLJJLI.clear();
                }
            } catch (Throwable th7) {
                TryCatchGuardChecker.doCheck(th7);
            }
            try {
                C1550190qRV.LIZ();
            } catch (Throwable th8) {
                TryCatchGuardChecker.doCheck(th8);
            }
            try {
                if (((Boolean) C0AOC.LIZ.getValue()).booleanValue()) {
                    C1606010rtX.LIZIZ.LJ();
                }
            } catch (Throwable th9) {
                TryCatchGuardChecker.doCheck(th9);
            }
            if (((Boolean) C0AM8.LIZ.getValue()).booleanValue()) {
                try {
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).m6();
                } catch (Throwable th10) {
                    TryCatchGuardChecker.doCheck(th10);
                }
            }
            if (((Boolean) C0AM7.LIZ.getValue()).booleanValue()) {
                try {
                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).T5();
                } catch (Throwable th11) {
                    TryCatchGuardChecker.doCheck(th11);
                }
            }
            try {
                if (((Boolean) C04V6.LIZIZ.getValue()).booleanValue()) {
                    C807280Vle.LIZIZ.LJI();
                }
            } catch (Throwable th12) {
                TryCatchGuardChecker.doCheck(th12);
            }
            try {
                if (((Boolean) C04V5.LIZIZ.getValue()).booleanValue() && (c1499790p8D = C1499780p8C.LIZLLL) != null) {
                    c1499790p8D.LIZ.LJIIIZ(-1);
                }
            } catch (Throwable th13) {
                TryCatchGuardChecker.doCheck(th13);
            }
            if (z) {
                try {
                    if (((Boolean) C0B6D.LIZ.getValue()).booleanValue()) {
                        C09CQ.LIZ = new Gson();
                        JsonParseUtils.LIZ = JsonParseUtils.LIZIZ().LIZ();
                    }
                } catch (Throwable th14) {
                    TryCatchGuardChecker.doCheck(th14);
                }
            }
            try {
                C1ER1.LIZIZ.R();
            } catch (Throwable th15) {
                TryCatchGuardChecker.doCheck(th15);
            }
            C303370Bup.LIZ.getClass();
            ForestMemoryStrategy forestMemoryStrategyLIZ = C303370Bup.LIZ();
            if (z) {
                C1535890q4R.LIZ.getClass();
                try {
                    Iterator<Map.Entry<String, C1541070qCn<?, ?>>> it2 = C1535890q4R.LIZJ.entrySet().iterator();
                    while (it2.hasNext()) {
                        it2.next().getValue().LJI();
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th16) {
                    TryCatchGuardChecker.doCheck(th16);
                    C189200o6.m2constructorimpl(new C098200Yq(th16));
                }
            } else {
                C1535890q4R.LIZ.getClass();
                try {
                    Iterator<Map.Entry<String, C1541070qCn<?, ?>>> it3 = C1535890q4R.LIZJ.entrySet().iterator();
                    while (it3.hasNext()) {
                        it3.next().getValue().LJII();
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th17) {
                    TryCatchGuardChecker.doCheck(th17);
                    C189200o6.m2constructorimpl(new C098200Yq(th17));
                }
            }
            if (forestMemoryStrategyLIZ != null && forestMemoryStrategyLIZ.allowEvict) {
                try {
                    C1533940q1I.LJFF();
                } catch (Throwable th18) {
                    TryCatchGuardChecker.doCheck(th18);
                }
            }
            try {
                if ((((Number) C296050Bj1.LIZ.getValue()).intValue() & 64) > 0) {
                    C529890KqJ.LIZ().LJJLIIIJLLLLLLLZ();
                }
            } catch (Throwable th19) {
                TryCatchGuardChecker.doCheck(th19);
            }
            if (z && ((SparkLynxTemplateBundleCacheConfigModel) C1550220qRY.LIZIZ.getValue()).clearOnLowMemory) {
                try {
                    C1536910q65.LIZ.evictAll();
                    C1536910q65.LIZIZ.evictAll();
                    C1536910q65.LIZJ.evictAll();
                    ((CopyOnWriteArrayList) C1536910q65.LIZLLL).clear();
                } catch (Throwable th20) {
                    TryCatchGuardChecker.doCheck(th20);
                }
            }
            if (((Boolean) C0AM6.LIZ.getValue()).booleanValue()) {
                try {
                    SelfDataManager.LJ.LIZIZ.clear();
                } catch (Throwable th21) {
                    TryCatchGuardChecker.doCheck(th21);
                }
            }
            if (((Boolean) C261310ALx.LIZ.getValue()).booleanValue()) {
                try {
                    C1485670olR.LIZ().clear();
                } catch (Throwable th22) {
                    TryCatchGuardChecker.doCheck(th22);
                }
            }
            if (((Boolean) C0AM1.LIZ.getValue()).booleanValue()) {
                try {
                    ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJJJJL();
                } catch (Throwable th23) {
                    TryCatchGuardChecker.doCheck(th23);
                }
            }
            if (((Number) C262070AOv.LIZ.getValue()).intValue() == 1) {
                try {
                    INoticeService iNoticeService = (INoticeService) PluggableExtentionKt.pluggableSpi(INoticeService.class);
                    if (iNoticeService != null) {
                        iNoticeService.LJJIIJZLJL();
                    }
                } catch (Throwable th24) {
                    TryCatchGuardChecker.doCheck(th24);
                }
            }
            if (((Boolean) C261320ALy.LIZ.getValue()).booleanValue()) {
                try {
                    synchronized (C1766300w44.LIZ) {
                        C1766300w44.LIZIZ.LIZ();
                    }
                } catch (Throwable th25) {
                    TryCatchGuardChecker.doCheck(th25);
                }
            }
        }
    };

    public static void LIZ() {
        AdSparkHybridContext.Companion.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ad_spark_hybrid_load_callback_can_clear", true)) {
            C1537480q70.Companion.getClass();
            for (C1537480q70 c1537480q70 : C1537480q70.hybridContextMap.values()) {
                if (c1537480q70 instanceof AdSparkHybridContext) {
                    ((AdSparkHybridContext) c1537480q70).loadCallbacks.clear();
                }
            }
        }
    }

    public static void LIZIZ() {
        if (C1827607Du.LJIIIZ(new AObjectS56S0000000_3(3), false)) {
            try {
                if (C1330560kjG.LJ) {
                    C1330560kjG.LIZLLL.clear();
                } else {
                    C1330560kjG.LIZJ.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clearHashMap mImageLoadDurationMap clear failed! t = ");
                sbLIZ.append(th);
                C1328570kg3.LIZIZ("UserSenceListener", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static void LIZJ() {
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        if (C1529590puH.LJFF) {
            Iterator it2 = C1537060q6K.LJFF().entrySet().iterator();
            while (it2.hasNext()) {
                Iterator<Map.Entry<String, CopyOnWriteArrayList<SoftReference<InterfaceC1540940qCa>>>> it3 = ((C1051630dTN) ((Map.Entry) it2.next()).getValue()).LJIIJ.snapshot().entrySet().iterator();
                while (it3.hasNext()) {
                    Iterator<SoftReference<InterfaceC1540940qCa>> it4 = it3.next().getValue().iterator();
                    while (it4.hasNext()) {
                        InterfaceC1540940qCa interfaceC1540940qCa = it4.next().get();
                        if (interfaceC1540940qCa != null) {
                            interfaceC1540940qCa.release();
                        }
                        it4.remove();
                    }
                }
                it2.remove();
            }
        }
    }
}
