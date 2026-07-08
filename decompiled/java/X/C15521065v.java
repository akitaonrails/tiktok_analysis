package X;

/* JADX INFO: renamed from: X.065v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.StreakShareDataCenter", f = "StreakShareDataCenter.kt", l = {117}, m = "retryWithTimeout")
public final class C15521065v extends AbstractC23140094w {
    public long LL;
    public int LLILLJJLI;
    public C118300cf LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C15520065u LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15521065v(C15520065u c15520065u, InterfaceC1364105Vn<? super C15521065v> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c15520065u;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakShareDataCenter@91cf.retryWithTimeout$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(0, 0L, this);
        C1C7U.LIZIZ("StreakShareDataCenter@91cf.retryWithTimeout$1");
        return objLIZJ;
    }
}
