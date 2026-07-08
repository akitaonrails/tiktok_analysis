package X;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.1COD, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1COD {
    public static final byte[] LIZ(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }
}
