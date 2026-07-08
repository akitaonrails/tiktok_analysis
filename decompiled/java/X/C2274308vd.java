package X;

import Y.AgS194S0200000_3;

/* JADX INFO: renamed from: X.08vd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.LocalVideoUploadFrameTask$createFramePackageNew$$inlined$map$1$2", f = "LocalVideoUploadFrameTask.kt", l = {223}, m = "emit")
public final class C2274308vd extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS194S0200000_3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2274308vd(AgS194S0200000_3 agS194S0200000_3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS194S0200000_3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LocalVideoUploadFrameTask@4ac4.createFramePackageNew$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("LocalVideoUploadFrameTask@4ac4.createFramePackageNew$$inlined$map$1$2$1");
        return objEmit;
    }
}
