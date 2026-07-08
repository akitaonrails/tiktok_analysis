package X;

import android.os.Handler;
import com.bytedance.android.live.liveinteract.api.MultiGuestUsedEffectChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS97S1000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UC5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UC5 implements C0UEY {
    public static LiveEffect LIZJ;
    public static LiveEffect LJ;
    public static C0UCE LJFF;
    public static C0UCE LJI;
    public static final C0UC5 LIZ = new C0UC5();
    public static final C01GW LIZIZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(218));
    public static final Map<Long, Long> LIZLLL = new LinkedHashMap();

    @Override // X.C0UEY
    public final void LIZLLL() {
        LJ = null;
    }

    @Override // X.C0UEY
    public final void LJIIIIZZ() {
        LIZJ = null;
    }

    @Override // X.C0UEY
    public final void release() {
        C474640IjO.LIZ = null;
        Handler handlerLIZ = C473410IhP.LIZ();
        C01GW c01gw = LIZIZ;
        handlerLIZ.removeCallbacks((C0UC7) c01gw.getValue());
        LIZJ = null;
        C0UC7 c0uc7 = (C0UC7) c01gw.getValue();
        c0uc7.LL = null;
        c0uc7.LLILLJJLI = null;
        c0uc7.LLILZIL = null;
        ((LinkedHashMap) LIZLLL).clear();
        LJFF = null;
        LJI = null;
    }

    @Override // X.C0UEY
    public final boolean LJII() {
        C0UCE c0uce = LJI;
        return c0uce != null && c0uce.LIZ == C767790U9x.LJFF + 1;
    }

    @Override // X.C0UEY
    public final void LIZIZ() {
        C473410IhP.LIZ().removeCallbacks((C0UC7) LIZIZ.getValue());
    }

    @Override // X.C0UEY
    public final void LIZ(LiveEffect liveEffect) {
        C0UCE c0uce;
        String str;
        LJFF = LJI;
        if (C0U7C.LJIILLIIL(liveEffect)) {
            int i = C767790U9x.LJFF + 1;
            C768350UCb c768350UCb = C767790U9x.LIZIZ;
            if (c768350UCb == null || (str = c768350UCb.LIZ) == null) {
                str = "-1";
            }
            c0uce = new C0UCE(i, str, C767790U9x.LJIIIIZZ);
        } else {
            c0uce = null;
        }
        LJI = c0uce;
    }

    @Override // X.C0UEY
    public final void LJFF(DataChannel dataChannel, String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_sticker_close_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "panel_type");
        c474500IjALIZ.LJJI(false);
        AwS97S1000000_12 awS97S1000000_12 = C474640IjO.LJFF;
        if (awS97S1000000_12 == null || (str2 = awS97S1000000_12.s0) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "event_page");
        c474500IjALIZ.LJJIJL();
    }

    @Override // X.C0UEY
    public final void LJIIIZ(DataChannel dataChannel, String str) {
        String str2;
        if (str != null && str.length() != 0) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_sticker_tab_change");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(str, "tab");
            c474500IjALIZ.LJJI(false);
            AwS97S1000000_12 awS97S1000000_12 = C474640IjO.LJFF;
            if (awS97S1000000_12 == null || (str2 = awS97S1000000_12.s0) == null) {
                str2 = "";
            }
            c474500IjALIZ.LJJII(str2, "event_page");
            c474500IjALIZ.LJJIJL();
        }
    }

    @Override // X.C0UEY
    public final void LJIIJ(LiveEffect liveEffect, DataChannel dataChannel) {
        long effectId;
        long jLongValue;
        String str;
        String str2;
        String str3;
        if (liveEffect != null) {
            if (C0U7C.LJIILLIIL(liveEffect)) {
                C0UCE c0uce = LJFF;
                if (c0uce != null && (str3 = c0uce.LIZIZ) != null && str3.length() > 0) {
                    effectId = CastLongProtector.parseLong(str3);
                } else {
                    effectId = 1;
                }
            } else {
                effectId = liveEffect.getEffectId();
            }
            Map<Long, Long> map = LIZLLL;
            if (map.containsKey(Long.valueOf(effectId))) {
                long jLIZ = C158B.LIZ();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_sticker_use_time");
                c474500IjALIZ.LJIJJLI(dataChannel);
                Long lRemove = map.remove(Long.valueOf(effectId));
                if (lRemove != null) {
                    jLongValue = lRemove.longValue();
                } else {
                    jLongValue = jLIZ;
                }
                c474500IjALIZ.LJJII(Long.valueOf((jLIZ - jLongValue) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "use_time");
                if (Intrinsics.LJFF(liveEffect, LJ)) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(str, "is_connection_default");
                LJIIL(c474500IjALIZ, liveEffect, dataChannel);
                c474500IjALIZ.LJJI(false);
                LJIIJJI(c474500IjALIZ, liveEffect, LJFF);
                AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(99);
                InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
                if (interfaceC474510IjB != null) {
                    interfaceC474510IjB.LJIIJJI(aFwS245S0000000_12);
                }
                if (Intrinsics.LJFF(C474640IjO.LIZ, Boolean.TRUE)) {
                    str2 = "multi_guest_countdownforall";
                } else {
                    AwS97S1000000_12 awS97S1000000_12 = C474640IjO.LJFF;
                    if (awS97S1000000_12 == null || (str2 = awS97S1000000_12.s0) == null) {
                        str2 = "";
                    }
                }
                c474500IjALIZ.LJJII(str2, "event_page");
                c474500IjALIZ.LJJIJL();
            }
        }
    }

    public static void LJIIJJI(C474500IjA c474500IjA, LiveEffect liveEffect, C0UCE c0uce) {
        String str;
        Boolean boolValueOf;
        int i;
        boolean z = false;
        if (C0U7C.LJIILLIIL(liveEffect)) {
            c474500IjA.LJJII(1, "is_avatar");
            c474500IjA.LJJII("", "resource_id");
            c474500IjA.LJJII("", "sticker_name");
            String string = null;
            if (c0uce != null) {
                str = c0uce.LIZIZ;
            } else {
                str = null;
            }
            c474500IjA.LJJII(str, "sticker_id");
            c474500IjA.LJJII(liveEffect.getName(), "group_sticker_name");
            c474500IjA.LJJII(liveEffect.getResourceId(), "group_resource_id");
            if (c0uce != null) {
                boolValueOf = Boolean.valueOf(c0uce.LIZJ);
            } else {
                boolValueOf = null;
            }
            c474500IjA.LJJII(String.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0), "is_sub_sticker_default");
            if (c0uce != null) {
                string = Integer.valueOf(c0uce.LIZ).toString();
            }
            c474500IjA.LJJII(string, "sub_impr_position");
            if (c0uce != null) {
                i = c0uce.LIZ;
            } else {
                i = 1;
            }
            if (i <= C767790U9x.LJI) {
                z = true;
            }
            c474500IjA.LJJII(String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_avatar_user_create");
            c474500IjA.LJJII(Integer.valueOf(C767790U9x.LJI), "user_avatar_count");
            c474500IjA.LJJII(Integer.valueOf(C767790U9x.LJII), "template_avatar_count");
            return;
        }
        c474500IjA.LJJII(0, "is_avatar");
    }

    public static void LJIIL(C474500IjA c474500IjA, LiveEffect liveEffect, DataChannel dataChannel) {
        Integer numValueOf;
        List list;
        Integer position = liveEffect.getPosition();
        if (position != null) {
            numValueOf = Integer.valueOf(position.intValue() + 1);
        } else {
            numValueOf = null;
        }
        c474500IjA.LJJII(String.valueOf(numValueOf), "impr_position");
        c474500IjA.LJJII(String.valueOf(liveEffect.getEffectId()), "sticker_id");
        c474500IjA.LJJII(liveEffect.getResourceId(), "resource_id");
        c474500IjA.LJJII(liveEffect.getName(), "sticker_name");
        c474500IjA.LJJII(liveEffect.LJJJJI(), "group_sticker_id");
        c474500IjA.LJJII(liveEffect.LJJIJLIJ(), "group_sticker_name");
        c474500IjA.LJJII(liveEffect.LLILII(), "group_resource_id");
        Object objGg0 = DataChannelGlobal.LLILZ.gg0(C931060aKu.class);
        if (!C767250U7v.LJ(liveEffect)) {
            objGg0 = null;
        }
        c474500IjA.LJJII(objGg0, "is_sub_sticker_default");
        c474500IjA.LJJII(liveEffect.getPosition(), "sub_impr_position");
        c474500IjA.LJJII(liveEffect.LJLL(), "tab");
        if (dataChannel != null && (list = (List) dataChannel.gg0(MultiGuestUsedEffectChannel.class)) != null) {
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw null;
            }
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.FALSE) ? 1 : 0), "is_same_effect_scene");
        c474500IjA.LJJII(liveEffect.getSessionId(), "session_id");
    }

    @Override // X.C0UEY
    public final void LJ(LiveEffect liveEffect, DataChannel dataChannel, int i, String str) {
        long effectId;
        String str2;
        AwS97S1000000_12 awS97S1000000_12;
        C01GW c01gw = LIZIZ;
        C0UC7 c0uc7 = (C0UC7) c01gw.getValue();
        C0UCE c0uce = LJI;
        c0uc7.LLILLJJLI = liveEffect;
        c0uc7.LL = dataChannel;
        if (str == null && ((awS97S1000000_12 = C474640IjO.LJFF) == null || (str = awS97S1000000_12.s0) == null)) {
            str = "";
        }
        c0uc7.LLILLL = str;
        c0uc7.LLILZ = i;
        c0uc7.LLILZIL = c0uce;
        if (C0U7C.LJIILLIIL(liveEffect)) {
            C0UCE c0uce2 = LJI;
            if (c0uce2 != null && (str2 = c0uce2.LIZIZ) != null && str2.length() > 0) {
                effectId = CastLongProtector.parseLong(str2);
            } else {
                effectId = 1;
            }
        } else {
            effectId = liveEffect.getEffectId();
        }
        LIZLLL.put(Long.valueOf(effectId), Long.valueOf(C158B.LIZ()));
        C786410Ut5.LJLIIL(30000L, C473410IhP.LIZ(), (C0UC7) c01gw.getValue());
    }

    @Override // X.C0UEY
    public final void LJI(String str, TreeMap<Integer, C781670UlR> treeMap, List<? extends LiveEffect> list, DataChannel dataChannel) {
        LiveEffect next;
        String sessionId;
        String str2;
        String string;
        String resourceId;
        List list2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator<? extends LiveEffect> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getSessionId().length() > 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveEffect liveEffect = next;
        String str3 = "";
        if (liveEffect == null || (sessionId = liveEffect.getSessionId()) == null) {
            sessionId = "";
        }
        for (Map.Entry<Integer, C781670UlR> entry : treeMap.entrySet()) {
            arrayList.add(Integer.valueOf(entry.getValue().LIZ + 1));
            if (Intrinsics.LJFF(str, "props") && entry.getValue().LIZ == 0) {
                arrayList2.add("none");
                arrayList3.add("none");
            } else if (Intrinsics.LJFF(str, "props") && entry.getValue().LIZ == list.size() - 1) {
                arrayList2.add("expandButton");
                arrayList3.add("expandButton");
            } else {
                LiveEffect liveEffect2 = (LiveEffect) C13LP.LJJJLZIJ(entry.getValue().LIZ, list);
                if (liveEffect2 == null || (string = Long.valueOf(liveEffect2.getEffectId()).toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                arrayList2.add(string);
                LiveEffect liveEffect3 = (LiveEffect) C13LP.LJJJLZIJ(entry.getValue().LIZ, list);
                if (liveEffect3 == null || (resourceId = liveEffect3.getResourceId()) == null) {
                    resourceId = "";
                }
                arrayList3.add(resourceId);
            }
            if (dataChannel != null && (list2 = (List) dataChannel.gg0(MultiGuestUsedEffectChannel.class)) != null) {
                Iterator it3 = list2.iterator();
                if (it3.hasNext()) {
                    it3.next().getClass();
                    throw null;
                }
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_sticker_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "tab");
        c474500IjALIZ.LJJII(arrayList.toString(), "sticker_position");
        c474500IjALIZ.LJJII(arrayList2.toString(), "sticker_id_set");
        c474500IjALIZ.LJJII(arrayList3.toString(), "resource_id_set");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(arrayList4.isEmpty() ^ true)) ? 1 : 0), "is_same_effect_scene");
        c474500IjALIZ.LJJII(arrayList4.toString(), "same_effect_sticker_id_set");
        c474500IjALIZ.LJJI(false);
        if (Intrinsics.LJFF(C474640IjO.LIZ, Boolean.TRUE)) {
            str3 = "multi_guest_countdownforall";
        } else {
            AwS97S1000000_12 awS97S1000000_12 = C474640IjO.LJFF;
            if (awS97S1000000_12 != null && (str2 = awS97S1000000_12.s0) != null) {
                str3 = str2;
            }
        }
        c474500IjALIZ.LJJII(str3, "event_page");
        c474500IjALIZ.LJJII(sessionId, "session_id");
        c474500IjALIZ.LJJIJL();
    }

    @Override // X.C0UEY
    public final void LIZJ(LiveEffect liveEffect, DataChannel dataChannel, int i, boolean z, String str) {
        String str2;
        AwS97S1000000_12 awS97S1000000_12;
        C0UCE c0uce;
        if (i == 1) {
            LJ = liveEffect;
        }
        if (C0U7C.LJIILLIIL(liveEffect) && C0U7C.LJIILLIIL(LIZJ)) {
            if (Intrinsics.LJFF(liveEffect, LIZJ) && (c0uce = LJI) != null && c0uce.LIZ == C767790U9x.LJFF + 1) {
                return;
            }
        } else if (Intrinsics.LJFF(liveEffect, LIZJ)) {
            return;
        }
        int i2 = C767790U9x.LJFF + 1;
        C768350UCb c768350UCb = C767790U9x.LIZIZ;
        if (c768350UCb == null || (str2 = c768350UCb.LIZ) == null) {
            str2 = "-1";
        }
        C0UCE c0uce2 = new C0UCE(i2, str2, C767790U9x.LJIIIIZZ);
        C0UCE c0uce3 = null;
        if (z) {
            LJFF = LJI;
            if (C0U7C.LJIILLIIL(liveEffect)) {
                c0uce3 = c0uce2;
            }
            LJI = c0uce3;
        }
        LIZJ = liveEffect;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_sticker_select");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LJIIL(c474500IjALIZ, liveEffect, dataChannel);
        c474500IjALIZ.LJJI(false);
        LJIIJJI(c474500IjALIZ, liveEffect, c0uce2);
        c474500IjALIZ.LJJII(String.valueOf(i), "is_connection_default");
        if (str == null && ((awS97S1000000_12 = C474640IjO.LJFF) == null || (str = awS97S1000000_12.s0) == null)) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "event_page");
        c474500IjALIZ.LJJIJL();
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        String strValueOf = String.valueOf(liveEffect.getEffectId());
        c1276840jKc.getClass();
        C1276840jKc.LJIIL(strValueOf);
        C1276840jKc.LJIILL(liveEffect.getResourceId());
        C1276840jKc.LJIIJ(liveEffect, false);
    }
}
