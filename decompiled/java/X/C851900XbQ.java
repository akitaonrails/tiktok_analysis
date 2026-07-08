package X;

import com.ss.android.ugc.aweme.account.api.ChangePasswordV2Api;

/* JADX INFO: renamed from: X.0XbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.api.ChangePasswordV2Api", f = "ChangePasswordV2Api.kt", l = {46}, m = "changePasswordV2")
public final class C851900XbQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ChangePasswordV2Api LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C851900XbQ(ChangePasswordV2Api changePasswordV2Api, InterfaceC1364105Vn<? super C851900XbQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = changePasswordV2Api;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangePasswordV2Api@21f5.changePasswordV2$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("ChangePasswordV2Api@21f5.changePasswordV2$1");
        return objLIZIZ;
    }
}
