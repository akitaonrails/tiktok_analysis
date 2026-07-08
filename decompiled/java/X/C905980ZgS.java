package X;

import com.ss.android.ugc.aweme.im.streaming.api.RetryInfoComponent;

/* JADX INFO: renamed from: X.0ZgS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.StreamRepositoryImpl", f = "StreamRepositoryImpl.kt", l = {392}, m = "retryFromScratch")
public final class C905980ZgS extends AbstractC23140094w {
    public C869590Y9l LL;
    public RetryInfoComponent LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C905950ZgP LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C905980ZgS(C905950ZgP c905950ZgP, InterfaceC1364105Vn<? super C905980ZgS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c905950ZgP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamRepositoryImpl@ffe.retryFromScratch$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLIZLLLIL.LIZLLL(null, null, this);
        C1C7U.LIZIZ("StreamRepositoryImpl@ffe.retryFromScratch$1");
        return objLIZLLL;
    }
}
