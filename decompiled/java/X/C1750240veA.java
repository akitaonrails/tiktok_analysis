package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GenPageLinkChainKeyRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GenPageLinkChainKeyResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PageLinkInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0veA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$openShareDialog$1$keyChainJob$1", f = "PdpViewModel.kt", l = {4021}, m = "invokeSuspend")
public final class C1750240veA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GenPageLinkChainKeyResponse>, Object> {
    public int LL;
    public final /* synthetic */ PageLinkInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1750240veA(PageLinkInfo pageLinkInfo, InterfaceC1364105Vn<? super C1750240veA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pageLinkInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1750240veA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpViewModel@6cb1.openShareDialog$1$keyChainJob$1");
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
            C1750270veD c1750270veD = InterfaceC1750290veF.LIZ;
            GenPageLinkChainKeyRequest genPageLinkChainKeyRequest = new GenPageLinkChainKeyRequest(C2286608xc.LJ(EnumC1739390vMf.PDP.getScene()), this.LLILLJJLI);
            this.LL = 1;
            obj = c1750270veD.LIZ(genPageLinkChainKeyRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PdpViewModel@6cb1.openShareDialog$1$keyChainJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PdpViewModel@6cb1.openShareDialog$1$keyChainJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GenPageLinkChainKeyResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
