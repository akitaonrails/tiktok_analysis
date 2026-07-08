package X;

import android.util.Pair;
import com.bytedance.lynx.service.network.NetApi;
import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.jsbridge.network.HttpRequest;
import com.lynx.jsbridge.network.HttpResponse;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.base.TraceEvent;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0kwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class RunnableC1338900kwi implements Runnable {
    public final HttpRequest LL;
    public final AbstractC1338850kwd LLILLJJLI;
    public final C1320210kSZ LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final AtomicBoolean LLILZLL = new AtomicBoolean(false);

    public final void LIZ() {
        C0X9S<TypedInput> c0x9sDoPostStreaming;
        C1338940kwm.LIZIZ.LIZIZ(this.LL);
        HttpRequest httpRequest = this.LL;
        String str = httpRequest.LIZ;
        String str2 = httpRequest.LIZIZ;
        JavaOnlyMap javaOnlyMap = httpRequest.LJ;
        if (str2 == null) {
            throw new IllegalArgumentException("Unsupported HTTP url. url is empty.");
        }
        JavaOnlyMap javaOnlyMap2 = httpRequest.LJFF;
        boolean z = javaOnlyMap2.getBoolean("needCommonParams", true);
        ReadableMap map = javaOnlyMap2.getMap("params", new JavaOnlyMap());
        int i = javaOnlyMap2.getInt("priorityLevel", 1);
        Map<String, String> mapLIZ = C1289790jfV.LIZ(map);
        try {
            Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(str2, mapLIZ);
            String string = javaOnlyMap.getString("Content-Type");
            byte[] bArr = this.LL.LIZLLL;
            TypedByteArray typedByteArray = bArr != null ? new TypedByteArray(string, bArr, new String[0]) : new TypedByteArray(string, new byte[0], new String[0]);
            Map<String, String> mapLIZ2 = C1289790jfV.LIZ(javaOnlyMap);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((HashMap) mapLIZ2).entrySet()) {
                if (entry.getValue() != null) {
                    arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
                }
            }
            C1493620oyG c1493620oyG = new C1493620oyG();
            c1493620oyG.LJIJI = this.LL.LJ.hasKey("Cookie");
            String str3 = (String) pairLIZJ.first;
            InterfaceC1338950kwn interfaceC1338950kwn = C1338940kwm.LIZ;
            if (interfaceC1338950kwn == null) {
                interfaceC1338950kwn = new InterfaceC1338950kwn() { // from class: X.0pX2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
                    @Override // X.InterfaceC1338950kwn
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.InterfaceC1338920kwk LIZ(java.lang.String r8) throws java.lang.Throwable {
                        /*
                            r7 = this;
                            X.0pX9 r1 = new X.0pX9
                            r1.<init>()
                            X.0pX4 r5 = new X.0pX4
                            r5.<init>()
                            r5.LIZLLL(r8)
                            X.0otQ r0 = new X.0otQ
                            r0.<init>()
                            r5.LJI = r0
                            com.bytedance.ttnet.retrofit.SsInterceptor r0 = new com.bytedance.ttnet.retrofit.SsInterceptor
                            r0.<init>()
                            r5.LIZJ(r0)
                            r5.LIZIZ = r1
                            com.ss.android.ugc.aweme.net.settings.PayLoadControl r0 = X.C0X15.LIZ()
                            boolean r0 = r0.enable
                            r6 = 0
                            java.lang.String r3 = "dzBzEgAjS8/YVFkiQFyIfx2bdbgvWpxZ0bg+SbyEqIoPzQm2UJC6KNPPlwyX8PAYteXRJh4C1+VI"
                            r4 = 0
                            if (r0 == 0) goto L63
                            com.bytedance.common.utility.reflect.Reflect r2 = com.bytedance.common.utility.reflect.Reflect.on(r5)     // Catch: java.lang.Throwable -> L5f
                            java.lang.String r1 = "clientProvider"
                            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L5f
                            com.bytedance.common.utility.reflect.Reflect r0 = r2.field(r1, r0)     // Catch: java.lang.Throwable -> L5f
                            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L5f
                            X.0p0G r0 = (X.InterfaceC1494860p0G) r0     // Catch: java.lang.Throwable -> L5f
                            X.0oyU r2 = r0.get()     // Catch: java.lang.Throwable -> L5f
                            java.lang.String r1 = "com.ss.android.ugc.aweme.app.api.OkClient"
                            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L5f
                            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L5f
                            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L5f
                            if (r0 != 0) goto L55
                            boolean r0 = r2 instanceof X.C1493780oyW     // Catch: java.lang.Throwable -> L5f
                            if (r0 != 0) goto L55
                            goto L63
                        L55:
                            X.0WZX r0 = new X.0WZX     // Catch: java.lang.Throwable -> L5f
                            r0.<init>(r3, r6)     // Catch: java.lang.Throwable -> L5f
                            com.bytedance.retrofit2.Retrofit r3 = X.C2204961BRm.LLLLIIIILLL(r5, r0)     // Catch: java.lang.Throwable -> L5f
                            goto L94
                        L5f:
                            r0 = move-exception
                            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        L63:
                            X.0WZX r0 = new X.0WZX
                            r0.<init>(r3, r6)
                            com.bytedance.retrofit2.Retrofit r3 = X.C2204961BRm.LLLLIIIILLL(r5, r0)
                            java.util.List<X.07d9> r1 = r3.LJIIIIZZ
                            if (r1 == 0) goto L94
                            com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor r0 = new com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor
                            r0.<init>()
                            r1.add(r0)
                            java.util.List<X.07d9> r0 = r3.LJIIIIZZ
                            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
                            X.07d9 r2 = (X.InterfaceC1904907d9) r2
                            java.util.List<X.07d9> r1 = r3.LJIIIIZZ
                            com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor r0 = new com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor
                            r0.<init>(r2)
                            com.bytedance.mt.protector.impl.collections.ListProtector.set(r1, r4, r0)
                            java.util.List<X.07d9> r1 = r3.LJIIIIZZ
                            com.ss.android.ugc.aweme.net.interceptor.LastRequestInterceptor r0 = new com.ss.android.ugc.aweme.net.interceptor.LastRequestInterceptor
                            r0.<init>()
                            r1.add(r0)
                        L94:
                            X.0pX8 r0 = new X.0pX8
                            r0.<init>(r3)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1515180pX2.LIZ(java.lang.String):X.0kwk");
                    }
                };
            }
            InterfaceC1338920kwk interfaceC1338920kwkLIZ = interfaceC1338950kwn.LIZ(str3);
            String str4 = (String) pairLIZJ.second;
            if (str.equalsIgnoreCase("GET")) {
                c0x9sDoPostStreaming = LJ() ? ((NetApi) interfaceC1338920kwkLIZ.create(NetApi.class)).doGetStreaming(z, -1, str4, mapLIZ, arrayList, c1493620oyG) : i == 0 ? ((NetApi) interfaceC1338920kwkLIZ.create(NetApi.class)).doGetLow(z, -1, str4, mapLIZ, arrayList, c1493620oyG) : i == 2 ? ((NetApi) interfaceC1338920kwkLIZ.create(NetApi.class)).doGetHigh(z, -1, str4, mapLIZ, arrayList, c1493620oyG) : i == 3 ? ((NetApi) interfaceC1338920kwkLIZ.create(NetApi.class)).doGetImmediate(z, -1, str4, mapLIZ, arrayList, c1493620oyG) : ((NetApi) interfaceC1338920kwkLIZ.create(NetApi.class)).doGet(z, -1, str4, mapLIZ, arrayList, c1493620oyG);
            } else {
                if (!str.equalsIgnoreCase("POST")) {
                    throw new IllegalArgumentException("Unsupported HTTP Method.");
                }
                c0x9sDoPostStreaming = LJ() ? ((NetApi) interfaceC1338920kwkLIZ.create(NetApi.class)).doPostStreaming(z, -1, str4, mapLIZ, arrayList, typedByteArray, c1493620oyG) : i == 0 ? ((NetApi) interfaceC1338920kwkLIZ.create(NetApi.class)).doPostLow(z, -1, str4, mapLIZ, arrayList, typedByteArray, c1493620oyG) : i == 2 ? ((NetApi) interfaceC1338920kwkLIZ.create(NetApi.class)).doPostHigh(z, -1, str4, mapLIZ, arrayList, typedByteArray, c1493620oyG) : i == 3 ? ((NetApi) interfaceC1338920kwkLIZ.create(NetApi.class)).doPostImmediate(z, -1, str4, mapLIZ, arrayList, typedByteArray, c1493620oyG) : ((NetApi) interfaceC1338920kwkLIZ.create(NetApi.class)).doPost(z, -1, str4, mapLIZ, arrayList, typedByteArray, c1493620oyG);
            }
            c0x9sDoPostStreaming.enqueue(new C09SW<TypedInput>() { // from class: X.0kwh
                @Override // X.C09SW
                public final void onAsyncPreRequest(RequestBuilder requestBuilder) {
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<TypedInput> c0x9s, C0X52<TypedInput> c0x52) {
                }

                @Override // X.C09SW
                public final void onAsyncResponse(C0X9S<TypedInput> c0x9s, final C0X52<TypedInput> c0x52) {
                    boolean z2 = false;
                    if (!this.LL.LLILZLL.compareAndSet(false, true)) {
                        return;
                    }
                    if (this.LL.LJ()) {
                        RunnableC1338900kwi runnableC1338900kwi = this.LL;
                        runnableC1338900kwi.getClass();
                        final HttpResponse httpResponse = new HttpResponse();
                        httpResponse.LIZJ = runnableC1338900kwi.LL.LIZIZ;
                        TraceEvent.LIZJ("NetworkModule.callback", new HashMap<String, String>(httpResponse, c0x52) { // from class: X.0kwj
                            {
                                put("url", httpResponse.getUrl());
                                put("httpCode", String.valueOf(c0x52.LIZ.LIZIZ));
                            }
                        });
                        C2175508fh c2175508fh = c0x52.LIZ;
                        httpResponse.LIZ = c2175508fh.LIZIZ;
                        RunnableC1338900kwi.LIZIZ(httpResponse, c2175508fh.LIZLLL);
                        TraceEvent.LJII("NetworkModule.callback");
                        C1338940kwm.LIZIZ.LIZ();
                        LynxLog.i("NetworkModule", "onRequestResponseStreaming");
                        runnableC1338900kwi.LLILLJJLI.LIZ(httpResponse);
                        JavaOnlyMap httpHeaders = httpResponse.getHttpHeaders();
                        if (httpHeaders != null) {
                            Iterator<Map.Entry<String, Object>> it2 = httpHeaders.entrySet().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    Map.Entry<String, Object> next = it2.next();
                                    if ("Content-Type".equalsIgnoreCase(next.getKey())) {
                                        Object value = next.getValue();
                                        if (value != null && value.toString().toLowerCase().startsWith("text/event-stream")) {
                                            z2 = true;
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            try {
                                InputStream inputStreamIn = c0x52.LIZIZ.in();
                                if (z2) {
                                    runnableC1338900kwi.LLILLL.LJFF(inputStreamIn);
                                } else if (runnableC1338900kwi.LLILZ) {
                                    runnableC1338900kwi.LLILLL.LIZ(inputStreamIn);
                                } else {
                                    runnableC1338900kwi.LLILLL.LJ(inputStreamIn);
                                }
                                runnableC1338900kwi.LLILLL.LIZJ();
                                if (c0x9s == null) {
                                    return;
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                runnableC1338900kwi.LLILLL.LIZLLL(e.toString());
                                runnableC1338900kwi.LLILLL.LIZJ();
                                if (c0x9s == null) {
                                    return;
                                }
                            }
                            c0x9s.cancel();
                            return;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            runnableC1338900kwi.LLILLL.LIZJ();
                            if (c0x9s != null) {
                                c0x9s.cancel();
                            }
                            throw th;
                        }
                    }
                    RunnableC1338900kwi runnableC1338900kwi2 = this.LL;
                    runnableC1338900kwi2.getClass();
                    HttpResponse httpResponse2 = new HttpResponse();
                    httpResponse2.LIZJ = runnableC1338900kwi2.LL.LIZIZ;
                    try {
                        try {
                            TraceEvent.LIZJ("NetworkModule.callback", new HashMap<String, String>(httpResponse2) { // from class: X.0kwg
                                {
                                    put("url", httpResponse2.getUrl());
                                }
                            });
                            C2175508fh c2175508fh2 = c0x52.LIZ;
                            httpResponse2.LIZ = c2175508fh2.LIZIZ;
                            RunnableC1338900kwi.LIZIZ(httpResponse2, c2175508fh2.LIZLLL);
                            TypedInput typedInput = c0x52.LIZIZ;
                            if (typedInput != null) {
                                httpResponse2.LJ = RunnableC1338900kwi.LIZLLL(typedInput.in());
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            if (c0x9s != null) {
                                c0x9s.cancel();
                            }
                            throw th2;
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(e2.getClass().getSimpleName());
                        sbLIZ.append(":");
                        sbLIZ.append(e2.getMessage());
                        RunnableC1338900kwi.LIZJ(httpResponse2, C2188811AlT.LIZIZ(sbLIZ), 499, 0);
                        if (c0x9s != null) {
                        }
                    }
                    if (c0x9s != null) {
                        c0x9s.cancel();
                    }
                    TraceEvent.LJII("NetworkModule.callback");
                    C1338940kwm.LIZIZ.LIZ();
                    LynxLog.i("NetworkModule", "onRequestResponse");
                    runnableC1338900kwi2.LLILLJJLI.LIZ(httpResponse2);
                }

                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<TypedInput> c0x9s, Throwable th) {
                    C1320210kSZ c1320210kSZ;
                    if (!this.LL.LLILZLL.compareAndSet(false, true)) {
                        return;
                    }
                    RunnableC1338900kwi runnableC1338900kwi = this.LL;
                    runnableC1338900kwi.getClass();
                    HttpResponse httpResponse = new HttpResponse();
                    httpResponse.LIZJ = runnableC1338900kwi.LL.LIZIZ;
                    if (th instanceof C1494450ozb) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(th.getClass().getSimpleName());
                        sbLIZ.append(":");
                        sbLIZ.append(th.getMessage());
                        RunnableC1338900kwi.LIZJ(httpResponse, C2188811AlT.LIZIZ(sbLIZ), 499, ((C1494450ozb) th).getCronetInternalErrorCode());
                    } else if (th instanceof C1494690ozz) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(th.getClass().getSimpleName());
                        sbLIZ2.append(":");
                        sbLIZ2.append(th.getMessage());
                        sbLIZ2.append(",");
                        C1494690ozz c1494690ozz = (C1494690ozz) th;
                        sbLIZ2.append(c1494690ozz.getStatusCode());
                        RunnableC1338900kwi.LIZJ(httpResponse, C2188811AlT.LIZIZ(sbLIZ2), c1494690ozz.getStatusCode(), c1494690ozz.getCronetInternalErrorCode());
                    } else if (th instanceof C1494430ozZ) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(th.getClass().getSimpleName());
                        sbLIZ3.append(":");
                        sbLIZ3.append(th.getMessage());
                        sbLIZ3.append(",");
                        C1494430ozZ c1494430ozZ = (C1494430ozZ) th;
                        sbLIZ3.append(c1494430ozZ.getStatusCode());
                        RunnableC1338900kwi.LIZJ(httpResponse, C2188811AlT.LIZIZ(sbLIZ3), c1494430ozZ.getStatusCode(), 0);
                    } else if (th instanceof Exception) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(th.getClass().getSimpleName());
                        sbLIZ4.append(":");
                        sbLIZ4.append(th.getMessage());
                        RunnableC1338900kwi.LIZJ(httpResponse, C2188811AlT.LIZIZ(sbLIZ4), 499, 0);
                    }
                    C1338940kwm.LIZIZ.LIZ();
                    LynxLog.i("NetworkModule", "onRequestFailure");
                    runnableC1338900kwi.LLILLJJLI.LIZ(httpResponse);
                    if (runnableC1338900kwi.LJ() && (c1320210kSZ = runnableC1338900kwi.LLILLL) != null) {
                        c1320210kSZ.LIZLLL(httpResponse.getStatusText());
                        runnableC1338900kwi.LLILLL.LIZJ();
                    }
                }
            });
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException("Unsupported HTTP url. url is not valid.");
        }
    }

    public final boolean LJ() {
        return this.LLILZ || this.LLILZIL;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LynxHttpService$NetTask@19af.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxHttpService$NetTask@19af.run");
    }

    public static byte[] LIZLLL(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
        while (true) {
            int i = bufferedInputStream.read(bArr);
            if (i == -1) {
                bufferedInputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static void LIZIZ(HttpResponse httpResponse, List list) {
        ArrayList arrayList = new ArrayList();
        JavaOnlyMap httpHeaders = httpResponse.getHttpHeaders();
        Iterator it2 = list.iterator();
        String str = "set-cookie";
        while (it2.hasNext()) {
            C080U c080u = (C080U) it2.next();
            if ("set-cookie".equalsIgnoreCase(c080u.LIZ)) {
                str = c080u.LIZ;
                arrayList.add(c080u.LIZIZ);
            } else {
                httpHeaders.putString(c080u.LIZ, c080u.LIZIZ);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder();
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it3.next());
                    if (!it3.hasNext()) {
                        break;
                    } else {
                        sb.append((CharSequence) ", ");
                    }
                }
            }
            httpHeaders.putString(str, sb.toString());
        }
    }

    public RunnableC1338900kwi(HttpRequest httpRequest, AbstractC1338850kwd abstractC1338850kwd, C1320210kSZ c1320210kSZ) {
        this.LL = httpRequest;
        this.LLILLJJLI = abstractC1338850kwd;
        this.LLILLL = c1320210kSZ;
        this.LLILZ = httpRequest.LJFF.getBoolean("useStreaming", false);
        this.LLILZIL = httpRequest.LJFF.getBoolean("enableFetchAPIStandardStreaming", false);
    }

    public static void LIZJ(HttpResponse httpResponse, String str, int i, int i2) {
        httpResponse.LIZIZ = str;
        httpResponse.LIZ = i;
        httpResponse.getCustomInfo().put("clientCode", Integer.valueOf(i2));
        httpResponse.getCustomInfo().put("errorMessage", str);
    }
}
