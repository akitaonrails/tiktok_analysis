package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0kSZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1320210kSZ {
    public final String LIZ;
    public final C1299320jus LIZIZ;

    public final void LIZJ() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("event", "onEnd");
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        javaOnlyArray.pushMap(javaOnlyMap);
        this.LIZIZ.LIZ(this.LIZ, javaOnlyArray);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        LIZLLL("errorStreamingMalformedResponse");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.io.InputStream r12) throws java.io.IOException {
        /*
            r11 = this;
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream
            r5.<init>(r12)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
        La:
            int r0 = r5.read()
            r10 = -1
            r9 = 13
            if (r0 == r10) goto L1a
            if (r0 == r9) goto L1a
            char r0 = (char) r0
            r6.append(r0)
            goto La
        L1a:
            r8 = 0
            r7 = 10
            java.lang.String r4 = "errorStreamingMalformedResponse"
            if (r0 != r9) goto L5f
            int r0 = r5.read()
            if (r0 != r7) goto L5f
            java.lang.String r1 = r6.toString()
            r6.setLength(r8)
            r0 = 16
            int r3 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r1, r0)
            if (r3 <= 0) goto L62
            byte[] r2 = new byte[r3]
            r1 = 0
        L39:
            int r0 = r3 - r1
            int r0 = r5.read(r2, r1, r0)
            if (r0 == r10) goto L45
            int r1 = r1 + r0
            if (r1 >= r3) goto L45
            goto L39
        L45:
            if (r1 != r3) goto L53
            int r0 = r5.read()
            if (r0 != r9) goto L53
            int r0 = r5.read()
            if (r0 == r7) goto L58
        L53:
            r11.LIZLLL(r4)
            byte[] r2 = new byte[r8]
        L58:
            int r0 = r2.length
            if (r0 == 0) goto L62
            r11.LIZIZ(r2)
            goto La
        L5f:
            r11.LIZLLL(r4)
        L62:
            r5.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1320210kSZ.LIZ(java.io.InputStream):void");
    }

    public final void LIZIZ(byte[] bArr) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("event", "onData");
        javaOnlyMap.putByteArray("data", bArr);
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        javaOnlyArray.pushMap(javaOnlyMap);
        this.LIZIZ.LIZ(this.LIZ, javaOnlyArray);
    }

    public final void LIZLLL(String str) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("event", "onError");
        javaOnlyMap.putString("error", str);
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        javaOnlyArray.pushMap(javaOnlyMap);
        this.LIZIZ.LIZ(this.LIZ, javaOnlyArray);
    }

    public final void LJ(InputStream inputStream) throws Throwable {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i != -1) {
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    LIZIZ(bArr2);
                } else {
                    bufferedInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            th = th;
            try {
                TryCatchGuardChecker.doCheck(th);
                try {
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            break;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    if (th != null) {
                        try {
                            bufferedInputStream.close();
                            throw th;
                        } catch (Throwable th4) {
                            TryCatchGuardChecker.doCheck(th4);
                            th.addSuppressed(th4);
                            throw th;
                        }
                    }
                    bufferedInputStream.close();
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                th = null;
            }
        }
    }

    public final void LJFF(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = -1;
            boolean z = false;
            while (true) {
                int i2 = inputStream.read();
                if (i2 != -1) {
                    byteArrayOutputStream.write(i2);
                    if (i2 == 13) {
                        if (!z) {
                            z = true;
                        } else {
                            i = -1;
                        }
                    } else if (i != 10 || i2 != 10) {
                        z = false;
                        i = i2;
                    }
                } else {
                    return;
                }
            }
            LIZIZ(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.reset();
        }
    }

    public C1320210kSZ(String str, C1299320jus c1299320jus) {
        this.LIZ = str;
        this.LIZIZ = c1299320jus;
    }
}
