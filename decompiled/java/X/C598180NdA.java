package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment$disablePrefetchAction$creatorInfo$1", f = "TabStoreFragment.kt", l = {218}, m = "invokeSuspend")
public final class C598180NdA extends C09AX implements Function1<InterfaceC1364105Vn<? super Response<n>>, Object> {
    public int LL;
    public final /* synthetic */ TabStoreFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598180NdA(TabStoreFragment tabStoreFragment, InterfaceC1364105Vn<? super C598180NdA> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = tabStoreFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598180NdA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Response<n>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = obj;
        C1C7U.LIZ("TabStoreFragment@633c.disablePrefetchAction$creatorInfo$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJFF);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJFF);
            IECommerceShowcaseService iECommerceShowcaseService = (IECommerceShowcaseService) PluggableExtentionKt.pluggableSpi$default(IECommerceShowcaseService.class, false, false, false, 14, null);
            if (iECommerceShowcaseService != null) {
                String str = this.LLILLJJLI.zS().id;
                Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("current_page", "profile"));
                this.LL = 1;
                objLJFF = iECommerceShowcaseService.LJFF(str, mapLJIIJ, this, false);
                if (objLJFF == objLJFF2) {
                    C1C7U.LIZIZ("TabStoreFragment@633c.disablePrefetchAction$creatorInfo$1");
                    return objLJFF2;
                }
            } else {
                objLJFF = null;
            }
        }
        C1C7U.LIZIZ("TabStoreFragment@633c.disablePrefetchAction$creatorInfo$1");
        return objLJFF;
    }
}
