package X;

import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13Uv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20019913Uv implements C05P1 {
    public final C099F LL = C090F.LIZIZ();
    public final C05P0 LLILLJJLI = C20028913Yh.LJI(null);
    public final C05P0 LLILLL = C20028913Yh.LJI(null);
    public final C13YZ LLILZ;
    public final C13YZ LLILZIL;

    @Override // X.C05P1
    public final Object getValue() {
        return ((C13FE) this.LLILLJJLI).getValue();
    }

    public C20019913Uv() {
        C20028913Yh.LJ(new AwS574S0100000_30(this, 389));
        this.LLILZ = C20028913Yh.LJ(new AwS574S0100000_30(this, 387));
        C20028913Yh.LJ(new AwS574S0100000_30(this, 388));
        this.LLILZIL = C20028913Yh.LJ(new AwS574S0100000_30(this, 390));
    }

    public final synchronized void LJIIL(C1294720jnS c1294720jnS) {
        if (((Boolean) this.LLILZ.getValue()).booleanValue()) {
            return;
        }
        ((C13FE) this.LLILLJJLI).setValue(c1294720jnS);
        this.LL.LJJLIIIJILLIZJL(c1294720jnS);
    }
}
