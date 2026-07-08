package X;

import Y.ARunnableS112S0100000_12;
import android.os.Handler;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS97S1000000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONObject;
import webcast.api.room.Modification;

/* JADX INFO: renamed from: X.0U7R, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U7R implements InterfaceC769210UFj {
    public static ARunnableS112S0100000_12 LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIILIIL;
    public static final C0U7R LIZ = new C0U7R();
    public static final Map<Long, C0U7T> LIZIZ = new LinkedHashMap();
    public static final Map<Long, C0U7T> LIZJ = new LinkedHashMap();
    public static final Map<Long, C0U7T> LIZLLL = new LinkedHashMap();
    public static final Map<Long, C0U7T> LJ = new LinkedHashMap();
    public static final Map<Long, C0U7T> LJFF = new LinkedHashMap();
    public static final Map<String, Boolean> LJI = new LinkedHashMap();
    public static final Map<Long, C0U7S> LJII = new LinkedHashMap();
    public static final Set<String> LJIIJ = new LinkedHashSet();
    public static final Set<Long> LJIIJJI = new LinkedHashSet();
    public static String LJIIL = "normal_video_live";
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(210));
    public static final C767030U6z LJIILL = new C767030U6z();
    public static final HashMap<String, Integer> LJIILLIIL = new HashMap<>();

    public static Handler LJII() {
        return (Handler) LJIILJJIL.getValue();
    }

    public static void LJIILIIL() {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((LinkedHashMap) LIZJ).entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(((C0U7T) ((Map.Entry) it2.next()).getValue()).LIZLLL.getEffectId()));
        }
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        String string = arrayList.toString();
        c1276840jKc.getClass();
        C1276840jKc.LJIILIIL.put("beauty_resource_list", string);
    }

    @Override // X.InterfaceC769210UFj
    public final void LIZ() {
        Map<Long, C0U7T> map = LIZJ;
        C760080Tri.LJII = !map.isEmpty();
        Map<Long, C0U7T> map2 = LIZIZ;
        ((LinkedHashMap) map2).clear();
        map2.putAll(map);
        ((LinkedHashMap) LIZLLL).clear();
        ((LinkedHashMap) LJ).clear();
        ((LinkedHashMap) LJFF).clear();
        ((LinkedHashMap) map).clear();
        LJIIIZ = false;
        ((LinkedHashMap) LJI).clear();
    }

    @Override // X.InterfaceC769210UFj
    public final void release() {
        ((LinkedHashMap) LIZIZ).clear();
        ((LinkedHashMap) LIZJ).clear();
        ((LinkedHashMap) LIZLLL).clear();
        ((LinkedHashMap) LJ).clear();
        ((LinkedHashMap) LJFF).clear();
        Iterator it2 = ((LinkedHashMap) LJII).entrySet().iterator();
        while (it2.hasNext()) {
            LJII().removeCallbacks((Runnable) ((Map.Entry) it2.next()).getValue());
        }
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = LJIIIIZZ;
        if (aRunnableS112S0100000_12 != null) {
            LJII().removeCallbacks(aRunnableS112S0100000_12);
        }
        ((LinkedHashMap) LJII).clear();
        LJIIJ.clear();
    }

    public static boolean LJIIIIZZ() {
        LiveEffect liveEffect;
        Iterator<LiveEffect> it2 = C0UA1.LIZ().qr(C0UD4.LJFF).iterator();
        while (true) {
            liveEffect = null;
            if (!it2.hasNext()) {
                break;
            }
            LiveEffect next = it2.next();
            String strLJLL = next.LJLL();
            if (C500260Jjc.LJJJI(strLJLL != null ? Boolean.valueOf(u.LJJIIJZLJL(strLJLL, "makeup", false)) : null)) {
                liveEffect = next;
                break;
            }
        }
        LiveEffect liveEffect2 = liveEffect;
        if (liveEffect2 != null) {
            if (C814420VxA.LIZIZ(C0UG7.LIZLLL(C0U7C.LJIIJ(liveEffect2), C0U7C.LJIIJ(liveEffect2) != null ? r0.LIZ : 0) * 100.0f) / 100.0f != 0.0f) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC769210UFj
    public final void LIZIZ(boolean z) {
        int i;
        Integer numValueOf;
        boolean zBooleanValue;
        Integer numValueOf2;
        boolean zBooleanValue2;
        String strLJLL;
        if (z) {
            for (Map.Entry entry : ((LinkedHashMap) LIZIZ).entrySet()) {
                LJFF.put((Long) entry.getKey(), new C0U7T((C0U7T) entry.getValue()));
            }
            return;
        }
        List<LiveEffect> listQr = C0UA1.LIZ().qr(C0UD4.LJFF);
        ArrayList<LiveEffect> arrayList = new ArrayList();
        for (LiveEffect liveEffect : listQr) {
            LiveEffect liveEffect2 = liveEffect;
            if (LiveBeautySwitchSetting.INSTANCE.inExperiment() && (strLJLL = liveEffect2.LJLL()) != null && u.LJJIIJZLJL(strLJLL, "beauty", false)) {
                if (C500260Jjc.LJJIIZ(liveEffect2.getName()) && InterfaceC766480U4w.LJJIII.LIZIZ().booleanValue()) {
                    arrayList.add(liveEffect);
                }
            } else if (C500260Jjc.LJJIIZ(liveEffect2.getName())) {
                arrayList.add(liveEffect);
            }
        }
        for (LiveEffect liveEffect3 : arrayList) {
            C0U7T c0u7t = (C0U7T) ((LinkedHashMap) LIZIZ).get(Long.valueOf(liveEffect3.getEffectId()));
            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect3);
            if (composerConfigLJIIJ != null) {
                i = composerConfigLJIIJ.LIZ;
            } else {
                i = 0;
            }
            float fLIZIZ = C814420VxA.LIZIZ(C0UG7.LIZLLL(C0U7C.LJIIJ(liveEffect3), i) * 100.0f) / 100.0f;
            Integer numValueOf3 = null;
            if (c0u7t == null) {
                if (fLIZIZ != 0.0f) {
                    Map<String, Boolean> map = LJI;
                    Boolean bool = (Boolean) ((LinkedHashMap) map).get(liveEffect3.getResourceId());
                    if (bool == null && map.containsKey(liveEffect3.LLILII())) {
                        bool = (Boolean) ((LinkedHashMap) map).get(liveEffect3.LLILII());
                    }
                    long effectId = liveEffect3.getEffectId();
                    String name = liveEffect3.getName();
                    LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect3);
                    if (composerConfigLJIIJ2 != null) {
                        numValueOf = Integer.valueOf(composerConfigLJIIJ2.LIZ);
                    } else {
                        numValueOf = null;
                    }
                    LiveEffect.ComposerConfig composerConfigLJIIJ3 = C0U7C.LJIIJ(liveEffect3);
                    if (composerConfigLJIIJ3 != null) {
                        numValueOf3 = Integer.valueOf(composerConfigLJIIJ3.LIZIZ);
                    }
                    boolean zLJFF = Intrinsics.LJFF(numValueOf, numValueOf3);
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    C0U7T c0u7t2 = new C0U7T(effectId, fLIZIZ, name, liveEffect3, zLJFF, zBooleanValue);
                    LIZLLL.put(Long.valueOf(liveEffect3.getEffectId()), c0u7t2);
                    LIZJ.put(Long.valueOf(liveEffect3.getEffectId()), c0u7t2);
                }
            } else if (fLIZIZ == 0.0f) {
                LJFF.put(Long.valueOf(liveEffect3.getEffectId()), c0u7t);
            } else if (fLIZIZ == c0u7t.LIZIZ) {
                LIZJ.put(Long.valueOf(liveEffect3.getEffectId()), c0u7t);
            } else {
                Map<String, Boolean> map2 = LJI;
                Boolean bool2 = (Boolean) ((LinkedHashMap) map2).get(liveEffect3.getResourceId());
                if (bool2 == null && map2.containsKey(liveEffect3.LLILII())) {
                    bool2 = (Boolean) ((LinkedHashMap) map2).get(liveEffect3.LLILII());
                }
                long effectId2 = liveEffect3.getEffectId();
                String name2 = liveEffect3.getName();
                LiveEffect.ComposerConfig composerConfigLJIIJ4 = C0U7C.LJIIJ(liveEffect3);
                if (composerConfigLJIIJ4 != null) {
                    numValueOf2 = Integer.valueOf(composerConfigLJIIJ4.LIZ);
                } else {
                    numValueOf2 = null;
                }
                LiveEffect.ComposerConfig composerConfigLJIIJ5 = C0U7C.LJIIJ(liveEffect3);
                if (composerConfigLJIIJ5 != null) {
                    numValueOf3 = Integer.valueOf(composerConfigLJIIJ5.LIZIZ);
                }
                boolean zLJFF2 = Intrinsics.LJFF(numValueOf2, numValueOf3);
                if (bool2 != null) {
                    zBooleanValue2 = bool2.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
                C0U7T c0u7t3 = new C0U7T(effectId2, fLIZIZ, name2, liveEffect3, zLJFF2, zBooleanValue2);
                LJ.put(Long.valueOf(liveEffect3.getEffectId()), c0u7t3);
                LIZJ.put(Long.valueOf(liveEffect3.getEffectId()), c0u7t3);
            }
        }
        Map<Long, C0U7T> map3 = LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : ((LinkedHashMap) map3).entrySet()) {
            if (!LIZJ.containsKey(entry2.getKey())) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            LJFF.put((Long) entry3.getKey(), new C0U7T((C0U7T) entry3.getValue()));
        }
    }

    @Override // X.InterfaceC769210UFj
    public final void LJ(DataChannel dataChannel) {
        String str;
        for (String str2 : ((LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76()).get(LiveSmallItemBeautyViewModel.class)).LLILZ.LJFF()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_beauty_use");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(str2, "tab_name");
            if (LJIIJ.contains(str2)) {
                str = "use";
            } else {
                str = "unused";
            }
            c474500IjALIZ.LJJII(str, "use_status");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceC769210UFj
    public final void LJI(DataChannel dataChannel) {
        String str;
        long j;
        if (C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJ.LIZIZ()) || C500260Jjc.LJJIJLIJ()) {
            return;
        }
        long j2 = 2;
        C768300UBw.LIZIZ(2L);
        boolean z = false;
        for (Map.Entry entry : ((LinkedHashMap) C2097608Jq.LJIIL(LJ, LJFF)).entrySet()) {
            Set<Long> set = LJIIJJI;
            boolean zContains = set.contains(entry.getKey());
            set.remove(entry.getKey());
            LiveEffect liveEffect = ((C0U7T) entry.getValue()).LIZLLL;
            C0U7T c0u7t = (C0U7T) ((LinkedHashMap) LIZIZ).get(entry.getKey());
            if (c0u7t != null && c0u7t.LIZIZ != 0.0f) {
                long j3 = ((C0U7T) entry.getValue()).LJI - c0u7t.LJI;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_beauty_use_time");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LJJIFFI(Float.valueOf(c0u7t.LIZIZ), "beauty_value");
                c474500IjALIZ.LJJII(Long.valueOf(j3), "use_time");
                c474500IjALIZ.LJJII(Integer.valueOf(zContains ? 1 : 0), "is_live_take_default");
                c474500IjALIZ.LJJII(Integer.valueOf(c0u7t.LJ ? 1 : 0), "is_default_value");
                if (LJIIIIZZ()) {
                    str = "makeup";
                } else {
                    str = "normal";
                }
                c474500IjALIZ.LJJII(str, "beauty_status");
                String strLIZ = InterfaceC766480U4w.LJJJJZI.LIZ();
                if (strLIZ == null) {
                    strLIZ = EnumC770010UIl.DEFAULT.value;
                }
                c474500IjALIZ.LJJII(strLIZ, "detect_type");
                c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(c0u7t.LJFF)) ? 1 : 0), "is_red_dot");
                LJIIIZ(c474500IjALIZ, liveEffect);
                c474500IjALIZ.LIZ();
                long effectId = liveEffect.getEffectId();
                String name = liveEffect.getName();
                String str2 = "";
                if (name == null) {
                    name = "";
                }
                String resourceId = liveEffect.getResourceId();
                long j4 = c0u7t.LJI;
                long j5 = LSPassThroughRecordSizeConfig.DEFAULT;
                Long lValueOf = Long.valueOf(j4 / j5);
                Long lValueOf2 = Long.valueOf(C158B.LIZ() / j5);
                String strLJLL = liveEffect.LJLL();
                if (strLJLL != null) {
                    str2 = strLJLL;
                }
                long j6 = 1;
                if (c0u7t.LJ) {
                    j = 1;
                } else {
                    j = 2;
                }
                Long lValueOf3 = Long.valueOf(j);
                if (zContains) {
                    j6 = 2;
                }
                j2 = 2;
                C768300UBw.LJII(2L, new Modification(effectId, name, resourceId, 2L, lValueOf, lValueOf2, 0L, str2, lValueOf3, Long.valueOf(j6), Float.valueOf(c0u7t.LIZIZ), null, LJIIL, null, null, 0L, 0));
                z = true;
            }
        }
        if (z && C500260Jjc.LJJIFFI(Boolean.valueOf(LJIIIZ))) {
            C768300UBw.LJIILIIL(j2);
        }
    }

    public static void LJIIIZ(C474500IjA c474500IjA, LiveEffect liveEffect) {
        String name;
        Integer position;
        Integer numValueOf;
        c474500IjA.LJJII(liveEffect.LJLL(), "tab_name");
        c474500IjA.LJJII(Long.valueOf(liveEffect.getEffectId()), "effect_id");
        c474500IjA.LJJII(liveEffect.getResourceId(), "resource_id");
        String strLJJIJLIJ = liveEffect.LJJIJLIJ();
        if (strLJJIJLIJ == null) {
            strLJJIJLIJ = liveEffect.getName();
        }
        c474500IjA.LJJII(strLJJIJLIJ, "beauty_type_name");
        if (liveEffect.LLLIIII()) {
            name = liveEffect.getName();
        } else {
            name = "";
        }
        c474500IjA.LJJII(name, "beauty_type_name_tier2");
        if (liveEffect.LLLIIII()) {
            position = liveEffect.LJJIJL();
        } else {
            position = liveEffect.getPosition();
        }
        if (position != null) {
            numValueOf = Integer.valueOf(position.intValue() + 1);
        } else {
            numValueOf = null;
        }
        c474500IjA.LJJII(numValueOf, "impr_position");
    }

    @Override // X.InterfaceC769210UFj
    public final void LIZJ(DataChannel dataChannel, boolean z) {
        Integer numValueOf;
        Integer numValueOf2;
        String str;
        Integer numValueOf3;
        Integer numValueOf4;
        long j;
        if (C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJ.LIZIZ())) {
            return;
        }
        if (C500260Jjc.LJJ()) {
            C768300UBw.LIZIZ(2L);
        }
        LJIIL = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
        boolean z2 = false;
        for (Map.Entry entry : ((LinkedHashMap) C2097608Jq.LJIIL(LIZLLL, LJ)).entrySet()) {
            LiveEffect liveEffect = ((C0U7T) entry.getValue()).LIZLLL;
            if (z) {
                LJIIJJI.add((Long) entry.getKey());
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_beauty_select");
            c474500IjALIZ.LJIJJLI(dataChannel);
            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ != null) {
                numValueOf = Integer.valueOf(composerConfigLJIIJ.LIZ);
            } else {
                numValueOf = null;
            }
            LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ2 != null) {
                numValueOf2 = Integer.valueOf(composerConfigLJIIJ2.LIZIZ);
            } else {
                numValueOf2 = null;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(numValueOf, numValueOf2) ? 1 : 0), "is_default_value");
            c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_live_take_default");
            c474500IjALIZ.LJJIFFI(Float.valueOf(((C0U7T) entry.getValue()).LIZIZ), "beauty_value");
            if (LJIIIIZZ()) {
                str = "makeup";
            } else {
                str = "normal";
            }
            c474500IjALIZ.LJJII(str, "beauty_status");
            String strLIZ = InterfaceC766480U4w.LJJJJZI.LIZ();
            if (strLIZ == null) {
                strLIZ = EnumC770010UIl.DEFAULT.value;
            }
            c474500IjALIZ.LJJII(strLIZ, "detect_type");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(((C0U7T) entry.getValue()).LJFF)) ? 1 : 0), "is_red_dot");
            LJIIIZ(c474500IjALIZ, liveEffect);
            c474500IjALIZ.LIZ();
            if (C500260Jjc.LJJ()) {
                long effectId = liveEffect.getEffectId();
                String name = liveEffect.getName();
                String resourceId = liveEffect.getResourceId();
                Long lValueOf = Long.valueOf(C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                String strLJLL = liveEffect.LJLL();
                if (strLJLL == null) {
                    strLJLL = "";
                }
                LiveEffect.ComposerConfig composerConfigLJIIJ3 = C0U7C.LJIIJ(liveEffect);
                if (composerConfigLJIIJ3 != null) {
                    numValueOf3 = Integer.valueOf(composerConfigLJIIJ3.LIZ);
                } else {
                    numValueOf3 = null;
                }
                LiveEffect.ComposerConfig composerConfigLJIIJ4 = C0U7C.LJIIJ(liveEffect);
                if (composerConfigLJIIJ4 != null) {
                    numValueOf4 = Integer.valueOf(composerConfigLJIIJ4.LIZIZ);
                } else {
                    numValueOf4 = null;
                }
                long j2 = 1;
                if (Intrinsics.LJFF(numValueOf3, numValueOf4)) {
                    j = 1;
                } else {
                    j = 2;
                }
                Long lValueOf2 = Long.valueOf(j);
                if (z) {
                    j2 = 2;
                }
                C768300UBw.LJII(2L, new Modification(effectId, name, resourceId, 2L, lValueOf, null, 0L, strLJLL, lValueOf2, Long.valueOf(j2), Float.valueOf(((C0U7T) entry.getValue()).LIZIZ), null, LJIIL, null, null, 0L, 0));
                z2 = true;
            }
        }
        if (C500260Jjc.LJJ() && z2 && C500260Jjc.LJJIFFI(Boolean.valueOf(LJIIIZ))) {
            C768300UBw.LJIILIIL(2L);
        }
    }

    @Override // X.InterfaceC769210UFj
    public final void LIZLLL(DataChannel dataChannel, boolean z) {
        int i;
        if (C500260Jjc.LJJIJLIJ() || C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJ.LIZIZ())) {
            return;
        }
        Iterator it2 = ((LinkedHashMap) LJFF).entrySet().iterator();
        while (it2.hasNext()) {
            C0U7S c0u7sRemove = LJII.remove(((Map.Entry) it2.next()).getKey());
            if (c0u7sRemove != null) {
                LJII().removeCallbacks(c0u7sRemove);
            }
        }
        for (Map.Entry entry : ((LinkedHashMap) C2097608Jq.LJIIL(LIZLLL, LJ)).entrySet()) {
            Map<Long, C0U7S> map = LJII;
            C0U7S c0u7sRemove2 = map.remove(entry.getKey());
            if (c0u7sRemove2 != null) {
                LJII().removeCallbacks(c0u7sRemove2);
            }
            if (((C0U7T) entry.getValue()).LIZIZ != 0.0f) {
                C0U7S c0u7s = new C0U7S(dataChannel, z, ((C0U7T) entry.getValue()).LIZLLL, ((C0U7T) entry.getValue()).LIZIZ, LJIIIIZZ(), ((C0U7T) entry.getValue()).LJFF);
                map.put((Long) entry.getKey(), c0u7s);
                C786410Ut5.LJLIIL(30000L, LJII(), c0u7s);
            }
        }
        if (C0UF5.LJIIJ != null) {
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(dataChannel, 229);
            LJIIIIZZ = aRunnableS112S0100000_12;
            C786410Ut5.LJLIIL(30000L, LJII(), aRunnableS112S0100000_12);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry2 : ((LinkedHashMap) LJII).entrySet()) {
            arrayList.add(String.valueOf(((C0U7S) entry2.getValue()).LLILLL.getEffectId()));
            arrayList2.add(((C0U7S) entry2.getValue()).LLILLL.getResourceId());
            LiveEffect liveEffect = ((C0U7S) entry2.getValue()).LLILLL;
            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(((C0U7S) entry2.getValue()).LLILLL);
            if (composerConfigLJIIJ != null) {
                i = composerConfigLJIIJ.LIZ;
            } else {
                i = 0;
            }
            arrayList3.add(Float.valueOf(C0UG7.LIZLLL(C0U7C.LJIIJ(liveEffect), i)));
        }
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LJ(arrayList);
        C1276840jKc.LJFF(arrayList2);
        C1276840jKc.LIZLLL(arrayList3);
    }

    @Override // X.InterfaceC769210UFj
    public final void LJFF(String str, String str2) {
        JSONArray jSONArray = LJIILL.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", str);
        jSONObject.put("extra", str2);
        jSONObject.put("timestamp", String.valueOf(System.currentTimeMillis()));
        jSONArray.put(jSONObject);
    }

    public static void LJIIJJI(DataChannel dataChannel, TreeMap treeMap, List list) {
        String str;
        for (Map.Entry entry : treeMap.entrySet()) {
            ArrayList arrayList = (ArrayList) list;
            if (((Number) entry.getKey()).intValue() < arrayList.size() && ((Number) entry.getKey()).intValue() >= 0) {
                LiveEffect liveEffect = (LiveEffect) ListProtector.get(arrayList, ((Number) entry.getKey()).intValue());
                if (C766620U5k.LIZIZ(liveEffect, dataChannel)) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_beauty_red_dot");
                    c474500IjALIZ.LJIJJLI(dataChannel);
                    c474500IjALIZ.LJJII("", "beauty_type");
                    LJIIIZ(c474500IjALIZ, liveEffect);
                    if (C500260Jjc.LJJIJLIJ()) {
                        str = "live_take_page";
                    } else {
                        str = "live_take_detail";
                    }
                    c474500IjALIZ.LJJII(str, "event_page");
                    c474500IjALIZ.LIZ();
                }
            }
        }
    }

    public static void LJIIJ(int i, DataChannel dataChannel, String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_optimize_light");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str3, "task_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "task_round");
        c474500IjALIZ.LJJII(str2, "content");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIL(DataChannel dataChannel, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, long j, String str8, String str9, String str10, String str11) {
        String str12 = str11;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_ai_optimize_end");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "color_correction_setting");
        c474500IjALIZ.LJJII(str2, "beauty_setting");
        c474500IjALIZ.LJJII(str6, "task_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "task_round");
        c474500IjALIZ.LJJII(str7, "task_status");
        c474500IjALIZ.LJJII(Long.valueOf(C13LZ.LJFF(System.currentTimeMillis() - j, 1L, 30000L)), "task_duration");
        c474500IjALIZ.LJJII(str10, "snapshot_url");
        c474500IjALIZ.LJJIIZ(str3, "ai_color_correction_setting", new AwS97S1000000_12(str3, 3));
        c474500IjALIZ.LJJIIZ(str4, "ai_beauty_setting", new AwS97S1000000_12(str4, 4));
        c474500IjALIZ.LJJIIZ(str5, "ai_suggestion", new AwS97S1000000_12(str5, 5));
        c474500IjALIZ.LJJIIZ(str8, "ai_result_key", new AwS97S1000000_12(str8, 6));
        c474500IjALIZ.LJJIIZ(str9, "ai_snapshot_url", new AwS97S1000000_12(str9, 7));
        AwS97S1000000_12 awS97S1000000_12 = new AwS97S1000000_12(str12, 8);
        if (str12 == null) {
            str12 = "";
        }
        c474500IjALIZ.LJJIIZ(str12, "extra_message", awS97S1000000_12);
        c474500IjALIZ.LIZ();
    }
}
