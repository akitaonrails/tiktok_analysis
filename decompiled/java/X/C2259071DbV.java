package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1DbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259071DbV {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(ByteBuffer byteBuffer) {
        int i = byteBuffer.get() & 255;
        if (i < 128) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 << 8) | (byteBuffer.get() & 255);
        }
        return i3;
    }

    public static List LIZIZ(ByteBuffer byteBuffer) throws C1722690uvj {
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            int iLIZJ = LIZJ(byteBuffer);
            int iLIZ = LIZ(byteBuffer);
            if (iLIZ > 0) {
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                byteBufferSlice.limit(iLIZ);
                byteBuffer.position(byteBuffer.position() + iLIZ);
                arrayList.add(new C2259081DbW(iLIZJ, byteBufferSlice));
            }
        }
        return arrayList;
    }

    public static int LIZJ(ByteBuffer byteBuffer) throws C1722690uvj {
        int i;
        try {
            int i2 = byteBuffer.get() & 255;
            if ((i2 & 31) == 31) {
                do {
                    i = byteBuffer.get() & 255;
                    i2 = (i2 << 8) | i;
                } while ((i & 128) != 0);
            }
            return i2;
        } catch (BufferUnderflowException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C1722690uvj("Unexpected end of buffer");
        }
    }
}
