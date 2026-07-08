package X;

import com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoViewModel;

/* JADX INFO: renamed from: X.0hHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.addlocation.AddLocationVideoViewModel", f = "AddLocationVideoViewModel.kt", l = {127}, m = "sendRequest")
public final class C1198320hHy extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AddLocationVideoViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198320hHy(AddLocationVideoViewModel addLocationVideoViewModel, InterfaceC1364105Vn<? super C1198320hHy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = addLocationVideoViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddLocationVideoViewModel@c89f.sendRequest$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLL.wQ2(null, this);
        C1C7U.LIZIZ("AddLocationVideoViewModel@c89f.sendRequest$1");
        return objWQ2;
    }
}
