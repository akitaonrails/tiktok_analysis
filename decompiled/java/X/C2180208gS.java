package X;

import com.ss.android.ugc.aweme.relation.ffp.nearby.network.ConnectNowMatchAPI;

/* JADX INFO: renamed from: X.08gS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.network.ConnectNowMatchAPI", f = "ConnectNowMatchAPI.kt", l = {28}, m = "runNetWorkSafely")
public final class C2180208gS<R> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ConnectNowMatchAPI LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2180208gS(ConnectNowMatchAPI connectNowMatchAPI, InterfaceC1364105Vn<? super C2180208gS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = connectNowMatchAPI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConnectNowMatchAPI@8ee2.runNetWorkSafely$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objRunNetWorkSafely = this.LLILLJJLI.runNetWorkSafely(null, this);
        C1C7U.LIZIZ("ConnectNowMatchAPI@8ee2.runNetWorkSafely$1");
        return objRunNetWorkSafely;
    }
}
