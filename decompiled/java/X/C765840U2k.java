package X;

/* JADX INFO: renamed from: X.0U2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.player.KaraokeRepository", f = "KaraokeRepository.kt", l = {146}, m = "fetchQueueList$liveeffect_impl_release")
public final class C765840U2k extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0U2Y LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C765840U2k(C0U2Y c0u2y, InterfaceC1364105Vn<? super C765840U2k> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0u2y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeRepository@8952.fetchQueueList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(0, this);
        C1C7U.LIZIZ("KaraokeRepository@8952.fetchQueueList$1");
        return objLJII;
    }
}
