package X;

import X.C830490Whz;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLContext;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W18, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W18 {
    public final String LIZ;
    public final HttpURLConnection LIZIZ;
    public final C801990Vd7 LIZJ;
    public final C0W19 LIZLLL;
    public final InterfaceC802390Vdl LJ;

    public final C802240VdW LJFF() {
        JSONObject jSONObject;
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getHeaderFields:");
        sbLIZ.append(this.LIZIZ.getHeaderFields());
        C2188811AlT.LIZIZ(sbLIZ);
        C802300Vdc.LIZ();
        int responseCode = this.LIZIZ.getResponseCode();
        C802240VdW c802240VdW = new C802240VdW(responseCode);
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.LIZIZ.getInputStream()));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                arrayList.add(line);
            }
            bufferedReader.close();
            this.LIZIZ.disconnect();
        } else {
            c802240VdW.LIZ = 207;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
        }
        try {
            jSONObject = new JSONObject(sb.toString());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
            c802240VdW.LIZ = 207;
        }
        c802240VdW.LIZIZ(jSONObject);
        try {
            C802230VdV.LJIJI(this.LIZIZ.getURL(), c802240VdW);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c802240VdW.LIZLLL = sb.toString().getBytes();
        return c802240VdW;
    }

    public final void LIZ(C0VSJ c0vsj) {
        C0VSP c0vsp = new C0VSP(c0vsj);
        byte[] bArr = new byte[8192];
        while (true) {
            int i = c0vsp.read(bArr);
            if (i != -1) {
                this.LIZLLL.LIZ.write(bArr, 0, i);
            } else {
                c0vsp.close();
                this.LIZLLL.LIZ.write("\r\n".getBytes());
                return;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0063
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void LIZIZ(java.util.List r13) {
        /*
            r12 = this;
            X.0W19 r0 = r12.LIZLLL
            X.0W1C r0 = r0.LIZIZ
            long r2 = r0.LL
            java.lang.String r7 = "file"
            r4 = 0
            r12.LIZJ(r7, r4)
            X.0W19 r0 = r12.LIZLLL
            java.io.OutputStream r1 = r0.LIZ
            int r0 = r13.size()
            r11 = 0
            r6 = 1
            if (r0 == 0) goto L6e
            java.util.zip.ZipOutputStream r9 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L63
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L63
            java.util.zip.ZipEntry r1 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "/"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L60
            r9.putNextEntry(r1)     // Catch: java.lang.Throwable -> L60
            java.util.Iterator r10 = r13.iterator()     // Catch: java.lang.Throwable -> L60
        L2b:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L6b
            java.lang.Object r1 = r10.next()     // Catch: java.lang.Throwable -> L60
            java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Throwable -> L60
            if (r1 == 0) goto L2b
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L2b
            boolean r0 = r1.isDirectory()     // Catch: java.lang.Throwable -> L60
            if (r0 == 0) goto L4c
            java.io.File[] r8 = r1.listFiles()     // Catch: java.lang.Throwable -> L60
            if (r8 != 0) goto L50
            goto L2b
        L4c:
            java.io.File[] r8 = new java.io.File[r6]     // Catch: java.lang.Throwable -> L60
            r8[r11] = r1     // Catch: java.lang.Throwable -> L60
        L50:
            int r5 = r8.length     // Catch: java.lang.Throwable -> L60
            r4 = 0
        L52:
            if (r4 >= r5) goto L2b
            r1 = r8[r4]     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> L60
            X.C08SE.LJIIJ(r1, r0, r9)     // Catch: java.lang.Throwable -> L60
            int r4 = r4 + 1
            goto L52
        L60:
            r0 = move-exception
            r4 = r9
            goto L64
        L63:
            r0 = move-exception
        L64:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L63
            X.C2112008Pe.LIZ(r4)
            throw r0
        L6b:
            X.C2112008Pe.LIZ(r9)
        L6e:
            X.0W19 r0 = r12.LIZLLL
            java.io.OutputStream r1 = r0.LIZ
            java.lang.String r0 = "\r\n"
            byte[] r0 = r0.getBytes()
            r1.write(r0)
            X.0Vd7 r5 = r12.LIZJ
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r7)
            java.lang.String r0 = "_size"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r4[r11] = r0
            X.0W19 r0 = r12.LIZLLL
            X.0W1C r0 = r0.LIZIZ
            long r0 = r0.LL
            long r0 = r0 - r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4[r6] = r0
            org.json.JSONObject r0 = r5.LIZIZ
            X.C0VJO.LIZ(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W18.LIZIZ(java.util.List):void");
    }

    public final void LJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("\r\n--");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("--");
        sbLIZ.append("\r\n");
        this.LIZLLL.LIZ.write(C2188811AlT.LIZIZ(sbLIZ).getBytes());
        C0W19 c0w19 = this.LIZLLL;
        if (c0w19.LIZJ) {
            C0W1A c0w1a = (C0W1A) c0w19.LIZ;
            c0w1a.LIZIZ();
            c0w1a.LIZ();
        } else {
            C0W1B c0w1b = (C0W1B) c0w19.LIZ;
            c0w1b.flush();
            c0w1b.LIZ();
        }
        C0VJO.LIZ(this.LIZJ.LIZ, "data_type", str);
        C0VJO.LIZ(this.LIZJ.LIZIZ, "total_size", Long.valueOf(this.LIZLLL.LIZIZ.LL));
        this.LIZJ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0W18(String str, boolean z) throws ProtocolException {
        C830490Whz c830490WhzLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AAA");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append("AAA");
        this.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            SSLContext.getInstance("TLS").init(null, null, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) C2204961BRm.e0(new URL(str), new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud8ncmy08WTbVgKhwOdnM/qDRAZsow==", null));
        this.LIZIZ = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("multipart/form-data; boundary=");
        sbLIZ2.append(this.LIZ);
        httpURLConnection.setRequestProperty("Content-Type", C2188811AlT.LIZIZ(sbLIZ2));
        if (z) {
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        }
        try {
            InterfaceC803900VgC interfaceC803900VgC = C0W1D.LIZIZ;
            if (interfaceC803900VgC != null && (c830490WhzLIZ = ((C0W1R) interfaceC803900VgC).LIZ("urlconnection")) != null) {
                for (String str2 : (C830490Whz.c) c830490WhzLIZ.keySet()) {
                    this.LIZIZ.setRequestProperty(str2, (String) c830490WhzLIZ.get(str2));
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        this.LIZLLL = new C0W19(this.LIZIZ.getOutputStream(), z);
        this.LJ = C802300Vdc.LIZLLL;
        this.LIZJ = new C801990Vd7("crash_upload_size");
    }

    public final void LIZJ(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder("--");
        sb.append(this.LIZ);
        sb.append("\r\nContent-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(str);
        sb.append("\"");
        if (map != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                sb.append("; ");
                sb.append((String) entry.getKey());
                sb.append("=\"");
                sb.append((String) entry.getValue());
                sb.append("\"");
            }
        }
        sb.append("\r\nContent-Transfer-Encoding: binary\r\n\r\n");
        C0W19 c0w19 = this.LIZLLL;
        c0w19.LIZ.write(sb.toString().getBytes());
    }

    public final void LIZLLL(String str, String str2, boolean z) {
        long j = this.LIZLLL.LIZIZ.LL;
        try {
            this.LIZLLL.LIZ.write(("--" + this.LIZ + "\r\nContent-Disposition: form-data; name=\"" + str + "\"\r\nContent-Type: text/plain; charset=UTF-8\r\n\r\n").getBytes());
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        byte[] bytes = str2.getBytes();
        if (z) {
            try {
                ((C802340Vdg) this.LJ).getClass();
                bytes = EncryptorUtil.LIZ(bytes.length, bytes);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        try {
            this.LIZLLL.LIZ.write(bytes);
            this.LIZLLL.LIZ.write("\r\n".getBytes());
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C0VJO.LIZ(this.LIZJ.LIZIZ, str.concat("_size"), Long.valueOf(this.LIZLLL.LIZIZ.LL - j));
    }
}
