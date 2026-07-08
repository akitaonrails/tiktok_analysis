package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl;

/* JADX INFO: renamed from: X.0HSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.datasource.MixStudioStatusRepoImpl", f = "MixStudioStatusRepoImpl.kt", l = {679}, m = "getElement")
public final class C441420HSq extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MixStudioStatusRepoImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441420HSq(MixStudioStatusRepoImpl mixStudioStatusRepoImpl, InterfaceC1364105Vn<? super C441420HSq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioStatusRepoImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioStatusRepoImpl@50f0.getElement$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIJJ = this.LLILLJJLI.LJIJJ(null, this);
        C1C7U.LIZIZ("MixStudioStatusRepoImpl@50f0.getElement$1");
        return objLJIJJ;
    }
}
