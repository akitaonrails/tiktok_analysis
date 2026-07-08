package X;

import com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis;

/* JADX INFO: renamed from: X.14xT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.PasskeyApis", f = "PasskeyApis.kt", l = {122}, m = "beginUserAuthentication")
public final class C20433714xT extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PasskeyApis LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20433714xT(PasskeyApis passkeyApis, InterfaceC1364105Vn<? super C20433714xT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = passkeyApis;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PasskeyApis@fad4.beginUserAuthentication$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("PasskeyApis@fad4.beginUserAuthentication$1");
        return objLIZ;
    }
}
