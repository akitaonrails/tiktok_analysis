package X;

import Y.ARunnableS1S0103000_20;
import Y.ARunnableS21S0100100_20;
import Y.ARunnableS4S0110100_20;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS89S0200000_20;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.core.LynxEngineProxy;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.0jtu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298720jtu extends AbstractC1298750jtx {
    public long LIZ;
    public boolean LIZIZ;
    public final C1298760jty LJ;
    public final ArrayList<InterfaceC1298350jtJ> LJFF = new ArrayList<>();
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public WeakReference<InterfaceC1298770jtz> LIZJ = new WeakReference<>(null);
    public WeakReference<InterfaceC1298780ju0> LIZLLL = new WeakReference<>(null);

    public final void LJI() {
        ARunnableS53S0300000_20 aRunnableS53S0300000_20 = new ARunnableS53S0300000_20(EnumC1298360jtK.kLynxEventTypeLayoutEvent, (Object) null, this, 6);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            aRunnableS53S0300000_20.run();
        } else {
            C786410Ut5.LJJZZIII(this.LJI, aRunnableS53S0300000_20);
        }
    }

    public C1298720jtu(LynxEngineProxy lynxEngineProxy) {
        this.LJ = new C1298760jty(lynxEngineProxy);
    }

    @Override // X.AbstractC1298750jtx
    public final void LIZIZ(C1298700jts c1298700jts) {
        C1289620jfE.LIZLLL(new ARunnableS89S0200000_20(this, c1298700jts, 42));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (r2 != null) goto L27;
     */
    @Override // X.AbstractC1298750jtx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C1298740jtw r7) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1298720jtu.LIZJ(X.0jtw):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
    
        if (r2 != null) goto L27;
     */
    @Override // X.AbstractC1298750jtx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C1298740jtw r7) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1298720jtu.LIZLLL(X.0jtw):void");
    }

    public final boolean LJ(C1298730jtv c1298730jtv) {
        InterfaceC1298770jtz interfaceC1298770jtz = this.LIZJ.get();
        if (interfaceC1298770jtz != null) {
            return interfaceC1298770jtz.LIZ(c1298730jtv);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLynxEvent event: ");
        sbLIZ.append(c1298730jtv.LIZIZ);
        sbLIZ.append(" failed since mEventReporter is null.");
        LynxLog.e("EventEmitter", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public final void LJII(long j) {
        LynxEngineProxy lynxEngineProxy;
        C1298760jty c1298760jty = this.LJ;
        if (c1298760jty != null && (lynxEngineProxy = c1298760jty.LIZ) != null) {
            C1289620jfE.LIZLLL(new ARunnableS21S0100100_20(j, lynxEngineProxy, 2));
        }
    }

    public final void LJIIIIZZ(long j) {
        LynxEngineProxy lynxEngineProxy;
        C1298760jty c1298760jty = this.LJ;
        if (c1298760jty != null && (lynxEngineProxy = c1298760jty.LIZ) != null) {
            C1289620jfE.LIZLLL(new ARunnableS21S0100100_20(j, lynxEngineProxy, 1));
        }
    }

    public final void LJFF(final int i, C1298700jts c1298700jts) {
        final int iPosition;
        final String str = c1298700jts.LIZIZ;
        if (this.LJ != null && !this.LIZIZ) {
            C1298840ju6 c1298840ju6 = C1298840ju6.LIZ;
            Map<String, Object> map = c1298700jts.LJI;
            c1298840ju6.getClass();
            final ByteBuffer byteBufferLIZIZ = C1298840ju6.LIZIZ(map);
            if (byteBufferLIZIZ == null) {
                iPosition = 0;
            } else {
                iPosition = byteBufferLIZIZ.position();
            }
            C1298760jty c1298760jty = this.LJ;
            final int i2 = c1298700jts.LIZ;
            final LynxEngineProxy lynxEngineProxy = c1298760jty.LIZ;
            if (lynxEngineProxy != null) {
                C1289620jfE.LIZLLL(new Runnable() { // from class: X.0jtr
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LynxEngineProxy@d809.sendGestureEvent$1");
                        try {
                            LynxEngineProxy lynxEngineProxy2 = lynxEngineProxy;
                            long j = lynxEngineProxy2.LIZ;
                            if (j == 0) {
                                LynxLog.e("LynxEngineProxy", "sendGestureEvent failed since mNativePtr is null");
                            } else {
                                lynxEngineProxy2.nativeSendGestureEvent(j, str, i2, i, byteBufferLIZIZ, iPosition);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LynxEngineProxy@d809.sendGestureEvent$1");
                    }
                });
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendGestureEvent event: ");
        sbLIZ.append(str);
        sbLIZ.append(" failed since mEngineProxy is null or in preload.");
        LynxLog.e("EventEmitter", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIIZ(boolean z, long j) {
        LynxEngineProxy lynxEngineProxy;
        C1298760jty c1298760jty = this.LJ;
        if (c1298760jty != null && (lynxEngineProxy = c1298760jty.LIZ) != null) {
            C1289620jfE.LIZLLL(new ARunnableS4S0110100_20(lynxEngineProxy, z, j, 0));
        }
    }

    @Override // X.AbstractC1298750jtx
    public final void LIZ(int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        C1298760jty c1298760jty = this.LJ;
        if (c1298760jty != null) {
            LynxEngineProxy lynxEngineProxy = c1298760jty.LIZ;
            if (lynxEngineProxy != null) {
                C1289620jfE.LIZLLL(new ARunnableS1S0103000_20(lynxEngineProxy, i, i2, i3, 0));
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPseudoStatusChanged id: ");
        sbLIZ.append(i);
        sbLIZ.append(" failed since mEngineProxy is null.");
        LynxLog.e("EventEmitter", C2188811AlT.LIZIZ(sbLIZ));
    }
}
