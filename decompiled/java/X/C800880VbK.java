package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.experiment.CommitConfig;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0VbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800880VbK {
    public static boolean LIZJ;
    public static final CommitConfig LIZ = new CommitConfig(false, "", Mp4ScreenVideoLoadTimeout.CONTROL);
    public static final C01GW LIZIZ = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new C800890VbL());
    public static final RunnableC799490VXv LIZLLL = RunnableC799490VXv.LL;

    public static final void LIZ() {
        C01GW c01gw = LIZIZ;
        if (((CommitConfig) c01gw.getValue()).open) {
            RunnableC799490VXv runnableC799490VXv = LIZLLL;
            C2487409ou.LIZ(runnableC799490VXv);
            C2487409ou.LIZLLL(((CommitConfig) c01gw.getValue()).delayTime, runnableC799490VXv);
        }
    }

    public static final void LIZIZ(String str) {
        C01GW c01gw = LIZIZ;
        String str2 = ((CommitConfig) c01gw.getValue()).affectScene;
        if (!((CommitConfig) c01gw.getValue()).open || str2 == null || TextUtils.isEmpty(str2) || !a0.LJJIIZI(str2, str, false)) {
            return;
        }
        LIZJ = true;
        C2487409ou.LIZ(LIZLLL);
    }
}
