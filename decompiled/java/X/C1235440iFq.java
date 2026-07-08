package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.account.security.SecurityCheckUpInfoApi;

/* JADX INFO: renamed from: X.0iFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.security.SecurityCheckUpInfoApi", f = "SecurityCheckUpInfoApi.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "getSecurityCheckUpInfo")
public final class C1235440iFq extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SecurityCheckUpInfoApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1235440iFq(SecurityCheckUpInfoApi securityCheckUpInfoApi, InterfaceC1364105Vn<? super C1235440iFq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = securityCheckUpInfoApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SecurityCheckUpInfoApi@17d7.getSecurityCheckUpInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("SecurityCheckUpInfoApi@17d7.getSecurityCheckUpInfo$1");
        return objLIZ;
    }
}
