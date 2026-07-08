package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.TTKOrbu;
import com.orbu.core.adapter.TTKLiveVideoRequest;
import com.orbu.core.adapter.TTKResponseKt;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0jBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271420jBs extends C1267740j5w {
    public Handler LLILLL;
    public ByteBuffer LLILZ;
    public Bitmap LLILZIL;
    public final C1267500j5Y LLIZLLLIL;
    public final Map<String, String> LLILLJJLI = new HashMap();
    public int LLILZLL = 0;
    public final AtomicInteger LLIZ = new AtomicInteger(0);
    public final AtomicBoolean LLJ = new AtomicBoolean(false);

    @Override // X.C1271610jCB
    public final void release() {
        this.LLIZ.set(-1);
        C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS120S0100000_20(this, 314));
    }

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SandBoxVideoInterceptor_");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1271420jBs(C1267500j5Y c1267500j5Y) {
        this.LLILLL = ((C1268700j7U) c1267500j5Y.LIZJ.getService(C1268700j7U.class)).LIZIZ();
        this.LLIZLLLIL = c1267500j5Y;
    }

    public final void LJI(k kVar) {
        boolean z;
        int i;
        int width = kVar.getWidth();
        int height = kVar.getHeight();
        int i2 = width * height * 4;
        ByteBuffer byteBuffer = this.LLILZ;
        if (byteBuffer == null || byteBuffer.capacity() != i2) {
            this.LLILZ = ByteBuffer.allocateDirect(i2);
        }
        this.LLILZ.clear();
        Bitmap bitmap = this.LLILZIL;
        if (bitmap == null) {
            this.LLILZIL = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        } else if (bitmap.getWidth() != width || this.LLILZIL.getHeight() != height) {
            C786410Ut5.LJJJJ(this.LLILZIL);
            this.LLILZIL = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        if (this.LLILZLL == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.LLILZLL = iArr[0];
        }
        if (kVar.getType() == EnumC1273550jFJ.OES) {
            z = true;
        } else {
            z = false;
        }
        int textureId = kVar.getTextureId();
        GLES20.glBindFramebuffer(36160, this.LLILZLL);
        int i3 = 36197;
        if (z) {
            i = 36197;
        } else {
            i = 3553;
        }
        GLES20.glFramebufferTexture2D(36160, 36064, i, textureId, 0);
        GLES20.glReadPixels(0, 0, width, height, 6408, 5121, this.LLILZ);
        if (!z) {
            i3 = 3553;
        }
        GLES20.glFramebufferTexture2D(36160, 36064, i3, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
        this.LLILZIL.copyPixelsFromBuffer(this.LLILZ);
        TTKOrbu.INSTANCE.shouldInterceptTTKRequest(new TTKLiveVideoRequest(textureId, this.LLILZIL, this.LLILLJJLI));
    }

    public final void LJIIIIZZ(VideoFrame videoFrame) {
        if (this.LLILLL != null && this.LLIZ.get() != -1 && !this.LLJ.get() && (videoFrame.getBuffer() instanceof k)) {
            k kVar = (k) videoFrame.getBuffer();
            try {
                if (TTKResponseKt.isNeedConvertBitmap(TTKOrbu.INSTANCE.shouldInterceptTTKRequest(new TTKLiveVideoRequest(kVar.getTextureId(), null, this.LLILLJJLI)))) {
                    this.LLJ.set(true);
                    kVar.retain();
                    if (!C786410Ut5.LJJZZIII(this.LLILLL, new ARunnableS89S0200000_20(kVar, this, 191))) {
                        kVar.release();
                        this.LLJ.set(false);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(e);
                C1274080jGA.LIZ.LIZ("SandBoxException_video", androidRuntimeException);
                if (C1274040jG6.LIZ()) {
                    throw androidRuntimeException;
                }
            }
        }
    }

    public C1271420jBs(Handler handler) {
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 315));
        }
    }

    @Override // X.C1267740j5w, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        this.LLIZLLLIL.LIZ.LJIIIIZZ();
        LJIIIIZZ(videoFrame);
    }
}
