package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.IGeckoGlobalInit;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.policy.loop.LoopPolicy;
import com.bytedance.geckox.policy.v4.UpdateModel;
import com.bytedance.geckox.settings.IGeckoRegister;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.NGSettings;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qUK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551940qUK {
    public final Set<String> LIZ;
    public final Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> LIZIZ;
    public Common LIZJ;
    public GeckoGlobalConfig LIZLLL;
    public C1551890qUF LJ;
    public C1551990qUP LJFF;
    public final AtomicBoolean LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public volatile C1551530qTf LJIIJ;
    public C1552810qVj LJIIJJI;
    public final AtomicBoolean LJIIL;
    public final Map<String, Set<String>> LJIILIIL;
    public final Map<String, Set<String>> LJIILJJIL;

    public final synchronized void LIZIZ() {
        IGeckoGlobalInit iGeckoGlobalInit;
        GeckoGlobalConfig geckoGlobalConfigLIZ;
        if (!this.LJI.get() && (iGeckoGlobalInit = (IGeckoGlobalInit) ServiceManager.get().getServiceForReal(IGeckoGlobalInit.class)) != null && (geckoGlobalConfigLIZ = iGeckoGlobalInit.LIZ()) != null) {
            LJIIIIZZ(geckoGlobalConfigLIZ);
        }
    }

    public final synchronized void LIZJ() {
        if (this.LJ == null) {
            this.LJ = new C1551890qUF(this.LIZLLL);
            AbstractC1553220qWO abstractC1553220qWO = new AbstractC1553220qWO() { // from class: X.0qUN
                @Override // X.AbstractC1553220qWO
                public final void LIZ() {
                    this.LIZ.LJIIL.set(true);
                }

                @Override // X.AbstractC1553220qWO
                public final void LIZIZ(GlobalConfigSettings globalConfigSettings) {
                    LIZLLL(globalConfigSettings);
                }

                @Override // X.AbstractC1553220qWO
                public final void LIZJ(int i) {
                    if (i == 2103) {
                        C1553380qWe.LIZ.LIZ();
                        return;
                    }
                    C1551940qUK c1551940qUK = this.LIZ;
                    if (c1551940qUK.LJIIIIZZ) {
                        return;
                    }
                    c1551940qUK.LJIIIIZZ = true;
                    LIZLLL(c1551940qUK.LJI());
                }

                /* JADX WARN: Type inference failed for: r2v8, types: [T, java.util.List] */
                /* JADX WARN: Type inference failed for: r4v5, types: [T, java.util.ArrayList] */
                public final void LIZLLL(GlobalConfigSettings globalConfigSettings) {
                    int i;
                    boolean z;
                    int i2;
                    Map<String, Map<String, UpdateModel>> map;
                    if (this.LIZ.LIZLLL != null && globalConfigSettings != null && globalConfigSettings.getReqMeta() != null) {
                        C1551940qUK c1551940qUK = this.LIZ;
                        if (c1551940qUK.LJFF == null) {
                            c1551940qUK.LJFF = new C1551990qUP();
                        }
                        C1551940qUK c1551940qUK2 = this.LIZ;
                        final C1551990qUP c1551990qUP = c1551940qUK2.LJFF;
                        long j = c1551940qUK2.LJII;
                        GlobalConfigSettings.ReqMeta reqMeta = globalConfigSettings.getReqMeta();
                        if (c1551990qUP.LIZIZ != null) {
                            Object[] objArr = new Object[2];
                            objArr[0] = "sync queue enable";
                            if (reqMeta.getEnable() == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objArr[1] = Boolean.valueOf(z);
                            C1553130qWF.LIZ("gecko-debug-tag", objArr);
                            if (C797990VSb.LIZ.LJIIIZ() && reqMeta.getQueue() != null && !reqMeta.getQueue().isEmpty() && !c1551990qUP.LIZ.get()) {
                                List<GlobalConfigSettings.RequestConfig> queue = reqMeta.getQueue();
                                c1551990qUP.LIZ.set(true);
                                if (queue != null && !queue.isEmpty() && (map = C1551990qUP.LJFF) != null) {
                                    for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
                                        HashMap map2 = new HashMap();
                                        Map map3 = (Map) entry.getValue();
                                        for (int size = queue.size() - 1; size >= 0; size--) {
                                            List<GlobalConfigSettings.SyncItem> sync = ((GlobalConfigSettings.RequestConfig) ListProtector.get(queue, size)).getSync();
                                            for (int size2 = sync.size() - 1; size2 >= 0; size2--) {
                                                GlobalConfigSettings.SyncItem syncItem = (GlobalConfigSettings.SyncItem) ListProtector.get(sync, size2);
                                                String accessKey = syncItem.getAccessKey();
                                                UpdateModel updateModel = (UpdateModel) map3.get(accessKey);
                                                if (updateModel != null) {
                                                    if (updateModel.getGroups() == null && updateModel.getChannels() == null) {
                                                        GlobalConfigSettings.SyncItem syncItem2 = (GlobalConfigSettings.SyncItem) map2.get(accessKey);
                                                        List<String> group = syncItem.getGroup();
                                                        List<String> target = syncItem.getTarget();
                                                        if (syncItem2 == null) {
                                                            ArrayList arrayList = new ArrayList();
                                                            ArrayList arrayList2 = new ArrayList();
                                                            if (group != null && !group.isEmpty()) {
                                                                arrayList.addAll(group);
                                                            }
                                                            if (target != null && !target.isEmpty()) {
                                                                arrayList2.addAll(target);
                                                            }
                                                            map2.put(accessKey, new GlobalConfigSettings.SyncItem(accessKey, arrayList, arrayList2));
                                                        } else {
                                                            if (group != null && !group.isEmpty()) {
                                                                syncItem2.getGroup().addAll(group);
                                                            }
                                                            if (target != null && !target.isEmpty()) {
                                                                syncItem2.getTarget().addAll(target);
                                                            }
                                                        }
                                                        ListProtector.remove(sync, size2);
                                                    } else {
                                                        List<String> group2 = syncItem.getGroup();
                                                        List<String> target2 = syncItem.getTarget();
                                                        ArrayList arrayList3 = new ArrayList();
                                                        ArrayList arrayList4 = new ArrayList();
                                                        if (updateModel.getGroups() != null && !updateModel.getGroups().isEmpty() && group2 != null) {
                                                            for (String str : updateModel.getGroups()) {
                                                                if (group2.contains(str)) {
                                                                    arrayList3.add(str);
                                                                    group2.remove(str);
                                                                }
                                                            }
                                                        }
                                                        if (updateModel.getChannels() != null && !updateModel.getChannels().isEmpty() && target2 != null) {
                                                            for (String str2 : updateModel.getChannels()) {
                                                                if (target2.contains(str2)) {
                                                                    arrayList4.add(str2);
                                                                    target2.remove(str2);
                                                                }
                                                            }
                                                        }
                                                        if ((group2 == null || group2.isEmpty()) && (target2 == null || target2.isEmpty())) {
                                                            ListProtector.remove(sync, size2);
                                                        }
                                                        if (!arrayList3.isEmpty() || !arrayList4.isEmpty()) {
                                                            GlobalConfigSettings.SyncItem syncItem3 = (GlobalConfigSettings.SyncItem) map2.get(accessKey);
                                                            if (syncItem3 == null) {
                                                                map2.put(accessKey, new GlobalConfigSettings.SyncItem(accessKey, arrayList3, arrayList4));
                                                            } else {
                                                                syncItem3.getTarget().addAll(arrayList4);
                                                                syncItem3.getGroup().addAll(arrayList3);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (sync.isEmpty()) {
                                                ListProtector.remove(queue, size);
                                            }
                                        }
                                        if (!map2.isEmpty()) {
                                            ArrayList arrayList5 = new ArrayList();
                                            Iterator it2 = map2.entrySet().iterator();
                                            while (it2.hasNext()) {
                                                arrayList5.add(((Map.Entry) it2.next()).getValue());
                                            }
                                            if (c1551990qUP.LIZJ == null) {
                                                c1551990qUP.LIZJ = new HashMap();
                                            }
                                            List list = (List) ((HashMap) c1551990qUP.LIZJ).get(entry.getKey());
                                            List list2 = arrayList5;
                                            if (list != null) {
                                                list.addAll(arrayList5);
                                                list2 = list;
                                            }
                                            ((HashMap) c1551990qUP.LIZJ).put(entry.getKey(), list2);
                                        }
                                    }
                                    i2 = 2;
                                } else {
                                    i2 = 2;
                                }
                                Object[] objArr2 = new Object[i2];
                                objArr2[0] = "sync queue filter registered occasion";
                                objArr2[1] = c1551990qUP.LIZJ;
                                C1553130qWF.LIZ("gecko-debug-tag", objArr2);
                                ?? arrayList6 = new ArrayList();
                                long jCurrentTimeMillis = (System.currentTimeMillis() - j) / 1000;
                                int i3 = -1;
                                for (int i4 = 0; i4 < queue.size(); i4++) {
                                    GlobalConfigSettings.RequestConfig requestConfig = (GlobalConfigSettings.RequestConfig) ListProtector.get(queue, i4);
                                    long delay = requestConfig.getDelay();
                                    if (delay <= jCurrentTimeMillis) {
                                        arrayList6.addAll(requestConfig.getSync());
                                        i3 = i4;
                                    } else {
                                        ?? sync2 = requestConfig.getSync();
                                        AbstractC1552990qW1<List<GlobalConfigSettings.SyncItem>> abstractC1552990qW1 = new AbstractC1552990qW1<List<GlobalConfigSettings.SyncItem>>() { // from class: X.0qVn
                                            @Override // X.AbstractC1552990qW1
                                            public final int LIZIZ() {
                                                return 4;
                                            }

                                            @Override // X.AbstractC1552990qW1
                                            public final void LIZ() {
                                                c1551990qUP.LIZ(6, 1, (List) this.LIZIZ);
                                            }
                                        };
                                        abstractC1552990qW1.LIZIZ = sync2;
                                        C1553420qWi.LIZ.LIZ(abstractC1552990qW1, (delay - jCurrentTimeMillis) * 1000);
                                    }
                                }
                                c1551990qUP.LIZLLL.set(queue.size());
                                if (!arrayList6.isEmpty()) {
                                    ((GlobalConfigSettings.RequestConfig) ListProtector.get(queue, i3)).getDelay();
                                    AbstractC1552990qW1<List<GlobalConfigSettings.SyncItem>> abstractC1552990qW12 = new AbstractC1552990qW1<List<GlobalConfigSettings.SyncItem>>() { // from class: X.0qVn
                                        @Override // X.AbstractC1552990qW1
                                        public final int LIZIZ() {
                                            return 4;
                                        }

                                        @Override // X.AbstractC1552990qW1
                                        public final void LIZ() {
                                            c1551990qUP.LIZ(6, 1, (List) this.LIZIZ);
                                        }
                                    };
                                    abstractC1552990qW12.LIZIZ = arrayList6;
                                    C1553420qWi.LIZ.LIZ(abstractC1552990qW12, 0L);
                                }
                            }
                        }
                        C1552030qUT c1552030qUT = C1553380qWe.LIZ;
                        C1551940qUK c1551940qUK3 = this.LIZ;
                        boolean zLJIIIZ = c1551940qUK3.LJIIIZ();
                        GlobalConfigSettings globalConfigSettingsLJI = c1551940qUK3.LJI();
                        if (globalConfigSettingsLJI != null && globalConfigSettingsLJI.getReqMeta() != null) {
                            if (zLJIIIZ && globalConfigSettingsLJI.getReqMeta().getPollEnable() == 1) {
                                i = 2;
                                zLJIIIZ = true;
                            } else {
                                i = 2;
                                zLJIIIZ = false;
                            }
                        } else {
                            i = 2;
                        }
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = "gecko update combine enable:";
                        objArr3[1] = Boolean.valueOf(zLJIIIZ);
                        C1553130qWF.LIZ("gecko-debug-tag", objArr3);
                        c1552030qUT.getClass();
                        Object[] objArr4 = new Object[i];
                        objArr4[0] = "loop enable update";
                        objArr4[1] = Boolean.valueOf(zLJIIIZ);
                        C1553130qWF.LIZ("gecko-debug-tag", objArr4);
                        c1552030qUT.LIZLLL.set(zLJIIIZ);
                        if (!zLJIIIZ) {
                            c1552030qUT.LIZ();
                        }
                        Map<String, GlobalConfigSettings.GeckoPollingConfig> checkUpdate = globalConfigSettings.getReqMeta().getCheckUpdate();
                        if (checkUpdate != null && !checkUpdate.isEmpty()) {
                            for (Map.Entry<String, GlobalConfigSettings.GeckoPollingConfig> entry2 : checkUpdate.entrySet()) {
                                String key = entry2.getKey();
                                int interval = entry2.getValue().getInterval();
                                LoopPolicy loopPolicy = (LoopPolicy) ((ConcurrentHashMap) c1552030qUT.LIZIZ).get(key);
                                if (loopPolicy == null) {
                                    loopPolicy = new LoopPolicy(key, ((Integer) ((ConcurrentHashMap) c1552030qUT.LIZJ).get(key)).intValue());
                                    loopPolicy.LJFF = new C1553260qWS(c1552030qUT.LIZ, EnumC1552440qV8.valueOf(key));
                                    ((ConcurrentHashMap) c1552030qUT.LIZIZ).put(key, loopPolicy);
                                }
                                ((ConcurrentHashMap) c1552030qUT.LIZJ).put(key, Integer.valueOf(interval));
                                List<GlobalConfigSettings.SyncItem> combine = entry2.getValue().getCombine();
                                if (combine != null && !combine.isEmpty()) {
                                    for (GlobalConfigSettings.SyncItem syncItem4 : combine) {
                                        String accessKey2 = syncItem4.getAccessKey();
                                        List<String> group3 = syncItem4.getGroup();
                                        List<String> target3 = syncItem4.getTarget();
                                        C1552980qW0 c1552980qW0LIZ = loopPolicy.LIZ(accessKey2);
                                        if (group3 != null) {
                                            for (String str3 : group3) {
                                                if (!TextUtils.isEmpty(str3) && !c1552980qW0LIZ.LIZIZ.getGroupName().contains(str3)) {
                                                    c1552980qW0LIZ.LIZIZ.addToGroupName(str3);
                                                }
                                            }
                                        }
                                        if (target3 != null) {
                                            for (String str4 : target3) {
                                                Iterator<CheckRequestBodyModel.TargetChannel> it3 = c1552980qW0LIZ.LIZIZ.getTargetChannels().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        if (it3.next().channelName.equals(str4)) {
                                                            break;
                                                        }
                                                    } else {
                                                        c1552980qW0LIZ.LIZIZ.getTargetChannels().add(new CheckRequestBodyModel.TargetChannel(str4));
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        ((ConcurrentHashMap) loopPolicy.LJ).put(accessKey2, c1552980qW0LIZ);
                                    }
                                }
                                if (c1552030qUT.LIZLLL.get()) {
                                    loopPolicy.LIZIZ(interval);
                                    loopPolicy.LIZJ();
                                }
                            }
                        }
                    }
                }
            };
            C1551890qUF c1551890qUF = this.LJ;
            if (c1551890qUF != null) {
                C1552400qV4 c1552400qV4 = c1551890qUF.LJ;
                if (c1552400qV4.LIZ == null) {
                    c1552400qV4.LIZ = new CopyOnWriteArrayList();
                }
                ((CopyOnWriteArrayList) c1552400qV4.LIZ).add(abstractC1553220qWO);
            }
        }
    }

    public final Common LIZLLL() {
        if (this.LIZJ == null) {
            LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = this.LIZLLL;
            if (geckoGlobalConfig == null) {
                return null;
            }
            Common common = new Common(geckoGlobalConfig.getAppId(), geckoGlobalConfig.getAppVersion(), geckoGlobalConfig.getDeviceId(), geckoGlobalConfig.getRegion());
            this.LIZJ = common;
            common.appName = C2362609No.LIZ(geckoGlobalConfig.getContext());
        }
        return this.LIZJ;
    }

    public final C1551530qTf LJFF() {
        if (this.LJIIJ == null) {
            LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = this.LIZLLL;
            if (geckoGlobalConfig == null) {
                return null;
            }
            C1537040q6I c1537040q6I = new C1537040q6I(geckoGlobalConfig.getContext());
            c1537040q6I.LIZJ(geckoGlobalConfig.getAppId());
            c1537040q6I.LJII = geckoGlobalConfig.getAppVersion();
            c1537040q6I.LJIIIIZZ = geckoGlobalConfig.getDeviceId();
            c1537040q6I.LIZ = geckoGlobalConfig.getNetWork();
            c1537040q6I.LJ = geckoGlobalConfig.getStatisticMonitor();
            c1537040q6I.LJIIIZ = geckoGlobalConfig.getHost();
            c1537040q6I.LIZ("gecko");
            c1537040q6I.LIZIZ("gecko");
            this.LJIIJ = new C1551530qTf(c1537040q6I);
        }
        return this.LJIIJ;
    }

    public final void LJIILJJIL() {
        C1552810qVj c1552810qVj = this.LJIIJJI;
        if (c1552810qVj == null) {
            return;
        }
        c1552810qVj.getClass();
        C1553130qWF.LIZ("gecko-debug-tag", "gecko update resume");
        c1552810qVj.LIZ.set(false);
        synchronized (c1552810qVj.LIZIZ) {
            try {
                c1552810qVj.LIZIZ.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C1551940qUK() {
        new HashMap();
        this.LIZ = Collections.newSetFromMap(new ConcurrentHashMap());
        this.LJI = new AtomicBoolean(false);
        this.LJIIIIZZ = false;
        this.LJIIIZ = true;
        this.LJIIL = new AtomicBoolean();
        this.LJIILIIL = new HashMap();
        this.LJIILJJIL = new HashMap();
        this.LIZIZ = new ConcurrentHashMap();
    }

    public final Context LJ() {
        LIZIZ();
        GeckoGlobalConfig geckoGlobalConfig = this.LIZLLL;
        if (geckoGlobalConfig != null) {
            return geckoGlobalConfig.getContext();
        }
        return null;
    }

    public final GlobalConfigSettings LJI() {
        LIZIZ();
        if (this.LIZLLL == null) {
            return null;
        }
        LIZJ();
        C1551890qUF c1551890qUF = this.LJ;
        if (c1551890qUF == null) {
            return null;
        }
        return c1551890qUF.LIZJ;
    }

    public final NGSettings LJII() {
        LIZIZ();
        if (this.LIZLLL == null) {
            return null;
        }
        LIZJ();
        C1551890qUF c1551890qUF = this.LJ;
        if (c1551890qUF == null) {
            return null;
        }
        return c1551890qUF.LIZLLL;
    }

    public final boolean LJIIIZ() {
        GlobalConfigSettings globalConfigSettingsLJI = LJI();
        if (globalConfigSettingsLJI != null && globalConfigSettingsLJI.getReqMeta() != null) {
            this.LJIIIZ = this.LJIIIZ && globalConfigSettingsLJI.getReqMeta().getEnable() == 1;
        }
        C1553130qWF.LIZ("gecko-debug-tag", "gecko update enable:", Boolean.valueOf(this.LJIIIZ));
        return this.LJIIIZ;
    }

    public static void LJIIL(AbstractC1552040qUU abstractC1552040qUU) {
        synchronized (C1551820qU8.class) {
            if (C1551820qU8.LIZJ == null) {
                C1551820qU8.LIZJ = new ConcurrentHashMap();
            }
            Map concurrentHashMap = (Map) ((ConcurrentHashMap) C1551820qU8.LIZJ).get(abstractC1552040qUU);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
            }
            C1551870qUD c1551870qUD = new C1551870qUD(abstractC1552040qUU, null, false);
            concurrentHashMap.put(C1551880qUE.class, c1551870qUD);
            C1552210qUl.LIZIZ(C1551880qUE.class, c1551870qUD);
            C1552020qUS c1552020qUS = new C1552020qUS(abstractC1552040qUU);
            concurrentHashMap.put(C1553440qWk.class, c1552020qUS);
            C1552210qUl.LIZIZ(C1553440qWk.class, c1552020qUS);
            C1552380qV2 c1552380qV2 = new C1552380qV2(abstractC1552040qUU);
            concurrentHashMap.put(C1551010qSp.class, c1552380qV2);
            C1552210qUl.LIZIZ(C1551010qSp.class, c1552380qV2);
            C1552510qVF c1552510qVF = new C1552510qVF(abstractC1552040qUU);
            concurrentHashMap.put(C1550920qSg.class, c1552510qVF);
            C1552210qUl.LIZIZ(C1550920qSg.class, c1552510qVF);
            C1552770qVf c1552770qVf = new C1552770qVf(abstractC1552040qUU);
            concurrentHashMap.put(C1550780qSS.class, c1552770qVf);
            C1552210qUl.LIZIZ(C1550780qSS.class, c1552770qVf);
            C1552820qVk c1552820qVk = new C1552820qVk(abstractC1552040qUU);
            concurrentHashMap.put(C1550850qSZ.class, c1552820qVk);
            C1552210qUl.LIZIZ(C1550850qSZ.class, c1552820qVk);
            C1552450qV9 c1552450qV9 = new C1552450qV9(abstractC1552040qUU);
            concurrentHashMap.put(C1550960qSk.class, c1552450qV9);
            concurrentHashMap.put(C1550900qSe.class, c1552450qV9);
            concurrentHashMap.put(C1551700qTw.class, c1552450qV9);
            C1552210qUl.LIZIZ(C1550960qSk.class, c1552450qV9);
            C1552210qUl.LIZIZ(C1550900qSe.class, c1552450qV9);
            C1552210qUl.LIZIZ(C1551700qTw.class, c1552450qV9);
            C1551590qTl c1551590qTl = new C1551590qTl(abstractC1552040qUU);
            concurrentHashMap.put(C1551600qTm.class, c1551590qTl);
            C1552210qUl.LIZIZ(C1551600qTm.class, c1551590qTl);
            C1552520qVG c1552520qVG = new C1552520qVG(abstractC1552040qUU);
            concurrentHashMap.put(C1551570qTj.class, c1552520qVG);
            C1552210qUl.LIZIZ(C1551570qTj.class, c1552520qVG);
            ((ConcurrentHashMap) C1551820qU8.LIZJ).put(abstractC1552040qUU, concurrentHashMap);
        }
    }

    public final void LIZ(String str) {
        Map<String, List<GlobalConfigSettings.SyncItem>> map;
        Map<String, List<GlobalConfigSettings.SyncItem>> map2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1551990qUP c1551990qUP = this.LJFF;
        if (c1551990qUP != null && (map2 = c1551990qUP.LJ) != null) {
            Object objRemove = ((ConcurrentHashMap) map2).remove(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cancel trigger update,occasion:");
            sbLIZ.append(str);
            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ), objRemove);
        }
        C1551990qUP c1551990qUP2 = this.LJFF;
        HashMap map3 = null;
        if (c1551990qUP2 == null) {
            map = null;
        } else {
            map = c1551990qUP2.LIZJ;
        }
        if (this.LJIIJJI != null && map != null && !map.isEmpty()) {
            for (Map.Entry<String, List<GlobalConfigSettings.SyncItem>> entry : map.entrySet()) {
                if (str.equals(entry.getKey())) {
                    List<GlobalConfigSettings.SyncItem> value = entry.getValue();
                    if (value != null && !value.isEmpty()) {
                        map3 = new HashMap();
                        for (GlobalConfigSettings.SyncItem syncItem : value) {
                            map3.put(syncItem.getAccessKey(), syncItem.getGroup());
                        }
                    } else {
                        return;
                    }
                }
            }
            if (map3 != null) {
                C1553130qWF.LIZ("gecko-debug-tag", "cancel update task,accessKey and group", map3);
                C1551500qTc c1551500qTc = C1551510qTd.LIZ;
                if (c1551500qTc.LIZJ == null) {
                    c1551500qTc.LIZJ = new ExecutorC1551550qTh();
                }
                C1551560qTi c1551560qTi = c1551500qTc.LIZJ.LLILLJJLI;
                for (Runnable runnable : (PriorityBlockingQueue) c1551560qTi.LIZ) {
                    if (runnable instanceof AbstractRunnableC1551740qU0) {
                        AbstractRunnableC1551740qU0 abstractRunnableC1551740qU0 = (AbstractRunnableC1551740qU0) runnable;
                        String str2 = abstractRunnableC1551740qU0.LLILLJJLI.LIZIZ;
                        if (map3.keySet().contains(str2) && ((List) map3.get(str2)).contains(abstractRunnableC1551740qU0.LLILLJJLI.LIZJ)) {
                            C1551770qU3 c1551770qU3 = abstractRunnableC1551740qU0.LLILLJJLI;
                            if (7 == c1551770qU3.LIZ) {
                                C1553130qWF.LIZ("gecko-debug-tag", "cancel update task in queue", c1551770qU3);
                                ((PriorityBlockingQueue) c1551560qTi.LIZ).remove(abstractRunnableC1551740qU0);
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void LJIIIIZZ(final GeckoGlobalConfig geckoGlobalConfig) {
        int i;
        this.LJI.set(true);
        this.LIZLLL = geckoGlobalConfig;
        Context context = geckoGlobalConfig.getContext();
        if (context != null) {
            C2222108nD.LIZ = context;
        }
        C1552030qUT c1552030qUT = C1553380qWe.LIZ;
        c1552030qUT.getClass();
        C1553130qWF.LIZ("gecko-debug-tag", "loop manager init");
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1552030qUT.LIZ = c1551940qUK.LJFF();
        C1552410qV5 c1552410qV5 = C1553390qWf.LIZ;
        if (c1552410qV5.LIZJ.compareAndSet(false, true)) {
            c1552410qV5.LIZ = c1551940qUK.LJFF();
            c1552410qV5.LIZIZ = System.currentTimeMillis();
        }
        this.LJII = System.currentTimeMillis();
        C1551820qU8.LIZ();
        C1552430qV7 c1552430qV7 = C1553420qWi.LIZ;
        C1533520q0c c1533520q0c = C1533530q0d.LIZ;
        Context context2 = geckoGlobalConfig.getContext();
        c1533520q0c.getClass();
        final GeckoGlobalConfig.IMonitorConfig monitorConfig = geckoGlobalConfig.getMonitorConfig();
        if (monitorConfig != null && c1533520q0c.LIZIZ.compareAndSet(false, true)) {
            if (monitorConfig.isOversea()) {
                i = 3261;
            } else {
                i = 3262;
            }
            String strValueOf = String.valueOf(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("device_id", geckoGlobalConfig.getDeviceId());
                jSONObject.put("host_aid", geckoGlobalConfig.getAppId());
                jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("app_version", geckoGlobalConfig.getAppVersion());
                String channel = monitorConfig.getChannel();
                if (!TextUtils.isEmpty(channel)) {
                    jSONObject.put("channel", channel);
                }
                String updateVersionCode = monitorConfig.getUpdateVersionCode();
                if (!TextUtils.isEmpty(updateVersionCode)) {
                    jSONObject.put("update_version_code", updateVersionCode);
                }
                String packageId = monitorConfig.getPackageId();
                if (!TextUtils.isEmpty(packageId)) {
                    jSONObject.put("package_name", packageId);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(monitorConfig.getMonitorHost());
                sbLIZ.append("/monitor/collect/");
                SDKMonitorUtils.setDefaultReportUrl(strValueOf, Collections.singletonList(C2188811AlT.LIZIZ(sbLIZ)));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(monitorConfig.getMonitorHost());
                sbLIZ2.append("/monitor/appmonitor/v2/settings");
                SDKMonitorUtils.setConfigUrl(strValueOf, Collections.singletonList(C2188811AlT.LIZIZ(sbLIZ2)));
                SDKMonitorUtils.initMonitor(C786410Ut5.N3(context2), strValueOf, jSONObject, new C0VCZ() { // from class: X.0qV1
                    @Override // X.C0VCZ
                    public final String getSessionId() {
                        return null;
                    }

                    @Override // X.C0VCZ
                    public final Map<String, String> getCommonParams() {
                        Map<String, String> commonParams = monitorConfig.getCommonParams();
                        if (commonParams == null) {
                            commonParams = new HashMap<>();
                        }
                        commonParams.put("oversea", monitorConfig.isOversea() ? "1" : CardStruct.IStatusCode.DEFAULT);
                        commonParams.put("host_aid", String.valueOf(geckoGlobalConfig.getAppId()));
                        return commonParams;
                    }
                });
                c1533520q0c.LIZ = SDKMonitorUtils.getInstance(strValueOf);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1553130qWF.LIZ("gecko-debug-tag", "monitor init failed", e);
            }
        }
        this.LJIIJJI = new C1552810qVj();
    }

    public final void LJIIJJI(IGeckoRegister iGeckoRegister) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register gecko,update priority:");
        sbLIZ.append(1);
        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJI.get()) {
            C1553130qWF.LIZ("gecko-debug-tag", "register gecko,global gecko has not been initialized");
            C1552890qVr c1552890qVr = C1553410qWh.LIZ;
            Set<?> hashSet = c1552890qVr.LIZ.get(IGeckoRegister.class);
            if (hashSet == null) {
                hashSet = new HashSet<>();
            }
            hashSet.add(iGeckoRegister);
            c1552890qVr.LIZ.put(IGeckoRegister.class, hashSet);
            return;
        }
        LIZIZ();
        Pair<String, Boolean> pairLIZ = C1551100qSy.LIZ(LJ(), this.LIZLLL.getEnv(), iGeckoRegister);
        if (pairLIZ == null) {
            return;
        }
        final String str = (String) pairLIZ.first;
        boolean zBooleanValue = ((Boolean) pairLIZ.second).booleanValue();
        C1551890qUF c1551890qUF = this.LJ;
        if (c1551890qUF != null && c1551890qUF.LJIIJJI.get()) {
            if (zBooleanValue) {
                this.LJ.LIZJ(0, true);
                C1553420qWi.LIZ.LIZ(new AbstractC1552990qW1() { // from class: X.0qVD
                    public final /* synthetic */ int LIZLLL = 1;

                    @Override // X.AbstractC1552990qW1
                    public final void LIZ() {
                        C1553130qWF.LIZ("gecko-debug-tag", "register gecko try to trigger update");
                        C1551940qUK c1551940qUK = this.LJ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("occasion_gecko_register-");
                        sbLIZ2.append(str);
                        c1551940qUK.LJIILL(this.LIZLLL, C2188811AlT.LIZIZ(sbLIZ2));
                    }

                    @Override // X.AbstractC1552990qW1
                    public final int LIZIZ() {
                        return 6;
                    }
                }, 1300L);
                return;
            }
            C1553130qWF.LIZ("gecko-debug-tag", "register gecko try to trigger update");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("occasion_gecko_register-");
            sbLIZ2.append(str);
            LJIILL(1, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C1553130qWF.LIZ("gecko-debug-tag", "register gecko,gecko has not been fetched");
    }

    public final void LJIILLIIL(String str) {
        C1551990qUP c1551990qUP = this.LJFF;
        if (c1551990qUP == null) {
            return;
        }
        boolean zLJI = MethodIDManager.LJI(71832);
        List<GlobalConfigSettings.SyncItem> listLIZIZ = c1551990qUP.LIZIZ(str, false);
        if (listLIZIZ != null && !listLIZIZ.isEmpty()) {
            C1553130qWF.LIZ("gecko-debug-tag", "trigger update occasion lately");
            if (c1551990qUP.LIZLLL.get() == 0) {
                c1551990qUP.LIZ(7, 0, listLIZIZ);
            } else {
                if (c1551990qUP.LJ == null) {
                    c1551990qUP.LJ = new ConcurrentHashMap();
                }
                List copyOnWriteArrayList = (List) ((ConcurrentHashMap) c1551990qUP.LJ).get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                }
                copyOnWriteArrayList.addAll(listLIZIZ);
                ((ConcurrentHashMap) c1551990qUP.LJ).put(str, copyOnWriteArrayList);
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (!zLJI) {
            return;
        }
        MethodIDManager.LJ();
    }

    public final void LJIIJ(String str, Map<String, OptionCheckUpdateParams.CustomValue> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gecko register custom params,accessKey:");
        sbLIZ.append(str);
        sbLIZ.append(",custom params:");
        sbLIZ.append(map.keySet());
        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
        Map<String, Map<String, OptionCheckUpdateParams.CustomValue>> map2 = this.LIZIZ;
        if (!TextUtils.isEmpty(str) && !map.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map2;
            Map map3 = (Map) concurrentHashMap.get(str);
            if (map3 != null) {
                map3.putAll(map);
            } else {
                concurrentHashMap.put(str, map);
            }
        }
    }

    public final void LJIILL(int i, String str) {
        List<GlobalConfigSettings.SyncItem> listLIZIZ;
        int i2;
        C1551990qUP c1551990qUP = this.LJFF;
        if (c1551990qUP != null && (listLIZIZ = c1551990qUP.LIZIZ(str, true)) != null && !listLIZIZ.isEmpty()) {
            if (str.startsWith("occasion_gecko_register")) {
                i2 = 0;
            } else {
                i2 = 7;
            }
            c1551990qUP.LIZ(i2, i, listLIZIZ);
        }
    }

    public static void LJIILIIL(String str, String str2, List list) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (list != null && !list.isEmpty()) {
                if (C1551990qUP.LJFF == null) {
                    C1551990qUP.LJFF = new ConcurrentHashMap();
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("register group update occasion:");
                sbLIZ.append(str);
                C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ), str2, list);
                Map map = (Map) ((ConcurrentHashMap) C1551990qUP.LJFF).get(str);
                if (map == null) {
                    Hashtable hashtable = new Hashtable();
                    hashtable.put(str2, new UpdateModel(new CopyOnWriteArrayList(list), null));
                    ((ConcurrentHashMap) C1551990qUP.LJFF).put(str, hashtable);
                    return;
                }
                UpdateModel updateModel = (UpdateModel) map.get(str2);
                if (updateModel == null) {
                    map.put(str2, new UpdateModel(new CopyOnWriteArrayList(list), null));
                    return;
                }
                if (updateModel.getGroups() == null && updateModel.getChannels() == null) {
                    return;
                }
                if (updateModel.getGroups() == null) {
                    updateModel.setGroups(new CopyOnWriteArrayList(list));
                    return;
                } else {
                    updateModel.getGroups().addAll(list);
                    return;
                }
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            if (C1551990qUP.LJFF == null) {
                C1551990qUP.LJFF = new ConcurrentHashMap();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register accessKey update occasion:");
            sbLIZ2.append(str);
            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ2), str2);
            Map map2 = (Map) ((ConcurrentHashMap) C1551990qUP.LJFF).get(str);
            if (map2 == null) {
                Hashtable hashtable2 = new Hashtable();
                hashtable2.put(str2, new UpdateModel());
                ((ConcurrentHashMap) C1551990qUP.LJFF).put(str, hashtable2);
                return;
            }
            map2.put(str2, new UpdateModel());
        }
    }
}
