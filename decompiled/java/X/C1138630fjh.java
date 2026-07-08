package X;

import Y.AfS3S0201100_17;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.assets.FaceRecognitionMeta;
import com.bytedance.android.livesdk.gift.base.platform.core.assets.AssetsApi;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.AssetBase;
import com.bytedance.android.livesdk.gift.model.DistributionStrategy;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.GiftEffectFixConcurrentCrashSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectLayerEnabledSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceManagerSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.text.a0;
import org.json.JSONException;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0fjh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138630fjh {
    public static final C1138630fjh LIZ = new C1138630fjh();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(183));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(182));
    public static final ConcurrentHashMap<Long, AssetsModel> LIZLLL = new ConcurrentHashMap<>();
    public static List<AssetsModel> LJ;
    public static final List<AssetsModel> LJFF;
    public static final HashMap<String, C1140610fmt> LJI;
    public static final ConcurrentHashMap<Long, AssetsModel> LJII;

    static {
        Application application;
        LJ = GiftEffectFixConcurrentCrashSetting.INSTANCE.isEnable() ? new CopyOnWriteArrayList<>() : new ArrayList<>();
        LJFF = new ArrayList();
        LJI = new HashMap<>();
        LJII = new ConcurrentHashMap<>();
        try {
            ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).initGiftResourceManager(C497740JfY.LJII());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1142700fqG c1142700fqGLJFF = C1142700fqG.LJFF();
        C1139210fkd c1139210fkd = new C1139210fkd();
        if (!((CopyOnWriteArrayList) c1142700fqGLJFF.LIZJ).contains(c1139210fkd)) {
            ((CopyOnWriteArrayList) c1142700fqGLJFF.LIZJ).add(c1139210fkd);
        }
        Context contextLJII = C497740JfY.LJII();
        Context contextN3 = contextLJII != null ? C786410Ut5.N3(contextLJII) : null;
        if (!(contextN3 instanceof Application) || (application = (Application) contextN3) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0fjn
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
                if (iHostAppContext != null && iHostAppContext.isAppBackground()) {
                    C1138630fjh c1138630fjh = C1138630fjh.LIZ;
                    InterfaceC1094160eZy.I0.LJFF(null);
                    InterfaceC1094160eZy.F0.LJFF(null);
                    InterfaceC1094160eZy.G0.LJFF(null);
                    InterfaceC1094160eZy.H0.LJFF(null);
                    C1138630fjh.LIZJ("expired");
                    if (C1142700fqG.LJFF().LIZIZ.LIZ instanceof C1138730fjr) {
                        final String str = ((C1138730fjr) C1142700fqG.LJFF().LIZIZ.LIZ).LIZJ;
                        new RunnableC823120WQs() { // from class: X.0fju
                            @Override // X.RunnableC823120WQs, java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("LiveGiftAssetsManager@6e36.deleteUselessPath$1");
                                try {
                                    C0VSJ c0vsj = new C0VSJ(str);
                                    if (c0vsj.exists()) {
                                        try {
                                            C08P1.LIZLLL(c0vsj);
                                            ((ConcurrentHashMap) C1142700fqG.LJFF().LJ).clear();
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("LiveGiftAssetsManager@6e36.deleteUselessPath$1");
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super((Object) null);
                            }
                        }.LIZ();
                    }
                }
            }
        });
    }

    public static InterfaceC1138810fjz LJI() {
        return (InterfaceC1138810fjz) LIZJ.getValue();
    }

    public static void LJIIIZ() {
        List<Gift> list;
        C1140280fmM c1140280fmMLIZIZ = C1140130fm7.LIZIZ();
        List<GiftPage> giftPageList = GiftManager.inst().getGiftPageList();
        ArrayList arrayList = new ArrayList();
        ArrayList<AssetsModel> arrayList2 = new ArrayList();
        for (GiftPage giftPage : giftPageList) {
            if (giftPage == null || (list = giftPage.gifts) == null) {
                list = C13BV.INSTANCE;
            }
            for (Gift gift : list) {
                if (gift.isDisplayedOnPanel) {
                    long j = gift.primaryEffectId;
                    if (j != 0) {
                        arrayList.add(Long.valueOf(j));
                        List<GiftColorInfo> list2 = gift.colorInfos;
                        if (list2 != null) {
                            Iterator<GiftColorInfo> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                Long l = it2.next().colorEffectId;
                                if (l != null) {
                                    arrayList.add(l);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getAssetsModelCacheOpt()) {
            for (Map.Entry<Long, AssetsModel> entry : LIZLLL.entrySet()) {
                if (arrayList.contains(Long.valueOf(entry.getValue().id))) {
                    arrayList2.add(entry.getValue());
                }
            }
        } else {
            for (AssetsModel assetsModel : LJ) {
                if (arrayList.contains(Long.valueOf(assetsModel.id))) {
                    arrayList2.add(assetsModel);
                }
            }
        }
        for (AssetsModel assetsModel2 : arrayList2) {
            C1139900flk c1139900flk = new C1139900flk(LJI);
            c1139900flk.LJ = 2;
            c1139900flk.LIZLLL = EnumC1138770fjv.PRE_DOWNLOAD;
            c1139900flk.LIZIZ = assetsModel2.id;
            if (c1140280fmMLIZIZ != null) {
                c1140280fmMLIZIZ.LIZ(null, c1139900flk);
            }
        }
    }

    public static void LIZJ(final String str) {
        if (LiveGiftResourceManagerSettings.INSTANCE.enableDeleteUnused()) {
            C1139900flk c1139900flk = new C1139900flk(LJI);
            c1139900flk.LIZLLL = EnumC1138770fjv.DELETE_UNUSED;
            C1140310fmP c1140310fmPLIZ = C1140130fm7.LIZ();
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c1140310fmPLIZ != null) {
                c1140310fmPLIZ.LIZ(new AbstractC1140580fmq() { // from class: X.0fm9
                    @Override // X.AbstractC1140580fmq
                    public final void LIZ(C1139900flk c1139900flk2) throws JSONException {
                        List<String> list;
                        List<String> list2;
                        if (c1139900flk2 != null && (list = c1139900flk2.LJIILIIL) != null && (!((ArrayList) list).isEmpty())) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            Long lValueOf = null;
                            if (c1139900flk2 != null) {
                                list2 = c1139900flk2.LJIILIIL;
                                lValueOf = Long.valueOf(c1139900flk2.LJIIL);
                            } else {
                                list2 = null;
                            }
                            C248700xh.LIZ(list2, lValueOf, jElapsedRealtime2, str);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(null);
                    }
                }, c1139900flk);
            }
        }
    }

    public static AssetsModel LJFF(long j) {
        AssetsModel next;
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getAssetsModelCacheOpt()) {
            return LIZLLL.get(Long.valueOf(j));
        }
        Iterator<AssetsModel> it2 = LJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.id == j) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static FaceRecognitionMeta LJII(long j, Integer num) {
        AssetsModel next;
        AssetsModel assetsModel;
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getAssetsModelCacheOpt()) {
            assetsModel = LIZLLL.get(Long.valueOf(j));
        } else {
            Iterator<AssetsModel> it2 = LJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.id == j) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            assetsModel = next;
        }
        if (assetsModel == null) {
            return null;
        }
        if (num != null && !LiveGiftEffectLayerEnabledSetting.INSTANCE.isEnabled()) {
            for (DistributionStrategy distributionStrategy : assetsModel.distributionStrategy) {
                if (distributionStrategy.resourceType == num.intValue()) {
                    AssetBase assetBase = distributionStrategy.assetBase;
                    if (assetBase == null) {
                        return null;
                    }
                    return assetBase.faceMeta;
                }
            }
        }
        return assetsModel.faceRecognitionArchiveMeta;
    }

    public static String LJIIIIZZ(long j, Integer num) {
        C1139230fkf c1139230fkfLIZ = LJI().LIZ(LJFF(j), 0, num);
        if (c1139230fkfLIZ == null) {
            return "";
        }
        return C1142700fqG.LJFF().LIZIZ.LIZ.LIZIZ(c1139230fkfLIZ);
    }

    public final void LIZ(AssetsModel assetsModel, boolean z) {
        Boolean boolValueOf;
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getAssetsModelCacheOpt()) {
            if (!z && LIZLLL.get(Long.valueOf(assetsModel.id)) != null) {
                return;
            }
            LIZLLL.put(Long.valueOf(assetsModel.id), assetsModel);
            return;
        }
        if (!z) {
            ConcurrentHashMap<Long, AssetsModel> concurrentHashMap = LJII;
            if (concurrentHashMap != null) {
                boolValueOf = Boolean.valueOf(concurrentHashMap.contains(Long.valueOf(assetsModel.id)));
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                return;
            }
        }
        synchronized (this) {
            if (z) {
                try {
                    List<AssetsModel> list = LJFF;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (ArrayList) list) {
                        if (((AssetsModel) obj).id == assetsModel.id) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((ArrayList) LJFF).remove((AssetsModel) it2.next());
                    }
                    List<AssetsModel> list2 = LJ;
                    ArrayList arrayList2 = new ArrayList();
                    for (AssetsModel assetsModel2 : list2) {
                        if (assetsModel2.id == assetsModel.id) {
                            arrayList2.add(assetsModel2);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        LJ.remove((AssetsModel) it3.next());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            ((ArrayList) LJFF).add(assetsModel);
            LJ.add(assetsModel);
            ConcurrentHashMap<Long, AssetsModel> concurrentHashMap2 = LJII;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.put(Long.valueOf(assetsModel.id), assetsModel);
            }
            C1133450fbL.LIZIZ(LJ);
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    public static C11JF LJIIJ(int i, Long l, boolean z, Collection collection, InterfaceC1133140faq interfaceC1133140faq) {
        ?? arrayList;
        C259800zU c259800zU = new C259800zU();
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getAssetsModelCacheOpt()) {
            arrayList = new ArrayList();
            if (collection != null) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    long jLongValue = ((Number) it2.next()).longValue();
                    if (jLongValue != 0 && LIZLLL.get(Long.valueOf(jLongValue)) == null) {
                        arrayList.add(Long.valueOf(jLongValue));
                    }
                }
            }
        } else {
            arrayList = new ArrayList();
            if (collection != null) {
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    long jLongValue2 = ((Number) it3.next()).longValue();
                    if (!((ArrayList) C1133460fbM.LIZ).contains(Long.valueOf(jLongValue2)) && jLongValue2 != 0) {
                        arrayList.add(Long.valueOf(jLongValue2));
                    }
                }
            }
        }
        c259800zU.element = arrayList;
        String strLJJJLL = null;
        if (arrayList.isEmpty() && GiftReceiveFlowFluencyOptSetting.INSTANCE.getAssetsModelCacheOpt()) {
            if (interfaceC1133140faq != null) {
                interfaceC1133140faq.onSuccess();
            }
            return null;
        }
        ?? arrayList2 = new ArrayList(C13LP.LLIIIZ((Iterable) c259800zU.element));
        C08XD.LJIL(arrayList2);
        c259800zU.element = arrayList2;
        if (!z && arrayList2.isEmpty()) {
            if (interfaceC1133140faq != null) {
                interfaceC1133140faq.onSuccess();
            }
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        if (!((Collection) c259800zU.element).isEmpty()) {
            Iterator it4 = ((Iterable) c259800zU.element).iterator();
            while (it4.hasNext()) {
                long jLongValue3 = ((Number) it4.next()).longValue();
                if (C1138790fjx.LIZ(jLongValue3)) {
                    arrayList3.add(Long.valueOf(jLongValue3));
                }
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C01GW c01gw = LIZIZ;
        boolean zLIZIZ = ((InterfaceC1138800fjy) c01gw.getValue()).LIZIZ();
        C480460Ism.LIZ().getClass();
        AssetsApi assetsApi = (AssetsApi) C480460Ism.LIZLLL(AssetsApi.class);
        String strJoin = TextUtils.join(",", ((InterfaceC1138800fjy) c01gw.getValue()).LIZJ());
        if (!((List) c259800zU.element).isEmpty()) {
            strLJJJLL = a0.LJJJLL(e3.f, a0.LJJJJZ(e3.e, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, c259800zU.element)));
        }
        return (C11JF) assetsApi.getAssetsPost(i, l, zLIZIZ ? 1 : 0, strJoin, strLJJJLL, ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getESVersion(), Boolean.FALSE, null, null, null).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS3S0201100_17(i, jCurrentTimeMillis, interfaceC1133140faq, c259800zU, 0), new AfS3S0201100_17(i, jCurrentTimeMillis, interfaceC1133140faq, c259800zU, 1));
    }

    public static void LIZLLL(long j, InterfaceC1138820fk0 interfaceC1138820fk0, int i, Map map, C1139230fkf c1139230fkf, Integer num) {
        long j2;
        AssetsModel assetsModelLIZLLL = C1138640fji.LIZLLL(j);
        EnumC1138770fjv enumC1138770fjv = EnumC1138770fjv.MESSAGE_USE;
        C1139900flk c1139900flk = new C1139900flk(LJI);
        c1139900flk.LJ = i;
        if (assetsModelLIZLLL != null) {
            j2 = assetsModelLIZLLL.id;
        } else {
            j2 = 0;
        }
        c1139900flk.LIZIZ = j2;
        c1139900flk.LIZLLL = enumC1138770fjv;
        c1139900flk.LIZJ = num;
        c1139900flk.LJFF = interfaceC1138820fk0;
        c1139900flk.LJIILJJIL = map;
        c1139900flk.LJIILL = c1139230fkf;
        C1140280fmM c1140280fmMLIZIZ = C1140130fm7.LIZIZ();
        if (c1140280fmMLIZIZ != null) {
            c1140280fmMLIZIZ.LIZ(null, c1139900flk);
        }
    }

    public static C11KS LIZIZ(final long j, final int i, final Map map, InterfaceC1138820fk0 interfaceC1138820fk0, boolean z, AtomicInteger atomicInteger, Integer num, int i2) {
        final Integer num2 = num;
        final AtomicInteger atomicInteger2 = atomicInteger;
        final boolean z2 = z;
        final InterfaceC1138820fk0 interfaceC1138820fk02 = interfaceC1138820fk0;
        final C1139230fkf c1139230fkf = null;
        if ((i2 & 8) != 0) {
            interfaceC1138820fk02 = null;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        if ((i2 & 64) != 0) {
            atomicInteger2 = null;
        }
        if ((i2 & 128) != 0) {
            num2 = null;
        }
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0fjs
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<Pair<Long, String>> interfaceC2329309At) {
                C1138630fjh c1138630fjh = C1138630fjh.LIZ;
                final long j2 = j;
                final AtomicInteger atomicInteger3 = atomicInteger2;
                final InterfaceC1138820fk0 interfaceC1138820fk03 = interfaceC1138820fk02;
                final boolean z3 = z2;
                final C11KT c11kt = (C11KT) interfaceC2329309At;
                C1138630fjh.LIZLLL(j2, new InterfaceC1138820fk0() { // from class: X.0fjt
                    @Override // X.InterfaceC1138820fk0
                    public final void LIZ(long j3) {
                        if (!c11kt.isDisposed()) {
                            InterfaceC1138820fk0 interfaceC1138820fk04 = interfaceC1138820fk03;
                            if (interfaceC1138820fk04 != null) {
                                interfaceC1138820fk04.LIZ(j3);
                            }
                            if (z3) {
                                c11kt.onSuccess(new Pair<>(Long.valueOf(j3), ""));
                            } else {
                                c11kt.onError(new Exception() { // from class: X.0fk1
                                });
                            }
                        }
                    }

                    @Override // X.InterfaceC1138820fk0
                    public final void onFailed(Throwable th) {
                        if (!c11kt.isDisposed()) {
                            InterfaceC1138820fk0 interfaceC1138820fk04 = interfaceC1138820fk03;
                            if (interfaceC1138820fk04 != null) {
                                interfaceC1138820fk04.onFailed(th);
                            }
                            if (z3) {
                                c11kt.onSuccess(new Pair<>(Long.valueOf(j2), ""));
                                return;
                            }
                            InterfaceC2329309At<Pair<Long, String>> interfaceC2329309At2 = c11kt;
                            if (th == null) {
                                th = new Exception("Unknown");
                            }
                            interfaceC2329309At2.onError(th);
                        }
                    }

                    @Override // X.InterfaceC1138820fk0
                    public final void onProgress(int i3) {
                        InterfaceC1138820fk0 interfaceC1138820fk04;
                        if (!c11kt.isDisposed() && (interfaceC1138820fk04 = interfaceC1138820fk03) != null) {
                            interfaceC1138820fk04.onProgress(i3);
                        }
                    }

                    @Override // X.InterfaceC1138820fk0
                    public final void LIZJ(long j3, String str) {
                        if (!c11kt.isDisposed()) {
                            AtomicInteger atomicInteger4 = atomicInteger3;
                            if (atomicInteger4 != null) {
                                atomicInteger4.incrementAndGet();
                            }
                            InterfaceC1138820fk0 interfaceC1138820fk04 = interfaceC1138820fk03;
                            if (interfaceC1138820fk04 != null) {
                                interfaceC1138820fk04.LIZJ(j3, str);
                            }
                            c11kt.onSuccess(new Pair<>(Long.valueOf(j3), str));
                        }
                    }
                }, i, map, c1139230fkf, num2);
            }
        });
    }
}
