package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okio.ByteString;
import xlp.c;

/* JADX INFO: renamed from: X.0X3h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC842510X3h implements Closeable {
    public Reader reader;

    public abstract long contentLength();

    public abstract C0X0P contentType();

    public abstract InterfaceC1496620p36 source();

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        final InterfaceC1496620p36 interfaceC1496620p36Source = source();
        final Charset charset = charset();
        Reader reader2 = new Reader(interfaceC1496620p36Source, charset) { // from class: X.0X3i
            public final InterfaceC1496620p36 LL;
            public final Charset LLILLJJLI;
            public boolean LLILLL;
            public Reader LLILZ;

            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                this.LLILLL = true;
                Reader reader3 = this.LLILZ;
                if (reader3 != null) {
                    reader3.close();
                } else {
                    this.LL.close();
                }
            }

            {
                this.LL = interfaceC1496620p36Source;
                this.LLILLJJLI = charset;
            }

            @Override // java.io.Reader
            public final int read(char[] cArr, int i, int i2) throws IOException {
                if (!this.LLILLL) {
                    Reader inputStreamReader = this.LLILZ;
                    if (inputStreamReader == null) {
                        inputStreamReader = new InputStreamReader(this.LL.LJJIJIIJIL(), c.LIZIZ(this.LL, this.LLILLJJLI));
                        this.LLILZ = inputStreamReader;
                    }
                    return inputStreamReader.read(cArr, i, i2);
                }
                throw new IOException("Stream closed");
            }
        };
        this.reader = reader2;
        return reader2;
    }

    private Charset charset() {
        C0X0P c0x0pContentType = contentType();
        return c0x0pContentType != null ? c0x0pContentType.LIZ(c.LJIIIIZZ) : c.LJIIIIZZ;
    }

    public final InputStream byteStream() {
        return source().LJJIJIIJIL();
    }

    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Cannot buffer entire body for content length: ");
            sbLIZ.append(jContentLength);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
        InterfaceC1496620p36 interfaceC1496620p36Source = source();
        try {
            byte[] bArrLJZL = interfaceC1496620p36Source.LJZL();
            c.LJ(interfaceC1496620p36Source);
            if (jContentLength == -1 || jContentLength == bArrLJZL.length) {
                return bArrLJZL;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Content-Length (");
            sbLIZ2.append(jContentLength);
            sbLIZ2.append(") and stream length (");
            sbLIZ2.append(bArrLJZL.length);
            sbLIZ2.append(") disagree");
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c.LJ(interfaceC1496620p36Source);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c.LJ(source());
    }

    public final String string() {
        InterfaceC1496620p36 interfaceC1496620p36Source = source();
        try {
            String strLJJLIIIJILLIZJL = interfaceC1496620p36Source.LJJLIIIJILLIZJL(c.LIZIZ(interfaceC1496620p36Source, charset()));
            c.LJ(interfaceC1496620p36Source);
            return strLJJLIIIJILLIZJL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c.LJ(interfaceC1496620p36Source);
            throw th;
        }
    }

    public static AbstractC842510X3h create(C0X0P c0x0p, String str) {
        Charset charset = c.LJIIIIZZ;
        if (c0x0p != null) {
            Charset charsetLIZ = c0x0p.LIZ(null);
            if (charsetLIZ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0x0p);
                sbLIZ.append("; charset=utf-8");
                c0x0p = C0X0P.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                charset = charsetLIZ;
            }
        }
        C1496690p3D c1496690p3D = new C1496690p3D();
        c1496690p3D.LJLIIIL(0, str.length(), str, charset);
        return create(c0x0p, c1496690p3D.LLILLJJLI, c1496690p3D);
    }

    public static AbstractC842510X3h create(C0X0P c0x0p, ByteString byteString) {
        C1496690p3D c1496690p3D = new C1496690p3D();
        byteString.write$jvm(c1496690p3D);
        return create(c0x0p, byteString.size(), c1496690p3D);
    }

    public static AbstractC842510X3h create(C0X0P c0x0p, byte[] bArr) {
        C1496690p3D c1496690p3D = new C1496690p3D();
        c1496690p3D.LJJJLL(0, bArr, bArr.length);
        return create(c0x0p, bArr.length, c1496690p3D);
    }

    public static AbstractC842510X3h create(final C0X0P c0x0p, final long j, final InterfaceC1496620p36 interfaceC1496620p36) {
        if (interfaceC1496620p36 != null) {
            return new AbstractC842510X3h() { // from class: X.0X26
                @Override // X.AbstractC842510X3h
                public final long contentLength() {
                    return j;
                }

                @Override // X.AbstractC842510X3h
                public final C0X0P contentType() {
                    return c0x0p;
                }

                @Override // X.AbstractC842510X3h
                public final InterfaceC1496620p36 source() {
                    return interfaceC1496620p36;
                }
            };
        }
        throw new NullPointerException("source == null");
    }
}
