package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.09BH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C09BH extends C08DM {
    /* JADX WARN: Type inference failed for: r2v3, types: [X.09BJ, java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x009a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final byte[] LJ(java.io.File r9) {
        /*
            java.io.FileInputStream r6 = new java.io.FileInputStream
            r6.<init>(r9)
            r5 = 0
            long r3 = r9.length()     // Catch: java.lang.Throwable -> L92
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            java.lang.String r7 = "File "
            if (r0 > 0) goto L71
            int r8 = (int) r3
            byte[] r4 = new byte[r8]     // Catch: java.lang.Throwable -> L92
            r3 = 0
            r2 = r8
            r1 = 0
        L19:
            if (r2 <= 0) goto L24
            int r0 = r6.read(r4, r1, r2)     // Catch: java.lang.Throwable -> L92
            if (r0 < 0) goto L24
            int r2 = r2 - r0
            int r1 = r1 + r0
            goto L19
        L24:
            if (r2 <= 0) goto L2b
            byte[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.lang.Throwable -> L92
            goto L6d
        L2b:
            int r1 = r6.read()     // Catch: java.lang.Throwable -> L92
            r0 = -1
            if (r1 == r0) goto L6d
            X.09BJ r2 = new X.09BJ     // Catch: java.lang.Throwable -> L92
            r2.<init>()     // Catch: java.lang.Throwable -> L92
            r2.write(r1)     // Catch: java.lang.Throwable -> L92
            X.C2106208My.LIZ(r6, r2)     // Catch: java.lang.Throwable -> L92
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L92
            int r0 = r0 + r8
            if (r0 < 0) goto L54
            byte[] r1 = r2.LIZ()     // Catch: java.lang.Throwable -> L92
            byte[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.Throwable -> L92
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L92
            java.lang.System.arraycopy(r1, r3, r4, r8, r0)     // Catch: java.lang.Throwable -> L92
            goto L6d
        L54:
            java.lang.OutOfMemoryError r2 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L92
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L92
            r1.append(r7)     // Catch: java.lang.Throwable -> L92
            r1.append(r9)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = " is too big to fit in memory."
            r1.append(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L92
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L92
            throw r2     // Catch: java.lang.Throwable -> L92
        L6d:
            X.C2107108Nh.LIZ(r6, r5)
            return r4
        L71:
            java.lang.OutOfMemoryError r2 = new java.lang.OutOfMemoryError     // Catch: java.lang.Throwable -> L92
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L92
            r1.append(r7)     // Catch: java.lang.Throwable -> L92
            r1.append(r9)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = " is too big ("
            r1.append(r0)     // Catch: java.lang.Throwable -> L92
            r1.append(r3)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = " bytes) to fit in memory."
            r1.append(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L92
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L92
            throw r2     // Catch: java.lang.Throwable -> L92
        L92:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L9a
            throw r1     // Catch: java.lang.Throwable -> L97
        L97:
            r0 = move-exception
            r5 = r1
            goto L9b
        L9a:
            r0 = move-exception
        L9b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9a
            X.C2107108Nh.LIZ(r6, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09BH.LJ(java.io.File):byte[]");
    }

    public static List LJFF(File file) throws Throwable {
        Charset charset = Charsets.UTF_8;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator<String> it2 = C08KC.LIZIZ(bufferedReader).iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            C2107108Nh.LIZ(bufferedReader, null);
            return arrayList;
        } catch (Throwable th) {
            th = th;
            try {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(bufferedReader, th);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static final String LJI(File file, Charset charset) throws Throwable {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strLIZJ = C08KC.LIZJ(inputStreamReader);
            C2107108Nh.LIZ(inputStreamReader, null);
            return strLIZJ;
        } catch (Throwable th) {
            th = th;
            try {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(inputStreamReader, th);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x0015
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final void LJIIIIZZ(java.io.File r4, byte[] r5) {
        /*
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r4)
            r2 = 0
            r3.write(r5)     // Catch: java.lang.Throwable -> Ld
            X.C2107108Nh.LIZ(r3, r2)
            return
        Ld:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L15
            throw r1     // Catch: java.lang.Throwable -> L12
        L12:
            r0 = move-exception
            r2 = r1
            goto L16
        L15:
            r0 = move-exception
        L16:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L15
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09BH.LJIIIIZZ(java.io.File, byte[]):void");
    }

    public static final void LIZJ(File file, String str, Charset charset) throws Throwable {
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            LJIIJJI(str, fileOutputStream, charset);
            C2107108Nh.LIZ(fileOutputStream, null);
        } catch (Throwable th) {
            th = th;
            try {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(fileOutputStream, th);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static final void LJIIIZ(File file, String str, Charset charset) throws Throwable {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            LJIIJJI(str, fileOutputStream, charset);
            C2107108Nh.LIZ(fileOutputStream, null);
        } catch (Throwable th) {
            th = th;
            try {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    C2107108Nh.LIZ(fileOutputStream, th);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static final void LJIIJJI(String str, OutputStream outputStream, Charset charset) throws IOException {
        boolean z;
        if (str.length() < 16384) {
            outputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())) * 8192);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            str.getChars(i, i3, charBufferAllocate.array(), i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (i3 == str.length()) {
                z = true;
            } else {
                z = false;
            }
            if (charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, z).isUnderflow()) {
                outputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
                if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                    charBufferAllocate.put(0, charBufferAllocate.get());
                } else {
                    i2 = 0;
                }
                charBufferAllocate.clear();
                byteBufferAllocate.clear();
                i = i3;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }
}
