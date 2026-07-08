package X;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSource;

/* JADX INFO: renamed from: X.0j7K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1268600j7K extends VideoSource {
    public C1266900j4a LL;
    public InterfaceC1272820jE8 LLILLJJLI;
    public C1271790jCT LLILLL;
    public C1271780jCS LLILZ;
    public C1271880jCc LLILZIL;

    public int LLIZ() {
        return 0;
    }

    public float LLIZLLLIL() {
        return 0.0f;
    }

    public abstract void LLJI(int i, int i2, int i3);

    @Override // com.ss.ttlivestreamer.core.engine.VideoSource
    public boolean isScreenCast() {
        return false;
    }

    public abstract void stop();

    public final void setServiceManager(InterfaceC1272820jE8 interfaceC1272820jE8) {
        this.LLILLJJLI = interfaceC1272820jE8;
        if (interfaceC1272820jE8 != null) {
            this.LLILLL = (C1271790jCT) interfaceC1272820jE8.getService(C1271790jCT.class);
            this.LLILZ = (C1271780jCS) interfaceC1272820jE8.getService(C1271780jCS.class);
            this.LLILZIL = (C1271880jCc) interfaceC1272820jE8.getService(C1271880jCc.class);
        }
    }

    public int LLJ(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        C1266900j4a c1266900j4a = this.LL;
        if (c1266900j4a != null) {
            C1267620j5k c1267620j5k = c1266900j4a.LIZ.LLLZL;
            if (c1267620j5k.LIZJ.LIZ != i || c1267620j5k.LIZJ.LIZIZ != i2) {
                c1267620j5k.LIZJ.LIZ = i;
                c1267620j5k.LIZJ.LIZIZ = i2;
            }
            C1266350j3h c1266350j3h = c1266900j4a.LIZ;
            c1266350j3h.LLLZL.LIZ(c1266350j3h.LLJLILLLLZIIL, c1266350j3h.LLLZLL, false);
        }
        return nativeOnFrame(buffer, i, i2, i3, j);
    }
}
