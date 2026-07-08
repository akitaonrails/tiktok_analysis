package X;

import android.util.Base64;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.pb.ProtoResponse;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorPingAnchorFallbackSwitch;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorPingAnchorWsSampleRate;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostWsMigrationSwitch;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ws.LiveWebSocketApi;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ps9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528270ps9 implements C0XEZ, C0UC2 {
    public static Map<String, String> LLILZLL;
    public static volatile boolean LLIZLLLIL;
    public static volatile Boolean LLJ;
    public static final C1528260ps8 LLJIJIL;
    public static final C0UWA LLJILJIL;
    public static final C1528270ps9 LL = new C1528270ps9();
    public static final float LLILLJJLI = LiveAnchorPingAnchorWsSampleRate.INSTANCE.getValue();
    public static final CopyOnWriteArrayList<InterfaceC1528310psD<? extends Object>> LLILLL = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<InterfaceC1143270frB> LLILZ = new CopyOnWriteArrayList<>();
    public static final Set<C773510UVx> LLILZIL = Collections.synchronizedSet(new HashSet());
    public static final C11NJ LLIZ = new C11NJ();
    public static volatile C0XE1 LLJI = C0XE1.CONNECTION_UNKNOWN;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0ps8] */
    static {
        final C1528270ps9 c1528270ps9 = LL;
        LLJIJIL = new InterfaceC486470J5x(c1528270ps9) { // from class: X.0ps8
            public final WeakReference<C1528270ps9> LL;

            {
                this.LL = new WeakReference<>(c1528270ps9);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.InterfaceC486470J5x
            public final void LIZIZ(WsChannelMsg wsChannelMsg) {
                ProtoResponse protoResponseLIZIZ;
                if (this.LL.get() == null) {
                    return;
                }
                HashMap map = new HashMap();
                for (WsChannelMsg.MsgHeader msgHeader : wsChannelMsg.msgHeaders) {
                    String str = msgHeader.key;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -1890925589:
                                if (str.equals("livesdk_ws_up_msg_id")) {
                                    map.put(msgHeader.key, msgHeader.value);
                                }
                                break;
                            case -321397177:
                                if (str.equals("livesdk_ws_down_server_time_ms")) {
                                    map.put(msgHeader.key, msgHeader.value);
                                }
                                break;
                            case 1205146756:
                                if (str.equals("livesdk_ws_down_msg_id")) {
                                    map.put(msgHeader.key, msgHeader.value);
                                }
                                break;
                            case 1562309430:
                                if (str.equals("livesdk_ws_up_client_time_ms")) {
                                    map.put(msgHeader.key, msgHeader.value);
                                }
                                break;
                        }
                    }
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    String str2 = (String) map.get("livesdk_ws_up_client_time_ms");
                    String str3 = CardStruct.IStatusCode.DEFAULT;
                    if (str2 == null) {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    long j = jCurrentTimeMillis - CastLongProtector.parseLong(str2);
                    String str4 = (String) map.get("livesdk_ws_down_server_time_ms");
                    if (str4 != null) {
                        str3 = str4;
                    }
                    long j2 = jCurrentTimeMillis - CastLongProtector.parseLong(str3);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ws_flex_client_recv");
                    c474500IjALIZ.LJJII(Integer.valueOf(wsChannelMsg.service), "service");
                    c474500IjALIZ.LJJII(Integer.valueOf(wsChannelMsg.method), "method");
                    c474500IjALIZ.LJJII(wsChannelMsg.payloadEncoding, "paylod_encoding");
                    c474500IjALIZ.LJJII(1, "is_long");
                    c474500IjALIZ.LJJII(map.get("livesdk_ws_up_msg_id"), "client_msg_id");
                    c474500IjALIZ.LJJII(map.get("livesdk_ws_down_msg_id"), "server_msg_id");
                    c474500IjALIZ.LJJII(Long.valueOf(j), "round_time_duration");
                    c474500IjALIZ.LJJII(Long.valueOf(j2), "receive_duration");
                    c474500IjALIZ.LJJIIZI(C1528270ps9.LLILZLL);
                    c474500IjALIZ.LJJIJL();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("register: ");
                sbLIZ.append(wsChannelMsg.service);
                sbLIZ.append(", ");
                sbLIZ.append(wsChannelMsg.method);
                sbLIZ.append(", ");
                sbLIZ.append(GsonProtectorUtils.toJson(C293501Bt.LIZ(), wsChannelMsg.msgHeaders));
                sbLIZ.append(", ");
                sbLIZ.append(wsChannelMsg.payloadEncoding);
                sbLIZ.append(", ");
                sbLIZ.append(wsChannelMsg.LIZ().length);
                C20441214yg.LIZIZ("LiveHostWsManager", C2188811AlT.LIZIZ(sbLIZ));
                if (LiveHostWsMigrationSwitch.INSTANCE.isEnable()) {
                    CopyOnWriteArrayList<InterfaceC1528310psD<? extends Object>> copyOnWriteArrayList = C1528270ps9.LLILLL;
                    ArrayList<InterfaceC1528310psD> arrayList = new ArrayList();
                    for (InterfaceC1528310psD<? extends Object> interfaceC1528310psD : copyOnWriteArrayList) {
                        if (interfaceC1528310psD.LIZLLL(wsChannelMsg.service, wsChannelMsg.method)) {
                            arrayList.add(interfaceC1528310psD);
                        }
                    }
                    CopyOnWriteArrayList<InterfaceC1143270frB> copyOnWriteArrayList2 = C1528270ps9.LLILZ;
                    ArrayList arrayList2 = new ArrayList();
                    for (InterfaceC1143270frB interfaceC1143270frB : copyOnWriteArrayList2) {
                        interfaceC1143270frB.LIZ();
                        arrayList2.add(interfaceC1143270frB);
                    }
                    if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                        return;
                    }
                    List<WsChannelMsg.MsgHeader> list = wsChannelMsg.msgHeaders;
                    HashMap map2 = new HashMap();
                    for (WsChannelMsg.MsgHeader msgHeader2 : list) {
                        Pair pair = new Pair(msgHeader2.key, msgHeader2.value);
                        map2.put(pair.getFirst(), pair.getSecond());
                    }
                    if ((!arrayList.isEmpty()) && (protoResponseLIZIZ = C1528270ps9.LIZIZ(wsChannelMsg)) != null) {
                        for (InterfaceC1528310psD interfaceC1528310psD2 : arrayList) {
                            C1528270ps9 c1528270ps92 = C1528270ps9.LL;
                            int i = protoResponseLIZIZ.header.LIZ;
                            String str5 = wsChannelMsg.payloadEncoding;
                            byte[] bArrLIZ = wsChannelMsg.LIZ();
                            c1528270ps92.getClass();
                            C1528270ps9.LJ(i, map2, str5, bArrLIZ, interfaceC1528310psD2);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1143270frB) it2.next()).LIZIZ(wsChannelMsg.service, wsChannelMsg.method, map2, wsChannelMsg.payloadType, wsChannelMsg.payloadEncoding, wsChannelMsg.LIZ());
                    }
                    return;
                }
                for (InterfaceC1528310psD<? extends Object> interfaceC1528310psD3 : C1528270ps9.LLILLL) {
                    if (interfaceC1528310psD3.LIZLLL(wsChannelMsg.service, wsChannelMsg.method)) {
                        C1528270ps9.LL.getClass();
                        ProtoResponse protoResponseLIZIZ2 = C1528270ps9.LIZIZ(wsChannelMsg);
                        if (protoResponseLIZIZ2 != null) {
                            HashMap map3 = new HashMap();
                            for (WsChannelMsg.MsgHeader msgHeader3 : wsChannelMsg.msgHeaders) {
                                map3.put(msgHeader3.key, msgHeader3.value);
                            }
                            C1528270ps9 c1528270ps93 = C1528270ps9.LL;
                            int i2 = protoResponseLIZIZ2.header.LIZ;
                            String str6 = wsChannelMsg.payloadEncoding;
                            byte[] bArrLIZ2 = wsChannelMsg.LIZ();
                            c1528270ps93.getClass();
                            C1528270ps9.LJ(i2, map3, str6, bArrLIZ2, interfaceC1528310psD3);
                        }
                    }
                }
                for (InterfaceC1143270frB interfaceC1143270frB2 : C1528270ps9.LLILZ) {
                    interfaceC1143270frB2.LIZ();
                    HashMap map4 = new HashMap();
                    for (WsChannelMsg.MsgHeader msgHeader4 : wsChannelMsg.msgHeaders) {
                        map4.put(msgHeader4.key, msgHeader4.value);
                    }
                    interfaceC1143270frB2.LIZIZ(wsChannelMsg.service, wsChannelMsg.method, map4, wsChannelMsg.payloadType, wsChannelMsg.payloadEncoding, wsChannelMsg.LIZ());
                }
            }
        };
        LLJILJIL = new C0UWA(0L);
    }

    public final void LIZJ() {
        if (LLIZLLLIL) {
            return;
        }
        synchronized (this) {
            try {
                if (LLIZLLLIL) {
                    return;
                }
                LLIZLLLIL = true;
                C20441214yg.LJIIL("LiveHostWsManager#init", "ensureInit: connectWs");
                C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
                c2203431BLp.LJ("live_host");
                c2203431BLp.LIZLLL(LL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static ProtoResponse LIZIZ(WsChannelMsg wsChannelMsg) {
        C1516680pZS c1516680pZS = new C1516680pZS();
        c1516680pZS.LJIIL(new C1506310pIj(new ByteArrayInputStream(wsChannelMsg.LIZ())));
        try {
            ProtoResponse protoResponseLIZ = ProtoResponse.LIZ(c1516680pZS);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("callback: ");
            sbLIZ.append(protoResponseLIZ.header.LIZ);
            sbLIZ.append(", whole: ");
            sbLIZ.append(protoResponseLIZ);
            C20441214yg.LIZIZ("LiveHostWsManager#decodeMsg", C2188811AlT.LIZIZ(sbLIZ));
            return protoResponseLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("callback: ");
            sbLIZ2.append(e.getMessage());
            C20441214yg.LIZIZ("LiveHostWsManager#decodeMsg", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26, types: [T, X.01kM] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String LIZLLL(final C1528300psC c1528300psC) {
        boolean z;
        boolean z2;
        String secUid;
        User currentUser;
        LIZJ();
        final String strLIZ = C1017903yT.LIZ();
        HashMap map = new HashMap();
        Map<String, String> map2 = c1528300psC.LJI;
        if (map2 != null) {
            map.putAll(map2);
        }
        boolean z3 = false;
        if (!c1528300psC.LJII && !LiveAnchorPingAnchorFallbackSwitch.INSTANCE.isEnable()) {
            z = false;
        } else {
            z = true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        map.put("livesdk_ws_up_msg_id", strLIZ);
        map.put("livesdk_ws_up_client_time_ms", String.valueOf(jCurrentTimeMillis));
        if (C500260Jjc.LJJJI(LLJ) && !c1528300psC.LJII) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (AbstractC19994813Le.Default.nextFloat() <= LLILLJJLI) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ws_flex_client_send");
            c474500IjALIZ.LJJII(Integer.valueOf(c1528300psC.LIZLLL), "service");
            c474500IjALIZ.LJJII(Integer.valueOf(c1528300psC.LIZIZ), "method");
            c474500IjALIZ.LJJII(c1528300psC.LJFF, "paylod_encoding");
            c474500IjALIZ.LJJII(strLIZ, "client_msg_id");
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "local_time_ms");
            c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0), "is_long");
            Map<String, String> map3 = LLILZLL;
            if (map3 != null) {
                c474500IjALIZ.LJJIIZI(map3);
            }
            c474500IjALIZ.LIZ();
            z3 = true;
            map.put("livesdk_ws_trace_enable", "1");
        }
        if (LiveHostWsMigrationSwitch.INSTANCE.isEnable()) {
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null || (secUid = currentUser.getSecUid()) == null) {
                secUid = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sec: ");
            sbLIZ.append(secUid);
            C20441214yg.LIZIZ("LiveHostWs#header", C2188811AlT.LIZIZ(sbLIZ));
            map.put("livesdk_ws_uid_sec", secUid);
        }
        C20441214yg.LJIIL("LiveHostWsManager#logid", String.valueOf(strLIZ));
        if (C500260Jjc.LJJJI(LLJ) && !z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("send now: ");
            sbLIZ2.append(c1528300psC);
            C20441214yg.LJIIL("LiveHostWsManager#send", C2188811AlT.LIZIZ(sbLIZ2));
            C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
            long jIncrementAndGet = c1528300psC.LIZJ;
            if (jIncrementAndGet == -1) {
                jIncrementAndGet = LLJILJIL.LIZ.incrementAndGet();
            }
            c2203431BLp.LJIIIIZZ(jIncrementAndGet, C963140bAe.LIZJ(), c1528300psC.LIZLLL, c1528300psC.LIZIZ, c1528300psC.LIZ, c1528300psC.LJ, c1528300psC.LJFF, map);
            return strLIZ;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("send later: ");
        sbLIZ3.append(new String(c1528300psC.LIZ, Charsets.UTF_8));
        C20441214yg.LJIIL("LiveHostWsManager#fallback", C2188811AlT.LIZIZ(sbLIZ3));
        final C259800zU c259800zU = new C259800zU();
        C480460Ism.LIZ().getClass();
        LiveWebSocketApi liveWebSocketApi = (LiveWebSocketApi) C480460Ism.LIZLLL(LiveWebSocketApi.class);
        long jIncrementAndGet2 = c1528300psC.LIZJ;
        if (jIncrementAndGet2 == -1) {
            jIncrementAndGet2 = LLJILJIL.LIZ.incrementAndGet();
        }
        int i = c1528300psC.LIZLLL;
        int i2 = c1528300psC.LIZIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(c1528300psC.LJFF);
        sbLIZ4.append("_base64");
        ?? LJJLL = liveWebSocketApi.fallbackSendMessage(jIncrementAndGet2, i, i2, C2188811AlT.LIZIZ(sbLIZ4), Base64.encodeToString(c1528300psC.LIZ, 2), strLIZ, System.currentTimeMillis(), String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z3)) ? 1 : 0)).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0psA
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LiveWebSocketManager@3245.sendUplinkMessage$2");
                BaseResponse baseResponse = (BaseResponse) obj;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("UplinkSender.sendUplinkMessageByHttps: resp=");
                sbLIZ5.append(baseResponse);
                C20441214yg.LJIIL("LiveHostWsManager", C2188811AlT.LIZIZ(sbLIZ5));
                C1528270ps9 c1528270ps9 = C1528270ps9.LL;
                C1528300psC c1528300psC2 = c1528300psC;
                int i3 = c1528300psC2.LIZLLL;
                int i4 = c1528300psC2.LIZIZ;
                String str = c1528300psC2.LJFF;
                HashMap mapLJI = C2097608Jq.LJI(new Pair("livesdk_ws_up_msg_id", strLIZ));
                c1528270ps9.getClass();
                for (InterfaceC1528310psD<? extends Object> interfaceC1528310psD : C1528270ps9.LLILLL) {
                    if (interfaceC1528310psD.LIZLLL(i3, i4)) {
                        C1528270ps9 c1528270ps92 = C1528270ps9.LL;
                        int i5 = baseResponse.statusCode;
                        byte[] bArrDecode = Base64.decode((String) baseResponse.data, 2);
                        c1528270ps92.getClass();
                        C1528270ps9.LJ(i5, mapLJI, str, bArrDecode, interfaceC1528310psD);
                    }
                }
                InterfaceC420801kM interfaceC420801kM = c259800zU.element;
                if (interfaceC420801kM != null) {
                    C1528270ps9.LLIZ.LIZIZ(interfaceC420801kM);
                }
                C1C7U.LIZIZ("LiveWebSocketManager@3245.sendUplinkMessage$2");
            }
        }, new C09JN() { // from class: X.0psB
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LiveWebSocketManager@3245.sendUplinkMessage$3");
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("UplinkSender.sendUplinkMessageByHttps: exception=");
                sbLIZ5.append(obj);
                C20441214yg.LJIIL("LiveHostWsManager", C2188811AlT.LIZIZ(sbLIZ5));
                C1528270ps9 c1528270ps9 = C1528270ps9.LL;
                C1528300psC c1528300psC2 = c1528300psC;
                int i3 = c1528300psC2.LIZLLL;
                int i4 = c1528300psC2.LIZIZ;
                c1528270ps9.getClass();
                for (InterfaceC1528310psD<? extends Object> interfaceC1528310psD : C1528270ps9.LLILLL) {
                    if (interfaceC1528310psD.LIZLLL(i3, i4)) {
                        interfaceC1528310psD.LIZ();
                    }
                }
                InterfaceC420801kM interfaceC420801kM = c259800zU.element;
                if (interfaceC420801kM != null) {
                    C1528270ps9.LLIZ.LIZIZ(interfaceC420801kM);
                }
                C1C7U.LIZIZ("LiveWebSocketManager@3245.sendUplinkMessage$3");
            }
        });
        c259800zU.element = LJJLL;
        LLIZ.LIZ(LJJLL);
        return strLIZ;
    }

    @Override // X.C0XEZ
    public final void LIZ(C821280WJq c821280WJq, JSONObject jSONObject) {
        boolean z;
        C0XE1 c0xe1 = c821280WJq.LIZIZ;
        if (LLJI == c0xe1) {
            return;
        }
        LLJI = c0xe1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWsStateChanged: state=");
        sbLIZ.append(c0xe1.name());
        C20441214yg.LIZIZ("LiveHostWsManager#connect", C2188811AlT.LIZIZ(sbLIZ));
        if (c0xe1 == C0XE1.CONNECTED) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(LLJ, Boolean.valueOf(z))) {
            return;
        }
        LLJ = Boolean.valueOf(z);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onWsStateChanged: wsConnected=");
        sbLIZ2.append(LLJ);
        C20441214yg.LIZIZ("LiveHostWsManager#connect", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LJ(int i, Map map, String str, byte[] bArr, InterfaceC1528310psD interfaceC1528310psD) {
        Class clsLIZIZ = interfaceC1528310psD.LIZIZ();
        Object objFromJson = null;
        if (Intrinsics.LJFF(str, "pb")) {
            if (LiveHostWsMigrationSwitch.INSTANCE.isEnable()) {
                try {
                    Object objLIZIZ = C1516000pYM.LIZIZ(bArr, clsLIZIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("suc: ");
                    sbLIZ.append(C293501Bt.LIZ().LJIILL(objLIZIZ));
                    C20441214yg.LIZIZ("LiveHostWsManager#decodePayload", C2188811AlT.LIZIZ(sbLIZ));
                    objFromJson = objLIZIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("fail: ");
                    sbLIZ2.append(e.getMessage());
                    C20441214yg.LIZIZ("LiveHostWsManager#decodePayload", C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                new C1516680pZS().LJIIL(new C1506310pIj(new ByteArrayInputStream(bArr)));
                try {
                    objFromJson = C1516000pYM.LIZIZ(bArr, clsLIZIZ);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("suc: ");
                    sbLIZ3.append(C293501Bt.LIZ().LJIILL(objFromJson));
                    C20441214yg.LIZIZ("LiveHostWsManager#decodePayload", C2188811AlT.LIZIZ(sbLIZ3));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("fail: ");
                    sbLIZ4.append(e2.getMessage());
                    C20441214yg.LIZIZ("LiveHostWsManager#decodePayload", C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
        } else if (Intrinsics.LJFF(str, "json")) {
            objFromJson = GsonProtectorUtils.fromJson(C293501Bt.LIZ(), new String(bArr, Charsets.UTF_8), (Class<Object>) clsLIZIZ);
        }
        interfaceC1528310psD.LIZJ(i, objFromJson, map);
    }
}
