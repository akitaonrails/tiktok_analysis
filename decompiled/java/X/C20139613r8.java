package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: X.13r8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20139613r8 {
    public final ByteBuffer LIZ;

    public final long LIZ() {
        return ((long) this.LIZ.getInt()) & 4294967295L;
    }

    public C20139613r8(ByteBuffer byteBuffer) {
        this.LIZ = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public final void LIZIZ(int i) {
        ByteBuffer byteBuffer = this.LIZ;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
