package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackModel;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15aY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20546415aY {
    public final boolean LIZ;
    public final Keva LIZIZ;
    public final RealtimeFeedbackModel LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;

    static {
        new Object() { // from class: X.15aa
            {
                if (MethodIDManager.LJI(196611)) {
                    MethodIDManager.LJ();
                }
                if (MethodIDManager.LJI(196611)) {
                    MethodIDManager.LJ();
                }
            }
        };
    }

    public /* synthetic */ C20546415aY() {
        this(false);
        if (MethodIDManager.LJI(196611)) {
            MethodIDManager.LJ();
        }
    }

    public C20546415aY(boolean z) {
        boolean zLJI = MethodIDManager.LJI(196611);
        this.LIZ = z;
        this.LIZIZ = Keva.getRepo("realtime_feedback_repo");
        C20546515aZ.LIZ.getClass();
        this.LIZJ = (RealtimeFeedbackModel) SettingsManager.LIZLLL().LJIIIIZZ("realtime_feedback_setting_v2", RealtimeFeedbackModel.class, C20546515aZ.LIZIZ);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1336));
        this.LIZLLL = c01gwLIZIZ;
        this.LJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1337));
        ((Boolean) c01gwLIZIZ.getValue()).booleanValue();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
