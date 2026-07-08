package X;

import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0j5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267590j5h extends VideoMixer {
    public boolean LL;
    public C1267600j5i LLILLJJLI;
    public WeakReference<C1272880jEE> LLILLL;

    @Override // com.ss.ttlivestreamer.core.mixer.VideoMixer, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        this.LLILLL = new WeakReference<>(null);
        removeVideoSink(this.LLILLJJLI);
        release();
        this.LLILLJJLI = null;
        super.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0j5i, com.ss.ttlivestreamer.core.engine.VideoSink] */
    public C1267590j5h(long j) {
        boolean z;
        boolean z2;
        ?? r0 = new VideoSink() { // from class: X.0j5i
            @Override // com.ss.ttlivestreamer.core.engine.VideoSink
            public final void OnDiscardedFrame() {
            }

            @Override // com.ss.ttlivestreamer.core.engine.NativeObject
            public final synchronized void release() {
                super.release();
            }

            @Override // com.ss.ttlivestreamer.core.engine.VideoSink
            public final void onFrame(VideoFrame videoFrame) {
                C1272880jEE c1272880jEE = this.LL.LLILLL.get();
                if (c1272880jEE != null) {
                    c1272880jEE.onFrame(videoFrame);
                }
            }
        };
        this.LLILLJJLI = r0;
        addVideoSink(r0);
        TEBundle tEBundle = new TEBundle();
        getParameter(tEBundle);
        tEBundle.getInt("vmixer_width");
        tEBundle.getInt("vmixer_height");
        tEBundle.setBool("vmixer_enable_gl_finish", GLThreadManager.isNeedFinish());
        if ((1024 & j) > 0) {
            z = true;
        } else {
            z = false;
        }
        tEBundle.setBool("vmixer_clear_stencil", z);
        if ((j & 2048) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        tEBundle.setBool("vmixer_clear_rect", z2);
        setParameter(tEBundle);
        tEBundle.release();
        this.LL = false;
        setEnable(true);
    }

    public final void LLIZLLLIL(int i, int i2) {
        TEBundle tEBundle = new TEBundle();
        getParameter(tEBundle);
        tEBundle.setInt("vmixer_width", i);
        tEBundle.setInt("vmixer_height", i2);
        setParameter(tEBundle);
        tEBundle.release();
    }
}
