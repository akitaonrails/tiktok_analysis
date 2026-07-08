package X;

import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.LoadMoreResponse;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Cuw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.TakoNimbleVM$requestSourceData$1$1$1", f = "TakoNimbleVM.kt", l = {}, m = "invokeSuspend")
public final class C328920Cuw extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super LoadMoreResponse>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Integer>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C328920Cuw(InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C328920Cuw> interfaceC1364105Vn2) {
        super(3, interfaceC1364105Vn2);
        this.LLILLJJLI = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoNimbleVM@c644.requestSourceData$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1364105Vn<AbstractC316870CbV<Integer>> interfaceC1364105Vn = this.LLILLJJLI;
        if (interfaceC1364105Vn != null) {
            C316640Cb8 c316640Cb8LIZIZ = C317290CcB.LIZIZ(AbstractC316870CbV.LIZ);
            C189200o6.m2constructorimpl(c316640Cb8LIZIZ);
            interfaceC1364105Vn.resumeWith(c316640Cb8LIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoNimbleVM@c644.requestSourceData$1$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super LoadMoreResponse> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C328920Cuw c328920Cuw = new C328920Cuw(this.LLILLJJLI, interfaceC1364105Vn);
        c328920Cuw.LL = th;
        return c328920Cuw.invokeSuspend(Unit.LIZ);
    }
}
