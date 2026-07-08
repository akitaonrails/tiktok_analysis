package X;

import com.ss.android.ugc.aweme.im.protocal.IMMessageChunkProtocol;

/* JADX INFO: renamed from: X.0iQR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.protocal.IMMessageChunkProtocol", f = "IMMessageChunkProtocol.kt", l = {41}, m = "getResult")
public final class C1242010iQR extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ IMMessageChunkProtocol LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1242010iQR(IMMessageChunkProtocol iMMessageChunkProtocol, InterfaceC1364105Vn<? super C1242010iQR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = iMMessageChunkProtocol;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMessageChunkProtocol@c7d8.getResult$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(null, this);
        C1C7U.LIZIZ("IMMessageChunkProtocol@c7d8.getResult$1");
        return objLJI;
    }
}
