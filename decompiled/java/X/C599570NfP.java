package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.PassportLoginResponse;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.compliance.repository.api.PassportApi$Companion$login$2", f = "PassportApi.kt", l = {41}, m = "invokeSuspend")
public final class C599570NfP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PassportLoginResponse>, Object> {
    public int LL;

    public C599570NfP(InterfaceC1364105Vn<? super C599570NfP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C599570NfP(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        C1C7U.LIZ("PassportApi$Companion@f5b4.login$2");
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
            InterfaceC599580NfQ interfaceC599580NfQ = (InterfaceC599580NfQ) C599600NfS.LIZIZ.create(InterfaceC599580NfQ.class);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IAccountDependencyService.class.getName();
                if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
            }
            String csrfToken = ((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getCsrfToken("/passport/gec/tiktok/login");
            this.LL = 1;
            obj = interfaceC599580NfQ.LIZ(csrfToken, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PassportApi$Companion@f5b4.login$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PassportApi$Companion@f5b4.login$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PassportLoginResponse> interfaceC1364105Vn) {
        return new C599570NfP(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
