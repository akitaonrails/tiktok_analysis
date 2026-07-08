package X;

import X.InterfaceC613710O5h;

/* JADX INFO: renamed from: X.0O6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.mota.runner.network.NetworkRunner", f = "NetworkRunner.kt", l = {97, 128, 131}, m = "runNetTransportWithRetry")
public final class C614010O6l<D extends InterfaceC613710O5h> extends AbstractC23140094w {
    public InterfaceC613730O5j LL;
    public C0O8O LLILLJJLI;
    public C118300cf LLILLL;
    public C013C LLILZ;
    public C238400w2 LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C614000O6k LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614010O6l(C614000O6k c614000O6k, InterfaceC1364105Vn<? super C614010O6l> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c614000O6k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws C614070O6r {
        C1C7U.LIZ("NetworkRunner@7f7b.runNetTransportWithRetry$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLJ.LIZJ(null, null, null, this);
        C1C7U.LIZIZ("NetworkRunner@7f7b.runNetTransportWithRetry$1");
        return objLIZJ;
    }
}
