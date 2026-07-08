package X;

import android.os.Bundle;
import com.bytedance.scene.Scene;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0UeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777400UeY implements InterfaceC1270140j9o {
    public final InterfaceC777020Udw LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final C777170UeB LIZLLL = new C777170UeB();
    public volatile long LJ = System.currentTimeMillis();
    public volatile int LJFF;

    public final void LIZJ() {
        if (this.LIZJ.get() || this.LIZIZ.get()) {
            return;
        }
        this.LIZIZ.set(true);
        this.LJ = System.currentTimeMillis();
        C20441214yg.LJIIIZ("GameFrameHandlerV2", "catchNextFrames");
        this.LIZLLL.LIZ = 1;
    }

    @Override // X.InterfaceC1267390j5N
    public final void onComplete() {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public C777400UeY(C151W c151w) {
        this.LIZ = c151w;
    }

    public final void LIZLLL(AbstractC1273900jFs abstractC1273900jFs) {
        this.LIZIZ.set(false);
        this.LIZJ.set(true);
        Bundle bundle = new Bundle();
        bundle.putInt("mode", 2);
        bundle.putInt(Scene.SCENE_SERVICE, 2);
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
            C20441214yg.LJ("GameFrameHandlerV2", "onCatchByteBuffer. buffer is null");
            this.LIZ.LIZ();
        } else if (i != 0 && i2 != 0) {
            this.LIZ.LIZIZ(this.LJ, jCurrentTimeMillis, byteBuffer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.LJFF), Boolean.FALSE);
        } else {
            C20441214yg.LJ("GameFrameHandlerV2", "onCatchByteBuffer. size is 0");
            this.LIZ.LIZ();
        }
    }
}
