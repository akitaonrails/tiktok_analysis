package X;

import Y.ARunnableS120S0100000_20;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.core.opengl.GLThread;

/* JADX INFO: renamed from: X.0jFj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273810jFj implements InterfaceC1304380k32 {
    public Surface LIZ;
    public SurfaceTexture LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL;
    public InterfaceC1269100j88 LJ;
    public InterfaceC1268640j7O LJFF;

    @Override // X.InterfaceC1304380k32
    public final boolean LIZ(C1304390k33 c1304390k33) {
        return true;
    }

    @Override // X.InterfaceC1304380k32
    public final void pause() {
    }

    @Override // X.InterfaceC1304380k32
    public final void play() {
    }

    @Override // X.InterfaceC1304380k32
    public final int getHeight() {
        Integer num = this.LIZLLL;
        if (num != null) {
            return num.intValue();
        }
        return 1280;
    }

    @Override // X.InterfaceC1304380k32
    public final int getWidth() {
        Integer num = this.LIZJ;
        if (num != null) {
            return num.intValue();
        }
        return 720;
    }

    @Override // X.InterfaceC1304380k32
    public final void release() {
        InterfaceC1268640j7O interfaceC1268640j7O = this.LJFF;
        if (interfaceC1268640j7O != null) {
            interfaceC1268640j7O.LJIILL(this.LJ);
        }
        this.LJ = null;
        this.LIZ = null;
    }

    @Override // X.InterfaceC1304380k32
    public final void LIZIZ(SurfaceTexture surfaceTexture) {
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL;
        C1273830jFl c1273830jFl;
        C1273830jFl c1273830jFl2;
        Surface surface;
        int iIntValue;
        this.LIZIZ = surfaceTexture;
        if (surfaceTexture != null) {
            Integer num = this.LIZJ;
            int iIntValue2 = 2300;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 2300;
            }
            Integer num2 = this.LIZLLL;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            surfaceTexture.setDefaultBufferSize(iIntValue, iIntValue2);
        }
        this.LIZ = new Surface(surfaceTexture);
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        InterfaceC1269100j88 interfaceC1269100j88LJJLL = null;
        if (interfaceC769940UIe != null) {
            interfaceC1268640j7OLJIIL = interfaceC769940UIe.LJIIL();
        } else {
            interfaceC1268640j7OLJIIL = null;
        }
        this.LJFF = interfaceC1268640j7OLJIIL;
        if (interfaceC1268640j7OLJIIL != null) {
            interfaceC1269100j88LJJLL = interfaceC1268640j7OLJIIL.LJJLL(this.LIZ);
        }
        this.LJ = interfaceC1269100j88LJJLL;
        if (interfaceC1269100j88LJJLL != null && (c1273830jFl2 = ((C1272520jDe) interfaceC1269100j88LJJLL).LIZ) != null && (surface = c1273830jFl2.LLILZ) != null && surface.isValid() && c1273830jFl2.LLJIJIL == null) {
            GLThread gLThreadLIZ = C1271160jBS.LIZ(EnumC1270220j9w.GRK_THREAD, "GLRenderVideoSink");
            c1273830jFl2.LLILZLL = gLThreadLIZ;
            gLThreadLIZ.start();
            Handler handler = c1273830jFl2.LLILZLL.getHandler();
            c1273830jFl2.LLJIJIL = handler;
            c1273830jFl2.LLIZLLLIL = c1273830jFl2;
            c1273830jFl2.LLJ = true;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(c1273830jFl2, 113));
            }
        }
        InterfaceC1269100j88 interfaceC1269100j88 = this.LJ;
        if (interfaceC1269100j88 != null && (c1273830jFl = ((C1272520jDe) interfaceC1269100j88).LIZ) != null) {
            c1273830jFl.LLJILJILJ = true;
        }
    }
}
