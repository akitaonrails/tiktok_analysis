package X;

/* JADX INFO: renamed from: X.0SkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.user.UserStorySource$UserStoryQuery", f = "UserStorySource.kt", l = {130}, m = "operate")
public final class C729940SkC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C729930SkB LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C729940SkC(C729930SkB c729930SkB, InterfaceC1364105Vn<? super C729940SkC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c729930SkB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserStorySource$UserStoryQuery@963a.operate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("UserStorySource$UserStoryQuery@963a.operate$1");
        return objLIZIZ;
    }
}
