package X;

import com.ss.android.ugc.tools.data.AIChatAppearance;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.AIChatPayload;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18Xn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21300918Xn {
    public static final AIChatPageConfig LIZ(Function1<? super C21301118Xp, Unit> function1) {
        C21301118Xp c21301118Xp = new C21301118Xp();
        function1.invoke(c21301118Xp);
        AIChatAppearance aIChatAppearance = c21301118Xp.LIZ;
        if (aIChatAppearance != null) {
            AIChatPayload aIChatPayload = c21301118Xp.LIZIZ;
            AIChatTrackingConfig aIChatTrackingConfig = c21301118Xp.LIZJ;
            if (aIChatTrackingConfig != null) {
                return new AIChatPageConfig(aIChatAppearance, aIChatPayload, aIChatTrackingConfig, c21301118Xp.LIZLLL, c21301118Xp.LJ);
            }
            throw new IllegalArgumentException("tracking is required");
        }
        throw new IllegalArgumentException("appearance is required");
    }
}
