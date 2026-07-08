package X;

import Y.AComparatorS39S0000000_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import g86.c$d;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: X.0kWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1322720kWc implements Iterable<Byte>, Serializable {
    public static final AbstractC1322720kWc EMPTY = new C1322680kWY(C1317930kOt.LIZIZ);
    public static final C1322780kWi LL = new Object() { // from class: X.0kWi
    };
    public static final AComparatorS39S0000000_20 LLILLJJLI = new AComparatorS39S0000000_20(11);
    public static final long serialVersionUID = 1;
    public int hash;

    public static int toInt(byte b) {
        return b & 255;
    }

    public abstract void LJ(int i, byte[] bArr, int i2, int i3);

    public abstract byte LJFF(int i);

    public abstract int LJIIIIZZ(int i, int i2);

    public abstract String LJIIIZ(Charset charset);

    public abstract void LJIIJ(c$d c_d);

    public abstract byte byteAt(int i);

    public abstract boolean equals(Object obj);

    public abstract boolean isValidUtf8();

    public abstract AbstractC1317820kOi newCodedInput();

    public abstract InputStream newInput();

    public abstract int size();

    public abstract AbstractC1322720kWc substring(int i, int i2);

    public abstract void writeTo(OutputStream outputStream);

    public final int hashCode() {
        int iLJIIIIZZ = this.hash;
        if (iLJIIIIZZ == 0) {
            int size = size();
            iLJIIIIZZ = LJIIIIZZ(size, size);
            if (iLJIIIIZZ == 0) {
                iLJIIIIZZ = 1;
            }
            this.hash = iLJIIIIZZ;
        }
        return iLJIIIIZZ;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new C1322730kWd(this);
    }

    public final String toString() {
        String strLIZIZ;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            strLIZIZ = C1322800kWk.LIZ(this);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1322800kWk.LIZ(substring(0, 47)));
            sbLIZ.append("...");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        objArr[2] = strLIZIZ;
        return C786410Ut5.k4(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String toStringUtf8() {
        return toString(C1317930kOt.LIZ);
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return C1317930kOt.LIZIZ;
        }
        byte[] bArr = new byte[size];
        LJ(0, bArr, 0, size);
        return bArr;
    }

    public static final AbstractC1322720kWc empty() {
        return EMPTY;
    }

    public static Comparator<AbstractC1322720kWc> unsignedLexicographicalComparator() {
        return LLILLJJLI;
    }

    public static AbstractC1322720kWc copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public static AbstractC1322720kWc copyFromUtf8(String str) {
        return new C1322680kWY(str.getBytes(C1317930kOt.LIZ));
    }

    public final boolean endsWith(AbstractC1322720kWc abstractC1322720kWc) {
        if (size() >= abstractC1322720kWc.size() && substring(size() - abstractC1322720kWc.size()).equals(abstractC1322720kWc)) {
            return true;
        }
        return false;
    }

    public final boolean startsWith(AbstractC1322720kWc abstractC1322720kWc) {
        if (size() < abstractC1322720kWc.size() || !substring(0, abstractC1322720kWc.size()).equals(abstractC1322720kWc)) {
            return false;
        }
        return true;
    }

    public final AbstractC1322720kWc substring(int i) {
        return substring(i, size());
    }

    public final String toString(String str) throws UnsupportedEncodingException {
        try {
            return toString(Charset.forName(str));
        } catch (UnsupportedCharsetException e) {
            TryCatchGuardChecker.doCheck(e);
            UnsupportedEncodingException unsupportedEncodingException = new UnsupportedEncodingException(str);
            unsupportedEncodingException.initCause(e);
            throw unsupportedEncodingException;
        }
    }

    public static AbstractC1322720kWc copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public final String toString(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return LJIIIZ(charset);
    }

    public static AbstractC1322720kWc copyFrom(ByteBuffer byteBuffer, int i) {
        LIZJ(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new C1322680kWY(bArr);
    }

    public static AbstractC1322720kWc copyFrom(String str, String str2) {
        return new C1322680kWY(str.getBytes(str2));
    }

    public static AbstractC1322720kWc copyFrom(String str, Charset charset) {
        return new C1322680kWY(str.getBytes(charset));
    }

    public static int LIZJ(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Beginning index larger than ending index: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", ");
                    sbLIZ.append(i2);
                    throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("End index: ");
                sbLIZ2.append(i2);
                sbLIZ2.append(" >= ");
                sbLIZ2.append(i3);
                throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Beginning index: ");
            sbLIZ3.append(i);
            sbLIZ3.append(" < 0");
            throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ3));
        }
        return i4;
    }

    public static AbstractC1322720kWc copyFrom(byte[] bArr, int i, int i2) {
        LIZJ(i, i + i2, bArr.length);
        LL.getClass();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C1322680kWY(bArr2);
    }

    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        LIZJ(i, i + i3, size());
        LIZJ(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            LJ(i, bArr, i2, i3);
        }
    }
}
