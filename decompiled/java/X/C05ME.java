package X;

import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter;

/* JADX INFO: renamed from: X.05ME, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter", f = "SocialThoughtDataCenter.kt", l = {536}, m = "fetchThoughtFromServer")
public final class C05ME extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SocialThoughtDataCenter LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05ME(SocialThoughtDataCenter socialThoughtDataCenter, InterfaceC1364105Vn<? super C05ME> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = socialThoughtDataCenter;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtDataCenter@2a15.fetchThoughtFromServer$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIJJI = this.LLILLJJLI.LJIIJJI(null, this);
        C1C7U.LIZIZ("SocialThoughtDataCenter@2a15.fetchThoughtFromServer$1");
        return objLJIIJJI;
    }
}
