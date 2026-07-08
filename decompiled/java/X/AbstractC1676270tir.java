package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1676270tir {
    public C1695150uDJ LL;
    public boolean LLILLJJLI;
    public C1685400txa LLILLL;
    public float LLILZ = 1.0f;
    public EnumC1671200tag LLILZIL = EnumC1671200tag.Ltr;

    public boolean LIZ(float f) {
        return false;
    }

    public boolean LIZIZ(C1685400txa c1685400txa) {
        return false;
    }

    public void LIZJ(EnumC1671200tag enumC1671200tag) {
    }

    public abstract long LJIIIIZZ();

    public abstract void LJIIIZ(InterfaceC1675870tiD interfaceC1675870tiD);

    public AbstractC1676270tir() {
        new AwS604S0100000_25(this, 46);
    }

    public final void LJI(InterfaceC1675870tiD interfaceC1675870tiD, long j, float f, C1685400txa c1685400txa) {
        if (this.LLILZ != f) {
            if (!LIZ(f)) {
                if (f == 1.0f) {
                    C1695150uDJ c1695150uDJ = this.LL;
                    if (c1695150uDJ != null) {
                        c1695150uDJ.setAlpha(f);
                    }
                    this.LLILLJJLI = false;
                } else {
                    C1695150uDJ c1695150uDJLIZ = this.LL;
                    if (c1695150uDJLIZ == null) {
                        c1695150uDJLIZ = C1695550uDx.LIZ();
                        this.LL = c1695150uDJLIZ;
                    }
                    c1695150uDJLIZ.setAlpha(f);
                    this.LLILLJJLI = true;
                }
            }
            this.LLILZ = f;
        }
        if (!Intrinsics.LJFF(this.LLILLL, c1685400txa)) {
            if (!LIZIZ(c1685400txa)) {
                if (c1685400txa == null) {
                    C1695150uDJ c1695150uDJ2 = this.LL;
                    if (c1695150uDJ2 != null) {
                        c1695150uDJ2.LJIIJJI(null);
                    }
                    this.LLILLJJLI = false;
                } else {
                    C1695150uDJ c1695150uDJLIZ2 = this.LL;
                    if (c1695150uDJLIZ2 == null) {
                        c1695150uDJLIZ2 = C1695550uDx.LIZ();
                        this.LL = c1695150uDJLIZ2;
                    }
                    c1695150uDJLIZ2.LJIIJJI(c1685400txa);
                    this.LLILLJJLI = true;
                }
            }
            this.LLILLL = c1685400txa;
        }
        EnumC1671200tag layoutDirection = interfaceC1675870tiD.getLayoutDirection();
        if (this.LLILZIL != layoutDirection) {
            LIZJ(layoutDirection);
            this.LLILZIL = layoutDirection;
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() >> 32)) - Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1675870tiD.LIZIZ() & 4294967295L)) - Float.intBitsToFloat(i2);
        interfaceC1675870tiD.LJLJI().LIZ.LJ(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f > 0.0f) {
            try {
                if (Float.intBitsToFloat(i) > 0.0f && Float.intBitsToFloat(i2) > 0.0f) {
                    if (this.LLILLJJLI) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i);
                        C1683130ttv c1683130ttvLIZJ = C1671570tbH.LIZJ(0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
                        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1675870tiD.LJLJI().LIZ();
                        C1695150uDJ c1695150uDJLIZ3 = this.LL;
                        if (c1695150uDJLIZ3 == null) {
                            c1695150uDJLIZ3 = C1695550uDx.LIZ();
                            this.LL = c1695150uDJLIZ3;
                        }
                        try {
                            interfaceC1686290tz1LIZ.LIZLLL(c1683130ttvLIZJ, c1695150uDJLIZ3);
                            LJIIIZ(interfaceC1675870tiD);
                            interfaceC1686290tz1LIZ.LJIIJ();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            interfaceC1686290tz1LIZ.LJIIJ();
                            throw th;
                        }
                    } else {
                        LJIIIZ(interfaceC1675870tiD);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                interfaceC1675870tiD.LJLJI().LIZ.LJ(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th2;
            }
        }
        interfaceC1675870tiD.LJLJI().LIZ.LJ(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }
}
