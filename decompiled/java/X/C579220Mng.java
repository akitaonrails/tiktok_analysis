package X;

import com.ss.android.ugc.aweme.shortvideo.component.a;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579220Mng implements InterfaceC1648550t09, InterfaceC1653060t7Q {
    public final a LIZ;
    public final InterfaceC1630630sXF LIZIZ;
    public final Function0<InterfaceC578600Mmg> LIZJ;
    public final Function0<InterfaceC1648570t0B> LIZLLL;
    public final Function0<Long> LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 812));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 813));
    public final C11RK<Unit> LJII;
    public final C11RK<Pair<Boolean, C1448290nn9>> LJIIIIZZ;
    public final C11RK<Unit> LJIIIZ;
    public final C11RK<Unit> LJIIJ;
    public final C11RK<Pair<Float, Float>> LJIIJJI;
    public final C11RK<Unit> LJIIL;
    public final C19475711Hn LJIILIIL;
    public final C19475711Hn LJIILJJIL;
    public final C19475711Hn LJIILL;
    public final C19475711Hn LJIILLIIL;
    public final C19475711Hn LJIIZILJ;
    public final C19475711Hn LJIJ;
    public boolean LJIJI;
    public final C579230Mnh LJIJJ;
    public final boolean LJIJJLI;

    @Override // X.InterfaceC1648550t09
    public final InterfaceC1648710t0P LIZ() {
        return this.LJIJJ;
    }

    @Override // X.InterfaceC1648550t09
    public final boolean LIZIZ() {
        return this.LJIJJLI;
    }

    public final void LJ(boolean z) {
        AwS552S0100000_8 awS552S0100000_8;
        if (z) {
            awS552S0100000_8 = new AwS552S0100000_8(this, 811);
        } else {
            awS552S0100000_8 = null;
        }
        if (this.LIZ.LJ2() && this.LIZ.X80() != null) {
            Function1<Function0<Unit>, Unit> function1X80 = this.LIZ.X80();
            if (function1X80 != null) {
                function1X80.invoke(new AwS409S0200000_8(this, awS552S0100000_8, 100));
                return;
            }
            return;
        }
        this.LJIIJ.onNext(Unit.LIZ);
        if (awS552S0100000_8 == null) {
            return;
        }
        awS552S0100000_8.invoke();
    }

    @Override // X.InterfaceC1653060t7Q
    public final void LIZLLL(int i, long j) {
        this.LJIIIIZZ.onNext(new Pair<>(Boolean.TRUE, new C1448290nn9(EnumC1448830no1.COUNT_DOWN, i, j, 8)));
        LJ(true);
    }

    @Override // X.InterfaceC1653060t7Q
    public final void LIZJ(int i, long j, long j2) {
        this.LJII.onNext(Unit.LIZ);
        this.LJIIIIZZ.onNext(new Pair<>(Boolean.FALSE, new C1448290nn9(EnumC1448830no1.COUNT_DOWN, i, j2, 8)));
        InterfaceC1630630sXF interfaceC1630630sXF = this.LIZIZ;
        interfaceC1630630sXF.W9(true);
        interfaceC1630630sXF.tv(1);
        interfaceC1630630sXF.dd(true);
        interfaceC1630630sXF.T5();
        ((InterfaceC1648570t0B) this.LJI.getValue()).z80(j);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0Mnh] */
    public C579220Mng(a aVar, InterfaceC1630630sXF interfaceC1630630sXF, AwS552S0100000_8 awS552S0100000_8, AwS552S0100000_8 awS552S0100000_82, AwS552S0100000_8 awS552S0100000_83) {
        this.LIZ = aVar;
        this.LIZIZ = interfaceC1630630sXF;
        this.LIZJ = awS552S0100000_8;
        this.LIZLLL = awS552S0100000_82;
        this.LJ = awS552S0100000_83;
        C11RK<Unit> c11rk = new C11RK<>();
        this.LJII = c11rk;
        C11RK<Pair<Boolean, C1448290nn9>> c11rk2 = new C11RK<>();
        this.LJIIIIZZ = c11rk2;
        C11RK<Unit> c11rk3 = new C11RK<>();
        this.LJIIIZ = c11rk3;
        C11RK<Unit> c11rk4 = new C11RK<>();
        this.LJIIJ = c11rk4;
        C11RK<Pair<Float, Float>> c11rk5 = new C11RK<>();
        this.LJIIJJI = c11rk5;
        C11RK<Unit> c11rk6 = new C11RK<>();
        this.LJIIL = c11rk6;
        this.LJIILIIL = new C19475711Hn(c11rk);
        this.LJIILJJIL = new C19475711Hn(c11rk2);
        this.LJIILL = new C19475711Hn(c11rk3);
        this.LJIILLIIL = new C19475711Hn(c11rk4);
        this.LJIIZILJ = new C19475711Hn(c11rk5);
        this.LJIJ = new C19475711Hn(c11rk6);
        this.LJIJJ = new InterfaceC1648710t0P() { // from class: X.0Mnh
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
            public final void W2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void Q2() {
                this.LIZ.LJII.onNext(Unit.LIZ);
            }

            @Override // X.InterfaceC1648710t0P
            public final void p2() {
                if (Intrinsics.LJFF(((InterfaceC1648570t0B) this.LIZ.LJI.getValue()).isRecording().LIZJ(), Boolean.TRUE)) {
                    this.LIZ.LJIIL.onNext(Unit.LIZ);
                }
            }

            @Override // X.InterfaceC1648710t0P
            public final void T2(boolean z) {
                if (z) {
                    C576730Mjf.LJIIIZ("CameraLayoutRecordLayoutPresenter", "onTakePhoto isLongPress");
                } else {
                    this.LIZ.LJIIIIZZ.onNext(new Pair<>(Boolean.TRUE, new C1448290nn9(EnumC1448830no1.CLICK, 0, 0L, 14)));
                    this.LIZ.LJ(false);
                }
            }

            @Override // X.InterfaceC1648710t0P
            public final void V2(boolean z) {
                this.LIZ.LJIIIZ.onNext(Unit.LIZ);
            }

            @Override // X.InterfaceC1648710t0P
            public final void y2(EnumC1448830no1 enumC1448830no1) {
                this.LIZ.LJIIIIZZ.onNext(new Pair<>(Boolean.FALSE, new C1448290nn9(enumC1448830no1, 0, 0L, 14)));
            }

            @Override // X.InterfaceC1648710t0P
            public final void U2(float f, float f2) {
                this.LIZ.LJIIJJI.onNext(new Pair<>(Float.valueOf(f), Float.valueOf(f2)));
            }
        };
        this.LJIJJLI = true;
    }
}
