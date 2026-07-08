package X;

import java.util.RandomAccess;

/* JADX INFO: renamed from: X.13E7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13E7 extends AbstractC19974313Dh<Byte> implements RandomAccess {
    public final /* synthetic */ byte[] LLILLJJLI;

    @Override // X.AbstractC2253808sK
    public final int LIZJ() {
        return this.LLILLJJLI.length;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean isEmpty() {
        return this.LLILLJJLI.length == 0;
    }

    public C13E7(byte[] bArr) {
        this.LLILLJJLI = bArr;
    }

    @Override // X.AbstractC2253808sK, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Byte) || C13LQ.LJJIIZI(((Number) obj).byteValue(), this.LLILLJJLI) < 0) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final Object get(int i) {
        return Byte.valueOf(this.LLILLJJLI[i]);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        return C13LQ.LJJIIZI(((Number) obj).byteValue(), this.LLILLJJLI);
    }

    @Override // X.AbstractC19974313Dh, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Byte)) {
            return -1;
        }
        byte bByteValue = ((Number) obj).byteValue();
        byte[] bArr = this.LLILLJJLI;
        int length = bArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (bByteValue == bArr[length]) {
                    return length;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return -1;
    }
}
