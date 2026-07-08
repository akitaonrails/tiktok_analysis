package X;

/* JADX INFO: renamed from: X.0U2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.player.KaraokeRepository", f = "KaraokeRepository.kt", l = {358}, m = "resumeGuestCurrentSong")
public final class C765830U2j extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0U2Y LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765830U2j(C0U2Y c0u2y, InterfaceC1364105Vn<? super C765830U2j> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0u2y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeRepository@8952.resumeGuestCurrentSong$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJI = this.LLILLJJLI.LJJI(null, this);
        C1C7U.LIZIZ("KaraokeRepository@8952.resumeGuestCurrentSong$1");
        return objLJJI;
    }
}
