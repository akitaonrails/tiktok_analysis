package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Wz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService$openInvisibleActivity$1$1$1", f = "CredentialManagerService.kt", l = {}, m = "invokeSuspend")
public final class C1367905Wz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CredentialManagerService LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC852200Xbu LLILZ;
    public final /* synthetic */ InterfaceC497601wk LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1367905Wz(CredentialManagerService credentialManagerService, Activity activity, String str, InterfaceC852200Xbu interfaceC852200Xbu, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1367905Wz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = credentialManagerService;
        this.LLILLJJLI = activity;
        this.LLILLL = str;
        this.LLILZ = interfaceC852200Xbu;
        this.LLILZIL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1367905Wz(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CredentialManagerService@16d5.openInvisibleActivity$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CredentialManagerService credentialManagerService = this.LL;
        Activity activity = this.LLILLJJLI;
        String str = this.LLILLL;
        InterfaceC852200Xbu interfaceC852200Xbu = this.LLILZ;
        credentialManagerService.getClass();
        C1238110iK9.LIZ.getClass();
        Intent intentLIZ = C1238110iK9.LIZ(activity, false, str, interfaceC852200Xbu);
        if (intentLIZ != null) {
            C0TT5.LIZIZ(activity, intentLIZ, str);
        }
        C2296808zG.LIZJ(this.LLILZIL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CredentialManagerService@16d5.openInvisibleActivity$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
