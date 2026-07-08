package X;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.aweme.websocket.api.data.Base;
import com.ss.android.ugc.aweme.websocket.api.data.Other;
import com.ss.android.ugc.aweme.websocket.api.data.RequestLog;
import com.ss.android.ugc.aweme.websocket.api.data.WsConnectionError;
import com.ss.android.ugc.aweme.websocket.api.data.WsConnectionInfo;
import com.ss.android.ugc.aweme.websocket.experiment.ZombieWsConnectionRecoveryConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845320XEc extends AbstractC845060XDc {
    public static volatile boolean LJIIJ;
    public static volatile C821300WJs LJIIJJI;
    public static volatile String LJIIL;
    public static volatile int LJIILIIL;
    public static final C845320XEc LJI = new C845320XEc();
    public static final String LJII = "WsManagerV2";
    public static final C054G LJIIIIZZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ).plus(new C854810Xg7(CoroutineExceptionHandler.LJJLIL, 0)));
    public static final C1DEV LJIIIZ = C2191201ApK.LIZ();
    public static final C0XEX LJIILJJIL = new InterfaceC810750VrF() { // from class: X.0XEX
        @Override // X.InterfaceC810750VrF
        public final void LIZ(WsChannelMsg wsChannelMsg) {
            if (wsChannelMsg == null) {
                C845400XEk.LIZ("WsManagerV2", "[onReceiveMsg], msg is null");
                C845130XDj.LIZ.getClass();
                C845130XDj.LIZ(-1, -1, 0, "msg_null");
                return;
            }
            C845320XEc c845320XEc = C845320XEc.LJI;
            c845320XEc.LIZIZ = SystemClock.elapsedRealtime();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[onReceiveMsg], msg = ");
            sbLIZ.append(wsChannelMsg);
            C845400XEk.LIZIZ("WsManagerV2", C2188811AlT.LIZIZ(sbLIZ));
            int i = wsChannelMsg.service;
            int i2 = wsChannelMsg.method;
            InterfaceC486470J5x interfaceC486470J5x = c845320XEc.LJIILIIL().get(new C845110XDh(i, i2));
            if (interfaceC486470J5x != null) {
                interfaceC486470J5x.LIZIZ(wsChannelMsg);
            }
            InterfaceC486470J5x interfaceC486470J5x2 = c845320XEc.LJIILIIL().get(new C845110XDh(i, -10000));
            if (interfaceC486470J5x2 != null) {
                interfaceC486470J5x2.LIZIZ(wsChannelMsg);
            }
            Iterator it2 = ((CopyOnWriteArraySet) c845320XEc.LJ.getValue()).iterator();
            while (it2.hasNext()) {
                ((InterfaceC486470J5x) it2.next()).LIZIZ(wsChannelMsg);
            }
            C845130XDj.LIZ.getClass();
            C845130XDj.LIZ(i, i2, 0, "received");
        }

        @Override // X.InterfaceC810750VrF
        public final void onReceiveConnectEvent(C821280WJq c821280WJq, JSONObject jSONObject) throws JSONException {
            WsConnectionError wsConnectionError;
            Long lValueOf;
            String str;
            String strLJJZ;
            int iIntValue;
            Other other;
            String str2;
            Base base;
            RequestLog requestLog;
            Base base2;
            Integer num = null;
            if (c821280WJq != null && c821280WJq.LIZIZ != null && jSONObject != null) {
                WsConnectionInfo wsConnectionInfo = new WsConnectionInfo(null, null, null, null, null, null, null, null);
                wsConnectionInfo.channelId = C0Q68.LIZ("channel_id", jSONObject);
                wsConnectionInfo.type = C0Q68.LIZ("type", jSONObject);
                wsConnectionInfo.state = C0Q68.LIZ("state", jSONObject);
                wsConnectionInfo.url = C0Q68.LIZIZ("url", jSONObject);
                wsConnectionInfo.channelType = C0Q68.LIZ("channel_type", jSONObject);
                wsConnectionInfo.errorCode = C0Q68.LIZ("error_code", jSONObject);
                wsConnectionInfo.privateProtocolEnable = C0Q68.LIZ("private_protocol_enable", jSONObject);
                String strLIZIZ = C0Q68.LIZIZ("error", jSONObject);
                if (strLIZIZ != null) {
                    JSONObject jSONObject2 = new JSONObject(strLIZIZ);
                    wsConnectionError = new WsConnectionError(null, null, null, null);
                    wsConnectionError.code = C0Q68.LIZ("code", jSONObject2);
                    wsConnectionError.message = C0Q68.LIZIZ("message", jSONObject2);
                    wsConnectionError.requestLog = (RequestLog) JsonParseUtils.LIZLLL(RequestLog.class, JSONObjectProtectorUtils.getString(jSONObject2, "request_log"));
                    wsConnectionError.wsState = C0Q68.LIZ("ws_state", jSONObject2);
                } else {
                    wsConnectionError = null;
                }
                wsConnectionInfo.error = wsConnectionError;
                C0XE1 c0xe1 = c821280WJq.LIZIZ;
                if (c0xe1 == C0XE1.CONNECT_FAILED && wsConnectionError == null) {
                    return;
                }
                C845320XEc c845320XEc = C845320XEc.LJI;
                c845320XEc.LIZ = c0xe1;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[onStateChanged], state = ");
                sbLIZ.append(c845320XEc.LIZ.name());
                sbLIZ.append(", json = ");
                sbLIZ.append(jSONObject);
                C845400XEk.LIZIZ("WsManagerV2", C2188811AlT.LIZIZ(sbLIZ));
                Iterator it2 = ((CopyOnWriteArraySet) c845320XEc.LJFF.getValue()).iterator();
                while (it2.hasNext()) {
                    ((C0XEZ) it2.next()).LIZ(c821280WJq, jSONObject);
                }
                C2261941Dg8 c2261941Dg8 = C2261941Dg8.LIZ;
                C845320XEc c845320XEc2 = C845320XEc.LJI;
                C0XE1 c0xe12 = c845320XEc2.LIZ;
                c2261941Dg8.getClass();
                if (C2261941Dg8.LJIIIIZZ != EnumC2261951Dg9.UNKNOWN) {
                    C20648087a.LIZ(new AwS579S0100000_35(c0xe12, 257));
                }
                C0XE1 c0xe13 = c845320XEc2.LIZ;
                if (C0XEU.LIZ[c0xe13.ordinal()] == 1) {
                    C845400XEk.LIZIZ("WsReconnectUtils", "[stopReconnectTimer]");
                    ScheduledFuture<?> scheduledFuture = C0XEV.LIZ;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    C0XEV.LIZ = null;
                } else if (C0XEV.LIZ == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[startReconnectTimer], state = ");
                    sbLIZ2.append(c0xe13.name());
                    C845400XEk.LIZIZ("WsReconnectUtils", C2188811AlT.LIZIZ(sbLIZ2));
                    C0XEV.LIZ = C823050WQl.LJ().schedule(new Runnable() { // from class: X.0XEW
                        public static void LIZ() {
                            C845400XEk.LIZIZ("WsReconnectUtils", "[stopReconnectTimer]");
                            ScheduledFuture<?> scheduledFuture2 = C0XEV.LIZ;
                            if (scheduledFuture2 != null) {
                                scheduledFuture2.cancel(true);
                            }
                            C0XEV.LIZ = null;
                            if (C2214201BlK.LJIIJJI) {
                                C845400XEk.LIZIZ("WsReconnectUtils", "[reconnect], failed, only in foreground will reconnect");
                            } else if (C036E.LIZ.LIZIZ()) {
                                C2203431BLp.LIZIZ.LJFF("connect_timeout");
                            } else {
                                C845400XEk.LIZIZ("WsReconnectUtils", "[reconnect], failed, network unavailable");
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("WsReconnectUtils@f6d3.startReconnectTimer$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("WsReconnectUtils@f6d3.startReconnectTimer$1");
                        }
                    }, 15L, TimeUnit.SECONDS);
                }
                String str3 = "";
                if (C0XET.LIZ[c845320XEc2.LIZ.ordinal()] == 1) {
                    String str4 = wsConnectionInfo.url;
                    if (str4 == null) {
                        str4 = "";
                    }
                    c845320XEc2.LIZJ = str4;
                    c845320XEc2.LIZIZ = SystemClock.elapsedRealtime();
                }
                C0XE1 c0xe14 = c821280WJq.LIZIZ;
                if ((c0xe14 == C0XE1.CONNECT_FAILED || c0xe14 == C0XE1.CONNECT_CLOSED) && wsConnectionInfo.error == null) {
                    return;
                }
                C0XEY c0xey = C0XEY.LIZ;
                C0XE1 c0xe15 = c845320XEc2.LIZ;
                c0xey.getClass();
                int i = C0XE3.LIZ[c0xe15.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 || C0XEY.LIZIZ) {
                            C0XEY.LIZJ = 0L;
                            C0XEY.LIZIZ = false;
                            lValueOf = null;
                        } else {
                            return;
                        }
                    } else {
                        if (!C0XEY.LIZIZ) {
                            C0XEY.LIZJ = System.currentTimeMillis();
                        }
                        C0XEY.LIZIZ = true;
                        return;
                    }
                } else if (C0XEY.LIZIZ) {
                    if (C0XEY.LIZJ > 0) {
                        lValueOf = Long.valueOf(System.currentTimeMillis() - C0XEY.LIZJ);
                    } else {
                        lValueOf = null;
                    }
                    C0XEY.LIZJ = 0L;
                    C0XEY.LIZIZ = false;
                } else {
                    return;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("event_type", 1);
                jSONObject3.put("connection_type", wsConnectionInfo.type);
                jSONObject3.put("connection_state", wsConnectionInfo.state);
                WsConnectionError wsConnectionError2 = wsConnectionInfo.error;
                if (((wsConnectionError2 == null || (requestLog = wsConnectionError2.requestLog) == null || (base2 = requestLog.base) == null || (str = base2.originUrl) == null) && (str = wsConnectionInfo.url) == null) || (strLJJZ = a0.LJJZ(str, "?", str)) == null) {
                    strLJJZ = "unknown";
                }
                jSONObject3.put("url", strLJJZ);
                Integer num2 = wsConnectionInfo.channelType;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = -1;
                }
                jSONObject3.put("channel_type", iIntValue);
                jSONObject3.put("is_background", C1906580ziK.LJI() ? 1 : 0);
                jSONObject3.put("network_code", C845540XEy.LIZ(C845540XEy.LIZ));
                jSONObject3.put("network_level", C912260Zqa.LIZIZ.getNqeNetworkLevel().LIZIZ);
                if (lValueOf != null) {
                    jSONObject3.put("duration", lValueOf.longValue());
                }
                WsConnectionError wsConnectionError3 = wsConnectionInfo.error;
                if (wsConnectionError3 != null) {
                    jSONObject3.put("error_code", wsConnectionError3.code);
                    jSONObject3.put("error_msg", wsConnectionError3.message);
                    jSONObject3.put("ws_state", wsConnectionError3.wsState);
                    RequestLog requestLog2 = wsConnectionError3.requestLog;
                    if (requestLog2 != null && (base = requestLog2.base) != null) {
                        num = base.netError;
                    }
                    jSONObject3.put("net_error", num);
                    RequestLog requestLog3 = wsConnectionError3.requestLog;
                    if (requestLog3 != null && (other = requestLog3.other) != null && (str2 = other.ttNetVersion) != null) {
                        str3 = str2;
                    }
                    jSONObject3.put("tt_net_version", str3);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[reportConnectivity], event = ws_connectivity, json = ");
                sbLIZ3.append(jSONObject3);
                C845400XEk.LIZIZ("WsConnectivityReport", C2188811AlT.LIZIZ(sbLIZ3));
                C20684815ws.LJIJ("ws_connectivity", jSONObject3);
            }
        }
    };
    public static final C845340XEe LJIILL = new C0XN9() { // from class: X.0XEe
        @Override // X.C0XN9
        public final void LJI(C0XGH c0xgh) {
            Object c098200Yq;
            boolean zBooleanValue;
            if (c0xgh.LIZ == 4) {
                C845320XEc c845320XEc = C845320XEc.LJI;
                c845320XEc.getClass();
                C845410XEl.LIZ.getClass();
                try {
                    SettingsManager.LIZLLL().getClass();
                    c098200Yq = Boolean.valueOf(SettingsManager.LIZ("ws_reconnect_on_token_change", true));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                Boolean bool = (Boolean) c098200Yq;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = C845410XEl.LIZIZ;
                }
                if (zBooleanValue) {
                    String strLJI = C847400XMc.LJI();
                    String str = C845320XEc.LJIIL;
                    if (str != null && str.length() != 0 && strLJI != null && strLJI.length() != 0 && !Intrinsics.LJFF(str, strLJI)) {
                        C845400XEk.LIZIZ("WsManagerV2", "[handleTokenUpdated] token changed, reconnecting");
                        c845320XEc.LJFF("token_updated");
                    }
                }
            }
        }
    };

    @Override // X.InterfaceC2203441BLq
    public final boolean isConnected() {
        C821300WJs c821300WJs = LJIIJJI;
        return c821300WJs != null && c821300WJs.LJFF == C0XE1.CONNECTED;
    }

    @Override // X.InterfaceC2203441BLq
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        wsChannelMsg.channelId = 1239108;
        C821300WJs c821300WJs = LJIIJJI;
        if (c821300WJs == null) {
            C845130XDj c845130XDj = C845130XDj.LIZ;
            int i = wsChannelMsg.service;
            int i2 = wsChannelMsg.method;
            c845130XDj.getClass();
            C845130XDj.LIZ(i, i2, 1, "channel_null");
            LJ("null_channel");
        } else {
            c821300WJs.LIZIZ(wsChannelMsg, null);
        }
        C845130XDj c845130XDj2 = C845130XDj.LIZ;
        int i3 = wsChannelMsg.service;
        int i4 = wsChannelMsg.method;
        c845130XDj2.getClass();
        C845130XDj.LIZ(i3, i4, 1, "");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[sendMsg], service ");
        sbLIZ.append(wsChannelMsg.service);
        sbLIZ.append(" method ");
        sbLIZ.append(wsChannelMsg.method);
        C845400XEk.LIZIZ("WsManagerV2", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2203441BLq
    public final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[close], close from ");
        sbLIZ.append(str);
        sbLIZ.append(", with current state ");
        sbLIZ.append(this.LIZ);
        C845400XEk.LIZIZ("WsManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        if (!LJIIJ) {
            C845400XEk.LIZIZ("WsManagerV2", "[close], failed! SDK has not been initialized.");
        } else {
            C23250099c.LIZLLL(LJIIIIZZ, null, null, new C845310XEb(str, null), 3);
        }
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJ(String str) {
        Application application;
        if (!LJIIJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[connect], initializing sdk... from: ");
            sbLIZ.append(str);
            C845400XEk.LIZIZ("WsManagerV2", C2188811AlT.LIZIZ(sbLIZ));
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if ((contextLIZ instanceof Application) && (application = (Application) contextLIZ) != null) {
                LJI.LJIIJ(application);
            }
        }
        C23250099c.LIZLLL(LJIIIIZZ, null, null, new C845300XEa(str, null), 3);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[reconnect], reconnect from ");
        sbLIZ.append(str);
        sbLIZ.append(", with current state ");
        sbLIZ.append(this.LIZ);
        C845400XEk.LIZIZ("WsManagerV2", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ(str);
        LJ(str);
    }

    @Override // X.InterfaceC2203441BLq
    public final void LJIIJ(Application application) {
        if (LJIIJ) {
            return;
        }
        boolean z = true;
        LJIIJ = true;
        C845400XEk.LIZIZ("WsManagerV2", "[initSDK]");
        C2261941Dg8.LIZ.LIZLLL();
        C1906580ziK.LIZJ().LIZ().LJJLJLI(C845120XDi.LL);
        C0XO0.LIZLLL(application).LIZ(LJIILL);
        C845330XEd.LIZ.getClass();
        ZombieWsConnectionRecoveryConfig.ZombieWsConnectionRecovery zombieWsConnectionRecovery = (ZombieWsConnectionRecoveryConfig.ZombieWsConnectionRecovery) C845330XEd.LJI.invoke();
        if (zombieWsConnectionRecovery.enabled && !C845330XEd.LJIIJ) {
            C845330XEd.LJIIJ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[init] enabled, window=");
            sbLIZ.append(zombieWsConnectionRecovery.stalenessWindowMs);
            sbLIZ.append("ms interval=");
            sbLIZ.append(zombieWsConnectionRecovery.minReconnectIntervalMs);
            sbLIZ.append("ms");
            C845400XEk.LIZIZ("WsHealthCheck", C2188811AlT.LIZIZ(sbLIZ));
            C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.0XEf
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("WsHealthCheck@f8a8.subscribeForeground$1");
                    if (!((C606810Nr5) obj).LIZIZ) {
                        C845330XEd.LIZ.getClass();
                        C845330XEd.LIZ("health_foreground", ((ZombieWsConnectionRecoveryConfig.ZombieWsConnectionRecovery) C845330XEd.LJI.invoke()).checkOnForeground, false, false);
                    }
                    C1C7U.LIZIZ("WsHealthCheck@f8a8.subscribeForeground$1");
                }
            });
            INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
            if (iNetworkStateService == null) {
                C845400XEk.LIZ("WsHealthCheck", "[subscribeNetwork] INetworkStateService unavailable");
            } else {
                AtomicBoolean atomicBoolean = C845330XEd.LJIIIIZZ;
                EnumC325100Com networkStatus = iNetworkStateService.getNetworkStatus();
                if (networkStatus != EnumC325100Com.STRONG && networkStatus != EnumC325100Com.WEAK) {
                    z = false;
                }
                atomicBoolean.set(z);
                iNetworkStateService.observerNetworkChange(new C0CSC() { // from class: X.0XEh
                    @Override // X.C0CSC
                    public final void LIZ(EnumC325100Com enumC325100Com) {
                        boolean z2;
                        C845330XEd.LIZ.getClass();
                        if (enumC325100Com != EnumC325100Com.STRONG && enumC325100Com != EnumC325100Com.WEAK) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        boolean andSet = C845330XEd.LJIIIIZZ.getAndSet(z2);
                        if (z2 && !andSet) {
                            ZombieWsConnectionRecoveryConfig.ZombieWsConnectionRecovery zombieWsConnectionRecovery2 = (ZombieWsConnectionRecoveryConfig.ZombieWsConnectionRecovery) C845330XEd.LJI.invoke();
                            C845330XEd.LIZ("health_net_resume", zombieWsConnectionRecovery2.checkOnNetworkResume, zombieWsConnectionRecovery2.skipStalenessOnNetworkChange, false);
                        }
                    }
                });
                iNetworkStateService.observeMultiNetworkChange(new C0XI7() { // from class: X.0XEj
                    @Override // X.C0XI7
                    public final void LIZ(EnumC1493070oxN enumC1493070oxN) {
                        C845330XEd.LIZ.getClass();
                        ZombieWsConnectionRecoveryConfig.ZombieWsConnectionRecovery zombieWsConnectionRecovery2 = (ZombieWsConnectionRecoveryConfig.ZombieWsConnectionRecovery) C845330XEd.LJI.invoke();
                        C845330XEd.LIZ("health_net_type_change", zombieWsConnectionRecovery2.checkOnNetworkTypeChange, zombieWsConnectionRecovery2.skipStalenessOnNetworkChange, true);
                    }
                });
            }
            C845330XEd.LIZ("health_app_launch", zombieWsConnectionRecovery.checkOnAppLaunch, false, false);
        }
    }

    public final boolean LJIILJJIL(String str) {
        boolean zLIZIZ;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[connect], failed! network unavailable! from: ");
            sbLIZ.append(str);
            C845400XEk.LIZIZ("WsManagerV2", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (Intrinsics.LJFF(str, "websocket_task") && this.LIZ != C0XE1.CONNECTION_UNKNOWN) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[connect], failed! first connection exists, will not connect again! from: ");
            sbLIZ2.append(str);
            C845400XEk.LIZIZ("WsManagerV2", C2188811AlT.LIZIZ(sbLIZ2));
            return false;
        }
        return true;
    }
}
