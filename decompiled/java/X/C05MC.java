package X;

import com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;

/* JADX INFO: renamed from: X.05MC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.api.SocialThoughtDataCenter", f = "SocialThoughtDataCenter.kt", l = {657}, m = "handlePublish")
public final class C05MC extends AbstractC23140094w {
    public C1326005Gw LL;
    public Object LLILLJJLI;
    public ThoughtInfo LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ SocialThoughtDataCenter LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05MC(SocialThoughtDataCenter socialThoughtDataCenter, InterfaceC1364105Vn<? super C05MC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = socialThoughtDataCenter;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtDataCenter@2a15.handlePublish$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILZIL.LJIILJJIL(null, this);
        C1C7U.LIZIZ("SocialThoughtDataCenter@2a15.handlePublish$1");
        return objLJIILJJIL;
    }
}
