package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0O1X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O1X extends C09AY implements Function0<Runnable> {
    public C0O1X() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Runnable invoke() {
        return new Runnable() { // from class: X.0O1W
            public static void LIZ() {
                int iLJIIIZ = C1903780zdo.LJIIIZ(260);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clearLiveUnreadTask, liveCount=");
                sbLIZ.append(iLJIIIZ);
                C1720106oR.LJI("NCTBPManager", C2188811AlT.LIZIZ(sbLIZ));
                if (iLJIIIZ > 0) {
                    C1903780zdo.LIZJ(260);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NoticeCountTabBadgePresentManager@eea3.clearLiveUnreadTask$2$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NoticeCountTabBadgePresentManager@eea3.clearLiveUnreadTask$2$1");
            }
        };
    }
}
