package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.SafeEnvV2Response;
import com.ss.android.ugc.aweme.setting.page.security.SecurityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XcX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.setting.page.security.SecurityViewModel$checkSafeEnvForSecurityCheckupTool$1$1", f = "SecurityPage.kt", l = {}, m = "invokeSuspend")
public final class C852590XcX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SecurityViewModel LL;
    public final /* synthetic */ SafeEnvV2Response LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C852590XcX(SecurityViewModel securityViewModel, SafeEnvV2Response safeEnvV2Response, InterfaceC1364105Vn<? super C852590XcX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = securityViewModel;
        this.LLILLJJLI = safeEnvV2Response;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C852590XcX(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("SecurityViewModel@aa12.checkSafeEnvForSecurityCheckupTool$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MutableLiveData<Boolean> mutableLiveData = this.LL.LLILLJJLI;
        SafeEnvData safeEnvData = this.LLILLJJLI.data;
        if (safeEnvData == null || (z = safeEnvData.showSecurityCheckUp) == null) {
            z = false;
        }
        mutableLiveData.setValue(z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SecurityViewModel@aa12.checkSafeEnvForSecurityCheckupTool$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
