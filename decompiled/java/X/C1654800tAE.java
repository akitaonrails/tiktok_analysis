package X;

import com.ss.android.ugc.aweme.shortvideo.component.a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tAE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654800tAE implements InterfaceC1648550t09, InterfaceC1653060t7Q {
    public final a LIZ;
    public final InterfaceC1630630sXF LIZIZ;
    public final Function0<InterfaceC1648570t0B> LIZJ;
    public final InterfaceC1654860tAK LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 297));
    public final C11RK<Unit> LJFF;
    public final C11RK<Unit> LJI;
    public final C11RK<Unit> LJII;
    public final C11RK<Pair<Boolean, C1448290nn9>> LJIIIIZZ;
    public final C19475711Hn LJIIIZ;
    public final C19475711Hn LJIIJ;
    public final C19475711Hn LJIIJJI;
    public final C19475711Hn LJIIL;
    public final C1654810tAF LJIILIIL;

    @Override // X.InterfaceC1648550t09
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC1648550t09
    public final InterfaceC1648710t0P LIZ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1653060t7Q
    public final void LIZLLL(int i, long j) {
        this.LJI.onNext(Unit.LIZ);
    }

    @Override // X.InterfaceC1653060t7Q
    public final void LIZJ(int i, long j, long j2) {
        this.LJII.onNext(Unit.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0tAF] */
    public C1654800tAE(a aVar, InterfaceC1630630sXF interfaceC1630630sXF, AwS569S0100000_25 awS569S0100000_25, InterfaceC1654860tAK interfaceC1654860tAK) {
        this.LIZ = aVar;
        this.LIZIZ = interfaceC1630630sXF;
        this.LIZJ = awS569S0100000_25;
        this.LIZLLL = interfaceC1654860tAK;
        C11RK<Unit> c11rk = new C11RK<>();
        this.LJFF = c11rk;
        C11RK<Unit> c11rk2 = new C11RK<>();
        this.LJI = c11rk2;
        C11RK<Unit> c11rk3 = new C11RK<>();
        this.LJII = c11rk3;
        C11RK<Pair<Boolean, C1448290nn9>> c11rk4 = new C11RK<>();
        this.LJIIIIZZ = c11rk4;
        this.LJIIIZ = new C19475711Hn(c11rk3);
        this.LJIIJ = new C19475711Hn(c11rk);
        this.LJIIJJI = new C19475711Hn(c11rk2);
        this.LJIIL = new C19475711Hn(c11rk4);
        this.LJIILIIL = new InterfaceC1648710t0P() { // from class: X.0tAF
            @Override // X.InterfaceC1648710t0P
            public final boolean O0() {
                return false;
            }

            @Override // X.InterfaceC1648710t0P
            public final void R2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void S2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void U2(float f, float f2) {
            }

            @Override // X.InterfaceC1648710t0P
            public final void W2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void p2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void Q2() {
                this.LIZ.LJII.onNext(Unit.LIZ);
            }

            @Override // X.InterfaceC1648710t0P
            public final void T2(boolean z) {
                if (z) {
                    return;
                }
                this.LIZ.LJIIIIZZ.onNext(new Pair<>(Boolean.TRUE, new C1448290nn9(EnumC1448830no1.CLICK, 0, 0L, 14)));
                this.LIZ.LJI.onNext(Unit.LIZ);
            }

            @Override // X.InterfaceC1648710t0P
            public final void V2(boolean z) {
                if (Intrinsics.LJFF(((InterfaceC1648570t0B) this.LIZ.LJ.getValue()).isRecording().LIZJ(), Boolean.TRUE)) {
                    this.LIZ.LJFF.onNext(Unit.LIZ);
                }
            }

            @Override // X.InterfaceC1648710t0P
            public final void y2(EnumC1448830no1 enumC1448830no1) {
                this.LIZ.LJIIIIZZ.onNext(new Pair<>(Boolean.FALSE, new C1448290nn9(enumC1448830no1, 0, 0L, 14)));
            }
        };
    }
}
