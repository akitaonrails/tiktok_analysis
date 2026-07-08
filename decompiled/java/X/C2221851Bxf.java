package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.MessageApi;
import com.bytedance.android.livesdk.MessageService;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.android.livesdk.dataChannel.HistoryInfoChannel;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageForceHttpSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageModelSizeOptSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTrackerSwitchSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenFirstMessagesReleaseSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMessageSEITimeoutSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.SpecifiedDisplayText;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.model.message.tracking.ReasonMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message.HeartBeat;
import com.bytedance.android.livesdkapi.message.HeartBeat_ProtoEncoder;
import com.bytedance.android.livesdkapi.message.ImEnterRoom;
import com.bytedance.android.livesdkapi.message.ImEnterRoom_ProtoEncoder;
import com.bytedance.android.livesdkapi.message.ProtoMessageFetchResult;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.android.message.IMessageService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.MessageApiConstant;
import com.ss.ugc.live.sdk.message.MessageMonitor;
import com.ss.ugc.live.sdk.message.data.FullLinkTrack;
import com.ss.ugc.live.sdk.message.data.HistoryInfo;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS183S1100000_34;
import kotlin.jvm.internal.AwS278S0300000_34;
import kotlin.jvm.internal.AwS435S0200000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.im.LinkStateMessage;
import webcast.im.PreviewRoom;
import webcast.im._PreviewRoom_ProtoEncoder;

