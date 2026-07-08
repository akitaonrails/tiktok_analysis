package X;

import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsSharedViewModel;

/* JADX INFO: renamed from: X.0hHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.MyMomentsSharedViewModel", f = "MyMomentsSharedViewModel.kt", l = {179}, m = "sendRequest")
public final class C1198300hHw extends AbstractC23140094w {
    public Object LL;
    public InterfaceC1199990hKf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ MyMomentsSharedViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198300hHw(MyMomentsSharedViewModel myMomentsSharedViewModel, InterfaceC1364105Vn<? super C1198300hHw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = myMomentsSharedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MyMomentsSharedViewModel@7ad7.sendRequest$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.vQ2(null, null, this);
        C1C7U.LIZIZ("MyMomentsSharedViewModel@7ad7.sendRequest$1");
        return objVQ2;
    }
}
