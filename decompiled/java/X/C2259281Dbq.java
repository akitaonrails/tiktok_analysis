package X;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: X.1Dbq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2259281Dbq extends InputStream implements DataInput {
    public static final ByteOrder LLILZIL = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder LLILZLL = ByteOrder.BIG_ENDIAN;
    public final DataInputStream LL;
    public ByteOrder LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.LL.available();
    }

    @Override // java.io.InputStream
    public final int read() {
        this.LLILZ++;
        return this.LL.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.LLILZ++;
        return this.LL.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        int i = this.LLILZ + 1;
        this.LLILZ = i;
        if (i > this.LLILLL) {
            throw new EOFException();
        }
        int i2 = this.LL.read();
        if (i2 >= 0) {
            return (byte) i2;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.LLILZ += 2;
        return this.LL.readChar();
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        int i = this.LLILZ + 4;
        this.LLILZ = i;
        if (i > this.LLILLL) {
            throw new EOFException();
        }
        int i2 = this.LL.read();
        int i3 = this.LL.read();
        int i4 = this.LL.read();
        int i5 = this.LL.read();
        if ((i2 | i3 | i4 | i5) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.LLILLJJLI;
        if (byteOrder == LLILZIL) {
            return (i5 << 24) + (i4 << 16) + (i3 << 8) + i2;
        }
        if (byteOrder == LLILZLL) {
            return (i2 << 24) + (i3 << 16) + (i4 << 8) + i5;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid byte order: ");
        sbLIZ.append(this.LLILLJJLI);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        int i = this.LLILZ + 8;
        this.LLILZ = i;
        if (i > this.LLILLL) {
            throw new EOFException();
        }
        int i2 = this.LL.read();
        int i3 = this.LL.read();
        int i4 = this.LL.read();
        int i5 = this.LL.read();
        int i6 = this.LL.read();
        int i7 = this.LL.read();
        int i8 = this.LL.read();
        int i9 = this.LL.read();
        if ((i2 | i3 | i4 | i5 | i6 | i7 | i8 | i9) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.LLILLJJLI;
        if (byteOrder == LLILZIL) {
            return (((long) i9) << 56) + (((long) i8) << 48) + (((long) i7) << 40) + (((long) i6) << 32) + (((long) i5) << 24) + (((long) i4) << 16) + (((long) i3) << 8) + ((long) i2);
        }
        if (byteOrder == LLILZLL) {
            return (((long) i2) << 56) + (((long) i3) << 48) + (((long) i4) << 40) + (((long) i5) << 32) + (((long) i6) << 24) + (((long) i7) << 16) + (((long) i8) << 8) + ((long) i9);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid byte order: ");
        sbLIZ.append(this.LLILLJJLI);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        int i = this.LLILZ + 2;
        this.LLILZ = i;
        if (i > this.LLILLL) {
            throw new EOFException();
        }
        int i2 = this.LL.read();
        int i3 = this.LL.read();
        if ((i2 | i3) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.LLILLJJLI;
        if (byteOrder == LLILZIL) {
            return (short) ((i3 << 8) + i2);
        }
        if (byteOrder == LLILZLL) {
            return (short) ((i2 << 8) + i3);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid byte order: ");
        sbLIZ.append(this.LLILLJJLI);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.LLILZ += 2;
        return this.LL.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.LLILZ++;
        return this.LL.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        int i = this.LLILZ + 2;
        this.LLILZ = i;
        if (i > this.LLILLL) {
            throw new EOFException();
        }
        int i2 = this.LL.read();
        int i3 = this.LL.read();
        if ((i2 | i3) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.LLILLJJLI;
        if (byteOrder == LLILZIL) {
            return (i3 << 8) + i2;
        }
        if (byteOrder == LLILZLL) {
            return (i2 << 8) + i3;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid byte order: ");
        sbLIZ.append(this.LLILLJJLI);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public C2259281Dbq(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    public final void LIZ(long j) throws IOException {
        int i = this.LLILZ;
        if (i > j) {
            this.LLILZ = 0;
            this.LL.reset();
            this.LL.mark(this.LLILLL);
        } else {
            j -= (long) i;
        }
        int i2 = (int) j;
        if (skipBytes(i2) == i2) {
        } else {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.LL.mark(i);
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        int length = this.LLILZ + bArr.length;
        this.LLILZ = length;
        if (length <= this.LLILLL) {
            if (this.LL.read(bArr, 0, bArr.length) == bArr.length) {
                return;
            } else {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        int iMin = Math.min(i, this.LLILLL - this.LLILZ);
        int iSkipBytes = 0;
        while (iSkipBytes < iMin) {
            iSkipBytes += this.LL.skipBytes(iMin - iSkipBytes);
        }
        this.LLILZ += iSkipBytes;
        return iSkipBytes;
    }

    public C2259281Dbq(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public C2259281Dbq(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        this.LLILLJJLI = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.LL = dataInputStream;
        int iAvailable = dataInputStream.available();
        this.LLILLL = iAvailable;
        this.LLILZ = 0;
        dataInputStream.mark(iAvailable);
        this.LLILLJJLI = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.LL.read(bArr, i, i2);
        this.LLILZ += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.LLILZ + i2;
        this.LLILZ = i3;
        if (i3 <= this.LLILLL) {
            if (this.LL.read(bArr, i, i2) == i2) {
                return;
            } else {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }
        throw new EOFException();
    }
}
