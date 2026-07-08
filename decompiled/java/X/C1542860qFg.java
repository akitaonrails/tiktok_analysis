package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.zip.ZipInputStream;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542860qFg {
    public static void LIZ() {
        Executor executorLIZIZ;
        Executor executorLIZIZ2;
        C1542830qFd c1542830qFdLIZ;
        C1542850qFf c1542850qFfLIZ;
        String str;
        if (C1542900qFk.LIZ.get(LivePreviewCTASmartDisplayManager.DEFAULT) == null) {
            try {
                try {
                    C1238404sw c1238404sw = C1542900qFk.LJI;
                    synchronized (c1238404sw) {
                        try {
                            c1238404sw.LIZ("repository_handle_local_storage", new JSONObject());
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    InterfaceC1542880qFi interfaceC1542880qFi = C1542900qFk.LJFF;
                    if (interfaceC1542880qFi != null && (c1542830qFdLIZ = interfaceC1542880qFi.LIZ()) != null && (str = (c1542850qFfLIZ = c1542830qFdLIZ.LIZ()).LIZ) != null) {
                        JSONObject jSONObject = c1542850qFfLIZ.LIZJ;
                        if (jSONObject != null) {
                            C1544520qIM.LIZIZ(Integer.valueOf(jSONObject.length()), "jsb_auth_use_response_json_size");
                            JSONObject jSONObject2 = c1542850qFfLIZ.LIZJ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("from_storage");
                            sbLIZ.append('_');
                            sbLIZ.append(c1542850qFfLIZ.LIZIZ);
                            C1542890qFj.LIZ(C2188811AlT.LIZIZ(sbLIZ), jSONObject2);
                        } else {
                            C1544520qIM.LIZIZ(Integer.valueOf(str.length()), "jsb_auth_use_response_json_size");
                            JSONObject jSONObject3 = new JSONObject(str);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("from_storage");
                            sbLIZ2.append('_');
                            sbLIZ2.append(c1542850qFfLIZ.LIZIZ);
                            C1542890qFj.LIZ(C2188811AlT.LIZIZ(sbLIZ2), jSONObject3);
                        }
                    }
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("handle local storage success!! cost_time = ");
                    sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sbLIZ3.append(" ms.");
                    C2188811AlT.LIZIZ(sbLIZ3);
                    InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i2 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("handle local storage failed!!, error = ");
                    sbLIZ4.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ4);
                    InterfaceC1297560js2 interfaceC1297560js22 = C1543410qGZ.LJIIIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(e.getMessage());
                    sbLIZ5.append("");
                    C1544520qIM.LIZIZ(C2188811AlT.LIZIZ(sbLIZ5), "jsb_auth_use_response_json_size");
                }
                InterfaceC1542880qFi interfaceC1542880qFi2 = C1542900qFk.LJFF;
                if (interfaceC1542880qFi2 == null || (executorLIZIZ2 = interfaceC1542880qFi2.LIZIZ()) == null) {
                    return;
                }
                executorLIZIZ2.execute(new Runnable() { // from class: X.0WVl
                    public static void LIZ() {
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            for (Map.Entry<String, JSONObject> entry : C1542900qFk.LJI.LIZ.entrySet()) {
                                jSONObject4.put(entry.getKey(), entry.getValue());
                            }
                            C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
                            C1520360pfO c1520360pfO = new C1520360pfO("bdx_auth_timeline_event_global");
                            c1520360pfO.LIZIZ = "bdxbridge_error_monitor";
                            c1520360pfO.LIZIZ(8);
                            c1520360pfO.LIZLLL = jSONObject4;
                            C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                            c1520380pfQ.getClass();
                            C1520380pfQ.LIZ(c1520350pfNLIZ);
                            C189200o6.m2constructorimpl(jSONObject4);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PermissionConfigRepositoryKt@1eb5.reportGlobalAuthTime$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PermissionConfigRepositoryKt@1eb5.reportGlobalAuthTime$1");
                    }
                });
            } catch (Throwable th) {
                InterfaceC1542880qFi interfaceC1542880qFi3 = C1542900qFk.LJFF;
                if (interfaceC1542880qFi3 != null && (executorLIZIZ = interfaceC1542880qFi3.LIZIZ()) != null) {
                    executorLIZIZ.execute(new Runnable() { // from class: X.0WVl
                        public static void LIZ() {
                            try {
                                JSONObject jSONObject4 = new JSONObject();
                                for (Map.Entry<String, JSONObject> entry : C1542900qFk.LJI.LIZ.entrySet()) {
                                    jSONObject4.put(entry.getKey(), entry.getValue());
                                }
                                C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
                                C1520360pfO c1520360pfO = new C1520360pfO("bdx_auth_timeline_event_global");
                                c1520360pfO.LIZIZ = "bdxbridge_error_monitor";
                                c1520360pfO.LIZIZ(8);
                                c1520360pfO.LIZLLL = jSONObject4;
                                C1520350pfN c1520350pfNLIZ = c1520360pfO.LIZ();
                                c1520380pfQ.getClass();
                                C1520380pfQ.LIZ(c1520350pfNLIZ);
                                C189200o6.m2constructorimpl(jSONObject4);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C189200o6.m2constructorimpl(new C098200Yq(th2));
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PermissionConfigRepositoryKt@1eb5.reportGlobalAuthTime$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PermissionConfigRepositoryKt@1eb5.reportGlobalAuthTime$1");
                        }
                    });
                }
                throw th;
            }
        }
    }

    public static String LIZJ() {
        try {
            StringBuilder sb = new StringBuilder();
            ZipInputStream zipInputStream = new ZipInputStream(C2213981Bky.LIZIZ.getApplicationContext().getAssets().open("jsb_whitelist.zip"));
            if (zipInputStream.getNextEntry() != null) {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = zipInputStream.read(bArr, 0, 1024);
                    if (i < 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, i, Charsets.UTF_8));
                }
            }
            zipInputStream.close();
            return sb.toString();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C1542800qFa.LIZIZ++;
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(message);
            sbLIZ.append(" | ");
            sbLIZ.append(C1542800qFa.LIZIZ);
            C1544520qIM.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "jsb_auth_read_build_in_error");
            return null;
        }
    }

    public static C1542800qFa LIZIZ() {
        return C1542800qFa.LIZ;
    }
}
