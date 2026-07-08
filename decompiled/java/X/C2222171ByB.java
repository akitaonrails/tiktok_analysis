package X;

import Y.ARunnableS103S0200000_34;
import android.os.Handler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;

/* JADX INFO: renamed from: X.1ByB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222171ByB implements InterfaceC2222251ByJ, InterfaceC2222261ByK {
    public final InterfaceC2222101By4 LIZ;
    public Handler LIZIZ;
    public C2222461Bye LIZJ;
    public InterfaceC2222261ByK LIZLLL;

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIL(C2222371ByV c2222371ByV) {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIILL(long j, C2222081By2 c2222081By2) {
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LIZ() {
        this.LIZIZ = this.LIZ.LJFF(null);
    }

    @Override // X.InterfaceC2222261ByK
    public final void LIZIZ() {
        InterfaceC2222261ByK interfaceC2222261ByK = this.LIZLLL;
        if (interfaceC2222261ByK != null) {
            interfaceC2222261ByK.LIZIZ();
        }
    }

    @Override // X.InterfaceC2222261ByK
    public final void LIZLLL() {
        InterfaceC2222261ByK interfaceC2222261ByK = this.LIZLLL;
        if (interfaceC2222261ByK != null) {
            interfaceC2222261ByK.LIZLLL();
        }
    }

    @Override // X.InterfaceC2222261ByK
    public final void LJ() {
        InterfaceC2222261ByK interfaceC2222261ByK = this.LIZLLL;
        if (interfaceC2222261ByK != null) {
            interfaceC2222261ByK.LJ();
        }
    }

    @Override // X.InterfaceC2222261ByK
    public final C2222461Bye LJFF() {
        InterfaceC2222261ByK interfaceC2222261ByK = this.LIZLLL;
        if (interfaceC2222261ByK != null) {
            return interfaceC2222261ByK.LJFF();
        }
        return null;
    }

    @Override // X.InterfaceC2222261ByK
    public final void LJIILIIL() {
        InterfaceC2222261ByK interfaceC2222261ByK = this.LIZLLL;
        if (interfaceC2222261ByK != null) {
            interfaceC2222261ByK.LJIILIIL();
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onDestroy() {
        Handler handler = this.LIZIZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        LIZLLL();
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onRelease() {
        Handler handler = this.LIZIZ;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        LJ();
        LJIILIIL();
    }

    @Override // X.InterfaceC2222251ByJ
    public final void onStart() {
        Handler handler;
        LIZIZ();
        Handler handler2 = this.LIZIZ;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
        C2222461Bye c2222461Bye = this.LIZJ;
        if (c2222461Bye == null || (handler = this.LIZIZ) == null) {
            return;
        }
        C786410Ut5.LJLIIL(c2222461Bye.LJFF * LSPassThroughRecordSizeConfig.DEFAULT, handler, new ARunnableS103S0200000_34(this, c2222461Bye, 28));
    }

    public C2222171ByB(InterfaceC2222101By4 interfaceC2222101By4) {
        this.LIZ = interfaceC2222101By4;
    }

    @Override // X.InterfaceC2222261ByK
    public final void LJIIIIZZ(int i) {
        InterfaceC2222261ByK interfaceC2222261ByK = this.LIZLLL;
        if (interfaceC2222261ByK != null) {
            interfaceC2222261ByK.LJIIIIZZ(i);
        }
    }

    @Override // X.InterfaceC2222251ByJ
    public final void LJIIIZ(C2222081By2 c2222081By2) {
        InterfaceC2222261ByK interfaceC2222261ByKCapacityTracker = c2222081By2.LIZJ.LIZIZ.capacityTracker();
        if (interfaceC2222261ByKCapacityTracker != null) {
            this.LIZLLL = interfaceC2222261ByKCapacityTracker;
            this.LIZJ = interfaceC2222261ByKCapacityTracker.LJFF();
        }
    }

    @Override // X.InterfaceC2222261ByK
    public final void LJIIJ(IMessage iMessage) {
        InterfaceC2222261ByK interfaceC2222261ByK = this.LIZLLL;
        if (interfaceC2222261ByK != null) {
            interfaceC2222261ByK.LJIIJ(iMessage);
        }
    }
}
