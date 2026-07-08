package X;

/* JADX INFO: renamed from: X.0HoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.sticker.typing.CommentTypingRecManager", f = "CommentTypingRecManager.kt", l = {186, 186}, m = "triggerRecommendation")
public final class C452310HoT extends AbstractC23140094w {
    public C452330HoV LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C452280HoQ LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452310HoT(C452280HoQ c452280HoQ, InterfaceC1364105Vn<? super C452310HoT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c452280HoQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CommentTypingRecManager@ed40.triggerRecommendation$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZLL.LJ(null, null, 0L, this);
        C1C7U.LIZIZ("CommentTypingRecManager@ed40.triggerRecommendation$1");
        return objLJ;
    }
}
