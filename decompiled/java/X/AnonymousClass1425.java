package X;

import Y.ARunnableS99S0200000_30;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.debug.IDebugOptService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.1425, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1425 {
    public static final AnonymousClass1425 LIZ = new AnonymousClass1425();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(573));

    public static ITakoDebugService LIZ() {
        return (ITakoDebugService) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        ITakoDebugService iTakoDebugServiceLIZ = LIZ();
        if (iTakoDebugServiceLIZ == null) {
            return false;
        }
        iTakoDebugServiceLIZ.isOpen();
        return false;
    }

    public static void LIZJ(Context context) {
        Activity activityLIZIZ;
        AwS574S0100000_30 awS574S0100000_30 = new AwS574S0100000_30(context, 335);
        IDebugOptService iDebugOptService = (IDebugOptService) PluggableExtentionKt.pluggableSpi$default(IDebugOptService.class, false, false, false, 8, null);
        if (iDebugOptService == null) {
            awS574S0100000_30.invoke();
            return;
        }
        if (!iDebugOptService.isSpiEnable("com.ss.android.ugc.aweme.offline.tako.debug.service.TakoDebugServiceImpl")) {
            AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
            if (abstractC1387200mCcLJFF != null) {
                activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            Activity activityLIZ = C06MM.LIZ(activityLIZIZ);
            if (activityLIZ == null) {
                return;
            }
            activityLIZ.runOnUiThread(new ARunnableS99S0200000_30(activityLIZ, iDebugOptService, 12));
            return;
        }
        awS574S0100000_30.invoke();
    }
}
