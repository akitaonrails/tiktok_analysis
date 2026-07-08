package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyRemoveCredentialsApi;

/* JADX INFO: renamed from: X.0zBo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.passkey.api.PasskeyRemoveCredentialsApi", f = "PasskeyRemoveCredentialsApi.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "removePasskeyCredentials")
public final class C1886420zBo extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PasskeyRemoveCredentialsApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1886420zBo(PasskeyRemoveCredentialsApi passkeyRemoveCredentialsApi, InterfaceC1364105Vn<? super C1886420zBo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = passkeyRemoveCredentialsApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PasskeyRemoveCredentialsApi@284e.removePasskeyCredentials$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("PasskeyRemoveCredentialsApi@284e.removePasskeyCredentials$1");
        return objLIZ;
    }
}
