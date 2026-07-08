package X;

import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS601S0100000_22;
import njp.a;

/* JADX INFO: renamed from: X.0mna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editorpro.adddrafts.AddDraftsComponent$loadLatestData$1$countDeferred$1", f = "AddDraftsComponent.kt", l = {}, m = "invokeSuspend")
public final class C1410120mna extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1410170mnf LL;
    public final /* synthetic */ C0M4M LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410120mna(C1410170mnf c1410170mnf, C0M4M c0m4m, InterfaceC1364105Vn<? super C1410120mna> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1410170mnf;
        this.LLILLJJLI = c0m4m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410120mna(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iQueryDraftCount;
        C1C7U.LIZ("AddDraftsComponent@623d.loadLatestData$1$countDeferred$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1410170mnf c1410170mnf = this.LL;
        IAVDraftService iAVDraftServiceK4 = c1410170mnf.K4();
        if (iAVDraftServiceK4 != null) {
            iQueryDraftCount = iAVDraftServiceK4.queryDraftCount(this.LLILLJJLI);
        } else {
            iQueryDraftCount = 0;
        }
        c1410170mnf.LLJJIJI = iQueryDraftCount;
        C1410170mnf c1410170mnf2 = this.LL;
        c1410170mnf2.LLJJ.LLIZ = c1410170mnf2.LLJJIJI;
        c1410170mnf2.i3(new AwS601S0100000_22(c1410170mnf2, 870));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddDraftsComponent@623d.loadLatestData$1$countDeferred$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
