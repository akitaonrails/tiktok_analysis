package X;

import Y.AgS100S1100000_8;

/* JADX INFO: renamed from: X.0Lii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.service.AIPortraitFileServiceImpl$observeUploadResult$1$invokeSuspend$$inlined$filter$1$2", f = "AIPortraitFileServiceImpl.kt", l = {223}, m = "emit")
public final class C550660Lii extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS100S1100000_8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550660Lii(AgS100S1100000_8 agS100S1100000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS100S1100000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitFileServiceImpl@545c.observeUploadResult$1$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("AIPortraitFileServiceImpl@545c.observeUploadResult$1$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
