package X;

import com.ss.android.ugc.aweme.commercialize.router.impl.CRouter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cot, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.router.impl.CRouter$goSyncWithResult$1", f = "CRouter.kt", l = {83}, m = "invokeSuspend")
public final class C1026530cot extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ List<InterfaceC1026720cpC> LLILLJJLI;
    public final /* synthetic */ CRouter LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1026530cot(List<? extends InterfaceC1026720cpC> list, CRouter cRouter, InterfaceC1364105Vn<? super C1026530cot> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = cRouter;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1026530cot(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CRouter@8088.goSyncWithResult$1");
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
            List<InterfaceC1026720cpC> list = this.LLILLJJLI;
            CRouter cRouter = this.LLILLL;
            C1026630cp3 c1026630cp3 = new C1026630cp3(list, cRouter.LIZ, cRouter.LIZIZ, cRouter.LIZJ);
            this.LL = 1;
            obj = c1026630cp3.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CRouter@8088.goSyncWithResult$1");
                return objLJFF;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(((C1026670cp7) obj).LIZJ);
        C1C7U.LIZIZ("CRouter@8088.goSyncWithResult$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
