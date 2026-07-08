package X;

import android.util.LongSparseArray;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.model.message.LiveEventMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.EventCard;

/* JADX INFO: renamed from: X.0edc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1096420edc implements InterfaceC1141530foN {
    public static long LLIZLLLIL;
    public static final C1096420edc LL = new C1096420edc();
    public static final LongSparseArray<DataChannel> LLILLJJLI = new LongSparseArray<>();
    public static final LongSparseArray<OnMessageListener> LLILLL = new LongSparseArray<>();
    public static final LongSparseArray<Integer> LLILZ = new LongSparseArray<>();
    public static final LongSparseArray<CopyOnWriteArrayList<InterfaceC1096500edk>> LLILZIL = new LongSparseArray<>();
    public static final LongSparseArray<C1096490edj> LLILZLL = new LongSparseArray<>();
    public static final LongSparseArray<C1096490edj> LLIZ = new LongSparseArray<>();
    public static final LongSparseArray<C1096490edj> LLJ = new LongSparseArray<>();

    public static C1096490edj LIZ(long j) {
        return LLILZLL.get(j);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C1096490edj c1096490edjLIZ;
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_event_pin_card_close") && (c1096490edjLIZ = LIZ(LLIZLLLIL)) != null) {
            LIZLLL(c1096490edjLIZ.LIZ, c1096490edjLIZ);
        }
    }

    public static void LIZIZ(long j, C1096490edj c1096490edj) {
        Long l;
        Long l2;
        long j2;
        CopyOnWriteArrayList<InterfaceC1096500edk> copyOnWriteArrayList;
        EventCard eventCard;
        CopyOnWriteArrayList<InterfaceC1096500edk> copyOnWriteArrayList2;
        LiveEventInfo liveEventInfo;
        LiveEventMessage liveEventMessage;
        EventCard eventCard2;
        LiveEventInfo liveEventInfo2;
        C1096490edj c1096490edjLIZ;
        Long l3;
        EventCard eventCard3;
        LiveEventInfo liveEventInfo3;
        EventCard eventCard4;
        LiveEventInfo liveEventInfo4;
        LiveEventMessage liveEventMessage2 = c1096490edj.LIZIZ;
        if (liveEventMessage2 != null) {
            int i = liveEventMessage2.actionType;
            LiveEventMessage liveEventMessage3 = null;
            l = null;
            l = null;
            Long l4 = null;
            if (i != 1) {
                if (i == 2 && (c1096490edjLIZ = LIZ(j)) != null) {
                    LiveEventMessage liveEventMessage4 = c1096490edjLIZ.LIZIZ;
                    if (liveEventMessage4 != null && (eventCard4 = liveEventMessage4.card) != null && (liveEventInfo4 = eventCard4.event) != null) {
                        l3 = liveEventInfo4.eventId;
                    } else {
                        l3 = null;
                    }
                    LiveEventMessage liveEventMessage5 = c1096490edj.LIZIZ;
                    if (liveEventMessage5 != null && (eventCard3 = liveEventMessage5.card) != null && (liveEventInfo3 = eventCard3.event) != null) {
                        l4 = liveEventInfo3.eventId;
                    }
                    if (Intrinsics.LJFF(l3, l4) && !LIZJ(c1096490edjLIZ.LIZIZ, liveEventMessage2)) {
                        LIZLLL(j, c1096490edj);
                        return;
                    }
                    LongSparseArray<C1096490edj> longSparseArray = LLIZ;
                    C1096490edj c1096490edj2 = longSparseArray.get(j);
                    if (c1096490edj2 != null) {
                        if (LIZJ(c1096490edj2.LIZIZ, liveEventMessage2)) {
                            return;
                        }
                        longSparseArray.put(j, c1096490edj);
                        return;
                    }
                    longSparseArray.put(j, c1096490edj);
                    return;
                }
                return;
            }
            LongSparseArray<C1096490edj> longSparseArray2 = LLIZ;
            C1096490edj c1096490edj3 = longSparseArray2.get(j);
            if (c1096490edj3 != null && (liveEventMessage = c1096490edj3.LIZIZ) != null && (eventCard2 = liveEventMessage.card) != null && (liveEventInfo2 = eventCard2.event) != null) {
                l = liveEventInfo2.eventId;
            } else {
                l = null;
            }
            EventCard eventCard5 = liveEventMessage2.card;
            if (eventCard5 != null && (liveEventInfo = eventCard5.event) != null) {
                l2 = liveEventInfo.eventId;
            } else {
                l2 = null;
            }
            if (Intrinsics.LJFF(l, l2)) {
                C1096490edj c1096490edj4 = longSparseArray2.get(j);
                if (c1096490edj4 != null) {
                    liveEventMessage3 = c1096490edj4.LIZIZ;
                }
                if (!LIZJ(liveEventMessage3, liveEventMessage2)) {
                    longSparseArray2.remove(j);
                    return;
                }
            }
            if (LIZ(j) == null) {
                LLILZLL.put(j, c1096490edj);
                Integer num = LLILZ.get(j);
                if (num == null || num.intValue() != 0 || (copyOnWriteArrayList2 = LLILZIL.get(j)) == null) {
                    return;
                }
                Iterator<InterfaceC1096500edk> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ(c1096490edj);
                }
                return;
            }
            C1096490edj c1096490edjLIZ2 = LIZ(j);
            if (c1096490edjLIZ2 == null || Intrinsics.LJFF(c1096490edjLIZ2, c1096490edj) || LIZJ(c1096490edjLIZ2.LIZIZ, liveEventMessage2)) {
                return;
            }
            LiveEventMessage liveEventMessage6 = c1096490edjLIZ2.LIZIZ;
            long j3 = 0;
            if (liveEventMessage6 != null && (eventCard = liveEventMessage6.card) != null) {
                j2 = eventCard.cardStartTime;
            } else {
                j2 = 0;
            }
            EventCard eventCard6 = liveEventMessage2.card;
            if (eventCard6 != null) {
                j3 = eventCard6.cardStartTime;
            }
            if (j2 >= j3) {
                return;
            }
            LLILZLL.put(j, c1096490edj);
            Integer num2 = LLILZ.get(j);
            if (num2 == null || num2.intValue() != 0 || (copyOnWriteArrayList = LLILZIL.get(j)) == null) {
                return;
            }
            Iterator<InterfaceC1096500edk> it3 = copyOnWriteArrayList.iterator();
            while (it3.hasNext()) {
                it3.next().LIZIZ(c1096490edj);
            }
        }
    }

    public static boolean LIZJ(LiveEventMessage liveEventMessage, LiveEventMessage liveEventMessage2) {
        long j;
        CommonMessageData commonMessageData;
        long j2 = 0;
        if (liveEventMessage != null && (commonMessageData = liveEventMessage.baseMessage) != null) {
            j = commonMessageData.createTime;
        } else {
            j = 0;
        }
        CommonMessageData commonMessageData2 = liveEventMessage2.baseMessage;
        if (commonMessageData2 != null) {
            j2 = commonMessageData2.createTime;
        }
        if (j >= j2) {
            return true;
        }
        return false;
    }

    public static void LIZLLL(long j, C1096490edj c1096490edj) {
        LLILZLL.remove(j);
        CopyOnWriteArrayList<InterfaceC1096500edk> copyOnWriteArrayList = LLILZIL.get(j);
        if (copyOnWriteArrayList != null) {
            Iterator<InterfaceC1096500edk> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZLLL(c1096490edj);
            }
        }
    }

    public static void LJ(long j, boolean z) {
        C1096490edj c1096490edjLIZ = LIZ(j);
        if (c1096490edjLIZ != null) {
            C1096490edj c1096490edjLIZ2 = C1096490edj.LIZ(c1096490edjLIZ, null, z, null, 11);
            CopyOnWriteArrayList<InterfaceC1096500edk> copyOnWriteArrayList = LLILZIL.get(j);
            if (copyOnWriteArrayList != null) {
                Iterator<InterfaceC1096500edk> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(c1096490edjLIZ2);
                }
            }
        }
    }

    public static void LJFF(int i, long j) {
        int iIntValue;
        LongSparseArray<Integer> longSparseArray = LLILZ;
        Integer num = longSparseArray.get(j);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        longSparseArray.put(j, Integer.valueOf((~i) & iIntValue));
        Integer num2 = longSparseArray.get(j);
        if (num2 != null && num2.intValue() == 0) {
            LJ(j, true);
        }
    }

    public static void LJI(int i, long j) {
        int iIntValue;
        LongSparseArray<Integer> longSparseArray = LLILZ;
        Integer num = longSparseArray.get(j);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        longSparseArray.put(j, Integer.valueOf(i | iIntValue));
        LJ(j, false);
    }
}
