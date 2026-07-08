package X;

/* JADX INFO: renamed from: X.0S8U, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.protocols.VideoHotSwapProtocol", f = "VideoHotSwapProtocol.kt", l = {143}, m = "getHotSwappedVideoAwemes$suspendImpl")
public final class C0S8U extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0S8V LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S8U(C0S8V c0s8v, InterfaceC1364105Vn<? super C0S8U> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0s8v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoHotSwapProtocol@72c7.getHotSwappedVideoAwemes$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = C0S8V.LIZ(this.LLILLJJLI, null, this);
        C1C7U.LIZIZ("VideoHotSwapProtocol@72c7.getHotSwappedVideoAwemes$1");
        return objLIZ;
    }
}
