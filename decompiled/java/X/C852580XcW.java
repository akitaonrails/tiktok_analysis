package X;

import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import com.ss.android.ugc.aweme.setting.page.security.SecurityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.page.security.SecurityViewModel$checkSafeEnvForSecurityCheckupTool$1", f = "SecurityPage.kt", l = {313}, m = "invokeSuspend")
public final class C852580XcW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SecurityViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C852580XcW(SecurityViewModel securityViewModel, InterfaceC1364105Vn<? super C852580XcW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = securityViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C852580XcW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SecurityViewModel@aa12.checkSafeEnvForSecurityCheckupTool$1");
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
            C852610XcZ c852610XcZ = InterfaceC852600XcY.LIZ;
            EnumC852630Xcb enumC852630Xcb = EnumC852630Xcb.SECURITY_CHECKUP_TOOL;
            this.LL = 1;
            obj = c852610XcZ.LIZIZ(enumC852630Xcb, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SecurityViewModel@aa12.checkSafeEnvForSecurityCheckupTool$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C852590XcX(this.LLILLJJLI, (SafeEnvV2Response) obj, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SecurityViewModel@aa12.checkSafeEnvForSecurityCheckupTool$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
