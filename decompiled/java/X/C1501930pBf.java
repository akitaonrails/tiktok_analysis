package X;

import android.app.job.JobParameters;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.memdump.data.DataBean;
import com.bytedance.memdump.data.HeaderBean;
import com.bytedance.memdump.upload.HprofUploadJobService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501930pBf {
    public static C1501940pBg LIZ(File file, String str) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new C0VSF(file));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line != null) {
                        sb.append(line);
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    TryCatchGuardChecker.doCheck(th);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            throw th;
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            throw th;
                        }
                    }
                    throw th;
                }
            }
            bufferedReader2.close();
            try {
                JSONObject jSONObject = new JSONObject(sb.toString());
                String strOptString = jSONObject.optString("app_version");
                String strOptString2 = jSONObject.optString("update_version_code");
                String strOptString3 = jSONObject.optString("current_update_version_code");
                String strOptString4 = jSONObject.optString("release_build");
                String strOptString5 = jSONObject.optString("version_name");
                String strOptString6 = jSONObject.optString("version_code");
                String strOptString7 = jSONObject.optString("process_name");
                if (TextUtils.isEmpty(str)) {
                    str = jSONObject.optString("channel");
                }
                long jOptLong = jSONObject.optLong("event_time");
                String strOptString8 = jSONObject.optString("activity");
                jSONObject.optString("access");
                String strOptString9 = jSONObject.optString("exception_type");
                C1501960pBi c1501960pBi = new C1501960pBi();
                c1501960pBi.LIZ = strOptString;
                c1501960pBi.LIZIZ = strOptString2;
                c1501960pBi.LJ = strOptString5;
                c1501960pBi.LJFF = strOptString6;
                c1501960pBi.LIZJ = strOptString3;
                c1501960pBi.LIZLLL = strOptString4;
                c1501960pBi.LJI = strOptString7;
                c1501960pBi.LJII = str;
                c1501960pBi.LJIIIIZZ = jOptLong;
                c1501960pBi.LJIIIZ = strOptString8;
                c1501960pBi.LJIIJ = strOptString9;
                return new C1501940pBg(c1501960pBi);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static void LIZJ(C2406409bq c2406409bq, File file, String str, HprofUploadJobService hprofUploadJobService, JobParameters jobParameters) {
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: X.09bk
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.endsWith(".info");
            }
        });
        if (fileArrListFiles != null && fileArrListFiles.length == 1) {
            File[] fileArrListFiles2 = file.listFiles(new FilenameFilter() { // from class: X.0pBj
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return str2.endsWith(".zip");
                }
            });
            if (fileArrListFiles2 != null && fileArrListFiles2.length == 1) {
                File file2 = fileArrListFiles[0];
                try {
                    C1501940pBg c1501940pBgLIZ = LIZ(file2, str);
                    File file3 = fileArrListFiles2[0];
                    try {
                        if (c2406409bq.LIZ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("uploadSingleHprofZipFileWithAppInfo: ");
                            sbLIZ.append(file3.getAbsolutePath());
                            C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        LIZIZ(c2406409bq, file3, file, c1501940pBgLIZ, hprofUploadJobService, jobParameters);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (c2406409bq.LIZ) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Failed to upload zip file: ");
                            sbLIZ2.append(file3.getName());
                            sbLIZ2.append(", error: ");
                            sbLIZ2.append(th.getMessage());
                            C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ2));
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    if (c2406409bq.LIZ) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Failed to read info file: ");
                        sbLIZ3.append(file2.getName());
                        sbLIZ3.append(", error: ");
                        sbLIZ3.append(th2.getMessage());
                        C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    C2223108nN.LIZ(file);
                    return;
                }
            }
            if (c2406409bq.LIZ) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("hprof file error in directory: ");
                sbLIZ4.append(file.getName());
                C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ4));
            }
            C2223108nN.LIZ(file);
            return;
        }
        if (c2406409bq.LIZ) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("info file error in directory: ");
            sbLIZ5.append(file.getName());
            C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ5));
        }
        C2223108nN.LIZ(file);
    }

    public static void LIZIZ(C2406409bq c2406409bq, final File file, File file2, C1501940pBg c1501940pBg, HprofUploadJobService hprofUploadJobService, JobParameters jobParameters) {
        if (file.exists() && file.length() != 0) {
            DataBean dataBean = new DataBean("memory_object_monitor", c1501940pBg.LJIIIIZZ);
            if (C1501950pBh.LIZLLL == null) {
                C1501950pBh.LIZLLL = new C1501950pBh(C08M4.LIZ);
            }
            C1501950pBh c1501950pBh = C1501950pBh.LIZLLL;
            HashMap map = new HashMap();
            map.put("aid", String.valueOf(c1501950pBh.LIZ));
            map.put("device_id", c1501950pBh.LIZIZ);
            map.put("os_version", Build.VERSION.RELEASE);
            map.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
            map.put("device_model", Build.BRAND);
            map.put("device_brand", Build.MODEL);
            map.put("device_manufacturer", Build.MANUFACTURER);
            map.put("region", "xx");
            map.put("device_platform", "android");
            map.put("package", c1501950pBh.LIZJ);
            map.put("rom", "xx");
            map.put("access", "");
            map.put("is_background", "1");
            map.put("is_64_runtime", "true");
            map.put("cpu_abi", "");
            map.put("app_version", c1501940pBg.LIZ);
            map.put("update_version_code", c1501940pBg.LIZIZ);
            map.put("current_update_version_code", c1501940pBg.LIZJ);
            map.put("version_name", c1501940pBg.LJ);
            map.put("version_code", c1501940pBg.LJFF);
            map.put("release_build", c1501940pBg.LIZLLL);
            map.put("process_name", c1501940pBg.LJI);
            String str = c1501940pBg.LJII;
            map.put("channel", str);
            map.put("current_activity", c1501940pBg.LJIIIZ);
            map.put("exception_type", c1501940pBg.LJIIJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getQueryParamsMap channel:");
            sbLIZ.append(str);
            C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ));
            HeaderBean headerBeanLIZ = C794290VDv.LIZ(map);
            ArrayList arrayList = new ArrayList();
            String name = file.getName();
            final C0X0P c0x0p = C0X7A.LJFF;
            arrayList.add(C0X76.LIZIZ("file", name, new AbstractC842530X3j() { // from class: X.0p2f
                @Override // X.AbstractC842530X3j
                public final long LIZ() {
                    return file.length();
                }

                @Override // X.AbstractC842530X3j
                public final C0X0P LIZIZ() {
                    return c0x0p;
                }

                @Override // X.AbstractC842530X3j
                public final void LJ(InterfaceC1496780p3M interfaceC1496780p3M) {
                    try {
                        C1496340p2e c1496340p2eLIZIZ = C1496330p2d.LIZIZ(file);
                        try {
                            C1496690p3D c1496690p3D = new C1496690p3D();
                            for (long j = c1496340p2eLIZIZ.read(c1496690p3D, 2048L); j != -1; j = c1496340p2eLIZIZ.read(c1496690p3D, 2048L)) {
                                interfaceC1496780p3M.LLFF(c1496690p3D, j);
                            }
                            interfaceC1496780p3M.flush();
                            c1496340p2eLIZIZ.close();
                        } finally {
                            th = th;
                            try {
                                try {
                                } catch (Throwable th) {
                                    while (true) {
                                        try {
                                            break;
                                        } catch (Throwable th2) {
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }));
            arrayList.add(C0X76.LIZIZ("header", null, AbstractC842530X3j.LIZJ(null, GsonProtectorUtils.toJson(new Gson(), headerBeanLIZ))));
            arrayList.add(C0X76.LIZIZ("data", null, AbstractC842530X3j.LIZJ(null, GsonProtectorUtils.toJson(new Gson(), dataBean))));
            if (hprofUploadJobService != null) {
                hprofUploadJobService.LL.incrementAndGet();
            }
            C1501800pBS c1501800pBS = new C1501800pBS();
            final C2405909bl c2405909bl = new C2405909bl(c2406409bq, file2, hprofUploadJobService, jobParameters);
            C1501920pBe c1501920pBe = new C1501920pBe();
            c1501920pBe.LIZIZ("https://api-va.tiktokv.com/monitor/collect/c/mom_dump_collect/");
            c1501920pBe.LIZJ(c1501800pBS.LIZ);
            final Gson gson = new Gson();
            c1501920pBe.LIZ(new AbstractC1501440pAs(gson) { // from class: X.0pAx
                public final Gson LIZ;

                {
                    this.LIZ = gson;
                }

                @Override // X.AbstractC1501440pAs
                public final InterfaceC1501650pBD<AbstractC842510X3h, ?> responseBodyConverter(Type type, Annotation[] annotationArr, C1501450pAt c1501450pAt) {
                    final TypeAdapter typeAdapterLJIIIZ = this.LIZ.LJIIIZ(TypeToken.get(type));
                    final Gson gson2 = this.LIZ;
                    return new InterfaceC1501650pBD<AbstractC842510X3h, T>(gson2, typeAdapterLJIIIZ) { // from class: X.0pB0
                        public final Gson LIZ;
                        public final TypeAdapter<T> LIZIZ;

                        @Override // X.InterfaceC1501650pBD
                        public final Object LIZ(AbstractC842510X3h abstractC842510X3h) {
                            AbstractC842510X3h abstractC842510X3h2 = abstractC842510X3h;
                            C09CU c09cuLJIIL = this.LIZ.LJIIL(abstractC842510X3h2.charStream());
                            try {
                                T t = this.LIZIZ.read(c09cuLJIIL);
                                if (c09cuLJIIL.LJJLIIIJ() == C09D6.END_DOCUMENT) {
                                    abstractC842510X3h2.close();
                                    return t;
                                }
                                throw new l("JSON document was not fully consumed.");
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                abstractC842510X3h2.close();
                                throw th;
                            }
                        }

                        {
                            this.LIZ = gson2;
                            this.LIZIZ = typeAdapterLJIIIZ;
                        }
                    };
                }

                @Override // X.AbstractC1501440pAs
                public final InterfaceC1501650pBD<?, AbstractC842530X3j> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C1501450pAt c1501450pAt) {
                    return new InterfaceC1501650pBD<T, AbstractC842530X3j>(this.LIZ, this.LIZ.LJIIIZ(TypeToken.get(type))) { // from class: X.0p9f
                        public static final C0X0P LIZJ = C0X0P.LIZIZ("application/json; charset=UTF-8");
                        public static final Charset LIZLLL = Charset.forName("UTF-8");
                        public final Gson LIZ;
                        public final TypeAdapter<T> LIZIZ;

                        @Override // X.InterfaceC1501650pBD
                        public final AbstractC842530X3j LIZ(Object obj) throws IOException {
                            C1496690p3D c1496690p3D = new C1496690p3D();
                            C09DL c09dlLJIILIIL = this.LIZ.LJIILIIL(new OutputStreamWriter(new C1496790p3N(c1496690p3D), LIZLLL));
                            this.LIZIZ.write(c09dlLJIILIIL, obj);
                            c09dlLJIILIIL.close();
                            return new C0X8G(LIZJ, c1496690p3D.LJIJJ());
                        }

                        {
                            this.LIZ = gson;
                            this.LIZIZ = typeAdapter;
                        }
                    };
                }
            });
            if (c2406409bq.LIZ) {
                c1501920pBe.LJFF = C786410Ut5.h4();
            }
            InterfaceC1501750pBN<AbstractC842510X3h> interfaceC1501750pBNUpload = ((InterfaceC1501670pBF) C2204961BRm.l0(c1501920pBe, new C0WZX("dzBzEgAjS8/YVFkiQFyJY1ijT845PLaACxHLp5cV5EA8C3oiuIehVJorDJKMHOAZZwU=", null)).LIZIZ(InterfaceC1501670pBF.class)).upload("https://api-va.tiktokv.com/monitor/collect/c/mom_dump_collect/", arrayList);
            if (c2406409bq.LIZ) {
                final C1500770p9n[] c1500770p9nArr = new C1500770p9n[1];
                final Throwable[] thArr = new Throwable[1];
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                interfaceC1501750pBNUpload.LLIIIJ(new InterfaceC1500240p8w<AbstractC842510X3h>() { // from class: X.0pBQ
                    @Override // X.InterfaceC1500240p8w
                    public final void onFailure(InterfaceC1501750pBN<AbstractC842510X3h> interfaceC1501750pBN, Throwable th) {
                        thArr[0] = th;
                        countDownLatch.countDown();
                    }

                    @Override // X.InterfaceC1500240p8w
                    public final void onResponse(InterfaceC1501750pBN<AbstractC842510X3h> interfaceC1501750pBN, C1500770p9n<AbstractC842510X3h> c1500770p9n) {
                        c1500770p9nArr[0] = c1500770p9n;
                        countDownLatch.countDown();
                    }
                });
                try {
                    countDownLatch.await(c2406409bq.LIZIZ, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1500770p9n c1500770p9n = c1500770p9nArr[0];
                if (c1500770p9n != null) {
                    c2405909bl.LIZIZ(c1500770p9n.toString(), c1500770p9nArr[0].LIZ());
                    return;
                }
                Throwable th = thArr[0];
                if (th != null) {
                    c2405909bl.LIZ(th);
                    return;
                } else {
                    c2405909bl.LIZ(new TimeoutException("Request timeout"));
                    return;
                }
            }
            interfaceC1501750pBNUpload.LLIIIJ(new InterfaceC1500240p8w<AbstractC842510X3h>() { // from class: X.0pBP
                @Override // X.InterfaceC1500240p8w
                public final void onFailure(InterfaceC1501750pBN<AbstractC842510X3h> interfaceC1501750pBN, Throwable th2) {
                    ((C2405909bl) c2405909bl).LIZ(th2);
                }

                @Override // X.InterfaceC1500240p8w
                public final void onResponse(InterfaceC1501750pBN<AbstractC842510X3h> interfaceC1501750pBN, C1500770p9n<AbstractC842510X3h> c1500770p9n2) {
                    ((C2405909bl) c2405909bl).LIZIZ(c1500770p9n2.toString(), c1500770p9n2.LIZ());
                }
            });
        }
    }
}
