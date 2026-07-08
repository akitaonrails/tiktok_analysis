package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "tiktok.compose.paging.PagingLazyListExtensionsKt$LaunchPagingEffect$1$1", f = "PagingLazyListExtensions.kt", l = {35}, m = "invokeSuspend")
public final class C636290OxX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C636330Oxb LLILLJJLI;
    public final /* synthetic */ InterfaceC636240OxS<T> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C636290OxX(C636330Oxb c636330Oxb, InterfaceC636240OxS<T> interfaceC636240OxS, InterfaceC1364105Vn<? super C636290OxX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c636330Oxb;
        this.LLILLL = interfaceC636240OxS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C636290OxX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
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
            if (this.LLILLJJLI.LIZIZ) {
                Function2<EnumC329800CwM, InterfaceC1364105Vn<? super Unit>, Object> function2LIZJ = this.LLILLL.LIZJ();
                EnumC329800CwM enumC329800CwM = EnumC329800CwM.REFRESH;
                this.LL = 1;
                if (function2LIZJ.invoke(enumC329800CwM, this) == objLJFF) {
                    return objLJFF;
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
