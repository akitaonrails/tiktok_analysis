package X;

import Y.AObjectS388S0100000_13;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.bytedance.android.sdk.ticketguard.GetTicketSnapshot;
import com.bytedance.android.sdk.ticketguard.HandleConsumerResponseParam;
import com.bytedance.android.sdk.ticketguard.ProviderRequestParam;
import com.bytedance.android.sdk.ticketguard.ServerData;
import com.bytedance.android.sdk.ticketguard.TicketData;
import com.bytedance.android.sdk.ticketguard.TicketDataBean;
import com.bytedance.android.sdk.ticketguard.TicketGuardApiKt;
import com.bytedance.android.sdk.ticketguard.TicketGuardInitParam;
import com.bytedance.android.sdk.ticketguard.TicketGuardService;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XNK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0XNK implements TicketGuardService {
    public TicketGuardInitParam LIZJ;
    public C0XNI LJFF;
    public final String LIZ = "TicketGuardManager";
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C08RM());
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final Map<String, C08RD> LJI = C2097908Jt.LIZJ(new Pair("ree", new C08RD()));

    public abstract String LIZ();

    public abstract void LIZJ(String str, C08RG c08rg);

    public abstract void LJ();

    public final TicketGuardInitParam LIZIZ() {
        TicketGuardInitParam ticketGuardInitParam = this.LIZJ;
        if (ticketGuardInitParam != null) {
            return ticketGuardInitParam;
        }
        return null;
    }

    public final void LIZLLL(String str) {
        if (this.LIZJ != null) {
            LIZIZ().getLogger().log(this.LIZ, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020c  */
    @Override // com.bytedance.android.sdk.ticketguard.TicketGuardService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0XNM getConsumerRequestContent(X.C847600XMw r28) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XNK.getConsumerRequestContent(X.0XMw):X.0XNM");
    }

    @Override // com.bytedance.android.sdk.ticketguard.TicketGuardService
    public final Boolean getInitResult(String str) {
        C08RD c08rd = this.LJI.get(str);
        if (c08rd != null) {
            return c08rd.LIZ;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0XNR] */
    @Override // com.bytedance.android.sdk.ticketguard.TicketGuardService
    public final C0XNR getProviderContent(final ProviderRequestParam providerRequestParam) throws JSONException {
        final ArrayList arrayList = null;
        LJFF("ticket_network", null);
        String base64ReePub = getBase64ReePub();
        LIZLLL("getProviderHeaders");
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList2 = new ArrayList();
        LJ();
        if (base64ReePub != null) {
            LIZLLL("adding ticket-guard public key to header");
            arrayList2.add(new android.util.Pair("tt-ticket-guard-public-key", base64ReePub));
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.add(new android.util.Pair("tt-ticket-guard-version", "3"));
            arrayList2.add(new android.util.Pair("tt-ticket-guard-iteration-version", CardStruct.IStatusCode.DEFAULT));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getProviderHeaders: success, headers=");
            sbLIZ.append(arrayList2);
            LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            C0XNL.LIZJ(System.currentTimeMillis() - jCurrentTimeMillis, providerRequestParam.path, true);
            arrayList = arrayList2;
        } else {
            LIZLLL("getProviderHeaders: fail");
            C0XNL.LIZJ(0L, providerRequestParam.path, false);
        }
        return new C0XNO<ProviderRequestParam>(arrayList, providerRequestParam) { // from class: X.0XNR
        };
    }

    @Override // com.bytedance.android.sdk.ticketguard.TicketGuardService
    public final void handleConsumerResponse(HandleConsumerResponseParam handleConsumerResponseParam) throws JSONException {
        String str;
        String str2;
        String str3;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        String strLIZ;
        C0XNM c0xnm;
        C c;
        P p;
        C0XNM c0xnm2;
        List<android.util.Pair<String, String>> list = handleConsumerResponseParam.responseHeaders;
        if (list == null) {
            return;
        }
        String str4 = "";
        String str5 = "";
        String str6 = "";
        for (android.util.Pair<String, String> pair : list) {
            String str7 = (String) pair.first;
            Locale locale = Locale.ROOT;
            String lowerCase = str7.toLowerCase(locale);
            if (Intrinsics.LJFF(lowerCase, "x-tt-logid".toLowerCase(locale))) {
                str5 = (String) pair.second;
            } else if (Intrinsics.LJFF(lowerCase, "tt-ticket-guard-result".toLowerCase(locale))) {
                str6 = (String) pair.second;
            }
        }
        C0XNW c0xnw = new C0XNW(handleConsumerResponseParam, str5, str6);
        P p3 = c0xnw.LIZ;
        if (p3 != 0 && (c0xnm2 = (C0XNM) p3.requestContent) != null) {
            str = c0xnm2.LIZLLL;
        } else {
            str = null;
        }
        String str8 = c0xnw.LIZJ;
        if ((str != null && str.length() != 0) || (str8.length() > 0 && !Intrinsics.LJFF(str8, CardStruct.IStatusCode.DEFAULT))) {
            JSONObject jSONObject = new JSONObject();
            P p4 = c0xnw.LIZ;
            if (p4 == 0 || (c = p4.requestContent) == 0 || (p = c.LIZ) == 0 || (str2 = p.path) == null) {
                str2 = "";
            }
            jSONObject.put("path", str2);
            jSONObject.put("logid", c0xnw.LIZIZ);
            jSONObject.put("local_error", str);
            jSONObject.put("remote_error", str8);
            P p5 = c0xnw.LIZ;
            if (p5 == 0 || (c0xnm = (C0XNM) p5.requestContent) == null || (str3 = c0xnm.LJ) == null) {
                str3 = "";
            }
            jSONObject.put("sign_type", str3);
            C0XNK c0xnk = C0XNC.LIZ;
            if (c0xnk != null && (strLIZ = c0xnk.LIZ()) != null) {
                str4 = strLIZ;
            }
            jSONObject.put("ree_private_key_create_log", str4);
            C0XNL.LJI("tt_ticket_guard_use_ticket_fail", jSONObject);
            if (C13LQ.LJLIIL(new String[]{"1101", "1103", "1003"}).contains(c0xnw.LIZJ)) {
                String str9 = ((C847600XMw) c0xnw.LIZ.requestContent.LIZ).LIZ;
                if (str9.length() != 0) {
                    C01GW c01gw = C0XNL.LIZIZ;
                    SharedPreferences sharedPreferences = (SharedPreferences) c01gw.getValue();
                    if (sharedPreferences != null && sharedPreferences.getBoolean(str9, false)) {
                        return;
                    }
                    SharedPreferences sharedPreferences2 = (SharedPreferences) c01gw.getValue();
                    if (sharedPreferences2 != null && (editorEdit = sharedPreferences2.edit()) != null && (editorPutBoolean = editorEdit.putBoolean(str9, true)) != null) {
                        editorPutBoolean.apply();
                    }
                    C0XNL.LIZ("sign_verify_fail_info_update", ((C847600XMw) c0xnw.LIZ.requestContent.LIZ).LIZIZ, 0, null, null, new AObjectS388S0100000_13(c0xnw, 6));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [C extends X.0XNO<?>, X.0XNO] */
    /* JADX WARN: Type inference failed for: r0v1, types: [P extends X.0XNA, X.0XNA] */
    /* JADX WARN: Type inference failed for: r0v14, types: [C extends X.0XNO<?>, X.0XNO] */
    /* JADX WARN: Type inference failed for: r0v4, types: [P extends X.0XNN<?>, X.0XNN] */
    /* JADX WARN: Type inference failed for: r0v5, types: [P extends X.0XNN<?>, X.0XNN] */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r10v16, types: [X.0XNK] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.0XNK] */
    /* JADX WARN: Type inference failed for: r4v4, types: [P extends X.0XNN<?>, X.0XNN] */
    /* JADX WARN: Type inference failed for: r4v7, types: [C extends X.0XNO<?>, X.0XNO] */
    /* JADX WARN: Type inference failed for: r4v8, types: [P extends X.0XNA, X.0XNA] */
    @Override // com.bytedance.android.sdk.ticketguard.TicketGuardService
    public final List<TicketData> handleProviderResponse(C0XNT c0xnt) throws JSONException {
        Long lValueOf;
        Long lValueOf2;
        long jLongValue;
        ?? r4;
        ?? r42;
        String str;
        ?? r0;
        boolean z;
        ServerData serverData;
        ArrayList<ServerData.ServerDataItem> arrayList;
        boolean z2;
        String str2 = c0xnt.requestContent.LIZ.path;
        ArrayList arrayList2 = new ArrayList();
        Iterator<android.util.Pair<String, String>> it2 = c0xnt.responseHeaders.iterator();
        String str3 = "";
        String str4 = "";
        String str5 = "";
        while (true) {
            lValueOf = null;
            if (!it2.hasNext()) {
                break;
            }
            ?? r10 = (android.util.Pair) it2.next();
            CharSequence charSequence = (CharSequence) ((android.util.Pair) r10).second;
            if (charSequence != null && charSequence.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                String str6 = (String) ((android.util.Pair) r10).first;
                Locale locale = Locale.ROOT;
                String lowerCase = str6.toLowerCase(locale);
                if (Intrinsics.LJFF(lowerCase, "x-tt-logid".toLowerCase(locale))) {
                    str5 = (String) ((android.util.Pair) r10).second;
                } else if (Intrinsics.LJFF(lowerCase, "tt-ticket-guard-server-data".toLowerCase(locale))) {
                    String str7 = (String) ((android.util.Pair) r10).second;
                    Charset charset = Charsets.UTF_8;
                    str4 = new String(Base64.decode(str7.getBytes(charset), 0), charset);
                    try {
                        r10 = this;
                        serverData = (ServerData) ((Gson) r10.LIZIZ.getValue()).LJII(str4, ServerData.class);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("parse server data failed, e=");
                        sbLIZ.append(Log.getStackTraceString(th));
                        r10.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                        serverData = null;
                    }
                    if (serverData != null && (arrayList = serverData.itemArray) != null) {
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            ServerData.ServerDataItem serverDataItem = (ServerData.ServerDataItem) ListProtector.get(arrayList, i);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str2);
                            sbLIZ2.append('_');
                            sbLIZ2.append(c0xnt.LIZ);
                            sbLIZ2.append('_');
                            sbLIZ2.append(i);
                            String strEncodeToString = Base64.encodeToString(C2188811AlT.LIZIZ(sbLIZ2).getBytes(Charsets.UTF_8), 2);
                            String str8 = serverDataItem.tsSign;
                            if (str8 != null && str8.length() != 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                C0XNL.LIZ("zti_handle_token_get_ticket_response_tssign_empty", "all", 0, null, null, null);
                            }
                            arrayList2.add(new TicketDataBean(strEncodeToString, serverDataItem.ticket, null, serverDataItem.tsSign).toTicketData());
                            String str9 = serverDataItem.ticket;
                            String str10 = serverDataItem.tsSign;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ticket", C0XNP.LIZ(str9));
                            jSONObject.put("ts_sign", C0XNP.LIZ(str10));
                            C0XNL.LIZ("ticket_update", "all", 0, null, C786410Ut5.J3(jSONObject), null);
                        }
                    }
                }
            }
        }
        final C0XNU c0xnu = new C0XNU(c0xnt, str5, str4, arrayList2);
        ?? r02 = c0xnu.LIZ;
        if (r02 != 0) {
            lValueOf2 = Long.valueOf(r02.timing);
        } else {
            lValueOf2 = null;
        }
        ?? r03 = c0xnu.LIZ;
        if (r03 != 0 && (r0 = r03.requestContent) != 0) {
            lValueOf = Long.valueOf(r0.LIZJ);
        }
        if (lValueOf2 != null && lValueOf != null) {
            jLongValue = lValueOf2.longValue() - lValueOf.longValue();
        } else {
            jLongValue = 0;
        }
        ?? r43 = c0xnu.LIZ;
        if (r43 != 0 && (r4 = r43.requestContent) != 0 && (r42 = r4.LIZ) != 0 && (str = r42.path) != null) {
            str3 = str;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("duration", jLongValue);
        jSONObject2.put("path", str3);
        jSONObject2.put("server_data", c0xnu.LIZJ);
        jSONObject2.put("logid", c0xnu.LIZIZ);
        C0XNL.LJI("tt_ticket_guard_get_ticket", jSONObject2);
        C0XNL.LIZ("get_ticket_response", "all", 0, null, null, new Function0<String>() { // from class: X.0XNS
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return GsonProtectorUtils.toJson(TicketGuardApiKt.getGson(), new GetTicketSnapshot(c0xnu));
            }
        });
        return arrayList2;
    }

    @Override // com.bytedance.android.sdk.ticketguard.TicketGuardService
    public final void setNTPTimeProvider(C0XNI c0xni) {
        this.LJFF = c0xni;
    }

    public final void LJFF(String str, C08RH c08rh) throws JSONException {
        boolean zLJI = MethodIDManager.LJI(202509);
        LIZLLL("tryLoadDataEnd - start!");
        boolean zCompareAndSet = this.LIZLLL.compareAndSet(false, true);
        if (zCompareAndSet) {
            long appStartTimeMs = LIZIZ().getAppStartTimeMs();
            if (appStartTimeMs != Long.MAX_VALUE) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", (int) (System.currentTimeMillis() - appStartTimeMs));
                C0XNL.LJI("tt_zti_init_start", jSONObject);
            }
        }
        LIZJ(str, new C08RG(this, c08rh));
        if (zCompareAndSet) {
            long appStartTimeMs2 = LIZIZ().getAppStartTimeMs();
            if (appStartTimeMs2 != Long.MAX_VALUE) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", (int) (System.currentTimeMillis() - appStartTimeMs2));
                C0XNL.LJI("tt_zti_init_end", jSONObject2);
            }
        }
        LIZLLL("tryLoadDataEnd - end!");
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.08RF] */
    @Override // com.bytedance.android.sdk.ticketguard.TicketGuardService
    public final void tryInit(TicketGuardInitParam ticketGuardInitParam, final Function1<? super Boolean, Unit> function1) {
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final C08RJ c08rj = new C08RJ();
        final ?? r2 = new C08RH() { // from class: X.08RF
            @Override // X.C08RH
            public final void LIZ(Boolean bool) {
                if (atomicInteger.addAndGet(1) == this.LJI.size()) {
                    Iterator<C08RD> it2 = this.LJI.values().iterator();
                    while (it2.hasNext()) {
                        Boolean bool2 = it2.next().LIZ;
                        Boolean bool3 = Boolean.FALSE;
                        if (Intrinsics.LJFF(bool2, bool3)) {
                            Function1<Boolean, Unit> function12 = function1;
                            if (function12 != null) {
                                function12.invoke(bool3);
                                return;
                            }
                            return;
                        }
                    }
                    Function1<Boolean, Unit> function13 = function1;
                    if (function13 != null) {
                        function13.invoke(Boolean.TRUE);
                    }
                }
            }
        };
        this.LIZJ = ticketGuardInitParam;
        new BPEAThread(new Runnable() { // from class: X.08RI
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TicketGuardManager@70a0.commonInit$1");
                try {
                    if (this.LL.LJ.compareAndSet(false, true)) {
                        this.LL.getClass();
                    }
                    c08rj.invoke();
                    this.LL.LJFF("init", r2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TicketGuardManager@70a0.commonInit$1");
            }
        }).start();
    }
}
