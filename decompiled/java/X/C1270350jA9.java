package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS53S0300000_20;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.YuvConverter;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jA9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1270350jA9 extends AbstractC1268600j7K implements InterfaceC1268620j7M {
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public final InterfaceC1270200j9u LLJIJIL;
    public final Handler LLJILJIL;
    public final Handler LLJILJILJ;
    public YuvConverter LLJILLL;
    public volatile boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public final C1271960jCk LLJJIJI;

    public C1270350jA9() {
        throw null;
    }

    public void LLJILLL() {
        this.LLJJ = true;
        if (this.LLJ != 1) {
            stop();
        }
    }

    public void LLJJ(int i) {
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        C1283100jUi.LIZIZ(this.LLJILJIL, new ARunnableS120S0100000_20(this, 235));
        super.release();
    }

    @Override // X.AbstractC1268600j7K
    public void stop() {
        this.LLJ = 2;
        InterfaceC1270200j9u interfaceC1270200j9u = this.LLJIJIL;
        if (interfaceC1270200j9u != null) {
            interfaceC1270200j9u.LJ();
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaSource
    public final int status() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1268620j7M
    public final VideoFrame.I420Buffer toI420(InterfaceC1271560jC6 interfaceC1271560jC6) {
        if (this.LLJ != 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BUG! Unexpected mStatus ");
            sbLIZ.append(this.LLJ);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            C1274080jGA.LIZ.LIZ("ExternalVideoCapturer.toI420", androidRuntimeException);
            if (!C1274040jG6.LIZ()) {
                return GetBlackFrameBuffer(interfaceC1271560jC6.getWidth(), interfaceC1271560jC6.getHeight());
            }
            throw androidRuntimeException;
        }
        VideoFrame.I420Buffer[] i420BufferArr = {null};
        C1283100jUi.LIZIZ(this.LLJILJIL, new ARunnableS53S0300000_20(i420BufferArr, interfaceC1271560jC6, this, 47));
        return i420BufferArr[0];
    }

    public C1270350jA9(InterfaceC1270200j9u interfaceC1270200j9u, Handler handler, Handler handler2) {
        this.LLJJ = true;
        this.LLJJIJI = new C1271960jCk();
        this.LLJIJIL = interfaceC1270200j9u;
        this.LLJILJIL = handler;
        this.LLJILJILJ = handler2;
        this.LLJ = 0;
    }

    @Override // X.AbstractC1268600j7K
    public void LLJI(int i, int i2, int i3) {
        this.LLIZ = i2;
        this.LLILZLL = i;
        this.LLIZLLLIL = i3;
        this.LLJ = 1;
        InterfaceC1270200j9u interfaceC1270200j9u = this.LLJIJIL;
        if (interfaceC1270200j9u != null) {
            interfaceC1270200j9u.LJIIJ();
        }
    }

    public final void LLJILJILJ(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, long j, long j2) {
        int[] iArr2 = {0};
        C1283100jUi.LIZIZ(this.LLJILJIL, new RunnableC1271890jCd(this, iArr2, byteBufferArr[0], new C1271900jCe[]{null}, i, i2, iArr, byteBufferArr[1], byteBufferArr[2], j2, j));
    }

    public final void LLJILJIL(int i, boolean z, int i2, int i3, Matrix matrix, long j, long j2, long j3) {
        C1283100jUi.LIZIZ(this.LLJILJIL, new RunnableC1271940jCi(this, new int[]{0}, z, i, i2, i3, matrix, this, j2, j3, j));
    }

    public int LLJIJIL(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle, long j2, long j3) {
        int[] iArr = {0};
        C1283100jUi.LIZIZ(this.LLJILJIL, new RunnableC1271930jCh(this, iArr, fArr, i4, i2, i3, bundle, z, i, this, j2, j3, j));
        return iArr[0];
    }
}
