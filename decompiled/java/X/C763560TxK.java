package X;

/* JADX INFO: renamed from: X.0TxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository", f = "BGMPlaylistRepository.kt", l = {129}, m = "removeAllSongs$liveeffect_impl_release")
public final class C763560TxK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C763480TxC LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763560TxK(C763480TxC c763480TxC, InterfaceC1364105Vn<? super C763560TxK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c763480TxC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlaylistRepository@9667.removeAllSongs$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(this);
        C1C7U.LIZIZ("BGMPlaylistRepository@9667.removeAllSongs$1");
        return objLJII;
    }
}
