package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.UcpServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAddressService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.UcpServiceImpl$hasResolvedPipoPaymentInfoAndAddress$1$1", f = "UcpServiceImpl.kt", l = {212}, m = "invokeSuspend")
public final class C333510D5p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ UcpServiceImpl LLILZ;
    public final /* synthetic */ CommonAdData LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;
    public final /* synthetic */ IECommerceAddressService LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C333510D5p(boolean z, UcpServiceImpl ucpServiceImpl, CommonAdData commonAdData, Function1<? super Boolean, Unit> function1, IECommerceAddressService iECommerceAddressService, InterfaceC1364105Vn<? super C333510D5p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = ucpServiceImpl;
        this.LLILZIL = commonAdData;
        this.LLILZLL = function1;
        this.LLIZ = iECommerceAddressService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333510D5p c333510D5p = new C333510D5p(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c333510D5p.LLILLJJLI = obj;
        return c333510D5p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("UcpServiceImpl@34af.hasResolvedPipoPaymentInfoAndAddress$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                IECommerceAddressService iECommerceAddressService = this.LLIZ;
                this.LL = 1;
                obj = iECommerceAddressService.LIZ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("UcpServiceImpl@34af.hasResolvedPipoPaymentInfoAndAddress$1$1");
                    return objLJFF;
                }
            }
            c098200Yq = Boolean.valueOf(((Boolean) obj).booleanValue());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        boolean z = false;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = false;
        }
        boolean zBooleanValue = ((Boolean) c098200Yq).booleanValue();
        boolean z2 = this.LLILLL;
        if (z2 && zBooleanValue) {
            z = true;
        }
        if (!z) {
            if (!zBooleanValue && !z2) {
                i2 = 3;
            } else if (zBooleanValue) {
                i2 = 2;
            }
            this.LLILZ.LIZ(i2, this.LLILZIL);
        }
        this.LLILZLL.invoke(Boolean.valueOf(z));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UcpServiceImpl@34af.hasResolvedPipoPaymentInfoAndAddress$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
