package X;

import com.ss.android.ugc.aweme.aigc.AICreateServiceImpl;

/* JADX INFO: renamed from: X.0LcR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.AICreateServiceImpl", f = "AICreateServiceImpl.kt", l = {190}, m = "getInputImageListIfExist")
public final class C546770LcR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AICreateServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546770LcR(AICreateServiceImpl aICreateServiceImpl, InterfaceC1364105Vn<? super C546770LcR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aICreateServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreateServiceImpl@9f29.getInputImageListIfExist$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objKw = this.LLILLJJLI.kw(null, this);
        C1C7U.LIZIZ("AICreateServiceImpl@9f29.getInputImageListIfExist$1");
        return objKw;
    }
}
