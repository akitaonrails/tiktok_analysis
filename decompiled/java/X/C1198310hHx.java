package X;

import com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoViewModel;

/* JADX INFO: renamed from: X.0hHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoViewModel", f = "AddLocationVideoViewModel.kt", l = {58}, m = "onRefresh")
public final class C1198310hHx extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AddLocationVideoViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198310hHx(AddLocationVideoViewModel addLocationVideoViewModel, InterfaceC1364105Vn<? super C1198310hHx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = addLocationVideoViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddLocationVideoViewModel@c89f.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("AddLocationVideoViewModel@c89f.onRefresh$1");
        return objOnRefresh;
    }
}
