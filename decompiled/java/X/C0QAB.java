package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QAB, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM$onLoadMoreResult$1$1", f = "SearchVisualInspirationSharedVM.kt", l = {347, 368}, m = "invokeSuspend")
public final class C0QAB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0QA6>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ SearchVisualInspirationSharedVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QAB(SearchVisualInspirationSharedVM searchVisualInspirationSharedVM, InterfaceC1364105Vn<? super C0QAB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = searchVisualInspirationSharedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QAB(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QAB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0QA6> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
