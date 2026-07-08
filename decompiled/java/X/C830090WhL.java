package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: X.0WhL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C830090WhL implements Closeable {
    public final C0WXS LL;
    public final String LLILLJJLI;
    public final InputStream LLILLL;
    public final long LLILZ;
    public final C830150WhR LLILZIL = new C830150WhR(this);
    public final Map<String, String> LLILZLL = new HashMap();
    public EnumC830230WhZ LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    public final boolean LIZLLL() {
        return "close".equals(LIZIZ("connection"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.LLILLL;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final String LIZIZ(String str) {
        return (String) ((HashMap) this.LLILZLL).get(str.toLowerCase());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.08iA, java.io.OutputStream] */
    public final void LJI(final OutputStream outputStream) {
        long jLJIILL;
        String str;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            if (this.LL != null) {
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new C830140WhQ(this.LLILLJJLI).LIZ())), false);
                printWriter.append((CharSequence) "HTTP/1.1 ").append((CharSequence) this.LL.getDescription()).append((CharSequence) " \r\n");
                String str2 = this.LLILLJJLI;
                if (str2 != null) {
                    LJFF(printWriter, "Content-Type", str2);
                }
                if (LIZIZ("date") == null) {
                    LJFF(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry<String, String> entry : this.LLILZIL.entrySet()) {
                    LJFF(printWriter, entry.getKey(), entry.getValue());
                }
                if (LIZIZ("connection") == null) {
                    if (this.LLJI) {
                        str = "keep-alive";
                    } else {
                        str = "close";
                    }
                    LJFF(printWriter, "Connection", str);
                }
                if (LIZIZ("content-length") != null) {
                    this.LLJ = false;
                }
                if (this.LLJ) {
                    LJFF(printWriter, "Content-Encoding", "gzip");
                    this.LLIZLLLIL = true;
                }
                if (this.LLILLL != null) {
                    jLJIILL = this.LLILZ;
                } else {
                    jLJIILL = 0;
                }
                EnumC830230WhZ enumC830230WhZ = this.LLIZ;
                EnumC830230WhZ enumC830230WhZ2 = EnumC830230WhZ.HEAD;
                if (enumC830230WhZ != enumC830230WhZ2 && this.LLIZLLLIL) {
                    LJFF(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.LLJ) {
                    jLJIILL = LJIILL(jLJIILL, printWriter);
                }
                printWriter.append((CharSequence) "\r\n");
                printWriter.flush();
                if (this.LLIZ != enumC830230WhZ2 && this.LLIZLLLIL) {
                    ?? r3 = new FilterOutputStream(outputStream) { // from class: X.08iA
                        public final void LIZ() {
                            ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
                        }

                        @Override // java.io.FilterOutputStream, java.io.OutputStream
                        public final void write(int i) throws IOException {
                            write(new byte[]{(byte) i}, 0, 1);
                        }

                        @Override // java.io.FilterOutputStream, java.io.OutputStream
                        public final void write(byte[] bArr) throws IOException {
                            write(bArr, 0, bArr.length);
                        }

                        @Override // java.io.FilterOutputStream, java.io.OutputStream
                        public final void write(byte[] bArr, int i, int i2) throws IOException {
                            if (i2 == 0) {
                                return;
                            }
                            ((FilterOutputStream) this).out.write(C786410Ut5.j4("%x\r\n", new Object[]{Integer.valueOf(i2)}).getBytes());
                            ((FilterOutputStream) this).out.write(bArr, i, i2);
                            ((FilterOutputStream) this).out.write("\r\n".getBytes());
                        }
                    };
                    if (this.LLJ) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(r3);
                        LJII(gZIPOutputStream, -1L);
                        gZIPOutputStream.finish();
                    } else {
                        LJII(r3, -1L);
                    }
                    r3.LIZ();
                } else if (this.LLJ) {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    LJII(gZIPOutputStream2, -1L);
                    gZIPOutputStream2.finish();
                } else {
                    LJII(outputStream, jLJIILL);
                }
                outputStream.flush();
                AbstractC830080WhK.LIZJ(this.LLILLL);
                return;
            }
            throw new Error("sendResponse(): Status can't be null.");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC830080WhK.LJIIJ.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
        }
    }

    public final void LIZ(String str, String str2) {
        this.LLILZIL.put(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.io.OutputStream r10, long r11) throws java.io.IOException {
        /*
            r9 = this;
            r2 = 16384(0x4000, double:8.095E-320)
            int r0 = (int) r2
            byte[] r7 = new byte[r0]
            r4 = -1
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r6 = 0
            if (r0 != 0) goto L2f
            r8 = 1
        Ld:
            r4 = 0
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 > 0) goto L28
            if (r8 == 0) goto L31
        L15:
            r4 = 16384(0x4000, double:8.095E-320)
        L17:
            java.io.InputStream r1 = r9.LLILLL
            int r0 = (int) r4
            int r0 = r1.read(r7, r6, r0)
            if (r0 <= 0) goto L31
            r10.write(r7, r6, r0)
            if (r8 != 0) goto Ld
            long r0 = (long) r0
            long r11 = r11 - r0
            goto Ld
        L28:
            if (r8 != 0) goto L15
            long r4 = java.lang.Math.min(r11, r2)
            goto L17
        L2f:
            r8 = 0
            goto Ld
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C830090WhL.LJII(java.io.OutputStream, long):void");
    }

    public final long LJIILL(long j, PrintWriter printWriter) {
        String strLIZIZ = LIZIZ("content-length");
        if (strLIZIZ != null) {
            try {
                j = CastLongProtector.parseLong(strLIZIZ);
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                Logger logger = AbstractC830080WhK.LJIIJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("content-length was no number ");
                sbLIZ.append(strLIZIZ);
                logger.severe(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Content-Length: ");
        sbLIZ2.append(j);
        sbLIZ2.append("\r\n");
        printWriter.print(C2188811AlT.LIZIZ(sbLIZ2));
        return j;
    }

    public static void LJFF(PrintWriter printWriter, String str, String str2) {
        printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
    }

    public C830090WhL(C0WXS c0wxs, String str, InputStream inputStream, long j) {
        boolean z;
        this.LL = c0wxs;
        this.LLILLJJLI = str;
        this.LLILLL = inputStream;
        this.LLILZ = j;
        if (j < 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        this.LLJI = true;
    }
}
