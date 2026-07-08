package X;

import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM;

/* JADX INFO: renamed from: X.0r48, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM", f = "SeriesFeedVM.kt", l = {457}, m = "whenRefresh")
public final class C1574140r48 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SeriesFeedVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574140r48(SeriesFeedVM seriesFeedVM, InterfaceC1364105Vn<? super C1574140r48> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = seriesFeedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesFeedVM@726f.whenRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWhenRefresh = this.LLILLJJLI.whenRefresh(this);
        C1C7U.LIZIZ("SeriesFeedVM@726f.whenRefresh$1");
        return objWhenRefresh;
    }
}
