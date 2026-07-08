package X;

import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NK7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardContainerSharedVM$checkSetup$2", f = "SearchCardProtocolManager.kt", l = {313}, m = "invokeSuspend")
public final class C0NK7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchCardContainerSharedVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NK7(SearchCardContainerSharedVM searchCardContainerSharedVM, InterfaceC1364105Vn<? super C0NK7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchCardContainerSharedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NK7(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("SearchCardContainerSharedVM@3632.checkSetup$2");
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
            AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI.LLILLL;
            if (anonymousClass0956 != null) {
                this.LL = 1;
                if (anonymousClass0956.LJJZ(this) == objLJFF) {
                    C1C7U.LIZIZ("SearchCardContainerSharedVM@3632.checkSetup$2");
                    return objLJFF;
                }
            } else {
                unit = null;
                C1C7U.LIZIZ("SearchCardContainerSharedVM@3632.checkSetup$2");
                return unit;
            }
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchCardContainerSharedVM@3632.checkSetup$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
