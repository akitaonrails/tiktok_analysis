package X;

import android.os.Bundle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.account.api.ChangePasswordApiResponse;
import com.ss.android.ugc.aweme.account.api.ChangePasswordV2Api;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment$onSubmit$1$1", f = "BaseUpdatePasswordFragment.kt", l = {418, 420}, m = "invokeSuspend")
public final class C851880XbO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ BaseUpdatePasswordFragment LLILLL;
    public final /* synthetic */ C19EG LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C851880XbO(String str, BaseUpdatePasswordFragment baseUpdatePasswordFragment, C19EG c19eg, InterfaceC1364105Vn<? super C851880XbO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = baseUpdatePasswordFragment;
        this.LLILZ = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C851880XbO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        ChangePasswordApiResponse changePasswordApiResponse;
        Object objLIZIZ = obj;
        C1C7U.LIZ("BaseUpdatePasswordFragment@1cae.onSubmit$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZIZ);
                    changePasswordApiResponse = (ChangePasswordApiResponse) objLIZIZ;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                changePasswordApiResponse = (ChangePasswordApiResponse) objLIZIZ;
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("use_passport_ticket_in_changepwdv2", false)) {
                ChangePasswordV2Api changePasswordV2Api = ChangePasswordV2Api.LIZ;
                String str = this.LLILLJJLI;
                String strXS = this.LLILLL.XS();
                String strYS = this.LLILLL.YS();
                this.LL = 1;
                objLIZIZ = changePasswordV2Api.LIZ(str, strXS, strYS, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.onSubmit$1$1");
                    return objLJFF;
                }
                changePasswordApiResponse = (ChangePasswordApiResponse) objLIZIZ;
            } else {
                ChangePasswordV2Api changePasswordV2Api2 = ChangePasswordV2Api.LIZ;
                String str2 = this.LLILLJJLI;
                String strXS2 = this.LLILLL.XS();
                Bundle arguments = this.LLILLL.getArguments();
                if (arguments != null) {
                    string = arguments.getString("passport_ticket", null);
                } else {
                    string = null;
                }
                this.LL = 2;
                objLIZIZ = changePasswordV2Api2.LIZIZ(str2, strXS2, string, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.onSubmit$1$1");
                    return objLJFF;
                }
                changePasswordApiResponse = (ChangePasswordApiResponse) objLIZIZ;
            }
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LLILZ);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C851870XbN(changePasswordApiResponse, this.LLILLJJLI, this.LLILZ, this.LLILLL, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseUpdatePasswordFragment@1cae.onSubmit$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
