package X;

import com.ss.android.ugc.aweme.portrait.service.AIPortraitFileServiceImpl;

/* JADX INFO: renamed from: X.0Lig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.service.AIPortraitFileServiceImpl", f = "AIPortraitFileServiceImpl.kt", l = {137, 210}, m = "uploadImageToImageX")
public final class C550640Lig extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AIPortraitFileServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550640Lig(AIPortraitFileServiceImpl aIPortraitFileServiceImpl, InterfaceC1364105Vn<? super C550640Lig> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = aIPortraitFileServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPortraitFileServiceImpl@545c.uploadImageToImageX$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("AIPortraitFileServiceImpl@545c.uploadImageToImageX$1");
        return objLIZIZ;
    }
}
