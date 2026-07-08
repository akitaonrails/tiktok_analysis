package X;

import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMMessageOpenServiceImpl;

/* JADX INFO: renamed from: X.058Y, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.common.data.service.IMMessageOpenServiceImpl", f = "IMMessageOpenServiceImpl.kt", l = {61}, m = "constructMessageContentPbWithCache")
public final class C058Y extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ IMMessageOpenServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058Y(IMMessageOpenServiceImpl iMMessageOpenServiceImpl, InterfaceC1364105Vn<? super C058Y> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = iMMessageOpenServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMessageOpenServiceImpl@ba08.constructMessageContentPbWithCache$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(0, null, null, null, this);
        C1C7U.LIZIZ("IMMessageOpenServiceImpl@ba08.constructMessageContentPbWithCache$1");
        return objLIZIZ;
    }
}
