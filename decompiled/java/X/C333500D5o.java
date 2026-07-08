package X;

import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.UcpServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.UcpServiceImpl$startOneStepCheckoutWithDeferredPdp$waitForNewActivityJob$1", f = "UcpServiceImpl.kt", l = {79}, m = "invokeSuspend")
public final class C333500D5o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ UcpServiceImpl LLILLL;
    public final /* synthetic */ Bundle LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333500D5o(C19EG c19eg, UcpServiceImpl ucpServiceImpl, Bundle bundle, InterfaceC1364105Vn<? super C333500D5o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = ucpServiceImpl;
        this.LLILZ = bundle;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C333500D5o(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UcpServiceImpl@34af.startOneStepCheckoutWithDeferredPdp$waitForNewActivityJob$1");
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
            AnonymousClass0951 anonymousClass0951 = C0D5Z.LIZIZ;
            C376801dG c376801dG = new C376801dG(null);
            this.LL = 1;
            if (C09IC.LJIJ(anonymousClass0951, this, c376801dG) == objLJFF) {
                C1C7U.LIZIZ("UcpServiceImpl@34af.startOneStepCheckoutWithDeferredPdp$waitForNewActivityJob$1");
                return objLJFF;
            }
        }
        if (!this.LLILLJJLI.isFinishing() && !this.LLILLJJLI.isDestroyed()) {
            this.LLILLL.LJI(this.LLILLJJLI, new Intent().putExtras(new Bundle(this.LLILZ)));
        }
        C0D5Z.LIZ.setValue(Boolean.FALSE);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UcpServiceImpl@34af.startOneStepCheckoutWithDeferredPdp$waitForNewActivityJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
