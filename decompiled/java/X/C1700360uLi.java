package X;

import Y.ARunnableS2S1301000_26;
import android.os.Handler;
import android.view.Choreographer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0uLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700360uLi {
    public static final C1700320uLe LJI = new C1700320uLe();
    public static final AtomicBoolean LJII = new AtomicBoolean(false);
    public static volatile Choreographer LJIIIIZZ;
    public final Runnable LIZ;
    public final Handler LIZIZ;
    public volatile ChoreographerFrameCallbackC1700390uLl LIZJ;
    public volatile boolean LIZLLL;
    public volatile RunnableC1700370uLj LJ;
    public volatile boolean LJFF;

    public C1700360uLi(BPEAHandler bPEAHandler, ARunnableS2S1301000_26 aRunnableS2S1301000_26) {
        this.LIZ = aRunnableS2S1301000_26;
        this.LIZIZ = bPEAHandler;
    }
}
