package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2174221A7g extends C2217421BqW implements Function1<C2174251A7j, AbstractC1556910qcL> {
    public C2174221A7g(C2174211A7f c2174211A7f) {
        super(1, c2174211A7f, C2174211A7f.class, "checkWidthValid", "checkWidthValid(Lcom/ss/android/ugc/aweme/tako/otherpage/feed/banner/utils/TakoBottomBannerRecommendShowChecker$CheckerMeta;)Lcom/ss/android/ugc/aweme/tako/otherpage/feed/banner/utils/TakoBBRRShowConditionResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC1556910qcL invoke(C2174251A7j c2174251A7j) {
        C2174251A7j c2174251A7j2 = c2174251A7j;
        this.receiver.getClass();
        String str = c2174251A7j2.LIZ;
        if (str != null && Intrinsics.LJFF(c2174251A7j2.LIZLLL.get(str), Boolean.FALSE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkWidthValid, recContent: ");
            sbLIZ.append(c2174251A7j2.LIZIZ);
            sbLIZ.append(" width is invalid");
            return new C1556900qcK(C2188811AlT.LIZIZ(sbLIZ), EnumC992800bwU.TYPE_OVER_WIDTH_EXIT.getValue());
        }
        return null;
    }
}
