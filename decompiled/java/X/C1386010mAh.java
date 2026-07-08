package X;

import com.ss.android.ugc.aweme.socialsharesearch.SocialSearchServiceImpl;

/* JADX INFO: renamed from: X.0mAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialsharesearch.SocialSearchServiceImpl", f = "SocialSearchServiceImpl.kt", l = {51}, m = "searchUsers")
public final class C1386010mAh extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SocialSearchServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1386010mAh(SocialSearchServiceImpl socialSearchServiceImpl, InterfaceC1364105Vn<? super C1386010mAh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = socialSearchServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialSearchServiceImpl@1db6.searchUsers$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, null, null, this);
        C1C7U.LIZIZ("SocialSearchServiceImpl@1db6.searchUsers$1");
        return objLIZJ;
    }
}
