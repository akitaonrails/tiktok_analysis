package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS410S0200000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OxZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "tiktok.compose.paging.PagingLazyListExtensionsKt$LaunchPagingEffect$2$1", f = "PagingLazyListExtensions.kt", l = {71}, m = "invokeSuspend")
public final class C636310OxZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P1<Integer> LLILLJJLI;
    public final /* synthetic */ C05P1<Integer> LLILLL;
    public final /* synthetic */ InterfaceC636240OxS<T> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C05P1<Boolean> LLILZLL;
    public final /* synthetic */ C05P1<Boolean> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C636310OxZ(int i, C05P1 c05p1, C05P1 c05p12, C05P1 c05p13, C05P1 c05p14, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC636240OxS interfaceC636240OxS) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p1;
        this.LLILLL = c05p12;
        this.LLILZ = interfaceC636240OxS;
        this.LLILZIL = i;
        this.LLILZLL = c05p13;
        this.LLIZ = c05p14;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C636310OxZ(this.LLILZIL, this.LLILLJJLI, this.LLILLL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn, this.LLILZ);
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
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS410S0200000_9(this.LLILLJJLI, this.LLILLL, (C05P1<Integer>) 6));
            final InterfaceC636240OxS<T> interfaceC636240OxS = this.LLILZ;
            final int i2 = this.LLILZIL;
            final C05P1<Boolean> c05p1 = this.LLILZLL;
            final C05P1<Integer> c05p12 = this.LLILLJJLI;
            final C05P1<Integer> c05p13 = this.LLILLL;
            final C05P1<Boolean> c05p14 = this.LLIZ;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0Oxa
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    ((Number) obj2).intValue();
                    Object objLIZIZ = C636280OxW.LIZIZ(i2, c05p1, c05p12, c05p13, c05p14, interfaceC1364105Vn, interfaceC636240OxS);
                    if (objLIZIZ != C099R.LJFF()) {
                        return Unit.LIZ;
                    }
                    return objLIZIZ;
                }
            };
            this.LL = 1;
            if (c095dLJIIIZ.collect(interfaceC346701Wf, this) == objLJFF) {
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
