package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01w7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.subonlyvideos.views.SubOnlyVideoPaywallFetchProtocol$startFetching$2$1$1", f = "SubOnlyVideoPaywallFetchProtocol.kt", l = {90}, m = "invokeSuspend")
public final class C493701w7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YC<Object> LLILLJJLI;
    public final /* synthetic */ C717220SBk LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493701w7(C05YC<Object> c05yc, C717220SBk c717220SBk, InterfaceC1364105Vn<? super C493701w7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yc;
        this.LLILLL = c717220SBk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C493701w7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubOnlyVideoPaywallFetchProtocol@acb1.startFetching$2$1$1");
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
                C1C7U.LIZIZ("SubOnlyVideoPaywallFetchProtocol@acb1.startFetching$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyVideoPaywallFetchProtocol@acb1.startFetching$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
