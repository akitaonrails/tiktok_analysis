package X;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jAA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270360jAA extends C1269960j9W {
    public final C1266350j3h LLILLL;
    public final C1269730j99 LLILZ;

    public static ByteBuffer LJIIJ(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        if (byteBufferSlice.isDirect()) {
            return byteBufferSlice;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBufferSlice.remaining());
        byteBufferAllocateDirect.put(byteBufferSlice);
        byteBufferAllocateDirect.flip();
        return byteBufferAllocateDirect;
    }

    public C1270360jAA(C1267500j5Y c1267500j5Y, C1266350j3h c1266350j3h, C1269730j99 c1269730j99) {
        this.LLILLL = c1266350j3h;
        this.LLILZ = c1269730j99;
        new C1271960jCk();
        C1268700j7U c1268700j7U = (C1268700j7U) c1267500j5Y.LIZJ.getService(C1268700j7U.class);
        if (c1268700j7U != null) {
            c1268700j7U.LIZ();
        }
    }
}
