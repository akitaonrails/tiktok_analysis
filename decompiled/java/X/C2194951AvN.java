package X;

import com.ss.android.ugc.aweme.minis.service.MiniGameRenderServiceImpl;

/* JADX INFO: renamed from: X.1AvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.service.MiniGameRenderServiceImpl", f = "MiniGameRenderServiceImpl.kt", l = {1212}, m = "loadAndExecuteCoreJS")
public final class C2194951AvN extends AbstractC23140094w {
    public C1304490k3D LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MiniGameRenderServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2194951AvN(MiniGameRenderServiceImpl miniGameRenderServiceImpl, InterfaceC1364105Vn<? super C2194951AvN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = miniGameRenderServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MiniGameRenderServiceImpl@ccfc.loadAndExecuteCoreJS$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, this);
        C1C7U.LIZIZ("MiniGameRenderServiceImpl@ccfc.loadAndExecuteCoreJS$1");
        return objLIZLLL;
    }
}
