package X;

/* JADX INFO: renamed from: X.0U2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.player.KaraokeRepository", f = "KaraokeRepository.kt", l = {343}, m = "pauseGuestCurrentSong")
public final class C765810U2h extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0U2Y LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765810U2h(C0U2Y c0u2y, InterfaceC1364105Vn<? super C765810U2h> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0u2y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeRepository@8952.pauseGuestCurrentSong$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIZILJ = this.LLILLJJLI.LJIIZILJ(null, this);
        C1C7U.LIZIZ("KaraokeRepository@8952.pauseGuestCurrentSong$1");
        return objLJIIZILJ;
    }
}
