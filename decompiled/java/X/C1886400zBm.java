package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApi;

/* JADX INFO: renamed from: X.0zBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyCredentialsApi", f = "PasskeyCredentialsApi.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "getCredentials")
public final class C1886400zBm extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PasskeyCredentialsApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886400zBm(PasskeyCredentialsApi passkeyCredentialsApi, InterfaceC1364105Vn<? super C1886400zBm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = passkeyCredentialsApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PasskeyCredentialsApi@a3ef.getCredentials$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("PasskeyCredentialsApi@a3ef.getCredentials$1");
        return objLIZ;
    }
}
