package X;

import Y.ARunnableS86S0200000_17;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.roomfunction.EffectNotifyTypeNameMapping;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyAvoidConfigSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyCleanupAddDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyCleanupDefaultDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyCleanupMaxDurationSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEffectNotifyMockEnabledSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveNotifyLogRemoveReceiveSetting;
import com.bytedance.android.livesdkapi.depend.model.live.ComNotifyAvoidRule;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyAnimConflictPair;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyAvoidConfig;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyAvoidPair;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyAvoidRule;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyPublicCommonParams;
import com.bytedance.android.livesdkapi.depend.model.live.NotifyRangeInfo;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS205S0000000_17;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0en1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102250en1 {
    public static final C1102250en1 LIZ = new C1102250en1();
    public static final boolean LIZIZ;
    public static final Map<DataChannel, Map<String, C1102260en2>> LIZJ;
    public static final Map<DataChannel, Map<String, CopyOnWriteArraySet<InterfaceC1102350enB>>> LIZLLL;
    public static final Map<DataChannel, Queue<C1102270en3>> LJ;
    public static final Map<DataChannel, List<C1102260en2>> LJFF;
    public static final Map<DataChannel, Boolean> LJI;
    public static final Map<DataChannel, List<C1102270en3>> LJII;
    public static final Map<DataChannel, C1102340enA> LJIIIIZZ;
    public static NotifyAvoidConfig LJIIIZ;
    public static final C01GW LJIIJ;
    public static final C01GW LJIIJJI;
    public static final C01GW LJIIL;
    public static final C01GW LJIILIIL;
    public static final C1102320en8 LJIILJJIL;
    public static final int LJIILL;
    public static final int LJIILLIIL;
    public static final int LJIIZILJ;
    public static final int LJIJ;
    public static final int LJIJI;

    static {
        LIZIZ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isRegressionTest();
        LIZJ = new LinkedHashMap();
        LIZLLL = new LinkedHashMap();
        LJ = new LinkedHashMap();
        LJFF = new LinkedHashMap();
        LJI = new LinkedHashMap();
        LJII = new LinkedHashMap();
        LJIIIIZZ = new LinkedHashMap();
        LJIIIZ = LiveEffectNotifyAvoidConfigSetting.getConfig();
        LJIIJ = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(95));
        LJIIJJI = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(98));
        LJIIL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(96));
        LJIILIIL = C292401Bi.LIZ(AFwS205S0000000_17.get$arr$(97));
        LJIILJJIL = new C1102320en8(true, 0, null);
        LJIILL = 1;
        LJIILLIIL = 2;
        LJIIZILJ = 3;
        LJIJ = 4;
        LJIJI = 5;
    }

    public static Map LIZLLL() {
        return (Map) LJIIJ.getValue();
    }

    public static Handler LJI() {
        return (Handler) LJIIL.getValue();
    }

    public static EffectNotifyTypeNameMapping LJIIJ() {
        return (EffectNotifyTypeNameMapping) LJIILIIL.getValue();
    }

    public static Map LJIILLIIL() {
        return (Map) LJIIJJI.getValue();
    }

    public static String LJFF(int i) {
        if (i == 0) {
            return "none";
        }
        if (i == LJIILL) {
            return "delay";
        }
        if (i == LJIILLIIL) {
            return "normal_wait";
        }
        if (i == LJIIZILJ) {
            return "scene_avoidance";
        }
        if (i == LJIJ) {
            return "ui_range";
        }
        if (i == LJIJI) {
            return "anim_type";
        }
        return "unknown";
    }

    public static C1097740efk LJIIJJI(DataChannel dataChannel) {
        C1102070emj.LIZ.getClass();
        return (C1097740efk) ((LinkedHashMap) C1102070emj.LJ).get(dataChannel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0en4, X.0evu] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJJ(final DataChannel dataChannel) throws JSONException {
        ArrayList arrayList;
        int i;
        Collection collection = (Collection) ((LinkedHashMap) LJ).get(dataChannel);
        if (collection == null) {
            return;
        }
        Map<DataChannel, Boolean> map = LJI;
        Boolean bool = (Boolean) ((LinkedHashMap) map).get(dataChannel);
        if (bool != null && bool.booleanValue()) {
            return;
        }
        map.put(dataChannel, Boolean.TRUE);
        PriorityQueue priorityQueue = new PriorityQueue(collection);
        C1102270en3 c1102270en3 = null;
        while (!priorityQueue.isEmpty()) {
            final C1102270en3 c1102270en32 = (C1102270en3) priorityQueue.poll();
            if (c1102270en32 != null) {
                List list = (List) ((LinkedHashMap) LJII).get(dataChannel);
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C1102270en3) it2.next()).LJJJIL);
                    }
                } else {
                    arrayList = null;
                }
                C1102320en8 c1102320en8LIZJ = LIZJ(dataChannel, arrayList, c1102270en32.LJJJIL, null, null);
                if (c1102320en8LIZJ.LIZ) {
                    if (!c1102270en32.LIZLLL) {
                        if (c1102270en3 == null) {
                            long jLJ = LJ(dataChannel, c1102270en32.LJJJIL);
                            if (jLJ <= 0) {
                                LIZIZ(dataChannel, c1102270en32);
                            } else {
                                LJJI(c1102270en32);
                                ARunnableS86S0200000_17 aRunnableS86S0200000_17 = new ARunnableS86S0200000_17(dataChannel, c1102270en32, 25);
                                c1102270en32.LJJIJIL = aRunnableS86S0200000_17;
                                c1102270en32.LJJIJLIJ = jLJ;
                                LIZ.getClass();
                                C08D5.LIZIZ(LJI(), aRunnableS86S0200000_17, dataChannel, jLJ);
                                int i2 = LJIILL;
                                C1102340enA c1102340enA = (C1102340enA) ((LinkedHashMap) LJIIIIZZ).get(dataChannel);
                                if (c1102340enA != null) {
                                    i = c1102340enA.LIZ;
                                } else {
                                    i = 0;
                                }
                                LJIJJLI(dataChannel, c1102270en32, new C1102290en5(i2, i));
                            }
                        }
                    } else {
                        LIZIZ(dataChannel, c1102270en32);
                    }
                    c1102270en3 = c1102270en32;
                }
                LJJI(c1102270en32);
                if (c1102320en8LIZJ.LIZIZ == LJIIZILJ && c1102270en32.LJJJ == null) {
                    ?? r9 = new InterfaceC1107760evu() { // from class: X.0en4
                        @Override // X.InterfaceC1107760evu
                        public final void LIZIZ(C1107810evz c1107810evz, boolean z, C1107780evw c1107780evw) {
                        }

                        @Override // X.InterfaceC1107760evu
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC1107760evu
                        public final void LIZ() {
                            ARunnableS86S0200000_17 aRunnableS86S0200000_172 = c1102270en32.LJJIJL;
                            if (aRunnableS86S0200000_172 != null) {
                                C1102250en1.LIZ.getClass();
                                C1102250en1.LJI().removeCallbacks(aRunnableS86S0200000_172);
                            }
                            C1102270en3 c1102270en33 = c1102270en32;
                            DataChannel dataChannel2 = dataChannel;
                            ARunnableS86S0200000_17 aRunnableS86S0200000_173 = new ARunnableS86S0200000_17(dataChannel2, this, 24);
                            c1102270en33.LJJIJL = aRunnableS86S0200000_173;
                            C1102250en1.LIZ.getClass();
                            C08D5.LIZIZ(C1102250en1.LJI(), aRunnableS86S0200000_173, dataChannel2, 50L);
                        }
                    };
                    c1102270en32.LJJJ = r9;
                    C1097770efn.LL.LJFF(dataChannel, c1102270en32.LJFF, r9, "ENM", null, false);
                }
                LJIJJLI(dataChannel, c1102270en32, c1102320en8LIZJ);
            }
        }
        LJI.put(dataChannel, Boolean.FALSE);
    }

    public static void LJJI(C1102260en2 c1102260en2) {
        ARunnableS86S0200000_17 aRunnableS86S0200000_17 = c1102260en2.LJJIJIL;
        if (aRunnableS86S0200000_17 != null) {
            LIZ.getClass();
            LJI().removeCallbacks(aRunnableS86S0200000_17);
        }
        c1102260en2.LJJIJIL = null;
    }

    public static void LIZIZ(DataChannel dataChannel, C1102260en2 c1102260en2) throws JSONException {
        Map map;
        CopyOnWriteArraySet copyOnWriteArraySet;
        LJJI(c1102260en2);
        boolean z = C1102370enD.LIZ;
        C1102330en9 c1102330en9LIZIZ = C1102370enD.LIZIZ(dataChannel, c1102260en2.LJIIIIZZ, c1102260en2.LJIIJ, c1102260en2.LJIIL);
        if (!c1102330en9LIZIZ.LIZ) {
            EnumC1097810efr enumC1097810efr = EnumC1097810efr.FC;
            c1102260en2.LJJIIZI = c1102330en9LIZIZ;
            c1102260en2.LIZIZ.Zc(c1102330en9LIZIZ.LIZIZ);
            LJIJJ(dataChannel, c1102260en2.LIZ, new C1102180emu(c1102330en9LIZIZ), enumC1097810efr);
        }
        if (c1102330en9LIZIZ.LIZ) {
            if (c1102330en9LIZIZ.LIZLLL == EnumC1102380enE.ALL_CHECK_PASSED) {
                C1102370enD.LIZ(dataChannel, c1102260en2.LJIIIIZZ, c1102260en2.LJIIJ, c1102260en2.LJIIL);
            }
            c1102260en2.LJJI();
            if (c1102260en2 instanceof C1102270en3) {
                Queue queue = (Queue) ((LinkedHashMap) LJ).get(dataChannel);
                if (queue != null) {
                    queue.remove(c1102260en2);
                }
                Map<DataChannel, List<C1102270en3>> map2 = LJII;
                List<C1102270en3> arrayList = (List) ((LinkedHashMap) map2).get(dataChannel);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    map2.put(dataChannel, arrayList);
                }
                arrayList.add(c1102260en2);
            } else {
                Map<DataChannel, List<C1102260en2>> map3 = LJFF;
                List<C1102260en2> arrayList2 = (List) ((LinkedHashMap) map3).get(dataChannel);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                    map3.put(dataChannel, arrayList2);
                }
                arrayList2.add(c1102260en2);
            }
            c1102260en2.LJJIL = new ARunnableS86S0200000_17(dataChannel, c1102260en2, 23);
            long jAd = c1102260en2.LIZIZ.ad();
            long duration = LiveEffectNotifyCleanupMaxDurationSetting.getDuration();
            if (jAd <= 0) {
                jAd = LiveEffectNotifyCleanupDefaultDurationSetting.getDuration();
            }
            long duration2 = LiveEffectNotifyCleanupAddDurationSetting.getDuration();
            if (duration != -1) {
                jAd = Math.min(duration, jAd);
            }
            c1102260en2.LJJIZ = duration2 + jAd;
            ARunnableS86S0200000_17 aRunnableS86S0200000_17 = c1102260en2.LJJIL;
            if (aRunnableS86S0200000_17 != null) {
                LIZ.getClass();
                C08D5.LIZIZ(LJI(), aRunnableS86S0200000_17, dataChannel, c1102260en2.LJJIZ);
            }
            c1102260en2.LJJI = false;
            c1102260en2.LJJI();
            LinkedHashMap linkedHashMap = (LinkedHashMap) LIZLLL;
            Map map4 = (Map) linkedHashMap.get(dataChannel);
            if ((map4 != null && (copyOnWriteArraySet = (CopyOnWriteArraySet) map4.get(LJIIIIZZ(c1102260en2.LJIIIIZZ, c1102260en2.LJ))) != null) || ((map = (Map) linkedHashMap.get(dataChannel)) != null && (copyOnWriteArraySet = (CopyOnWriteArraySet) map.get(LJIIIIZZ(c1102260en2.LJIIIIZZ, 0))) != null)) {
                Iterator it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1102350enB) it2.next()).LIZIZ();
                }
            }
            C1102100emm.LIZLLL(dataChannel, LJIIJJI(dataChannel), c1102260en2, null);
            LJIJ("active", c1102260en2);
            c1102260en2.LIZIZ.bd();
        }
    }

    public static long LJ(DataChannel dataChannel, NotifyAvoidRule notifyAvoidRule) {
        int i;
        long jLongValue;
        C1102340enA c1102340enA = (C1102340enA) ((LinkedHashMap) LJIIIIZZ).get(dataChannel);
        if (c1102340enA == null) {
            return 0L;
        }
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            i = 1;
        } else {
            i = 2;
        }
        Long lLJJIFFI = LJJIFFI(c1102340enA.LIZIZ, i, notifyAvoidRule);
        if (lLJJIFFI != null) {
            jLongValue = lLJJIFFI.longValue();
        } else {
            Long lLJJIFFI2 = LJJIFFI(0, i, notifyAvoidRule);
            if (lLJJIFFI2 != null) {
                jLongValue = lLJJIFFI2.longValue();
            } else {
                jLongValue = 0;
            }
        }
        return Math.max((c1102340enA.LIZJ + jLongValue) - SystemClock.uptimeMillis(), 0L);
    }

    public static List LJII(DataChannel dataChannel, NotifyAvoidRule notifyAvoidRule) {
        Map<String, NotifyRangeInfo> map;
        NotifyRangeInfo notifyRangeInfo;
        List<Long> list;
        if (notifyAvoidRule == null) {
            return C13BV.INSTANCE;
        }
        NotifyAvoidConfig notifyAvoidConfig = LJIIIZ;
        if (notifyAvoidConfig == null || (map = notifyAvoidConfig.rangeIdMap) == null || (notifyRangeInfo = map.get(LJIIL(dataChannel, notifyAvoidRule))) == null || (list = notifyRangeInfo.horizontalRange) == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public static String LJIIIIZZ(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(i2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIIZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append(i);
        sbLIZ.append(')');
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJIIL(DataChannel dataChannel, NotifyAvoidRule notifyAvoidRule) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        C1097740efk c1097740efkLJIIJJI = LJIIJJI(dataChannel);
        if (c1097740efkLJIIJJI == null) {
            return notifyAvoidRule.rangeId;
        }
        Map<Integer, String> map = notifyAvoidRule.rangeIdRoomMap;
        boolean z3 = false;
        if (map != null && map.isEmpty()) {
            return notifyAvoidRule.rangeId;
        }
        InterfaceC1102170emt interfaceC1102170emt = c1097740efkLJIIJJI.LIZLLL;
        if (interfaceC1102170emt != null && interfaceC1102170emt.LIZIZ(dataChannel)) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC1102170emt interfaceC1102170emt2 = c1097740efkLJIIJJI.LIZLLL;
        if (interfaceC1102170emt2 != null && interfaceC1102170emt2.LIZJ(dataChannel)) {
            z2 = true;
        } else {
            z2 = false;
        }
        InterfaceC1102170emt interfaceC1102170emt3 = c1097740efkLJIIJJI.LIZLLL;
        if (interfaceC1102170emt3 != null && interfaceC1102170emt3.LIZLLL(dataChannel)) {
            z3 = true;
        }
        if (z3) {
            if (z || z2) {
                Map<Integer, String> map2 = notifyAvoidRule.rangeIdRoomMap;
                if (map2 == null || (str4 = map2.get(1)) == null) {
                    Map<Integer, String> map3 = notifyAvoidRule.rangeIdRoomMap;
                    if (map3 == null || (str3 = map3.get(3)) == null) {
                        return notifyAvoidRule.rangeId;
                    }
                    return str3;
                }
                return str4;
            }
        } else if (z || z2) {
            Map<Integer, String> map4 = notifyAvoidRule.rangeIdRoomMap;
            if (map4 == null || (str2 = map4.get(2)) == null) {
                Map<Integer, String> map5 = notifyAvoidRule.rangeIdRoomMap;
                if (map5 == null || (str = map5.get(4)) == null) {
                    return notifyAvoidRule.rangeId;
                }
                return str;
            }
            return str2;
        }
        return notifyAvoidRule.rangeId;
    }

    public static List LJIILL(DataChannel dataChannel, NotifyAvoidRule notifyAvoidRule) {
        Map<String, NotifyRangeInfo> map;
        NotifyRangeInfo notifyRangeInfo;
        List<Long> list;
        if (notifyAvoidRule == null) {
            return C13BV.INSTANCE;
        }
        NotifyAvoidConfig notifyAvoidConfig = LJIIIZ;
        if (notifyAvoidConfig == null || (map = notifyAvoidConfig.rangeIdMap) == null || (notifyRangeInfo = map.get(LJIIL(dataChannel, notifyAvoidRule))) == null || (list = notifyRangeInfo.verticalRange) == null) {
            return C13BV.INSTANCE;
        }
        return list;
    }

    public static void LJIJ(String str, C1102260en2 c1102260en2) throws JSONException {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        String strLIZ;
        boolean z4;
        String str2;
        if (LIZIZ || LiveEffectNotifyMockEnabledSetting.enable()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Action: ttlive_effect_notify_conflict_control_");
            sbLIZ.append(str);
            sbLIZ.append(", Record: ");
            sbLIZ.append(c1102260en2);
            C20441214yg.LJ("ENM", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Action: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", Record: ");
            sbLIZ2.append(c1102260en2);
            C20441214yg.LJ("ENM", C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ttlive_effect_notify_conflict_control_");
            sbLIZ3.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            c1102260en2.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FollowStatusChangeMethod.PARAM_UID, c1102260en2.LIZ);
            C1102250en1 c1102250en1 = LIZ;
            int i2 = c1102260en2.LJIIIIZZ;
            String str3 = c1102260en2.LJIIIZ;
            c1102250en1.getClass();
            jSONObject2.put("component", LJIIIZ(i2, str3));
            jSONObject2.put("biz", LJIIIZ(c1102260en2.LJIIJ, c1102260en2.LJIIJJI));
            jSONObject2.put(Scene.SCENE_SERVICE, LJIIIZ(c1102260en2.LJIIL, c1102260en2.LJIILIIL));
            jSONObject2.put("isTimely", c1102260en2.LIZLLL);
            jSONObject2.put("animType", c1102260en2.LJII);
            jSONObject2.put("feature", c1102260en2.LJIIZILJ);
            Integer num = null;
            jSONObject2.put("horizontalRange", C13LP.LJJLIIIJ(c1102260en2.LJIILJJIL, null, null, null, 0, null, null, 63));
            jSONObject2.put("verticalRange", C13LP.LJJLIIIJ(c1102260en2.LJIILL, null, null, null, 0, null, null, 63));
            jSONObject2.put("avoidScene", C13LP.LJJLIIIJ(c1102260en2.LJFF, null, null, null, 0, null, null, 63));
            jSONObject2.put("estimated_show_duration", c1102260en2.LIZIZ.ad());
            c1102260en2.LJJIFFI(jSONObject2);
            jSONObject.put("basic_info", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("enterTs", c1102260en2.LIZJ);
            jSONObject3.put("startNotifyTs", c1102260en2.LJI);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("readyTs", c1102260en2.LJIJ);
            jSONObject3.put("ready", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            if (c1102260en2.LJIJI != 0) {
                z = true;
            } else {
                z = false;
            }
            jSONObject5.put("isActive", z);
            jSONObject5.put("activeTs", c1102260en2.LJIJI);
            jSONObject5.put("activeTotalDuration", c1102260en2.LJIJJ);
            jSONObject5.put("lastActiveDuration", c1102260en2.LJIJJLI);
            jSONObject5.put("activeCount", c1102260en2.LJIL);
            jSONObject5.put("recoverCount", c1102260en2.LJJ);
            jSONObject5.put("isRecovery", c1102260en2.LJJIIZ);
            jSONObject3.put("active", jSONObject5);
            JSONObject jSONObject6 = new JSONObject();
            if (c1102260en2.LJJIFFI != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            jSONObject6.put("isInactive", z2);
            jSONObject6.put("inactiveTs", c1102260en2.LJJIFFI);
            jSONObject6.put("inactiveTotalDuration", c1102260en2.LJJIII);
            jSONObject6.put("lastInactiveDuration", c1102260en2.LJJIIJ);
            jSONObject6.put("inactiveCount", c1102260en2.LJJIIJZLJL);
            JSONObject jSONObject7 = new JSONObject();
            C1102320en8 c1102320en8 = c1102260en2.LJJII;
            if (c1102320en8 != null && !c1102320en8.LIZ) {
                z3 = true;
            } else {
                z3 = false;
            }
            jSONObject7.put("pass", !z3);
            C1102320en8 c1102320en82 = c1102260en2.LJJII;
            if (c1102320en82 != null) {
                i = c1102320en82.LIZIZ;
            } else {
                i = 0;
            }
            jSONObject7.put("conflictReason", LJFF(i));
            C1102320en8 c1102320en83 = c1102260en2.LJJII;
            String strLIZ2 = null;
            if (c1102320en83 != null) {
                strLIZ = c1102320en83.LIZ();
            } else {
                strLIZ = null;
            }
            jSONObject7.put("conflictTarget", strLIZ);
            C1102320en8 c1102320en84 = c1102260en2.LJJII;
            if (c1102320en84 != null) {
                num = c1102320en84.LIZJ;
            }
            jSONObject7.put("conflictType", num);
            jSONObject6.put("conflict", jSONObject7);
            jSONObject3.put("inactive", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            C1102330en9 c1102330en9 = c1102260en2.LJJIIZI;
            if (c1102330en9 != null && !c1102330en9.LIZ) {
                z4 = true;
            } else {
                z4 = false;
            }
            jSONObject8.put("pass", true ^ z4);
            C1102330en9 c1102330en92 = c1102260en2.LJJIIZI;
            if (c1102330en92 != null) {
                strLIZ2 = c1102330en92.LIZ();
            }
            jSONObject8.put("reasons", strLIZ2);
            jSONObject3.put("frequency", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("isConsumed", c1102260en2.LJJIJ);
            EnumC1097810efr enumC1097810efr = c1102260en2.LJJIJIIJI;
            if (enumC1097810efr != null) {
                jSONObject9.put("consumeCallerType", enumC1097810efr.getType());
            }
            int i3 = c1102260en2.LJJIJIIJIL;
            Map<String, String> map = LJIIJ().consumeMethod;
            if (map == null || (str2 = map.get(String.valueOf(i3))) == null) {
                str2 = "";
            }
            jSONObject9.put("consumeMethod", str2);
            jSONObject9.put("delayRunnable", c1102260en2.LJJIJIL);
            jSONObject9.put("cleanupRunnable", c1102260en2.LJJIL);
            jSONObject9.put("avoidSceneObserver", c1102260en2.LJJJ);
            jSONObject3.put("consume", jSONObject9);
            jSONObject3.put("avoidSceneObserver", c1102260en2.LJJJ);
            JSONObject jSONObject10 = new JSONObject();
            jSONObject10.put("delayed", c1102260en2.LJJIJLIJ);
            jSONObject10.put("delayRunnable", c1102260en2.LJJIJIL);
            jSONObject3.put("anim_delay", jSONObject10);
            JSONObject jSONObject11 = new JSONObject();
            jSONObject11.put("delay", c1102260en2.LJJIZ);
            jSONObject11.put("cleanupRunnable", c1102260en2.LJJIL);
            jSONObject3.put("cleanup", jSONObject11);
            jSONObject.put("notify_info", jSONObject3);
            C1CC2.LJIIL(0, strLIZIZ, jSONObject);
        }
    }

    public static void LJIJI(DataChannel dataChannel, C1102260en2 c1102260en2) {
        Map<DataChannel, Map<String, C1102260en2>> map = LIZJ;
        Map<String, C1102260en2> linkedHashMap = (Map) ((LinkedHashMap) map).get(dataChannel);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            map.put(dataChannel, linkedHashMap);
        }
        if (!linkedHashMap.containsKey(c1102260en2.LIZ)) {
            linkedHashMap.put(c1102260en2.LIZ, c1102260en2);
        }
    }

    public static void LJIL(DataChannel dataChannel, C1102260en2 c1102260en2) throws JSONException {
        c1102260en2.LJIJ = SystemClock.uptimeMillis();
        C1097740efk c1097740efkLJIIJJI = LJIIJJI(dataChannel);
        if (!LiveNotifyLogRemoveReceiveSetting.enable()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_notify_component_received");
            C1102100emm.LIZ(c474500IjALIZ, dataChannel, c1097740efkLJIIJJI, c1102260en2);
            c474500IjALIZ.LIZ();
        }
        C1097740efk c1097740efkLJIIJJI2 = LJIIJJI(dataChannel);
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_notify_component_ready");
        C1102100emm.LIZ(c474500IjALIZ2, dataChannel, c1097740efkLJIIJJI2, c1102260en2);
        c474500IjALIZ2.LJJIIZI(null);
        c474500IjALIZ2.LIZ();
        LJIJ("ready", c1102260en2);
    }

    public static void LJJII(NotifyAvoidRule notifyAvoidRule, Map map) {
        Map<Integer, String> linkedHashMap;
        String str;
        NotifyPublicCommonParams notifyPublicCommonParams = notifyAvoidRule.publicCommonParams;
        if (notifyPublicCommonParams != null) {
            ComNotifyAvoidRule comNotifyAvoidRule = (ComNotifyAvoidRule) ((LinkedHashMap) map).get(Integer.valueOf(notifyPublicCommonParams.component));
            String str2 = notifyAvoidRule.rangeId;
            if (str2 != null && str2.length() == 0) {
                if (comNotifyAvoidRule == null || (str = comNotifyAvoidRule.rangeId) == null) {
                    str = "";
                }
                notifyAvoidRule.rangeId = str;
            }
            Map<Integer, String> map2 = notifyAvoidRule.rangeIdRoomMap;
            if (map2 != null && map2.isEmpty()) {
                if (comNotifyAvoidRule == null || (linkedHashMap = comNotifyAvoidRule.rangeIdRoomMap) == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                notifyAvoidRule.rangeIdRoomMap = linkedHashMap;
            }
            List<String> list = notifyAvoidRule.avoidScene;
            if (list != null && list.isEmpty() && comNotifyAvoidRule != null) {
                List<Integer> list2 = comNotifyAvoidRule.avoidSceneApplied;
                if (list2 == null || list2.isEmpty() || comNotifyAvoidRule.avoidSceneApplied.contains(Integer.valueOf(notifyPublicCommonParams.scene))) {
                    notifyAvoidRule.avoidScene = comNotifyAvoidRule.avoidScene;
                }
            }
        }
    }

    public static void LIZ(InterfaceC1102300en6 interfaceC1102300en6, DataChannel dataChannel, String str) throws JSONException {
        String str2;
        String str3;
        int i;
        String str4;
        boolean z = C1102370enD.LIZ;
        C1102330en9 c1102330en9LIZIZ = C1102370enD.LIZIZ(dataChannel, interfaceC1102300en6.LJIILJJIL(), interfaceC1102300en6.getBiz(), interfaceC1102300en6.getScene());
        if (!c1102330en9LIZIZ.LIZ) {
            interfaceC1102300en6.Zc(c1102330en9LIZIZ.LIZIZ);
            return;
        }
        if (c1102330en9LIZIZ.LIZLLL == EnumC1102380enE.ALL_CHECK_PASSED) {
            C1102370enD.LIZ(dataChannel, interfaceC1102300en6.LJIILJJIL(), interfaceC1102300en6.getBiz(), interfaceC1102300en6.getScene());
        }
        interfaceC1102300en6.bd();
        if (!LIZIZ && !LiveEffectNotifyMockEnabledSetting.enable()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Action: ttlive_effect_notify_conflict_control_");
        sbLIZ.append("activate_directly");
        sbLIZ.append(", Record: ");
        sbLIZ.append(interfaceC1102300en6);
        C20441214yg.LJ("ENM", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ttlive_effect_notify_conflict_control_");
        sbLIZ2.append("activate_directly");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("action", "activate_directly");
        jSONObject.put("reason", str);
        JSONObject jSONObject2 = new JSONObject();
        C1102250en1 c1102250en1 = LIZ;
        int iLJIILJJIL = interfaceC1102300en6.LJIILJJIL();
        int iLJIILJJIL2 = interfaceC1102300en6.LJIILJJIL();
        c1102250en1.getClass();
        Map<String, String> map = LJIIJ().component;
        String str5 = null;
        if (map != null) {
            str5 = map.get(String.valueOf(iLJIILJJIL2));
        }
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        jSONObject2.put("component", LJIIIZ(iLJIILJJIL, str5));
        int biz = interfaceC1102300en6.getBiz();
        int biz2 = interfaceC1102300en6.getBiz();
        Map<String, String> map2 = LJIIJ().biz;
        if (map2 == null || (str2 = map2.get(String.valueOf(biz2))) == null) {
            str2 = "";
        }
        jSONObject2.put("biz", LJIIIZ(biz, str2));
        int scene = interfaceC1102300en6.getScene();
        int scene2 = interfaceC1102300en6.getScene();
        Map<String, String> map3 = LJIIJ().scene;
        if (map3 == null || (str3 = map3.get(String.valueOf(scene2))) == null) {
            str3 = "";
        }
        jSONObject2.put(Scene.SCENE_SERVICE, LJIIIZ(scene, str3));
        if (dataChannel != null) {
            NotifyAvoidRule notifyAvoidRuleLJIILIIL = LJIILIIL(dataChannel, interfaceC1102300en6.LJIILJJIL(), interfaceC1102300en6.getBiz(), interfaceC1102300en6.getScene());
            if (notifyAvoidRuleLJIILIIL != null) {
                i = notifyAvoidRuleLJIILIIL.animType;
            } else {
                i = 0;
            }
            Map<String, String> map4 = LJIIJ().anim;
            if (map4 != null && (str4 = map4.get(String.valueOf(i))) != null) {
                str6 = str4;
            }
        } else {
            str6 = "Unknown";
        }
        jSONObject2.put("anim_type", str6);
        jSONObject2.put("estimated_show_duration", interfaceC1102300en6.ad());
        jSONObject.put("basic_info", jSONObject2);
        C1CC2.LJIIL(0, strLIZIZ, jSONObject);
    }

    public static String LJIILJJIL(int i, int i2, int i3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('_');
        sbLIZ.append(i2);
        sbLIZ.append('_');
        sbLIZ.append(i3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIJJLI(DataChannel dataChannel, C1102270en3 c1102270en3, C1102320en8 c1102320en8) throws JSONException {
        if (c1102270en3.LJIJI != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - c1102270en3.LJIJI;
            c1102270en3.LJIJJLI = jUptimeMillis;
            c1102270en3.LJIJJ += jUptimeMillis;
            c1102270en3.LJIJI = 0L;
        }
        c1102270en3.LJJI = false;
        c1102270en3.LJJII = c1102320en8;
        if (c1102270en3.LJJIFFI == 0) {
            c1102270en3.LJJIIJZLJL++;
            c1102270en3.LJJIFFI = SystemClock.uptimeMillis();
            C1102100emm.LIZIZ(dataChannel, LJIIJJI(dataChannel), c1102270en3, null);
            LJIJ("inactive", c1102270en3);
            return;
        }
        LJIJ("update_conflict_info", c1102270en3);
    }

    public static Long LJJIFFI(int i, int i2, NotifyAvoidRule notifyAvoidRule) {
        List<NotifyAvoidPair> list;
        NotifyAvoidPair next;
        int i3;
        NotifyAvoidConfig notifyAvoidConfig = LJIIIZ;
        if (notifyAvoidConfig == null || (list = notifyAvoidConfig.avoidPair) == null) {
            return null;
        }
        Iterator<NotifyAvoidPair> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NotifyAvoidPair notifyAvoidPair = next;
                if (notifyAvoidPair.lastFeature == i && notifyAvoidPair.afterFeature == notifyAvoidRule.feature && ((i3 = notifyAvoidPair.userType) == i2 || i3 == 0)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NotifyAvoidPair notifyAvoidPair2 = next;
        if (notifyAvoidPair2 == null) {
            return null;
        }
        return Long.valueOf(notifyAvoidPair2.avoidTimeGap);
    }

    public static NotifyAvoidRule LJIILIIL(DataChannel dataChannel, int i, int i2, int i3) {
        NotifyAvoidConfig notifyAvoidConfig;
        int i4;
        NotifyAvoidConfig notifyAvoidConfig2;
        int i5;
        if (C500260Jjc.LJIIZILJ(dataChannel)) {
            if (LIZLLL().isEmpty() && (notifyAvoidConfig2 = LJIIIZ) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<ComNotifyAvoidRule> list = notifyAvoidConfig2.comRules;
                if (list != null) {
                    for (ComNotifyAvoidRule comNotifyAvoidRule : list) {
                        linkedHashMap.put(Integer.valueOf(comNotifyAvoidRule.component), comNotifyAvoidRule);
                    }
                }
                List<NotifyAvoidRule> list2 = notifyAvoidConfig2.rules;
                if (list2 != null) {
                    for (NotifyAvoidRule notifyAvoidRule : list2) {
                        NotifyPublicCommonParams notifyPublicCommonParams = notifyAvoidRule.publicCommonParams;
                        if (notifyPublicCommonParams != null && ((i5 = notifyPublicCommonParams.userType) == 1 || i5 == 0)) {
                            LIZ.getClass();
                            LJJII(notifyAvoidRule, linkedHashMap);
                            LIZLLL().put(LJIILJJIL(notifyPublicCommonParams.component, notifyPublicCommonParams.biz, notifyPublicCommonParams.scene), notifyAvoidRule);
                        }
                    }
                }
            }
            if (LIZLLL().isEmpty()) {
                return null;
            }
            NotifyAvoidRule notifyAvoidRule2 = (NotifyAvoidRule) LIZLLL().get(LJIILJJIL(i, i2, i3));
            if (notifyAvoidRule2 == null) {
                NotifyAvoidRule notifyAvoidRule3 = (NotifyAvoidRule) LIZLLL().get(LJIILJJIL(i, i2, 0));
                if (notifyAvoidRule3 == null) {
                    return (NotifyAvoidRule) LIZLLL().get(LJIILJJIL(i, 0, 0));
                }
                return notifyAvoidRule3;
            }
            return notifyAvoidRule2;
        }
        if (LJIILLIIL().isEmpty() && (notifyAvoidConfig = LJIIIZ) != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List<ComNotifyAvoidRule> list3 = notifyAvoidConfig.comRules;
            if (list3 != null) {
                for (ComNotifyAvoidRule comNotifyAvoidRule2 : list3) {
                    linkedHashMap2.put(Integer.valueOf(comNotifyAvoidRule2.component), comNotifyAvoidRule2);
                }
            }
            List<NotifyAvoidRule> list4 = notifyAvoidConfig.rules;
            if (list4 != null) {
                for (NotifyAvoidRule notifyAvoidRule4 : list4) {
                    NotifyPublicCommonParams notifyPublicCommonParams2 = notifyAvoidRule4.publicCommonParams;
                    if (notifyPublicCommonParams2 != null && ((i4 = notifyPublicCommonParams2.userType) == 2 || i4 == 0)) {
                        LIZ.getClass();
                        LJJII(notifyAvoidRule4, linkedHashMap2);
                        LJIILLIIL().put(LJIILJJIL(notifyPublicCommonParams2.component, notifyPublicCommonParams2.biz, notifyPublicCommonParams2.scene), notifyAvoidRule4);
                    }
                }
            }
        }
        if (LJIILLIIL().isEmpty()) {
            return null;
        }
        NotifyAvoidRule notifyAvoidRule5 = (NotifyAvoidRule) LJIILLIIL().get(LJIILJJIL(i, i2, i3));
        if (notifyAvoidRule5 == null) {
            NotifyAvoidRule notifyAvoidRule6 = (NotifyAvoidRule) LJIILLIIL().get(LJIILJJIL(i, i2, 0));
            if (notifyAvoidRule6 == null) {
                return (NotifyAvoidRule) LJIILLIIL().get(LJIILJJIL(i, 0, 0));
            }
            return notifyAvoidRule6;
        }
        return notifyAvoidRule5;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJJ(com.bytedance.ies.sdk.datachannel.DataChannel r13, java.lang.String r14, X.C1097750efl r15, X.EnumC1097810efr r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1102250en1.LJIJJ(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, X.0efl, X.0efr):void");
    }

    public static C1102320en8 LIZJ(DataChannel dataChannel, List list, NotifyAvoidRule notifyAvoidRule, InterfaceC1631630sYr interfaceC1631630sYr, List list2) {
        boolean z;
        List<NotifyAnimConflictPair> list3;
        NotifyPublicCommonParams notifyPublicCommonParams;
        List<String> listLJLI;
        int i = 0;
        if (notifyAvoidRule.avoidScene != null && (!r0.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        final String str = null;
        if (z) {
            C1097770efn c1097770efn = C1097770efn.LL;
            if (list2 == null || (listLJLI = C13LP.LJLI(notifyAvoidRule.avoidScene, list2)) == null) {
                listLJLI = notifyAvoidRule.avoidScene;
            }
            List<C1102210emx> listLJII = c1097770efn.LJII(dataChannel, listLJLI);
            if (listLJII != null && (!listLJII.isEmpty())) {
                C1102210emx c1102210emx = (C1102210emx) C13LP.LJJJLL(listLJII);
                if (c1102210emx != null) {
                    str = c1102210emx.LIZ;
                }
                return new C1102320en8(str) { // from class: X.0en7
                    public final String LIZLLL;

                    @Override // X.C1102320en8
                    public final String LIZ() {
                        return this.LIZLLL;
                    }

                    {
                        super(false, C1102250en1.LJIIZILJ, 0);
                        this.LIZLLL = str;
                    }
                };
            }
        }
        if (list == null) {
            return LJIILJJIL;
        }
        if (list.isEmpty()) {
            return LJIILJJIL;
        }
        if (!notifyAvoidRule.timely) {
            int i2 = LJIILLIIL;
            NotifyAvoidRule notifyAvoidRule2 = (NotifyAvoidRule) C13LP.LJJJLL(list);
            if (notifyAvoidRule2 != null && (notifyPublicCommonParams = notifyAvoidRule2.publicCommonParams) != null) {
                i = notifyPublicCommonParams.component;
            }
            return new C1102290en5(i2, i);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            NotifyAvoidRule notifyAvoidRule3 = (NotifyAvoidRule) it2.next();
            NotifyPublicCommonParams notifyPublicCommonParams2 = notifyAvoidRule3.publicCommonParams;
            if (notifyPublicCommonParams2 != null && (interfaceC1631630sYr == null || !((Boolean) interfaceC1631630sYr.invoke(Integer.valueOf(notifyPublicCommonParams2.component), Integer.valueOf(notifyPublicCommonParams2.biz), Integer.valueOf(notifyPublicCommonParams2.scene), Integer.valueOf(notifyAvoidRule3.animType))).booleanValue())) {
                LIZ.getClass();
                if ((!C13LP.LJJL(LJII(dataChannel, notifyAvoidRule3), LJII(dataChannel, notifyAvoidRule)).isEmpty()) && (!C13LP.LJJL(LJIILL(dataChannel, notifyAvoidRule3), LJIILL(dataChannel, notifyAvoidRule)).isEmpty())) {
                    return new C1102290en5(LJIJ, notifyPublicCommonParams2.component);
                }
                NotifyAvoidConfig notifyAvoidConfig = LJIIIZ;
                if (notifyAvoidConfig != null && (list3 = notifyAvoidConfig.animConflictPair) != null && !list3.isEmpty()) {
                    for (NotifyAnimConflictPair notifyAnimConflictPair : list3) {
                        if (notifyAnimConflictPair.beforeAnimType == notifyAvoidRule3.animType && notifyAnimConflictPair.afterAnimType == notifyAvoidRule.animType) {
                            return new C1102290en5(LJIJI, notifyPublicCommonParams2.component);
                        }
                    }
                }
            }
        }
        return LJIILJJIL;
    }

    public static void LJIIZILJ(int i, int i2, int i3, DataChannel dataChannel, String str, String str2) throws JSONException {
        String str3;
        String str4;
        int i4;
        String str5;
        if (LIZIZ || LiveEffectNotifyMockEnabledSetting.enable()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Action: ttlive_effect_notify_conflict_control_");
            sbLIZ.append(str);
            sbLIZ.append(", component: ");
            sbLIZ.append(i);
            sbLIZ.append(", biz: ");
            sbLIZ.append(i2);
            sbLIZ.append(", scene: ");
            sbLIZ.append(i3);
            C20441214yg.LJ("ENM", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ttlive_effect_notify_conflict_control_");
            sbLIZ2.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", str);
            jSONObject.put("reason", str2);
            JSONObject jSONObject2 = new JSONObject();
            LIZ.getClass();
            Map<String, String> map = LJIIJ().component;
            String str6 = null;
            if (map != null) {
                str6 = map.get(String.valueOf(i));
            }
            String str7 = "";
            if (str6 == null) {
                str6 = "";
            }
            jSONObject2.put("component", LJIIIZ(i, str6));
            Map<String, String> map2 = LJIIJ().biz;
            if (map2 == null || (str3 = map2.get(String.valueOf(i2))) == null) {
                str3 = "";
            }
            jSONObject2.put("biz", LJIIIZ(i2, str3));
            Map<String, String> map3 = LJIIJ().scene;
            if (map3 == null || (str4 = map3.get(String.valueOf(i3))) == null) {
                str4 = "";
            }
            jSONObject2.put(Scene.SCENE_SERVICE, LJIIIZ(i3, str4));
            if (dataChannel != null) {
                NotifyAvoidRule notifyAvoidRuleLJIILIIL = LJIILIIL(dataChannel, i, i2, i3);
                if (notifyAvoidRuleLJIILIIL != null) {
                    i4 = notifyAvoidRuleLJIILIIL.animType;
                } else {
                    i4 = 0;
                }
                Map<String, String> map4 = LJIIJ().anim;
                if (map4 != null && (str5 = map4.get(String.valueOf(i4))) != null) {
                    str7 = str5;
                }
            } else {
                str7 = "Unknown";
            }
            jSONObject2.put("anim_type", str7);
            jSONObject.put("basic_info", jSONObject2);
            C1CC2.LJIIL(0, strLIZIZ, jSONObject);
        }
    }
}
