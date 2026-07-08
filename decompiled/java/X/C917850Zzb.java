package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;

/* JADX INFO: renamed from: X.0Zzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917850Zzb {
    public static final boolean LIZ(InterfaceC954180awC interfaceC954180awC) {
        int iLJJLIIIJLJLI;
        C931800aM6.LIZ.getClass();
        if (!C931800aM6.LIZIZ() || (iLJJLIIIJLJLI = interfaceC954180awC.LJJLIIIJLJLI()) == 1 || iLJJLIIIJLJLI == 3) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(InterfaceC954180awC interfaceC954180awC, String str) {
        Long l;
        Long l2;
        if (str == null || str.length() == 0) {
            return false;
        }
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            LinkUser linkUserLJJLJLI = interfaceC954180awC.LJJLJLI(str);
            long jLIZLLL = C950220apo.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isInSelfAnchorRoom, linkMicId: ");
            sbLIZ.append(str);
            sbLIZ.append(", user: ");
            if (linkUserLJJLJLI != null) {
                l = linkUserLJJLJLI.roomId;
            } else {
                l = null;
            }
            sbLIZ.append(l);
            sbLIZ.append(", currentRoomId: ");
            sbLIZ.append(jLIZLLL);
            C20441214yg.LIZIZ("LinkMicEventListenerExt", C2188811AlT.LIZIZ(sbLIZ));
            if (linkUserLJJLJLI == null || (l2 = linkUserLJJLJLI.roomId) == null || l2.longValue() != jLIZLLL) {
                return false;
            }
        }
        return true;
    }
}
