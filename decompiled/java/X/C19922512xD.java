package X;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.12xD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19922512xD extends AbstractC19923712xP {
    public static final long serialVersionUID = 1;
    public final byte[] LLILLL;

    public int LJIL() {
        return 0;
    }

    @Override // X.AbstractC19922812xG
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.LLILLL, LJIL(), size()).asReadOnlyBuffer();
    }

    @Override // X.AbstractC19922812xG
    public final AbstractC19927312xz newCodedInput() {
        return AbstractC19927312xz.LJIIIIZZ(this.LLILLL, LJIL(), size(), true);
    }

    @Override // X.AbstractC19922812xG
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.LLILLL, LJIL(), size());
    }

    @Override // X.AbstractC19922812xG
    public int size() {
        return this.LLILLL.length;
    }

    @Override // X.AbstractC19922812xG
    public final List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // X.AbstractC19922812xG
    public final boolean isValidUtf8() {
        int iLJIL = LJIL();
        return C19920112wp.LIZ.LJ(0, this.LLILLL, iLJIL, size() + iLJIL) == 0;
    }

    public C19922512xD(byte[] bArr) {
        super(0);
        bArr.getClass();
        this.LLILLL = bArr;
    }

    @Override // X.AbstractC19922812xG
    public byte LJIIJJI(int i) {
        return this.LLILLL[i];
    }

    @Override // X.AbstractC19922812xG
    public final String LJIIZILJ(Charset charset) {
        return new String(this.LLILLL, LJIL(), size(), charset);
    }

    @Override // X.AbstractC19922812xG
    public final void LJIJ(AbstractC19922712xF abstractC19922712xF) {
        abstractC19922712xF.LIZ(LJIL(), this.LLILLL, size());
    }

    @Override // X.AbstractC19922812xG
    public byte byteAt(int i) {
        return this.LLILLL[i];
    }

    @Override // X.AbstractC19922812xG
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.LLILLL, LJIL(), size());
    }

    @Override // X.AbstractC19922812xG
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC19922812xG) || size() != ((AbstractC19922812xG) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C19922512xD) {
            AbstractC19922812xG abstractC19922812xG = (AbstractC19922812xG) obj;
            int i = this.hash;
            int i2 = abstractC19922812xG.hash;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            return LJIJI(abstractC19922812xG, 0, size());
        }
        return obj.equals(this);
    }

    @Override // X.AbstractC19922812xG
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    @Override // X.AbstractC19922812xG
    public final AbstractC19922812xG substring(int i, int i2) {
        final int iLJFF = AbstractC19922812xG.LJFF(i, i2, size());
        if (iLJFF == 0) {
            return AbstractC19922812xG.EMPTY;
        }
        final byte[] bArr = this.LLILLL;
        final int iLJIL = LJIL() + i;
        return new C19922512xD(bArr, iLJIL, iLJFF) { // from class: X.12xE
            public static final long serialVersionUID = 1;
            public final int LLILZ;
            public final int LLILZIL;

            public Object writeReplace() {
                return new C19922512xD(toByteArray());
            }

            @Override // X.C19922512xD
            public final int LJIL() {
                return this.LLILZ;
            }

            @Override // X.C19922512xD, X.AbstractC19922812xG
            public final int size() {
                return this.LLILZIL;
            }

            private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
                throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
            }

            @Override // X.C19922512xD, X.AbstractC19922812xG
            public final byte LJIIJJI(int i3) {
                return this.LLILLL[this.LLILZ + i3];
            }

            @Override // X.C19922512xD, X.AbstractC19922812xG
            public final byte byteAt(int i3) {
                AbstractC19922812xG.LJ(i3, this.LLILZIL);
                return this.LLILLL[this.LLILZ + i3];
            }

            {
                super(bArr);
                AbstractC19922812xG.LJFF(iLJIL, iLJIL + iLJFF, bArr.length);
                this.LLILZ = iLJIL;
                this.LLILZIL = iLJFF;
            }

            @Override // X.C19922512xD, X.AbstractC19922812xG
            public final void LJIIIIZZ(int i3, byte[] bArr2, int i4, int i5) {
                System.arraycopy(this.LLILLL, this.LLILZ + i3, bArr2, i4, i5);
            }
        };
    }

    @Override // X.AbstractC19922812xG
    public final int LJIILIIL(int i, int i2, int i3) {
        byte[] bArr = this.LLILLL;
        int iLJIL = LJIL() + i2;
        Charset charset = C19922012x8.LIZ;
        for (int i4 = iLJIL; i4 < iLJIL + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // X.AbstractC19922812xG
    public final int LJIILJJIL(int i, int i2, int i3) {
        int iLJIL = LJIL() + i2;
        return C19920112wp.LIZ.LJ(i, this.LLILLL, iLJIL, i3 + iLJIL);
    }

    @Override // X.AbstractC19923712xP
    public final boolean LJIJI(AbstractC19922812xG abstractC19922812xG, int i, int i2) {
        if (i2 <= abstractC19922812xG.size()) {
            int i3 = i + i2;
            if (i3 <= abstractC19922812xG.size()) {
                if (abstractC19922812xG instanceof C19922512xD) {
                    C19922512xD c19922512xD = (C19922512xD) abstractC19922812xG;
                    byte[] bArr = this.LLILLL;
                    byte[] bArr2 = c19922512xD.LLILLL;
                    int iLJIL = LJIL() + i2;
                    int iLJIL2 = LJIL();
                    int iLJIL3 = c19922512xD.LJIL() + i;
                    while (iLJIL2 < iLJIL) {
                        if (bArr[iLJIL2] != bArr2[iLJIL3]) {
                            return false;
                        }
                        iLJIL2++;
                        iLJIL3++;
                    }
                    return true;
                }
                return abstractC19922812xG.substring(i, i3).equals(substring(0, i2));
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Ran off end of other: ");
            sbLIZ.append(i);
            sbLIZ.append(", ");
            sbLIZ.append(i2);
            sbLIZ.append(", ");
            sbLIZ.append(abstractC19922812xG.size());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Length too large: ");
        sbLIZ2.append(i2);
        sbLIZ2.append(size());
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.AbstractC19922812xG
    public void LJIIIIZZ(int i, byte[] bArr, int i2, int i3) {
        System.arraycopy(this.LLILLL, i, bArr, i2, i3);
    }
}
