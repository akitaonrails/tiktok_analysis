package X;

import com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel;

/* JADX INFO: renamed from: X.15j8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.component.profile.LandscapeProfileListViewModel", f = "LandscapeProfileListViewModel.kt", l = {257}, m = "onLoadLatest")
public final class C20599615j8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LandscapeProfileListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20599615j8(LandscapeProfileListViewModel landscapeProfileListViewModel, InterfaceC1364105Vn<? super C20599615j8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = landscapeProfileListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandscapeProfileListViewModel@74aa.onLoadLatest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLJJLI.onLoadLatest(null, this);
        C1C7U.LIZIZ("LandscapeProfileListViewModel@74aa.onLoadLatest$1");
        return objCQ2;
    }
}