/* JADX INFO: renamed from: X.1Bxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221851Bxf extends AbstractC2222531Byl {
    public final C2221761BxW LIZIZ;
    public final boolean LIZJ;
    public IMessageWsClient.Callback LIZLLL;
    public long LJ;
    public final long LJFF;
    public final boolean LJI;
    public Context LJII;
    public MessageApi LJIIIIZZ;
    public long LJIIIZ;
    public final String LJIIJ;
    public String LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public final C2221871Bxh LJIIZILJ;
    public InterfaceC2221911Bxl LJIJ;
    public String LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public long LJJI;
    public MessageService LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public int LJJIIJ;
    public long LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public C0X9S<InterfaceC1516690pZT> LJJIJIIJI;
    public String LJJIJIIJIL;
    public String LJJIJIL;
    public boolean LJJIJL;
    public final C13KQ LJJIJLIJ;
    public final C01GW LJJIL;
    public final C2221881Bxi LJJIZ;
    public boolean LJIILL = true;
    public boolean LJIILLIIL = true;
    public final C2221901Bxk LJIJI = new C2221901Bxk();

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void setWebSocketServerTimeGap(long j) {
    }

    public final Map<String, String> LIZJ() {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        C1515210pX5.LIZLLL().getClass();
        HashMap map = new HashMap(C1515210pX5.LIZIZ());
        map.put("room_id", String.valueOf(this.LJ));
        map.put("rid", String.valueOf(this.LJ));
        map.put("aid", String.valueOf(iHostAppContext.appId()));
        map.put("identity", this.LJIIJ);
        map.put("live_id", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId()));
        map.put("sup_ws_ds_opt", "1");
        return map;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void connectToWebSocketReuse() {
        if (this.LJII == null || LiveMessageForceHttpSetting.INSTANCE.getValue()) {
            return;
        }
        if (TextUtils.isEmpty(this.LIZIZ.LIZ())) {
            IMessageWsClient.Callback callback = this.LIZLLL;
            if (callback != null) {
                callback.onWebSocketDisconnected();
                return;
            }
            return;
        }
        try {
            ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).initZstdCompressResourceWhenLivePlay();
            C1276320jJm c1276320jJmTtUrlDispatch = TTNetInit.ttUrlDispatch(u.LJJIFFI(this.LIZIZ.LIZ(), "wss://", "https://", false));
            if (!TextUtils.isEmpty(c1276320jJmTtUrlDispatch.LIZIZ)) {
                this.LJJIJIIJIL = c1276320jJmTtUrlDispatch.LIZIZ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        HashMap map = new HashMap(LIZJ());
        map.putAll(C2221791BxZ.LIZIZ());
        this.LJJIJL = C2221661BxM.LIZIZ();
        C2221871Bxh c2221871Bxh = this.LJIIZILJ;
        if (!c2221871Bxh.LIZIZ) {
            c2221871Bxh.LIZIZ = true;
            c2221871Bxh.LIZ = SystemClock.uptimeMillis();
        }
        C2221821Bxc.LJIIIZ("", this.LIZIZ.LIZ(), true);
        this.LJIJI.LIZ = new C2221861Bxg(this.LIZIZ.LIZ(), map, this);
        C1515210pX5 c1515210pX5LIZLLL = C1515210pX5.LIZLLL();
        Context context = this.LJII;
        String strLIZ = this.LIZIZ.LIZ();
        C2221901Bxk c2221901Bxk = this.LJIJI;
        c1515210pX5LIZLLL.getClass();
        this.LJIJ = ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).registerWsChannel(context, strLIZ, map, c2221901Bxk);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final Map<String, String> getFetchHistoryParams() {
        String strT2;
        String str;
        Resources resources;
        Configuration configuration;
        Locale locale;
        HashMap map = new HashMap();
        map.put("resp_content_type", "protobuf");
        Context context = this.LJII;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || (locale = configuration.locale) == null || (strT2 = C786410Ut5.t2(locale)) == null) {
            strT2 = "";
        }
        map.put("app_language", strT2);
        map.put("live_id", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId()));
        map.remove("fetch_time");
        map.remove("ack_ids");
        map.put("identity", this.LJIIJ);
        map.put("last_rtt", String.valueOf(this.LJIIL));
        map.put("recv_cnt", String.valueOf(this.LJIILIIL));
        map.put("parse_cnt", String.valueOf(this.LJIILJJIL));
        if (!TextUtils.isEmpty(this.LJIIJJI) && (str = this.LJIIJJI) != null) {
            map.put("internal_ext", str);
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Object objGg0 = dataChannelGlobal.gg0(C168N.class);
        if (objGg0 == null) {
            objGg0 = "";
        }
        map.put("live_region", objGg0);
        Object objGg02 = dataChannelGlobal.gg0(C168O.class);
        map.put("room_tag", objGg02 != null ? objGg02 : "");
        return map;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final boolean isWsConnected() {
        InterfaceC2221911Bxl interfaceC2221911Bxl = this.LJIJ;
        if (interfaceC2221911Bxl != null) {
            return interfaceC2221911Bxl.isConnected();
        }
        return false;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void onRelease() {
        C0X9S<InterfaceC1516690pZT> c0x9s = this.LJJIJIIJI;
        if (c0x9s != null) {
            c0x9s.cancel();
        }
        C1519770peR c1519770peRLIZ = C1519770peR.LIZ();
        C2221881Bxi c2221881Bxi = this.LJJIZ;
        if (c2221881Bxi == null) {
            c1519770peRLIZ.getClass();
        } else {
            c1519770peRLIZ.LIZ.LJ(c2221881Bxi);
        }
        C2221811Bxb c2221811Bxb = this.LIZIZ.LIZIZ;
        int i = this.LJIJJLI;
        int i2 = this.LJIL;
        c2221811Bxb.getClass();
        int i3 = i + i2;
        if (i3 > 0) {
            HashMap map = new HashMap();
            map.put("api_call_success_count", Integer.valueOf(i));
            map.put("api_call_error_count", Integer.valueOf(i2));
            map.put("api_call_success_ration", Double.valueOf((((double) i) * 1.0d) / ((double) i3)));
            c2221811Bxb.LIZ(map);
            C1CC2.LJII(0, "ttlive_fetch_message_success_ratio", map);
        }
        C2221811Bxb c2221811Bxb2 = this.LIZIZ.LIZIZ;
        long j = this.LJJI;
        long j2 = this.LJJ;
        c2221811Bxb2.getClass();
        if (j2 > 0) {
            HashMap map2 = new HashMap();
            map2.put("api_call_delay_count", Long.valueOf(j2));
            map2.put("api_call_delay_all", Long.valueOf(j));
            map2.put("api_delay_average", Double.valueOf((j * 1.0d) / j2));
            c2221811Bxb2.LIZ(map2);
            C1CC2.LJIILJJIL(0, 1, "ttlive_fetch_message_delay_average", map2);
        }
        if (this.LJJIIZI != 0) {
            this.LJJIJ += SystemClock.uptimeMillis() - this.LJJIIZI;
        }
        if (this.LJJIIZ != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.LJJIIZ;
            C2221871Bxh c2221871Bxh = this.LJIIZILJ;
            long j3 = this.LJJIJ;
            int i4 = this.LJJIIJ;
            c2221871Bxh.LIZ();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            C486980J7w.LIZ("is_anchor", c2221871Bxh.LIZJ ? 1L : 0L, jSONObject);
            C486980J7w.LIZ("ws_time", j3, jSONObject);
            C486980J7w.LIZ("all_time", jUptimeMillis, jSONObject);
            long j4 = i4;
            C486980J7w.LIZ("interrupt_times", j4, jSONObject);
            double d = j3 / jUptimeMillis;
            try {
                jSONObject.put("ws_rate", d);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("TimeCostUtil", "", e);
            }
            c2221871Bxh.LIZLLL.LIZIZ(jSONObject);
            c2221871Bxh.LIZLLL.LIZJ(jSONObject2);
            c2221871Bxh.LIZLLL.getClass();
            C2221811Bxb.LIZLLL(jSONObject3);
            C486980J7w.LIZ("ws_time", j3, jSONObject3);
            C486980J7w.LIZ("all_time", jUptimeMillis, jSONObject3);
            try {
                jSONObject3.put("ws_rate", d);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C20441214yg.LJFF("TimeCostUtil", "", e2);
            }
            C486980J7w.LIZ("interrupt_times", j4, jSONObject3);
            C1CC2.LJI("ttlive_ws_connect_rate", jSONObject2, jSONObject3, jSONObject);
        }
        this.LJIIIZ = 0L;
        this.LJIIJJI = null;
        this.LJIIL = 0L;
        this.LJIILIIL = 0L;
        this.LJIILJJIL = 0L;
        this.LJIILL = true;
        this.LJIILLIIL = true;
        this.LJIJJLI = 0;
        this.LJIL = 0;
        this.LJJ = 0;
        this.LJJI = 0L;
        this.LJJII = false;
        this.LJJIII = false;
        this.LJJIIJZLJL = 0L;
        this.LJJIIZ = 0L;
        this.LJJIIZI = 0L;
        this.LJJIJ = 0L;
        this.LJJIIJ = 0;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void onStartMessage() {
        if (this.LJJIIZ == 0) {
            this.LJJIIZ = SystemClock.uptimeMillis();
        }
        if (isWsConnected()) {
            this.LJJIIZI = SystemClock.uptimeMillis();
        }
        C1519770peR c1519770peRLIZ = C1519770peR.LIZ();
        C2221881Bxi c2221881Bxi = this.LJJIZ;
        if (c2221881Bxi == null) {
            c1519770peRLIZ.getClass();
        } else {
            c1519770peRLIZ.LIZ.LIZJ(c2221881Bxi);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final long getCurrentTimeMillis() {
        return C158B.LIZ();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final String getDomain() {
        String str = isWsConnected() ? this.LJJIJIIJIL : this.LJJIJIL;
        if (str == null || str.length() == 0) {
            return "";
        }
        String host = UriProtector.parse(str).getHost();
        return host != null ? host : str;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final long getRoomId() {
        return this.LJ;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final long getUserId() {
        return this.LJFF;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.ugc.live.sdk.message.data.PayloadItem LIZLLL(com.bytedance.android.livesdkapi.ws.LiveWsMessage r15) {
        /*
            java.util.List<com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader> r0 = r15.msgHeaders
            r4 = 0
            if (r0 == 0) goto L8f
            java.util.Iterator r3 = r0.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader r0 = (com.bytedance.android.livesdkapi.ws.LiveWsMessage.MsgHeader) r0
            java.lang.String r1 = r0.key
            java.lang.String r0 = "compress_type"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9
        L20:
            com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader r2 = (com.bytedance.android.livesdkapi.ws.LiveWsMessage.MsgHeader) r2
            if (r2 == 0) goto L8f
            java.lang.String r7 = r2.value
        L26:
            java.util.List<com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader> r0 = r15.msgHeaders
            if (r0 == 0) goto L8a
            java.util.Iterator r3 = r0.iterator()
        L2e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader r0 = (com.bytedance.android.livesdkapi.ws.LiveWsMessage.MsgHeader) r0
            java.lang.String r1 = r0.key
            java.lang.String r0 = "server_time"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2e
            r4 = r2
        L46:
            com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader r4 = (com.bytedance.android.livesdkapi.ws.LiveWsMessage.MsgHeader) r4
            if (r4 == 0) goto L8a
            java.lang.String r0 = r4.value
            if (r0 == 0) goto L8a
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L8a
            long r12 = r0.longValue()
        L58:
            com.ss.ugc.live.sdk.message.data.PayloadItem r4 = new com.ss.ugc.live.sdk.message.data.PayloadItem
            java.lang.String r5 = r15.payloadType
            byte[] r6 = r15.LIZ()
            long r8 = r15.logId
            long r10 = r15.seqId
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.List<com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader> r0 = r15.msgHeaders
            if (r0 == 0) goto L91
            java.util.Iterator r3 = r0.iterator()
        L71:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r3.next()
            com.bytedance.android.livesdkapi.ws.LiveWsMessage$MsgHeader r0 = (com.bytedance.android.livesdkapi.ws.LiveWsMessage.MsgHeader) r0
            X.1Bxo r2 = new X.1Bxo
            java.lang.String r1 = r0.key
            java.lang.String r0 = r0.value
            r2.<init>(r1, r0)
            r14.add(r2)
            goto L71
        L8a:
            r12 = 0
            goto L58
        L8d:
            r2 = r4
            goto L20
        L8f:
            r7 = r4
            goto L26
        L91:
            r4.<init>(r5, r6, r7, r8, r10, r12, r14)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2221851Bxf.LIZLLL(com.bytedance.android.livesdkapi.ws.LiveWsMessage):com.ss.ugc.live.sdk.message.data.PayloadItem");
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJFF(ProtoApiResult protoApiResult) {
        byte[] bArr;
        Class<? extends AbstractC1136060ffY> messageClass;
        CommonMessageData commonMessageData;
        Text text;
        List<TextPiece> list;
        Long lValueOf;
        Long lValueOf2;
        TextPieceUser textPieceUser;
        User user;
        User user2;
        User user3;
        Text text2;
        List<TextPiece> list2;
        TextPieceUser textPieceUser2;
        Text text3;
        List<TextPiece> list3;
        TextPieceUser textPieceUser3;
        List<TextPiece> list4;
        TextPieceUser textPieceUser4;
        Text text4;
        List<TextPiece> list5;
        TextPieceUser textPieceUser5;
        int length;
        List<ProtoApiResult.ProtoMessage> list6 = protoApiResult.protoMessages;
        boolean z = false;
        if (list6 != null && !list6.isEmpty()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (ProtoApiResult.ProtoMessage protoMessage : protoApiResult.protoMessages) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                if (!TextUtils.isEmpty(protoMessage.method) && (bArr = protoMessage.payload) != null && bArr.length != 0) {
                    C259800zU c259800zU = new C259800zU();
                    try {
                        messageClass = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).getMessageClass(protoMessage.method);
                    } catch (Throwable th) {
                        th = th;
                    }
                    if (messageClass == null) {
                        String str = protoMessage.method;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("No corresponding class definition for method ");
                        sbLIZ.append(protoMessage.method);
                        sbLIZ.append('.');
                        arrayList2.add(ReasonMessage.from(str, z, C2188811AlT.LIZIZ(sbLIZ)));
                        C01GW c01gw = C20340414iQ.LIZ;
                        C20340414iQ.LIZIZ(new AwS435S0200000_34(protoApiResult, protoMessage, 15));
                    } else {
                        C1515210pX5.LIZLLL().getClass();
                        C0IMD c0imdLJI = C1515210pX5.LJI(messageClass);
                        if (c0imdLJI != null) {
                            try {
                                long jLIZ = C158B.LIZ();
                                C1516680pZS c1516680pZS = new C1516680pZS();
                                c1516680pZS.LJIIL(new C1506330pIl(protoMessage.payload));
                                ?? LIZJ = c0imdLJI.LIZJ(c1516680pZS);
                                c259800zU.element = LIZJ;
                                ((AbstractC1136060ffY) LIZJ).setDecodeStartAtMillis(jLIZ);
                                ((AbstractC1136060ffY) c259800zU.element).setDecodeEndAtMillis(C158B.LIZ());
                                T t = c259800zU.element;
                                if (t instanceof ChatMessage) {
                                    AbstractC1136060ffY abstractC1136060ffY = (AbstractC1136060ffY) t;
                                    if (((ChatMessage) abstractC1136060ffY).userInfo != null && ((ChatMessage) abstractC1136060ffY).userInfo.getId() == this.LJFF) {
                                        if (this.LJJIFFI == null) {
                                            this.LJJIFFI = (MessageService) C1161920gLG.LIZJ(IMessageService.class);
                                        }
                                        MessageService messageService = this.LJJIFFI;
                                        if (messageService != null) {
                                            ChatMessage chatMessage = (ChatMessage) abstractC1136060ffY;
                                            Iterator<InterfaceC1115810f8t> it2 = messageService.LL.iterator();
                                            while (it2.hasNext()) {
                                                it2.next().LIZ(chatMessage);
                                            }
                                        }
                                    }
                                }
                                T t2 = c259800zU.element;
                                if (t2 instanceof MemberMessage) {
                                    AbstractC1136060ffY abstractC1136060ffY2 = (AbstractC1136060ffY) t2;
                                    CommonMessageData commonMessageData2 = abstractC1136060ffY2.baseMessage;
                                    if (commonMessageData2 != null && (text4 = commonMessageData2.displayText) != null && (list5 = text4.pieces) != null) {
                                        for (TextPiece textPiece : list5) {
                                            if (textPiece != null && (textPieceUser5 = textPiece.userValue) != null && textPieceUser5.user == null) {
                                                textPieceUser5.user = ((MemberMessage) abstractC1136060ffY2).user;
                                            }
                                        }
                                    }
                                    Text text5 = ((MemberMessage) abstractC1136060ffY2).anchorDisplayText;
                                    if (text5 != null && (list4 = text5.pieces) != null) {
                                        for (TextPiece textPiece2 : list4) {
                                            if (textPiece2 != null && (textPieceUser4 = textPiece2.userValue) != null && textPieceUser4.user == null) {
                                                textPieceUser4.user = ((MemberMessage) abstractC1136060ffY2).user;
                                            }
                                        }
                                    }
                                }
                                T t3 = c259800zU.element;
                                if (t3 instanceof LikeMessage) {
                                    AbstractC1136060ffY abstractC1136060ffY3 = (AbstractC1136060ffY) t3;
                                    CommonMessageData commonMessageData3 = abstractC1136060ffY3.baseMessage;
                                    if (commonMessageData3 != null && (text3 = commonMessageData3.displayText) != null && (list3 = text3.pieces) != null) {
                                        for (TextPiece textPiece3 : list3) {
                                            if (textPiece3 != null && (textPieceUser3 = textPiece3.userValue) != null && textPieceUser3.user == null) {
                                                textPieceUser3.user = ((LikeMessage) abstractC1136060ffY3).user;
                                            }
                                        }
                                    }
                                    List<SpecifiedDisplayText> list7 = ((LikeMessage) abstractC1136060ffY3).specifiedDisplayText;
                                    if (list7 != null) {
                                        for (SpecifiedDisplayText specifiedDisplayText : list7) {
                                            if (specifiedDisplayText != null && (text2 = specifiedDisplayText.displayText) != null && (list2 = text2.pieces) != null) {
                                                for (TextPiece textPiece4 : list2) {
                                                    if (textPiece4 != null && (textPieceUser2 = textPiece4.userValue) != null && textPieceUser2.user == null) {
                                                        textPieceUser2.user = ((LikeMessage) abstractC1136060ffY3).user;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                T t4 = c259800zU.element;
                                if ((t4 instanceof GiftMessage) && ((GiftMessage) t4).version == 1) {
                                    try {
                                        AbstractC1136060ffY abstractC1136060ffY4 = (AbstractC1136060ffY) t4;
                                        if (abstractC1136060ffY4 != null && (commonMessageData = abstractC1136060ffY4.baseMessage) != null && (text = commonMessageData.displayText) != null && (list = text.pieces) != null) {
                                            for (TextPiece textPiece5 : list) {
                                                if (textPiece5 != null && textPiece5.type == EnumC1133850fbz.USER.getPieceType()) {
                                                    TextPieceUser textPieceUser6 = textPiece5.userValue;
                                                    if (textPieceUser6 != null && (user3 = textPieceUser6.user) != null) {
                                                        lValueOf = Long.valueOf(user3.getId());
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    AbstractC1136060ffY abstractC1136060ffY5 = (AbstractC1136060ffY) c259800zU.element;
                                                    if (abstractC1136060ffY5 != null && (user2 = ((GiftMessage) abstractC1136060ffY5).fromUser) != null) {
                                                        lValueOf2 = Long.valueOf(user2.getId());
                                                    } else {
                                                        lValueOf2 = null;
                                                    }
                                                    if (Intrinsics.LJFF(lValueOf, lValueOf2) && textPiece5 != null && (textPieceUser = textPiece5.userValue) != null) {
                                                        AbstractC1136060ffY abstractC1136060ffY6 = (AbstractC1136060ffY) c259800zU.element;
                                                        if (abstractC1136060ffY6 != null) {
                                                            user = ((GiftMessage) abstractC1136060ffY6).fromUser;
                                                        } else {
                                                            user = null;
                                                        }
                                                        textPieceUser.user = user;
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        TryCatchGuardChecker.doCheck(th);
                                        C2221821Bxc.LJFF(th, protoMessage, protoApiResult.protoMessages, protoApiResult.messageFrom);
                                        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                                        StackTraceElement[] stackTrace = th.getStackTrace();
                                        c1143300frELJIIJJI.getClass();
                                        AbstractC1143290frD.LJIIJ(stackTrace, 6);
                                        this.LIZIZ.LIZIZ.LJIIIZ(protoMessage.method, th);
                                        arrayList2.add(ReasonMessage.from(protoMessage.method, false, Arrays.toString(th.getStackTrace())));
                                        C01GW c01gw2 = C20340414iQ.LIZ;
                                        C20340414iQ.LIZIZ(new AwS278S0300000_34(protoMessage, th, protoApiResult, 4));
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            C2221821Bxc.LJFF(new Throwable("Failed to decode, message decoder is null!"), protoMessage, protoApiResult.protoMessages, protoApiResult.messageFrom);
                            this.LIZIZ.LIZIZ.LJIIIZ(protoMessage.method, new Throwable("Failed to decode, message decoder is null!"));
                            String str2 = protoMessage.method;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("No corresponding decoder for method ");
                            sbLIZ2.append(protoMessage.method);
                            sbLIZ2.append('.');
                            arrayList2.add(ReasonMessage.from(str2, false, C2188811AlT.LIZIZ(sbLIZ2)));
                            C01GW c01gw3 = C20340414iQ.LIZ;
                            C20340414iQ.LIZIZ(new AwS435S0200000_34(protoApiResult, protoMessage, 16));
                        }
                        T t6 = c259800zU.element;
                        if (t6 != 0) {
                            ((AbstractC1136060ffY) t6).isFirst = protoApiResult.isFirst;
                            ((AbstractC1136060ffY) t6).generalMessageType = protoMessage.msgType;
                            ((AbstractC1136060ffY) t6).messageFrom = protoApiResult.messageFrom;
                            ((AbstractC1136060ffY) t6).timestamp = protoApiResult.now;
                            ((AbstractC1136060ffY) t6).isHistoryMessage = protoMessage.isHistoryMsg;
                            ((AbstractC1136060ffY) t6).sampleFlag = protoMessage.sampleFlag;
                            ((AbstractC1136060ffY) t6).receiveTime = protoApiResult.receiveMessageTime;
                            ((AbstractC1136060ffY) t6).setOuterMessageId(protoMessage.msgId);
                            T t7 = c259800zU.element;
                            ((AbstractC1136060ffY) t7).baseMessage.roomId = protoApiResult.roomIdInHeader;
                            C1091120eV4.LIZIZ((AbstractC1136060ffY) t7, this.LJI);
                            InterfaceC480510Isr interfaceC480510Isr = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ;
                            if (interfaceC480510Isr != null) {
                                C2221811Bxb c2221811Bxb = this.LIZIZ.LIZIZ;
                                long jLJJIIJ = interfaceC480510Isr.LJJIIJ();
                                c2221811Bxb.getClass();
                                C2221811Bxb.LJIIIIZZ(jLJJIIJ);
                                ((AbstractC1136060ffY) c259800zU.element).dispatchTimeoutMilis = LiveMessageSEITimeoutSetting.INSTANCE.calculateSEIDelayRegulateByConfig(interfaceC480510Isr.LJJIIJ());
                            }
                            if (((IHostConfig) C1161920gLG.LIZJ(IHostConfig.class)).i32().LIZLLL()) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("PB2JSON ");
                                sbLIZ3.append(protoMessage.method);
                                C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3), C19748512Ol.LIZIZ.LJIILL(c259800zU.element));
                            }
                            if (this.LJIILL) {
                                this.LJIILL = false;
                                C2221811Bxb c2221811Bxb2 = this.LIZIZ.LIZIZ;
                                String str3 = protoMessage.method;
                                long messageId = ((AbstractC1136060ffY) c259800zU.element).getMessageId();
                                c2221811Bxb2.getClass();
                                C2221811Bxb.LJI(messageId, "ON_FIRST_MSG_RECEIVED", str3);
                            }
                            if (this.LJIILLIIL) {
                                T t8 = c259800zU.element;
                                if ((t8 instanceof MemberMessage) && ((MemberMessage) t8).user != null && ((MemberMessage) t8).user.getId() == this.LJFF) {
                                    this.LJIILLIIL = false;
                                    C2221811Bxb c2221811Bxb3 = this.LIZIZ.LIZIZ;
                                    long messageId2 = ((MemberMessage) c259800zU.element).getMessageId();
                                    c2221811Bxb3.getClass();
                                    C2221811Bxb.LJI(messageId2, "ON_SELF_ENTER_MSG_RECEIVED", "WebcastMemberMessage");
                                }
                            }
                            C2221821Bxc.LJI((AbstractC1136060ffY) c259800zU.element);
                        } else {
                            C2221821Bxc.LJFF(new Throwable("Failed to decode, message is empty after decode!"), protoMessage, protoApiResult.protoMessages, protoApiResult.messageFrom);
                            arrayList2.add(ReasonMessage.from(protoMessage.method, false, "Message is empty after parsing."));
                            C01GW c01gw4 = C20340414iQ.LIZ;
                            C20340414iQ.LIZIZ(new AwS435S0200000_34(protoApiResult, protoMessage, 17));
                        }
                        T t9 = c259800zU.element;
                        if (t9 != 0) {
                            protoApiResult.messages.add((IMessage) t9);
                            arrayList.add(IdMessage.from((AbstractC1136060ffY) c259800zU.element));
                            Map<String, Object> extraParams = ((AbstractC1136060ffY) c259800zU.element).getExtraParams();
                            byte[] bArr2 = protoMessage.payload;
                            if (bArr2 != null) {
                                length = bArr2.length;
                            } else {
                                length = 0;
                            }
                            extraParams.put("extra_message_payload_size", Integer.valueOf(length));
                            ((AbstractC1136060ffY) c259800zU.element).getExtraParams().put(MessageMonitor.getLiveMessageStageName("decode_self_message_time", MessageMonitor.Stage.START), Long.valueOf(jElapsedRealtime2));
                            ((AbstractC1136060ffY) c259800zU.element).getExtraParams().put(MessageMonitor.getLiveMessageStageName("decode_self_message_time", MessageMonitor.Stage.END), Long.valueOf(SystemClock.elapsedRealtime()));
                            AbstractC1136060ffY abstractC1136060ffY7 = (AbstractC1136060ffY) c259800zU.element;
                            abstractC1136060ffY7.messageTrackTimeInfo.receiveMessageTime = protoApiResult.receiveMessageTime;
                            abstractC1136060ffY7.getExtraParams().put("extra_message_imsdk_scene", Integer.valueOf(C2221841Bxe.LIZ(this.LIZIZ.LIZ)));
                            ((AbstractC1136060ffY) c259800zU.element).getExtraParams().put("msg_id", Long.valueOf(((AbstractC1136060ffY) c259800zU.element).getOuterMessageId()));
                            if (LiveMessageModelSizeOptSetting.INSTANCE.notAppendRawProtoOnNoLinkMessage()) {
                                T t10 = c259800zU.element;
                                if ((t10 instanceof LinkStateMessage) || (t10 instanceof LinkLayerMessage)) {
                                    ((IMessage) t10).setProtoMessage(protoMessage);
                                }
                            } else {
                                ((IMessage) c259800zU.element).setProtoMessage(protoMessage);
                            }
                            C01GW c01gw5 = C20340414iQ.LIZ;
                            C20340414iQ.LIZJ(new AwS278S0300000_34(c259800zU, (C259800zU<AbstractC1136060ffY>) protoApiResult, (ProtoApiResult) protoMessage, (ProtoApiResult.ProtoMessage) 3));
                        }
                        z = false;
                    }
                } else {
                    if (TextUtils.isEmpty(protoMessage.method)) {
                        arrayList2.add(ReasonMessage.from("", z, "Method is empty."));
                    } else {
                        arrayList2.add(ReasonMessage.from(protoMessage.method, z, "Payload is empty."));
                    }
                    C01GW c01gw6 = C20340414iQ.LIZ;
                    C20340414iQ.LIZIZ(new AwS435S0200000_34(protoApiResult, protoMessage, 14));
                }
            }
            this.LJIILIIL = protoApiResult.protoMessages.size();
            this.LJIILJJIL = protoApiResult.messages.size();
            if (LiveMessageModelSizeOptSetting.INSTANCE.notKeepRawProtoMessageOnApiResult()) {
                protoApiResult.protoMessages.clear();
            }
            C445401oK.LIZ(arrayList, arrayList2);
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            if (!C086I.LIZIZ(protoApiResult.messages)) {
                for (IMessage iMessage : protoApiResult.messages) {
                    if (protoApiResult.extraParams != null) {
                        iMessage.getExtraParams().putAll(protoApiResult.extraParams);
                    }
                    iMessage.getExtraParams().put(MessageMonitor.getLiveMessageStageName("decode_whole_message_time", MessageMonitor.Stage.START), Long.valueOf(jElapsedRealtime));
                    iMessage.getExtraParams().put(MessageMonitor.getLiveMessageStageName("decode_whole_message_time", MessageMonitor.Stage.END), Long.valueOf(jElapsedRealtime3));
                    iMessage.getExtraParams().put("extra_first_batch", Boolean.valueOf(protoApiResult.isFirst));
                }
                return;
            }
            return;
        }
        C13BV c13bv = C13BV.INSTANCE;
        C445401oK.LIZ(c13bv, c13bv);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final ProtoApiResult decodeProtoApiResult(ProtoApiResult protoApiResult) {
        if (protoApiResult == null) {
            return null;
        }
        LJFF(protoApiResult);
        return protoApiResult;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void disconnectFromWebSocket(String str) {
        InterfaceC2221911Bxl interfaceC2221911Bxl = this.LJIJ;
        if (interfaceC2221911Bxl != null && interfaceC2221911Bxl.isConnected()) {
            this.LJJIIJ++;
        }
        this.LJIJI.LIZ = null;
        InterfaceC2221911Bxl interfaceC2221911Bxl2 = this.LJIJ;
        if (interfaceC2221911Bxl2 != null) {
            interfaceC2221911Bxl2.LIZIZ();
        }
        if (TextUtils.equals(str, "ws_connect_timeout")) {
            this.LJIIZILJ.LIZJ(this.LJ, -2, str, this.LJIJJ, null, this.LJJII, this.LJJIII);
            return;
        }
        if (TextUtils.equals(str, "retry_count_over")) {
            this.LJIIZILJ.LIZIZ(this.LJ, str, this.LJIJJ, this.LJJIII);
        } else if (TextUtils.equals(str, "service_close_cmd")) {
            this.LJIIZILJ.LIZIZ(this.LJ, str, this.LJIJJ, this.LJJIII);
        } else {
            if (!TextUtils.equals(str, "im_enter_room_timeout")) {
                return;
            }
            this.LJIIZILJ.LIZJ(this.LJ, -3, str, this.LJIJJ, null, this.LJJII, this.LJJIII);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void onStopMessage(boolean z) {
        C0X9S<InterfaceC1516690pZT> c0x9s;
        if (z && (c0x9s = this.LJJIJIIJI) != null) {
            c0x9s.cancel();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void sendUplinkPacket(PayloadItem payloadItem) {
        InterfaceC2221911Bxl interfaceC2221911Bxl = this.LJIJ;
        if (interfaceC2221911Bxl != null && interfaceC2221911Bxl.isConnected() && Intrinsics.LJFF("uplink_im_gateway", payloadItem.getPayloadType())) {
            C1527950prd c1527950prd = new C1527950prd(10001);
            c1527950prd.LIZJ = payloadItem.getLogId();
            c1527950prd.LJIIIIZZ = payloadItem.getSeqId();
            c1527950prd.LIZLLL = 20045;
            c1527950prd.LJ = 1;
            c1527950prd.LJFF = payloadItem.getPayload();
            c1527950prd.LJI = payloadItem.getPayloadType();
            c1527950prd.LJII = payloadItem.getPayloadEncoding();
            LiveWsMessage liveWsMessageLIZ = c1527950prd.LIZ();
            InterfaceC2221911Bxl interfaceC2221911Bxl2 = this.LJIJ;
            if (interfaceC2221911Bxl2 != null) {
                interfaceC2221911Bxl2.LIZ(liveWsMessageLIZ);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void setCallback(IMessageWsClient.Callback callback) {
        this.LIZLLL = callback;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void connectToWebSocket(Map<String, String> map, String str) {
        String str2 = this.LJIJJ;
        if (TextUtils.isEmpty(str2)) {
            IMessageWsClient.Callback callback = this.LIZLLL;
            if (callback != null) {
                callback.onWebSocketDisconnected();
                return;
            }
            return;
        }
        this.LJJIJIIJIL = str2;
        String string = UriProtector.parse(str2).buildUpon().appendQueryParameter("live_region", (String) DataChannelGlobal.LLILZ.gg0(C168N.class)).build().toString();
        HashMap map2 = new HashMap(LIZJ());
        map2.putAll(map);
        map2.putAll(C2221791BxZ.LIZIZ());
        map2.put("cursor", str);
        this.LJJIJL = C2221661BxM.LIZIZ();
        C2221871Bxh c2221871Bxh = this.LJIIZILJ;
        if (!c2221871Bxh.LIZIZ) {
            c2221871Bxh.LIZIZ = true;
            c2221871Bxh.LIZ = SystemClock.uptimeMillis();
        }
        C2221821Bxc.LJIIIZ(str, string, false);
        this.LJIJI.LIZ = new C2221861Bxg(string, map2, this);
        C1515210pX5 c1515210pX5LIZLLL = C1515210pX5.LIZLLL();
        Context context = this.LJII;
        C2221901Bxk c2221901Bxk = this.LJIJI;
        c1515210pX5LIZLLL.getClass();
        this.LJIJ = ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).registerWsChannel(context, string, map2, c2221901Bxk);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void decodeHostWebSocketPayload(PayloadItem payloadItem, boolean z) {
        String str;
        String strValueOf;
        ProtoApiResult protoApiResultLJ;
        try {
            C01GW c01gw = C20340414iQ.LIZ;
            C20340414iQ.LIZJ(new AwS578S0100000_34(payloadItem, 157));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.LJJIJL) {
                str = "zstd";
            } else {
                str = "gzip";
            }
            linkedHashMap.put("compress_type_requested", str);
            if (this.LJJIJL) {
                strValueOf = String.valueOf(C2221661BxM.LIZIZ);
            } else {
                strValueOf = "";
            }
            linkedHashMap.put("dict_version_requested", strValueOf);
            try {
                protoApiResultLJ = LJ(new C1506330pIl(C2221791BxZ.LIZ(payloadItem, linkedHashMap)), false, true, 2, payloadItem.getMessageTrackTimeInfo().receiveMessageTime, C2221891Bxj.LIZJ(payloadItem), C2221891Bxj.LIZ(payloadItem), payloadItem.getExtraParams(), payloadItem.getCompressType(), z, C2221891Bxj.LIZIZ(payloadItem), payloadItem.fullLinkTrack);
                protoApiResultLJ.payloadType = payloadItem.getPayloadType();
                protoApiResultLJ.logId = payloadItem.getLogId();
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            IMessageWsClient.Callback callback = this.LIZLLL;
            if (callback != null) {
                callback.onHostWebSocketPayloadDecoded(protoApiResultLJ, z);
            }
        } catch (Exception e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map = C1338270kvh.LIZ;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void decodeWebSocketPayload(PayloadItem payloadItem, boolean z) {
        String str;
        String strValueOf;
        ProtoApiResult protoApiResultLJ;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (this.LJJIJL) {
                str = "zstd";
            } else {
                str = "gzip";
            }
            linkedHashMap.put("compress_type_requested", str);
            if (this.LJJIJL) {
                strValueOf = String.valueOf(C2221661BxM.LIZIZ);
            } else {
                strValueOf = "";
            }
            linkedHashMap.put("dict_version_requested", strValueOf);
            try {
                protoApiResultLJ = LJ(new C1506330pIl(C2221791BxZ.LIZ(payloadItem, linkedHashMap)), false, true, 1, payloadItem.getMessageTrackTimeInfo().receiveMessageTime, C2221891Bxj.LIZJ(payloadItem), C2221891Bxj.LIZ(payloadItem), payloadItem.getExtraParams(), payloadItem.getCompressType(), z, C2221891Bxj.LIZIZ(payloadItem), payloadItem.fullLinkTrack);
                protoApiResultLJ.payloadType = payloadItem.getPayloadType();
                protoApiResultLJ.logId = payloadItem.getLogId();
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            IMessageWsClient.Callback callback = this.LIZLLL;
            if (callback != null) {
                callback.onWebSocketPayloadDecoded(protoApiResultLJ, z);
            }
            C13KQ c13kq = this.LJJIJLIJ;
            byte[] bArr = c13kq.LLILLJJLI;
            if (bArr.length > 262144) {
                c13kq.LL = 0;
                int length = bArr.length;
                int i = c13kq.LLILLL;
                if (length != i) {
                    c13kq.LLILLJJLI = new byte[i];
                }
            }
        } catch (Exception e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            Map<String, Object> map = C1338270kvh.LIZ;
            if (e instanceof C2221671BxN) {
                C2221661BxM.LJFF = true;
                InterfaceC2221911Bxl interfaceC2221911Bxl = this.LJIJ;
                if (interfaceC2221911Bxl != null) {
                    interfaceC2221911Bxl.LIZIZ();
                }
                IMessageWsClient.Callback callback2 = this.LIZLLL;
                if (callback2 != null) {
                    callback2.onWebSocketDisconnected();
                }
                C20441214yg.LJIIIZ("LiveWs", "disconnect websocket due to zstd decompress fail");
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void setData(long j, Context context) {
        LJI(j, C500260Jjc.LJIJ(DataChannelGlobal.LLILZ), context);
    }

    public final void LJI(long j, boolean z, Context context) {
        Context applicationContext;
        this.LJ = j;
        if (context != null) {
            applicationContext = C786410Ut5.N3(context);
        } else {
            applicationContext = GlobalContext.getApplicationContext();
        }
        this.LJII = applicationContext;
        C13KQ c13kq = this.LJJIJLIJ;
        c13kq.LL = 0;
        int length = c13kq.LLILLJJLI.length;
        int i = c13kq.LLILLL;
        if (length != i) {
            c13kq.LLILLJJLI = new byte[i];
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user_id", Long.valueOf(this.LJFF));
        linkedHashMap.put("room_id", Long.valueOf(this.LJ));
        linkedHashMap.put("is_anchor", Boolean.valueOf(z));
        HashMap map = (HashMap) C2221821Bxc.LIZ;
        map.clear();
        map.putAll(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void apiCall(Map<String, String> map, int i, boolean z) {
        String strT2;
        int i2;
        C1493620oyG c1493620oyG;
        C0X9S<InterfaceC1516690pZT> c0x9sFetchMessagePbByteArraySource;
        int i3;
        boolean z2;
        String str;
        map.put("resp_content_type", "protobuf");
        Context context = this.LJII;
        if (context == null) {
            strT2 = "";
        } else {
            strT2 = C786410Ut5.t2(context.getResources().getConfiguration().locale);
        }
        map.put("app_language", strT2);
        map.put("live_id", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId()));
        map.remove("fetch_time");
        map.remove("ack_ids");
        map.put("identity", this.LJIIJ);
        map.put("last_rtt", String.valueOf(this.LJIIL));
        map.put("recv_cnt", String.valueOf(this.LJIILIIL));
        map.put("parse_cnt", String.valueOf(this.LJIILJJIL));
        if (!TextUtils.isEmpty(this.LJIIJJI) && (str = this.LJIIJJI) != null) {
            map.put("internal_ext", str);
        }
        if (this.LJIIIIZZ == null) {
            C480460Ism.LIZ().getClass();
            this.LJIIIIZZ = (MessageApi) C480460Ism.LIZLLL(MessageApi.class);
        }
        HashMap map2 = new HashMap();
        long j = this.LJ;
        map2.put(MessageMonitor.getLiveMessageStageName("api_call_time", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        map.put("live_region", dataChannelGlobal.gg0(C168N.class));
        map.put("room_tag", dataChannelGlobal.gg0(C168O.class));
        if (LiveMessageForceHttpSetting.INSTANCE.getValue()) {
            i2 = MessageApiConstant.FetchRule.FETCH_DATA_ONLY;
        } else {
            i2 = i;
        }
        int secret = UserService.getInstance().user().getCurrentUser().getSecret();
        C2221761BxW c2221761BxW = this.LIZIZ;
        MessageApi messageApi = this.LJIIIIZZ;
        long j2 = this.LJ;
        LiveMessageTimeoutSetting liveMessageTimeoutSetting = LiveMessageTimeoutSetting.INSTANCE;
        if (liveMessageTimeoutSetting.getHttpFetchRequestTimeout() <= 0) {
            c1493620oyG = null;
        } else {
            c1493620oyG = new C1493620oyG();
            c1493620oyG.LJIIIIZZ = liveMessageTimeoutSetting.getHttpFetchRequestTimeout();
        }
        boolean z3 = this.LIZJ;
        if (messageApi == null) {
            c2221761BxW.getClass();
            C480460Ism.LIZ().getClass();
            messageApi = (MessageApi) C480460Ism.LIZLLL(MessageApi.class);
        }
        String str2 = "1";
        if (c2221761BxW.LIZ == EnumC19379710rr.PREVIEW) {
            if (!z3) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0x9sFetchMessagePbByteArraySource = messageApi.fetchPreviewMessagePbByteArraySource(j2, map, i2, secret, c1493620oyG, CardStruct.IStatusCode.DEFAULT, str2);
        } else {
            if (!z3) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0x9sFetchMessagePbByteArraySource = messageApi.fetchMessagePbByteArraySource(j2, map, i2, secret, c1493620oyG, CardStruct.IStatusCode.DEFAULT, str2);
        }
        this.LJJIJIIJI = c0x9sFetchMessagePbByteArraySource;
        try {
            this.LJIIIZ = System.currentTimeMillis();
            String str3 = (String) map.get("cursor");
            if (str3 == null) {
                str3 = "";
            }
            if (C13LQ.LJIILLIIL("ttlive_message_api_call_request", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
                HashMap map3 = new HashMap(C2221821Bxc.LIZ);
                map3.put("cursor", str3);
                C2221821Bxc.LJIIL(0, "ttlive_message_api_call_request", map3);
            }
            C0X52<InterfaceC1516690pZT> c0x52Execute = c0x9sFetchMessagePbByteArraySource.execute();
            try {
                this.LJJIJIL = ((JSONObject) JSONObjectProtectorUtils.getJSONArray(JSONObjectProtectorUtils.getJSONObject(new JSONObject(((C1494600ozq) c0x52Execute.LIZ.LJFF).LJJIIJ), "base"), "redirect_info").get(0)).optString("url");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://");
                    sbLIZ.append(((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).getHostDomain());
                    C1276320jJm c1276320jJmTtUrlDispatch = TTNetInit.ttUrlDispatch(C2188811AlT.LIZIZ(sbLIZ));
                    if (!TextUtils.isEmpty(c1276320jJmTtUrlDispatch.LIZIZ)) {
                        this.LJJIJIL = c1276320jJmTtUrlDispatch.LIZIZ;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            map2.put(MessageMonitor.getLiveMessageStageName("api_call_time", MessageMonitor.Stage.END), Long.valueOf(SystemClock.elapsedRealtime()));
            map2.put(MessageMonitor.getLiveMessageStageName("all_time", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
            if (c0x52Execute.LIZJ()) {
                try {
                    C259800zU c259800zU = new C259800zU();
                    C01GW c01gw = C20340414iQ.LIZ;
                    C20340414iQ.LIZJ(new AwS578S0100000_34(c259800zU, (C259800zU<FullLinkTrack>) 158));
                    if (this.LIZLLL != null) {
                        try {
                            InterfaceC1516690pZT interfaceC1516690pZT = c0x52Execute.LIZIZ;
                            if (i == MessageApiConstant.FetchRule.FETCH_DATA_AND_DETERMINE_TYPE) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            try {
                                try {
                                    ProtoApiResult protoApiResultLJ = LJ(interfaceC1516690pZT, z2, false, 0, C158B.LIZ(), j, 0L, map2, null, z, null, (FullLinkTrack) c259800zU.element);
                                    try {
                                        IMessageWsClient.Callback callback = this.LIZLLL;
                                        if (callback != null) {
                                            try {
                                                callback.onApiSuccess(protoApiResultLJ, i, z);
                                            } catch (Exception e3) {
                                                e = e3;
                                            }
                                        }
                                        C2221821Bxc.LJ(protoApiResultLJ, i);
                                        try {
                                            this.LJIJJLI++;
                                            return;
                                        } catch (Exception e4) {
                                            e = e4;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                }
                            } catch (Exception e7) {
                                e = e7;
                            }
                        } catch (Exception e8) {
                            e = e8;
                        }
                    } else {
                        this.LJIJJLI++;
                        return;
                    }
                } catch (Exception e9) {
                    e = e9;
                }
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("LiveMessageWebsocketClient", "Failed to parse message queue", e);
                this.LJIIL = -1L;
                this.LJIILIIL = 0L;
                this.LJIILJJIL = 0L;
                IMessageWsClient.Callback callback2 = this.LIZLLL;
                if (callback2 != null) {
                    callback2.onApiError(e, i);
                }
                this.LJIL++;
                C2221821Bxc.LIZLLL(e, i);
                C2221811Bxb c2221811Bxb = this.LIZIZ.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Parse error, message:");
                sbLIZ2.append(e.getMessage());
                c2221811Bxb.LJII(-10001, "ParseError", C2188811AlT.LIZIZ(sbLIZ2), "");
                String string = Arrays.toString(e.getStackTrace());
                C1143300frE.LJIIJJI().getClass();
                AbstractC1143290frD.LIZ("ttlive_fetch_message_polling_failed", string);
                return;
            }
            this.LJIIL = -1L;
            this.LJIILIIL = 0L;
            this.LJIILJJIL = 0L;
            IMessageWsClient.Callback callback3 = this.LIZLLL;
            if (callback3 != null) {
                callback3.onApiError(new Exception(String.valueOf(c0x52Execute.LIZ.LIZIZ)), i);
            }
            this.LJIL++;
            if (C13LQ.LJIILLIIL("ttlive_message_api_call_failed", LiveMessageTrackerSwitchSetting.INSTANCE.getValue())) {
                HashMap map4 = new HashMap(C2221821Bxc.LIZ);
                map4.put("fetch_rule", Integer.valueOf(i));
                map4.put("status_code", Integer.valueOf(c0x52Execute.LIZ.LIZIZ));
                map4.put("error_code", 0);
                map4.put("error_type", "Api call failed");
                C2221821Bxc.LJIIL(1, "ttlive_message_api_call_failed", map4);
            }
            this.LIZIZ.LIZIZ.LJII(c0x52Execute.LIZ.LIZIZ, "ApiError", "Api error, error_code:" + c0x52Execute.LIZ.LIZIZ, null);
            String str4 = "Api error, error code is " + c0x52Execute.LIZ.LIZIZ + '.';
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LIZ("ttlive_fetch_message_polling_failed", str4);
        } catch (Exception e10) {
            TryCatchGuardChecker.doCheck(e10);
            this.LJIIL = -1L;
            this.LJIILIIL = 0L;
            this.LJIILJJIL = 0L;
            C20441214yg.LIZLLL(e10.toString());
            IMessageWsClient.Callback callback4 = this.LIZLLL;
            if (callback4 != null) {
                callback4.onApiError(e10, i);
            }
            if (e10 instanceof C1811850xFX) {
                i3 = ((C1811850xFX) e10).statusCode;
            } else {
                i3 = -10000;
            }
            this.LJIL++;
            C2221821Bxc.LIZLLL(e10, i);
            this.LIZIZ.LIZIZ.LJII(i3, e10.getClass().getName(), e10.getMessage(), Log.getStackTraceString(e10));
            String string2 = Arrays.toString(e10.getStackTrace());
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LIZ("ttlive_fetch_message_polling_failed", string2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1Bxi] */
    public C2221851Bxf(boolean z, long j, C2221761BxW c2221761BxW, boolean z2) {
        String str;
        this.LIZIZ = c2221761BxW;
        this.LIZJ = z2;
        C13KQ c13kq = new C13KQ();
        c13kq.LLILZ = true;
        this.LJJIJLIJ = c13kq;
        this.LJJIL = C292401Bi.LIZ(AFwS225S0000000_34.get$arr$(259));
        this.LJJIZ = new InterfaceC1528010prj() { // from class: X.1Bxi
            @Override // X.InterfaceC1528010prj
            public final void LIZIZ(EnumC1527990prh enumC1527990prh, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC1528010prj
            public final void LIZ(LiveWsMessage liveWsMessage) {
                try {
                    C2221851Bxf c2221851Bxf = this.LIZ;
                    if (c2221851Bxf.LIZLLL != null) {
                        PayloadItem payloadItemLIZLLL = C2221851Bxf.LIZLLL(liveWsMessage);
                        if (payloadItemLIZLLL.getExtraParams() != null) {
                            payloadItemLIZLLL.getMessageTrackTimeInfo().receiveMessageTime = C158B.LIZ();
                            payloadItemLIZLLL.getExtraParams().put(MessageMonitor.getLiveMessageStageName("all_time", MessageMonitor.Stage.START), Long.valueOf(SystemClock.elapsedRealtime()));
                        }
                        IMessageWsClient.Callback callback = c2221851Bxf.LIZLLL;
                        if (callback != null) {
                            callback.onHostWebSocketMessage(payloadItemLIZLLL);
                        }
                        C2221821Bxc.LJIIJJI(liveWsMessage);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF("LiveWs", "receive message error", e);
                    C2221821Bxc.LJIIJ(liveWsMessage, e);
                }
            }
        };
        if (z) {
            str = "anchor";
        } else {
            str = "audience";
        }
        this.LJIIJ = str;
        this.LJFF = j;
        this.LJI = z;
        this.LJIIZILJ = new C2221871Bxh(z, c2221761BxW.LIZIZ);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void sendHeartBeatMsg(long j, long j2, long j3, boolean z) {
        long j4;
        HeartBeat heartBeat = new HeartBeat();
        if (z) {
            j4 = this.LJ;
        } else {
            j4 = 0;
        }
        heartBeat.roomId = j4;
        heartBeat.sendPacketSeqId = j;
        byte[] bArrLIZ = C1515990pYL.LIZ(heartBeat, new HeartBeat_ProtoEncoder());
        if (bArrLIZ == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1101180elI perfMetricScoreResult = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).getPerfMetricScoreResult();
        if (perfMetricScoreResult != null) {
            linkedHashMap.put("exp_score", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(perfMetricScoreResult.LIZIZ)}, 1)));
        }
        linkedHashMap.put("nqe_score", String.valueOf(TTNetInit.getEffectiveConnectionType()));
        sendWebSocketMessage("pb", "hb", bArrLIZ, j2, j3, linkedHashMap);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void sendImEnterRoomMsg(String str, long j, long j2, long j3) {
        byte[] bArrLIZ;
        String str2;
        String str3 = str;
        C2221761BxW c2221761BxW = this.LIZIZ;
        long j4 = this.LJ;
        String str4 = this.LJIIJ;
        ImEnterRoom_ProtoEncoder imEnterRoom_ProtoEncoder = new ImEnterRoom_ProtoEncoder();
        _PreviewRoom_ProtoEncoder _previewroom_protoencoder = new _PreviewRoom_ProtoEncoder();
        boolean z = this.LIZJ;
        EnumC19379710rr enumC19379710rr = c2221761BxW.LIZ;
        EnumC19379710rr enumC19379710rr2 = EnumC19379710rr.PREVIEW;
        if (enumC19379710rr == enumC19379710rr2) {
            PreviewRoom previewRoom = new PreviewRoom();
            previewRoom.roomId = j4;
            previewRoom.liveId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
            previewRoom.identity = str4;
            if (str3 == null) {
                str3 = "";
            }
            previewRoom.cursor = str3;
            previewRoom.accountType = UserService.getInstance().user().getCurrentUser().getSecret();
            previewRoom.enterUniqId = j3;
            bArrLIZ = C1515990pYL.LIZ(previewRoom, _previewroom_protoencoder);
        } else {
            ImEnterRoom imEnterRoom = new ImEnterRoom();
            imEnterRoom.roomId = j4;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            imEnterRoom.roomTag = (String) dataChannelGlobal.gg0(C168O.class);
            imEnterRoom.liveRegion = (String) dataChannelGlobal.gg0(C168N.class);
            imEnterRoom.liveId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).liveId();
            imEnterRoom.identity = str4;
            imEnterRoom.cursor = str3;
            imEnterRoom.accountType = UserService.getInstance().user().getCurrentUser().getSecret();
            imEnterRoom.enterUniqueId = j3;
            imEnterRoom.filterWelcomeMsg = CardStruct.IStatusCode.DEFAULT;
            imEnterRoom.isAnchorContinueKeepMsg = z;
            bArrLIZ = C1515990pYL.LIZ(imEnterRoom, imEnterRoom_ProtoEncoder);
        }
        if (bArrLIZ == null) {
            return;
        }
        if (this.LIZIZ.LIZ == enumC19379710rr2) {
            str2 = "im_preview_room";
        } else {
            str2 = "im_enter_room";
        }
        sendWebSocketMessage("pb", str2, bArrLIZ, j, j2, null);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void sendWebSocketMessage(String str, String str2, byte[] bArr, long j, long j2, Map<String, String> map) {
        InterfaceC2221911Bxl interfaceC2221911Bxl = this.LJIJ;
        if (interfaceC2221911Bxl != null && interfaceC2221911Bxl.isConnected()) {
            C1527950prd c1527950prd = new C1527950prd(10001);
            c1527950prd.LIZJ = j;
            c1527950prd.LJIIIIZZ = j2;
            c1527950prd.LIZLLL = 1;
            c1527950prd.LJ = 1;
            c1527950prd.LJFF = bArr;
            c1527950prd.LJI = str2;
            c1527950prd.LJII = str;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    ((HashMap) c1527950prd.LIZIZ).put(entry.getKey(), entry.getValue());
                }
            }
            LiveWsMessage liveWsMessageLIZ = c1527950prd.LIZ();
            InterfaceC2221911Bxl interfaceC2221911Bxl2 = this.LJIJ;
            if (interfaceC2221911Bxl2 != null) {
                interfaceC2221911Bxl2.LIZ(liveWsMessageLIZ);
            }
            C01GW c01gw = C20340414iQ.LIZ;
            C20340414iQ.LIZIZ(new AwS183S1100000_34(str2, liveWsMessageLIZ, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    public final ProtoApiResult LJ(InterfaceC1516690pZT interfaceC1516690pZT, boolean z, boolean z2, int i, long j, long j2, long j3, Map<String, ? extends Object> map, String str, boolean z3, String str2, FullLinkTrack fullLinkTrack) {
        boolean z4;
        ArrayList arrayList;
        ?? arrayList2;
        int i2;
        C1515210pX5.LIZLLL().getClass();
        C0IMD c0imdLJI = C1515210pX5.LJI(ProtoMessageFetchResult.class);
        if (c0imdLJI != null) {
            C1516680pZS c1516680pZS = new C1516680pZS();
            c1516680pZS.LJIIL(interfaceC1516690pZT);
            ProtoMessageFetchResult protoMessageFetchResult = (ProtoMessageFetchResult) c0imdLJI.LIZJ(c1516680pZS);
            if (z) {
                this.LJIJJ = protoMessageFetchResult.pushServer;
            }
            ProtoApiResult protoApiResult = new ProtoApiResult();
            if (z2) {
                protoApiResult.cursor = str2;
            } else {
                protoApiResult.cursor = protoMessageFetchResult.cursor;
            }
            protoApiResult.fetchInterval = protoMessageFetchResult.fetchInterval;
            protoApiResult.now = protoMessageFetchResult.now;
            protoApiResult.messages = new LinkedList();
            protoApiResult.fetchType = protoMessageFetchResult.fetchType;
            protoApiResult.routeParams = protoMessageFetchResult.routeParams;
            protoApiResult.heartbeatDuration = protoMessageFetchResult.heartbeatDuration;
            protoApiResult.needAck = protoMessageFetchResult.needAck;
            String str3 = protoMessageFetchResult.internalExt;
            protoApiResult.internalExt = str3;
            protoApiResult.pushServer = protoMessageFetchResult.pushServer;
            this.LJIIJJI = str3;
            protoApiResult.dimension = j2;
            protoApiResult.roomIdInHeader = j2;
            protoApiResult.enterUniqueId = j3;
            protoApiResult.isFirst = protoMessageFetchResult.isFirst;
            protoApiResult.messageFrom = i;
            protoApiResult.receiveMessageTime = j;
            protoApiResult.extraParams = map;
            protoApiResult.compressType = str;
            protoApiResult.historyNoMore = protoMessageFetchResult.historyNoMore;
            String str4 = protoMessageFetchResult.historyCommentCursor;
            protoApiResult.historyCommentCursor = str4;
            protoApiResult.fullLinkTrack = fullLinkTrack;
            int i3 = 0;
            if (str4.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                HistoryInfo historyInfo = new HistoryInfo();
                historyInfo.setHasMore(!protoMessageFetchResult.historyNoMore);
                historyInfo.setCommentCursor(protoMessageFetchResult.historyCommentCursor);
                List<ProtoMessageFetchResult.BaseProtoMessage> list = protoMessageFetchResult.messages;
                if (list != null && !list.isEmpty()) {
                    Iterator<ProtoMessageFetchResult.BaseProtoMessage> it2 = list.iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if (it2.next().isHistory && (i2 = i2 + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                } else {
                    i2 = 0;
                }
                historyInfo.setCount(i2);
                DataChannelGlobal.LLILZ.HQ2(HistoryInfoChannel.class, new C1109230eyH(this.LJ, historyInfo));
            }
            if (!z2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j4 = jCurrentTimeMillis - this.LJIIIZ;
                this.LJIIL = j4;
                long j5 = (protoMessageFetchResult.now + (j4 / ((long) 2))) - jCurrentTimeMillis;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setServerTimeGap = ");
                sbLIZ.append(j5);
                C20441214yg.LIZIZ("LiveMessageWebsocketClient", C2188811AlT.LIZIZ(sbLIZ));
                this.LJJ++;
                long j6 = this.LJJI;
                long j7 = this.LJIIL;
                this.LJJI = j6 + j7;
                C2221811Bxb c2221811Bxb = this.LIZIZ.LIZIZ;
                long j8 = this.LJIIIZ;
                long j9 = protoMessageFetchResult.now;
                c2221811Bxb.getClass();
                long httpFetchMonitorTimeout = LiveMessageTimeoutSetting.INSTANCE.getHttpFetchMonitorTimeout();
                if (httpFetchMonitorTimeout > 0 && j7 >= httpFetchMonitorTimeout) {
                    HashMap map2 = new HashMap();
                    map2.put("api_call_start_time", Long.valueOf(j8));
                    map2.put("api_call_time_stamp", Long.valueOf(j9));
                    map2.put("api_delay", Long.valueOf(j7));
                    c2221811Bxb.LIZ(map2);
                    C20441214yg.LJIIIZ("LiveMessageMonitor", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, map2));
                    C1CC2.LJII(0, "ttlive_fetch_message_time_out", map2);
                }
            }
            if (C0IKQ.LIZ(protoMessageFetchResult.messages)) {
                C13BV c13bv = C13BV.INSTANCE;
                C445401oK.LIZ(c13bv, c13bv);
                return protoApiResult;
            }
            List<ProtoMessageFetchResult.BaseProtoMessage> list2 = protoMessageFetchResult.messages;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (ProtoMessageFetchResult.BaseProtoMessage baseProtoMessage : list2) {
                    ProtoApiResult.ProtoMessage protoMessage = new ProtoApiResult.ProtoMessage();
                    protoMessage.method = baseProtoMessage.method;
                    protoMessage.payload = baseProtoMessage.payload;
                    protoMessage.msgId = baseProtoMessage.msgId;
                    protoMessage.msgType = baseProtoMessage.msgType;
                    protoMessage.isHistoryMsg = baseProtoMessage.isHistory;
                    protoMessage.sampleFlag = baseProtoMessage.sampleFlag;
                    arrayList.add(protoMessage);
                }
            } else {
                arrayList = null;
            }
            protoApiResult.protoMessages = arrayList;
            this.LIZIZ.LIZIZ.LIZIZ.LJIIJJI(arrayList);
            if (z3) {
                LJFF(protoApiResult);
                this.LIZIZ.LIZIZ.LIZIZ.LJIIIZ(protoApiResult.messages);
            }
            if (LivePublicScreenFirstMessagesReleaseSetting.INSTANCE.enable() && protoMessageFetchResult.isFirst) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                long j10 = this.LJ;
                List<IMessage> list3 = protoApiResult.messages;
                if (list3 != null) {
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    Iterator<IMessage> it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(Integer.valueOf(it3.next().getIntType()));
                    }
                } else {
                    arrayList2 = C13BV.INSTANCE;
                }
                List<ProtoMessageFetchResult.BaseProtoMessage> list4 = protoMessageFetchResult.messages;
                if (list4 != null && !list4.isEmpty()) {
                    Iterator<ProtoMessageFetchResult.BaseProtoMessage> it4 = list4.iterator();
                    while (it4.hasNext()) {
                        if (it4.next().isHistory && (i3 = i3 + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                dataChannelGlobal.JQ2(C1148350fzN.class, new C1112530f3b(j10, arrayList2, i3));
            }
            return protoApiResult;
        }
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("ttlive_fetch_message_polling_failed", "No ProtoDecoder found for ProtoMessageFetchResult.");
        throw new AssertionError("No ProtoDecoder found for ProtoMessageFetchResult??!");
    }
}
