package X;

import Y.ARunnableS103S0200000_34;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import com.ss.ugc.live.sdk.msg.data.SdkUplinkPacket;
import com.ss.ugc.live.sdk.msg.utils.WeakHandler;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Byj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222511Byj implements C0UIG {
    public final C2222121By6 LIZ;
    public final IMessageWsClient LIZIZ;
    public final InterfaceC2222651Byx LIZJ;
    public final InterfaceC2222621Byu LIZLLL;
    public EnumC2222551Byn LJ;
    public C18JU LJFF;
    public WeakHandler LJI;
    public WeakHandler LJII;
    public WeakHandler LJIIIIZZ;
    public final C2222601Bys LJIIIZ;
    public final C13MJ LJIIJ;

    public final void LIZLLL() {
        WeakHandler weakHandler;
        C2222361ByU.LIZ(this.LIZ, "uplink: ws disconnect");
        C18JU c18ju = this.LJFF;
        if (c18ju == null || C786410Ut5.W2(c18ju) == null || (weakHandler = this.LJIIIIZZ) == null) {
            return;
        }
        weakHandler.sendEmptyMessage(12350);
    }

    public final void LJFF() {
        WeakHandler weakHandler;
        C2222361ByU.LIZ(this.LIZ, "uplink release");
        WeakHandler weakHandler2 = this.LJI;
        if (weakHandler2 != null) {
            weakHandler2.removeCallbacksAndMessages(null);
        }
        WeakHandler weakHandler3 = this.LJII;
        if (weakHandler3 != null) {
            weakHandler3.removeCallbacksAndMessages(null);
        }
        WeakHandler weakHandler4 = this.LJIIIIZZ;
        if (weakHandler4 != null) {
            weakHandler4.removeCallbacksAndMessages(null);
        }
        C18JU c18ju = this.LJFF;
        if (c18ju == null || C786410Ut5.W2(c18ju) == null || (weakHandler = this.LJIIIIZZ) == null) {
            return;
        }
        weakHandler.sendEmptyMessage(12349);
    }

    public static byte[] LIZ(PayloadItem payloadItem) throws IOException {
        C2221941Bxo next;
        byte[] payload = payloadItem.getPayload();
        List<C2221941Bxo> headers = payloadItem.getHeaders();
        String str = null;
        if (headers != null) {
            Iterator<C2221941Bxo> it2 = headers.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ, "compress_type")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C2221941Bxo c2221941Bxo = next;
            if (c2221941Bxo != null) {
                str = c2221941Bxo.LIZIZ;
            }
        }
        if (Intrinsics.LJFF(str, "gzip")) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(payload);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
            while (true) {
                int i = gZIPInputStream.read(bArr, 0, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                if (i != -1) {
                    byteArrayOutputStream.write(bArr, 0, i);
                } else {
                    gZIPInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    byteArrayInputStream.close();
                    return byteArray;
                }
            }
        } else {
            return payload;
        }
    }

    public final void LIZJ(C2222521Byk c2222521Byk) throws JSONException {
        AbstractC19666311wz<C2222611Byt, Exception> c19666211wy;
        C2222591Byr c2222591Byr;
        WeakHandler weakHandler;
        C2222121By6 c2222121By6 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uplink request finished, serviceId: ");
        sbLIZ.append(c2222521Byk.LIZIZ);
        sbLIZ.append(", uniqueId: ");
        sbLIZ.append(c2222521Byk.LIZ);
        C2222361ByU.LIZ(c2222121By6, C2188811AlT.LIZIZ(sbLIZ));
        this.LJIIIZ.LIZ.remove(Long.valueOf(c2222521Byk.LIZ));
        RunnableC2222541Bym runnableC2222541Bym = c2222521Byk.LJIILIIL;
        if (runnableC2222541Bym != null && (weakHandler = this.LJI) != null) {
            weakHandler.removeCallbacks(runnableC2222541Bym);
        }
        C2222591Byr c2222591Byr2 = c2222521Byk.LJIIL;
        C2222521Byk c2222521Byk2 = c2222521Byk.LJFF;
        C2222121By6 c2222121By62 = this.LIZ;
        if (c2222591Byr2.LJII > c2222591Byr2.LJI) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("service_id", c2222591Byr2.LIZIZ);
            jSONObject.put("status_code", c2222591Byr2.LJIIIZ);
            jSONObject.put("expect_strategy", c2222591Byr2.LIZJ);
            jSONObject.put("actual_strategy", c2222591Byr2.LIZLLL);
            jSONObject.put("ws_connected_on_send", c2222591Byr2.LJ);
            jSONObject.put("ws_connected_on_finish", c2222591Byr2.LJFF);
            jSONObject.put("success", c2222591Byr2.LJIIIIZZ);
            long j = c2222591Byr2.LJII - c2222591Byr2.LJI;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("use_time", j);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("unique_id", c2222591Byr2.LIZ);
            jSONObject3.put("status_message", c2222591Byr2.LJIIJ);
            jSONObject3.put("send_time", c2222591Byr2.LJI);
            jSONObject3.put("finish_time", c2222591Byr2.LJII);
            if (c2222521Byk2 != null && (c2222591Byr = c2222521Byk2.LJIIL) != null) {
                jSONObject.put("fail_request_status_code", c2222591Byr.LJIIIZ);
                jSONObject.put("fail_request_expect_strategy", c2222591Byr.LIZJ);
                jSONObject.put("fail_request_actual_strategy", c2222591Byr.LIZLLL);
                jSONObject.put("fail_request_ws_connected_on_send", c2222591Byr.LJ);
                jSONObject.put("fail_request_ws_connected_on_finish", c2222591Byr.LJFF);
                jSONObject.put("fail_request_success", c2222591Byr.LJIIIIZZ);
                jSONObject2.put("fail_request_use_time", c2222591Byr.LJII - c2222591Byr.LJI);
                jSONObject2.put("all_use_time", c2222591Byr2.LJII - c2222591Byr.LJI);
                jSONObject3.put("fail_request_unique_id", c2222591Byr.LIZ);
                jSONObject3.put("fail_request_status_message", c2222591Byr.LJIIJ);
                jSONObject3.put("fail_request_send_time", c2222591Byr.LJI);
                jSONObject3.put("fail_request_finish_time", c2222591Byr.LJII);
            }
            c2222121By62.monitorLatency("uplink_status_all", j, jSONObject, jSONObject2, jSONObject3);
            if (!c2222591Byr2.LJIIIIZZ) {
                c2222121By62.monitor("uplink_status_error", jSONObject, jSONObject2, jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("category", jSONObject);
            jSONObject4.put("metric", jSONObject2);
            jSONObject4.put("extra", jSONObject3);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("uplink stat: ");
            sbLIZ2.append(jSONObject4);
            c2222121By62.log("MessageManagerV2", C2188811AlT.LIZIZ(sbLIZ2));
        }
        try {
            c19666211wy = c2222521Byk.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c19666211wy = new C19666211wy<>(e);
        }
        ARunnableS103S0200000_34 aRunnableS103S0200000_34 = new ARunnableS103S0200000_34(c2222521Byk, c19666211wy, 37);
        C01GW c01gw = C20320014f8.LIZ;
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            aRunnableS103S0200000_34.run();
        } else {
            C786410Ut5.LJJZZIII((Handler) C20320014f8.LIZ.getValue(), aRunnableS103S0200000_34);
        }
    }

    public final void LJ(C2222521Byk c2222521Byk) {
        this.LIZLLL.LIZJ();
        LIZJ(c2222521Byk);
    }

    public final void LJII(final C2222521Byk c2222521Byk) {
        C2222121By6 c2222121By6 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("send uplink packet by origin http, serviceId: ");
        sbLIZ.append(c2222521Byk.LIZIZ);
        sbLIZ.append(", uniqueId: ");
        sbLIZ.append(c2222521Byk.LIZ);
        C2222361ByU.LIZ(c2222121By6, C2188811AlT.LIZIZ(sbLIZ));
        EnumC1500730p9j enumC1500730p9j = c2222521Byk.LIZLLL.LIZ;
        if (enumC1500730p9j == null) {
            enumC1500730p9j = EnumC1500730p9j.POST;
        }
        int i = C1500740p9k.LIZ[enumC1500730p9j.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LIZJ.get(c2222521Byk.LIZLLL, new InterfaceC19666511x1() { // from class: X.1Byp
                    @Override // X.InterfaceC19666511x1
                    public final void LIZ(AbstractC19666311wz<C2222611Byt, ? extends Exception> abstractC19666311wz) {
                        Message messageObtainMessage;
                        C2222521Byk c2222521Byk2 = c2222521Byk;
                        c2222521Byk2.LJII = abstractC19666311wz;
                        WeakHandler weakHandler = this.LJII;
                        if (weakHandler != null && (messageObtainMessage = weakHandler.obtainMessage(12348, c2222521Byk2)) != null) {
                            messageObtainMessage.sendToTarget();
                        }
                    }
                });
                return;
            }
            throw new C1954807lC();
        }
        this.LIZJ.post(c2222521Byk.LIZLLL, new InterfaceC19666511x1() { // from class: X.1Byo
            @Override // X.InterfaceC19666511x1
            public final void LIZ(AbstractC19666311wz<C2222611Byt, ? extends Exception> abstractC19666311wz) {
                Message messageObtainMessage;
                C2222521Byk c2222521Byk2 = c2222521Byk;
                c2222521Byk2.LJII = abstractC19666311wz;
                WeakHandler weakHandler = this.LJII;
                if (weakHandler != null && (messageObtainMessage = weakHandler.obtainMessage(12348, c2222521Byk2)) != null) {
                    messageObtainMessage.sendToTarget();
                }
            }
        });
    }

    public final void LJIIIIZZ(final C2222521Byk c2222521Byk) {
        C2222121By6 c2222121By6 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("send uplink packet by uplink http, serviceId: ");
        sbLIZ.append(c2222521Byk.LIZIZ);
        sbLIZ.append(", uniqueId: ");
        sbLIZ.append(c2222521Byk.LIZ);
        C2222361ByU.LIZ(c2222121By6, C2188811AlT.LIZIZ(sbLIZ));
        String strLJFF = this.LIZLLL.LJFF();
        SdkUplinkPacket sdkUplinkPacketLIZIZ = c2222521Byk.LIZIZ();
        C1500710p9h c1500710p9h = new C1500710p9h();
        C1500700p9g c1500700p9g = c1500710p9h.LIZ;
        c1500700p9g.LJI = "application/protobuf";
        c1500700p9g.LIZIZ = strLJFF;
        byte[] bArrEncode = sdkUplinkPacketLIZIZ.encode();
        C1500700p9g c1500700p9g2 = c1500710p9h.LIZ;
        c1500700p9g2.LJ = bArrEncode;
        if (c1500700p9g2.LJII == null) {
            c1500700p9g2.LJII = Collections.emptyMap();
        }
        this.LIZJ.post(c1500710p9h.LIZ, new InterfaceC19666511x1() { // from class: X.1Byi
            @Override // X.InterfaceC19666511x1
            public final void LIZ(AbstractC19666311wz<C2222611Byt, ? extends Exception> abstractC19666311wz) {
                Message messageObtainMessage;
                C2222521Byk c2222521Byk2 = c2222521Byk;
                c2222521Byk2.LJI = abstractC19666311wz;
                WeakHandler weakHandler = this.LJII;
                if (weakHandler != null && (messageObtainMessage = weakHandler.obtainMessage(12347, c2222521Byk2)) != null) {
                    messageObtainMessage.sendToTarget();
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.1Bym, java.lang.Runnable] */
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
    public final void LJIIIZ(C2222521Byk c2222521Byk) {
        C2222121By6 c2222121By6 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("send uplink packet by ws, serviceId: ");
        sbLIZ.append(c2222521Byk.LIZIZ);
        sbLIZ.append(", uniqueId: ");
        sbLIZ.append(c2222521Byk.LIZ);
        C2222361ByU.LIZ(c2222121By6, C2188811AlT.LIZIZ(sbLIZ));
        SdkUplinkPacket sdkUplinkPacketLIZIZ = c2222521Byk.LIZIZ();
        ?? r3 = new Runnable(c2222521Byk.LIZ) { // from class: X.1Bym
            public final long LL;

            public final void LIZ() {
                C2222521Byk c2222521BykLIZ = this.LLILLJJLI.LJIIIZ.LIZ(this.LL);
                if (c2222521BykLIZ == null) {
                    return;
                }
                C2222121By6 c2222121By62 = this.LLILLJJLI.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ws uplink timeout, serviceId: ");
                sbLIZ2.append(c2222521BykLIZ.LIZIZ);
                sbLIZ2.append(", uniqueId: ");
                sbLIZ2.append(c2222521BykLIZ.LIZ);
                C2222361ByU.LIZ(c2222121By62, C2188811AlT.LIZIZ(sbLIZ2));
                c2222521BykLIZ.LIZJ(this.LLILLJJLI.LIZIZ.isWsConnected(), new C2222631Byv(-2, "ws timeout", null));
                this.LLILLJJLI.LJ(c2222521BykLIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UplinkClient$WsTimeoutTask@5c88.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UplinkClient$WsTimeoutTask@5c88.run");
            }

            {
                this.LL = j;
            }
        };
        c2222521Byk.LJIILIIL = r3;
        c2222521Byk.LJIILJJIL = true;
        byte[] bArrEncode = sdkUplinkPacketLIZIZ.encode();
        long jLongValue = sdkUplinkPacketLIZIZ.uniqueID.longValue();
        long jLongValue2 = sdkUplinkPacketLIZIZ.uniqueID.longValue();
        if (this.LIZIZ.isWsConnected()) {
            this.LIZIZ.sendUplinkPacket(new PayloadItem("uplink_im_gateway", "pb", bArrEncode, new ArrayList(), jLongValue, jLongValue2));
        }
        C2222121By6 c2222121By62 = this.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("post ws timeout task, timeout: ");
        sbLIZ2.append(c2222521Byk.LIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        if (c2222121By62.supportDebugInfo()) {
            c2222121By62.log("MessageManagerV2", strLIZIZ);
        }
        WeakHandler weakHandler = this.LJI;
        if (weakHandler != 0) {
            weakHandler.postDelayed(r3, c2222521Byk.LIZJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0UIG
    public final void handleMsg(Message message) throws JSONException {
        EnumC2222551Byn enumC2222551Byn;
        Map<String, String> map;
        String str;
        EnumC2222551Byn enumC2222551Byn2;
        Map<String, String> map2;
        String str2;
        EnumC2222551Byn enumC2222551Byn3;
        if (message == null) {
            return;
        }
        String str3 = "";
        String str4 = "server error";
        switch (message.what) {
            case 12345:
                C2222521Byk c2222521Byk = (C2222521Byk) HandlerHook.getMessageObj(message.obj);
                this.LJIIIZ.LIZ.put(Long.valueOf(c2222521Byk.LIZ), c2222521Byk);
                EnumC2222551Byn enumC2222551Byn4 = this.LJ;
                boolean zIsWsConnected = this.LIZIZ.isWsConnected();
                C2222591Byr c2222591Byr = c2222521Byk.LJIIL;
                c2222591Byr.getClass();
                c2222591Byr.LJI = System.currentTimeMillis();
                c2222591Byr.LIZJ = enumC2222551Byn4.getStrategy(zIsWsConnected);
                c2222591Byr.LJ = zIsWsConnected;
                if (c2222521Byk.LJFF == null && (((enumC2222551Byn3 = this.LJ) == EnumC2222551Byn.WS_MSG_ORIGIN || enumC2222551Byn3 == EnumC2222551Byn.WS_ORIGIN) && this.LIZIZ.isWsConnected())) {
                    try {
                        c2222521Byk.LJIIL.LIZLLL = "ws";
                        LJIIIZ(c2222521Byk);
                        return;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LJIIJ(c2222521Byk, c2222521Byk.LIZIZ, this.LJ, this.LIZIZ.isWsConnected(), e);
                        return;
                    }
                }
                if (this.LJ == EnumC2222551Byn.WS_MSG_ORIGIN) {
                    try {
                        c2222521Byk.LJIIL.LIZLLL = "room_http";
                        LJIIIIZZ(c2222521Byk);
                        return;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        LJIIJ(c2222521Byk, c2222521Byk.LIZIZ, this.LJ, this.LIZIZ.isWsConnected(), e2);
                        return;
                    }
                }
                try {
                    c2222521Byk.LJIIL.LIZLLL = "origin_http";
                    LJII(c2222521Byk);
                    return;
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    LJIIJ(c2222521Byk, c2222521Byk.LIZIZ, this.LJ, this.LIZIZ.isWsConnected(), e3);
                    return;
                }
            case 12346:
                PayloadItem payloadItem = (PayloadItem) HandlerHook.getMessageObj(message.obj);
                try {
                    SdkUplinkPacket sdkUplinkPacketDecode = SdkUplinkPacket.ADAPTER.decode(LIZ(payloadItem));
                    C2222121By6 c2222121By6 = this.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("receive uplink packet by ws, logId: ");
                    if (sdkUplinkPacketDecode != null && (map2 = sdkUplinkPacketDecode.headers) != null && (str2 = map2.get("X-Tt-Logid")) != null) {
                        str3 = str2;
                    }
                    sbLIZ.append(str3);
                    C2222361ByU.LIZ(c2222121By6, C2188811AlT.LIZIZ(sbLIZ));
                    C2222521Byk c2222521BykLIZ = this.LJIIIZ.LIZ(sdkUplinkPacketDecode.uniqueID.longValue());
                    if (c2222521BykLIZ == null) {
                        LIZIZ(sdkUplinkPacketDecode.serviceID.longValue(), sdkUplinkPacketDecode.uniqueID.longValue(), payloadItem.getLogId(), "receiveWSPayload");
                        return;
                    }
                    C2222661Byy c2222661Byy = EnumC2222551Byn.Companion;
                    int iIntValue = sdkUplinkPacketDecode.uplinkStrategy.intValue();
                    c2222661Byy.getClass();
                    if (iIntValue != 0) {
                        if (iIntValue == 1) {
                            enumC2222551Byn2 = EnumC2222551Byn.WS_ORIGIN;
                        } else {
                            enumC2222551Byn2 = EnumC2222551Byn.ORIGIN;
                        }
                    } else {
                        enumC2222551Byn2 = EnumC2222551Byn.WS_MSG_ORIGIN;
                    }
                    this.LJ = enumC2222551Byn2;
                    Integer num = sdkUplinkPacketDecode.statusCode;
                    if (num != null && num.intValue() == 0) {
                        c2222521BykLIZ.LIZLLL(sdkUplinkPacketDecode, this.LIZIZ.isWsConnected(), true);
                        LIZJ(c2222521BykLIZ);
                        return;
                    }
                    int iIntValue2 = sdkUplinkPacketDecode.statusCode.intValue();
                    String str5 = sdkUplinkPacketDecode.statusMessage;
                    if (str5 != null) {
                        str4 = str5;
                    }
                    c2222521BykLIZ.LIZJ(this.LIZIZ.isWsConnected(), new C2222631Byv(iIntValue2, str4, null));
                    LJ(c2222521BykLIZ);
                    return;
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    C2222361ByU.LIZ(this.LIZ, "receive uplink packet by ws error");
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    String message2 = e4.getMessage();
                    if (message2 == null) {
                        message2 = "Unknown exception";
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("error", message2);
                    jSONObject3.put("log_id", payloadItem.getLogId());
                    this.LIZ.monitor("uplink_receive_ws_packet_error", jSONObject, jSONObject2, jSONObject3);
                    C2222121By6 c2222121By62 = this.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("receive ws uplink packet error: ");
                    sbLIZ2.append(message2);
                    C2222361ByU.LIZ(c2222121By62, C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
            case 12347:
                C2222521Byk c2222521Byk2 = (C2222521Byk) HandlerHook.getMessageObj(message.obj);
                C2222521Byk c2222521BykLIZ2 = this.LJIIIZ.LIZ(c2222521Byk2.LIZ);
                if (c2222521BykLIZ2 == null) {
                    LIZIZ(c2222521Byk2.LIZIZ, c2222521Byk2.LIZ, 0L, "receiveMsgHttpResult");
                    return;
                }
                try {
                    AbstractC19666311wz<C2222611Byt, ? extends Exception> abstractC19666311wz = c2222521BykLIZ2.LJI;
                    if (abstractC19666311wz != null) {
                        if (abstractC19666311wz instanceof C19666111wx) {
                            SdkUplinkPacket sdkUplinkPacketDecode2 = SdkUplinkPacket.ADAPTER.decode(((C2222611Byt) ((C19666111wx) abstractC19666311wz).LIZIZ).LIZLLL);
                            C2222121By6 c2222121By63 = this.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("receive uplink packet by msg http, logId: ");
                            if (sdkUplinkPacketDecode2 != null && (map = sdkUplinkPacketDecode2.headers) != null && (str = map.get("X-Tt-Logid")) != null) {
                                str3 = str;
                            }
                            sbLIZ3.append(str3);
                            C2222361ByU.LIZ(c2222121By63, C2188811AlT.LIZIZ(sbLIZ3));
                            C2222661Byy c2222661Byy2 = EnumC2222551Byn.Companion;
                            int iIntValue3 = sdkUplinkPacketDecode2.uplinkStrategy.intValue();
                            c2222661Byy2.getClass();
                            if (iIntValue3 != 0) {
                                if (iIntValue3 == 1) {
                                    enumC2222551Byn = EnumC2222551Byn.WS_ORIGIN;
                                } else {
                                    enumC2222551Byn = EnumC2222551Byn.ORIGIN;
                                }
                            } else {
                                enumC2222551Byn = EnumC2222551Byn.WS_MSG_ORIGIN;
                            }
                            this.LJ = enumC2222551Byn;
                            Integer num2 = sdkUplinkPacketDecode2.statusCode;
                            if (num2 != null && num2.intValue() == 0) {
                                c2222521BykLIZ2.LIZLLL(sdkUplinkPacketDecode2, this.LIZIZ.isWsConnected(), false);
                            } else {
                                int iIntValue4 = sdkUplinkPacketDecode2.statusCode.intValue();
                                String str6 = sdkUplinkPacketDecode2.statusMessage;
                                if (str6 != null) {
                                    str4 = str6;
                                }
                                c2222521BykLIZ2.LIZJ(this.LIZIZ.isWsConnected(), new C2222631Byv(iIntValue4, str4, null));
                            }
                        } else if (abstractC19666311wz instanceof C19666211wy) {
                            Exception exc = ((C19666211wy) abstractC19666311wz).LIZIZ;
                            C2222361ByU.LIZ(this.LIZ, "receive uplink packet by msg error");
                            c2222521BykLIZ2.LIZJ(this.LIZIZ.isWsConnected(), exc);
                        } else {
                            throw new C1954807lC();
                        }
                    }
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    c2222521BykLIZ2.LIZJ(this.LIZIZ.isWsConnected(), e5);
                }
                LIZJ(c2222521BykLIZ2);
                return;
            case 12348:
                C2222521Byk c2222521Byk3 = (C2222521Byk) HandlerHook.getMessageObj(message.obj);
                C2222361ByU.LIZ(this.LIZ, "receive uplink packet by origin http");
                C2222521Byk c2222521BykLIZ3 = this.LJIIIZ.LIZ(c2222521Byk3.LIZ);
                if (c2222521BykLIZ3 == null) {
                    LIZIZ(c2222521Byk3.LIZIZ, c2222521Byk3.LIZ, 0L, "receiveOriginHttpResult");
                    return;
                }
                try {
                    AbstractC19666311wz<C2222611Byt, ? extends Exception> abstractC19666311wz2 = c2222521BykLIZ3.LJII;
                    if (abstractC19666311wz2 != null) {
                        if (abstractC19666311wz2 instanceof C19666111wx) {
                            C2222611Byt c2222611Byt = (C2222611Byt) ((C19666111wx) abstractC19666311wz2).LIZIZ;
                            boolean zIsWsConnected2 = this.LIZIZ.isWsConnected();
                            c2222521BykLIZ3.LJIIIZ = c2222611Byt;
                            C2222591Byr c2222591Byr2 = c2222521BykLIZ3.LJIIL;
                            c2222591Byr2.getClass();
                            c2222591Byr2.LJII = System.currentTimeMillis();
                            c2222591Byr2.LJFF = zIsWsConnected2;
                            c2222591Byr2.LJIIIIZZ = true;
                            c2222591Byr2.LJIIIZ = c2222611Byt.LIZ;
                            c2222591Byr2.LJIIJ = c2222611Byt.LIZIZ;
                        } else if (abstractC19666311wz2 instanceof C19666211wy) {
                            c2222521BykLIZ3.LIZJ(this.LIZIZ.isWsConnected(), ((C19666211wy) abstractC19666311wz2).LIZIZ);
                        } else {
                            throw new C1954807lC();
                        }
                    }
                } catch (Exception e6) {
                    TryCatchGuardChecker.doCheck(e6);
                    c2222521BykLIZ3.LIZJ(this.LIZIZ.isWsConnected(), e6);
                }
                LIZJ(c2222521BykLIZ3);
                return;
            case 12349:
                try {
                    for (Map.Entry<Long, C2222521Byk> entry : this.LJIIIZ.LIZ.entrySet()) {
                        entry.getValue().LIZJ(this.LIZIZ.isWsConnected(), new C2222631Byv(-4, "released", null));
                        LIZJ(entry.getValue());
                    }
                    this.LJIIIZ.LIZ.clear();
                    C18JU c18ju = this.LJFF;
                    if (c18ju == null) {
                        return;
                    }
                    c18ju.quit();
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return;
                }
            case 12350:
                LinkedHashMap<Long, C2222521Byk> linkedHashMap = this.LJIIIZ.LIZ;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<Long, C2222521Byk> entry2 : linkedHashMap.entrySet()) {
                    if (entry2.getValue().LJIILJJIL) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    ((C2222521Byk) entry3.getValue()).LIZJ(this.LIZIZ.isWsConnected(), new C2222631Byv(-5, "ws disconnect", null));
                    LJ((C2222521Byk) entry3.getValue());
                }
                return;
            default:
                return;
        }
    }

    public C2222511Byj(C2222121By6 c2222121By6, IMessageWsClient iMessageWsClient, IMessageWsClient iMessageWsClient2, InterfaceC2222621Byu interfaceC2222621Byu) {
        this.LIZ = c2222121By6;
        this.LIZIZ = iMessageWsClient;
        this.LIZJ = iMessageWsClient2;
        this.LIZLLL = interfaceC2222621Byu;
        interfaceC2222621Byu.LIZIZ();
        interfaceC2222621Byu.LJ();
        interfaceC2222621Byu.LIZIZ();
        this.LJ = EnumC2222551Byn.WS_ORIGIN;
        this.LJIIIZ = new C2222601Bys();
        this.LJIIJ = new C13MJ();
    }

    public final void LIZIZ(long j, long j2, long j3, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("receive_type", str);
        jSONObject.put("service_id", j);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("log_id", j3);
        jSONObject3.put("unique_id", j2);
        this.LIZ.monitor("uplink_receive_request_no_item_found_error", jSONObject, jSONObject2, jSONObject3);
        C2222361ByU.LIZ(this.LIZ, "no request item found");
    }

    public final void LJI(long j, C1500700p9g c1500700p9g, InterfaceC19666511x1 interfaceC19666511x1, C2222521Byk c2222521Byk) {
        Message messageObtainMessage;
        long jIncrementAndGet = this.LJIIJ.LIZ.incrementAndGet();
        c1500700p9g.getClass();
        this.LIZLLL.LIZ();
        C2222521Byk c2222521Byk2 = new C2222521Byk(jIncrementAndGet, j, Mp4ScreenVideoLoadTimeout.CONTROL, c1500700p9g, interfaceC19666511x1, c2222521Byk);
        WeakHandler weakHandler = this.LJI;
        if (weakHandler != null && (messageObtainMessage = weakHandler.obtainMessage(12345, c2222521Byk2)) != null) {
            messageObtainMessage.sendToTarget();
        }
    }

    public final void LJIIJ(C2222521Byk c2222521Byk, long j, EnumC2222551Byn enumC2222551Byn, boolean z, Exception exc) throws JSONException {
        c2222521Byk.LIZJ(this.LIZIZ.isWsConnected(), new C2222631Byv(-5, "sendRequestError", null));
        LIZJ(c2222521Byk);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("service_id", j);
        jSONObject.put("send_uplink_strategy", enumC2222551Byn.getStrategy(z));
        jSONObject.put("ws_connected", z);
        JSONObject jSONObject2 = new JSONObject();
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown exception";
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("error", message);
        this.LIZ.monitor("uplink_send_error", jSONObject, jSONObject2, jSONObject3);
        C2222121By6 c2222121By6 = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uplink send error, use strategy: ");
        sbLIZ.append(enumC2222551Byn.getStrategy(z));
        sbLIZ.append(", ws connect: ");
        sbLIZ.append(z);
        sbLIZ.append(", error: ");
        sbLIZ.append(message);
        C2222361ByU.LIZ(c2222121By6, C2188811AlT.LIZIZ(sbLIZ));
    }
}
