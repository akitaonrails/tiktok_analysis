package X;

import Y.AfS153S0200000_17;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.performance.FacialGiftTrackingSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fgD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136470fgD implements InterfaceC1139780flY {
    public final /* synthetic */ C1136540fgK LIZ;

    @Override // X.InterfaceC1139780flY
    public final void LIZ() {
        C20441214yg.LJIIIZ("gift_sticker", "onCallRenderCommand");
        C1136540fgK c1136540fgK = this.LIZ;
        ConcurrentHashSet<Long> concurrentHashSet = C1136460fgC.LJI;
        c1136540fgK.LJJ = !concurrentHashSet.contains(Long.valueOf(c1136540fgK.LIZIZ));
        concurrentHashSet.add(Long.valueOf(this.LIZ.LIZIZ));
        C1136540fgK c1136540fgK2 = this.LIZ;
        c1136540fgK2.LJJIII = C158B.LIZ();
        c1136540fgK2.LJJIIJ = System.currentTimeMillis();
        ConcurrentHashMap<String, Integer> concurrentHashMap = c1136540fgK2.LJJIJIIJIL;
        C1136460fgC.LIZ.getClass();
        concurrentHashMap.put("render_command", Integer.valueOf(C1136460fgC.LJII()));
        C1136540fgK c1136540fgK3 = this.LIZ;
        Map mapLJI = C1136460fgC.LJI(c1136540fgK3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(mapLJI);
        linkedHashMap.putAll(C1136460fgC.LJIIL(c1136540fgK3));
        linkedHashMap.putAll(C1136460fgC.LJFF(c1136540fgK3));
        linkedHashMap.put("sticker_asset_variant", C1136460fgC.LJ(c1136540fgK3.LJI));
        linkedHashMap.put("sticker_asset_variant_reason", Integer.valueOf(c1136540fgK3.LJII));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_sticker_render_command");
        sbLIZ.append(C1136460fgC.LJIILIIL());
        C1136460fgC.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ), C500260Jjc.LLD(linkedHashMap));
    }

    @Override // X.InterfaceC1139780flY
    public final void LIZLLL() {
        this.LIZ.LJIILL = C158B.LIZ();
    }

    @Override // X.InterfaceC1139780flY
    public final void LJII() throws JSONException {
        C1136540fgK c1136540fgK;
        Long lLJIIJJI;
        C20441214yg.LJIIIZ("gift_sticker", "onFirstFrame");
        C1136540fgK c1136540fgK2 = this.LIZ;
        c1136540fgK2.LJJIIJZLJL = C158B.LIZ();
        c1136540fgK2.LJJIIZ = System.currentTimeMillis();
        ConcurrentHashMap<String, Integer> concurrentHashMap = c1136540fgK2.LJJIJIIJIL;
        C1136460fgC c1136460fgC = C1136460fgC.LIZ;
        c1136460fgC.getClass();
        concurrentHashMap.put("play_start", Integer.valueOf(C1136460fgC.LJII()));
        C1136540fgK c1136540fgK3 = this.LIZ;
        Map mapLJI = C1136460fgC.LJI(c1136540fgK3);
        C1136460fgC.LIZLLL(c1136540fgK3, false);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c1136540fgK3.LJJJ);
        linkedHashMap.putAll(mapLJI);
        linkedHashMap.putAll(C1136460fgC.LJIIL(c1136540fgK3));
        linkedHashMap.putAll(C1136460fgC.LJFF(c1136540fgK3));
        linkedHashMap.putAll(C1136460fgC.LJIIJ(c1136540fgK3));
        linkedHashMap.put("sticker_asset_variant", C1136460fgC.LJ(c1136540fgK3.LJI));
        linkedHashMap.put("sticker_asset_variant_reason", Integer.valueOf(c1136540fgK3.LJII));
        linkedHashMap.put("first_frame_timestamp", Long.valueOf(c1136540fgK3.LJJIIJZLJL));
        linkedHashMap.put("dequeue_to_first_frame_duration", Long.valueOf(c1136540fgK3.LJJIIJZLJL - c1136540fgK3.LJJII));
        C1135180fe8.LIZJ(linkedHashMap);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_sticker_play_start");
        sbLIZ.append(C1136460fgC.LJIILIIL());
        C1136460fgC.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ), C500260Jjc.LLD(linkedHashMap));
        C1136540fgK c1136540fgK4 = this.LIZ;
        C1136460fgC.LJIJ(c1136460fgC, c1136540fgK4.LIZ, c1136540fgK4, 0L, 4);
        C1136540fgK c1136540fgK5 = this.LIZ;
        Long lLJIIJJI2 = C1136460fgC.LJIIJJI(c1136540fgK5);
        if (lLJIIJJI2 != null && lLJIIJJI2.longValue() != 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_id", c1136540fgK5.LIZ);
            jSONObject.put("anchor_latency", c1136540fgK5.LJJIIJZLJL - c1136540fgK5.LJIILJJIL);
            jSONObject.put("anchor_render_timestamp", c1136540fgK5.LJJIIJZLJL);
            jSONObject.put("anchor_receive_timestamp", c1136540fgK5.LJIILJJIL);
            jSONObject.put("cross_screen_order_id", C1136460fgC.LJIIIIZZ(c1136540fgK5));
            jSONObject.put("cross_screen_role", lLJIIJJI2.longValue());
            jSONObject.put("cross_screen_selected_effect_id", c1136540fgK5.LJIIIIZZ);
            jSONObject.put("render_timestamp", c1136540fgK5.LJJIIJZLJL);
            User user = c1136540fgK5.LIZJ;
            jSONObject.put("gift_sender_uid", user != null ? user.getId() : 0L);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(UserService.getInstance().user().getCurrentUserId());
            sbLIZ2.append('_');
            sbLIZ2.append(C158B.LIZ());
            jSONObject.put("cross_screen_first_frame_sei_id", C2188811AlT.LIZIZ(sbLIZ2));
            jSONObject.put("repeat_count", c1136540fgK5.LJIIL);
            C0UUZ.LIZ(jSONObject);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(C1136460fgC.LJIL(jSONObject));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("New Writing SEI data: ");
            sbLIZ3.append(jSONObject);
            C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ3));
            C11NZ.LJJJJLL(0L, 3L, 0L, 100L, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS153S0200000_17(linkedHashMap2, jSONObject, 20));
        }
        if (FacialGiftTrackingSettings.INSTANCE.isEnabled()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("log_id", c1136540fgK5.LIZ);
            jSONObject2.put("anchor_latency", c1136540fgK5.LJJIIJZLJL - c1136540fgK5.LJIILJJIL);
            jSONObject2.put("anchor_render_timestamp", c1136540fgK5.LJJIIJZLJL);
            jSONObject2.put("anchor_receive_timestamp", c1136540fgK5.LJIILJJIL);
            C0UUZ.LIZ(jSONObject2);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Old Writing SEI data: ");
            sbLIZ4.append(jSONObject2);
            C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ4));
            AbstractC1273900jFs abstractC1273900jFsLJIIIZ = C1136460fgC.LJIIIZ();
            Integer numValueOf = abstractC1273900jFsLJIIIZ != null ? Integer.valueOf(abstractC1273900jFsLJIIIZ.LJJIZ("live_sticker_gift_sei", false, false, "1610665996", 1, jSONObject2)) : null;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("LiveCore.addSeiField result: ");
            sbLIZ5.append(numValueOf);
            C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ5));
            C1128450fTH.LIZ.We1("live_sticker_gift_sei", new LinkedHashMap(C1136460fgC.LJIL(jSONObject2)));
        } else {
            C20441214yg.LIZIZ("StickerGiftTracker", "Facial gift event tracking disabled");
        }
        User user2 = this.LIZ.LIZJ;
        long id = user2 != null ? user2.getId() : 0L;
        if (id != UserService.getInstance().user().getCurrentUserId() || (lLJIIJJI = C1136460fgC.LJIIJJI((c1136540fgK = this.LIZ))) == null || lLJIIJJI.longValue() == 0) {
            return;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("sticker_anchor_latency", Long.valueOf(c1136540fgK.LJJIIJZLJL - c1136540fgK.LJIILJJIL));
        linkedHashMap3.put("sticker_stream_latency", 0L);
        linkedHashMap3.put("creator_receive_timestamp", Long.valueOf(c1136540fgK.LJIILJJIL));
        linkedHashMap3.put("room_id", Long.valueOf(room != null ? room.getId() : 0L));
        linkedHashMap3.put("anchor_id", Long.valueOf(room != null ? room.getOwnerUserId() : 0L));
        linkedHashMap3.put("gift_sender_uid", Long.valueOf(id));
        Long lLJIIIIZZ = C1136460fgC.LJIIIIZZ(c1136540fgK);
        linkedHashMap3.put("cross_screen_order_id", Long.valueOf(lLJIIIIZZ != null ? lLJIIIIZZ.longValue() : 0L));
        linkedHashMap3.put("cross_screen_role", lLJIIJJI);
        linkedHashMap3.put("cross_screen_selected_effect_id", Long.valueOf(c1136540fgK.LJIIIIZZ));
        linkedHashMap3.put("show_timestamp", Long.valueOf(c1136540fgK.LJJIIJZLJL));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(UserService.getInstance().user().getCurrentUserId());
        sbLIZ6.append('_');
        sbLIZ6.append(C158B.LIZ());
        linkedHashMap3.put("cross_screen_unique_sei_id", C2188811AlT.LIZIZ(sbLIZ6));
        linkedHashMap3.put("is_local", 1);
        linkedHashMap3.put("repeat_count", Integer.valueOf(c1136540fgK.LJIIL));
        C1135180fe8.LIZJ(linkedHashMap3);
        C1136460fgC.LJIJJLI("gift_cross_screen_play_start_self", C500260Jjc.LLD(linkedHashMap3));
    }

    @Override // X.InterfaceC1139780flY
    public final void LJIIIIZZ() {
        C20441214yg.LJIIIZ("gift_sticker", "onStickerMsgEnqueue");
        this.LIZ.LJJIFFI = C158B.LIZ();
        C1136460fgC c1136460fgC = C1136460fgC.LIZ;
        C1136540fgK c1136540fgK = this.LIZ;
        c1136460fgC.getClass();
        if (C2640010k.LIZIZ()) {
            C1140740fn6.LIZ().getClass();
            if (C781880Ulm.LIZLLL) {
                return;
            }
        }
        Map mapLJI = C1136460fgC.LJI(c1136540fgK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c1136540fgK.LJJJ);
        linkedHashMap.putAll(mapLJI);
        linkedHashMap.putAll(C1136460fgC.LJIIL(c1136540fgK));
        linkedHashMap.put("enqueue_start_time", Long.valueOf(c1136540fgK.LJJIFFI));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_sticker_render_enqueue");
        sbLIZ.append(C1136460fgC.LJIILIIL());
        C1136460fgC.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ), C500260Jjc.LLD(linkedHashMap));
    }

    @Override // X.InterfaceC1139780flY
    public final void LJIIJJI() {
        C20441214yg.LJIIIZ("gift_sticker", "onStickerMessageDequeue");
        this.LIZ.LJJII = C158B.LIZ();
        C1136460fgC c1136460fgC = C1136460fgC.LIZ;
        C1136540fgK c1136540fgK = this.LIZ;
        c1136460fgC.getClass();
        if (C2640010k.LIZIZ()) {
            C1140740fn6.LIZ().getClass();
            if (C781880Ulm.LIZLLL) {
                return;
            }
        }
        Map mapLJI = C1136460fgC.LJI(c1136540fgK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c1136540fgK.LJJJ);
        linkedHashMap.putAll(mapLJI);
        linkedHashMap.putAll(C1136460fgC.LJIIL(c1136540fgK));
        linkedHashMap.putAll(C1136460fgC.LJFF(c1136540fgK));
        linkedHashMap.put("dequeue_start_time", Long.valueOf(c1136540fgK.LJJII));
        linkedHashMap.put("in_render_queue_dur", Long.valueOf(c1136540fgK.LJJII - c1136540fgK.LJJIFFI));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_sticker_render_dequeue");
        sbLIZ.append(C1136460fgC.LJIILIIL());
        C1136460fgC.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ), C500260Jjc.LLD(linkedHashMap));
    }

    @Override // X.InterfaceC1139780flY
    public final void LJIIL() {
        this.LIZ.LJJI = true;
    }

    @Override // X.InterfaceC1139780flY
    public final void LJIILJJIL() {
        this.LIZ.LJIJJ = C158B.LIZ();
    }

    @Override // X.InterfaceC1139780flY
    public final void LJIJI() {
        String strLJLLL;
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL;
        C20441214yg.LJIIIZ("gift_sticker", "onPlayEndSuccessfully");
        C1136540fgK c1136540fgK = this.LIZ;
        c1136540fgK.LJJIJIIJI = C158B.LIZ();
        ConcurrentHashMap<String, Integer> concurrentHashMap = c1136540fgK.LJJIJIIJIL;
        C1136460fgC.LIZ.getClass();
        concurrentHashMap.put("play_end", Integer.valueOf(C1136460fgC.LJII()));
        C1136540fgK c1136540fgK2 = this.LIZ;
        C1136460fgC.LIZLLL(c1136540fgK2, true);
        if (!c1136540fgK2.LJJIZ) {
            try {
                AbstractC1273900jFs abstractC1273900jFsLJIIIZ = C1136460fgC.LJIIIZ();
                if (abstractC1273900jFsLJIIIZ == null || (interfaceC1268640j7OLJIIL = abstractC1273900jFsLJIIIZ.LJIIL()) == null || (strLJLLL = interfaceC1268640j7OLJIIL.LJLLL()) == null) {
                    strLJLLL = "";
                }
                c1136540fgK2.LJJIJLIJ = new JSONObject(strLJLLL);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_sticker_play_end");
        sbLIZ.append(C1136460fgC.LJIILIIL());
        C1136460fgC.LJIILLIIL(C2188811AlT.LIZIZ(sbLIZ), c1136540fgK2);
    }

    @Override // X.InterfaceC1139780flY
    public final void onPlayEnd() {
        C1136460fgC c1136460fgC = C1136460fgC.LIZ;
        C1136540fgK c1136540fgK = this.LIZ;
        c1136460fgC.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_sticker_play_status");
        sbLIZ.append(C1136460fgC.LJIILIIL());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (c1136540fgK.LJIILIIL != 1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(" error ");
            sbLIZ2.append(c1136540fgK.LJIILIIL);
            C20441214yg.LJ("gift_sticker", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1136460fgC.LJIILLIIL(strLIZIZ, c1136540fgK);
    }

    public C1136470fgD(C1136540fgK c1136540fgK) {
        this.LIZ = c1136540fgK;
    }

    @Override // X.InterfaceC1139780flY
    public final void LIZJ(boolean z) {
        this.LIZ.LJJIL = z;
    }

    @Override // X.InterfaceC1139780flY
    public final void LJFF(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSecondFrame, isUseFirstFrameTs = ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("gift_sticker", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C1136540fgK c1136540fgK = this.LIZ;
            c1136540fgK.getClass();
            c1136540fgK.LJJIIZI = c1136540fgK.LJJIIJZLJL;
            c1136540fgK.LJJIJ = c1136540fgK.LJJIIZ;
            return;
        }
        C1136540fgK c1136540fgK2 = this.LIZ;
        c1136540fgK2.LJJIIZI = C158B.LIZ();
        c1136540fgK2.LJJIJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1139780flY
    public final void LJIIIZ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startAssetDownload isFromCache:");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("gift_sticker", C2188811AlT.LIZIZ(sbLIZ));
        C1136540fgK c1136540fgK = this.LIZ;
        c1136540fgK.LJIIZILJ = C158B.LIZ();
        c1136540fgK.LJIJI = z;
    }

    @Override // X.InterfaceC1139780flY
    public final void LJIIJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadStatus statusCode: ");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("gift_sticker", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.LJIILIIL = i;
    }

    @Override // X.InterfaceC1139780flY
    public final void LJIILIIL(C0T6Z c0t6z) {
        if (c0t6z == null) {
            return;
        }
        this.LIZ.LJJJ.putAll(c0t6z);
    }

    @Override // X.InterfaceC1139780flY
    public final void LJIIZILJ(boolean z) {
        this.LIZ.LJJIZ = z;
    }

    @Override // X.InterfaceC1139780flY
    public final void LJI(String str, String str2) {
        this.LIZ.LJJJ.put(str, str2);
    }

    @Override // X.InterfaceC1139780flY
    public final void LJIILL(long j, boolean z) {
        C1136540fgK c1136540fgK = this.LIZ;
        c1136540fgK.LJIIIIZZ = j;
        c1136540fgK.LJIIIZ = z;
    }

    @Override // X.InterfaceC1139780flY
    public final void LJIILLIIL(int i, int i2) {
        int i3;
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.LIZ.LJJIJIIJIL;
        if (i == 3) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        concurrentHashMap.put("ttlh_receive", Integer.valueOf(i3));
        C1136460fgC c1136460fgC = C1136460fgC.LIZ;
        C1136540fgK c1136540fgK = this.LIZ;
        c1136460fgC.getClass();
        Map mapLJI = C1136460fgC.LJI(c1136540fgK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(mapLJI);
        linkedHashMap.putAll(C1136460fgC.LJIIL(c1136540fgK));
        linkedHashMap.putAll(C1136460fgC.LJFF(c1136540fgK));
        linkedHashMap.put("sticker_asset_variant", C1136460fgC.LJ(c1136540fgK.LJI));
        linkedHashMap.put("sticker_asset_variant_reason", Integer.valueOf(c1136540fgK.LJII));
        linkedHashMap.put("effect_call_result", Integer.valueOf(i2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gift_sticker_ttlh_receive");
        sbLIZ.append(C1136460fgC.LJIILIIL());
        C1136460fgC.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ), C500260Jjc.LLD(linkedHashMap));
    }

    @Override // X.InterfaceC1139780flY
    public final void LJ(boolean z, boolean z2, boolean z3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endAlgoModelDownload isSuccess:");
        sbLIZ.append(z);
        sbLIZ.append(", isFromCache:");
        sbLIZ.append(z2);
        sbLIZ.append(", isRetry:");
        sbLIZ.append(z3);
        C20441214yg.LJIIIZ("gift_sticker", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.LJIJJLI = C158B.LIZ();
        C1136540fgK c1136540fgK = this.LIZ;
        c1136540fgK.LJIL = z3 | c1136540fgK.LJIL;
        C1136460fgC.LIZ.getClass();
        if (C2640010k.LIZIZ()) {
            C1140740fn6.LIZ().getClass();
            if (C781880Ulm.LIZLLL) {
                return;
            }
        }
        Map mapLJI = C1136460fgC.LJI(c1136540fgK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(mapLJI);
        linkedHashMap.putAll(C1136460fgC.LJIIL(c1136540fgK));
        linkedHashMap.put("is_success", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("is_use_cache", Integer.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("process_duration", Long.valueOf(c1136540fgK.LJIJJLI - c1136540fgK.LJIJJ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("gift_sticker_algorithm_download");
        sbLIZ2.append(C1136460fgC.LJIILIIL());
        C1136460fgC.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2), C500260Jjc.LLD(linkedHashMap));
    }

    @Override // X.InterfaceC1139780flY
    public final void LJIJ(String str, boolean z, boolean z2, boolean z3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endAssetDownload isSuccess:");
        sbLIZ.append(z);
        sbLIZ.append(", logEvent:");
        sbLIZ.append(z2);
        sbLIZ.append(", isRetry:");
        sbLIZ.append(z3);
        sbLIZ.append(", errorMsg:");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("gift_sticker", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.LJIJ = C158B.LIZ();
        C1136540fgK c1136540fgK = this.LIZ;
        c1136540fgK.LJIL = z3 | c1136540fgK.LJIL;
        if (z2) {
            C1136460fgC.LIZ.getClass();
            if (C2640010k.LIZIZ()) {
                C1140740fn6.LIZ().getClass();
                if (C781880Ulm.LIZLLL) {
                    return;
                }
            }
            Map mapLJI = C1136460fgC.LJI(c1136540fgK);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(mapLJI);
            linkedHashMap.putAll(C1136460fgC.LJIIL(c1136540fgK));
            linkedHashMap.put("is_success", Integer.valueOf(z ? 1 : 0));
            linkedHashMap.put("error_msg", str);
            linkedHashMap.put("is_use_cache", Integer.valueOf(c1136540fgK.LJIJI ? 1 : 0));
            linkedHashMap.put("process_duration", Long.valueOf(c1136540fgK.LJIJ - c1136540fgK.LJIIZILJ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("gift_sticker_resource_download");
            sbLIZ2.append(C1136460fgC.LJIILIIL());
            C1136460fgC.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2), C500260Jjc.LLD(linkedHashMap));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    @Override // X.InterfaceC1139780flY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r7, com.bytedance.android.livesdk.gift.assets.AssetsModel r8, boolean r9, boolean r10, boolean r11) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "endAssetsModelFetch, isSuccess:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " ,isFromCache:"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", logEvent:"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", isRetry:"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "gift_sticker"
            X.C20441214yg.LJIIIZ(r0, r1)
            X.0fgK r2 = r6.LIZ
            long r0 = X.C158B.LIZ()
            r2.LJIILLIIL = r0
            X.0fgK r5 = r6.LIZ
            boolean r0 = r5.LJIL
            r11 = r11 | r0
            r5.LJIL = r11
            if (r10 == 0) goto L54
            X.0fgC r0 = X.C1136460fgC.LIZ
            r0.getClass()
            boolean r0 = X.C2640010k.LIZIZ()
            if (r0 == 0) goto L61
            X.0fYg r0 = X.C1140740fn6.LIZ()
            r0.getClass()
            boolean r0 = X.C781880Ulm.LIZLLL
            if (r0 == 0) goto L61
        L54:
            if (r8 == 0) goto L60
            X.0fgK r1 = r6.LIZ
            int r0 = r8.stickerAssetVariant
            r1.LJI = r0
            int r0 = r8.stickerAssetVariantReason
            r1.LJII = r0
        L60:
            return
        L61:
            java.util.Map r0 = X.C1136460fgC.LJI(r5)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r4.putAll(r0)
            java.util.Map r0 = X.C1136460fgC.LJIIL(r5)
            r4.putAll(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "is_success"
            r4.put(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "is_use_cache"
            r4.put(r0, r1)
            long r2 = r5.LJIILLIIL
            long r0 = r5.LJIILL
            long r2 = r2 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "process_duration"
            r4.put(r0, r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "gift_sticker_assets_fetch"
            r1.append(r0)
            java.lang.String r0 = X.C1136460fgC.LJIILIIL()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.util.Map r0 = X.C500260Jjc.LLD(r4)
            X.C1136460fgC.LJIJJLI(r1, r0)
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136470fgD.LIZIZ(boolean, com.bytedance.android.livesdk.gift.assets.AssetsModel, boolean, boolean, boolean):void");
    }
}
