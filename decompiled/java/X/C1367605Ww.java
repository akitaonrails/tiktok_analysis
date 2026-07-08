package X;

import Y.ARunnableS11S0400000_2;
import android.app.Activity;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService$getNonceBeforeGettingCredentials$1$1", f = "CredentialManagerService.kt", l = {}, m = "invokeSuspend")
public final class C1367605Ww extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CredentialManagerService LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C05X2 LLILLL;
    public final /* synthetic */ InterfaceC852200Xbu LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1367605Ww(CredentialManagerService credentialManagerService, Activity activity, C05X2 c05x2, InterfaceC852200Xbu interfaceC852200Xbu, InterfaceC1364105Vn<? super C1367605Ww> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = credentialManagerService;
        this.LLILLJJLI = activity;
        this.LLILLL = c05x2;
        this.LLILZ = interfaceC852200Xbu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1367605Ww(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CredentialManagerService@16d5.getNonceBeforeGettingCredentials$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C15534066i.LIZ.getClass();
        C15534066i.LIZ("get_onetap_nonce");
        CredentialManagerService credentialManagerService = this.LL;
        Activity activity = this.LLILLJJLI;
        C05X2 c05x2 = this.LLILLL;
        InterfaceC852200Xbu interfaceC852200Xbu = this.LLILZ;
        synchronized (credentialManagerService) {
            CredentialManagerService.LJII = new WeakReference<>(activity);
            activity.runOnUiThread(new ARunnableS11S0400000_2(activity, c05x2, credentialManagerService, interfaceC852200Xbu, 0));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CredentialManagerService@16d5.getNonceBeforeGettingCredentials$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
