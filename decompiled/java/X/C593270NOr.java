package X;

import com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl;

/* JADX INFO: renamed from: X.0NOr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl", f = "AwemeManageServiceImpl.kt", l = {191}, m = "deleteByCreatedTimeBeforeInternal")
public final class C593270NOr extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AwemeManageServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593270NOr(AwemeManageServiceImpl awemeManageServiceImpl, InterfaceC1364105Vn<? super C593270NOr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = awemeManageServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeManageServiceImpl@876f.deleteByCreatedTimeBeforeInternal$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(0L, this);
        C1C7U.LIZIZ("AwemeManageServiceImpl@876f.deleteByCreatedTimeBeforeInternal$1");
        return objLIZIZ;
    }
}
