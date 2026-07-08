package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;

/* JADX INFO: renamed from: X.0sCN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.data.ExploreInnerCacheManager", f = "ExploreInnerCacheManager.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "waitForPreload")
public final class C1617690sCN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1617700sCO LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1617690sCN(C1617700sCO c1617700sCO, InterfaceC1364105Vn<? super C1617690sCN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1617700sCO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreInnerCacheManager@a9c3.waitForPreload$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("ExploreInnerCacheManager@a9c3.waitForPreload$1");
        return objLIZIZ;
    }
}
