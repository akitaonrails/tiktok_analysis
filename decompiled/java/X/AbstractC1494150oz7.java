package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.AbsTypedOutput;
import com.bytedance.retrofit2.mime.TTRequestCompressManager;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1494150oz7 extends AbstractC1494220ozE {
    public static volatile boolean LLJ = true;
    public static volatile boolean LLJI = false;
    public static volatile boolean LLJIJIL = false;
    public volatile int LLIZ;
    public volatile long LLIZLLLIL;

    public abstract HttpURLConnection LJJIIJ();

    @Override // X.InterfaceC1494260ozI
    public final boolean LJJIL() {
        return false;
    }

    @Override // X.InterfaceC1494260ozI
    public final boolean LJJJ() {
        return false;
    }

    public void LJJJJI(HttpURLConnection httpURLConnection) {
    }

    @Override // X.InterfaceC1494260ozI
    public final String LIZIZ() {
        return LJJIZ("Content-Type");
    }

    @Override // X.AbstractC1494220ozE
    public final boolean LIZLLL() {
        return this.LLILLL || C1493630oyH.LJ;
    }

    @Override // X.InterfaceC1494260ozI
    public final InputStream LJJIJIIJIL() {
        if (LJJIIJ() != null) {
            return LJJIIJ().getInputStream();
        }
        return null;
    }

    @Override // X.InterfaceC1494260ozI
    public final Map<String, List<String>> LJJIJL() {
        if (LJJIIJ() != null) {
            return LJJIIJ().getHeaderFields();
        }
        return null;
    }

    @Override // X.InterfaceC1494260ozI
    public final String LJJIJLIJ() {
        return LJJIIJ() != null ? LJJIIJ().getResponseMessage() : "";
    }

    @Override // X.InterfaceC1494260ozI
    public final void LJJJI() {
        if (LJJIIJ() != null) {
            LJJIIJ().disconnect();
        }
    }

    @Override // X.InterfaceC1494260ozI
    public final InputStream LJJJIL() {
        if (LJJIIJ() != null) {
            return LJJIIJ().getErrorStream();
        }
        return null;
    }

    @Override // X.InterfaceC1494260ozI
    public final long LJJJJ() {
        if (LJJIIJ() != null) {
            return LJJIIJ().getContentLength();
        }
        return 0L;
    }

    @Override // X.AbstractC1494220ozE
    public final Context LJIIJ() {
        return C1493630oyH.LIZIZ;
    }

    @Override // X.InterfaceC1494260ozI
    public final int LJJIJIL() {
        return this.LLIZ;
    }

    public AbstractC1494150oz7(Request request) {
        super(request);
        try {
            C1494600ozq c1494600ozq = this.LLILLJJLI;
            c1494600ozq.LJJIFFI = 0;
            c1494600ozq.LJJIIJZLJL.put("hc", "SsCronetHttpClient");
            JSONObject jSONObject = this.LLILLJJLI.LJJIIJZLJL;
            C1493630oyH.LIZIZ();
            jSONObject.put("hcv", C1493630oyH.LIZJ.getCronetVersion());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static String LJJIIZI(TypedOutput typedOutput) {
        if (!(typedOutput instanceof AbsTypedOutput)) {
            return typedOutput.md5Stub();
        }
        AbsTypedOutput absTypedOutput = (AbsTypedOutput) typedOutput;
        if (TextUtils.isEmpty(absTypedOutput.bodyCompressType())) {
            return typedOutput.md5Stub();
        }
        String bodyMd5Stub = absTypedOutput.getBodyMd5Stub();
        TextUtils.isEmpty(bodyMd5Stub);
        return bodyMd5Stub;
    }

    public static void LJJIJ(Request request) {
        C080U firstHeader;
        JSONObject jSONObject;
        if (request.getMetrics() == null || (firstHeader = request.getFirstHeader("x-bd-content-encoding")) == null || TextUtils.isEmpty(firstHeader.LIZIZ) || (jSONObject = request.getMetrics().LJJLIIIJLLLLLLLZ) == null) {
            return;
        }
        try {
            jSONObject.put("encode", firstHeader.LIZIZ);
            jSONObject.put("disableReason", TTRequestCompressManager.DisableCompress.REMOVE_ENCODING.getReason());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1494830p0D
    public boolean LIZ(long j) {
        this.LLIZLLLIL = j;
        return true;
    }

    @Override // X.AbstractC1494220ozE
    public final void LJ(Exception exc) {
        String message = exc.getMessage();
        if (C1493630oyH.LJ && !TextUtils.isEmpty(message) && message.contains("net::ERR_INTERNET_DISCONNECTED")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("network not available for ");
            sbLIZ.append(this.LL.getPath());
            sbLIZ.append(", message:");
            sbLIZ.append(message);
            new C1494450ozb(C2188811AlT.LIZIZ(sbLIZ)).setInfo(false, true, this.LL.getUrl(), "", this.LLILLJJLI);
        }
    }

    @Override // X.AbstractC1494220ozE
    public final void LJIIIIZZ(C1494570ozn c1494570ozn) {
        c1494570ozn.getClass();
        long jNanoTime = System.nanoTime();
        c1494570ozn.LJLJI.LIZ.LIZJ = jNanoTime;
        try {
            HttpURLConnection httpURLConnectionLJJIIJ = LJJIIJ();
            TypedOutput body = this.LL.getBody();
            if (body != null) {
                body.writeTo(httpURLConnectionLJJIIJ.getOutputStream());
            }
            this.LLIZ = httpURLConnectionLJJIIJ.getResponseCode();
            c1494570ozn.LJIILL(jNanoTime);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1494570ozn.LJIILL(jNanoTime);
            throw th;
        }
    }

    @Override // X.AbstractC1494220ozE
    public final void LJIILLIIL(TypedInput typedInput) {
        if (!this.LL.isResponseStreaming() && (typedInput instanceof TypedByteArray)) {
            this.LLILLJJLI.LIZLLL.LJLJI.LIZJ.LIZIZ();
            try {
                C1493240oxe.LJI().LJIIIZ(LJJIIJ(), ((TypedByteArray) typedInput).getBytes(), new C2115308Ql());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            this.LLILLJJLI.LIZLLL.LJJII();
        }
    }

    public final void LJJII(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null && !this.LLILZ) {
            httpURLConnection.disconnect();
            this.LLILZ = true;
            if (this.LL.isResponseStreaming()) {
                C813210VvD c813210VvDLIZ = C813210VvD.LIZ();
                String url = this.LL.getUrl();
                C1494600ozq c1494600ozq = this.LLILLJJLI;
                c813210VvDLIZ.LIZIZ(c1494600ozq.LJIJI, c1494600ozq.LJIJJ, url, c1494600ozq.LJJIJIIJI, c1494600ozq.LJJIIJ);
            }
        }
    }

    public final int LJJIIZ(Request request) {
        T t;
        Integer num;
        int iIntValue;
        String path = request.getPath();
        C1494600ozq c1494600ozq = this.LLILLJJLI;
        int i = C1493630oyH.LIZ;
        if (i >= 8192 && i <= 20971520) {
            return C1493630oyH.LIZ;
        }
        if (!TextUtils.isEmpty(path)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1493630oyH.LJIIIIZZ;
            if (!concurrentHashMap.isEmpty() && concurrentHashMap.containsKey(path) && (num = (Integer) concurrentHashMap.get(path)) != null && (iIntValue = num.intValue()) >= 8192 && iIntValue <= 20971520) {
                return num.intValue();
            }
        }
        if (c1494600ozq == null || (t = c1494600ozq.LIZJ) == 0) {
            return 0;
        }
        int i2 = t.LJIILIIL;
        if (i2 >= 8192 && i2 <= 20971520) {
            return i2;
        }
        t.getClass();
        return 0;
    }

    @Override // X.InterfaceC1494260ozI
    public final String LJJIZ(String str) {
        if (LJJIIJ() == null) {
            return null;
        }
        String headerField = LJJIIJ().getHeaderField(str);
        if (TextUtils.isEmpty(headerField)) {
            return LJJIIJ().getHeaderField(str.toLowerCase());
        }
        return headerField;
    }

    public static HttpURLConnection LJJIIJZLJL(String str, C1494600ozq c1494600ozq) {
        long jNanoTime = -1;
        try {
            c1494600ozq.LIZLLL.getClass();
            jNanoTime = System.nanoTime();
            HttpURLConnection httpURLConnectionLJ = C1493630oyH.LJ(str, c1494600ozq);
            c1494600ozq.LIZLLL.LJIIJ(jNanoTime);
            return httpURLConnectionLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1494600ozq.LIZLLL.LJIIJ(jNanoTime);
            throw th;
        }
    }

    public static String LJJJJIZL(TypedOutput typedOutput, Request request) {
        boolean zEquals;
        if (!(typedOutput instanceof AbsTypedOutput) || request == null) {
            return null;
        }
        AbsTypedOutput absTypedOutput = (AbsTypedOutput) typedOutput;
        if (!TextUtils.isEmpty(absTypedOutput.bodyCompressType())) {
            return absTypedOutput.bodyCompressType();
        }
        long length = typedOutput.length();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (absTypedOutput.isBodyEncrypted() && TTRequestCompressManager.isBodyOptEnabled()) {
            LJJIJIIJI(length, 0L, TTRequestCompressManager.DisableCompress.BODY_ENCRYPTED.getReason(), jCurrentTimeMillis, request, null);
            return null;
        }
        String host = request.getHost();
        String path = request.getPath();
        C080U firstHeader = request.getFirstHeader("x-metasec-content-encoding");
        if (firstHeader == null) {
            zEquals = false;
        } else {
            zEquals = "1".equals(firstHeader.LIZIZ);
        }
        TTRequestCompressManager.CompressData compressDataCompressRequestBody = absTypedOutput.compressRequestBody(host, path, zEquals);
        if (compressDataCompressRequestBody == null) {
            LJJIJIIJI(length, 0L, TTRequestCompressManager.DisableCompress.DATA_NULL.getReason(), jCurrentTimeMillis, request, null);
            return null;
        }
        LJJIJIIJI(length, typedOutput.length(), 0, jCurrentTimeMillis, request, compressDataCompressRequestBody);
        return compressDataCompressRequestBody.contentEncoding;
    }

    @Override // X.AbstractC1494220ozE
    public final Request LIZJ(Request request, C1494600ozq c1494600ozq) {
        String str;
        ArrayList arrayList = new ArrayList(request.getHeaders());
        String str2 = "1";
        if (c1494600ozq.LJJIJL.LIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        arrayList.add(new C080U("x-tt-sla-has-sampled", str));
        if (!c1494600ozq.LJJIJL.LIZIZ) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        arrayList.add(new C080U("x-tt-sla-api-allow-collection", str2));
        long j = c1494600ozq.LJJIL;
        long j2 = c1494600ozq.LJJIJLIJ;
        long j3 = -1;
        if (j2 != -1 && j != -1) {
            j3 = j - j2;
        }
        arrayList.add(new C080U("x-tt-sla-sampling-duration", String.valueOf(j3)));
        arrayList.add(new C080U("x-tt-sla-sampling-result-code", String.valueOf(c1494600ozq.LJJIJL.LIZJ.getValue())));
        if (c1494600ozq.LJJIJL.LIZLLL != EnumC1494180ozA.NONE) {
            arrayList.add(new C080U("x-tt-sla-no-setting-reason", String.valueOf(C1494170oz9.LIZIZ().LIZIZ.getValue())));
        }
        arrayList.add(new C080U("x-tt-sla-first-config-delay", String.valueOf(C1494170oz9.LIZIZ().LIZLLL)));
        C0XMB c0xmbNewBuilder = request.newBuilder();
        c0xmbNewBuilder.LIZJ = arrayList;
        return c0xmbNewBuilder.LIZ();
    }

    @Override // X.AbstractC1494220ozE
    public final void LJIIZILJ(String str, Request request, C1494600ozq c1494600ozq, Map<String, String> map) {
        boolean z;
        try {
            try {
                c1494600ozq.LIZLLL.LJLJI.LIZ.LIZ = System.nanoTime();
                c1494600ozq.LIZIZ = LJJIIZ(request);
                if (LLJ && LLJI && c1494600ozq.LIZIZ <= 0 && !c1494600ozq.LJJIIZ) {
                    z = true;
                } else {
                    z = false;
                }
                c1494600ozq.LIZ = z;
                Logger.debug();
                HttpURLConnection httpURLConnectionLJJIIJZLJL = LJJIIJZLJL(str, c1494600ozq);
                LJJIII(request, c1494600ozq, httpURLConnectionLJJIIJZLJL, map);
                LJJJJI(httpURLConnectionLJJIIJZLJL);
                c1494600ozq.LIZLLL.LJJIII();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw C1494460ozc.wrapIfNeeded(e, str, c1494600ozq.LJJIJIIJIL, c1494600ozq);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1494600ozq.LIZLLL.LJJIII();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0370 A[Catch: all -> 0x0630, TryCatch #12 {all -> 0x0630, blocks: (B:85:0x02ef, B:86:0x02f2, B:88:0x02fa, B:106:0x0369, B:107:0x036c, B:109:0x0370, B:120:0x03d7, B:90:0x02fe, B:125:0x03e2, B:182:0x0627, B:169:0x05ae, B:129:0x0402, B:131:0x0408, B:137:0x0468, B:139:0x0474, B:141:0x0478, B:142:0x0489, B:144:0x048d, B:145:0x049e, B:147:0x04a2, B:148:0x04b5, B:150:0x04bb, B:152:0x04bf, B:153:0x04e9, B:155:0x04ed, B:156:0x0517, B:158:0x051b, B:159:0x0546, B:161:0x054a, B:162:0x0568, B:164:0x056c, B:165:0x058a, B:167:0x058e, B:132:0x041b, B:134:0x0421, B:136:0x044b, B:111:0x0374, B:114:0x037c, B:115:0x038d, B:117:0x0393, B:118:0x03ba), top: B:307:0x02ef, inners: #10, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03e2 A[Catch: all -> 0x0630, TRY_ENTER, TryCatch #12 {all -> 0x0630, blocks: (B:85:0x02ef, B:86:0x02f2, B:88:0x02fa, B:106:0x0369, B:107:0x036c, B:109:0x0370, B:120:0x03d7, B:90:0x02fe, B:125:0x03e2, B:182:0x0627, B:169:0x05ae, B:129:0x0402, B:131:0x0408, B:137:0x0468, B:139:0x0474, B:141:0x0478, B:142:0x0489, B:144:0x048d, B:145:0x049e, B:147:0x04a2, B:148:0x04b5, B:150:0x04bb, B:152:0x04bf, B:153:0x04e9, B:155:0x04ed, B:156:0x0517, B:158:0x051b, B:159:0x0546, B:161:0x054a, B:162:0x0568, B:164:0x056c, B:165:0x058a, B:167:0x058e, B:132:0x041b, B:134:0x0421, B:136:0x044b, B:111:0x0374, B:114:0x037c, B:115:0x038d, B:117:0x0393, B:118:0x03ba), top: B:307:0x02ef, inners: #10, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ea A[Catch: all -> 0x0825, TRY_ENTER, TryCatch #3 {all -> 0x0825, blocks: (B:123:0x03de, B:180:0x0623, B:179:0x0620, B:127:0x03ea, B:170:0x05b1, B:173:0x05b9, B:174:0x05ce, B:176:0x05d4, B:177:0x05ff), top: B:290:0x03de, inners: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0474 A[Catch: all -> 0x05ad, TryCatch #10 {all -> 0x05ad, blocks: (B:129:0x0402, B:131:0x0408, B:137:0x0468, B:139:0x0474, B:141:0x0478, B:142:0x0489, B:144:0x048d, B:145:0x049e, B:147:0x04a2, B:148:0x04b5, B:150:0x04bb, B:152:0x04bf, B:153:0x04e9, B:155:0x04ed, B:156:0x0517, B:158:0x051b, B:159:0x0546, B:161:0x054a, B:162:0x0568, B:164:0x056c, B:165:0x058a, B:167:0x058e, B:132:0x041b, B:134:0x0421, B:136:0x044b), top: B:305:0x0402, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04b5 A[Catch: all -> 0x05ad, TryCatch #10 {all -> 0x05ad, blocks: (B:129:0x0402, B:131:0x0408, B:137:0x0468, B:139:0x0474, B:141:0x0478, B:142:0x0489, B:144:0x048d, B:145:0x049e, B:147:0x04a2, B:148:0x04b5, B:150:0x04bb, B:152:0x04bf, B:153:0x04e9, B:155:0x04ed, B:156:0x0517, B:158:0x051b, B:159:0x0546, B:161:0x054a, B:162:0x0568, B:164:0x056c, B:165:0x058a, B:167:0x058e, B:132:0x041b, B:134:0x0421, B:136:0x044b), top: B:305:0x0402, outer: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x05b9 A[Catch: all -> 0x061f, TRY_ENTER, TryCatch #24 {all -> 0x061f, blocks: (B:170:0x05b1, B:173:0x05b9, B:174:0x05ce, B:176:0x05d4, B:177:0x05ff), top: B:331:0x05b1, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05ce A[Catch: all -> 0x061f, TryCatch #24 {all -> 0x061f, blocks: (B:170:0x05b1, B:173:0x05b9, B:174:0x05ce, B:176:0x05d4, B:177:0x05ff), top: B:331:0x05b1, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0627 A[Catch: all -> 0x0630, TRY_ENTER, TryCatch #12 {all -> 0x0630, blocks: (B:85:0x02ef, B:86:0x02f2, B:88:0x02fa, B:106:0x0369, B:107:0x036c, B:109:0x0370, B:120:0x03d7, B:90:0x02fe, B:125:0x03e2, B:182:0x0627, B:169:0x05ae, B:129:0x0402, B:131:0x0408, B:137:0x0468, B:139:0x0474, B:141:0x0478, B:142:0x0489, B:144:0x048d, B:145:0x049e, B:147:0x04a2, B:148:0x04b5, B:150:0x04bb, B:152:0x04bf, B:153:0x04e9, B:155:0x04ed, B:156:0x0517, B:158:0x051b, B:159:0x0546, B:161:0x054a, B:162:0x0568, B:164:0x056c, B:165:0x058a, B:167:0x058e, B:132:0x041b, B:134:0x0421, B:136:0x044b, B:111:0x0374, B:114:0x037c, B:115:0x038d, B:117:0x0393, B:118:0x03ba), top: B:307:0x02ef, inners: #10, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0633 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0302 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0402 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0374 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5 A[Catch: all -> 0x02ec, TRY_ENTER, TryCatch #9 {all -> 0x02ec, blocks: (B:64:0x01bb, B:70:0x01d5, B:73:0x0213, B:78:0x0295, B:63:0x019e), top: B:303:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01db A[Catch: all -> 0x0293, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x0293, blocks: (B:66:0x01c9, B:68:0x01cf, B:72:0x01db, B:75:0x0219, B:59:0x018b), top: B:317:0x018b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0213 A[Catch: all -> 0x02ec, TRY_ENTER, TryCatch #9 {all -> 0x02ec, blocks: (B:64:0x01bb, B:70:0x01d5, B:73:0x0213, B:78:0x0295, B:63:0x019e), top: B:303:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02fa A[Catch: all -> 0x0630, TryCatch #12 {all -> 0x0630, blocks: (B:85:0x02ef, B:86:0x02f2, B:88:0x02fa, B:106:0x0369, B:107:0x036c, B:109:0x0370, B:120:0x03d7, B:90:0x02fe, B:125:0x03e2, B:182:0x0627, B:169:0x05ae, B:129:0x0402, B:131:0x0408, B:137:0x0468, B:139:0x0474, B:141:0x0478, B:142:0x0489, B:144:0x048d, B:145:0x049e, B:147:0x04a2, B:148:0x04b5, B:150:0x04bb, B:152:0x04bf, B:153:0x04e9, B:155:0x04ed, B:156:0x0517, B:158:0x051b, B:159:0x0546, B:161:0x054a, B:162:0x0568, B:164:0x056c, B:165:0x058a, B:167:0x058e, B:132:0x041b, B:134:0x0421, B:136:0x044b, B:111:0x0374, B:114:0x037c, B:115:0x038d, B:117:0x0393, B:118:0x03ba), top: B:307:0x02ef, inners: #10, #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fe A[Catch: all -> 0x0630, TryCatch #12 {all -> 0x0630, blocks: (B:85:0x02ef, B:86:0x02f2, B:88:0x02fa, B:106:0x0369, B:107:0x036c, B:109:0x0370, B:120:0x03d7, B:90:0x02fe, B:125:0x03e2, B:182:0x0627, B:169:0x05ae, B:129:0x0402, B:131:0x0408, B:137:0x0468, B:139:0x0474, B:141:0x0478, B:142:0x0489, B:144:0x048d, B:145:0x049e, B:147:0x04a2, B:148:0x04b5, B:150:0x04bb, B:152:0x04bf, B:153:0x04e9, B:155:0x04ed, B:156:0x0517, B:158:0x051b, B:159:0x0546, B:161:0x054a, B:162:0x0568, B:164:0x056c, B:165:0x058a, B:167:0x058e, B:132:0x041b, B:134:0x0421, B:136:0x044b, B:111:0x0374, B:114:0x037c, B:115:0x038d, B:117:0x0393, B:118:0x03ba), top: B:307:0x02ef, inners: #10, #18 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x03d7 -> B:290:0x03de). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(com.bytedance.retrofit2.client.Request r22, X.C1494600ozq r23, java.net.HttpURLConnection r24, java.util.Map<java.lang.String, java.lang.String> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1494150oz7.LJJIII(com.bytedance.retrofit2.client.Request, X.0ozq, java.net.HttpURLConnection, java.util.Map):void");
    }

    public static void LJJIJIIJI(long j, long j2, int i, long j3, Request request, TTRequestCompressManager.CompressData compressData) {
        if (request.getMetrics() == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("beforeSize", j);
            if (i != 0) {
                jSONObject.put("disableReason", i);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (compressData == null) {
            request.getMetrics().LJJLIIIJLLLLLLLZ = jSONObject;
            return;
        }
        try {
            if (!TextUtils.isEmpty(compressData.contentEncoding)) {
                jSONObject.put("type", compressData.contentEncoding);
                jSONObject.put("afterSize", j2);
            }
            int i2 = compressData.failedCode;
            if (i2 != 0) {
                jSONObject.put("disableReason", i2);
                if ((compressData.failedCode == TTRequestCompressManager.DisableCompress.GZIP_PREFIX_MISMATCH.getReason() || compressData.failedCode == TTRequestCompressManager.DisableCompress.ZSTD_PREFIX_MISMATCH.getReason()) && !TextUtils.isEmpty(compressData.failedPrefixData)) {
                    jSONObject.put("prefix", compressData.failedPrefixData);
                }
            }
            jSONObject.put("duration", System.currentTimeMillis() - j3);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        request.getMetrics().LJJLIIIJLLLLLLLZ = jSONObject;
    }
}
