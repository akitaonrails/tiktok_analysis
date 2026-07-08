package X;

/* JADX INFO: renamed from: X.0TxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository", f = "BGMPlaylistRepository.kt", l = {145}, m = "loadTop$liveeffect_impl_release")
public final class C763550TxJ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C763480TxC LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763550TxJ(C763480TxC c763480TxC, InterfaceC1364105Vn<? super C763550TxJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c763480TxC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlaylistRepository@9667.loadTop$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLJJLI.LJFF(this);
        C1C7U.LIZIZ("BGMPlaylistRepository@9667.loadTop$1");
        return objLJFF;
    }
}
