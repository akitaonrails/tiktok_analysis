package X;

import com.bytedance.android.livesdk.livesetting.message.LiveSignalingSystemSetting;
import com.bytedance.android.livesdk.signaling.model.ExtraT;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageRequest;
import com.bytedance.android.livesdk.signaling.model.UplinkMessageResponse;
import com.bytedance.android.livesdk.signaling.model.UplinkModel;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.signaling.api.HttpApi;
import com.ss.android.ugc.aweme.signaling.api.PostUplinkBatchRequest;
import com.ss.android.ugc.aweme.signaling.api.PostUplinkBatchResponse;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0J65, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J65 implements C0XEZ, InterfaceC486470J5x {
    public static volatile boolean LLILLJJLI;
    public static Boolean LLILLL;
    public static PthreadTimer LLIZ;
    public static long LLJ;
    public static final C0J65 LL = new C0J65();
    public static C0XE1 LLILZ = C0XE1.CONNECTION_UNKNOWN;
    public static final List<C0J66<?, ?>> LLILZIL = new CopyOnWriteArrayList();
    public static final List<UplinkModel<?>> LLILZLL = new CopyOnWriteArrayList();
    public static final ConcurrentHashMap<C0J66<?, ?>, Long> LLIZLLLIL = new ConcurrentHashMap<>();

    public static void LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SignalingManager.sendCachedMessage: inBackground=");
        sbLIZ.append(C1906580ziK.LJI());
        C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
        if (C1906580ziK.LJI()) {
            return;
        }
        List<C0J66<?, ?>> list = LLILZIL;
        synchronized (list) {
            try {
                for (C0J66 c0j66 : (CopyOnWriteArrayList) list) {
                    List<UplinkModel<?>> listLJ = c0j66.LJ();
                    if (listLJ != null) {
                        Iterator<UplinkModel<?>> it2 = listLJ.iterator();
                        while (it2.hasNext()) {
                            LL.LJIIIZ(it2.next());
                        }
                    }
                    List<UplinkModel<?>> listLJIIJJI = c0j66.LJIIJJI();
                    if (listLJIIJJI != null) {
                        Iterator<UplinkModel<?>> it3 = listLJIIJJI.iterator();
                        while (it3.hasNext()) {
                            LL.LJIIIZ(it3.next());
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        List<UplinkModel<?>> list2 = LLILZLL;
        synchronized (list2) {
            try {
                for (UplinkModel<?> uplinkModel : (CopyOnWriteArrayList) list2) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SignalingManager.sendCachedMessage: uplinkRequest.bizType=");
                    sbLIZ2.append(uplinkModel.bizType);
                    C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ2));
                    LL.LJIIIZ(uplinkModel);
                    ((CopyOnWriteArrayList) LLILZLL).remove(uplinkModel);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void LIZJ() {
        if (LLILLJJLI) {
            return;
        }
        LLILLJJLI = true;
        LiveSignalingSystemSetting liveSignalingSystemSetting = LiveSignalingSystemSetting.INSTANCE;
        if (liveSignalingSystemSetting.connectWs()) {
            C20441214yg.LJIIL("SignalingManager", "SignalingManager.ensureInit: connectWs");
            C2203431BLp.LIZIZ.LJ("live_preview");
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SignalingManager.ensureInit: normal, current wsConnected=");
            sbLIZ.append(C2203431BLp.LIZIZ.isConnected());
            C20441214yg.LJIIL("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        c2203431BLp.LIZLLL(this);
        c2203431BLp.LJI(134217814, -10000, this);
        LLILLL = Boolean.valueOf(c2203431BLp.isConnected());
        if (liveSignalingSystemSetting.tryPollerAtStart()) {
            C486790J7d.LIZLLL(new Runnable() { // from class: X.0J69
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SignalingManager@99ab.ensureInit$1");
                    try {
                        C0J65.LL.getClass();
                        if (!Intrinsics.LJFF(C0J65.LLILLL, Boolean.TRUE)) {
                            C0J65.LIZLLL("no websocket at start");
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SignalingManager@99ab.ensureInit$1");
                }
            }, this, liveSignalingSystemSetting.pollerAtStartDelay());
        }
    }

    public static void LIZLLL(String str) {
        boolean z;
        if (LLIZ != null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SignalingManager.ensurePollSenderTimerStart: reason=");
        sbLIZ.append(str);
        sbLIZ.append(", enableTimer=");
        LiveSignalingSystemSetting liveSignalingSystemSetting = LiveSignalingSystemSetting.INSTANCE;
        sbLIZ.append(liveSignalingSystemSetting.enableTimer());
        sbLIZ.append(", hasStartedTimer=");
        if (LLIZ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
        if (liveSignalingSystemSetting.enableTimer() && LLIZ == null) {
            boolean zEnableUplinkPollOpt = liveSignalingSystemSetting.enableUplinkPollOpt();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SignalingManager.ensurePollSenderTimerStart: realStart, enableUplinkOpt=");
            sbLIZ2.append(zEnableUplinkPollOpt);
            C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ2));
            PthreadTimer pthreadTimer = LLIZ;
            if (pthreadTimer != null) {
                pthreadTimer.cancel();
            }
            LLIZ = null;
            if (zEnableUplinkPollOpt) {
                LLJ = System.currentTimeMillis();
                ConcurrentHashMap<C0J66<?, ?>, Long> concurrentHashMap = LLIZLLLIL;
                concurrentHashMap.clear();
                Iterator it2 = ((CopyOnWriteArrayList) LLILZIL).iterator();
                while (it2.hasNext()) {
                    concurrentHashMap.put((C0J66<?, ?>) it2.next(), Long.valueOf(System.currentTimeMillis()));
                }
                PthreadTimer pthreadTimer2 = new PthreadTimer("rent/TimersKt", false);
                final int i = 0;
                pthreadTimer2.schedule(new C0W9W(i) { // from class: X.0Kd0
                    public final int $t;

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        switch (this.$t) {
                            case 0:
                                run$0(this);
                                break;
                            case 1:
                                run$1(this);
                                break;
                            default:
                                super.run();
                                break;
                        }
                    }

                    public String toString() {
                        return this.$t + "_" + super.toString();
                    }

                    public static void LIZ$0() {
                        String json;
                        String json2;
                        String json3;
                        String json4;
                        C0J65.LL.getClass();
                        if (C1906580ziK.LJI()) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        long j = 1000;
                        if (System.currentTimeMillis() - C0J65.LLJ > LiveSignalingSystemSetting.INSTANCE.timerInterval() * 1000) {
                            C0J65.LLJ = System.currentTimeMillis();
                            for (UplinkModel uplinkModel : (CopyOnWriteArrayList) C0J65.LLILZLL) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("SignalingManager.tickHttpUplink: packed cache message biz=");
                                sbLIZ3.append(uplinkModel.bizType);
                                sbLIZ3.append(" sub=");
                                sbLIZ3.append(uplinkModel.subType);
                                sbLIZ3.append(" data=");
                                T t = uplinkModel.data;
                                if (t != 0) {
                                    C0J65.LL.getClass();
                                    json3 = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, t);
                                } else {
                                    json3 = null;
                                }
                                sbLIZ3.append(json3);
                                sbLIZ3.append(" extra=");
                                ExtraT extraT = uplinkModel.extra;
                                if (extraT != null) {
                                    C0J65.LL.getClass();
                                    json4 = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, extraT);
                                } else {
                                    json4 = null;
                                }
                                sbLIZ3.append(json4);
                                sbLIZ3.append('}');
                                C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ3));
                            }
                            List<UplinkModel<?>> list = C0J65.LLILZLL;
                            arrayList.addAll(list);
                            ((CopyOnWriteArrayList) list).clear();
                        }
                        for (Map.Entry<C0J66<?, ?>, Long> entry : C0J65.LLIZLLLIL.entrySet()) {
                            long jLIZLLL = entry.getKey().LIZLLL() * j;
                            C0J65 c0j65 = C0J65.LL;
                            long jLongValue = entry.getValue().longValue();
                            c0j65.getClass();
                            if (System.currentTimeMillis() - jLongValue > jLIZLLL) {
                                C0J65.LLIZLLLIL.put(entry.getKey(), Long.valueOf(System.currentTimeMillis()));
                                List<UplinkModel<?>> listLJ = entry.getKey().LJ();
                                if (listLJ == null) {
                                    listLJ = C13BV.INSTANCE;
                                }
                                for (UplinkModel<?> uplinkModel2 : listLJ) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("SignalingManager.tickHttpUplink: packed cache message biz=");
                                    sbLIZ4.append(uplinkModel2.bizType);
                                    sbLIZ4.append(" sub=");
                                    sbLIZ4.append(uplinkModel2.subType);
                                    sbLIZ4.append(" data=");
                                    T t2 = uplinkModel2.data;
                                    if (t2 != 0) {
                                        C0J65.LL.getClass();
                                        json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, t2);
                                    } else {
                                        json = null;
                                    }
                                    sbLIZ4.append(json);
                                    sbLIZ4.append(" extra=");
                                    ExtraT extraT2 = uplinkModel2.extra;
                                    if (extraT2 != null) {
                                        C0J65.LL.getClass();
                                        json2 = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, extraT2);
                                    } else {
                                        json2 = null;
                                    }
                                    sbLIZ4.append(json2);
                                    sbLIZ4.append('}');
                                    C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ4));
                                }
                                arrayList.addAll(listLJ);
                            }
                            j = 1000;
                        }
                        C0J65.LJ(arrayList);
                    }

                    {
                        this.$t = i;
                    }

                    public static final void run$0(C521640Kd0 c521640Kd0) {
                        C1C7U.LIZ("SignalingManager@99ab.ensurePollSenderTimerStart$$inlined$timer$default$1");
                        boolean zLJ = C0W9U.LJ(c521640Kd0.bpeaTraceContext);
                        try {
                            LIZ$0();
                        } finally {
                        }
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("SignalingManager@99ab.ensurePollSenderTimerStart$$inlined$timer$default$1");
                    }

                    public static final void run$1(C521640Kd0 c521640Kd0) {
                        C1C7U.LIZ("SignalingManager@99ab.ensurePollSenderTimerStart$$inlined$timer$default$2");
                        boolean zLJ = C0W9U.LJ(c521640Kd0.bpeaTraceContext);
                        try {
                            C0J65.LL.getClass();
                            C0J65.LJII();
                        } finally {
                        }
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("SignalingManager@99ab.ensurePollSenderTimerStart$$inlined$timer$default$2");
                    }
                }, 1000L, 1000L);
                LLIZ = pthreadTimer2;
                return;
            }
            long jTimerInterval = liveSignalingSystemSetting.timerInterval() * 1000;
            PthreadTimer pthreadTimer3 = new PthreadTimer("rent/TimersKt", false);
            final int i2 = 1;
            pthreadTimer3.schedule(new C0W9W(i2) { // from class: X.0Kd0
                public final int $t;

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    switch (this.$t) {
                        case 0:
                            run$0(this);
                            break;
                        case 1:
                            run$1(this);
                            break;
                        default:
                            super.run();
                            break;
                    }
                }

                public String toString() {
                    return this.$t + "_" + super.toString();
                }

                public static void LIZ$0() {
                    String json;
                    String json2;
                    String json3;
                    String json4;
                    C0J65.LL.getClass();
                    if (C1906580ziK.LJI()) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    long j = 1000;
                    if (System.currentTimeMillis() - C0J65.LLJ > LiveSignalingSystemSetting.INSTANCE.timerInterval() * 1000) {
                        C0J65.LLJ = System.currentTimeMillis();
                        for (UplinkModel uplinkModel : (CopyOnWriteArrayList) C0J65.LLILZLL) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("SignalingManager.tickHttpUplink: packed cache message biz=");
                            sbLIZ3.append(uplinkModel.bizType);
                            sbLIZ3.append(" sub=");
                            sbLIZ3.append(uplinkModel.subType);
                            sbLIZ3.append(" data=");
                            T t = uplinkModel.data;
                            if (t != 0) {
                                C0J65.LL.getClass();
                                json3 = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, t);
                            } else {
                                json3 = null;
                            }
                            sbLIZ3.append(json3);
                            sbLIZ3.append(" extra=");
                            ExtraT extraT = uplinkModel.extra;
                            if (extraT != null) {
                                C0J65.LL.getClass();
                                json4 = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, extraT);
                            } else {
                                json4 = null;
                            }
                            sbLIZ3.append(json4);
                            sbLIZ3.append('}');
                            C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        List<UplinkModel<?>> list = C0J65.LLILZLL;
                        arrayList.addAll(list);
                        ((CopyOnWriteArrayList) list).clear();
                    }
                    for (Map.Entry<C0J66<?, ?>, Long> entry : C0J65.LLIZLLLIL.entrySet()) {
                        long jLIZLLL = entry.getKey().LIZLLL() * j;
                        C0J65 c0j65 = C0J65.LL;
                        long jLongValue = entry.getValue().longValue();
                        c0j65.getClass();
                        if (System.currentTimeMillis() - jLongValue > jLIZLLL) {
                            C0J65.LLIZLLLIL.put(entry.getKey(), Long.valueOf(System.currentTimeMillis()));
                            List<UplinkModel<?>> listLJ = entry.getKey().LJ();
                            if (listLJ == null) {
                                listLJ = C13BV.INSTANCE;
                            }
                            for (UplinkModel<?> uplinkModel2 : listLJ) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("SignalingManager.tickHttpUplink: packed cache message biz=");
                                sbLIZ4.append(uplinkModel2.bizType);
                                sbLIZ4.append(" sub=");
                                sbLIZ4.append(uplinkModel2.subType);
                                sbLIZ4.append(" data=");
                                T t2 = uplinkModel2.data;
                                if (t2 != 0) {
                                    C0J65.LL.getClass();
                                    json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, t2);
                                } else {
                                    json = null;
                                }
                                sbLIZ4.append(json);
                                sbLIZ4.append(" extra=");
                                ExtraT extraT2 = uplinkModel2.extra;
                                if (extraT2 != null) {
                                    C0J65.LL.getClass();
                                    json2 = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, extraT2);
                                } else {
                                    json2 = null;
                                }
                                sbLIZ4.append(json2);
                                sbLIZ4.append('}');
                                C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ4));
                            }
                            arrayList.addAll(listLJ);
                        }
                        j = 1000;
                    }
                    C0J65.LJ(arrayList);
                }

                {
                    this.$t = i2;
                }

                public static final void run$0(C521640Kd0 c521640Kd0) {
                    C1C7U.LIZ("SignalingManager@99ab.ensurePollSenderTimerStart$$inlined$timer$default$1");
                    boolean zLJ = C0W9U.LJ(c521640Kd0.bpeaTraceContext);
                    try {
                        LIZ$0();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("SignalingManager@99ab.ensurePollSenderTimerStart$$inlined$timer$default$1");
                }

                public static final void run$1(C521640Kd0 c521640Kd0) {
                    C1C7U.LIZ("SignalingManager@99ab.ensurePollSenderTimerStart$$inlined$timer$default$2");
                    boolean zLJ = C0W9U.LJ(c521640Kd0.bpeaTraceContext);
                    try {
                        C0J65.LL.getClass();
                        C0J65.LJII();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("SignalingManager@99ab.ensurePollSenderTimerStart$$inlined$timer$default$2");
                }
            }, jTimerInterval, jTimerInterval);
            LLIZ = pthreadTimer3;
        }
    }

    public static void LJ(List list) {
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                UplinkModel uplinkModel = (UplinkModel) it2.next();
                T t = uplinkModel.data;
                if (t != 0) {
                    t.setNeedResp(true);
                }
                LL.getClass();
                arrayList.add(LJIIJ(uplinkModel));
            }
            PostUplinkBatchRequest postUplinkBatchRequest = new PostUplinkBatchRequest(arrayList);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SignalingManager.tickHttpUplink: post packed messaged size=");
            sbLIZ.append(list.size());
            C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
            C480460Ism.LIZ().getClass();
            ((HttpApi) C480460Ism.LIZLLL(HttpApi.class)).postUplinkBatch(postUplinkBatchRequest).LJIILIIL(new C0UO0()).LJJLJLI(new C09JN() { // from class: X.0J1y
                @Override // X.C09JN
                public final void accept(Object obj) {
                    List<? extends UplinkMessageResponse> list2;
                    C1C7U.LIZ("SignalingManager@99ab.handleStatusByHttp$1");
                    PostUplinkBatchResponse postUplinkBatchResponse = (PostUplinkBatchResponse) obj;
                    C20441214yg.LJIIL("SignalingManager", "SignalingManager.tickHttpUplink: received resp");
                    if (postUplinkBatchResponse != null && (list2 = postUplinkBatchResponse.bizDataList) != null) {
                        for (UplinkMessageResponse uplinkMessageResponse : list2) {
                            C0J65.LL.getClass();
                            C0J65.LJFF(uplinkMessageResponse, false);
                        }
                    }
                    C1C7U.LIZIZ("SignalingManager@99ab.handleStatusByHttp$1");
                }
            });
        }
    }

    public static UplinkMessageRequest LJIIJ(UplinkModel uplinkModel) {
        UplinkMessageRequest uplinkMessageRequest = new UplinkMessageRequest();
        uplinkMessageRequest.bizType = uplinkModel.bizType;
        uplinkMessageRequest.subType = uplinkModel.subType;
        uplinkMessageRequest.data = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, uplinkModel.data);
        uplinkMessageRequest.extra = uplinkModel.extra;
        return uplinkMessageRequest;
    }

    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg.service != 134217814) {
            return;
        }
        C20441214yg.LJIIL("SignalingManager", "DownLinkReceiver.onReceivedWsMsg: ");
        byte[] bArrLIZ = wsChannelMsg.LIZ();
        if (bArrLIZ != null) {
            try {
                UplinkMessageResponse uplinkMessageResponse = (UplinkMessageResponse) C19748512Ol.LIZJ.LJII(new String(bArrLIZ, Charsets.UTF_8), UplinkMessageResponse.class);
                if (uplinkMessageResponse != null) {
                    LL.getClass();
                    LJFF(uplinkMessageResponse, true);
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C0J67.LIZIZ(true, null, null, false);
    }

    public final void LJI(C0J66<?, ?> c0j66) {
        LIZJ();
        ((CopyOnWriteArrayList) LLILZIL).add(c0j66);
        if (LiveSignalingSystemSetting.INSTANCE.enableUplinkPollOpt()) {
            if (!C2203431BLp.LIZIZ.isConnected() || LLIZ != null) {
                ConcurrentHashMap<C0J66<?, ?>, Long> concurrentHashMap = LLIZLLLIL;
                if (concurrentHashMap.containsKey(c0j66)) {
                    return;
                }
                concurrentHashMap.put(c0j66, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public final void LJIIIIZZ(UplinkModel<?> uplinkModel) {
        String str;
        LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SignalingManager.sendUplinkMessage: wsConnected=");
        sbLIZ.append(LLILLL);
        sbLIZ.append(" uplinkModel.bizType=");
        sbLIZ.append(uplinkModel.bizType);
        sbLIZ.append(" uplinkModel.uniqueId = ");
        ExtraT extraT = uplinkModel.extra;
        if (extraT != null) {
            str = extraT.uniqId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(LLILLL, Boolean.TRUE)) {
            C2203431BLp.LIZIZ.LJIIIIZZ(0L, C963140bAe.LIZJ(), 134217814, 1, GsonProtectorUtils.toJson(C19748512Ol.LIZJ, LJIIJ(uplinkModel)).getBytes(Charsets.UTF_8), "json", "", null);
        }
    }

    public final void LJIIIZ(UplinkModel<?> uplinkModel) {
        if (Intrinsics.LJFF(LLILLL, Boolean.TRUE)) {
            LJIIIIZZ(uplinkModel);
            C0J67.LIZLLL(true, uplinkModel);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UplinkSender.sendUplinkMessageByHttps: uplinkRequest.bizType=");
        sbLIZ.append(uplinkModel.bizType);
        C20441214yg.LJ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
        T t = uplinkModel.data;
        if (t != 0) {
            t.setNeedResp(true);
        }
        C480460Ism.LIZ().getClass();
        ((HttpApi) C480460Ism.LIZLLL(HttpApi.class)).postUplink(LJIIJ(uplinkModel)).LJIILIIL(new C0UO0()).LJJLJLI(new C09JN() { // from class: X.0J1z
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SignalingManager@99ab.sendUplinkMessageByHttps$1");
                UplinkMessageResponse uplinkMessageResponse = (UplinkMessageResponse) obj;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("UplinkSender.sendUplinkMessageByHttps: resp=");
                sbLIZ2.append(uplinkMessageResponse);
                C20441214yg.LJIIL("SignalingManager", C2188811AlT.LIZIZ(sbLIZ2));
                if (uplinkMessageResponse != null) {
                    C0J65.LL.getClass();
                    C0J65.LJFF(uplinkMessageResponse, false);
                }
                C1C7U.LIZIZ("SignalingManager@99ab.sendUplinkMessageByHttps$1");
            }
        });
        C0J67.LIZLLL(false, uplinkModel);
    }

    public static void LJFF(UplinkMessageResponse uplinkMessageResponse, boolean z) {
        boolean z2 = false;
        if (uplinkMessageResponse.bizType.length() == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SignalingManager.invokeMessageDispatch: downlinkModel.bizType=");
        sbLIZ.append(uplinkMessageResponse.bizType);
        C20441214yg.LJ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
        for (C0J66 c0j66 : (CopyOnWriteArrayList) LLILZIL) {
            if (Intrinsics.LJFF(c0j66.LIZ, uplinkMessageResponse.bizType)) {
                List<String> list = c0j66.LIZJ;
                if (list == null) {
                    c0j66.LJI(uplinkMessageResponse, z);
                } else if (list.contains(uplinkMessageResponse.subType)) {
                    c0j66.LJI(uplinkMessageResponse, z);
                }
                z2 = true;
            }
        }
        if (!z2) {
            C0J67.LIZIZ(z, uplinkMessageResponse, null, true);
        }
    }

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        boolean z;
        C0XE1 c0xe1 = c821280WJq.LIZIZ;
        if (LLILZ == c0xe1) {
            return;
        }
        LLILZ = c0xe1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SignalingManager.onWsStateChanged: state=");
        sbLIZ.append(c0xe1.name());
        C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ));
        if (c0xe1 == C0XE1.CONNECTED) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(LLILLL, Boolean.valueOf(z))) {
            return;
        }
        LLILLL = Boolean.valueOf(z);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SignalingManager.onWsStateChanged: wsConnected=");
        sbLIZ2.append(LLILLL);
        C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ2));
        if (C500260Jjc.LJJJI(LLILLL)) {
            if (LiveSignalingSystemSetting.INSTANCE.enableTimer()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("SignalingManager.stopPollSenderTimer: reason=");
                sbLIZ3.append("ws connected");
                C20441214yg.LIZIZ("SignalingManager", C2188811AlT.LIZIZ(sbLIZ3));
                PthreadTimer pthreadTimer = LLIZ;
                if (pthreadTimer != null) {
                    pthreadTimer.cancel();
                }
                LLIZ = null;
                LJII();
            }
        } else {
            LIZLLL("ws disconnected");
        }
        if (LiveSignalingSystemSetting.INSTANCE.enableUplinkPollOpt() && C500260Jjc.LJJJI(LLILLL)) {
            Iterator it2 = ((CopyOnWriteArrayList) LLILZIL).iterator();
            while (it2.hasNext()) {
                List<UplinkModel<?>> listLJIIJJI = ((C0J66) it2.next()).LJIIJJI();
                if (listLJIIJJI != null) {
                    Iterator<UplinkModel<?>> it3 = listLJIIJJI.iterator();
                    while (it3.hasNext()) {
                        LL.LJIIIZ(it3.next());
                    }
                }
            }
        }
    }
}
