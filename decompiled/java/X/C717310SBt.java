package X;

import com.ss.android.ugc.aweme.subscription.model.PaywallResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0SBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.subonlyvideos.views.PaywallDualFetchHelperKt$fetchPaywallWithComponent$2", f = "PaywallDualFetchHelper.kt", l = {37}, m = "invokeSuspend")
public final class C717310SBt extends C09AX implements Function1<InterfaceC1364105Vn<? super PaywallResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C717310SBt(int i, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C717310SBt(this.LLILZIL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super PaywallResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaywallDualFetchHelperKt@db75.fetchPaywallWithComponent$2");
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
            InterfaceC717320SBu.LIZ.getClass();
            C11NZ<PaywallResponse> c11nzLIZ = C717290SBr.LIZIZ().LIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
            this.LL = 1;
            obj = C11UD.LJI(c11nzLIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaywallDualFetchHelperKt@db75.fetchPaywallWithComponent$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PaywallDualFetchHelperKt@db75.fetchPaywallWithComponent$2");
        return obj;
    }
}
