package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;

/* JADX INFO: renamed from: X.0Cm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM", f = "RecUserVideoListSharedVM.kt", l = {251}, m = "onLoadMore")
public final class C323460Cm8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RecUserVideoListSharedVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323460Cm8(RecUserVideoListSharedVM recUserVideoListSharedVM, InterfaceC1364105Vn<? super C323460Cm8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = recUserVideoListSharedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecUserVideoListSharedVM@944f.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objDQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("RecUserVideoListSharedVM@944f.onLoadMore$1");
        return objDQ2;
    }
}
