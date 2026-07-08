package X;

import com.ss.android.ugc.aweme.im.protocal.IMAccountsChunkProtocol;

/* JADX INFO: renamed from: X.0iQQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.protocal.IMAccountsChunkProtocol", f = "IMAccountsChunkProtocol.kt", l = {92}, m = "runLocalSearch")
public final class C1242000iQQ extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ IMAccountsChunkProtocol LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242000iQQ(IMAccountsChunkProtocol iMAccountsChunkProtocol, InterfaceC1364105Vn<? super C1242000iQQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = iMAccountsChunkProtocol;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMAccountsChunkProtocol@7f7c.runLocalSearch$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJJI = this.LLILLL.LJIIJJI(null, this);
        C1C7U.LIZIZ("IMAccountsChunkProtocol@7f7c.runLocalSearch$1");
        return objLJIIJJI;
    }
}
