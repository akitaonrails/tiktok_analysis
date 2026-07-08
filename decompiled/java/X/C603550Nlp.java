package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nlp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603550Nlp {
    public static int LIZ(String str, String str2, String str3) {
        Integer num;
        int iIntValue;
        Integer numLJIIJJI;
        if (Intrinsics.LJFF(str, "exit_survey")) {
            if (str2 != null && (num = RealtimeFeedbackInterceptor.RealtimeFeedbackModel.LIZ.get(str2)) != null) {
                int iIntValue2 = num.intValue() * LSPassThroughRecordSizeConfig.DEFAULT;
                if (str3 != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str3)) != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = 0;
                }
                Integer numValueOf = Integer.valueOf(iIntValue2 + iIntValue);
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return -1;
            }
            return -1;
        }
        Integer num2 = RealtimeFeedbackInterceptor.RealtimeFeedbackModel.LIZIZ.get(str);
        if (num2 != null) {
            return num2.intValue();
        }
        return -1;
    }
}
