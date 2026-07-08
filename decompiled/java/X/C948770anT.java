package X;

import com.bytedance.android.livesdk.chatroom.model.interact.CohostABInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSDKCohostWithGuestProtect;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestAudienceSetting;

/* JADX INFO: renamed from: X.0anT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948770anT {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZLLL() {
        C931800aM6.LIZ.getClass();
        return C931800aM6.LIZIZ();
    }

    public static boolean LJ() {
        return LinkMicSDKCohostWithGuestProtect.INSTANCE.enable();
    }

    public static boolean LIZ() {
        if (LJ()) {
            return (C950220apo.LJI() || CohostWithGuestAudienceSetting.INSTANCE.isEnabled()) && LIZIZ();
        }
        C20441214yg.LIZIZ("MultiHostWithGuestConfig", "isAbEnabled, main feature off");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ() {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C948770anT.LIZIZ():boolean");
    }

    public static boolean LIZJ(long j) {
        Boolean boolValueOf;
        if (C950220apo.LJI() && j == C950220apo.LJ()) {
            return true;
        }
        InterfaceC955970az5 interfaceC955970az5LJIIIZ = C915980Zwa.LJI().LJIIIZ();
        CohostABInfo cohostABInfoLJII = interfaceC955970az5LJIIIZ.LJII(j);
        if (cohostABInfoLJII != null) {
            boolValueOf = Boolean.valueOf(cohostABInfoLJII.isCohostMultiguest);
        } else {
            boolValueOf = null;
        }
        boolean zLIZIZ = C176600m4.LIZIZ(boolValueOf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isAbEnabledForAnchor, anchorUid=");
        sbLIZ.append(j);
        sbLIZ.append(", result = ");
        sbLIZ.append(zLIZIZ);
        sbLIZ.append(", staticData=");
        sbLIZ.append(interfaceC955970az5LJIIIZ.getClass().getSimpleName());
        sbLIZ.append(", hashCode=");
        sbLIZ.append(interfaceC955970az5LJIIIZ.hashCode());
        C20441214yg.LIZIZ("MultiHostWithGuestConfig", C2188811AlT.LIZIZ(sbLIZ));
        return zLIZIZ;
    }
}
