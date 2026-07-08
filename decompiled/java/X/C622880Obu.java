package X;

/* JADX INFO: renamed from: X.0Obu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.repository.BulletinEmojiRepository$_operator$1", f = "BulletinEmojiRepository.kt", l = {98}, m = "loadMoreEmojiDetail")
public final class C622880Obu extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C622860Obs LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C622880Obu(C622860Obs c622860Obs, InterfaceC1364105Vn<? super C622880Obu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c622860Obs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinEmojiRepository@b433._operator$1$loadMoreEmojiDetail$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJJLL = this.LLILZLL.LJJJLL(null, 0L, 0L, null, null, 0, this);
        C1C7U.LIZIZ("BulletinEmojiRepository@b433._operator$1$loadMoreEmojiDetail$1");
        return objLJJJLL;
    }
}
