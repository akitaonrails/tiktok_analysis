package X;

import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0W34, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.storage.spi.InternalServiceImpl", f = "InternalServiceImpl.kt", l = {28, 28}, m = "removeMafInfo")
public final class C0W34 extends AbstractC23140094w {
    public User LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0W30 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W34(C0W30 c0w30, InterfaceC1364105Vn<? super C0W34> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0w30;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InternalServiceImpl@a140.removeMafInfo$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("InternalServiceImpl@a140.removeMafInfo$1");
        return objLIZ;
    }
}
