package X;

import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14xK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService$getSavedCredentialsForLogin$1$credManJob$1$1", f = "CredentialManagerService.kt", l = {}, m = "invokeSuspend")
public final class C20432814xK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC20343914iz LL;
    public final /* synthetic */ Throwable LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20432814xK(InterfaceC20343914iz interfaceC20343914iz, Throwable th, String str, long j, InterfaceC1364105Vn<? super C20432814xK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC20343914iz;
        this.LLILLJJLI = th;
        this.LLILLL = str;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20432814xK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CredentialManagerService@16d5.getSavedCredentialsForLogin$1$credManJob$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC20343914iz interfaceC20343914iz = this.LL;
        C20441914yn c20441914yn = new C20441914yn(this.LLILLJJLI.getMessage());
        String str = CredentialManagerService.LIZ;
        boolean zLIZIZ = C0WJT.LIZIZ(this.LLILLL);
        System.currentTimeMillis();
        interfaceC20343914iz.LLLILZLLLI(c20441914yn, zLIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CredentialManagerService@16d5.getSavedCredentialsForLogin$1$credManJob$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
