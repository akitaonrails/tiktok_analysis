package X;

/* JADX INFO: renamed from: X.0TxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository", f = "BGMPlaylistRepository.kt", l = {124}, m = "removeSong$liveeffect_impl_release")
public final class C763520TxG extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C763480TxC LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763520TxG(C763480TxC c763480TxC, InterfaceC1364105Vn<? super C763520TxG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c763480TxC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlaylistRepository@9667.removeSong$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLL.LJIIIIZZ(0, this);
        C1C7U.LIZIZ("BGMPlaylistRepository@9667.removeSong$1");
        return objLJIIIIZZ;
    }
}
