package X;

/* JADX INFO: renamed from: X.0U2Z, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.player.KaraokeRepository", f = "KaraokeRepository.kt", l = {260}, m = "updateFavorite")
public final class C0U2Z extends AbstractC23140094w {
    public C0U22 LL;
    public boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0U2Y LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U2Z(C0U2Y c0u2y, InterfaceC1364105Vn<? super C0U2Z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0u2y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KaraokeRepository@8952.updateFavorite$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJIII = this.LLILZ.LJJIII(null, false, this);
        C1C7U.LIZIZ("KaraokeRepository@8952.updateFavorite$1");
        return objLJJIII;
    }
}
