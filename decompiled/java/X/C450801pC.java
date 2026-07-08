package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.model.LinkPrivacyPopupStatusResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01pC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.link.LinkPrivacyNoticeController$fetchStatus$2", f = "LinkPrivacyNoticeController.kt", l = {134}, m = "invokeSuspend")
public final class C450801pC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super LinkPrivacyPopupStatusResponse>, Object> {
    public int LL;
    public final /* synthetic */ C451201pG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450801pC(C451201pG c451201pG, InterfaceC1364105Vn<? super C450801pC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c451201pG;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C450801pC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("LinkPrivacyNoticeController@c451.fetchStatus$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                AbstractC19484711Kz<LinkPrivacyPopupStatusResponse> abstractC19484711KzLIZIZ = this.LLILLJJLI.LJ.LIZIZ();
                this.LL = 1;
                obj = C11UD.LIZIZ(abstractC19484711KzLIZIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LinkPrivacyNoticeController@c451.fetchStatus$2");
                    return objLJFF;
                }
            }
            c098200Yq = (LinkPrivacyPopupStatusResponse) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("@LinkRelation", "the privacy get fail", thM5exceptionOrNullimpl);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1C7U.LIZIZ("LinkPrivacyNoticeController@c451.fetchStatus$2");
        return c098200Yq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super LinkPrivacyPopupStatusResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
