package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.10mj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class RunnableC19347910mj implements Runnable {
    public static final RunnableC19347910mj LL = new RunnableC19347910mj();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DAUSurveyInvestigator@6caf.disableSurveyUntilTime$1");
        try {
            C1DDU.LIZ.getClass();
            ((Keva) C1DDU.LIZIZ.getValue()).storeLong("dau_survey_disabled_timestamp", C1DDU.LJI);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DAUSurveyInvestigator@6caf.disableSurveyUntilTime$1");
    }
}
