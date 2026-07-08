package X;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jI7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1275290jI7 {
    public final InterfaceC1275870jJ3 LIZ;

    public C1275290jI7(C1275770jIt c1275770jIt) {
        this.LIZ = c1275770jIt;
    }

    public static ByteBuffer LIZ(ByteBuffer byteBuffer) {
        if (byteBuffer != null && !byteBuffer.isDirect()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBufferAllocateDirect.position(0);
            byteBufferAllocateDirect.put(byteBuffer);
            byteBuffer.rewind();
            byteBufferAllocateDirect.position(0);
            return byteBufferAllocateDirect;
        }
        return byteBuffer;
    }
}
