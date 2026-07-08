package X;

import com.ss.android.ugc.aweme.detail.jsb.JSBVideoDetailShareVM;

/* JADX INFO: renamed from: X.0Cqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.jsb.JSBVideoDetailShareVM", f = "JSBVideoDetailShareVM.kt", l = {138}, m = "onLoadMore")
public final class C326430Cqv extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ JSBVideoDetailShareVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326430Cqv(JSBVideoDetailShareVM jSBVideoDetailShareVM, InterfaceC1364105Vn<? super C326430Cqv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = jSBVideoDetailShareVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("JSBVideoDetailShareVM@10df.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLJJLI.BQ2(this);
        C1C7U.LIZIZ("JSBVideoDetailShareVM@10df.onLoadMore$1");
        return objBQ2;
    }
}
