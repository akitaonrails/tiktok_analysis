package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.profile.business.ur.impersonation.network.ImpersonationAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.impersonation.ImpersonationUtils$showImpersonationConfirmDialog$1$1$1$1", f = "ImpersonationUtils.kt", l = {66}, m = "invokeSuspend")
public final class C1436205jk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1436205jk(String str, InterfaceC1364105Vn<? super C1436205jk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1436205jk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImpersonationUtils@9778.showImpersonationConfirmDialog$1$1$1$1");
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
            ImpersonationAPI.LIZ.getClass();
            ImpersonationAPI value = C1436305jl.LIZIZ.getValue();
            String str = this.LLILLJJLI;
            this.LL = 1;
            obj = value.confirmChange(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImpersonationUtils@9778.showImpersonationConfirmDialog$1$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ImpersonationUtils@9778.showImpersonationConfirmDialog$1$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
