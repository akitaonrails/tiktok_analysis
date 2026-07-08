package X;

import Y.ARunnableS92S0200000_23;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.policy.loop.LoopPolicy;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qUL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551950qUL {
    public final C1551530qTf LIZ;
    public final C1551910qUH LIZIZ;

    public C1551950qUL(C1551530qTf c1551530qTf) {
        this.LIZ = c1551530qTf;
        C1551910qUH c1551910qUH = new C1551910qUH();
        this.LIZIZ = c1551910qUH;
        c1551910qUH.LIZ = c1551530qTf;
    }

    public static C1551950qUL LIZLLL(C1551530qTf c1551530qTf) {
        List<String> list = c1551530qTf.LJ;
        if (list != null && !list.isEmpty()) {
            Iterator<String> it2 = c1551530qTf.LJ.iterator();
            while (it2.hasNext()) {
                C797990VSb.LIZ.LIZ.add(it2.next());
            }
            Context context = c1551530qTf.LIZ;
            if (context != null) {
                C2222108nD.LIZ = context;
            }
            C1551950qUL c1551950qUL = new C1551950qUL(c1551530qTf);
            C1537050q6J c1537050q6J = C1537050q6J.LIZ;
            Object obj = ListProtector.get(c1551530qTf.LJ, 0);
            c1537050q6J.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1537050q6J.LIZIZ;
            if (concurrentHashMap.get(obj) == null) {
                concurrentHashMap.put(obj, c1551950qUL);
            }
            C1552410qV5 c1552410qV5 = C1553390qWf.LIZ;
            if (c1552410qV5.LIZJ.compareAndSet(false, true)) {
                c1552410qV5.LIZ = c1551530qTf;
                c1552410qV5.LIZIZ = System.currentTimeMillis();
            }
            C1552880qVq c1552880qVq = C1553400qWg.LIZ;
            if (c1552880qVq.LIZ == null) {
                c1552880qVq.LIZ = c1551530qTf;
            }
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = c1551940qUK.LIZLLL;
            if (geckoGlobalConfig != null) {
                c1552880qVq.LIZ.LJII = Long.valueOf(geckoGlobalConfig.getAppId());
                c1552880qVq.LIZ.LIZLLL = geckoGlobalConfig.getNetWork();
            }
            C1551820qU8.LIZ();
            return c1551950qUL;
        }
        throw new IllegalArgumentException("access key empty");
    }

    public final void LJI(String str) {
        if (this.LIZ == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.LIZ.LJIIIZ = str;
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        if (c1551940qUK.LIZLLL() != null) {
            c1551940qUK.LIZLLL().deviceId = str;
        }
    }

    public final void LIZJ(Map<String, List<CheckRequestBodyModel.TargetChannel>> map, AbstractC1552040qUU abstractC1552040qUU) {
        LIZIZ("default", null, map, abstractC1552040qUU);
    }

    public final void LJFF(OptionCheckUpdateParams optionCheckUpdateParams, Map map) {
        if (optionCheckUpdateParams.getListener() != null) {
            optionCheckUpdateParams.getListener().LJIJJ();
        }
        C1551290qTH cacheConfig = this.LIZ.LJI;
        if (optionCheckUpdateParams.getCacheConfig() != null) {
            cacheConfig = optionCheckUpdateParams.getCacheConfig();
        }
        if (cacheConfig != null) {
            EnumC1551280qTG enumC1551280qTG = cacheConfig.LIZIZ;
            C1551940qUK c1551940qUK = C797990VSb.LIZ;
            c1551940qUK.LIZIZ();
            enumC1551280qTG.postUpdate(map, null, cacheConfig, c1551940qUK.LIZLLL.getRootDirectory());
        }
        C1553130qWF.LIZ("gecko-debug-tag", "all channel update finished");
    }

    public final void LIZ(String str, final Map<String, List<CheckRequestBodyModel.TargetChannel>> map, OptionCheckUpdateParams optionCheckUpdateParams) {
        LoopPolicy loopPolicy;
        String str2 = str;
        OptionCheckUpdateParams optionCheckUpdateParams2 = optionCheckUpdateParams;
        if (optionCheckUpdateParams2 == null) {
            optionCheckUpdateParams2 = new OptionCheckUpdateParams();
        }
        final C1551800qU6 c1551800qU6 = new C1551800qU6();
        c1551800qU6.LJIILJJIL = optionCheckUpdateParams2.getFrom();
        boolean zLJIIIZ = C797990VSb.LIZ.LJIIIZ();
        C1553130qWF.LIZ("gecko-debug-tag", "gecko update enable:", Boolean.valueOf(zLJIIIZ));
        if (!zLJIIIZ) {
            if (optionCheckUpdateParams2.getListener() != null) {
                optionCheckUpdateParams2.getListener().LJII(new IllegalStateException("gecko is disabled"), null);
            }
            c1551800qU6.LJII = 1;
            c1551800qU6.LJIIIZ = EnumC1552280qUs.REQUEST_INVALID;
            c1551800qU6.LIZJ = "gecko is disabled";
            C1551780qU4.LJ(c1551800qU6);
            return;
        }
        if (map != null && !map.isEmpty()) {
            List<String> list = this.LIZ.LJ;
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                Iterator<String> it2 = list.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    if (TextUtils.equals(it2.next(), entry.getKey())) {
                        z = true;
                    }
                }
                if (!z) {
                    c1551800qU6.LJII = 1;
                    c1551800qU6.LJIIIZ = EnumC1552280qUs.REQUEST_INVALID;
                    c1551800qU6.LIZJ = "target keys are not in deployments keys";
                    C1551780qU4.LJ(c1551800qU6);
                    throw new IllegalArgumentException("target keys are not in deployments keys");
                }
            }
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "default";
        }
        optionCheckUpdateParams2.setCheckUpdateData(c1551800qU6);
        if (optionCheckUpdateParams2.isLowStorageUpdate()) {
            C1551620qTo.LIZ.getClass();
            AbstractC1552040qUU listener = optionCheckUpdateParams2.getListener();
            ConcurrentHashMap<C1552740qVc, UpdatePackage> concurrentHashMap = C1551620qTo.LIZIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<C1552740qVc, UpdatePackage> entry2 : concurrentHashMap.entrySet()) {
                List<CheckRequestBodyModel.TargetChannel> list2 = map.get(entry2.getKey().LIZ);
                if (list2 != null) {
                    Iterator<CheckRequestBodyModel.TargetChannel> it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            CheckRequestBodyModel.TargetChannel next = it3.next();
                            if (Intrinsics.LJFF(next.channelName, entry2.getKey().LIZIZ)) {
                                if (next != null) {
                                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                        }
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                if (!optionCheckUpdateParams2.isLazyUpdate()) {
                    listener.LJII(new Exception("request channels are not blocked by low storage"), null);
                }
                if (optionCheckUpdateParams2.isLazyUpdate()) {
                    this.LIZIZ.LJ(str2, map, optionCheckUpdateParams2);
                    return;
                }
                return;
            }
            C1551620qTo.LIZIZ.keySet().removeAll(linkedHashMap.keySet());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str3 = ((C1552740qVc) entry3.getKey()).LIZ;
                if (!linkedHashMap2.containsKey(str3)) {
                    linkedHashMap2.put(str3, new ArrayList());
                }
                List list3 = (List) linkedHashMap2.get(str3);
                if (list3 != null) {
                    list3.add(entry3.getValue());
                }
            }
            listener.LJIIIIZZ(null, linkedHashMap2);
            C1551510qTd.LIZ.LIZ().execute(new ARunnableS92S0200000_23(optionCheckUpdateParams2, linkedHashMap, 75));
            return;
        }
        if (optionCheckUpdateParams2.isLazyUpdate()) {
            this.LIZIZ.LJ(str2, map, optionCheckUpdateParams2);
            return;
        }
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        boolean zIsEnableThrottle = optionCheckUpdateParams2.isEnableThrottle();
        GlobalConfigSettings globalConfigSettingsLJI = c1551940qUK.LJI();
        if (globalConfigSettingsLJI != null && globalConfigSettingsLJI.getReqMeta() != null) {
            zIsEnableThrottle = globalConfigSettingsLJI.getReqMeta().getFreControlEnable() == 1 && zIsEnableThrottle;
        }
        C1553130qWF.LIZ("gecko-debug-tag", "gecko update throttle enable:", Boolean.valueOf(zIsEnableThrottle));
        optionCheckUpdateParams2.setEnableThrottle(zIsEnableThrottle);
        if (!optionCheckUpdateParams2.isLazyUpdate() && this.LIZ.LJIILIIL && optionCheckUpdateParams2.getLoopLevel() != null) {
            C1552030qUT c1552030qUT = C1553380qWe.LIZ;
            List<String> list4 = this.LIZ.LJ;
            c1552030qUT.getClass();
            EnumC1552440qV8 loopLevel = optionCheckUpdateParams2.getLoopLevel();
            if (loopLevel != null) {
                String strName = loopLevel.name();
                if (((ConcurrentHashMap) c1552030qUT.LIZIZ).get(strName) != null) {
                    loopPolicy = (LoopPolicy) ((ConcurrentHashMap) c1552030qUT.LIZIZ).get(strName);
                    if (loopPolicy != null) {
                    }
                } else {
                    loopPolicy = new LoopPolicy(strName, ((Integer) ((ConcurrentHashMap) c1552030qUT.LIZJ).get(strName)).intValue());
                    loopPolicy.LJFF = new C1553260qWS(c1552030qUT.LIZ, loopLevel);
                    ((ConcurrentHashMap) c1552030qUT.LIZIZ).put(loopLevel.name(), loopPolicy);
                }
                Map<String, Map<String, Object>> customParam = optionCheckUpdateParams2.getCustomParam();
                if (map != null) {
                    for (String str4 : map.keySet()) {
                        C1552980qW0 c1552980qW0LIZ = loopPolicy.LIZ(str4);
                        if (!TextUtils.isEmpty(str2) && !"default".equals(str2) && !c1552980qW0LIZ.LIZIZ.getGroupName().contains(str2)) {
                            c1552980qW0LIZ.LIZIZ.addToGroupName(str2);
                        }
                        if (customParam != null && customParam.get(str4) != null) {
                            c1552980qW0LIZ.LIZ.putAll(customParam.get(str4));
                        }
                        List<CheckRequestBodyModel.TargetChannel> list5 = map.get(str4);
                        if (list5 != null && !list5.isEmpty()) {
                            for (CheckRequestBodyModel.TargetChannel targetChannel : list5) {
                                Iterator<CheckRequestBodyModel.TargetChannel> it4 = c1552980qW0LIZ.LIZIZ.getTargetChannels().iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        if (it4.next().channelName.equals(targetChannel.channelName)) {
                                            break;
                                        }
                                    } else {
                                        c1552980qW0LIZ.LIZIZ.getTargetChannels().add(targetChannel);
                                        break;
                                    }
                                }
                            }
                            ((ConcurrentHashMap) loopPolicy.LJ).put(str4, c1552980qW0LIZ);
                        } else {
                            ((ConcurrentHashMap) loopPolicy.LJ).put(str4, c1552980qW0LIZ);
                        }
                    }
                } else if (!TextUtils.isEmpty(str2) && !"default".equals(str2) && list4 != null && !list4.isEmpty()) {
                    for (String str5 : list4) {
                        C1552980qW0 c1552980qW0LIZ2 = loopPolicy.LIZ(str5);
                        if (!TextUtils.isEmpty(str2) && !c1552980qW0LIZ2.LIZIZ.getGroupName().contains(str2)) {
                            c1552980qW0LIZ2.LIZIZ.addToGroupName(str2);
                        }
                        if (customParam != null && customParam.get(str5) != null) {
                            c1552980qW0LIZ2.LIZ.putAll(customParam.get(str5));
                        }
                        ((ConcurrentHashMap) loopPolicy.LJ).put(str5, c1552980qW0LIZ2);
                    }
                }
                if (c1552030qUT.LIZLLL.get()) {
                    loopPolicy.LIZJ();
                }
            }
        }
        optionCheckUpdateParams2.setInnerRequestByUser(!optionCheckUpdateParams2.isLazyFilter());
        if (optionCheckUpdateParams2.getSkipGeckoThreadPool().booleanValue()) {
            LJ(map, str2, optionCheckUpdateParams2, c1551800qU6);
            return;
        }
        C822650WOx c822650WOxLIZ = this.LIZ.LIZ();
        final int iHashCode = hashCode();
        final OptionCheckUpdateParams optionCheckUpdateParams3 = optionCheckUpdateParams2;
        final String str6 = str2;
        c822650WOxLIZ.execute(new AbstractRunnableC21164217s0(iHashCode) { // from class: X.0qUx
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("GeckoClient@21a0.checkUpdateMulti$1");
                boolean zLJI = MethodIDManager.LJI(202288);
                try {
                    this.LLJIJIL.LJ(map, str6, optionCheckUpdateParams3, c1551800qU6);
                } finally {
                    if (!zLIZ) {
                    }
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                C1C7U.LIZIZ("GeckoClient@21a0.checkUpdateMulti$1");
            }
        });
    }

    public final void LIZIZ(String str, Map<String, Map<String, Object>> map, Map<String, List<CheckRequestBodyModel.TargetChannel>> map2, AbstractC1552040qUU abstractC1552040qUU) {
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        optionCheckUpdateParams.setListener(abstractC1552040qUU);
        if (map != null) {
            optionCheckUpdateParams.setCustomParam(map);
        }
        LIZ(str, map2, optionCheckUpdateParams);
    }

    public final void LJ(Map<String, List<CheckRequestBodyModel.TargetChannel>> map, String str, OptionCheckUpdateParams optionCheckUpdateParams, C1551800qU6 c1551800qU6) {
        C1553130qWF.LIZ("gecko-debug-tag", "start check update...", str);
        try {
            try {
                C1551960qUM.LJIIIZ(this.LIZ, map, str, optionCheckUpdateParams, new C1552070qUX()).proceed(null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                if (!(e instanceof C1553110qWD)) {
                    if (e instanceof InterruptedException) {
                        c1551800qU6.LJIIIZ = EnumC1552280qUs.CHECK_UPDATE_THREAD_EXCEPTION;
                    } else {
                        c1551800qU6.LJIIIZ = EnumC1552280qUs.CHECK_UPDATE_EXCEPTION;
                    }
                    c1551800qU6.LIZJ = e.getMessage();
                    C1551780qU4.LJ(c1551800qU6);
                }
                C1553130qWF.LJ("gecko-debug-tag", "Gecko update failed:", e);
            }
            LJFF(optionCheckUpdateParams, map);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LJFF(optionCheckUpdateParams, map);
            throw th;
        }
    }
}
