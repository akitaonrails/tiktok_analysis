package X;

import android.os.Bundle;
import com.bytedance.scene.Scene;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0Ui3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779570Ui3 implements InterfaceC1270140j9o {
    public final InterfaceC777020Udw LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final C777170UeB LIZLLL = new C777170UeB();
    public volatile long LJ = System.currentTimeMillis();
    public volatile int LJFF;
    public C11JF LJI;

    @Override // X.InterfaceC1267390j5N
    public final void onComplete() {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public C779570Ui3(C779590Ui5 c779590Ui5) {
        this.LIZ = c779590Ui5;
    }

    public final void LIZLLL(AbstractC1273900jFs abstractC1273900jFs) {
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LIZIZ.set(false);
        this.LIZJ.set(true);
        Bundle bundle = new Bundle();
        bundle.putInt("mode", 2);
        bundle.putInt(Scene.SCENE_SERVICE, 2);
        C11JF c11jf = this.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJI = null;
    }

    @Override // X.InterfaceC1270140j9o
    public final void LIZ(boolean z, C1271450jBv c1271450jBv) {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    public final void LIZJ(AbstractC1273900jFs abstractC1273900jFs, boolean z) {
        Map<String, Object> map = C1338270kvh.LIZ;
        if (abstractC1273900jFs == null) {
            return;
        }
        this.LIZJ.set(false);
        Bundle bundle = new Bundle();
        bundle.putInt("mode", 2);
        bundle.putInt(Scene.SCENE_SERVICE, 2);
        bundle.putInt("width", 640);
        bundle.putInt("height", 360);
        if (!z) {
            bundle.putFloat("rotation", 90.0f);
            this.LJFF = 1;
        } else {
            this.LJFF = 0;
        }
        abstractC1273900jFs.LJLIIIL(bundle, this.LIZLLL, this);
    }

    @Override // X.InterfaceC1267390j5N
    public final void onError(int i, String str) {
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LIZIZ.set(false);
        this.LIZ.LIZ();
    }

    @Override // X.InterfaceC1270140j9o
    public final void LIZIZ(ByteBuffer byteBuffer, int i, int i2) {
        Map<String, Object> map = C1338270kvh.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZIZ.set(false);
        if (byteBuffer == null) {
            this.LIZ.LIZ();
        } else if (i != 0 && i2 != 0) {
            this.LIZ.LIZIZ(this.LJ, jCurrentTimeMillis, byteBuffer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.LJFF), Boolean.FALSE);
        } else {
            this.LIZ.LIZ();
        }
    }
}
