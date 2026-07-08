package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1A7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2174231A7h extends C2217421BqW implements Function1<C2174251A7j, AbstractC1556910qcL> {
    public C2174231A7h(C2174211A7f c2174211A7f) {
        super(1, c2174211A7f, C2174211A7f.class, "checkContentNotEmpty", "checkContentNotEmpty(Lcom/ss/android/ugc/aweme/tako/otherpage/feed/banner/utils/TakoBottomBannerRecommendShowChecker$CheckerMeta;)Lcom/ss/android/ugc/aweme/tako/otherpage/feed/banner/utils/TakoBBRRShowConditionResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC1556910qcL invoke(C2174251A7j c2174251A7j) {
        String str;
        C2174251A7j c2174251A7j2 = c2174251A7j;
        this.receiver.getClass();
        String str2 = c2174251A7j2.LIZ;
        if (str2 != null && str2.length() != 0 && (str = c2174251A7j2.LIZIZ) != null && str.length() != 0) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkContentNotEmpty, aid: ");
        sbLIZ.append(c2174251A7j2.LIZ);
        sbLIZ.append(", recContent: ");
        sbLIZ.append(c2174251A7j2.LIZIZ);
        return new C1556900qcK(C2188811AlT.LIZIZ(sbLIZ), EnumC992800bwU.TYPE_NONE_DATA_EXIT.getValue());
    }
}
