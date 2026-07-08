package X;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Udl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C776910Udl implements InterfaceC1270140j9o {
    public final InterfaceC777020Udw LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final C777170UeB LIZJ = new C777170UeB();
    public volatile long LIZLLL = System.currentTimeMillis();

    @Override // X.InterfaceC1267390j5N
    public final void onComplete() {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public C776910Udl(C776890Udj c776890Udj) {
        this.LIZ = c776890Udj;
    }

    @Override // X.InterfaceC1270140j9o
    public final void LIZ(boolean z, C1271450jBv c1271450jBv) {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // X.InterfaceC1267390j5N
    public final void onError(int i, String str) {
        this.LIZIZ.set(false);
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LIZ.LIZ();
    }

    @Override // X.InterfaceC1270140j9o
    public final void LIZIZ(ByteBuffer byteBuffer, int i, int i2) {
        Map<String, Object> map = C1338270kvh.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZIZ.set(false);
        if (byteBuffer == null) {
            C20441214yg.LJ("GameBackgroundFrameCollector", "onCatchByteBuffer. buffer is null");
            this.LIZ.LIZ();
        } else if (i != 0 && i2 != 0) {
            this.LIZ.LIZIZ(this.LIZLLL, jCurrentTimeMillis, byteBuffer, Integer.valueOf(i), Integer.valueOf(i2), 0, Boolean.FALSE);
        } else {
            C20441214yg.LJ("GameBackgroundFrameCollector", "onCatchByteBuffer. size is 0");
            this.LIZ.LIZ();
        }
    }
}
