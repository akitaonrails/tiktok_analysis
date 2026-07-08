package X;

import com.ss.android.ugc.aweme.viewmodel.TypingRecommendationVM;

/* JADX INFO: renamed from: X.0Hog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.TypingRecommendationVM", f = "TypingRecommendationVM.kt", l = {304, 312}, m = "fillWithPopularStickers")
public final class C452440Hog extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ TypingRecommendationVM LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452440Hog(TypingRecommendationVM typingRecommendationVM, InterfaceC1364105Vn<? super C452440Hog> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = typingRecommendationVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("TypingRecommendationVM@7aaa.fillWithPopularStickers$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objMQ2 = this.LLILZIL.MQ2(0, null, this);
        C1C7U.LIZIZ("TypingRecommendationVM@7aaa.fillWithPopularStickers$1");
        return objMQ2;
    }
}
