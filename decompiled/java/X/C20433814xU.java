package X;

import com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis;

/* JADX INFO: renamed from: X.14xU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis", f = "PasskeyApis.kt", l = {137}, m = "finishUserAuthentication")
public final class C20433814xU extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PasskeyApis LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20433814xU(PasskeyApis passkeyApis, InterfaceC1364105Vn<? super C20433814xU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = passkeyApis;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PasskeyApis@fad4.finishUserAuthentication$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, this);
        C1C7U.LIZIZ("PasskeyApis@fad4.finishUserAuthentication$1");
        return objLIZIZ;
    }
}
