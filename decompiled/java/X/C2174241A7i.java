package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1A7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2174241A7i extends C2217421BqW implements Function1<C2174251A7j, AbstractC1556910qcL> {
    public C2174241A7i(C2174211A7f c2174211A7f) {
        super(1, c2174211A7f, C2174211A7f.class, "checkShowTimesLimit", "checkShowTimesLimit(Lcom/ss/android/ugc/aweme/tako/otherpage/feed/banner/utils/TakoBottomBannerRecommendShowChecker$CheckerMeta;)Lcom/ss/android/ugc/aweme/tako/otherpage/feed/banner/utils/TakoBBRRShowConditionResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC1556910qcL invoke(C2174251A7j c2174251A7j) {
        C2174251A7j c2174251A7j2 = c2174251A7j;
        this.receiver.getClass();
        if (!c2174251A7j2.LIZJ && !c2174251A7j2.LJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkShowTimesLimit, showTimesLowerLimit is false: show times valid:");
            sbLIZ.append(c2174251A7j2.LIZJ);
            sbLIZ.append(", isClicked: ");
            sbLIZ.append(c2174251A7j2.LJI);
            return new C1556900qcK(C2188811AlT.LIZIZ(sbLIZ), EnumC992800bwU.TYPE_TODAY_EXIT.getValue());
        }
        return null;
    }
}
