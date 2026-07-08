package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.12xG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19922812xG implements Iterable<Byte>, Serializable {
    public static final AbstractC19922812xG EMPTY = new C19922512xD(C19922012x8.LIZJ);
    public static final InterfaceC19924112xT LL;
    public static final C19923412xM LLILLJJLI;
    public static final long serialVersionUID = 1;
    public int hash;

    public static int toInt(byte b) {
        return b & 255;
    }

    public abstract void LJIIIIZZ(int i, byte[] bArr, int i2, int i3);

    public abstract int LJIIJ();

    public abstract byte LJIIJJI(int i);

    public abstract boolean LJIIL();

    public abstract int LJIILIIL(int i, int i2, int i3);

    public abstract int LJIILJJIL(int i, int i2, int i3);

    public abstract String LJIIZILJ(Charset charset);

    public abstract void LJIJ(AbstractC19922712xF abstractC19922712xF);

    public abstract ByteBuffer asReadOnlyByteBuffer();

    public abstract List<ByteBuffer> asReadOnlyByteBufferList();

    public abstract byte byteAt(int i);

    public abstract void copyTo(ByteBuffer byteBuffer);

    public abstract boolean equals(Object obj);

    public abstract boolean isValidUtf8();

    public abstract AbstractC19927312xz newCodedInput();

    public abstract InputStream newInput();

    public abstract int size();

    public abstract AbstractC19922812xG substring(int i, int i2);

    public abstract void writeTo(OutputStream outputStream);

    /* JADX WARN: Type inference failed for: r0v4, types: [X.12xM] */
    static {
        LL = C19915512w5.LIZ() ? new InterfaceC19924112xT() { // from class: X.12xS
            @Override // X.InterfaceC19924112xT
            public final byte[] LIZ(int i, byte[] bArr, int i2) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
            }
        } : new InterfaceC19924112xT() { // from class: X.12xR
            @Override // X.InterfaceC19924112xT
            public final byte[] LIZ(int i, byte[] bArr, int i2) {
                return Arrays.copyOfRange(bArr, i, i2 + i);
            }
        };
        LLILLJJLI = new Comparator<AbstractC19922812xG>() { // from class: X.12xM
            /* JADX WARN: Type inference failed for: r2v0, types: [X.12xQ, java.util.Iterator] */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.12xQ, java.util.Iterator] */
            @Override // java.util.Comparator
            public final int compare(AbstractC19922812xG abstractC19922812xG, AbstractC19922812xG abstractC19922812xG2) {
                AbstractC19922812xG abstractC19922812xG3 = abstractC19922812xG;
                AbstractC19922812xG abstractC19922812xG4 = abstractC19922812xG2;
                ?? Iterator2 = abstractC19922812xG3.iterator2();
                ?? Iterator22 = abstractC19922812xG4.iterator2();
                while (Iterator2.hasNext() && Iterator22.hasNext()) {
                    int iCompare = Integer.compare(AbstractC19922812xG.toInt(Iterator2.LIZJ()), AbstractC19922812xG.toInt(Iterator22.LIZJ()));
                    if (iCompare != 0) {
                        return iCompare;
                    }
                }
                return Integer.compare(abstractC19922812xG3.size(), abstractC19922812xG4.size());
            }
        };
    }

    public static C19898712tN newOutput() {
        return new C19898712tN(128);
    }

    public final int hashCode() {
        int iLJIILIIL = this.hash;
        if (iLJIILIIL == 0) {
            int size = size();
            iLJIILIIL = LJIILIIL(size, 0, size);
            if (iLJIILIIL == 0) {
                iLJIILIIL = 1;
            }
            this.hash = iLJIILIIL;
        }
        return iLJIILIIL;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public Iterator<Byte> iterator2() {
        return new AbstractC19923612xO() { // from class: X.12xN
            public int LL;
            public final int LLILLJJLI;

            @Override // X.InterfaceC19923812xQ
            public final byte LIZJ() {
                int i = this.LL;
                if (i >= this.LLILLJJLI) {
                    throw new NoSuchElementException();
                }
                this.LL = i + 1;
                return this.LLILLL.LJIIJJI(i);
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LL < this.LLILLJJLI;
            }

            {
                this.LLILLJJLI = this.LLILLL.size();
            }
        };
    }

    public final String toString() {
        String strLIZIZ;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            strLIZIZ = C19854212mC.LIZ(this);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C19854212mC.LIZ(substring(0, 47)));
            sbLIZ.append("...");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        objArr[2] = strLIZIZ;
        return C786410Ut5.k4(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String toStringUtf8() {
        return toString(C19922012x8.LIZ);
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return C19922012x8.LIZJ;
        }
        byte[] bArr = new byte[size];
        LJIIIIZZ(0, bArr, 0, size);
        return bArr;
    }

    public static final AbstractC19922812xG empty() {
        return EMPTY;
    }

    public static Comparator<AbstractC19922812xG> unsignedLexicographicalComparator() {
        return LLILLJJLI;
    }

    public static AbstractC19922812xG copyFrom(Iterable<AbstractC19922812xG> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator<AbstractC19922812xG> it2 = iterable.iterator();
            size = 0;
            while (it2.hasNext()) {
                it2.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return EMPTY;
        }
        return LIZJ(iterable.iterator(), size);
    }

    public static AbstractC19922812xG copyFromUtf8(String str) {
        return new C19922512xD(str.getBytes(C19922012x8.LIZ));
    }

    public static AbstractC19922812xG fromHex(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (LJIIIZ(i2 + 1, str) | (LJIIIZ(i2, str) << 4));
            }
            return new C19922512xD(bArr);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid hexString ");
        sbLIZ.append(str);
        sbLIZ.append(" of length ");
        sbLIZ.append(str.length());
        sbLIZ.append(" must be even.");
        throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C19898712tN newOutput(int i) {
        return new C19898712tN(i);
    }

    public static AbstractC19922812xG readFrom(InputStream inputStream) {
        return readFrom(inputStream, 256, 8192);
    }

    public final AbstractC19922812xG concat(AbstractC19922812xG abstractC19922812xG) {
        if (Integer.MAX_VALUE - size() >= abstractC19922812xG.size()) {
            if (abstractC19922812xG.size() == 0) {
                return this;
            }
            if (size() != 0) {
                int size = size() + abstractC19922812xG.size();
                if (size < 128) {
                    int size2 = size();
                    int size3 = abstractC19922812xG.size();
                    byte[] bArr = new byte[size2 + size3];
                    copyTo(bArr, 0, 0, size2);
                    abstractC19922812xG.copyTo(bArr, 0, size2, size3);
                    return new C19922512xD(bArr);
                }
                if (this instanceof C19922912xH) {
                    C19922912xH c19922912xH = (C19922912xH) this;
                    if (c19922912xH.LLILZIL.size() + abstractC19922812xG.size() < 128) {
                        AbstractC19922812xG abstractC19922812xG2 = c19922912xH.LLILZIL;
                        int size4 = abstractC19922812xG2.size();
                        int size5 = abstractC19922812xG.size();
                        byte[] bArr2 = new byte[size4 + size5];
                        abstractC19922812xG2.copyTo(bArr2, 0, 0, size4);
                        abstractC19922812xG.copyTo(bArr2, 0, size4, size5);
                        return new C19922912xH(c19922912xH.LLILZ, new C19922512xD(bArr2));
                    }
                    if (c19922912xH.LLILZ.LJIIJ() > c19922912xH.LLILZIL.LJIIJ() && c19922912xH.LLIZ > abstractC19922812xG.LJIIJ()) {
                        return new C19922912xH(c19922912xH.LLILZ, new C19922912xH(c19922912xH.LLILZIL, abstractC19922812xG));
                    }
                }
                if (size >= C19922912xH.LJIJI(Math.max(LJIIJ(), abstractC19922812xG.LJIIJ()) + 1)) {
                    return new C19922912xH(this, abstractC19922812xG);
                }
                C19923012xI c19923012xI = new C19923012xI();
                c19923012xI.LIZ(this);
                c19923012xI.LIZ(abstractC19922812xG);
                abstractC19922812xG = c19923012xI.LIZ.pop();
                while (!c19923012xI.LIZ.isEmpty()) {
                    abstractC19922812xG = new C19922912xH(c19923012xI.LIZ.pop(), abstractC19922812xG);
                }
            }
            return abstractC19922812xG;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ByteString would be too long: ");
        sbLIZ.append(size());
        sbLIZ.append("+");
        sbLIZ.append(abstractC19922812xG.size());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean endsWith(AbstractC19922812xG abstractC19922812xG) {
        if (size() >= abstractC19922812xG.size() && substring(size() - abstractC19922812xG.size()).equals(abstractC19922812xG)) {
            return true;
        }
        return false;
    }

    public final boolean startsWith(AbstractC19922812xG abstractC19922812xG) {
        if (size() < abstractC19922812xG.size() || !substring(0, abstractC19922812xG.size()).equals(abstractC19922812xG)) {
            return false;
        }
        return true;
    }

    public final AbstractC19922812xG substring(int i) {
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

    public static AbstractC19922812xG copyFrom(ByteBuffer byteBuffer) {
        return copyFrom(byteBuffer, byteBuffer.remaining());
    }

    public final String toString(Charset charset) {
        if (size() == 0) {
            return "";
        }
        return LJIIZILJ(charset);
    }

    public static AbstractC19922812xG copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static AbstractC19922812xG LIZJ(Iterator<AbstractC19922812xG> it2, int i) {
        if (i >= 1) {
            if (i == 1) {
                return it2.next();
            }
            int i2 = i >>> 1;
            return LIZJ(it2, i2).concat(LIZJ(it2, i - i2));
        }
        throw new IllegalArgumentException(C786410Ut5.j4("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
    }

    public static void LJ(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Index < 0: ");
                sbLIZ.append(i);
                throw new ArrayIndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Index > length: ");
            sbLIZ2.append(i);
            sbLIZ2.append(", ");
            sbLIZ2.append(i2);
            throw new ArrayIndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001f, code lost:
    
        if (r3 <= 'f') goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJIIIZ(int r4, java.lang.String r5) {
        /*
            char r3 = r5.charAt(r4)
            r2 = -1
            r1 = 48
            if (r3 < r1) goto L25
            r0 = 57
            if (r3 > r0) goto L11
            int r3 = r3 - r1
        Le:
            if (r3 == r2) goto L25
            return r3
        L11:
            r1 = 65
            if (r3 < r1) goto L25
            r0 = 70
            if (r3 <= r0) goto L21
            r1 = 97
            if (r3 < r1) goto L25
            r0 = 102(0x66, float:1.43E-43)
            if (r3 > r0) goto L25
        L21:
            int r3 = r3 - r1
            int r3 = r3 + 10
            goto Le
        L25:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Invalid hexString "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " must only contain [0-9a-fA-F] but contained "
            r1.append(r0)
            char r0 = r5.charAt(r4)
            r1.append(r0)
            java.lang.String r0 = " at index "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19922812xG.LJIIIZ(int, java.lang.String):int");
    }

    public static AbstractC19922812xG copyFrom(ByteBuffer byteBuffer, int i) {
        LJFF(0, i, byteBuffer.remaining());
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new C19922512xD(bArr);
    }

    public static AbstractC19922812xG readFrom(InputStream inputStream, int i) {
        return readFrom(inputStream, i, i);
    }

    public void copyTo(byte[] bArr, int i) {
        copyTo(bArr, 0, i, size());
    }

    public static AbstractC19922812xG copyFrom(String str, String str2) {
        return new C19922512xD(str.getBytes(str2));
    }

    public static AbstractC19922812xG copyFrom(String str, Charset charset) {
        return new C19922512xD(str.getBytes(charset));
    }

    public static int LJFF(int i, int i2, int i3) {
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

    public static AbstractC19922812xG copyFrom(byte[] bArr, int i, int i2) {
        LJFF(i, i + i2, bArr.length);
        return new C19922512xD(LL.LIZ(i, bArr, i2));
    }

    public static AbstractC19922812xG readFrom(InputStream inputStream, int i, int i2) throws IOException {
        AbstractC19922812xG abstractC19922812xGCopyFrom;
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] bArr = new byte[i];
            int i3 = 0;
            while (i3 < i) {
                int i4 = inputStream.read(bArr, i3, i - i3);
                if (i4 == -1) {
                    break;
                }
                i3 += i4;
            }
            if (i3 == 0 || (abstractC19922812xGCopyFrom = copyFrom(bArr, 0, i3)) == null) {
                break;
            }
            arrayList.add(abstractC19922812xGCopyFrom);
            i = Math.min(i * 2, i2);
        }
        return copyFrom(arrayList);
    }

    public final void copyTo(byte[] bArr, int i, int i2, int i3) {
        LJFF(i, i + i3, size());
        LJFF(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            LJIIIIZZ(i, bArr, i2, i3);
        }
    }
}
