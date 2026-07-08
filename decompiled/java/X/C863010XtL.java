package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKPageDataOperator$resetCropDataAndState$1", f = "ECMMKDataOperator.kt", l = {1216, 1217}, m = "invokeSuspend")
public final class C863010XtL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1772620wEG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863010XtL(C1772620wEG c1772620wEG, InterfaceC1364105Vn<? super C863010XtL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1772620wEG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863010XtL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECMMKPageDataOperator@9a61.resetCropDataAndState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ECMMKPageDataOperator@9a61.resetCropDataAndState$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = this.LLILLJJLI.LIZIZ.LLJJIII;
            C1772430wDx c1772430wDx = C1772430wDx.LIZIZ;
            this.LL = 1;
            c2252321DDq.setValue(c1772430wDx);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("ECMMKPageDataOperator@9a61.resetCropDataAndState$1");
                return objLJFF;
            }
        }
        C2252321DDq c2252321DDq2 = this.LLILLJJLI.LIZIZ.LLJJIJI;
        C1774390wH7 c1774390wH7 = C1774390wH7.LIZ;
        this.LL = 2;
        c2252321DDq2.setValue(c1774390wH7);
        if (Unit.LIZ == objLJFF) {
            C1C7U.LIZIZ("ECMMKPageDataOperator@9a61.resetCropDataAndState$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ECMMKPageDataOperator@9a61.resetCropDataAndState$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
