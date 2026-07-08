package X;

/* JADX INFO: renamed from: X.0gQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.mixdetail.repository.PlaylistVideoRepository", f = "PlaylistVideoRepository.kt", l = {96}, m = "preloadPlaylistVideo")
public final class C1165390gQr extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1165370gQp LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165390gQr(C1165370gQp c1165370gQp, InterfaceC1364105Vn<? super C1165390gQr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1165370gQp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaylistVideoRepository@fc29.preloadPlaylistVideo$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, this);
        C1C7U.LIZIZ("PlaylistVideoRepository@fc29.preloadPlaylistVideo$1");
        return objLIZ;
    }
}
