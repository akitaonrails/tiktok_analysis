package X;

import com.bytedance.im.core.client.configs.IMSDKReceiveMsgPerfConfig;
import com.bytedance.im.core.message.core.metrics.ability.ReceiveMsgPerfTracker;

/* JADX INFO: renamed from: X.0Y8O, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8O {
    public final C0YEM LIZ;
    public final int LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final ReceiveMsgPerfTracker LIZLLL;
    public final IMSDKReceiveMsgPerfConfig LJ;
    public final long LJFF;
    public final int LJI;
    public final long LJII;
    public long LJIIIIZZ;
    public final C13E8<Long> LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;

    public C0Y8O(C0YEM c0yem, int i, InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = c0yem;
        this.LIZIZ = i;
        this.LIZJ = interfaceC497601wk;
        this.LIZLLL = c0yem.LJ().getMessage().LJFF();
        IMSDKReceiveMsgPerfConfig iMSDKReceiveMsgPerfConfig = c0yem.LJIIIZ().LJJLIIIIJ.LJIILLIIL;
        this.LJ = iMSDKReceiveMsgPerfConfig;
        this.LJFF = iMSDKReceiveMsgPerfConfig.wsBurstWindowMs;
        this.LJI = iMSDKReceiveMsgPerfConfig.wsBurstThreshold;
        this.LJII = iMSDKReceiveMsgPerfConfig.wsCheckIntervalMs;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = new C13E8<>();
    }
}
