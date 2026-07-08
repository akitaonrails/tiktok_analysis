package X;

import kotlin.Unit;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.13YD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13YD {
    public final C19968013Aw<C13YA> LIZ = new C19968013Aw<>(new C13YA[16]);

    public final void LIZIZ() {
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, this.LIZ.LLILLL);
        int i = intRangeLJIILJJIL.LL;
        int i2 = intRangeLJIILJJIL.LLILLJJLI;
        if (i <= i2) {
            while (true) {
                InterfaceC20236714Gf<Unit> interfaceC20236714Gf = this.LIZ.LL[i].LIZIZ;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC20236714Gf.resumeWith(unit);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.LIZ.LJIIIZ();
    }

    public final void LIZ(Throwable th) {
        C19968013Aw<C13YA> c19968013Aw = this.LIZ;
        int i = c19968013Aw.LLILLL;
        InterfaceC20236714Gf[] interfaceC20236714GfArr = new InterfaceC20236714Gf[i];
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC20236714GfArr[i2] = c19968013Aw.LL[i2].LIZIZ;
        }
        for (int i3 = 0; i3 < i; i3++) {
            interfaceC20236714GfArr[i3].LJJIIZ(th);
        }
        if (this.LIZ.LLILLL != 0) {
            C1691080u6k.LIZJ("uncancelled requests present");
        }
    }
}
