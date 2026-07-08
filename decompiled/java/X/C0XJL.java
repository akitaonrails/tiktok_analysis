package X;

import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* JADX INFO: renamed from: X.0XJL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C0XJL extends C2217421BqW implements Function1<MatchResult, MatchResult> {
    public static final C0XJL LL = new C0XJL();

    public C0XJL() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MatchResult invoke(MatchResult matchResult) {
        return matchResult.next();
    }
}
