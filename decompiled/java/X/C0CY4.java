package X;

import com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction;

/* JADX INFO: renamed from: X.0CY4, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction", f = "SocialThoughtRouteAction.kt", l = {170}, m = "waitForNewTopActivity")
public final class C0CY4 extends AbstractC23140094w {
    public C19EG LL;
    public long LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ SocialThoughtRouteAction LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CY4(SocialThoughtRouteAction socialThoughtRouteAction, InterfaceC1364105Vn<? super C0CY4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = socialThoughtRouteAction;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtRouteAction@262b.waitForNewTopActivity$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objWaitForNewTopActivity = this.LLILZIL.waitForNewTopActivity(null, 0L, 0L, this);
        C1C7U.LIZIZ("SocialThoughtRouteAction@262b.waitForNewTopActivity$1");
        return objWaitForNewTopActivity;
    }
}
