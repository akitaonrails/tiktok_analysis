package X;

/* JADX INFO: renamed from: X.0gQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.mixdetail.repository.PlaylistVideoRepository", f = "PlaylistVideoRepository.kt", l = {181, 191}, m = "requestPlaylistVideo")
public final class C1165380gQq extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C1165370gQp LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165380gQq(C1165370gQp c1165370gQp, InterfaceC1364105Vn<? super C1165380gQq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c1165370gQp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaylistVideoRepository@fc29.requestPlaylistVideo$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLIZ.LIZJ(null, null, 0, null, null, null, null, false, 0, false, this);
        C1C7U.LIZIZ("PlaylistVideoRepository@fc29.requestPlaylistVideo$1");
        return objLIZJ;
    }
}
