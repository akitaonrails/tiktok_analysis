package X;

import Y.ARunnableS94S0200000_25;
import com.ss.android.ugc.aweme.experiment.FeedbackConfig;
import com.ss.android.ugc.trill.feedback.api.FaqResponse;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0u3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689010u3P {
    public final C01GW LIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1188));
    public InterfaceC1689040u3S LIZIZ;

    public final void LIZ(FaqResponse faqResponse) {
        Integer num = faqResponse.code;
        if (num != null && num.intValue() == 0) {
            FeedbackConfig feedbackConfig = C1689060u3U.LIZIZ;
            if (feedbackConfig.enableCache) {
                C1689110u3Z c1689110u3Z = (C1689110u3Z) this.LIZ.getValue();
                c1689110u3Z.LIZ.put(c1689110u3Z.LIZ(), new C1689030u3R(System.currentTimeMillis(), feedbackConfig.cacheVersion, faqResponse));
                c1689110u3Z.LIZLLL.submit(new ARunnableS94S0200000_25(c1689110u3Z, faqResponse, 31));
            }
        }
        InterfaceC1689040u3S interfaceC1689040u3S = this.LIZIZ;
        if (interfaceC1689040u3S != null) {
            interfaceC1689040u3S.LIZ(faqResponse);
        }
    }
}
