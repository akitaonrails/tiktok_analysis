package X;

import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKCustomViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKCustomViewModel$setFlagWithTimeout$1", f = "TTKRegistrationBaseFragment.kt", l = {1632}, m = "invokeSuspend")
public final class C1402305eH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ TTKCustomViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1402305eH(C118300cf c118300cf, TTKCustomViewModel tTKCustomViewModel, InterfaceC1364105Vn<? super C1402305eH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c118300cf;
        this.LLILLL = tTKCustomViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1402305eH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTKCustomViewModel@9bbe.setFlagWithTimeout$1");
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
            long j = ((long) this.LLILLJJLI.element) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("TTKCustomViewModel@9bbe.setFlagWithTimeout$1");
                return objLJFF;
            }
        }
        TTKCustomViewModel tTKCustomViewModel = this.LLILLL;
        if (!tTKCustomViewModel.LLIZ) {
            tTKCustomViewModel.LLILZLL.postValue(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTKCustomViewModel@9bbe.setFlagWithTimeout$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
