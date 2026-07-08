package X;

import Y.AgS194S0200000_3;

/* JADX INFO: renamed from: X.08se, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.MultiMediaUploadFrameTask$createFramePackage$$inlined$map$1$2", f = "MultiMediaUploadFrameTask.kt", l = {223}, m = "emit")
public final class C2255808se extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS194S0200000_3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2255808se(AgS194S0200000_3 agS194S0200000_3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS194S0200000_3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiMediaUploadFrameTask@fd89.createFramePackage$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("MultiMediaUploadFrameTask@fd89.createFramePackage$$inlined$map$1$2$1");
        return objEmit;
    }
}
