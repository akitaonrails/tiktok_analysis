package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14xS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService$tryAuthWithPasskey$1", f = "CredentialManagerService.kt", l = {973, 982}, m = "invokeSuspend")
public final class C20433614xS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC20325014fw LLILLJJLI;
    public final /* synthetic */ CredentialManagerService LLILLL;
    public final /* synthetic */ Activity LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20433614xS(InterfaceC20325014fw interfaceC20325014fw, CredentialManagerService credentialManagerService, Activity activity, InterfaceC1364105Vn<? super C20433614xS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC20325014fw;
        this.LLILLL = credentialManagerService;
        this.LLILZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20433614xS(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[Catch: Exception -> 0x00c2, TryCatch #0 {Exception -> 0x00c2, blocks: (B:6:0x0018, B:14:0x0036, B:15:0x0039, B:18:0x0048, B:24:0x005e, B:26:0x0070, B:28:0x0076, B:29:0x007a, B:23:0x005a, B:31:0x008c, B:33:0x00a5, B:36:0x00ba, B:10:0x0028), top: B:44:0x0012 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20433614xS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
