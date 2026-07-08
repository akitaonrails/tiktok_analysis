package X;

/* JADX INFO: renamed from: X.0Sk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.user.UserStorySource$requestInner$$inlined$map$1$2", f = "UserStorySource.kt", l = {223}, m = "emit")
public final class C729830Sk1 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C729820Sk0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C729830Sk1(C729820Sk0 c729820Sk0, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c729820Sk0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserStorySource@c0b8.requestInner$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("UserStorySource@c0b8.requestInner$$inlined$map$1$2$1");
        return objEmit;
    }
}
