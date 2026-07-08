package X;

import com.ss.android.ugc.tools.data.AIChatAppearance;
import com.ss.android.ugc.tools.data.AIChatCallbacks;
import com.ss.android.ugc.tools.data.AIChatFeatureGating;
import com.ss.android.ugc.tools.data.AIChatPayload;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import com.ss.android.ugc.tools.data.TitleBarAppearance;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Xp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21301118Xp {
    public AIChatAppearance LIZ;
    public AIChatTrackingConfig LIZJ;
    public AIChatPayload LIZIZ = new AIChatPayload(null, null);
    public AIChatFeatureGating LIZLLL = new AIChatFeatureGating(true, true);
    public AIChatCallbacks LJ = new AIChatCallbacks(null);

    public final void LIZ(Function1<? super C21301318Xr, Unit> function1) {
        C21301318Xr c21301318Xr = new C21301318Xr();
        function1.invoke(c21301318Xr);
        TitleBarAppearance titleBarAppearance = c21301318Xr.LIZ;
        if (titleBarAppearance != null) {
            this.LIZ = new AIChatAppearance(titleBarAppearance, c21301318Xr.LIZIZ, c21301318Xr.LIZJ, c21301318Xr.LJ, c21301318Xr.LIZLLL);
            return;
        }
        throw new IllegalArgumentException("titleBar is required");
    }

    public final void LIZIZ(Function1<? super C21301218Xq, Unit> function1) {
        C21301218Xq c21301218Xq = new C21301218Xq();
        function1.invoke(c21301218Xq);
        this.LIZJ = new AIChatTrackingConfig(c21301218Xq.LIZ, c21301218Xq.LIZIZ, c21301218Xq.LIZJ, c21301218Xq.LIZLLL, c21301218Xq.LJ, c21301218Xq.LJFF, c21301218Xq.LJI, c21301218Xq.LJII);
    }
}
