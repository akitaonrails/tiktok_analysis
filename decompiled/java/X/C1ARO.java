package X;

import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS44S0000100_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1ARO, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ARO implements InterfaceC2179191AQj, C1AR6 {
    public final C1AR7 LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(617));

    public final C1ARU<C1ARN> LIZIZ() {
        return (C1ARU) this.LLILLJJLI.getValue();
    }

    public final void LIZJ() {
        this.LL.LJIL(this);
        this.LL.LJIJJ(this);
        LIZIZ().LIZIZ(AFwS279S0000000_33.get$arr$(400));
        LIZIZ().LIZ.clear();
    }

    @Override // X.InterfaceC2179191AQj
    public final void onCompletion() {
        LIZIZ().LIZIZ(AFwS279S0000000_33.get$arr$(397));
    }

    @Override // X.InterfaceC2179191AQj
    public final void onPrepare() {
        LIZIZ().LIZIZ(AFwS279S0000000_33.get$arr$(398));
    }

    @Override // X.InterfaceC2179191AQj
    public final void onPrepared() {
        LIZIZ().LIZIZ(AFwS279S0000000_33.get$arr$(399));
    }

    public C1ARO(C2179281AQs c2179281AQs) {
        this.LL = c2179281AQs;
        c2179281AQs.LJJIFFI(this);
        c2179281AQs.LJJI(this);
    }

    public final void LIZ(C1ARN c1arn) {
        C1AR7 c1ar7 = this.LL;
        C1ARL c1arl = new C1ARL(c1ar7, c1ar7, c1ar7, c1ar7, c1ar7, c1ar7, c1ar7);
        C1ARU<C1ARN> c1aruLIZIZ = LIZIZ();
        c1arn.LJIJI(c1arl);
        c1aruLIZIZ.LIZ(c1arn);
    }

    public final void LIZLLL(C1ARN c1arn) {
        C1ARU<C1ARN> c1aruLIZIZ = LIZIZ();
        c1arn.onDetach();
        c1aruLIZIZ.LIZ.remove(c1arn);
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJ(EnumC1782190wTh enumC1782190wTh) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(enumC1782190wTh, 235));
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJFF(C1AN0 c1an0) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(c1an0, 234));
    }

    @Override // X.C1AR6
    public final void LJI(InterfaceC2179261AQq interfaceC2179261AQq) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(interfaceC2179261AQq, 233));
    }

    @Override // X.C1AR6
    public final void LJIIIZ(InterfaceC2179131AQd interfaceC2179131AQd) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(interfaceC2179131AQd, 238));
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIIJJI(C2179231AQn c2179231AQn) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(c2179231AQn, 237));
    }

    @Override // X.C1AR6
    public final void LJIIL(C1AQY c1aqy) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(c1aqy, 236));
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIILIIL(EnumC1778440wNe enumC1778440wNe) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(enumC1778440wNe, 239));
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIILLIIL(C1ANF c1anf) {
        LIZIZ().LIZIZ(new AwS612S0100000_33(c1anf, 240));
    }

    @Override // X.InterfaceC2179191AQj
    public final void LJIIZILJ(long j) {
        LIZIZ().LIZIZ(new AwS44S0000100_33(j, 8));
    }

    @Override // X.InterfaceC2179191AQj
    public final void onPlaybackTimeChanged(long j) {
        LIZIZ().LIZIZ(new AwS44S0000100_33(j, 7));
    }
}
