package X;

import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter;

/* JADX INFO: renamed from: X.05MD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter", f = "SocialThoughtDataCenter.kt", l = {175}, m = "fetchThoughtByUid")
public final class C05MD extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SocialThoughtDataCenter LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05MD(SocialThoughtDataCenter socialThoughtDataCenter, InterfaceC1364105Vn<? super C05MD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = socialThoughtDataCenter;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtDataCenter@2a15.fetchThoughtByUid$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, this);
        C1C7U.LIZIZ("SocialThoughtDataCenter@2a15.fetchThoughtByUid$1");
        return objLIZLLL;
    }
}
