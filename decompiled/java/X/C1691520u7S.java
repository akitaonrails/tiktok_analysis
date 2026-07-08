package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u7S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1$1", f = "CoreTextField.kt", l = {330}, m = "invokeSuspend")
public final class C1691520u7S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1684400tvy LLILLJJLI;
    public final /* synthetic */ C1686970u07 LLILLL;
    public final /* synthetic */ C1691930u87 LLILZ;
    public final /* synthetic */ C1691980u8C LLILZIL;
    public final /* synthetic */ InterfaceC1692600u9C LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1691520u7S(InterfaceC1684400tvy interfaceC1684400tvy, C1686970u07 c1686970u07, C1691930u87 c1691930u87, C1691980u8C c1691980u8C, InterfaceC1692600u9C interfaceC1692600u9C, InterfaceC1364105Vn<? super C1691520u7S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1684400tvy;
        this.LLILLL = c1686970u07;
        this.LLILZ = c1691930u87;
        this.LLILZIL = c1691980u8C;
        this.LLILZLL = interfaceC1692600u9C;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1691520u7S(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1683130ttv c1683130ttv;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1684400tvy interfaceC1684400tvy = this.LLILLJJLI;
            C1686970u07 c1686970u07 = this.LLILLL;
            C1691550u7V c1691550u7V = this.LLILZ.LIZ;
            C1692150u8T c1692150u8T = this.LLILZIL.LIZ;
            InterfaceC1692600u9C interfaceC1692600u9C = this.LLILZLL;
            this.LL = 1;
            int iLIZ = interfaceC1692600u9C.LIZ(C1692280u8g.LJFF(c1686970u07.LIZIZ));
            if (iLIZ < c1692150u8T.LIZ.LIZ.length()) {
                c1683130ttv = c1692150u8T.LIZIZ(iLIZ);
            } else if (iLIZ != 0) {
                c1683130ttv = c1692150u8T.LIZIZ(iLIZ - 1);
            } else {
                c1683130ttv = new C1683130ttv(0.0f, 0.0f, 1.0f, (int) (C1692720u9O.LIZ(c1691550u7V.LIZIZ, c1691550u7V.LJI, c1691550u7V.LJII, C1692720u9O.LIZ, 1) & 4294967295L));
            }
            Object objLIZ = interfaceC1684400tvy.LIZ(c1683130ttv, this);
            if (objLIZ != C099R.LJFF()) {
                objLIZ = Unit.LIZ;
            }
            if (objLIZ == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
