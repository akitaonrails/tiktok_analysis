package X;

/* JADX INFO: renamed from: X.0TxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistRepository", f = "BGMPlaylistRepository.kt", l = {136}, m = "requestRemoveSong")
public final class C763570TxL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C763480TxC LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C763570TxL(C763480TxC c763480TxC, InterfaceC1364105Vn<? super C763570TxL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c763480TxC;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BGMPlaylistRepository@9667.requestRemoveSong$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLJJLI.LJIIIZ(0L, this);
        C1C7U.LIZIZ("BGMPlaylistRepository@9667.requestRemoveSong$1");
        return objLJIIIZ;
    }
}
