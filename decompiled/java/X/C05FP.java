package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentCardContainerSharedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05FP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentCardContainerSharedVM$processCardMetaDataLisCommerceAgent$1", f = "CommerceAgentProtoclManager.kt", l = {126}, m = "invokeSuspend")
public final class C05FP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommerceAgentCardContainerSharedVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05FP(CommerceAgentCardContainerSharedVM commerceAgentCardContainerSharedVM, InterfaceC1364105Vn<? super C05FP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commerceAgentCardContainerSharedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05FP(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("CommerceAgentCardContainerSharedVM@823.processCardMetaDataLisCommerceAgent$1");
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
                    C1C7U.LIZIZ("CommerceAgentCardContainerSharedVM@823.processCardMetaDataLisCommerceAgent$1");
                    return objLJFF;
                }
            } else {
                unit = null;
                C1C7U.LIZIZ("CommerceAgentCardContainerSharedVM@823.processCardMetaDataLisCommerceAgent$1");
                return unit;
            }
        }
        unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceAgentCardContainerSharedVM@823.processCardMetaDataLisCommerceAgent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
