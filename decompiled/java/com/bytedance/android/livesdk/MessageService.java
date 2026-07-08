package com.bytedance.android.livesdk;

import X.AbstractC1136060ffY;
import X.AbstractC467020ITc;
import X.C001A;
import X.C08HM;
import X.C08KC;
import X.C09BH;
import X.C0IGS;
import X.C0VSP;
import X.C1101180elI;
import X.C1143780fs0;
import X.C1256004vm;
import X.C1501980pBk;
import X.C163700jz;
import X.C20441214yg;
import X.C2107108Nh;
import X.C2188811AlT;
import X.C2221661BxM;
import X.C2221681BxO;
import X.C2221701BxQ;
import X.C2221821Bxc;
import X.C2222081By2;
import X.C2222241ByI;
import X.C480460Ism;
import X.C823050WQl;
import X.EnumC19379710rr;
import X.InterfaceC1100800ekg;
import X.InterfaceC1115810f8t;
import X.InterfaceC1132950faX;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.TrackMessage;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTrackerSwitchSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageZstdLoadSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageZstdSetting;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.MessageFeatureControl;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class MessageService implements IMessageService {
    public final CopyOnWriteArrayList<InterfaceC1115810f8t> LL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<IInterceptor> LLILLJJLI = new CopyOnWriteArrayList<>();
    public C1101180elI LLILLL;

    @Override // com.bytedance.android.message.IMessageService
    public final MessageFeatureControl featureControl() {
        IMessageManager iMessageManager = C2221681BxO.LIZIZ;
        if (iMessageManager != null) {
            return iMessageManager.featureControl();
        }
        return null;
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager getReuse() {
        if (!C2221681BxO.LJFF || C2221681BxO.LIZLLL(C2221681BxO.LIZIZ)) {
            return null;
        }
        return C2221681BxO.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.message.IMessageService
    public final void initZstdCompressResourceWhenLivePlay() {
        String str;
        if (!LiveMessageZstdSetting.INSTANCE.enable()) {
            return;
        }
        LiveMessageZstdLoadSetting liveMessageZstdLoadSetting = LiveMessageZstdLoadSetting.INSTANCE;
        if (!liveMessageZstdLoadSetting.isZstdLoadWhenLivePlay() && (!liveMessageZstdLoadSetting.isZstdLoadWhenSDKStart() || C2221661BxM.LJ)) {
            return;
        }
        synchronized (C2221661BxM.LIZ) {
            if (C2221661BxM.LJ) {
                return;
            }
            C2221661BxM.LJ = true;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            File fileLJII = C1143780fs0.LJII("live_im_push_compress_zstd_dict", "zstd_dict_model_conf.json");
            Throwable th = null;
            byte[] bArr = null;
            if (fileLJII == null) {
                C2221821Bxc.LIZIZ("conf not found", String.valueOf(C2221661BxM.LIZIZ));
                return;
            }
            InputStreamReader inputStreamReader = new InputStreamReader(new C0VSP(fileLJII), Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                JSONObject jSONObject = new JSONObject(C08KC.LIZJ(bufferedReader));
                C2107108Nh.LIZ(bufferedReader, null);
                C2221661BxM.LIZIZ = jSONObject.optInt("zstd_dict_version", -1);
                C2221661BxM.LIZJ = jSONObject.optString("zstd_dict_md5");
                File fileLJII2 = C1143780fs0.LJII("live_im_push_compress_zstd_dict", "zstd_dict_model.zstd");
                byte[] bArrLJ = fileLJII2 != null ? C09BH.LJ(fileLJII2) : null;
                String strLIZLLL = C08HM.LIZLLL(bArrLJ);
                boolean z = (strLIZLLL == null || strLIZLLL.length() == 0 || !TextUtils.equals(C2221661BxM.LIZJ, strLIZLLL)) ? false : true;
                int i = C2221661BxM.LIZIZ;
                boolean z2 = i > 0;
                if (!z) {
                    str = "md5 not match";
                } else {
                    if (z2) {
                        C2221821Bxc.LIZJ(SystemClock.elapsedRealtime() - jElapsedRealtime, String.valueOf(i));
                        bArr = bArrLJ;
                        C2221661BxM.LIZLLL = bArr;
                    }
                    str = "version illegal";
                }
                C2221821Bxc.LIZIZ(str, String.valueOf(i));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("zstd resource init failed reason: ");
                sbLIZ.append(str);
                C20441214yg.LJIIL("LiveZstd", C2188811AlT.LIZIZ(sbLIZ));
                C2221661BxM.LIZLLL = bArr;
            } catch (Throwable th2) {
                try {
                    TryCatchGuardChecker.doCheck(th2);
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(bufferedReader, th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void initZstdCompressResourceWhenSDKStart() {
        if (LiveMessageZstdSetting.INSTANCE.enable() && LiveMessageZstdLoadSetting.INSTANCE.isZstdLoadWhenSDKStart()) {
            synchronized (C2221661BxM.LIZ) {
                if (C2221661BxM.LJ) {
                    return;
                }
                C2221661BxM.LJ = true;
                C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.1BxL
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveZstdUtils@e6.initAsync$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveZstdUtils@e6.initAsync$1");
                    }

                    public static void LIZ() throws Throwable {
                        String str;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        File fileLJII = C1143780fs0.LJII("live_im_push_compress_zstd_dict", "zstd_dict_model_conf.json");
                        Throwable th = null;
                        byte[] bArr = null;
                        if (fileLJII == null) {
                            C2221821Bxc.LIZIZ("conf not found", String.valueOf(C2221661BxM.LIZIZ));
                            return;
                        }
                        Reader inputStreamReader = new InputStreamReader(new C0VSP(fileLJII), Charsets.UTF_8);
                        if (!(inputStreamReader instanceof BufferedReader)) {
                            inputStreamReader = new BufferedReader(inputStreamReader, 8192);
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(C08KC.LIZJ(inputStreamReader));
                            C2107108Nh.LIZ(inputStreamReader, null);
                            C2221661BxM.LIZIZ = jSONObject.optInt("zstd_dict_version", -1);
                            C2221661BxM.LIZJ = jSONObject.optString("zstd_dict_md5");
                            File fileLJII2 = C1143780fs0.LJII("live_im_push_compress_zstd_dict", "zstd_dict_model.zstd");
                            byte[] bArrLJ = fileLJII2 != null ? C09BH.LJ(fileLJII2) : null;
                            String strLIZLLL = C08HM.LIZLLL(bArrLJ);
                            boolean z = (strLIZLLL == null || strLIZLLL.length() == 0 || !TextUtils.equals(C2221661BxM.LIZJ, strLIZLLL)) ? false : true;
                            int i = C2221661BxM.LIZIZ;
                            boolean z2 = i > 0;
                            if (!z) {
                                str = "md5 not match";
                            } else {
                                if (z2) {
                                    C2221821Bxc.LIZJ(SystemClock.elapsedRealtime() - jElapsedRealtime, String.valueOf(i));
                                    bArr = bArrLJ;
                                    C2221661BxM.LIZLLL = bArr;
                                }
                                str = "version illegal";
                            }
                            C2221821Bxc.LIZIZ(str, String.valueOf(i));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("zstd resource init failed reason: ");
                            sbLIZ.append(str);
                            C20441214yg.LJIIL("LiveZstd", C2188811AlT.LIZIZ(sbLIZ));
                            C2221661BxM.LIZLLL = bArr;
                        } catch (Throwable th2) {
                            try {
                                TryCatchGuardChecker.doCheck(th2);
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th = th2;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            C2107108Nh.LIZ(inputStreamReader, th);
                                            throw th;
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void preloadClass() {
        C001A.MSG_DETECT_MESSAGE.getIntType();
    }

    @Override // com.bytedance.android.message.IMessageService
    public final EventListener provideEventListener() {
        return new EventListener() { // from class: X.1Bxd
            public final AtomicLong LIZ = new AtomicLong();
            public final AtomicLong LIZIZ = new AtomicLong();
            public final AtomicLong LIZJ = new AtomicLong();

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onPreDispatchMessage(IMessage iMessage) {
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onPreDispatchMessages(List<IMessage> list) {
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onImFetchStarted() {
                this.LIZIZ.set(SystemClock.uptimeMillis());
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onImFetchSucceeded() {
                if (this.LIZIZ.get() > 0) {
                    C1CC2.LJIIIZ(0, SystemClock.uptimeMillis() - this.LIZIZ.get(), "ttlive_im_fetch_status_all");
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onImPrefetchStarted() {
                this.LIZJ.set(SystemClock.uptimeMillis());
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onImPrefetchSucceeded() {
                if (this.LIZJ.get() > 0) {
                    C1CC2.LJIIIZ(0, SystemClock.uptimeMillis() - this.LIZJ.get(), "ttlive_im_prefetch_status_all");
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onReset() {
                this.LIZ.set(0L);
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onRoomEntered() {
                this.LIZ.set(SystemClock.uptimeMillis());
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onWebSocketConnected() {
                if (C13LQ.LJIILLIIL("ttlive_web_socket_connected", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
                    C2221821Bxc.LJIIL(0, "ttlive_web_socket_connected", new HashMap(C2221821Bxc.LIZ));
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onWebSocketDisconnected() {
                if (C13LQ.LJIILLIIL("ttlive_web_socket_disconnected", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
                    C2221821Bxc.LJIIL(0, "ttlive_web_socket_disconnected", new HashMap(C2221821Bxc.LIZ));
                }
            }

            public static void LIZ(IMessage iMessage) {
                String str;
                Long lValueOf;
                int i;
                Boolean bool;
                AbstractC1136060ffY abstractC1136060ffY;
                C001A messageType;
                AbstractC1136060ffY abstractC1136060ffY2;
                CommonMessageData commonMessageData;
                if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() || C2221841Bxe.LIZIZ("message_dispatch_universal")) {
                    try {
                        long currentUserId = UserService.getInstance().user().getCurrentUserId();
                        String strValueOf = String.valueOf(currentUserId);
                        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
                        if (map == null || (str = (String) map.get("anchor_id")) == null) {
                            str = CardStruct.IStatusCode.DEFAULT;
                        }
                        boolean zLJFF = Intrinsics.LJFF(strValueOf, str);
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("front_msg_size", iMessage.getExtraParams().get("front_msg_size"));
                        MessageMonitor.dealExtraParamsStageInfo(jSONObject2, iMessage.getExtraParams());
                        jSONObject2.put("receive_to_deal", MessageMonitor.getStageDuration(iMessage.getExtraParams(), MessageMonitor.getLiveMessageStageName("deal_raw_msg", MessageMonitor.Stage.START), MessageMonitor.getLiveMessageStageName("receive_raw_msg", MessageMonitor.Stage.END)));
                        jSONObject2.put("window_count_wait", MessageMonitor.getWindowCountWaitExtra(iMessage.getExtraParams()));
                        jSONObject2.put("extra_message_payload_size", iMessage.getExtraParams().get("extra_message_payload_size"));
                        jSONObject2.put("extra_message_dispatch_status", iMessage.getExtraParams().get("extra_message_dispatch_status"));
                        jSONObject.put("is_direct_dispatch", iMessage.getExtraParams().get("is_direct_dispatch"));
                        jSONObject.put("dispatch_strategy", iMessage.getExtraParams().get("dispatch_strategy"));
                        jSONObject.put("is_feature_msg", iMessage.getExtraParams().get("is_feature_msg"));
                        jSONObject.put("msg_id", iMessage.getExtraParams().get("msg_id"));
                        String str2 = null;
                        if ((iMessage instanceof AbstractC1136060ffY) && (abstractC1136060ffY2 = (AbstractC1136060ffY) iMessage) != null && (commonMessageData = abstractC1136060ffY2.baseMessage) != null) {
                            lValueOf = Long.valueOf(commonMessageData.roomId);
                        } else {
                            lValueOf = null;
                        }
                        jSONObject.put("room_id", lValueOf);
                        jSONObject.put("user_id", currentUserId);
                        jSONObject.put("is_p2p_msg", C2221841Bxe.LIZJ(iMessage.getGeneralMessageType()));
                        jSONObject.put("method", iMessage.getMethodName());
                        jSONObject.put("msg_from", iMessage.getMessageFrom());
                        jSONObject.put("extra_first_batch", iMessage.getExtraParams().get("extra_first_batch"));
                        boolean zBooleanValue = false;
                        if (zLJFF) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        jSONObject.put("is_anchor", i);
                        if (iMessage instanceof LinkMessage) {
                            jSONObject.put("link_msg_type", ((LinkMessage) iMessage).messageType);
                        } else if (iMessage instanceof LinkLayerMessage) {
                            jSONObject.put("link_msg_type", ((LinkLayerMessage) iMessage).messageType);
                        }
                        Object obj = iMessage.getExtraParams().get("extra_message_is_client_insert");
                        if (obj instanceof Boolean) {
                            bool = (Boolean) obj;
                            if (bool != null) {
                                zBooleanValue = bool.booleanValue();
                            }
                        } else {
                            bool = null;
                        }
                        jSONObject.put("extra_message_is_client_insert", zBooleanValue);
                        if (C500260Jjc.LJJJI(bool)) {
                            if ((iMessage instanceof AbstractC1136060ffY) && (abstractC1136060ffY = (AbstractC1136060ffY) iMessage) != null && (messageType = abstractC1136060ffY.getMessageType()) != null) {
                                str2 = messageType.wsMethod;
                            }
                            jSONObject.put("method", str2);
                        }
                        C1CC2.LJFF("message_dispatch_universal", jSONObject, jSONObject2, jSONObject2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onConnectingWebSocket(int i) {
                if (i == 0 && this.LIZ.get() > 0) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ws_start_connect_duration");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(Long.valueOf(SystemClock.uptimeMillis() - this.LIZ.get()), "duration");
                    c474500IjALIZ.LIZ();
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onDeduplicateInterceptorMessage(IMessage iMessage) {
                Object obj;
                String serverDeviceId;
                if (iMessage instanceof AbstractC1136060ffY) {
                    AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) iMessage;
                    if (abstractC1136060ffY.baseMessage != null) {
                        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                        Map map = (Map) DataChannelGlobal.LLILZ.gg0(C1148040fys.class);
                        if (map == null || (obj = map.get("anchor_id")) == null) {
                            obj = CardStruct.IStatusCode.DEFAULT;
                        }
                        boolean zLJFF = Intrinsics.LJFF(strValueOf, obj);
                        Pair[] pairArr = new Pair[7];
                        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
                        if (iHostAppContext != null) {
                            serverDeviceId = iHostAppContext.getServerDeviceId();
                        } else {
                            serverDeviceId = null;
                        }
                        pairArr[0] = new Pair("device_id", serverDeviceId);
                        pairArr[1] = new Pair("room_id", Long.valueOf(abstractC1136060ffY.baseMessage.roomId));
                        pairArr[2] = new Pair("is_anchor", Integer.valueOf(zLJFF ? 1 : 0));
                        pairArr[3] = new Pair("msg_id", Long.valueOf(abstractC1136060ffY.baseMessage.messageId));
                        pairArr[4] = new Pair("method", abstractC1136060ffY.getMethodName());
                        pairArr[5] = new Pair("msg_from", Integer.valueOf(abstractC1136060ffY.getMessageFrom()));
                        pairArr[6] = new Pair("msg_type", Integer.valueOf(C2221841Bxe.LIZJ(abstractC1136060ffY.getGeneralMessageType()) ? 1 : 0));
                        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
                            if (entry.getValue() != null) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        C1CC2.LJII(1, "ttlive_im_message_duplicate_interceptor", linkedHashMap);
                    }
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onDispatchMessage(IMessage iMessage) {
                MessageMonitor.markDispatchStatus(iMessage, MessageMonitor.DispatchStatus.SUCCESS);
                C2221821Bxc.LJII(iMessage);
                LIZ(iMessage);
                if (C13LQ.LJIILLIIL("ttlive_dispatch_message", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
                    HashMap map = new HashMap(C2221821Bxc.LIZ);
                    if (iMessage != null) {
                        map.put("message_id", Long.valueOf(iMessage.getMessageId()));
                        map.put("message_type", Integer.valueOf(iMessage.getGeneralMessageType()));
                        map.put("message_method", iMessage.getMethodName());
                        map.put("message_strategy", Integer.valueOf(iMessage.getMessageFrom()));
                    }
                    C2221821Bxc.LJIIL(0, "ttlive_dispatch_message", map);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onImFetchFailed(Throwable th) {
                String message;
                C501520Jle c501520Jle;
                if (this.LIZIZ.get() > 0) {
                    C1CC2.LJIIIZ(1, SystemClock.uptimeMillis() - this.LIZIZ.get(), "ttlive_im_fetch_status_all");
                    Pair[] pairArr = new Pair[2];
                    Integer numValueOf = null;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    pairArr[0] = new Pair("error_msg", message);
                    if ((th instanceof C501520Jle) && (c501520Jle = (C501520Jle) th) != null) {
                        numValueOf = Integer.valueOf(c501520Jle.getErrorCode());
                    }
                    pairArr[1] = new Pair("error_code", numValueOf);
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
                        if (entry.getValue() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    C1CC2.LJII(1, "ttlive_im_fetch_status_error", linkedHashMap);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onImPrefetchFailed(Throwable th) {
                String message;
                C501520Jle c501520Jle;
                if (this.LIZJ.get() > 0) {
                    C1CC2.LJIIIZ(1, SystemClock.uptimeMillis() - this.LIZJ.get(), "ttlive_im_prefetch_status_all");
                    Pair[] pairArr = new Pair[2];
                    Integer numValueOf = null;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    pairArr[0] = new Pair("error_msg", message);
                    if ((th instanceof C501520Jle) && (c501520Jle = (C501520Jle) th) != null) {
                        numValueOf = Integer.valueOf(c501520Jle.getErrorCode());
                    }
                    pairArr[1] = new Pair("error_code", numValueOf);
                    Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
                        if (entry.getValue() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    C1CC2.LJII(1, "ttlive_im_prefetch_status_error", linkedHashMap);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onInterceptMessage(IMessage iMessage) {
                if (!iMessage.getExtraParams().containsKey("extra_message_dispatch_status")) {
                    MessageMonitor.markDispatchStatus(iMessage, MessageMonitor.DispatchStatus.SKIPPING_OTHER);
                }
                C2221821Bxc.LJII(iMessage);
                LIZ(iMessage);
                if (C13LQ.LJIILLIIL("ttlive_intercept_message", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
                    HashMap map = new HashMap(C2221821Bxc.LIZ);
                    map.put("message_id", Long.valueOf(iMessage.getMessageId()));
                    map.put("message_type", Integer.valueOf(iMessage.getGeneralMessageType()));
                    map.put("message_method", iMessage.getMethodName());
                    map.put("message_strategy", Integer.valueOf(iMessage.getMessageFrom()));
                    C2221821Bxc.LJIIL(0, "ttlive_intercept_message", map);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onMessageConsumeException(IMessage iMessage) {
                MessageMonitor.markDispatchStatus(iMessage, MessageMonitor.DispatchStatus.EXCEPTION_BIZ_CODE);
                C2221821Bxc.LJII(iMessage);
                LIZ(iMessage);
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onSwitchToHttp(String str) {
                if (C13LQ.LJIILLIIL("ttlive_switch_to_http", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
                    HashMap map = new HashMap(C2221821Bxc.LIZ);
                    map.put("reason", str);
                    C2221821Bxc.LJIIL(0, "ttlive_switch_to_http", map);
                }
            }

            @Override // com.ss.ugc.live.sdk.message.interfaces.EventListener
            public final void onEnqueueMessage(List<? extends IMessage> list, List<? extends IMessage> list2) {
                Integer numValueOf;
                if (C13LQ.LJIILLIIL("ttlive_enqueue_message", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
                    HashMap map = new HashMap(C2221821Bxc.LIZ);
                    Integer numValueOf2 = null;
                    if (list != null) {
                        numValueOf = Integer.valueOf(list.size());
                    } else {
                        numValueOf = null;
                    }
                    map.put("total_size", numValueOf);
                    ArrayList arrayList = new ArrayList();
                    if (list != null) {
                        for (IMessage iMessage : list) {
                            arrayList.add(new TrackMessage(Long.valueOf(iMessage.getMessageId()), Integer.valueOf(iMessage.getGeneralMessageType()), iMessage.getMethodName(), Integer.valueOf(iMessage.getMessageFrom())));
                        }
                    }
                    map.put("total_message_list", arrayList);
                    if (list2 != null) {
                        numValueOf2 = Integer.valueOf(list2.size());
                    }
                    map.put("dispatch_size", numValueOf2);
                    ArrayList arrayList2 = new ArrayList();
                    if (list2 != null) {
                        for (IMessage iMessage2 : list2) {
                            arrayList2.add(new TrackMessage(Long.valueOf(iMessage2.getMessageId()), Integer.valueOf(iMessage2.getGeneralMessageType()), iMessage2.getMethodName(), Integer.valueOf(iMessage2.getMessageFrom())));
                        }
                    }
                    map.put("dispatch_message_list", arrayList2);
                    C2221821Bxc.LJIIL(0, "ttlive_enqueue_message", map);
                }
            }
        };
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void retryReleaseAll() {
        if (C2221681BxO.LIZIZ == null || C2221681BxO.LIZ != 0) {
            return;
        }
        C2221681BxO.LIZJ();
    }

    @Override // com.bytedance.android.message.IMessageService
    public final C0IGS getMessageTimeTracker() {
        return C1256004vm.LIZ;
    }

    @Override // com.bytedance.android.message.IMessageService
    public final C1101180elI getPerfMetricScoreResult() {
        return this.LLILLL;
    }

    @Override // com.bytedance.android.message.IMessageService
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void releaseAll() {
        C2221681BxO.LIZJ();
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void addMessageInterceptor(IInterceptor iInterceptor) {
        this.LLILLJJLI.add(iInterceptor);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void addMessageInterceptorFunc(Function0<? extends InterfaceC1132950faX> function0) {
        ((ArrayList) C2221681BxO.LJI).add(function0);
        if (C2221681BxO.LJII) {
            C2221681BxO.LIZ(C2221681BxO.LIZIZ);
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void addOnMessageParsedListener(InterfaceC1115810f8t interfaceC1115810f8t) {
        if (!this.LL.contains(interfaceC1115810f8t)) {
            this.LL.add(interfaceC1115810f8t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.message.IMessageService
    public final <T> T create(Class<T> cls) {
        C1501980pBk c1501980pBkLIZ = C1501980pBk.LIZ();
        c1501980pBkLIZ.getClass();
        C480460Ism.LIZ().getClass();
        return (T) c1501980pBkLIZ.LIZIZ(cls, C480460Ism.LIZLLL(cls));
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager get(long j) {
        if (j == C2221681BxO.LIZ) {
            return C2221681BxO.LIZIZ;
        }
        return null;
    }

    @Override // com.bytedance.android.message.IMessageService
    public final Class<? extends AbstractC1136060ffY> getMessageClass(String str) {
        return C001A.getMessageClass(str);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void keepPerfMetricForReport(InterfaceC1100800ekg interfaceC1100800ekg) {
        interfaceC1100800ekg.LJIIIIZZ(new AbstractC467020ITc() { // from class: X.0elg
            @Override // X.AbstractC467020ITc, X.InterfaceC1101120elC
            public final void LIZJ(InterfaceC1100800ekg interfaceC1100800ekg2, C1100750ekb c1100750ekb) {
                this.LIZ.LLILLL = c1100750ekb.LIZIZ;
            }
        });
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void notifyOnMessage(IMessage iMessage) {
        Iterator<IInterceptor> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onMessage(iMessage);
        }
        if (iMessage != null) {
            iMessage.setProtoMessage(null);
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void release(long j) {
        if (j == C2221681BxO.LIZ && j != 0) {
            IMessageManager iMessageManager = C2221681BxO.LIZIZ;
            if (iMessageManager != null) {
                iMessageManager.releaseMessage();
            }
            C2221681BxO.LIZ = 0L;
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void removeMessageInterceptor(IInterceptor iInterceptor) {
        this.LLILLJJLI.remove(iInterceptor);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void removeOnMessageParsedListener(InterfaceC1115810f8t interfaceC1115810f8t) {
        this.LL.remove(interfaceC1115810f8t);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void updateRoomInfo(long j, Context context) {
        IMessageManager iMessageManager;
        C2221701BxQ c2221701BxQ;
        C2222241ByI c2222241ByI;
        IMessageWsClient iMessageWsClient;
        if (C2221681BxO.LIZ != j && (iMessageManager = C2221681BxO.LIZIZ) != null) {
            C2221681BxO.LIZ = j;
            iMessageManager.resetRoomInfo(j, C2221681BxO.LIZJ);
            C2222081By2 c2222081By2 = C2221681BxO.LIZJ;
            if (c2222081By2 != null && (c2221701BxQ = c2222081By2.LIZIZ) != null && (c2222241ByI = c2221701BxQ.LIZIZ) != null && (iMessageWsClient = c2222241ByI.LIZ) != null) {
                iMessageWsClient.setData(j, context);
            }
            if (C2221681BxO.LJ != null) {
                IMessageManager iMessageManager2 = C2221681BxO.LIZIZ;
                if (iMessageManager2 != null) {
                    iMessageManager2.removeMessageListener(C001A.MSG_DETECT_MESSAGE.getIntType(), C2221681BxO.LJ);
                }
                IMessageManager iMessageManager3 = C2221681BxO.LIZIZ;
                if (iMessageManager3 != null) {
                    iMessageManager3.addAsyncMessageListener(C001A.MSG_DETECT_MESSAGE.getIntType(), C2221681BxO.LJ);
                }
            }
            C2221681BxO.LIZIZ(j, C2221681BxO.LIZIZ);
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager get(Context context, long j, long j2) {
        return C2221681BxO.LJ(context, j, false, j2, false, true, EnumC19379710rr.LIVE_ROOM, false);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager messageManagerProvider(long j, boolean z, Context context) {
        if (z) {
            return messageManagerProvider(j, z, context, true, true, EnumC19379710rr.LIVE_ROOM, false);
        }
        return messageManagerProvider(j, false, context, false, true, EnumC19379710rr.LIVE_ROOM, false);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final void updateRoomInfo(IMessageManager iMessageManager, long j, Context context) {
        IMessageWsClient iMessageWsClient;
        C2221701BxQ c2221701BxQ;
        C2222241ByI c2222241ByI;
        IMessageWsClient iMessageWsClient2;
        Long lValueOf;
        if (iMessageManager != null) {
            C2222081By2 messageConfiguration = iMessageManager.getMessageConfiguration();
            if (messageConfiguration != null && (c2221701BxQ = messageConfiguration.LIZIZ) != null && (c2222241ByI = c2221701BxQ.LIZIZ) != null && (iMessageWsClient2 = c2222241ByI.LIZ) != null && (((lValueOf = Long.valueOf(iMessageWsClient2.getRoomId())) != null && lValueOf.longValue() == j) || iMessageManager == null)) {
                return;
            }
            iMessageManager.resetRoomInfo(j, iMessageManager.getMessageConfiguration());
            C2222241ByI c2222241ByI2 = iMessageManager.getMessageConfiguration().LIZIZ.LIZIZ;
            if (c2222241ByI2 != null && (iMessageWsClient = c2222241ByI2.LIZ) != null) {
                iMessageWsClient.setData(j, context);
            }
            iMessageManager.addAsyncMessageListener(C001A.MSG_DETECT_MESSAGE.getIntType(), new C163700jz(C2221681BxO.LIZLLL));
            C2221681BxO.LIZIZ(j, iMessageManager);
        }
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager messageManagerProvider(long j, boolean z, Context context, boolean z2) {
        return messageManagerProvider(j, z, context, z2, true, EnumC19379710rr.LIVE_ROOM, false);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager messageManagerProvider(long j, boolean z, boolean z2, Context context) {
        return messageManagerProvider(j, z, context, true, true, EnumC19379710rr.LIVE_ROOM, z2);
    }

    @Override // com.bytedance.android.message.IMessageService
    public final IMessageManager messageManagerProvider(long j, boolean z, Context context, boolean z2, boolean z3, EnumC19379710rr enumC19379710rr, boolean z4) {
        return C2221681BxO.LJ(context, j, z, UserService.getInstance().user().getCurrentUserId(), z2, z3, enumC19379710rr, z4);
    }
}
