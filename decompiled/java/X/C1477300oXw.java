package X;

import Y.AObjectS62S0000000_9;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.simkit.model.superresolution.SuperResolutionStrategyConfigV2;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0oXw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477300oXw implements InterfaceC1477050oXX {
    public volatile long LIZ;
    public volatile float LIZLLL;
    public volatile int LJI;
    public volatile float LJIIJJI;
    public volatile double LIZIZ = -1.0d;
    public final LinkedList<Boolean> LIZJ = new LinkedList<>();
    public volatile float LJ = -1.0f;
    public final Object LJFF = new Object();
    public final C01GW LJII = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new AObjectS62S0000000_9(15));
    public final Queue<C1477340oY0> LJIIIIZZ = new ConcurrentLinkedQueue();
    public final Map<String, Boolean> LJIIIZ = Collections.synchronizedMap(new LinkedHashMap<String, Boolean>() { // from class: X.0847
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, Boolean>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<String, Boolean>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<Boolean> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<Boolean> values() {
            return getValues();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return containsValue((Boolean) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Boolean get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Boolean remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 200) {
                return true;
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(Boolean bool) {
            return super.containsValue((Object) bool);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        public /* bridge */ Boolean get(String str) {
            return (Boolean) super.get((Object) str);
        }

        public /* bridge */ Boolean remove(String str) {
            return (Boolean) super.remove((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return getOrDefault((String) obj, (Boolean) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String) || !(obj2 instanceof Boolean)) {
                return false;
            }
            return remove((String) obj, (Boolean) obj2);
        }

        public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
            if (!(obj instanceof String)) {
                return bool;
            }
            return getOrDefault((String) obj, bool);
        }

        public /* bridge */ boolean remove(String str, Boolean bool) {
            return super.remove((Object) str, (Object) bool);
        }

        public /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
            return (Boolean) super.getOrDefault((Object) str, bool);
        }
    });
    public final LinkedList<Boolean> LJIIJ = new LinkedList<>();
    public final Object LJIIL = new Object();
    public final Map<String, Boolean> LJIILIIL = Collections.synchronizedMap(new LinkedHashMap<String, Boolean>() { // from class: X.0848
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, Boolean>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<String, Boolean>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<Boolean> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<Boolean> values() {
            return getValues();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Boolean)) {
                return false;
            }
            return containsValue((Boolean) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Boolean get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Boolean remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Boolean> entry) {
            if (size() > 100) {
                return true;
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(Boolean bool) {
            return super.containsValue((Object) bool);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        public /* bridge */ Boolean get(String str) {
            return (Boolean) super.get((Object) str);
        }

        public /* bridge */ Boolean remove(String str) {
            return (Boolean) super.remove((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return getOrDefault((String) obj, (Boolean) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String) || !(obj2 instanceof Boolean)) {
                return false;
            }
            return remove((String) obj, (Boolean) obj2);
        }

        public final /* bridge */ Boolean getOrDefault(Object obj, Boolean bool) {
            if (!(obj instanceof String)) {
                return bool;
            }
            return getOrDefault((String) obj, bool);
        }

        public /* bridge */ boolean remove(String str, Boolean bool) {
            return super.remove((Object) str, (Object) bool);
        }

        public /* bridge */ Boolean getOrDefault(String str, Boolean bool) {
            return (Boolean) super.getOrDefault((Object) str, bool);
        }
    });
    public final Map<String, C1476840oXC> LJIILJJIL = Collections.synchronizedMap(new LinkedHashMap<String, C1476840oXC>() { // from class: X.0849
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, C1476840oXC>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<String, C1476840oXC>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<C1476840oXC> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<C1476840oXC> values() {
            return getValues();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof C1476840oXC)) {
                return false;
            }
            return containsValue((C1476840oXC) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ C1476840oXC get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ C1476840oXC remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, C1476840oXC> entry) {
            if (size() > 100) {
                return true;
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(C1476840oXC c1476840oXC) {
            return super.containsValue((Object) c1476840oXC);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        public /* bridge */ C1476840oXC get(String str) {
            return (C1476840oXC) super.get((Object) str);
        }

        public /* bridge */ C1476840oXC remove(String str) {
            return (C1476840oXC) super.remove((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return getOrDefault((String) obj, (C1476840oXC) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String) || !(obj2 instanceof C1476840oXC)) {
                return false;
            }
            return remove((String) obj, (C1476840oXC) obj2);
        }

        public final /* bridge */ C1476840oXC getOrDefault(Object obj, C1476840oXC c1476840oXC) {
            if (!(obj instanceof String)) {
                return c1476840oXC;
            }
            return getOrDefault((String) obj, c1476840oXC);
        }

        public /* bridge */ boolean remove(String str, C1476840oXC c1476840oXC) {
            return super.remove((Object) str, (Object) c1476840oXC);
        }

        public /* bridge */ C1476840oXC getOrDefault(String str, C1476840oXC c1476840oXC) {
            return (C1476840oXC) super.getOrDefault((Object) str, c1476840oXC);
        }
    });

    public final SuperResolutionStrategyConfigV2 LJIIIZ() {
        return (SuperResolutionStrategyConfigV2) this.LJII.getValue();
    }

    public final void LJIIJ() {
        Boolean bool;
        while (true) {
            Object objPoll = ((ConcurrentLinkedQueue) this.LJIIIIZZ).poll();
            if (objPoll == null) {
                return;
            }
            C1477340oY0 c1477340oY0 = (C1477340oY0) objPoll;
            int i = 0;
            if (this.LJIILIIL.containsKey(c1477340oY0.LIZ) && (bool = this.LJIILIIL.get(c1477340oY0.LIZ)) != null) {
                synchronized (this.LJIIL) {
                    try {
                        this.LJIIJ.offer(bool);
                        if (this.LJIIJ.size() > 10) {
                            this.LJIIJ.removeFirst();
                        }
                        Iterator<Boolean> it2 = this.LJIIJ.iterator();
                        int i2 = 0;
                        int i3 = 0;
                        while (it2.hasNext()) {
                            if (it2.next().booleanValue()) {
                                i2++;
                            } else {
                                i3++;
                            }
                        }
                        int i4 = i3 + i2;
                        if (i4 > 0) {
                            this.LJIIJJI = (i2 * 1.0f) / i4;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            if (this.LJIIIZ.containsKey(c1477340oY0.LIZ) && c1477340oY0.LIZLLL != -7892) {
                synchronized (this.LJFF) {
                    try {
                        this.LIZJ.offer(Boolean.valueOf(((C1477340oY0) objPoll).LIZIZ));
                        if (this.LIZJ.size() > 10) {
                            this.LIZJ.removeFirst();
                        }
                        Iterator<Boolean> it3 = this.LIZJ.iterator();
                        int i5 = 0;
                        while (it3.hasNext()) {
                            if (it3.next().booleanValue()) {
                                i++;
                            } else {
                                i5++;
                            }
                        }
                        int i6 = i5 + i;
                        if (i6 > 0) {
                            this.LIZLLL = (i * 1.0f) / i6;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updatePlayTime pendingPlayTimeMsg ");
                        sbLIZ.append(objPoll);
                        sbLIZ.append(" referSrCnt ");
                        sbLIZ.append(this.LIZJ);
                        sbLIZ.append(" currentPercent ");
                        sbLIZ.append(this.LIZLLL);
                        C2188811AlT.LIZIZ(sbLIZ);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1477050oXX
    public final void LJ() throws Exception {
        if (LJIIIZ() != null && System.currentTimeMillis() - this.LIZ >= 300000) {
            Intent intentLJIJI = C786410Ut5.LJIJI(C1475000oUE.LIZ, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentLJIJI != null) {
                Double dValueOf = Double.valueOf(((double) intentLJIJI.getIntExtra("level", -1)) / ((double) intentLJIJI.getIntExtra("scale", -1)));
                if (dValueOf != null) {
                    this.LIZIZ = dValueOf.doubleValue();
                }
            }
            this.LIZ = System.currentTimeMillis();
        }
    }

    @Override // X.InterfaceC1477050oXX
    public final void LIZJ(float f) {
        this.LJ = f;
    }

    public final void LJII(SimVideoUrlModel simVideoUrlModel) {
        SuperResolutionStrategyConfigV2 superResolutionStrategyConfigV2LJIIIZ = LJIIIZ();
        if (superResolutionStrategyConfigV2LJIIIZ != null) {
            int i = superResolutionStrategyConfigV2LJIIIZ.considerBizAdPriority;
            if (simVideoUrlModel != null) {
                int adSrBizPriority = simVideoUrlModel.getAdSrBizPriority();
                if (simVideoUrlModel.getScCategory() == 1 && 1 <= i && i < 4 && 1 <= adSrBizPriority && adSrBizPriority < 4) {
                    int adSrBizPriority2 = simVideoUrlModel.getAdSrBizPriority();
                    if (adSrBizPriority2 != 1) {
                        if (adSrBizPriority2 != 2) {
                            if (adSrBizPriority2 == 3) {
                                simVideoUrlModel.getAdSrBizPriority();
                                return;
                            }
                            return;
                        }
                        simVideoUrlModel.getAdSrBizPriority();
                        return;
                    }
                    simVideoUrlModel.getAdSrBizPriority();
                }
            }
        }
    }

    public static float LJIIIIZZ(SimBitRate simBitRate, int i) {
        float qualityScore = simBitRate.getQualityScore();
        float srTimeParam = C582130MsN.LIZ().getConfig().getCommonConfig().getSrTimeParam();
        if (i == 100) {
            if (srTimeParam == 1.5f) {
                return simBitRate.getQualityScoreSr1d5();
            }
            if (srTimeParam != 2.0f) {
                return qualityScore;
            }
            return simBitRate.getQualityScoreSr2();
        }
        return qualityScore;
    }

    public final int LJFF(SimVideoUrlModel simVideoUrlModel, String str) {
        String str2;
        String portrait;
        Integer numValueOf;
        LJII(simVideoUrlModel);
        if (((Number) C1474810oTv.LJJJLZIJ.getValue()).intValue() == 1 && str != null && Intrinsics.LJFF(this.LJIIIZ.get(str), Boolean.TRUE)) {
            LJIIJ();
            return 100;
        }
        ((Number) C1474810oTv.LJJJLL.getValue()).intValue();
        if (LJIIIZ() == null) {
            return 1;
        }
        int iIntValue = ((Number) C1474810oTv.LJIL.getValue()).intValue();
        if (iIntValue > 0 && this.LJI < iIntValue) {
            return 16;
        }
        if (this.LIZIZ > 0.0d && this.LIZIZ < LJIIIZ().batteryPercentThreshold) {
            return 6;
        }
        C01GW c01gw = C1474810oTv.f198X;
        if (((Number) c01gw.getValue()).intValue() >= 0 && (portrait = C0NEL.LIZ.LIZ.getPortrait("livesdk_live_play_label")) != null && (numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(portrait))) != null && numValueOf.intValue() > ((Number) c01gw.getValue()).intValue()) {
            return 26;
        }
        SuperResolutionStrategyConfigV2 superResolutionStrategyConfigV2LJIIIZ = LJIIIZ();
        if (superResolutionStrategyConfigV2LJIIIZ != null && superResolutionStrategyConfigV2LJIIIZ.closeSRInFastLabel && (str2 = C1474710oTl.LIZ.LJFF) != null && a0.LJJIIZI(str2, "lt", false)) {
            return 28;
        }
        LJIIJ();
        InterfaceC1477620oYS forceSuperResolutionListener = C582130MsN.LIZ().getConfig().getCommonConfig().getForceSuperResolutionListener();
        if (forceSuperResolutionListener != null && forceSuperResolutionListener.LIZIZ(str)) {
            this.LJIIIZ.put(str, Boolean.TRUE);
        } else {
            float f = LJIIIZ().videoTimePercentThreshold;
            ISimPlayerService.LIZ.get().LIZ();
            float f2 = f * 1.0f;
            if (this.LJ >= 0.0f) {
                f2 = this.LJ;
            }
            if (f2 < 1.0f && this.LIZLLL >= f2) {
                if (this.LJ == -1.0f) {
                    return 8;
                }
                return 34;
            }
        }
        return 100;
    }

    @Override // X.InterfaceC1477050oXX
    public final void LIZ(int i, long j, String str, boolean z) {
        int i2;
        if (LJIIIZ() == null) {
            return;
        }
        SuperResolutionStrategyConfigV2 superResolutionStrategyConfigV2LJIIIZ = LJIIIZ();
        int i3 = 0;
        if (superResolutionStrategyConfigV2LJIIIZ != null && superResolutionStrategyConfigV2LJIIIZ.enableSrRatioCount) {
            C1477340oY0 c1477340oY0 = new C1477340oY0(i, j, str, z);
            synchronized (this.LJFF) {
                try {
                    this.LIZJ.offer(Boolean.valueOf(z));
                    SuperResolutionStrategyConfigV2 superResolutionStrategyConfigV2LJIIIZ2 = LJIIIZ();
                    if (superResolutionStrategyConfigV2LJIIIZ2 == null || (i2 = superResolutionStrategyConfigV2LJIIIZ2.srRatioSlidingWindowSize) <= 0) {
                        i2 = 10;
                    }
                    if (this.LIZJ.size() > i2) {
                        this.LIZJ.removeFirst();
                    }
                    Iterator<Boolean> it2 = this.LIZJ.iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        if (it2.next().booleanValue()) {
                            i4++;
                        } else {
                            i3++;
                        }
                        int i5 = i4 + i3;
                        if (i5 > 0) {
                            this.LIZLLL = (i4 * 1.0f) / i5;
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("updatePlayTime pendingPlayTimeMsg ");
                    sbLIZ.append(c1477340oY0);
                    sbLIZ.append(" referSrCnt ");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(" currentPercent ");
                    sbLIZ.append(this.LIZLLL);
                    C2188811AlT.LIZIZ(sbLIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            ((ConcurrentLinkedQueue) this.LJIIIIZZ).add(new C1477340oY0(i, j, str, z));
        }
        this.LJI++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01bd, code lost:
    
        if (r4 > r12) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04f7, code lost:
    
        if (r0 == (-1)) goto L241;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x044e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04fa A[PHI: r25
      0x04fa: PHI (r25v4 com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel) = 
      (r25v3 com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel)
      (r25v5 com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel)
     binds: [B:233:0x04b0, B:235:0x04ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0440 A[EDGE_INSN: B:280:0x0440->B:218:0x0440 BREAK  A[LOOP:4: B:170:0x0338->B:291:0x0338], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    @Override // X.InterfaceC1477050oXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1476840oXC LIZIZ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r30, java.util.List<? extends com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate> r31, int r32, boolean r33, X.InterfaceC1477040oXW r34) {
        /*
            Method dump skipped, instruction units count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1477300oXw.LIZIZ(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, java.util.List, int, boolean, X.0oXW):X.0oXC");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017f A[PHI: r3
      0x017f: PHI (r3v4 int) = (r3v2 int), (r3v2 int), (r3v2 int), (r3v2 int), (r3v7 int) binds: [B:38:0x009b, B:40:0x00a1, B:42:0x00a9, B:118:0x017f, B:92:0x017d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1477050oXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZLLL(float r12, int r13, int r14, int r15, long r16, X.InterfaceC1477220oXo r18, com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r19, java.lang.String r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1477300oXw.LIZLLL(float, int, int, int, long, X.0oXo, com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, java.lang.String, java.lang.String, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b3, code lost:
    
        if (r20 > (r0.longValue() * 1000)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ef, code lost:
    
        if (r20 > (r0.longValue() * 1000)) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJI(float r16, int r17, int r18, int r19, long r20, X.InterfaceC1477220oXo r22, com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r23, java.lang.String r24, java.lang.String r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1477300oXw.LJI(float, int, int, int, long, X.0oXo, com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, java.lang.String, java.lang.String, boolean):int");
    }
}
