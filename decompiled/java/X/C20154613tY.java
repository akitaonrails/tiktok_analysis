package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: X.13tY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20154613tY implements XmlSerializer {
    public static final String[] LJII = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&quot;", null, null, null, "&amp;", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "&lt;", null, "&gt;", null};
    public int LIZIZ;
    public Writer LIZJ;
    public OutputStream LIZLLL;
    public CharsetEncoder LJ;
    public boolean LJI;
    public final char[] LIZ = new char[8192];
    public final ByteBuffer LJFF = ByteBuffer.allocate(8192);

    public final void LJ() throws IOException {
        int iPosition = this.LJFF.position();
        if (iPosition > 0) {
            this.LJFF.flip();
            this.LIZLLL.write(this.LJFF.array(), 0, iPosition);
            this.LJFF.clear();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void flush() throws IOException {
        int i = this.LIZIZ;
        if (i > 0) {
            if (this.LIZLLL != null) {
                CharBuffer charBufferWrap = CharBuffer.wrap(this.LIZ, 0, i);
                CoderResult coderResultEncode = this.LJ.encode(charBufferWrap, this.LJFF, true);
                while (!coderResultEncode.isError()) {
                    if (coderResultEncode.isOverflow()) {
                        LJ();
                        coderResultEncode = this.LJ.encode(charBufferWrap, this.LJFF, true);
                    } else {
                        LJ();
                        this.LIZLLL.flush();
                    }
                }
                throw new IOException(coderResultEncode.toString());
            }
            this.LIZJ.write(this.LIZ, 0, i);
            this.LIZJ.flush();
            this.LIZIZ = 0;
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final int getDepth() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getName() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getNamespace() {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void endDocument() throws IOException {
        flush();
    }

    public final void LIZ(char c) throws IOException {
        int i = this.LIZIZ;
        if (i >= 8191) {
            flush();
            i = this.LIZIZ;
        }
        this.LIZ[i] = c;
        this.LIZIZ = i + 1;
    }

    public final void LIZLLL(String str) throws IOException {
        String str2;
        int length = str.length();
        String[] strArr = LJII;
        char length2 = (char) strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < length2 && (str2 = strArr[cCharAt]) != null) {
                if (i2 < i) {
                    LIZIZ(str, i2, i - i2);
                }
                i2 = i + 1;
                LIZIZ(str2, 0, str2.length());
            }
            i++;
        }
        if (i2 < i) {
            LIZIZ(str, i2, i - i2);
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void cdsect(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void comment(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void docdecl(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void entityRef(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void ignorableWhitespace(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void processingInstruction(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(Writer writer) {
        this.LIZJ = writer;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(String str) throws IOException {
        if (this.LJI) {
            LIZIZ(">", 0, 1);
            this.LJI = false;
        }
        LIZLLL(str);
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer endTag(String str, String str2) throws IOException {
        if (this.LJI) {
            LIZIZ(" />\n", 0, 4);
        } else {
            LIZIZ("</", 0, 2);
            if (str != null) {
                LIZIZ(str, 0, str.length());
                LIZ(':');
            }
            LIZIZ(str2, 0, str2.length());
            LIZIZ(">\n", 0, 2);
        }
        this.LJI = false;
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final String getPrefix(String str, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setFeature(String str, boolean z) {
        if (str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setOutput(OutputStream outputStream, String str) throws Throwable {
        if (outputStream != null) {
            try {
                this.LJ = Charset.forName(str).newEncoder();
                this.LIZLLL = outputStream;
                return;
            } catch (IllegalCharsetNameException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new UnsupportedEncodingException(str).initCause(e);
            } catch (UnsupportedCharsetException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new UnsupportedEncodingException(str).initCause(e2);
            }
        }
        throw new IllegalArgumentException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setPrefix(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void setProperty(String str, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final void startDocument(String str, Boolean bool) throws IOException {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("<?xml version='1.0' encoding='utf-8' standalone='");
        if (bool.booleanValue()) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        sbLIZ.append(str2);
        sbLIZ.append("' ?>\n");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LIZIZ(strLIZIZ, 0, strLIZIZ.length());
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer startTag(String str, String str2) throws IOException {
        if (this.LJI) {
            LIZIZ(">\n", 0, 2);
        }
        LIZ('<');
        if (str != null) {
            LIZIZ(str, 0, str.length());
            LIZ(':');
        }
        LIZIZ(str2, 0, str2.length());
        this.LJI = true;
        return this;
    }

    public final void LIZIZ(String str, int i, int i2) throws IOException {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + 8192;
                if (i5 < i4) {
                    i3 = 8192;
                } else {
                    i3 = i4 - i;
                }
                LIZIZ(str, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.LIZIZ;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.LIZIZ;
        }
        str.getChars(i, i + i2, this.LIZ, i6);
        this.LIZIZ = i6 + i2;
    }

    public final void LIZJ(char[] cArr, int i, int i2) throws IOException {
        int i3;
        if (i2 > 8192) {
            int i4 = i2 + i;
            while (i < i4) {
                int i5 = i + 8192;
                if (i5 < i4) {
                    i3 = 8192;
                } else {
                    i3 = i4 - i;
                }
                LIZJ(cArr, i, i3);
                i = i5;
            }
            return;
        }
        int i6 = this.LIZIZ;
        if (i6 + i2 > 8192) {
            flush();
            i6 = this.LIZIZ;
        }
        System.arraycopy(cArr, i, this.LIZ, i6, i2);
        this.LIZIZ = i6 + i2;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer attribute(String str, String str2, String str3) throws IOException {
        LIZ(' ');
        if (str != null) {
            LIZIZ(str, 0, str.length());
            LIZ(':');
        }
        LIZIZ(str2, 0, str2.length());
        LIZIZ("=\"", 0, 2);
        LIZLLL(str3);
        LIZ('\"');
        return this;
    }

    @Override // org.xmlpull.v1.XmlSerializer
    public final XmlSerializer text(char[] cArr, int i, int i2) throws IOException {
        String str;
        if (this.LJI) {
            LIZIZ(">", 0, 1);
            this.LJI = false;
        }
        String[] strArr = LJII;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    LIZJ(cArr, i4, i - i4);
                }
                i4 = i + 1;
                LIZIZ(str, 0, str.length());
            }
            i++;
        }
        if (i4 < i) {
            LIZJ(cArr, i4, i - i4);
        }
        return this;
    }
}
