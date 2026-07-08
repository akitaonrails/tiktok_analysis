package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0UEb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class RunnableC768870UEb implements Runnable {
    public String LL = "";
    public String LLILLJJLI = "";

    public final void LIZ() {
        Map<Integer, Integer> map = C768860UEa.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("event_page=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventScene=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", beautyLevel=");
        sbLIZ.append(0);
        C768860UEa.LIZIZ("ReportBeautyEffectUseRunnable.run", C2188811AlT.LIZIZ(sbLIZ));
        HashMap map2 = new HashMap();
        C768860UEa.LIZ(0, map2);
        map2.put("event_page", this.LL);
        map2.put("event_scene", this.LLILLJJLI);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_beauty_effective_use");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIZI(map2);
        AFwS245S0000000_12 aFwS245S0000000_12 = AFwS245S0000000_12.get$arr$(172);
        InterfaceC474510IjB interfaceC474510IjB = c474500IjALIZ.LIZ;
        if (interfaceC474510IjB != null) {
            interfaceC474510IjB.LJIIJJI(aFwS245S0000000_12);
        }
        c474500IjALIZ.LJJIJL();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestOldBeautyLogUtil$ReportBeautyEffectUseRunnable@ec82.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestOldBeautyLogUtil$ReportBeautyEffectUseRunnable@ec82.run");
    }
}
