package X;

import android.os.Handler;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UD7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UD7 implements C0UAA {
    public static final C0UD7 LIZ = new C0UD7();
    public static final Map<Long, C0UD8> LIZIZ = new LinkedHashMap();
    public static final Map<Long, Integer> LIZJ = new LinkedHashMap();
    public static final Map<Long, C0UD8> LIZLLL = new LinkedHashMap();
    public static final Map<Long, C0UD8> LJ = new LinkedHashMap();
    public static final Map<Long, C0UD8> LJFF = new LinkedHashMap();
    public static final Map<Long, C0UD8> LJI = new LinkedHashMap();
    public static final Map<Long, C0UD8> LJII = new LinkedHashMap();
    public static final Map<Long, C0UD6> LJIIIIZZ = new LinkedHashMap();
    public static final Set<String> LJIIIZ = new LinkedHashSet();
    public static InterfaceC769000UEo LJIIJ = C0UA1.LIZ();
    public static Map<String, String> LJIIJJI;
    public static boolean LJIIL;

    @Override // X.InterfaceC769210UFj
    public final void LJ(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC769210UFj
    public final void LJFF(String str, String str2) {
    }

    @Override // X.InterfaceC769210UFj
    public final void LIZ() {
        Map<Long, C0UD8> map = LIZLLL;
        C760080Tri.LJII = !map.isEmpty();
        Map<Long, C0UD8> map2 = LIZIZ;
        ((LinkedHashMap) map2).clear();
        map2.putAll(map);
        ((LinkedHashMap) LJ).clear();
        ((LinkedHashMap) LJFF).clear();
        ((LinkedHashMap) LJI).clear();
        ((LinkedHashMap) map).clear();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("previousBeautyMap = ");
        sbLIZ.append(map2);
        LJIIIIZZ("finishLog", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC769210UFj
    public final void release() {
        ((LinkedHashMap) LIZIZ).clear();
        ((LinkedHashMap) LIZLLL).clear();
        ((LinkedHashMap) LJ).clear();
        ((LinkedHashMap) LJFF).clear();
        ((LinkedHashMap) LJI).clear();
        Iterator it2 = ((LinkedHashMap) LJIIIIZZ).entrySet().iterator();
        while (it2.hasNext()) {
            C473410IhP.LIZ().removeCallbacks((Runnable) ((Map.Entry) it2.next()).getValue());
        }
        ((LinkedHashMap) LJIIIIZZ).clear();
        LJIIIZ.clear();
    }

    public static final void LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effectuse map ");
        Map<Long, C0UD6> map = LJIIIIZZ;
        sbLIZ.append(map);
        LJIIIIZZ("clearMultiGuestEffectiveUseTimer", C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
        while (it2.hasNext()) {
            C473410IhP.LIZ().removeCallbacks((Runnable) ((Map.Entry) it2.next()).getValue());
        }
        ((LinkedHashMap) LJIIIIZZ).clear();
    }

    public static final void LJIIIZ(DataChannel dataChannel) {
        Handler handlerLIZ = C473410IhP.LIZ();
        Iterator it2 = ((LinkedHashMap) LJIIIIZZ).entrySet().iterator();
        while (it2.hasNext()) {
            handlerLIZ.removeCallbacks((Runnable) ((Map.Entry) it2.next()).getValue());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ);
        sbLIZ.append(' ');
        sbLIZ.append(LJFF);
        LJIIIIZZ("reportAllBeautyEffectiveUse", C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry : ((LinkedHashMap) LIZLLL).entrySet()) {
            Map<Long, C0UD6> map = LJIIIIZZ;
            C0UD6 c0ud6Remove = map.remove(entry.getKey());
            if (c0ud6Remove != null) {
                handlerLIZ.removeCallbacks(c0ud6Remove);
            }
            int iIntValue = 1;
            if (((C0UD8) entry.getValue()).LIZIZ != 0.0f) {
                LiveEffect liveEffect = ((C0UD8) entry.getValue()).LIZLLL;
                float f = ((C0UD8) entry.getValue()).LIZIZ;
                Integer num = (Integer) ((LinkedHashMap) LIZJ).get(Long.valueOf(((C0UD8) entry.getValue()).LIZ));
                if (num != null) {
                    iIntValue = num.intValue();
                }
                C0UD6 c0ud6 = new C0UD6(dataChannel, liveEffect, f, iIntValue);
                map.put((Long) entry.getKey(), c0ud6);
                C786410Ut5.LJLIIL(30000L, handlerLIZ, c0ud6);
            }
        }
    }

    public static final void LJIIJJI(DataChannel dataChannel) {
        if (C500260Jjc.LJJIFFI(InterfaceC934710aQn.Jb.LIZIZ())) {
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) LJI).entrySet()) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_beauty_close");
            c474500IjALIZ.LJIJJLI(dataChannel);
            C767250U7v.LJIIJ(c474500IjALIZ, ((C0UD8) entry.getValue()).LIZLLL);
            c474500IjALIZ.LJJIIZI(LJIIJJI);
            c474500IjALIZ.LIZ();
        }
    }

    @Override // X.InterfaceC769210UFj
    public final void LIZIZ(boolean z) {
        int i;
        Integer numValueOf;
        Integer numValueOf2;
        if (z) {
            for (Map.Entry entry : ((LinkedHashMap) LIZIZ).entrySet()) {
                LJI.put((Long) entry.getKey(), new C0UD8((C0UD8) entry.getValue()));
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("previewBeautyMap = ");
        sbLIZ.append(LIZIZ);
        LJIIIIZZ("prepareLogData", C2188811AlT.LIZIZ(sbLIZ));
        List<LiveEffect> listQr = LJIIJ.qr("liveguestbeauty");
        ArrayList<LiveEffect> arrayList = new ArrayList();
        for (LiveEffect liveEffect : listQr) {
            if (C500260Jjc.LJJIIZ(liveEffect.getName())) {
                arrayList.add(liveEffect);
            }
        }
        for (LiveEffect liveEffect2 : arrayList) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("current sticker ");
            sbLIZ2.append(liveEffect2);
            LJIIIIZZ("prepareLogData", C2188811AlT.LIZIZ(sbLIZ2));
            C0UD8 c0ud8 = (C0UD8) ((LinkedHashMap) LIZIZ).get(Long.valueOf(liveEffect2.getEffectId()));
            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect2);
            if (composerConfigLJIIJ != null) {
                i = composerConfigLJIIJ.LIZ;
            } else {
                i = 0;
            }
            float fLIZIZ = C814420VxA.LIZIZ(C0UG7.LIZLLL(C0U7C.LJIIJ(liveEffect2), i) * 100.0f) / 100.0f;
            Integer numValueOf3 = null;
            if (c0ud8 == null) {
                if (fLIZIZ == 0.0f) {
                    LJIIIIZZ("prepareLogData", "preview beauty == null and new effect.");
                } else {
                    long effectId = liveEffect2.getEffectId();
                    String name = liveEffect2.getName();
                    LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect2);
                    if (composerConfigLJIIJ2 != null) {
                        numValueOf = Integer.valueOf(composerConfigLJIIJ2.LIZ);
                    } else {
                        numValueOf = null;
                    }
                    LiveEffect.ComposerConfig composerConfigLJIIJ3 = C0U7C.LJIIJ(liveEffect2);
                    if (composerConfigLJIIJ3 != null) {
                        numValueOf3 = Integer.valueOf(composerConfigLJIIJ3.LIZIZ);
                    }
                    C0UD8 c0ud82 = new C0UD8(effectId, fLIZIZ, name, liveEffect2, Intrinsics.LJFF(numValueOf, numValueOf3));
                    LJ.put(Long.valueOf(liveEffect2.getEffectId()), c0ud82);
                    LIZLLL.put(Long.valueOf(liveEffect2.getEffectId()), c0ud82);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("find new added ");
                    sbLIZ3.append(liveEffect2);
                    LJIIIIZZ("prepareLogData", C2188811AlT.LIZIZ(sbLIZ3));
                }
            } else if (fLIZIZ == 0.0f) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("find effect to be deleted ");
                sbLIZ4.append(liveEffect2);
                LJIIIIZZ("prepareLogData", C2188811AlT.LIZIZ(sbLIZ4));
                LJI.put(Long.valueOf(liveEffect2.getEffectId()), c0ud8);
            } else if (fLIZIZ == c0ud8.LIZIZ) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("find a existing effect ");
                sbLIZ5.append(liveEffect2);
                LJIIIIZZ("prepareLogData", C2188811AlT.LIZIZ(sbLIZ5));
                if (LJII.containsKey(Long.valueOf(c0ud8.LIZLLL.getEffectId()))) {
                    LIZLLL.put(Long.valueOf(liveEffect2.getEffectId()), new C0UD8(c0ud8.LIZ, c0ud8.LIZIZ, c0ud8.LIZJ, c0ud8.LIZLLL, c0ud8.LJ, System.currentTimeMillis()));
                } else {
                    LIZLLL.put(Long.valueOf(liveEffect2.getEffectId()), c0ud8);
                }
            } else {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("find a changed effect ");
                sbLIZ6.append(liveEffect2);
                LJIIIIZZ("prepareLogData", C2188811AlT.LIZIZ(sbLIZ6));
                long effectId2 = liveEffect2.getEffectId();
                String name2 = liveEffect2.getName();
                LiveEffect.ComposerConfig composerConfigLJIIJ4 = C0U7C.LJIIJ(liveEffect2);
                if (composerConfigLJIIJ4 != null) {
                    numValueOf2 = Integer.valueOf(composerConfigLJIIJ4.LIZ);
                } else {
                    numValueOf2 = null;
                }
                LiveEffect.ComposerConfig composerConfigLJIIJ5 = C0U7C.LJIIJ(liveEffect2);
                if (composerConfigLJIIJ5 != null) {
                    numValueOf3 = Integer.valueOf(composerConfigLJIIJ5.LIZIZ);
                }
                C0UD8 c0ud83 = new C0UD8(effectId2, fLIZIZ, name2, liveEffect2, Intrinsics.LJFF(numValueOf2, numValueOf3));
                LJFF.put(Long.valueOf(liveEffect2.getEffectId()), c0ud83);
                LIZLLL.put(Long.valueOf(liveEffect2.getEffectId()), c0ud83);
            }
        }
        Map<Long, C0UD8> map = LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : ((LinkedHashMap) map).entrySet()) {
            if (!LIZLLL.containsKey(entry2.getKey())) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            LJI.put((Long) entry3.getKey(), new C0UD8((C0UD8) entry3.getValue()));
        }
        ((LinkedHashMap) LJII).clear();
        LJIIIIZZ("prepareLogData", "deleteMap = " + LJI);
    }

    @Override // X.InterfaceC769210UFj
    public final void LJI(DataChannel dataChannel) {
        if (LJIIL) {
            LJIIJ(dataChannel, C2097608Jq.LJIIL(LJFF, LJI));
        }
    }

    public static void LJIIIIZZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("method#");
        sbLIZ.append(str);
        sbLIZ.append(" - ");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("LiveMultiGuestBeautyLogManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIIJ(DataChannel dataChannel, Map map) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            C0UD8 c0ud8 = (C0UD8) entry.getValue();
            LiveEffect liveEffect = c0ud8.LIZLLL;
            C0UD8 c0ud82 = (C0UD8) ((LinkedHashMap) LIZIZ).get(entry.getKey());
            if (c0ud82 != null && c0ud82.LIZIZ != 0.0f) {
                long jCurrentTimeMillis = System.currentTimeMillis() - c0ud82.LJFF;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_beauty_use_time");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LJJIFFI(Float.valueOf(c0ud82.LIZIZ), "beauty_value");
                c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "use_time");
                c474500IjALIZ.LJJII(((LinkedHashMap) LIZJ).get(Long.valueOf(c0ud8.LIZ)), "event_scene");
                c474500IjALIZ.LJJII(Integer.valueOf(c0ud82.LJ ? 1 : 0), "is_default_value");
                C767250U7v.LJIIJ(c474500IjALIZ, liveEffect);
                c474500IjALIZ.LJJIIZI(LJIIJJI);
                AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(97);
                InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
                if (interfaceC474510IjB != null) {
                    interfaceC474510IjB.LJIIJJI(aFwS245S0000000_12);
                }
                c474500IjALIZ.LIZ();
            }
        }
    }

    @Override // X.InterfaceC769210UFj
    public final void LIZJ(DataChannel dataChannel, boolean z) {
        Integer numValueOf;
        if (LJIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            Map<Long, C0UD8> map = LJ;
            sbLIZ.append(map);
            sbLIZ.append(' ');
            Map<Long, C0UD8> map2 = LJFF;
            sbLIZ.append(map2);
            LJIIIIZZ("reportBeautySelected", C2188811AlT.LIZIZ(sbLIZ));
            for (Map.Entry entry : ((LinkedHashMap) C2097608Jq.LJIIL(map, map2)).entrySet()) {
                LiveEffect liveEffect = ((C0UD8) entry.getValue()).LIZLLL;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_beauty_select");
                c474500IjALIZ.LJIJJLI(dataChannel);
                LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
                Integer numValueOf2 = null;
                if (composerConfigLJIIJ != null) {
                    numValueOf = Integer.valueOf(composerConfigLJIIJ.LIZ);
                } else {
                    numValueOf = null;
                }
                LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect);
                if (composerConfigLJIIJ2 != null) {
                    numValueOf2 = Integer.valueOf(composerConfigLJIIJ2.LIZIZ);
                }
                c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(numValueOf, numValueOf2) ? 1 : 0), "is_default_value");
                c474500IjALIZ.LJJIFFI(Float.valueOf(((C0UD8) entry.getValue()).LIZIZ), "beauty_value");
                c474500IjALIZ.LJJIIZI(LJIIJJI);
                C767250U7v.LJIIJ(c474500IjALIZ, liveEffect);
                c474500IjALIZ.LIZ();
            }
        }
    }

    @Override // X.InterfaceC769210UFj
    public final void LIZLLL(DataChannel dataChannel, boolean z) {
        Handler handlerLIZ = C473410IhP.LIZ();
        Iterator it2 = ((LinkedHashMap) LJI).entrySet().iterator();
        while (it2.hasNext()) {
            C0UD6 c0ud6Remove = LJIIIIZZ.remove(((Map.Entry) it2.next()).getKey());
            if (c0ud6Remove != null) {
                handlerLIZ.removeCallbacks(c0ud6Remove);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Map<Long, C0UD8> map = LJ;
        sbLIZ.append(map);
        sbLIZ.append(' ');
        Map<Long, C0UD8> map2 = LJFF;
        sbLIZ.append(map2);
        LJIIIIZZ("reportBeautyEffectiveUse", C2188811AlT.LIZIZ(sbLIZ));
        for (Map.Entry entry : ((LinkedHashMap) C2097608Jq.LJIIL(map, map2)).entrySet()) {
            Map<Long, C0UD6> map3 = LJIIIIZZ;
            C0UD6 c0ud6Remove2 = map3.remove(entry.getKey());
            if (c0ud6Remove2 != null) {
                handlerLIZ.removeCallbacks(c0ud6Remove2);
            }
            int iIntValue = 1;
            if (((C0UD8) entry.getValue()).LIZIZ != 0.0f) {
                LiveEffect liveEffect = ((C0UD8) entry.getValue()).LIZLLL;
                float f = ((C0UD8) entry.getValue()).LIZIZ;
                Integer num = (Integer) ((LinkedHashMap) LIZJ).get(Long.valueOf(((C0UD8) entry.getValue()).LIZ));
                if (num != null) {
                    iIntValue = num.intValue();
                }
                C0UD6 c0ud6 = new C0UD6(dataChannel, liveEffect, f, iIntValue);
                map3.put((Long) entry.getKey(), c0ud6);
                C786410Ut5.LJLIIL(30000L, handlerLIZ, c0ud6);
            }
        }
    }

    public static void LJIIL(LiveEffect liveEffect, Map map, DataChannel dataChannel) {
        LiveEffect.ComposerConfig composerConfigLJIIJ;
        int i;
        Integer numValueOf;
        int i2;
        if (liveEffect != null && (composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect)) != null && composerConfigLJIIJ.LIZ != 0) {
            if (liveEffect != null) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_beauty_select");
                c474500IjALIZ.LJIJJLI(dataChannel);
                LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect);
                Integer numValueOf2 = null;
                if (composerConfigLJIIJ2 != null) {
                    numValueOf = Integer.valueOf(composerConfigLJIIJ2.LIZ);
                } else {
                    numValueOf = null;
                }
                LiveEffect.ComposerConfig composerConfigLJIIJ3 = C0U7C.LJIIJ(liveEffect);
                if (composerConfigLJIIJ3 != null) {
                    numValueOf2 = Integer.valueOf(composerConfigLJIIJ3.LIZIZ);
                }
                c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(numValueOf, numValueOf2) ? 1 : 0), "is_default_value");
                LiveEffect.ComposerConfig composerConfigLJIIJ4 = C0U7C.LJIIJ(liveEffect);
                if (composerConfigLJIIJ4 != null) {
                    i2 = composerConfigLJIIJ4.LIZ;
                } else {
                    i2 = 0;
                }
                c474500IjALIZ.LJJII(String.valueOf(C814420VxA.LIZIZ(C0UG7.LIZLLL(C0U7C.LJIIJ(liveEffect), i2) * 100.0f) / 100.0f), "beauty_value");
                c474500IjALIZ.LJJIIZI(map);
                C767250U7v.LJIIJ(c474500IjALIZ, liveEffect);
                c474500IjALIZ.LIZ();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry : ((LinkedHashMap) LJIIIIZZ).entrySet()) {
                arrayList.add(String.valueOf(((C0UD6) entry.getValue()).LLILLJJLI.getEffectId()));
                arrayList2.add(((C0UD6) entry.getValue()).LLILLJJLI.getResourceId());
                LiveEffect liveEffect2 = ((C0UD6) entry.getValue()).LLILLJJLI;
                LiveEffect.ComposerConfig composerConfigLJIIJ5 = C0U7C.LJIIJ(((C0UD6) entry.getValue()).LLILLJJLI);
                if (composerConfigLJIIJ5 != null) {
                    i = composerConfigLJIIJ5.LIZ;
                } else {
                    i = 0;
                }
                arrayList3.add(Float.valueOf(C0UG7.LIZLLL(C0U7C.LJIIJ(liveEffect2), i)));
            }
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LJ(arrayList);
            C1276840jKc.LJFF(arrayList2);
            C1276840jKc.LIZLLL(arrayList3);
        }
    }

    public static void LJIILIIL(DataChannel dataChannel, Map map, int i) {
        Integer numValueOf;
        LJIIIIZZ("reportBeautyUseInternal", String.valueOf(map));
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            LiveEffect liveEffect = ((C0UD8) entry.getValue()).LIZLLL;
            LIZJ.put(Long.valueOf(((C0UD8) entry.getValue()).LIZ), Integer.valueOf(i));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_beauty_use");
            c474500IjALIZ.LJIJJLI(dataChannel);
            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
            Integer numValueOf2 = null;
            if (composerConfigLJIIJ != null) {
                numValueOf = Integer.valueOf(composerConfigLJIIJ.LIZ);
            } else {
                numValueOf = null;
            }
            LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ2 != null) {
                numValueOf2 = Integer.valueOf(composerConfigLJIIJ2.LIZIZ);
            }
            c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(numValueOf, numValueOf2) ? 1 : 0), "is_default_value");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "event_scene");
            c474500IjALIZ.LJJIFFI(Float.valueOf(((C0UD8) entry.getValue()).LIZIZ), "beauty_value");
            c474500IjALIZ.LJJIIZI(LJIIJJI);
            C767250U7v.LJIIJ(c474500IjALIZ, liveEffect);
            c474500IjALIZ.LIZ();
        }
    }

    public static final void LJIILJJIL(DataChannel dataChannel, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_reset_beauty_popup_window_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "tab_name");
        c474500IjALIZ.LJJII(str2, "click_type");
        c474500IjALIZ.LJJIIZI(LJIIJJI);
        c474500IjALIZ.LIZ();
    }
}
