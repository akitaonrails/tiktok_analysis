package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0emM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101840emM implements InterfaceC1101980ema {
    public final /* synthetic */ InterfaceC1101980ema LIZ;
    public final /* synthetic */ AbstractC1101760emE LIZIZ;
    public final /* synthetic */ C1101810emJ LIZJ;
    public final /* synthetic */ DataChannel LIZLLL;

    @Override // X.InterfaceC1101980ema
    public final void LIZ() {
        InterfaceC1101980ema interfaceC1101980ema = this.LIZ;
        if (interfaceC1101980ema != null) {
            interfaceC1101980ema.LIZ();
        }
        this.LIZIZ.getClass();
    }

    @Override // X.InterfaceC1101980ema
    public final void LIZJ(boolean z) {
        InterfaceC1101980ema interfaceC1101980ema;
        if (!z && (interfaceC1101980ema = this.LIZ) != null) {
            interfaceC1101980ema.LIZJ(false);
        }
        this.LIZIZ.LJIILJJIL();
        AbstractC1098520eh0 abstractC1098520eh0Remove = this.LIZJ.LIZIZ.remove(this.LIZIZ);
        if (abstractC1098520eh0Remove != null) {
            DataChannel dataChannel = this.LIZLLL;
            C1102070emj c1102070emj = C1102070emj.LIZ;
            String str = abstractC1098520eh0Remove.LIZ;
            c1102070emj.getClass();
            C1102070emj.LJIIL(dataChannel, 0, str);
        }
    }

    @Override // X.InterfaceC1101980ema
    public final void LIZLLL(boolean z) {
        InterfaceC1101980ema interfaceC1101980ema;
        if (!z && (interfaceC1101980ema = this.LIZ) != null) {
            interfaceC1101980ema.LIZLLL(false);
        }
        this.LIZIZ.getClass();
        this.LIZIZ.LJIILJJIL();
        AbstractC1098520eh0 abstractC1098520eh0Remove = this.LIZJ.LIZIZ.remove(this.LIZIZ);
        if (abstractC1098520eh0Remove != null) {
            DataChannel dataChannel = this.LIZLLL;
            C1102070emj c1102070emj = C1102070emj.LIZ;
            String str = abstractC1098520eh0Remove.LIZ;
            c1102070emj.getClass();
            C1102070emj.LJIIL(dataChannel, 1, str);
        }
    }

    @Override // X.InterfaceC1101980ema
    public final void LIZIZ(boolean z, boolean z2) {
        InterfaceC1101980ema interfaceC1101980ema;
        if (!z2 && (interfaceC1101980ema = this.LIZ) != null) {
            interfaceC1101980ema.LIZIZ(z, false);
        }
    }

    public C1101840emM(InterfaceC1101980ema interfaceC1101980ema, AbstractC1101760emE abstractC1101760emE, C1101810emJ c1101810emJ, DataChannel dataChannel) {
        this.LIZ = interfaceC1101980ema;
        this.LIZIZ = abstractC1101760emE;
        this.LIZJ = c1101810emJ;
        this.LIZLLL = dataChannel;
    }
}
