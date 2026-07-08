package X;

import kotlin.Unit;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1681200tqo implements InterfaceC1668800tWo {
    public final C05P0 LL;
    public final C05P0 LLILLJJLI;
    public final C05P0 LLILLL;
    public final C05P0 LLILZ;
    public final C05P0 LLILZIL;
    public final C05P0 LLILZLL;
    public final C05P0 LLIZ;
    public final C13YZ LLIZLLLIL;
    public final C05P0 LLJ;
    public final C05P0 LLJI;
    public final C05P0 LLJIJIL;
    public final C05P0 LLJILJIL;
    public final C13YZ LLJILJILJ;
    public final C594890NUx LLJILLL;

    @Override // X.InterfaceC1670460tZU
    public final int LJIIJJI() {
        return ((Number) this.LLILLJJLI.getValue()).intValue();
    }

    @Override // X.InterfaceC1670460tZU
    public final AbstractC1670470tZV LJIILL() {
        return (AbstractC1670470tZV) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC1670460tZU
    public final C1294720jnS getComposition() {
        return (C1294720jnS) this.LLJ.getValue();
    }

    @Override // X.InterfaceC1670460tZU
    public final float getProgress() {
        return ((Number) this.LLJIJIL.getValue()).floatValue();
    }

    @Override // X.InterfaceC1670460tZU
    public final float getSpeed() {
        return ((Number) this.LLILZLL.getValue()).floatValue();
    }

    public C1681200tqo() {
        Boolean bool = Boolean.FALSE;
        this.LL = C20028913Yh.LJI(bool);
        this.LLILLJJLI = C20028913Yh.LJI(1);
        this.LLILLL = C20028913Yh.LJI(1);
        this.LLILZ = C20028913Yh.LJI(bool);
        this.LLILZIL = C20028913Yh.LJI(null);
        this.LLILZLL = C20028913Yh.LJI(Float.valueOf(1.0f));
        this.LLIZ = C20028913Yh.LJI(bool);
        this.LLIZLLLIL = C20028913Yh.LJ(new AwS569S0100000_25(this, 1074));
        this.LLJ = C20028913Yh.LJI(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.LLJI = C20028913Yh.LJI(fValueOf);
        this.LLJIJIL = C20028913Yh.LJI(fValueOf);
        this.LLJILJIL = C20028913Yh.LJI(Long.MIN_VALUE);
        this.LLJILJILJ = C20028913Yh.LJ(new AwS569S0100000_25(this, 1073));
        C20028913Yh.LJ(new AwS569S0100000_25(this, 1075));
        this.LLJILLL = new C594890NUx();
    }

    @Override // X.C05P1
    public final Float getValue() {
        return Float.valueOf(getProgress());
    }

    public final void LJIILIIL(int i) {
        ((C13FE) this.LLILLJJLI).setValue(Integer.valueOf(i));
    }

    public final void LJIILLIIL(boolean z) {
        ((C13FE) this.LL).setValue(Boolean.valueOf(z));
    }

    public final void LJIIZILJ(float f) {
        C1294720jnS composition;
        ((C13FE) this.LLJI).setValue(Float.valueOf(f));
        if (((Boolean) ((C13FE) this.LLIZ).getValue()).booleanValue() && (composition = getComposition()) != null) {
            f -= f % (1 / composition.LJIIL);
        }
        ((C13FE) this.LLJIJIL).setValue(Float.valueOf(f));
    }

    public final boolean LJIIL(int i, long j) {
        long jLongValue;
        float fLIZIZ;
        float fLIZ;
        float fFloatValue;
        float f;
        C1294720jnS composition = getComposition();
        if (composition == null) {
            return true;
        }
        if (((Number) ((C13FE) this.LLJILJIL).getValue()).longValue() == Long.MIN_VALUE) {
            jLongValue = 0;
        } else {
            jLongValue = j - ((Number) ((C13FE) this.LLJILJIL).getValue()).longValue();
        }
        ((C13FE) this.LLJILJIL).setValue(Long.valueOf(j));
        AbstractC1670470tZV abstractC1670470tZVLJIILL = LJIILL();
        if (abstractC1670470tZVLJIILL != null) {
            fLIZIZ = abstractC1670470tZVLJIILL.LIZIZ();
        } else {
            fLIZIZ = 0.0f;
        }
        AbstractC1670470tZV abstractC1670470tZVLJIILL2 = LJIILL();
        if (abstractC1670470tZVLJIILL2 != null) {
            fLIZ = abstractC1670470tZVLJIILL2.LIZ();
        } else {
            fLIZ = 1.0f;
        }
        float fLIZIZ2 = ((jLongValue / ((long) 1000000)) / composition.LIZIZ()) * ((Number) this.LLIZLLLIL.getValue()).floatValue();
        if (((Number) this.LLIZLLLIL.getValue()).floatValue() < 0.0f) {
            fFloatValue = fLIZIZ - (((Number) ((C13FE) this.LLJI).getValue()).floatValue() + fLIZIZ2);
        } else {
            fFloatValue = (((Number) ((C13FE) this.LLJI).getValue()).floatValue() + fLIZIZ2) - fLIZ;
        }
        if (fFloatValue < 0.0f) {
            LJIIZILJ(C13LZ.LIZLLL(((Number) ((C13FE) this.LLJI).getValue()).floatValue(), fLIZIZ, fLIZ) + fLIZIZ2);
            return true;
        }
        float f2 = fLIZ - fLIZIZ;
        int i2 = ((int) (fFloatValue / f2)) + 1;
        if (LJIIJJI() + i2 > i) {
            LJIIZILJ(((Number) this.LLJILJILJ.getValue()).floatValue());
            LJIILIIL(i);
            return false;
        }
        LJIILIIL(LJIIJJI() + i2);
        float f3 = fFloatValue - ((i2 - 1) * f2);
        if (((Number) this.LLIZLLLIL.getValue()).floatValue() < 0.0f) {
            f = fLIZ - f3;
        } else {
            f = fLIZIZ + f3;
        }
        LJIIZILJ(f);
        return true;
    }

    @Override // X.InterfaceC1668800tWo
    public final Object LJI(C1294720jnS c1294720jnS, float f, int i, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C594890NUx c594890NUx = this.LLJILLL;
        C1681220tqq c1681220tqq = new C1681220tqq(this, c1294720jnS, f, i, z, null);
        EnumC1384205bM enumC1384205bM = EnumC1384205bM.Default;
        c594890NUx.getClass();
        Object objLJ = C2296808zG.LJ(new C594880NUw(enumC1384205bM, c594890NUx, c1681220tqq, null), interfaceC1364105Vn);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1668800tWo
    public final Object LJII(C1294720jnS c1294720jnS, int i, int i2, boolean z, float f, AbstractC1670470tZV abstractC1670470tZV, float f2, boolean z2, EnumC1681150tqj enumC1681150tqj, boolean z3, InterfaceC1364105Vn interfaceC1364105Vn) {
        C594890NUx c594890NUx = this.LLJILLL;
        C1681190tqn c1681190tqn = new C1681190tqn(this, i, i2, z, f, abstractC1670470tZV, c1294720jnS, f2, z3, z2, enumC1681150tqj, null);
        EnumC1384205bM enumC1384205bM = EnumC1384205bM.Default;
        c594890NUx.getClass();
        Object objLJ = C2296808zG.LJ(new C594880NUw(enumC1384205bM, c594890NUx, c1681190tqn, null), interfaceC1364105Vn);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }
}
