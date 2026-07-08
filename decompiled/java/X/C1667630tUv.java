package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ICredentialManagerService;
import com.ss.android.ugc.aweme.account.passwordless.leaked.PasskeyAuthPageViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.passwordless.leaked.PasskeyAuthPageKt$PasskeyAuthPage$1$1", f = "PasskeyAuthPage.kt", l = {}, m = "invokeSuspend")
public final class C1667630tUv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ PasskeyAuthPageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667630tUv(Activity activity, PasskeyAuthPageViewModel passkeyAuthPageViewModel, InterfaceC1364105Vn<? super C1667630tUv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
        this.LLILLJJLI = passkeyAuthPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1667630tUv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PasskeyAuthPageKt@bd74.PasskeyAuthPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Activity activity = this.LL;
        if (activity != null) {
            final PasskeyAuthPageViewModel passkeyAuthPageViewModel = this.LLILLJJLI;
            passkeyAuthPageViewModel.LL.setValue(C1667660tUy.LIZ);
            ICredentialManagerService iCredentialManagerService = (ICredentialManagerService) PluggableExtentionKt.pluggableSpi$default(ICredentialManagerService.class, false, false, false, 14, null);
            if (iCredentialManagerService != null) {
                iCredentialManagerService.LJIILIIL(activity, new InterfaceC20325014fw() { // from class: X.0tUw
                    @Override // X.InterfaceC20325014fw
                    public final void LJ() {
                    }

                    @Override // X.InterfaceC20325014fw
                    public final void onSuccess(String str) {
                        passkeyAuthPageViewModel.LL.setValue(new C1667610tUt(true, str));
                    }

                    @Override // X.InterfaceC20325014fw
                    public final void LIZ(Throwable th, boolean z, boolean z2) {
                        passkeyAuthPageViewModel.LL.setValue(new C1667610tUt());
                        EnumC20430314wv.PASSKEY_LOGIN_DEFAULT_EXCEPTION.getErrorCode();
                        PasskeyAuthPageViewModel passkeyAuthPageViewModel2 = passkeyAuthPageViewModel;
                        C20431614x8.LIZ.getClass();
                        if (((Number) C20431614x8.LJIIJ(th).getFirst()).intValue() == EnumC20430314wv.PASSKEY_LOGIN_NO_CREDENTIAL_EXCEPTION.getErrorCode()) {
                            passkeyAuthPageViewModel2.LL.setValue(new C1667610tUt());
                        } else {
                            passkeyAuthPageViewModel2.LL.setValue(new C1667610tUt());
                        }
                    }
                });
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PasskeyAuthPageKt@bd74.PasskeyAuthPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
