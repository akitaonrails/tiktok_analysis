package X;

import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.InteractCallPlayerEvent;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestUsedEffectChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSelectedStickerEvent;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerSelectedEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.MultiGuestCallPlayerEventOptSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectMessageSwitch;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS244S0000000_12;
import kotlin.jvm.internal.AwS55S0010000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0UC4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UC4 implements InterfaceC771640UOs {
    public static C0UC8 LIZJ;
    public static C0UC8 LIZLLL;
    public static C0UC8 LJ;
    public static C0UC8 LJFF;
    public static C0UC8 LJI;
    public static C0UC8 LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static LiveEffect LJIILIIL;
    public static long LJIILJJIL;
    public static boolean LJIILL;
    public static boolean LJIILLIIL;
    public static int LJJ;
    public static Map<String, String> LJJI;
    public static boolean LJJIFFI;
    public static boolean LJJII;
    public static final HashMap<Long, Long> LJJIII;
    public static long LJJIIJ;
    public static final C0UCC LJJIIJZLJL;
    public static final C0UC4 LIZ = new C0UC4();
    public static String LIZIZ = "normal_icon";
    public static final C01GW LJIIIZ = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(228));
    public static final C01GW LJIIL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(222));
    public static final ConcurrentHashMap<String, Boolean> LJIIZILJ = new ConcurrentHashMap<>();
    public static final C01GW LJIJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(221));
    public static final C0TI3 LJIJI = new C0TI3();
    public static final C0TI3 LJIJJ = new C0TI3();
    public static final C0TI3 LJIJJLI = new C0TI3();
    public static final C0TI3 LJIL = new C0TI3();

    @Override // X.InterfaceC771640UOs
    public final void LJFF() {
        LJFF = null;
        LJI = null;
        C768300UBw.LIZIZ(5L);
    }

    static {
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        AFwS199S0000000_12 aFwS199S0000000_12 = AFwS199S0000000_12.get$arr$(219);
        c1276840jKc.getClass();
        C1276840jKc.LJJJIL = aFwS199S0000000_12;
        LJJII = true;
        LJJIII = new HashMap<>();
        LJJIIJ = -1L;
        LJJIIJZLJL = new C0UCC();
    }

    public static C0UC6 LJIILJJIL() {
        return (C0UC6) LJIIIZ.getValue();
    }

    @Override // X.InterfaceC771640UOs
    public final void LIZ() {
        C0UC8 c0uc8 = LIZLLL;
        C760080Tri.LIZIZ = c0uc8 != null ? Long.valueOf(c0uc8.LIZ).toString() : null;
        C0UC8 c0uc82 = LIZLLL;
        C760080Tri.LIZ = c0uc82 != null ? c0uc82.LIZJ : null;
        C0UC8 c0uc83 = LIZLLL;
        C760080Tri.LIZJ = c0uc83 != null ? c0uc83.LIZIZ : null;
        C0UC8 c0uc84 = LIZLLL;
        C760080Tri.LJ = c0uc84 != null ? c0uc84.LJIJJ : 0;
        C0UC8 c0uc85 = LIZLLL;
        C760080Tri.LIZLLL = (c0uc85 == null || c0uc85.LJIJJ != 1) ? null : c0uc85.LJIJJLI;
        LIZJ = LIZLLL;
        if (C500260Jjc.LJJIJLIJ()) {
            LJ = LIZLLL;
        }
        LIZLLL = null;
        LJIIJ = false;
        LJIIJJI = false;
    }

    @Override // X.InterfaceC771640UOs
    public final void LJII() {
        C0TI3 c0ti3 = LJIJI;
        c0ti3.LIZ();
        C0TI3 c0ti32 = LJIJJ;
        c0ti32.LIZ();
        C0TI3 c0ti33 = LJIJJLI;
        c0ti33.LIZ();
        C0TI3 c0ti34 = LJIL;
        c0ti34.LIZ();
        c0ti3.LIZIZ("init_time");
        c0ti32.LIZIZ("init_time");
        c0ti33.LIZIZ("init_time");
        c0ti34.LIZIZ("init_time");
    }

    @Override // X.InterfaceC771640UOs
    public final void LJIIIIZZ() {
        C768300UBw.LIZIZ(5L);
        C768300UBw.LJIIIIZZ(LJI, false, 1L);
        C768300UBw.LJIIIIZZ(LJFF, true, 1L);
        C768300UBw.LJIILIIL(5L);
    }

    @Override // X.InterfaceC771640UOs
    public final void LJI() {
        LJJIIJ = System.currentTimeMillis();
    }

    public static void LJIIJJI(C474500IjA c474500IjA) {
        c474500IjA.LJJII(Integer.valueOf(LJIILLIIL ? 1 : 0), "is_new_anchor_guide");
    }

    public static String LJIILIIL(List list) {
        if (!LiveEffectMessageSwitch.INSTANCE.enable()) {
            return "";
        }
        n nVar = new n();
        h hVar = new h();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            hVar.LJJIII((String) it2.next());
        }
        nVar.LJJIFFI("models", hVar);
        return nVar.toString();
    }

    public static void LJIILLIIL(C474500IjA c474500IjA) {
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nt()) {
            c474500IjA.LJJII(Long.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId()), "pk_id");
        }
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9()) {
            c474500IjA.LJJII(Long.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getChannelId()), "channel_id");
        }
    }

    public static void LJIJJ(int i) {
        C0TI3 c0ti3;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    c0ti3 = LJIJJLI;
                } else {
                    c0ti3 = LJIJI;
                }
            } else {
                c0ti3 = LJIL;
            }
        } else {
            c0ti3 = LJIJJ;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_effect_auto_restore_wait_time");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(i), "restore_type");
        Iterator<Map.Entry<String, Long>> it2 = c0ti3.LIZIZ.entrySet().iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            jLongValue += it2.next().getValue().longValue();
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "total_time");
        c474500IjALIZ.LJJII(0, "error_code");
        c0ti3.LIZJ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
    }

    public static void LJJIIZI(DataChannel dataChannel) {
        Boolean boolValueOf;
        if (C500260Jjc.LJJIJLIJ() || Intrinsics.LJFF(LIZJ, LIZLLL)) {
            return;
        }
        C01GW c01gw = LJIIL;
        ((Handler) c01gw.getValue()).removeCallbacks(LJIILJJIL());
        C0UC6 c0uc6LJIILJJIL = LJIILJJIL();
        C0UC8 c0uc8 = LIZLLL;
        if (c0uc8 != null) {
            boolValueOf = Boolean.valueOf(c0uc8.LJIILLIIL);
        } else {
            boolValueOf = null;
        }
        C500260Jjc.LJJJI(boolValueOf);
        boolean z = LJIILLIIL;
        c0uc6LJIILJJIL.LL = dataChannel;
        c0uc6LJIILJJIL.LLILLJJLI = c0uc8;
        c0uc6LJIILJJIL.LLILLL = z;
        C786410Ut5.LJLIIL(30000L, (Handler) c01gw.getValue(), LJIILJJIL());
    }

    public static void LJJIJ(DataChannel dataChannel) {
        Object objGg0;
        String str;
        Boolean boolValueOf;
        Object obj;
        Boolean boolValueOf2;
        String str2;
        boolean zBooleanValue;
        String str3;
        C0UC8 c0uc8;
        C0UC8 c0uc82 = LIZLLL;
        if (c0uc82 == null || Intrinsics.LJFF(LIZJ, c0uc82)) {
            return;
        }
        String str4 = "";
        String str5 = null;
        if (C500260Jjc.LJJ() && (c0uc8 = LIZLLL) != null && Intrinsics.LJFF(c0uc8.LJFF, "")) {
            c0uc8.LJFF = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
        }
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(C0U9L.class);
        } else {
            objGg0 = null;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LJIIZILJ;
        C0UC8 c0uc83 = LIZLLL;
        if (c0uc83 != null) {
            str = c0uc83.LIZIZ;
        } else {
            str = null;
        }
        boolean zContainsKey = concurrentHashMap.containsKey(str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_take_sticker_select");
        c474500IjALIZ.LJIJJLI(dataChannel);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C931040aKs.class), "enter_from");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930950aKj.class), "banner_id");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930960aKk.class), "banner_from");
        c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ry(), "link_id");
        LJIIJJI(c474500IjALIZ);
        c474500IjALIZ.LJIILL("click");
        LJJIJIIJI(c474500IjALIZ, LIZLLL);
        C0UC8 c0uc84 = LIZLLL;
        if (c0uc84 != null) {
            boolValueOf = Boolean.valueOf(c0uc84.LIZLLL);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_video_sticker");
        C0UC8 c0uc85 = LIZLLL;
        if (c0uc85 != null) {
            boolValueOf2 = Boolean.valueOf(c0uc85.LJIILLIIL);
        } else {
            boolValueOf2 = null;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf2) ? 1 : 0), "is_same_effect_scene");
        c474500IjALIZ.LJJIIZ(Boolean.valueOf(zContainsKey), "is_preload", AFwS199S0000000_12.get$arr$(225));
        AwS55S0010000_12 awS55S0010000_12 = new AwS55S0010000_12(zContainsKey, 8);
        C0UC8 c0uc86 = LIZLLL;
        if (c0uc86 == null || (str2 = c0uc86.LIZIZ) == null) {
            str2 = "";
        }
        Boolean bool = concurrentHashMap.get(str2);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c474500IjALIZ.LJJIIZ(Boolean.valueOf(zBooleanValue), "is_downloaded", awS55S0010000_12);
        LJIIL(c474500IjALIZ, LIZLLL);
        LJIILLIIL(c474500IjALIZ);
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr("livebackground"));
        if (liveEffect != null) {
            c474500IjALIZ.LJJII(Long.valueOf(liveEffect.getEffectId()), "concurrent_sticker_id");
            c474500IjALIZ.LJJII(liveEffect.getResourceId(), "concurrent_resource_id");
            c474500IjALIZ.LJJII(liveEffect.getName(), "concurrent_sticker_name");
        }
        String str6 = C0UAS.LIZIZ;
        C0UC8 c0uc87 = LIZLLL;
        if (c0uc87 != null) {
            str5 = c0uc87.LIZIZ;
        }
        if (Intrinsics.LJFF(str6, str5)) {
            c474500IjALIZ.LJJII("1", "is_entrance_default");
        } else {
            c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_entrance_default");
        }
        Map<String, String> map = LJJI;
        if (map != null && map.containsKey("enter_from")) {
            Map<String, String> map2 = LJJI;
            if (map2 != null && (str3 = map2.get("enter_from")) != null) {
                str4 = str3;
            }
            c474500IjALIZ.LJJII(str4, "enter_from");
        } else if (C500260Jjc.LJIJ(dataChannelGlobal)) {
            c474500IjALIZ.LJJII(C0IUA.LJIJI, "enter_from");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(objGg0, Boolean.TRUE) ? 1 : 0), "is_preview_apply");
        c474500IjALIZ.LJJIJL();
        if (C500260Jjc.LJJ() && C500260Jjc.LJJIFFI(Boolean.valueOf(LJIIJJI))) {
            C768300UBw.LIZIZ(1L);
            C768300UBw.LJIIIIZZ(LIZLLL, false, 0L);
            C768300UBw.LJIILIIL(1L);
        }
    }

    public static C0UC8 LJJIJIIJIL(LiveEffect liveEffect) {
        Integer numValueOf;
        String strValueOf;
        boolean zLJIIIZ;
        Integer numValueOf2;
        long j;
        String str;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        String strValueOf2 = (String) dataChannelGlobal.gg0(C931060aKu.class);
        boolean z = true;
        String value = null;
        if (!C767250U7v.LJ(liveEffect)) {
            C767630U9h c767630U9h = C767630U9h.LL;
            String resourceId = liveEffect.getResourceId();
            c767630U9h.getClass();
            zLJIIIZ = C767630U9h.LJIIIZ(resourceId);
            strValueOf2 = null;
            strValueOf = null;
        } else {
            Integer position = liveEffect.getPosition();
            if (position != null) {
                numValueOf = Integer.valueOf(position.intValue() + 1);
            } else {
                numValueOf = null;
            }
            strValueOf = String.valueOf(numValueOf);
            C767630U9h c767630U9h2 = C767630U9h.LL;
            String strLLILII = liveEffect.LLILII();
            c767630U9h2.getClass();
            zLJIIIZ = C767630U9h.LJIIIZ(strLLILII);
        }
        long effectId = liveEffect.getEffectId();
        String strLJJJJI = liveEffect.LJJJJI();
        if (C0U7C.LJIILLIIL(liveEffect)) {
            C768350UCb c768350UCb = C767790U9x.LIZIZ;
            if (c768350UCb != null && (str = c768350UCb.LIZ) != null) {
                effectId = CastLongProtector.parseLong(str);
            } else {
                effectId = -1;
            }
            strLJJJJI = String.valueOf(liveEffect.getEffectId());
            strValueOf = String.valueOf(C767790U9x.LJFF + 1);
            strValueOf2 = String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C767790U9x.LJIIIIZZ)) ? 1 : 0);
        }
        String resourceId2 = liveEffect.getResourceId();
        String name = liveEffect.getName();
        boolean zLJJLIIIJILLIZJL = liveEffect.LJJLIIIJILLIZJL();
        String strLJLL = liveEffect.LJLL();
        String broadcastScene = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
        boolean z2 = liveEffect.getLogParams().LIZ;
        boolean z3 = liveEffect.getLogParams().LIZIZ;
        String str2 = LIZIZ;
        String strLJJIJLIJ = liveEffect.LJJIJLIJ();
        String strLLILII2 = liveEffect.LLILII();
        Integer numLJJIJL = liveEffect.LJJIJL();
        if (numLJJIJL != null) {
            numValueOf2 = Integer.valueOf(numLJJIJL.intValue() + 1);
        } else {
            numValueOf2 = null;
        }
        String strValueOf3 = String.valueOf(numValueOf2);
        if (!C0UDE.LIZ(liveEffect.getExtra()) && !C0UDE.LIZ(liveEffect.LJJIII())) {
            z = false;
        }
        if (liveEffect.LJJJJLL()) {
            j = 1;
        } else {
            j = 0;
        }
        int source = liveEffect.getSource();
        String strLJJLIIIJL = liveEffect.LJJLIIIJL();
        boolean z4 = liveEffect.getLogParams().LIZJ;
        boolean z5 = liveEffect.getLogParams().LIZLLL;
        boolean zLIZJ = C767750U9t.LIZJ(liveEffect);
        C0U6H c0u6hLJZI = liveEffect.LJZI();
        if (c0u6hLJZI != null) {
            value = c0u6hLJZI.getValue();
        }
        C0UC8 c0uc8 = new C0UC8(effectId, resourceId2, name, zLJJLIIIJILLIZJL, strLJLL, broadcastScene, z2, z3, str2, strLJJJJI, strLJJIJLIJ, strLLILII2, strValueOf2, strValueOf, false, 0L, zLJIIIZ, strValueOf3, z, j, source, strLJJLIIIJL, z4, z5, zLIZJ, value, liveEffect.getSearchId(), liveEffect.LJJJI(), liveEffect.getSessionId(), C500260Jjc.LJJJI(Boolean.valueOf(liveEffect.LLJJJ())) ? 1 : 0, 49152);
        dataChannelGlobal.JQ2(C931060aKu.class, CardStruct.IStatusCode.DEFAULT);
        return c0uc8;
    }

    @Override // X.InterfaceC771640UOs
    public final void LIZIZ(DataChannel dataChannel) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("pm_live_sticker_use");
        c474500IjALIZ.LJIJJLI(dataChannel);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C931040aKs.class), "enter_from");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930950aKj.class), "banner_id");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930960aKk.class), "banner_from");
        LJIIJJI(c474500IjALIZ);
        if (LJIIIIZZ) {
            str = "use";
        } else {
            str = "unused";
        }
        c474500IjALIZ.LJJII(str, "use_status");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC771640UOs
    public final void LIZJ(boolean z) {
        String str;
        String resourceId;
        String name;
        C0UC8 c0uc8;
        C0UC8 c0uc82;
        C0UC8 c0uc8LJJIJIIJIL = null;
        if (z) {
            LIZLLL = null;
            return;
        }
        if (C500260Jjc.LJJ() && (c0uc8 = LJ) != null) {
            C20441214yg.LIZIZ("StickerRecover", String.valueOf(Boolean.valueOf(c0uc8.LJJI)));
            C0UC8 c0uc83 = LJ;
            if (c0uc83 != null) {
                c0uc82 = new C0UC8(c0uc83.LIZ, c0uc83.LIZIZ, c0uc83.LIZJ, c0uc83.LIZLLL, c0uc83.LJ, c0uc83.LJFF, c0uc83.LJI, c0uc83.LJII, c0uc83.LJIIIIZZ, c0uc83.LJIIIZ, c0uc83.LJIIJ, c0uc83.LJIIJJI, c0uc83.LJIIL, c0uc83.LJIILIIL, true, 0L, c0uc83.LJIILLIIL, c0uc83.LJIIZILJ, c0uc83.LJIJ, c0uc83.LJIJI, c0uc83.LJIJJ, c0uc83.LJIJJLI, c0uc83.LJIL, c0uc83.LJJ, c0uc83.LJJI, c0uc83.LJJIFFI, c0uc83.LJJII, c0uc83.LJJIII, c0uc83.LJJIIJ, c0uc83.LJJIIJZLJL, 32768);
            } else {
                c0uc82 = null;
            }
            LIZLLL = c0uc82;
            LJ = null;
            return;
        }
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLZIJ(0, C0UA1.LIZ().qr(C0UD4.LIZIZ));
        C0UC8 c0uc84 = LIZLLL;
        if (c0uc84 != null) {
            str = c0uc84.LIZIZ;
        } else {
            str = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSticker: cur res: ");
        sbLIZ.append(str);
        sbLIZ.append(", sticker res: ");
        if (liveEffect != null) {
            resourceId = liveEffect.getResourceId();
        } else {
            resourceId = null;
        }
        sbLIZ.append(resourceId);
        sbLIZ.append(", stickerName: ");
        if (liveEffect != null) {
            name = liveEffect.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        C20441214yg.LIZIZ("EffectChange", C2188811AlT.LIZIZ(sbLIZ));
        if (liveEffect != null) {
            c0uc8LJJIJIIJIL = LJJIJIIJIL(liveEffect);
        }
        LIZLLL = c0uc8LJJIJIIJIL;
        if (LJJ > 1 && c0uc8LJJIJIIJIL != null) {
            c0uc8LJJIJIIJIL.LJJI = false;
        }
        if (liveEffect == null || Intrinsics.LJFF(liveEffect.getResourceId(), str)) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Sticker Count Up: ");
        sbLIZ2.append(LJJ);
        C20441214yg.LIZIZ("EffectChange", C2188811AlT.LIZIZ(sbLIZ2));
        LJJ++;
    }

    @Override // X.InterfaceC771640UOs
    public final void LIZLLL(boolean z) {
        LJIILLIIL = z;
    }

    @Override // X.InterfaceC771640UOs
    public final void LJ(DataChannel dataChannel) {
        C0UC8 c0uc8;
        Object objGg0;
        String str;
        Boolean boolValueOf;
        long j;
        Long lValueOf;
        long jLongValue;
        String str2;
        boolean zBooleanValue;
        String str3;
        if (C500260Jjc.LJJIJLIJ() || (c0uc8 = LIZJ) == null || Intrinsics.LJFF(c0uc8, LIZLLL)) {
            return;
        }
        long jLIZ = C158B.LIZ();
        String str4 = null;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(C0U9L.class);
        } else {
            objGg0 = null;
        }
        ConcurrentHashMap<String, Boolean> concurrentHashMap = LJIIZILJ;
        C0UC8 c0uc82 = LIZJ;
        if (c0uc82 != null) {
            str = c0uc82.LIZIZ;
        } else {
            str = null;
        }
        boolean zContainsKey = concurrentHashMap.containsKey(str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_sticker_use_time");
        c474500IjALIZ.LJIJJLI(dataChannel);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C931040aKs.class), "enter_from");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930950aKj.class), "banner_id");
        c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930960aKk.class), "banner_from");
        c474500IjALIZ.LJIIJJI("live_take");
        c474500IjALIZ.LJIILL("click");
        LJIIJJI(c474500IjALIZ);
        LJJIJIIJI(c474500IjALIZ, LIZJ);
        C0UC8 c0uc83 = LIZJ;
        if (c0uc83 != null) {
            boolValueOf = Boolean.valueOf(c0uc83.LJIILLIIL);
        } else {
            boolValueOf = null;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0), "is_same_effect_scene");
        C0UC8 c0uc84 = LIZJ;
        if (c0uc84 != null) {
            j = c0uc84.LJIILL;
        } else {
            j = jLIZ;
        }
        c474500IjALIZ.LJJII(Long.valueOf((jLIZ - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "use_time");
        AFwS199S0000000_12 aFwS199S0000000_12 = AFwS199S0000000_12.get$arr$(226);
        HashMap<Long, Long> map = LJJIII;
        C0UC8 c0uc85 = LIZJ;
        if (c0uc85 != null) {
            lValueOf = Long.valueOf(c0uc85.LIZ);
        } else {
            lValueOf = null;
        }
        Long l = map.get(lValueOf);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        c474500IjALIZ.LJJIIZ(Long.valueOf(jLongValue), "favorite_source_app_id", aFwS199S0000000_12);
        c474500IjALIZ.LJJIIZ(Boolean.valueOf(zContainsKey), "is_preload", AFwS199S0000000_12.get$arr$(227));
        AwS55S0010000_12 awS55S0010000_12 = new AwS55S0010000_12(zContainsKey, 9);
        C0UC8 c0uc86 = LIZJ;
        String str5 = "";
        if (c0uc86 == null || (str2 = c0uc86.LIZIZ) == null) {
            str2 = "";
        }
        Boolean bool = concurrentHashMap.get(str2);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c474500IjALIZ.LJJIIZ(Boolean.valueOf(zBooleanValue), "is_downloaded", awS55S0010000_12);
        LJIIL(c474500IjALIZ, LIZJ);
        LJIILLIIL(c474500IjALIZ);
        c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(objGg0, Boolean.TRUE) ? 1 : 0), "is_preview_apply");
        c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ry(), "link_id");
        C0UC8 c0uc87 = LIZJ;
        if (c0uc87 != null) {
            str4 = c0uc87.LIZIZ;
        }
        if (Intrinsics.LJFF(str4, C0UAS.LIZIZ)) {
            c474500IjALIZ.LJJII("1", "is_entrance_default");
        } else {
            c474500IjALIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "is_entrance_default");
        }
        Map<String, String> map2 = LJJI;
        if (map2 != null && map2.containsKey("enter_from")) {
            Map<String, String> map3 = LJJI;
            if (map3 != null && (str3 = map3.get("enter_from")) != null) {
                str5 = str3;
            }
            c474500IjALIZ.LJJII(str5, "enter_from");
        } else if (C500260Jjc.LJIJ(dataChannelGlobal)) {
            c474500IjALIZ.LJJII(C0IUA.LJIJI, "enter_from");
        }
        c474500IjALIZ.LJJIJL();
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(LJIIJJI))) {
            C768300UBw.LIZIZ(1L);
            C768300UBw.LJIIIIZZ(LIZJ, true, 0L);
            C768300UBw.LJIILIIL(1L);
        }
    }

    @Override // X.InterfaceC771640UOs
    public final void release(boolean z) {
        ((Handler) LJIIL.getValue()).removeCallbacks(LJIILJJIL());
        if (!z) {
            LJ = null;
            LJIIZILJ.clear();
            LJJ = 0;
            LJJIII.clear();
        }
        LIZLLL = null;
        LIZJ = null;
        LJIIIIZZ = false;
        C0UC6 c0uc6LJIILJJIL = LJIILJJIL();
        c0uc6LJIILJJIL.LL = null;
        c0uc6LJIILJJIL.LLILLJJLI = null;
        C768300UBw.LIZLLL();
    }

    public static void LJIIL(C474500IjA c474500IjA, C0UC8 c0uc8) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Long lValueOf;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5 = null;
        if (c0uc8 != null) {
            boolValueOf = Boolean.valueOf(c0uc8.LJIJ);
        } else {
            boolValueOf = null;
        }
        c474500IjA.LJJII(String.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0), "is_avatar");
        if (c0uc8 != null) {
            boolValueOf2 = Boolean.valueOf(c0uc8.LJIJ);
        } else {
            boolValueOf2 = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf2)) {
            return;
        }
        if (c0uc8 != null) {
            lValueOf = Long.valueOf(c0uc8.LIZ);
        } else {
            lValueOf = null;
        }
        c474500IjA.LJJII(lValueOf, "sticker_id");
        c474500IjA.LJJII("", "resource_id");
        c474500IjA.LJJII("", "sticker_name");
        if (c0uc8 != null) {
            str = c0uc8.LIZJ;
        } else {
            str = null;
        }
        c474500IjA.LJJII(str, "group_sticker_name");
        if (c0uc8 != null) {
            str2 = c0uc8.LIZIZ;
        } else {
            str2 = null;
        }
        c474500IjA.LJJII(str2, "group_resource_id");
        if (c0uc8 != null) {
            str3 = c0uc8.LJIIL;
        } else {
            str3 = null;
        }
        c474500IjA.LJJII(str3, "is_sub_sticker_default");
        if (c0uc8 != null) {
            str5 = c0uc8.LJIILIIL;
        }
        c474500IjA.LJJII(str5, "sub_impr_position");
        boolean z = true;
        if (c0uc8 != null && (str4 = c0uc8.LJIILIIL) != null) {
            i = CastIntegerProtector.parseInt(str4);
        } else {
            i = 1;
        }
        if (i > C767790U9x.LJI) {
            z = false;
        }
        c474500IjA.LJJII(String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_avatar_user_create");
        c474500IjA.LJJII(Integer.valueOf(C767790U9x.LJI), "user_avatar_count");
        c474500IjA.LJJII(Integer.valueOf(C767790U9x.LJII), "template_avatar_count");
    }

    public static void LJIILL(C474500IjA c474500IjA, C0UC9 c0uc9) {
        String str;
        boolean z;
        Boolean boolValueOf;
        LiveEffect liveEffect = c0uc9.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C500260Jjc.LJJIJLIJ()) {
            str = "live_take_page";
        } else if (c0uc9.LJ) {
            str = "connection_status";
        } else {
            str = "live_take_detail";
        }
        boolean zEnable = LiveEffectMessageSwitch.INSTANCE.enable();
        c474500IjA.LJJII(Long.valueOf(liveEffect.getEffectId()), "effect_id");
        c474500IjA.LJJII(liveEffect.getResourceId(), "resource_id");
        c474500IjA.LJJII(str, "event_page");
        c474500IjA.LJJII("success", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (c0uc9.LIZIZ == 0) {
            z = true;
        } else {
            z = false;
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_cache");
        c474500IjA.LJJII(Long.valueOf((jCurrentTimeMillis - c0uc9.LIZJ) + c0uc9.LIZIZ), "duration");
        c474500IjA.LJJII(Long.valueOf(c0uc9.LIZIZ), "download_time");
        c474500IjA.LJJII(Long.valueOf(jCurrentTimeMillis - c0uc9.LIZJ), "render_time");
        c474500IjA.LJJII(Long.valueOf(c0uc9.LIZLLL - c0uc9.LIZJ), "live_side_time");
        c474500IjA.LJJII(Long.valueOf(jCurrentTimeMillis - c0uc9.LIZLLL), "effect_side_time");
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C767250U7v.LIZLLL(liveEffect))) ? 1 : 0), "is_parent_effect");
        String strLJLL = liveEffect.LJLL();
        if (strLJLL != null) {
            boolValueOf = Boolean.valueOf(u.LJJIIJZLJL(strLJLL, "makeup", false));
        } else {
            boolValueOf = null;
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0), "is_makeup");
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIJ(DataChannelGlobal.LLILZ))) ? 1 : 0), "is_anchor");
        c474500IjA.LJJII(c0uc9.LJFF, "panel_type");
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C767750U9t.LIZJ(liveEffect))) ? 1 : 0), "is_remembered");
        if (zEnable) {
            c474500IjA.LJJII(Integer.valueOf(liveEffect.LJJJJ()), "effect_resource_relative_downgrade");
            c474500IjA.LJJII(liveEffect.Wp(), "effect_resource_grade");
        }
    }

    public static void LJIIZILJ(long j, C0UCA c0uca) {
        Pair<Long, Long> pair;
        long jLIZ;
        long jLIZ2;
        long jLIZ3;
        long jLIZ4;
        Long lValueOf;
        C0UCC c0ucc = LJJIIJZLJL;
        c0ucc.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectMonitor#RecordEnd");
        sbLIZ.append(c0uca.name());
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(j));
        Long lValueOf2 = Long.valueOf(j);
        C0UCB c0ucb = c0ucc.LIZ.get(lValueOf2);
        if (c0ucb != null && (pair = c0ucb.LIZJ.get(Integer.valueOf(c0uca.getKey()))) != null && pair.getSecond().longValue() == -1) {
            c0ucb.LIZJ.put(Integer.valueOf(c0uca.getKey()), new Pair<>(pair.getFirst(), Long.valueOf(System.currentTimeMillis())));
            C0UCA c0uca2 = C0UCA.SHOW_EFFECT;
            if (c0uca == c0uca2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("time: ");
                Pair<Long, Long> pair2 = c0ucb.LIZJ.get(Integer.valueOf(c0uca.getKey()));
                if (pair2 != null) {
                    lValueOf = Long.valueOf(C12880052g.LIZ(pair2));
                } else {
                    lValueOf = null;
                }
                sbLIZ2.append(lValueOf);
                C20441214yg.LIZIZ("EffectTimer#ShowEffect", C2188811AlT.LIZIZ(sbLIZ2));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("EffectMonitor#RecordEndCount");
            sbLIZ3.append(c0uca.name());
            C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3), String.valueOf(c0ucb.LIZLLL));
            int i = c0ucb.LIZLLL - 1;
            c0ucb.LIZLLL = i;
            if (i <= 0) {
                long jLongValue = lValueOf2.longValue();
                Pair<Long, Long> pair3 = c0ucb.LIZJ.get(Integer.valueOf(C0UCA.RESTORE_EFFECT.getKey()));
                long jLIZ5 = 0;
                if (pair3 != null) {
                    jLIZ = C12880052g.LIZ(pair3);
                } else {
                    jLIZ = 0;
                }
                Pair<Long, Long> pair4 = c0ucb.LIZJ.get(Integer.valueOf(C0UCA.ADD_EFFECT.getKey()));
                if (pair4 != null) {
                    jLIZ2 = C12880052g.LIZ(pair4);
                } else {
                    jLIZ2 = 0;
                }
                Pair<Long, Long> pair5 = c0ucb.LIZJ.get(Integer.valueOf(c0uca2.getKey()));
                if (pair5 != null) {
                    jLIZ3 = C12880052g.LIZ(pair5);
                } else {
                    jLIZ3 = 0;
                }
                Pair<Long, Long> pair6 = c0ucb.LIZJ.get(Integer.valueOf(C0UCA.REPLACE_EFFECT.getKey()));
                if (pair6 != null) {
                    jLIZ4 = C12880052g.LIZ(pair6);
                } else {
                    jLIZ4 = 0;
                }
                Pair<Long, Long> pair7 = c0ucb.LIZJ.get(Integer.valueOf(C0UCA.REMOVE_EFFECT.getKey()));
                if (pair7 != null) {
                    jLIZ5 = C12880052g.LIZ(pair7);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_android_effect_method_monitor");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "effect_id");
                c474500IjALIZ.LJJII(c0ucb.LIZ.getString("resource_id", ""), "resource_id");
                c474500IjALIZ.LJJII(c0ucb.LIZ.getString("panel", ""), "effect_category");
                c474500IjALIZ.LJJII(c0ucb.LIZIZ.toString(), "method_stack");
                c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "restore_effect_time");
                c474500IjALIZ.LJJII(Long.valueOf(jLIZ2), "add_effect_time");
                c474500IjALIZ.LJJII(Long.valueOf(jLIZ3), "show_effect_time");
                c474500IjALIZ.LJJII(Long.valueOf(jLIZ4), "replace_effect_time");
                c474500IjALIZ.LJJII(Long.valueOf(jLIZ5), "remove_effect_time");
                c474500IjALIZ.LIZ();
                c0ucc.LIZIZ.remove(Long.valueOf(jLongValue));
            }
        }
    }

    public static void LJIJJLI(DataChannel dataChannel, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_sticker_request_button_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "button_type");
        LJJIJIIJI(c474500IjALIZ, LIZJ);
        c474500IjALIZ.LIZ();
    }

    public static void LJIL(DataChannel dataChannel, boolean z) {
        String str;
        if (LJJIIJ == -1) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - LJJIIJ;
        LJJIIJ = -1L;
        if (C500260Jjc.LJJIJLIJ()) {
            str = "live_take_page";
        } else if (z) {
            str = "connection_status";
        } else {
            str = "live_take_detail";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_sticker_panel_load_time");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
        c474500IjALIZ.LJJII(str, "event_page");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIIZ(LiveEffect liveEffect, DataChannel dataChannel) {
        if (liveEffect == null) {
            return;
        }
        C767630U9h c767630U9h = C767630U9h.LL;
        String resourceId = liveEffect.getResourceId();
        c767630U9h.getClass();
        boolean zLJIIIZ = C767630U9h.LJIIIZ(resourceId);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_rec_sticker_show");
        c474500IjALIZ.LJJII(Long.valueOf(liveEffect.getEffectId()), "rec_sticker_id");
        c474500IjALIZ.LJJII(liveEffect.getResourceId(), "rec_resource_id");
        c474500IjALIZ.LJJII(liveEffect.getName(), "rec_sticker_name");
        c474500IjALIZ.LJJIIZ(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(zLJIIIZ)) ? 1 : 0), "is_same_effect_scene", AFwS199S0000000_12.get$arr$(224));
        c474500IjALIZ.LJJII(liveEffect.LJLL(), "tab");
        c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJIIJI(C474500IjA c474500IjA, C0UC8 c0uc8) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String str;
        Boolean boolValueOf3;
        Long lValueOf;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Boolean boolValueOf4;
        String str9;
        Boolean boolValueOf5;
        String str10;
        String str11;
        String str12;
        Integer numValueOf;
        Boolean boolValueOf6;
        Boolean boolValueOf7;
        Boolean boolValueOf8;
        String str13;
        String str14;
        Boolean boolValueOf9;
        int i;
        String str15;
        String str16 = null;
        if (c0uc8 != null) {
            boolValueOf = Boolean.valueOf(c0uc8.LJIL);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            if (c0uc8 != null) {
                str15 = c0uc8.LJ;
            } else {
                str15 = null;
            }
            c474500IjA.LJJII(str15, "tab");
        }
        if (c0uc8 != null) {
            boolValueOf2 = Boolean.valueOf(c0uc8.LJI);
        } else {
            boolValueOf2 = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf2)) {
            str = "animation";
        } else {
            str = "normal";
        }
        c474500IjA.LJJII(str, "method");
        if (c0uc8 != null) {
            boolValueOf3 = Boolean.valueOf(c0uc8.LJII);
        } else {
            boolValueOf3 = null;
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf3) ? 1 : 0), "is_rec");
        if (c0uc8 != null) {
            lValueOf = Long.valueOf(c0uc8.LIZ);
        } else {
            lValueOf = null;
        }
        c474500IjA.LJJII(lValueOf, "sticker_id");
        if (c0uc8 != null) {
            str2 = c0uc8.LIZIZ;
        } else {
            str2 = null;
        }
        c474500IjA.LJJII(str2, "resource_id");
        if (c0uc8 != null) {
            str3 = c0uc8.LIZJ;
        } else {
            str3 = null;
        }
        c474500IjA.LJJII(str3, "sticker_name");
        if (c0uc8 != null) {
            str4 = c0uc8.LJIIIZ;
        } else {
            str4 = null;
        }
        c474500IjA.LJJII(str4, "group_sticker_id");
        if (c0uc8 != null) {
            str5 = c0uc8.LJIIJ;
        } else {
            str5 = null;
        }
        c474500IjA.LJJII(str5, "group_sticker_name");
        if (c0uc8 != null) {
            str6 = c0uc8.LJIIJJI;
        } else {
            str6 = null;
        }
        c474500IjA.LJJII(str6, "group_resource_id");
        if (c0uc8 != null) {
            str7 = c0uc8.LJIIL;
        } else {
            str7 = null;
        }
        c474500IjA.LJJII(str7, "is_sub_sticker_default");
        if (c0uc8 != null) {
            str8 = c0uc8.LJIILIIL;
        } else {
            str8 = null;
        }
        c474500IjA.LJJII(str8, "sub_impr_position");
        if (c0uc8 != null) {
            boolValueOf4 = Boolean.valueOf(c0uc8.LIZLLL);
        } else {
            boolValueOf4 = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf4)) {
            str9 = "1";
        } else {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjA.LJJII(str9, "is_video_sticker");
        if (c0uc8 != null) {
            boolValueOf5 = Boolean.valueOf(c0uc8.LJIILJJIL);
        } else {
            boolValueOf5 = null;
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf5) ? 1 : 0), "is_live_take_default");
        if (c0uc8 != null) {
            str10 = c0uc8.LJIIIIZZ;
        } else {
            str10 = null;
        }
        c474500IjA.LJJII(str10, "effect_icon_type");
        if (c0uc8 != null) {
            str11 = c0uc8.LJFF;
        } else {
            str11 = null;
        }
        c474500IjA.LJJII(str11, "select_scene");
        if (c0uc8 != null) {
            str12 = c0uc8.LJIIZILJ;
        } else {
            str12 = null;
        }
        c474500IjA.LJJII(str12, "impr_position");
        if (c0uc8 != null) {
            numValueOf = Integer.valueOf(c0uc8.LJIJJ);
        } else {
            numValueOf = null;
        }
        c474500IjA.LJJII(numValueOf, "source");
        if (c0uc8 != null) {
            boolValueOf6 = Boolean.valueOf(c0uc8.LJIL);
        } else {
            boolValueOf6 = null;
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf6) ? 1 : 0), "is_shortcut_panel");
        if (c0uc8 != null) {
            boolValueOf7 = Boolean.valueOf(c0uc8.LJJ);
        } else {
            boolValueOf7 = null;
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf7) ? 1 : 0), "is_rec_pin");
        if (c0uc8 != null) {
            boolValueOf8 = Boolean.valueOf(c0uc8.LJJI);
        } else {
            boolValueOf8 = null;
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf8) ? 1 : 0), "is_remembered");
        if (c0uc8 != null) {
            str13 = c0uc8.LJJIFFI;
        } else {
            str13 = null;
        }
        c474500IjA.LJJII(str13, "search_result_type");
        if (c0uc8 != null) {
            str14 = c0uc8.LJJII;
        } else {
            str14 = null;
        }
        c474500IjA.LJJII(str14, "search_id");
        if (c0uc8 != null) {
            boolValueOf9 = Boolean.valueOf(c0uc8.LJJIII);
        } else {
            boolValueOf9 = null;
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf9) ? 1 : 0), "review_original_frame");
        if (c0uc8 != null) {
            str16 = c0uc8.LJJIIJ;
        }
        c474500IjA.LJJII(str16, "session_id");
        if (c0uc8 != null) {
            i = c0uc8.LJJIIJZLJL;
        } else {
            i = 0;
        }
        c474500IjA.LJJII(Integer.valueOf(i), "is_interactive_effect");
    }

    @Override // X.InterfaceC771640UOs
    public final void LJIIIZ(Fragment fragment, DataChannel dataChannel) {
        Class cls;
        if (dataChannel != null) {
            dataChannel.BQ2(fragment, StickerSelectedEvent.class, new AwS591S0100000_12(dataChannel, 662));
            dataChannel.BQ2(fragment, StickerCancelChannel.class, new AwS591S0100000_12(dataChannel, 663));
            dataChannel.BQ2(fragment, MultiGuestSelectedStickerEvent.class, new AwS244S0000000_12(dataChannel, 1));
            if (MultiGuestCallPlayerEventOptSetting.getValue()) {
                cls = InteractCallPlayerEvent.class;
            } else {
                cls = InteractStateChangeEvent.class;
            }
            dataChannel.EQ2(fragment, cls, AFwS245S0000000_12.get$arr$(95));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void LJIJ(LiveEffect liveEffect, String str, C0UCA c0uca) {
        Pair<Long, Long> pair;
        C0UCC c0ucc = LJJIIJZLJL;
        c0ucc.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectMonitor#RecordStart");
        sbLIZ.append(c0uca.name());
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "");
        Object objValueOf = Long.valueOf(liveEffect.getEffectId());
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("resource_id", liveEffect.getResourceId(), bundle);
        C786410Ut5.LJJJI("panel", str, bundle);
        C0UCB c0ucb = c0ucc.LIZ.get(objValueOf);
        if (c0ucb == null) {
            c0ucb = new C0UCB(bundle);
            c0ucc.LIZ.put((K) objValueOf, c0ucb);
        }
        Pair<Long, Long> pair2 = c0ucb.LIZJ.get(Integer.valueOf(c0uca.getKey()));
        if (pair2 == null) {
            c0ucb.LIZJ.put(Integer.valueOf(c0uca.getKey()), new Pair<>(Long.valueOf(System.currentTimeMillis()), -1L));
        } else {
            HashMap<Integer, Pair<Long, Long>> map = c0ucb.LIZJ;
            Integer numValueOf = Integer.valueOf(c0uca.getKey());
            if (pair2.getSecond().longValue() == -1) {
                pair = new Pair<>(pair2.getFirst(), Long.valueOf(System.currentTimeMillis()));
            } else {
                pair = new Pair<>(Long.valueOf(System.currentTimeMillis() - (pair2.getSecond().longValue() - pair2.getFirst().longValue())), -1L);
            }
            map.put(numValueOf, pair);
        }
        c0ucb.LIZLLL++;
        try {
            StringBuilder sb = c0ucb.LIZIZ;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c0uca.getKey());
            sb2.append(',');
            sb.append(sb2.toString());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJJIFFI(String str, HashMap map, boolean z) {
        Object obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("info: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("effectError", C2188811AlT.LIZIZ(sbLIZ));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_effect_error_info");
        if (z) {
            obj = "video_anchor_guest_connect_guest";
        } else {
            C1276840jKc.LIZ.getClass();
            obj = ((LinkedHashMap) C1276840jKc.LJIIL).get("broadcast_scene");
            if (obj == null) {
                obj = "preview_live";
            }
        }
        c474500IjALIZ.LJJII(obj, "broadcast_scene");
        try {
            Iterator<T> it2 = GsonProtectorUtils.parse(new p(), str).LJIILIIL().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("key: ");
                sbLIZ2.append((String) entry.getKey());
                sbLIZ2.append(", value: ");
                sbLIZ2.append(entry.getValue());
                C20441214yg.LIZIZ("effectError", C2188811AlT.LIZIZ(sbLIZ2));
                c474500IjALIZ.LJJII(((k) entry.getValue()).toString(), (String) entry.getKey());
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (((ArrayList) entry2.getValue()).size() == 1) {
                c474500IjALIZ.LJJII(ListProtector.get((ArrayList) entry2.getValue(), 0), (String) entry2.getKey());
            } else if (((ArrayList) entry2.getValue()).size() > 1) {
                c474500IjALIZ.LJJII(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, entry2.getValue()), (String) entry2.getKey());
            }
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJJII(LiveEffect liveEffect, String str, boolean z) {
        String str2;
        Boolean boolValueOf;
        if (C500260Jjc.LJJIJLIJ()) {
            str2 = "live_take_page";
        } else if (z) {
            str2 = "connection_status";
        } else {
            str2 = "live_take_detail";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_sticker_render_begin");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Long.valueOf(liveEffect.getEffectId()), "effect_id");
        c474500IjALIZ.LJJII(liveEffect.getResourceId(), "resource_id");
        c474500IjALIZ.LJJII(str2, "event_page");
        c474500IjALIZ.LJJII(str, "panel_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C767250U7v.LIZLLL(liveEffect))) ? 1 : 0), "is_parent_effect");
        String strLJLL = liveEffect.LJLL();
        if (strLJLL != null) {
            boolValueOf = Boolean.valueOf(u.LJJIIJZLJL(strLJLL, "makeup", false));
        } else {
            boolValueOf = null;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0), "is_makeup");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIJ(DataChannelGlobal.LLILZ))) ? 1 : 0), "is_anchor");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIII(DataChannel dataChannel, boolean z, LiveEffect liveEffect, String str) {
        String str2;
        Boolean boolValueOf;
        if (C500260Jjc.LJJIJLIJ()) {
            str2 = "live_take_page";
        } else if (z) {
            str2 = "connection_status";
        } else {
            str2 = "live_take_detail";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_sticker_render_begin");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(liveEffect.getEffectId()), "effect_id");
        c474500IjALIZ.LJJII(liveEffect.getResourceId(), "resource_id");
        c474500IjALIZ.LJJII(str2, "event_page");
        c474500IjALIZ.LJJII(str, "panel_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C767250U7v.LIZLLL(liveEffect))) ? 1 : 0), "is_parent_effect");
        String strLJLL = liveEffect.LJLL();
        if (strLJLL != null) {
            boolValueOf = Boolean.valueOf(u.LJJIIJZLJL(strLJLL, "makeup", false));
        } else {
            boolValueOf = null;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0), "is_makeup");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C500260Jjc.LJIIZILJ(dataChannel))) ? 1 : 0), "is_anchor");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    @Override // X.InterfaceC771640UOs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.bytedance.ies.sdk.datachannel.DataChannel r6, com.bytedance.android.livesdkapi.depend.model.LiveEffect r7, java.lang.String r8, com.google.gson.n r9) {
        /*
            r5 = this;
            if (r7 == 0) goto L5e
            boolean r1 = r7.LLJJJ()
            r0 = 1
            if (r1 != r0) goto L5e
            X.0IjA r4 = X.C0IJT.LIZ(r8)
            r4.LJIJJLI(r6)
            r4.LJJIIJ(r9)
            X.0UC8 r0 = LJJIJIIJIL(r7)
            LJJIJIIJI(r4, r0)
            LJIILLIIL(r4)
            java.util.Set r0 = r9.LJJIJIL()
            java.util.Iterator r3 = r0.iterator()
        L25:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            com.google.gson.k r1 = r9.LJJIIZ(r2)
            boolean r0 = r1 instanceof com.google.gson.q
            if (r0 == 0) goto L49
            com.google.gson.q r1 = (com.google.gson.q) r1
            if (r1 == 0) goto L49
            java.lang.Object r0 = r1.LL
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L55
            java.lang.String r0 = r1.LJIL()
        L47:
            if (r0 != 0) goto L51
        L49:
            com.google.gson.k r0 = r9.LJJIIZ(r2)
            java.lang.String r0 = r0.toString()
        L51:
            r4.LJJII(r0, r2)
            goto L25
        L55:
            java.lang.String r0 = r1.toString()
            goto L47
        L5a:
            r4.LIZ()
            return
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UC4.LJIIJ(com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, com.google.gson.n):void");
    }

    public static void LJIJI(DataChannel dataChannel, String str, TreeMap treeMap, List list, boolean z) {
        String value;
        Object next;
        String name;
        Object next2;
        String sessionId;
        long effectId;
        String resourceId;
        List list2;
        boolean z2;
        boolean z3;
        String str2;
        C0U6H c0u6hLJZI;
        long jLongValue;
        C781670UlR c781670UlR;
        LiveEffect liveEffect;
        long effectId2;
        String resourceId2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            value = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (((LiveEffect) next).getSessionId().length() > 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveEffect liveEffect2 = (LiveEffect) next;
        if (liveEffect2 != null) {
            name = liveEffect2.getName();
        } else {
            name = null;
        }
        C20441214yg.LIZIZ("EffectMonitor#session", String.valueOf(name));
        Iterator it3 = list.iterator();
        while (true) {
            if (it3.hasNext()) {
                next2 = it3.next();
                if (((LiveEffect) next2).getSessionId().length() > 0) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        LiveEffect liveEffect3 = (LiveEffect) next2;
        String str3 = "";
        if (liveEffect3 == null || (sessionId = liveEffect3.getSessionId()) == null) {
            sessionId = "";
        }
        if ((!treeMap.isEmpty()) && !z && (c781670UlR = (C781670UlR) treeMap.get(0)) != null && (liveEffect = (LiveEffect) C13LP.LJJJLZIJ(c781670UlR.LIZ, list)) != null && (liveEffect.LJLIL() == C0U9E.TRENDING_TIP || liveEffect.LJLIL() == C0U9E.NO_RESULT_TIP)) {
            TreeMap treeMap2 = new TreeMap();
            for (Map.Entry entry : treeMap.entrySet()) {
                if (((Number) entry.getKey()).intValue() != 0) {
                    treeMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList5 = new ArrayList(list);
            ListProtector.remove(arrayList5, 0);
            for (Map.Entry entry2 : treeMap2.entrySet()) {
                arrayList.add(Integer.valueOf(((C781670UlR) entry2.getValue()).LIZ));
                LiveEffect liveEffect4 = (LiveEffect) C13LP.LJJJLZIJ(((C781670UlR) entry2.getValue()).LIZ, arrayList5);
                if (liveEffect4 != null) {
                    effectId2 = liveEffect4.getEffectId();
                } else {
                    effectId2 = 0;
                }
                arrayList2.add(Long.valueOf(effectId2));
                LiveEffect liveEffect5 = (LiveEffect) C13LP.LJJJLZIJ(((C781670UlR) entry2.getValue()).LIZ, arrayList5);
                if (liveEffect5 == null || (resourceId2 = liveEffect5.getResourceId()) == null) {
                    resourceId2 = "";
                }
                arrayList3.add(resourceId2);
            }
        } else {
            for (Map.Entry entry3 : treeMap.entrySet()) {
                if (!z || ((C781670UlR) entry3.getValue()).LIZ != 0) {
                    arrayList.add(Integer.valueOf(((C781670UlR) entry3.getValue()).LIZ + 1));
                    LiveEffect liveEffect6 = (LiveEffect) C13LP.LJJJLZIJ(((C781670UlR) entry3.getValue()).LIZ, list);
                    if (liveEffect6 != null) {
                        effectId = liveEffect6.getEffectId();
                    } else {
                        effectId = 0;
                    }
                    arrayList2.add(Long.valueOf(effectId));
                    LiveEffect liveEffect7 = (LiveEffect) C13LP.LJJJLZIJ(((C781670UlR) entry3.getValue()).LIZ, list);
                    if (liveEffect7 == null || (resourceId = liveEffect7.getResourceId()) == null) {
                        resourceId = "";
                    }
                    arrayList3.add(resourceId);
                    if (DataChannelGlobal.LLILZ.gg0(BroadcastSceneGlobalChannel.class) == EnumC768840UDy.MULTI_GUEST && dataChannel != null && (list2 = (List) dataChannel.gg0(MultiGuestUsedEffectChannel.class)) != null) {
                        Iterator it4 = list2.iterator();
                        if (it4.hasNext()) {
                            it4.next().getClass();
                            throw null;
                        }
                    }
                }
            }
        }
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            Long l = LJJIII.get(Long.valueOf(((Number) it5.next()).longValue()));
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            arrayList6.add(Long.valueOf(jLongValue));
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sticker_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(arrayList.toString(), "sticker_position");
        c474500IjALIZ.LJJII(arrayList2.toString(), "sticker_id_set");
        c474500IjALIZ.LJJII(LIZIZ, "effect_icon_type");
        c474500IjALIZ.LJJII(arrayList3.toString(), "resource_id_set");
        LiveEffect liveEffect8 = (LiveEffect) C13LP.LJJJLZIJ(0, list);
        if (liveEffect8 != null && (c0u6hLJZI = liveEffect8.LJZI()) != null) {
            value = c0u6hLJZI.getValue();
        }
        c474500IjALIZ.LJJII(value, "search_result_type");
        c474500IjALIZ.LJJII(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ry(), "link_id");
        if (!arrayList6.isEmpty()) {
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                if (((Number) it6.next()).longValue() == 184) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0), "if_contains_tiktok_favorite");
        if (!arrayList6.isEmpty()) {
            Iterator it7 = arrayList6.iterator();
            while (it7.hasNext()) {
                if (((Number) it7.next()).longValue() == 1222) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        } else {
            z3 = false;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0), "if_contains_ls_favorite");
        LJIIJJI(c474500IjALIZ);
        if (!z) {
            c474500IjALIZ.LJJII(str, "tab");
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (dataChannelGlobal.gg0(BroadcastSceneGlobalChannel.class) == EnumC768840UDy.MULTI_GUEST) {
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(arrayList4.isEmpty() ^ true)) ? 1 : 0), "is_same_effect_scene");
            c474500IjALIZ.LJJII(arrayList4.toString(), "same_effect_sticker_id_set");
        } else {
            c474500IjALIZ.LJJII(Integer.valueOf(LJIIJ ? 1 : 0), "is_same_effect_scene");
        }
        Map<String, String> map = LJJI;
        if (map != null && map.containsKey("enter_from")) {
            Map<String, String> map2 = LJJI;
            if (map2 != null && (str2 = map2.get("enter_from")) != null) {
                str3 = str2;
            }
            c474500IjALIZ.LJJII(str3, "enter_from");
        } else if (C500260Jjc.LJIJ(dataChannelGlobal)) {
            c474500IjALIZ.LJJII(C0IUA.LJIJI, "enter_from");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_shortcut_panel");
        c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
        c474500IjALIZ.LJJII(sessionId, "session_id");
        LJIILLIIL(c474500IjALIZ);
        c474500IjALIZ.LJJIJL();
    }

    public static void LJJIIJ(long j, DataChannel dataChannel, boolean z, boolean z2, boolean z3, String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sticker_panel_duration");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(j), "use_time");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0), "is_shortcut_panel");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0), "is_live_take_default");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_empty");
        LJIIJJI(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "close_method");
        Map<String, String> map = LJJI;
        if (map != null && map.containsKey("enter_from")) {
            Map<String, String> map2 = LJJI;
            if (map2 == null || (str2 = map2.get("enter_from")) == null) {
                str2 = "";
            }
            c474500IjALIZ.LJJII(str2, "enter_from");
        } else if (C500260Jjc.LJIJ(DataChannelGlobal.LLILZ)) {
            c474500IjALIZ.LJJII(C0IUA.LJIJI, "enter_from");
        }
        c474500IjALIZ.LIZ();
    }

    public static final void LJJIIJZLJL(int i, int i2, long j, Integer num, String str, String str2) {
        C0IUQ.LIZ(new C0UCG(i, i2, j, num, str, str2));
    }

    public static void LJJ(DataChannel dataChannel, LiveEffect liveEffect, boolean z, long j, long j2, Integer num, String str, String str2, String str3) {
        String str4;
        int iIntValue;
        String str5 = str;
        String strLJLL = str2;
        if (liveEffect == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_sticker_download_time");
        c474500IjALIZ.LJIJJLI(dataChannel);
        C767250U7v.LJIIJ(c474500IjALIZ, liveEffect);
        c474500IjALIZ.LJJI(true);
        if (strLJLL == null) {
            strLJLL = liveEffect.LJLL();
        }
        c474500IjALIZ.LJJII(strLJLL, "tab");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_finish_download");
        c474500IjALIZ.LJJII(Long.valueOf(j), "use_time");
        if (!C500260Jjc.LJIIZILJ(dataChannel) && !C500260Jjc.LJJIJLIJ()) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str4 = "1";
        }
        c474500IjALIZ.LJJII(str4, "is_anchor");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "file_size");
        c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(liveEffect.LLJJ(), ",", null, null, 0, null, null, 62), "algorithm_type");
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, Scene.SCENE_SERVICE);
        }
        c474500IjALIZ.LJJIIZ(Boolean.valueOf(LJIIZILJ.containsKey(liveEffect.getResourceId())), "is_preload", AFwS199S0000000_12.get$arr$(223));
        AwS55S0010000_12 awS55S0010000_12 = new AwS55S0010000_12(z, 6);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        c474500IjALIZ.LJJIIZ(Integer.valueOf(iIntValue), "error_code", awS55S0010000_12);
        AwS55S0010000_12 awS55S0010000_122 = new AwS55S0010000_12(z, 7);
        if (str5 == null) {
            str5 = "";
        }
        c474500IjALIZ.LJJIIZ(str5, "error_description", awS55S0010000_122);
        c474500IjALIZ.LIZ();
    }
}
