package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentCardContainerSharedVM;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Nq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.CommerceAgentCardContainerSharedVM$setup$1", f = "CommerceAgentProtoclManager.kt", l = {}, m = "invokeSuspend")
public final class C1343605Nq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC665370Q7z LL;
    public final /* synthetic */ CommerceAgentCardContainerSharedVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343605Nq(InterfaceC665370Q7z interfaceC665370Q7z, CommerceAgentCardContainerSharedVM commerceAgentCardContainerSharedVM, InterfaceC1364105Vn<? super C1343605Nq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC665370Q7z;
        this.LLILLJJLI = commerceAgentCardContainerSharedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343605Nq(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceAgentCardContainerSharedVM@823.setup$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLIZIZ = C1554610qYd.LIZIZ(this.LL, ICommerceAgentCardProtocol.class, false);
        if (listLIZIZ != null) {
            CommerceAgentCardContainerSharedVM commerceAgentCardContainerSharedVM = this.LLILLJJLI;
            commerceAgentCardContainerSharedVM.LL.clear();
            Boolean.valueOf(commerceAgentCardContainerSharedVM.LL.addAll(listLIZIZ));
        }
        this.LLILLJJLI.LLILLJJLI.clear();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceAgentCardContainerSharedVM@823.setup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
