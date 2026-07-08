package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.base.activity.IActivityTransition;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ilC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1254880ilC {
    public static final C1254880ilC LIZ = new C1254880ilC();
    public static final Pair<Integer, Integer> LIZIZ = new Pair<>(-1, -1);

    public static void LIZ(Activity activity, boolean z, int i) {
        IActivityTransition iActivityTransition;
        Pair<Integer, Integer> pairLIZ;
        if (activity != null && (iActivityTransition = (IActivityTransition) PluggableExtentionKt.pluggableSpi$default(IActivityTransition.class, false, false, false, 14, null)) != null && (pairLIZ = iActivityTransition.LIZ(i, z)) != null) {
            C786410Ut5.ae(pairLIZ.getFirst().intValue(), activity, pairLIZ.getSecond().intValue());
        }
    }
}
