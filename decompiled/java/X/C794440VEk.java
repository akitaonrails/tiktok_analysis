package X;

import com.bytedance.monitor.collector.MonitorJni;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0VEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794440VEk {
    public static int LIZIZ = -1;
    public static int LIZJ = -1;
    public static int LIZLLL = -1;
    public C794500VEq LIZ;

    public static boolean LIZIZ() {
        if (-1 == LIZIZ && C791560V3i.LJIIJJI) {
            LIZIZ = MonitorJni.initJavaMem() ? 1 : 0;
        }
        if (LIZIZ == 1 && -1 == LIZJ && C791560V3i.LJIIJJI) {
            LIZJ = MonitorJni.initJavaAllocMonitor() ? 1 : 0;
        }
        return LIZJ == 1;
    }

    public static int LIZ(ByteBuffer byteBuffer, byte[] bArr) {
        int i = byteBuffer.getInt();
        if (i > bArr.length) {
            byteBuffer.position((byteBuffer.position() + i) - bArr.length);
            byteBuffer.get(bArr, 0, bArr.length);
            return bArr.length;
        }
        byteBuffer.get(bArr, 0, i);
        return i;
    }
}
