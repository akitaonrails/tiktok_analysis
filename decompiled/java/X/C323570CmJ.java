package X;

import com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager;

/* JADX INFO: renamed from: X.0CmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager", f = "AwemeFetchManager.kt", l = {128}, m = "getBatchAwemeCacheItem")
public final class C323570CmJ extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AwemeFetchManager LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323570CmJ(AwemeFetchManager awemeFetchManager, InterfaceC1364105Vn<? super C323570CmJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = awemeFetchManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, false, null, this);
        C1C7U.LIZIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$1");
        return objLIZ;
    }
}
