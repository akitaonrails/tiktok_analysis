package X;

import android.content.Context;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.im.core.opt.IMSdkOptions;
import com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker;
import com.bytedance.im.core.proto.Request;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.content.utils.SlimContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YSn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874550YSn implements InterfaceC870750YDx {
    public final C883380Yl6 LIZ = new C0YIC() { // from class: X.0Yl6
        @Override // X.C0YIC
        public final Integer LIZ() {
            C882400YjW.LIZ.getClass();
            C882400YjW.LJ();
            C883520YlK c883520YlK = C883520YlK.LIZ;
            return Integer.valueOf(C883520YlK.LIZIZ());
        }

        @Override // X.C0YIC
        public final boolean LIZIZ() {
            C882400YjW.LIZ.getClass();
            C882400YjW.LJ();
            C883520YlK c883520YlK = C883520YlK.LIZ;
            return C883520YlK.LIZJ();
        }

        @Override // X.C0YIC
        public final Map<String, String> LIZJ() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C882400YjW.LIZ.getClass();
            C883390Yl7 c883390Yl7 = (C883390Yl7) C882400YjW.LJI();
            String strLIZJ = C883390Yl7.LIZJ();
            if (strLIZJ.length() > 0) {
                linkedHashMap.put("iid", strLIZJ);
            }
            linkedHashMap.put("aid", String.valueOf(c883390Yl7.getAppId()));
            if ("okhttp/3.12.13.21".length() > 0) {
                linkedHashMap.put("user-agent", "okhttp/3.12.13.21");
            }
            C882400YjW.LJI();
            String strLIZIZ = C883390Yl7.LIZIZ();
            if (strLIZIZ.length() > 0) {
                linkedHashMap.put("locale", strLIZIZ);
            }
            linkedHashMap.put("timezone_name", TimeZone.getDefault().getID());
            return linkedHashMap;
        }

        @Override // X.C0YIC
        public final boolean isWsConnected() {
            C883370Yl5 c883370Yl5 = C883370Yl5.LL;
            return C883370Yl5.LIZIZ();
        }

        @Override // X.C0YIC
        public final Map<String, String> LJ(int i) {
            C882400YjW c882400YjW = C882400YjW.LIZ;
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            c882400YjW.getClass();
            Map<String, String> mapLJ = C882400YjW.LIZIZ(c0ym2).LJ(i);
            if (mapLJ == null) {
                return C2097608Jq.LJ();
            }
            return mapLJ;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.C0YIC
        public final void LJFF(C0YIS c0yis, InterfaceC874620YSu interfaceC874620YSu, boolean z) {
            C1493620oyG c1493620oyG;
            if (c0yis.LJFF == 0) {
                IMSdkOptions iMSdkOptions = C871100YFg.LIZ;
                if (iMSdkOptions != null && iMSdkOptions.isOpen && iMSdkOptions.httpControl != 0) {
                    c1493620oyG = new C1493620oyG();
                    c1493620oyG.LJIIIIZZ = iMSdkOptions.httpProtectTimeout;
                } else {
                    c1493620oyG = null;
                }
            } else {
                c1493620oyG = new C1493620oyG();
                c1493620oyG.LJIIIIZZ = c0yis.LJFF;
            }
            Request request = c0yis.LJ;
            REQUEST_BODY request_bodyDecode = request;
            if (request == null) {
                try {
                    request_bodyDecode = Request.ADAPTER.decode(c0yis.LIZLLL);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    C882690Yjz.LJII();
                    String message = e.getMessage();
                    if (message == null) {
                        message = "decode failed";
                    }
                    interfaceC874620YSu.LIZ(e, message, C386801es.DEFAULT);
                    return;
                }
            }
            C883420YlA c883420YlA = new C883420YlA();
            String str = c0yis.LIZ;
            C883410Yl9<REQUEST_BODY> c883410Yl9 = c883420YlA.LIZ;
            if (str == null) {
                str = "";
            }
            c883410Yl9.LIZ = str;
            c883420YlA.LIZIZ.put("Content-Type", c0yis.LIZJ);
            c883420YlA.LIZIZ.put("X-Biz-Id", String.valueOf(c0yis.LJI));
            C883410Yl9<REQUEST_BODY> c883410Yl92 = c883420YlA.LIZ;
            c883410Yl92.LIZLLL = request_bodyDecode;
            c883410Yl92.LJ = c1493620oyG;
            c883410Yl92.LIZIZ = C2097608Jq.LJIIZILJ(c883420YlA.LIZIZ);
            c883420YlA.LIZ.LIZJ = C2097608Jq.LJIIZILJ(c883420YlA.LIZJ);
            C883410Yl9<REQUEST_BODY> c883410Yl93 = c883420YlA.LIZ;
            C914120Zta c914120Zta = new C914120Zta(interfaceC874620YSu, c883410Yl93, 11);
            if (z) {
                C882400YjW.LIZ.getClass();
                C882400YjW.LJ();
                C883520YlK c883520YlK = C883520YlK.LIZ;
                C883520YlK.LJI(c883410Yl93, c914120Zta);
                return;
            }
            C882400YjW.LIZ.getClass();
            C882400YjW.LJ();
            C883520YlK c883520YlK2 = C883520YlK.LIZ;
            C883520YlK.LJFF(c883410Yl93, c914120Zta);
        }

        @Override // X.C0YIC
        public final void LIZLLL(long j, String str, byte[] bArr, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
            msgHeader.key = "cmd";
            msgHeader.value = String.valueOf(i);
            arrayList.add(msgHeader);
            WsChannelMsg.MsgHeader msgHeader2 = new WsChannelMsg.MsgHeader();
            msgHeader2.key = "seq_id";
            msgHeader2.value = String.valueOf(j);
            arrayList.add(msgHeader2);
            WsChannelMsg.MsgHeader msgHeader3 = new WsChannelMsg.MsgHeader();
            msgHeader3.key = "X-Biz-Id";
            msgHeader3.value = String.valueOf(i2);
            arrayList.add(msgHeader3);
            WsChannelMsg wsChannelMsg = new WsChannelMsg();
            wsChannelMsg.msgHeaders = arrayList;
            wsChannelMsg.service = 5;
            wsChannelMsg.seqId = j;
            wsChannelMsg.logId = j;
            wsChannelMsg.method = 1;
            wsChannelMsg.payload = bArr;
            wsChannelMsg.payloadType = "pb";
            wsChannelMsg.payloadEncoding = str;
            C883370Yl5 c883370Yl5 = C883370Yl5.LL;
            C883370Yl5.LIZLLL(wsChannelMsg);
        }
    };
    public final C874660YSy LIZIZ = new C874660YSy();
    public final C874600YSs LIZJ;
    public final C0YMJ LIZLLL;
    public final C874560YSo LJ;
    public final C0YMV LJFF;
    public final C0YUE LJI;
    public final C874540YSm LJII;

    @Override // X.InterfaceC870750YDx
    public final C0YIC LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC870750YDx
    public final C0YF1 LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC870750YDx
    public final C0YKM LIZJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC870750YDx
    public final C0Y2W LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC870750YDx
    public final InterfaceC870790YEb LJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC870750YDx
    public final C0YJ8 getEvent() {
        return this.LJI;
    }

    @Override // X.InterfaceC870750YDx
    public final InterfaceC868790Y6j getLog() {
        return this.LJFF;
    }

    @Override // X.InterfaceC870750YDx
    public final C0Y8P getMessage() {
        return this.LJ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0Yl6] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0YMJ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0YSo] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0YSm] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0YSs] */
    public C874550YSn(final C0YM2 c0ym2) {
        final AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 1664);
        this.LIZJ = new C0YF1(c0ym2, awS558S0100000_14) { // from class: X.0YSs
            public final C0YM2 LIZ;
            public final Function0<Context> LIZIZ;
            public volatile boolean LIZJ;

            @Override // X.C0YF1
            public final void LIZ() throws Exception {
                if (this.LIZJ) {
                    return;
                }
                try {
                    Librarian.LJFF("wcdb");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (UnsatisfiedLinkError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    Librarian.LJFF("wcdb");
                }
                this.LIZJ = true;
            }

            @Override // X.C0YF1
            public final Boolean LIZIZ() {
                C882400YjW c882400YjW = C882400YjW.LIZ;
                C0YM2 c0ym22 = this.LIZ;
                c882400YjW.getClass();
                return C882400YjW.LIZIZ(c0ym22).LIZIZ();
            }

            @Override // X.C0YF1
            public final C0YEV LIZJ(final String str) {
                return new C0YEV(str) { // from class: X.0YUL
                    public final Keva LIZ;

                    @Override // X.C0YEV
                    public final void clearAll() {
                        this.LIZ.clear();
                    }

                    {
                        C0I0B.LJFF.LIZJ();
                        this.LIZ = KevaImpl.getRepoFromSp(C894660Z7w.LIZ(), str, 0);
                        C882400YjW.LIZ.getClass();
                        C882400YjW.LIZLLL();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SDKSP constructor, spName:");
                        sbLIZ.append(str);
                        C882690Yjz.LJIIIZ("SDKSP", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // X.C0YEV
                    public final boolean getBoolean(String str2) {
                        return this.LIZ.getBoolean(str2, false);
                    }

                    @Override // X.C0YEV
                    public final int getInt(String str2) {
                        return this.LIZ.getInt(str2, 0);
                    }

                    @Override // X.C0YEV
                    public final void LIZ(Long l, String str2) {
                        this.LIZ.storeLong(str2, l.longValue());
                    }

                    @Override // X.C0YEV
                    public final long LIZIZ(Long l, String str2) {
                        return this.LIZ.getLong(str2, l.longValue());
                    }

                    @Override // X.C0YEV
                    public final String getString(String str2, String str3) {
                        return this.LIZ.getString(str2, str3);
                    }

                    @Override // X.C0YEV
                    public final void putBoolean(String str2, boolean z) {
                        this.LIZ.storeBoolean(str2, z);
                    }

                    @Override // X.C0YEV
                    public final void putInt(String str2, int i) {
                        this.LIZ.storeInt(str2, i);
                    }

                    @Override // X.C0YEV
                    public final void putString(String str2, String str3) {
                        this.LIZ.storeString(str2, str3);
                    }
                };
            }

            {
                this.LIZ = c0ym2;
                this.LIZIZ = awS558S0100000_14;
            }
        };
        this.LIZLLL = new C0Y2W(c0ym2) { // from class: X.0YMJ
            public final C0YM2 LIZ;

            @Override // X.C0Y2W
            public final void LIZ() {
            }

            @Override // X.C0Y2W
            public final C0Y2X LIZJ() {
                C882400YjW c882400YjW = C882400YjW.LIZ;
                C0YM2 c0ym22 = this.LIZ;
                c882400YjW.getClass();
                return C882400YjW.LIZIZ(c0ym22).LIZJ();
            }

            {
                this.LIZ = c0ym2;
            }
        };
        this.LJ = new C0Y8P(c0ym2) { // from class: X.0YSo
            public final C0YM2 LIZ;

            @Override // X.C0Y8P
            public final Set<Integer> LIZLLL() {
                C882400YjW c882400YjW = C882400YjW.LIZ;
                C0YM2 c0ym22 = this.LIZ;
                c882400YjW.getClass();
                return C882400YjW.LIZIZ(c0ym22).LIZLLL();
            }

            @Override // X.C0Y8P
            public final ReceiveMsgPerfTracker LJFF() {
                C882400YjW c882400YjW = C882400YjW.LIZ;
                C0YM2 c0ym22 = this.LIZ;
                c882400YjW.getClass();
                return C882400YjW.LIZIZ(c0ym22).LJFF();
            }

            {
                this.LIZ = c0ym2;
            }

            @Override // X.C0Y8P
            public final String LIZIZ(C869590Y9l c869590Y9l) {
                Object orParseJsonContent;
                if (((Number) C274640Apa.LIZ.getValue()).intValue() != 0) {
                    String content = c869590Y9l.getContent();
                    if (content != null && content.length() != 0 && (orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class)) != null && (orParseJsonContent instanceof SlimContent)) {
                        return ((SlimContent) orParseJsonContent).trimToSlimContent();
                    }
                    return content;
                }
                return c869590Y9l.getContent();
            }

            @Override // X.C0Y8P
            public final ByteString LIZJ(C869590Y9l c869590Y9l) {
                BaseTemplate baseTemplateLIZ;
                if (((Number) C274640Apa.LIZ.getValue()).intValue() != 0) {
                    ByteString contentPB = c869590Y9l.getContentPB();
                    if (contentPB != null && contentPB.size() != 0 && (baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class)) != null && (baseTemplateLIZ instanceof InterfaceC874570YSp)) {
                        return ((InterfaceC874570YSp) baseTemplateLIZ).LIZ();
                    }
                    return contentPB;
                }
                return c869590Y9l.getContentPB();
            }

            @Override // X.C0Y8P
            public final boolean LIZ(int i, int i2, Map<String, ? extends Object> map) {
                LinkedHashMap linkedHashMap;
                C882400YjW c882400YjW = C882400YjW.LIZ;
                C0YM2 c0ym22 = this.LIZ;
                c882400YjW.getClass();
                C0YMF c0ymfLIZIZ = C882400YjW.LIZIZ(c0ym22);
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(map);
                } else {
                    linkedHashMap = null;
                }
                return c0ymfLIZIZ.LJJ(i, i2, linkedHashMap);
            }
        };
        this.LJFF = C0YMV.LIZ;
        this.LJI = C0YUE.LIZ;
        this.LJII = new C0YKM(c0ym2) { // from class: X.0YSm
            public final C0YM2 LIZ;

            @Override // X.C0YKM
            public final boolean LIZ() {
                C882400YjW c882400YjW = C882400YjW.LIZ;
                C0YM2 c0ym22 = this.LIZ;
                c882400YjW.getClass();
                return C882400YjW.LIZIZ(c0ym22).LJIJ().LIZ();
            }

            @Override // X.C0YKM
            public final Pair<Boolean, Integer> LIZIZ() {
                C882400YjW c882400YjW = C882400YjW.LIZ;
                C0YM2 c0ym22 = this.LIZ;
                c882400YjW.getClass();
                return C882400YjW.LIZIZ(c0ym22).LJIJ().LIZIZ();
            }

            @Override // X.C0YKM
            public final boolean LIZJ() {
                C882400YjW c882400YjW = C882400YjW.LIZ;
                C0YM2 c0ym22 = this.LIZ;
                c882400YjW.getClass();
                return C882400YjW.LIZIZ(c0ym22).LJIJ().LIZJ();
            }

            {
                this.LIZ = c0ym2;
            }
        };
    }
}
