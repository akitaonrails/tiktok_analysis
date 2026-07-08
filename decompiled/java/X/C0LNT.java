package X;

import com.ss.android.ugc.aweme.aigc.NavigateServiceImpl;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCPost;

/* JADX INFO: renamed from: X.0LNT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl", f = "NavigateServiceImpl.kt", l = {341, 346}, m = "realNavigatePost")
public final class C0LNT extends AbstractC23140094w {
    public Object LL;
    public AIGCPost LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ NavigateServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LNT(NavigateServiceImpl navigateServiceImpl, InterfaceC1364105Vn<? super C0LNT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = navigateServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NavigateServiceImpl@832b.realNavigatePost$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILZ.LJIIIZ(null, null, this);
        C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigatePost$1");
        return objLJIIIZ;
    }
}
