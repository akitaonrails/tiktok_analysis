package X;

import Y.ARunnableS117S0100000_17;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectPerfMetricsSetting;
import com.bytedance.android.livesdk.livesetting.gift.StickerGiftTimeoutSettings;
import com.bytedance.android.livesdk.livesetting.performance.FacialGiftTrackingSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136460fgC {
    public static Handler LJIIIIZZ;
    public static final C1136460fgC LIZ = new C1136460fgC();
    public static final List<C1132910faT> LIZIZ = new ArrayList();
    public static final ConcurrentHashSet<String> LIZJ = new ConcurrentHashSet<>();
    public static final List<C1136540fgK> LIZLLL = new ArrayList();
    public static final List<Pair<String, Long>> LJ = new ArrayList();
    public static final Object LJFF = new Object();
    public static final ConcurrentHashSet<Long> LJI = new ConcurrentHashSet<>();
    public static final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public static final C444201o8 LJIIIZ = new InterfaceC914420Zu4() { // from class: X.01o8
        @Override // X.InterfaceC914420Zu4
        public final void LIZ(String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRemoved, businessId: ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC914420Zu4
        public final void LIZIZ(String str, Map<String, String> map) {
            if (!Intrinsics.LJFF(str, "live_cross_screen_first_frame_sei") || map.isEmpty()) {
                return;
            }
            try {
                C189200o6.m2constructorimpl(C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C444101o7(map, null), 3));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    };
    public static final C444001o6 LJIIJ = new InterfaceC914420Zu4() { // from class: X.01o6
        @Override // X.InterfaceC914420Zu4
        public final void LIZ(String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRemoved, businessId: ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC914420Zu4
        public final void LIZIZ(String str, Map<String, String> map) {
            if (Intrinsics.LJFF(str, "live_sticker_gift_sei")) {
                C1136460fgC c1136460fgC = C1136460fgC.LIZ;
                c1136460fgC.getClass();
                if (!map.isEmpty()) {
                    try {
                        C189200o6.m2constructorimpl(C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C443901o5(map, c1136460fgC, null), 2));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
    };

    public static String LJ(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "unknown" : "fallback" : "downgrade" : "normal";
    }

    public static AbstractC1273900jFs LJIIIZ() {
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        if (interfaceC769940UIe != null) {
            return interfaceC769940UIe.getLiveCore();
        }
        return null;
    }

    public static int LJII() {
        InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI;
        AbstractC1273900jFs abstractC1273900jFsLJIIIZ = LJIIIZ();
        return (abstractC1273900jFsLJIIIZ == null || (interfaceC1268690j7TLJIJJLI = abstractC1273900jFsLJIIIZ.LJIJJLI()) == null || interfaceC1268690j7TLJIJJLI.M3() != 3) ? 0 : 1;
    }

    public static String LJIILIIL() {
        return C2640010k.LIZIZ() ? "_anchor" : "_guest";
    }

    public static double LIZ(List list) {
        int i;
        double d;
        try {
            synchronized (list) {
                try {
                    Iterator it2 = ((ArrayList) list).iterator();
                    i = 0;
                    d = 0.0d;
                    while (it2.hasNext()) {
                        double dDoubleValue = ((Number) it2.next()).doubleValue();
                        if (Double.isNaN(dDoubleValue)) {
                            C1AF0.LJFF(new RuntimeException() { // from class: X.0fi9
                                public static final int $stable = 8;
                            }, "Double is NaN");
                        } else {
                            d += dDoubleValue;
                            i++;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (i == 0) {
                return 0.0d;
            }
            return d / ((double) i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            RuntimeException runtimeException = new RuntimeException() { // from class: X.0fi9
                public static final int $stable = 8;
            };
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Message: ");
            sbLIZ.append(e.getMessage());
            C1AF0.LJFF(runtimeException, C2188811AlT.LIZIZ(sbLIZ));
            return 0.0d;
        }
    }

    public static C1136540fgK LIZIZ(InterfaceC1136020ffU interfaceC1136020ffU) {
        C1136540fgK c1136540fgK = new C1136540fgK();
        c1136540fgK.LJFF = C1135870ffF.LJII(interfaceC1136020ffU);
        c1136540fgK.LJ = interfaceC1136020ffU;
        c1136540fgK.LIZIZ = interfaceC1136020ffU.getGiftId();
        c1136540fgK.LIZJ = C1135870ffF.LJIJ(interfaceC1136020ffU.LJIILL());
        C1135870ffF.LJIJ(interfaceC1136020ffU.LIZJ());
        c1136540fgK.LIZ = interfaceC1136020ffU.getLogId();
        c1136540fgK.LJIILJJIL = interfaceC1136020ffU.LJJIFFI().LIZIZ;
        c1136540fgK.LJIIL = interfaceC1136020ffU.getRepeatCount();
        return c1136540fgK;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1136540fgK LIZJ(com.bytedance.android.livesdk.model.message.GiftMessage r7) {
        /*
            X.0fgK r6 = new X.0fgK
            r6.<init>()
            com.bytedance.android.livesdk.model.Gift r1 = r7.mGift
            if (r1 == 0) goto L4c
            int r0 = r1.type
        Lb:
            r6.LJFF = r0
            r6.LIZLLL = r7
            long r0 = r1.id
            r6.LIZIZ = r0
            com.bytedance.android.live.base.model.user.User r0 = r7.fromUser
            r6.LIZJ = r0
            java.lang.String r0 = r7.mLogId
            r6.LIZ = r0
            com.bytedance.android.livesdkapi.message.CommonMessageData r0 = r7.baseMessage
            if (r0 == 0) goto L47
            long r0 = r0.createTime
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L45
            r0 = 1
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L47
            long r0 = r5.longValue()
        L3e:
            r6.LJIILJJIL = r0
            int r0 = r7.repeatCount
            r6.LJIIL = r0
            return r6
        L45:
            r0 = 0
            goto L30
        L47:
            long r0 = X.C158B.LIZ()
            goto L3e
        L4c:
            r0 = 4
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136460fgC.LIZJ(com.bytedance.android.livesdk.model.message.GiftMessage):X.0fgK");
    }

    public static Map LJFF(C1136540fgK c1136540fgK) {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : C1697810uHb.LJIIJJI("render_command", "ttlh_receive", "play_start", "play_end")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("camera_status_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Integer num = c1136540fgK.LJJIJIIJIL.get(str);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            linkedHashMap.put(strLIZIZ, String.valueOf(iIntValue));
        }
        return linkedHashMap;
    }

    public static Map LJI(C1136540fgK c1136540fgK) {
        GiftMessage giftMessage = c1136540fgK.LIZLLL;
        if (giftMessage != null) {
            return C1135800ff8.LJIIIIZZ(giftMessage, C158B.LIZ(), System.currentTimeMillis());
        }
        InterfaceC1136020ffU interfaceC1136020ffU = c1136540fgK.LJ;
        if (interfaceC1136020ffU != null) {
            return C1135800ff8.LJIIIZ(interfaceC1136020ffU);
        }
        return C2097608Jq.LJ();
    }

    public static Long LJIIIIZZ(C1136540fgK c1136540fgK) {
        GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII;
        long j;
        GiftMessage.InteractiveGiftInfo interactiveGiftInfo;
        GiftMessage giftMessage = c1136540fgK.LIZLLL;
        if (giftMessage != null && (interactiveGiftInfo = giftMessage.interactiveGiftInfo) != null) {
            j = interactiveGiftInfo.uniqId;
        } else {
            InterfaceC1136020ffU interfaceC1136020ffU = c1136540fgK.LJ;
            if (interfaceC1136020ffU != null && (interactiveGiftInfoLJJIII = interfaceC1136020ffU.LJJIII()) != null) {
                j = interactiveGiftInfoLJJIII.uniqId;
            } else {
                return null;
            }
        }
        return Long.valueOf(j);
    }

    public static Map LJIIJ(C1136540fgK c1136540fgK) {
        if (!LiveEffectPerfMetricsSetting.INSTANCE.isEnabled()) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1276840jKc.LIZ.getClass();
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) C1276840jKc.LJIIL;
        Object obj = linkedHashMap2.get("beauty_resource_list");
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        linkedHashMap.put("beauty_resource_list", obj);
        Object obj3 = linkedHashMap2.get("filter_resource_id");
        if (obj3 != null) {
            obj2 = obj3;
        }
        linkedHashMap.put("filter_resource_id", obj2);
        linkedHashMap.put("room_effect_resource_id", C1276840jKc.LJIL());
        linkedHashMap.put("cpu_cores", String.valueOf(C1305320k4Y.LJ(C497740JfY.LJII())));
        C1163660gO4.LIZ.getClass();
        Map mapLIZ = C1163660gO4.LIZ("livesdk_sticker_gift_perf_monitor");
        Double d = (Double) mapLIZ.get("cpu_speed");
        if (d != null && d.doubleValue() > 0.0d) {
            linkedHashMap.put("cpu_speed", String.valueOf(d.doubleValue()));
        }
        Double d2 = (Double) mapLIZ.get("cpu_rate");
        if (d2 != null && d2.doubleValue() > 0.0d) {
            linkedHashMap.put("cpu_rate", String.valueOf(d2.doubleValue()));
        }
        Double dValueOf = Double.valueOf(((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).Sb2());
        if (dValueOf.doubleValue() >= 0.0d) {
            linkedHashMap.put("gpu_usage_android", String.valueOf(dValueOf.doubleValue()));
        }
        C1136460fgC c1136460fgC = LIZ;
        List<Double> list = c1136540fgK.LJJIJIL;
        c1136460fgC.getClass();
        linkedHashMap.put("after_effect_fps", String.valueOf(LIZ(list)));
        linkedHashMap.put("effect_avg_time", String.valueOf(LIZ(c1136540fgK.LJJIJL)));
        return linkedHashMap;
    }

    public static Long LJIIJJI(C1136540fgK c1136540fgK) {
        GiftMessage.InteractiveGiftInfo interactiveGiftInfoLJJIII;
        long j;
        GiftMessage.InteractiveGiftInfo interactiveGiftInfo;
        GiftMessage giftMessage = c1136540fgK.LIZLLL;
        if (giftMessage != null && (interactiveGiftInfo = giftMessage.interactiveGiftInfo) != null) {
            j = interactiveGiftInfo.crossScreenRole;
        } else {
            InterfaceC1136020ffU interfaceC1136020ffU = c1136540fgK.LJ;
            if (interfaceC1136020ffU != null && (interactiveGiftInfoLJJIII = interfaceC1136020ffU.LJJIII()) != null) {
                j = interactiveGiftInfoLJJIII.crossScreenRole;
            } else {
                return null;
            }
        }
        return Long.valueOf(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJIIL(X.C1136540fgK r8) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136460fgC.LJIIL(X.0fgK):java.util.Map");
    }

    public static void LJIILL(Map map) {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        long jLongValue4;
        long jLongValue5;
        long jLongValue6;
        long jLongValue7;
        long jLongValue8;
        long jLongValue9;
        long id;
        long ownerUserId;
        Long lLIZIZ;
        Long lLIZIZ2;
        Long lLIZIZ3;
        Long lLIZIZ4;
        Long lLIZIZ5;
        Long lLIZIZ6;
        Long lLIZIZ7;
        Long lLIZIZ8;
        Long lLIZIZ9;
        String str = (String) map.get("gift_sender_uid");
        if (str != null && (lLIZIZ9 = C1946707jt.LIZIZ(str)) != null) {
            jLongValue = lLIZIZ9.longValue();
        } else {
            jLongValue = 0;
        }
        Object obj = map.get("cross_screen_first_frame_sei_id");
        if (obj == null) {
            obj = "";
        }
        if (jLongValue == UserService.getInstance().user().getCurrentUserId()) {
            ConcurrentHashSet<String> concurrentHashSet = LIZJ;
            if (!concurrentHashSet.contains(obj)) {
                concurrentHashSet.add((String) obj);
                String str2 = (String) map.get("anchor_render_timestamp");
                if (str2 != null && (lLIZIZ8 = C1946707jt.LIZIZ(str2)) != null) {
                    jLongValue2 = lLIZIZ8.longValue();
                } else {
                    jLongValue2 = 0;
                }
                String str3 = (String) map.get("anchor_latency");
                if (str3 != null && (lLIZIZ7 = C1946707jt.LIZIZ(str3)) != null) {
                    jLongValue3 = lLIZIZ7.longValue();
                } else {
                    jLongValue3 = 0;
                }
                String str4 = (String) map.get("anchor_receive_timestamp");
                if (str4 != null && (lLIZIZ6 = C1946707jt.LIZIZ(str4)) != null) {
                    jLongValue4 = lLIZIZ6.longValue();
                } else {
                    jLongValue4 = 0;
                }
                String str5 = (String) map.get("cross_screen_order_id");
                if (str5 != null && (lLIZIZ5 = C1946707jt.LIZIZ(str5)) != null) {
                    jLongValue5 = lLIZIZ5.longValue();
                } else {
                    jLongValue5 = 0;
                }
                String str6 = (String) map.get("cross_screen_role");
                if (str6 != null && (lLIZIZ4 = C1946707jt.LIZIZ(str6)) != null) {
                    jLongValue6 = lLIZIZ4.longValue();
                } else {
                    jLongValue6 = 0;
                }
                String str7 = (String) map.get("cross_screen_selected_effect_id");
                if (str7 != null && (lLIZIZ3 = C1946707jt.LIZIZ(str7)) != null) {
                    jLongValue7 = lLIZIZ3.longValue();
                } else {
                    jLongValue7 = 0;
                }
                String str8 = (String) map.get("render_timestamp");
                if (str8 != null && (lLIZIZ2 = C1946707jt.LIZIZ(str8)) != null) {
                    jLongValue8 = lLIZIZ2.longValue();
                } else {
                    jLongValue8 = 0;
                }
                String str9 = (String) map.get("repeat_count");
                if (str9 != null && (lLIZIZ = C1946707jt.LIZIZ(str9)) != null) {
                    jLongValue9 = lLIZIZ.longValue();
                } else {
                    jLongValue9 = -1;
                }
                long jLIZ = C158B.LIZ();
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sticker_anchor_latency", Long.valueOf(jLongValue3));
                linkedHashMap.put("sticker_stream_latency", Long.valueOf(jLIZ - jLongValue2));
                linkedHashMap.put("creator_receive_timestamp", Long.valueOf(jLongValue4));
                if (room != null) {
                    id = room.getId();
                } else {
                    id = 0;
                }
                linkedHashMap.put("room_id", Long.valueOf(id));
                if (room != null) {
                    ownerUserId = room.getOwnerUserId();
                } else {
                    ownerUserId = 0;
                }
                linkedHashMap.put("anchor_id", Long.valueOf(ownerUserId));
                linkedHashMap.put("gift_sender_uid", Long.valueOf(jLongValue));
                linkedHashMap.put("cross_screen_order_id", Long.valueOf(jLongValue5));
                linkedHashMap.put("cross_screen_role", Long.valueOf(jLongValue6));
                linkedHashMap.put("cross_screen_selected_effect_id", Long.valueOf(jLongValue7));
                linkedHashMap.put("show_timestamp", Long.valueOf(jLongValue8));
                linkedHashMap.put("cross_screen_unique_sei_id", obj);
                linkedHashMap.put("is_local", 0);
                linkedHashMap.put("repeat_count", Long.valueOf(jLongValue9));
                C1135180fe8.LIZJ(linkedHashMap);
                LJIJJLI("gift_cross_screen_play_start_self", C500260Jjc.LLD(linkedHashMap));
            }
        }
    }

    public static final void LJIIZILJ(Map<String, String> map) {
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        Object next;
        C1132910faT c1132910faT;
        Long lLJIILIIL;
        Long lLIZIZ;
        Long lLIZIZ2;
        Long lLIZIZ3;
        String str = map.get("log_id");
        String str2 = map.get("anchor_render_timestamp");
        long jLongValue4 = 0;
        if (str2 != null && (lLIZIZ3 = C1946707jt.LIZIZ(str2)) != null) {
            jLongValue = lLIZIZ3.longValue();
        } else {
            jLongValue = 0;
        }
        String str3 = map.get("anchor_latency");
        if (str3 != null && (lLIZIZ2 = C1946707jt.LIZIZ(str3)) != null) {
            jLongValue2 = lLIZIZ2.longValue();
        } else {
            jLongValue2 = 0;
        }
        String str4 = map.get("anchor_receive_timestamp");
        if (str4 != null && (lLIZIZ = C1946707jt.LIZIZ(str4)) != null) {
            jLongValue3 = lLIZIZ.longValue();
        } else {
            jLongValue3 = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleShowEvent ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ));
        if (str == null) {
            return;
        }
        List<C1132910faT> list = LIZIZ;
        synchronized (list) {
            try {
                Iterator it2 = ((ArrayList) list).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((C1132910faT) next).LIZIZ, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                c1132910faT = (C1132910faT) next;
                if (c1132910faT != null) {
                    ((ArrayList) LIZIZ).remove(c1132910faT);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c1132910faT == null) {
            return;
        }
        C1128450fTH.LIZ.S0("live_sticker_gift_sei");
        String str5 = (String) new LinkedHashMap(C2203708kF.LIZ(c1132910faT.LIZLLL.LLIZLLLIL)).get("send_gift_req_start_ms");
        if (str5 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str5)) != null) {
            jLongValue4 = lLJIILIIL.longValue();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sticker_total_latency", Long.valueOf(C158B.LIZ() - jLongValue4));
        linkedHashMap.put("sticker_anchor_latency", Long.valueOf(jLongValue2));
        linkedHashMap.put("sticker_stream_latency", Long.valueOf(C158B.LIZ() - jLongValue));
        linkedHashMap.put("sticker_message_latency", Long.valueOf(jLongValue3 - jLongValue4));
        LJIILJJIL(c1132910faT, linkedHashMap, 0, null);
    }

    public static void LJIJI(String str) {
        try {
            LJIILL(LJIL(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str), "live_cross_screen_first_frame_sei")));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static Map LJIL(JSONObject jSONObject) {
        try {
            Map<String, Object> map = JsonExtKt.toMap(jSONObject);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), ((Map.Entry) obj).getValue().toString());
            }
            return linkedHashMap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return C2097608Jq.LJ();
        }
    }

    public static void LIZLLL(C1136540fgK c1136540fgK, boolean z) {
        Handler bPEAHandler;
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL;
        LiveEffectPerfMetricsSetting liveEffectPerfMetricsSetting = LiveEffectPerfMetricsSetting.INSTANCE;
        if (!liveEffectPerfMetricsSetting.isEnabled()) {
            return;
        }
        AbstractC1273900jFs abstractC1273900jFsLJIIIZ = LJIIIZ();
        if (abstractC1273900jFsLJIIIZ != null && (interfaceC1268640j7OLJIIL = abstractC1273900jFsLJIIIZ.LJIIL()) != null) {
            synchronized (c1136540fgK.LJJIJIL) {
                try {
                    ((ArrayList) c1136540fgK.LJJIJIL).add(Double.valueOf(interfaceC1268640j7OLJIIL.LJZ()));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            synchronized (c1136540fgK.LJJIJL) {
                try {
                    ((ArrayList) c1136540fgK.LJJIJL).add(Double.valueOf(interfaceC1268640j7OLJIIL.LLIIJI()));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        if (z) {
            Handler handler = LJIIIIZZ;
            bPEAHandler = null;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } else {
            bPEAHandler = LJIIIIZZ;
            if (bPEAHandler == null) {
                bPEAHandler = new BPEAHandler(Looper.getMainLooper());
            }
            C786410Ut5.LJLIIL(liveEffectPerfMetricsSetting.getCollectInterval() * 1000, bPEAHandler, new ARunnableS117S0100000_17(c1136540fgK, 194));
        }
        LJIIIIZZ = bPEAHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap] */
    public static void LJIILLIIL(String str, C1136540fgK c1136540fgK) {
        InterfaceC1136020ffU interfaceC1136020ffU;
        GiftMonitorInfo giftMonitorInfoLJIIL;
        long jLongValue;
        ?? LJ2;
        String str2;
        String str3;
        Long lValueOf;
        Map mapLJI = LJI(c1136540fgK);
        GiftMessage giftMessage = c1136540fgK.LIZLLL;
        if (((giftMessage != null && (giftMonitorInfoLJIIL = giftMessage.giftMonitorInfo) != null) || ((interfaceC1136020ffU = c1136540fgK.LJ) != null && (giftMonitorInfoLJIIL = interfaceC1136020ffU.LJIIL()) != null)) && (lValueOf = Long.valueOf(giftMonitorInfoLJIIL.send_gift_req_start_ms)) != null) {
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 0;
        }
        long jOptLong = c1136540fgK.LJJIJLIJ.optLong("effect_set_composer_timestamp");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c1136540fgK.LJJJ);
        linkedHashMap.putAll(mapLJI);
        LIZ.getClass();
        linkedHashMap.putAll(LJIIL(c1136540fgK));
        linkedHashMap.putAll(LJFF(c1136540fgK));
        linkedHashMap.putAll(LJIIJ(c1136540fgK));
        JSONObject jSONObject = c1136540fgK.LJJIJLIJ;
        try {
            LJ2 = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                LJ2.put(next, jSONObject.get(next).toString());
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            LJ2 = C2097608Jq.LJ();
        }
        linkedHashMap.putAll(LJ2);
        C1136460fgC c1136460fgC = LIZ;
        int i = c1136540fgK.LJI;
        c1136460fgC.getClass();
        linkedHashMap.put("sticker_asset_variant", LJ(i));
        linkedHashMap.put("sticker_asset_variant_reason", Integer.valueOf(c1136540fgK.LJII));
        linkedHashMap.put("status_code", Integer.valueOf(c1136540fgK.LJIILIIL));
        if (C1697810uHb.LJIIJJI(400, 401).contains(Integer.valueOf(c1136540fgK.LJIILIIL))) {
            str2 = "effect";
        } else {
            str2 = "revenue";
        }
        linkedHashMap.put("status_code_category", str2);
        linkedHashMap.put("call_render_command_server_timestamp", Long.valueOf(c1136540fgK.LJJIII));
        linkedHashMap.put("call_render_command_client_timestamp", Long.valueOf(c1136540fgK.LJJIIJ));
        linkedHashMap.put("first_frame_server_timestamp", Long.valueOf(c1136540fgK.LJJIIJZLJL));
        linkedHashMap.put("first_frame_client_timestamp", Long.valueOf(c1136540fgK.LJJIIZ));
        linkedHashMap.put("render_finish_time", Long.valueOf(c1136540fgK.LJJIJIIJI));
        linkedHashMap.put("render_dur", Long.valueOf(c1136540fgK.LJJIJIIJI - c1136540fgK.LJJIIJZLJL));
        linkedHashMap.put("sticker_anchor_latency", Long.valueOf(c1136540fgK.LJJIIJZLJL - c1136540fgK.LJIILJJIL));
        linkedHashMap.put("sticker_anchor_latency_without_queue", Long.valueOf((c1136540fgK.LJJIIJZLJL - c1136540fgK.LJIILJJIL) - (c1136540fgK.LJJII - c1136540fgK.LJJIFFI)));
        linkedHashMap.put("sticker_message_latency", Long.valueOf(c1136540fgK.LJIILJJIL - jLongValue));
        linkedHashMap.put("apply_to_loadresult_gap", Long.valueOf(c1136540fgK.LJJIII - c1136540fgK.LJIJ));
        long j = c1136540fgK.LJJIIJZLJL - c1136540fgK.LJJIII;
        if (j >= 0) {
            linkedHashMap.put("call_render_to_first_frame_duration", Long.valueOf(j));
        } else {
            linkedHashMap.put("call_render_to_first_frame_duration", Long.valueOf(c1136540fgK.LJJIIZ - c1136540fgK.LJJIIJ));
        }
        long j2 = c1136540fgK.LJJIIZI - c1136540fgK.LJJIII;
        if (j2 >= 0) {
            linkedHashMap.put("call_render_to_first_frame_duration_for_replay", Long.valueOf(j2));
        } else {
            linkedHashMap.put("call_render_to_first_frame_duration_for_replay", Long.valueOf(c1136540fgK.LJJIJ - c1136540fgK.LJJIIJ));
        }
        if (c1136540fgK.LJJIZ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_end_by_next_replay", str3);
        C1135180fe8.LIZJ(linkedHashMap);
        Long lValueOf2 = Long.valueOf(jOptLong - c1136540fgK.LJJIIJ);
        long jLongValue2 = lValueOf2.longValue();
        if (jOptLong > 0 && jLongValue2 > 0) {
            linkedHashMap.put("call_render_to_set_composer_duration", Long.valueOf(lValueOf2.longValue()));
        }
        Long lValueOf3 = Long.valueOf(c1136540fgK.LJJIIZ - jOptLong);
        long jLongValue3 = lValueOf3.longValue();
        if (jOptLong > 0 && jLongValue3 > 0) {
            linkedHashMap.put("set_composer_to_first_frame_duration", Long.valueOf(lValueOf3.longValue()));
        }
        LJIJJLI(str, C500260Jjc.LLD(linkedHashMap));
    }

    public static void LJIJJLI(String str, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
        try {
            C1CC2.LIZJ(str, new JSONObject(map), new JSONObject(), new JSONObject());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIILJJIL(C1132910faT c1132910faT, Map map, int i, String str) {
        long id;
        Long lValueOf;
        Map<String, String> mapLJ;
        User owner;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Sending [gift_sticker_play_status], errorCode: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ));
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        Map mapLJIIIIZZ = C1135800ff8.LJIIIIZZ(c1132910faT.LIZLLL, C158B.LIZ(), System.currentTimeMillis());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("error_code", String.valueOf(i));
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("error_message", str);
        linkedHashMap.put("room_id", String.valueOf(id));
        if (room != null && (owner = room.getOwner()) != null) {
            lValueOf = Long.valueOf(owner.getId());
        } else {
            lValueOf = null;
        }
        linkedHashMap.put("anchor_id", String.valueOf(lValueOf));
        linkedHashMap.put("gift_type", String.valueOf(c1132910faT.LIZJ.type));
        if (c1132910faT.LIZLLL.LLILLL) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.putAll(mapLJIIIIZZ);
            linkedHashMap2.putAll(linkedHashMap);
            if (map != null) {
                mapLJ = C500260Jjc.LLD(map);
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            linkedHashMap2.putAll(mapLJ);
            LJIJJLI("gift_sticker_play_status_self", linkedHashMap2);
        }
    }

    public static void LJIJ(C1136460fgC c1136460fgC, String str, C1136540fgK c1136540fgK, long j, int i) {
        Pair pair;
        C1136540fgK c1136540fgK2;
        Object obj = null;
        if ((i & 2) != 0) {
            c1136540fgK = null;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        c1136460fgC.getClass();
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gift_sticker_tray_gap_report");
            sbLIZ.append(LJIILIIL());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (c1136540fgK == null) {
                synchronized (LJFF) {
                    try {
                        Iterator it2 = ((ArrayList) LIZLLL).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (Intrinsics.LJFF(((C1136540fgK) next).LIZ, str)) {
                                obj = next;
                                break;
                            }
                        }
                        c1136540fgK2 = (C1136540fgK) obj;
                        if (c1136540fgK2 != null) {
                            ((ArrayList) LIZLLL).remove(c1136540fgK2);
                        } else {
                            ((ArrayList) LJ).add(new Pair(str, Long.valueOf(j)));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (c1136540fgK2 != null) {
                    long j2 = j - c1136540fgK2.LJJIIJZLJL;
                    Map mapLJI = LJI(c1136540fgK2);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(mapLJI);
                    LIZ.getClass();
                    linkedHashMap.putAll(LJIIL(c1136540fgK2));
                    linkedHashMap.put("tray_show_time", Long.valueOf(j));
                    linkedHashMap.put("sticker_play_time", Long.valueOf(c1136540fgK2.LJJIIJZLJL));
                    linkedHashMap.put("sticker_tray_show_gap", Long.valueOf(j2));
                    LJIJJLI(strLIZIZ, C500260Jjc.LLD(linkedHashMap));
                    return;
                }
                return;
            }
            synchronized (LJFF) {
                try {
                    Iterator it3 = ((ArrayList) LJ).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (Intrinsics.LJFF(((Pair) next2).getFirst(), c1136540fgK.LIZ)) {
                            obj = next2;
                            break;
                        }
                    }
                    pair = (Pair) obj;
                    if (pair != null) {
                        ((ArrayList) LJ).remove(pair);
                    } else {
                        ((ArrayList) LIZLLL).add(c1136540fgK);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
            if (pair != null) {
                long jLongValue = ((Number) pair.getSecond()).longValue() - c1136540fgK.LJJIIJZLJL;
                Map mapLJI2 = LJI(c1136540fgK);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(mapLJI2);
                LIZ.getClass();
                linkedHashMap2.putAll(LJIIL(c1136540fgK));
                linkedHashMap2.put("tray_show_time", Long.valueOf(j));
                linkedHashMap2.put("sticker_play_time", Long.valueOf(c1136540fgK.LJJIIJZLJL));
                linkedHashMap2.put("sticker_tray_show_gap", Long.valueOf(jLongValue));
                LJIJJLI(strLIZIZ, C500260Jjc.LLD(linkedHashMap2));
            }
        }
    }

    public static void LJIJJ(DataChannel dataChannel, SendGiftResult sendGiftResult, InterfaceC1131100fXY interfaceC1131100fXY, GiftMessage giftMessage, String str) {
        Room room;
        Long lLIZIZ;
        long jLongValue;
        boolean z;
        boolean z2;
        if (!FacialGiftTrackingSettings.INSTANCE.isEnabled()) {
            C20441214yg.LIZIZ("StickerGiftTracker", "Facial gift event tracking disabled, ignoring record");
            return;
        }
        long j = sendGiftResult.mGiftId;
        Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
        if (giftFindGiftById == null) {
            return;
        }
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(C1135870ffF.LJIILJJIL(Integer.valueOf(giftFindGiftById.type))))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isn't sticker gift: ");
            sbLIZ.append(giftFindGiftById.id);
            sbLIZ.append(", type = ");
            sbLIZ.append(giftFindGiftById.type);
            C20441214yg.LJ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        IInteractService iInteractService = C1128450fTH.LIZ;
        WeakReference<InterfaceC914420Zu4> weakReference = new WeakReference<>(LJIIIZ);
        IInteractService iInteractService2 = C1128450fTH.LIZ;
        iInteractService2.m00("live_cross_screen_first_frame_sei", weakReference);
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            String clientVersion = room.getClientVersion();
            Long lValueOf = null;
            if (clientVersion != null) {
                lLIZIZ = C1946707jt.LIZIZ(clientVersion);
            } else {
                lLIZIZ = null;
            }
            Long lLIZIZ2 = C1946707jt.LIZIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getVersionCode());
            if (lLIZIZ2 != null) {
                jLongValue = lLIZIZ2.longValue();
            } else {
                jLongValue = 0;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Versions, host: ");
            sbLIZ2.append(lLIZIZ);
            sbLIZ2.append(", current device: ");
            sbLIZ2.append(jLongValue);
            C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ2));
            if (lLIZIZ != null && lLIZIZ.longValue() >= 260700) {
                if (C2640010k.LIZIZ()) {
                    C20441214yg.LJ("StickerGiftTracker", "Host won't receive SEI callbacks, ignoring");
                    return;
                }
                if (iInteractService2.w9() || iInteractService2.vH0() || iInteractService2.kB() || iInteractService2.o1() || iInteractService2.Nt()) {
                    if (lLIZIZ.longValue() < r16.getMultiHostPermanentSeiMinVersion() && jLongValue >= r16.getMultiHostPermanentSeiMinVersion()) {
                        C20441214yg.LJ("StickerGiftTracker", "Host version does not support permanent SEI, ignoring");
                        return;
                    } else if (C1128450fTH.LJI(UserService.getInstance().user().LJIJJLI(), room) == 2) {
                        C20441214yg.LJ("StickerGiftTracker", "User is linking to host, cannot receive SEI data");
                        return;
                    }
                }
                C1132880faQ c1132880faQLIZJ = interfaceC1131100fXY.LIZJ();
                if (c1132880faQLIZJ != null) {
                    lValueOf = Long.valueOf(c1132880faQLIZJ.LIZ);
                }
                long currentUserId = UserService.getInstance().user().getCurrentUserId();
                if (lValueOf != null && lValueOf.longValue() == currentUserId) {
                    z = true;
                } else {
                    z = false;
                }
                long id = room.getOwner().getId();
                if (lValueOf != null && lValueOf.longValue() == id) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z && z2) {
                    iInteractService2.m00("live_sticker_gift_sei", new WeakReference<>(LJIIJ));
                    final C1132910faT c1132910faT = new C1132910faT(j, str, giftFindGiftById, giftMessage);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Gift sent, enqueuing record: ");
                    sbLIZ3.append(c1132910faT);
                    C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ3));
                    List<C1132910faT> list = LIZIZ;
                    synchronized (list) {
                        try {
                            ((ArrayList) list).add(c1132910faT);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    C786410Ut5.LJLIIL(StickerGiftTimeoutSettings.INSTANCE.getValue(), LJII, new Runnable(c1132910faT) { // from class: X.0faU
                        public final C1132910faT LL;

                        public final void LIZ() {
                            List<C1132910faT> list2 = C1136460fgC.LIZIZ;
                            synchronized (list2) {
                                try {
                                    if (((ArrayList) list2).remove(this.LL)) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("timeout, remove ");
                                        sbLIZ4.append(this.LL.LIZIZ);
                                        C20441214yg.LIZIZ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ4));
                                        C1136460fgC c1136460fgC = C1136460fgC.LIZ;
                                        C1132910faT c1132910faT2 = this.LL;
                                        c1136460fgC.getClass();
                                        C1136460fgC.LJIILJJIL(c1132910faT2, null, 2020, "timeout");
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("StickerGiftTracker$TimeoutRunnable@e7de.run");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("StickerGiftTracker$TimeoutRunnable@e7de.run");
                        }

                        {
                            this.LL = c1132910faT;
                        }
                    });
                    return;
                }
                C20441214yg.LJ("StickerGiftTracker", "Gift was sent to self or a non-owner host");
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("anchor version too low : ");
            sbLIZ4.append(room.getClientVersion());
            sbLIZ4.append(", ignore");
            C20441214yg.LJ("StickerGiftTracker", C2188811AlT.LIZIZ(sbLIZ4));
        }
    }
}
