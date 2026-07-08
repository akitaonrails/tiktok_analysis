package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05aw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1381605aw<T> {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final Function1<Float, Float> LIZ;
    public final Function0<Float> LIZIZ;
    public final InterfaceC1677030tk5<Float> LIZJ;
    public final Function1<T, Boolean> LIZLLL;
    public final C05P0 LJI;
    public final C05ZL LJIIJ;
    public final C13YZ LJIIJJI;
    public final C13YZ LJIIL;
    public final C05P0 LJIILIIL;
    public final C05P0 LJIILJJIL;
    public final C1381305at LJIILL;
    public final C1381805ay LJ = new C1381805ay();
    public final C1380705an LJFF = new C1380705an(this);
    public final C13YZ LJII = C20028913Yh.LJ(new AwS546S0100000_2(this, 33));
    public final C13YZ LJIIIIZZ = C20028913Yh.LJ(new AwS546S0100000_2(this, 29));
    public final C05P0 LJIIIZ = C20028913Yh.LJI(Float.valueOf(Float.NaN));

    public final Map<T, Float> LIZIZ() {
        return (Map) this.LJIILJJIL.getValue();
    }

    public final T LIZJ() {
        return (T) this.LJI.getValue();
    }

    public final float LIZLLL() {
        return ((Number) this.LJIIIZ.getValue()).floatValue();
    }

    public final float LJFF() {
        if (!Float.isNaN(LIZLLL())) {
            return LIZLLL();
        }
        "The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString();
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
    }

    public final float LJ(float f) {
        float fLIZLLL;
        if (Float.isNaN(LIZLLL())) {
            fLIZLLL = 0.0f;
        } else {
            fLIZLLL = LIZLLL();
        }
        return C13LZ.LIZLLL(fLIZLLL + f, ((Number) this.LJIIJJI.getValue()).floatValue(), ((Number) this.LJIIL.getValue()).floatValue());
    }

    public final boolean LJII(T t) {
        C1381805ay c1381805ay = this.LJ;
        AwS403S0200000_2 awS403S0200000_2 = new AwS403S0200000_2(this, (C1381605aw<int>) t, 3);
        boolean zLJFF = c1381805ay.LIZIZ.LJFF(null);
        if (zLJFF) {
            try {
                awS403S0200000_2.invoke();
                c1381805ay.LIZIZ.LIZIZ(null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1381805ay.LIZIZ.LIZIZ(null);
                throw th;
            }
        }
        return zLJFF;
    }

    public final Object LJI(float f, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        T tLIZJ = LIZJ();
        Object objLIZ = LIZ(LJFF(), f, tLIZJ);
        if (this.LIZLLL.invoke((T) objLIZ).booleanValue()) {
            Object objLIZJ = C1381205as.LIZJ(f, this, objLIZ, interfaceC1364105Vn);
            if (objLIZJ == C099R.LJFF()) {
                return objLIZJ;
            }
            return Unit.LIZ;
        }
        Object objLIZJ2 = C1381205as.LIZJ(f, this, tLIZJ, interfaceC1364105Vn);
        if (objLIZJ2 == C099R.LJFF()) {
            return objLIZJ2;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(Map<T, Float> map, InterfaceC1381705ax<T> interfaceC1381705ax) {
        boolean z;
        if (!Intrinsics.LJFF(LIZIZ(), map)) {
            Map<T, Float> mapLIZIZ = LIZIZ();
            Object value = this.LJII.getValue();
            boolean zIsEmpty = LIZIZ().isEmpty();
            ((C13FE) this.LJIILJJIL).setValue(map);
            if (LIZIZ().get(LIZJ()) != null) {
                z = true;
            } else {
                z = false;
            }
            if (zIsEmpty && z) {
                LJII(LIZJ());
            } else {
                if (interfaceC1381705ax == 0) {
                    return;
                }
                interfaceC1381705ax.LIZ(value, mapLIZIZ, map);
            }
        }
    }

    public final Object LIZ(float f, float f2, Object obj) {
        Object objLIZ;
        Map<T, Float> mapLIZIZ = LIZIZ();
        Float f3 = mapLIZIZ.get(obj);
        float fFloatValue = this.LIZIZ.invoke().floatValue();
        if (!Intrinsics.LIZLLL(f3, f) && f3 != null) {
            if (f3.floatValue() < f) {
                if (f2 >= fFloatValue) {
                    return C1381205as.LIZ(mapLIZIZ, f, true);
                }
                objLIZ = C1381205as.LIZ(mapLIZIZ, f, true);
                if (f < Math.abs(f3.floatValue() + Math.abs(this.LIZ.invoke(Float.valueOf(Math.abs(((Number) C2097608Jq.LJFF(objLIZ, mapLIZIZ)).floatValue() - f3.floatValue()))).floatValue()))) {
                    return obj;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    return C1381205as.LIZ(mapLIZIZ, f, false);
                }
                objLIZ = C1381205as.LIZ(mapLIZIZ, f, false);
                float fAbs = Math.abs(f3.floatValue() - Math.abs(this.LIZ.invoke(Float.valueOf(Math.abs(f3.floatValue() - ((Number) C2097608Jq.LJFF(objLIZ, mapLIZIZ)).floatValue()))).floatValue()));
                if (f < 0.0f) {
                    if (Math.abs(f) < fAbs) {
                        return obj;
                    }
                } else if (f > fAbs) {
                    return obj;
                }
            }
            return objLIZ;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1381605aw(T t, Function1<? super Float, Float> function1, Function0<Float> function0, InterfaceC1677030tk5<Float> interfaceC1677030tk5, Function1<? super T, Boolean> function12) {
        this.LIZ = function1;
        this.LIZIZ = function0;
        this.LIZJ = interfaceC1677030tk5;
        this.LIZLLL = function12;
        this.LJI = C20028913Yh.LJI(t);
        C20028913Yh.LIZLLL(C595410NWx.LIZ, new AwS546S0100000_2(this, 32));
        this.LJIIJ = C1691250u71.LIZ(0.0f);
        this.LJIIJJI = C20028913Yh.LJ(new AwS546S0100000_2(this, 31));
        this.LJIIL = C20028913Yh.LJ(new AwS546S0100000_2(this, 30));
        this.LJIILIIL = C20028913Yh.LJI(null);
        this.LJIILJJIL = C20028913Yh.LJI(C2097608Jq.LJ());
        this.LJIILL = new C1381305at(this);
    }
}
