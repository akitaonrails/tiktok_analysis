package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594850NUt implements InterfaceC1420105h9 {
    public final Function1<Float, Float> LIZ;
    public final C594860NUu LIZIZ = new InterfaceC1392705cj() { // from class: X.0NUu
        @Override // X.InterfaceC1392705cj
        public final float LIZJ(float f) {
            boolean z;
            if (Float.isNaN(f)) {
                return 0.0f;
            }
            float fFloatValue = this.LIZ.LIZ.invoke(Float.valueOf(f)).floatValue();
            C05P0<Boolean> c05p0 = this.LIZ.LJ;
            boolean z2 = true;
            if (fFloatValue > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            ((C13FE) c05p0).setValue(Boolean.valueOf(z));
            C05P0<Boolean> c05p02 = this.LIZ.LJFF;
            if (fFloatValue >= 0.0f) {
                z2 = false;
            }
            ((C13FE) c05p02).setValue(Boolean.valueOf(z2));
            return fFloatValue;
        }
    };
    public final C594890NUx LIZJ = new C594890NUx();
    public final C05P0<Boolean> LIZLLL;
    public final C05P0<Boolean> LJ;
    public final C05P0<Boolean> LJFF;

    @Override // X.InterfaceC1420105h9
    public final /* synthetic */ boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC1420105h9
    public final /* synthetic */ boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC1420105h9
    public final boolean LIZIZ() {
        return ((Boolean) ((C13FE) this.LIZLLL).getValue()).booleanValue();
    }

    public final boolean LJFF() {
        return ((Boolean) ((C13FE) this.LJ).getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0NUu] */
    public C594850NUt(Function1<? super Float, Float> function1) {
        this.LIZ = function1;
        Boolean bool = Boolean.FALSE;
        this.LIZLLL = C20028913Yh.LJI(bool);
        this.LJ = C20028913Yh.LJI(bool);
        this.LJFF = C20028913Yh.LJI(bool);
    }

    @Override // X.InterfaceC1420105h9
    public final float LJ(float f) {
        return this.LIZ.invoke(Float.valueOf(f)).floatValue();
    }

    @Override // X.InterfaceC1420105h9
    public final Object LIZ(EnumC1384205bM enumC1384205bM, Function2<? super InterfaceC1392705cj, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJ = C2296808zG.LJ(new C594840NUs(this, enumC1384205bM, function2, null), interfaceC1364105Vn);
        if (objLJ == C099R.LJFF()) {
            return objLJ;
        }
        return Unit.LIZ;
    }
}
