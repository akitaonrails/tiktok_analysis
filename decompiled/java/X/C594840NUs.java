package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", l = {198}, m = "invokeSuspend")
public final class C594840NUs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C594850NUt LLILLJJLI;
    public final /* synthetic */ EnumC1384205bM LLILLL;
    public final /* synthetic */ Function2<InterfaceC1392705cj, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C594840NUs(C594850NUt c594850NUt, EnumC1384205bM enumC1384205bM, Function2<? super InterfaceC1392705cj, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C594840NUs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c594850NUt;
        this.LLILLL = enumC1384205bM;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594840NUs(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            C594850NUt c594850NUt = this.LLILLJJLI;
            C594890NUx c594890NUx = c594850NUt.LIZJ;
            C594860NUu c594860NUu = c594850NUt.LIZIZ;
            EnumC1384205bM enumC1384205bM = this.LLILLL;
            C594830NUr c594830NUr = new C594830NUr(c594850NUt, this.LLILZ, null);
            this.LL = 1;
            c594890NUx.getClass();
            if (C2296808zG.LJ(new C594870NUv(enumC1384205bM, c594890NUx, c594830NUr, c594860NUu, null), this) == objLJFF) {
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
