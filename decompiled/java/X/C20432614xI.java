package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14xI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.CredentialManagerService$getSavedCredentialsForLogin$1$credManJob$1", f = "CredentialManagerService.kt", l = {725, 738}, m = "invokeSuspend")
public final class C20432614xI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<AbstractC836950WsP> LLILZLL;
    public final /* synthetic */ CredentialManagerService LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ Intent LLJ;
    public final /* synthetic */ InterfaceC20343914iz LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20432614xI(Activity activity, String str, List<AbstractC836950WsP> list, CredentialManagerService credentialManagerService, boolean z, Intent intent, InterfaceC20343914iz interfaceC20343914iz, InterfaceC1364105Vn<? super C20432614xI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = activity;
        this.LLILZIL = str;
        this.LLILZLL = list;
        this.LLIZ = credentialManagerService;
        this.LLIZLLLIL = z;
        this.LLJ = intent;
        this.LLJI = interfaceC20343914iz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20432614xI c20432614xI = new C20432614xI(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c20432614xI.LLILLL = obj;
        return c20432614xI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        if (X.C23250099c.LJI(r14, r0, r7) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0268  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20432614xI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
