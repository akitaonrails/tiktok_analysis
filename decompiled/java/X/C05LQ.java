package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.recallmessage.ReEditViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS57S1000000_6;
import njp.a;

/* JADX INFO: renamed from: X.05LQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.recallmessage.ReEditViewModel$scheduleReEditExpiry$1", f = "ReEditViewModel.kt", l = {142}, m = "invokeSuspend")
public final class C05LQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ ReEditViewModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LQ(long j, ReEditViewModel reEditViewModel, String str, InterfaceC1364105Vn<? super C05LQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = reEditViewModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LQ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReEditViewModel@fcd5.scheduleReEditExpiry$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ReEditViewModel@fcd5.scheduleReEditExpiry$1");
                return objLJFF;
            }
        }
        ReEditViewModel reEditViewModel = this.LLILLL;
        String str = this.LLILZ;
        reEditViewModel.LL.remove(str);
        reEditViewModel.setStateImmediate(new AwS57S1000000_6(str, 6));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReEditViewModel@fcd5.scheduleReEditExpiry$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
