package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01w6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.subonlyvideos.views.SubOnlyStoryPaywallFetchProtocol$startFetching$2$1$1", f = "SubOnlyStoryPaywallFetchProtocol.kt", l = {86}, m = "invokeSuspend")
public final class C493601w6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YC<Object> LLILLJJLI;
    public final /* synthetic */ C717210SBj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493601w6(C05YC<Object> c05yc, C717210SBj c717210SBj, InterfaceC1364105Vn<? super C493601w6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yc;
        this.LLILLL = c717210SBj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C493601w6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubOnlyStoryPaywallFetchProtocol@fed1.startFetching$2$1$1");
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
            C05YC<Object> c05yc = this.LLILLJJLI;
            Object obj2 = this.LLILLL.LIZIZ;
            this.LL = 1;
            if (c05yc.emit(obj2, this) == objLJFF) {
                C1C7U.LIZIZ("SubOnlyStoryPaywallFetchProtocol@fed1.startFetching$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyStoryPaywallFetchProtocol@fed1.startFetching$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
