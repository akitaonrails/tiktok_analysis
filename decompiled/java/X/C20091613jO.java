package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS396S0200000_30;
import njp.a;

/* JADX INFO: renamed from: X.13jO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {135, 151}, m = "invokeSuspend")
public final class C20091613jO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1686250tyx<Float, C1677280tkU>>, Object> {
    public C817403Hg LL;
    public int LLILLJJLI;
    public final /* synthetic */ C20091513jN LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ Function1<Float, Unit> LLILZIL;
    public final /* synthetic */ InterfaceC1392705cj LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20091613jO(float f, InterfaceC1392705cj interfaceC1392705cj, C20091513jN c20091513jN, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20091513jN;
        this.LLILZ = f;
        this.LLILZIL = function1;
        this.LLILZLL = interfaceC1392705cj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20091513jN c20091513jN = this.LLILLL;
        return new C20091613jO(this.LLILZ, this.LLILZLL, c20091513jN, interfaceC1364105Vn, this.LLILZIL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C817403Hg c817403Hg;
        Object objLIZJ = obj;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZJ);
                    return objLIZJ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c817403Hg = this.LL;
            C155000ia.LIZIZ(objLIZJ);
        } else {
            C155000ia.LIZIZ(objLIZJ);
            float fLIZ = this.LLILLL.LIZ.LIZ(this.LLILZ, C1677880tlS.LIZ(this.LLILLL.LIZIZ, 0.0f, this.LLILZ));
            if (!(!Float.isNaN(fLIZ))) {
                C1691080u6k.LIZJ("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            c817403Hg = new C817403Hg();
            float fAbs = Math.abs(fLIZ) * Math.signum(this.LLILZ);
            c817403Hg.element = fAbs;
            this.LLILZIL.invoke(C2286608xc.LIZLLL(fAbs));
            C20091513jN c20091513jN = this.LLILLL;
            InterfaceC1392705cj interfaceC1392705cj = this.LLILZLL;
            float f = c817403Hg.element;
            float f2 = this.LLILZ;
            AwS396S0200000_30 awS396S0200000_30 = new AwS396S0200000_30(c817403Hg, (C817403Hg) this.LLILZIL, (Function1<? super Float, Unit>) 44);
            this.LL = c817403Hg;
            this.LLILLJJLI = 1;
            objLIZJ = C20091513jN.LIZJ(c20091513jN, interfaceC1392705cj, f, f2, awS396S0200000_30, this);
            if (objLIZJ == objLJFF) {
                return objLJFF;
            }
        }
        C1677580tky c1677580tky = (C1677580tky) objLIZJ;
        float fLIZIZ = this.LLILLL.LIZ.LIZIZ(((Number) c1677580tky.LJIIL()).floatValue());
        if (!(true ^ Float.isNaN(fLIZIZ))) {
            C1691080u6k.LIZJ("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        c817403Hg.element = fLIZIZ;
        InterfaceC1392705cj interfaceC1392705cj2 = this.LLILZLL;
        C1677580tky c1677580tkyLIZJ = C1677590tkz.LIZJ(c1677580tky, 0.0f, 0.0f, 30);
        InterfaceC1677030tk5<Float> interfaceC1677030tk5 = this.LLILLL.LIZJ;
        AwS396S0200000_30 awS396S0200000_302 = new AwS396S0200000_30(c817403Hg, (C817403Hg) this.LLILZIL, (Function1<? super Float, Unit>) 43);
        this.LL = null;
        this.LLILLJJLI = 2;
        objLIZJ = C20091013jI.LIZJ(interfaceC1392705cj2, fLIZIZ, fLIZIZ, c1677580tkyLIZJ, interfaceC1677030tk5, awS396S0200000_302, this);
        if (objLIZJ != objLJFF) {
            return objLIZJ;
        }
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1686250tyx<Float, C1677280tkU>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
