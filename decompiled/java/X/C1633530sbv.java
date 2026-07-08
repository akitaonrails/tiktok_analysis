package X;

/* JADX INFO: renamed from: X.0sbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.StreamFetchOrchestrator", f = "StreamFetchOrchestrator.kt", l = {257}, m = "hasDataFromAnySource")
public final class C1633530sbv extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1633470sbp LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1633530sbv(C1633470sbp c1633470sbp, InterfaceC1364105Vn<? super C1633530sbv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1633470sbp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamFetchOrchestrator@9130.hasDataFromAnySource$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(false, null, this);
        C1C7U.LIZIZ("StreamFetchOrchestrator@9130.hasDataFromAnySource$1");
        return objLIZIZ;
    }
}
