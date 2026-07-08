package X;

import com.ss.android.ugc.aweme.tako.detail.operator.BatchDetailList;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM;
import kotlin.Unit;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0Cv8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM$queryBatchAweme$1$2$1", f = "TakoNimbleVM.kt", l = {}, m = "invokeSuspend")
public final class C329040Cv8 extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super BatchDetailList>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoNimbleVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329040Cv8(TakoNimbleVM takoNimbleVM, InterfaceC1364105Vn<? super C329040Cv8> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = takoNimbleVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoNimbleVM@c644.queryBatchAweme$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.setState(new AwS583S0100000_4((Throwable) this.LL, 253));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoNimbleVM@c644.queryBatchAweme$1$2$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super BatchDetailList> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C329040Cv8 c329040Cv8 = new C329040Cv8(this.LLILLJJLI, interfaceC1364105Vn);
        c329040Cv8.LL = th;
        return c329040Cv8.invokeSuspend(Unit.LIZ);
    }
}
