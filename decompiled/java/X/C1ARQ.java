package X;

import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS44S0000100_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1ARQ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ARQ implements C1ARB, InterfaceC2179191AQj {
    public final C01GW LL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(594));

    public final C1ARU<InterfaceC2179191AQj> LIZIZ() {
        return (C1ARU) this.LL.getValue();
    }

    public final void LIZJ() {
        LIZIZ().LIZ.clear();
    }

    @Override // X.InterfaceC2179191AQj
    public final void onCompletion() {
        LIZIZ().LIZIZ(AFwS279S0000000_33.get$arr$(381));
    }

    @Override // X.InterfaceC2179191AQj
    public final void onPrepare() {
        LIZIZ().LIZIZ(AFwS279S0000000_33.get$arr$(382));
    }

    @Override // X.InterfaceC2179191AQj
    public final void onPrepared() {
        LIZIZ().LIZIZ(AFwS279S0000000_33.get$arr$(383));
    }

    public final void LIZ(InterfaceC2179191AQj interfaceC2179191AQj) {
        LIZIZ().LIZ(interfaceC2179191AQj);
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJ(EnumC1782190wTh enumC1782190wTh) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(enumC1782190wTh, 207));
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJFF(C1AN0 c1an0) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(c1an0, 206));
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIIJJI(C2179231AQn c2179231AQn) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(c2179231AQn, 208));
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIILIIL(EnumC1778440wNe enumC1778440wNe) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(enumC1778440wNe, 209));
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIILLIIL(C1ANF c1anf) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(c1anf, 210));
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIIZILJ(long j) {
        LIZIZ().LIZIZ(new AwS44S0000100_33(j, 2));
    }

    @Override // X.C1ARB
    public final void LJIJJ(InterfaceC2179191AQj interfaceC2179191AQj) {
        LIZIZ().LIZ.remove(interfaceC2179191AQj);
    }

    @Override // X.InterfaceC2179191AQj
    public final void onPlaybackTimeChanged(long j) {
        LIZIZ().LIZIZ(new AwS44S0000100_33(j, 1));
    }
}
