package X;

import com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction;

/* JADX INFO: renamed from: X.0CY3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.navigation.SocialThoughtRouteAction", f = "SocialThoughtRouteAction.kt", l = {227}, m = "validateOwnedTid")
public final class C0CY3 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SocialThoughtRouteAction LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CY3(SocialThoughtRouteAction socialThoughtRouteAction, InterfaceC1364105Vn<? super C0CY3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = socialThoughtRouteAction;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtRouteAction@262b.validateOwnedTid$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objValidateOwnedTid = this.LLILLL.validateOwnedTid(null, this);
        C1C7U.LIZIZ("SocialThoughtRouteAction@262b.validateOwnedTid$1");
        return objValidateOwnedTid;
    }
}
