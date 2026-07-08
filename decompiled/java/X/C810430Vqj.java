package X;

import Y.ARunnableS113S0100000_13;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ug.bus.UgCallbackCenter;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.0Vqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810430Vqj {
    /* JADX WARN: Type inference failed for: r0v69, types: [X.0Vqq] */
    /* JADX WARN: Type inference failed for: r0v70, types: [X.0WAc] */
    /* JADX WARN: Type inference failed for: r0v71, types: [X.0Vqn] */
    public static C809220Vom LIZ() {
        C809240Voo c809240Voo = new C809240Voo();
        C844470XAv.LIZ.getClass();
        c809240Voo.LIZ = C844470XAv.LJIIJ;
        String str = C844470XAv.LJ;
        if (str == null) {
            str = null;
        }
        c809240Voo.LJFF = str;
        c809240Voo.LJ = C844470XAv.LJIILL;
        c809240Voo.LIZLLL = (int) C844470XAv.LIZLLL();
        c809240Voo.LIZIZ = (int) C844470XAv.LJ();
        c809240Voo.LIZJ = C844470XAv.LJFF();
        C810440Vqk c810440Vqk = new C810440Vqk((Application) C844470XAv.LIZ(), c809240Voo);
        c810440Vqk.LIZIZ = false;
        c810440Vqk.LJIILL = true;
        c810440Vqk.LJIILJJIL = new InterfaceC809060VoW() { // from class: X.0Vz8
            @Override // X.InterfaceC809060VoW
            public final List<String> LIZJ() {
                InterfaceC815680VzC interfaceC815680VzC = (InterfaceC815680VzC) C808470VnZ.LIZ(InterfaceC815680VzC.class);
                if (interfaceC815680VzC == null) {
                    return null;
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final ArrayList arrayList = new ArrayList();
                interfaceC815680VzC.LJIJJLI(new InterfaceC815690VzD() { // from class: X.0VzB
                    @Override // X.InterfaceC815690VzD
                    public final void LIZ(List<C1895307bb> list) {
                        Iterator it2 = ((ArrayList) list).iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((C1895307bb) it2.next()).LIZIZ);
                        }
                        countDownLatch.countDown();
                    }
                });
                try {
                    countDownLatch.await();
                    return arrayList;
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return arrayList;
                }
            }

            @Override // X.InterfaceC809060VoW
            public final String getSecUid() {
                C0XQ7.LJ();
                return C0XQ7.LIZ.LJIIJ().getCurSecUserId();
            }

            @Override // X.InterfaceC809060VoW
            public final void LIZ(C809100Voa c809100Voa) {
                UgCallbackCenter.LIZIZ(null, c809100Voa);
            }

            @Override // X.InterfaceC809060VoW
            public final void LIZIZ(C809110Vob c809110Vob) {
                UgCallbackCenter.LIZIZ(null, c809110Vob);
            }

            @Override // X.InterfaceC809060VoW
            public final void LIZLLL(C809090VoZ c809090VoZ) {
                boolean zLJI = MethodIDManager.LJI(72078);
                UgCallbackCenter.LIZIZ(null, c809090VoZ);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }
        };
        new C2115308Ql();
        c810440Vqk.LIZJ = C2162308dZ.LIZ(C844470XAv.LIZ());
        c810440Vqk.LIZLLL = new C810460Vqm("");
        c810440Vqk.LJIIJ = new InterfaceC808710Vnx() { // from class: X.0Vqo
        };
        c810440Vqk.LJI = new InterfaceC810510Vqr() { // from class: X.0Vql
        };
        c810440Vqk.LJFF = new C808750Vo1();
        c810440Vqk.LJIIIIZZ = new C812910Vuj();
        InterfaceC808630Vnp interfaceC808630Vnp = new InterfaceC808630Vnp() { // from class: X.0Vnf
            @Override // X.InterfaceC808630Vnp
            public final void LIZ(Context context, Map<String, String> map) {
            }

            @Override // X.InterfaceC808640Vnq
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC808630Vnp
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC808640Vnq
            public final void LJ(Intent intent) {
            }

            @Override // X.InterfaceC808640Vnq
            public final void LJFF(Context context) {
            }

            @Override // X.InterfaceC808630Vnp
            public final void LIZJ(Context context, C809130Vod c809130Vod) {
                String strLIZ;
                if (!C0V4R.LJII(context) && (strLIZ = C2162308dZ.LIZ(context)) != null && strLIZ.endsWith(":push")) {
                    C0V4R.LIZ = Boolean.FALSE;
                    try {
                        C808510Vnd.LIZ().LIZJ(new ARunnableS113S0100000_13(c809130Vod, 199));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
        };
        if (!((ArrayList) c810440Vqk.LJ).contains(interfaceC808630Vnp)) {
            ((ArrayList) c810440Vqk.LJ).add(interfaceC808630Vnp);
        }
        c810440Vqk.LJIIJJI = new InterfaceC809250Vop() { // from class: X.0Vqp
        };
        C809240Voo c809240Voo2 = c810440Vqk.LJIILIIL;
        if (c809240Voo2 == null) {
            c810440Vqk.LIZ("appinfo is null");
        } else {
            if (c809240Voo2.LIZ <= 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" aid {");
                sbLIZ.append(c809240Voo2.LIZ);
                sbLIZ.append("} is invalid");
                c810440Vqk.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (TextUtils.isEmpty(c809240Voo2.LJFF)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("appName {");
                sbLIZ2.append(c809240Voo2.LJFF);
                sbLIZ2.append("} is invalid");
                c810440Vqk.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (TextUtils.isEmpty(c809240Voo2.LIZJ)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("versionName {");
                sbLIZ3.append(c809240Voo2.LIZJ);
                sbLIZ3.append("} is invalid");
                c810440Vqk.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (c809240Voo2.LIZIZ <= 0) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("versionCode {");
                sbLIZ4.append(c809240Voo2.LIZIZ);
                sbLIZ4.append("} is invalid");
                c810440Vqk.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            }
            if (c809240Voo2.LIZLLL <= 0) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("updateVersionCode {");
                sbLIZ5.append(c809240Voo2.LIZLLL);
                sbLIZ5.append("} is invalid");
                c810440Vqk.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
            }
            if (TextUtils.isEmpty(c809240Voo2.LJ)) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("channel {");
                sbLIZ6.append(c809240Voo2.LJ);
                sbLIZ6.append("} is invalid");
                c810440Vqk.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
            }
        }
        if (c810440Vqk.LJFF == null) {
            c810440Vqk.LIZ("please implement the event callback");
        }
        if (c810440Vqk.LJIIJ == null) {
            c810440Vqk.LIZ("click event listener is null, you'll not receive the event when user click notifications.Please implement it.");
        }
        if (TextUtils.isEmpty(c810440Vqk.LIZJ)) {
            c810440Vqk.LIZJ = C2162308dZ.LIZ(c810440Vqk.LIZ);
        }
        if (c810440Vqk.LJII == null) {
            c810440Vqk.LJII = new InterfaceC808890VoF() { // from class: X.0Vqn
            };
        }
        if (c810440Vqk.LJIIIZ == null) {
            c810440Vqk.LJIIIZ = new InterfaceC810600Vr0() { // from class: X.0WAc
                public static Bitmap LIZJ(C810610Vr1 c810610Vr1) throws IOException {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) C2204961BRm.e0(new URL(c810610Vr1.LIZ.toString()), new C0WZX("dzBzEgAjS8/YVFkiQFyUc9fIAyBt5Yu8zFelKxJ2XjjnhQxI7t/VinnOhv3Xng==", null));
                    httpURLConnection.setConnectTimeout(15000);
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.setUseCaches(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 300) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (inputStream == null) {
                            return null;
                        }
                        try {
                            if (httpURLConnection.getHeaderFieldInt("Content-Length", -1) != 0) {
                                try {
                                    Bitmap bitmapLIZIZ = LIZIZ(inputStream, c810610Vr1);
                                    C2260008tK.LIZ(inputStream);
                                    return bitmapLIZIZ;
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C2260008tK.LIZ(inputStream);
                                    return null;
                                }
                            }
                            C2260008tK.LIZ(inputStream);
                            throw new IOException("Received response with 0 content-length header.");
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C2260008tK.LIZ(inputStream);
                            throw th;
                        }
                    }
                    httpURLConnection.disconnect();
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append(responseCode);
                    sbLIZ7.append(" ");
                    sbLIZ7.append(httpURLConnection.getResponseMessage());
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ7));
                }

                @Override // X.InterfaceC810600Vr0
                public final Bitmap LIZ(C810610Vr1 c810610Vr1) {
                    try {
                        return LIZJ(c810610Vr1);
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return null;
                    }
                }

                /* JADX WARN: Type inference failed for: r6v0, types: [X.0WAd, java.io.InputStream] */
                public static Bitmap LIZIZ(final InputStream inputStream, C810610Vr1 c810610Vr1) throws IOException {
                    boolean z;
                    ?? r6 = new InputStream(inputStream) { // from class: X.0WAd
                        public final InputStream LL;
                        public long LLILLJJLI;
                        public long LLILLL;
                        public long LLILZ;
                        public long LLILZIL = -1;

                        @Override // java.io.InputStream
                        public final int available() {
                            return this.LL.available();
                        }

                        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                        public final void close() throws IOException {
                            this.LL.close();
                        }

                        @Override // java.io.InputStream
                        public final boolean markSupported() {
                            return this.LL.markSupported();
                        }

                        @Override // java.io.InputStream
                        public final int read() throws IOException {
                            int i = this.LL.read();
                            if (i != -1) {
                                this.LLILLJJLI++;
                            }
                            return i;
                        }

                        @Override // java.io.InputStream
                        public final void reset() {
                            LIZIZ(this.LLILZIL);
                        }

                        {
                            this.LL = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                        }

                        public final void LIZIZ(long j) {
                            if (this.LLILLJJLI <= this.LLILZ && j >= this.LLILLL) {
                                this.LL.reset();
                                LIZ(this.LLILLL, j);
                                this.LLILLJJLI = j;
                                return;
                            }
                            throw new IOException("reset failed");
                        }

                        public final long LIZLLL(int i) {
                            long j = this.LLILLJJLI;
                            long j2 = ((long) i) + j;
                            long j3 = this.LLILZ;
                            if (j3 < j2) {
                                try {
                                    if (this.LLILLL >= j || j > j3) {
                                        this.LLILLL = j;
                                        this.LL.mark((int) (j2 - j));
                                    } else {
                                        this.LL.reset();
                                        this.LL.mark((int) (j2 - this.LLILLL));
                                        LIZ(this.LLILLL, this.LLILLJJLI);
                                    }
                                    this.LLILZ = j2;
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append("set index failed: ");
                                    sbLIZ7.append(th);
                                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ7));
                                }
                            }
                            return this.LLILLJJLI;
                        }

                        @Override // java.io.InputStream
                        public final void mark(int i) {
                            this.LLILZIL = LIZLLL(i);
                        }

                        @Override // java.io.InputStream
                        public final int read(byte[] bArr) {
                            int i = this.LL.read(bArr);
                            if (i != -1) {
                                this.LLILLJJLI += (long) i;
                            }
                            return i;
                        }

                        @Override // java.io.InputStream
                        public final long skip(long j) throws IOException {
                            long jSkip = this.LL.skip(j);
                            this.LLILLJJLI += jSkip;
                            return jSkip;
                        }

                        public final void LIZ(long j, long j2) throws IOException {
                            while (j < j2) {
                                long jSkip = this.LL.skip(j2 - j);
                                if (jSkip == 0) {
                                    if (read() != -1) {
                                        jSkip = 1;
                                    } else {
                                        return;
                                    }
                                }
                                j += jSkip;
                            }
                        }

                        @Override // java.io.InputStream
                        public final int read(byte[] bArr, int i, int i2) throws IOException {
                            int i3 = this.LL.read(bArr, i, i2);
                            if (i3 != -1) {
                                this.LLILLJJLI += (long) i3;
                            }
                            return i3;
                        }
                    };
                    long jLIZLLL = r6.LIZLLL(65536);
                    c810610Vr1.getClass();
                    byte[] bArr = new byte[12];
                    if (r6.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    r6.LIZIZ(jLIZLLL);
                    if (z) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr2 = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                        while (true) {
                            int i = r6.read(bArr2);
                            if (-1 != i) {
                                byteArrayOutputStream.write(bArr2, 0, i);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null);
                            }
                        }
                    } else {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(r6, null, null);
                        if (bitmapDecodeStream != null) {
                            return bitmapDecodeStream;
                        }
                        throw new IOException("Failed to decode stream.");
                    }
                }
            };
        }
        if (c810440Vqk.LJIIL == null) {
            c810440Vqk.LJIIL = new Object() { // from class: X.0Vqq
            };
        }
        if (c810440Vqk.LJIILJJIL == null) {
            c810440Vqk.LJIILJJIL = new InterfaceC809060VoW() { // from class: X.0Vz9
                @Override // X.InterfaceC809060VoW
                public final List<String> LIZJ() {
                    InterfaceC815680VzC interfaceC815680VzC = (InterfaceC815680VzC) C808470VnZ.LIZ(InterfaceC815680VzC.class);
                    if (interfaceC815680VzC == null) {
                        return null;
                    }
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final ArrayList arrayList = new ArrayList();
                    interfaceC815680VzC.LJIJJLI(new InterfaceC815690VzD() { // from class: X.0VzA
                        @Override // X.InterfaceC815690VzD
                        public final void LIZ(List<C1895307bb> list) {
                            Iterator it2 = ((ArrayList) list).iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((C1895307bb) it2.next()).LIZIZ);
                            }
                            countDownLatch.countDown();
                        }
                    });
                    try {
                        countDownLatch.await();
                        return arrayList;
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return arrayList;
                    }
                }

                @Override // X.InterfaceC809060VoW
                public final String getSecUid() {
                    InterfaceC815680VzC interfaceC815680VzC = (InterfaceC815680VzC) C808470VnZ.LIZ(InterfaceC815680VzC.class);
                    if (interfaceC815680VzC == null) {
                        return null;
                    }
                    return interfaceC815680VzC.getSecUid();
                }

                @Override // X.InterfaceC809060VoW
                public final void LIZ(C809100Voa c809100Voa) {
                    UgCallbackCenter.LIZIZ(null, c809100Voa);
                }

                @Override // X.InterfaceC809060VoW
                public final void LIZIZ(C809110Vob c809110Vob) {
                    UgCallbackCenter.LIZIZ(null, c809110Vob);
                }

                @Override // X.InterfaceC809060VoW
                public final void LIZLLL(C809090VoZ c809090VoZ) {
                    UgCallbackCenter.LIZIZ(null, c809090VoZ);
                }
            };
        }
        C810570Vqx c810570Vqx = new C810570Vqx(c810440Vqk.LJI, c810440Vqk.LJIIIZ);
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("debuggable = ");
        sbLIZ7.append(c810440Vqk.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ7);
        if (c810440Vqk.LIZIZ) {
            C809240Voo c809240Voo3 = c810440Vqk.LJIILIIL;
            if (c809240Voo3 != null) {
                c809240Voo3.toString();
            }
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("process:\t");
            sbLIZ8.append(c810440Vqk.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ8);
        }
        return new C809220Vom(c810440Vqk.LIZ, c810440Vqk.LJIILIIL, c810440Vqk.LIZIZ, c810440Vqk.LIZJ, c810440Vqk.LIZLLL, c810440Vqk.LJ, c810440Vqk.LJFF, c810570Vqx, c810440Vqk.LJII, c810440Vqk.LJIIIIZZ, c810440Vqk.LJIIJ, c810440Vqk.LJIIJJI, c810440Vqk.LJIILJJIL, c810440Vqk);
    }
}
