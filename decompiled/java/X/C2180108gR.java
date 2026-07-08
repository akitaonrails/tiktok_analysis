package X;

import com.ss.android.ugc.aweme.relation.ffp.nearby.network.ConnectNowNetworkAPI;

/* JADX INFO: renamed from: X.08gR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.network.ConnectNowNetworkAPI", f = "ConnectNowNetworkAPI.kt", l = {29}, m = "runNetWorkSafely")
public final class C2180108gR<R> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ConnectNowNetworkAPI LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2180108gR(ConnectNowNetworkAPI connectNowNetworkAPI, InterfaceC1364105Vn<? super C2180108gR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = connectNowNetworkAPI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConnectNowNetworkAPI@7c9b.runNetWorkSafely$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objRunNetWorkSafely = this.LLILLJJLI.runNetWorkSafely(null, this);
        C1C7U.LIZIZ("ConnectNowNetworkAPI@7c9b.runNetWorkSafely$1");
        return objRunNetWorkSafely;
    }
}
