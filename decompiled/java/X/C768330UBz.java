package X;

import android.os.Handler;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768330UBz implements C0U58 {
    public static C768320UBy LIZIZ;
    public static C768320UBy LIZJ;
    public static Long LJ;
    public static final C768330UBz LIZ = new C768330UBz();
    public static final C0UC0 LIZLLL = new C0UC0();

    @Override // X.C0U58
    public final void LJFF(LiveEffect liveEffect) {
    }

    @Override // X.C0U58
    public final void release() {
        LJ = null;
    }

    @Override // X.C0U58
    public final void LIZ() {
        C768320UBy c768320UBy = LIZIZ;
        if (c768320UBy != null && !Intrinsics.LJFF(c768320UBy, LIZJ)) {
            C768300UBw.LJ(LIZIZ, true);
            long jLIZ = C158B.LIZ();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_background_use_time");
            LJIIIIZZ(c474500IjALIZ, LIZIZ);
            C768320UBy c768320UBy2 = LIZIZ;
            c474500IjALIZ.LJJII(Long.valueOf((jLIZ - (c768320UBy2 != null ? c768320UBy2.LJI : jLIZ)) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "use_time");
            C768320UBy c768320UBy3 = LIZIZ;
            if (c768320UBy3 != null) {
                LJII(c474500IjALIZ, c768320UBy3.LIZ);
            }
            c474500IjALIZ.LIZ();
        }
        if (LIZIZ != null && LIZJ == null) {
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LIZIZ("");
            C1276840jKc.LIZJ("");
        }
        C768300UBw.LJIILIIL(8L);
        C768300UBw.LIZIZ(8L);
        LIZIZ = LIZJ;
        LIZJ = null;
    }

    public static C768320UBy LJIIIZ(LiveEffect liveEffect) {
        Integer numValueOf;
        long j;
        long effectId = liveEffect.getEffectId();
        String resourceId = liveEffect.getResourceId();
        String name = liveEffect.getName();
        String broadcastScene = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
        Integer numLJJIJL = liveEffect.LJJIJL();
        if (numLJJIJL != null) {
            numValueOf = Integer.valueOf(numLJJIJL.intValue() + 1);
        } else {
            numValueOf = null;
        }
        String strValueOf = String.valueOf(numValueOf);
        if (liveEffect.LJJJJLL()) {
            j = 1;
        } else {
            j = 0;
        }
        return new C768320UBy(effectId, resourceId, name, broadcastScene, strValueOf, j);
    }

    @Override // X.C0U58
    public final void LIZIZ(LiveEffect liveEffect) {
        if (LIZIZ == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_background_close");
        LJIIIIZZ(c474500IjALIZ, LIZIZ);
        c474500IjALIZ.LIZ();
    }

    @Override // X.C0U58
    public final void LIZJ(int i) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_background_panel_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "use_time");
        c474500IjALIZ.LIZ();
    }

    @Override // X.C0U58
    public final void LJ(LiveEffect liveEffect) {
        C768320UBy c768320UByLJIIIZ;
        C0UC0 c0uc0 = LIZLLL;
        C01GW c01gw = C783270Uo1.LIZLLL;
        ((Handler) c01gw.getValue()).removeCallbacks(c0uc0);
        if (liveEffect != null) {
            c768320UByLJIIIZ = LJIIIZ(liveEffect);
        } else {
            c768320UByLJIIIZ = null;
        }
        c0uc0.LL = c768320UByLJIIIZ;
        if (liveEffect != null) {
            C786410Ut5.LJLIIL(30000L, (Handler) c01gw.getValue(), c0uc0);
        }
    }

    @Override // X.C0U58
    public final void LJI(LiveEffect liveEffect) {
        C768320UBy c768320UByLJIIIZ;
        Long lValueOf;
        String resourceId;
        Long lValueOf2 = null;
        if (liveEffect != null) {
            c768320UByLJIIIZ = LJIIIZ(liveEffect);
        } else {
            c768320UByLJIIIZ = null;
        }
        LIZJ = c768320UByLJIIIZ;
        if (c768320UByLJIIIZ != null) {
            lValueOf = Long.valueOf(c768320UByLJIIIZ.LJI);
        } else {
            lValueOf = null;
        }
        LJ = lValueOf;
        C768320UBy c768320UBy = LIZJ;
        if (c768320UBy == null || Intrinsics.LJFF(LIZIZ, c768320UBy)) {
            return;
        }
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        if (liveEffect != null) {
            lValueOf2 = Long.valueOf(liveEffect.getEffectId());
        }
        String strValueOf = String.valueOf(lValueOf2);
        c1276840jKc.getClass();
        C1276840jKc.LIZIZ(strValueOf);
        if (liveEffect == null || (resourceId = liveEffect.getResourceId()) == null) {
            resourceId = "";
        }
        C1276840jKc.LIZJ(resourceId);
        C768300UBw.LJ(LIZJ, false);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_background_select");
        LJIIIIZZ(c474500IjALIZ, LIZJ);
        LiveEffect liveEffect2 = (LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr(C0UD4.LIZIZ));
        if (liveEffect2 != null) {
            c474500IjALIZ.LJJII(Long.valueOf(liveEffect2.getEffectId()), "concurrent_sticker_id");
            c474500IjALIZ.LJJII(liveEffect2.getResourceId(), "concurrent_resource_id");
            c474500IjALIZ.LJJII(liveEffect2.getName(), "concurrent_sticker_name");
        }
        if (liveEffect != null) {
            LJII(c474500IjALIZ, liveEffect.getEffectId());
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJII(C474500IjA c474500IjA, long j) {
        Boolean bool;
        String str;
        String str2;
        C767640U9i c767640U9i;
        LiveEffect liveEffect;
        C767630U9h.LL.getClass();
        DataChannel dataChannel = C767630U9h.LLILLJJLI;
        Boolean boolValueOf = null;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(C755530TkN.class);
        } else {
            bool = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(bool);
        boolean z = false;
        if (zLJJJI) {
            C767640U9i c767640U9i2 = C767630U9h.LLILZLL;
            if (c767640U9i2 != null) {
                boolValueOf = Boolean.valueOf(c767640U9i2.LJFF);
            }
            if (C500260Jjc.LJJJI(boolValueOf) && (c767640U9i = C767630U9h.LLILZLL) != null && (liveEffect = c767640U9i.LIZ) != null && j == liveEffect.getEffectId()) {
                z = true;
            }
        }
        Pair pair = new Pair(Boolean.valueOf(zLJJJI), Boolean.valueOf(z));
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pair.getSecond()).booleanValue();
        if (zBooleanValue) {
            str = "special_icon";
        } else {
            str = "normal_icon";
        }
        c474500IjA.LJJII(str, "effect_icon_type");
        if (zBooleanValue2) {
            str2 = "animation";
        } else {
            str2 = "normal";
        }
        c474500IjA.LJJII(str2, "method");
    }

    public static void LJIIIIZZ(C474500IjA c474500IjA, C768320UBy c768320UBy) {
        String str;
        String str2;
        Long lValueOf;
        String str3 = null;
        if (c768320UBy != null) {
            str = c768320UBy.LJ;
        } else {
            str = null;
        }
        c474500IjA.LJJII(str, "impr_position");
        if (c768320UBy != null) {
            str2 = c768320UBy.LIZIZ;
        } else {
            str2 = null;
        }
        c474500IjA.LJJII(str2, "resource_id");
        if (c768320UBy != null) {
            lValueOf = Long.valueOf(c768320UBy.LIZ);
        } else {
            lValueOf = null;
        }
        c474500IjA.LJJII(lValueOf, "sticker_id");
        if (c768320UBy != null) {
            str3 = c768320UBy.LIZJ;
        }
        c474500IjA.LJJII(str3, "sticker_name");
    }

    @Override // X.C0U58
    public final void LIZLLL(TreeMap<Integer, C781670UlR> treeMap, List<? extends LiveEffect> list, Boolean bool) {
        String str;
        long effectId;
        String resourceId;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<Integer, C781670UlR> entry : treeMap.entrySet()) {
            arrayList.add(Integer.valueOf(entry.getValue().LIZ + 1));
            LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLZIJ(entry.getValue().LIZ, list);
            if (liveEffect != null) {
                effectId = liveEffect.getEffectId();
            } else {
                effectId = 0;
            }
            arrayList2.add(Long.valueOf(effectId));
            LiveEffect liveEffect2 = (LiveEffect) C13LP.LJJJLZIJ(entry.getValue().LIZ, list);
            if (liveEffect2 == null || (resourceId = liveEffect2.getResourceId()) == null) {
                resourceId = "";
            }
            arrayList3.add(resourceId);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_background_show");
        c474500IjALIZ.LJJII(arrayList.toString(), "sticker_position");
        c474500IjALIZ.LJJII(arrayList2.toString(), "sticker_id_set");
        c474500IjALIZ.LJJII(arrayList3.toString(), "resource_id_set");
        if (C176600m4.LIZIZ(bool)) {
            str = "special_icon";
        } else {
            str = "normal_icon";
        }
        c474500IjALIZ.LJJII(str, "effect_icon_type");
        c474500IjALIZ.LIZ();
    }
}
