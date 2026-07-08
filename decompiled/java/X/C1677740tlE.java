package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tlE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxMotionCurveKt$rememberTuxMotionCurve$1$1", f = "TuxMotionCurve.kt", l = {}, m = "invokeSuspend")
public final class C1677740tlE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1677750tlF LL;
    public final /* synthetic */ C08LR LLILLJJLI;
    public final /* synthetic */ C08LR LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1677740tlE(C1677750tlF c1677750tlF, C08LR c08lr, C08LR c08lr2, InterfaceC1364105Vn<? super C1677740tlE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1677750tlF;
        this.LLILLJJLI = c08lr;
        this.LLILLL = c08lr2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1677740tlE(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxMotionCurveKt@6831.rememberTuxMotionCurve$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1677750tlF c1677750tlF = this.LL;
        c1677750tlF.LIZ = this.LLILLJJLI;
        C19968013Aw<C1677730tlD<?, ?>> c19968013Aw = c1677750tlF.LIZIZ;
        C1677730tlD<?, ?>[] c1677730tlDArr = c19968013Aw.LL;
        int i = c19968013Aw.LLILLL;
        for (int i2 = 0; i2 < i; i2++) {
            C1677730tlD<?, ?> c1677730tlD = c1677730tlDArr[i2];
            c1677730tlD.LLJI = c1677730tlD.LLJILJIL.LIZIZ();
            c1677730tlD.LJIIL();
        }
        if (((Boolean) ((C13FE) c1677750tlF.LJ).getValue()).booleanValue()) {
            C19968013Aw<C1677730tlD<?, ?>> c19968013Aw2 = c1677750tlF.LIZIZ;
            C1677730tlD<?, ?>[] c1677730tlDArr2 = c19968013Aw2.LL;
            int i3 = c19968013Aw2.LLILLL;
            for (int i4 = 0; i4 < i3; i4++) {
                C1677730tlD<?, ?> c1677730tlD2 = c1677730tlDArr2[i4];
                ((C13FE) c1677730tlD2.LLILZLL).setValue(c1677730tlD2.LLJIJIL.LIZLLL);
                c1677730tlD2.LLIZLLLIL = true;
                c1677730tlD2.LLIZ = false;
            }
            c1677750tlF.LIZLLL = Long.MIN_VALUE;
            C05P0 c05p0 = c1677750tlF.LJ;
            Boolean bool = Boolean.TRUE;
            ((C13FE) c05p0).setValue(bool);
            ((C13FE) c1677750tlF.LIZJ).setValue(bool);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TuxMotionCurveKt@6831.rememberTuxMotionCurve$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
