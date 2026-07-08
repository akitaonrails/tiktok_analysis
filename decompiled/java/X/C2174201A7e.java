package X;

import com.ss.android.ugc.aweme.config.Crowd;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1A7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C2174201A7e extends C2217421BqW implements Function1<C2174251A7j, AbstractC1556910qcL> {
    public C2174201A7e(C2174211A7f c2174211A7f) {
        super(1, c2174211A7f, C2174211A7f.class, "checkServerConfig", "checkServerConfig(Lcom/ss/android/ugc/aweme/tako/otherpage/feed/banner/utils/TakoBottomBannerRecommendShowChecker$CheckerMeta;)Lcom/ss/android/ugc/aweme/tako/otherpage/feed/banner/utils/TakoBBRRShowConditionResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC1556910qcL invoke(C2174251A7j c2174251A7j) {
        Object obj;
        int iIntValue;
        C2174251A7j c2174251A7j2 = c2174251A7j;
        this.receiver.getClass();
        Integer num = null;
        if (c2174251A7j2.LJ) {
            return null;
        }
        C311300CIe.LIZ.getClass();
        Crowd crowdLIZ = C311300CIe.LIZ();
        if (c2174251A7j2.LJFF == EnumC993490bxb.TYPE_AI_GENERATE) {
            if (crowdLIZ != null) {
                num = crowdLIZ.enableTakoGenerateRecReason;
            }
        } else if (crowdLIZ != null) {
            num = crowdLIZ.enableTakoBarRecReason;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkServerConfig, server exit code: ");
        if (num == null) {
            obj = "null";
        } else {
            obj = num;
        }
        sbLIZ.append(obj);
        sbLIZ.append(", exit banner reason type: ");
        sbLIZ.append(c2174251A7j2.LJFF.getValue());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return new C1556900qcK(strLIZIZ, iIntValue);
    }
}
