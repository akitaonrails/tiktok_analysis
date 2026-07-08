package X;

import com.ss.android.ugc.aweme.model.IMPersonalizedRecommendationParams;

/* JADX INFO: renamed from: X.0Hoy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ability.TypingRecommendation", f = "TypingRecommendation.kt", l = {105}, m = "getTypingRecommendationAndCache-bMdYcbs")
public final class C452620Hoy extends AbstractC23140094w {
    public Object LL;
    public IMPersonalizedRecommendationParams LLILLJJLI;
    public boolean LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C452610Hox LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452620Hoy(C452610Hox c452610Hox, InterfaceC1364105Vn<? super C452620Hoy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c452610Hox;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingRecommendation@9c54.getTypingRecommendationAndCache$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objUy = this.LLILZIL.uy(null, null, false, null, null, false, this);
        if (objUy == C099R.LJFF()) {
            C1C7U.LIZIZ("TypingRecommendation@9c54.getTypingRecommendationAndCache$1");
            return objUy;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objUy);
        C1C7U.LIZIZ("TypingRecommendation@9c54.getTypingRecommendationAndCache$1");
        return c189200o6M1boximpl;
    }
}
