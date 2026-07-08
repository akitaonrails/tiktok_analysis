package X;

import com.ss.android.ugc.aweme.aigc.NavigateServiceImpl;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;

/* JADX INFO: renamed from: X.0LO8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl", f = "NavigateServiceImpl.kt", l = {182, 192, 199, 209, 212}, m = "realProcessCloudDraftPreview")
public final class C0LO8 extends AbstractC23140094w {
    public Object LL;
    public AIGCDraft LLILLJJLI;
    public C259800zU LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ NavigateServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LO8(NavigateServiceImpl navigateServiceImpl, InterfaceC1364105Vn<? super C0LO8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = navigateServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NavigateServiceImpl@832b.realProcessCloudDraftPreview$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILZIL.LJIIJ(null, null, this);
        C1C7U.LIZIZ("NavigateServiceImpl@832b.realProcessCloudDraftPreview$1");
        return objLJIIJ;
    }
}
