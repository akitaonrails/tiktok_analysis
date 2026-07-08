package X;

import com.ss.android.ugc.aweme.biz.wallet.network.model.GetUserPlacementReq;
import com.ss.android.ugc.aweme.component.ca.OpenCANeedSyncViewModel;

/* JADX INFO: renamed from: X.0uoi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.ca.OpenCANeedSyncViewModel", f = "OpenCANeedSyncViewModel.kt", l = {183, 192}, m = "fetchPostGuideJumpSchema")
public final class C1718340uoi extends AbstractC23140094w {
    public Object LL;
    public GetUserPlacementReq LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ OpenCANeedSyncViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1718340uoi(OpenCANeedSyncViewModel openCANeedSyncViewModel, InterfaceC1364105Vn<? super C1718340uoi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = openCANeedSyncViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OpenCANeedSyncViewModel@9866.fetchPostGuideJumpSchema$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLIZ.vQ2(null, this);
        C1C7U.LIZIZ("OpenCANeedSyncViewModel@9866.fetchPostGuideJumpSchema$1");
        return objVQ2;
    }
}
