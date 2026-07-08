package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;

/* JADX INFO: renamed from: X.0HSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl", f = "MixStudioStatusRepoImpl.kt", l = {432}, m = "generateMore")
public final class C441400HSo extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixStudioStatusRepoImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441400HSo(MixStudioStatusRepoImpl mixStudioStatusRepoImpl, InterfaceC1364105Vn<? super C441400HSo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = mixStudioStatusRepoImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioStatusRepoImpl@50f0.generateMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(null, this);
        C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.generateMore$1");
        return objLJI;
    }
}
