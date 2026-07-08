package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;

/* JADX INFO: renamed from: X.0HSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl", f = "MixStudioStatusRepoImpl.kt", l = {378, 387, 403}, m = "cancelGeneration")
public final class C441410HSp extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixStudioStatusRepoImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441410HSp(MixStudioStatusRepoImpl mixStudioStatusRepoImpl, InterfaceC1364105Vn<? super C441410HSp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = mixStudioStatusRepoImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioStatusRepoImpl@50f0.cancelGeneration$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILLL.LJIILIIL(null, this);
        C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.cancelGeneration$1");
        return objLJIILIIL;
    }
}
