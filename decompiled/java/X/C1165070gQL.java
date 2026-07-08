package X;

/* JADX INFO: renamed from: X.0gQL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.mixdetail.repository.PlaylistDetailRepository", f = "PlaylistDetailRepository.kt", l = {77}, m = "preloadPlaylistDetail")
public final class C1165070gQL extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1165060gQK LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165070gQL(C1165060gQK c1165060gQK, InterfaceC1364105Vn<? super C1165070gQL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1165060gQK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaylistDetailRepository@69c.preloadPlaylistDetail$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, this);
        C1C7U.LIZIZ("PlaylistDetailRepository@69c.preloadPlaylistDetail$1");
        return objLIZ;
    }
}
