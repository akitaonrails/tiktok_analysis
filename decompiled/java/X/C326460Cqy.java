package X;

import com.ss.android.ugc.aweme.detail.jsb.JSBVideoDetailShareVM;

/* JADX INFO: renamed from: X.0Cqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.jsb.JSBVideoDetailShareVM", f = "JSBVideoDetailShareVM.kt", l = {195}, m = "waitForFeDataSource")
public final class C326460Cqy extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ JSBVideoDetailShareVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326460Cqy(JSBVideoDetailShareVM jSBVideoDetailShareVM, InterfaceC1364105Vn<? super C326460Cqy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = jSBVideoDetailShareVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("JSBVideoDetailShareVM@10df.waitForFeDataSource$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objDQ2 = this.LLILLJJLI.DQ2(this);
        C1C7U.LIZIZ("JSBVideoDetailShareVM@10df.waitForFeDataSource$1");
        return objDQ2;
    }
}
