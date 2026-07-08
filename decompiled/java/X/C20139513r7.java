package X;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: X.13r7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20139513r7 {
    /* JADX WARN: Type inference failed for: r2v1, types: [X.13r9, X.18pc] */
    public static C20139713r9 LIZ(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        C20139613r8 c20139613r8 = new C20139613r8(byteBufferDuplicate);
        c20139613r8.LIZIZ(4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i <= 100) {
            c20139613r8.LIZIZ(6);
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                int i3 = c20139613r8.LIZ.getInt();
                c20139613r8.LIZIZ(4);
                long jLIZ = c20139613r8.LIZ();
                c20139613r8.LIZIZ(4);
                if (1835365473 == i3) {
                    if (jLIZ != -1) {
                        c20139613r8.LIZIZ((int) (jLIZ - ((long) c20139613r8.LIZ.position())));
                        c20139613r8.LIZIZ(12);
                        long jLIZ2 = c20139613r8.LIZ();
                        for (int i4 = 0; i4 < jLIZ2; i4++) {
                            int i5 = c20139613r8.LIZ.getInt();
                            long jLIZ3 = c20139613r8.LIZ();
                            c20139613r8.LIZ();
                            if (1164798569 == i5 || 1701669481 == i5) {
                                byteBufferDuplicate.position((int) (jLIZ3 + jLIZ));
                                ?? r2 = new C21404218pc() { // from class: X.13r9
                                };
                                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                                r2.LIZIZ(byteBufferDuplicate.getInt(byteBufferDuplicate.position()) + byteBufferDuplicate.position(), byteBufferDuplicate);
                                return r2;
                            }
                        }
                    }
                } else {
                    i2++;
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
