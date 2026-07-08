package X;

import com.ss.android.ugc.aweme.account.login.v2.network.UserBasicInfoApi;

/* JADX INFO: renamed from: X.0XPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.network.UserBasicInfoApi", f = "UserBasicInfoApi.kt", l = {42}, m = "getLongAvatarUrl")
public final class C848190XPd extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ UserBasicInfoApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C848190XPd(UserBasicInfoApi userBasicInfoApi, InterfaceC1364105Vn<? super C848190XPd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = userBasicInfoApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserBasicInfoApi@4d58.getLongAvatarUrl$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0, null, null, null, null, null, this);
        C1C7U.LIZIZ("UserBasicInfoApi@4d58.getLongAvatarUrl$1");
        return objLIZ;
    }
}
