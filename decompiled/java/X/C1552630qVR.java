package X;

import android.os.SystemClock;
import com.bytedance.geckox.AppSettingsManager;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.settings.model.EventMapper;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.Matcher;
import com.bytedance.geckox.settings.model.NGSettings;
import com.bytedance.geckox.settings.model.Resource;
import com.bytedance.geckox.settings.model.WaitGeckoSettingsConfig;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import com.tiktok.geckox.ng.model.Event;
import com.tiktok.geckox.ng.model.MetaSettings;
import com.tiktok.geckox.ng.model.OptimizeMultiTriggerCheckUpdateSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qVR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552630qVR {
    public static volatile MetaSettings LIZJ;
    public static Set<Resource> LJI;
    public static volatile String LJII;
    public static final C1552630qVR LIZ = new C1552630qVR();
    public static final AtomicInteger LIZIZ = new AtomicInteger(EnumC993310bxJ.Not.ordinal());
    public static final Map<String, EventMapper> LIZLLL = new LinkedHashMap();
    public static final ConcurrentHashMap<C1552740qVc, Resource> LJ = new ConcurrentHashMap<>();
    public static final Set<String> LJFF = new LinkedHashSet();

    public static void LIZIZ() {
        NGSettings nGSettingsLJII;
        AppSettingsManager appSettingsManager = C1957007lY.LIZ;
        WaitGeckoSettingsConfig waitGeckoSettingsConfig = appSettingsManager.LJIILJJIL;
        if (waitGeckoSettingsConfig == null) {
            waitGeckoSettingsConfig = new WaitGeckoSettingsConfig();
        }
        boolean z = waitGeckoSettingsConfig.enabled;
        int i = waitGeckoSettingsConfig.timeout;
        if (appSettingsManager.LJIJ && ((nGSettingsLJII = C797990VSb.LIZ.LJII()) == null || nGSettingsLJII.mappers == null)) {
            if (i < 1000) {
                i = LSPassThroughRecordSizeConfig.DEFAULT;
            }
            z = true;
        }
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        if (c1551940qUK.LJIIL.get() || !z) {
            LIZ(c1551940qUK.LJII());
            LIZIZ.set(EnumC993310bxJ.Initialized.ordinal());
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (i <= 0) {
            i = 10;
        }
        final C013C c013c = new C013C();
        AbstractC1553220qWO abstractC1553220qWO = new AbstractC1553220qWO() { // from class: X.0qVT
            @Override // X.AbstractC1553220qWO
            public final void LIZ() {
                C1551890qUF c1551890qUF;
                C1552400qV4 c1552400qV4;
                List<AbstractC1553220qWO> list;
                C1552630qVR.LIZ.getClass();
                if (C1552630qVR.LIZLLL()) {
                    if (c013c.element) {
                    }
                    c1551890qUF = C797990VSb.LIZ.LJ;
                    if (c1551890qUF != null || (list = (c1552400qV4 = c1551890qUF.LJ).LIZ) == null || ((CopyOnWriteArrayList) list).isEmpty()) {
                        return;
                    }
                    ((CopyOnWriteArrayList) c1552400qV4.LIZ).remove(this);
                    return;
                }
                C1552630qVR.LIZ(C797990VSb.LIZ.LJII());
                C1552630qVR.LIZIZ.set(EnumC993310bxJ.Initialized.ordinal());
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (jElapsedRealtime2 > Mp4ScreenVideoLoadTimeout.CONTROL) {
                    C1551780qU4.LJII(5, 1003, "", String.valueOf(jElapsedRealtime2));
                }
                c1551890qUF = C797990VSb.LIZ.LJ;
                if (c1551890qUF != null) {
                }
            }

            @Override // X.AbstractC1553220qWO
            public final void LIZIZ(GlobalConfigSettings globalConfigSettings) {
                C1551890qUF c1551890qUF;
                C1552400qV4 c1552400qV4;
                List<AbstractC1553220qWO> list;
                NGSettings nGSettingsLJII2;
                C1552630qVR.LIZ.getClass();
                if (!C1552630qVR.LIZLLL()) {
                    if (globalConfigSettings == null || (nGSettingsLJII2 = globalConfigSettings.ngSettings) == null) {
                        nGSettingsLJII2 = C797990VSb.LIZ.LJII();
                    }
                    C1552630qVR.LIZ(nGSettingsLJII2);
                    C1552630qVR.LIZIZ.set(EnumC993310bxJ.Initialized.ordinal());
                } else {
                    if (c013c.element) {
                    }
                    c1551890qUF = C797990VSb.LIZ.LJ;
                    if (c1551890qUF == null && (list = (c1552400qV4 = c1551890qUF.LJ).LIZ) != null && !((CopyOnWriteArrayList) list).isEmpty()) {
                        ((CopyOnWriteArrayList) c1552400qV4.LIZ).remove(this);
                        return;
                    }
                    return;
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (jElapsedRealtime2 > Mp4ScreenVideoLoadTimeout.CONTROL) {
                    C1551780qU4.LJII(5, 1003, "", String.valueOf(jElapsedRealtime2));
                }
                c1551890qUF = C797990VSb.LIZ.LJ;
                if (c1551890qUF == null) {
                }
            }
        };
        C1551890qUF c1551890qUF = c1551940qUK.LJ;
        if (c1551890qUF != null) {
            C1552400qV4 c1552400qV4 = c1551890qUF.LJ;
            if (c1552400qV4.LIZ == null) {
                c1552400qV4.LIZ = new CopyOnWriteArrayList();
            }
            ((CopyOnWriteArrayList) c1552400qV4.LIZ).add(abstractC1553220qWO);
        }
        new PthreadTimer("ox/ng/GeckoNG").schedule(new C1554350qYD(c013c, 3), TimeUnit.SECONDS.toMillis(i));
    }

    public static MetaSettings LIZJ() {
        MetaSettings metaSettings = LIZJ;
        if (metaSettings != null) {
            return metaSettings;
        }
        return null;
    }

    public static boolean LIZLLL() {
        return LIZIZ.get() == EnumC993310bxJ.Initialized.ordinal();
    }

    public static void LIZ(NGSettings nGSettings) {
        Map<String, List<Resource>> map;
        boolean z;
        Resource resource;
        List<EventMapper> list;
        if (nGSettings != null) {
            map = nGSettings.resources;
        } else {
            map = null;
        }
        if (map != null) {
            for (Map.Entry<String, List<Resource>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<Resource> value = entry.getValue();
                if (value != null) {
                    for (Resource resource2 : value) {
                        if (resource2 != null && C041J.LIZ(resource2.name)) {
                            LJ.put(new C1552740qVc(key, resource2.name), resource2);
                        }
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initialize, get resources from ngSettings, resources:");
            sbLIZ.append(map);
            C1553130qWF.LIZ("GeckoNG", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initialize, get resources from ngSettings, ngSettings.resources is null! ngSettings:");
            sbLIZ2.append(nGSettings);
            C1553130qWF.LIZLLL("GeckoNG", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (C1957007lY.LIZ.LJIJ && nGSettings != null && (list = nGSettings.mappers) != null) {
            LJ(list);
        }
        if (LIZJ().optimizeMultiTriggerCheckUpdateSettings.enabled) {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set<Resource> set = LJI;
            if (set != null) {
                for (Resource resource3 : set) {
                    String str = resource3.accessKey;
                    if (str == null || str.length() == 0) {
                        LIZ.getClass();
                        str = LJII;
                        if (str == null) {
                            str = null;
                        }
                    }
                    if (resource3.isLazy() || ((resource = LJ.get(new C1552740qVc(str, resource3.name))) != null && resource.isLazy())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    resource3.setLazy(z);
                    if (!resource3.isLazy()) {
                        if (!linkedHashMap.containsKey(str)) {
                            linkedHashMap.put(str, new LinkedHashSet());
                        }
                        Set set2 = (Set) linkedHashMap.get(str);
                        if (set2 != null) {
                            set2.add(resource3.name);
                        }
                    }
                }
            }
            if (!linkedHashMap.isEmpty()) {
                OptimizeMultiTriggerCheckUpdateSettings optimizeMultiTriggerCheckUpdateSettings = LIZJ().optimizeMultiTriggerCheckUpdateSettings;
                if (optimizeMultiTriggerCheckUpdateSettings.enabled) {
                    ((ArrayList) C1553320qWY.LIZ.getValue()).add(new InterfaceC1553580qWy() { // from class: X.0qVM
                        @Override // X.InterfaceC1553580qWy
                        public final void LIZ(int i, String str2, List list2) {
                            if (!linkedHashMap.isEmpty() && !list2.isEmpty()) {
                                if (C1697810uHb.LJIIJJI(3, 6, 7).contains(Integer.valueOf(i))) {
                                    Map<String, Set<String>> map2 = linkedHashMap;
                                    ArrayList<UpdatePackage> arrayList = new ArrayList();
                                    for (Object obj : list2) {
                                        UpdatePackage updatePackage = (UpdatePackage) obj;
                                        Set<String> set3 = map2.get(updatePackage.getAccessKey());
                                        if (set3 != null && set3.contains(updatePackage.getChannel())) {
                                            arrayList.add(obj);
                                        }
                                    }
                                    for (UpdatePackage updatePackage2 : arrayList) {
                                        C1553190qWL.LIZ.put(new C1552740qVc(updatePackage2.getAccessKey(), updatePackage2.getChannel()), updatePackage2);
                                    }
                                    return;
                                }
                                if (Intrinsics.LJFF(str2, "gecko_ng_meta_cache_update")) {
                                    Map<String, Set<String>> map3 = linkedHashMap;
                                    ArrayList<UpdatePackage> arrayList2 = new ArrayList();
                                    for (Object obj2 : list2) {
                                        UpdatePackage updatePackage3 = (UpdatePackage) obj2;
                                        Set<String> set4 = map3.get(updatePackage3.getAccessKey());
                                        if (set4 != null && set4.contains(updatePackage3.getChannel())) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    ConcurrentHashMap<C1552740qVc, UpdatePackage> concurrentHashMap = new ConcurrentHashMap<>();
                                    for (UpdatePackage updatePackage4 : arrayList2) {
                                        concurrentHashMap.put(new C1552740qVc(updatePackage4.getAccessKey(), updatePackage4.getChannel()), updatePackage4);
                                    }
                                    C1553190qWL.LIZ = concurrentHashMap;
                                }
                            }
                        }
                    });
                    int i = optimizeMultiTriggerCheckUpdateSettings.interval;
                    if (i <= 0) {
                        i = 15;
                    }
                    int i2 = optimizeMultiTriggerCheckUpdateSettings.delay;
                    if (i2 <= 0) {
                        i2 = 600;
                    }
                    new PthreadTimer("CachedPackagesManager").scheduleAtFixedRate(new C1554350qYD(linkedHashMap, 2), TimeUnit.SECONDS.toMillis(i2), TimeUnit.MINUTES.toMillis(i));
                }
            }
        }
    }

    public static void LJ(List list) {
        List<Resource> list2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            EventMapper eventMapper = (EventMapper) it2.next();
            if (eventMapper != null) {
                List<Resource> list3 = eventMapper.resources;
                if (list3 != null) {
                    for (Resource resource : list3) {
                        if (resource != null) {
                            linkedHashSet.add(resource);
                            LJFF.add(resource.name);
                        }
                    }
                }
                List<Matcher> list4 = eventMapper.matchers;
                if (list4 != null) {
                    for (Matcher matcher : list4) {
                        if (matcher != null && (list2 = matcher.resources) != null) {
                            linkedHashSet.addAll(list2);
                        }
                    }
                }
                String str = eventMapper.eventName;
                Map<String, EventMapper> map = LIZLLL;
                EventMapper eventMapper2 = (EventMapper) ((LinkedHashMap) map).get(str);
                if (eventMapper2 == null) {
                    map.put(str, eventMapper);
                } else {
                    List<Resource> list5 = eventMapper2.resources;
                    if (C19719512Dh.LJI(list5) && list5 != null) {
                        List<Resource> list6 = eventMapper.resources;
                        if (list6 != null) {
                            list5.addAll(list6);
                        }
                    } else {
                        eventMapper2.setResources(eventMapper.resources);
                    }
                    List<Matcher> list7 = eventMapper.matchers;
                    if (list7 != null) {
                        List<Matcher> list8 = eventMapper2.matchers;
                        if (list8 != null && !list8.isEmpty()) {
                            List<Matcher> list9 = eventMapper2.matchers;
                            if (C19719512Dh.LJI(list9) && list9 != null) {
                                list9.addAll(list7);
                            }
                        } else {
                            eventMapper2.setMatchers(list7);
                        }
                    }
                }
            }
        }
        LJI = linkedHashSet;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get all resources need update, resources:");
        sbLIZ.append(LJI);
        C1553130qWF.LIZ("GeckoNG", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void onEventTrigger(final Event event) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEventTrigger, event:");
        sbLIZ.append(event.name);
        C1553130qWF.LIZ("GeckoNG", C2188811AlT.LIZIZ(sbLIZ));
        C1488540oq4.LIZ.execute(new Runnable() { // from class: X.0qVS
            /* JADX WARN: Removed duplicated region for block: B:117:0x0206  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x01da A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:166:0x0174 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 609
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1552640qVS.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GeckoNG@14e0.onEventTrigger$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("GeckoNG@14e0.onEventTrigger$1");
            }
        });
    }
}
