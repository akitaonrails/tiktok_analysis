package X;

import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793440VAo {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static boolean LIZIZ = true;
    public static String LIZJ;

    public static C793450VAp LIZ(String str, C793730VBr c793730VBr) throws Throwable {
        GZIPOutputStream gZIPOutputStream;
        HashMap map = new HashMap();
        if (c793730VBr.LIZIZ > 128) {
            try {
                AbstractC793700VBo abstractC793700VBoLIZIZ = AbstractC793700VBo.LIZIZ(C792420V6q.LJIILL());
                try {
                    gZIPOutputStream = new GZIPOutputStream(abstractC793700VBoLIZIZ);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = null;
                }
                try {
                    gZIPOutputStream.write(c793730VBr.LIZ, 0, c793730VBr.LIZIZ);
                    C2105408Mq.LIZ(gZIPOutputStream);
                    C793730VBr c793730VBrLIZ = abstractC793700VBoLIZIZ.LIZ();
                    map.put("Content-Encoding", "gzip");
                    c793730VBr = c793730VBrLIZ;
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    C2105408Mq.LIZ(gZIPOutputStream);
                    throw th;
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return new C793450VAp(C015O.LIZ(str, C792420V6q.LJIIJJI()), map, c793730VBr.LIZIZ());
    }

    public static void LIZJ(String str, C793730VBr c793730VBr) {
        boolean zLIZIZ;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            if (C792190V5t.LIZ()) {
                C792910V8n.LIZ("APM-CustomException", "network unreachable");
                return;
            }
            return;
        }
        if (!c793730VBr.LIZ()) {
            try {
                C793450VAp c793450VApLIZ = LIZ(str, c793730VBr);
                if (C792190V5t.LIZ()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("http request:url:");
                    sbLIZ.append(c793450VApLIZ.LIZ);
                    sbLIZ.append(" headers:");
                    sbLIZ.append(c793450VApLIZ.LIZIZ);
                    C792910V8n.LIZ("APM-CustomException", C2188811AlT.LIZIZ(sbLIZ));
                }
                String str2 = c793450VApLIZ.LIZ;
                Map<String, String> map = c793450VApLIZ.LIZIZ;
                ((IHttpService) C792590V7h.LIZ(IHttpService.class)).doPost(str2, c793450VApLIZ.LIZJ, map);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZIZ(final String str, final String str2, final Throwable th) {
        C0V5N c0v5n;
        if (C0V5B.LIZ && (c0v5n = C0V5B.LIZIZ) != null) {
            c0v5n.e(str, str2);
        }
        if (LIZIZ) {
            AtomicInteger atomicInteger = LIZ;
            if (atomicInteger.get() < 3) {
                atomicInteger.incrementAndGet();
                C792490V6x.LIZ(EnumC792970V8t.IO).LIZJ(new AbstractRunnableC792500V6y() { // from class: X.0VBm
                    public final void LIZ() {
                        C793730VBr c793730VBr;
                        String str3 = str;
                        String str4 = str2;
                        Throwable th2 = th;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("tag=");
                        sbLIZ.append(str3);
                        sbLIZ.append(" message=");
                        sbLIZ.append(str4);
                        C0VFQ c0vfq = new C0VFQ(C2188811AlT.LIZIZ(sbLIZ), th2);
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("event_type", "exception");
                            jSONObject.put("timestamp", System.currentTimeMillis());
                            StringWriter stringWriter = new StringWriter();
                            PrintWriter printWriter = new PrintWriter(stringWriter);
                            c0vfq.printStackTrace(printWriter);
                            Throwable cause = c0vfq.getCause();
                            if (cause != null) {
                                cause.printStackTrace(printWriter);
                                Throwable cause2 = cause.getCause();
                                if (cause2 != null) {
                                    cause2.printStackTrace(printWriter);
                                }
                            }
                            String string = stringWriter.toString();
                            printWriter.close();
                            jSONObject.put("stack", string);
                            jSONObject.put("exception_type", 1);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str3);
                            sbLIZ2.append("_");
                            sbLIZ2.append(str4);
                            jSONObject.put("message", C2188811AlT.LIZIZ(sbLIZ2));
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("apm_sdk", "apm6_error");
                            jSONObject2.put("host_aid", String.valueOf(C792420V6q.LIZIZ()));
                            jSONObject.put("filters", jSONObject2);
                            JSONObject jSONObject3 = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject);
                            jSONObject3.put("data", jSONArray);
                            JSONObject jSONObject4 = new JSONObject();
                            C792450V6t.LIZ(jSONObject4, C792420V6q.LJIIIIZZ());
                            if (C792420V6q.LIZJ != null) {
                                C792450V6t.LIZ(jSONObject4, null);
                            }
                            jSONObject4.put("os", "Android");
                            jSONObject4.put("aid", 2085);
                            jSONObject4.put("device_id", C792420V6q.LJFF());
                            jSONObject4.put("channel", C792420V6q.LIZLLL());
                            jSONObject4.put("version_code", C792420V6q.LJIILIIL());
                            jSONObject4.put("update_version_code", C792420V6q.LJIIJ());
                            jSONObject4.put("device_id", C792420V6q.LJFF());
                            jSONObject4.put("uid", C792420V6q.LJIIL());
                            jSONObject4.put("process_name", C792420V6q.LJ());
                            jSONObject3.put("header", jSONObject4);
                            if (C792420V6q.LJIILL()) {
                                C08SI c08si = new C08SI(new C793720VBq(512));
                                c08si.LJI(jSONObject3);
                                C793720VBq c793720VBq = c08si.LIZ;
                                c793730VBr = new C793730VBr(c793720VBq.LL, c793720VBq.LLILLJJLI);
                            } else {
                                c793730VBr = new C793730VBr(C786410Ut5.J3(jSONObject3).getBytes());
                            }
                            C793440VAo.LIZJ(C793440VAo.LIZJ, c793730VBr);
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CustomExceptionHelper@9715.reportSlardarIfNeed$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CustomExceptionHelper@9715.reportSlardarIfNeed$1");
                    }
                });
            }
        }
    }
}
