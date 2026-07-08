package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;

/* JADX INFO: renamed from: X.10R5, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class C10R5 {
    public static C10R5 LJIIIIZZ;
    public static boolean LJIIIZ;
    public static final Keva LJIIJ = Keva.getRepo("new_user_journey_flow");
    public boolean LIZ;
    public String LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJFF;
    public boolean LJ = true;
    public int LJI = -1;
    public final StringBuilder LJII = new StringBuilder();

    public abstract int LIZIZ();

    public abstract int LIZJ();

    public C19245810Rc LIZLLL(Context context, Boolean bool, C10RF c10rf, Boolean bool2) {
        return null;
    }

    public abstract String LJ();

    public final boolean LIZ() {
        INewUserJourneyService iNewUserJourneyService = (INewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null);
        return (iNewUserJourneyService == null || iNewUserJourneyService.LJJJ()) && LIZIZ() == 2 && !this.LIZ && !this.LIZLLL;
    }

    public final String LJI() {
        if (this.LJ) {
            this.LJ = LJIIJ.getBoolean("first_video", true);
        }
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            return null;
        }
        if ((C10RS.LIZ().LIZJ() == 0 || this.LIZ) && this.LJ) {
            return LJIIJ.getString("last_step", null);
        }
        return null;
    }

    public final void LJFF(String str) {
        try {
            StringBuilder sb = this.LJII;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
