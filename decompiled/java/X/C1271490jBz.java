package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS31S0101000_20;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271490jBz extends C1267740j5w {
    public final C1267500j5Y LLILLJJLI;
    public C1271450jBv LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public boolean LLIZ;
    public final Handler LLIZLLLIL;
    public int LLJ;
    public InterfaceC1270140j9o LLJI;
    public final C1271500jC0 LLJIJIL = new InterfaceC1271470jBx() { // from class: X.0jC0
        @Override // X.InterfaceC1271470jBx
        public final void LJJLIIIJJIZ(C1271450jBv c1271450jBv) {
            InterfaceC1270140j9o interfaceC1270140j9o;
            if (Intrinsics.LJFF(c1271450jBv, this.LL.LLILLL) && (interfaceC1270140j9o = this.LL.LLJI) != null) {
                interfaceC1270140j9o.LIZ(false, c1271450jBv);
            }
        }

        @Override // X.InterfaceC1271470jBx
        public final void onError(int i, String str) {
            C1271490jBz c1271490jBz = this.LL;
            Handler handler = c1271490jBz.LLIZLLLIL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS31S0101000_20(c1271490jBz, i, str, 8));
            }
        }
    };

    @Override // X.C1271610jCB
    public final void release() {
        Handler handler = this.LLIZLLLIL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS31S0101000_20(this, 0, null, 8));
        }
    }

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OriginFrameCatchNode_");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0jC0] */
    public C1271490jBz(C1267500j5Y c1267500j5Y) {
        Handler handlerLIZ;
        this.LLILLJJLI = c1267500j5Y;
        C1268700j7U c1268700j7U = (C1268700j7U) c1267500j5Y.LIZJ.getService(C1268700j7U.class);
        if (c1268700j7U != null) {
            handlerLIZ = c1268700j7U.LIZ();
        } else {
            handlerLIZ = null;
        }
        this.LLIZLLLIL = handlerLIZ;
    }

    @Override // X.C1267740j5w, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        Handler handler;
        this.LLILLJJLI.LIZ.LJIIIIZZ();
        if (this.LLILZ > 0 && this.LLILLL != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.LLILZLL > this.LLILZIL) {
                this.LLILZLL = jCurrentTimeMillis;
                C1271450jBv c1271450jBv = this.LLILLL;
                if (c1271450jBv != null) {
                    if (this.LLJ == 0) {
                        this.LLJ = GlUtil.createFrameBuffer();
                    }
                    int i = c1271450jBv.LLJILJILJ;
                    if (i != 0) {
                        if (i == 1) {
                            int textureId = videoFrame.getTextureId();
                            GLES20.glBindFramebuffer(36160, this.LLJ);
                            GLES20.glFramebufferTexture2D(36160, 36064, 3553, textureId, 0);
                            c1271450jBv.LIZLLL(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
                            GLES20.glBindFramebuffer(36160, 0);
                        }
                    } else {
                        c1271450jBv.LIZJ(videoFrame);
                    }
                    int i2 = this.LLILZ - 1;
                    this.LLILZ = i2;
                    if (i2 <= 0 && !this.LLIZ && (handler = this.LLIZLLLIL) != null) {
                        C786410Ut5.LJLIIL(1000L, handler, new ARunnableS120S0100000_20(this, 179));
                    }
                }
            }
        }
    }
}
