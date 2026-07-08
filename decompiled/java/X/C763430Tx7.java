package X;

/* JADX INFO: renamed from: X.0Tx7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMSongListRepository", f = "BGMSongListRepository.kt", l = {104}, m = "loadMoreSongsById$liveeffect_impl_release")
public final class C763430Tx7 extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C763390Tx3 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763430Tx7(C763390Tx3 c763390Tx3, InterfaceC1364105Vn<? super C763430Tx7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c763390Tx3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMSongListRepository@6a63.loadMoreSongsById$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(0L, this);
        C1C7U.LIZIZ("BGMSongListRepository@6a63.loadMoreSongsById$1");
        return objLJFF;
    }
}
