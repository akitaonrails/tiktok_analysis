package X;

import com.ss.android.ugc.aweme.tako.botpage.components.video.doublecolumn.TakoDoubleColumnVideoShareVM;

/* JADX INFO: renamed from: X.0Cvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.video.doublecolumn.TakoDoubleColumnVideoShareVM", f = "TakoDoubleColumnVideoShareVM.kt", l = {130}, m = "fetchAweme")
public final class C329490Cvr extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoDoubleColumnVideoShareVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329490Cvr(TakoDoubleColumnVideoShareVM takoDoubleColumnVideoShareVM, InterfaceC1364105Vn<? super C329490Cvr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = takoDoubleColumnVideoShareVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoDoubleColumnVideoShareVM@381b.fetchAweme$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLL.BQ2(null, this);
        C1C7U.LIZIZ("TakoDoubleColumnVideoShareVM@381b.fetchAweme$1");
        return objBQ2;
    }
}
