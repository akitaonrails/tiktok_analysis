package X;

import android.os.SystemClock;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.HotRoomData;
import com.bytedance.android.livesdk.model.message.HotRoomMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00yk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C255200yk implements OnIMMessageListener, InterfaceC1078630eAv {
    public long LLILLL;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(406));
    public final Map<Integer, Long> LLILLJJLI = new LinkedHashMap();
    public final Map<Integer, Long> LLILZ = new LinkedHashMap();
    public Map<Integer, HotRoomData.HotRoomState> LLILZIL = C2097608Jq.LJ();
    public final C255300yl LLJILJILJ = new C255300yl();

    @Override // X.InterfaceC1078630eAv
    public final Map<String, String> LIZIZ() {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("is_hot", this.LLILZIL.isEmpty() ^ true ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[1] = new Pair("is_acu_hot", this.LLILZIL.get(1) != null ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[2] = new Pair("is_enter_hot", this.LLILZIL.get(3) != null ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[3] = new Pair("is_chat_hot", this.LLILZIL.get(4) != null ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[4] = new Pair("is_gift_hot", this.LLILZIL.get(5) != null ? "1" : CardStruct.IStatusCode.DEFAULT);
        pairArr[5] = new Pair("is_like_hot", this.LLILZIL.get(7) == null ? CardStruct.IStatusCode.DEFAULT : "1");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC1078630eAv
    public final void destroy() {
        LJII(null);
        C255300yl c255300yl = this.LLJILJILJ;
        C11JF c11jf = c255300yl.LJIIIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        for (Class<? extends AbstractC1136060ffY> cls : c255300yl.LJIIJJI) {
            Map<Class<? extends AbstractC1136060ffY>, Boolean> map = c255300yl.LIZJ;
            Boolean bool = Boolean.FALSE;
            if (((Boolean) C255300yl.LIZ(map, cls, bool)).booleanValue()) {
                long jLongValue = ((Number) C255300yl.LIZ(c255300yl.LIZIZ, cls, -1L)).longValue();
                if (jLongValue > 0) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j = jElapsedRealtime - jLongValue;
                    Map<Class<? extends AbstractC1136060ffY>, Long> map2 = c255300yl.LIZ;
                    map2.put(cls, Long.valueOf(((Number) C255300yl.LIZ(map2, cls, 0L)).longValue() + j));
                    c255300yl.LIZIZ.put(cls, 0L);
                    if (Intrinsics.LJFF(cls, GiftMessage.class) && j > c255300yl.LJII) {
                        c255300yl.LJII = j;
                        c255300yl.LJI = jElapsedRealtime;
                        c255300yl.LJFF = jLongValue;
                    }
                }
            }
            c255300yl.LIZJ.put(cls, bool);
        }
        if (this.LLJILJIL) {
            float fLJIILIIL = ((InterfaceC1089980eTE) this.LL.getValue()).LJIILIIL(null) / 1000.0f;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_room_hot_traffic_summary");
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LJJII(Long.valueOf(this.LLILLL), "total_hot_duration");
            c474500IjALIZ.LJJII(LJ(this.LLILLJJLI, 1, 0L), "total_acu_hot_duration");
            c474500IjALIZ.LJJII(LJ(this.LLILLJJLI, 3, 0L), "total_enter_hot_duration");
            c474500IjALIZ.LJJII(LJ(this.LLILLJJLI, 4, 0L), "total_chat_hot_duration");
            c474500IjALIZ.LJJII(LJ(this.LLILLJJLI, 5, 0L), "total_gift_hot_duration");
            c474500IjALIZ.LJJII(LJ(this.LLILLJJLI, 7, 0L), "total_like_hot_duration");
            c474500IjALIZ.LJJIFFI(Float.valueOf(this.LLILLL / fLJIILIIL), "total_hot_duration_rate");
            c474500IjALIZ.LJJIFFI(Float.valueOf(((Number) LJ(this.LLILLJJLI, 1, 0L)).floatValue() / fLJIILIIL), "total_acu_hot_duration_rate");
            c474500IjALIZ.LJJIFFI(Float.valueOf(((Number) LJ(this.LLILLJJLI, 3, 0L)).floatValue() / fLJIILIIL), "total_enter_hot_duration_rate");
            c474500IjALIZ.LJJIFFI(Float.valueOf(((Number) LJ(this.LLILLJJLI, 4, 0L)).floatValue() / fLJIILIIL), "total_chat_hot_duration_rate");
            c474500IjALIZ.LJJIFFI(Float.valueOf(((Number) LJ(this.LLILLJJLI, 5, 0L)).floatValue() / fLJIILIIL), "total_gift_hot_duration_rate");
            c474500IjALIZ.LJJIFFI(Float.valueOf(((Number) LJ(this.LLILLJJLI, 7, 0L)).floatValue() / fLJIILIIL), "total_like_hot_duration_rate");
            c474500IjALIZ.LJJII(Long.valueOf(this.LLIZ), "longest_gift_hot_start_at_time");
            c474500IjALIZ.LJJII(Long.valueOf(this.LLIZLLLIL), "longest_gift_hot_end_at_time");
            c474500IjALIZ.LJJII(Long.valueOf(this.LLJ), "longest_gift_hot_duration");
            c474500IjALIZ.LJJIFFI(Float.valueOf(fLJIILIIL), "live_duration");
            c474500IjALIZ.LJJII(0, "total_match_times");
            c474500IjALIZ.LJJII(Long.valueOf(this.LLJI), "total_gift_message_count");
            c474500IjALIZ.LJJII(Long.valueOf(this.LLJIJIL), "total_gift_amount");
            float fLJIILIIL2 = ((InterfaceC1089980eTE) this.LL.getValue()).LJIILIIL(null);
            C255300yl c255300yl2 = this.LLJILJILJ;
            long j2 = c255300yl2.LIZLLL;
            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
            c474500IjALIZ.LJJIIZI(C2097608Jq.LJIIIIZZ(new Pair("client_total_hot_duration", String.valueOf(j2 / j3)), new Pair("client_longest_gift_hot_duration", String.valueOf(c255300yl2.LJII / j3)), new Pair("client_longest_gift_hot_start_at_time", String.valueOf(c255300yl2.LJFF / j3)), new Pair("client_longest_gift_hot_end_at_time", String.valueOf(c255300yl2.LJI / j3)), new Pair("client_total_enter_hot_duration", String.valueOf(((Number) C255300yl.LIZ(c255300yl2.LIZ, ChatMessage.class, 0L)).longValue() / j3)), new Pair("client_total_chat_hot_duration", String.valueOf(((Number) C255300yl.LIZ(c255300yl2.LIZ, ChatMessage.class, 0L)).longValue() / j3)), new Pair("client_total_gift_hot_duration", String.valueOf(((Number) C255300yl.LIZ(c255300yl2.LIZ, GiftMessage.class, 0L)).longValue() / j3)), new Pair("client_total_like_hot_duration", String.valueOf(((Number) C255300yl.LIZ(c255300yl2.LIZ, LikeMessage.class, 0L)).longValue() / j3)), new Pair("client_total_enter_hot_duration_rate", String.valueOf(((Number) C255300yl.LIZ(c255300yl2.LIZ, ChatMessage.class, 0L)).floatValue() / fLJIILIIL2)), new Pair("client_total_chat_hot_duration_rate", String.valueOf(((Number) C255300yl.LIZ(c255300yl2.LIZ, ChatMessage.class, 0L)).floatValue() / fLJIILIIL2)), new Pair("client_total_gift_hot_duration_rate", String.valueOf(((Number) C255300yl.LIZ(c255300yl2.LIZ, GiftMessage.class, 0L)).floatValue() / fLJIILIIL2)), new Pair("client_total_like_hot_duration_rate", String.valueOf(((Number) C255300yl.LIZ(c255300yl2.LIZ, LikeMessage.class, 0L)).floatValue() / fLJIILIIL2))));
            c474500IjALIZ.LIZ();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "HighTrafficMessage";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    public static void LIZLLL(C474500IjA c474500IjA) {
        c474500IjA.LJJII(Long.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getChannelId()), "cohost_channel_id");
        c474500IjA.LJJII(Long.valueOf(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getBattleId()), "battle_id");
    }

    public static String LJFF(int i) {
        switch (i) {
            case 1:
                return "acu";
            case 2:
                return "watch_pv";
            case 3:
                return "enter_qps";
            case 4:
                return "chat_qps";
            case 5:
                return "gift_qps";
            case 6:
                return "pcu";
            case 7:
                return "like_qps";
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("unknown_");
                sbLIZ.append(i);
                return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    @Override // X.InterfaceC1078630eAv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L98
            java.lang.Class<X.0Uch> r0 = X.C776250Uch.class
            java.lang.Object r1 = r7.gg0(r0)
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r1 = (com.ss.ugc.live.sdk.message.interfaces.IMessageManager) r1
            if (r1 == 0) goto L15
            X.001A r0 = X.C001A.HOT_ROOM_MESSAGE
            int r0 = r0.getIntType()
            r1.addMessageListener(r0, r6)
        L15:
            java.lang.Class<X.0Uch> r0 = X.C776250Uch.class
            java.lang.Object r1 = r7.gg0(r0)
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r1 = (com.ss.ugc.live.sdk.message.interfaces.IMessageManager) r1
            if (r1 == 0) goto L28
            X.001A r0 = X.C001A.GIFT
            int r0 = r0.getIntType()
            r1.addMessageListener(r0, r6)
        L28:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r7.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L98
            long r3 = r0.getOwnerUserId()
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r1 = r0.getCurrentUserId()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L98
            r0 = 1
        L47:
            r6.LLJILJIL = r0
            X.00yl r5 = r6.LLJILJILJ
            r5.getClass()
            com.bytedance.android.livesdk.livesetting.gift.LiveRevenueHighTrafficUpdateRate r0 = com.bytedance.android.livesdk.livesetting.gift.LiveRevenueHighTrafficUpdateRate.INSTANCE
            long r3 = r0.getValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L97
            r5.LJIIIIZZ = r7
            com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting r0 = com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting.INSTANCE
            boolean r0 = r0.getEnabled()
            if (r0 != 0) goto L7a
            X.0ekg r0 = r5.LJIIJ
            if (r0 != 0) goto L7a
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.LJIIIIZZ
            if (r1 == 0) goto L7a
            java.lang.Class<com.bytedance.android.live.function.IRoomFunctionService> r0 = com.bytedance.android.live.function.IRoomFunctionService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.function.IRoomFunctionService r0 = (com.bytedance.android.live.function.IRoomFunctionService) r0
            X.0ekg r0 = r0.mc1(r1)
            r5.LJIIJ = r0
        L7a:
            r1 = 1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            X.11O1 r1 = X.C11NZ.LJJJJJL(r1, r3, r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r1 = r1.LJJJLZIJ(r0)
            X.00ym r0 = new X.00ym
            r0.<init>()
            X.01kM r0 = r1.LJJLJLI(r0)
            X.11JF r0 = (X.C11JF) r0
            r5.LJIIIZ = r0
        L97:
            return
        L98:
            r0 = 0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C255200yk.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    public final void LIZJ(C474500IjA c474500IjA) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 1;
        c474500IjA.LJJII(Integer.valueOf(!this.LLILZIL.isEmpty() ? 1 : 0), "is_hot");
        if (this.LLILZIL.get(1) != null) {
            i = 1;
        } else {
            i = 0;
        }
        c474500IjA.LJJII(Integer.valueOf(i), "is_acu_hot");
        if (this.LLILZIL.get(3) != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c474500IjA.LJJII(Integer.valueOf(i2), "is_enter_hot");
        if (this.LLILZIL.get(4) != null) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c474500IjA.LJJII(Integer.valueOf(i3), "is_chat_hot");
        if (this.LLILZIL.get(5) != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c474500IjA.LJJII(Integer.valueOf(i4), "is_gift_hot");
        if (this.LLILZIL.get(7) == null) {
            i5 = 0;
        }
        c474500IjA.LJJII(Integer.valueOf(i5), "is_like_hot");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[PHI: r5
      0x0088: PHI (r5v6 java.lang.Iterable) = (r5v0 java.lang.Iterable), (r5v7 java.lang.Iterable) binds: [B:10:0x0018, B:8:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.bytedance.android.livesdk.model.message.HotRoomData r17) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C255200yk.LJII(com.bytedance.android.livesdk.model.message.HotRoomData):void");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        long jLongValue;
        if (iMessage instanceof HotRoomMessage) {
            HotRoomMessage hotRoomMessage = (HotRoomMessage) iMessage;
            HotRoomData hotRoomData = hotRoomMessage.data;
            if (hotRoomData != null) {
                str = hotRoomData.business;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "revenue_high_traffic")) {
                HotRoomData hotRoomData2 = hotRoomMessage.data;
                if (hotRoomData2 != null) {
                    LJII(hotRoomData2);
                    int i = hotRoomData2.action;
                    if (i != 1) {
                        if (i == 2) {
                            Long l = (Long) ((LinkedHashMap) this.LLILZ).get(Integer.valueOf(hotRoomData2.reason));
                            if (l != null && l.longValue() > 0 && hotRoomData2.timestamp > l.longValue()) {
                                jLongValue = hotRoomData2.timestamp - l.longValue();
                            } else {
                                jLongValue = -1;
                            }
                            this.LLILZ.put(Integer.valueOf(hotRoomData2.reason), 0L);
                            if (this.LLJILJIL) {
                                String strLJFF = LJFF(hotRoomData2.reason);
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_room_hot_traffic_end");
                                c474500IjALIZ.LJIIIIZZ();
                                LIZJ(c474500IjALIZ);
                                c474500IjALIZ.LJJIIZI(((InterfaceC1089980eTE) this.LL.getValue()).LJFF());
                                LIZLLL(c474500IjALIZ);
                                c474500IjALIZ.LJJII(strLJFF, "hot_type");
                                c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "hot_duration");
                                c474500IjALIZ.LIZ();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.LLILZ.put(Integer.valueOf(hotRoomData2.reason), Long.valueOf(hotRoomData2.timestamp));
                    if (!this.LLJILJIL) {
                        return;
                    }
                    String strLJFF2 = LJFF(hotRoomData2.reason);
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_room_hot_traffic_start");
                    c474500IjALIZ2.LJIIIIZZ();
                    LIZJ(c474500IjALIZ2);
                    c474500IjALIZ2.LJJIIZI(((InterfaceC1089980eTE) this.LL.getValue()).LJFF());
                    LIZLLL(c474500IjALIZ2);
                    c474500IjALIZ2.LJJII(strLJFF2, "hot_type");
                    c474500IjALIZ2.LIZ();
                    return;
                }
                return;
            }
        }
        if (!(iMessage instanceof GiftMessage)) {
            return;
        }
        this.LLJIJIL += (long) ((GiftMessage) iMessage).fanTicketCount;
        this.LLJI++;
    }

    public static Object LJ(Map map, Object obj, Object obj2) {
        Object obj3 = ((LinkedHashMap) map).get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public final void LJI(int i, long j, long j2) {
        long j3;
        if (j2 > j) {
            j3 = j2 - j;
        } else {
            j3 = 0;
        }
        Map<Integer, Long> map = this.LLILLJJLI;
        Integer numValueOf = Integer.valueOf(i);
        Map<Integer, Long> map2 = this.LLILLJJLI;
        Integer numValueOf2 = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
        Object obj = linkedHashMap.get(numValueOf2);
        if (obj == null) {
            obj = 0L;
            linkedHashMap.put(numValueOf2, obj);
        }
        map.put(numValueOf, Long.valueOf(((Number) obj).longValue() + j3));
        if (i == 5 && j3 > this.LLJ) {
            this.LLJ = j3;
            this.LLIZ = j;
            this.LLIZLLLIL = j2;
        }
    }
}
