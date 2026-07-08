package X;

import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0r46, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM", f = "SeriesFeedVM.kt", l = {556, 585, 623}, m = "refreshData")
public final class C1574120r46 extends AbstractC23140094w {
    public long LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ SeriesFeedVM LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574120r46(SeriesFeedVM seriesFeedVM, InterfaceC1364105Vn<? super C1574120r46> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = seriesFeedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("SeriesFeedVM@726f.refreshData$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLIZ.yQ2(this);
        C1C7U.LIZIZ("SeriesFeedVM@726f.refreshData$1");
        return objYQ2;
    }
}
