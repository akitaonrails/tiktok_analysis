package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.common.api.ClaimIncentiveRequest;
import com.ss.android.ugc.aweme.ecommerce.common.api.EcVideoAnchorClaimIncentiveApi;
import com.ss.android.ugc.aweme.ecommerce.model.ClaimIncentiveInfo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel$tryToClaimIncentive$1$1$1", f = "ECommerceAnchorPanelViewModel.kt", l = {390}, m = "invokeSuspend")
public final class C1735640vGc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ ClaimIncentiveInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735640vGc(String str, ClaimIncentiveInfo claimIncentiveInfo, InterfaceC1364105Vn<? super C1735640vGc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = claimIncentiveInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1735640vGc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Set<Map.Entry<String, k>> setEntrySet;
        C1C7U.LIZ("ECommerceAnchorPanelViewModel@ca63.tryToClaimIncentive$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                ClaimIncentiveRequest claimIncentiveRequest = new ClaimIncentiveRequest();
                String str = this.LLILLJJLI;
                ClaimIncentiveInfo claimIncentiveInfo = this.LLILLL;
                claimIncentiveRequest.put("btm", str);
                n requestInfoObj = claimIncentiveInfo.getRequestInfoObj();
                if (requestInfoObj != null && (setEntrySet = requestInfoObj.entrySet()) != null) {
                    Iterator<T> it2 = setEntrySet.iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        String str2 = (String) entry.getKey();
                        k kVar = (k) entry.getValue();
                        if (str2 != null && kVar != null) {
                            claimIncentiveRequest.put(str2, kVar);
                        }
                    }
                }
                C1735670vGf c1735670vGf = C1735660vGe.LLILLJJLI.getValue().LL;
                this.LL = 1;
                c1735670vGf.getClass();
                EcVideoAnchorClaimIncentiveApi.LIZ.getClass();
                if (C1735650vGd.LIZIZ.getValue().claimIncentive(claimIncentiveRequest, this) == objLJFF) {
                    C1C7U.LIZIZ("ECommerceAnchorPanelViewModel@ca63.tryToClaimIncentive$1$1$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECommerceAnchorPanelViewModel@ca63.tryToClaimIncentive$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
