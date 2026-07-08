package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;

/* JADX INFO: renamed from: X.0TtW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class RunnableC761200TtW implements Runnable {
    public static final RunnableC761200TtW LL = new RunnableC761200TtW();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PlayBookBeautyHelp@7f7c.notifyStatusChange$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayBookBeautyHelp@7f7c.notifyStatusChange$1");
    }

    public static void LIZ() {
        EnumC771230UNd enumC771230UNdLIZ = C761190TtV.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifyStatusChange: ");
        sbLIZ.append(enumC771230UNdLIZ);
        C20441214yg.LJ("PlayBookBeautyHelp", C2188811AlT.LIZIZ(sbLIZ));
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService != null) {
            iBroadcastService.notifyApplyStatusAndSaveStatus(EnumC773040UUc.ENHANCE, enumC771230UNdLIZ, "");
        }
    }
}
